package j3;
public final class o0 extends x {
    @Override
    public final void b(java.nio.ByteBuffer r10) {
        throw new UnsupportedOperationException("Method not decompiled: j3.o0.b(java.nio.ByteBuffer):void");
    }

    @Override
    public final h f(h hVar) {
        int i9 = hVar.f13249c;
        if (i9 != 3 && i9 != 2 && i9 != 268435456 && i9 != 536870912 && i9 != 805306368 && i9 != 4) {
            throw new i(hVar);
        }
        if (i9 != 2) {
            return new h(hVar.f13247a, hVar.f13248b, 2);
        }
        return h.f13246e;
    }
}
