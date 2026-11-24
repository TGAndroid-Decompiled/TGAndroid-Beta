package defpackage;

import android.net.Uri;
public final class uq3 implements qac {
    public final byte a;
    public final yq3 b;

    public uq3(yq3 yq3Var, byte b) {
        this.a = b;
        this.b = yq3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                xq3 xq3Var = yq3Var.n;
                if (xq3Var != null) {
                    xq3Var.setProgress(f.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (yq3Var.c && yq3Var.r != null) {
                    yq3Var.n.b(2131624056, 3500, jb6.N0("VideoSavedHint"));
                    yq3Var.c = false;
                    yq3Var.d();
                    yq3Var.w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                yq3Var.c = false;
                yq3Var.d();
                xq3 xq3Var2 = yq3Var.n;
                if (xq3Var2 != null) {
                    xq3Var2.a();
                    yq3Var.n = null;
                }
                xq3 xq3Var3 = new xq3(yq3Var.getContext());
                yq3Var.n = xq3Var3;
                xq3Var3.b(2131624056, 2500, jb6.N0("PhotoSavedHint"));
                yq3Var.b.addView(yq3Var.n);
                yq3Var.w = uri2;
                return;
        }
    }
}
