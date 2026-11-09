package fi;

import android.net.Uri;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
public final class p0 implements c20 {
    public final int f12570a;
    public final t0 f12571b;

    public p0(t0 t0Var, int i7) {
        this.f12570a = i7;
        this.f12571b = t0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f12570a;
        t0 t0Var = this.f12571b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                s0 s0Var = t0Var.f12833n;
                if (s0Var != null) {
                    s0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (t0Var.f12830c && t0Var.f12834r != null) {
                    t0Var.f12833n.b(2131624055, 3500, id.N0("VideoSavedHint"));
                    t0Var.f12830c = false;
                    t0Var.d();
                    t0Var.f12836w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0Var.f12830c = false;
                t0Var.d();
                s0 s0Var2 = t0Var.f12833n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var.f12833n = null;
                }
                s0 s0Var3 = new s0(t0Var.getContext());
                t0Var.f12833n = s0Var3;
                s0Var3.b(2131624055, 2500, id.N0("PhotoSavedHint"));
                t0Var.f12829b.addView(t0Var.f12833n);
                t0Var.f12836w = uri2;
                return;
        }
    }
}
