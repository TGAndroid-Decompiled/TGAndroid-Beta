package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.zf0;
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
    private to0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private t71 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private zf0 webView;
    private float f16620x;
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
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            return zf0Var.getCurrentPosition();
        }
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.n();
    }

    public long getDuration() {
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            return zf0Var.getVideoDuration();
        }
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
    }

    private boolean isPlaying() {
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            return zf0Var.G;
        }
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            return false;
        }
        return t71Var.y();
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
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            zf0Var.i(j3);
        } else {
            t71 t71Var = this.videoPlayer;
            if (t71Var != null) {
                t71Var.L(j3, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z10) {
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.O(z10);
        }
    }

    private void setPaused(boolean z10) {
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            if (z10) {
                zf0Var.f();
                return;
            } else {
                zf0Var.g();
                return;
            }
        }
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            if (z10) {
                t71Var.B();
            } else {
                t71Var.C();
            }
        }
    }

    private void setPlaybackSpeed(float f7) {
        zf0 zf0Var = this.webView;
        if (zf0Var != null) {
            zf0Var.setPlaybackSpeed(f7);
            return;
        }
        t71 t71Var = this.videoPlayer;
        if (t71Var == null) {
            return;
        }
        t71Var.Q(f7);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            t71 t71Var = this.videoPlayer;
            if (t71Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (t71Var != null && this.framesRewinder != null) {
                        t71Var.M(this.rewindBackSeekPlayerPosition, false, new q(this, 1));
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
            to0 to0Var = this.seekSpeedDrawable;
            if (to0Var != null) {
                to0Var.b(false);
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
        this.value -= (this.f16620x - f7) / AndroidUtilities.dp(40.0f);
        this.f16620x = f7;
        to0 to0Var = this.seekSpeedDrawable;
        if (to0Var != null) {
            to0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(zf0 zf0Var, boolean z10, float f7, float f10, to0 to0Var) {
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
        this.webView = zf0Var;
        this.seekSpeedDrawable = to0Var;
        this.playSpeed = f10;
        this.wasMuted = false;
        this.wasPaused = (zf0Var == null || zf0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f16620x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (to0Var != null) {
            to0Var.c(getRewindSpeed(), false);
            to0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        t71 t71Var;
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
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (t71Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = t71Var.N;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((p71) t71Var.N.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                r71 r71Var = (r71) obj;
                                if (!r71Var.b()) {
                                    r71Var.e(true);
                                }
                                if (r71Var.b()) {
                                    file = new File(r71Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = t71Var.Q;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(t71Var.Q.getPath());
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
            t71 t71Var2 = this.videoPlayer;
            if (t71Var2 != null && this.framesRewinder != null) {
                long j3 = this.rewindBackSeekPlayerPosition;
                if (j3 >= 0) {
                    t71Var2.M(j3, false, new q(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void startRewind(t71 t71Var, boolean z10, float f7, float f10, to0 to0Var) {
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
        this.videoPlayer = t71Var;
        this.seekSpeedDrawable = to0Var;
        this.playSpeed = f10;
        this.wasMuted = t71Var != null && t71Var.x();
        this.wasPaused = (t71Var == null || t71Var.y()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f16620x = f7;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (to0Var != null) {
            to0Var.c(getRewindSpeed(), false);
            to0Var.b(true);
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
