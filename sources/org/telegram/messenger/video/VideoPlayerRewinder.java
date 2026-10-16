package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.rg0;
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
    private lp0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private i81 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private rg0 webView;
    private float f18402x;
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

    public static long access$522(VideoPlayerRewinder videoPlayerRewinder, long j10) {
        long j11 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j10;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    public long getCurrentPosition() {
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            return rg0Var.getCurrentPosition();
        }
        i81 i81Var = this.videoPlayer;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.n();
    }

    public long getDuration() {
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            return rg0Var.getVideoDuration();
        }
        i81 i81Var = this.videoPlayer;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.p();
    }

    private boolean isPlaying() {
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            return rg0Var.G;
        }
        i81 i81Var = this.videoPlayer;
        if (i81Var == null) {
            return false;
        }
        return i81Var.y();
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
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            rg0Var.i(j10);
        } else {
            i81 i81Var = this.videoPlayer;
            if (i81Var != null) {
                i81Var.L(j10, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z10) {
        i81 i81Var = this.videoPlayer;
        if (i81Var != null) {
            i81Var.O(z10);
        }
    }

    private void setPaused(boolean z10) {
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            if (z10) {
                rg0Var.f();
                return;
            } else {
                rg0Var.g();
                return;
            }
        }
        i81 i81Var = this.videoPlayer;
        if (i81Var != null) {
            if (z10) {
                i81Var.B();
            } else {
                i81Var.C();
            }
        }
    }

    private void setPlaybackSpeed(float f7) {
        rg0 rg0Var = this.webView;
        if (rg0Var != null) {
            rg0Var.setPlaybackSpeed(f7);
            return;
        }
        i81 i81Var = this.videoPlayer;
        if (i81Var == null) {
            return;
        }
        i81Var.Q(f7);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            i81 i81Var = this.videoPlayer;
            if (i81Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (i81Var != null && this.framesRewinder != null) {
                        i81Var.M(this.rewindBackSeekPlayerPosition, false, new q(this, 1));
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
            lp0 lp0Var = this.seekSpeedDrawable;
            if (lp0Var != null) {
                lp0Var.b(false);
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
        this.value -= (this.f18402x - f7) / AndroidUtilities.dp(40.0f);
        this.f18402x = f7;
        lp0 lp0Var = this.seekSpeedDrawable;
        if (lp0Var != null) {
            lp0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(rg0 rg0Var, boolean z10, float f7, float f10, lp0 lp0Var) {
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
        this.webView = rg0Var;
        this.seekSpeedDrawable = lp0Var;
        this.playSpeed = f10;
        this.wasMuted = false;
        this.wasPaused = (rg0Var == null || rg0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f18402x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (lp0Var != null) {
            lp0Var.c(getRewindSpeed(), false);
            lp0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        i81 i81Var;
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
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (i81Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = i81Var.N;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((e81) i81Var.N.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                g81 g81Var = (g81) obj;
                                if (!g81Var.b()) {
                                    g81Var.e(true);
                                }
                                if (g81Var.b()) {
                                    file = new File(g81Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = i81Var.Q;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(i81Var.Q.getPath());
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
            i81 i81Var2 = this.videoPlayer;
            if (i81Var2 != null && this.framesRewinder != null) {
                long j10 = this.rewindBackSeekPlayerPosition;
                if (j10 >= 0) {
                    i81Var2.M(j10, false, new q(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void startRewind(i81 i81Var, boolean z10, float f7, float f10, lp0 lp0Var) {
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
        this.videoPlayer = i81Var;
        this.seekSpeedDrawable = lp0Var;
        this.playSpeed = f10;
        this.wasMuted = i81Var != null && i81Var.x();
        this.wasPaused = (i81Var == null || i81Var.y()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f18402x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (lp0Var != null) {
            lp0Var.c(getRewindSpeed(), false);
            lp0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f7, boolean z10) {
    }
}
