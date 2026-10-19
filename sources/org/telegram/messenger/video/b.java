package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;
public final class b implements Comparator {
    public final int f19773a;

    public b(int i10) {
        this.f19773a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f19773a) {
            case 0:
                return Track.a((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.a((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
