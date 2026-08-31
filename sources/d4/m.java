package d4;

import android.media.MediaCodecInfo;
import h5.d0;
import java.util.List;
public abstract class m {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = d0.f7238b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = d0.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d);
                    for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                        if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
