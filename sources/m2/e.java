package m2;

import android.net.Uri;
import android.text.TextUtils;
import b2.s0;
import e2.d0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.e3;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v7.r6;
public final class e extends DefaultHandler implements y2.p {
    public static final Pattern f13246b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern f13247c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f13248f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory f13249a;

    public e() {
        try {
            this.f13249a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j3, long j10, int i10, long j11) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = d0.f7188a;
            i11 = (int) ((((j11 - j3) + j10) - 1) / j10);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new q(j3, j10));
            j3 += j10;
        }
        return j3;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: m2.e.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j3;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
        int i10;
        int i11;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i11 = Integer.parseInt(attributeValue2);
        } else {
            i11 = 1;
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
        } while (!e2.d.l(xmlPullParser, "BaseURL"));
        if (str2 != null && e2.a.h(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return e9.q.p(new b(i10, i11, str2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String l4 = e2.a.l(bVar.f13228a, str2);
            if (attributeValue3 == null) {
                str = l4;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i10 = bVar.f13230c;
                i11 = bVar.d;
                str = bVar.f13229b;
            }
            arrayList2.add(new b(i10, i11, l4, str));
        }
        return arrayList2;
    }

    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        throw new UnsupportedOperationException("Method not decompiled: m2.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
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
        } while (!e2.d.l(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j3) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j3;
        }
        Matcher matcher = d0.e.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j10 = (long) ((d19 + d15) * 1000.0d);
            if (!isEmpty) {
                return -j10;
            }
            return j10;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f13246b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
        }
        return f7;
    }

    public static m2.c k(org.xmlpull.v1.XmlPullParser r169, android.net.Uri r170) {
        throw new UnsupportedOperationException("Method not decompiled: m2.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):m2.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j3 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j3) + 1;
                return new j(j3, j10, attributeValue);
            }
        } else {
            j3 = 0;
        }
        j10 = -1;
        return new j(j3, j10, attributeValue);
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
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (r6.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f13250a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j3;
        long j10;
        long j11;
        if (rVar != null) {
            j3 = rVar.f13282b;
        } else {
            j3 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j3 = Long.parseLong(attributeValue);
        }
        long j12 = j3;
        long j13 = 0;
        if (rVar != null) {
            j10 = rVar.f13283c;
        } else {
            j10 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j10 = Long.parseLong(attributeValue2);
        }
        long j14 = j10;
        if (rVar != null) {
            j11 = rVar.d;
        } else {
            j11 = 0;
        }
        if (rVar != null) {
            j13 = rVar.e;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j11 = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - j11) + 1;
        }
        long j15 = j13;
        long j16 = j11;
        if (rVar != null) {
            jVar = rVar.f13281a;
        }
        while (true) {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (e2.d.l(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j12, j14, j16, j15);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19 = 1;
        if (oVar != null) {
            j14 = oVar.f13282b;
        } else {
            j14 = 1;
        }
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j20 = j14;
        if (oVar != null) {
            j15 = oVar.f13283c;
        } else {
            j15 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j21 = j15;
        if (oVar != null) {
            j16 = oVar.e;
        } else {
            j16 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j16 = Long.parseLong(attributeValue3);
        }
        long j22 = j16;
        if (oVar != null) {
            j19 = oVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j19 = Long.parseLong(attributeValue4);
        }
        long j23 = j19;
        if (j12 == -9223372036854775807L) {
            j17 = j11;
        } else {
            j17 = j12;
        }
        if (j17 == Long.MAX_VALUE) {
            j18 = -9223372036854775807L;
        } else {
            j18 = j17;
        }
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.d.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j20, j10);
            } else if (e2.d.m(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f13281a;
            }
            if (list2 == null) {
                list2 = oVar.f13272f;
            }
            if (list == null) {
                list = oVar.f13275j;
            }
        }
        return new o(jVar, j20, j21, j23, j22, list2, j18, list, d0.Q(j13), d0.Q(j3));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        e3 e3Var;
        e3 e3Var2;
        long j20 = 1;
        if (pVar != null) {
            j14 = pVar.f13282b;
        } else {
            j14 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j21 = j14;
        if (pVar != null) {
            j15 = pVar.f13283c;
        } else {
            j15 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j22 = j15;
        if (pVar != null) {
            j16 = pVar.e;
        } else {
            j16 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j16 = Long.parseLong(attributeValue3);
        }
        long j23 = j16;
        if (pVar != null) {
            j20 = pVar.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j24 = j20;
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                f fVar = (f) list.get(i10);
                if (r6.a("http://dashif.org/guidelines/last-segment-number", fVar.f13250a)) {
                    j17 = Long.parseLong(fVar.f13251b);
                    break;
                }
                i10++;
            } else {
                j17 = -1;
                break;
            }
        }
        long j25 = j17;
        if (j12 == -9223372036854775807L) {
            j18 = j11;
        } else {
            j18 = j12;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        if (pVar != null) {
            e3Var = pVar.f13277k;
        } else {
            e3Var = null;
        }
        e3 s10 = s(xmlPullParser, "media", e3Var);
        if (pVar != null) {
            e3Var2 = pVar.f13276j;
        } else {
            e3Var2 = null;
        }
        e3 s11 = s(xmlPullParser, "initialization", e3Var2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (e2.d.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j21, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f13281a;
            }
            if (list2 == null) {
                list2 = pVar.f13272f;
            }
        }
        return new p(jVar, j21, j22, j24, j25, j23, list2, j19, s11, s10, d0.Q(j13), d0.Q(j3));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j3, long j10) {
        long parseLong;
        long j11;
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (e2.d.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z10) {
                    int i11 = i10;
                    j11 = parseLong;
                    j12 = a(arrayList, j12, j13, i11, j11);
                } else {
                    j11 = parseLong;
                }
                if (j11 != -9223372036854775807L) {
                    j12 = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j13 = -9223372036854775807L;
                } else {
                    j13 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                if (attributeValue3 == null) {
                    i10 = 0;
                } else {
                    i10 = Integer.parseInt(attributeValue3);
                }
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!e2.d.l(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = d0.f7188a;
            a(arrayList, j12, j13, i10, d0.Y(j10, j3, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static e3 s(XmlPullParser xmlPullParser, String str, e3 e3Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add("");
            int i10 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                char c10 = 65535;
                if (indexOf == -1) {
                    int size = arrayList2.size();
                    arrayList.set(size, ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10));
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    int size2 = arrayList2.size();
                    arrayList.set(size2, ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10, indexOf));
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    int size3 = arrayList2.size();
                    arrayList.set(size3, ((String) arrayList.get(arrayList2.size())) + "$");
                    i10 += 2;
                } else {
                    arrayList3.add("");
                    int i11 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i11);
                    String substring = attributeValue.substring(i11, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
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
                                arrayList2.add(2);
                                break;
                            case 1:
                                arrayList2.add(4);
                                break;
                            case 2:
                                arrayList2.add(3);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add("");
                    i10 = indexOf2 + 1;
                }
            }
            return new e3(arrayList, arrayList2, arrayList3, 1);
        }
        return e3Var;
    }

    @Override
    public final Object l2(Uri uri, g2.k kVar) {
        try {
            XmlPullParser newPullParser = this.f13249a.newPullParser();
            newPullParser.setInput(kVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw s0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw s0.b(null, e7);
        }
    }
}
