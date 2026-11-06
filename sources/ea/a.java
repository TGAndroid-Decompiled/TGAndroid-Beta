package ea;

import android.util.Base64;
import android.util.JsonReader;
import da.a0;
import da.a1;
import da.a2;
import da.b;
import da.b0;
import da.b2;
import da.c;
import da.c1;
import da.c2;
import da.d0;
import da.d2;
import da.e;
import da.e1;
import da.e2;
import da.f;
import da.f0;
import da.f2;
import da.g;
import da.g0;
import da.g1;
import da.g2;
import da.h;
import da.h0;
import da.h1;
import da.h2;
import da.i;
import da.i0;
import da.i2;
import da.j;
import da.j0;
import da.j1;
import da.j2;
import da.k;
import da.k0;
import da.k1;
import da.k2;
import da.l;
import da.l0;
import da.l1;
import da.l2;
import da.m;
import da.m2;
import da.n0;
import da.n1;
import da.n2;
import da.o;
import da.o0;
import da.o1;
import da.o2;
import da.p;
import da.p0;
import da.p2;
import da.q;
import da.q2;
import da.r;
import da.r0;
import da.r2;
import da.s;
import da.s2;
import da.t;
import da.t0;
import da.t1;
import da.t2;
import da.u;
import da.u1;
import da.u2;
import da.v;
import da.v0;
import da.v1;
import da.w;
import da.w0;
import da.w1;
import da.x;
import da.x0;
import da.x1;
import da.y;
import da.y0;
import da.y1;
import da.z;
import da.z0;
import da.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.n;
import pa.d;
public final class a {
    public static final n f10726a;

    static {
        d dVar = new d();
        da.d dVar2 = da.d.f8301a;
        dVar.b(u2.class, dVar2);
        dVar.b(d0.class, dVar2);
        l lVar = l.f8400a;
        dVar.b(t2.class, lVar);
        dVar.b(n0.class, lVar);
        i iVar = i.f8371a;
        dVar.b(b2.class, iVar);
        dVar.b(o0.class, iVar);
        j jVar = j.f8383a;
        dVar.b(a2.class, jVar);
        dVar.b(p0.class, jVar);
        b0 b0Var = b0.f8276a;
        dVar.b(s2.class, b0Var);
        dVar.b(o1.class, b0Var);
        a0 a0Var = a0.f8261a;
        dVar.b(r2.class, a0Var);
        dVar.b(n1.class, a0Var);
        k kVar = k.f8389a;
        dVar.b(c2.class, kVar);
        dVar.b(r0.class, kVar);
        v vVar = v.f8536a;
        dVar.b(q2.class, vVar);
        dVar.b(t0.class, vVar);
        m mVar = m.f8413a;
        dVar.b(k2.class, mVar);
        dVar.b(v0.class, mVar);
        o oVar = o.f8451a;
        dVar.b(i2.class, oVar);
        dVar.b(w0.class, oVar);
        r rVar = r.f8487a;
        dVar.b(h2.class, rVar);
        dVar.b(a1.class, rVar);
        s sVar = s.f8502a;
        dVar.b(g2.class, sVar);
        dVar.b(c1.class, sVar);
        p pVar = p.f8463a;
        dVar.b(e2.class, pVar);
        dVar.b(y0.class, pVar);
        b bVar = b.f8268a;
        dVar.b(u1.class, bVar);
        dVar.b(f0.class, bVar);
        da.a aVar = da.a.f8258a;
        dVar.b(t1.class, aVar);
        dVar.b(g0.class, aVar);
        g gVar = g.f8356a;
        dVar.b(z1.class, gVar);
        dVar.b(k0.class, gVar);
        h hVar = h.f8366a;
        dVar.b(y1.class, hVar);
        dVar.b(l0.class, hVar);
        q qVar = q.f8471a;
        dVar.b(f2.class, qVar);
        dVar.b(z0.class, qVar);
        da.n nVar = da.n.f8434a;
        dVar.b(d2.class, nVar);
        dVar.b(x0.class, nVar);
        c cVar = c.f8283a;
        dVar.b(v1.class, cVar);
        dVar.b(h0.class, cVar);
        t tVar = t.f8514a;
        dVar.b(j2.class, tVar);
        dVar.b(e1.class, tVar);
        u uVar = u.f8523a;
        dVar.b(l2.class, uVar);
        dVar.b(g1.class, uVar);
        w wVar = w.f8548a;
        dVar.b(m2.class, wVar);
        dVar.b(h1.class, wVar);
        z zVar = z.f8569a;
        dVar.b(p2.class, zVar);
        dVar.b(l1.class, zVar);
        x xVar = x.f8555a;
        dVar.b(o2.class, xVar);
        dVar.b(j1.class, xVar);
        y yVar = y.f8562a;
        dVar.b(n2.class, yVar);
        dVar.b(k1.class, yVar);
        e eVar = e.f8326a;
        dVar.b(x1.class, eVar);
        dVar.b(i0.class, eVar);
        f fVar = f.f8340a;
        dVar.b(w1.class, fVar);
        dVar.b(j0.class, fVar);
        dVar.d = true;
        f10726a = new n(dVar);
    }

    public static c1 a(JsonReader jsonReader) {
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
                    obj.d = jsonReader.nextLong();
                    obj.f8282f = (byte) (obj.f8282f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f8279b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f8278a = jsonReader.nextLong();
                    obj.f8282f = (byte) (obj.f8282f | 1);
                    break;
                case 3:
                    obj.f8280c = jsonReader.nextString();
                    break;
                case 4:
                    obj.f8281e = jsonReader.nextInt();
                    obj.f8282f = (byte) (obj.f8282f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static h0 b(JsonReader jsonReader) {
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
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new h0(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" key");
        }
        if (str2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }

    public static f0 c(JsonReader jsonReader) {
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
                    obj.f8335i = d(jsonReader, new di.a1(11));
                    break;
                case 1:
                    obj.f8329a = jsonReader.nextInt();
                    obj.f8336j = (byte) (obj.f8336j | 1);
                    break;
                case 2:
                    obj.f8332e = jsonReader.nextLong();
                    obj.f8336j = (byte) (obj.f8336j | 8);
                    break;
                case 3:
                    obj.f8333f = jsonReader.nextLong();
                    obj.f8336j = (byte) (obj.f8336j | 16);
                    break;
                case 4:
                    obj.f8334g = jsonReader.nextLong();
                    obj.f8336j = (byte) (obj.f8336j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f8330b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f8331c = jsonReader.nextInt();
                    obj.f8336j = (byte) (obj.f8336j | 2);
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = jsonReader.nextInt();
                    obj.f8336j = (byte) (obj.f8336j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, di.a1 a1Var) {
        Object g0Var;
        boolean z9;
        Object j0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            switch (a1Var.f8797a) {
                case 11:
                    jsonReader.beginObject();
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    z9 = false;
                                    break;
                                }
                                z9 = true;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = true;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = true;
                                break;
                            default:
                                z9 = true;
                                break;
                        }
                        switch (z9) {
                            case false:
                                str2 = jsonReader.nextString();
                                if (str2 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null libraryName");
                                }
                            case true:
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    str = nextString;
                                    break;
                                } else {
                                    throw new NullPointerException("Null arch");
                                }
                            case true:
                                str3 = jsonReader.nextString();
                                if (str3 != null) {
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
                    if (str != null && str2 != null && str3 != null) {
                        g0Var = new g0(str, str2, str3);
                        continue;
                        arrayList.add(g0Var);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if (str == null) {
                            sb2.append(" arch");
                        }
                        if (str2 == null) {
                            sb2.append(" libraryName");
                        }
                        if (str3 == null) {
                            sb2.append(" buildId");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
                    }
                    break;
                case 12:
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
                                str = nextString2;
                            } else {
                                throw new NullPointerException("Null filename");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str != null && bArr != null) {
                        j0Var = new j0(str, bArr);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (str == null) {
                            sb3.append(" filename");
                        }
                        if (bArr == null) {
                            sb3.append(" contents");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb3));
                    }
                    break;
                case 13:
                    ?? obj = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = true;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
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
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    obj.f8380b = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case true:
                                obj.d = jsonReader.nextLong();
                                obj.f8382e = (byte) (obj.f8382e | 1);
                                break;
                            case true:
                                jsonReader.beginObject();
                                String str4 = null;
                                String str5 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (!nextName4.equals("variantId")) {
                                        if (!nextName4.equals("rolloutId")) {
                                            jsonReader.skipValue();
                                        } else {
                                            str4 = jsonReader.nextString();
                                            if (str4 == null) {
                                                throw new NullPointerException("Null rolloutId");
                                            }
                                        }
                                    } else {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str4 != null && str5 != null) {
                                    obj.f8379a = new k1(str4, str5);
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (str4 == null) {
                                        sb4.append(" rolloutId");
                                    }
                                    if (str5 == null) {
                                        sb4.append(" variantId");
                                    }
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb4));
                                }
                            case true:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    obj.f8381c = nextString4;
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
                    g0Var = obj.a();
                    continue;
                    arrayList.add(g0Var);
                    break;
                case 14:
                    jsonReader.beginObject();
                    List list = null;
                    byte b10 = 0;
                    int i7 = 0;
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
                                list = d(jsonReader, new di.a1(16));
                                if (list != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                str = jsonReader.nextString();
                                if (str == null) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case true:
                                i7 = jsonReader.nextInt();
                                b10 = (byte) (b10 | 1);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && str != null && list != null) {
                        j0Var = new a1(str, i7, list);
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        if (str == null) {
                            sb5.append(" name");
                        }
                        if ((b10 & 1) == 0) {
                            sb5.append(" importance");
                        }
                        if (list == null) {
                            sb5.append(" frames");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb5));
                    }
                    break;
                case 15:
                    jsonReader.beginObject();
                    String str6 = null;
                    String str7 = null;
                    byte b11 = 0;
                    long j3 = 0;
                    long j10 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    z12 = false;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            default:
                                z12 = true;
                                break;
                        }
                        switch (z12) {
                            case false:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 != null) {
                                    str6 = nextString5;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case true:
                                b11 = (byte) (b11 | 2);
                                j10 = jsonReader.nextLong();
                                break;
                            case true:
                                str7 = new String(Base64.decode(jsonReader.nextString(), 2), u2.f8535a);
                                break;
                            case true:
                                b11 = (byte) (b11 | 1);
                                j3 = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b11 == 3 && str6 != null) {
                        g0Var = new x0(str6, str7, j3, j10);
                        continue;
                        arrayList.add(g0Var);
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        if ((b11 & 1) == 0) {
                            sb6.append(" baseAddress");
                        }
                        if ((b11 & 2) == 0) {
                            sb6.append(" size");
                        }
                        if (str6 == null) {
                            sb6.append(" name");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb6));
                    }
                    break;
                default:
                    g0Var = a(jsonReader);
                    continue;
                    arrayList.add(g0Var);
            }
            g0Var = j0Var;
            arrayList.add(g0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static t0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
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
                                obj2.f8350a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f8351b = jsonReader.nextInt();
                                obj2.f8355g = (byte) (obj2.f8355g | 1);
                                break;
                            case 2:
                                obj2.d = jsonReader.nextInt();
                                obj2.f8355g = (byte) (obj2.f8355g | 4);
                                break;
                            case 3:
                                obj2.f8354f = jsonReader.nextLong();
                                obj2.f8355g = (byte) (obj2.f8355g | 16);
                                break;
                            case 4:
                                obj2.f8353e = jsonReader.nextLong();
                                obj2.f8355g = (byte) (obj2.f8355g | 8);
                                break;
                            case 5:
                                obj2.f8352c = jsonReader.nextBoolean();
                                obj2.f8355g = (byte) (obj2.f8355g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.d = obj2.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d = d(jsonReader, new di.a1(13));
                            if (d != null) {
                                list = d;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f8511f = new l1(list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case 2:
                    jsonReader.beginObject();
                    byte b10 = 0;
                    int i7 = 0;
                    w0 w0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    e1 e1Var = null;
                    List list4 = null;
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
                                    c12 = 5;
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
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                y0 y0Var = null;
                                f0 f0Var = null;
                                k0 k0Var = null;
                                z0 z0Var = null;
                                List list6 = null;
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
                                        case 1467719157:
                                            if (nextName5.equals("profilingManagerInfo")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
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
                                            f0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list5 = d(jsonReader, new di.a1(14));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j3 = 0;
                                            byte b11 = 0;
                                            String str = null;
                                            String str2 = null;
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
                                                        b11 = (byte) (b11 | 1);
                                                        j3 = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str != null) {
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
                                            if (b11 == 1 && str != null && str2 != null) {
                                                z0Var = new z0(j3, str, str2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (str == null) {
                                                    sb2.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb2.append(" code");
                                                }
                                                if ((b11 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
                                            }
                                            break;
                                        case 3:
                                            list6 = d(jsonReader, new di.a1(15));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case 4:
                                            k0Var = h(jsonReader);
                                            break;
                                        case 5:
                                            y0Var = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (z0Var != null && list6 != null) {
                                    w0Var = new w0(list5, y0Var, f0Var, k0Var, z0Var, list6);
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (z0Var == null) {
                                        sb3.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb3.append(" binaries");
                                    }
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb3));
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                i7 = jsonReader.nextInt();
                                b10 = (byte) 1;
                                break;
                            case 6:
                                e1Var = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && w0Var != null) {
                        obj.f8509c = new v0(w0Var, list2, list3, bool, e1Var, list4, i7);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (w0Var == null) {
                            sb4.append(" execution");
                        }
                        if (b10 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb4));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str3 = nextString;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 != null) {
                        obj.f8510e = new h1(str3);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f8508b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f8507a = jsonReader.nextLong();
                    obj.f8512g = (byte) (obj.f8512g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static da.y0 f(android.util.JsonReader r11) {
        throw new UnsupportedOperationException("Method not decompiled: ea.a.f(android.util.JsonReader):da.y0");
    }

    public static e1 g(JsonReader jsonReader) {
        ?? obj = new Object();
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
                    obj.f8323b = jsonReader.nextInt();
                    obj.f8325e = (byte) (obj.f8325e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f8322a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    obj.d = jsonReader.nextBoolean();
                    obj.f8325e = (byte) (obj.f8325e | 4);
                    break;
                case 3:
                    obj.f8324c = jsonReader.nextInt();
                    obj.f8325e = (byte) (obj.f8325e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static k0 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        l0 l0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("profilingTrigger")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                byte b10 = 0;
                int i7 = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("trigger")) {
                        jsonReader.skipValue();
                    } else {
                        i7 = jsonReader.nextInt();
                        b10 = (byte) 1;
                    }
                }
                jsonReader.endObject();
                if (b10 == 1) {
                    l0Var = new l0(i7);
                } else {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
            }
        }
        jsonReader.endObject();
        if (l0Var != null) {
            return new k0(l0Var);
        }
        throw new IllegalStateException("Missing required properties: profilingTrigger");
    }

    public static d0 i(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        boolean z9;
        char c13;
        Charset charset = u2.f8535a;
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
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
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
                            list = d(jsonReader, new di.a1(12));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f8294k = new i0(str, list);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f8286a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f8291g = jsonReader.nextString();
                    break;
                case 3:
                    obj.f8295l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.h = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    obj.f8290f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f8287b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case '\b':
                    obj.f8289e = jsonReader.nextString();
                    break;
                case '\t':
                    obj.f8288c = jsonReader.nextInt();
                    obj.f8296m = (byte) (obj.f8296m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f8292i = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f8423f = false;
                    obj2.f8429m = (byte) (obj2.f8429m | 2);
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
                                obj2.d = jsonReader.nextLong();
                                obj2.f8429m = (byte) (obj2.f8429m | 1);
                                break;
                            case 1:
                                obj2.f8421c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f8420b = new String(Base64.decode(jsonReader.nextString(), 2), u2.f8535a);
                                break;
                            case 3:
                                obj2.f8422e = Long.valueOf(jsonReader.nextLong());
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
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
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
                                            obj3.f8478f = jsonReader.nextBoolean();
                                            obj3.f8481j = (byte) (obj3.f8481j | 16);
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
                                            obj3.d = jsonReader.nextLong();
                                            obj3.f8481j = (byte) (obj3.f8481j | 4);
                                            break;
                                        case 3:
                                            obj3.f8474a = jsonReader.nextInt();
                                            obj3.f8481j = (byte) (obj3.f8481j | 1);
                                            break;
                                        case 4:
                                            obj3.f8477e = jsonReader.nextLong();
                                            obj3.f8481j = (byte) (obj3.f8481j | 8);
                                            break;
                                        case 5:
                                            obj3.f8476c = jsonReader.nextInt();
                                            obj3.f8481j = (byte) (obj3.f8481j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f8475b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f8479g = jsonReader.nextInt();
                                            obj3.f8481j = (byte) (obj3.f8481j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f8480i = nextString8;
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
                                obj2.f8426j = obj3.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f8427k = DesugarCollections.unmodifiableList(arrayList);
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
                                                z9 = false;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        default:
                                            z9 = true;
                                            break;
                                    }
                                    switch (z9) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.f8432c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case true:
                                            obj4.d = jsonReader.nextBoolean();
                                            obj4.f8433e = (byte) (obj4.f8433e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.f8431b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case true:
                                            obj4.f8430a = jsonReader.nextInt();
                                            obj4.f8433e = (byte) (obj4.f8433e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f8425i = obj4.a();
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
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    obj2.f8424g = new o0(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.h = new o1(str8);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f8419a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f8423f = jsonReader.nextBoolean();
                                obj2.f8429m = (byte) (obj2.f8429m | 2);
                                break;
                            case 11:
                                obj2.f8428l = jsonReader.nextInt();
                                obj2.f8429m = (byte) (obj2.f8429m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f8293j = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static d0 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            d0 i7 = i(jsonReader);
            jsonReader.close();
            return i7;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
