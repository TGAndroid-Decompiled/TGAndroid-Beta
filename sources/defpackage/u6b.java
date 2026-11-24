package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u6b extends mz0 implements jm7 {
    public x74 S1;
    public final su3 T1;
    public final su3 U1;
    public final FrameLayout V1;
    public final b61 W1;
    public boolean X1;
    public boolean Y1;
    public u35 Z1;
    public long a2;
    public TLRPC.WebPage b2;
    public boolean c2;
    public int d2;
    public String e2;
    public final q6b f2;
    public Pattern g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;

    public u6b(Context context, rk5 rk5Var, k9b k9bVar, u35 u35Var) {
        super(context, null, true, true, 2, rk5Var);
        this.f2 = new q6b(this, (byte) 0);
        this.Z1 = u35Var;
        J();
        T0();
        this.C1 = gm.L(4.0f);
        this.D1 = gm.L(-15.0f);
        su3 su3Var = new su3(context, jb6.M0(2131744318, null), true, false, -1, rk5Var);
        this.T1 = su3Var;
        su3Var.d(new q6b(this, (byte) 1));
        ru3 ru3Var = su3Var.d;
        ru3Var.setHandlesColor(-12476440);
        ru3Var.setCursorColor(-11230757);
        ru3Var.setText("https://");
        ru3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131747168, null));
        textView.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView.setGravity(17);
        int i = cmb.n6;
        int v0 = cmb.v0(i, this.J0);
        anb.X(textView, i, rk5Var);
        int L = gm.L(6.0f);
        int p1 = cmb.p1(0.12f, v0);
        int p12 = cmb.p1(0.15f, v0);
        fg0 i0 = cmb.i0(L, L, L, L, p1, p12, p12);
        wmb K = anb.K(0.12f, i);
        wmb K2 = anb.K(0.15f, i);
        textView.setBackground(i0);
        anb.j(textView, i0, K, K2, rk5Var);
        rve.b(textView, 0.1f, 1.5f);
        su3Var.addView(textView, qoe.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        uva uvaVar = new uva(this, textView, (byte) 28);
        textView.setOnClickListener(new r39(this, uvaVar, (byte) 23));
        uvaVar.run();
        ru3Var.addTextChangedListener(new qz(this, uvaVar, (byte) 17));
        su3 su3Var2 = new su3(context, jb6.M0(2131744322, null), true, false, -1, rk5Var);
        this.U1 = su3Var2;
        su3Var2.d(new q6b(this, (byte) 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        b61 b61Var = new b61(rk5Var, context, true);
        this.W1 = b61Var;
        b61Var.i(jb6.M0(2131744331, null), false, true);
        b61Var.setOnClickListener(new p6b(this, (byte) 1));
        b61Var.setEnabled(a1(su3Var.getText().toString()));
        frameLayout.addView(b61Var, qoe.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.u1 = 0.2f;
        this.I1 = true;
        this.Q0 = true;
        this.R0 = true;
        r6b r6bVar = new r6b(this);
        r6bVar.m = false;
        r6bVar.C = false;
        r6bVar.o(d53.h);
        r6bVar.n(350L);
        this.n1.setItemAnimator(r6bVar);
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new is((jm7) this, context, (Object) k9bVar, (byte) 5));
        x74 x74Var = this.S1;
        if (x74Var != null) {
            x74Var.O(false);
        }
    }

    public static boolean b1(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        x74 x74Var = new x74(this.n1, getContext(), this.a, 0, true, new o6b(this, (byte) 0), this.J0, (byte) 1);
        this.S1 = x74Var;
        return x74Var;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131744328, null);
    }

    public final void Y0(String str) {
        if (str == null || TextUtils.equals(str, this.e2)) {
            return;
        }
        this.e2 = str;
        boolean a1 = a1(str);
        q6b q6bVar = this.f2;
        gm.r(q6bVar);
        boolean z = this.c2;
        if (a1) {
            if (!z || this.b2 != null) {
                this.c2 = true;
                this.b2 = null;
                x74 x74Var = this.S1;
                if (x74Var != null) {
                    x74Var.O(true);
                }
            }
            gm.d3(q6bVar, 700L);
        } else if (z || this.b2 != null) {
            this.c2 = false;
            this.b2 = null;
            if (this.d2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
                this.d2 = 0;
            }
            x74 x74Var2 = this.S1;
            if (x74Var2 != null) {
                x74Var2.O(true);
            }
        }
        this.W1.setEnabled(a1);
    }

    public final void Z0() {
        this.c2 = false;
        this.b2 = null;
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        x74 x74Var = this.S1;
        if (x74Var != null) {
            x74Var.O(true);
        }
    }

    public final boolean a1(String str) {
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

    public final void c1() {
        String str;
        if (!this.W1.e0) {
            return;
        }
        if (this.Z1 != null) {
            c66 c66Var = new c66();
            c66Var.c = this.T1.d.getText().toString();
            if (this.h2) {
                str = this.U1.d.getText().toString();
            } else {
                str = null;
            }
            c66Var.b = str;
            c66Var.d = this.b2;
            c66Var.e = this.j2;
            c66Var.f = this.i2;
            this.Z1.a(c66Var);
            this.Z1 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.w0 && this.a2 != 0) {
            vh6 vh6Var = (vh6) objArr[0];
            for (int i3 = 0; i3 < vh6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vh6Var.n(i3);
                if (webPage != null && this.a2 == webPage.id) {
                    if (b1(webPage)) {
                        webPage = null;
                    }
                    this.b2 = webPage;
                    this.c2 = false;
                    this.a2 = 0L;
                    x74 x74Var = this.S1;
                    if (x74Var != null) {
                        x74Var.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        gm.t1(this.T1.d);
        gm.t1(this.U1.d);
        super.dismiss();
        nm7.f(this.a).n(this, nm7.w0);
    }

    @Override
    public final void show() {
        super.show();
        nm7.f(this.a).b(this, nm7.w0);
        gm.d3(new q6b(this, (byte) 2), 150L);
    }
}
