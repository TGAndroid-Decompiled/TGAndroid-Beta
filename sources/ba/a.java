package ba;

import aa.a0;
import aa.a1;
import aa.a2;
import aa.b;
import aa.b1;
import aa.b2;
import aa.c;
import aa.c0;
import aa.c1;
import aa.c2;
import aa.d0;
import aa.d2;
import aa.e;
import aa.e0;
import aa.e2;
import aa.f;
import aa.f0;
import aa.f2;
import aa.g;
import aa.g0;
import aa.g2;
import aa.h;
import aa.h1;
import aa.i;
import aa.i0;
import aa.i1;
import aa.j;
import aa.j0;
import aa.j1;
import aa.k;
import aa.k0;
import aa.k1;
import aa.l;
import aa.l0;
import aa.l1;
import aa.m;
import aa.m1;
import aa.n;
import aa.n0;
import aa.n1;
import aa.o;
import aa.o0;
import aa.o1;
import aa.p;
import aa.p0;
import aa.p1;
import aa.q;
import aa.q0;
import aa.q1;
import aa.r;
import aa.r0;
import aa.r1;
import aa.s;
import aa.s0;
import aa.s1;
import aa.t;
import aa.t0;
import aa.t1;
import aa.u;
import aa.u0;
import aa.u1;
import aa.v;
import aa.v0;
import aa.v1;
import aa.w;
import aa.w0;
import aa.w1;
import aa.x;
import aa.x0;
import aa.x1;
import aa.y;
import aa.y0;
import aa.y1;
import aa.z;
import aa.z0;
import aa.z1;
import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import li.h5;
import ma.d;
import org.telegram.ui.Components.b10;
public final class a {
    public static final h5 f3719a;

    static {
        d dVar = new d();
        aa.d dVar2 = aa.d.f1050a;
        dVar.d(g2.class, dVar2);
        dVar.d(a0.class, dVar2);
        j jVar = j.f1118a;
        dVar.d(f2.class, jVar);
        dVar.d(i0.class, jVar);
        g gVar = g.f1083a;
        dVar.d(n1.class, gVar);
        dVar.d(j0.class, gVar);
        h hVar = h.f1092a;
        dVar.d(m1.class, hVar);
        dVar.d(k0.class, hVar);
        z zVar = z.f1232a;
        dVar.d(e2.class, zVar);
        dVar.d(c1.class, zVar);
        y yVar = y.f1226a;
        dVar.d(d2.class, yVar);
        dVar.d(b1.class, yVar);
        i iVar = i.f1102a;
        dVar.d(o1.class, iVar);
        dVar.d(l0.class, iVar);
        t tVar = t.f1197a;
        dVar.d(c2.class, tVar);
        dVar.d(n0.class, tVar);
        k kVar = k.f1132a;
        dVar.d(w1.class, kVar);
        dVar.d(o0.class, kVar);
        m mVar = m.f1146a;
        dVar.d(u1.class, mVar);
        dVar.d(p0.class, mVar);
        p pVar = p.f1170a;
        dVar.d(t1.class, pVar);
        dVar.d(t0.class, pVar);
        q qVar = q.f1176a;
        dVar.d(s1.class, qVar);
        dVar.d(u0.class, qVar);
        n nVar = n.f1154a;
        dVar.d(q1.class, nVar);
        dVar.d(r0.class, nVar);
        b bVar = b.f1024a;
        dVar.d(i1.class, bVar);
        dVar.d(c0.class, bVar);
        aa.a aVar = aa.a.f1012a;
        dVar.d(h1.class, aVar);
        dVar.d(d0.class, aVar);
        o oVar = o.f1162a;
        dVar.d(r1.class, oVar);
        dVar.d(s0.class, oVar);
        l lVar = l.f1137a;
        dVar.d(p1.class, lVar);
        dVar.d(q0.class, lVar);
        c cVar = c.f1040a;
        dVar.d(j1.class, cVar);
        dVar.d(e0.class, cVar);
        r rVar = r.f1183a;
        dVar.d(v1.class, rVar);
        dVar.d(v0.class, rVar);
        s sVar = s.f1189a;
        dVar.d(x1.class, sVar);
        dVar.d(w0.class, sVar);
        u uVar = u.f1205a;
        dVar.d(y1.class, uVar);
        dVar.d(x0.class, uVar);
        x xVar = x.f1223a;
        dVar.d(b2.class, xVar);
        dVar.d(a1.class, xVar);
        v vVar = v.f1210a;
        dVar.d(a2.class, vVar);
        dVar.d(y0.class, vVar);
        w wVar = w.f1216a;
        dVar.d(z1.class, wVar);
        dVar.d(z0.class, wVar);
        e eVar = e.f1065a;
        dVar.d(l1.class, eVar);
        dVar.d(f0.class, eVar);
        f fVar = f.f1074a;
        dVar.d(k1.class, fVar);
        dVar.d(g0.class, fVar);
        dVar.d = true;
        f3719a = new h5(dVar);
    }

    public static u0 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f615b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f614a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f616c = jsonReader.nextString();
                    break;
                case 4:
                    obj.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.r();
    }

    public static e0 b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new e0(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static c0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f1036i = d(jsonReader, new ag.w(12));
                    break;
                case 1:
                    obj.f1031a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    obj.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    obj.h = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f1032b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f1033c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    obj.f1035g = jsonReader.nextString();
                    break;
                case '\b':
                    obj.f1034f = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, ag.w wVar) {
        Object d0Var;
        boolean z10;
        char c10;
        String str;
        Object obj;
        boolean z11;
        char c11;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str2 = " name";
            String str3 = "";
            String str4 = null;
            Long l4 = null;
            String str5 = null;
            String str6 = null;
            switch (wVar.f1386a) {
                case 12:
                    jsonReader.beginObject();
                    String str7 = null;
                    String str8 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                        switch (z10) {
                            case false:
                                str7 = jsonReader.nextString();
                                if (str7 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null libraryName");
                                }
                            case true:
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    str4 = nextString;
                                    break;
                                } else {
                                    throw new NullPointerException("Null arch");
                                }
                            case true:
                                str8 = jsonReader.nextString();
                                if (str8 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null buildId");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str4 == null) {
                        str3 = " arch";
                    }
                    if (str7 == null) {
                        str3 = str3.concat(" libraryName");
                    }
                    if (str8 == null) {
                        str3 = b10.u(str3, " buildId");
                    }
                    if (str3.isEmpty()) {
                        d0Var = new d0(str4, str7, str8);
                        continue;
                        arrayList.add(d0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 13:
                    jsonReader.beginObject();
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("filename")) {
                            if (!nextName2.equals("contents")) {
                                jsonReader.skipValue();
                            } else {
                                bArr = Base64.decode(jsonReader.nextString(), 2);
                                if (bArr == null) {
                                    throw new NullPointerException("Null contents");
                                }
                            }
                        } else {
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                str6 = nextString2;
                            } else {
                                throw new NullPointerException("Null filename");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str6 == null) {
                        str3 = " filename";
                    }
                    if (bArr == null) {
                        str3 = str3.concat(" contents");
                    }
                    if (str3.isEmpty()) {
                        obj = new g0(str6, bArr);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 14:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c10 = 3;
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
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    obj2.f7757a = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case 1:
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                String str9 = null;
                                String str10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (!nextName4.equals("variantId")) {
                                        if (!nextName4.equals("rolloutId")) {
                                            jsonReader.skipValue();
                                        } else {
                                            str9 = jsonReader.nextString();
                                            if (str9 == null) {
                                                throw new NullPointerException("Null rolloutId");
                                            }
                                        }
                                    } else {
                                        str10 = jsonReader.nextString();
                                        if (str10 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str9 != null) {
                                    str = "";
                                } else {
                                    str = " rolloutId";
                                }
                                if (str10 == null) {
                                    str = str.concat(" variantId");
                                }
                                if (str.isEmpty()) {
                                    obj2.f7758b = new z0(str9, str10);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    obj2.f7759c = nextString4;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterValue");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    d0Var = obj2.e();
                    continue;
                    arrayList.add(d0Var);
                case 15:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        switch (z11) {
                            case false:
                                list = d(jsonReader, new ag.w(17));
                                if (list != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 != null) {
                                    str5 = nextString5;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case true:
                                num = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str5 != null) {
                        str2 = "";
                    }
                    if (num == null) {
                        str2 = str2.concat(" importance");
                    }
                    if (list == null) {
                        str2 = b10.u(str2, " frames");
                    }
                    if (str2.isEmpty()) {
                        obj = new t0(str5, num.intValue(), list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                case 16:
                    jsonReader.beginObject();
                    Long l10 = null;
                    String str11 = null;
                    String str12 = null;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                String nextString6 = jsonReader.nextString();
                                if (nextString6 != null) {
                                    str11 = nextString6;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case 1:
                                l10 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), g2.f1091a);
                                break;
                            case 3:
                                l4 = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (l4 == null) {
                        str3 = " baseAddress";
                    }
                    if (l10 == null) {
                        str3 = str3.concat(" size");
                    }
                    if (str11 == null) {
                        str3 = b10.u(str3, " name");
                    }
                    if (str3.isEmpty()) {
                        d0Var = new q0(str11, l4.longValue(), l10.longValue(), str12);
                        continue;
                        arrayList.add(d0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                default:
                    d0Var = a(jsonReader);
                    continue;
                    arrayList.add(d0Var);
            }
            d0Var = obj;
            arrayList.add(d0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static n0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        List list;
        String str;
        char c13;
        List list2;
        List list3;
        String str2;
        char c14;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                obj2.f1151b = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f1152c = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                obj2.e = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                obj2.f1153f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                obj2.f1150a = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                obj2.d = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.d = obj2.g();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d = d(jsonReader, new ag.w(14));
                            if (d != null) {
                                list4 = d;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list4 == null) {
                        str3 = " rolloutAssignments";
                    }
                    if (str3.isEmpty()) {
                        obj.f1153f = new a1(list4);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 2:
                    jsonReader.beginObject();
                    char c15 = 5;
                    p0 p0Var = null;
                    List list5 = null;
                    List list6 = null;
                    Boolean bool = null;
                    v0 v0Var = null;
                    List list7 = null;
                    Integer num = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c12 = c15;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                List list8 = list5;
                                list = list6;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list7 = DesugarCollections.unmodifiableList(arrayList);
                                list5 = list8;
                                list6 = list;
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                list5 = list5;
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list9 = null;
                                r0 r0Var = null;
                                c0 c0Var = null;
                                s0 s0Var = null;
                                List list10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            list2 = list5;
                                            list3 = list6;
                                            c0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new ag.w(15));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str4 = null;
                                            String str5 = null;
                                            Long l4 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c14 = 0;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c14 = 1;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c14 = 2;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    default:
                                                        c14 = 65535;
                                                        break;
                                                }
                                                switch (c14) {
                                                    case 0:
                                                        l4 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        str5 = jsonReader.nextString();
                                                        if (str5 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case 2:
                                                        str4 = jsonReader.nextString();
                                                        if (str4 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (str4 != null) {
                                                str2 = "";
                                            } else {
                                                str2 = " name";
                                            }
                                            if (str5 == null) {
                                                str2 = str2.concat(" code");
                                            }
                                            if (l4 == null) {
                                                str2 = b10.u(str2, " address");
                                            }
                                            if (str2.isEmpty()) {
                                                list2 = list5;
                                                list3 = list6;
                                                s0Var = new s0(l4.longValue(), str4, str5);
                                                break;
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str2));
                                            }
                                        case 3:
                                            list10 = d(jsonReader, new ag.w(16));
                                            if (list10 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            break;
                                        case 4:
                                            r0Var = f(jsonReader);
                                            list2 = list5;
                                            list3 = list6;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            list2 = list5;
                                            list3 = list6;
                                            break;
                                    }
                                    list5 = list2;
                                    list6 = list3;
                                }
                                List list11 = list5;
                                list = list6;
                                jsonReader.endObject();
                                if (s0Var != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (list10 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    list5 = list11;
                                    p0Var = new p0(list9, r0Var, c0Var, s0Var, list10);
                                    list6 = list;
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list6 = DesugarCollections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list5 = DesugarCollections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 6:
                                v0Var = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        c15 = 5;
                    }
                    List list12 = list5;
                    List list13 = list6;
                    jsonReader.endObject();
                    if (p0Var == null) {
                        str3 = " execution";
                    }
                    if (num == null) {
                        str3 = str3.concat(" uiOrientation");
                    }
                    if (str3.isEmpty()) {
                        obj.f1152c = new o0(p0Var, list12, list13, bool, v0Var, list7, num.intValue());
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str6 = nextString;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str6 == null) {
                        str3 = " content";
                    }
                    if (str3.isEmpty()) {
                        obj.e = new x0(str6);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f1151b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f1150a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.f();
    }

    public static r0 f(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        r0 r0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    List d = d(jsonReader, new ag.w(17));
                    if (d != null) {
                        list = d;
                        break;
                    } else {
                        throw new NullPointerException("Null frames");
                    }
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        str2 = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    r0Var = f(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = "";
        }
        if (list == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = b10.u(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new r0(str2, str3, list, r0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static v0 g(JsonReader jsonReader) {
        ti.e eVar = new ti.e(1, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    eVar.f49182c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        eVar.f49181b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    eVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case 3:
                    eVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return eVar.c();
    }

    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        String str2;
        char c13;
        char c14;
        Charset charset = g2.f1091a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str4 = jsonReader.nextString();
                            }
                        } else {
                            list = d(jsonReader, new ag.w(13));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        str3 = " files";
                    }
                    String str5 = str3;
                    if (str5.isEmpty()) {
                        obj.f461j = new f0(str4, list);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f455a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f458f = jsonReader.nextString();
                    break;
                case 3:
                    obj.f462k = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f459g = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f456b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 7:
                    obj.e = jsonReader.nextString();
                    break;
                case '\b':
                    obj.f457c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.h = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\n':
                    ?? obj2 = new Object();
                    obj2.f1096f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                obj2.f1095c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f1094b = new String(Base64.decode(jsonReader.nextString(), 2), g2.f1091a);
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
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c13 = 5;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c13 = 6;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c13 = 7;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c13 = '\b';
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            obj3.h = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.f1035g = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            obj3.f1031a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            obj3.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            obj3.f1033c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f1032b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f1034f = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f1036i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f1099j = obj3.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f1100k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ti.e eVar = new ti.e(2, false);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                eVar.d = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            eVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                eVar.f49182c = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            eVar.f49181b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f1098i = eVar.d();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            str6 = jsonReader.nextString();
                                            if (str6 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str10 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str11 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str9 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str8 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str6 != null) {
                                    str = "";
                                } else {
                                    str = " identifier";
                                }
                                if (str7 == null) {
                                    str = str.concat(" version");
                                }
                                if (str.isEmpty()) {
                                    obj2.f1097g = new j0(str6, str7, str8, str9, str10, str11);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str12 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str12 = jsonReader.nextString();
                                        if (str12 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str12 != null) {
                                    str2 = "";
                                } else {
                                    str2 = " identifier";
                                }
                                if (str2.isEmpty()) {
                                    obj2.h = new c1(str12);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f1093a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f1096f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                obj2.f1101l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f460i = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static a0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 h = h(jsonReader);
            jsonReader.close();
            return h;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
