package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t4b extends fy0 implements gk7 {
    public o64 S1;
    public final it3 T1;
    public final it3 U1;
    public final FrameLayout V1;
    public final u41 W1;
    public boolean X1;
    public boolean Y1;
    public x15 Z1;
    public long a2;
    public TLRPC.WebPage b2;
    public boolean c2;
    public int d2;
    public String e2;
    public final p4b f2;
    public Pattern g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;

    public t4b(Context context, si5 si5Var, i7b i7bVar, x15 x15Var) {
        super(context, null, true, true, 2, si5Var);
        this.f2 = new p4b(this, (byte) 0);
        this.Z1 = x15Var;
        K();
        T0();
        this.C1 = gl.L(4.0f);
        this.D1 = gl.L(-15.0f);
        it3 it3Var = new it3(context, k96.M0(2131744392, null), true, false, -1, si5Var);
        this.T1 = it3Var;
        p4b p4bVar = new p4b(this, (byte) 1);
        ht3 ht3Var = it3Var.d;
        ht3Var.setImeOptions(6);
        ht3Var.setOnEditorActionListener(new gx1(p4bVar, (byte) 2));
        ht3Var.setHandlesColor(-12476440);
        ht3Var.setCursorColor(-11230757);
        ht3Var.setText("https://");
        ht3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131747242, null));
        textView.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView.setGravity(17);
        int i = bkb.n6;
        int v0 = bkb.v0(i, this.J0);
        zkb.X(textView, i, si5Var);
        int L = gl.L(6.0f);
        int p1 = bkb.p1(0.12f, v0);
        int p12 = bkb.p1(0.15f, v0);
        ff0 i0 = bkb.i0(L, L, L, L, p1, p12, p12);
        vkb K = zkb.K(0.12f, i);
        vkb K2 = zkb.K(0.15f, i);
        textView.setBackground(i0);
        zkb.j(textView, i0, K, K2, si5Var);
        ote.b(textView, 0.1f, 1.5f);
        it3Var.addView(textView, nme.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        iya iyaVar = new iya(this, textView, (byte) 26);
        textView.setOnClickListener(new b99(this, iyaVar, (byte) 22));
        iyaVar.run();
        ht3Var.addTextChangedListener(new qy(this, iyaVar, (byte) 17));
        it3 it3Var2 = new it3(context, k96.M0(2131744396, null), true, false, -1, si5Var);
        this.U1 = it3Var2;
        p4b p4bVar2 = new p4b(this, (byte) 1);
        ht3 ht3Var2 = it3Var2.d;
        ht3Var2.setImeOptions(6);
        ht3Var2.setOnEditorActionListener(new gx1(p4bVar2, (byte) 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        u41 u41Var = new u41(si5Var, context, true);
        this.W1 = u41Var;
        u41Var.i(k96.M0(2131744405, null), false, true);
        u41Var.setOnClickListener(new o4b(this, (byte) 1));
        u41Var.setEnabled(a1(it3Var.getText().toString()));
        frameLayout.addView(u41Var, nme.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.u1 = 0.2f;
        this.I1 = true;
        this.Q0 = true;
        this.R0 = true;
        q4b q4bVar = new q4b(this);
        q4bVar.m = false;
        q4bVar.C = false;
        q4bVar.o(s33.h);
        q4bVar.n(350L);
        this.n1.setItemAnimator(q4bVar);
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new ir((gk7) this, context, (Object) i7bVar, (byte) 5));
        o64 o64Var = this.S1;
        if (o64Var != null) {
            o64Var.O(false);
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
    public final n39 G0(o39 o39Var) {
        o64 o64Var = new o64(this.n1, getContext(), this.a, 0, true, new n4b(this, (byte) 0), this.J0, (byte) 1);
        this.S1 = o64Var;
        return o64Var;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131744402, null);
    }

    public final void Y0(String str) {
        if (str == null || TextUtils.equals(str, this.e2)) {
            return;
        }
        this.e2 = str;
        boolean a1 = a1(str);
        p4b p4bVar = this.f2;
        gl.r(p4bVar);
        boolean z = this.c2;
        if (a1) {
            if (!z || this.b2 != null) {
                this.c2 = true;
                this.b2 = null;
                o64 o64Var = this.S1;
                if (o64Var != null) {
                    o64Var.O(true);
                }
            }
            gl.d3(p4bVar, 700L);
        } else if (z || this.b2 != null) {
            this.c2 = false;
            this.b2 = null;
            if (this.d2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
                this.d2 = 0;
            }
            o64 o64Var2 = this.S1;
            if (o64Var2 != null) {
                o64Var2.O(true);
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
        o64 o64Var = this.S1;
        if (o64Var != null) {
            o64Var.O(true);
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
            c46 c46Var = new c46();
            c46Var.c = this.T1.d.getText().toString();
            if (this.h2) {
                str = this.U1.d.getText().toString();
            } else {
                str = null;
            }
            c46Var.b = str;
            c46Var.d = this.b2;
            c46Var.e = this.j2;
            c46Var.f = this.i2;
            this.Z1.a(c46Var);
            this.Z1 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.v0 && this.a2 != 0) {
            vf6 vf6Var = (vf6) objArr[0];
            for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vf6Var.n(i3);
                if (webPage != null && this.a2 == webPage.id) {
                    if (b1(webPage)) {
                        webPage = null;
                    }
                    this.b2 = webPage;
                    this.c2 = false;
                    this.a2 = 0L;
                    o64 o64Var = this.S1;
                    if (o64Var != null) {
                        o64Var.O(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        gl.t1(this.T1.d);
        gl.t1(this.U1.d);
        super.dismiss();
        kk7.f(this.a).n(this, kk7.v0);
    }

    @Override
    public final void show() {
        super.show();
        kk7.f(this.a).b(this, kk7.v0);
        gl.d3(new p4b(this, (byte) 2), 150L);
    }
}
