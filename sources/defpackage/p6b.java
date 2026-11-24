package defpackage;

import android.view.View;
public final class p6b implements View.OnClickListener {
    public final byte a;
    public final u6b b;

    public p6b(u6b u6bVar, byte b) {
        this.a = b;
        this.b = u6bVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        u6b u6bVar = this.b;
        switch (b) {
            case 0:
                u6bVar.Z0();
                return;
            default:
                u6bVar.c1();
                return;
        }
    }
}
