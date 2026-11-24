package defpackage;

import android.view.ViewGroup;
public final class ida extends yo {
    public final byte c;
    public final Object d;
    public final ViewGroup e;

    public ida(ViewGroup viewGroup, Object obj, byte b) {
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
                iea ieaVar = (iea) obj;
                w39 adapter = ieaVar.n.getAdapter();
                nfa nfaVar = (nfa) viewGroup;
                hfa hfaVar = nfaVar.L;
                if (adapter == hfaVar) {
                    if (hfaVar.d(i) != 2) {
                        return 1;
                    }
                    return ieaVar.r.J;
                } else if (nfaVar.y1(adapter) == -1) {
                    return 1;
                } else {
                    ((kfa) adapter).getClass();
                    return 1;
                }
            case 1:
                o5c o5cVar = (o5c) obj;
                l5c l5cVar = ((q5c) viewGroup).g3;
                if (l5cVar == null) {
                    return o5cVar.J;
                }
                c4c G = l5cVar.G(i);
                if (G != null && (i2 = G.v) != -1) {
                    return i2;
                }
                return o5cVar.J;
            default:
                o5c o5cVar2 = (o5c) obj;
                l5c l5cVar2 = ((q5c) viewGroup).g3;
                if (l5cVar2 == null) {
                    return o5cVar2.J;
                }
                c4c G2 = l5cVar2.G(i);
                if (G2 != null && (i3 = G2.v) != -1) {
                    return i3;
                }
                return o5cVar2.J;
        }
    }
}
