package a4;

import android.media.MediaCodecInfo;
import java.util.List;
public abstract class p {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d);
        for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
            if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
