package defpackage;

import android.view.View;
public final class p2a implements View.OnClickListener {
    public final byte a;
    public final t2a b;

    public p2a(t2a t2aVar, byte b) {
        this.a = b;
        this.b = t2aVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                t2aVar.Z1.clear();
                t2aVar.T1.d.b(true);
                t2aVar.j1(true, false);
                return;
            default:
                t2aVar.e1(false);
                return;
        }
    }
}
