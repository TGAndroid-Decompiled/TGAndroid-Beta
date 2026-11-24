package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
public final class yb1 {
    public final xb1 a;
    public final u3b b;
    public jb4 c;
    public Runnable d;
    public tb1 e;
    public cc1 f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final o1 j = new o1(this, (byte) 13);

    public yb1(File file, xb1 xb1Var) {
        this.a = xb1Var;
        this.b = new u3b(new wk4(file.getAbsolutePath(), file, (byte) 29), xb1Var.I(), xb1Var.F(), new nv0(this, (byte) 17));
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

    public static void g(cc1 cc1Var, float[] fArr) {
        float extendedPaddingTop;
        st3 editText = cc1Var.getEditText();
        Layout layout = editText.getLayout();
        if (layout != null && layout.getLineCount() > 0) {
            extendedPaddingTop = editText.getBaseline() - layout.getLineBaseline(0);
        } else {
            extendedPaddingTop = editText.getExtendedPaddingTop();
        }
        fArr[0] = ((editText.getCompoundPaddingLeft() + editText.getLeft()) - editText.getScrollX()) - (cc1Var.getWidth() / 2.0f);
        fArr[1] = (editText.getTop() + extendedPaddingTop) - (cc1Var.getHeight() / 2.0f);
        fArr[2] = (editText.getWidth() - editText.getCompoundPaddingLeft()) - editText.getCompoundPaddingRight();
    }

    public final void a() {
        String r;
        if (!c()) {
            return;
        }
        xb1 xb1Var = this.a;
        cc1 p = xb1Var.p();
        p.setLoading(true);
        u3b u3bVar = this.b;
        Objects.requireNonNull(u3bVar);
        p.setPendingProvider(new sg0(u3bVar, (byte) 27));
        xb1Var.J(p);
        u3bVar.i();
        u3bVar.n = new vb1(xb1Var, (byte) 0);
        u3bVar.u = new wb1(new TextPaint(p.getEditText().getPaint()), (byte) 0);
        u3bVar.v = p.getLineWidth() * 0.96f;
        jb4 jb4Var = this.c;
        if (jb4Var != null) {
            jb4Var.f = null;
            m21 m21Var = (m21) jb4Var.g;
            if (m21Var != null) {
                m21Var.b();
                jb4Var.g = null;
            }
            this.c = null;
        }
        Context context = p.getContext();
        FrameLayout m = xb1Var.m();
        wjb o = xb1Var.o();
        xl3 xl3Var = u3bVar.f;
        if (xl3Var == null) {
            r = "";
        } else {
            r = jm3.r(xl3Var.u());
        }
        jb4 jb4Var2 = new jb4(context, m, o, r, new q21(this, p, (byte) 15));
        this.c = jb4Var2;
        this.b.h(xb1Var.I(), xb1Var.F(), new mv6(this, jb4Var2, p, (byte) 14));
    }

    public final void b(cc1 cc1Var) {
        xb1 xb1Var = this.a;
        cc1Var.setPositionProvider(new vb1(xb1Var, (byte) 1));
        cc1Var.setOnEditing(new x0(this, cc1Var, (byte) 12));
        cc1Var.setOnSeek(new be2(xb1Var, (byte) 13));
        cc1Var.setRangeProvider(new i4d(this));
    }

    public final boolean c() {
        if (this.b.f != null && this.a.t() == null) {
            return true;
        }
        return false;
    }

    public final float d(cc1 cc1Var, float f, float f2) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        fArr[0] = f;
        fArr[1] = f2;
        e(cc1Var, fArr);
        fArr[1] = fArr[1] - f4;
        float f5 = fArr[0] - f3;
        fArr[0] = f5;
        return f5;
    }

    public final void f(cc1 cc1Var) {
        tb1 tb1Var = this.e;
        o1 o1Var = this.j;
        if (tb1Var != null) {
            tb1Var.b();
            this.e.removeCallbacks(o1Var);
        }
        this.f = cc1Var;
        tb1 tb1Var2 = this.e;
        if (cc1Var == null) {
            if (tb1Var2 != null) {
                tb1Var2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        if (tb1Var2 == null) {
            tb1 tb1Var3 = new tb1(cc1Var.getContext());
            this.e = tb1Var3;
            tb1Var3.setOnClick(new p8c(this) {
                public final yb1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    r3b r3bVar;
                    char c;
                    String charSequence;
                    boolean z;
                    byte b = r2;
                    yb1 yb1Var = this.b;
                    switch (b) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            cc1 cc1Var2 = yb1Var.f;
                            if (cc1Var2 != null && yb1Var.e != null && cc1Var2.x(intValue) != null) {
                                yb1Var.e.b();
                                String charSequence2 = cc1Var2.getText().toString();
                                yb1Var.i = cc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                yb1.g(cc1Var2, fArr);
                                String str = null;
                                if (cc1Var2.G0) {
                                    r3bVar = cc1Var2.w(intValue);
                                } else {
                                    r3bVar = null;
                                }
                                if (r3bVar != null) {
                                    cc1Var2.E0 = r3bVar;
                                    cc1Var2.H0 = true;
                                    CharSequence charSequence3 = r3bVar.c;
                                    String str2 = "";
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    cc1Var2.setText(charSequence3);
                                    cc1Var2.H0 = false;
                                    cc1Var2.getEditText().setSelection(cc1Var2.getEditText().length());
                                    p8c p8cVar = cc1Var2.M0;
                                    if (p8cVar != null) {
                                        bc1 bc1Var = cc1Var2.O0;
                                        long j = r3bVar.a;
                                        if (bc1Var != null) {
                                            j = Math.max(j, ((yb1) ((i4d) bc1Var).a).a.I());
                                        }
                                        p8cVar.a(Long.valueOf(j));
                                    }
                                    tb1 tb1Var4 = yb1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = cc1Var2.x(-1);
                                    CharSequence x2 = cc1Var2.x(1);
                                    tb1Var4.b();
                                    tb1Var4.K = f;
                                    tb1Var4.L = f2;
                                    tb1Var4.M = f3;
                                    sb1[] sb1VarArr = tb1Var4.a;
                                    if (intValue < 0) {
                                        c = 0;
                                    } else {
                                        c = 1;
                                    }
                                    sb1 sb1Var = sb1VarArr[c];
                                    for (sb1 sb1Var2 : sb1VarArr) {
                                        tgb tgbVar = sb1Var2.h;
                                        sb1Var2.i = tgbVar;
                                        if (tgbVar != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sb1Var2.k = z;
                                        sb1Var2.j = sb1Var2.e.c;
                                    }
                                    tb1Var4.S = sb1Var.g;
                                    if (charSequence2 != null) {
                                        str2 = charSequence2.toString();
                                    }
                                    tb1Var4.T = str2;
                                    sb1 sb1Var3 = sb1VarArr[0];
                                    if (x == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x.toString();
                                    }
                                    sb1Var3.b(charSequence);
                                    sb1 sb1Var4 = sb1VarArr[1];
                                    if (x2 != null) {
                                        str = x2.toString();
                                    }
                                    sb1Var4.b(str);
                                    tb1Var4.R = sb1Var;
                                    tb1Var4.Q = SystemClock.elapsedRealtime();
                                    tb1Var4.invalidate();
                                    cc1Var2.getEditText().setAlpha(0.0f);
                                    cc1Var2.setSelectionWidth(yb1Var.i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f4 = (Float) obj;
                            cc1 cc1Var3 = yb1Var.f;
                            if (cc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    cc1Var3.getEditText().setAlpha(1.0f);
                                    cc1Var3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                cc1Var3.setSelectionWidth(gl.R1(yb1Var.i, cc1Var3.getMeasuredWidth(), f4.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.e.setOnSwitchProgress(new p8c(this) {
                public final yb1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    r3b r3bVar;
                    char c;
                    String charSequence;
                    boolean z;
                    byte b = r2;
                    yb1 yb1Var = this.b;
                    switch (b) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            cc1 cc1Var2 = yb1Var.f;
                            if (cc1Var2 != null && yb1Var.e != null && cc1Var2.x(intValue) != null) {
                                yb1Var.e.b();
                                String charSequence2 = cc1Var2.getText().toString();
                                yb1Var.i = cc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                yb1.g(cc1Var2, fArr);
                                String str = null;
                                if (cc1Var2.G0) {
                                    r3bVar = cc1Var2.w(intValue);
                                } else {
                                    r3bVar = null;
                                }
                                if (r3bVar != null) {
                                    cc1Var2.E0 = r3bVar;
                                    cc1Var2.H0 = true;
                                    CharSequence charSequence3 = r3bVar.c;
                                    String str2 = "";
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    cc1Var2.setText(charSequence3);
                                    cc1Var2.H0 = false;
                                    cc1Var2.getEditText().setSelection(cc1Var2.getEditText().length());
                                    p8c p8cVar = cc1Var2.M0;
                                    if (p8cVar != null) {
                                        bc1 bc1Var = cc1Var2.O0;
                                        long j = r3bVar.a;
                                        if (bc1Var != null) {
                                            j = Math.max(j, ((yb1) ((i4d) bc1Var).a).a.I());
                                        }
                                        p8cVar.a(Long.valueOf(j));
                                    }
                                    tb1 tb1Var4 = yb1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = cc1Var2.x(-1);
                                    CharSequence x2 = cc1Var2.x(1);
                                    tb1Var4.b();
                                    tb1Var4.K = f;
                                    tb1Var4.L = f2;
                                    tb1Var4.M = f3;
                                    sb1[] sb1VarArr = tb1Var4.a;
                                    if (intValue < 0) {
                                        c = 0;
                                    } else {
                                        c = 1;
                                    }
                                    sb1 sb1Var = sb1VarArr[c];
                                    for (sb1 sb1Var2 : sb1VarArr) {
                                        tgb tgbVar = sb1Var2.h;
                                        sb1Var2.i = tgbVar;
                                        if (tgbVar != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sb1Var2.k = z;
                                        sb1Var2.j = sb1Var2.e.c;
                                    }
                                    tb1Var4.S = sb1Var.g;
                                    if (charSequence2 != null) {
                                        str2 = charSequence2.toString();
                                    }
                                    tb1Var4.T = str2;
                                    sb1 sb1Var3 = sb1VarArr[0];
                                    if (x == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x.toString();
                                    }
                                    sb1Var3.b(charSequence);
                                    sb1 sb1Var4 = sb1VarArr[1];
                                    if (x2 != null) {
                                        str = x2.toString();
                                    }
                                    sb1Var4.b(str);
                                    tb1Var4.R = sb1Var;
                                    tb1Var4.Q = SystemClock.elapsedRealtime();
                                    tb1Var4.invalidate();
                                    cc1Var2.getEditText().setAlpha(0.0f);
                                    cc1Var2.setSelectionWidth(yb1Var.i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f4 = (Float) obj;
                            cc1 cc1Var3 = yb1Var.f;
                            if (cc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    cc1Var3.getEditText().setAlpha(1.0f);
                                    cc1Var3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                cc1Var3.setSelectionWidth(gl.R1(yb1Var.i, cc1Var3.getMeasuredWidth(), f4.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.a.D().addView(this.e, nme.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        o1Var.run();
    }
}
