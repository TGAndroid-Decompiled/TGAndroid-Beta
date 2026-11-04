package org.telegram.messenger.video;

import org.telegram.messenger.g0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ud0;
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private m51 videoPlayer;
    private ud0 webView;
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
                    int i3 = oldVideoPlayerRewinder.rewindCount;
                    if (i3 == 1) {
                        j10 = 3;
                    } else if (i3 == 2) {
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
                        g0.i3(oldVideoPlayerRewinder8.backSeek, 16L);
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
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            return ud0Var.getCurrentPosition();
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.S();
    }

    public long getDuration() {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            return ud0Var.getVideoDuration();
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.U();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.OldVideoPlayerRewinder.incrementRewindCount():void");
    }

    private boolean isPlaying() {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            return ud0Var.H;
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var == null) {
            return false;
        }
        return m51Var.d0();
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public void seekTo(long j10) {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            ud0Var.i(j10);
            return;
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var == null) {
            return;
        }
        m51Var.p0(j10);
    }

    private void setPlaybackSpeed(float f10) {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            ud0Var.setPlaybackSpeed(f10);
            return;
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var == null) {
            return;
        }
        m51Var.v0(f10);
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

    public void startRewind(ud0 ud0Var, boolean z10, float f10) {
        this.webView = ud0Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(m51 m51Var, boolean z10, float f10) {
        this.videoPlayer = m51Var;
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
