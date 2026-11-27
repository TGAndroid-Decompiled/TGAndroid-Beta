package defpackage;

import org.xmlpull.v1.XmlPullParser;
public abstract class jid {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static defpackage.zg2 a(java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jid.a(java.lang.String):zg2");
    }

    public static j99 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        mo5 p = po5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h3f.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = h3f.a(xmlPullParser, concat3);
                String a3 = h3f.a(xmlPullParser, concat4);
                String a4 = h3f.a(xmlPullParser, concat5);
                String a5 = h3f.a(xmlPullParser, concat6);
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
                    p.c(new nh7(a2, a3, j, j2));
                } else {
                    return j99.e;
                }
            }
        } while (!h3f.b(xmlPullParser, concat2));
        return p.f();
    }
}
