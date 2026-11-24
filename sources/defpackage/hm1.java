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
public final class hm1 implements View.OnClickListener {
    public final byte a = 1;
    public final boolean b;
    public final int c;
    public final d d;
    public final Serializable e;

    public hm1(mu1 mu1Var, TLRPC.User user, String str, boolean z, int i) {
        this.d = mu1Var;
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
                mu1 mu1Var = (mu1) dVar;
                String str = (String) serializable;
                Pattern pattern = ij.a;
                if (mu1Var.getParentActivity() != null) {
                    fx0 i4 = ug8.i(mu1Var.getParentActivity(), false, 1, null);
                    if (z) {
                        i = 2131752182;
                    } else {
                        i = 2131752181;
                    }
                    i4.P = k96.M0(i, null);
                    i4.Q = true;
                    LinearLayout linearLayout = new LinearLayout(mu1Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(mu1Var.getParentActivity());
                    linearLayout.addView(textView, nme.t(-1, -1, 0, 21, 0, 21, 8));
                    zkb.X(textView, bkb.F6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(gl.T2(k96.a0("ChatWithAdminMessage", null, 2131752180, str, k96.s(i3, false))));
                    TextView textView2 = new TextView(mu1Var.getParentActivity());
                    textView2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(gl.o());
                    textView2.setText(k96.M0(2131749082, null));
                    zkb.X(textView2, bkb.Ii, null);
                    int L = gl.L(8.0f);
                    int i5 = bkb.Ei;
                    int w0 = bkb.w0(null, i5, false);
                    int i6 = bkb.Gi;
                    int w02 = bkb.w0(null, i6, false);
                    ff0 i0 = bkb.i0(L, L, L, L, w0, w02, w02);
                    vkb M = zkb.M(i5);
                    vkb M2 = zkb.M(i6);
                    textView2.setBackground(i0);
                    zkb.j(textView2, i0, M, M2, null);
                    linearLayout.addView(textView2, nme.t(-1, 48, 0, 16, 12, 16, 8));
                    i4.O = linearLayout;
                    i4.show();
                    textView2.setOnClickListener(new dh(i4, (byte) 0));
                    return;
                }
                return;
            default:
                cj3 cj3Var = (cj3) dVar;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = k96.M0(2131743668, null);
                int i7 = bkb.wj;
                SpannableStringBuilder O2 = gl.O2(M0, i7, 0, new sg3(cj3Var, (byte) 18), null);
                SpannableString spannableString = new SpannableString(">");
                cm2 cm2Var = new cm2(2131230875, 0);
                cm2Var.y = bkb.w0(null, i7, false);
                cm2Var.I = 0.7f;
                cm2Var.J = 0.7f;
                cm2Var.F = gl.L(12.0f);
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                gl.H2(O2, spannableString, ">");
                u21 b0 = u21.b0(cj3Var);
                if (z) {
                    i2 = 2131743669;
                } else {
                    i2 = 2131743670;
                }
                b0.I(2131623990, k96.M0(i2, null), O2).j();
                na7.q1(i3).P1().f(true, arrayList, new yvb((byte) 1));
                na7.q1(i3).P1().a();
                return;
        }
    }

    public hm1(cj3 cj3Var, boolean z, int i, ArrayList arrayList) {
        this.d = cj3Var;
        this.b = z;
        this.c = i;
        this.e = arrayList;
    }
}
