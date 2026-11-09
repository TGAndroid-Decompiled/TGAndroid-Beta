package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
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
    private rm0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private u51 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private be0 webView;
    private float f25995x;
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

    public static long access$522(VideoPlayerRewinder videoPlayerRewinder, long j3) {
        long j10 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j3;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    public long getCurrentPosition() {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            return be0Var.getCurrentPosition();
        }
        u51 u51Var = this.videoPlayer;
        if (u51Var == null) {
            return 0L;
        }
        return u51Var.S();
    }

    public long getDuration() {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            return be0Var.getVideoDuration();
        }
        u51 u51Var = this.videoPlayer;
        if (u51Var == null) {
            return 0L;
        }
        return u51Var.U();
    }

    private boolean isPlaying() {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            return be0Var.G;
        }
        u51 u51Var = this.videoPlayer;
        if (u51Var == null) {
            return false;
        }
        return u51Var.d0();
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

    public void seekTo(long j3, boolean z9) {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            be0Var.i(j3);
        } else {
            u51 u51Var = this.videoPlayer;
            if (u51Var != null) {
                u51Var.q0(j3, z9);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z9) {
        u51 u51Var = this.videoPlayer;
        if (u51Var != null) {
            u51Var.t0(z9);
        }
    }

    private void setPaused(boolean z9) {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            if (z9) {
                be0Var.f();
                return;
            } else {
                be0Var.g();
                return;
            }
        }
        u51 u51Var = this.videoPlayer;
        if (u51Var != null) {
            if (z9) {
                u51Var.g0();
            } else {
                u51Var.h0();
            }
        }
    }

    private void setPlaybackSpeed(float f10) {
        be0 be0Var = this.webView;
        if (be0Var != null) {
            be0Var.setPlaybackSpeed(f10);
            return;
        }
        u51 u51Var = this.videoPlayer;
        if (u51Var == null) {
            return;
        }
        u51Var.v0(f10);
    }

    public void cancelRewind() {
        boolean z9;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            u51 u51Var = this.videoPlayer;
            if (u51Var == null && this.webView == null) {
                z9 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (u51Var != null && this.framesRewinder != null) {
                        u51Var.r0(this.rewindBackSeekPlayerPosition, false, new q(this, 1));
                        z9 = true;
                        setPlaybackSpeed(this.playSpeed);
                    } else {
                        seekTo(this.rewindBackSeekPlayerPosition, false);
                    }
                } else {
                    seekTo(getCurrentPosition(), false);
                }
                z9 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            g0.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z9) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                g0.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            rm0 rm0Var = this.seekSpeedDrawable;
            if (rm0Var != null) {
                rm0Var.b(false);
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
        this.value -= (this.f25995x - f10) / g0.L(40.0f);
        this.f25995x = f10;
        rm0 rm0Var = this.seekSpeedDrawable;
        if (rm0Var != null) {
            rm0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(be0 be0Var, boolean z9, float f10, float f11, rm0 rm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z9;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = be0Var;
        this.seekSpeedDrawable = rm0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (be0Var == null || be0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f25995x = f10;
        this.value = getValueBySpeed(z9 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (rm0Var != null) {
            rm0Var.c(false, getRewindSpeed());
            rm0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        u51 u51Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z9 = true;
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
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (u51Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = u51Var.N;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((q51) u51Var.N.get(size)).d;
                            int size2 = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                Object obj = arrayList2.get(i7);
                                i7++;
                                s51 s51Var = (s51) obj;
                                if (!s51Var.b()) {
                                    s51Var.e(true);
                                }
                                if (s51Var.b()) {
                                    file = new File(s51Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = u51Var.Q;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(u51Var.Q.getPath());
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
                z9 = false;
            }
            setMuted(z9);
            setPaused(false);
            u51 u51Var2 = this.videoPlayer;
            if (u51Var2 != null && this.framesRewinder != null) {
                long j3 = this.rewindBackSeekPlayerPosition;
                if (j3 >= 0) {
                    u51Var2.r0(j3, false, new q(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(u51 u51Var, boolean z9, float f10, float f11, rm0 rm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z9;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = u51Var;
        this.seekSpeedDrawable = rm0Var;
        this.playSpeed = f11;
        this.wasMuted = u51Var != null && u51Var.c0();
        this.wasPaused = (u51Var == null || u51Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f25995x = f10;
        this.value = getValueBySpeed(z9 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (rm0Var != null) {
            rm0Var.c(false, getRewindSpeed());
            rm0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z9) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z9) {
    }
}
