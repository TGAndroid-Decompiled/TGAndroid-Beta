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
public final class eab implements View.OnClickListener {
    public final byte a;
    public final rbb b;

    public eab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final void onClick(View view) {
        long j;
        k43 k43Var;
        boolean z;
        int i;
        String M0;
        int i2;
        int i3;
        el2 el2Var;
        byte b = this.a;
        boolean z2 = false;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbb rbbVar2 = this.b;
                if (rbbVar2.L1 != null && rbbVar2.D2 == null && rbbVar2.j1 != null) {
                    ValueAnimator valueAnimator = rbbVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z3 = rbbVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(rbbVar2.n.getWidth(), rbbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rbbVar2.j1.setAlpha(0.0f);
                        gbb gbbVar = rbbVar2.Y0;
                        if (gbbVar != null) {
                            gbbVar.h0 = true;
                        }
                        vab vabVar = rbbVar2.w1;
                        if (vabVar != null) {
                            vabVar.s0 = true;
                        }
                        rbbVar2.n.draw(canvas);
                        gbb gbbVar2 = rbbVar2.Y0;
                        if (gbbVar2 != null) {
                            gbbVar2.h0 = false;
                        }
                        vab vabVar2 = rbbVar2.w1;
                        if (vabVar2 != null) {
                            vabVar2.s0 = false;
                        }
                        rbbVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rbbVar2.j1.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bbb bbbVar = new bbb(rbbVar2, rbbVar2.b, z3, canvas, (rbbVar2.j1.getMeasuredWidth() / 2.0f) + f, (rbbVar2.j1.getMeasuredHeight() / 2.0f) + f2, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n, paint, createBitmap, paint2, f, f2);
                        rbbVar2.D2 = bbbVar;
                        bbbVar.setOnTouchListener(new b02((byte) 27));
                        rbbVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rbbVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(rbbVar2, (byte) 2));
                        rbbVar2.F2.addListener(new tab(rbbVar2, (byte) 2));
                        rbbVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = rbbVar2.F2;
                        if (z3) {
                            j = 320;
                        } else {
                            j = 450;
                        }
                        valueAnimator2.setDuration(j);
                        ValueAnimator valueAnimator3 = rbbVar2.F2;
                        if (z3) {
                            k43Var = k43.i;
                        } else {
                            k43Var = k43.h;
                        }
                        valueAnimator3.setInterpolator(k43Var);
                        rbbVar2.F2.start();
                        rbbVar2.n.addView(rbbVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new bab(rbbVar2, (byte) 2));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!rbbVar.T1) {
                    rbbVar.K();
                    return;
                }
                return;
            case 2:
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null && !rbbVar.T1) {
                    c8bVar.Y = !c8bVar.Y;
                    ArrayList arrayList = c8bVar.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            ((c8b) obj).Y = rbbVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(rbbVar.L1.y);
                    c8b c8bVar2 = rbbVar.L1;
                    if (c8bVar2.o0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rbbVar.h0 == -1) {
                        kg5 kg5Var = rbbVar.l1;
                        if (c8bVar2.Y) {
                            if (isEmpty && !z) {
                                i2 = 2131744114;
                            } else {
                                i2 = 2131744246;
                            }
                            M0 = ob6.M0(i2, null);
                        } else {
                            if (isEmpty && !z) {
                                i = 2131744113;
                            } else {
                                i = 2131744245;
                            }
                            M0 = ob6.M0(i, null);
                        }
                        boolean z4 = rbbVar.l1.W;
                        if (kg5Var.getMeasuredWidth() < 0) {
                            kg5Var.H = M0;
                        } else {
                            hn hnVar = kg5Var.I;
                            if (!ob6.a0 && z4) {
                                z2 = true;
                            }
                            hnVar.t(M0, z2, true);
                        }
                        rbbVar.l1.v();
                    }
                    rbbVar.e0(rbbVar.L1.Y, true);
                    rbbVar.Y0.b();
                    return;
                }
                return;
            case 3:
                boolean j2 = rbbVar.Y0.j();
                rbbVar.Y0.x(-9982, j2);
                ((mf8) rbbVar.k1.c).a(!j2, true);
                return;
            case 4:
                if (rbbVar.C0 != null && !rbbVar.T1) {
                    String A = rbbVar.A();
                    String D = rbbVar.D();
                    if (A != null && !A.equals(D)) {
                        wab wabVar = rbbVar.C0;
                        if (wabVar != null && wabVar.getCameraSession() != null) {
                            if (rbbVar.C0.isFrontface() && !rbbVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = rbbVar.v2.indexOf(D);
                                if (indexOf >= 0) {
                                    rbbVar.u2 = indexOf;
                                    uc7.e1().edit().putInt("frontflash", rbbVar.u2).apply();
                                }
                            } else {
                                rbbVar.C0.getCameraSession().setCurrentFlashMode(D);
                            }
                        }
                        rbbVar.d0(D);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                wab wabVar2 = rbbVar.C0;
                if (wabVar2 != null && rbbVar.g0 == 0) {
                    wabVar2.toggleDual();
                    rbbVar.G0.setValue(rbbVar.C0.isDual());
                    otb otbVar = rbbVar.G0;
                    if (rbbVar.C0.isDual()) {
                        i3 = 2131754882;
                    } else {
                        i3 = 2131754883;
                    }
                    otbVar.setContentDescription(ob6.M0(i3, null));
                    rbbVar.m1.f(true);
                    uc7.e1().edit().putInt("storydualhint", 2).apply();
                    if (rbbVar.n1.W) {
                        uc7.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    rbbVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (rbbVar.g0 == 0 && !rbbVar.b2) {
                    wab wabVar3 = rbbVar.C0;
                    if (wabVar3 != null && wabVar3.isDual()) {
                        rbbVar.C0.toggleDual();
                    }
                    if (!rbbVar.J0.e && !rbbVar.B0.i()) {
                        rbbVar.B0.o(rbbVar.A0);
                        rbbVar.J0.setSelected(rbbVar.A0);
                        rbbVar.H0.a(new bl2(rbbVar.A0, false), true);
                        rbbVar.H0.setSelected(true);
                        wab wabVar4 = rbbVar.C0;
                        if (wabVar4 != null) {
                            wabVar4.recordHevc = !rbbVar.B0.i();
                        }
                        zt4 zt4Var = rbbVar.N0;
                        if (zt4Var != null) {
                            zt4Var.setMultipleOnClick(rbbVar.B0.i());
                            rbbVar.N0.setMaxCount(Math.min(10, al2.b() - rbbVar.B0.getFilledCount()));
                        }
                    }
                    rbbVar.J0.a(!el2Var.e, true);
                    rbbVar.l0(true);
                    return;
                }
                return;
            case 7:
                rbbVar.B0.o(null);
                rbbVar.B0.b();
                rbbVar.J0.setSelected((al2) null);
                wab wabVar5 = rbbVar.C0;
                if (wabVar5 != null) {
                    wabVar5.recordHevc = !rbbVar.B0.i();
                }
                rbbVar.J0.a(false, true);
                rbbVar.l0(true);
                zt4 zt4Var2 = rbbVar.N0;
                if (zt4Var2 != null) {
                    zt4Var2.setMultipleOnClick(rbbVar.B0.i());
                    rbbVar.N0.setMaxCount(Math.min(10, al2.b() - rbbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                rbbVar.j0();
                return;
            case 9:
                wab wabVar6 = rbbVar.C0;
                if (wabVar6 != null && !rbbVar.T1 && !rbbVar.Q1 && wabVar6.isInited() && rbbVar.g0 == 0) {
                    rbbVar.C0.switchCamera();
                    rbbVar.P0.d(180.0f);
                    uc7.e1().edit().putBoolean("stories_camera", rbbVar.C0.isFrontface()).apply();
                    boolean p0 = rbbVar.p0();
                    rk4 rk4Var = rbbVar.s;
                    if (p0) {
                        rk4Var.c(null);
                        return;
                    } else {
                        rk4Var.d();
                        return;
                    }
                }
                return;
            case 10:
                rbbVar.j0();
                return;
            case 11:
                c8b c8bVar3 = rbbVar.L1;
                if (c8bVar3 != null) {
                    c8bVar3.f0 = true;
                    c8bVar3.e0 = rbbVar.N1;
                    rbbVar.W();
                    c8b c8bVar4 = rbbVar.L1;
                    if (c8bVar4 != null && !c8bVar4.b0) {
                        hl.d3(new bab(rbbVar, (byte) 23), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (rbbVar.t2) {
                    rbbVar.Z(true);
                    return;
                }
                return;
            case 13:
                rbbVar.k0(-1, false, true);
                return;
            default:
                rbbVar.k0(-1, false, true);
                return;
        }
    }
}
