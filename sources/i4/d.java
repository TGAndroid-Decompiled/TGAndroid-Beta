package i4;

import a8.ja;
import a8.p0;
import a8.r7;
import a8.u7;
import c4.l;
import c4.m;
import di.b5;
import e2.r0;
import h2.j;
import h2.l0;
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
public final class d implements m {
    public static final Pattern f15703b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f15704c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f15705e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f15706f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern f15707n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b5 f15708r = new b5(30.0f, 1, 1);
    public final XmlPullParserFactory f15709a;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f15709a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f a(f fVar) {
        if (fVar == null) {
            return new f();
        }
        return fVar;
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
        Matcher matcher = f15707n.matcher(attributeValue);
        if (!matcher.matches()) {
            h2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            ja.b(parseInt, parseInt2, "Invalid cell resolution %s %s", z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            h2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) {
        Matcher matcher;
        String str2 = l0.f13471a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            h2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(p0.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
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
                    fVar.f15725j = 3;
                    break;
                case 1:
                    fVar.f15725j = 2;
                    break;
                case 2:
                    fVar.f15725j = 1;
                    break;
                default:
                    throw new Exception(p0.p("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f15726k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(p0.p("Invalid expression for fontSize: '", str, "'."));
    }

    public static b5 e(XmlPullParser xmlPullParser) {
        int i7;
        float f10;
        String[] split;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i7 = Integer.parseInt(attributeValue);
        } else {
            i7 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = l0.f13471a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.e("frameRateMultiplier doesn't have 2 parts", z10);
            f10 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f10 = 1.0f;
        }
        b5 b5Var = f15708r;
        int i10 = b5Var.f8253b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = b5Var.f8254c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b5(i7 * f10, i10, i11);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, e2.r0 r23, java.util.HashMap r24, java.util.HashMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: i4.d.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, e2.r0, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, b5 b5Var) {
        long j3;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f h7 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
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
                    j12 = i(attributeValue, b5Var);
                    break;
                case 2:
                    j11 = i(attributeValue, b5Var);
                    break;
                case 3:
                    j10 = i(attributeValue, b5Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = l0.f13471a;
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
            long j13 = cVar.d;
            if (j13 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L) {
                    j10 += j13;
                }
                if (j11 != -9223372036854775807L) {
                    j11 += j13;
                }
            }
        }
        if (j11 == -9223372036854775807L) {
            if (j12 != -9223372036854775807L) {
                j11 = j10 + j12;
            } else if (cVar != null) {
                long j14 = cVar.f15695e;
                if (j14 != -9223372036854775807L) {
                    j3 = j14;
                    return new c(xmlPullParser.getName(), null, j10, j3, h7, strArr, str2, str, cVar);
                }
            }
        }
        j3 = j11;
        return new c(xmlPullParser.getName(), null, j10, j3, h7, strArr, str2, str, cVar);
    }

    public static i4.f h(org.xmlpull.v1.XmlPullParser r18, i4.f r19) {
        throw new UnsupportedOperationException("Method not decompiled: i4.d.h(org.xmlpull.v1.XmlPullParser, i4.f):i4.f");
    }

    public static long i(java.lang.String r13, di.b5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: i4.d.i(java.lang.String, di.b5):long");
    }

    public static r0 j(XmlPullParser xmlPullParser) {
        String f10 = h2.a.f(xmlPullParser, "extent");
        if (f10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f10);
        if (!matcher.matches()) {
            h2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new r0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            h2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f10));
            return null;
        }
    }

    @Override
    public final void K(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        u7.b(x(i7, i10, bArr), lVar, jVar);
    }

    @Override
    public final int Q() {
        return 1;
    }

    @Override
    public final c4.d x(int i7, int i10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f15709a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            r0 r0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b5 b5Var = f15708r;
            int i11 = 0;
            int i12 = 15;
            r7 r7Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            b5Var = e(newPullParser);
                            i12 = c(newPullParser);
                            r0Var = j(newPullParser);
                        }
                        b5 b5Var2 = b5Var;
                        r0 r0Var2 = r0Var;
                        int i13 = i12;
                        if (!b(name)) {
                            h2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i13, r0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g10 = g(newPullParser, cVar, hashMap2, b5Var2);
                                    arrayDeque.push(g10);
                                    if (cVar != null) {
                                        if (cVar.f15702m == null) {
                                            cVar.f15702m = new ArrayList();
                                        }
                                        cVar.f15702m.add(g10);
                                    }
                                } catch (c4.f e10) {
                                    h2.a.m("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i12 = i13;
                            r0Var = r0Var2;
                            b5Var = b5Var2;
                        }
                        i11++;
                        i12 = i13;
                        r0Var = r0Var2;
                        b5Var = b5Var2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a10 = c.a(newPullParser.getText());
                        if (cVar.f15702m == null) {
                            cVar.f15702m = new ArrayList();
                        }
                        cVar.f15702m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            r7Var = new r7(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            r7Var.getClass();
            return r7Var;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override
    public final void reset() {
    }
}
