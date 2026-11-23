package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ke0;
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
    private en0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private h61 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private ke0 webView;
    private float f27471x;
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
                    long j3 = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
                    VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
                    VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, ((float) j3) * max);
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
                    long j10 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) VideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) VideoPlayerRewinder.this.getDuration());
                    VideoPlayerRewinder videoPlayerRewinder5 = VideoPlayerRewinder.this;
                    videoPlayerRewinder5.updateRewindProgressUi(j10, duration2, videoPlayerRewinder5.rewindByBackSeek);
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
                        g0.h3(VideoPlayerRewinder.this.backSeek, 16L);
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

    public static long access$522(VideoPlayerRewinder videoPlayerRewinder, long j3) {
        long j10 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j3;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    public long getCurrentPosition() {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            return ke0Var.getCurrentPosition();
        }
        h61 h61Var = this.videoPlayer;
        if (h61Var == null) {
            return 0L;
        }
        return h61Var.S();
    }

    public long getDuration() {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            return ke0Var.getVideoDuration();
        }
        h61 h61Var = this.videoPlayer;
        if (h61Var == null) {
            return 0L;
        }
        return h61Var.U();
    }

    private boolean isPlaying() {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            return ke0Var.H;
        }
        h61 h61Var = this.videoPlayer;
        if (h61Var == null) {
            return false;
        }
        return h61Var.d0();
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

    public void seekTo(long j3, boolean z10) {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            ke0Var.i(j3);
        } else {
            h61 h61Var = this.videoPlayer;
            if (h61Var != null) {
                h61Var.q0(j3, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z10) {
        h61 h61Var = this.videoPlayer;
        if (h61Var != null) {
            h61Var.t0(z10);
        }
    }

    private void setPaused(boolean z10) {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            if (z10) {
                ke0Var.f();
                return;
            } else {
                ke0Var.g();
                return;
            }
        }
        h61 h61Var = this.videoPlayer;
        if (h61Var != null) {
            if (z10) {
                h61Var.g0();
            } else {
                h61Var.h0();
            }
        }
    }

    private void setPlaybackSpeed(float f10) {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            ke0Var.setPlaybackSpeed(f10);
            return;
        }
        h61 h61Var = this.videoPlayer;
        if (h61Var == null) {
            return;
        }
        h61Var.v0(f10);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            h61 h61Var = this.videoPlayer;
            if (h61Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (h61Var != null && this.framesRewinder != null) {
                        h61Var.r0(this.rewindBackSeekPlayerPosition, false, new p(this, 1));
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
            en0 en0Var = this.seekSpeedDrawable;
            if (en0Var != null) {
                en0Var.b(false);
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
        this.value -= (this.f27471x - f10) / g0.L(40.0f);
        this.f27471x = f10;
        en0 en0Var = this.seekSpeedDrawable;
        if (en0Var != null) {
            en0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(ke0 ke0Var, boolean z10, float f10, float f11, en0 en0Var) {
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
        this.webView = ke0Var;
        this.seekSpeedDrawable = en0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (ke0Var == null || ke0Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f27471x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (en0Var != null) {
            en0Var.c(false, getRewindSpeed());
            en0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        h61 h61Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed < 0.0f) {
            if (!this.rewindByBackSeek) {
                this.rewindByBackSeek = true;
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                this.rewindLastTime = System.currentTimeMillis();
                g0.g3(this.backSeek);
                setMuted(true);
                setPaused(true);
                setPlaybackSpeed(this.playSpeed);
                VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (h61Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = h61Var.O;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((e61) h61Var.O.get(size)).d;
                            int size2 = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                Object obj = arrayList2.get(i7);
                                i7++;
                                g61 g61Var = (g61) obj;
                                if (!g61Var.b()) {
                                    g61Var.e(true);
                                }
                                if (g61Var.b()) {
                                    file = new File(g61Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = h61Var.R;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(h61Var.R.getPath());
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
            h61 h61Var2 = this.videoPlayer;
            if (h61Var2 != null && this.framesRewinder != null) {
                long j3 = this.rewindBackSeekPlayerPosition;
                if (j3 >= 0) {
                    h61Var2.r0(j3, false, new p(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(h61 h61Var, boolean z10, float f10, float f11, en0 en0Var) {
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
        this.videoPlayer = h61Var;
        this.seekSpeedDrawable = en0Var;
        this.playSpeed = f11;
        this.wasMuted = h61Var != null && h61Var.c0();
        this.wasPaused = (h61Var == null || h61Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f27471x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (en0Var != null) {
            en0Var.c(false, getRewindSpeed());
            en0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z10) {
    }
}
