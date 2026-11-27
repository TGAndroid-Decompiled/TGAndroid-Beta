package defpackage;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class sf6 extends cna {
    public boolean E;
    public int F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public Bundle M;
    public boolean N;
    public Timer O;
    public final Object P;
    public int Q;
    public double R;
    public boolean S;
    public Bundle T;
    public TLRPC.TL_auth_sentCode U;
    public final qf6 V;
    public final qf6 W;
    public final byte a;
    public float a0;
    public final lu7 b;
    public final qh6 b0;
    public final m7 c;
    public final te6 d;
    public final TextView e;
    public final TextView f;
    public final e29 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final rg6 w;
    public boolean x;
    public boolean y;

    public sf6(defpackage.qh6 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf6.<init>(qh6, android.content.Context, int):void");
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) <= ' ') {
            i++;
        }
        if (i <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z) {
        qh6 qh6Var = this.b0;
        qh6Var.y1(true, true);
        int i = this.G;
        if (i != 0) {
            qh6Var.J1(i, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override
    public final void d() {
        this.S = false;
    }

    @Override
    public final void g() {
        hl.r(this.V);
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131748020, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (this.S) {
            return;
        }
        String obj = this.c.getText().toString();
        if (obj.length() == 0) {
            r(false);
        } else if (!o(obj)) {
            r(true);
        } else {
            this.S = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.H;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.I;
            tL_auth_signIn.flags |= 1;
            qh6 qh6Var = this.b0;
            qh6Var.B1(qh6Var.getConnectionsManager().sendRequest(tL_auth_signIn, new mf6(this, tL_auth_signIn, (byte) 0), 10), true);
            qh6Var.K1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        hl.d3(new qf6(this, (byte) 3), qh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + ((int) this.a));
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + ((int) this.a), this.M);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        rg6 rg6Var = this.w;
        if (bundle == null) {
            if (this.T != null && this.U != null) {
                yob.X(rg6Var, aob.I6, null);
                int i4 = this.F;
                if (i4 == 17) {
                    i3 = 2131745777;
                } else if (i4 == 16) {
                    i3 = 2131745775;
                } else if (i4 == 3) {
                    i3 = 2131745774;
                } else {
                    i3 = 2131745776;
                }
                rg6Var.setText(hl.E2(ob6.M0(i3, null), true, hl.L(1.0f), hl.L(1.0f)));
                return;
            }
            return;
        }
        m7 m7Var = this.c;
        m7Var.setText("");
        this.M = bundle;
        this.L = null;
        this.F = bundle.getInt("nextType");
        this.G = bundle.getInt("prevType", 0);
        this.J = bundle.getString("ephone");
        if (this.M.containsKey("beginning")) {
            this.L = this.M.getString("beginning");
        }
        this.H = bundle.getString("phoneFormated");
        this.I = bundle.getString("phoneHash");
        this.K = this.M.getString("phone");
        this.Q = bundle.getInt("timeout");
        int i5 = this.G;
        te6 te6Var = this.d;
        if (i5 == 17) {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753747, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else if (i5 == 16) {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753746, null), true, hl.L(-1.0f), hl.L(1.0f)));
        } else if (i5 != 1 && i5 != 2 && i5 != 4 && i5 != 3 && i5 != 15) {
            te6Var.setVisibility(8);
        } else {
            te6Var.setVisibility(0);
            te6Var.setText(hl.E2(ob6.M0(2131753748, null), true, hl.L(-1.0f), hl.L(1.0f)));
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        qh6 qh6Var = this.b0;
        qh6Var.r0 = false;
        rg6Var.invalidate();
        if (this.a == 16) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str = "+" + f78.f().e(f78.h(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            if (!z2) {
                i2 = 2131745679;
            } else {
                i2 = 2131745687;
            }
            uh9.r(null, null, i2, new Object[]{str}, textView);
        } else {
            if (!z2) {
                i = 2131745683;
            } else {
                i = 2131745691;
            }
            uh9.r(null, null, i, new Object[]{str, str2}, textView);
        }
        qh6Var.M1(m7Var);
        m7Var.requestFocus();
        e29 e29Var = this.h;
        if (e29Var.getAnimatedDrawable() != null) {
            e29Var.getAnimatedDrawable().I(0, false, false);
        }
        hl.d3(new z96(e29Var, (byte) 6), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i6 = aob.y6;
        yob.X(rg6Var, i6, null);
        int i7 = this.F;
        if (i7 != 2 && i7 != 4 && i7 != 3) {
            rg6Var.setVisibility(8);
        } else if (this.O != null) {
        } else {
            yob.X(rg6Var, i6, null);
            rg6Var.setTag(2131296388, Integer.valueOf(i6));
            Timer timer = new Timer();
            this.O = timer;
            timer.schedule(new vw3(this, (byte) 1), 0L, 1000L);
        }
    }

    public final void n(boolean z) {
        float f;
        this.y = z;
        float f2 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.b.a(f);
        float f3 = (f * 0.1f) + 0.9f;
        float f4 = -5.0f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f3).scaleY(f3).alpha(f).translationY((1.0f - f) * hl.L(-5.0f));
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 290L);
        if (this.x && !this.y) {
            f2 = 1.0f;
        }
        float f5 = (0.1f * f2) + 0.9f;
        ViewPropertyAnimator alpha = this.f.animate().scaleX(f5).scaleY(f5).alpha(f2);
        float f6 = 1.0f - f2;
        if (this.y) {
            f4 = 5.0f;
        }
        alpha.translationY(f6 * hl.L(f4)).setInterpolator(k43Var).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.L != null) {
            String lowerCase = s(str).toLowerCase();
            String lowerCase2 = this.L.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }
        return true;
    }

    public final void p(boolean z) {
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        qf6 qf6Var = this.V;
        hl.r(qf6Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.x != z2) {
            this.x = z2;
            float f7 = -5.0f;
            TextView textView = this.s;
            float f8 = 0.9f;
            float f9 = 0.7f;
            TextView textView2 = this.f;
            float f10 = 0.0f;
            float f11 = 1.0f;
            if (z) {
                ViewPropertyAnimator animate = textView.animate();
                if (z2) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f4);
                if (z2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f5);
                if (z2) {
                    f9 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f9);
                k43 k43Var = k43.h;
                scaleY.setInterpolator(k43Var).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.x && !this.y) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f6);
                if (this.x && !this.y) {
                    f8 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f8);
                if (!this.x || this.y) {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f11);
                if (!this.x || this.y) {
                    if (this.y) {
                        f7 = 5.0f;
                    }
                    f10 = hl.L(f7);
                }
                alpha2.translationY(f10).setInterpolator(k43Var).setDuration(300L).start();
            } else {
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                textView.setAlpha(f);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.7f;
                }
                textView.setScaleX(f2);
                if (z2) {
                    f9 = 1.0f;
                }
                textView.setScaleY(f9);
                if (this.x && !this.y) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.9f;
                }
                textView2.setScaleX(f3);
                if (this.x && !this.y) {
                    f8 = 1.0f;
                }
                textView2.setScaleY(f8);
                if (!this.x || this.y) {
                    f11 = 0.0f;
                }
                textView2.setAlpha(f11);
                if (!this.x || this.y) {
                    if (this.y) {
                        f7 = 5.0f;
                    }
                    f10 = hl.L(f7);
                }
                textView2.setTranslationY(f10);
            }
        }
        hl.d3(qf6Var, 5000L);
    }

    public final void q() {
        rg6 rg6Var = this.w;
        int i = aob.y6;
        yob.X(rg6Var, i, null);
        this.w.setTag(2131296388, Integer.valueOf(i));
        try {
            synchronized (this.P) {
                Timer timer = this.O;
                if (timer != null) {
                    timer.cancel();
                    this.O = null;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void r(boolean z) {
        boolean z2;
        int i;
        int i2;
        m7 m7Var = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            m7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.a == 16) {
            z2 = false;
        } else {
            z2 = true;
        }
        TextView textView = this.e;
        if (z) {
            if (!z2) {
                i2 = 2131745684;
            } else {
                i2 = 2131745692;
            }
            textView.setText(ob6.M0(i2, null));
        } else if (TextUtils.isEmpty(m7Var.getText())) {
            textView.setText("");
        } else {
            if (!z2) {
                i = 2131745682;
            } else {
                i = 2131745690;
            }
            textView.setText(ob6.M0(i, null));
        }
        if (!this.y && !this.E) {
            hl.A3(this.a0, m7Var, null);
            hl.A3(this.a0, textView, null);
        }
        qf6 qf6Var = this.W;
        hl.r(qf6Var);
        n(true);
        hl.d3(qf6Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        qh6 qh6Var = this.b0;
        this.n.setTextColor(qh6Var.getThemedColor(i));
        this.r.setTextColor(qh6Var.getThemedColor(aob.D6));
        int themedColor = qh6Var.getThemedColor(i);
        m7 m7Var = this.c;
        m7Var.setTextColor(themedColor);
        m7Var.setCursorColor(qh6Var.getThemedColor(aob.l6));
        m7Var.setHintTextColor(qh6Var.getThemedColor(aob.H6));
        this.b.f();
    }
}
