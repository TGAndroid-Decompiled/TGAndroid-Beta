package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
public final class gd1 {
    public final fd1 a;
    public final v5b b;
    public jd4 c;
    public Runnable d;
    public ad1 e;
    public kd1 f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final o1 j = new o1(this, (byte) 13);

    public gd1(File file, fd1 fd1Var) {
        this.a = fd1Var;
        this.b = new v5b(new wm4(file.getAbsolutePath(), file, (byte) 29), fd1Var.N(), fd1Var.K(), new yt0(this, (byte) 20));
    }

    public static void e(View view, float[] fArr) {
        while (view != null) {
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
                fArr[0] = fArr[0] - view.getScrollX();
                fArr[1] = fArr[1] - view.getScrollY();
            } else {
                return;
            }
        }
    }

    public static void g(kd1 kd1Var, float[] fArr) {
        float extendedPaddingTop;
        dv3 editText = kd1Var.getEditText();
        Layout layout = editText.getLayout();
        if (layout != null && layout.getLineCount() > 0) {
            extendedPaddingTop = editText.getBaseline() - layout.getLineBaseline(0);
        } else {
            extendedPaddingTop = editText.getExtendedPaddingTop();
        }
        fArr[0] = ((editText.getCompoundPaddingLeft() + editText.getLeft()) - editText.getScrollX()) - (kd1Var.getWidth() / 2.0f);
        fArr[1] = (editText.getTop() + extendedPaddingTop) - (kd1Var.getHeight() / 2.0f);
        fArr[2] = (editText.getWidth() - editText.getCompoundPaddingLeft()) - editText.getCompoundPaddingRight();
    }

    public final void a() {
        String r;
        if (!c()) {
            return;
        }
        fd1 fd1Var = this.a;
        kd1 u = fd1Var.u();
        u.setLoading(true);
        v5b v5bVar = this.b;
        Objects.requireNonNull(v5bVar);
        u.setPendingProvider(new cd1(v5bVar, (byte) 0));
        fd1Var.P(u);
        v5bVar.i();
        v5bVar.n = new dd1(fd1Var, (byte) 0);
        v5bVar.u = new ed1(new TextPaint(u.getEditText().getPaint()), (byte) 0);
        v5bVar.v = u.getLineWidth() * 0.96f;
        jd4 jd4Var = this.c;
        if (jd4Var != null) {
            jd4Var.f = null;
            u31 u31Var = (u31) jd4Var.g;
            if (u31Var != null) {
                u31Var.b();
                jd4Var.g = null;
            }
            this.c = null;
        }
        Context context = u.getContext();
        FrameLayout q = fd1Var.q();
        ylb t = fd1Var.t();
        in3 in3Var = v5bVar.f;
        if (in3Var == null) {
            r = "";
        } else {
            r = un3.r(in3Var.t());
        }
        jd4 jd4Var2 = new jd4(context, q, t, r, new y31(this, u, (byte) 16));
        this.c = jd4Var2;
        this.b.h(fd1Var.N(), fd1Var.K(), new mx6(this, jd4Var2, u, (byte) 14));
    }

    public final void b(kd1 kd1Var) {
        fd1 fd1Var = this.a;
        kd1Var.setPositionProvider(new dd1(fd1Var, (byte) 1));
        kd1Var.setOnEditing(new x0(this, kd1Var, (byte) 13));
        kd1Var.setOnSeek(new mf2(fd1Var, (byte) 13));
        kd1Var.setRangeProvider(new k6d(this, (byte) 16));
    }

    public final boolean c() {
        if (this.b.f != null && this.a.A() == null) {
            return true;
        }
        return false;
    }

    public final float d(kd1 kd1Var, float f, float f2) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        fArr[0] = f;
        fArr[1] = f2;
        e(kd1Var, fArr);
        fArr[1] = fArr[1] - f4;
        float f5 = fArr[0] - f3;
        fArr[0] = f5;
        return f5;
    }

    public final void f(kd1 kd1Var) {
        ad1 ad1Var = this.e;
        o1 o1Var = this.j;
        if (ad1Var != null) {
            ad1Var.b();
            this.e.removeCallbacks(o1Var);
        }
        this.f = kd1Var;
        ad1 ad1Var2 = this.e;
        if (kd1Var == null) {
            if (ad1Var2 != null) {
                ad1Var2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        if (ad1Var2 == null) {
            ad1 ad1Var3 = new ad1(kd1Var.getContext());
            this.e = ad1Var3;
            ad1Var3.setOnClick(new qac(this) {
                public final gd1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    s5b s5bVar;
                    char c;
                    String charSequence;
                    boolean z;
                    byte b = r2;
                    gd1 gd1Var = this.b;
                    switch (b) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kd1 kd1Var2 = gd1Var.f;
                            if (kd1Var2 != null && gd1Var.e != null && kd1Var2.x(intValue) != null) {
                                gd1Var.e.b();
                                String charSequence2 = kd1Var2.getText().toString();
                                gd1Var.i = kd1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gd1.g(kd1Var2, fArr);
                                String str = null;
                                if (kd1Var2.G0) {
                                    s5bVar = kd1Var2.w(intValue);
                                } else {
                                    s5bVar = null;
                                }
                                if (s5bVar != null) {
                                    kd1Var2.E0 = s5bVar;
                                    kd1Var2.H0 = true;
                                    CharSequence charSequence3 = s5bVar.c;
                                    String str2 = "";
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    kd1Var2.setText(charSequence3);
                                    kd1Var2.H0 = false;
                                    kd1Var2.getEditText().setSelection(kd1Var2.getEditText().length());
                                    qac qacVar = kd1Var2.M0;
                                    if (qacVar != null) {
                                        jd1 jd1Var = kd1Var2.O0;
                                        long j = s5bVar.a;
                                        if (jd1Var != null) {
                                            j = Math.max(j, ((gd1) ((k6d) jd1Var).b).a.N());
                                        }
                                        qacVar.a(Long.valueOf(j));
                                    }
                                    ad1 ad1Var4 = gd1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kd1Var2.x(-1);
                                    CharSequence x2 = kd1Var2.x(1);
                                    ad1Var4.b();
                                    ad1Var4.K = f;
                                    ad1Var4.L = f2;
                                    ad1Var4.M = f3;
                                    zc1[] zc1VarArr = ad1Var4.a;
                                    if (intValue < 0) {
                                        c = 0;
                                    } else {
                                        c = 1;
                                    }
                                    zc1 zc1Var = zc1VarArr[c];
                                    for (zc1 zc1Var2 : zc1VarArr) {
                                        uib uibVar = zc1Var2.h;
                                        zc1Var2.i = uibVar;
                                        if (uibVar != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        zc1Var2.k = z;
                                        zc1Var2.j = zc1Var2.e.c;
                                    }
                                    ad1Var4.S = zc1Var.g;
                                    if (charSequence2 != null) {
                                        str2 = charSequence2.toString();
                                    }
                                    ad1Var4.T = str2;
                                    zc1 zc1Var3 = zc1VarArr[0];
                                    if (x == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x.toString();
                                    }
                                    zc1Var3.b(charSequence);
                                    zc1 zc1Var4 = zc1VarArr[1];
                                    if (x2 != null) {
                                        str = x2.toString();
                                    }
                                    zc1Var4.b(str);
                                    ad1Var4.R = zc1Var;
                                    ad1Var4.Q = SystemClock.elapsedRealtime();
                                    ad1Var4.invalidate();
                                    kd1Var2.getEditText().setAlpha(0.0f);
                                    kd1Var2.setSelectionWidth(gd1Var.i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f4 = (Float) obj;
                            kd1 kd1Var3 = gd1Var.f;
                            if (kd1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kd1Var3.getEditText().setAlpha(1.0f);
                                    kd1Var3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                kd1Var3.setSelectionWidth(gm.R1(gd1Var.i, kd1Var3.getMeasuredWidth(), f4.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.e.setOnSwitchProgress(new qac(this) {
                public final gd1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    s5b s5bVar;
                    char c;
                    String charSequence;
                    boolean z;
                    byte b = r2;
                    gd1 gd1Var = this.b;
                    switch (b) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kd1 kd1Var2 = gd1Var.f;
                            if (kd1Var2 != null && gd1Var.e != null && kd1Var2.x(intValue) != null) {
                                gd1Var.e.b();
                                String charSequence2 = kd1Var2.getText().toString();
                                gd1Var.i = kd1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gd1.g(kd1Var2, fArr);
                                String str = null;
                                if (kd1Var2.G0) {
                                    s5bVar = kd1Var2.w(intValue);
                                } else {
                                    s5bVar = null;
                                }
                                if (s5bVar != null) {
                                    kd1Var2.E0 = s5bVar;
                                    kd1Var2.H0 = true;
                                    CharSequence charSequence3 = s5bVar.c;
                                    String str2 = "";
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    kd1Var2.setText(charSequence3);
                                    kd1Var2.H0 = false;
                                    kd1Var2.getEditText().setSelection(kd1Var2.getEditText().length());
                                    qac qacVar = kd1Var2.M0;
                                    if (qacVar != null) {
                                        jd1 jd1Var = kd1Var2.O0;
                                        long j = s5bVar.a;
                                        if (jd1Var != null) {
                                            j = Math.max(j, ((gd1) ((k6d) jd1Var).b).a.N());
                                        }
                                        qacVar.a(Long.valueOf(j));
                                    }
                                    ad1 ad1Var4 = gd1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kd1Var2.x(-1);
                                    CharSequence x2 = kd1Var2.x(1);
                                    ad1Var4.b();
                                    ad1Var4.K = f;
                                    ad1Var4.L = f2;
                                    ad1Var4.M = f3;
                                    zc1[] zc1VarArr = ad1Var4.a;
                                    if (intValue < 0) {
                                        c = 0;
                                    } else {
                                        c = 1;
                                    }
                                    zc1 zc1Var = zc1VarArr[c];
                                    for (zc1 zc1Var2 : zc1VarArr) {
                                        uib uibVar = zc1Var2.h;
                                        zc1Var2.i = uibVar;
                                        if (uibVar != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        zc1Var2.k = z;
                                        zc1Var2.j = zc1Var2.e.c;
                                    }
                                    ad1Var4.S = zc1Var.g;
                                    if (charSequence2 != null) {
                                        str2 = charSequence2.toString();
                                    }
                                    ad1Var4.T = str2;
                                    zc1 zc1Var3 = zc1VarArr[0];
                                    if (x == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x.toString();
                                    }
                                    zc1Var3.b(charSequence);
                                    zc1 zc1Var4 = zc1VarArr[1];
                                    if (x2 != null) {
                                        str = x2.toString();
                                    }
                                    zc1Var4.b(str);
                                    ad1Var4.R = zc1Var;
                                    ad1Var4.Q = SystemClock.elapsedRealtime();
                                    ad1Var4.invalidate();
                                    kd1Var2.getEditText().setAlpha(0.0f);
                                    kd1Var2.setSelectionWidth(gd1Var.i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f4 = (Float) obj;
                            kd1 kd1Var3 = gd1Var.f;
                            if (kd1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kd1Var3.getEditText().setAlpha(1.0f);
                                    kd1Var3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                kd1Var3.setSelectionWidth(gm.R1(gd1Var.i, kd1Var3.getMeasuredWidth(), f4.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.a.G().addView(this.e, qoe.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        o1Var.run();
    }
}
