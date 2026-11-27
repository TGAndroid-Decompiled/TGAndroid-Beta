package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
public final class jw5 extends nx0 {
    public static final int t1 = 0;
    public int l1;
    public final String m1;
    public final e n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public d31 s1;

    public jw5(android.content.Context r33, org.telegram.tgnet.TLObject r34, java.lang.String r35, org.telegram.ui.ActionBar.e r36, defpackage.vnb r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw5.<init>(android.content.Context, org.telegram.tgnet.TLObject, java.lang.String, org.telegram.ui.ActionBar.e, vnb):void");
    }

    public static CharSequence E0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), hl.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void F0(Context context, e eVar, d31 d31Var, boolean z) {
        String M0;
        if (context == null) {
            if (eVar != null) {
                eVar.getContext();
                return;
            }
            return;
        }
        if (d31Var == null) {
            d31Var = d31.b0(eVar);
        }
        s21 s21Var = new s21(context, eVar.getResourceProvider());
        s21Var.a.f(2131624287, 28, 28, null);
        s21Var.b.setText(ob6.M0(2131745888, null));
        if (z) {
            M0 = ob6.M0(2131745898, null);
        } else {
            M0 = ob6.M0(2131745894, null);
        }
        s21Var.c.setText(M0);
        d31Var.b(s21Var, 2750).j();
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 == this.l1 && (v0 = aob.v0(aob.d6, this.J0)) != this.H0) {
                K(v0);
                this.l1 = this.H0;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
