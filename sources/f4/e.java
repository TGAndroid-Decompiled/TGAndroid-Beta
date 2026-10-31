package f4;

import e2.j;
import e2.l0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v7.t6;
import w7.m9;
import z3.l;
import z3.m;
public final class e implements m {
    public static final Pattern f6826b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f6827c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f6828f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern f6829n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d f6830r = new d(30.0f, 1, 1);
    public final XmlPullParserFactory f6831a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f6831a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static g a(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean b(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f6829n.matcher(attributeValue);
        if (!matcher.matches()) {
            e2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            t6.b(parseInt, parseInt2, "Invalid cell resolution %s %s", z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) {
        Matcher matcher;
        String str2 = l0.f6165a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            e2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(a1.g.p(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.f6845j = 3;
                    break;
                case 1:
                    gVar.f6845j = 2;
                    break;
                case 2:
                    gVar.f6845j = 1;
                    break;
                default:
                    throw new Exception(a1.g.n("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f6846k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(a1.g.n("Invalid expression for fontSize: '", str, "'."));
    }

    public static d e(XmlPullParser xmlPullParser) {
        int i10;
        float f7;
        String[] split;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = l0.f6165a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.e("frameRateMultiplier doesn't have 2 parts", z10);
            f7 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f7 = 1.0f;
        }
        d dVar = f6830r;
        int i11 = dVar.f6823a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = dVar.f6824b;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f7, i11, i12);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, ac.g r23, java.util.HashMap r24, java.util.HashMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, ac.g, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g h10 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = i(attributeValue, dVar);
                    break;
                case 2:
                    j12 = i(attributeValue, dVar);
                    break;
                case 3:
                    j11 = i(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = l0.f6165a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j14 = cVar.d;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        }
        if (j12 == -9223372036854775807L) {
            if (j13 != -9223372036854775807L) {
                j12 = j11 + j13;
            } else if (cVar != null) {
                long j15 = cVar.e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new c(xmlPullParser.getName(), null, j11, j10, h10, strArr, str2, str, cVar);
                }
            }
        }
        j10 = j12;
        return new c(xmlPullParser.getName(), null, j11, j10, h10, strArr, str2, str, cVar);
    }

    public static f4.g h(org.xmlpull.v1.XmlPullParser r18, f4.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.h(org.xmlpull.v1.XmlPullParser, f4.g):f4.g");
    }

    public static long i(java.lang.String r13, f4.d r14) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.i(java.lang.String, f4.d):long");
    }

    public static ac.g j(XmlPullParser xmlPullParser) {
        String f7 = e2.a.f(xmlPullParser, "extent");
        if (f7 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f7);
        if (!matcher.matches()) {
            e2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f7));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ac.g(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f7));
            return null;
        }
    }

    @Override
    public final z3.d l(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f6831a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            ac.g gVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = f6830r;
            int i12 = 0;
            int i13 = 15;
            bh.d dVar2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar = e(newPullParser);
                            i13 = c(newPullParser);
                            gVar = j(newPullParser);
                        }
                        d dVar3 = dVar;
                        ac.g gVar2 = gVar;
                        int i14 = i13;
                        if (!b(name)) {
                            e2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i14, gVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g10 = g(newPullParser, cVar, hashMap2, dVar3);
                                    arrayDeque.push(g10);
                                    if (cVar != null) {
                                        if (cVar.f6822m == null) {
                                            cVar.f6822m = new ArrayList();
                                        }
                                        cVar.f6822m.add(g10);
                                    }
                                } catch (z3.f e7) {
                                    e2.a.m("TtmlParser", "Suppressing parser error", e7);
                                }
                            }
                            i13 = i14;
                            gVar = gVar2;
                            dVar = dVar3;
                        }
                        i12++;
                        i13 = i14;
                        gVar = gVar2;
                        dVar = dVar3;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a2 = c.a(newPullParser.getText());
                        if (cVar.f6822m == null) {
                            cVar.f6822m = new ArrayList();
                        }
                        cVar.f6822m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            dVar2 = new bh.d(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            dVar2.getClass();
            return dVar2;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }

    @Override
    public final int o() {
        return 1;
    }

    @Override
    public final void z(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        m9.b(l(i10, i11, bArr), lVar, jVar);
    }

    @Override
    public final void reset() {
    }
}
