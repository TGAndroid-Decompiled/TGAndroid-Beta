package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.vf0;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private i71 videoPlayer;
    private vf0 webView;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        {
            OldVideoPlayerRewinder.this = this;
        }

        @Override
        public void run() {
            long j10;
            if (OldVideoPlayerRewinder.this.videoPlayer != null || OldVideoPlayerRewinder.this.webView != null) {
                long duration = OldVideoPlayerRewinder.this.getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
                    OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
                    int i10 = oldVideoPlayerRewinder.rewindCount;
                    if (i10 == 1) {
                        j10 = 3;
                    } else if (i10 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    long j12 = j11 * j10;
                    if (oldVideoPlayerRewinder.rewindForward) {
                        OldVideoPlayerRewinder.access$514(OldVideoPlayerRewinder.this, j12);
                    } else {
                        OldVideoPlayerRewinder.access$522(OldVideoPlayerRewinder.this, j12);
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
                    long j13 = OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition - OldVideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) OldVideoPlayerRewinder.this.getDuration());
                    OldVideoPlayerRewinder oldVideoPlayerRewinder5 = OldVideoPlayerRewinder.this;
                    oldVideoPlayerRewinder5.updateRewindProgressUi(j13, duration2, oldVideoPlayerRewinder5.rewindByBackSeek);
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

    public static long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j10) {
        long j11 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j10;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    public static long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j10) {
        long j11 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j10;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    private long getCurrentPosition() {
        vf0 vf0Var = this.webView;
        if (vf0Var != null) {
            return vf0Var.getCurrentPosition();
        }
        i71 i71Var = this.videoPlayer;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.n();
    }

    public long getDuration() {
        vf0 vf0Var = this.webView;
        if (vf0Var != null) {
            return vf0Var.getVideoDuration();
        }
        i71 i71Var = this.videoPlayer;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        vf0 vf0Var = this.webView;
        if (vf0Var != null) {
            return vf0Var.D;
        }
        i71 i71Var = this.videoPlayer;
        if (i71Var == null) {
            return false;
        }
        return i71Var.y();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j10) {
        vf0 vf0Var = this.webView;
        if (vf0Var != null) {
            vf0Var.i(j10);
            return;
        }
        i71 i71Var = this.videoPlayer;
        if (i71Var == null) {
            return;
        }
        i71Var.K(j10);
    }

    private void setPlaybackSpeed(float f10) {
        vf0 vf0Var = this.webView;
        if (vf0Var != null) {
            vf0Var.setPlaybackSpeed(f10);
            return;
        }
        i71 i71Var = this.videoPlayer;
        if (i71Var == null) {
            return;
        }
        i71Var.Q(f10);
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

    public void startRewind(vf0 vf0Var, boolean z4, float f10) {
        this.webView = vf0Var;
        this.playSpeed = f10;
        this.rewindForward = z4;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(i71 i71Var, boolean z4, float f10) {
        this.videoPlayer = i71Var;
        this.playSpeed = f10;
        this.rewindForward = z4;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z4) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z4) {
    }
}
