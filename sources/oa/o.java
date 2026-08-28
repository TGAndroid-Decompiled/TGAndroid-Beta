package oa;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends la.u {
    public final int f19151a;
    public final Object f19152b;
    public final Object f19153c;
    public final Object d;

    public o(Class cls) {
        Field[] fieldArr;
        this.f19151a = 2;
        this.f19152b = new HashMap();
        this.f19153c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                ma.b bVar = (ma.b) field.getAnnotation(ma.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f19152b).put(str2, r42);
                    }
                }
                ((HashMap) this.f19152b).put(name, r42);
                ((HashMap) this.f19153c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final Object read(ta.a aVar) {
        switch (this.f19151a) {
            case 0:
                int x10 = aVar.x();
                if (x10 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((na.n) this.d).Y1();
                if (x10 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((la.u) ((o) this.f19152b).f19153c).read(aVar);
                        if (map.put(read, ((la.u) ((o) this.f19153c).f19153c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        wa.a.f48783c.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new la.m((String) entry.getKey()));
                        } else {
                            int i9 = aVar.h;
                            if (i9 == 0) {
                                i9 = aVar.d();
                            }
                            if (i9 == 13) {
                                aVar.h = 9;
                            } else if (i9 == 12) {
                                aVar.h = 8;
                            } else if (i9 == 14) {
                                aVar.h = 10;
                            } else {
                                throw aVar.E("a name");
                            }
                        }
                        Object read2 = ((la.u) ((o) this.f19152b).f19153c).read(aVar);
                        if (map.put(read2, ((la.u) ((o) this.f19153c).f19153c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((la.u) this.f19153c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f19152b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f19153c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(ta.c r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: oa.o.write(ta.c, java.lang.Object):void");
    }

    public o(la.g gVar, la.u uVar, Type type) {
        this.f19151a = 1;
        this.f19152b = gVar;
        this.f19153c = uVar;
        this.d = type;
    }

    public o(d dVar, la.g gVar, Type type, la.u uVar, Type type2, la.u uVar2, na.n nVar) {
        this.f19151a = 0;
        this.f19152b = new o(gVar, uVar, type);
        this.f19153c = new o(gVar, uVar2, type2);
        this.d = nVar;
    }
}
