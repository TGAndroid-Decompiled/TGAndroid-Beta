package defpackage;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class qd6 extends jja {
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
    public final od6 V;
    public final od6 W;
    public final byte a;
    public float a0;
    public final er7 b;
    public final mf6 b0;
    public final l7 c;
    public final qc6 d;
    public final TextView e;
    public final TextView f;
    public final ry8 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final oe6 w;
    public boolean x;
    public boolean y;

    public qd6(defpackage.mf6 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd6.<init>(mf6, android.content.Context, int):void");
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
    public final boolean d(boolean z) {
        mf6 mf6Var = this.b0;
        mf6Var.x1(true, true);
        int i = this.G;
        if (i != 0) {
            mf6Var.I1(i, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override
    public final void e() {
        this.S = false;
    }

    @Override
    public final void g() {
        gl.r(this.V);
    }

    @Override
    public String getHeaderName() {
        return k96.M0(2131748074, "NewPassword");
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
            mf6 mf6Var = this.b0;
            mf6Var.A1(mf6Var.getConnectionsManager().sendRequest(tL_auth_signIn, new kd6(this, tL_auth_signIn, (byte) 0), 10), true);
            mf6Var.J1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        gl.e3(new od6(this, (byte) 3), mf6.A0);
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
        oe6 oe6Var = this.w;
        if (bundle == null) {
            if (this.T != null && this.U != null) {
                zkb.X(oe6Var, bkb.H6, null);
                int i4 = this.F;
                if (i4 == 17) {
                    i3 = 2131745857;
                } else if (i4 == 16) {
                    i3 = 2131745855;
                } else if (i4 == 3) {
                    i3 = 2131745854;
                } else {
                    i3 = 2131745856;
                }
                oe6Var.setText(gl.F2(k96.M0(i3, null), true, gl.L(1.0f), gl.L(1.0f)));
                return;
            }
            return;
        }
        l7 l7Var = this.c;
        l7Var.setText("");
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
        qc6 qc6Var = this.d;
        if (i5 == 17) {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.F2(k96.M0(2131753751, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else if (i5 == 16) {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.F2(k96.M0(2131753750, null), true, gl.L(-1.0f), gl.L(1.0f)));
        } else if (i5 != 1 && i5 != 2 && i5 != 4 && i5 != 3 && i5 != 15) {
            qc6Var.setVisibility(8);
        } else {
            qc6Var.setVisibility(0);
            qc6Var.setText(gl.F2(k96.M0(2131753752, null), true, gl.L(-1.0f), gl.L(1.0f)));
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        mf6 mf6Var = this.b0;
        mf6Var.r0 = false;
        oe6Var.invalidate();
        if (this.a == 16) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str = "+" + p38.f().e(p38.h(this.K, false));
        String str2 = this.L;
        TextView textView = this.r;
        if (str2 == null) {
            if (!z2) {
                i2 = 2131745759;
            } else {
                i2 = 2131745767;
            }
            de9.r(null, null, i2, new Object[]{str}, textView);
        } else {
            if (!z2) {
                i = 2131745763;
            } else {
                i = 2131745771;
            }
            de9.r(null, null, i, new Object[]{str, str2}, textView);
        }
        mf6Var.L1(l7Var);
        l7Var.requestFocus();
        ry8 ry8Var = this.h;
        if (ry8Var.getAnimatedDrawable() != null) {
            ry8Var.getAnimatedDrawable().I(0, false, false);
        }
        gl.e3(new tp5(ry8Var, (byte) 21), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i6 = bkb.x6;
        zkb.X(oe6Var, i6, null);
        int i7 = this.F;
        if (i7 != 2 && i7 != 4 && i7 != 3) {
            oe6Var.setVisibility(8);
        } else if (this.O != null) {
        } else {
            zkb.X(oe6Var, i6, null);
            oe6Var.setTag(2131296388, Integer.valueOf(i6));
            Timer timer = new Timer();
            this.O = timer;
            timer.schedule(new aw3(this, (byte) 1), 0L, 1000L);
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
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f3).scaleY(f3).alpha(f).translationY((1.0f - f) * gl.L(-5.0f));
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 290L);
        if (this.x && !this.y) {
            f2 = 1.0f;
        }
        float f5 = (0.1f * f2) + 0.9f;
        ViewPropertyAnimator alpha = this.f.animate().scaleX(f5).scaleY(f5).alpha(f2);
        float f6 = 1.0f - f2;
        if (this.y) {
            f4 = 5.0f;
        }
        alpha.translationY(f6 * gl.L(f4)).setInterpolator(s33Var).setDuration(290L).start();
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
        od6 od6Var = this.V;
        gl.r(od6Var);
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
                s33 s33Var = s33.h;
                scaleY.setInterpolator(s33Var).setDuration(300L).start();
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
                    f10 = gl.L(f7);
                }
                alpha2.translationY(f10).setInterpolator(s33Var).setDuration(300L).start();
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
                    f10 = gl.L(f7);
                }
                textView2.setTranslationY(f10);
            }
        }
        gl.e3(od6Var, 5000L);
    }

    public final void q() {
        oe6 oe6Var = this.w;
        int i = bkb.x6;
        zkb.X(oe6Var, i, null);
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
            fa4.g(e, true);
        }
    }

    public final void r(boolean z) {
        boolean z2;
        int i;
        int i2;
        l7 l7Var = this.c;
        if (this.b0.getParentActivity() == null) {
            return;
        }
        try {
            l7Var.performHapticFeedback(3, 2);
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
                i2 = 2131745764;
            } else {
                i2 = 2131745772;
            }
            textView.setText(k96.M0(i2, null));
        } else if (TextUtils.isEmpty(l7Var.getText())) {
            textView.setText("");
        } else {
            if (!z2) {
                i = 2131745762;
            } else {
                i = 2131745770;
            }
            textView.setText(k96.M0(i, null));
        }
        if (!this.y && !this.E) {
            gl.B3(this.a0, l7Var, null);
            gl.B3(this.a0, textView, null);
        }
        od6 od6Var = this.W;
        gl.r(od6Var);
        n(true);
        gl.e3(od6Var, 10000L);
        this.a0 = -this.a0;
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        mf6 mf6Var = this.b0;
        this.n.setTextColor(mf6Var.getThemedColor(i));
        this.r.setTextColor(mf6Var.getThemedColor(bkb.C6));
        int themedColor = mf6Var.getThemedColor(i);
        l7 l7Var = this.c;
        l7Var.setTextColor(themedColor);
        l7Var.setCursorColor(mf6Var.getThemedColor(bkb.k6));
        l7Var.setHintTextColor(mf6Var.getThemedColor(bkb.G6));
        this.b.f();
    }
}
