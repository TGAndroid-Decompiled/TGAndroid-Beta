package i9;

import android.util.Base64;
import android.util.JsonReader;
import g7.e8;
import h9.a0;
import h9.a1;
import h9.a2;
import h9.b;
import h9.b2;
import h9.c;
import h9.c0;
import h9.c2;
import h9.d0;
import h9.d2;
import h9.e;
import h9.e0;
import h9.e2;
import h9.f;
import h9.f0;
import h9.f1;
import h9.g;
import h9.g0;
import h9.g1;
import h9.h;
import h9.h0;
import h9.h1;
import h9.i;
import h9.i0;
import h9.i1;
import h9.j;
import h9.j0;
import h9.j1;
import h9.k;
import h9.k0;
import h9.k1;
import h9.l;
import h9.l0;
import h9.l1;
import h9.m;
import h9.m0;
import h9.m1;
import h9.n;
import h9.n0;
import h9.n1;
import h9.o;
import h9.o0;
import h9.o1;
import h9.p;
import h9.p0;
import h9.p1;
import h9.q;
import h9.q0;
import h9.q1;
import h9.r;
import h9.r0;
import h9.r1;
import h9.s;
import h9.s0;
import h9.s1;
import h9.t;
import h9.t0;
import h9.t1;
import h9.u;
import h9.u0;
import h9.u1;
import h9.v;
import h9.v0;
import h9.v1;
import h9.w;
import h9.w0;
import h9.w1;
import h9.x;
import h9.x0;
import h9.x1;
import h9.y;
import h9.y0;
import h9.y1;
import h9.z;
import h9.z0;
import h9.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import n2.b0;
import t9.d;

public final class a {

    public static final b0 f10965a;

    static {
        d dVar = new d();
        h9.d dVar2 = h9.d.f8659a;
        dVar.d(e2.class, dVar2);
        dVar.d(a0.class, dVar2);
        j jVar = j.f8728a;
        dVar.d(d2.class, jVar);
        dVar.d(h0.class, jVar);
        g gVar = g.f8688a;
        dVar.d(l1.class, gVar);
        dVar.d(i0.class, gVar);
        h hVar = h.f8704a;
        dVar.d(k1.class, hVar);
        dVar.d(j0.class, hVar);
        z zVar = z.f8855a;
        dVar.d(c2.class, zVar);
        dVar.d(a1.class, zVar);
        y yVar = y.f8850a;
        dVar.d(b2.class, yVar);
        dVar.d(z0.class, yVar);
        i iVar = i.f8715a;
        dVar.d(m1.class, iVar);
        dVar.d(k0.class, iVar);
        t tVar = t.f8819a;
        dVar.d(a2.class, tVar);
        dVar.d(l0.class, tVar);
        k kVar = k.f8739a;
        dVar.d(u1.class, kVar);
        dVar.d(m0.class, kVar);
        m mVar = m.f8761a;
        dVar.d(s1.class, mVar);
        dVar.d(n0.class, mVar);
        p pVar = p.f8787a;
        dVar.d(r1.class, pVar);
        dVar.d(r0.class, pVar);
        q qVar = q.f8794a;
        dVar.d(q1.class, qVar);
        dVar.d(s0.class, qVar);
        n nVar = n.f8772a;
        dVar.d(o1.class, nVar);
        dVar.d(p0.class, nVar);
        b bVar = b.f8630a;
        dVar.d(g1.class, bVar);
        dVar.d(h9.b0.class, bVar);
        h9.a aVar = h9.a.f8617a;
        dVar.d(f1.class, aVar);
        dVar.d(c0.class, aVar);
        o oVar = o.f8781a;
        dVar.d(p1.class, oVar);
        dVar.d(q0.class, oVar);
        l lVar = l.f8752a;
        dVar.d(n1.class, lVar);
        dVar.d(o0.class, lVar);
        c cVar = c.f8648a;
        dVar.d(h1.class, cVar);
        dVar.d(d0.class, cVar);
        r rVar = r.f8802a;
        dVar.d(t1.class, rVar);
        dVar.d(t0.class, rVar);
        s sVar = s.f8809a;
        dVar.d(v1.class, sVar);
        dVar.d(u0.class, sVar);
        u uVar = u.f8828a;
        dVar.d(w1.class, uVar);
        dVar.d(v0.class, uVar);
        x xVar = x.f8846a;
        dVar.d(z1.class, xVar);
        dVar.d(y0.class, xVar);
        v vVar = v.f8835a;
        dVar.d(y1.class, vVar);
        dVar.d(w0.class, vVar);
        w wVar = w.f8840a;
        dVar.d(x1.class, wVar);
        dVar.d(x0.class, wVar);
        e eVar = e.f8676a;
        dVar.d(j1.class, eVar);
        dVar.d(e0.class, eVar);
        f fVar = f.f8683a;
        dVar.d(i1.class, fVar);
        dVar.d(f0.class, fVar);
        dVar.d = true;
        f10965a = new b0(dVar, 22);
    }

    public static s0 a(JsonReader jsonReader) throws IOException {
        af.h hVar = new af.h();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    hVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    hVar.f275b = strNextString;
                    break;
                    break;
                case "pc":
                    hVar.f274a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    hVar.f276c = jsonReader.nextString();
                    break;
                case "importance":
                    hVar.f277e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return hVar.l();
    }

    public static d0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new d0(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public static h9.b0 c(JsonReader jsonReader) throws IOException {
        c3.g gVar = new c3.g();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    gVar.f2439i = d(jsonReader, new i3.d(24));
                    break;
                case "pid":
                    gVar.f2433a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    gVar.f2436e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    gVar.f2437f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    gVar.f2438g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    gVar.f2434b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    gVar.f2435c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    gVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    gVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return gVar.a();
    }

    public static List d(JsonReader jsonReader, i3.d dVar) throws IOException {
        String strL;
        Object c0Var;
        Object f0Var;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            boolean z10 = false;
            String str = null;
            Long lValueOf = null;
            String str2 = null;
            String str3 = null;
            switch (dVar.f10526a) {
                case 24:
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        strNextName.getClass();
                        switch (strNextName) {
                            case "libraryName":
                                strNextString = jsonReader.nextString();
                                if (strNextString == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                                break;
                            case "arch":
                                String strNextString3 = jsonReader.nextString();
                                if (strNextString3 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                str = strNextString3;
                                break;
                                break;
                            case "buildId":
                                strNextString2 = jsonReader.nextString();
                                if (strNextString2 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    strL = str == null ? " arch" : "";
                    if (strNextString == null) {
                        strL = strL.concat(" libraryName");
                    }
                    if (strNextString2 == null) {
                        strL = s3.c.l(strL, " buildId");
                    }
                    if (!strL.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strL));
                    }
                    c0Var = new c0(str, strNextString, strNextString2);
                    continue;
                    arrayList.add(c0Var);
                    break;
                    break;
                case 25:
                    jsonReader.beginObject();
                    byte[] bArrDecode = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("filename")) {
                            String strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                throw new NullPointerException("Null filename");
                            }
                            str3 = strNextString4;
                        } else if (strNextName2.equals("contents")) {
                            bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                            if (bArrDecode == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strL = str3 == null ? " filename" : "";
                    if (bArrDecode == null) {
                        strL = strL.concat(" contents");
                    }
                    if (!strL.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strL));
                    }
                    f0Var = new f0(str3, bArrDecode);
                    break;
                    break;
                case 26:
                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(10, z10);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "parameterKey":
                                String strNextString5 = jsonReader.nextString();
                                if (strNextString5 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                tVar.f4619b = strNextString5;
                                break;
                                break;
                            case "templateVersion":
                                tVar.f4621e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "rolloutVariant":
                                jsonReader.beginObject();
                                String strNextString6 = null;
                                String strNextString7 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    if (strNextName4.equals("variantId")) {
                                        strNextString7 = jsonReader.nextString();
                                        if (strNextString7 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (strNextName4.equals("rolloutId")) {
                                        strNextString6 = jsonReader.nextString();
                                        if (strNextString6 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString6 == null ? " rolloutId" : "";
                                if (strNextString7 == null) {
                                    strConcat = strConcat.concat(" variantId");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                tVar.f4620c = new x0(strNextString6, strNextString7);
                                break;
                                break;
                            case "parameterValue":
                                String strNextString8 = jsonReader.nextString();
                                if (strNextString8 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                tVar.d = strNextString8;
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0Var = tVar.l();
                    continue;
                    arrayList.add(c0Var);
                    break;
                case 27:
                    jsonReader.beginObject();
                    Integer numValueOf = null;
                    List listD = null;
                    while (jsonReader.hasNext()) {
                        String strNextName5 = jsonReader.nextName();
                        strNextName5.getClass();
                        switch (strNextName5) {
                            case "frames":
                                listD = d(jsonReader, new i3.d(29));
                                if (listD == null) {
                                    throw new NullPointerException("Null frames");
                                }
                                break;
                                break;
                            case "name":
                                String strNextString9 = jsonReader.nextString();
                                if (strNextString9 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str2 = strNextString9;
                                break;
                                break;
                            case "importance":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    String strL2 = str2 != null ? "" : " name";
                    if (numValueOf == null) {
                        strL2 = strL2.concat(" importance");
                    }
                    if (listD == null) {
                        strL2 = s3.c.l(strL2, " frames");
                    }
                    if (!strL2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strL2));
                    }
                    f0Var = new r0(str2, numValueOf.intValue(), listD);
                    break;
                    break;
                case 28:
                    jsonReader.beginObject();
                    Long lValueOf2 = null;
                    String str4 = null;
                    String str5 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        switch (strNextName6) {
                            case "name":
                                String strNextString10 = jsonReader.nextString();
                                if (strNextString10 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str4 = strNextString10;
                                break;
                                break;
                            case "size":
                                lValueOf2 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "uuid":
                                str5 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f8682a);
                                break;
                            case "baseAddress":
                                lValueOf = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    strL = lValueOf == null ? " baseAddress" : "";
                    if (lValueOf2 == null) {
                        strL = strL.concat(" size");
                    }
                    if (str4 == null) {
                        strL = s3.c.l(strL, " name");
                    }
                    if (!strL.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strL));
                    }
                    c0Var = new o0(str4, lValueOf.longValue(), lValueOf2.longValue(), str5);
                    continue;
                    arrayList.add(c0Var);
                    break;
                    break;
                default:
                    c0Var = a(jsonReader);
                    continue;
                    arrayList.add(c0Var);
                    break;
            }
            c0Var = f0Var;
            arrayList.add(c0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static l0 e(JsonReader jsonReader) throws IOException {
        byte b10;
        String strConcat;
        List list;
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b10 = 0;
                    break;
                case "rollouts":
                    b10 = 1;
                    break;
                case "app":
                    b10 = 2;
                    break;
                case "log":
                    b10 = 3;
                    break;
                case "type":
                    b10 = 4;
                    break;
                case "timestamp":
                    b10 = 5;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                mVar2.f4602a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                mVar2.f4603b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                mVar2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                mVar2.f4606f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                mVar2.f4605e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                mVar2.f4604c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    mVar.d = mVar2.h();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list2 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            List listD = d(jsonReader, new i3.d(26));
                            if (listD == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list2 = listD;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = list2 == null ? " rolloutAssignments" : "";
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    mVar.f4606f = new y0(list2);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    t0 t0VarG = null;
                    List listUnmodifiableList3 = null;
                    Integer numValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                List list3 = listUnmodifiableList;
                                list = listUnmodifiableList2;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = DesugarCollections.unmodifiableList(arrayList);
                                listUnmodifiableList = list3;
                                listUnmodifiableList2 = list;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                listUnmodifiableList = listUnmodifiableList;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                List listD2 = null;
                                p0 p0VarF = null;
                                h9.b0 b0VarC = null;
                                q0 q0Var = null;
                                List listD3 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            b0VarC = c(jsonReader);
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                        case "threads":
                                            listD2 = d(jsonReader, new i3.d(27));
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String strL = strNextString == null ? " name" : "";
                                            if (strNextString2 == null) {
                                                strL = strL.concat(" code");
                                            }
                                            if (lValueOf == null) {
                                                strL = s3.c.l(strL, " address");
                                            }
                                            if (!strL.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(strL));
                                            }
                                            q0Var = new q0(lValueOf.longValue(), strNextString, strNextString2);
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                            break;
                                        case "binaries":
                                            listD3 = d(jsonReader, new i3.d(28));
                                            if (listD3 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                        case "exception":
                                            p0VarF = f(jsonReader);
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            listUnmodifiableList = listUnmodifiableList;
                                            listUnmodifiableList2 = listUnmodifiableList2;
                                            break;
                                    }
                                }
                                List list4 = listUnmodifiableList;
                                list = listUnmodifiableList2;
                                jsonReader.endObject();
                                String strConcat2 = q0Var == null ? " signal" : "";
                                if (listD3 == null) {
                                    strConcat2 = strConcat2.concat(" binaries");
                                }
                                if (!strConcat2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                                }
                                listUnmodifiableList = list4;
                                n0Var = new n0(listD2, p0VarF, b0VarC, q0Var, listD3);
                                listUnmodifiableList2 = list;
                                break;
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList2);
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                                break;
                            case "uiOrientation":
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "currentProcessDetails":
                                t0VarG = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    List list5 = listUnmodifiableList;
                    List list6 = listUnmodifiableList2;
                    jsonReader.endObject();
                    strConcat = n0Var == null ? " execution" : "";
                    if (numValueOf == null) {
                        strConcat = strConcat.concat(" uiOrientation");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    mVar.f4604c = new m0(n0Var, list5, list6, boolValueOf, t0VarG, listUnmodifiableList3, numValueOf.intValue());
                    break;
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString3;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = str == null ? " content" : "";
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    mVar.f4605e = new v0(str);
                    break;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    mVar.f4603b = strNextString4;
                    break;
                    break;
                case 5:
                    mVar.f4602a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return mVar.g();
    }

    public static p0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String str = null;
        String strNextString = null;
        List list = null;
        p0 p0VarF = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new i3.d(29));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    p0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strL = str == null ? " type" : "";
        if (list == null) {
            strL = strL.concat(" frames");
        }
        if (numValueOf == null) {
            strL = s3.c.l(strL, " overflowCount");
        }
        if (strL.isEmpty()) {
            return new p0(str, strNextString, list, p0VarF, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public static t0 g(JsonReader jsonReader) throws IOException {
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(9, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    tVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    tVar.f4619b = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    tVar.f4620c = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    tVar.f4621e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return tVar.k();
    }

    public static a0 h(JsonReader jsonReader) throws IOException {
        byte b10;
        Charset charset = e2.f8682a;
        e8 e8Var = new e8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            boolean z10 = false;
            switch (strNextName) {
                case "ndkPayload":
                    b10 = 0;
                    break;
                case "sdkVersion":
                    b10 = 1;
                    break;
                case "appQualitySessionId":
                    b10 = 2;
                    break;
                case "appExitInfo":
                    b10 = 3;
                    break;
                case "buildVersion":
                    b10 = 4;
                    break;
                case "gmpAppId":
                    b10 = 5;
                    break;
                case "installationUuid":
                    b10 = 6;
                    break;
                case "firebaseInstallationId":
                    b10 = 7;
                    break;
                case "platform":
                    b10 = 8;
                    break;
                case "displayVersion":
                    b10 = 9;
                    break;
                case "session":
                    b10 = 10;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    jsonReader.beginObject();
                    List listD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new i3.d(25));
                            if (listD == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = listD == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    e8Var.h = new e0(strNextString, listD);
                    continue;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    e8Var.f6455a = strNextString2;
                    break;
                    break;
                case 2:
                    e8Var.f6458e = jsonReader.nextString();
                    break;
                case 3:
                    e8Var.f6462j = c(jsonReader);
                    break;
                case 4:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    e8Var.f6463k = strNextString3;
                    break;
                    break;
                case 5:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    e8Var.f6456b = strNextString4;
                    break;
                    break;
                case 6:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    e8Var.f6457c = strNextString5;
                    break;
                    break;
                case 7:
                    e8Var.d = jsonReader.nextString();
                    break;
                case 8:
                    e8Var.f6461i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 9:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    e8Var.f6459f = strNextString6;
                    break;
                    break;
                case 10:
                    g0 g0Var = new g0();
                    g0Var.f8698f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        int i10 = 11;
                        switch (strNextName3) {
                            case "startedAt":
                                g0Var.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "appQualitySessionId":
                                g0Var.f8696c = jsonReader.nextString();
                                break;
                            case "identifier":
                                g0Var.f8695b = new String(Base64.decode(jsonReader.nextString(), 2), e2.f8682a);
                                break;
                            case "endedAt":
                                g0Var.f8697e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                c3.g gVar = new c3.g();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            gVar.f2437f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            gVar.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            gVar.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            gVar.f2433a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            gVar.f2436e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            gVar.f2435c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            gVar.f2434b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            gVar.f2438g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            gVar.f2439i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.f8701j = gVar.b();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                g0Var.f8702k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(i10, z10);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            tVar.f4621e = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            tVar.f4620c = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            tVar.f4619b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            tVar.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.f8700i = tVar.m();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                g0Var.f8699g = new i0(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                g0Var.h = new a1(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                g0Var.f8694a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                g0Var.f8698f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                g0Var.f8703l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    e8Var.f6460g = g0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return e8Var.a();
    }

    public static a0 i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a0 a0VarH = h(jsonReader);
                jsonReader.close();
                return a0VarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e9) {
            throw new IOException(e9);
        }
    }
}
