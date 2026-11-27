package defpackage;

import android.view.ViewGroup;
public final class zga extends zo {
    public final byte c;
    public final Object d;
    public final ViewGroup e;

    public zga(ViewGroup viewGroup, Object obj, byte b) {
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
                zha zhaVar = (zha) obj;
                j79 adapter = zhaVar.n.getAdapter();
                eja ejaVar = (eja) viewGroup;
                yia yiaVar = ejaVar.L;
                if (adapter == yiaVar) {
                    if (yiaVar.d(i) != 2) {
                        return 1;
                    }
                    return zhaVar.r.J;
                } else if (ejaVar.y1(adapter) == -1) {
                    return 1;
                } else {
                    ((bja) adapter).getClass();
                    return 1;
                }
            case 1:
                o9c o9cVar = (o9c) obj;
                l9c l9cVar = ((q9c) viewGroup).g3;
                if (l9cVar == null) {
                    return o9cVar.J;
                }
                b8c G = l9cVar.G(i);
                if (G != null && (i2 = G.v) != -1) {
                    return i2;
                }
                return o9cVar.J;
            default:
                o9c o9cVar2 = (o9c) obj;
                l9c l9cVar2 = ((q9c) viewGroup).g3;
                if (l9cVar2 == null) {
                    return o9cVar2.J;
                }
                b8c G2 = l9cVar2.G(i);
                if (G2 != null && (i3 = G2.v) != -1) {
                    return i3;
                }
                return o9cVar2.J;
        }
    }
}
