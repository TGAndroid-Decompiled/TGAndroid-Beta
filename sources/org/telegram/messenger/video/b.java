package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;
public final class b implements Comparator {
    public final int f19490a;

    public b(int i10) {
        this.f19490a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f19490a) {
            case 0:
                return Track.a((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.a((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
