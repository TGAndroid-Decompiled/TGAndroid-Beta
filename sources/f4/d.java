package f4;

import a1.g;
import a8.me;
import a8.yb;
import b2.v0;
import bi.c6;
import e2.j;
import e2.n0;
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
import w7.n5;
import z3.l;
import z3.m;
public final class d implements m {
    public static final Pattern f10150b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f10151c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f10152f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern f10153n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final c6 f10154r = new c6(30.0f, 1, 1);
    public final XmlPullParserFactory f10155a;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f10155a = newInstance;
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
        Matcher matcher = f10153n.matcher(attributeValue);
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
            yb.d("Invalid cell resolution %s %s", parseInt, parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) {
        Matcher matcher;
        String str2 = n0.f9691a;
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
            throw new Exception(g.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
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
                    fVar.f10169j = 3;
                    break;
                case 1:
                    fVar.f10169j = 2;
                    break;
                case 2:
                    fVar.f10169j = 1;
                    break;
                default:
                    throw new Exception(g.p("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f10170k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(g.p("Invalid expression for fontSize: '", str, "'."));
    }

    public static c6 e(XmlPullParser xmlPullParser) {
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
            String str = n0.f9691a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.f("frameRateMultiplier doesn't have 2 parts", z10);
            f7 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f7 = 1.0f;
        }
        c6 c6Var = f10154r;
        int i11 = c6Var.f4431b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = c6Var.f4432c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new c6(i10 * f7, i11, i12);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, b2.v0 r23, java.util.HashMap r24, java.util.HashMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: f4.d.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, b2.v0, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, c6 c6Var) {
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f h10 = h(xmlPullParser, null);
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
                    j13 = i(attributeValue, c6Var);
                    break;
                case 2:
                    j12 = i(attributeValue, c6Var);
                    break;
                case 3:
                    j11 = i(attributeValue, c6Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = n0.f9691a;
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

    public static f4.f h(org.xmlpull.v1.XmlPullParser r18, f4.f r19) {
        throw new UnsupportedOperationException("Method not decompiled: f4.d.h(org.xmlpull.v1.XmlPullParser, f4.f):f4.f");
    }

    public static long i(java.lang.String r13, bi.c6 r14) {
        throw new UnsupportedOperationException("Method not decompiled: f4.d.i(java.lang.String, bi.c6):long");
    }

    public static v0 k(XmlPullParser xmlPullParser) {
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
            return new v0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            e2.a.l("TtmlParser", "Ignoring malformed tts extent: ".concat(f7));
            return null;
        }
    }

    @Override
    public final void G(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        n5.b(j(i10, i11, bArr), lVar, jVar);
    }

    @Override
    public final z3.d j(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f10155a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            v0 v0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            c6 c6Var = f10154r;
            int i12 = 0;
            int i13 = 15;
            me meVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c6Var = e(newPullParser);
                            i13 = c(newPullParser);
                            v0Var = k(newPullParser);
                        }
                        c6 c6Var2 = c6Var;
                        v0 v0Var2 = v0Var;
                        int i14 = i13;
                        if (!b(name)) {
                            e2.a.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i14, v0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g7 = g(newPullParser, cVar, hashMap2, c6Var2);
                                    arrayDeque.push(g7);
                                    if (cVar != null) {
                                        if (cVar.f10149m == null) {
                                            cVar.f10149m = new ArrayList();
                                        }
                                        cVar.f10149m.add(g7);
                                    }
                                } catch (z3.f e10) {
                                    e2.a.m("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i13 = i14;
                            v0Var = v0Var2;
                            c6Var = c6Var2;
                        }
                        i12++;
                        i13 = i14;
                        v0Var = v0Var2;
                        c6Var = c6Var2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a2 = c.a(newPullParser.getText());
                        if (cVar.f10149m == null) {
                            cVar.f10149m = new ArrayList();
                        }
                        cVar.f10149m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            meVar = new me(cVar2, hashMap, hashMap2, hashMap3);
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
            meVar.getClass();
            return meVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override
    public final int y() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
