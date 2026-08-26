package org.telegram.messenger.video;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerImpl;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.SeekSpeedDrawable;
import org.telegram.ui.Components.VideoPlayer;

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
    private SeekSpeedDrawable seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private VideoPlayer videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private PhotoViewerWebView webView;
    private float x;
    private long rewindBackSeekPlayerPosition = -1;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        @Override
        public void run() {
            if (VideoPlayerRewinder.this.videoPlayer == null && VideoPlayerRewinder.this.webView == null) {
                return;
            }
            long duration = VideoPlayerRewinder.this.getDuration();
            if (duration == 0 || duration == -9223372036854775807L) {
                VideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
            VideoPlayerRewinder.this.rewindLastTime = jCurrentTimeMillis;
            float fMax = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
            VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, (long) (j * fMax));
            VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
            videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.clamp(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
            VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
            if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.getCurrentPosition() > VideoPlayerRewinder.this.rewindBackSeekPlayerPosition && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 10) {
                VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                if (VideoPlayerRewinder.this.framesRewinder != null) {
                    VideoPlayerRewinder.this.framesRewinder.seek(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition, Math.abs(fMax));
                } else {
                    VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                    videoPlayerRewinder4.seekTo(videoPlayerRewinder4.rewindBackSeekPlayerPosition, false);
                }
            }
            long j2 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom;
            float duration2 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition / VideoPlayerRewinder.this.getDuration();
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
            if (!videoPlayerRewinder8.rewinding || videoPlayerRewinder8.getRewindSpeed() >= 0.0f) {
                return;
            }
            AndroidUtilities.runOnUIThread(VideoPlayerRewinder.this.backSeek, 16L);
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
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getCurrentPosition();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getCurrentPosition();
    }

    public long getDuration() {
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getVideoDuration();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    private boolean isPlaying() {
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.isPlaying;
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return false;
        }
        return videoPlayer.isPlaying();
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
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            photoViewerWebView.seekTo(j);
        } else {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.seekTo(j, z);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j;
    }

    private void setMuted(boolean z) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setMute(z);
        }
    }

    private void setPaused(boolean z) {
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            if (z) {
                photoViewerWebView.pauseVideo();
                return;
            } else {
                photoViewerWebView.playVideo();
                return;
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            if (z) {
                videoPlayer.pause();
            } else {
                videoPlayer.play();
            }
        }
    }

    private void setPlaybackSpeed(float f) {
        PhotoViewerWebView photoViewerWebView = this.webView;
        if (photoViewerWebView != null) {
            photoViewerWebView.setPlaybackSpeed(f);
            return;
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.setPlaybackSpeed(f);
    }

    public void cancelRewind() {
        boolean z;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer == null && this.webView == null) {
                z = false;
            } else {
                if (this.rewindByBackSeek) {
                    if (videoPlayer == null || this.framesRewinder == null) {
                        seekTo(this.rewindBackSeekPlayerPosition, false);
                    } else {
                        videoPlayer.seekTo(this.rewindBackSeekPlayerPosition, false, new VideoPlayerRewinder$$ExternalSyntheticLambda0(this, 1));
                        z = true;
                    }
                    setPlaybackSpeed(this.playSpeed);
                } else {
                    seekTo(getCurrentPosition(), false);
                }
                z = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            SeekSpeedDrawable seekSpeedDrawable = this.seekSpeedDrawable;
            if (seekSpeedDrawable != null) {
                seekSpeedDrawable.setShown(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f = this.value;
        if (f < 0.4f) {
            f -= 1.9f;
        }
        return Utilities.clamp(f, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f) {
        return f < -1.5f ? f + 1.9f : f;
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void setX(float f) {
        this.value -= (this.x - f) / AndroidUtilities.dp(40.0f);
        this.x = f;
        SeekSpeedDrawable seekSpeedDrawable = this.seekSpeedDrawable;
        if (seekSpeedDrawable != null) {
            seekSpeedDrawable.setSpeed(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(PhotoViewerWebView photoViewerWebView, boolean z, float f, float f2, SeekSpeedDrawable seekSpeedDrawable) {
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
        this.webView = photoViewerWebView;
        this.seekSpeedDrawable = seekSpeedDrawable;
        this.playSpeed = f2;
        this.wasMuted = false;
        this.wasPaused = (photoViewerWebView == null || photoViewerWebView.isPlaying) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (seekSpeedDrawable != null) {
            seekSpeedDrawable.setSpeed(getRewindSpeed(), false);
            seekSpeedDrawable.setShown(true);
        }
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }

    public void updateRewindSpeed() {
        VideoPlayer videoPlayer;
        Uri uri;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z = true;
        if (rewindSpeed >= 0.0f) {
            if (this.rewindByBackSeek) {
                this.rewindByBackSeek = false;
                AndroidUtilities.cancelRunOnUIThread(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z = false;
                }
                setMuted(z);
                setPaused(false);
                VideoPlayer videoPlayer2 = this.videoPlayer;
                if (videoPlayer2 != null && this.framesRewinder != null) {
                    long j = this.rewindBackSeekPlayerPosition;
                    if (j >= 0) {
                        videoPlayer2.seekTo(j, false, new VideoPlayerRewinder$$ExternalSyntheticLambda0(this, 0));
                    }
                }
            }
            setPlaybackSpeed(this.playSpeed * rewindSpeed);
            return;
        }
        if (this.rewindByBackSeek) {
            return;
        }
        this.rewindByBackSeek = true;
        this.rewindBackSeekPlayerPosition = getCurrentPosition();
        this.rewindLastTime = System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (videoPlayer = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = videoPlayer.videoQualities;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((VideoPlayer.Quality) videoPlayer.videoQualities.get(size)).uris;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    VideoPlayer.VideoUri videoUri = (VideoPlayer.VideoUri) obj;
                    if (!videoUri.isCached()) {
                        videoUri.updateCached(true);
                    }
                    if (videoUri.isCached()) {
                        file = new File(videoUri.uri.getPath());
                    }
                }
            }
            uri = videoPlayer.videoUri;
            if (uri == null && "file".equalsIgnoreCase(uri.getScheme())) {
                file = new File(videoPlayer.videoUri.getPath());
            } else {
                file = null;
            }
        } else {
            uri = videoPlayer.videoUri;
            if (uri == null) {
                file = null;
            } else {
                file = null;
            }
        }
        videoFramesRewinder2.setup(file);
    }

    public void startRewind(VideoPlayer videoPlayer, boolean z, float f, float f2, SeekSpeedDrawable seekSpeedDrawable) {
        boolean z2;
        ExoPlayerImpl exoPlayerImpl;
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
        this.videoPlayer = videoPlayer;
        this.seekSpeedDrawable = seekSpeedDrawable;
        this.playSpeed = f2;
        if (videoPlayer == null || (exoPlayerImpl = videoPlayer.player) == null) {
            z2 = false;
        } else {
            exoPlayerImpl.verifyApplicationThread();
            if (exoPlayerImpl.volume == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.wasMuted = z2;
        this.wasPaused = (videoPlayer == null || videoPlayer.isPlaying()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (seekSpeedDrawable != null) {
            seekSpeedDrawable.setSpeed(getRewindSpeed(), false);
            seekSpeedDrawable.setShown(true);
        }
        updateRewindSpeed();
    }
}
