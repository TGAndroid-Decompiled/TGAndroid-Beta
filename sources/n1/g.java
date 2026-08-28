package n1;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
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
    public static final g f18264a = new Object();

    public final b a(FileInputStream fileInputStream) {
        int i9;
        try {
            m1.f l10 = m1.f.l(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            if (!bVar.f18258b.get()) {
                if (pairs.length <= 0) {
                    Map j10 = l10.j();
                    i.d(j10, "preferencesProto.preferencesMap");
                    for (Map.Entry entry : j10.entrySet()) {
                        String name = (String) entry.getKey();
                        k value = (k) entry.getValue();
                        i.d(name, "name");
                        i.d(value, "value");
                        int x10 = value.x();
                        if (x10 == 0) {
                            i9 = -1;
                        } else {
                            i9 = f.f18263a[j.b(x10)];
                        }
                        switch (i9) {
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
                                z k10 = value.w().k();
                                i.d(k10, "value.stringSet.stringsList");
                                bVar.b(dVar2, pc.g.p(k10));
                                break;
                            case 8:
                                throw new IOException("Value not set.", null);
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(bVar.f18257a);
                    i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                    return new b(new LinkedHashMap(unmodifiableMap), true);
                }
                e eVar = pairs[0];
                throw null;
            }
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        } catch (c0 e10) {
            throw new IOException("Unable to parse preferences proto.", e10);
        }
    }

    public final void b(Object obj, l lVar) {
        x a2;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((b) obj).f18257a);
        i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        m1.d k10 = m1.f.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object value = entry.getValue();
            String str = ((d) entry.getKey()).f18262a;
            if (value instanceof Boolean) {
                m1.i y10 = k.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y10.c();
                k.m((k) y10.f835b, booleanValue);
                a2 = y10.a();
            } else if (value instanceof Float) {
                m1.i y11 = k.y();
                float floatValue = ((Number) value).floatValue();
                y11.c();
                k.n((k) y11.f835b, floatValue);
                a2 = y11.a();
            } else if (value instanceof Double) {
                m1.i y12 = k.y();
                double doubleValue = ((Number) value).doubleValue();
                y12.c();
                k.l((k) y12.f835b, doubleValue);
                a2 = y12.a();
            } else if (value instanceof Integer) {
                m1.i y13 = k.y();
                int intValue = ((Number) value).intValue();
                y13.c();
                k.o((k) y13.f835b, intValue);
                a2 = y13.a();
            } else if (value instanceof Long) {
                m1.i y14 = k.y();
                long longValue = ((Number) value).longValue();
                y14.c();
                k.i((k) y14.f835b, longValue);
                a2 = y14.a();
            } else if (value instanceof String) {
                m1.i y15 = k.y();
                y15.c();
                k.j((k) y15.f835b, (String) value);
                a2 = y15.a();
            } else if (value instanceof Set) {
                m1.i y16 = k.y();
                m1.g l10 = h.l();
                l10.c();
                h.i((h) l10.f835b, (Set) value);
                y16.c();
                k.k((k) y16.f835b, l10);
                a2 = y16.a();
            } else {
                throw new IllegalStateException(i.g(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            k10.getClass();
            k10.c();
            m1.f.i((m1.f) k10.f835b).put(str, (k) a2);
        }
        m1.f fVar = (m1.f) k10.a();
        int a3 = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.k.h;
        if (a3 > 4096) {
            a3 = 4096;
        }
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(lVar, a3);
        fVar.c(kVar);
        if (kVar.f774f > 0) {
            kVar.B();
        }
    }
}
