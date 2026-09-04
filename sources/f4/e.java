package f4;

import b2.q0;
import e2.d0;
import e2.h;
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
import w7.c9;
import z3.l;
import z3.m;
public final class e implements m {
    public static final Pattern f9259b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f9260c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f9261e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f9262f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern f9263n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d f9264r = new d(30.0f, 1, 1);
    public final XmlPullParserFactory f9265a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f9265a = newInstance;
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
        Matcher matcher = f9263n.matcher(attributeValue);
        if (!matcher.matches()) {
            e2.a.n("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            e2.d.a("Invalid cell resolution " + parseInt + " " + parseInt2, z10);
            return parseInt2;
        } catch (NumberFormatException unused) {
            e2.a.n("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) {
        Matcher matcher;
        String str2 = d0.f8737a;
        char c10 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            e2.a.n("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(a4.a.n(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
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
                    gVar.f9281j = 3;
                    break;
                case 1:
                    gVar.f9281j = 2;
                    break;
                case 2:
                    gVar.f9281j = 1;
                    break;
                default:
                    throw new Exception(a4.a.p("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f9282k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(a4.a.p("Invalid expression for fontSize: '", str, "'."));
    }

    public static d e(XmlPullParser xmlPullParser) {
        int i10;
        float f7;
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = d0.f8737a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("frameRateMultiplier doesn't have 2 parts", z10);
            f7 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f7 = 1.0f;
        }
        d dVar = f9264r;
        int i11 = dVar.f9256a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = dVar.f9257b;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f7, i11, i12);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, b2.q0 r23, java.util.HashMap r24, java.util.HashMap r25) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, b2.q0, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j3;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g h10 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
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
                    j12 = i(attributeValue, dVar);
                    break;
                case 2:
                    j11 = i(attributeValue, dVar);
                    break;
                case 3:
                    j10 = i(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = d0.f8737a;
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
                long j14 = cVar.f9248e;
                if (j14 != -9223372036854775807L) {
                    j3 = j14;
                    return new c(xmlPullParser.getName(), null, j10, j3, h10, strArr, str2, str, cVar);
                }
            }
        }
        j3 = j11;
        return new c(xmlPullParser.getName(), null, j10, j3, h10, strArr, str2, str, cVar);
    }

    public static f4.g h(org.xmlpull.v1.XmlPullParser r18, f4.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.h(org.xmlpull.v1.XmlPullParser, f4.g):f4.g");
    }

    public static long i(java.lang.String r13, f4.d r14) {
        throw new UnsupportedOperationException("Method not decompiled: f4.e.i(java.lang.String, f4.d):long");
    }

    public static q0 j(XmlPullParser xmlPullParser) {
        String k10 = e2.d.k(xmlPullParser, "extent");
        if (k10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(k10);
        if (!matcher.matches()) {
            e2.a.n("TtmlParser", "Ignoring non-pixel tts extent: ".concat(k10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new q0(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            e2.a.n("TtmlParser", "Ignoring malformed tts extent: ".concat(k10));
            return null;
        }
    }

    @Override
    public final int U() {
        return 1;
    }

    @Override
    public final void e0(byte[] bArr, int i10, int i11, l lVar, h hVar) {
        c9.b(p(i10, i11, bArr), lVar, hVar);
    }

    @Override
    public final z3.d p(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f9265a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            q0 q0Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = f9264r;
            cf.c cVar = null;
            int i12 = 15;
            int i13 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar2 = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar = e(newPullParser);
                            i12 = c(newPullParser);
                            q0Var = j(newPullParser);
                        }
                        d dVar2 = dVar;
                        q0 q0Var2 = q0Var;
                        int i14 = i12;
                        if (!b(name)) {
                            e2.a.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i14, q0Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c g10 = g(newPullParser, cVar2, hashMap2, dVar2);
                                    arrayDeque.push(g10);
                                    if (cVar2 != null) {
                                        if (cVar2.f9255m == null) {
                                            cVar2.f9255m = new ArrayList();
                                        }
                                        cVar2.f9255m.add(g10);
                                    }
                                } catch (z3.f e7) {
                                    e2.a.o("TtmlParser", "Suppressing parser error", e7);
                                }
                            }
                            i12 = i14;
                            q0Var = q0Var2;
                            dVar = dVar2;
                        }
                        i13++;
                        i12 = i14;
                        q0Var = q0Var2;
                        dVar = dVar2;
                    } else if (eventType == 4) {
                        cVar2.getClass();
                        c a2 = c.a(newPullParser.getText());
                        if (cVar2.f9255m == null) {
                            cVar2.f9255m = new ArrayList();
                        }
                        cVar2.f9255m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar3 = (c) arrayDeque.peek();
                            cVar3.getClass();
                            cVar = new cf.c(cVar3, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            cVar.getClass();
            return cVar;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }

    @Override
    public final void reset() {
    }
}
