package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;
public final class b implements Comparator {
    public final int f18673a;

    public b(int i10) {
        this.f18673a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f18673a) {
            case 0:
                return Track.a((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.a((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
