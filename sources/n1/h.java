package n1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import k1.l;
import kotlin.jvm.internal.j;
import m1.i;
import m1.k;

public final class h {

    public static final h f18091a = new h();

    public final b a(FileInputStream fileInputStream) throws k1.a {
        try {
            m1.f fVarL = m1.f.l(fileInputStream);
            b bVar = new b(false);
            f[] pairs = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(pairs, "pairs");
            if (bVar.f18083b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (pairs.length > 0) {
                f fVar = pairs[0];
                throw null;
            }
            Map mapJ = fVarL.j();
            j.d(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                j.d(name, "name");
                j.d(value, "value");
                int iX = value.x();
                switch (iX == 0 ? -1 : g.f18090a[m1.j.b(iX)]) {
                    case -1:
                        throw new k1.a("Value case is null.", null);
                    case 0:
                    default:
                        throw new a7.c();
                    case 1:
                        bVar.b(new e(name), Boolean.valueOf(value.p()));
                        break;
                    case 2:
                        bVar.b(new e(name), Float.valueOf(value.s()));
                        break;
                    case 3:
                        bVar.b(new e(name), Double.valueOf(value.r()));
                        break;
                    case 4:
                        bVar.b(new e(name), Integer.valueOf(value.t()));
                        break;
                    case 5:
                        bVar.b(new e(name), Long.valueOf(value.u()));
                        break;
                    case 6:
                        e eVar = new e(name);
                        String strV = value.v();
                        j.d(strV, "value.string");
                        bVar.b(eVar, strV);
                        break;
                    case 7:
                        e eVar2 = new e(name);
                        y yVarK = value.w().k();
                        j.d(yVarK, "value.stringSet.stringsList");
                        bVar.b(eVar2, qc.g.p(yVarK));
                        break;
                    case 8:
                        throw new k1.a("Value not set.", null);
                }
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(bVar.f18082a);
            j.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new b(new LinkedHashMap(mapUnmodifiableMap), true);
        } catch (b0 e9) {
            throw new k1.a("Unable to parse preferences proto.", e9);
        }
    }

    public final void b(Object obj, l lVar) throws IOException {
        w wVarA;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((b) obj).f18082a);
        j.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        m1.d dVarK = m1.f.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f18089a;
            if (value instanceof Boolean) {
                i iVarY = k.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarY.c();
                k.m((k) iVarY.f1325b, zBooleanValue);
                wVarA = iVarY.a();
            } else if (value instanceof Float) {
                i iVarY2 = k.y();
                float fFloatValue = ((Number) value).floatValue();
                iVarY2.c();
                k.n((k) iVarY2.f1325b, fFloatValue);
                wVarA = iVarY2.a();
            } else if (value instanceof Double) {
                i iVarY3 = k.y();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarY3.c();
                k.l((k) iVarY3.f1325b, dDoubleValue);
                wVarA = iVarY3.a();
            } else if (value instanceof Integer) {
                i iVarY4 = k.y();
                int iIntValue = ((Number) value).intValue();
                iVarY4.c();
                k.o((k) iVarY4.f1325b, iIntValue);
                wVarA = iVarY4.a();
            } else if (value instanceof Long) {
                i iVarY5 = k.y();
                long jLongValue = ((Number) value).longValue();
                iVarY5.c();
                k.i((k) iVarY5.f1325b, jLongValue);
                wVarA = iVarY5.a();
            } else if (value instanceof String) {
                i iVarY6 = k.y();
                iVarY6.c();
                k.j((k) iVarY6.f1325b, (String) value);
                wVarA = iVarY6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(j.g(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                i iVarY7 = k.y();
                m1.g gVarL = m1.h.l();
                gVarL.c();
                m1.h.i((m1.h) gVarL.f1325b, (Set) value);
                iVarY7.c();
                k.k((k) iVarY7.f1325b, gVarL);
                wVarA = iVarY7.a();
            }
            dVarK.getClass();
            dVarK.c();
            m1.f.i((m1.f) dVarK.f1325b).put(str, (k) wVarA);
        }
        m1.f fVar = (m1.f) dVarK.a();
        int iA = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.k.h;
        if (iA > 4096) {
            iA = 4096;
        }
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(lVar, iA);
        fVar.c(kVar);
        if (kVar.f1267f > 0) {
            kVar.B();
        }
    }
}
