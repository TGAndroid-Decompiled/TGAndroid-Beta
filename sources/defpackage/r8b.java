package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r8b extends ny0 implements fn7 {
    public i74 S1;
    public final zt3 T1;
    public final zt3 U1;
    public final FrameLayout V1;
    public final c51 W1;
    public boolean X1;
    public boolean Y1;
    public v35 Z1;
    public long a2;
    public TLRPC.WebPage b2;
    public boolean c2;
    public int d2;
    public String e2;
    public final n8b f2;
    public Pattern g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;

    public r8b(Context context, uk5 uk5Var, gbb gbbVar, v35 v35Var) {
        super(context, null, true, true, 2, uk5Var);
        this.f2 = new n8b(this, (byte) 0);
        this.Z1 = v35Var;
        J();
        U0();
        this.C1 = hl.L(4.0f);
        this.D1 = hl.L(-15.0f);
        zt3 zt3Var = new zt3(context, ob6.M0(2131744286, null), true, false, -1, uk5Var);
        this.T1 = zt3Var;
        n8b n8bVar = new n8b(this, (byte) 1);
        yt3 yt3Var = zt3Var.d;
        yt3Var.setImeOptions(6);
        yt3Var.setOnEditorActionListener(new vx1(n8bVar, (byte) 2));
        yt3Var.setHandlesColor(-12476440);
        yt3Var.setCursorColor(-11230757);
        yt3Var.setText("https://");
        yt3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131747162, null));
        textView.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView.setGravity(17);
        int i = aob.o6;
        int v0 = aob.v0(i, this.J0);
        yob.X(textView, i, uk5Var);
        int L = hl.L(6.0f);
        int p1 = aob.p1(0.12f, v0);
        int p12 = aob.p1(0.15f, v0);
        hf0 i0 = aob.i0(L, L, L, L, p1, p12, p12);
        uob K = yob.K(0.12f, i);
        uob K2 = yob.K(0.15f, i);
        textView.setBackground(i0);
        yob.j(textView, i0, K, K2, uk5Var);
        iye.b(textView, 0.1f, 1.5f);
        zt3Var.addView(textView, tre.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        z3b z3bVar = new z3b(this, textView, (byte) 23);
        textView.setOnClickListener(new jy8(this, z3bVar, (byte) 25));
        z3bVar.run();
        yt3Var.addTextChangedListener(new ry(this, z3bVar, (byte) 18));
        zt3 zt3Var2 = new zt3(context, ob6.M0(2131744290, null), true, false, -1, uk5Var);
        this.U1 = zt3Var2;
        n8b n8bVar2 = new n8b(this, (byte) 1);
        yt3 yt3Var2 = zt3Var2.d;
        yt3Var2.setImeOptions(6);
        yt3Var2.setOnEditorActionListener(new vx1(n8bVar2, (byte) 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        c51 c51Var = new c51(uk5Var, context, true);
        this.W1 = c51Var;
        c51Var.i(ob6.M0(2131744299, null), false, true);
        c51Var.setOnClickListener(new m8b(this, (byte) 1));
        c51Var.setEnabled(b1(zt3Var.getText().toString()));
        frameLayout.addView(c51Var, tre.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.u1 = 0.2f;
        this.I1 = true;
        this.Q0 = true;
        this.R0 = true;
        o8b o8bVar = new o8b(this);
        o8bVar.m = false;
        o8bVar.C = false;
        o8bVar.o(k43.h);
        o8bVar.n(350L);
        this.n1.setItemAnimator(o8bVar);
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new jr((fn7) this, context, (Object) gbbVar, (byte) 5));
        i74 i74Var = this.S1;
        if (i74Var != null) {
            i74Var.O(false);
        }
    }

    public static boolean c1(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final c79 H0(d79 d79Var) {
        i74 i74Var = new i74(this.n1, getContext(), this.a, 0, true, new l8b(this, (byte) 0), this.J0, (byte) 1);
        this.S1 = i74Var;
        return i74Var;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131744296, null);
    }

    public final void Z0(String str) {
        if (str == null || TextUtils.equals(str, this.e2)) {
            return;
        }
        this.e2 = str;
        boolean b1 = b1(str);
        n8b n8bVar = this.f2;
        hl.r(n8bVar);
        boolean z = this.c2;
        if (b1) {
            if (!z || this.b2 != null) {
                this.c2 = true;
                this.b2 = null;
                i74 i74Var = this.S1;
                if (i74Var != null) {
                    i74Var.O(true);
                }
            }
            hl.d3(n8bVar, 700L);
        } else if (z || this.b2 != null) {
            this.c2 = false;
            this.b2 = null;
            if (this.d2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
                this.d2 = 0;
            }
            i74 i74Var2 = this.S1;
            if (i74Var2 != null) {
                i74Var2.O(true);
            }
        }
        this.W1.setEnabled(b1);
    }

    public final void a1() {
        this.c2 = false;
        this.b2 = null;
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        i74 i74Var = this.S1;
        if (i74Var != null) {
            i74Var.O(true);
        }
    }

    public final boolean b1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Pattern pattern = this.g2;
        if (pattern == null) {
            pattern = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
            this.g2 = pattern;
        }
        return pattern.matcher(str).find();
    }

    public final void d1() {
        String str;
        if (!this.W1.e0) {
            return;
        }
        if (this.Z1 != null) {
            g66 g66Var = new g66();
            g66Var.c = this.T1.d.getText().toString();
            if (this.h2) {
                str = this.U1.d.getText().toString();
            } else {
                str = null;
            }
            g66Var.b = str;
            g66Var.d = this.b2;
            g66Var.e = this.j2;
            g66Var.f = this.i2;
            this.Z1.a(g66Var);
            this.Z1 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.w0 && this.a2 != 0) {
            zh6 zh6Var = (zh6) objArr[0];
            for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) zh6Var.n(i3);
                if (webPage != null && this.a2 == webPage.id) {
                    if (c1(webPage)) {
                        webPage = null;
                    }
                    this.b2 = webPage;
                    this.c2 = false;
                    this.a2 = 0L;
                    i74 i74Var = this.S1;
                    if (i74Var != null) {
                        i74Var.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        hl.t1(this.T1.d);
        hl.t1(this.U1.d);
        super.dismiss();
        jn7.f(this.a).n(this, jn7.w0);
    }

    @Override
    public final void show() {
        super.show();
        jn7.f(this.a).b(this, jn7.w0);
        hl.d3(new n8b(this, (byte) 2), 150L);
    }
}
