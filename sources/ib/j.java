package ib;

import j$.util.concurrent.ConcurrentHashMap;
public final class j implements fb.v {
    public static final i f13945c = new i(0);
    public static final i d = new i(0);
    public final rf.b f13946a;
    public final ConcurrentHashMap f13947b = new ConcurrentHashMap();

    public j(rf.b bVar) {
        this.f13946a = bVar;
    }

    public final fb.u a(rf.b bVar, fb.g gVar, mb.a aVar, gb.a aVar2, boolean z10) {
        fb.o oVar;
        i iVar;
        fb.u uVar;
        Object U1 = bVar.K(new mb.a(aVar2.value())).U1();
        boolean nullSafe = aVar2.nullSafe();
        if (U1 instanceof fb.u) {
            uVar = (fb.u) U1;
        } else if (U1 instanceof fb.v) {
            fb.v vVar = (fb.v) U1;
            if (z10) {
                fb.v vVar2 = (fb.v) this.f13947b.putIfAbsent(aVar.f18407a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.create(gVar, aVar);
        } else {
            boolean z11 = U1 instanceof fb.o;
            if (z11) {
                if (z11) {
                    oVar = (fb.o) U1;
                } else {
                    oVar = null;
                }
                fb.o oVar2 = oVar;
                if (z10) {
                    iVar = f13945c;
                } else {
                    iVar = d;
                }
                a0 a0Var = new a0(oVar2, gVar, aVar, iVar, nullSafe);
                nullSafe = false;
                uVar = a0Var;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + U1.getClass().getName() + " as a @JsonAdapter for " + hb.d.k(aVar.f18408b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (uVar != null && nullSafe) {
            return uVar.nullSafe();
        }
        return uVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        gb.a aVar2 = (gb.a) aVar.f18407a.getAnnotation(gb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f13946a, gVar, aVar, aVar2, true);
    }
}
