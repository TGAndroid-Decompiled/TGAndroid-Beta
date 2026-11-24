package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pn1 implements View.OnClickListener {
    public final byte a = 1;
    public final boolean b;
    public final int c;
    public final d d;
    public final Serializable e;

    public pn1(yv1 yv1Var, TLRPC.User user, String str, boolean z, int i) {
        this.d = yv1Var;
        this.e = str;
        this.b = z;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        byte b = this.a;
        Serializable serializable = this.e;
        int i3 = this.c;
        boolean z = this.b;
        d dVar = this.d;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) dVar;
                String str = (String) serializable;
                Pattern pattern = ik.a;
                if (yv1Var.getParentActivity() != null) {
                    my0 i4 = wi8.i(yv1Var.getParentActivity(), false, 1, null);
                    if (z) {
                        i = 2131752131;
                    } else {
                        i = 2131752130;
                    }
                    i4.P = jb6.M0(i, null);
                    i4.Q = true;
                    LinearLayout linearLayout = new LinearLayout(yv1Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(yv1Var.getParentActivity());
                    linearLayout.addView(textView, qoe.t(-1, -1, 0, 21, 0, 21, 8));
                    anb.X(textView, cmb.F6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(gm.S2(jb6.a0("ChatWithAdminMessage", null, 2131752129, str, jb6.s(i3, false))));
                    TextView textView2 = new TextView(yv1Var.getParentActivity());
                    textView2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(gm.o());
                    textView2.setText(jb6.M0(2131749031, null));
                    anb.X(textView2, cmb.Ii, null);
                    int L = gm.L(8.0f);
                    int i5 = cmb.Ei;
                    int w0 = cmb.w0(null, i5, false);
                    int i6 = cmb.Gi;
                    int w02 = cmb.w0(null, i6, false);
                    fg0 i0 = cmb.i0(L, L, L, L, w0, w02, w02);
                    wmb M = anb.M(i5);
                    wmb M2 = anb.M(i6);
                    textView2.setBackground(i0);
                    anb.j(textView2, i0, M, M2, null);
                    linearLayout.addView(textView2, qoe.t(-1, 48, 0, 16, 12, 16, 8));
                    i4.O = linearLayout;
                    i4.show();
                    textView2.setOnClickListener(new di(i4, (byte) 0));
                    return;
                }
                return;
            default:
                nk3 nk3Var = (nk3) dVar;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = jb6.M0(2131743594, null);
                int i7 = cmb.wj;
                SpannableStringBuilder N2 = gm.N2(M0, i7, 0, new di3(nk3Var, (byte) 19), null);
                SpannableString spannableString = new SpannableString(">");
                pn2 pn2Var = new pn2(2131230876, 0);
                pn2Var.y = cmb.w0(null, i7, false);
                pn2Var.I = 0.7f;
                pn2Var.J = 0.7f;
                pn2Var.F = gm.L(12.0f);
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
                gm.G2(N2, spannableString, ">");
                c41 b0 = c41.b0(nk3Var);
                if (z) {
                    i2 = 2131743595;
                } else {
                    i2 = 2131743596;
                }
                b0.I(2131623990, jb6.M0(i2, null), N2).j();
                oc7.r1(i3).Q1().f(true, arrayList, new byb((byte) 1));
                oc7.r1(i3).Q1().a();
                return;
        }
    }

    public pn1(nk3 nk3Var, boolean z, int i, ArrayList arrayList) {
        this.d = nk3Var;
        this.b = z;
        this.c = i;
        this.e = arrayList;
    }
}
