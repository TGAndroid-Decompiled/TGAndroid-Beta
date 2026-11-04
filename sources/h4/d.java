package h4;

import a1.g;
import b4.l;
import b4.m;
import b8.g1;
import b8.ke;
import b8.zb;
import ci.k5;
import d2.t0;
import g2.k;
import g2.n0;
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
    public static final Pattern f14202b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f14203c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f14204e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f14205f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern f14206n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final k5 f14207r = new k5(30.0f, 1, 1);
    public final XmlPullParserFactory f14208a;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f14208a = newInstance;
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
        Matcher matcher = f14206n.matcher(attributeValue);
        if (!matcher.matches()) {
            g2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            zb.b(parseInt, parseInt2, "Invalid cell resolution %s %s", z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            g2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) {
        Matcher matcher;
        String str2 = n0.f11873a;
        char c2 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            g2.a.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(g.o(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    fVar.f14224j = 3;
                    break;
                case 1:
                    fVar.f14224j = 2;
                    break;
                case 2:
                    fVar.f14224j = 1;
                    break;
                default:
                    throw new Exception(g.q("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f14225k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(g.q("Invalid expression for fontSize: '", str, "'."));
    }

    public static k5 e(XmlPullParser xmlPullParser) {
        int i3;
        float f10;
        String[] split;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i3 = Integer.parseInt(attributeValue);
        } else {
            i3 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = n0.f11873a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.e("frameRateMultiplier doesn't have 2 parts", z10);
            f10 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f10 = 1.0f;
        }
        k5 k5Var = f14207r;
        int i10 = k5Var.f5381b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = k5Var.f5382c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new k5(i3 * f10, i10, i11);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, d2.t0 r23, java.util.HashMap r24, java.util.HashMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: h4.d.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, d2.t0, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, k5 k5Var) {
        long j10;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f h7 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = i(attributeValue, k5Var);
                    break;
                case 2:
                    j12 = i(attributeValue, k5Var);
                    break;
                case 3:
                    j11 = i(attributeValue, k5Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = n0.f11873a;
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
                long j15 = cVar.f14194e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new c(xmlPullParser.getName(), null, j11, j10, h7, strArr, str2, str, cVar);
                }
            }
        }
        j10 = j12;
        return new c(xmlPullParser.getName(), null, j11, j10, h7, strArr, str2, str, cVar);
    }

    public static h4.f h(org.xmlpull.v1.XmlPullParser r18, h4.f r19) {
        throw new UnsupportedOperationException("Method not decompiled: h4.d.h(org.xmlpull.v1.XmlPullParser, h4.f):h4.f");
    }

    public static long i(java.lang.String r13, ci.k5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: h4.d.i(java.lang.String, ci.k5):long");
    }

    public static t0 j(XmlPullParser xmlPullParser) {
        String f10 = g2.a.f(xmlPullParser, "extent");
        if (f10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(f10);
        if (!matcher.matches()) {
            g2.a.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(f10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new t0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            g2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f10));
            return null;
        }
    }

    @Override
    public final b4.d B(int i3, int i10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f14208a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            t0 t0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i3, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            k5 k5Var = f14207r;
            int i11 = 0;
            int i12 = 15;
            ke keVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            k5Var = e(newPullParser);
                            i12 = c(newPullParser);
                            t0Var = j(newPullParser);
                        }
                        k5 k5Var2 = k5Var;
                        t0 t0Var2 = t0Var;
                        int i13 = i12;
                        if (!b(name)) {
                            g2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i13, t0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g7 = g(newPullParser, cVar, hashMap2, k5Var2);
                                    arrayDeque.push(g7);
                                    if (cVar != null) {
                                        if (cVar.f14201m == null) {
                                            cVar.f14201m = new ArrayList();
                                        }
                                        cVar.f14201m.add(g7);
                                    }
                                } catch (b4.f e10) {
                                    g2.a.m("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i12 = i13;
                            t0Var = t0Var2;
                            k5Var = k5Var2;
                        }
                        i11++;
                        i12 = i13;
                        t0Var = t0Var2;
                        k5Var = k5Var2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a10 = c.a(newPullParser.getText());
                        if (cVar.f14201m == null) {
                            cVar.f14201m = new ArrayList();
                        }
                        cVar.f14201m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            keVar = new ke(cVar2, hashMap, hashMap2, hashMap3);
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
            keVar.getClass();
            return keVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        g1.b(B(i3, i10, bArr), lVar, kVar);
    }

    @Override
    public final int Y() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
