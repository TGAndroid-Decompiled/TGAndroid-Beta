package defpackage;

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
public final class p2c implements uab {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final o2c r = new o2c(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public p2c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            fyb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static r2c a(r2c r2cVar) {
        if (r2cVar == null) {
            return new r2c();
        }
        return r2cVar;
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
        Matcher matcher = n.matcher(attributeValue);
        if (!matcher.matches()) {
            lad.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            gre.b(parseInt, parseInt2, "Invalid cell resolution %s %s", (parseInt == 0 || parseInt2 == 0) ? false : false);
            return parseInt2;
        } catch (NumberFormatException unused) {
            lad.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, r2c r2cVar) {
        Matcher matcher;
        String str2 = g8c.a;
        char c2 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            lad.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(de9.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
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
                    r2cVar.j = 3;
                    break;
                case 1:
                    r2cVar.j = 2;
                    break;
                case 2:
                    r2cVar.j = 1;
                    break;
                default:
                    throw new Exception(tb4.y("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            r2cVar.k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(tb4.y("Invalid expression for fontSize: '", str, "'."));
    }

    public static o2c e(XmlPullParser xmlPullParser) {
        int i;
        float f2;
        String[] split;
        boolean z;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = g8c.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z = true;
            } else {
                z = false;
            }
            gre.e("frameRateMultiplier doesn't have 2 parts", z);
            f2 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f2 = 1.0f;
        }
        o2c o2cVar = r;
        int i2 = o2cVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = o2cVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new o2c(i * f2, i2, i3);
    }

    public static void g(org.xmlpull.v1.XmlPullParser r21, java.util.HashMap r22, int r23, defpackage.zw8 r24, java.util.HashMap r25, java.util.HashMap r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2c.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, zw8, java.util.HashMap, java.util.HashMap):void");
    }

    public static n2c h(XmlPullParser xmlPullParser, n2c n2cVar, HashMap hashMap, o2c o2cVar) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        r2c i = i(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
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
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j4 = j(attributeValue, o2cVar);
                    break;
                case 2:
                    j3 = j(attributeValue, o2cVar);
                    break;
                case 3:
                    j2 = j(attributeValue, o2cVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = g8c.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (n2cVar != null) {
            long j5 = n2cVar.d;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                } else {
                    j2 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (n2cVar != null) {
                long j6 = n2cVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new n2c(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, n2cVar);
                }
            }
        }
        j = j3;
        return new n2c(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, n2cVar);
    }

    public static defpackage.r2c i(org.xmlpull.v1.XmlPullParser r18, defpackage.r2c r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2c.i(org.xmlpull.v1.XmlPullParser, r2c):r2c");
    }

    public static long j(java.lang.String r13, defpackage.o2c r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2c.j(java.lang.String, o2c):long");
    }

    public static zw8 k(XmlPullParser xmlPullParser) {
        String a = oye.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = h.matcher(a);
        if (!matcher.matches()) {
            lad.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(a));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new zw8(parseInt, Integer.parseInt(group2), (byte) 7);
        } catch (NumberFormatException unused) {
            lad.f("TtmlParser", "Ignoring malformed tts extent: ".concat(a));
            return null;
        }
    }

    @Override
    public final kab f(int i, int i2, byte[] bArr) {
        kab kabVar;
        kab kabVar2 = null;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new q2c("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            o2c o2cVar = r;
            int i3 = 15;
            int i4 = 0;
            gl2 gl2Var = null;
            zw8 zw8Var = null;
            while (eventType != 1) {
                n2c n2cVar = (n2c) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    kabVar = kabVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                o2cVar = e(newPullParser);
                                i3 = c(newPullParser);
                                zw8Var = k(newPullParser);
                            }
                            o2c o2cVar2 = o2cVar;
                            int i5 = i3;
                            zw8 zw8Var2 = zw8Var;
                            if (!b(name)) {
                                lad.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            } else {
                                if ("head".equals(name)) {
                                    g(newPullParser, hashMap, i5, zw8Var2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        n2c h2 = h(newPullParser, n2cVar, hashMap2, o2cVar2);
                                        arrayDeque.push(h2);
                                        if (n2cVar != null) {
                                            ArrayList arrayList = n2cVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                n2cVar.m = arrayList;
                                            }
                                            arrayList.add(h2);
                                        }
                                    } catch (mab e2) {
                                        lad.g("TtmlParser", "Suppressing parser error", e2);
                                    }
                                }
                                zw8Var = zw8Var2;
                                i3 = i5;
                                o2cVar = o2cVar2;
                            }
                            i4++;
                            zw8Var = zw8Var2;
                            i3 = i5;
                            o2cVar = o2cVar2;
                        } catch (IOException e3) {
                            e = e3;
                            k93.h("Unexpected error when reading input.", e);
                            return kabVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            k93.h("Unable to decode source", e);
                            return kabVar;
                        }
                    } else if (eventType == 4) {
                        n2cVar.getClass();
                        n2c a = n2c.a(newPullParser.getText());
                        ArrayList arrayList2 = n2cVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            n2cVar.m = arrayList2;
                        }
                        arrayList2.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            n2c n2cVar2 = (n2c) arrayDeque.peek();
                            n2cVar2.getClass();
                            gl2Var = new gl2(n2cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    kabVar = kabVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                kabVar2 = kabVar;
            }
            kabVar = kabVar2;
            gl2Var.getClass();
            return gl2Var;
        } catch (IOException e5) {
            e = e5;
            kabVar = kabVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            kabVar = kabVar2;
        }
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        lne.b(f(i, i2, bArr), tabVar, us2Var);
    }

    @Override
    public final int o() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
