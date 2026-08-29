package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x61;
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
    private eo0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private x61 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private mf0 webView;
    private float f21851x;
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
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.getCurrentPosition();
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.o();
    }

    public long getDuration() {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.getVideoDuration();
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    private boolean isPlaying() {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            return mf0Var.C;
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return false;
        }
        return x61Var.z();
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
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            mf0Var.i(j10);
        } else {
            x61 x61Var = this.videoPlayer;
            if (x61Var != null) {
                x61Var.M(j10, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z10) {
        x61 x61Var = this.videoPlayer;
        if (x61Var != null) {
            x61Var.P(z10);
        }
    }

    private void setPaused(boolean z10) {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            if (z10) {
                mf0Var.f();
                return;
            } else {
                mf0Var.g();
                return;
            }
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var != null) {
            if (z10) {
                x61Var.C();
            } else {
                x61Var.D();
            }
        }
    }

    private void setPlaybackSpeed(float f9) {
        mf0 mf0Var = this.webView;
        if (mf0Var != null) {
            mf0Var.setPlaybackSpeed(f9);
            return;
        }
        x61 x61Var = this.videoPlayer;
        if (x61Var == null) {
            return;
        }
        x61Var.R(f9);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            x61 x61Var = this.videoPlayer;
            if (x61Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (x61Var != null && this.framesRewinder != null) {
                        x61Var.N(this.rewindBackSeekPlayerPosition, false, new q(this, 1));
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
            eo0 eo0Var = this.seekSpeedDrawable;
            if (eo0Var != null) {
                eo0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f9 = this.value;
        if (f9 < 0.4f) {
            f9 -= 1.9f;
        }
        return Utilities.clamp(f9, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f9) {
        if (f9 < -1.5f) {
            return f9 + 1.9f;
        }
        return f9;
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void setX(float f9) {
        this.value -= (this.f21851x - f9) / AndroidUtilities.dp(40.0f);
        this.f21851x = f9;
        eo0 eo0Var = this.seekSpeedDrawable;
        if (eo0Var != null) {
            eo0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(mf0 mf0Var, boolean z10, float f9, float f10, eo0 eo0Var) {
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
        this.webView = mf0Var;
        this.seekSpeedDrawable = eo0Var;
        this.playSpeed = f10;
        this.wasMuted = false;
        this.wasPaused = (mf0Var == null || mf0Var.C) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f21851x = f9;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (eo0Var != null) {
            eo0Var.c(getRewindSpeed(), false);
            eo0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        x61 x61Var;
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
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (x61Var = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = x61Var.J;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((t61) x61Var.J.get(size)).d;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj = arrayList2.get(i10);
                                i10++;
                                v61 v61Var = (v61) obj;
                                if (!v61Var.b()) {
                                    v61Var.e(true);
                                }
                                if (v61Var.b()) {
                                    file = new File(v61Var.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = x61Var.M;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(x61Var.M.getPath());
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
            x61 x61Var2 = this.videoPlayer;
            if (x61Var2 != null && this.framesRewinder != null) {
                long j10 = this.rewindBackSeekPlayerPosition;
                if (j10 >= 0) {
                    x61Var2.N(j10, false, new q(this, 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void startRewind(x61 x61Var, boolean z10, float f9, float f10, eo0 eo0Var) {
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
        this.videoPlayer = x61Var;
        this.seekSpeedDrawable = eo0Var;
        this.playSpeed = f10;
        this.wasMuted = x61Var != null && x61Var.y();
        this.wasPaused = (x61Var == null || x61Var.z()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.f21851x = f9;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (eo0Var != null) {
            eo0Var.c(getRewindSpeed(), false);
            eo0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f9, boolean z10) {
    }
}
