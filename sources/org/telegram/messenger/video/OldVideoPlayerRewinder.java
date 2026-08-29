package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.x61;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private x61 videoPlayer;
    private mf0 webView;
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
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.getCurrentPosition();
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.o();
    }

    public long getDuration() {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.getVideoDuration();
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.C;
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return false;
        }
        return x61Var.z();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j10) {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            mf0Var.i(j10);
            return;
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return;
        }
        x61Var.L(j10);
    }

    private void setPlaybackSpeed(float f9) {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            mf0Var.setPlaybackSpeed(f9);
            return;
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return;
        }
        x61Var.R(f9);
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

    public void startRewind(mf0 mf0Var, boolean z10, float f9) {
        this.webView = mf0Var;
        this.playSpeed = f9;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(x61 x61Var, boolean z10, float f9) {
        this.videoPlayer = x61Var;
        this.playSpeed = f9;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f9, boolean z10) {
    }
}
