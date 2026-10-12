package gb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements db.v {
    public static final i f10474c = new i(0);
    public static final i d = new i(0);
    public final n4.y f10475a;
    public final ConcurrentHashMap f10476b = new ConcurrentHashMap();

    public j(n4.y yVar) {
        this.f10475a = yVar;
    }

    public final db.u a(n4.y yVar, db.g gVar, kb.a aVar, eb.a aVar2, boolean z10) {
        db.o oVar;
        i iVar;
        db.u uVar;
        Object w22 = yVar.H(new kb.a(aVar2.value())).w2();
        boolean nullSafe = aVar2.nullSafe();
        if (w22 instanceof db.u) {
            uVar = (db.u) w22;
        } else if (w22 instanceof db.v) {
            db.v vVar = (db.v) w22;
            if (z10) {
                db.v vVar2 = (db.v) this.f10476b.putIfAbsent(aVar.f14775a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = w22 instanceof db.o;
            if (z11) {
                if (z11) {
                    oVar = (db.o) w22;
                } else {
                    oVar = null;
                }
                db.o oVar2 = oVar;
                if (z10) {
                    iVar = f10474c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + w22.getClass().getName() + " as a @JsonAdapter for " + fb.d.k(aVar.f14776b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        eb.a aVar2 = (eb.a) aVar.f14775a.getAnnotation(eb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f10475a, gVar, aVar, aVar2, true);
    }
}
