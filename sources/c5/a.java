package c5;

import f5.w;
import java.util.List;
public final class a extends t4.e {
    public final int f2950b = 0;
    public final Object f2951c;

    public a(List list) {
        super("DvbDecoder");
        w wVar = new w((byte[]) list.get(0));
        this.f2951c = new v4.h(wVar.w(), wVar.w());
    }

    @Override
    public final t4.f c(int r50, boolean r51, byte[] r52) {
        throw new UnsupportedOperationException("Method not decompiled: c5.a.c(int, boolean, byte[]):t4.f");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.f2951c = new w();
    }
}
