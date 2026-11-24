package defpackage;

import android.view.View;
public final class o4b implements View.OnClickListener {
    public final byte a;
    public final t4b b;

    public o4b(t4b t4bVar, byte b) {
        this.a = b;
        this.b = t4bVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                t4bVar.Z0();
                return;
            default:
                t4bVar.c1();
                return;
        }
    }
}
