package hi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
public final class l7 extends org.telegram.ui.Components.sa implements gs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final d X1;
    public boolean Y1;
    public boolean Z1;
    public ai.r1 f14931a2;
    public long f14932b2;
    public TLRPC.WebPage f14933c2;
    public boolean d2;
    public int f14934e2;
    public String f14935f2;
    public final g7 f14936g2;
    public Pattern f14937h2;
    public boolean f14938i2;
    public boolean f14939j2;
    public boolean f14940k2;

    public l7(Context context, d5 d5Var, w5 w5Var, ai.r1 r1Var) {
        super(context, null, true, true, 2, d5Var);
        this.f14936g2 = new g7(this, 0);
        this.f14931a2 = r1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, hd.N0(2131744391, null), true, false, -1, d5Var);
        this.U1 = l3Var;
        g7 g7Var = new g7(this, 1);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setOnEditorActionListener(new m.r2(g7Var, 2));
        j3Var.setHandlesColor(-12476440);
        j3Var.setCursorColor(-11230757);
        j3Var.setText("https://");
        j3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131747241, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i7 = org.telegram.ui.ActionBar.m6.f29547o6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        org.telegram.ui.ActionBar.t6.U(textView, i7, d5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i7);
        org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i7);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, K, K2, d5Var);
        c8.sa.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.na.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        q1 q1Var = new q1(14, this, textView);
        textView.setOnClickListener(new ai.o2(22, this, q1Var));
        q1Var.run();
        j3Var.addTextChangedListener(new bi.v(7, this, q1Var));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, hd.N0(2131744395, null), true, false, -1, d5Var);
        this.V1 = l3Var2;
        g7 g7Var2 = new g7(this, 1);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(g7Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        d dVar = new d(context, d5Var, true);
        this.X1 = dVar;
        dVar.i(hd.N0(2131744404, null), false, true);
        dVar.setOnClickListener(new f7(this, 1));
        dVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(dVar, c8.na.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.f39494v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        h7 h7Var = new h7(this);
        h7Var.f59139m = false;
        h7Var.C = false;
        h7Var.o(nr.h);
        h7Var.n(350L);
        this.f39487o1.setItemAnimator(h7Var);
        ek0 ek0Var = this.f39487o1;
        int i10 = this.f30177u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.f39487o1.setOnItemClickListener(new bi.u1(this, context, w5Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(l7 l7Var, String str) {
        g7 g7Var = l7Var.f14936g2;
        if (str == null || TextUtils.equals(str, l7Var.f14935f2)) {
            return;
        }
        l7Var.f14935f2 = str;
        boolean g12 = l7Var.g1(str);
        org.telegram.messenger.g0.r(g7Var);
        if (g12) {
            if (!l7Var.d2 || l7Var.f14933c2 != null) {
                l7Var.d2 = true;
                l7Var.f14933c2 = null;
                di.f0 f0Var = l7Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(g7Var, 700L);
        } else if (l7Var.d2 || l7Var.f14933c2 != null) {
            l7Var.d2 = false;
            l7Var.f14933c2 = null;
            if (l7Var.f14934e2 != 0) {
                ConnectionsManager.getInstance(l7Var.f30139a).cancelRequest(l7Var.f14934e2, true);
                l7Var.f14934e2 = 0;
            }
            di.f0 f0Var2 = l7Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        l7Var.X1.setEnabled(g12);
    }

    public static boolean h1(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        di.f0 f0Var = new di.f0(this.f39487o1, getContext(), this.f30139a, 0, true, new e7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131744401, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25369w0 && this.f14932b2 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && this.f14932b2 == webPage.f28553id) {
                    if (h1(webPage)) {
                        webPage = null;
                    }
                    this.f14933c2 = webPage;
                    this.d2 = false;
                    this.f14932b2 = 0L;
                    di.f0 f0Var = this.T1;
                    if (f0Var != null) {
                        f0Var.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.d);
        org.telegram.messenger.g0.v1(this.V1.d);
        super.dismiss();
        ls.f(this.f30139a).n(this, ls.f25369w0);
    }

    public final void f1() {
        this.d2 = false;
        this.f14933c2 = null;
        if (this.f14934e2 != 0) {
            ConnectionsManager.getInstance(this.f30139a).cancelRequest(this.f14934e2, true);
            this.f14934e2 = 0;
        }
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(true);
        }
    }

    public final boolean g1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f14937h2 == null) {
            this.f14937h2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f14937h2.matcher(str).find();
    }

    public final void i1() {
        String str;
        if (!this.X1.f14303e0) {
            return;
        }
        if (this.f14931a2 != null) {
            tg.i0 i0Var = new tg.i0();
            i0Var.f57922c = this.U1.d.getText().toString();
            if (this.f14938i2) {
                str = this.V1.d.getText().toString();
            } else {
                str = null;
            }
            i0Var.f57921b = str;
            i0Var.d = this.f14933c2;
            i0Var.f57923e = this.f14940k2;
            i0Var.f57924f = this.f14939j2;
            this.f14931a2.a(i0Var);
            this.f14931a2 = null;
        }
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        ls.f(this.f30139a).c(this, ls.f25369w0);
        org.telegram.messenger.g0.h3(new g7(this, 2), 150L);
    }
}
