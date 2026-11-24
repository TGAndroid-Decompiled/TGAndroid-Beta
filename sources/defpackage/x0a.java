package defpackage;

import android.view.View;
public final class x0a implements View.OnClickListener {
    public final byte a;
    public final b1a b;

    public x0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                b1aVar.Z1.clear();
                b1aVar.T1.d.b(true);
                b1aVar.i1(true, false);
                return;
            default:
                b1aVar.d1(false);
                return;
        }
    }
}
