package n4;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.s0;
import d5.f0;
import g7.b0;
import h3.t1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
public final class e extends DefaultHandler implements s0 {
    public static final Pattern f18407b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern f18408c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] f18409e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory f18410a;

    public e() {
        try {
            this.f18410a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i9, long j12) {
        int i10;
        if (i9 >= 0) {
            i10 = i9 + 1;
        } else {
            int i11 = f0.f4349a;
            i10 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i9 = 1;
            while (i9 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i9++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i9--;
                }
            }
        }
    }

    public static int c(org.xmlpull.v1.XmlPullParser r9) {
        throw new UnsupportedOperationException("Method not decompiled: n4.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
        int i9;
        int i10;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i9 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i9 = 1;
        } else {
            i9 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i10 = Integer.parseInt(attributeValue2);
        } else {
            i10 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "BaseURL"));
        if (str2 != null && d5.a.u(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return o8.l.k(new b(i9, i10, str2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String G = d5.a.G(bVar.f18387a, str2);
            if (attributeValue3 == null) {
                str = G;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i9 = bVar.f18389c;
                i10 = bVar.d;
                str = bVar.f18388b;
            }
            arrayList2.add(new b(i9, i10, G, str));
        }
        return arrayList2;
    }

    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r13) {
        throw new UnsupportedOperationException("Method not decompiled: n4.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
            return -1;
        }
        return -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!d5.a.y(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = f0.h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d14 = 0.0d;
            if (group != null) {
                d9 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d9 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d10 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d10 = 0.0d;
            }
            double d15 = d9 + d10;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d11 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d15 + d11;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d12 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d13 = Double.parseDouble(group5) * 60.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d14 = Double.parseDouble(group6);
            }
            long j11 = (long) ((d18 + d14) * 1000.0d);
            if (!isEmpty) {
                return -j11;
            }
            return j11;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f18407b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
        }
        return f10;
    }

    public static n4.c k(org.xmlpull.v1.XmlPullParser r156, android.net.Uri r157) {
        throw new UnsupportedOperationException("Method not decompiled: n4.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):n4.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new j(j10, j11, attributeValue);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new j(j10, j11, attributeValue);
    }

    public static int m(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals("forced_subtitle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals("forced-subtitle")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals("commentary")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals("emergency")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 3:
                case 5:
                    return 128;
                case 1:
                    return 512;
                case 2:
                    return 2048;
                case 4:
                    return 2;
                case 6:
                    return 16;
                case 7:
                    return 1;
                case '\b':
                    return 256;
                case '\t':
                    return 64;
                case '\n':
                    return 8;
                case 11:
                    return 32;
                case '\f':
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (b0.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f18411a)) {
                i9 = 16384;
            }
        }
        return i9;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j10;
        long j11;
        long j12;
        if (rVar != null) {
            j10 = rVar.f18447b;
        } else {
            j10 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j13 = j10;
        long j14 = 0;
        if (rVar != null) {
            j11 = rVar.f18448c;
        } else {
            j11 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j15 = j11;
        if (rVar != null) {
            j12 = rVar.d;
        } else {
            j12 = 0;
        }
        if (rVar != null) {
            j14 = rVar.f18445e;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j12 = Long.parseLong(split[0]);
            j14 = (Long.parseLong(split[1]) - j12) + 1;
        }
        long j16 = j14;
        long j17 = j12;
        if (rVar != null) {
            jVar = rVar.f18446a;
        }
        while (true) {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (d5.a.y(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j13, j15, j17, j16);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20 = 1;
        if (oVar != null) {
            j15 = oVar.f18447b;
        } else {
            j15 = 1;
        }
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j21 = j15;
        if (oVar != null) {
            j16 = oVar.f18448c;
        } else {
            j16 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j22 = j16;
        if (oVar != null) {
            j17 = oVar.f18435e;
        } else {
            j17 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j17 = Long.parseLong(attributeValue3);
        }
        long j23 = j17;
        if (oVar != null) {
            j20 = oVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j24 = j20;
        if (j13 == -9223372036854775807L) {
            j18 = j12;
        } else {
            j18 = j13;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (d5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j21, j11);
            } else if (d5.a.z(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f18446a;
            }
            if (list2 == null) {
                list2 = oVar.f18436f;
            }
            if (list == null) {
                list = oVar.f18439j;
            }
        }
        return new o(jVar, j21, j22, j24, j23, list2, j19, list, f0.H(j14), f0.H(j10));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        t5.l lVar;
        t5.l lVar2;
        long j21 = 1;
        if (pVar != null) {
            j15 = pVar.f18447b;
        } else {
            j15 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j22 = j15;
        if (pVar != null) {
            j16 = pVar.f18448c;
        } else {
            j16 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j23 = j16;
        if (pVar != null) {
            j17 = pVar.f18435e;
        } else {
            j17 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j17 = Long.parseLong(attributeValue3);
        }
        long j24 = j17;
        if (pVar != null) {
            j21 = pVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j25 = j21;
        int i9 = 0;
        while (true) {
            if (i9 < list.size()) {
                f fVar = (f) list.get(i9);
                if (b0.a("http://dashif.org/guidelines/last-segment-number", fVar.f18411a)) {
                    j18 = Long.parseLong(fVar.f18412b);
                    break;
                }
                i9++;
            } else {
                j18 = -1;
                break;
            }
        }
        long j26 = j18;
        if (j13 == -9223372036854775807L) {
            j19 = j12;
        } else {
            j19 = j13;
        }
        if (j19 == Long.MAX_VALUE) {
            j20 = -9223372036854775807L;
        } else {
            j20 = j19;
        }
        if (pVar != null) {
            lVar = pVar.f18441k;
        } else {
            lVar = null;
        }
        t5.l s10 = s(xmlPullParser, "media", lVar);
        if (pVar != null) {
            lVar2 = pVar.f18440j;
        } else {
            lVar2 = null;
        }
        t5.l s11 = s(xmlPullParser, "initialization", lVar2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (d5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j22, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f18446a;
            }
            if (list2 == null) {
                list2 = pVar.f18436f;
            }
        }
        return new p(jVar, j22, j23, j25, j26, j24, list2, j20, s11, s10, f0.H(j14), f0.H(j10));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j10, long j11) {
        long parseLong;
        long j12;
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        long j14 = -9223372036854775807L;
        boolean z10 = false;
        int i9 = 0;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z10) {
                    int i10 = i9;
                    j12 = parseLong;
                    j13 = a(arrayList, j13, j14, i10, j12);
                } else {
                    j12 = parseLong;
                }
                if (j12 != -9223372036854775807L) {
                    j13 = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j14 = -9223372036854775807L;
                } else {
                    j14 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                if (attributeValue3 == null) {
                    i9 = 0;
                } else {
                    i9 = Integer.parseInt(attributeValue3);
                }
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, j13, j14, i9, f0.O(j11, j10, 1000L));
            return arrayList;
        }
        return arrayList;
    }

    public static t5.l s(XmlPullParser xmlPullParser, String str, t5.l lVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ?? r14 = new String[5];
            ?? r02 = new int[4];
            ?? r12 = new String[4];
            r14[0] = "";
            int i9 = 0;
            int i10 = 0;
            while (i9 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i9);
                char c10 = 65535;
                if (indexOf == -1) {
                    r14[i10] = r14[i10] + attributeValue.substring(i9);
                    i9 = attributeValue.length();
                } else if (indexOf != i9) {
                    r14[i10] = r14[i10] + attributeValue.substring(i9, indexOf);
                    i9 = indexOf;
                } else if (attributeValue.startsWith("$$", i9)) {
                    r14[i10] = aa.d.r(new StringBuilder(), r14[i10], "$");
                    i9 += 2;
                } else {
                    int i11 = i9 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i11);
                    String substring = attributeValue.substring(i11, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        r02[i10] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                r02[i10] = 2;
                                break;
                            case 1:
                                r02[i10] = 4;
                                break;
                            case 2:
                                r02[i10] = 3;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        r12[i10] = str2;
                    }
                    i10++;
                    r14[i10] = "";
                    i9 = indexOf2 + 1;
                }
            }
            return new t5.l((Serializable) r14, (Serializable) r02, (Serializable) r12, i10);
        }
        return lVar;
    }

    @Override
    public final Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        try {
            XmlPullParser newPullParser = this.f18410a.newPullParser();
            newPullParser.setInput(oVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw t1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw t1.b(null, e10);
        }
    }
}
