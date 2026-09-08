package gb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements db.v {
    public static final i f10567c = new i(0);
    public static final i d = new i(0);
    public final pf.b f10568a;
    public final ConcurrentHashMap f10569b = new ConcurrentHashMap();

    public j(pf.b bVar) {
        this.f10568a = bVar;
    }

    public final db.u a(pf.b bVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.o oVar;
        i iVar;
        db.u uVar;
        Object h22 = bVar.T(new kb.a(aVar2.value())).h2();
        boolean nullSafe = aVar2.nullSafe();
        if (h22 instanceof db.u) {
            uVar = (db.u) h22;
        } else if (h22 instanceof db.v) {
            db.v vVar = (db.v) h22;
            if (z10) {
                db.v vVar2 = (db.v) this.f10569b.putIfAbsent(aVar.f14914a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = h22 instanceof db.o;
            if (z11) {
                if (z11) {
                    oVar = (db.o) h22;
                } else {
                    oVar = null;
                }
                db.o oVar2 = oVar;
                if (z10) {
                    iVar = f10567c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + h22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.f14915b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.f14914a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f10568a, gVar, aVar, aVar2, true);
    }
}
