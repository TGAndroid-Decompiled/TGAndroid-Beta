package hb;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends eb.u {
    public final int f10439a;
    public final Object f10440b;
    public final Object f10441c;
    public final Object d;

    public o(eb.g gVar, eb.u uVar, Type type) {
        this.f10439a = 1;
        this.f10440b = gVar;
        this.f10441c = uVar;
        this.d = type;
    }

    @Override
    public final Object read(mb.a aVar) {
        switch (this.f10439a) {
            case 0:
                int x10 = aVar.x();
                if (x10 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((gb.o) this.d).f2();
                if (x10 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((eb.u) ((o) this.f10440b).f10441c).read(aVar);
                        if (map.put(read, ((eb.u) ((o) this.f10441c).f10441c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        rb.b.f44088b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new eb.m((String) entry.getKey()));
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
                        Object read2 = ((eb.u) ((o) this.f10440b).f10441c).read(aVar);
                        if (map.put(read2, ((eb.u) ((o) this.f10441c).f10441c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((eb.u) this.f10441c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f10440b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f10441c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(mb.b r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: hb.o.write(mb.b, java.lang.Object):void");
    }

    public o(d dVar, eb.g gVar, Type type, eb.u uVar, Type type2, eb.u uVar2, gb.o oVar) {
        this.f10439a = 0;
        this.f10440b = new o(gVar, uVar, type);
        this.f10441c = new o(gVar, uVar2, type2);
        this.d = oVar;
    }

    public o(Class cls) {
        Field[] fieldArr;
        this.f10439a = 2;
        this.f10440b = new HashMap();
        this.f10441c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                fb.b bVar = (fb.b) field.getAnnotation(fb.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f10440b).put(str2, r42);
                    }
                }
                ((HashMap) this.f10440b).put(name, r42);
                ((HashMap) this.f10441c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
