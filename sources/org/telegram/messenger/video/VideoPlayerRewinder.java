package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.ud0;
public class VideoPlayerRewinder {
    private boolean fastSeeking;
    private VideoFramesRewinder framesRewinder;
    private long rewindBackSeekLastPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    public boolean rewinding;
    private tm0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private m51 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private ud0 webView;
    private float f25892x;
    private long rewindBackSeekPlayerPosition = -1;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        {
            VideoPlayerRewinder.this = this;
        }

        @Override
        public void run() {
            if (VideoPlayerRewinder.this.videoPlayer != null || VideoPlayerRewinder.this.webView != null) {
                long duration = VideoPlayerRewinder.this.getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
                    VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
                    VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, ((float) j10) * max);
                    VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
                    videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.k(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
                    VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
                    if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.getCurrentPosition() > VideoPlayerRewinder.this.rewindBackSeekPlayerPosition && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 10) {
                        VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                        videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                        if (VideoPlayerRewinder.this.framesRewinder != null) {
                            VideoPlayerRewinder.this.framesRewinder.seek(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition, Math.abs(max));
                        } else {
                            VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                            videoPlayerRewinder4.seekTo(videoPlayerRewinder4.rewindBackSeekPlayerPosition, false);
                        }
                    }
                    long j11 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) VideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) VideoPlayerRewinder.this.getDuration());
                    VideoPlayerRewinder videoPlayerRewinder5 = VideoPlayerRewinder.this;
                    videoPlayerRewinder5.updateRewindProgressUi(j11, duration2, videoPlayerRewinder5.rewindByBackSeek);
                    if (VideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || VideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                        VideoPlayerRewinder videoPlayerRewinder6 = VideoPlayerRewinder.this;
                        if (videoPlayerRewinder6.rewindByBackSeek) {
                            videoPlayerRewinder6.rewindLastUpdatePlayerTime = videoPlayerRewinder6.rewindLastTime;
                            VideoPlayerRewinder videoPlayerRewinder7 = VideoPlayerRewinder.this;
                            videoPlayerRewinder7.seekTo(videoPlayerRewinder7.rewindBackSeekPlayerPosition, false);
                        }
                        VideoPlayerRewinder.this.cancelRewind();
                    }
                    VideoPlayerRewinder videoPlayerRewinder8 = VideoPlayerRewinder.this;
                    if (videoPlayerRewinder8.rewinding && videoPlayerRewinder8.getRewindSpeed() < 0.0f) {
                        g0.i3(VideoPlayerRewinder.this.backSeek, 16L);
                        return;
                    }
                    return;
                }
                VideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
            }
        }
    };

    public VideoPlayerRewinder(VideoFramesRewinder videoFramesRewinder) {
        this.framesRewinder = videoFramesRewinder;
    }

    public static long access$522(VideoPlayerRewinder videoPlayerRewinder, long j10) {
        long j11 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j10;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    public long getCurrentPosition() {
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

    public void lambda$cancelRewind$1() {
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
    }

    public void lambda$updateRewindSpeed$0() {
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.clearCurrent();
        }
    }

    public void seekTo(long j10, boolean z10) {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            ud0Var.i(j10);
        } else {
            m51 m51Var = this.videoPlayer;
            if (m51Var != null) {
                m51Var.q0(j10, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z10) {
        m51 m51Var = this.videoPlayer;
        if (m51Var != null) {
            m51Var.t0(z10);
        }
    }

    private void setPaused(boolean z10) {
        ud0 ud0Var = this.webView;
        if (ud0Var != null) {
            if (z10) {
                ud0Var.f();
                return;
            } else {
                ud0Var.g();
                return;
            }
        }
        m51 m51Var = this.videoPlayer;
        if (m51Var != null) {
            if (z10) {
                m51Var.g0();
            } else {
                m51Var.h0();
            }
        }
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
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            m51 m51Var = this.videoPlayer;
            if (m51Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (m51Var != null && this.framesRewinder != null) {
                        m51Var.r0(this.rewindBackSeekPlayerPosition, false, new r(this, 1));
                        z10 = true;
                        setPlaybackSpeed(this.playSpeed);
                    } else {
                        seekTo(this.rewindBackSeekPlayerPosition, false);
                    }
                } else {
                    seekTo(getCurrentPosition(), false);
                }
                z10 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            g0.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z10) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                g0.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            tm0 tm0Var = this.seekSpeedDrawable;
            if (tm0Var != null) {
                tm0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f10 = this.value;
        if (f10 < 0.4f) {
            f10 -= 1.9f;
        }
        return Utilities.i(f10, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f10) {
        if (f10 < -1.5f) {
            return f10 + 1.9f;
        }
        return f10;
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void setX(float f10) {
        this.value -= (this.f25892x - f10) / g0.L(40.0f);
        this.f25892x = f10;
        tm0 tm0Var = this.seekSpeedDrawable;
        if (tm0Var != null) {
            tm0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(ud0 ud0Var, boolean z10, float f10, float f11, tm0 tm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z10;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = ud0Var;
        this.seekSpeedDrawable = tm0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (ud0Var == null || ud0Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f25892x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (tm0Var != null) {
            tm0Var.c(false, getRewindSpeed());
            tm0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        m51 m51Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed < 0.0f) {
            if (!this.rewindByBackSeek) {
                this.rewindByBackSeek = true;
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                this.rewindLastTime = System.currentTimeMillis();
                g0.h3(this.backSeek);
                setMuted(true);
                setPaused(true);
                setPlaybackSpeed(this.playSpeed);
                VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (m51Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = m51Var.O;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((j51) m51Var.O.get(size)).d;
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj = arrayList2.get(i3);
                                i3++;
                                l51 l51Var = (l51) obj;
                                if (!l51Var.b()) {
                                    l51Var.e(true);
                                }
                                if (l51Var.b()) {
                                    file = new File(l51Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = m51Var.R;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(m51Var.R.getPath());
                    } else {
                        file = null;
                    }
                    videoFramesRewinder2.setup(file);
                    return;
                }
                return;
            }
            return;
        }
        if (this.rewindByBackSeek) {
            this.rewindByBackSeek = false;
            g0.r(this.backSeek);
            if (!this.wasMuted && !this.wasPaused) {
                z10 = false;
            }
            setMuted(z10);
            setPaused(false);
            m51 m51Var2 = this.videoPlayer;
            if (m51Var2 != null && this.framesRewinder != null) {
                long j10 = this.rewindBackSeekPlayerPosition;
                if (j10 >= 0) {
                    m51Var2.r0(j10, false, new r(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(m51 m51Var, boolean z10, float f10, float f11, tm0 tm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z10;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = m51Var;
        this.seekSpeedDrawable = tm0Var;
        this.playSpeed = f11;
        this.wasMuted = m51Var != null && m51Var.c0();
        this.wasPaused = (m51Var == null || m51Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f25892x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (tm0Var != null) {
            tm0Var.c(false, getRewindSpeed());
            tm0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z10) {
    }
}
