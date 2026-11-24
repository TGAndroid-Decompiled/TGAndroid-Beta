package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
public final class j53 extends DefaultHandler implements bv7 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public j53() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            fyb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = g8c.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new rv9(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j53.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        int i;
        int i2;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else if (z) {
            i = 1;
        } else {
            i = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        } else {
            i2 = 1;
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
        } while (!oye.b(xmlPullParser, "BaseURL"));
        if (str2 != null && jxe.a(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return tne.a(new wg0(i, i2, str2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            wg0 wg0Var = (wg0) arrayList.get(i3);
            String c2 = jxe.c(wg0Var.a, str2);
            if (attributeValue3 == null) {
                str = c2;
            } else {
                str = attributeValue3;
            }
            if (z) {
                i = wg0Var.c;
                i2 = wg0Var.d;
                str = wg0Var.b;
            }
            arrayList2.add(new wg0(i, i2, c2, str));
        }
        return arrayList2;
    }

    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j53.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
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

    public static zd3 h(XmlPullParser xmlPullParser, String str) {
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
        } while (!oye.b(xmlPullParser, str));
        return new zd3(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = g8c.e.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d7 = 0.0d;
            if (group != null) {
                d2 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d2 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d3 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d3 = 0.0d;
            }
            double d8 = d2 + d3;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d4 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d4 = 0.0d;
            }
            double d9 = d8 + d4;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d5 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d5 = 0.0d;
            }
            double d10 = d9 + d5;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d6 = Double.parseDouble(group5) * 60.0d;
            } else {
                d6 = 0.0d;
            }
            double d11 = d10 + d6;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d7 = Double.parseDouble(group6);
            }
            long j2 = (long) ((d11 + d7) * 1000.0d);
            if (!isEmpty) {
                return -j2;
            }
            return j2;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
        }
        return f2;
    }

    public static defpackage.h53 k(org.xmlpull.v1.XmlPullParser r160, android.net.Uri r161) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j53.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):h53");
    }

    public static az8 l(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new az8(j, attributeValue, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new az8(j, attributeValue, j2);
    }

    public static int m(String str) {
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals("forced_subtitle")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals("forced-subtitle")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals("commentary")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals("emergency")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        c2 = '\f';
                        break;
                    }
                    break;
            }
            switch (c2) {
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
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (smd.a("http://dashif.org/guidelines/trickmode", ((zd3) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static sv9 o(XmlPullParser xmlPullParser, sv9 sv9Var) {
        long j;
        long j2;
        long j3;
        if (sv9Var != null) {
            j = sv9Var.b;
        } else {
            j = 1;
        }
        az8 az8Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j4 = j;
        long j5 = 0;
        if (sv9Var != null) {
            j2 = sv9Var.c;
        } else {
            j2 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j2 = Long.parseLong(attributeValue2);
        }
        long j6 = j2;
        if (sv9Var != null) {
            j3 = sv9Var.d;
            j5 = sv9Var.e;
        } else {
            j3 = 0;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j3 = Long.parseLong(split[0]);
            j5 = (Long.parseLong(split[1]) - j3) + 1;
        }
        long j7 = j5;
        long j8 = j3;
        if (sv9Var != null) {
            az8Var = sv9Var.a;
        }
        while (true) {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            az8 az8Var2 = az8Var;
            if (oye.b(xmlPullParser, "SegmentBase")) {
                return new sv9(az8Var2, j4, j6, j8, j7);
            }
            az8Var = az8Var2;
        }
    }

    public static pv9 p(XmlPullParser xmlPullParser, pv9 pv9Var, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11 = 1;
        if (pv9Var != null) {
            j6 = pv9Var.b;
        } else {
            j6 = 1;
        }
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j12 = j6;
        if (pv9Var != null) {
            j7 = pv9Var.c;
        } else {
            j7 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j7 = Long.parseLong(attributeValue2);
        }
        long j13 = j7;
        if (pv9Var != null) {
            j8 = pv9Var.e;
        } else {
            j8 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j8 = Long.parseLong(attributeValue3);
        }
        long j14 = j8;
        if (pv9Var != null) {
            j11 = pv9Var.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j11 = Long.parseLong(attributeValue4);
        }
        long j15 = j11;
        if (j4 == -9223372036854775807L) {
            j9 = j3;
        } else {
            j9 = j4;
        }
        if (j9 == Long.MAX_VALUE) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j9;
        }
        az8 az8Var = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else if (oye.c(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = r(xmlPullParser, j12, j2);
            } else if (oye.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentList"));
        if (pv9Var != null) {
            if (az8Var == null) {
                az8Var = pv9Var.a;
            }
            if (arrayList2 == null) {
                arrayList2 = pv9Var.f;
            }
            if (arrayList == null) {
                arrayList = pv9Var.j;
            }
        }
        return new pv9(az8Var, j12, j13, j15, j14, arrayList2, j10, arrayList, g8c.T(j5), g8c.T(j));
    }

    public static qv9 q(XmlPullParser xmlPullParser, qv9 qv9Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        vk9 vk9Var;
        vk9 vk9Var2;
        long j12 = 1;
        if (qv9Var != null) {
            j6 = qv9Var.b;
        } else {
            j6 = 1;
        }
        az8 az8Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j13 = j6;
        if (qv9Var != null) {
            j7 = qv9Var.c;
        } else {
            j7 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j7 = Long.parseLong(attributeValue2);
        }
        long j14 = j7;
        if (qv9Var != null) {
            j8 = qv9Var.e;
        } else {
            j8 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j8 = Long.parseLong(attributeValue3);
        }
        long j15 = j8;
        if (qv9Var != null) {
            j12 = qv9Var.d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j16 = j12;
        int i = 0;
        while (true) {
            if (i < list.size()) {
                zd3 zd3Var = (zd3) list.get(i);
                if (smd.a("http://dashif.org/guidelines/last-segment-number", zd3Var.a)) {
                    j9 = Long.parseLong(zd3Var.b);
                    break;
                }
                i++;
            } else {
                j9 = -1;
                break;
            }
        }
        long j17 = j9;
        if (j4 == -9223372036854775807L) {
            j10 = j3;
        } else {
            j10 = j4;
        }
        if (j10 == Long.MAX_VALUE) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        if (qv9Var != null) {
            vk9Var = qv9Var.k;
        } else {
            vk9Var = null;
        }
        vk9 s = s(xmlPullParser, "media", vk9Var);
        if (qv9Var != null) {
            vk9Var2 = qv9Var.j;
        } else {
            vk9Var2 = null;
        }
        vk9 s2 = s(xmlPullParser, "initialization", vk9Var2);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "Initialization")) {
                az8Var = l(xmlPullParser, "sourceURL", "range");
            } else if (oye.c(xmlPullParser, "SegmentTimeline")) {
                arrayList = r(xmlPullParser, j13, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentTemplate"));
        if (qv9Var != null) {
            if (az8Var == null) {
                az8Var = qv9Var.a;
            }
            if (arrayList == null) {
                arrayList = qv9Var.f;
            }
        }
        return new qv9(az8Var, j13, j14, j16, j17, j15, arrayList, j11, s2, s, g8c.T(j5), g8c.T(j));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j, long j2) {
        long parseLong;
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != -9223372036854775807L) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j5 = -9223372036854775807L;
                } else {
                    j5 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                if (attributeValue3 == null) {
                    i = 0;
                } else {
                    i = Integer.parseInt(attributeValue3);
                }
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!oye.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = g8c.a;
            a(arrayList, j4, j5, i, g8c.b0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static vk9 s(XmlPullParser xmlPullParser, String str, vk9 vk9Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add("");
            int i = 0;
            while (i < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i);
                char c2 = 65535;
                if (indexOf == -1) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                    i = attributeValue.length();
                } else if (indexOf != i) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                    i = indexOf;
                } else if (attributeValue.startsWith("$$", i)) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                    i += 2;
                } else {
                    arrayList3.add("");
                    int i2 = i + 1;
                    int indexOf2 = attributeValue.indexOf("$", i2);
                    String substring = attributeValue.substring(i2, indexOf2);
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
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
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
                                w26.j("Invalid template: ".concat(attributeValue));
                                return null;
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add("");
                    i = indexOf2 + 1;
                }
            }
            return new vk9(arrayList, arrayList2, arrayList3, (byte) 11);
        }
        return vk9Var;
    }

    @Override
    public final Object v(Uri uri, s63 s63Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(s63Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw av7.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw av7.b(null, e2);
        }
    }
}
