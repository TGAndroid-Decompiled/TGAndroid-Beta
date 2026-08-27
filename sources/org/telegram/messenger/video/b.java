package org.telegram.messenger.video;

import java.util.Comparator;

public final class b implements Comparator {

    public final int f21826a;

    public b(int i10) {
        this.f21826a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21826a) {
            case 0:
                return Track.lambda$prepare$0((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.lambda$new$0((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
