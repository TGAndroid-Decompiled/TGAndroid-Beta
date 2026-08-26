package org.telegram.messenger.video;

import java.util.Comparator;

public final class Track$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;

    public Track$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return Track.lambda$prepare$0((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
            default:
                return VideoFramesRewinder.lambda$new$0((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    }
}
