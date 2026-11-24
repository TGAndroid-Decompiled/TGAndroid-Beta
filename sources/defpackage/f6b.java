package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class f6b implements View.OnClickListener {
    public final byte a;
    public final t7b b;

    public f6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final void onClick(View view) {
        long j;
        s33 s33Var;
        boolean z;
        int i;
        String M0;
        int i2;
        int i3;
        jk2 jk2Var;
        byte b = this.a;
        boolean z2 = false;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7b t7bVar2 = this.b;
                if (t7bVar2.L1 != null && t7bVar2.D2 == null && t7bVar2.j1 != null) {
                    ValueAnimator valueAnimator = t7bVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z3 = t7bVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(t7bVar2.n.getWidth(), t7bVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        t7bVar2.j1.setAlpha(0.0f);
                        i7b i7bVar = t7bVar2.Y0;
                        if (i7bVar != null) {
                            i7bVar.h0 = true;
                        }
                        x6b x6bVar = t7bVar2.w1;
                        if (x6bVar != null) {
                            x6bVar.y0 = true;
                        }
                        t7bVar2.n.draw(canvas);
                        i7b i7bVar2 = t7bVar2.Y0;
                        if (i7bVar2 != null) {
                            i7bVar2.h0 = false;
                        }
                        x6b x6bVar2 = t7bVar2.w1;
                        if (x6bVar2 != null) {
                            x6bVar2.y0 = false;
                        }
                        t7bVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        t7bVar2.j1.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        d7b d7bVar = new d7b(t7bVar2, t7bVar2.b, z3, canvas, (t7bVar2.j1.getMeasuredWidth() / 2.0f) + f, (t7bVar2.j1.getMeasuredHeight() / 2.0f) + f2, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n, paint, createBitmap, paint2, f, f2);
                        t7bVar2.D2 = d7bVar;
                        d7bVar.setOnTouchListener(new jz1((byte) 27));
                        t7bVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        t7bVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(t7bVar2, (byte) 2));
                        t7bVar2.F2.addListener(new v6b(t7bVar2, (byte) 2));
                        t7bVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = t7bVar2.F2;
                        if (z3) {
                            j = 320;
                        } else {
                            j = 450;
                        }
                        valueAnimator2.setDuration(j);
                        ValueAnimator valueAnimator3 = t7bVar2.F2;
                        if (z3) {
                            s33Var = s33.i;
                        } else {
                            s33Var = s33.h;
                        }
                        valueAnimator3.setInterpolator(s33Var);
                        t7bVar2.F2.start();
                        t7bVar2.n.addView(t7bVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        gl.d3(new d6b(t7bVar2, (byte) 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!t7bVar.T1) {
                    t7bVar.K();
                    return;
                }
                return;
            case 2:
                f4b f4bVar = t7bVar.L1;
                if (f4bVar != null && !t7bVar.T1) {
                    f4bVar.Y = !f4bVar.Y;
                    ArrayList arrayList = f4bVar.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            ((f4b) obj).Y = t7bVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(t7bVar.L1.y);
                    f4b f4bVar2 = t7bVar.L1;
                    if (f4bVar2.o0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (t7bVar.h0 == -1) {
                        je5 je5Var = t7bVar.l1;
                        if (f4bVar2.Y) {
                            if (isEmpty && !z) {
                                i2 = 2131744220;
                            } else {
                                i2 = 2131744352;
                            }
                            M0 = k96.M0(i2, null);
                        } else {
                            if (isEmpty && !z) {
                                i = 2131744219;
                            } else {
                                i = 2131744351;
                            }
                            M0 = k96.M0(i, null);
                        }
                        boolean z4 = t7bVar.l1.W;
                        if (je5Var.getMeasuredWidth() < 0) {
                            je5Var.H = M0;
                        } else {
                            gn gnVar = je5Var.I;
                            if (!k96.a0 && z4) {
                                z2 = true;
                            }
                            gnVar.t(M0, z2, true);
                        }
                        t7bVar.l1.v();
                    }
                    t7bVar.e0(t7bVar.L1.Y, true);
                    t7bVar.Y0.b();
                    return;
                }
                return;
            case 3:
                boolean j2 = t7bVar.Y0.j();
                t7bVar.Y0.x(-9982, j2);
                ((xb8) t7bVar.k1.c).a(!j2, true);
                return;
            case 4:
                if (t7bVar.C0 != null && !t7bVar.T1) {
                    String A = t7bVar.A();
                    String D = t7bVar.D();
                    if (A != null && !A.equals(D)) {
                        y6b y6bVar = t7bVar.C0;
                        if (y6bVar != null && y6bVar.getCameraSession() != null) {
                            if (t7bVar.C0.isFrontface() && !t7bVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = t7bVar.v2.indexOf(D);
                                if (indexOf >= 0) {
                                    t7bVar.u2 = indexOf;
                                    na7.c1().edit().putInt("frontflash", t7bVar.u2).apply();
                                }
                            } else {
                                t7bVar.C0.getCameraSession().setCurrentFlashMode(D);
                            }
                        }
                        t7bVar.d0(D);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                y6b y6bVar2 = t7bVar.C0;
                if (y6bVar2 != null && t7bVar.g0 == 0) {
                    y6bVar2.toggleDual();
                    t7bVar.G0.setValue(t7bVar.C0.isDual());
                    npb npbVar = t7bVar.G0;
                    if (t7bVar.C0.isDual()) {
                        i3 = 2131754886;
                    } else {
                        i3 = 2131754887;
                    }
                    npbVar.setContentDescription(k96.M0(i3, null));
                    t7bVar.m1.f(true);
                    na7.c1().edit().putInt("storydualhint", 2).apply();
                    if (t7bVar.n1.W) {
                        na7.c1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    t7bVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (t7bVar.g0 == 0 && !t7bVar.b2) {
                    y6b y6bVar3 = t7bVar.C0;
                    if (y6bVar3 != null && y6bVar3.isDual()) {
                        t7bVar.C0.toggleDual();
                    }
                    if (!t7bVar.J0.e && !t7bVar.B0.i()) {
                        t7bVar.B0.o(t7bVar.A0);
                        t7bVar.J0.setSelected(t7bVar.A0);
                        t7bVar.H0.a(new gk2(t7bVar.A0, false), true);
                        t7bVar.H0.setSelected(true);
                        y6b y6bVar4 = t7bVar.C0;
                        if (y6bVar4 != null) {
                            y6bVar4.recordHevc = !t7bVar.B0.i();
                        }
                        vr4 vr4Var = t7bVar.N0;
                        if (vr4Var != null) {
                            vr4Var.setMultipleOnClick(t7bVar.B0.i());
                            t7bVar.N0.setMaxCount(Math.min(10, fk2.b() - t7bVar.B0.getFilledCount()));
                        }
                    }
                    t7bVar.J0.a(!jk2Var.e, true);
                    t7bVar.l0(true);
                    return;
                }
                return;
            case 7:
                t7bVar.B0.o(null);
                t7bVar.B0.b();
                t7bVar.J0.setSelected((fk2) null);
                y6b y6bVar5 = t7bVar.C0;
                if (y6bVar5 != null) {
                    y6bVar5.recordHevc = !t7bVar.B0.i();
                }
                t7bVar.J0.a(false, true);
                t7bVar.l0(true);
                vr4 vr4Var2 = t7bVar.N0;
                if (vr4Var2 != null) {
                    vr4Var2.setMultipleOnClick(t7bVar.B0.i());
                    t7bVar.N0.setMaxCount(Math.min(10, fk2.b() - t7bVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                t7bVar.j0();
                return;
            case 9:
                y6b y6bVar6 = t7bVar.C0;
                if (y6bVar6 != null && !t7bVar.T1 && !t7bVar.Q1 && y6bVar6.isInited() && t7bVar.g0 == 0) {
                    t7bVar.C0.switchCamera();
                    t7bVar.P0.d(180.0f);
                    na7.c1().edit().putBoolean("stories_camera", t7bVar.C0.isFrontface()).apply();
                    boolean p0 = t7bVar.p0();
                    mi4 mi4Var = t7bVar.s;
                    if (p0) {
                        mi4Var.c(null);
                        return;
                    } else {
                        mi4Var.d();
                        return;
                    }
                }
                return;
            case 10:
                t7bVar.j0();
                return;
            case 11:
                f4b f4bVar3 = t7bVar.L1;
                if (f4bVar3 != null) {
                    f4bVar3.f0 = true;
                    f4bVar3.e0 = t7bVar.N1;
                    t7bVar.W();
                    f4b f4bVar4 = t7bVar.L1;
                    if (f4bVar4 != null && !f4bVar4.b0) {
                        gl.e3(new d6b(t7bVar, (byte) 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (t7bVar.t2) {
                    t7bVar.Z(true);
                    return;
                }
                return;
            case 13:
                t7bVar.k0(-1, false, true);
                return;
            default:
                t7bVar.k0(-1, false, true);
                return;
        }
    }
}
