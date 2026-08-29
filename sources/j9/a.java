package j9;

import android.util.Base64;
import android.util.JsonReader;
import i9.a0;
import i9.a1;
import i9.a2;
import i9.b;
import i9.b0;
import i9.b2;
import i9.c;
import i9.c0;
import i9.c2;
import i9.d0;
import i9.d2;
import i9.e;
import i9.e0;
import i9.e2;
import i9.f;
import i9.f0;
import i9.f1;
import i9.g;
import i9.g1;
import i9.h;
import i9.h0;
import i9.h1;
import i9.i;
import i9.i0;
import i9.i1;
import i9.j;
import i9.j0;
import i9.j1;
import i9.k;
import i9.k0;
import i9.k1;
import i9.l;
import i9.l0;
import i9.l1;
import i9.m;
import i9.m0;
import i9.m1;
import i9.n;
import i9.n0;
import i9.n1;
import i9.o;
import i9.o0;
import i9.o1;
import i9.p;
import i9.p0;
import i9.p1;
import i9.q;
import i9.q0;
import i9.q1;
import i9.r;
import i9.r0;
import i9.r1;
import i9.s;
import i9.s0;
import i9.s1;
import i9.t;
import i9.t0;
import i9.t1;
import i9.u;
import i9.u0;
import i9.u1;
import i9.v;
import i9.v0;
import i9.v1;
import i9.w;
import i9.w0;
import i9.w1;
import i9.x;
import i9.x0;
import i9.x1;
import i9.y;
import i9.y0;
import i9.y1;
import i9.z;
import i9.z0;
import i9.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import u9.d;
public final class a {
    public static final o1.a f11292a;

    static {
        d dVar = new d();
        i9.d dVar2 = i9.d.f8623a;
        dVar.i(e2.class, dVar2);
        dVar.i(a0.class, dVar2);
        j jVar = j.f8692a;
        dVar.i(d2.class, jVar);
        dVar.i(h0.class, jVar);
        g gVar = g.f8652a;
        dVar.i(l1.class, gVar);
        dVar.i(i0.class, gVar);
        h hVar = h.f8668a;
        dVar.i(k1.class, hVar);
        dVar.i(j0.class, hVar);
        z zVar = z.f8819a;
        dVar.i(c2.class, zVar);
        dVar.i(a1.class, zVar);
        y yVar = y.f8814a;
        dVar.i(b2.class, yVar);
        dVar.i(z0.class, yVar);
        i iVar = i.f8679a;
        dVar.i(m1.class, iVar);
        dVar.i(k0.class, iVar);
        t tVar = t.f8783a;
        dVar.i(a2.class, tVar);
        dVar.i(l0.class, tVar);
        k kVar = k.f8703a;
        dVar.i(u1.class, kVar);
        dVar.i(m0.class, kVar);
        m mVar = m.f8725a;
        dVar.i(s1.class, mVar);
        dVar.i(n0.class, mVar);
        p pVar = p.f8751a;
        dVar.i(r1.class, pVar);
        dVar.i(r0.class, pVar);
        q qVar = q.f8758a;
        dVar.i(q1.class, qVar);
        dVar.i(s0.class, qVar);
        n nVar = n.f8736a;
        dVar.i(o1.class, nVar);
        dVar.i(p0.class, nVar);
        b bVar = b.f8594a;
        dVar.i(g1.class, bVar);
        dVar.i(b0.class, bVar);
        i9.a aVar = i9.a.f8581a;
        dVar.i(f1.class, aVar);
        dVar.i(c0.class, aVar);
        o oVar = o.f8745a;
        dVar.i(p1.class, oVar);
        dVar.i(q0.class, oVar);
        l lVar = l.f8716a;
        dVar.i(n1.class, lVar);
        dVar.i(o0.class, lVar);
        c cVar = c.f8612a;
        dVar.i(h1.class, cVar);
        dVar.i(d0.class, cVar);
        r rVar = r.f8766a;
        dVar.i(t1.class, rVar);
        dVar.i(t0.class, rVar);
        s sVar = s.f8773a;
        dVar.i(v1.class, sVar);
        dVar.i(u0.class, sVar);
        u uVar = u.f8792a;
        dVar.i(w1.class, uVar);
        dVar.i(v0.class, uVar);
        x xVar = x.f8810a;
        dVar.i(z1.class, xVar);
        dVar.i(y0.class, xVar);
        v vVar = v.f8799a;
        dVar.i(y1.class, vVar);
        dVar.i(w0.class, vVar);
        w wVar = w.f8804a;
        dVar.i(x1.class, wVar);
        dVar.i(x0.class, wVar);
        e eVar = e.f8640a;
        dVar.i(j1.class, eVar);
        dVar.i(e0.class, eVar);
        f fVar = f.f8647a;
        dVar.i(i1.class, fVar);
        dVar.i(f0.class, fVar);
        dVar.d = true;
        f11292a = new o1.a(dVar, 27);
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
                        obj.f212b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f211a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f213c = jsonReader.nextString();
                    break;
                case 4:
                    obj.f214e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.i();
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
                    obj.f5818i = d(jsonReader, new j3.d0(15));
                    break;
                case 1:
                    obj.f5812a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    obj.f5815e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f5816f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    obj.f5817g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f5813b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f5814c = Integer.valueOf(jsonReader.nextInt());
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

    public static List d(JsonReader jsonReader, j3.d0 d0Var) {
        Object c0Var;
        char c3;
        char c6;
        String str;
        Object obj;
        char c10;
        char c11;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str2 = " name";
            String str3 = "";
            String str4 = null;
            Long l10 = null;
            String str5 = null;
            String str6 = null;
            switch (d0Var.f10412a) {
                case 15:
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
                        str3 = u3.c.k(str3, " buildId");
                    }
                    if (str3.isEmpty()) {
                        c0Var = new c0(str4, str7, str8);
                        continue;
                        arrayList.add(c0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 16:
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
                case 17:
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(11, false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    sVar.f5185b = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case 1:
                                sVar.f5187e = Long.valueOf(jsonReader.nextLong());
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
                                    sVar.f5186c = new x0(str9, str10);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    sVar.d = nextString4;
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
                    c0Var = sVar.l();
                    continue;
                    arrayList.add(c0Var);
                case 18:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    c10 = 2;
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
                                list = d(jsonReader, new j3.d0(20));
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
                        str2 = u3.c.k(str2, " frames");
                    }
                    if (str2.isEmpty()) {
                        obj = new r0(str5, num.intValue(), list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                case 19:
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
                                l11 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f8646a);
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
                        str3 = u3.c.k(str3, " name");
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
        char c6;
        char c10;
        List list;
        String str;
        char c11;
        List list2;
        List list3;
        String str2;
        char c12;
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
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                obj2.f2118a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f2119b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                obj2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                obj2.f2122f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                obj2.f2121e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                obj2.f2120c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.d = obj2.h();
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
                            List d = d(jsonReader, new j3.d0(17));
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
                        obj.f2122f = new y0(list4);
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
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c10 = 6;
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
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c11 = 4;
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
                                            list2 = list5;
                                            list3 = list6;
                                            b0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new j3.d0(18));
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
                                                            c12 = 0;
                                                            break;
                                                        }
                                                        c12 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c12 = 1;
                                                            break;
                                                        }
                                                        c12 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c12 = 2;
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
                                                str2 = u3.c.k(str2, " address");
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
                                            list10 = d(jsonReader, new j3.d0(19));
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
                        obj.f2120c = new m0(n0Var, list12, list13, bool, t0Var, list7, num.intValue());
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
                        obj.f2121e = new v0(str6);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f2119b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f2118a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.g();
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
                    List d = d(jsonReader, new j3.d0(20));
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
            str = u3.c.k(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new p0(str2, str3, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static t0 g(JsonReader jsonReader) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(10, false);
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
                    sVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        sVar.f5185b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    sVar.f5186c = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case 3:
                    sVar.f5187e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sVar.k();
    }

    public static a0 h(JsonReader jsonReader) {
        char c3;
        char c6;
        char c10;
        char c11;
        String str;
        char c12;
        String str2;
        Charset charset = e2.f8646a;
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
                            list = d(jsonReader, new j3.d0(16));
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
                        obj.f7588a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f7591e = jsonReader.nextString();
                    break;
                case 3:
                    obj.f7595j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f7596k = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f7589b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.f7590c = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 7:
                    obj.d = jsonReader.nextString();
                    break;
                case '\b':
                    obj.f7594i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f7592f = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\n':
                    ?? obj2 = new Object();
                    obj2.f8662f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c6 = 6;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c6 = 7;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c6 = '\b';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c6 = '\t';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c6 = '\n';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c6 = 11;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                obj2.f8660c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f8659b = new String(Base64.decode(jsonReader.nextString(), 2), e2.f8646a);
                                break;
                            case 3:
                                obj2.f8661e = Long.valueOf(jsonReader.nextLong());
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
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c10 = '\b';
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
                                            obj3.f5816f = Boolean.valueOf(jsonReader.nextBoolean());
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
                                            obj3.f5812a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            obj3.f5815e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            obj3.f5814c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f5813b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f5817g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f5818i = nextString8;
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
                                obj2.f8665j = obj3.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f8666k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(12, false);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
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
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                sVar.f5187e = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            sVar.f5186c = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                sVar.f5185b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            sVar.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f8664i = sVar.m();
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
                                    obj2.f8663g = new i0(str6, str7, str8, str9, str10, str11);
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
                                    obj2.f8658a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f8662f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                obj2.f8667l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f7593g = obj2.a();
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
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
