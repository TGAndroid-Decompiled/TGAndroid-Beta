package k3;

import f9.f0;
import f9.i0;
import f9.s1;
import org.xmlpull.v1.XmlPullParser;
public abstract class d {
    public static final String[] f16358a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f16359b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f16360c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static a8.lg a(java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: k3.d.a(java.lang.String):a8.lg");
    }

    public static s1 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        f0 t10 = i0.t();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (e2.a.i(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String f7 = e2.a.f(xmlPullParser, concat3);
                String f10 = e2.a.f(xmlPullParser, concat4);
                String f11 = e2.a.f(xmlPullParser, concat5);
                String f12 = e2.a.f(xmlPullParser, concat6);
                if (f7 != null && f10 != null) {
                    long j11 = 0;
                    if (f11 != null) {
                        j10 = Long.parseLong(f11);
                    } else {
                        j10 = 0;
                    }
                    if (f12 != null) {
                        j11 = Long.parseLong(f12);
                    }
                    t10.c(new c(f7, j10, j11, f10));
                } else {
                    return s1.e;
                }
            }
        } while (!e2.a.h(xmlPullParser, concat2));
        return t10.f();
    }
}
