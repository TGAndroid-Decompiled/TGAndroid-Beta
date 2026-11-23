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
import org.telegram.ui.Components.kr;
public final class f8 extends org.telegram.ui.Components.ra implements fs {
    public di.f0 T1;
    public final org.telegram.ui.Cells.l3 U1;
    public final org.telegram.ui.Cells.l3 V1;
    public final FrameLayout W1;
    public final e X1;
    public boolean Y1;
    public boolean Z1;
    public ai.s1 f14484a2;
    public long f14485b2;
    public TLRPC.WebPage f14486c2;
    public boolean d2;
    public int f14487e2;
    public String f14488f2;
    public final a8 f14489g2;
    public Pattern f14490h2;
    public boolean f14491i2;
    public boolean f14492j2;
    public boolean f14493k2;

    public f8(Context context, n5 n5Var, f6 f6Var, ai.s1 s1Var) {
        super(context, null, true, true, 2, n5Var);
        this.f14489g2 = new a8(this, 0);
        this.f14484a2 = s1Var;
        O();
        Z0();
        this.D1 = org.telegram.messenger.g0.L(4.0f);
        this.E1 = org.telegram.messenger.g0.L(-15.0f);
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, gd.N0(2131744388, null), true, false, -1, n5Var);
        this.U1 = l3Var;
        a8 a8Var = new a8(this, 1);
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setOnEditorActionListener(new m.r2(a8Var, 2));
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
        int i7 = org.telegram.ui.ActionBar.n6.f29651o6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, this.J0);
        org.telegram.ui.ActionBar.u6.U(textView, i7, n5Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i7);
        org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i7);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, K, K2, n5Var);
        c8.sa.b(textView, 0.1f, 1.5f);
        l3Var.addView(textView, c8.na.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        c cVar = new c(18, this, textView);
        textView.setOnClickListener(new ai.p2(22, this, cVar));
        cVar.run();
        j3Var.addTextChangedListener(new bi.v(7, this, cVar));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, gd.N0(2131744392, null), true, false, -1, n5Var);
        this.V1 = l3Var2;
        a8 a8Var2 = new a8(this, 1);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var2.d;
        j3Var2.setImeOptions(6);
        j3Var2.setOnEditorActionListener(new m.r2(a8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        e eVar = new e(context, n5Var, true);
        this.X1 = eVar;
        eVar.i(gd.N0(2131744401, null), false, true);
        eVar.setOnClickListener(new z7(this, 1));
        eVar.setEnabled(g1(l3Var.getText().toString()));
        frameLayout.addView(eVar, c8.na.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.f39253v1 = 0.2f;
        this.J1 = true;
        this.Q0 = true;
        this.R0 = true;
        b8 b8Var = new b8(this);
        b8Var.f59274m = false;
        b8Var.C = false;
        b8Var.o(kr.h);
        b8Var.n(350L);
        this.f39246o1.setItemAnimator(b8Var);
        ek0 ek0Var = this.f39246o1;
        int i10 = this.f30261u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.f39246o1.setOnItemClickListener(new bi.u1(this, context, f6Var, 3));
        di.f0 f0Var = this.T1;
        if (f0Var != null) {
            f0Var.O(false);
        }
    }

    public static void e1(f8 f8Var, String str) {
        a8 a8Var = f8Var.f14489g2;
        if (str == null || TextUtils.equals(str, f8Var.f14488f2)) {
            return;
        }
        f8Var.f14488f2 = str;
        boolean g12 = f8Var.g1(str);
        org.telegram.messenger.g0.r(a8Var);
        if (g12) {
            if (!f8Var.d2 || f8Var.f14486c2 != null) {
                f8Var.d2 = true;
                f8Var.f14486c2 = null;
                di.f0 f0Var = f8Var.T1;
                if (f0Var != null) {
                    f0Var.O(true);
                }
            }
            org.telegram.messenger.g0.h3(a8Var, 700L);
        } else if (f8Var.d2 || f8Var.f14486c2 != null) {
            f8Var.d2 = false;
            f8Var.f14486c2 = null;
            if (f8Var.f14487e2 != 0) {
                ConnectionsManager.getInstance(f8Var.f30223a).cancelRequest(f8Var.f14487e2, true);
                f8Var.f14487e2 = 0;
            }
            di.f0 f0Var2 = f8Var.T1;
            if (f0Var2 != null) {
                f0Var2.O(true);
            }
        }
        f8Var.X1.setEnabled(g12);
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
        di.f0 f0Var = new di.f0(this.f39246o1, getContext(), this.f30223a, 0, true, new y7(this, 0), this.J0, 1);
        this.T1 = f0Var;
        return f0Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131744398, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25310w0 && this.f14485b2 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && this.f14485b2 == webPage.f28647id) {
                    if (h1(webPage)) {
                        webPage = null;
                    }
                    this.f14486c2 = webPage;
                    this.d2 = false;
                    this.f14485b2 = 0L;
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
        ks.f(this.f30223a).n(this, ks.f25310w0);
    }

    public final void f1() {
        this.d2 = false;
        this.f14486c2 = null;
        if (this.f14487e2 != 0) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.f14487e2, true);
            this.f14487e2 = 0;
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
        if (this.f14490h2 == null) {
            this.f14490h2 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f14490h2.matcher(str).find();
    }

    public final void i1() {
        String str;
        if (!this.X1.f14340e0) {
            return;
        }
        if (this.f14484a2 != null) {
            tg.m0 m0Var = new tg.m0();
            m0Var.f58074c = this.U1.d.getText().toString();
            if (this.f14491i2) {
                str = this.V1.d.getText().toString();
            } else {
                str = null;
            }
            m0Var.f58073b = str;
            m0Var.d = this.f14486c2;
            m0Var.f58075e = this.f14493k2;
            m0Var.f58076f = this.f14492j2;
            this.f14484a2.a(m0Var);
            this.f14484a2 = null;
        }
        dismiss();
    }

    @Override
    public final void show() {
        super.show();
        ks.f(this.f30223a).c(this, ks.f25310w0);
        org.telegram.messenger.g0.h3(new a8(this, 2), 150L);
    }
}
