package gb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements db.v {
    public static final i f8701c = new i(0);
    public static final i d = new i(0);
    public final n4.y f8702a;
    public final ConcurrentHashMap f8703b = new ConcurrentHashMap();

    public j(n4.y yVar) {
        this.f8702a = yVar;
    }

    public final db.u a(n4.y yVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.o oVar;
        i iVar;
        db.u uVar;
        Object n22 = yVar.l(new kb.a(aVar2.value())).n2();
        boolean nullSafe = aVar2.nullSafe();
        if (n22 instanceof db.u) {
            uVar = (db.u) n22;
        } else if (n22 instanceof db.v) {
            db.v vVar = (db.v) n22;
            if (z10) {
                db.v vVar2 = (db.v) this.f8703b.putIfAbsent(aVar.f12419a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = n22 instanceof db.o;
            if (z11) {
                if (z11) {
                    oVar = (db.o) n22;
                } else {
                    oVar = null;
                }
                db.o oVar2 = oVar;
                if (z10) {
                    iVar = f8701c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + n22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.f12420b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.f12419a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f8702a, gVar, aVar, aVar2, true);
    }
}
