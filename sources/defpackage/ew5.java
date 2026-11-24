package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public final class ew5 extends my0 {
    public static final int t1 = 0;
    public int l1;
    public final String m1;
    public final d n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public c41 s1;

    public ew5(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.d r36, defpackage.ylb r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew5.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.d, ylb):void");
    }

    public static CharSequence D0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), gm.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void E0(Context context, d dVar, c41 c41Var, boolean z) {
        String M0;
        if (context == null) {
            if (dVar != null) {
                dVar.getContext();
                return;
            }
            return;
        }
        if (c41Var == null) {
            c41Var = c41.b0(dVar);
        }
        r31 r31Var = new r31(context, dVar.getResourceProvider());
        r31Var.a.f(2131624287, 28, 28, null);
        r31Var.b.setText(jb6.M0(2131745894, null));
        if (z) {
            M0 = jb6.M0(2131745904, null);
        } else {
            M0 = jb6.M0(2131745900, null);
        }
        r31Var.c.setText(M0);
        c41Var.b(r31Var, 2750).j();
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 == this.l1 && (v0 = cmb.v0(cmb.c6, this.J0)) != this.H0) {
                K(v0);
                this.l1 = this.H0;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
