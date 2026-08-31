package c5;

import h5.d0;
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
public final class f extends v4.e {
    public static final Pattern f2270o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f2271p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern f2272q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f2273r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f2274s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern f2275t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern f2276u = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d v = new d(30.0f, 1, 1);
    public static final c f2277w = new c(15);
    public final XmlPullParserFactory f2278n;

    public f() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f2278n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    public static i l(i iVar) {
        if (iVar == null) {
            return new i();
        }
        return iVar;
    }

    public static boolean m(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static c n(XmlPullParser xmlPullParser, c cVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return cVar;
        }
        Matcher matcher = f2276u.matcher(attributeValue);
        if (!matcher.matches()) {
            h5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new c(parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            h5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cVar;
        }
    }

    public static void o(String str, i iVar) {
        Matcher matcher;
        int i10 = d0.f7237a;
        char c3 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f2272q;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            h5.a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(android.support.v4.media.a.m(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    iVar.f2305j = 3;
                    break;
                case 1:
                    iVar.f2305j = 2;
                    break;
                case 2:
                    iVar.f2305j = 1;
                    break;
                default:
                    throw new Exception(android.support.v4.media.a.o("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            iVar.f2306k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(android.support.v4.media.a.o("Invalid expression for fontSize: '", str, "'."));
    }

    public static d p(XmlPullParser xmlPullParser) {
        int i10;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = d0.f7237a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f10 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        d dVar = v;
        int i12 = dVar.f2265a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = dVar.f2266b;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f10, i12, i13);
    }

    public static void q(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, c5.c r21, c5.e r22, java.util.HashMap r23, java.util.HashMap r24) {
        throw new UnsupportedOperationException("Method not decompiled: c5.f.q(org.xmlpull.v1.XmlPullParser, java.util.HashMap, c5.c, c5.e, java.util.HashMap, java.util.HashMap):void");
    }

    public static g r(XmlPullParser xmlPullParser, g gVar, HashMap hashMap, d dVar) {
        long j10;
        char c3;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        i s6 = s(xmlPullParser, null);
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
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = t(attributeValue, dVar);
                    break;
                case 2:
                    j12 = t(attributeValue, dVar);
                    break;
                case 3:
                    j11 = t(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i11 = d0.f7237a;
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
        if (gVar != null) {
            long j14 = gVar.d;
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
            } else if (gVar != null) {
                long j15 = gVar.f2282e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new g(xmlPullParser.getName(), null, j11, j10, s6, strArr, str2, str, gVar);
                }
            }
        }
        j10 = j12;
        return new g(xmlPullParser.getName(), null, j11, j10, s6, strArr, str2, str, gVar);
    }

    public static c5.i s(org.xmlpull.v1.XmlPullParser r18, c5.i r19) {
        throw new UnsupportedOperationException("Method not decompiled: c5.f.s(org.xmlpull.v1.XmlPullParser, c5.i):c5.i");
    }

    public static long t(java.lang.String r13, c5.d r14) {
        throw new UnsupportedOperationException("Method not decompiled: c5.f.t(java.lang.String, c5.d):long");
    }

    public static e u(XmlPullParser xmlPullParser) {
        String t6 = h5.a.t(xmlPullParser, "extent");
        if (t6 == null) {
            return null;
        }
        Matcher matcher = f2275t.matcher(t6);
        if (!matcher.matches()) {
            h5.a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(t6));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new e(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            h5.a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(t6));
            return null;
        }
    }

    @Override
    public final v4.f k(int i10, boolean z4, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f2278n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new h("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            e eVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = v;
            c cVar = f2277w;
            j jVar = null;
            d dVar2 = dVar;
            c cVar2 = cVar;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                g gVar = (g) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = p(newPullParser);
                            cVar2 = n(newPullParser, cVar);
                            eVar = u(newPullParser);
                        }
                        d dVar3 = dVar2;
                        c cVar3 = cVar2;
                        if (!m(name)) {
                            h5.a.v("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                q(newPullParser, hashMap, cVar3, eVar, hashMap2, hashMap3);
                            } else {
                                try {
                                    g r10 = r(newPullParser, gVar, hashMap2, dVar3);
                                    arrayDeque.push(r10);
                                    if (gVar != null) {
                                        if (gVar.f2289m == null) {
                                            gVar.f2289m = new ArrayList();
                                        }
                                        gVar.f2289m.add(r10);
                                    }
                                } catch (v4.h e6) {
                                    h5.a.L("TtmlDecoder", "Suppressing parser error", e6);
                                }
                            }
                            cVar2 = cVar3;
                            dVar2 = dVar3;
                        }
                        i11++;
                        cVar2 = cVar3;
                        dVar2 = dVar3;
                    } else if (eventType == 4) {
                        gVar.getClass();
                        g a2 = g.a(newPullParser.getText());
                        if (gVar.f2289m == null) {
                            gVar.f2289m = new ArrayList();
                        }
                        gVar.f2289m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            g gVar2 = (g) arrayDeque.peek();
                            gVar2.getClass();
                            jVar = new j(gVar2, hashMap, hashMap2, hashMap3);
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
            if (jVar != null) {
                return jVar;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new Exception("Unable to decode source", e11);
        }
    }
}
