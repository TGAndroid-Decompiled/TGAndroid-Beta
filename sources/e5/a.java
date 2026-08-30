package e5;

import h5.w;
import java.util.List;
public final class a extends v4.e {
    public final int f5105n = 0;
    public final Object f5106o;

    public a(List list) {
        super("DvbDecoder");
        w wVar = new w((byte[]) list.get(0));
        this.f5106o = new x4.h(wVar.z(), wVar.z());
    }

    @Override
    public final v4.f k(int r46, boolean r47, byte[] r48) {
        throw new UnsupportedOperationException("Method not decompiled: e5.a.k(int, boolean, byte[]):v4.f");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.f5106o = new w();
    }
}
