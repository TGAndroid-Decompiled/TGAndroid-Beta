package org.telegram.messenger;
public final class h5 implements cs {
    public final int f22885a;
    public final Object f22886b;

    public h5(Object obj, int i3) {
        this.f22885a = i3;
        this.f22886b = obj;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
        switch (this.f22885a) {
            case 0:
                ei.i4 i4Var = (ei.i4) this.f22886b;
                if (i3 == 25) {
                    i4Var.d(false);
                    return;
                }
                return;
            default:
                oz ozVar = (oz) this.f22886b;
                if (i3 == 253) {
                    g0.h3(new vs(ozVar, 15));
                    return;
                }
                return;
        }
    }
}
