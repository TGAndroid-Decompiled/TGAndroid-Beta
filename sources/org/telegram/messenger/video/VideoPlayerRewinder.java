package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.ve0;
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
    private sn0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private v61 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private ve0 webView;
    private float f18697x;
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
                        i0.h3(VideoPlayerRewinder.this.backSeek, 16L);
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
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            return ve0Var.getCurrentPosition();
        }
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            return 0L;
        }
        return v61Var.S();
    }

    public long getDuration() {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            return ve0Var.getVideoDuration();
        }
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            return 0L;
        }
        return v61Var.U();
    }

    private boolean isPlaying() {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            return ve0Var.G;
        }
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            return false;
        }
        return v61Var.d0();
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
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            ve0Var.i(j10);
        } else {
            v61 v61Var = this.videoPlayer;
            if (v61Var != null) {
                v61Var.q0(j10, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z10) {
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            v61Var.t0(z10);
        }
    }

    private void setPaused(boolean z10) {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            if (z10) {
                ve0Var.f();
                return;
            } else {
                ve0Var.g();
                return;
            }
        }
        v61 v61Var = this.videoPlayer;
        if (v61Var != null) {
            if (z10) {
                v61Var.g0();
            } else {
                v61Var.h0();
            }
        }
    }

    private void setPlaybackSpeed(float f7) {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            ve0Var.setPlaybackSpeed(f7);
            return;
        }
        v61 v61Var = this.videoPlayer;
        if (v61Var == null) {
            return;
        }
        v61Var.v0(f7);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            v61 v61Var = this.videoPlayer;
            if (v61Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (v61Var != null && this.framesRewinder != null) {
                        v61Var.r0(this.rewindBackSeekPlayerPosition, false, new r(this, 1));
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
            i0.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z10) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                i0.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            sn0 sn0Var = this.seekSpeedDrawable;
            if (sn0Var != null) {
                sn0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f7 = this.value;
        if (f7 < 0.4f) {
            f7 -= 1.9f;
        }
        return Utilities.i(f7, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f7) {
        if (f7 < -1.5f) {
            return f7 + 1.9f;
        }
        return f7;
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void setX(float f7) {
        this.value -= (this.f18697x - f7) / i0.L(40.0f);
        this.f18697x = f7;
        sn0 sn0Var = this.seekSpeedDrawable;
        if (sn0Var != null) {
            sn0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(ve0 ve0Var, boolean z10, float f7, float f10, sn0 sn0Var) {
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
        this.webView = ve0Var;
        this.seekSpeedDrawable = sn0Var;
        this.playSpeed = f10;
        this.wasMuted = false;
        this.wasPaused = (ve0Var == null || ve0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f18697x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (sn0Var != null) {
            sn0Var.c(false, getRewindSpeed());
            sn0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        v61 v61Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed < 0.0f) {
            if (!this.rewindByBackSeek) {
                this.rewindByBackSeek = true;
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                this.rewindLastTime = System.currentTimeMillis();
                i0.g3(this.backSeek);
                setMuted(true);
                setPaused(true);
                setPlaybackSpeed(this.playSpeed);
                VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (v61Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = v61Var.N;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((s61) v61Var.N.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                u61 u61Var = (u61) obj;
                                if (!u61Var.b()) {
                                    u61Var.e(true);
                                }
                                if (u61Var.b()) {
                                    file = new File(u61Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = v61Var.Q;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(v61Var.Q.getPath());
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
            i0.r(this.backSeek);
            if (!this.wasMuted && !this.wasPaused) {
                z10 = false;
            }
            setMuted(z10);
            setPaused(false);
            v61 v61Var2 = this.videoPlayer;
            if (v61Var2 != null && this.framesRewinder != null) {
                long j10 = this.rewindBackSeekPlayerPosition;
                if (j10 >= 0) {
                    v61Var2.r0(j10, false, new r(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(v61 v61Var, boolean z10, float f7, float f10, sn0 sn0Var) {
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
        this.videoPlayer = v61Var;
        this.seekSpeedDrawable = sn0Var;
        this.playSpeed = f10;
        this.wasMuted = v61Var != null && v61Var.c0();
        this.wasPaused = (v61Var == null || v61Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f18697x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (sn0Var != null) {
            sn0Var.c(false, getRewindSpeed());
            sn0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f7, boolean z10) {
    }
}
