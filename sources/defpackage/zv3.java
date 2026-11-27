package defpackage;

import android.view.ViewGroup;
public final class zv3 extends cxe {
    public final byte a;
    public final ViewGroup b;

    public zv3(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void a() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((dw3) viewGroup).j3 = false;
                return;
            case 1:
                ((pz8) viewGroup).w = false;
                return;
            default:
                ((n1a) viewGroup).y1 = false;
                return;
        }
    }

    @Override
    public final void b() {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((dw3) viewGroup).j3 = true;
                return;
            case 1:
            default:
                return;
            case 2:
                ((n1a) viewGroup).y1 = true;
                return;
        }
    }
}
