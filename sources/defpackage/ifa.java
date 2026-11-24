package defpackage;

import android.view.ViewGroup;
public final class ifa extends yp {
    public final byte c;
    public final Object d;
    public final ViewGroup e;

    public ifa(ViewGroup viewGroup, Object obj, byte b) {
        this.c = b;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i) {
        int i2;
        int i3;
        byte b = this.c;
        ViewGroup viewGroup = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                iga igaVar = (iga) obj;
                y59 adapter = igaVar.n.getAdapter();
                nha nhaVar = (nha) viewGroup;
                hha hhaVar = nhaVar.L;
                if (adapter == hhaVar) {
                    if (hhaVar.d(i) != 2) {
                        return 1;
                    }
                    return igaVar.r.J;
                } else if (nhaVar.y1(adapter) == -1) {
                    return 1;
                } else {
                    ((kha) adapter).getClass();
                    return 1;
                }
            case 1:
                o7c o7cVar = (o7c) obj;
                l7c l7cVar = ((q7c) viewGroup).g3;
                if (l7cVar == null) {
                    return o7cVar.J;
                }
                c6c G = l7cVar.G(i);
                if (G != null && (i2 = G.v) != -1) {
                    return i2;
                }
                return o7cVar.J;
            default:
                o7c o7cVar2 = (o7c) obj;
                l7c l7cVar2 = ((q7c) viewGroup).g3;
                if (l7cVar2 == null) {
                    return o7cVar2.J;
                }
                c6c G2 = l7cVar2.G(i);
                if (G2 != null && (i3 = G2.v) != -1) {
                    return i3;
                }
                return o7cVar2.J;
        }
    }
}
