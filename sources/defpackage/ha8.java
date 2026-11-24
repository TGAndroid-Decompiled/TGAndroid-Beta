package defpackage;

import android.view.View;
public final class ha8 implements View.OnClickListener {
    public final byte a;
    public final ja8 b;
    public final Runnable c;

    public ha8(ja8 ja8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ja8Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        ja8 ja8Var = this.b;
        switch (b) {
            case 0:
                zha zhaVar = ja8Var.d;
                if (zhaVar.I) {
                    ja8Var.I = runnable;
                    zhaVar.a(true);
                    return;
                }
                return;
            default:
                zha zhaVar2 = ja8Var.d;
                if (zhaVar2.I) {
                    ja8Var.I = runnable;
                    zhaVar2.a(true);
                    return;
                }
                return;
        }
    }
}
