package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
public final class w03 {
    public static final lj4 a;

    static {
        qw5 qw5Var = new qw5();
        s60 s60Var = s60.a;
        qw5Var.a(s03.class, s60Var);
        qw5Var.a(a90.class, s60Var);
        a70 a70Var = a70.a;
        qw5Var.a(r03.class, a70Var);
        qw5Var.a(l90.class, a70Var);
        x60 x60Var = x60.a;
        qw5Var.a(zz2.class, x60Var);
        qw5Var.a(m90.class, x60Var);
        y60 y60Var = y60.a;
        qw5Var.a(yz2.class, y60Var);
        qw5Var.a(n90.class, y60Var);
        q70 q70Var = q70.a;
        qw5Var.a(q03.class, q70Var);
        qw5Var.a(la0.class, q70Var);
        p70 p70Var = p70.a;
        qw5Var.a(p03.class, p70Var);
        qw5Var.a(ka0.class, p70Var);
        z60 z60Var = z60.a;
        qw5Var.a(a03.class, z60Var);
        qw5Var.a(p90.class, z60Var);
        k70 k70Var = k70.a;
        qw5Var.a(o03.class, k70Var);
        qw5Var.a(r90.class, k70Var);
        b70 b70Var = b70.a;
        qw5Var.a(i03.class, b70Var);
        qw5Var.a(t90.class, b70Var);
        d70 d70Var = d70.a;
        qw5Var.a(g03.class, d70Var);
        qw5Var.a(u90.class, d70Var);
        g70 g70Var = g70.a;
        qw5Var.a(f03.class, g70Var);
        qw5Var.a(y90.class, g70Var);
        h70 h70Var = h70.a;
        qw5Var.a(e03.class, h70Var);
        qw5Var.a(aa0.class, h70Var);
        e70 e70Var = e70.a;
        qw5Var.a(c03.class, e70Var);
        qw5Var.a(w90.class, e70Var);
        q60 q60Var = q60.a;
        qw5Var.a(sz2.class, q60Var);
        qw5Var.a(d90.class, q60Var);
        p60 p60Var = p60.a;
        qw5Var.a(rz2.class, p60Var);
        qw5Var.a(e90.class, p60Var);
        v60 v60Var = v60.a;
        qw5Var.a(xz2.class, v60Var);
        qw5Var.a(i90.class, v60Var);
        w60 w60Var = w60.a;
        qw5Var.a(wz2.class, w60Var);
        qw5Var.a(j90.class, w60Var);
        f70 f70Var = f70.a;
        qw5Var.a(d03.class, f70Var);
        qw5Var.a(x90.class, f70Var);
        c70 c70Var = c70.a;
        qw5Var.a(b03.class, c70Var);
        qw5Var.a(v90.class, c70Var);
        r60 r60Var = r60.a;
        qw5Var.a(tz2.class, r60Var);
        qw5Var.a(f90.class, r60Var);
        i70 i70Var = i70.a;
        qw5Var.a(h03.class, i70Var);
        qw5Var.a(ba0.class, i70Var);
        j70 j70Var = j70.a;
        qw5Var.a(j03.class, j70Var);
        qw5Var.a(da0.class, j70Var);
        l70 l70Var = l70.a;
        qw5Var.a(k03.class, l70Var);
        qw5Var.a(ea0.class, l70Var);
        o70 o70Var = o70.a;
        qw5Var.a(n03.class, o70Var);
        qw5Var.a(ia0.class, o70Var);
        m70 m70Var = m70.a;
        qw5Var.a(m03.class, m70Var);
        qw5Var.a(ga0.class, m70Var);
        n70 n70Var = n70.a;
        qw5Var.a(l03.class, n70Var);
        qw5Var.a(ha0.class, n70Var);
        t60 t60Var = t60.a;
        qw5Var.a(vz2.class, t60Var);
        qw5Var.a(g90.class, t60Var);
        u60 u60Var = u60.a;
        qw5Var.a(uz2.class, u60Var);
        qw5Var.a(h90.class, u60Var);
        qw5Var.d = true;
        a = new lj4(qw5Var);
    }

    public static d90 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.i = b(jsonReader, new a32((byte) 28));
                    break;
                case 1:
                    obj.a = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 1);
                    break;
                case 2:
                    obj.e = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 8);
                    break;
                case 3:
                    obj.f = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 16);
                    break;
                case 4:
                    obj.g = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        gxc.d("Null processName");
                        return null;
                    }
                case 6:
                    obj.c = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 2);
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List b(JsonReader jsonReader, v03 v03Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(v03Var.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static f90 c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        gxc.d("Null value");
                        return null;
                    }
                }
            } else {
                str = jsonReader.nextString();
                if (str == null) {
                    gxc.d("Null key");
                    return null;
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new f90(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }

    public static defpackage.r90 d(android.util.JsonReader r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.d(android.util.JsonReader):r90");
    }

    public static defpackage.w90 e(android.util.JsonReader r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.e(android.util.JsonReader):w90");
    }

    public static aa0 f(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.d = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        gxc.d("Null symbol");
                        return null;
                    }
                case 2:
                    obj.a = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 1);
                    break;
                case 3:
                    obj.c = jsonReader.nextString();
                    break;
                case 4:
                    obj.e = jsonReader.nextInt();
                    obj.f = (byte) (obj.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static ba0 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.a = jsonReader.nextInt();
                    obj.d = (byte) (obj.d | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.e = nextString;
                        break;
                    } else {
                        gxc.d("Null processName");
                        return null;
                    }
                case 2:
                    obj.c = jsonReader.nextBoolean();
                    obj.d = (byte) (obj.d | 4);
                    break;
                case 3:
                    obj.b = jsonReader.nextInt();
                    obj.d = (byte) (obj.d | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static i90 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        j90 j90Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("profilingTrigger")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                boolean z = false;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("trigger")) {
                        jsonReader.skipValue();
                    } else {
                        i = jsonReader.nextInt();
                        z = true;
                    }
                }
                jsonReader.endObject();
                if (z) {
                    j90Var = new j90(i);
                } else {
                    dq9.m("Missing required properties: trigger");
                    return null;
                }
            }
        }
        jsonReader.endObject();
        if (j90Var != null) {
            return new i90(j90Var);
        }
        dq9.m("Missing required properties: profilingTrigger");
        return null;
    }

    public static a90 i(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = s03.a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str = jsonReader.nextString();
                            }
                        } else {
                            list = b(jsonReader, new a32((byte) 29));
                            if (list == null) {
                                gxc.d("Null files");
                                return null;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.k = new g90(str, list);
                        break;
                    } else {
                        dq9.m("Missing required properties: files");
                        return null;
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.a = nextString;
                        break;
                    } else {
                        gxc.d("Null sdkVersion");
                        return null;
                    }
                case 2:
                    obj.g = jsonReader.nextString();
                    break;
                case 3:
                    obj.l = a(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.h = nextString2;
                        break;
                    } else {
                        gxc.d("Null buildVersion");
                        return null;
                    }
                case 5:
                    obj.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.b = nextString3;
                        break;
                    } else {
                        gxc.d("Null gmpAppId");
                        return null;
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        gxc.d("Null installationUuid");
                        return null;
                    }
                case '\b':
                    obj.e = jsonReader.nextString();
                    break;
                case '\t':
                    obj.c = jsonReader.nextInt();
                    obj.m = (byte) (obj.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.i = nextString5;
                        break;
                    } else {
                        gxc.d("Null displayVersion");
                        return null;
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f = false;
                    obj2.m = (byte) (obj2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
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
                                obj2.d = jsonReader.nextLong();
                                obj2.m = (byte) (obj2.m | 1);
                                break;
                            case 1:
                                obj2.c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.b = new String(Base64.decode(jsonReader.nextString(), 2), s03.a);
                                break;
                            case 3:
                                obj2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
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
                                            obj3.f = jsonReader.nextBoolean();
                                            obj3.j = (byte) (obj3.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.h = nextString6;
                                                break;
                                            } else {
                                                gxc.d("Null manufacturer");
                                                return null;
                                            }
                                        case 2:
                                            obj3.d = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 4);
                                            break;
                                        case 3:
                                            obj3.a = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 1);
                                            break;
                                        case 4:
                                            obj3.e = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 8);
                                            break;
                                        case 5:
                                            obj3.c = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.b = nextString7;
                                                break;
                                            } else {
                                                gxc.d("Null model");
                                                return null;
                                            }
                                        case 7:
                                            obj3.g = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.i = nextString8;
                                                break;
                                            } else {
                                                gxc.d("Null modelClass");
                                                return null;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.j = obj3.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            break;
                                        default:
                                            z = true;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.c = nextString9;
                                                break;
                                            } else {
                                                gxc.d("Null buildVersion");
                                                return null;
                                            }
                                        case true:
                                            obj4.d = jsonReader.nextBoolean();
                                            obj4.e = (byte) (obj4.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.b = nextString10;
                                                break;
                                            } else {
                                                gxc.d("Null version");
                                                return null;
                                            }
                                        case true:
                                            obj4.a = jsonReader.nextInt();
                                            obj4.e = (byte) (obj4.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.i = obj4.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                z2 = false;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = true;
                                            break;
                                        default:
                                            z2 = true;
                                            break;
                                    }
                                    switch (z2) {
                                        case false:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                gxc.d("Null identifier");
                                                return null;
                                            }
                                        case true:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                gxc.d("Null version");
                                                return null;
                                            }
                                        case true:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 != null && str2 != null) {
                                    obj2.g = new m90(str7, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    dq9.m(ts2.n("Missing required properties:", sb));
                                    return null;
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            gxc.d("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.h = new la0(str8);
                                    break;
                                } else {
                                    dq9.m("Missing required properties: identifier");
                                    return null;
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.a = nextString11;
                                    break;
                                } else {
                                    gxc.d("Null generator");
                                    return null;
                                }
                            case '\n':
                                obj2.f = jsonReader.nextBoolean();
                                obj2.m = (byte) (obj2.m | 2);
                                break;
                            case 11:
                                obj2.l = jsonReader.nextInt();
                                obj2.m = (byte) (obj2.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.j = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static a90 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a90 i = i(jsonReader);
            jsonReader.close();
            return i;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
