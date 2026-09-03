package l9;

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import k9.a0;
import k9.a1;
import k9.a2;
import k9.b;
import k9.b0;
import k9.b2;
import k9.c;
import k9.c0;
import k9.c2;
import k9.d0;
import k9.d2;
import k9.e;
import k9.e0;
import k9.e2;
import k9.f;
import k9.f0;
import k9.f1;
import k9.g;
import k9.g1;
import k9.h;
import k9.h0;
import k9.h1;
import k9.i;
import k9.i0;
import k9.i1;
import k9.j;
import k9.j0;
import k9.j1;
import k9.k;
import k9.k0;
import k9.k1;
import k9.l;
import k9.l0;
import k9.l1;
import k9.m;
import k9.m0;
import k9.m1;
import k9.n;
import k9.n0;
import k9.n1;
import k9.o;
import k9.o0;
import k9.o1;
import k9.p;
import k9.p0;
import k9.p1;
import k9.q;
import k9.q0;
import k9.q1;
import k9.r;
import k9.r0;
import k9.r1;
import k9.s;
import k9.s0;
import k9.s1;
import k9.t;
import k9.t0;
import k9.t1;
import k9.u;
import k9.u0;
import k9.u1;
import k9.v;
import k9.v0;
import k9.v1;
import k9.w;
import k9.w0;
import k9.w1;
import k9.x;
import k9.x0;
import k9.x1;
import k9.y;
import k9.y0;
import k9.y1;
import k9.z;
import k9.z0;
import k9.z1;
import org.telegram.ui.Components.tp0;
import vh.w2;
import w9.d;
public final class a {
    public static final tp0 f11839a;

    static {
        d dVar = new d();
        k9.d dVar2 = k9.d.f10083a;
        dVar.b(e2.class, dVar2);
        dVar.b(a0.class, dVar2);
        j jVar = j.f10145a;
        dVar.b(d2.class, jVar);
        dVar.b(h0.class, jVar);
        g gVar = g.f10110a;
        dVar.b(l1.class, gVar);
        dVar.b(i0.class, gVar);
        h hVar = h.f10124a;
        dVar.b(k1.class, hVar);
        dVar.b(j0.class, hVar);
        z zVar = z.f10254a;
        dVar.b(c2.class, zVar);
        dVar.b(a1.class, zVar);
        y yVar = y.f10250a;
        dVar.b(b2.class, yVar);
        dVar.b(z0.class, yVar);
        i iVar = i.f10134a;
        dVar.b(m1.class, iVar);
        dVar.b(k0.class, iVar);
        t tVar = t.f10222a;
        dVar.b(a2.class, tVar);
        dVar.b(l0.class, tVar);
        k kVar = k.f10155a;
        dVar.b(u1.class, kVar);
        dVar.b(m0.class, kVar);
        m mVar = m.f10173a;
        dVar.b(s1.class, mVar);
        dVar.b(n0.class, mVar);
        p pVar = p.f10195a;
        dVar.b(r1.class, pVar);
        dVar.b(r0.class, pVar);
        q qVar = q.f10201a;
        dVar.b(q1.class, qVar);
        dVar.b(s0.class, qVar);
        n nVar = n.f10182a;
        dVar.b(o1.class, nVar);
        dVar.b(p0.class, nVar);
        b bVar = b.f10057a;
        dVar.b(g1.class, bVar);
        dVar.b(b0.class, bVar);
        k9.a aVar = k9.a.f10045a;
        dVar.b(f1.class, aVar);
        dVar.b(c0.class, aVar);
        o oVar = o.f10189a;
        dVar.b(p1.class, oVar);
        dVar.b(q0.class, oVar);
        l lVar = l.f10166a;
        dVar.b(n1.class, lVar);
        dVar.b(o0.class, lVar);
        c cVar = c.f10073a;
        dVar.b(h1.class, cVar);
        dVar.b(d0.class, cVar);
        r rVar = r.f10208a;
        dVar.b(t1.class, rVar);
        dVar.b(t0.class, rVar);
        s sVar = s.f10214a;
        dVar.b(v1.class, sVar);
        dVar.b(u0.class, sVar);
        u uVar = u.f10230a;
        dVar.b(w1.class, uVar);
        dVar.b(v0.class, uVar);
        x xVar = x.f10246a;
        dVar.b(z1.class, xVar);
        dVar.b(y0.class, xVar);
        v vVar = v.f10236a;
        dVar.b(y1.class, vVar);
        dVar.b(w0.class, vVar);
        w wVar = w.f10240a;
        dVar.b(x1.class, wVar);
        dVar.b(x0.class, wVar);
        e eVar = e.f10098a;
        dVar.b(j1.class, eVar);
        dVar.b(e0.class, eVar);
        f fVar = f.f10105a;
        dVar.b(i1.class, fVar);
        dVar.b(f0.class, fVar);
        dVar.d = true;
        f11839a = new tp0(dVar, 23);
    }

    public static s0 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    obj.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f2153b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f2152a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f2154c = jsonReader.nextString();
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
        return obj.p();
    }

    public static d0 b(JsonReader jsonReader) {
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
            return new d0(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static b0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = '\b';
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    obj.f5106i = d(jsonReader, new k3.e(14));
                    break;
                case 1:
                    obj.f5101a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    obj.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f5104f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    obj.f5105g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f5102b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f5103c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, k3.e eVar) {
        Object c0Var;
        char c3;
        char c10;
        String str;
        Object obj;
        char c11;
        char c12;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str2 = " name";
            String str3 = "";
            String str4 = null;
            Long l10 = null;
            String str5 = null;
            String str6 = null;
            switch (eVar.f9686a) {
                case 14:
                    jsonReader.beginObject();
                    String str7 = null;
                    String str8 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    c3 = 2;
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
                                str7 = jsonReader.nextString();
                                if (str7 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null libraryName");
                                }
                            case 1:
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    str4 = nextString;
                                    break;
                                } else {
                                    throw new NullPointerException("Null arch");
                                }
                            case 2:
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
                        str3 = w2.k(str3, " buildId");
                    }
                    if (str3.isEmpty()) {
                        c0Var = new c0(str4, str7, str8);
                        continue;
                        arrayList.add(c0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 15:
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
                        obj = new f0(str6, bArr);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 16:
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
                                    obj2.f4004a = nextString3;
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
                                    obj2.f4005b = new x0(str9, str10);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    obj2.f4006c = nextString4;
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
                    c0Var = obj2.c();
                    continue;
                    arrayList.add(c0Var);
                case 17:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    c11 = 2;
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
                                list = d(jsonReader, new k3.e(19));
                                if (list != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            case 1:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 != null) {
                                    str5 = nextString5;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case 2:
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
                        str2 = w2.k(str2, " frames");
                    }
                    if (str2.isEmpty()) {
                        obj = new r0(str5, num.intValue(), list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                case 18:
                    jsonReader.beginObject();
                    Long l11 = null;
                    String str11 = null;
                    String str12 = null;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    c12 = 3;
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
                                String nextString6 = jsonReader.nextString();
                                if (nextString6 != null) {
                                    str11 = nextString6;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case 1:
                                l11 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f10104a);
                                break;
                            case 3:
                                l10 = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (l10 == null) {
                        str3 = " baseAddress";
                    }
                    if (l11 == null) {
                        str3 = str3.concat(" size");
                    }
                    if (str11 == null) {
                        str3 = w2.k(str3, " name");
                    }
                    if (str3.isEmpty()) {
                        c0Var = new o0(str11, l10.longValue(), l11.longValue(), str12);
                        continue;
                        arrayList.add(c0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                default:
                    c0Var = a(jsonReader);
                    continue;
                    arrayList.add(c0Var);
            }
            c0Var = obj;
            arrayList.add(c0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static l0 e(JsonReader jsonReader) {
        char c3;
        char c10;
        char c11;
        List list;
        String str;
        char c12;
        List list2;
        List list3;
        String str2;
        char c13;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            String str3 = "";
            switch (c3) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
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
                                obj2.f142a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f143b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                obj2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                obj2.f145f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                obj2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                obj2.f144c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.d = obj2.i();
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
                            List d = d(jsonReader, new k3.e(16));
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
                        obj.f145f = new y0(list4);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list5 = null;
                    List list6 = null;
                    Boolean bool = null;
                    t0 t0Var = null;
                    List list7 = null;
                    Integer num = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c11 = 6;
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
                                p0 p0Var = null;
                                b0 b0Var = null;
                                q0 q0Var = null;
                                List list10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c12 = 4;
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
                                            list2 = list5;
                                            list3 = list6;
                                            b0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new k3.e(17));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str4 = null;
                                            String str5 = null;
                                            Long l10 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c13 = 0;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c13 = 1;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c13 = 2;
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
                                                        l10 = Long.valueOf(jsonReader.nextLong());
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
                                            if (l10 == null) {
                                                str2 = w2.k(str2, " address");
                                            }
                                            if (str2.isEmpty()) {
                                                list2 = list5;
                                                list3 = list6;
                                                q0Var = new q0(l10.longValue(), str4, str5);
                                                break;
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str2));
                                            }
                                        case 3:
                                            list10 = d(jsonReader, new k3.e(18));
                                            if (list10 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            break;
                                        case 4:
                                            p0Var = f(jsonReader);
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
                                if (q0Var != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (list10 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    list5 = list11;
                                    n0Var = new n0(list9, p0Var, b0Var, q0Var, list10);
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
                                t0Var = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    List list12 = list5;
                    List list13 = list6;
                    jsonReader.endObject();
                    if (n0Var == null) {
                        str3 = " execution";
                    }
                    if (num == null) {
                        str3 = str3.concat(" uiOrientation");
                    }
                    if (str3.isEmpty()) {
                        obj.f144c = new m0(n0Var, list12, list13, bool, t0Var, list7, num.intValue());
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
                        obj.e = new v0(str6);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f143b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f142a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.h();
    }

    public static p0 f(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        p0 p0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    List d = d(jsonReader, new k3.e(19));
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
                    p0Var = f(jsonReader);
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
            str = w2.k(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new p0(str2, str3, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static t0 g(JsonReader jsonReader) {
        rf.f fVar = new rf.f(6, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    fVar.f43491c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        fVar.f43490b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    fVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case 3:
                    fVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return fVar.n();
    }

    public static a0 h(JsonReader jsonReader) {
        char c3;
        char c10;
        char c11;
        char c12;
        String str;
        char c13;
        String str2;
        Charset charset = e2.f10104a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            String str3 = "";
            switch (c3) {
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
                            list = d(jsonReader, new k3.e(15));
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
                        obj.h = new e0(str4, list);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f8985a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.e = jsonReader.nextString();
                    break;
                case 3:
                    obj.f8991j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f8992k = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f8986b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.f8987c = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 7:
                    obj.d = jsonReader.nextString();
                    break;
                case '\b':
                    obj.f8990i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f8988f = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\n':
                    ?? obj2 = new Object();
                    obj2.f10118f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c10 = 11;
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
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                obj2.f10117c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f10116b = new String(Base64.decode(jsonReader.nextString(), 2), e2.f10104a);
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
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = '\b';
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
                                            obj3.f5104f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            obj3.f5101a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            obj3.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            obj3.f5103c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f5102b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f5105g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f5106i = nextString8;
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
                                obj2.f10121j = obj3.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f10122k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                rf.f fVar = new rf.f(7, false);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c12 = 3;
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
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                fVar.d = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            fVar.e = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                fVar.f43491c = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            fVar.f43490b = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f10120i = fVar.o();
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
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c13 = 5;
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
                                    obj2.f10119g = new i0(str6, str7, str8, str9, str10, str11);
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
                                    obj2.h = new a1(str12);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f10115a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f10118f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                obj2.f10123l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f8989g = obj2.a();
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
