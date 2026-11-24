package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
public final class zo1 implements View.OnClickListener {
    public final t37 a;
    public final o39 b;
    public final LinearLayout c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final mu1 f;

    public zo1(mu1 mu1Var, t37 t37Var, o39 o39Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f = mu1Var;
        this.a = t37Var;
        this.b = o39Var;
        this.c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        t37 t37Var = this.a;
        ArrayList arrayList = t37Var.b;
        ArrayList arrayList2 = t37Var.c;
        mu1 mu1Var = this.f;
        if (mu1Var.g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    mu1Var.presentFragment(new ProfileActivity(bundle, null));
                    mu1Var.F5(true);
                    return;
                }
                return;
            }
            if (gba.Z0 > 0 && mu1Var.m1.getKeyboardHeight() < gl.L(20.0f)) {
                m21 t = new u21(f11.a(mu1Var.getParentActivity()), mu1Var.Ba).t(gl.T2(k96.M0(2131748296, null)), null);
                mu1Var.C1 = t;
                t.j = 4000;
                t.j();
                gba.P(gba.Z0 - 1);
            }
            o39 o39Var = this.b;
            o39Var.requestLayout();
            this.c.requestLayout();
            o39Var.getAdapter().f();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
