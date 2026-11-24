package defpackage;

import org.xmlpull.v1.XmlPullParser;
public abstract class rdd {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static defpackage.hg2 a(java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.a(java.lang.String):hg2");
    }

    public static w59 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        jm5 p = mm5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = oye.a(xmlPullParser, concat3);
                String a3 = oye.a(xmlPullParser, concat4);
                String a4 = oye.a(xmlPullParser, concat5);
                String a5 = oye.a(xmlPullParser, concat6);
                if (a2 != null && a3 != null) {
                    long j2 = 0;
                    if (a4 != null) {
                        j = Long.parseLong(a4);
                    } else {
                        j = 0;
                    }
                    if (a5 != null) {
                        j2 = Long.parseLong(a5);
                    }
                    p.c(new df7(a2, a3, j, j2));
                } else {
                    return w59.e;
                }
            }
        } while (!oye.b(xmlPullParser, concat2));
        return p.f();
    }
}
