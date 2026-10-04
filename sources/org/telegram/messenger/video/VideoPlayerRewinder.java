package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.z71;
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
    private dp0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private d81 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private dg0 webView;
    private float f19439x;
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
                    videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.clamp(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
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
                        AndroidUtilities.runOnUIThread(VideoPlayerRewinder.this.backSeek, 16L);
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
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            return dg0Var.getCurrentPosition();
        }
        d81 d81Var = this.videoPlayer;
        if (d81Var == null) {
            return 0L;
        }
        return d81Var.n();
    }

    public long getDuration() {
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            return dg0Var.getVideoDuration();
        }
        d81 d81Var = this.videoPlayer;
        if (d81Var == null) {
            return 0L;
        }
        return d81Var.p();
    }

    private boolean isPlaying() {
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            return dg0Var.G;
        }
        d81 d81Var = this.videoPlayer;
        if (d81Var == null) {
            return false;
        }
        return d81Var.y();
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
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            dg0Var.i(j3);
        } else {
            d81 d81Var = this.videoPlayer;
            if (d81Var != null) {
                d81Var.L(j3, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z10) {
        d81 d81Var = this.videoPlayer;
        if (d81Var != null) {
            d81Var.O(z10);
        }
    }

    private void setPaused(boolean z10) {
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            if (z10) {
                dg0Var.f();
                return;
            } else {
                dg0Var.g();
                return;
            }
        }
        d81 d81Var = this.videoPlayer;
        if (d81Var != null) {
            if (z10) {
                d81Var.B();
            } else {
                d81Var.C();
            }
        }
    }

    private void setPlaybackSpeed(float f7) {
        dg0 dg0Var = this.webView;
        if (dg0Var != null) {
            dg0Var.setPlaybackSpeed(f7);
            return;
        }
        d81 d81Var = this.videoPlayer;
        if (d81Var == null) {
            return;
        }
        d81Var.Q(f7);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            d81 d81Var = this.videoPlayer;
            if (d81Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (d81Var != null && this.framesRewinder != null) {
                        d81Var.M(this.rewindBackSeekPlayerPosition, false, new r(this, 1));
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
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z10) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            dp0 dp0Var = this.seekSpeedDrawable;
            if (dp0Var != null) {
                dp0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f7 = this.value;
        if (f7 < 0.4f) {
            f7 -= 1.9f;
        }
        return Utilities.clamp(f7, 10.0f, -6.0f);
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
        this.value -= (this.f19439x - f7) / AndroidUtilities.dp(40.0f);
        this.f19439x = f7;
        dp0 dp0Var = this.seekSpeedDrawable;
        if (dp0Var != null) {
            dp0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(dg0 dg0Var, boolean z10, float f7, float f10, dp0 dp0Var) {
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
        this.webView = dg0Var;
        this.seekSpeedDrawable = dp0Var;
        this.playSpeed = f10;
        this.wasMuted = false;
        this.wasPaused = (dg0Var == null || dg0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f19439x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (dp0Var != null) {
            dp0Var.c(getRewindSpeed(), false);
            dp0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        d81 d81Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed < 0.0f) {
            if (!this.rewindByBackSeek) {
                this.rewindByBackSeek = true;
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                this.rewindLastTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.backSeek);
                setMuted(true);
                setPaused(true);
                setPlaybackSpeed(this.playSpeed);
                VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (d81Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = d81Var.N;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((z71) d81Var.N.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                b81 b81Var = (b81) obj;
                                if (!b81Var.b()) {
                                    b81Var.e(true);
                                }
                                if (b81Var.b()) {
                                    file = new File(b81Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = d81Var.Q;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(d81Var.Q.getPath());
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
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            if (!this.wasMuted && !this.wasPaused) {
                z10 = false;
            }
            setMuted(z10);
            setPaused(false);
            d81 d81Var2 = this.videoPlayer;
            if (d81Var2 != null && this.framesRewinder != null) {
                long j3 = this.rewindBackSeekPlayerPosition;
                if (j3 >= 0) {
                    d81Var2.M(j3, false, new r(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void startRewind(d81 d81Var, boolean z10, float f7, float f10, dp0 dp0Var) {
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
        this.videoPlayer = d81Var;
        this.seekSpeedDrawable = dp0Var;
        this.playSpeed = f10;
        this.wasMuted = d81Var != null && d81Var.x();
        this.wasPaused = (d81Var == null || d81Var.y()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f19439x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (dp0Var != null) {
            dp0Var.c(getRewindSpeed(), false);
            dp0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f7, boolean z10) {
    }
}
