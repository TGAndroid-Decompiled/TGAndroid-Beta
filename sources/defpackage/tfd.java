package defpackage;

import org.xmlpull.v1.XmlPullParser;
public abstract class tfd {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static defpackage.vh2 a(java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfd.a(java.lang.String):vh2");
    }

    public static y79 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        jo5 p = mo5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = q0f.a(xmlPullParser, concat3);
                String a3 = q0f.a(xmlPullParser, concat4);
                String a4 = q0f.a(xmlPullParser, concat5);
                String a5 = q0f.a(xmlPullParser, concat6);
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
                    p.c(new gh7(a2, a3, j, j2));
                } else {
                    return y79.e;
                }
            }
        } while (!q0f.b(xmlPullParser, concat2));
        return p.f();
    }
}
