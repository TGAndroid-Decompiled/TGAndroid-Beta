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
public final class p6c implements reb {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern n = Pattern.compile("^(\\d+) (\\d+)$");
    public static final o6c r = new o6c(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public p6c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            grb.j("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static r6c a(r6c r6cVar) {
        if (r6cVar == null) {
            return new r6c();
        }
        return r6cVar;
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
            efd.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
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
            yve.b(parseInt, parseInt2, "Invalid cell resolution %s %s", (parseInt == 0 || parseInt2 == 0) ? false : false);
            return parseInt2;
        } catch (NumberFormatException unused) {
            efd.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, r6c r6cVar) {
        Matcher matcher;
        String str2 = gcc.a;
        char c2 = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            efd.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(uh9.l(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
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
                    r6cVar.j = 3;
                    break;
                case 1:
                    r6cVar.j = 2;
                    break;
                case 2:
                    r6cVar.j = 1;
                    break;
                default:
                    throw new Exception(qd4.y("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            r6cVar.k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(qd4.y("Invalid expression for fontSize: '", str, "'."));
    }

    public static o6c e(XmlPullParser xmlPullParser) {
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
            String str = gcc.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z = true;
            } else {
                z = false;
            }
            yve.e("frameRateMultiplier doesn't have 2 parts", z);
            f2 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        } else {
            f2 = 1.0f;
        }
        o6c o6cVar = r;
        int i2 = o6cVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = o6cVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new o6c(i * f2, i2, i3);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r21, java.util.HashMap r22, int r23, defpackage.l09 r24, java.util.HashMap r25, java.util.HashMap r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6c.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, l09, java.util.HashMap, java.util.HashMap):void");
    }

    public static n6c g(XmlPullParser xmlPullParser, n6c n6cVar, HashMap hashMap, o6c o6cVar) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        r6c h2 = h(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
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
                    j4 = i(attributeValue, o6cVar);
                    break;
                case 2:
                    j3 = i(attributeValue, o6cVar);
                    break;
                case 3:
                    j2 = i(attributeValue, o6cVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = gcc.a;
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
        if (n6cVar != null) {
            long j5 = n6cVar.d;
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
            } else if (n6cVar != null) {
                long j6 = n6cVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new n6c(xmlPullParser.getName(), null, j2, j, h2, strArr, str2, str, n6cVar);
                }
            }
        }
        j = j3;
        return new n6c(xmlPullParser.getName(), null, j2, j, h2, strArr, str2, str, n6cVar);
    }

    public static defpackage.r6c h(org.xmlpull.v1.XmlPullParser r18, defpackage.r6c r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6c.h(org.xmlpull.v1.XmlPullParser, r6c):r6c");
    }

    public static long i(java.lang.String r13, defpackage.o6c r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6c.i(java.lang.String, o6c):long");
    }

    public static l09 k(XmlPullParser xmlPullParser) {
        String a = h3f.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = h.matcher(a);
        if (!matcher.matches()) {
            efd.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(a));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new l09(parseInt, Integer.parseInt(group2), (byte) 7);
        } catch (NumberFormatException unused) {
            efd.f("TtmlParser", "Ignoring malformed tts extent: ".concat(a));
            return null;
        }
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        heb hebVar;
        heb hebVar2 = null;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new q6c("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            o6c o6cVar = r;
            int i3 = 15;
            int i4 = 0;
            am2 am2Var = null;
            l09 l09Var = null;
            while (eventType != 1) {
                n6c n6cVar = (n6c) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    hebVar = hebVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                o6cVar = e(newPullParser);
                                i3 = c(newPullParser);
                                l09Var = k(newPullParser);
                            }
                            o6c o6cVar2 = o6cVar;
                            int i5 = i3;
                            l09 l09Var2 = l09Var;
                            if (!b(name)) {
                                efd.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            } else {
                                if ("head".equals(name)) {
                                    f(newPullParser, hashMap, i5, l09Var2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        n6c g = g(newPullParser, n6cVar, hashMap2, o6cVar2);
                                        arrayDeque.push(g);
                                        if (n6cVar != null) {
                                            ArrayList arrayList = n6cVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                n6cVar.m = arrayList;
                                            }
                                            arrayList.add(g);
                                        }
                                    } catch (jeb e2) {
                                        efd.g("TtmlParser", "Suppressing parser error", e2);
                                    }
                                }
                                l09Var = l09Var2;
                                i3 = i5;
                                o6cVar = o6cVar2;
                            }
                            i4++;
                            l09Var = l09Var2;
                            i3 = i5;
                            o6cVar = o6cVar2;
                        } catch (IOException e3) {
                            e = e3;
                            su3.f("Unexpected error when reading input.", e);
                            return hebVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            su3.f("Unable to decode source", e);
                            return hebVar;
                        }
                    } else if (eventType == 4) {
                        n6cVar.getClass();
                        n6c a = n6c.a(newPullParser.getText());
                        ArrayList arrayList2 = n6cVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            n6cVar.m = arrayList2;
                        }
                        arrayList2.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            n6c n6cVar2 = (n6c) arrayDeque.peek();
                            n6cVar2.getClass();
                            am2Var = new am2(n6cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    hebVar = hebVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hebVar2 = hebVar;
            }
            hebVar = hebVar2;
            am2Var.getClass();
            return am2Var;
        } catch (IOException e5) {
            e = e5;
            hebVar = hebVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            hebVar = hebVar2;
        }
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        fse.b(j(i, i2, bArr), qebVar, ot2Var);
    }

    @Override
    public final int s() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}
