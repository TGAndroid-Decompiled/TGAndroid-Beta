package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public final class fu5 extends fx0 {
    public static final int t1 = 0;
    public int l1;
    public final String m1;
    public final d n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public u21 s1;

    public fu5(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.d r36, defpackage.wjb r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.d, wjb):void");
    }

    public static CharSequence D0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), gl.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void E0(Context context, d dVar, u21 u21Var, boolean z) {
        String M0;
        if (context == null) {
            if (dVar != null) {
                dVar.getContext();
                return;
            }
            return;
        }
        if (u21Var == null) {
            u21Var = u21.b0(dVar);
        }
        j21 j21Var = new j21(context, dVar.getResourceProvider());
        j21Var.a.f(2131624287, 28, 28, null);
        j21Var.b.setText(k96.M0(2131745968, null));
        if (z) {
            M0 = k96.M0(2131745978, null);
        } else {
            M0 = k96.M0(2131745974, null);
        }
        j21Var.c.setText(M0);
        u21Var.b(j21Var, 2750).j();
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 == this.l1 && (v0 = bkb.v0(bkb.c6, this.J0)) != this.H0) {
                L(v0);
                this.l1 = this.H0;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
