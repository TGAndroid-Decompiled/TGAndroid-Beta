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
import kotlin.jvm.internal.i;
import m1.h;
import m1.j;
import m1.k;
public final class g {
    public static final g f16382a = new Object();

    public final b a(FileInputStream fileInputStream) {
        int i10;
        try {
            m1.f l4 = m1.f.l(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            if (!bVar.f16376b.get()) {
                if (pairs.length <= 0) {
                    Map j3 = l4.j();
                    i.d(j3, "preferencesProto.preferencesMap");
                    for (Map.Entry entry : j3.entrySet()) {
                        String name = (String) entry.getKey();
                        k value = (k) entry.getValue();
                        i.d(name, "name");
                        i.d(value, "value");
                        int x10 = value.x();
                        if (x10 == 0) {
                            i10 = -1;
                        } else {
                            i10 = f.f16381a[j.c(x10)];
                        }
                        switch (i10) {
                            case -1:
                                throw new IOException("Value case is null.", null);
                            case 0:
                            default:
                                throw new RuntimeException();
                            case 1:
                                bVar.b(new d(name), Boolean.valueOf(value.p()));
                                break;
                            case 2:
                                bVar.b(new d(name), Float.valueOf(value.s()));
                                break;
                            case 3:
                                bVar.b(new d(name), Double.valueOf(value.r()));
                                break;
                            case 4:
                                bVar.b(new d(name), Integer.valueOf(value.t()));
                                break;
                            case 5:
                                bVar.b(new d(name), Long.valueOf(value.u()));
                                break;
                            case 6:
                                d dVar = new d(name);
                                String v = value.v();
                                i.d(v, "value.string");
                                bVar.b(dVar, v);
                                break;
                            case 7:
                                d dVar2 = new d(name);
                                y k10 = value.w().k();
                                i.d(k10, "value.stringSet.stringsList");
                                bVar.b(dVar2, hd.g.p(k10));
                                break;
                            case 8:
                                throw new IOException("Value not set.", null);
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(bVar.f16375a);
                    i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                    return new b(new LinkedHashMap(unmodifiableMap), true);
                }
                e eVar = pairs[0];
                throw null;
            }
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        } catch (b0 e7) {
            throw new IOException("Unable to parse preferences proto.", e7);
        }
    }

    public final void b(Object obj, l lVar) {
        w a2;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) obj).f16375a);
        i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        m1.d k10 = m1.f.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object value = entry.getValue();
            String str = ((d) entry.getKey()).f16380a;
            if (value instanceof Boolean) {
                m1.i y3 = k.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y3.c();
                k.m((k) y3.f1328b, booleanValue);
                a2 = y3.a();
            } else if (value instanceof Float) {
                m1.i y10 = k.y();
                float floatValue = ((Number) value).floatValue();
                y10.c();
                k.n((k) y10.f1328b, floatValue);
                a2 = y10.a();
            } else if (value instanceof Double) {
                m1.i y11 = k.y();
                double doubleValue = ((Number) value).doubleValue();
                y11.c();
                k.l((k) y11.f1328b, doubleValue);
                a2 = y11.a();
            } else if (value instanceof Integer) {
                m1.i y12 = k.y();
                int intValue = ((Number) value).intValue();
                y12.c();
                k.o((k) y12.f1328b, intValue);
                a2 = y12.a();
            } else if (value instanceof Long) {
                m1.i y13 = k.y();
                long longValue = ((Number) value).longValue();
                y13.c();
                k.i((k) y13.f1328b, longValue);
                a2 = y13.a();
            } else if (value instanceof String) {
                m1.i y14 = k.y();
                y14.c();
                k.j((k) y14.f1328b, (String) value);
                a2 = y14.a();
            } else if (value instanceof Set) {
                m1.i y15 = k.y();
                m1.g l4 = h.l();
                l4.c();
                h.i((h) l4.f1328b, (Set) value);
                y15.c();
                k.k((k) y15.f1328b, l4);
                a2 = y15.a();
            } else {
                throw new IllegalStateException(i.g(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            k10.getClass();
            k10.c();
            m1.f.i((m1.f) k10.f1328b).put(str, (k) a2);
        }
        m1.f fVar = (m1.f) k10.a();
        int a10 = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.j.h;
        if (a10 > 4096) {
            a10 = 4096;
        }
        androidx.datastore.preferences.protobuf.j jVar = new androidx.datastore.preferences.protobuf.j(lVar, a10);
        fVar.c(jVar);
        if (jVar.f1267f > 0) {
            jVar.B();
        }
    }
}
