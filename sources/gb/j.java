package gb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements db.v {
    public static final i f10476c = new i(0);
    public static final i d = new i(0);
    public final n4.x f10477a;
    public final ConcurrentHashMap f10478b = new ConcurrentHashMap();

    public j(n4.x xVar) {
        this.f10477a = xVar;
    }

    public final db.u a(n4.x xVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.o oVar;
        i iVar;
        db.u uVar;
        Object v22 = xVar.S(new kb.a(aVar2.value())).v2();
        boolean nullSafe = aVar2.nullSafe();
        if (v22 instanceof db.u) {
            uVar = (db.u) v22;
        } else if (v22 instanceof db.v) {
            db.v vVar = (db.v) v22;
            if (z10) {
                db.v vVar2 = (db.v) this.f10478b.putIfAbsent(aVar.f14779a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = v22 instanceof db.o;
            if (z11) {
                if (z11) {
                    oVar = (db.o) v22;
                } else {
                    oVar = null;
                }
                db.o oVar2 = oVar;
                if (z10) {
                    iVar = f10476c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + v22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.f14780b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.f14779a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f10477a, gVar, aVar, aVar2, true);
    }
}
