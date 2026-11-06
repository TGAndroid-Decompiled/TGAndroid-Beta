package fi;

import android.net.Uri;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
public final class p0 implements c20 {
    public final int f12572a;
    public final t0 f12573b;

    public p0(t0 t0Var, int i7) {
        this.f12572a = i7;
        this.f12573b = t0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12572a;
        t0 t0Var = this.f12573b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                s0 s0Var = t0Var.f12834n;
                if (s0Var != null) {
                    s0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (t0Var.f12831c && t0Var.f12835r != null) {
                    t0Var.f12834n.b(2131624055, 3500, hd.N0("VideoSavedHint"));
                    t0Var.f12831c = false;
                    t0Var.d();
                    t0Var.f12837w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0Var.f12831c = false;
                t0Var.d();
                s0 s0Var2 = t0Var.f12834n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var.f12834n = null;
                }
                s0 s0Var3 = new s0(t0Var.getContext());
                t0Var.f12834n = s0Var3;
                s0Var3.b(2131624055, 2500, hd.N0("PhotoSavedHint"));
                t0Var.f12830b.addView(t0Var.f12834n);
                t0Var.f12837w = uri2;
                return;
        }
    }
}
