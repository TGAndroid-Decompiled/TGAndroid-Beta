package gb;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public final class o extends db.u {
    public final int f8704a;
    public final Object f8705b;
    public final Object f8706c;
    public final Object d;

    public o(db.g gVar, db.u uVar, Type type) {
        this.f8704a = 1;
        this.f8705b = gVar;
        this.f8706c = uVar;
        this.d = type;
    }

    @Override
    public final Object read(lb.a aVar) {
        switch (this.f8704a) {
            case 0:
                int x10 = aVar.x();
                if (x10 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((fb.n) this.d).n2();
                if (x10 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((db.u) ((o) this.f8705b).f8706c).read(aVar);
                        if (map.put(read, ((db.u) ((o) this.f8706c).f8706c).read(aVar)) == null) {
                            aVar.e();
                        } else {
                            throw new RuntimeException("duplicate key: " + read);
                        }
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        rb.a.f41400b.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new db.m((String) entry.getKey()));
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
                        Object read2 = ((db.u) ((o) this.f8705b).f8706c).read(aVar);
                        if (map.put(read2, ((db.u) ((o) this.f8706c).f8706c).read(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((db.u) this.f8706c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.f8705b).get(v);
                if (r02 == null) {
                    return (Enum) ((HashMap) this.f8706c).get(v);
                }
                return r02;
        }
    }

    @Override
    public final void write(lb.b r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: gb.o.write(lb.b, java.lang.Object):void");
    }

    public o(d dVar, db.g gVar, Type type, db.u uVar, Type type2, db.u uVar2, fb.n nVar) {
        this.f8704a = 0;
        this.f8705b = new o(gVar, uVar, type);
        this.f8706c = new o(gVar, uVar2, type2);
        this.d = nVar;
    }

    public o(Class cls) {
        Field[] fieldArr;
        this.f8704a = 2;
        this.f8705b = new HashMap();
        this.f8706c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                eb.b bVar = (eb.b) field.getAnnotation(eb.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f8705b).put(str2, r42);
                    }
                }
                ((HashMap) this.f8705b).put(name, r42);
                ((HashMap) this.f8706c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
