package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.xf0;
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
    private oo0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private j71 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private xf0 webView;
    private float f20312x;
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
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            return xf0Var.getCurrentPosition();
        }
        j71 j71Var = this.videoPlayer;
        if (j71Var == null) {
            return 0L;
        }
        return j71Var.n();
    }

    public long getDuration() {
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            return xf0Var.getVideoDuration();
        }
        j71 j71Var = this.videoPlayer;
        if (j71Var == null) {
            return 0L;
        }
        return j71Var.p();
    }

    private boolean isPlaying() {
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            return xf0Var.D;
        }
        j71 j71Var = this.videoPlayer;
        if (j71Var == null) {
            return false;
        }
        return j71Var.y();
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

    public void seekTo(long j10, boolean z4) {
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            xf0Var.i(j10);
        } else {
            j71 j71Var = this.videoPlayer;
            if (j71Var != null) {
                j71Var.L(j10, z4);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z4) {
        j71 j71Var = this.videoPlayer;
        if (j71Var != null) {
            j71Var.O(z4);
        }
    }

    private void setPaused(boolean z4) {
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            if (z4) {
                xf0Var.f();
                return;
            } else {
                xf0Var.g();
                return;
            }
        }
        j71 j71Var = this.videoPlayer;
        if (j71Var != null) {
            if (z4) {
                j71Var.B();
            } else {
                j71Var.C();
            }
        }
    }

    private void setPlaybackSpeed(float f10) {
        xf0 xf0Var = this.webView;
        if (xf0Var != null) {
            xf0Var.setPlaybackSpeed(f10);
            return;
        }
        j71 j71Var = this.videoPlayer;
        if (j71Var == null) {
            return;
        }
        j71Var.Q(f10);
    }

    public void cancelRewind() {
        boolean z4;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            j71 j71Var = this.videoPlayer;
            if (j71Var == null && this.webView == null) {
                z4 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (j71Var != null && this.framesRewinder != null) {
                        j71Var.M(this.rewindBackSeekPlayerPosition, false, new r(this, 1));
                        z4 = true;
                        setPlaybackSpeed(this.playSpeed);
                    } else {
                        seekTo(this.rewindBackSeekPlayerPosition, false);
                    }
                } else {
                    seekTo(getCurrentPosition(), false);
                }
                z4 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z4) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            oo0 oo0Var = this.seekSpeedDrawable;
            if (oo0Var != null) {
                oo0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f10 = this.value;
        if (f10 < 0.4f) {
            f10 -= 1.9f;
        }
        return Utilities.clamp(f10, 10.0f, -6.0f);
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
        this.value -= (this.f20312x - f10) / AndroidUtilities.dp(40.0f);
        this.f20312x = f10;
        oo0 oo0Var = this.seekSpeedDrawable;
        if (oo0Var != null) {
            oo0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(xf0 xf0Var, boolean z4, float f10, float f11, oo0 oo0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z4;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = xf0Var;
        this.seekSpeedDrawable = oo0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (xf0Var == null || xf0Var.D) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f20312x = f10;
        this.value = getValueBySpeed(z4 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (oo0Var != null) {
            oo0Var.c(getRewindSpeed(), false);
            oo0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        j71 j71Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z4 = true;
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
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (j71Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = j71Var.K;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((f71) j71Var.K.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                h71 h71Var = (h71) obj;
                                if (!h71Var.b()) {
                                    h71Var.e(true);
                                }
                                if (h71Var.b()) {
                                    file = new File(h71Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = j71Var.N;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(j71Var.N.getPath());
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
                z4 = false;
            }
            setMuted(z4);
            setPaused(false);
            j71 j71Var2 = this.videoPlayer;
            if (j71Var2 != null && this.framesRewinder != null) {
                long j10 = this.rewindBackSeekPlayerPosition;
                if (j10 >= 0) {
                    j71Var2.M(j10, false, new r(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void startRewind(j71 j71Var, boolean z4, float f10, float f11, oo0 oo0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z4;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = j71Var;
        this.seekSpeedDrawable = oo0Var;
        this.playSpeed = f11;
        this.wasMuted = j71Var != null && j71Var.x();
        this.wasPaused = (j71Var == null || j71Var.y()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f20312x = f10;
        this.value = getValueBySpeed(z4 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (oo0Var != null) {
            oo0Var.c(getRewindSpeed(), false);
            oo0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z4) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z4) {
    }
}
