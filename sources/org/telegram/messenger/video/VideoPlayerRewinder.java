package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
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
    private lx9 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private ndc videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private bc8 webView;
    private float x;
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
                    long j = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
                    VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                    float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
                    VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, ((float) j) * max);
                    VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
                    videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.k(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
                    VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
                    if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.getCurrentPosition() > VideoPlayerRewinder.this.rewindBackSeekPlayerPosition && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 10) {
                        VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                        videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                        VideoFramesRewinder videoFramesRewinder = VideoPlayerRewinder.this.framesRewinder;
                        VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                        if (videoFramesRewinder == null) {
                            videoPlayerRewinder4.seekTo(videoPlayerRewinder4.rewindBackSeekPlayerPosition, false);
                        } else {
                            videoPlayerRewinder4.framesRewinder.seek(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition, Math.abs(max));
                        }
                    }
                    long j2 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) VideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) VideoPlayerRewinder.this.getDuration());
                    VideoPlayerRewinder videoPlayerRewinder5 = VideoPlayerRewinder.this;
                    videoPlayerRewinder5.updateRewindProgressUi(j2, duration2, videoPlayerRewinder5.rewindByBackSeek);
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
                        gm.d3(VideoPlayerRewinder.this.backSeek, 16L);
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

    public static long access$522(VideoPlayerRewinder videoPlayerRewinder, long j) {
        long j2 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    public long getCurrentPosition() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.getCurrentPosition();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.S();
    }

    public long getDuration() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.getVideoDuration();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.U();
    }

    private boolean isPlaying() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.H;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return false;
        }
        return ndcVar.c0();
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

    public void seekTo(long j, boolean z) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.i(j);
        } else {
            ndc ndcVar = this.videoPlayer;
            if (ndcVar != null) {
                ndcVar.p0(j, z);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j;
    }

    private void setMuted(boolean z) {
        ndc ndcVar = this.videoPlayer;
        if (ndcVar != null) {
            ndcVar.s0(z);
        }
    }

    private void setPaused(boolean z) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            if (z) {
                bc8Var.e();
                return;
            } else {
                bc8Var.f();
                return;
            }
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar != null) {
            if (z) {
                ndcVar.f0();
            } else {
                ndcVar.g0();
            }
        }
    }

    private void setPlaybackSpeed(float f) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.setPlaybackSpeed(f);
            return;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return;
        }
        ndcVar.u0(f);
    }

    public void cancelRewind() {
        boolean z;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            ndc ndcVar = this.videoPlayer;
            if (ndcVar == null && this.webView == null) {
                z = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (ndcVar != null && this.framesRewinder != null) {
                        z = true;
                        ndcVar.q0(this.rewindBackSeekPlayerPosition, false, new tdc(this, (byte) 1));
                        setPlaybackSpeed(this.playSpeed);
                    } else {
                        seekTo(this.rewindBackSeekPlayerPosition, false);
                    }
                } else {
                    seekTo(getCurrentPosition(), false);
                }
                z = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            gm.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                gm.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            lx9 lx9Var = this.seekSpeedDrawable;
            if (lx9Var != null) {
                lx9Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f = this.value;
        if (f < 0.4f) {
            f -= 1.9f;
        }
        return Utilities.i(f, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f) {
        if (f < -1.5f) {
            return f + 1.9f;
        }
        return f;
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) getDuration());
    }

    public void setX(float f) {
        this.value -= (this.x - f) / gm.L(40.0f);
        this.x = f;
        lx9 lx9Var = this.seekSpeedDrawable;
        if (lx9Var != null) {
            lx9Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(defpackage.ndc r4, boolean r5, float r6, float r7, defpackage.lx9 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoPlayerRewinder.startRewind(ndc, boolean, float, float, lx9):void");
    }

    public void updateRewindSpeed() {
        ndc ndcVar;
        File file;
        float rewindSpeed = getRewindSpeed();
        int i = (rewindSpeed > 0.0f ? 1 : (rewindSpeed == 0.0f ? 0 : -1));
        boolean z = this.rewindByBackSeek;
        boolean z2 = true;
        if (i < 0) {
            if (!z) {
                this.rewindByBackSeek = true;
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                this.rewindLastTime = System.currentTimeMillis();
                gm.c3(this.backSeek);
                setMuted(true);
                setPaused(true);
                setPlaybackSpeed(this.playSpeed);
                VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
                if (videoFramesRewinder != null && !videoFramesRewinder.isReady() && (ndcVar = this.videoPlayer) != null) {
                    VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
                    ArrayList arrayList = ndcVar.O;
                    if (arrayList != null) {
                        loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = ((kdc) ndcVar.O.get(size)).d;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                mdc mdcVar = (mdc) obj;
                                if (!mdcVar.b()) {
                                    mdcVar.e(true);
                                }
                                if (mdcVar.b()) {
                                    file = new File(mdcVar.d.getPath());
                                    break loop0;
                                }
                            }
                        }
                    }
                    Uri uri = ndcVar.R;
                    if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
                        file = new File(ndcVar.R.getPath());
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
        if (z) {
            this.rewindByBackSeek = false;
            gm.r(this.backSeek);
            if (!this.wasMuted && !this.wasPaused) {
                z2 = false;
            }
            setMuted(z2);
            setPaused(false);
            ndc ndcVar2 = this.videoPlayer;
            if (ndcVar2 != null && this.framesRewinder != null) {
                long j = this.rewindBackSeekPlayerPosition;
                if (j >= 0) {
                    ndcVar2.q0(j, false, new tdc(this, (byte) 0));
                }
            }
        }
        setPlaybackSpeed(this.playSpeed * rewindSpeed);
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }

    public void startRewind(bc8 bc8Var, boolean z, float f, float f2, lx9 lx9Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = bc8Var;
        this.seekSpeedDrawable = lx9Var;
        this.playSpeed = f2;
        this.wasMuted = false;
        this.wasPaused = (bc8Var == null || bc8Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (lx9Var != null) {
            lx9Var.c(false, getRewindSpeed());
            lx9Var.b(true);
        }
    }
}
