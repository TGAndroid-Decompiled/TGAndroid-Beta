package hi;

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.wy0;
public final class a0 {
    public final z f14168a;
    public final r7 f14169b;
    public m.o3 f14170c;
    public Runnable d;
    public u f14171e;
    public tg.d f14172f;
    public float f14174i;
    public final float[] f14173g = new float[2];
    public final float[] h = new float[3];
    public final a8.sa f14175j = new a8.sa(this, 27);

    public a0(File file, z zVar) {
        this.f14168a = zVar;
        this.f14169b = new r7(new wf.b(25, file.getAbsolutePath(), file), zVar.N1(), zVar.Z0(), new w(this, 0));
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

    public static void g(tg.d dVar, float[] fArr) {
        float extendedPaddingTop;
        tg.f editText = dVar.getEditText();
        Layout layout = editText.getLayout();
        if (layout != null && layout.getLineCount() > 0) {
            extendedPaddingTop = editText.getBaseline() - layout.getLineBaseline(0);
        } else {
            extendedPaddingTop = editText.getExtendedPaddingTop();
        }
        fArr[0] = ((editText.getCompoundPaddingLeft() + editText.getLeft()) - editText.getScrollX()) - (dVar.getWidth() / 2.0f);
        fArr[1] = (editText.getTop() + extendedPaddingTop) - (dVar.getHeight() / 2.0f);
        fArr[2] = (editText.getWidth() - editText.getCompoundPaddingLeft()) - editText.getCompoundPaddingRight();
    }

    public final void a() {
        String o4;
        if (!c()) {
            return;
        }
        z zVar = this.f14168a;
        tg.d S = zVar.S();
        S.setLoading(true);
        r7 r7Var = this.f14169b;
        Objects.requireNonNull(r7Var);
        S.setPendingProvider(new di.v6(r7Var, 18));
        zVar.M1(S);
        r7Var.i();
        r7Var.f15311n = new x(zVar, 0);
        r7Var.f15318u = new di.v6(new TextPaint(S.getEditText().getPaint()), 19);
        r7Var.v = S.getLineWidth() * 0.96f;
        m.o3 o3Var = this.f14170c;
        if (o3Var != null) {
            o3Var.f20256f = null;
            org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
            if (fcVar != null) {
                fcVar.b();
                o3Var.h = null;
            }
            this.f14170c = null;
        }
        Context context = S.getContext();
        FrameLayout N = zVar.N();
        org.telegram.ui.ActionBar.i6 Q = zVar.Q();
        android.support.v4.media.session.a0 a0Var = r7Var.f15304f;
        if (a0Var == null) {
            o4 = "";
        } else {
            o4 = ai.l0.o(a0Var.i());
        }
        m.o3 o3Var2 = new m.o3(context, N, Q, o4, new c(1, this, S));
        this.f14170c = o3Var2;
        this.f14169b.h(zVar.N1(), zVar.Z0(), new h6.m(this, o3Var2, S, 1));
    }

    public final void b(tg.d dVar) {
        z zVar = this.f14168a;
        dVar.setPositionProvider(new x(zVar, 1));
        dVar.setOnEditing(new ai.s1(15, this, dVar));
        dVar.setOnSeek(new y(zVar, 0));
        dVar.setRangeProvider(new ob.c(this, 27));
    }

    public final boolean c() {
        if (this.f14169b.f15304f != null && this.f14168a.i0() == null) {
            return true;
        }
        return false;
    }

    public final float d(tg.d dVar, float f10, float f11) {
        float[] fArr = this.f14173g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.f14171e, fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        fArr[0] = f10;
        fArr[1] = f11;
        e(dVar, fArr);
        fArr[1] = fArr[1] - f13;
        float f14 = fArr[0] - f12;
        fArr[0] = f14;
        return f14;
    }

    public final void f(tg.d dVar) {
        u uVar = this.f14171e;
        a8.sa saVar = this.f14175j;
        if (uVar != null) {
            uVar.b();
            this.f14171e.removeCallbacks(saVar);
        }
        this.f14172f = dVar;
        if (dVar == null) {
            u uVar2 = this.f14171e;
            if (uVar2 != null) {
                uVar2.e(null, null);
                this.f14171e.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f14171e == null) {
            u uVar3 = new u(dVar.getContext());
            this.f14171e = uVar3;
            uVar3.setOnClick(new w10(this) {
                public final a0 f15537b;

                {
                    this.f15537b = this;
                }

                @Override
                public final void a(Object obj) {
                    o7 o7Var;
                    int i7;
                    String str;
                    int i10;
                    String str2;
                    String charSequence;
                    boolean z10;
                    long j3;
                    switch (r2) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            a0 a0Var = this.f15537b;
                            tg.d dVar2 = a0Var.f14172f;
                            if (dVar2 != null && a0Var.f14171e != null && dVar2.x(intValue) != null) {
                                a0Var.f14171e.b();
                                String charSequence2 = dVar2.getText().toString();
                                a0Var.f14174i = dVar2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                a0.g(dVar2, fArr);
                                String str3 = null;
                                if (dVar2.G0) {
                                    o7Var = dVar2.w(intValue);
                                } else {
                                    o7Var = null;
                                }
                                if (o7Var != null) {
                                    dVar2.E0 = o7Var;
                                    dVar2.H0 = true;
                                    CharSequence charSequence3 = o7Var.f15161c;
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    dVar2.setText(charSequence3);
                                    dVar2.H0 = false;
                                    dVar2.getEditText().setSelection(dVar2.getEditText().length());
                                    w10 w10Var = dVar2.M0;
                                    if (w10Var != null) {
                                        tg.c cVar = dVar2.O0;
                                        if (cVar != null) {
                                            i7 = 0;
                                            str = "";
                                            j3 = Math.max(o7Var.f15159a, ((a0) ((ob.c) cVar).f21874b).f14168a.N1());
                                        } else {
                                            i7 = 0;
                                            str = "";
                                            j3 = o7Var.f15159a;
                                        }
                                        w10Var.a(Long.valueOf(j3));
                                    } else {
                                        i7 = 0;
                                        str = "";
                                    }
                                    u uVar4 = a0Var.f14171e;
                                    float f10 = fArr[i7];
                                    float f11 = fArr[1];
                                    float f12 = fArr[2];
                                    CharSequence x10 = dVar2.x(-1);
                                    CharSequence x11 = dVar2.x(1);
                                    uVar4.b();
                                    uVar4.K = f10;
                                    uVar4.L = f11;
                                    uVar4.M = f12;
                                    t[] tVarArr = uVar4.f15470a;
                                    if (intValue < 0) {
                                        i10 = i7;
                                    } else {
                                        i10 = 1;
                                    }
                                    t tVar = tVarArr[i10];
                                    int length = tVarArr.length;
                                    for (int i11 = i7; i11 < length; i11++) {
                                        t tVar2 = tVarArr[i11];
                                        wy0 wy0Var = tVar2.h;
                                        tVar2.f15424i = wy0Var;
                                        if (wy0Var != null) {
                                            z10 = 1;
                                        } else {
                                            z10 = i7;
                                        }
                                        tVar2.f15426k = z10;
                                        tVar2.f15425j = tVar2.f15421e.f33931c;
                                    }
                                    uVar4.S = tVar.f15423g;
                                    if (charSequence2 == null) {
                                        str2 = str;
                                    } else {
                                        str2 = charSequence2.toString();
                                    }
                                    uVar4.T = str2;
                                    t tVar3 = tVarArr[i7];
                                    if (x10 == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x10.toString();
                                    }
                                    tVar3.b(charSequence);
                                    t tVar4 = tVarArr[1];
                                    if (x11 != null) {
                                        str3 = x11.toString();
                                    }
                                    tVar4.b(str3);
                                    uVar4.R = tVar;
                                    uVar4.Q = SystemClock.elapsedRealtime();
                                    uVar4.invalidate();
                                    dVar2.getEditText().setAlpha(0.0f);
                                    dVar2.setSelectionWidth(a0Var.f14174i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f13 = (Float) obj;
                            a0 a0Var2 = this.f15537b;
                            tg.d dVar3 = a0Var2.f14172f;
                            if (dVar3 != null) {
                                if (f13.floatValue() >= 1.0f) {
                                    dVar3.getEditText().setAlpha(1.0f);
                                    dVar3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                dVar3.setSelectionWidth(org.telegram.messenger.g0.T1(a0Var2.f14174i, dVar3.getMeasuredWidth(), f13.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.f14171e.setOnSwitchProgress(new w10(this) {
                public final a0 f15537b;

                {
                    this.f15537b = this;
                }

                @Override
                public final void a(Object obj) {
                    o7 o7Var;
                    int i7;
                    String str;
                    int i10;
                    String str2;
                    String charSequence;
                    boolean z10;
                    long j3;
                    switch (r2) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            a0 a0Var = this.f15537b;
                            tg.d dVar2 = a0Var.f14172f;
                            if (dVar2 != null && a0Var.f14171e != null && dVar2.x(intValue) != null) {
                                a0Var.f14171e.b();
                                String charSequence2 = dVar2.getText().toString();
                                a0Var.f14174i = dVar2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                a0.g(dVar2, fArr);
                                String str3 = null;
                                if (dVar2.G0) {
                                    o7Var = dVar2.w(intValue);
                                } else {
                                    o7Var = null;
                                }
                                if (o7Var != null) {
                                    dVar2.E0 = o7Var;
                                    dVar2.H0 = true;
                                    CharSequence charSequence3 = o7Var.f15161c;
                                    if (charSequence3 == null) {
                                        charSequence3 = "";
                                    }
                                    dVar2.setText(charSequence3);
                                    dVar2.H0 = false;
                                    dVar2.getEditText().setSelection(dVar2.getEditText().length());
                                    w10 w10Var = dVar2.M0;
                                    if (w10Var != null) {
                                        tg.c cVar = dVar2.O0;
                                        if (cVar != null) {
                                            i7 = 0;
                                            str = "";
                                            j3 = Math.max(o7Var.f15159a, ((a0) ((ob.c) cVar).f21874b).f14168a.N1());
                                        } else {
                                            i7 = 0;
                                            str = "";
                                            j3 = o7Var.f15159a;
                                        }
                                        w10Var.a(Long.valueOf(j3));
                                    } else {
                                        i7 = 0;
                                        str = "";
                                    }
                                    u uVar4 = a0Var.f14171e;
                                    float f10 = fArr[i7];
                                    float f11 = fArr[1];
                                    float f12 = fArr[2];
                                    CharSequence x10 = dVar2.x(-1);
                                    CharSequence x11 = dVar2.x(1);
                                    uVar4.b();
                                    uVar4.K = f10;
                                    uVar4.L = f11;
                                    uVar4.M = f12;
                                    t[] tVarArr = uVar4.f15470a;
                                    if (intValue < 0) {
                                        i10 = i7;
                                    } else {
                                        i10 = 1;
                                    }
                                    t tVar = tVarArr[i10];
                                    int length = tVarArr.length;
                                    for (int i11 = i7; i11 < length; i11++) {
                                        t tVar2 = tVarArr[i11];
                                        wy0 wy0Var = tVar2.h;
                                        tVar2.f15424i = wy0Var;
                                        if (wy0Var != null) {
                                            z10 = 1;
                                        } else {
                                            z10 = i7;
                                        }
                                        tVar2.f15426k = z10;
                                        tVar2.f15425j = tVar2.f15421e.f33931c;
                                    }
                                    uVar4.S = tVar.f15423g;
                                    if (charSequence2 == null) {
                                        str2 = str;
                                    } else {
                                        str2 = charSequence2.toString();
                                    }
                                    uVar4.T = str2;
                                    t tVar3 = tVarArr[i7];
                                    if (x10 == null) {
                                        charSequence = null;
                                    } else {
                                        charSequence = x10.toString();
                                    }
                                    tVar3.b(charSequence);
                                    t tVar4 = tVarArr[1];
                                    if (x11 != null) {
                                        str3 = x11.toString();
                                    }
                                    tVar4.b(str3);
                                    uVar4.R = tVar;
                                    uVar4.Q = SystemClock.elapsedRealtime();
                                    uVar4.invalidate();
                                    dVar2.getEditText().setAlpha(0.0f);
                                    dVar2.setSelectionWidth(a0Var.f14174i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            Float f13 = (Float) obj;
                            a0 a0Var2 = this.f15537b;
                            tg.d dVar3 = a0Var2.f14172f;
                            if (dVar3 != null) {
                                if (f13.floatValue() >= 1.0f) {
                                    dVar3.getEditText().setAlpha(1.0f);
                                    dVar3.setSelectionWidth(-1.0f);
                                    return;
                                }
                                dVar3.setSelectionWidth(org.telegram.messenger.g0.T1(a0Var2.f14174i, dVar3.getMeasuredWidth(), f13.floatValue()));
                                return;
                            }
                            return;
                    }
                }
            });
            this.f14168a.Q0().addView(this.f14171e, c8.na.c(-1.0f, -1));
        }
        this.f14171e.setVisibility(0);
        saVar.run();
    }
}
