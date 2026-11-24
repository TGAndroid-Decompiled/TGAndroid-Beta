package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class re8 implements View.OnClickListener {
    public final t37 a;
    public final mu1 b;
    public final o39 c;
    public final LinearLayout d;
    public final cs5 e;
    public final cs5 f;
    public final ve8 h;

    public re8(ve8 ve8Var, t37 t37Var, mu1 mu1Var, o39 o39Var, LinearLayout linearLayout, cs5 cs5Var, cs5 cs5Var2) {
        this.h = ve8Var;
        this.a = t37Var;
        this.b = mu1Var;
        this.c = o39Var;
        this.d = linearLayout;
        this.e = cs5Var;
        this.f = cs5Var2;
    }

    @Override
    public final void onClick(View view) {
        t37 t37Var = this.a;
        ArrayList arrayList = t37Var.b;
        ArrayList arrayList2 = t37Var.c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ve8 ve8Var = this.h;
            mu1 mu1Var = this.b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                }
                mu1Var.presentFragment(new ProfileActivity(bundle, null));
                ve8Var.b(false);
                return;
            }
            if (gba.Z0 > 0 && mu1Var.m1.getKeyboardHeight() < gl.L(20.0f)) {
                m21 t = new u21(f11.a(ve8Var.getContext()), ve8Var.b).t(gl.T2(k96.M0(2131748296, null)), null);
                mu1Var.C1 = t;
                t.j = 4000;
                t.j();
                gba.P(gba.Z0 - 1);
            }
            o39 o39Var = this.c;
            o39Var.requestLayout();
            this.d.requestLayout();
            o39Var.getAdapter().f();
            this.e.L(this.f);
        }
    }
}
