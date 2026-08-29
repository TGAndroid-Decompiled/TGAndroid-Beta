package a5;

import a4.w;
import f5.d0;
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
public final class f extends t4.e {
    public static final Pattern f167c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern f168e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f169f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f170g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern f171i = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d f172j = new d(30.0f, 1, 1);
    public static final c f173k = new c(15);
    public final XmlPullParserFactory f174b;

    public f() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f174b = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static i d(i iVar) {
        if (iVar == null) {
            return new i();
        }
        return iVar;
    }

    public static boolean e(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static c f(XmlPullParser xmlPullParser, c cVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return cVar;
        }
        Matcher matcher = f171i.matcher(attributeValue);
        if (!matcher.matches()) {
            f5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            f5.a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cVar;
        }
    }

    public static void g(String str, i iVar) {
        Matcher matcher;
        int i10 = d0.f6579a;
        char c3 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f168e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            f5.a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(w.l(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
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
                    iVar.f201j = 3;
                    break;
                case 1:
                    iVar.f201j = 2;
                    break;
                case 2:
                    iVar.f201j = 1;
                    break;
                default:
                    throw new Exception(w.n("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            iVar.f202k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(w.n("Invalid expression for fontSize: '", str, "'."));
    }

    public static d h(XmlPullParser xmlPullParser) {
        int i10;
        float f9;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = d0.f6579a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f9 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f9 = 1.0f;
        }
        d dVar = f172j;
        int i12 = dVar.f162a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = dVar.f163b;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f9, i12, i13);
    }

    public static void i(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, a5.c r21, a5.e r22, java.util.HashMap r23, java.util.HashMap r24) {
        throw new UnsupportedOperationException("Method not decompiled: a5.f.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, a5.c, a5.e, java.util.HashMap, java.util.HashMap):void");
    }

    public static g j(XmlPullParser xmlPullParser, g gVar, HashMap hashMap, d dVar) {
        long j10;
        char c3;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        i k9 = k(xmlPullParser, null);
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
                    j13 = l(attributeValue, dVar);
                    break;
                case 2:
                    j12 = l(attributeValue, dVar);
                    break;
                case 3:
                    j11 = l(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i11 = d0.f6579a;
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
                long j15 = gVar.f178e;
                if (j15 != -9223372036854775807L) {
                    j10 = j15;
                    return new g(xmlPullParser.getName(), null, j11, j10, k9, strArr, str2, str, gVar);
                }
            }
        }
        j10 = j12;
        return new g(xmlPullParser.getName(), null, j11, j10, k9, strArr, str2, str, gVar);
    }

    public static a5.i k(org.xmlpull.v1.XmlPullParser r18, a5.i r19) {
        throw new UnsupportedOperationException("Method not decompiled: a5.f.k(org.xmlpull.v1.XmlPullParser, a5.i):a5.i");
    }

    public static long l(java.lang.String r13, a5.d r14) {
        throw new UnsupportedOperationException("Method not decompiled: a5.f.l(java.lang.String, a5.d):long");
    }

    public static e m(XmlPullParser xmlPullParser) {
        String t10 = f5.a.t(xmlPullParser, "extent");
        if (t10 == null) {
            return null;
        }
        Matcher matcher = h.matcher(t10);
        if (!matcher.matches()) {
            f5.a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(t10));
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
            f5.a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(t10));
            return null;
        }
    }

    @Override
    public final t4.f c(int i10, boolean z10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f174b.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new h("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            e eVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = f172j;
            c cVar = f173k;
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
                            dVar2 = h(newPullParser);
                            cVar2 = f(newPullParser, cVar);
                            eVar = m(newPullParser);
                        }
                        d dVar3 = dVar2;
                        c cVar3 = cVar2;
                        if (!e(name)) {
                            f5.a.v("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                i(newPullParser, hashMap, cVar3, eVar, hashMap2, hashMap3);
                            } else {
                                try {
                                    g j10 = j(newPullParser, gVar, hashMap2, dVar3);
                                    arrayDeque.push(j10);
                                    if (gVar != null) {
                                        if (gVar.f185m == null) {
                                            gVar.f185m = new ArrayList();
                                        }
                                        gVar.f185m.add(j10);
                                    }
                                } catch (t4.h e10) {
                                    f5.a.L("TtmlDecoder", "Suppressing parser error", e10);
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
                        if (gVar.f185m == null) {
                            gVar.f185m = new ArrayList();
                        }
                        gVar.f185m.add(a2);
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
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new Exception("Unable to decode source", e12);
        }
    }
}
