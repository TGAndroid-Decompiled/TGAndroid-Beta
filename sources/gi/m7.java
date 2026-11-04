package gi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public final class m7 extends org.telegram.ui.Components.ma implements cs {
    public ci.j0 Q1;
    public final org.telegram.ui.Cells.k3 R1;
    public final org.telegram.ui.Cells.k3 S1;
    public final FrameLayout T1;
    public final d U1;
    public boolean V1;
    public boolean W1;
    public ai.o1 X1;
    public long Y1;
    public TLRPC.WebPage Z1;
    public boolean f13254a2;
    public int f13255b2;
    public String c2;
    public final h7 f13256d2;
    public Pattern f13257e2;
    public boolean f13258f2;
    public boolean f13259g2;
    public boolean f13260h2;

    public m7(Context context, e5 e5Var, y5 y5Var, ai.o1 o1Var) {
        super(context, null, true, true, 2, e5Var);
        this.f13256d2 = new h7(this, 0);
        this.X1 = o1Var;
        N();
        Y0();
        this.A1 = org.telegram.messenger.g0.L(4.0f);
        this.B1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, bd.M0(2131744642, null), true, false, -1, e5Var);
        this.R1 = k3Var;
        h7 h7Var = new h7(this, 1);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.r2(h7Var, 2));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131747443, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i3 = org.telegram.ui.ActionBar.k6.f28081o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i3);
        org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i3);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, L2, L3, e5Var);
        pf.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, mf.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        g2.c cVar = new g2.c(23, this, textView);
        textView.setOnClickListener(new ai.d(20, this, cVar));
        cVar.run();
        i3Var.addTextChangedListener(new ai.a0(7, this, cVar));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, bd.M0(2131744646, null), true, false, -1, e5Var);
        this.S1 = k3Var2;
        h7 h7Var2 = new h7(this, 1);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(h7Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        d dVar = new d(context, e5Var, true);
        this.U1 = dVar;
        dVar.i(bd.M0(2131744655, null), false, true);
        dVar.setOnClickListener(new g7(this, 1));
        dVar.setEnabled(f1(k3Var.getText().toString()));
        frameLayout.addView(dVar, mf.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.f36108s1 = 0.2f;
        this.G1 = true;
        this.Q0 = true;
        this.R0 = true;
        i7 i7Var = new i7(this);
        i7Var.f55567m = false;
        i7Var.C = false;
        i7Var.o(xq.h);
        i7Var.n(350L);
        this.f36102l1.setItemAnimator(i7Var);
        tj0 tj0Var = this.f36102l1;
        int i10 = this.f28618u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        this.f36102l1.setOnItemClickListener(new ei.h0(this, context, y5Var, 2));
        ci.j0 j0Var = this.Q1;
        if (j0Var != null) {
            j0Var.O(false);
        }
    }

    public static void d1(m7 m7Var, String str) {
        h7 h7Var = m7Var.f13256d2;
        if (str == null || TextUtils.equals(str, m7Var.c2)) {
            return;
        }
        m7Var.c2 = str;
        boolean f12 = m7Var.f1(str);
        org.telegram.messenger.g0.r(h7Var);
        if (f12) {
            if (!m7Var.f13254a2 || m7Var.Z1 != null) {
                m7Var.f13254a2 = true;
                m7Var.Z1 = null;
                ci.j0 j0Var = m7Var.Q1;
                if (j0Var != null) {
                    j0Var.O(true);
                }
            }
            org.telegram.messenger.g0.i3(h7Var, 700L);
        } else if (m7Var.f13254a2 || m7Var.Z1 != null) {
            m7Var.f13254a2 = false;
            m7Var.Z1 = null;
            if (m7Var.f13255b2 != 0) {
                ConnectionsManager.getInstance(m7Var.f28583a).cancelRequest(m7Var.f13255b2, true);
                m7Var.f13255b2 = 0;
            }
            ci.j0 j0Var2 = m7Var.Q1;
            if (j0Var2 != null) {
                j0Var2.O(true);
            }
        }
        m7Var.U1.setEnabled(f12);
    }

    public static boolean g1(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        ci.j0 j0Var = new ci.j0(this.f36102l1, getContext(), this.f28583a, 0, true, new q4(this, 1), this.J0, 1);
        this.Q1 = j0Var;
        return j0Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131744652, null);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23326w0 && this.Y1 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && this.Y1 == webPage.f27156id) {
                    if (g1(webPage)) {
                        webPage = null;
                    }
                    this.Z1 = webPage;
                    this.f13254a2 = false;
                    this.Y1 = 0L;
                    ci.j0 j0Var = this.Q1;
                    if (j0Var != null) {
                        j0Var.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.R1.d);
        org.telegram.messenger.g0.v1(this.S1.d);
        super.dismiss();
        hs.f(this.f28583a).n(this, hs.f23326w0);
    }

    public final void e1() {
        this.f13254a2 = false;
        this.Z1 = null;
        if (this.f13255b2 != 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f13255b2, true);
            this.f13255b2 = 0;
        }
        ci.j0 j0Var = this.Q1;
        if (j0Var != null) {
            j0Var.O(true);
        }
    }

    public final boolean f1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f13257e2 == null) {
            this.f13257e2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f13257e2.matcher(str).find();
    }

    public final void h1() {
        String str;
        if (!this.U1.f12517d0) {
            return;
        }
        if (this.X1 != null) {
            ug.g0 g0Var = new ug.g0();
            g0Var.f56010c = this.R1.d.getText().toString();
            if (this.f13258f2) {
                str = this.S1.d.getText().toString();
            } else {
                str = null;
            }
            g0Var.f56009b = str;
            g0Var.d = this.Z1;
            g0Var.f56011e = this.f13260h2;
            g0Var.f56012f = this.f13259g2;
            this.X1.a(g0Var);
            this.X1 = null;
        }
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        hs.f(this.f28583a).c(this, hs.f23326w0);
        org.telegram.messenger.g0.i3(new h7(this, 2), 150L);
    }
}
