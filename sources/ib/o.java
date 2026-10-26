package ib;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends fb.u {
    public final int f13948a;
    public final Object f13949b;
    public final Object f13950c;
    public final Object d;

    public o(fb.g gVar, fb.u uVar, Type type) {
        this.f13948a = 1;
        this.f13949b = gVar;
        this.f13950c = uVar;
        this.d = type;
    }

    @Override
    public final Object read(nb.a aVar) {
        switch (this.f13948a) {
            case 0:
                int x9 = aVar.x();
                if (x9 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((hb.n) this.d).U1();
                if (x9 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((fb.u) ((o) this.f13949b).f13950c).read(aVar);
                        if (map.put(read, ((fb.u) ((o) this.f13950c).f13950c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        qb.a.f47028b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new fb.m((String) entry.getKey()));
                        } else {
                            int i10 = aVar.h;
                            if (i10 == 0) {
                                i10 = aVar.d();
                            }
                            if (i10 == 13) {
                                aVar.h = 9;
                            } else if (i10 == 12) {
                                aVar.h = 8;
                            } else if (i10 == 14) {
                                aVar.h = 10;
                            } else {
                                throw aVar.E("a name");
                            }
                        }
                        Object read2 = ((fb.u) ((o) this.f13949b).f13950c).read(aVar);
                        if (map.put(read2, ((fb.u) ((o) this.f13950c).f13950c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((fb.u) this.f13950c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f13949b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f13950c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(nb.b r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ib.o.write(nb.b, java.lang.Object):void");
    }

    public o(d dVar, fb.g gVar, Type type, fb.u uVar, Type type2, fb.u uVar2, hb.n nVar) {
        this.f13948a = 0;
        this.f13949b = new o(gVar, uVar, type);
        this.f13950c = new o(gVar, uVar2, type2);
        this.d = nVar;
    }

    public o(Class cls) {
        Field[] fieldArr;
        this.f13948a = 2;
        this.f13949b = new HashMap();
        this.f13950c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                gb.b bVar = (gb.b) field.getAnnotation(gb.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f13949b).put(str2, r42);
                    }
                }
                ((HashMap) this.f13949b).put(name, r42);
                ((HashMap) this.f13950c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
