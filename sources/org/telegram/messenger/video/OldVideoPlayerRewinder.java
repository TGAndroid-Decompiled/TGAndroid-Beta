package org.telegram.messenger.video;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private ndc videoPlayer;
    private bc8 webView;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        {
            OldVideoPlayerRewinder.this = this;
        }

        @Override
        public void run() {
            long j;
            if (OldVideoPlayerRewinder.this.videoPlayer != null || OldVideoPlayerRewinder.this.webView != null) {
                long duration = OldVideoPlayerRewinder.this.getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
                    OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
                    int i = oldVideoPlayerRewinder.rewindCount;
                    if (i == 1) {
                        j = 3;
                    } else if (i == 2) {
                        j = 6;
                    } else {
                        j = 12;
                    }
                    long j3 = j2 * j;
                    boolean z = oldVideoPlayerRewinder.rewindForward;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder2 = OldVideoPlayerRewinder.this;
                    if (z) {
                        OldVideoPlayerRewinder.access$514(oldVideoPlayerRewinder2, j3);
                    } else {
                        OldVideoPlayerRewinder.access$522(oldVideoPlayerRewinder2, j3);
                    }
                    int i2 = (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition > 0L ? 1 : (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0L ? 0 : -1));
                    OldVideoPlayerRewinder oldVideoPlayerRewinder3 = OldVideoPlayerRewinder.this;
                    if (i2 < 0) {
                        oldVideoPlayerRewinder3.rewindBackSeekPlayerPosition = 0L;
                    } else if (oldVideoPlayerRewinder3.rewindBackSeekPlayerPosition > duration) {
                        OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = duration;
                    }
                    OldVideoPlayerRewinder oldVideoPlayerRewinder4 = OldVideoPlayerRewinder.this;
                    if (oldVideoPlayerRewinder4.rewindByBackSeek && oldVideoPlayerRewinder4.rewindLastTime - OldVideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 350) {
                        OldVideoPlayerRewinder oldVideoPlayerRewinder5 = OldVideoPlayerRewinder.this;
                        oldVideoPlayerRewinder5.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder5.rewindLastTime;
                        OldVideoPlayerRewinder oldVideoPlayerRewinder6 = OldVideoPlayerRewinder.this;
                        oldVideoPlayerRewinder6.seekTo(oldVideoPlayerRewinder6.rewindBackSeekPlayerPosition);
                    }
                    long j4 = OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition - OldVideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) OldVideoPlayerRewinder.this.getDuration());
                    OldVideoPlayerRewinder oldVideoPlayerRewinder7 = OldVideoPlayerRewinder.this;
                    oldVideoPlayerRewinder7.updateRewindProgressUi(j4, duration2, oldVideoPlayerRewinder7.rewindByBackSeek);
                    if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                        OldVideoPlayerRewinder oldVideoPlayerRewinder8 = OldVideoPlayerRewinder.this;
                        if (oldVideoPlayerRewinder8.rewindByBackSeek) {
                            oldVideoPlayerRewinder8.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder8.rewindLastTime;
                            OldVideoPlayerRewinder oldVideoPlayerRewinder9 = OldVideoPlayerRewinder.this;
                            oldVideoPlayerRewinder9.seekTo(oldVideoPlayerRewinder9.rewindBackSeekPlayerPosition);
                        }
                        OldVideoPlayerRewinder.this.cancelRewind();
                    }
                    OldVideoPlayerRewinder oldVideoPlayerRewinder10 = OldVideoPlayerRewinder.this;
                    if (oldVideoPlayerRewinder10.rewindCount > 0) {
                        gm.d3(oldVideoPlayerRewinder10.backSeek, 16L);
                        return;
                    }
                    return;
                }
                OldVideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
            }
        }
    };

    public static long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j) {
        long j2 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    public static long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j) {
        long j2 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    private long getCurrentPosition() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.getCurrentPosition();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.S();
    }

    public long getDuration() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.getVideoDuration();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.U();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.H;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return false;
        }
        return ndcVar.c0();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.i(j);
            return;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return;
        }
        ndcVar.o0(j);
    }

    private void setPlaybackSpeed(float f) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.setPlaybackSpeed(f);
            return;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return;
        }
        ndcVar.u0(f);
    }

    public void cancelRewind() {
        if (this.rewindCount != 0) {
            this.rewindCount = 0;
            if (this.videoPlayer != null || this.webView != null) {
                if (this.rewindByBackSeek) {
                    seekTo(this.rewindBackSeekPlayerPosition);
                } else {
                    seekTo(getCurrentPosition());
                }
                setPlaybackSpeed(this.playSpeed);
            }
        }
        gm.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            gm.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void startRewind(bc8 bc8Var, boolean z, float f) {
        this.webView = bc8Var;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(ndc ndcVar, boolean z, float f) {
        this.videoPlayer = ndcVar;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }
}
