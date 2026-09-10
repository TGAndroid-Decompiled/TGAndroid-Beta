package k3;

import e9.a1;
import e9.f0;
import e9.i0;
import org.xmlpull.v1.XmlPullParser;
public abstract class e {
    public static final String[] f12259a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f12260b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f12261c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static e6.n a(java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: k3.e.a(java.lang.String):e6.n");
    }

    public static a1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        f0 u10 = i0.u();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String k10 = e2.d.k(xmlPullParser, concat3);
                String k11 = e2.d.k(xmlPullParser, concat4);
                String k12 = e2.d.k(xmlPullParser, concat5);
                String k13 = e2.d.k(xmlPullParser, concat6);
                if (k10 != null && k11 != null) {
                    long j10 = 0;
                    if (k12 != null) {
                        j3 = Long.parseLong(k12);
                    } else {
                        j3 = 0;
                    }
                    if (k13 != null) {
                        j10 = Long.parseLong(k13);
                    }
                    u10.b(new c(k10, j3, j10, k11));
                } else {
                    return a1.e;
                }
            }
        } while (!e2.d.l(xmlPullParser, concat2));
        return u10.i();
    }
}
