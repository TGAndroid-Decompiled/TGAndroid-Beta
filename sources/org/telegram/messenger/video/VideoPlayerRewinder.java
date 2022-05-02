package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Components.VideoPlayer;

public class VideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private VideoPlayer videoPlayer;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() {
        @Override
        public void run() {
            if (VideoPlayerRewinder.this.videoPlayer != null) {
                long duration = VideoPlayerRewinder.this.videoPlayer.getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    VideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
                VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
                VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
                int i = videoPlayerRewinder.rewindCount;
                long j2 = j * (i == 1 ? 3L : i == 2 ? 6L : 12L);
                if (videoPlayerRewinder.rewindForward) {
                    VideoPlayerRewinder.access$314(VideoPlayerRewinder.this, j2);
                } else {
                    VideoPlayerRewinder.access$322(VideoPlayerRewinder.this, j2);
                }
                if (VideoPlayerRewinder.this.rewindBackSeekPlayerPosition < 0) {
                    VideoPlayerRewinder.this.rewindBackSeekPlayerPosition = 0L;
                } else if (VideoPlayerRewinder.this.rewindBackSeekPlayerPosition > duration) {
                    VideoPlayerRewinder.this.rewindBackSeekPlayerPosition = duration;
                }
                VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
                if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.videoPlayer != null && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 350) {
                    VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                    videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                    VideoPlayerRewinder.this.videoPlayer.seekTo(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition);
                }
                if (VideoPlayerRewinder.this.videoPlayer != null) {
                    long j3 = VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom;
                    float duration2 = ((float) VideoPlayerRewinder.this.rewindBackSeekPlayerPosition) / ((float) VideoPlayerRewinder.this.videoPlayer.getDuration());
                    VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                    videoPlayerRewinder4.updateRewindProgressUi(j3, duration2, videoPlayerRewinder4.rewindByBackSeek);
                }
                if (VideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || VideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                    VideoPlayerRewinder videoPlayerRewinder5 = VideoPlayerRewinder.this;
                    if (videoPlayerRewinder5.rewindByBackSeek && videoPlayerRewinder5.videoPlayer != null) {
                        VideoPlayerRewinder videoPlayerRewinder6 = VideoPlayerRewinder.this;
                        videoPlayerRewinder6.rewindLastUpdatePlayerTime = videoPlayerRewinder6.rewindLastTime;
                        VideoPlayerRewinder.this.videoPlayer.seekTo(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition);
                    }
                    VideoPlayerRewinder.this.cancelRewind();
                }
                VideoPlayerRewinder videoPlayerRewinder7 = VideoPlayerRewinder.this;
                if (videoPlayerRewinder7.rewindCount > 0) {
                    AndroidUtilities.runOnUIThread(videoPlayerRewinder7.backSeek, 16L);
                }
            }
        }
    };

    protected void onRewindCanceled() {
    }

    protected void onRewindStart(boolean z) {
    }

    protected void updateRewindProgressUi(long j, float f, boolean z) {
    }

    static long access$314(VideoPlayerRewinder videoPlayerRewinder, long j) {
        long j2 = videoPlayerRewinder.rewindBackSeekPlayerPosition + j;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    static long access$322(VideoPlayerRewinder videoPlayerRewinder, long j) {
        long j2 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    public void startRewind(VideoPlayer videoPlayer, boolean z, float f) {
        this.videoPlayer = videoPlayer;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void cancelRewind() {
        if (this.rewindCount != 0) {
            this.rewindCount = 0;
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                if (this.rewindByBackSeek) {
                    videoPlayer.seekTo(this.rewindBackSeekPlayerPosition);
                } else {
                    this.videoPlayer.seekTo(videoPlayer.getCurrentPosition());
                }
                this.videoPlayer.setPlaybackSpeed(this.playSpeed);
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    private void incrementRewindCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoPlayerRewinder.incrementRewindCount():void");
    }

    public void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    public float getVideoProgress() {
        return ((float) this.rewindBackSeekPlayerPosition) / ((float) this.videoPlayer.getDuration());
    }
}
