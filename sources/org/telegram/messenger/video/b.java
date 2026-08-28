package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;
public final class b implements Comparator {
    public final int f21787a;

    public b(int i9) {
        this.f21787a = i9;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21787a) {
            case 0:
                return Track.a((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.a((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
