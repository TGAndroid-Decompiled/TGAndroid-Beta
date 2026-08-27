package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.m61;

public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private m61 videoPlayer;
    private df0 webView;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        @Override
        public void run() {
            long j10;
            if (OldVideoPlayerRewinder.this.videoPlayer == null && OldVideoPlayerRewinder.this.webView == null) {
                return;
            }
            long duration = OldVideoPlayerRewinder.this.getDuration();
            if (duration == 0 || duration == -9223372036854775807L) {
                OldVideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = jCurrentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
            OldVideoPlayerRewinder.this.rewindLastTime = jCurrentTimeMillis;
            OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
            int i10 = oldVideoPlayerRewinder.rewindCount;
            if (i10 == 1) {
                j10 = 3;
            } else {
                j10 = i10 == 2 ? 6L : 12L;
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
            float duration2 = OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition / OldVideoPlayerRewinder.this.getDuration();
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
        df0 df0Var = this.webView;
        if (df0Var != null) {
            return df0Var.getCurrentPosition();
        }
        m61 m61Var = this.videoPlayer;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.o();
    }

    public long getDuration() {
        df0 df0Var = this.webView;
        if (df0Var != null) {
            return df0Var.getVideoDuration();
        }
        m61 m61Var = this.videoPlayer;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.q();
    }

    private void incrementRewindCount() {
        if (this.videoPlayer == null && this.webView == null) {
            return;
        }
        int i10 = this.rewindCount + 1;
        this.rewindCount = i10;
        boolean z10 = false;
        if (i10 == 1) {
            if (this.rewindForward && isPlaying()) {
                this.rewindByBackSeek = false;
            } else {
                this.rewindByBackSeek = true;
            }
        }
        if (!this.rewindForward || this.rewindByBackSeek) {
            int i11 = this.rewindCount;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
        } else {
            int i12 = this.rewindCount;
            if (i12 == 1) {
                setPlaybackSpeed(4.0f);
            } else if (i12 == 2) {
                setPlaybackSpeed(7.0f);
            } else {
                setPlaybackSpeed(13.0f);
            }
            z10 = true;
        }
        if (this.rewindCount == 1) {
            this.rewindBackSeekPlayerPosition = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.rewindLastTime = jCurrentTimeMillis;
            this.rewindLastUpdatePlayerTime = jCurrentTimeMillis;
            this.startRewindFrom = getCurrentPosition();
            onRewindStart(this.rewindForward);
        }
        AndroidUtilities.cancelRunOnUIThread(this.backSeek);
        AndroidUtilities.runOnUIThread(this.backSeek);
        if (z10) {
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            a aVar = new a(this, 0);
            this.updateRewindRunnable = aVar;
            AndroidUtilities.runOnUIThread(aVar, 2000L);
        }
    }

    private boolean isPlaying() {
        df0 df0Var = this.webView;
        if (df0Var != null) {
            return df0Var.C;
        }
        m61 m61Var = this.videoPlayer;
        if (m61Var == null) {
            return false;
        }
        return m61Var.z();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j10) {
        df0 df0Var = this.webView;
        if (df0Var != null) {
            df0Var.i(j10);
            return;
        }
        m61 m61Var = this.videoPlayer;
        if (m61Var == null) {
            return;
        }
        m61Var.L(j10);
    }

    private void setPlaybackSpeed(float f10) {
        df0 df0Var = this.webView;
        if (df0Var != null) {
            df0Var.setPlaybackSpeed(f10);
            return;
        }
        m61 m61Var = this.videoPlayer;
        if (m61Var == null) {
            return;
        }
        m61Var.R(f10);
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
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void startRewind(df0 df0Var, boolean z10, float f10) {
        this.webView = df0Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(m61 m61Var, boolean z10, float f10) {
        this.videoPlayer = m61Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z10) {
    }
}
