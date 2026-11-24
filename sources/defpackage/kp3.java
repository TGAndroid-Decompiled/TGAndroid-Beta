package defpackage;

import android.net.Uri;
public final class kp3 implements p8c {
    public final byte a;
    public final op3 b;

    public kp3(op3 op3Var, byte b) {
        this.a = b;
        this.b = op3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                np3 np3Var = op3Var.n;
                if (np3Var != null) {
                    np3Var.setProgress(f.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (op3Var.c && op3Var.r != null) {
                    op3Var.n.b(2131624056, 3500, k96.N0("VideoSavedHint"));
                    op3Var.c = false;
                    op3Var.d();
                    op3Var.w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                op3Var.c = false;
                op3Var.d();
                np3 np3Var2 = op3Var.n;
                if (np3Var2 != null) {
                    np3Var2.a();
                    op3Var.n = null;
                }
                np3 np3Var3 = new np3(op3Var.getContext());
                op3Var.n = np3Var3;
                np3Var3.b(2131624056, 2500, k96.N0("PhotoSavedHint"));
                op3Var.b.addView(op3Var.n);
                op3Var.w = uri2;
                return;
        }
    }
}
