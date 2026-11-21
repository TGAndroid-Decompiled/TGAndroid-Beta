package hi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
public final class k7 extends org.telegram.ui.Components.sa implements fs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final e X1;
    public boolean Y1;
    public boolean Z1;
    public ai.x1 f14916a2;
    public long f14917b2;
    public TLRPC.WebPage f14918c2;
    public boolean d2;
    public int f14919e2;
    public String f14920f2;
    public final f7 f14921g2;
    public Pattern f14922h2;
    public boolean f14923i2;
    public boolean f14924j2;
    public boolean f14925k2;

    public k7(Context context, c5 c5Var, v5 v5Var, ai.x1 x1Var) {
        super(context, null, true, true, 2, c5Var);
        this.f14921g2 = new f7(this, 0);
        this.f14916a2 = x1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.N0(2131744391, null), true, false, -1, c5Var);
        this.U1 = l3Var;
        f7 f7Var = new f7(this, 1);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setOnEditorActionListener(new m.r2(f7Var, 2));
        j3Var.setHandlesColor(-12476440);
        j3Var.setCursorColor(-11230757);
        j3Var.setText("https://");
        j3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131747241, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i7 = org.telegram.ui.ActionBar.m6.f29578o6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        org.telegram.ui.ActionBar.t6.U(textView, i7, c5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i7);
        org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i7);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, K, K2, c5Var);
        c8.ra.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.ma.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        c cVar = new c(16, this, textView);
        textView.setOnClickListener(new ai.x2(22, this, cVar));
        cVar.run();
        j3Var.addTextChangedListener(new bi.v(7, this, cVar));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, gd.N0(2131744395, null), true, false, -1, c5Var);
        this.V1 = l3Var2;
        f7 f7Var2 = new f7(this, 1);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(f7Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        e eVar = new e(context, c5Var, true);
        this.X1 = eVar;
        eVar.i(gd.N0(2131744404, null), false, true);
        eVar.setOnClickListener(new e7(this, 1));
        eVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.f39546v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        g7 g7Var = new g7(this);
        g7Var.f59190m = false;
        g7Var.C = false;
        g7Var.o(nr.h);
        g7Var.n(350L);
        this.f39539o1.setItemAnimator(g7Var);
        ek0 ek0Var = this.f39539o1;
        int i10 = this.f30208u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.f39539o1.setOnItemClickListener(new bi.t1(this, context, v5Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(k7 k7Var, String str) {
        f7 f7Var = k7Var.f14921g2;
        if (str == null || TextUtils.equals(str, k7Var.f14920f2)) {
            return;
        }
        k7Var.f14920f2 = str;
        boolean g12 = k7Var.g1(str);
        org.telegram.messenger.g0.r(f7Var);
        if (g12) {
            if (!k7Var.d2 || k7Var.f14918c2 != null) {
                k7Var.d2 = true;
                k7Var.f14918c2 = null;
                di.f0 f0Var = k7Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(f7Var, 700L);
        } else if (k7Var.d2 || k7Var.f14918c2 != null) {
            k7Var.d2 = false;
            k7Var.f14918c2 = null;
            if (k7Var.f14919e2 != 0) {
                ConnectionsManager.getInstance(k7Var.f30170a).cancelRequest(k7Var.f14919e2, true);
                k7Var.f14919e2 = 0;
            }
            di.f0 f0Var2 = k7Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        k7Var.X1.setEnabled(g12);
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
        di.f0 f0Var = new di.f0(this.f39539o1, getContext(), this.f30170a, 0, true, new d7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131744401, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25239w0 && this.f14917b2 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && this.f14917b2 == webPage.f28586id) {
                    if (h1(webPage)) {
                        webPage = null;
                    }
                    this.f14918c2 = webPage;
                    this.d2 = false;
                    this.f14917b2 = 0L;
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
        ks.f(this.f30170a).n(this, ks.f25239w0);
    }

    public final void f1() {
        this.d2 = false;
        this.f14918c2 = null;
        if (this.f14919e2 != 0) {
            ConnectionsManager.getInstance(this.f30170a).cancelRequest(this.f14919e2, true);
            this.f14919e2 = 0;
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
        if (this.f14922h2 == null) {
            this.f14922h2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f14922h2.matcher(str).find();
    }

    public final void i1() {
        String str;
        if (!this.X1.f14564e0) {
            return;
        }
        if (this.f14916a2 != null) {
            tg.i0 i0Var = new tg.i0();
            i0Var.f57953c = this.U1.d.getText().toString();
            if (this.f14923i2) {
                str = this.V1.d.getText().toString();
            } else {
                str = null;
            }
            i0Var.f57952b = str;
            i0Var.d = this.f14918c2;
            i0Var.f57954e = this.f14925k2;
            i0Var.f57955f = this.f14924j2;
            this.f14916a2.a(i0Var);
            this.f14916a2 = null;
        }
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        ks.f(this.f30170a).c(this, ks.f25239w0);
        org.telegram.messenger.g0.h3(new f7(this, 2), 150L);
    }
}
