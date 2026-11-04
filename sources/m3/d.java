package m3;

import g9.f0;
import g9.i0;
import g9.s1;
import org.xmlpull.v1.XmlPullParser;
public abstract class d {
    public static final String[] f19063a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f19064b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f19065c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b8.ig a(java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: m3.d.a(java.lang.String):b8.ig");
    }

    public static s1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        f0 p10 = i0.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (g2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f10 = g2.a.f(xmlPullParser, concat3);
                String f11 = g2.a.f(xmlPullParser, concat4);
                String f12 = g2.a.f(xmlPullParser, concat5);
                String f13 = g2.a.f(xmlPullParser, concat6);
                if (f10 != null && f11 != null) {
                    long j11 = 0;
                    if (f12 != null) {
                        j10 = Long.parseLong(f12);
                    } else {
                        j10 = 0;
                    }
                    if (f13 != null) {
                        j11 = Long.parseLong(f13);
                    }
                    p10.c(new c(f10, f11, j10, j11));
                } else {
                    return s1.f12146e;
                }
            }
        } while (!g2.a.h(xmlPullParser, concat2));
        return p10.f();
    }
}
