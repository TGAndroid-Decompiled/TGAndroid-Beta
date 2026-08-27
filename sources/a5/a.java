package a5;

import d5.z;
import java.util.List;

public final class a extends r4.f {

    public final int f49b = 0;

    public final Object f50c;

    public a(List list) {
        super("DvbDecoder");
        z zVar = new z((byte[]) list.get(0));
        this.f50c = new t4.h(zVar.w(), zVar.w());
    }

    @Override
    public final r4.g c(int r50, boolean r51, byte[] r52) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.c(int, boolean, byte[]):r4.g");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.f50c = new z();
    }
}
