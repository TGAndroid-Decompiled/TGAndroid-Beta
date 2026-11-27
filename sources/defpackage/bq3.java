package defpackage;

import android.net.Uri;
public final class bq3 implements pcc {
    public final byte a;
    public final fq3 b;

    public bq3(fq3 fq3Var, byte b) {
        this.a = b;
        this.b = fq3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                eq3 eq3Var = fq3Var.n;
                if (eq3Var != null) {
                    eq3Var.setProgress(f.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (fq3Var.c && fq3Var.r != null) {
                    fq3Var.n.b(2131624056, 3500, ob6.N0("VideoSavedHint"));
                    fq3Var.c = false;
                    fq3Var.d();
                    fq3Var.w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                fq3Var.c = false;
                fq3Var.d();
                eq3 eq3Var2 = fq3Var.n;
                if (eq3Var2 != null) {
                    eq3Var2.a();
                    fq3Var.n = null;
                }
                eq3 eq3Var3 = new eq3(fq3Var.getContext());
                fq3Var.n = eq3Var3;
                eq3Var3.b(2131624056, 2500, ob6.N0("PhotoSavedHint"));
                fq3Var.b.addView(fq3Var.n);
                fq3Var.w = uri2;
                return;
        }
    }
}
