package n3;

import h9.f0;
import h9.i0;
import h9.t1;
import org.xmlpull.v1.XmlPullParser;
public abstract class d {
    public static final String[] f20372a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f20373b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f20374c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static a8.ua a(java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: n3.d.a(java.lang.String):a8.ua");
    }

    public static t1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        f0 p10 = i0.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f10 = h2.a.f(xmlPullParser, concat3);
                String f11 = h2.a.f(xmlPullParser, concat4);
                String f12 = h2.a.f(xmlPullParser, concat5);
                String f13 = h2.a.f(xmlPullParser, concat6);
                if (f10 != null && f11 != null) {
                    long j10 = 0;
                    if (f12 != null) {
                        j3 = Long.parseLong(f12);
                    } else {
                        j3 = 0;
                    }
                    if (f13 != null) {
                        j10 = Long.parseLong(f13);
                    }
                    p10.c(new c(f10, f11, j3, j10));
                } else {
                    return t1.f14397e;
                }
            }
        } while (!h2.a.h(xmlPullParser, concat2));
        return p10.f();
    }
}
