package hb;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements eb.v {
    public static final i f10440c = new i(0);
    public static final i d = new i(0);
    public final qf.b f10441a;
    public final ConcurrentHashMap f10442b = new ConcurrentHashMap();

    public j(qf.b bVar) {
        this.f10441a = bVar;
    }

    public final eb.u a(qf.b bVar, eb.g gVar, lb.a aVar, fb.a aVar2, boolean z10) {
        eb.o oVar;
        i iVar;
        eb.u uVar;
        Object i22 = bVar.W(new lb.a(aVar2.value())).i2();
        boolean nullSafe = aVar2.nullSafe();
        if (i22 instanceof eb.u) {
            uVar = (eb.u) i22;
        } else if (i22 instanceof eb.v) {
            eb.v vVar = (eb.v) i22;
            if (z10) {
                eb.v vVar2 = (eb.v) this.f10442b.putIfAbsent(aVar.f14653a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = i22 instanceof eb.o;
            if (z11) {
                if (z11) {
                    oVar = (eb.o) i22;
                } else {
                    oVar = null;
                }
                eb.o oVar2 = oVar;
                if (z10) {
                    iVar = f10440c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + i22.getClass().getName() + " as a @JsonAdapter for " + gb.d.k(aVar.f14654b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        fb.a aVar2 = (fb.a) aVar.f14653a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f10441a, gVar, aVar, aVar2, true);
    }
}
