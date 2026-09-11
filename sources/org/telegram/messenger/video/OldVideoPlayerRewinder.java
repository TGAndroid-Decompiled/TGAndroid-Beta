package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.qf0;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private g71 videoPlayer;
    private qf0 webView;
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
                    int i10 = oldVideoPlayerRewinder.rewindCount;
                    if (i10 == 1) {
                        j3 = 3;
                    } else if (i10 == 2) {
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
                        AndroidUtilities.runOnUIThread(oldVideoPlayerRewinder8.backSeek, 16L);
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
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            return qf0Var.getCurrentPosition();
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.n();
    }

    public long getDuration() {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            return qf0Var.getVideoDuration();
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.p();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            return qf0Var.G;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return false;
        }
        return g71Var.y();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j3) {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            qf0Var.i(j3);
            return;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return;
        }
        g71Var.K(j3);
    }

    private void setPlaybackSpeed(float f7) {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            qf0Var.setPlaybackSpeed(f7);
            return;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return;
        }
        g71Var.Q(f7);
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
        AndroidUtilities.cancelRunOnUIThread(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void startRewind(qf0 qf0Var, boolean z10, float f7) {
        this.webView = qf0Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(g71 g71Var, boolean z10, float f7) {
        this.videoPlayer = g71Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f7, boolean z10) {
    }
}
