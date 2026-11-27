package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class gtb implements View.OnClickListener {
    public final a67 a;
    public final zu1 b;
    public final d79 c;
    public final LinearLayout d;
    public final fu5 e;
    public final fu5 f;
    public final ktb h;

    public gtb(ktb ktbVar, a67 a67Var, zu1 zu1Var, d79 d79Var, LinearLayout linearLayout, fu5 fu5Var, fu5 fu5Var2) {
        this.h = ktbVar;
        this.a = a67Var;
        this.b = zu1Var;
        this.c = d79Var;
        this.d = linearLayout;
        this.e = fu5Var;
        this.f = fu5Var2;
    }

    @Override
    public final void onClick(View view) {
        a67 a67Var = this.a;
        ArrayList arrayList = a67Var.b;
        ArrayList arrayList2 = a67Var.c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ktb ktbVar = this.h;
            zu1 zu1Var = this.b;
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
                zu1Var.presentFragment(new ProfileActivity(bundle, null));
                ktbVar.b(false);
                return;
            }
            if (xea.Y0 > 0 && zu1Var.m1.getKeyboardHeight() < hl.L(20.0f)) {
                v21 t = new d31(o11.a(ktbVar.getContext()), ktbVar.a).t(hl.S2(ob6.M0(2131748242, null)), null);
                zu1Var.C1 = t;
                t.j = 4000;
                t.j();
                xea.P(xea.Y0 - 1);
            }
            d79 d79Var = this.c;
            d79Var.requestLayout();
            this.d.requestLayout();
            d79Var.getAdapter().f();
            this.e.L(this.f);
        }
    }
}
