package gb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements db.v {
    public static final i f9570c = new i(0);
    public static final i d = new i(0);
    public final of.b f9571a;
    public final ConcurrentHashMap f9572b = new ConcurrentHashMap();

    public j(of.b bVar) {
        this.f9571a = bVar;
    }

    public final db.u a(of.b bVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.o oVar;
        i iVar;
        db.u uVar;
        Object p22 = bVar.K(new kb.a(aVar2.value())).p2();
        boolean nullSafe = aVar2.nullSafe();
        if (p22 instanceof db.u) {
            uVar = (db.u) p22;
        } else if (p22 instanceof db.v) {
            db.v vVar = (db.v) p22;
            if (z10) {
                db.v vVar2 = (db.v) this.f9572b.putIfAbsent(aVar.f13577a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = p22 instanceof db.o;
            if (z11) {
                if (z11) {
                    oVar = (db.o) p22;
                } else {
                    oVar = null;
                }
                db.o oVar2 = oVar;
                if (z10) {
                    iVar = f9570c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + p22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.f13578b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.f13577a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f9571a, gVar, aVar, aVar2, true);
    }
}
