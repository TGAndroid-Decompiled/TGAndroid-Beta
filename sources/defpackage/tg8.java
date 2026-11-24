package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class tg8 implements View.OnClickListener {
    public final t57 a;
    public final yv1 b;
    public final r59 c;
    public final LinearLayout d;
    public final bu5 e;
    public final bu5 f;
    public final xg8 h;

    public tg8(xg8 xg8Var, t57 t57Var, yv1 yv1Var, r59 r59Var, LinearLayout linearLayout, bu5 bu5Var, bu5 bu5Var2) {
        this.h = xg8Var;
        this.a = t57Var;
        this.b = yv1Var;
        this.c = r59Var;
        this.d = linearLayout;
        this.e = bu5Var;
        this.f = bu5Var2;
    }

    @Override
    public final void onClick(View view) {
        t57 t57Var = this.a;
        ArrayList arrayList = t57Var.b;
        ArrayList arrayList2 = t57Var.c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            xg8 xg8Var = this.h;
            yv1 yv1Var = this.b;
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
                yv1Var.presentFragment(new ProfileActivity(bundle, null));
                xg8Var.b(false);
                return;
            }
            if (gda.Y0 > 0 && yv1Var.m1.getKeyboardHeight() < gm.L(20.0f)) {
                u31 t = new c41(n21.a(xg8Var.getContext()), xg8Var.b).t(gm.S2(jb6.M0(2131748245, null)), null);
                yv1Var.C1 = t;
                t.j = 4000;
                t.j();
                gda.P(gda.Y0 - 1);
            }
            r59 r59Var = this.c;
            r59Var.requestLayout();
            this.d.requestLayout();
            r59Var.getAdapter().f();
            this.e.L(this.f);
        }
    }
}
