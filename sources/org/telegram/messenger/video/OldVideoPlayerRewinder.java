package org.telegram.messenger.video;

import org.telegram.messenger.g0;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.t51;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private t51 videoPlayer;
    private ae0 webView;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        {
            OldVideoPlayerRewinder.this = this;
        }

        @Override
        public void run() {
            long j3;
            if (OldVideoPlayerRewinder.this.videoPlayer != null || OldVideoPlayerRewinder.this.webView != null) {
                long duration = OldVideoPlayerRewinder.this.getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
                    OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
                    int i7 = oldVideoPlayerRewinder.rewindCount;
                    if (i7 == 1) {
                        j3 = 3;
                    } else if (i7 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    long j11 = j10 * j3;
                    if (oldVideoPlayerRewinder.rewindForward) {
                        OldVideoPlayerRewinder.access$514(OldVideoPlayerRewinder.this, j11);
                    } else {
                        OldVideoPlayerRewinder.access$522(OldVideoPlayerRewinder.this, j11);
                    }
                    if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition < 0) {
                        OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = 0L;
                    } else if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition > duration) {
                        OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = duration;
                    }
                    OldVideoPlayerRewinder oldVideoPlayerRewinder2 = OldVideoPlayerRewinder.this;
                    if (oldVideoPlayerRewinder2.rewindByBackSeek && oldVideoPlayerRewinder2.rewindLastTime - OldVideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 350) {
                        OldVideoPlayerRewinder oldVideoPlayerRewinder3 = OldVideoPlayerRewinder.this;
                        oldVideoPlayerRewinder3.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder3.rewindLastTime;
                        OldVideoPlayerRewinder oldVideoPlayerRewinder4 = OldVideoPlayerRewinder.this;
                        oldVideoPlayerRewinder4.seekTo(oldVideoPlayerRewinder4.rewindBackSeekPlayerPosition);
                    }
                    long j12 = OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition - OldVideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) OldVideoPlayerRewinder.this.getDuration());
                    OldVideoPlayerRewinder oldVideoPlayerRewinder5 = OldVideoPlayerRewinder.this;
                    oldVideoPlayerRewinder5.updateRewindProgressUi(j12, duration2, oldVideoPlayerRewinder5.rewindByBackSeek);
                    if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                        OldVideoPlayerRewinder oldVideoPlayerRewinder6 = OldVideoPlayerRewinder.this;
                        if (oldVideoPlayerRewinder6.rewindByBackSeek) {
                            oldVideoPlayerRewinder6.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder6.rewindLastTime;
                            OldVideoPlayerRewinder oldVideoPlayerRewinder7 = OldVideoPlayerRewinder.this;
                            oldVideoPlayerRewinder7.seekTo(oldVideoPlayerRewinder7.rewindBackSeekPlayerPosition);
                        }
                        OldVideoPlayerRewinder.this.cancelRewind();
                    }
                    OldVideoPlayerRewinder oldVideoPlayerRewinder8 = OldVideoPlayerRewinder.this;
                    if (oldVideoPlayerRewinder8.rewindCount > 0) {
                        g0.i3(oldVideoPlayerRewinder8.backSeek, 16L);
                        return;
                    }
                    return;
                }
                OldVideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
            }
        }
    };

    public static long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j3) {
        long j10 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j3;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    public static long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j3) {
        long j10 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j3;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    private long getCurrentPosition() {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            return ae0Var.getCurrentPosition();
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return 0L;
        }
        return t51Var.S();
    }

    public long getDuration() {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            return ae0Var.getVideoDuration();
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return 0L;
        }
        return t51Var.U();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            return ae0Var.G;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return false;
        }
        return t51Var.d0();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j3) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.i(j3);
            return;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return;
        }
        t51Var.p0(j3);
    }

    private void setPlaybackSpeed(float f10) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.setPlaybackSpeed(f10);
            return;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return;
        }
        t51Var.v0(f10);
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
        g0.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            g0.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void startRewind(ae0 ae0Var, boolean z9, float f10) {
        this.webView = ae0Var;
        this.playSpeed = f10;
        this.rewindForward = z9;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(t51 t51Var, boolean z9, float f10) {
        this.videoPlayer = t51Var;
        this.playSpeed = f10;
        this.rewindForward = z9;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z9) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z9) {
    }
}
