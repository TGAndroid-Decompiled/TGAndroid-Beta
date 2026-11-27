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
    private kfc videoPlayer;
    private qd8 webView;
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
                        oldVideoPlayerRewinder2.rewindBackSeekPlayerPosition += j3;
                    } else {
                        oldVideoPlayerRewinder2.rewindBackSeekPlayerPosition -= j3;
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
                        hl.d3(oldVideoPlayerRewinder10.backSeek, 16L);
                        return;
                    }
                    return;
                }
                OldVideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
            }
        }
    };

    private long getCurrentPosition() {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            return qd8Var.getCurrentPosition();
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.S();
    }

    public long getDuration() {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            return qd8Var.getVideoDuration();
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            return qd8Var.H;
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return false;
        }
        return kfcVar.c0();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j) {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            qd8Var.i(j);
            return;
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return;
        }
        kfcVar.o0(j);
    }

    private void setPlaybackSpeed(float f) {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            qd8Var.setPlaybackSpeed(f);
            return;
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return;
        }
        kfcVar.u0(f);
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
        hl.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            hl.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void startRewind(qd8 qd8Var, boolean z, float f) {
        this.webView = qd8Var;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(kfc kfcVar, boolean z, float f) {
        this.videoPlayer = kfcVar;
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
