package defpackage;

import android.view.View;
public final class zd8 implements View.OnClickListener {
    public final byte a;
    public final ae8 b;
    public final Runnable c;

    public zd8(ae8 ae8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ae8Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        ae8 ae8Var = this.b;
        switch (b) {
            case 0:
                ula ulaVar = ae8Var.d;
                if (ulaVar.I) {
                    ae8Var.I = runnable;
                    ulaVar.a(true);
                    return;
                }
                return;
            default:
                ula ulaVar2 = ae8Var.d;
                if (ulaVar2.I) {
                    ae8Var.I = runnable;
                    ulaVar2.a(true);
                    return;
                }
                return;
        }
    }
}
