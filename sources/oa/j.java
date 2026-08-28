package oa;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements la.v {
    public static final i f19148c = new i(0);
    public static final i d = new i(0);
    public final g5.b f19149a;
    public final ConcurrentHashMap f19150b = new ConcurrentHashMap();

    public j(g5.b bVar) {
        this.f19149a = bVar;
    }

    public final la.u a(g5.b bVar, la.g gVar, sa.a aVar, ma.a aVar2, boolean z10) {
        la.o oVar;
        i iVar;
        la.u uVar;
        Object Y1 = bVar.l(new sa.a(aVar2.value())).Y1();
        boolean nullSafe = aVar2.nullSafe();
        if (Y1 instanceof la.u) {
            uVar = (la.u) Y1;
        } else if (Y1 instanceof la.v) {
            la.v vVar = (la.v) Y1;
            if (z10) {
                la.v vVar2 = (la.v) this.f19150b.putIfAbsent(aVar.f47502a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = Y1 instanceof la.o;
            if (z11) {
                if (z11) {
                    oVar = (la.o) Y1;
                } else {
                    oVar = null;
                }
                la.o oVar2 = oVar;
                if (z10) {
                    iVar = f19148c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + Y1.getClass().getName() + " as a @JsonAdapter for " + na.d.k(aVar.f47503b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        ma.a aVar2 = (ma.a) aVar.f47502a.getAnnotation(ma.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f19149a, gVar, aVar, aVar2, true);
    }
}
