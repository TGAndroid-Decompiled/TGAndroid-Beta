package n4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.upstream.s0;
import d5.g0;
import h3.a1;
import h3.t0;
import h3.t1;
import h7.d0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p8.l0;
import p8.x;
import p8.z;

public final class e extends DefaultHandler implements s0 {

    public static final Pattern f18234b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    public static final Pattern f18235c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    public static final int[] f18236e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public final XmlPullParserFactory f18237a;

    public e() {
        try {
            this.f18237a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = g0.f4795a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    public static int c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i10 = 6;
        byte b10 = 3;
        int i11 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i11 = iBitCount;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i11 = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String strB = d0.b(attributeValue4);
                    strB.getClass();
                    switch (strB.hashCode()) {
                        case 1596796:
                            if (!strB.equals("4000")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2937391:
                            if (!strB.equals("a000")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 3094035:
                            if (!strB.equals("f801")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 3133436:
                            if (!strB.equals("fa01")) {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = -1;
                }
                i11 = i10;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i12 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i12 >= 0) {
                    int[] iArr = f18236e;
                    if (i12 < iArr.length) {
                        i11 = iArr[i12];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) != 0) {
                    i11 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!d5.a.y(xmlPullParser, "AudioChannelConfiguration"));
        return i11;
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "BaseURL"));
        if (text != null && d5.a.u(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return p8.l.k(new b(i10, i11, text, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String strG = d5.a.G(bVar.f18214a, text);
            String str = attributeValue3 == null ? strG : attributeValue3;
            if (z10) {
                i10 = bVar.f18216c;
                i11 = bVar.d;
                str = bVar.f18215b;
            }
            arrayList2.add(new b(i10, i11, strG, str));
        }
        return arrayList2;
    }

    public static Pair g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? A;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strB = d0.b(attributeValue4);
            strB.getClass();
            switch (strB) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = h3.h.f7868c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = h3.h.f7869e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = h3.h.d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = h3.h.f7867b;
                        attributeValue2 = 0;
                        A = u3.j.a(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                A = A;
                attributeValue2 = xmlPullParser.getText();
            } else if (d5.a.z(xmlPullParser, "ms:laurl")) {
                A = A;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    n1.d dVarE = u3.j.e(bArrDecode);
                    UUID uuid4 = dVarE == null ? null : (UUID) dVarE.f18088b;
                    if (uuid4 == null) {
                        d5.a.K("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (A == 0) {
                    uuid3 = h3.h.f7869e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    } else {
                        b(xmlPullParser);
                        A = A;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    b(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else if (A == 0) {
                uuid3 = h3.h.f7869e;
                if (!uuid3.equals(uuid) && d5.a.z(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = u3.j.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    b(xmlPullParser);
                    A = A;
                    attributeValue2 = attributeValue2;
                }
            } else {
                b(xmlPullParser);
                A = A;
                attributeValue2 = attributeValue2;
            }
        } while (!d5.a.y(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new l3.c(uuid, attributeValue2, "video/mp4", A) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!d5.a.y(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = g0.h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    public static float k(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f18234b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
            }
        }
        return f10;
    }

    public static c l(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str3;
        String str4;
        String str5;
        long j15;
        ArrayList arrayList5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        float f10;
        String str13;
        ArrayList arrayList6;
        String str14;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str15;
        ArrayList arrayList9;
        long j16;
        long j17;
        ArrayList arrayList10;
        String str16;
        ArrayList arrayList11;
        String str17;
        int i10;
        String str18;
        String str19;
        int i11;
        float f11;
        int i12;
        int i13;
        String str20;
        String str21;
        ArrayList arrayList12;
        String str22;
        ArrayList arrayList13;
        int i14;
        String str23;
        int i15;
        int i16;
        long j18;
        ArrayList arrayList14;
        String str24;
        String str25;
        ArrayList arrayList15;
        String str26;
        ArrayList arrayList16;
        String str27;
        long j19;
        long j20;
        String str28;
        long j21;
        ArrayList arrayList17;
        ArrayList arrayList18;
        s sVarQ;
        int i17;
        String str29;
        String strC;
        String str30;
        String[] strArrQ;
        int length;
        int i18;
        String strC2;
        long j22;
        String str31;
        int i19;
        int i20;
        ArrayList arrayList19;
        int i21;
        int iN;
        int i22;
        int i23;
        ArrayList arrayList20;
        int i24;
        Pair pairCreate;
        h3.s0 s0Var;
        int iIntValue;
        int iIntValue2;
        int i25;
        int i26;
        int i27;
        String str32;
        int i28;
        int i29;
        String str33;
        s rVar;
        ArrayList arrayList21;
        int i30;
        boolean z11;
        f fVar;
        String str34;
        String[] strArrSplit;
        f fVar2;
        String str35;
        String str36;
        byte b10;
        int iN2;
        f fVar3;
        f fVar4;
        String str37;
        int i31;
        int i32;
        String str38;
        int i33;
        String[] strArrQ2;
        int length2;
        int i34;
        ArrayList arrayList22;
        int i35;
        h3.s0 s0VarA;
        String str39;
        ArrayList arrayList23;
        long j23;
        int i36;
        long j24;
        ArrayList arrayList24;
        t0 t0Var;
        z zVar;
        s sVar;
        ArrayList arrayList25;
        ArrayList arrayList26;
        m kVar;
        int i37;
        String str40;
        int i38;
        l3.c cVar;
        int size;
        l3.c cVar2;
        int i39;
        l3.c cVar3;
        l3.c cVar4;
        String[] strArrSplit2 = new String[0];
        String str41 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit2 = attributeValue.split(",");
        }
        int length3 = strArrSplit2.length;
        int i40 = 0;
        while (true) {
            if (i40 >= length3) {
                z10 = false;
                break;
            }
            if (strArrSplit2[i40].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i40++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j25 = -9223372036854775807L;
        long jK = attributeValue2 == null ? -9223372036854775807L : g0.K(attributeValue2);
        long j26 = j(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long j27 = j(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long j28 = zEquals ? j(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long j29 = zEquals ? j(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long j30 = zEquals ? j(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jK2 = attributeValue3 == null ? -9223372036854775807L : g0.K(attributeValue3);
        long jD = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListK = p8.l.k(new b(z10 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList27 = new ArrayList();
        ArrayList arrayList28 = new ArrayList();
        long j31 = zEquals ? -9223372036854775807L : 0L;
        i iVar = null;
        c9.b bVar = null;
        Uri uriH = null;
        a1 a1Var = null;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            xmlPullParser.next();
            String str42 = "BaseURL";
            if (d5.a.z(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    jD = d(xmlPullParser, jD);
                    z12 = true;
                }
                arrayList28.addAll(f(xmlPullParser, arrayListK, z10));
                arrayListK = arrayListK;
                j12 = j25;
                arrayList28 = arrayList28;
                j31 = j31;
                z10 = z10;
                arrayList27 = arrayList27;
            } else {
                char c10 = 1;
                String str43 = "lang";
                if (d5.a.z(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str41, "moreInformationURL");
                    String str44 = attributeValue4 == null ? str41 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str41, "lang");
                    String str45 = attributeValue5 == null ? str41 : attributeValue5;
                    String strNextText = str41;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    while (true) {
                        xmlPullParser.next();
                        j10 = j25;
                        if (d5.a.z(xmlPullParser, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (d5.a.z(xmlPullParser, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (d5.a.z(xmlPullParser, "Copyright")) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str46 = strNextText;
                        String str47 = strNextText2;
                        String str48 = strNextText3;
                        if (d5.a.y(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str46, str47, str48, str44, str45);
                            arrayListK = arrayListK;
                            arrayList28 = arrayList28;
                            j31 = j31;
                            iVar = iVar2;
                        } else {
                            strNextText = str46;
                            strNextText2 = str47;
                            strNextText3 = str48;
                            j25 = j10;
                        }
                    }
                } else {
                    j10 = j25;
                    if (d5.a.z(xmlPullParser, "UTCTiming")) {
                        bVar = new c9.b(3, xmlPullParser.getAttributeValue(str41, "schemeIdUri"), xmlPullParser.getAttributeValue(str41, "value"));
                    } else {
                        if (d5.a.z(xmlPullParser, "Location")) {
                            uriH = d5.a.H(uri.toString(), xmlPullParser.nextText());
                        } else if (d5.a.z(xmlPullParser, "ServiceDescription")) {
                            long j32 = j10;
                            long j33 = j32;
                            long j34 = j33;
                            float f12 = -3.4028235E38f;
                            float f13 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (d5.a.z(xmlPullParser, "Latency")) {
                                    arrayListK = arrayListK;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j32 = attributeValue6 == null ? j10 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j33 = attributeValue7 == null ? j10 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j34 = attributeValue8 == null ? j10 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayListK = arrayListK;
                                    if (d5.a.z(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f12 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f13 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j35 = j32;
                                long j36 = jD;
                                long j37 = j33;
                                long j38 = j29;
                                long j39 = j34;
                                if (d5.a.y(xmlPullParser, "ServiceDescription")) {
                                    a1 a1Var2 = new a1();
                                    a1Var2.f7767a = j35;
                                    a1Var2.f7768b = j37;
                                    a1Var2.f7769c = j39;
                                    a1Var2.d = f12;
                                    a1Var2.f7770e = f13;
                                    a1Var = a1Var2;
                                    j31 = j31;
                                    z10 = z10;
                                    arrayList27 = arrayList27;
                                    jD = j36;
                                    j11 = j38;
                                    j12 = j10;
                                    arrayList28 = arrayList28;
                                } else {
                                    j34 = j39;
                                    j29 = j38;
                                    arrayListK = arrayListK;
                                    j33 = j37;
                                    jD = j36;
                                    j32 = j35;
                                }
                            }
                        } else {
                            arrayListK = arrayListK;
                            long j40 = jD;
                            long j41 = j29;
                            if (!d5.a.z(xmlPullParser, "Period") || z13) {
                                j31 = j31;
                                z10 = z10;
                                arrayList27 = arrayList27;
                                j11 = j41;
                                j12 = j10;
                                j13 = j40;
                                arrayList28 = arrayList28;
                                b(xmlPullParser);
                            } else {
                                ArrayList arrayList29 = !arrayList28.isEmpty() ? arrayList28 : arrayListK;
                                String str49 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long j42 = j(xmlPullParser, "start", j31);
                                String str50 = "duration";
                                String str51 = "value";
                                long j43 = jK != j10 ? jK + j42 : j10;
                                long j44 = j(xmlPullParser, "duration", j10);
                                ArrayList arrayList30 = new ArrayList();
                                ArrayList arrayList31 = new ArrayList();
                                ArrayList arrayList32 = new ArrayList();
                                long j45 = j10;
                                String str52 = "schemeIdUri";
                                Object obj = "Period";
                                long jD2 = j40;
                                s sVarR = null;
                                boolean z14 = false;
                                while (true) {
                                    xmlPullParser.next();
                                    if (d5.a.z(xmlPullParser, str42)) {
                                        if (!z14) {
                                            jD2 = d(xmlPullParser, jD2);
                                            z14 = true;
                                        }
                                        arrayList32.addAll(f(xmlPullParser, arrayList29, z10));
                                        arrayList = arrayList29;
                                        str = str49;
                                        j31 = j31;
                                        str42 = str42;
                                        str5 = str50;
                                        str4 = str51;
                                        z10 = z10;
                                        j14 = jD2;
                                        str2 = str43;
                                        j11 = j41;
                                        arrayList5 = arrayList30;
                                        arrayList2 = arrayList31;
                                        str3 = str52;
                                        j12 = -9223372036854775807L;
                                        j13 = j40;
                                        arrayList28 = arrayList28;
                                        arrayList4 = arrayList27;
                                        long j46 = j44;
                                        arrayList3 = arrayList32;
                                        j15 = j46;
                                    } else {
                                        j14 = jD2;
                                        arrayList = arrayList29;
                                        if (d5.a.z(xmlPullParser, "AdaptationSet")) {
                                            ArrayList arrayList33 = !arrayList32.isEmpty() ? arrayList32 : arrayList;
                                            String str53 = "SegmentTemplate";
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str49);
                                            int i41 = attributeValue12 == null ? -1 : Integer.parseInt(attributeValue12);
                                            int iH = h(xmlPullParser);
                                            String str54 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList34 = arrayList32;
                                            String str55 = "codecs";
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            ArrayList arrayList35 = arrayList28;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "width");
                                            int i42 = attributeValue15 == null ? -1 : Integer.parseInt(attributeValue15);
                                            j31 = j31;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "height");
                                            int i43 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                            float fK = k(xmlPullParser, -1.0f);
                                            String str56 = str50;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int i44 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, str43);
                                            String str57 = str51;
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList36 = new ArrayList();
                                            String str58 = attributeValue19;
                                            ArrayList arrayList37 = new ArrayList();
                                            ArrayList arrayList38 = new ArrayList();
                                            String str59 = "SegmentList";
                                            ArrayList arrayList39 = new ArrayList();
                                            String str60 = "SegmentBase";
                                            ArrayList arrayList40 = new ArrayList();
                                            String str61 = "audioSamplingRate";
                                            ArrayList arrayList41 = new ArrayList();
                                            float f14 = fK;
                                            ArrayList arrayList42 = new ArrayList();
                                            ArrayList arrayList43 = new ArrayList();
                                            String str62 = "mimeType";
                                            str = str49;
                                            String str63 = "width";
                                            s sVarR2 = sVarR;
                                            long j47 = j45;
                                            long jD3 = j14;
                                            String str64 = attributeValue18;
                                            boolean z15 = false;
                                            int iC = -1;
                                            String str65 = "height";
                                            int iG = iH;
                                            String str66 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (d5.a.z(xmlPullParser, str42)) {
                                                    if (!z15) {
                                                        jD3 = d(xmlPullParser, jD3);
                                                        z15 = true;
                                                    }
                                                    jD3 = jD3;
                                                    arrayList43.addAll(f(xmlPullParser, arrayList33, z10));
                                                } else {
                                                    jD3 = jD3;
                                                    if (d5.a.z(xmlPullParser, "ContentProtection")) {
                                                        Pair pairG = g(xmlPullParser);
                                                        Object obj2 = pairG.first;
                                                        if (obj2 != null) {
                                                            str66 = (String) obj2;
                                                        }
                                                        Object obj3 = pairG.second;
                                                        if (obj3 != null) {
                                                            arrayList36.add((l3.c) obj3);
                                                        }
                                                    } else if (d5.a.z(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue20 = xmlPullParser.getAttributeValue(null, str43);
                                                        if (str64 == null) {
                                                            str64 = attributeValue20;
                                                        } else if (attributeValue20 != null) {
                                                            d5.a.i(str64.equals(attributeValue20));
                                                        }
                                                        int iH2 = h(xmlPullParser);
                                                        if (iG == -1) {
                                                            iG = iH2;
                                                        } else if (iH2 != -1) {
                                                            d5.a.i(iG == iH2);
                                                        }
                                                    } else {
                                                        if (d5.a.z(xmlPullParser, "Role")) {
                                                            arrayList39.add(i(xmlPullParser, "Role"));
                                                        } else {
                                                            String str67 = "AudioChannelConfiguration";
                                                            if (d5.a.z(xmlPullParser, "AudioChannelConfiguration")) {
                                                                iC = c(xmlPullParser);
                                                            } else {
                                                                String str68 = "ContentProtection";
                                                                if (d5.a.z(xmlPullParser, "Accessibility")) {
                                                                    arrayList38.add(i(xmlPullParser, "Accessibility"));
                                                                } else if (d5.a.z(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList40.add(i(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    str2 = str43;
                                                                    String str69 = "SupplementalProperty";
                                                                    if (d5.a.z(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList41.add(i(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList5 = arrayList30;
                                                                        arrayList2 = arrayList31;
                                                                        str9 = str54;
                                                                        str10 = str56;
                                                                        str11 = str57;
                                                                        str15 = str59;
                                                                        str16 = str60;
                                                                        str12 = str61;
                                                                        f10 = f14;
                                                                        arrayList10 = arrayList42;
                                                                        str13 = str63;
                                                                        j16 = j47;
                                                                        str14 = str55;
                                                                        arrayList7 = arrayList43;
                                                                        j15 = j44;
                                                                        arrayList3 = arrayList34;
                                                                        arrayList6 = arrayList33;
                                                                        arrayList9 = arrayList38;
                                                                        j17 = j41;
                                                                        arrayList11 = arrayList37;
                                                                        j13 = j40;
                                                                        arrayList28 = arrayList35;
                                                                        arrayList8 = arrayList41;
                                                                        arrayList4 = arrayList27;
                                                                        j47 = j16;
                                                                        str58 = str58;
                                                                        iG = iG;
                                                                        str17 = str9;
                                                                    } else {
                                                                        arrayList39 = arrayList39;
                                                                        String str70 = "Representation";
                                                                        if (d5.a.z(xmlPullParser, "Representation")) {
                                                                            ArrayList arrayList44 = !arrayList43.isEmpty() ? arrayList43 : arrayList33;
                                                                            ArrayList arrayList45 = arrayList36;
                                                                            String str71 = "InbandEventStream";
                                                                            String str72 = str;
                                                                            String str73 = "EssentialProperty";
                                                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, str72);
                                                                            String str74 = str72;
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue22 == null) {
                                                                                str18 = str62;
                                                                                i10 = -1;
                                                                            } else {
                                                                                String str75 = str62;
                                                                                i10 = Integer.parseInt(attributeValue22);
                                                                                str18 = str75;
                                                                            }
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str18);
                                                                            String str76 = attributeValue23 == null ? attributeValue13 : attributeValue23;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str55);
                                                                            String str77 = str18;
                                                                            String str78 = str63;
                                                                            String str79 = attributeValue24 == null ? attributeValue14 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str78);
                                                                            if (attributeValue25 == null) {
                                                                                str19 = str65;
                                                                                i11 = i42;
                                                                            } else {
                                                                                str19 = str65;
                                                                                i11 = Integer.parseInt(attributeValue25);
                                                                            }
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str19);
                                                                            if (attributeValue26 == null) {
                                                                                f11 = f14;
                                                                                i12 = i43;
                                                                            } else {
                                                                                f11 = f14;
                                                                                i12 = Integer.parseInt(attributeValue26);
                                                                            }
                                                                            float fK2 = k(xmlPullParser, f11);
                                                                            f10 = f11;
                                                                            String str80 = str61;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str80);
                                                                            int i45 = attributeValue27 == null ? i44 : Integer.parseInt(attributeValue27);
                                                                            ArrayList arrayList46 = new ArrayList();
                                                                            ArrayList arrayList47 = new ArrayList();
                                                                            ArrayList arrayList48 = new ArrayList(arrayList40);
                                                                            arrayList40 = arrayList40;
                                                                            ArrayList arrayList49 = new ArrayList(arrayList41);
                                                                            ArrayList arrayList50 = new ArrayList();
                                                                            str12 = str80;
                                                                            ArrayList arrayList51 = arrayList33;
                                                                            String str81 = str64;
                                                                            int i46 = iG;
                                                                            s sVarP = sVarR2;
                                                                            long j48 = j47;
                                                                            int iC2 = iC;
                                                                            long jD4 = jD3;
                                                                            boolean z16 = false;
                                                                            String str82 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (d5.a.z(xmlPullParser, str42)) {
                                                                                    if (!z16) {
                                                                                        jD4 = d(xmlPullParser, jD4);
                                                                                        z16 = true;
                                                                                    }
                                                                                    i13 = i45;
                                                                                    arrayList50.addAll(f(xmlPullParser, arrayList44, z10));
                                                                                } else {
                                                                                    i13 = i45;
                                                                                    if (d5.a.z(xmlPullParser, str67)) {
                                                                                        iC2 = c(xmlPullParser);
                                                                                    } else {
                                                                                        String str83 = str60;
                                                                                        if (d5.a.z(xmlPullParser, str83)) {
                                                                                            str60 = str83;
                                                                                            sVarP = p(xmlPullParser, (r) sVarP);
                                                                                        } else {
                                                                                            String str84 = str59;
                                                                                            if (d5.a.z(xmlPullParser, str84)) {
                                                                                                arrayList7 = arrayList43;
                                                                                                str42 = str42;
                                                                                                long jD5 = d(xmlPullParser, j48);
                                                                                                long j49 = j43;
                                                                                                str25 = str67;
                                                                                                str20 = str84;
                                                                                                arrayList15 = arrayList44;
                                                                                                arrayList5 = arrayList30;
                                                                                                arrayList2 = arrayList31;
                                                                                                str21 = str54;
                                                                                                str10 = str56;
                                                                                                str13 = str78;
                                                                                                str11 = str57;
                                                                                                arrayList12 = arrayList37;
                                                                                                str22 = str83;
                                                                                                str65 = str19;
                                                                                                arrayList13 = arrayList42;
                                                                                                i14 = i10;
                                                                                                str26 = str68;
                                                                                                arrayList36 = arrayList45;
                                                                                                str62 = str77;
                                                                                                str23 = str81;
                                                                                                i15 = i46;
                                                                                                i16 = i13;
                                                                                                str14 = str55;
                                                                                                long j50 = j44;
                                                                                                arrayList3 = arrayList34;
                                                                                                arrayList6 = arrayList51;
                                                                                                arrayList14 = arrayList38;
                                                                                                ArrayList arrayList52 = arrayList48;
                                                                                                str24 = str73;
                                                                                                str = str74;
                                                                                                ArrayList arrayList53 = arrayList35;
                                                                                                arrayList8 = arrayList41;
                                                                                                long j51 = j41;
                                                                                                j13 = j40;
                                                                                                arrayList28 = arrayList53;
                                                                                                arrayList4 = arrayList27;
                                                                                                arrayList16 = arrayList50;
                                                                                                str27 = str53;
                                                                                                j18 = j50;
                                                                                                str28 = str71;
                                                                                                j48 = jD5;
                                                                                                j21 = j49;
                                                                                                j19 = jD4;
                                                                                                str70 = str70;
                                                                                                sVarQ = q(xmlPullParser, (o) sVarP, j49, j50, jD4, jD5, j51);
                                                                                                arrayList17 = arrayList52;
                                                                                                arrayList18 = arrayList49;
                                                                                                i17 = iC2;
                                                                                                z10 = z10;
                                                                                                str29 = str82;
                                                                                                j20 = j51;
                                                                                                arrayList46 = arrayList46;
                                                                                            } else {
                                                                                                str20 = str84;
                                                                                                long j52 = jD4;
                                                                                                arrayList7 = arrayList43;
                                                                                                str42 = str42;
                                                                                                arrayList5 = arrayList30;
                                                                                                arrayList2 = arrayList31;
                                                                                                str21 = str54;
                                                                                                str10 = str56;
                                                                                                str13 = str78;
                                                                                                str11 = str57;
                                                                                                arrayList12 = arrayList37;
                                                                                                str22 = str83;
                                                                                                str65 = str19;
                                                                                                arrayList13 = arrayList42;
                                                                                                i14 = i10;
                                                                                                arrayList36 = arrayList45;
                                                                                                str62 = str77;
                                                                                                str23 = str81;
                                                                                                i15 = i46;
                                                                                                i16 = i13;
                                                                                                str14 = str55;
                                                                                                j18 = j44;
                                                                                                arrayList3 = arrayList34;
                                                                                                arrayList6 = arrayList51;
                                                                                                arrayList14 = arrayList38;
                                                                                                ArrayList arrayList54 = arrayList48;
                                                                                                str24 = str73;
                                                                                                str = str74;
                                                                                                long j53 = j43;
                                                                                                str25 = str67;
                                                                                                arrayList15 = arrayList44;
                                                                                                str26 = str68;
                                                                                                ArrayList arrayList55 = arrayList35;
                                                                                                arrayList8 = arrayList41;
                                                                                                long j54 = j41;
                                                                                                j13 = j40;
                                                                                                arrayList28 = arrayList55;
                                                                                                arrayList4 = arrayList27;
                                                                                                arrayList16 = arrayList50;
                                                                                                str27 = str53;
                                                                                                if (d5.a.z(xmlPullParser, str27)) {
                                                                                                    j20 = j54;
                                                                                                    long jD6 = d(xmlPullParser, j48);
                                                                                                    z10 = z10;
                                                                                                    j19 = j52;
                                                                                                    p pVarR = r(xmlPullParser, (p) sVarP, arrayList8, j53, j18, j19, jD6, j20);
                                                                                                    str28 = str71;
                                                                                                    j48 = jD6;
                                                                                                    j21 = j53;
                                                                                                    sVarQ = pVarR;
                                                                                                    arrayList17 = arrayList54;
                                                                                                    arrayList18 = arrayList49;
                                                                                                } else {
                                                                                                    j19 = j52;
                                                                                                    z10 = z10;
                                                                                                    j20 = j54;
                                                                                                    if (d5.a.z(xmlPullParser, str26)) {
                                                                                                        Pair pairG2 = g(xmlPullParser);
                                                                                                        Object obj4 = pairG2.first;
                                                                                                        if (obj4 != null) {
                                                                                                            str82 = (String) obj4;
                                                                                                        }
                                                                                                        Object obj5 = pairG2.second;
                                                                                                        if (obj5 != null) {
                                                                                                            arrayList46 = arrayList46;
                                                                                                            arrayList46.add((l3.c) obj5);
                                                                                                        } else {
                                                                                                            arrayList46 = arrayList46;
                                                                                                        }
                                                                                                        j21 = j53;
                                                                                                        str28 = str71;
                                                                                                        sVarQ = sVarP;
                                                                                                        arrayList17 = arrayList54;
                                                                                                        i17 = iC2;
                                                                                                        j48 = j48;
                                                                                                        str70 = str70;
                                                                                                        str29 = str82;
                                                                                                        arrayList18 = arrayList49;
                                                                                                    } else {
                                                                                                        str28 = str71;
                                                                                                        if (d5.a.z(xmlPullParser, str28)) {
                                                                                                            j21 = j53;
                                                                                                            arrayList47.add(i(xmlPullParser, str28));
                                                                                                            arrayList17 = arrayList54;
                                                                                                        } else {
                                                                                                            j21 = j53;
                                                                                                            ArrayList arrayList56 = arrayList47;
                                                                                                            if (d5.a.z(xmlPullParser, str24)) {
                                                                                                                arrayList47 = arrayList56;
                                                                                                                arrayList17 = arrayList54;
                                                                                                                arrayList17.add(i(xmlPullParser, str24));
                                                                                                            } else {
                                                                                                                arrayList47 = arrayList56;
                                                                                                                str69 = str69;
                                                                                                                arrayList17 = arrayList54;
                                                                                                                if (d5.a.z(xmlPullParser, str69)) {
                                                                                                                    j48 = j48;
                                                                                                                    arrayList18 = arrayList49;
                                                                                                                    arrayList18.add(i(xmlPullParser, str69));
                                                                                                                } else {
                                                                                                                    j48 = j48;
                                                                                                                    arrayList18 = arrayList49;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                            }
                                                                                                            str69 = str69;
                                                                                                            sVarQ = sVarP;
                                                                                                        }
                                                                                                        arrayList18 = arrayList49;
                                                                                                        str69 = str69;
                                                                                                        sVarQ = sVarP;
                                                                                                    }
                                                                                                }
                                                                                                i17 = iC2;
                                                                                                str29 = str82;
                                                                                            }
                                                                                        }
                                                                                        if (d5.a.y(xmlPullParser, str70)) {
                                                                                            if (d5.q.h(str76)) {
                                                                                                if (str79 != null) {
                                                                                                    strArrQ2 = g0.Q(str79);
                                                                                                    length2 = strArrQ2.length;
                                                                                                    i34 = 0;
                                                                                                    while (true) {
                                                                                                        if (i34 >= length2) {
                                                                                                            strC2 = d5.q.c(strArrQ2[i34]);
                                                                                                            if (strC2 == null && d5.q.h(strC2)) {
                                                                                                                strC = strC2;
                                                                                                                str30 = str76;
                                                                                                            } else {
                                                                                                                i34++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str30 = str76;
                                                                                                strC = null;
                                                                                            } else if (d5.q.j(str76)) {
                                                                                                if (str79 != null) {
                                                                                                    strArrQ = g0.Q(str79);
                                                                                                    length = strArrQ.length;
                                                                                                    i18 = 0;
                                                                                                    while (true) {
                                                                                                        if (i18 >= length) {
                                                                                                            strC2 = d5.q.c(strArrQ[i18]);
                                                                                                            if (strC2 == null && d5.q.j(strC2)) {
                                                                                                                strC = strC2;
                                                                                                                str30 = str76;
                                                                                                            } else {
                                                                                                                i18++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str30 = str76;
                                                                                                strC = null;
                                                                                            } else if (d5.q.i(str76) && !"image".equals(d5.q.f(str76))) {
                                                                                                str30 = str76;
                                                                                                if ("application/mp4".equals(str30)) {
                                                                                                    strC = d5.q.c(str79);
                                                                                                    if ("text/vtt".equals(strC)) {
                                                                                                        strC = "application/x-mp4-vtt";
                                                                                                    }
                                                                                                } else {
                                                                                                    strC = null;
                                                                                                }
                                                                                            } else {
                                                                                                strC = str76;
                                                                                                str30 = strC;
                                                                                            }
                                                                                            if ("audio/eac3".equals(strC)) {
                                                                                                i32 = 0;
                                                                                                while (true) {
                                                                                                    j22 = j18;
                                                                                                    str31 = "ec+3";
                                                                                                    if (i32 < arrayList18.size()) {
                                                                                                        f fVar5 = (f) arrayList18.get(i32);
                                                                                                        str38 = fVar5.f18238a;
                                                                                                        String str85 = fVar5.f18239b;
                                                                                                        i33 = i32;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str38) || !"JOC".equals(str85)) && !("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str38) && "ec+3".equals(str85))) {
                                                                                                            i32 = i33 + 1;
                                                                                                            j18 = j22;
                                                                                                        } else {
                                                                                                            strC = "audio/eac3-joc";
                                                                                                        }
                                                                                                    } else {
                                                                                                        strC = "audio/eac3";
                                                                                                    }
                                                                                                }
                                                                                                if (!"audio/eac3-joc".equals(strC)) {
                                                                                                }
                                                                                                i19 = 0;
                                                                                                i20 = 0;
                                                                                                while (i19 < arrayList39.size()) {
                                                                                                    ArrayList arrayList57 = arrayList39;
                                                                                                    ArrayList arrayList58 = arrayList18;
                                                                                                    fVar4 = (f) arrayList57.get(i19);
                                                                                                    int i47 = i19;
                                                                                                    if (!d0.a("urn:mpeg:dash:role:2011", fVar4.f18238a)) {
                                                                                                        str37 = fVar4.f18239b;
                                                                                                        if (str37 == null && (str37.equals("forced_subtitle") || str37.equals("forced-subtitle"))) {
                                                                                                            i31 = 2;
                                                                                                        } else {
                                                                                                            i31 = 0;
                                                                                                        }
                                                                                                        i20 |= i31;
                                                                                                    }
                                                                                                    i19 = i47 + 1;
                                                                                                    arrayList39 = arrayList57;
                                                                                                    arrayList18 = arrayList58;
                                                                                                }
                                                                                                ArrayList arrayList59 = arrayList18;
                                                                                                arrayList19 = arrayList39;
                                                                                                i21 = 0;
                                                                                                iN = 0;
                                                                                                while (i21 < arrayList19.size()) {
                                                                                                    fVar3 = (f) arrayList19.get(i21);
                                                                                                    int i48 = i21;
                                                                                                    if (d0.a("urn:mpeg:dash:role:2011", fVar3.f18238a)) {
                                                                                                        iN |= n(fVar3.f18239b);
                                                                                                    }
                                                                                                    i21 = i48 + 1;
                                                                                                }
                                                                                                i22 = 0;
                                                                                                i23 = 0;
                                                                                                while (i22 < arrayList14.size()) {
                                                                                                    ArrayList arrayList60 = arrayList14;
                                                                                                    int i49 = i22;
                                                                                                    fVar2 = (f) arrayList60.get(i22);
                                                                                                    ArrayList arrayList61 = arrayList46;
                                                                                                    str35 = fVar2.f18238a;
                                                                                                    long j55 = j20;
                                                                                                    str36 = fVar2.f18239b;
                                                                                                    if (d0.a("urn:mpeg:dash:role:2011", str35)) {
                                                                                                        iN2 = n(str36);
                                                                                                    } else {
                                                                                                        if (!d0.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18238a)) {
                                                                                                            if (str36 == null) {
                                                                                                                switch (str36.hashCode()) {
                                                                                                                    case 49:
                                                                                                                        if (str36.equals("1")) {
                                                                                                                            b10 = 0;
                                                                                                                        } else {
                                                                                                                            b10 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        if (str36.equals("2")) {
                                                                                                                            b10 = 1;
                                                                                                                        } else {
                                                                                                                            b10 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 51:
                                                                                                                        if (str36.equals("3")) {
                                                                                                                            b10 = 2;
                                                                                                                        } else {
                                                                                                                            b10 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 52:
                                                                                                                        if (str36.equals("4")) {
                                                                                                                            b10 = 3;
                                                                                                                        } else {
                                                                                                                            b10 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                    default:
                                                                                                                        b10 = -1;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        if (str36.equals("6")) {
                                                                                                                            b10 = 4;
                                                                                                                        } else {
                                                                                                                            b10 = -1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (b10) {
                                                                                                                    case 0:
                                                                                                                        iN2 = 512;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iN2 = 2048;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iN2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iN2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iN2 = 1;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iN2 = 0;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iN2 = 0;
                                                                                                            }
                                                                                                        }
                                                                                                        i22 = i49 + 1;
                                                                                                        arrayList14 = arrayList60;
                                                                                                        arrayList46 = arrayList61;
                                                                                                        j20 = j55;
                                                                                                    }
                                                                                                    i23 |= iN2;
                                                                                                    i22 = i49 + 1;
                                                                                                    arrayList14 = arrayList60;
                                                                                                    arrayList46 = arrayList61;
                                                                                                    j20 = j55;
                                                                                                }
                                                                                                ArrayList arrayList62 = arrayList46;
                                                                                                long j56 = j20;
                                                                                                arrayList20 = arrayList14;
                                                                                                int iO = iN | i23 | o(arrayList17) | o(arrayList59);
                                                                                                i24 = 0;
                                                                                                while (true) {
                                                                                                    if (i24 < arrayList17.size()) {
                                                                                                        fVar = (f) arrayList17.get(i24);
                                                                                                        if ((d0.a("http://dashif.org/thumbnail_tile", fVar.f18238a) || d0.a("http://dashif.org/guidelines/thumbnail_tile", fVar.f18238a)) && (str34 = fVar.f18239b) != null) {
                                                                                                            int i50 = g0.f4795a;
                                                                                                            strArrSplit = str34.split("x", -1);
                                                                                                            if (strArrSplit.length != 2) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                try {
                                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                    continue;
                                                                                                                    i24++;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i24++;
                                                                                                    } else {
                                                                                                        pairCreate = null;
                                                                                                    }
                                                                                                }
                                                                                                s0Var = new h3.s0();
                                                                                                s0Var.f8123a = attributeValue21;
                                                                                                s0Var.f8134n = str30;
                                                                                                s0Var.f8135o = strC;
                                                                                                s0Var.h = str31;
                                                                                                s0Var.f8128g = i14;
                                                                                                s0Var.d = i20;
                                                                                                s0Var.f8126e = iO;
                                                                                                String str86 = str23;
                                                                                                s0Var.f8125c = str86;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                s0Var.H = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                s0Var.I = iIntValue2;
                                                                                                if (d5.q.j(strC)) {
                                                                                                    s0Var.f8140t = i11;
                                                                                                    s0Var.f8141u = i12;
                                                                                                    s0Var.v = fK2;
                                                                                                } else {
                                                                                                    i25 = i11;
                                                                                                    i26 = i12;
                                                                                                    if (d5.q.h(strC)) {
                                                                                                        s0Var.B = i17;
                                                                                                        s0Var.C = i16;
                                                                                                    } else if (d5.q.i(strC)) {
                                                                                                        if ("application/cea-608".equals(strC)) {
                                                                                                            i29 = 0;
                                                                                                            while (true) {
                                                                                                                if (i29 < arrayList20.size()) {
                                                                                                                    f fVar6 = (f) arrayList20.get(i29);
                                                                                                                    str33 = fVar6.f18238a;
                                                                                                                    String str87 = fVar6.f18239b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(str33) && str87 != null) {
                                                                                                                        Matcher matcher = f18235c.matcher(str87);
                                                                                                                        if (matcher.matches()) {
                                                                                                                            i28 = Integer.parseInt(matcher.group(1));
                                                                                                                        } else {
                                                                                                                            d5.a.K("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str87));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i29++;
                                                                                                                } else {
                                                                                                                    i28 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if ("application/cea-708".equals(strC)) {
                                                                                                            i27 = 0;
                                                                                                            while (true) {
                                                                                                                if (i27 < arrayList20.size()) {
                                                                                                                    f fVar7 = (f) arrayList20.get(i27);
                                                                                                                    str32 = fVar7.f18238a;
                                                                                                                    String str88 = fVar7.f18239b;
                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(str32) && str88 != null) {
                                                                                                                        Matcher matcher2 = d.matcher(str88);
                                                                                                                        if (matcher2.matches()) {
                                                                                                                            i28 = Integer.parseInt(matcher2.group(1));
                                                                                                                        } else {
                                                                                                                            d5.a.K("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str88));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i27++;
                                                                                                                } else {
                                                                                                                    i28 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i28 = -1;
                                                                                                        }
                                                                                                        s0Var.G = i28;
                                                                                                    } else if ("image".equals(d5.q.f(strC))) {
                                                                                                        s0Var.f8140t = i25;
                                                                                                        s0Var.f8141u = i26;
                                                                                                    }
                                                                                                }
                                                                                                t0 t0Var2 = new t0(s0Var);
                                                                                                if (sVarQ != null) {
                                                                                                    rVar = sVarQ;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList16.isEmpty()) {
                                                                                                    arrayList21 = arrayList15;
                                                                                                } else {
                                                                                                    arrayList21 = arrayList16;
                                                                                                }
                                                                                                d dVar = new d(t0Var2, arrayList21, rVar, str29, arrayList62, arrayList47, arrayList17, arrayList59);
                                                                                                iG = d5.q.g(t0Var2.B);
                                                                                                i30 = i15;
                                                                                                if (i30 != -1) {
                                                                                                    if (iG != -1) {
                                                                                                        if (i30 == iG) {
                                                                                                            z11 = true;
                                                                                                        } else {
                                                                                                            z11 = false;
                                                                                                        }
                                                                                                        d5.a.i(z11);
                                                                                                    }
                                                                                                    iG = i30;
                                                                                                }
                                                                                                ArrayList arrayList63 = arrayList13;
                                                                                                arrayList63.add(dVar);
                                                                                                arrayList10 = arrayList63;
                                                                                                str64 = str86;
                                                                                                arrayList9 = arrayList20;
                                                                                                arrayList39 = arrayList19;
                                                                                                str53 = str27;
                                                                                                str58 = str58;
                                                                                                j43 = j21;
                                                                                                jD3 = jD3;
                                                                                                j15 = j22;
                                                                                                j17 = j56;
                                                                                                arrayList11 = arrayList12;
                                                                                                str16 = str22;
                                                                                                str15 = str20;
                                                                                                str17 = str21;
                                                                                            } else {
                                                                                                j22 = j18;
                                                                                            }
                                                                                            str31 = str79;
                                                                                            i19 = 0;
                                                                                            i20 = 0;
                                                                                            while (i19 < arrayList39.size()) {
                                                                                                ArrayList arrayList510 = arrayList39;
                                                                                                ArrayList arrayList511 = arrayList18;
                                                                                                fVar4 = (f) arrayList510.get(i19);
                                                                                                int i410 = i19;
                                                                                                if (!d0.a("urn:mpeg:dash:role:2011", fVar4.f18238a)) {
                                                                                                    str37 = fVar4.f18239b;
                                                                                                    if (str37 == null) {
                                                                                                        i31 = 0;
                                                                                                    } else {
                                                                                                        i31 = 2;
                                                                                                    }
                                                                                                    i20 |= i31;
                                                                                                }
                                                                                                i19 = i410 + 1;
                                                                                                arrayList39 = arrayList510;
                                                                                                arrayList18 = arrayList511;
                                                                                            }
                                                                                            ArrayList arrayList512 = arrayList18;
                                                                                            arrayList19 = arrayList39;
                                                                                            i21 = 0;
                                                                                            iN = 0;
                                                                                            while (i21 < arrayList19.size()) {
                                                                                                fVar3 = (f) arrayList19.get(i21);
                                                                                                int i411 = i21;
                                                                                                if (d0.a("urn:mpeg:dash:role:2011", fVar3.f18238a)) {
                                                                                                    iN |= n(fVar3.f18239b);
                                                                                                }
                                                                                                i21 = i411 + 1;
                                                                                            }
                                                                                            i22 = 0;
                                                                                            i23 = 0;
                                                                                            while (i22 < arrayList14.size()) {
                                                                                                ArrayList arrayList64 = arrayList14;
                                                                                                int i412 = i22;
                                                                                                fVar2 = (f) arrayList64.get(i22);
                                                                                                ArrayList arrayList65 = arrayList46;
                                                                                                str35 = fVar2.f18238a;
                                                                                                long j57 = j20;
                                                                                                str36 = fVar2.f18239b;
                                                                                                if (d0.a("urn:mpeg:dash:role:2011", str35)) {
                                                                                                    iN2 = n(str36);
                                                                                                } else {
                                                                                                    if (!d0.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18238a)) {
                                                                                                        if (str36 == null) {
                                                                                                            switch (str36.hashCode()) {
                                                                                                                case 49:
                                                                                                                    if (str36.equals("1")) {
                                                                                                                        b10 = -1;
                                                                                                                    } else {
                                                                                                                        b10 = 0;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    if (str36.equals("2")) {
                                                                                                                        b10 = -1;
                                                                                                                    } else {
                                                                                                                        b10 = 1;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 51:
                                                                                                                    if (str36.equals("3")) {
                                                                                                                        b10 = -1;
                                                                                                                    } else {
                                                                                                                        b10 = 2;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 52:
                                                                                                                    if (str36.equals("4")) {
                                                                                                                        b10 = -1;
                                                                                                                    } else {
                                                                                                                        b10 = 3;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 53:
                                                                                                                default:
                                                                                                                    b10 = -1;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    if (str36.equals("6")) {
                                                                                                                        b10 = -1;
                                                                                                                    } else {
                                                                                                                        b10 = 4;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (b10) {
                                                                                                                case 0:
                                                                                                                    iN2 = 512;
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    iN2 = 2048;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    iN2 = 4;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    iN2 = 8;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    iN2 = 1;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    iN2 = 0;
                                                                                                                    break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iN2 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    i22 = i412 + 1;
                                                                                                    arrayList14 = arrayList64;
                                                                                                    arrayList46 = arrayList65;
                                                                                                    j20 = j57;
                                                                                                }
                                                                                                i23 |= iN2;
                                                                                                i22 = i412 + 1;
                                                                                                arrayList14 = arrayList64;
                                                                                                arrayList46 = arrayList65;
                                                                                                j20 = j57;
                                                                                            }
                                                                                            ArrayList arrayList66 = arrayList46;
                                                                                            long j58 = j20;
                                                                                            arrayList20 = arrayList14;
                                                                                            int iO2 = iN | i23 | o(arrayList17) | o(arrayList512);
                                                                                            i24 = 0;
                                                                                            while (true) {
                                                                                                if (i24 < arrayList17.size()) {
                                                                                                    fVar = (f) arrayList17.get(i24);
                                                                                                    if (d0.a("http://dashif.org/thumbnail_tile", fVar.f18238a)) {
                                                                                                        int i51 = g0.f4795a;
                                                                                                        strArrSplit = str34.split("x", -1);
                                                                                                        if (strArrSplit.length != 2) {
                                                                                                            continue;
                                                                                                        } else {
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                        }
                                                                                                    } else {
                                                                                                        int i52 = g0.f4795a;
                                                                                                        strArrSplit = str34.split("x", -1);
                                                                                                        if (strArrSplit.length != 2) {
                                                                                                            continue;
                                                                                                        } else {
                                                                                                            pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                        }
                                                                                                    }
                                                                                                    i24++;
                                                                                                } else {
                                                                                                    pairCreate = null;
                                                                                                }
                                                                                            }
                                                                                            s0Var = new h3.s0();
                                                                                            s0Var.f8123a = attributeValue21;
                                                                                            s0Var.f8134n = str30;
                                                                                            s0Var.f8135o = strC;
                                                                                            s0Var.h = str31;
                                                                                            s0Var.f8128g = i14;
                                                                                            s0Var.d = i20;
                                                                                            s0Var.f8126e = iO2;
                                                                                            String str89 = str23;
                                                                                            s0Var.f8125c = str89;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                            } else {
                                                                                                iIntValue = -1;
                                                                                            }
                                                                                            s0Var.H = iIntValue;
                                                                                            if (pairCreate != null) {
                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                            } else {
                                                                                                iIntValue2 = -1;
                                                                                            }
                                                                                            s0Var.I = iIntValue2;
                                                                                            if (d5.q.j(strC)) {
                                                                                                s0Var.f8140t = i11;
                                                                                                s0Var.f8141u = i12;
                                                                                                s0Var.v = fK2;
                                                                                            } else {
                                                                                                i25 = i11;
                                                                                                i26 = i12;
                                                                                                if (d5.q.h(strC)) {
                                                                                                    s0Var.B = i17;
                                                                                                    s0Var.C = i16;
                                                                                                } else if (d5.q.i(strC)) {
                                                                                                    if ("application/cea-608".equals(strC)) {
                                                                                                        i29 = 0;
                                                                                                        while (true) {
                                                                                                            if (i29 < arrayList20.size()) {
                                                                                                                f fVar8 = (f) arrayList20.get(i29);
                                                                                                                str33 = fVar8.f18238a;
                                                                                                                String str810 = fVar8.f18239b;
                                                                                                                if (!"urn:scte:dash:cc:cea-608:2015".equals(str33)) {
                                                                                                                }
                                                                                                                i29++;
                                                                                                            } else {
                                                                                                                i28 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if ("application/cea-708".equals(strC)) {
                                                                                                        i27 = 0;
                                                                                                        while (true) {
                                                                                                            if (i27 < arrayList20.size()) {
                                                                                                                f fVar9 = (f) arrayList20.get(i27);
                                                                                                                str32 = fVar9.f18238a;
                                                                                                                String str811 = fVar9.f18239b;
                                                                                                                if (!"urn:scte:dash:cc:cea-708:2015".equals(str32)) {
                                                                                                                }
                                                                                                                i27++;
                                                                                                            } else {
                                                                                                                i28 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i28 = -1;
                                                                                                    }
                                                                                                    s0Var.G = i28;
                                                                                                } else if ("image".equals(d5.q.f(strC))) {
                                                                                                    s0Var.f8140t = i25;
                                                                                                    s0Var.f8141u = i26;
                                                                                                }
                                                                                            }
                                                                                            t0 t0Var3 = new t0(s0Var);
                                                                                            if (sVarQ != null) {
                                                                                                rVar = sVarQ;
                                                                                            } else {
                                                                                                rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                            }
                                                                                            if (arrayList16.isEmpty()) {
                                                                                                arrayList21 = arrayList16;
                                                                                            } else {
                                                                                                arrayList21 = arrayList15;
                                                                                            }
                                                                                            d dVar2 = new d(t0Var3, arrayList21, rVar, str29, arrayList66, arrayList47, arrayList17, arrayList512);
                                                                                            iG = d5.q.g(t0Var3.B);
                                                                                            i30 = i15;
                                                                                            if (i30 != -1) {
                                                                                                if (iG != -1) {
                                                                                                    if (i30 == iG) {
                                                                                                        z11 = true;
                                                                                                    } else {
                                                                                                        z11 = false;
                                                                                                    }
                                                                                                    d5.a.i(z11);
                                                                                                }
                                                                                                iG = i30;
                                                                                            }
                                                                                            ArrayList arrayList67 = arrayList13;
                                                                                            arrayList67.add(dVar2);
                                                                                            arrayList10 = arrayList67;
                                                                                            str64 = str89;
                                                                                            arrayList9 = arrayList20;
                                                                                            arrayList39 = arrayList19;
                                                                                            str53 = str27;
                                                                                            str58 = str58;
                                                                                            j43 = j21;
                                                                                            jD3 = jD3;
                                                                                            j15 = j22;
                                                                                            j17 = j58;
                                                                                            arrayList11 = arrayList12;
                                                                                            str16 = str22;
                                                                                            str15 = str20;
                                                                                            str17 = str21;
                                                                                        } else {
                                                                                            ArrayList arrayList68 = arrayList17;
                                                                                            arrayList46 = arrayList46;
                                                                                            long j59 = j20;
                                                                                            long j60 = j18;
                                                                                            str70 = str70;
                                                                                            arrayList49 = arrayList18;
                                                                                            jD4 = j19;
                                                                                            str53 = str27;
                                                                                            str68 = str26;
                                                                                            arrayList50 = arrayList16;
                                                                                            arrayList27 = arrayList4;
                                                                                            arrayList44 = arrayList15;
                                                                                            str55 = str14;
                                                                                            z10 = z10;
                                                                                            arrayList38 = arrayList14;
                                                                                            arrayList41 = arrayList8;
                                                                                            arrayList43 = arrayList7;
                                                                                            str77 = str62;
                                                                                            j48 = j48;
                                                                                            str82 = str29;
                                                                                            i46 = i15;
                                                                                            arrayList30 = arrayList5;
                                                                                            arrayList45 = arrayList36;
                                                                                            arrayList37 = arrayList12;
                                                                                            str81 = str23;
                                                                                            i10 = i14;
                                                                                            str57 = str11;
                                                                                            str60 = str22;
                                                                                            str59 = str20;
                                                                                            str54 = str21;
                                                                                            str56 = str10;
                                                                                            c10 = 1;
                                                                                            str71 = str28;
                                                                                            arrayList35 = arrayList28;
                                                                                            j40 = j13;
                                                                                            arrayList34 = arrayList3;
                                                                                            sVarP = sVarQ;
                                                                                            j41 = j59;
                                                                                            str42 = str42;
                                                                                            iC2 = i17;
                                                                                            i45 = i16;
                                                                                            str76 = str76;
                                                                                            str67 = str25;
                                                                                            j43 = j21;
                                                                                            str74 = str;
                                                                                            arrayList42 = arrayList13;
                                                                                            str73 = str24;
                                                                                            str19 = str65;
                                                                                            arrayList48 = arrayList68;
                                                                                            arrayList51 = arrayList6;
                                                                                            str78 = str13;
                                                                                            j44 = j60;
                                                                                            arrayList31 = arrayList2;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str42 = str42;
                                                                                z10 = z10;
                                                                                arrayList5 = arrayList30;
                                                                                arrayList2 = arrayList31;
                                                                                str21 = str54;
                                                                                str10 = str56;
                                                                                str13 = str78;
                                                                                str11 = str57;
                                                                                arrayList12 = arrayList37;
                                                                                str20 = str59;
                                                                                str22 = str60;
                                                                                str65 = str19;
                                                                                arrayList13 = arrayList42;
                                                                                i14 = i10;
                                                                                arrayList36 = arrayList45;
                                                                                str28 = str71;
                                                                                str62 = str77;
                                                                                str23 = str81;
                                                                                i15 = i46;
                                                                                sVarQ = sVarP;
                                                                                i17 = iC2;
                                                                                i16 = i13;
                                                                                j48 = j48;
                                                                                str14 = str55;
                                                                                arrayList7 = arrayList43;
                                                                                j21 = j43;
                                                                                str70 = str70;
                                                                                str29 = str82;
                                                                                arrayList18 = arrayList49;
                                                                                str25 = str67;
                                                                                j19 = jD4;
                                                                                arrayList17 = arrayList48;
                                                                                arrayList15 = arrayList44;
                                                                                j18 = j44;
                                                                                arrayList3 = arrayList34;
                                                                                str24 = str73;
                                                                                str26 = str68;
                                                                                str = str74;
                                                                                arrayList6 = arrayList51;
                                                                                arrayList14 = arrayList38;
                                                                                j20 = j41;
                                                                                j13 = j40;
                                                                                arrayList28 = arrayList35;
                                                                                arrayList8 = arrayList41;
                                                                                arrayList4 = arrayList27;
                                                                                arrayList46 = arrayList46;
                                                                                arrayList16 = arrayList50;
                                                                                str27 = str53;
                                                                                if (d5.a.y(xmlPullParser, str70)) {
                                                                                    if (d5.q.h(str76)) {
                                                                                        if (str79 != null) {
                                                                                            strArrQ2 = g0.Q(str79);
                                                                                            length2 = strArrQ2.length;
                                                                                            i34 = 0;
                                                                                            while (true) {
                                                                                                if (i34 >= length2) {
                                                                                                    strC2 = d5.q.c(strArrQ2[i34]);
                                                                                                    if (strC2 == null) {
                                                                                                    }
                                                                                                    i34++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str30 = str76;
                                                                                        strC = null;
                                                                                    } else if (d5.q.j(str76)) {
                                                                                        if (str79 != null) {
                                                                                            strArrQ = g0.Q(str79);
                                                                                            length = strArrQ.length;
                                                                                            i18 = 0;
                                                                                            while (true) {
                                                                                                if (i18 >= length) {
                                                                                                    strC2 = d5.q.c(strArrQ[i18]);
                                                                                                    if (strC2 == null) {
                                                                                                    }
                                                                                                    i18++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str30 = str76;
                                                                                        strC = null;
                                                                                    } else if (d5.q.i(str76)) {
                                                                                        strC = str76;
                                                                                        str30 = strC;
                                                                                    } else {
                                                                                        str30 = str76;
                                                                                        if ("application/mp4".equals(str30)) {
                                                                                            strC = d5.q.c(str79);
                                                                                            if ("text/vtt".equals(strC)) {
                                                                                                strC = "application/x-mp4-vtt";
                                                                                            }
                                                                                        } else {
                                                                                            strC = null;
                                                                                        }
                                                                                    }
                                                                                    if ("audio/eac3".equals(strC)) {
                                                                                        i32 = 0;
                                                                                        while (true) {
                                                                                            j22 = j18;
                                                                                            str31 = "ec+3";
                                                                                            if (i32 < arrayList18.size()) {
                                                                                                f fVar10 = (f) arrayList18.get(i32);
                                                                                                str38 = fVar10.f18238a;
                                                                                                String str812 = fVar10.f18239b;
                                                                                                i33 = i32;
                                                                                                if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str38)) {
                                                                                                    i32 = i33 + 1;
                                                                                                    j18 = j22;
                                                                                                } else {
                                                                                                    i32 = i33 + 1;
                                                                                                    j18 = j22;
                                                                                                }
                                                                                                strC = "audio/eac3-joc";
                                                                                            } else {
                                                                                                strC = "audio/eac3";
                                                                                            }
                                                                                        }
                                                                                        if (!"audio/eac3-joc".equals(strC)) {
                                                                                        }
                                                                                        i19 = 0;
                                                                                        i20 = 0;
                                                                                        while (i19 < arrayList39.size()) {
                                                                                            ArrayList arrayList513 = arrayList39;
                                                                                            ArrayList arrayList514 = arrayList18;
                                                                                            fVar4 = (f) arrayList513.get(i19);
                                                                                            int i413 = i19;
                                                                                            if (!d0.a("urn:mpeg:dash:role:2011", fVar4.f18238a)) {
                                                                                                str37 = fVar4.f18239b;
                                                                                                if (str37 == null) {
                                                                                                    i31 = 0;
                                                                                                } else {
                                                                                                    i31 = 2;
                                                                                                }
                                                                                                i20 |= i31;
                                                                                            }
                                                                                            i19 = i413 + 1;
                                                                                            arrayList39 = arrayList513;
                                                                                            arrayList18 = arrayList514;
                                                                                        }
                                                                                        ArrayList arrayList515 = arrayList18;
                                                                                        arrayList19 = arrayList39;
                                                                                        i21 = 0;
                                                                                        iN = 0;
                                                                                        while (i21 < arrayList19.size()) {
                                                                                            fVar3 = (f) arrayList19.get(i21);
                                                                                            int i414 = i21;
                                                                                            if (d0.a("urn:mpeg:dash:role:2011", fVar3.f18238a)) {
                                                                                                iN |= n(fVar3.f18239b);
                                                                                            }
                                                                                            i21 = i414 + 1;
                                                                                        }
                                                                                        i22 = 0;
                                                                                        i23 = 0;
                                                                                        while (i22 < arrayList14.size()) {
                                                                                            ArrayList arrayList69 = arrayList14;
                                                                                            int i415 = i22;
                                                                                            fVar2 = (f) arrayList69.get(i22);
                                                                                            ArrayList arrayList610 = arrayList46;
                                                                                            str35 = fVar2.f18238a;
                                                                                            long j510 = j20;
                                                                                            str36 = fVar2.f18239b;
                                                                                            if (d0.a("urn:mpeg:dash:role:2011", str35)) {
                                                                                                iN2 = n(str36);
                                                                                            } else {
                                                                                                if (!d0.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18238a)) {
                                                                                                    if (str36 == null) {
                                                                                                        switch (str36.hashCode()) {
                                                                                                            case 49:
                                                                                                                if (str36.equals("1")) {
                                                                                                                    b10 = -1;
                                                                                                                } else {
                                                                                                                    b10 = 0;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 50:
                                                                                                                if (str36.equals("2")) {
                                                                                                                    b10 = -1;
                                                                                                                } else {
                                                                                                                    b10 = 1;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 51:
                                                                                                                if (str36.equals("3")) {
                                                                                                                    b10 = -1;
                                                                                                                } else {
                                                                                                                    b10 = 2;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 52:
                                                                                                                if (str36.equals("4")) {
                                                                                                                    b10 = -1;
                                                                                                                } else {
                                                                                                                    b10 = 3;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 53:
                                                                                                            default:
                                                                                                                b10 = -1;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                if (str36.equals("6")) {
                                                                                                                    b10 = -1;
                                                                                                                } else {
                                                                                                                    b10 = 4;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        switch (b10) {
                                                                                                            case 0:
                                                                                                                iN2 = 512;
                                                                                                                break;
                                                                                                            case 1:
                                                                                                                iN2 = 2048;
                                                                                                                break;
                                                                                                            case 2:
                                                                                                                iN2 = 4;
                                                                                                                break;
                                                                                                            case 3:
                                                                                                                iN2 = 8;
                                                                                                                break;
                                                                                                            case 4:
                                                                                                                iN2 = 1;
                                                                                                                break;
                                                                                                            default:
                                                                                                                iN2 = 0;
                                                                                                                break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iN2 = 0;
                                                                                                    }
                                                                                                }
                                                                                                i22 = i415 + 1;
                                                                                                arrayList14 = arrayList69;
                                                                                                arrayList46 = arrayList610;
                                                                                                j20 = j510;
                                                                                            }
                                                                                            i23 |= iN2;
                                                                                            i22 = i415 + 1;
                                                                                            arrayList14 = arrayList69;
                                                                                            arrayList46 = arrayList610;
                                                                                            j20 = j510;
                                                                                        }
                                                                                        ArrayList arrayList611 = arrayList46;
                                                                                        long j511 = j20;
                                                                                        arrayList20 = arrayList14;
                                                                                        int iO3 = iN | i23 | o(arrayList17) | o(arrayList515);
                                                                                        i24 = 0;
                                                                                        while (true) {
                                                                                            if (i24 < arrayList17.size()) {
                                                                                                fVar = (f) arrayList17.get(i24);
                                                                                                if (d0.a("http://dashif.org/thumbnail_tile", fVar.f18238a)) {
                                                                                                    int i53 = g0.f4795a;
                                                                                                    strArrSplit = str34.split("x", -1);
                                                                                                    if (strArrSplit.length != 2) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                    }
                                                                                                } else {
                                                                                                    int i54 = g0.f4795a;
                                                                                                    strArrSplit = str34.split("x", -1);
                                                                                                    if (strArrSplit.length != 2) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                    }
                                                                                                }
                                                                                                i24++;
                                                                                            } else {
                                                                                                pairCreate = null;
                                                                                            }
                                                                                        }
                                                                                        s0Var = new h3.s0();
                                                                                        s0Var.f8123a = attributeValue21;
                                                                                        s0Var.f8134n = str30;
                                                                                        s0Var.f8135o = strC;
                                                                                        s0Var.h = str31;
                                                                                        s0Var.f8128g = i14;
                                                                                        s0Var.d = i20;
                                                                                        s0Var.f8126e = iO3;
                                                                                        String str813 = str23;
                                                                                        s0Var.f8125c = str813;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                        } else {
                                                                                            iIntValue = -1;
                                                                                        }
                                                                                        s0Var.H = iIntValue;
                                                                                        if (pairCreate != null) {
                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                        } else {
                                                                                            iIntValue2 = -1;
                                                                                        }
                                                                                        s0Var.I = iIntValue2;
                                                                                        if (d5.q.j(strC)) {
                                                                                            s0Var.f8140t = i11;
                                                                                            s0Var.f8141u = i12;
                                                                                            s0Var.v = fK2;
                                                                                        } else {
                                                                                            i25 = i11;
                                                                                            i26 = i12;
                                                                                            if (d5.q.h(strC)) {
                                                                                                s0Var.B = i17;
                                                                                                s0Var.C = i16;
                                                                                            } else if (d5.q.i(strC)) {
                                                                                                if ("application/cea-608".equals(strC)) {
                                                                                                    i29 = 0;
                                                                                                    while (true) {
                                                                                                        if (i29 < arrayList20.size()) {
                                                                                                            f fVar11 = (f) arrayList20.get(i29);
                                                                                                            str33 = fVar11.f18238a;
                                                                                                            String str814 = fVar11.f18239b;
                                                                                                            if (!"urn:scte:dash:cc:cea-608:2015".equals(str33)) {
                                                                                                            }
                                                                                                            i29++;
                                                                                                        } else {
                                                                                                            i28 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else if ("application/cea-708".equals(strC)) {
                                                                                                    i27 = 0;
                                                                                                    while (true) {
                                                                                                        if (i27 < arrayList20.size()) {
                                                                                                            f fVar12 = (f) arrayList20.get(i27);
                                                                                                            str32 = fVar12.f18238a;
                                                                                                            String str815 = fVar12.f18239b;
                                                                                                            if (!"urn:scte:dash:cc:cea-708:2015".equals(str32)) {
                                                                                                            }
                                                                                                            i27++;
                                                                                                        } else {
                                                                                                            i28 = -1;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i28 = -1;
                                                                                                }
                                                                                                s0Var.G = i28;
                                                                                            } else if ("image".equals(d5.q.f(strC))) {
                                                                                                s0Var.f8140t = i25;
                                                                                                s0Var.f8141u = i26;
                                                                                            }
                                                                                        }
                                                                                        t0 t0Var4 = new t0(s0Var);
                                                                                        if (sVarQ != null) {
                                                                                            rVar = sVarQ;
                                                                                        } else {
                                                                                            rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                        }
                                                                                        if (arrayList16.isEmpty()) {
                                                                                            arrayList21 = arrayList16;
                                                                                        } else {
                                                                                            arrayList21 = arrayList15;
                                                                                        }
                                                                                        d dVar3 = new d(t0Var4, arrayList21, rVar, str29, arrayList611, arrayList47, arrayList17, arrayList515);
                                                                                        iG = d5.q.g(t0Var4.B);
                                                                                        i30 = i15;
                                                                                        if (i30 != -1) {
                                                                                            if (iG != -1) {
                                                                                                if (i30 == iG) {
                                                                                                    z11 = true;
                                                                                                } else {
                                                                                                    z11 = false;
                                                                                                }
                                                                                                d5.a.i(z11);
                                                                                            }
                                                                                            iG = i30;
                                                                                        }
                                                                                        ArrayList arrayList612 = arrayList13;
                                                                                        arrayList612.add(dVar3);
                                                                                        arrayList10 = arrayList612;
                                                                                        str64 = str813;
                                                                                        arrayList9 = arrayList20;
                                                                                        arrayList39 = arrayList19;
                                                                                        str53 = str27;
                                                                                        str58 = str58;
                                                                                        j43 = j21;
                                                                                        jD3 = jD3;
                                                                                        j15 = j22;
                                                                                        j17 = j511;
                                                                                        arrayList11 = arrayList12;
                                                                                        str16 = str22;
                                                                                        str15 = str20;
                                                                                        str17 = str21;
                                                                                    } else {
                                                                                        j22 = j18;
                                                                                    }
                                                                                    str31 = str79;
                                                                                    i19 = 0;
                                                                                    i20 = 0;
                                                                                    while (i19 < arrayList39.size()) {
                                                                                        ArrayList arrayList516 = arrayList39;
                                                                                        ArrayList arrayList517 = arrayList18;
                                                                                        fVar4 = (f) arrayList516.get(i19);
                                                                                        int i416 = i19;
                                                                                        if (!d0.a("urn:mpeg:dash:role:2011", fVar4.f18238a)) {
                                                                                            str37 = fVar4.f18239b;
                                                                                            if (str37 == null) {
                                                                                                i31 = 0;
                                                                                            } else {
                                                                                                i31 = 2;
                                                                                            }
                                                                                            i20 |= i31;
                                                                                        }
                                                                                        i19 = i416 + 1;
                                                                                        arrayList39 = arrayList516;
                                                                                        arrayList18 = arrayList517;
                                                                                    }
                                                                                    ArrayList arrayList518 = arrayList18;
                                                                                    arrayList19 = arrayList39;
                                                                                    i21 = 0;
                                                                                    iN = 0;
                                                                                    while (i21 < arrayList19.size()) {
                                                                                        fVar3 = (f) arrayList19.get(i21);
                                                                                        int i417 = i21;
                                                                                        if (d0.a("urn:mpeg:dash:role:2011", fVar3.f18238a)) {
                                                                                            iN |= n(fVar3.f18239b);
                                                                                        }
                                                                                        i21 = i417 + 1;
                                                                                    }
                                                                                    i22 = 0;
                                                                                    i23 = 0;
                                                                                    while (i22 < arrayList14.size()) {
                                                                                        ArrayList arrayList613 = arrayList14;
                                                                                        int i418 = i22;
                                                                                        fVar2 = (f) arrayList613.get(i22);
                                                                                        ArrayList arrayList614 = arrayList46;
                                                                                        str35 = fVar2.f18238a;
                                                                                        long j512 = j20;
                                                                                        str36 = fVar2.f18239b;
                                                                                        if (d0.a("urn:mpeg:dash:role:2011", str35)) {
                                                                                            iN2 = n(str36);
                                                                                        } else {
                                                                                            if (!d0.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar2.f18238a)) {
                                                                                                if (str36 == null) {
                                                                                                    switch (str36.hashCode()) {
                                                                                                        case 49:
                                                                                                            if (str36.equals("1")) {
                                                                                                                b10 = -1;
                                                                                                            } else {
                                                                                                                b10 = 0;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            if (str36.equals("2")) {
                                                                                                                b10 = -1;
                                                                                                            } else {
                                                                                                                b10 = 1;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            if (str36.equals("3")) {
                                                                                                                b10 = -1;
                                                                                                            } else {
                                                                                                                b10 = 2;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 52:
                                                                                                            if (str36.equals("4")) {
                                                                                                                b10 = -1;
                                                                                                            } else {
                                                                                                                b10 = 3;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 53:
                                                                                                        default:
                                                                                                            b10 = -1;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            if (str36.equals("6")) {
                                                                                                                b10 = -1;
                                                                                                            } else {
                                                                                                                b10 = 4;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (b10) {
                                                                                                        case 0:
                                                                                                            iN2 = 512;
                                                                                                            break;
                                                                                                        case 1:
                                                                                                            iN2 = 2048;
                                                                                                            break;
                                                                                                        case 2:
                                                                                                            iN2 = 4;
                                                                                                            break;
                                                                                                        case 3:
                                                                                                            iN2 = 8;
                                                                                                            break;
                                                                                                        case 4:
                                                                                                            iN2 = 1;
                                                                                                            break;
                                                                                                        default:
                                                                                                            iN2 = 0;
                                                                                                            break;
                                                                                                    }
                                                                                                } else {
                                                                                                    iN2 = 0;
                                                                                                }
                                                                                            }
                                                                                            i22 = i418 + 1;
                                                                                            arrayList14 = arrayList613;
                                                                                            arrayList46 = arrayList614;
                                                                                            j20 = j512;
                                                                                        }
                                                                                        i23 |= iN2;
                                                                                        i22 = i418 + 1;
                                                                                        arrayList14 = arrayList613;
                                                                                        arrayList46 = arrayList614;
                                                                                        j20 = j512;
                                                                                    }
                                                                                    ArrayList arrayList615 = arrayList46;
                                                                                    long j513 = j20;
                                                                                    arrayList20 = arrayList14;
                                                                                    int iO4 = iN | i23 | o(arrayList17) | o(arrayList518);
                                                                                    i24 = 0;
                                                                                    while (true) {
                                                                                        if (i24 < arrayList17.size()) {
                                                                                            fVar = (f) arrayList17.get(i24);
                                                                                            if (d0.a("http://dashif.org/thumbnail_tile", fVar.f18238a)) {
                                                                                                int i55 = g0.f4795a;
                                                                                                strArrSplit = str34.split("x", -1);
                                                                                                if (strArrSplit.length != 2) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                }
                                                                                            } else {
                                                                                                int i56 = g0.f4795a;
                                                                                                strArrSplit = str34.split("x", -1);
                                                                                                if (strArrSplit.length != 2) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[c10])));
                                                                                                }
                                                                                            }
                                                                                            i24++;
                                                                                        } else {
                                                                                            pairCreate = null;
                                                                                        }
                                                                                    }
                                                                                    s0Var = new h3.s0();
                                                                                    s0Var.f8123a = attributeValue21;
                                                                                    s0Var.f8134n = str30;
                                                                                    s0Var.f8135o = strC;
                                                                                    s0Var.h = str31;
                                                                                    s0Var.f8128g = i14;
                                                                                    s0Var.d = i20;
                                                                                    s0Var.f8126e = iO4;
                                                                                    String str816 = str23;
                                                                                    s0Var.f8125c = str816;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                    } else {
                                                                                        iIntValue = -1;
                                                                                    }
                                                                                    s0Var.H = iIntValue;
                                                                                    if (pairCreate != null) {
                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                    } else {
                                                                                        iIntValue2 = -1;
                                                                                    }
                                                                                    s0Var.I = iIntValue2;
                                                                                    if (d5.q.j(strC)) {
                                                                                        s0Var.f8140t = i11;
                                                                                        s0Var.f8141u = i12;
                                                                                        s0Var.v = fK2;
                                                                                    } else {
                                                                                        i25 = i11;
                                                                                        i26 = i12;
                                                                                        if (d5.q.h(strC)) {
                                                                                            s0Var.B = i17;
                                                                                            s0Var.C = i16;
                                                                                        } else if (d5.q.i(strC)) {
                                                                                            if ("application/cea-608".equals(strC)) {
                                                                                                i29 = 0;
                                                                                                while (true) {
                                                                                                    if (i29 < arrayList20.size()) {
                                                                                                        f fVar13 = (f) arrayList20.get(i29);
                                                                                                        str33 = fVar13.f18238a;
                                                                                                        String str817 = fVar13.f18239b;
                                                                                                        if (!"urn:scte:dash:cc:cea-608:2015".equals(str33)) {
                                                                                                        }
                                                                                                        i29++;
                                                                                                    } else {
                                                                                                        i28 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else if ("application/cea-708".equals(strC)) {
                                                                                                i27 = 0;
                                                                                                while (true) {
                                                                                                    if (i27 < arrayList20.size()) {
                                                                                                        f fVar14 = (f) arrayList20.get(i27);
                                                                                                        str32 = fVar14.f18238a;
                                                                                                        String str818 = fVar14.f18239b;
                                                                                                        if (!"urn:scte:dash:cc:cea-708:2015".equals(str32)) {
                                                                                                        }
                                                                                                        i27++;
                                                                                                    } else {
                                                                                                        i28 = -1;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i28 = -1;
                                                                                            }
                                                                                            s0Var.G = i28;
                                                                                        } else if ("image".equals(d5.q.f(strC))) {
                                                                                            s0Var.f8140t = i25;
                                                                                            s0Var.f8141u = i26;
                                                                                        }
                                                                                    }
                                                                                    t0 t0Var5 = new t0(s0Var);
                                                                                    if (sVarQ != null) {
                                                                                        rVar = sVarQ;
                                                                                    } else {
                                                                                        rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                    }
                                                                                    if (arrayList16.isEmpty()) {
                                                                                        arrayList21 = arrayList16;
                                                                                    } else {
                                                                                        arrayList21 = arrayList15;
                                                                                    }
                                                                                    d dVar4 = new d(t0Var5, arrayList21, rVar, str29, arrayList615, arrayList47, arrayList17, arrayList518);
                                                                                    iG = d5.q.g(t0Var5.B);
                                                                                    i30 = i15;
                                                                                    if (i30 != -1) {
                                                                                        if (iG != -1) {
                                                                                            if (i30 == iG) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            d5.a.i(z11);
                                                                                        }
                                                                                        iG = i30;
                                                                                    }
                                                                                    ArrayList arrayList616 = arrayList13;
                                                                                    arrayList616.add(dVar4);
                                                                                    arrayList10 = arrayList616;
                                                                                    str64 = str816;
                                                                                    arrayList9 = arrayList20;
                                                                                    arrayList39 = arrayList19;
                                                                                    str53 = str27;
                                                                                    str58 = str58;
                                                                                    j43 = j21;
                                                                                    jD3 = jD3;
                                                                                    j15 = j22;
                                                                                    j17 = j513;
                                                                                    arrayList11 = arrayList12;
                                                                                    str16 = str22;
                                                                                    str15 = str20;
                                                                                    str17 = str21;
                                                                                } else {
                                                                                    ArrayList arrayList617 = arrayList17;
                                                                                    arrayList46 = arrayList46;
                                                                                    long j514 = j20;
                                                                                    long j61 = j18;
                                                                                    str70 = str70;
                                                                                    arrayList49 = arrayList18;
                                                                                    jD4 = j19;
                                                                                    str53 = str27;
                                                                                    str68 = str26;
                                                                                    arrayList50 = arrayList16;
                                                                                    arrayList27 = arrayList4;
                                                                                    arrayList44 = arrayList15;
                                                                                    str55 = str14;
                                                                                    z10 = z10;
                                                                                    arrayList38 = arrayList14;
                                                                                    arrayList41 = arrayList8;
                                                                                    arrayList43 = arrayList7;
                                                                                    str77 = str62;
                                                                                    j48 = j48;
                                                                                    str82 = str29;
                                                                                    i46 = i15;
                                                                                    arrayList30 = arrayList5;
                                                                                    arrayList45 = arrayList36;
                                                                                    arrayList37 = arrayList12;
                                                                                    str81 = str23;
                                                                                    i10 = i14;
                                                                                    str57 = str11;
                                                                                    str60 = str22;
                                                                                    str59 = str20;
                                                                                    str54 = str21;
                                                                                    str56 = str10;
                                                                                    c10 = 1;
                                                                                    str71 = str28;
                                                                                    arrayList35 = arrayList28;
                                                                                    j40 = j13;
                                                                                    arrayList34 = arrayList3;
                                                                                    sVarP = sVarQ;
                                                                                    j41 = j514;
                                                                                    str42 = str42;
                                                                                    iC2 = i17;
                                                                                    i45 = i16;
                                                                                    str76 = str76;
                                                                                    str67 = str25;
                                                                                    j43 = j21;
                                                                                    str74 = str;
                                                                                    arrayList42 = arrayList13;
                                                                                    str73 = str24;
                                                                                    str19 = str65;
                                                                                    arrayList48 = arrayList617;
                                                                                    arrayList51 = arrayList6;
                                                                                    str78 = str13;
                                                                                    j44 = j61;
                                                                                    arrayList31 = arrayList2;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList36 = arrayList36;
                                                                            str42 = str42;
                                                                            z10 = z10;
                                                                            arrayList40 = arrayList40;
                                                                            long j62 = j41;
                                                                            long j63 = j44;
                                                                            arrayList5 = arrayList30;
                                                                            arrayList2 = arrayList31;
                                                                            str53 = str53;
                                                                            str9 = str54;
                                                                            arrayList3 = arrayList34;
                                                                            str10 = str56;
                                                                            str11 = str57;
                                                                            ArrayList arrayList70 = arrayList37;
                                                                            String str90 = str59;
                                                                            String str91 = str60;
                                                                            str12 = str61;
                                                                            f10 = f14;
                                                                            ArrayList arrayList71 = arrayList42;
                                                                            str13 = str63;
                                                                            arrayList6 = arrayList33;
                                                                            str14 = str55;
                                                                            String str92 = str64;
                                                                            arrayList7 = arrayList43;
                                                                            ArrayList arrayList72 = arrayList38;
                                                                            j13 = j40;
                                                                            long j64 = j43;
                                                                            arrayList28 = arrayList35;
                                                                            int i57 = iG;
                                                                            arrayList8 = arrayList41;
                                                                            arrayList4 = arrayList27;
                                                                            if (d5.a.z(xmlPullParser, str91)) {
                                                                                sVarR2 = p(xmlPullParser, (r) sVarR2);
                                                                                str64 = str92;
                                                                                arrayList9 = arrayList72;
                                                                                iG = i57;
                                                                                str53 = str53;
                                                                                str58 = str58;
                                                                                j43 = j64;
                                                                                j15 = j63;
                                                                                j17 = j62;
                                                                                arrayList11 = arrayList70;
                                                                                arrayList10 = arrayList71;
                                                                                str15 = str90;
                                                                                str17 = str9;
                                                                                str16 = str91;
                                                                                jD3 = jD3;
                                                                            } else {
                                                                                str15 = str90;
                                                                                if (d5.a.z(xmlPullParser, str15)) {
                                                                                    long jD7 = d(xmlPullParser, j47);
                                                                                    str64 = str92;
                                                                                    arrayList9 = arrayList72;
                                                                                    iG = i57;
                                                                                    arrayList10 = arrayList71;
                                                                                    sVarR2 = q(xmlPullParser, (o) sVarR2, j64, j63, jD3, jD7, j62);
                                                                                    j17 = j62;
                                                                                    j15 = j63;
                                                                                    j43 = j64;
                                                                                    j47 = jD7;
                                                                                    str16 = str91;
                                                                                } else {
                                                                                    str64 = str92;
                                                                                    arrayList9 = arrayList72;
                                                                                    iG = i57;
                                                                                    j43 = j64;
                                                                                    j16 = j47;
                                                                                    j15 = j63;
                                                                                    j17 = j62;
                                                                                    arrayList10 = arrayList71;
                                                                                    if (d5.a.z(xmlPullParser, str53)) {
                                                                                        long jD8 = d(xmlPullParser, j16);
                                                                                        str16 = str91;
                                                                                        sVarR2 = r(xmlPullParser, (p) sVarR2, arrayList8, j43, j15, jD3, jD8, j17);
                                                                                        j47 = jD8;
                                                                                    } else {
                                                                                        str53 = str53;
                                                                                        str16 = str91;
                                                                                        if (d5.a.z(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList11 = arrayList70;
                                                                                            arrayList11.add(i(xmlPullParser, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList11 = arrayList70;
                                                                                            if (d5.a.z(xmlPullParser, "Label")) {
                                                                                                String text = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        text = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                } while (!d5.a.y(xmlPullParser, "Label"));
                                                                                                j47 = j16;
                                                                                                str58 = text;
                                                                                            } else if (xmlPullParser.getEventType() == 2) {
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                            iG = iG;
                                                                                            str17 = str9;
                                                                                        }
                                                                                        j47 = j16;
                                                                                        str58 = str58;
                                                                                        iG = iG;
                                                                                        str17 = str9;
                                                                                    }
                                                                                }
                                                                                iG = iG;
                                                                                arrayList11 = arrayList70;
                                                                                str17 = str9;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (d5.a.y(xmlPullParser, str17)) {
                                                                arrayList22 = new ArrayList(arrayList10.size());
                                                                i35 = 0;
                                                                while (i35 < arrayList10.size()) {
                                                                    d dVar5 = (d) arrayList10.get(i35);
                                                                    s0VarA = dVar5.f18228a.a();
                                                                    if (str58 != null) {
                                                                        s0VarA.f8124b = str58;
                                                                    }
                                                                    str39 = dVar5.d;
                                                                    if (str39 == null) {
                                                                        str39 = str66;
                                                                    }
                                                                    arrayList23 = dVar5.f18231e;
                                                                    ArrayList arrayList73 = arrayList36;
                                                                    arrayList23.addAll(arrayList73);
                                                                    if (arrayList23.isEmpty()) {
                                                                        j23 = j15;
                                                                        i36 = iG;
                                                                        j24 = j17;
                                                                    } else {
                                                                        i37 = 0;
                                                                        while (true) {
                                                                            if (i37 < arrayList23.size()) {
                                                                                cVar4 = (l3.c) arrayList23.get(i37);
                                                                                j23 = j15;
                                                                                if (h3.h.f7868c.equals(cVar4.f15387b) || (str40 = cVar4.f15388c) == null) {
                                                                                    i37++;
                                                                                    j15 = j23;
                                                                                } else {
                                                                                    arrayList23.remove(i37);
                                                                                }
                                                                            } else {
                                                                                j23 = j15;
                                                                                str40 = null;
                                                                            }
                                                                        }
                                                                        if (str40 != null) {
                                                                            i38 = 0;
                                                                            while (i38 < arrayList23.size()) {
                                                                                cVar = (l3.c) arrayList23.get(i38);
                                                                                int i58 = iG;
                                                                                if (!h3.h.f7867b.equals(cVar.f15387b) && cVar.f15388c == null) {
                                                                                    arrayList23.set(i38, new l3.c(h3.h.f7868c, str40, cVar.d, cVar.f15389e));
                                                                                }
                                                                                i38++;
                                                                                iG = i58;
                                                                                j17 = j17;
                                                                            }
                                                                        }
                                                                        i36 = iG;
                                                                        j24 = j17;
                                                                        for (size = arrayList23.size() - 1; size >= 0; size--) {
                                                                            cVar2 = (l3.c) arrayList23.get(size);
                                                                            if (cVar2.f15389e == null) {
                                                                                for (i39 = 0; i39 < arrayList23.size(); i39++) {
                                                                                    cVar3 = (l3.c) arrayList23.get(i39);
                                                                                    if (cVar3.f15389e == null && cVar2.f15389e == null) {
                                                                                        UUID uuid = cVar2.f15387b;
                                                                                        cVar3.getClass();
                                                                                        UUID uuid2 = h3.h.f7866a;
                                                                                        UUID uuid3 = cVar3.f15387b;
                                                                                        if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
                                                                                            arrayList23.remove(size);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        s0VarA.f8138r = new l3.d(str39, arrayList23);
                                                                    }
                                                                    arrayList24 = dVar5.f18232f;
                                                                    arrayList24.addAll(arrayList11);
                                                                    t0Var = new t0(s0VarA);
                                                                    zVar = dVar5.f18229b;
                                                                    sVar = dVar5.f18230c;
                                                                    arrayList25 = dVar5.f18233g;
                                                                    arrayList26 = dVar5.h;
                                                                    if (sVar instanceof r) {
                                                                        kVar = new l(t0Var, zVar, (r) sVar, arrayList24, arrayList25, arrayList26);
                                                                    } else {
                                                                        if (!(sVar instanceof n)) {
                                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                        }
                                                                        kVar = new k(t0Var, zVar, (n) sVar, arrayList24, arrayList25, arrayList26);
                                                                    }
                                                                    arrayList22.add(kVar);
                                                                    i35++;
                                                                    arrayList36 = arrayList73;
                                                                    str58 = str58;
                                                                    iG = i36;
                                                                    j15 = j23;
                                                                    j17 = j24;
                                                                }
                                                                c10 = 1;
                                                                arrayList5.add(new a(i41, iG, arrayList22, arrayList9, arrayList40, arrayList8));
                                                                str3 = str52;
                                                                j11 = j17;
                                                                str4 = str11;
                                                                str5 = str10;
                                                            } else {
                                                                long j65 = j17;
                                                                c10 = 1;
                                                                arrayList37 = arrayList11;
                                                                str60 = str16;
                                                                arrayList42 = arrayList10;
                                                                arrayList27 = arrayList4;
                                                                arrayList33 = arrayList6;
                                                                str63 = str13;
                                                                z10 = z10;
                                                                str58 = str58;
                                                                arrayList38 = arrayList9;
                                                                arrayList41 = arrayList8;
                                                                str43 = str2;
                                                                f14 = f10;
                                                                arrayList40 = arrayList40;
                                                                str61 = str12;
                                                                str42 = str42;
                                                                arrayList31 = arrayList2;
                                                                arrayList36 = arrayList36;
                                                                str57 = str11;
                                                                str56 = str10;
                                                                str54 = str17;
                                                                arrayList35 = arrayList28;
                                                                j40 = j13;
                                                                arrayList34 = arrayList3;
                                                                arrayList43 = arrayList7;
                                                                j41 = j65;
                                                                j44 = j15;
                                                                str59 = str15;
                                                                str55 = str14;
                                                                arrayList39 = arrayList39;
                                                                str64 = str64;
                                                                arrayList30 = arrayList5;
                                                            }
                                                        }
                                                        str2 = str43;
                                                        arrayList5 = arrayList30;
                                                        arrayList2 = arrayList31;
                                                        str9 = str54;
                                                        str10 = str56;
                                                        str11 = str57;
                                                        str15 = str59;
                                                        str16 = str60;
                                                        str12 = str61;
                                                        f10 = f14;
                                                        arrayList10 = arrayList42;
                                                        str13 = str63;
                                                        j16 = j47;
                                                        str14 = str55;
                                                        arrayList7 = arrayList43;
                                                        j15 = j44;
                                                        arrayList3 = arrayList34;
                                                        arrayList6 = arrayList33;
                                                        arrayList9 = arrayList38;
                                                        j17 = j41;
                                                        arrayList11 = arrayList37;
                                                        j13 = j40;
                                                        arrayList28 = arrayList35;
                                                        arrayList8 = arrayList41;
                                                        arrayList4 = arrayList27;
                                                        j47 = j16;
                                                        str58 = str58;
                                                        iG = iG;
                                                        str17 = str9;
                                                        if (d5.a.y(xmlPullParser, str17)) {
                                                            arrayList22 = new ArrayList(arrayList10.size());
                                                            i35 = 0;
                                                            while (i35 < arrayList10.size()) {
                                                                d dVar6 = (d) arrayList10.get(i35);
                                                                s0VarA = dVar6.f18228a.a();
                                                                if (str58 != null) {
                                                                    s0VarA.f8124b = str58;
                                                                }
                                                                str39 = dVar6.d;
                                                                if (str39 == null) {
                                                                    str39 = str66;
                                                                }
                                                                arrayList23 = dVar6.f18231e;
                                                                ArrayList arrayList74 = arrayList36;
                                                                arrayList23.addAll(arrayList74);
                                                                if (arrayList23.isEmpty()) {
                                                                    i37 = 0;
                                                                    while (true) {
                                                                        if (i37 < arrayList23.size()) {
                                                                            cVar4 = (l3.c) arrayList23.get(i37);
                                                                            j23 = j15;
                                                                            if (h3.h.f7868c.equals(cVar4.f15387b)) {
                                                                            }
                                                                            i37++;
                                                                            j15 = j23;
                                                                        } else {
                                                                            j23 = j15;
                                                                            str40 = null;
                                                                        }
                                                                    }
                                                                    if (str40 != null) {
                                                                        i38 = 0;
                                                                        while (i38 < arrayList23.size()) {
                                                                            cVar = (l3.c) arrayList23.get(i38);
                                                                            int i59 = iG;
                                                                            if (!h3.h.f7867b.equals(cVar.f15387b)) {
                                                                            }
                                                                            i38++;
                                                                            iG = i59;
                                                                            j17 = j17;
                                                                        }
                                                                    }
                                                                    i36 = iG;
                                                                    j24 = j17;
                                                                    while (size >= 0) {
                                                                        cVar2 = (l3.c) arrayList23.get(size);
                                                                        if (cVar2.f15389e == null) {
                                                                            while (i39 < arrayList23.size()) {
                                                                                cVar3 = (l3.c) arrayList23.get(i39);
                                                                                if (cVar3.f15389e == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    s0VarA.f8138r = new l3.d(str39, arrayList23);
                                                                } else {
                                                                    j23 = j15;
                                                                    i36 = iG;
                                                                    j24 = j17;
                                                                }
                                                                arrayList24 = dVar6.f18232f;
                                                                arrayList24.addAll(arrayList11);
                                                                t0Var = new t0(s0VarA);
                                                                zVar = dVar6.f18229b;
                                                                sVar = dVar6.f18230c;
                                                                arrayList25 = dVar6.f18233g;
                                                                arrayList26 = dVar6.h;
                                                                if (sVar instanceof r) {
                                                                    kVar = new l(t0Var, zVar, (r) sVar, arrayList24, arrayList25, arrayList26);
                                                                } else {
                                                                    if (!(sVar instanceof n)) {
                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    }
                                                                    kVar = new k(t0Var, zVar, (n) sVar, arrayList24, arrayList25, arrayList26);
                                                                }
                                                                arrayList22.add(kVar);
                                                                i35++;
                                                                arrayList36 = arrayList74;
                                                                str58 = str58;
                                                                iG = i36;
                                                                j15 = j23;
                                                                j17 = j24;
                                                            }
                                                            c10 = 1;
                                                            arrayList5.add(new a(i41, iG, arrayList22, arrayList9, arrayList40, arrayList8));
                                                            str3 = str52;
                                                            j11 = j17;
                                                            str4 = str11;
                                                            str5 = str10;
                                                        } else {
                                                            long j66 = j17;
                                                            c10 = 1;
                                                            arrayList37 = arrayList11;
                                                            str60 = str16;
                                                            arrayList42 = arrayList10;
                                                            arrayList27 = arrayList4;
                                                            arrayList33 = arrayList6;
                                                            str63 = str13;
                                                            z10 = z10;
                                                            str58 = str58;
                                                            arrayList38 = arrayList9;
                                                            arrayList41 = arrayList8;
                                                            str43 = str2;
                                                            f14 = f10;
                                                            arrayList40 = arrayList40;
                                                            str61 = str12;
                                                            str42 = str42;
                                                            arrayList31 = arrayList2;
                                                            arrayList36 = arrayList36;
                                                            str57 = str11;
                                                            str56 = str10;
                                                            str54 = str17;
                                                            arrayList35 = arrayList28;
                                                            j40 = j13;
                                                            arrayList34 = arrayList3;
                                                            arrayList43 = arrayList7;
                                                            j41 = j66;
                                                            j44 = j15;
                                                            str59 = str15;
                                                            str55 = str14;
                                                            arrayList39 = arrayList39;
                                                            str64 = str64;
                                                            arrayList30 = arrayList5;
                                                        }
                                                    }
                                                }
                                                arrayList36 = arrayList36;
                                                str64 = str64;
                                                str42 = str42;
                                                z10 = z10;
                                                arrayList39 = arrayList39;
                                                arrayList40 = arrayList40;
                                                str2 = str43;
                                                arrayList5 = arrayList30;
                                                arrayList2 = arrayList31;
                                                str10 = str56;
                                                str11 = str57;
                                                str58 = str58;
                                                str15 = str59;
                                                str16 = str60;
                                                str12 = str61;
                                                f10 = f14;
                                                arrayList10 = arrayList42;
                                                str13 = str63;
                                                jD3 = jD3;
                                                str14 = str55;
                                                arrayList7 = arrayList43;
                                                j15 = j44;
                                                str17 = str54;
                                                arrayList3 = arrayList34;
                                                arrayList6 = arrayList33;
                                                arrayList9 = arrayList38;
                                                j17 = j41;
                                                arrayList11 = arrayList37;
                                                j13 = j40;
                                                arrayList28 = arrayList35;
                                                arrayList8 = arrayList41;
                                                arrayList4 = arrayList27;
                                                if (d5.a.y(xmlPullParser, str17)) {
                                                    arrayList22 = new ArrayList(arrayList10.size());
                                                    i35 = 0;
                                                    while (i35 < arrayList10.size()) {
                                                        d dVar7 = (d) arrayList10.get(i35);
                                                        s0VarA = dVar7.f18228a.a();
                                                        if (str58 != null) {
                                                            s0VarA.f8124b = str58;
                                                        }
                                                        str39 = dVar7.d;
                                                        if (str39 == null) {
                                                            str39 = str66;
                                                        }
                                                        arrayList23 = dVar7.f18231e;
                                                        ArrayList arrayList75 = arrayList36;
                                                        arrayList23.addAll(arrayList75);
                                                        if (arrayList23.isEmpty()) {
                                                            i37 = 0;
                                                            while (true) {
                                                                if (i37 < arrayList23.size()) {
                                                                    cVar4 = (l3.c) arrayList23.get(i37);
                                                                    j23 = j15;
                                                                    if (h3.h.f7868c.equals(cVar4.f15387b)) {
                                                                    }
                                                                    i37++;
                                                                    j15 = j23;
                                                                } else {
                                                                    j23 = j15;
                                                                    str40 = null;
                                                                }
                                                            }
                                                            if (str40 != null) {
                                                                i38 = 0;
                                                                while (i38 < arrayList23.size()) {
                                                                    cVar = (l3.c) arrayList23.get(i38);
                                                                    int i510 = iG;
                                                                    if (!h3.h.f7867b.equals(cVar.f15387b)) {
                                                                    }
                                                                    i38++;
                                                                    iG = i510;
                                                                    j17 = j17;
                                                                }
                                                            }
                                                            i36 = iG;
                                                            j24 = j17;
                                                            while (size >= 0) {
                                                                cVar2 = (l3.c) arrayList23.get(size);
                                                                if (cVar2.f15389e == null) {
                                                                    while (i39 < arrayList23.size()) {
                                                                        cVar3 = (l3.c) arrayList23.get(i39);
                                                                        if (cVar3.f15389e == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            s0VarA.f8138r = new l3.d(str39, arrayList23);
                                                        } else {
                                                            j23 = j15;
                                                            i36 = iG;
                                                            j24 = j17;
                                                        }
                                                        arrayList24 = dVar7.f18232f;
                                                        arrayList24.addAll(arrayList11);
                                                        t0Var = new t0(s0VarA);
                                                        zVar = dVar7.f18229b;
                                                        sVar = dVar7.f18230c;
                                                        arrayList25 = dVar7.f18233g;
                                                        arrayList26 = dVar7.h;
                                                        if (sVar instanceof r) {
                                                            kVar = new l(t0Var, zVar, (r) sVar, arrayList24, arrayList25, arrayList26);
                                                        } else {
                                                            if (!(sVar instanceof n)) {
                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                            }
                                                            kVar = new k(t0Var, zVar, (n) sVar, arrayList24, arrayList25, arrayList26);
                                                        }
                                                        arrayList22.add(kVar);
                                                        i35++;
                                                        arrayList36 = arrayList75;
                                                        str58 = str58;
                                                        iG = i36;
                                                        j15 = j23;
                                                        j17 = j24;
                                                    }
                                                    c10 = 1;
                                                    arrayList5.add(new a(i41, iG, arrayList22, arrayList9, arrayList40, arrayList8));
                                                    str3 = str52;
                                                    j11 = j17;
                                                    str4 = str11;
                                                    str5 = str10;
                                                } else {
                                                    long j67 = j17;
                                                    c10 = 1;
                                                    arrayList37 = arrayList11;
                                                    str60 = str16;
                                                    arrayList42 = arrayList10;
                                                    arrayList27 = arrayList4;
                                                    arrayList33 = arrayList6;
                                                    str63 = str13;
                                                    z10 = z10;
                                                    str58 = str58;
                                                    arrayList38 = arrayList9;
                                                    arrayList41 = arrayList8;
                                                    str43 = str2;
                                                    f14 = f10;
                                                    arrayList40 = arrayList40;
                                                    str61 = str12;
                                                    str42 = str42;
                                                    arrayList31 = arrayList2;
                                                    arrayList36 = arrayList36;
                                                    str57 = str11;
                                                    str56 = str10;
                                                    str54 = str17;
                                                    arrayList35 = arrayList28;
                                                    j40 = j13;
                                                    arrayList34 = arrayList3;
                                                    arrayList43 = arrayList7;
                                                    j41 = j67;
                                                    j44 = j15;
                                                    str59 = str15;
                                                    str55 = str14;
                                                    arrayList39 = arrayList39;
                                                    str64 = str64;
                                                    arrayList30 = arrayList5;
                                                }
                                            }
                                        } else {
                                            str = str49;
                                            j31 = j31;
                                            str42 = str42;
                                            String str93 = str50;
                                            String str94 = str51;
                                            z10 = z10;
                                            str2 = str43;
                                            long j68 = j41;
                                            long j69 = j44;
                                            ArrayList arrayList76 = arrayList30;
                                            arrayList2 = arrayList31;
                                            arrayList3 = arrayList32;
                                            j13 = j40;
                                            arrayList28 = arrayList28;
                                            arrayList4 = arrayList27;
                                            if (d5.a.z(xmlPullParser, "EventStream")) {
                                                str3 = str52;
                                                String attributeValue28 = xmlPullParser.getAttributeValue(null, str3);
                                                String str95 = attributeValue28 == null ? "" : attributeValue28;
                                                str4 = str94;
                                                String attributeValue29 = xmlPullParser.getAttributeValue(null, str4);
                                                String str96 = attributeValue29 == null ? "" : attributeValue29;
                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long j70 = attributeValue30 == null ? 1L : Long.parseLong(attributeValue30);
                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long j71 = attributeValue31 == null ? 0L : Long.parseLong(attributeValue31);
                                                ArrayList arrayList77 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str97 = "Event";
                                                    if (d5.a.z(xmlPullParser, "Event")) {
                                                        str6 = str;
                                                        String attributeValue32 = xmlPullParser.getAttributeValue(null, str6);
                                                        long j72 = attributeValue32 == null ? 0L : Long.parseLong(attributeValue32);
                                                        String str98 = str93;
                                                        String attributeValue33 = xmlPullParser.getAttributeValue(null, str98);
                                                        long j73 = attributeValue33 == null ? -9223372036854775807L : Long.parseLong(attributeValue33);
                                                        String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long j74 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                        long jO = g0.O(j73, 1000L, j70);
                                                        long jO2 = g0.O(j74 - j71, 1000000L, j70);
                                                        String attributeValue35 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue35 == null) {
                                                            attributeValue35 = null;
                                                        }
                                                        byteArrayOutputStream.reset();
                                                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, o8.d.f19363c.name());
                                                        xmlPullParser.nextToken();
                                                        while (!d5.a.y(xmlPullParser, str97)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    str97 = str97;
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    str97 = str97;
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    xmlSerializerNewSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i60 = 0;
                                                                    while (i60 < xmlPullParser.getAttributeCount()) {
                                                                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i60), xmlPullParser.getAttributeName(i60), xmlPullParser.getAttributeValue(i60));
                                                                        i60++;
                                                                        str95 = str95;
                                                                        str96 = str96;
                                                                    }
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 3:
                                                                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 4:
                                                                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 5:
                                                                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 6:
                                                                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 7:
                                                                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 8:
                                                                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 9:
                                                                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                case 10:
                                                                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                                default:
                                                                    str7 = str95;
                                                                    str8 = str96;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            str97 = str97;
                                                            str95 = str7;
                                                            str96 = str8;
                                                        }
                                                        String str99 = str95;
                                                        String str100 = str96;
                                                        xmlSerializerNewSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long lValueOf = Long.valueOf(jO2);
                                                        if (attributeValue35 != null) {
                                                            byteArray = attributeValue35.getBytes(o8.d.f19363c);
                                                        }
                                                        str5 = str98;
                                                        str95 = str99;
                                                        str96 = str100;
                                                        arrayList77.add(Pair.create(lValueOf, new b4.a(str95, str96, jO, j72, byteArray)));
                                                    } else {
                                                        str6 = str;
                                                        str5 = str93;
                                                        b(xmlPullParser);
                                                    }
                                                    if (d5.a.y(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList77.size()];
                                                        b4.a[] aVarArr = new b4.a[arrayList77.size()];
                                                        for (int i61 = 0; i61 < arrayList77.size(); i61++) {
                                                            Pair pair = (Pair) arrayList77.get(i61);
                                                            jArr[i61] = ((Long) pair.first).longValue();
                                                            aVarArr[i61] = (b4.a) pair.second;
                                                        }
                                                        arrayList2.add(new g(str95, str96, jArr, aVarArr));
                                                        arrayList5 = arrayList76;
                                                        str = str6;
                                                        j15 = j69;
                                                        j11 = j68;
                                                    } else {
                                                        str = str6;
                                                        str93 = str5;
                                                        str4 = str4;
                                                    }
                                                }
                                            } else {
                                                str3 = str52;
                                                str4 = str94;
                                                str5 = str93;
                                                if (d5.a.z(xmlPullParser, "SegmentBase")) {
                                                    sVarR = p(xmlPullParser, null);
                                                    arrayList2 = arrayList2;
                                                    arrayList5 = arrayList76;
                                                    j15 = j69;
                                                    j11 = j68;
                                                    j12 = -9223372036854775807L;
                                                } else if (d5.a.z(xmlPullParser, "SegmentList")) {
                                                    j12 = -9223372036854775807L;
                                                    long jD9 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList2 = arrayList2;
                                                    sVarR = q(xmlPullParser, null, j43, j69, j14, jD9, j68);
                                                    j15 = j69;
                                                    j45 = jD9;
                                                    arrayList5 = arrayList76;
                                                    j11 = j68;
                                                } else {
                                                    j15 = j69;
                                                    j12 = -9223372036854775807L;
                                                    if (d5.a.z(xmlPullParser, "SegmentTemplate")) {
                                                        arrayList2 = arrayList2;
                                                        long jD10 = d(xmlPullParser, -9223372036854775807L);
                                                        x xVar = z.f45604b;
                                                        arrayList5 = arrayList76;
                                                        j11 = j68;
                                                        sVarR = r(xmlPullParser, null, l0.f45555e, j43, j15, j14, jD10, j11);
                                                        j45 = jD10;
                                                    } else {
                                                        arrayList5 = arrayList76;
                                                        j11 = j68;
                                                        if (d5.a.z(xmlPullParser, "AssetIdentifier")) {
                                                            arrayList2 = arrayList2;
                                                            i(xmlPullParser, "AssetIdentifier");
                                                        } else {
                                                            arrayList2 = arrayList2;
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        j12 = -9223372036854775807L;
                                    }
                                    if (d5.a.y(xmlPullParser, obj)) {
                                        Pair pairCreate2 = Pair.create(new h(attributeValue11, j42, arrayList5, arrayList2), Long.valueOf(j15));
                                        h hVar = (h) pairCreate2.first;
                                        if (hVar.f18245b != j12) {
                                            long jLongValue = ((Long) pairCreate2.second).longValue();
                                            long j75 = jLongValue == j12 ? j12 : jLongValue + hVar.f18245b;
                                            arrayList27 = arrayList4;
                                            arrayList27.add(hVar);
                                            j31 = j75;
                                        } else {
                                            if (!zEquals) {
                                                throw t1.b("Unable to determine start of period " + arrayList4.size(), null);
                                            }
                                            arrayList27 = arrayList4;
                                            z13 = true;
                                        }
                                    } else {
                                        long j76 = j15;
                                        arrayList32 = arrayList3;
                                        j44 = j76;
                                        obj = obj;
                                        str52 = str3;
                                        arrayList27 = arrayList4;
                                        arrayList28 = arrayList28;
                                        j40 = j13;
                                        jD2 = j14;
                                        arrayList29 = arrayList;
                                        j31 = j31;
                                        str50 = str5;
                                        str49 = str;
                                        str43 = str2;
                                        str42 = str42;
                                        arrayList30 = arrayList5;
                                        arrayList31 = arrayList2;
                                        j41 = j11;
                                        z10 = z10;
                                        str51 = str4;
                                    }
                                }
                            }
                            jD = j13;
                        }
                        if (d5.a.y(xmlPullParser, "MPD")) {
                            if (j26 == j12) {
                                if (j31 != j12) {
                                    j26 = j31;
                                } else if (!zEquals) {
                                    throw t1.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList27.isEmpty()) {
                                throw t1.b("No periods found.", null);
                            }
                            return new c(jK, j26, j27, zEquals, j28, j11, j30, jK2, iVar, bVar, a1Var, uriH, arrayList27);
                        }
                        arrayList27 = arrayList27;
                        j29 = j11;
                        j25 = j12;
                        arrayList28 = arrayList28;
                        arrayListK = arrayListK;
                        z10 = z10;
                        j31 = j31;
                        str41 = null;
                    }
                }
                j12 = j10;
            }
            j11 = j29;
            if (d5.a.y(xmlPullParser, "MPD")) {
                if (j26 == j12) {
                    if (j31 != j12) {
                        j26 = j31;
                    } else if (!zEquals) {
                        throw t1.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList27.isEmpty()) {
                    return new c(jK, j26, j27, zEquals, j28, j11, j30, jK2, iVar, bVar, a1Var, uriH, arrayList27);
                }
                throw t1.b("No periods found.", null);
            }
            arrayList27 = arrayList27;
            j29 = j11;
            j25 = j12;
            arrayList28 = arrayList28;
            arrayListK = arrayListK;
            z10 = z10;
            j31 = j31;
            str41 = null;
        }
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return new j(j10, j11, attributeValue);
        }
        j10 = 0;
        j11 = -1;
        return new j(j10, j11, attributeValue);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (d0.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f18238a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j10 = rVar != null ? rVar.f18274b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.f18275c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.d : 0L;
        long j15 = rVar != null ? rVar.f18272e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVarM = rVar != null ? rVar.f18273a : null;
        while (true) {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarM;
            if (d5.a.y(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j11, j13, j17, j16);
            }
            jVarM = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = oVar != null ? oVar.f18274b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.f18275c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.f18262e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVarM = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (d5.a.z(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j16, j11);
            } else if (d5.a.z(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarM == null) {
                jVarM = oVar.f18273a;
            }
            if (listS == null) {
                listS = oVar.f18263f;
            }
            if (arrayList == null) {
                arrayList = oVar.f18266j;
            }
        }
        return new o(jVarM, j16, j18, j22, j20, listS, j24, arrayList, g0.H(j14), g0.H(j10));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = pVar != null ? pVar.f18274b : 1L;
        j jVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.f18275c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.f18262e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (d0.a("http://dashif.org/guidelines/last-segment-number", fVar.f18238a)) {
                j15 = Long.parseLong(fVar.f18239b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        u5.k kVarT = t(xmlPullParser, "media", pVar != null ? pVar.f18268k : null);
        u5.k kVarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.f18267j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (d5.a.z(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarM == null) {
                jVarM = pVar.f18273a;
            }
            if (listS == null) {
                listS = pVar.f18263f;
            }
        }
        return new p(jVarM, j17, j19, j23, j24, j21, listS, j26, kVarT2, kVarT, g0.H(j14), g0.H(j10));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (d5.a.z(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i11, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != -9223372036854775807L) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!d5.a.y(xmlPullParser, "SegmentTimeline"));
        if (!z10) {
            return arrayList;
        }
        a(arrayList, jA, j13, i10, g0.O(j11, j10, 1000L));
        return arrayList;
    }

    public static u5.k t(XmlPullParser xmlPullParser, String str, u5.k kVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return kVar;
        }
        ?? r14 = new String[5];
        ?? r10 = new int[4];
        ?? r11 = new String[4];
        r14[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                r14[i10] = r14[i10] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                r14[i10] = r14[i10] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                r14[i10] = a9.p.p(new StringBuilder(), r14[i10], "$");
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i11);
                String strSubstring2 = attributeValue.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    r10[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            r10[i10] = 2;
                            break;
                        case "Time":
                            r10[i10] = 4;
                            break;
                        case "Bandwidth":
                            r10[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    r11[i10] = strSubstring;
                }
                i10++;
                r14[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new u5.k((Serializable) r14, (Serializable) r10, (Serializable) r11, i10);
    }

    @Override
    public final Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) throws t1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f18237a.newPullParser();
            xmlPullParserNewPullParser.setInput(oVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw t1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e9) {
            throw t1.b(null, e9);
        }
    }
}
