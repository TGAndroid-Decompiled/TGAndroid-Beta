package da;

import android.util.Base64;
import android.util.JsonReader;
import ca.a0;
import ca.a1;
import ca.a2;
import ca.b;
import ca.b0;
import ca.b2;
import ca.c;
import ca.c1;
import ca.c2;
import ca.d0;
import ca.d2;
import ca.e;
import ca.e1;
import ca.e2;
import ca.f;
import ca.f0;
import ca.f2;
import ca.g;
import ca.g0;
import ca.g1;
import ca.g2;
import ca.h;
import ca.h0;
import ca.h1;
import ca.h2;
import ca.i;
import ca.i0;
import ca.i2;
import ca.j;
import ca.j0;
import ca.j1;
import ca.j2;
import ca.k;
import ca.k0;
import ca.k1;
import ca.k2;
import ca.l;
import ca.l0;
import ca.l1;
import ca.l2;
import ca.m;
import ca.m2;
import ca.n;
import ca.n0;
import ca.n1;
import ca.n2;
import ca.o;
import ca.o0;
import ca.o1;
import ca.o2;
import ca.p;
import ca.p0;
import ca.p2;
import ca.q;
import ca.q2;
import ca.r;
import ca.r0;
import ca.r2;
import ca.s;
import ca.s2;
import ca.t;
import ca.t0;
import ca.t1;
import ca.t2;
import ca.u;
import ca.u1;
import ca.u2;
import ca.v;
import ca.v0;
import ca.v1;
import ca.w;
import ca.w0;
import ca.w1;
import ca.x;
import ca.x0;
import ca.x1;
import ca.y;
import ca.y0;
import ca.y1;
import ca.z;
import ca.z0;
import ca.z1;
import hi.d;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public static final d f8594a;

    static {
        oa.d dVar = new oa.d();
        ca.d dVar2 = ca.d.f4327a;
        dVar.c(u2.class, dVar2);
        dVar.c(d0.class, dVar2);
        l lVar = l.f4426a;
        dVar.c(t2.class, lVar);
        dVar.c(n0.class, lVar);
        i iVar = i.f4397a;
        dVar.c(b2.class, iVar);
        dVar.c(o0.class, iVar);
        j jVar = j.f4409a;
        dVar.c(a2.class, jVar);
        dVar.c(p0.class, jVar);
        b0 b0Var = b0.f4302a;
        dVar.c(s2.class, b0Var);
        dVar.c(o1.class, b0Var);
        a0 a0Var = a0.f4287a;
        dVar.c(r2.class, a0Var);
        dVar.c(n1.class, a0Var);
        k kVar = k.f4415a;
        dVar.c(c2.class, kVar);
        dVar.c(r0.class, kVar);
        v vVar = v.f4562a;
        dVar.c(q2.class, vVar);
        dVar.c(t0.class, vVar);
        m mVar = m.f4439a;
        dVar.c(k2.class, mVar);
        dVar.c(v0.class, mVar);
        o oVar = o.f4477a;
        dVar.c(i2.class, oVar);
        dVar.c(w0.class, oVar);
        r rVar = r.f4513a;
        dVar.c(h2.class, rVar);
        dVar.c(a1.class, rVar);
        s sVar = s.f4528a;
        dVar.c(g2.class, sVar);
        dVar.c(c1.class, sVar);
        p pVar = p.f4489a;
        dVar.c(e2.class, pVar);
        dVar.c(y0.class, pVar);
        b bVar = b.f4294a;
        dVar.c(u1.class, bVar);
        dVar.c(f0.class, bVar);
        ca.a aVar = ca.a.f4284a;
        dVar.c(t1.class, aVar);
        dVar.c(g0.class, aVar);
        g gVar = g.f4382a;
        dVar.c(z1.class, gVar);
        dVar.c(k0.class, gVar);
        h hVar = h.f4392a;
        dVar.c(y1.class, hVar);
        dVar.c(l0.class, hVar);
        q qVar = q.f4497a;
        dVar.c(f2.class, qVar);
        dVar.c(z0.class, qVar);
        n nVar = n.f4460a;
        dVar.c(d2.class, nVar);
        dVar.c(x0.class, nVar);
        c cVar = c.f4309a;
        dVar.c(v1.class, cVar);
        dVar.c(h0.class, cVar);
        t tVar = t.f4540a;
        dVar.c(j2.class, tVar);
        dVar.c(e1.class, tVar);
        u uVar = u.f4549a;
        dVar.c(l2.class, uVar);
        dVar.c(g1.class, uVar);
        w wVar = w.f4574a;
        dVar.c(m2.class, wVar);
        dVar.c(h1.class, wVar);
        z zVar = z.f4595a;
        dVar.c(p2.class, zVar);
        dVar.c(l1.class, zVar);
        x xVar = x.f4581a;
        dVar.c(o2.class, xVar);
        dVar.c(j1.class, xVar);
        y yVar = y.f4588a;
        dVar.c(n2.class, yVar);
        dVar.c(k1.class, yVar);
        e eVar = e.f4352a;
        dVar.c(x1.class, eVar);
        dVar.c(i0.class, eVar);
        f fVar = f.f4366a;
        dVar.c(w1.class, fVar);
        dVar.c(j0.class, fVar);
        dVar.d = true;
        f8594a = new d(dVar, 19);
    }

    public static c1 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.d = jsonReader.nextLong();
                    obj.f4308f = (byte) (obj.f4308f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f4305b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f4304a = jsonReader.nextLong();
                    obj.f4308f = (byte) (obj.f4308f | 1);
                    break;
                case 3:
                    obj.f4306c = jsonReader.nextString();
                    break;
                case 4:
                    obj.f4307e = jsonReader.nextInt();
                    obj.f4308f = (byte) (obj.f4308f | 4);
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
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    public static f0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.f4361i = d(jsonReader, new d2.t1(1));
                    break;
                case 1:
                    obj.f4355a = jsonReader.nextInt();
                    obj.f4362j = (byte) (obj.f4362j | 1);
                    break;
                case 2:
                    obj.f4358e = jsonReader.nextLong();
                    obj.f4362j = (byte) (obj.f4362j | 8);
                    break;
                case 3:
                    obj.f4359f = jsonReader.nextLong();
                    obj.f4362j = (byte) (obj.f4362j | 16);
                    break;
                case 4:
                    obj.f4360g = jsonReader.nextLong();
                    obj.f4362j = (byte) (obj.f4362j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f4356b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f4357c = jsonReader.nextInt();
                    obj.f4362j = (byte) (obj.f4362j | 2);
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = jsonReader.nextInt();
                    obj.f4362j = (byte) (obj.f4362j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, d2.t1 t1Var) {
        Object g0Var;
        boolean z10;
        Object j0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            switch (t1Var.f8415a) {
                case 1:
                    jsonReader.beginObject();
                    String str2 = null;
                    String str3 = null;
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
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                    }
                    break;
                case 2:
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
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                    }
                    break;
                case 3:
                    ?? obj = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
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
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    obj.f4406b = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case true:
                                obj.d = jsonReader.nextLong();
                                obj.f4408e = (byte) (obj.f4408e | 1);
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
                                    obj.f4405a = new k1(str4, str5);
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (str4 == null) {
                                        sb4.append(" rolloutId");
                                    }
                                    if (str5 == null) {
                                        sb4.append(" variantId");
                                    }
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
                                }
                            case true:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    obj.f4407c = nextString4;
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
                case 4:
                    jsonReader.beginObject();
                    List list = null;
                    byte b10 = 0;
                    int i3 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    z12 = false;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
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
                                list = d(jsonReader, new d2.t1(6));
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
                                i3 = jsonReader.nextInt();
                                b10 = (byte) (b10 | 1);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && str != null && list != null) {
                        j0Var = new a1(str, i3, list);
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
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb5));
                    }
                    break;
                case 5:
                    jsonReader.beginObject();
                    String str6 = null;
                    String str7 = null;
                    byte b11 = 0;
                    long j10 = 0;
                    long j11 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    z13 = false;
                                    break;
                                }
                                z13 = true;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    z13 = true;
                                    break;
                                }
                                z13 = true;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    z13 = true;
                                    break;
                                }
                                z13 = true;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    z13 = true;
                                    break;
                                }
                                z13 = true;
                                break;
                            default:
                                z13 = true;
                                break;
                        }
                        switch (z13) {
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
                                j11 = jsonReader.nextLong();
                                break;
                            case true:
                                str7 = new String(Base64.decode(jsonReader.nextString(), 2), u2.f4561a);
                                break;
                            case true:
                                b11 = (byte) (b11 | 1);
                                j10 = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b11 == 3 && str6 != null) {
                        g0Var = new x0(str6, str7, j10, j11);
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
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb6));
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
        char c2;
        char c10;
        List d;
        int i3;
        int i10;
        char c11;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i11 = 5;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
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
                                obj2.f4376a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f4377b = jsonReader.nextInt();
                                obj2.f4381g = (byte) (obj2.f4381g | 1);
                                break;
                            case 2:
                                obj2.d = jsonReader.nextInt();
                                obj2.f4381g = (byte) (obj2.f4381g | 4);
                                break;
                            case 3:
                                obj2.f4380f = jsonReader.nextLong();
                                obj2.f4381g = (byte) (obj2.f4381g | 16);
                                break;
                            case 4:
                                obj2.f4379e = jsonReader.nextLong();
                                obj2.f4381g = (byte) (obj2.f4381g | 8);
                                break;
                            case 5:
                                obj2.f4378c = jsonReader.nextBoolean();
                                obj2.f4381g = (byte) (obj2.f4381g | 2);
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
                            d = list;
                        } else {
                            d = d(jsonReader, new d2.t1(3));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                        list = d;
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f4537f = new l1(list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case 2:
                    jsonReader.beginObject();
                    byte b10 = 0;
                    w0 w0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    e1 e1Var = null;
                    List list4 = null;
                    int i12 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    i3 = 0;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    i3 = 1;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    i3 = 2;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    i3 = 3;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    i3 = 4;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    i3 = i11;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    i3 = 6;
                                    break;
                                }
                                i3 = -1;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        switch (i3) {
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
                                                i10 = 0;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                i10 = 1;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                i10 = 2;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                i10 = 3;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 1467719157:
                                            if (nextName5.equals("profilingManagerInfo")) {
                                                i10 = 4;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                i10 = i11;
                                                break;
                                            }
                                            i10 = -1;
                                            break;
                                        default:
                                            i10 = -1;
                                            break;
                                    }
                                    switch (i10) {
                                        case 0:
                                            f0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list5 = d(jsonReader, new d2.t1(4));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j10 = 0;
                                            String str = null;
                                            byte b11 = 0;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
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
                                                        j10 = jsonReader.nextLong();
                                                        b11 = (byte) (b11 | 1);
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
                                                z0Var = new z0(j10, str, str2);
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
                                                throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                                            }
                                            break;
                                        case 3:
                                            list6 = d(jsonReader, new d2.t1(i11));
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
                                    i11 = 5;
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
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                                }
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
                                i12 = jsonReader.nextInt();
                                b10 = (byte) 1;
                                break;
                            case 6:
                                e1Var = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        i11 = 5;
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && w0Var != null) {
                        obj.f4535c = new v0(w0Var, list2, list3, bool, e1Var, list4, i12);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (w0Var == null) {
                            sb4.append(" execution");
                        }
                        if (b10 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
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
                        obj.f4536e = new h1(str3);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f4534b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f4533a = jsonReader.nextLong();
                    obj.f4538g = (byte) (obj.f4538g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static ca.y0 f(android.util.JsonReader r11) {
        throw new UnsupportedOperationException("Method not decompiled: da.a.f(android.util.JsonReader):ca.y0");
    }

    public static e1 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.f4349b = jsonReader.nextInt();
                    obj.f4351e = (byte) (obj.f4351e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f4348a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    obj.d = jsonReader.nextBoolean();
                    obj.f4351e = (byte) (obj.f4351e | 4);
                    break;
                case 3:
                    obj.f4350c = jsonReader.nextInt();
                    obj.f4351e = (byte) (obj.f4351e | 2);
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
                int i3 = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("trigger")) {
                        jsonReader.skipValue();
                    } else {
                        i3 = jsonReader.nextInt();
                        b10 = (byte) 1;
                    }
                }
                jsonReader.endObject();
                if (b10 == 1) {
                    l0Var = new l0(i3);
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
        char c2;
        char c10;
        char c11;
        boolean z10;
        char c12;
        Charset charset = u2.f4561a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
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
                            list = d(jsonReader, new d2.t1(2));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f4320k = new i0(str, list);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f4312a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f4317g = jsonReader.nextString();
                    break;
                case 3:
                    obj.f4321l = c(jsonReader);
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
                    obj.f4316f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f4313b = nextString3;
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
                    obj.f4315e = jsonReader.nextString();
                    break;
                case '\t':
                    obj.f4314c = jsonReader.nextInt();
                    obj.f4322m = (byte) (obj.f4322m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f4318i = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f4449f = false;
                    obj2.f4455m = (byte) (obj2.f4455m | 2);
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
                                obj2.d = jsonReader.nextLong();
                                obj2.f4455m = (byte) (obj2.f4455m | 1);
                                break;
                            case 1:
                                obj2.f4447c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f4446b = new String(Base64.decode(jsonReader.nextString(), 2), u2.f4561a);
                                break;
                            case 3:
                                obj2.f4448e = Long.valueOf(jsonReader.nextLong());
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
                                            obj3.f4504f = jsonReader.nextBoolean();
                                            obj3.f4507j = (byte) (obj3.f4507j | 16);
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
                                            obj3.f4507j = (byte) (obj3.f4507j | 4);
                                            break;
                                        case 3:
                                            obj3.f4500a = jsonReader.nextInt();
                                            obj3.f4507j = (byte) (obj3.f4507j | 1);
                                            break;
                                        case 4:
                                            obj3.f4503e = jsonReader.nextLong();
                                            obj3.f4507j = (byte) (obj3.f4507j | 8);
                                            break;
                                        case 5:
                                            obj3.f4502c = jsonReader.nextInt();
                                            obj3.f4507j = (byte) (obj3.f4507j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f4501b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f4505g = jsonReader.nextInt();
                                            obj3.f4507j = (byte) (obj3.f4507j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f4506i = nextString8;
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
                                obj2.f4452j = obj3.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f4453k = DesugarCollections.unmodifiableList(arrayList);
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
                                                z10 = false;
                                                break;
                                            }
                                            z10 = true;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z10 = true;
                                                break;
                                            }
                                            z10 = true;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z10 = true;
                                                break;
                                            }
                                            z10 = true;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
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
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.f4458c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case true:
                                            obj4.d = jsonReader.nextBoolean();
                                            obj4.f4459e = (byte) (obj4.f4459e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.f4457b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case true:
                                            obj4.f4456a = jsonReader.nextInt();
                                            obj4.f4459e = (byte) (obj4.f4459e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f4451i = obj4.a();
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
                                    obj2.f4450g = new o0(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
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
                                    obj2.f4445a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f4449f = jsonReader.nextBoolean();
                                obj2.f4455m = (byte) (obj2.f4455m | 2);
                                break;
                            case 11:
                                obj2.f4454l = jsonReader.nextInt();
                                obj2.f4455m = (byte) (obj2.f4455m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f4319j = obj2.a();
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
            d0 i3 = i(jsonReader);
            jsonReader.close();
            return i3;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
