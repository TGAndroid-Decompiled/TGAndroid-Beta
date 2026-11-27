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
    public final sbb b;

    public eab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
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
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbb sbbVar2 = this.b;
                if (sbbVar2.L1 != null && sbbVar2.D2 == null && sbbVar2.j1 != null) {
                    ValueAnimator valueAnimator = sbbVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z3 = sbbVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(sbbVar2.n.getWidth(), sbbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        sbbVar2.j1.setAlpha(0.0f);
                        hbb hbbVar = sbbVar2.Y0;
                        if (hbbVar != null) {
                            hbbVar.h0 = true;
                        }
                        wab wabVar = sbbVar2.w1;
                        if (wabVar != null) {
                            wabVar.s0 = true;
                        }
                        sbbVar2.n.draw(canvas);
                        hbb hbbVar2 = sbbVar2.Y0;
                        if (hbbVar2 != null) {
                            hbbVar2.h0 = false;
                        }
                        wab wabVar2 = sbbVar2.w1;
                        if (wabVar2 != null) {
                            wabVar2.s0 = false;
                        }
                        sbbVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        sbbVar2.j1.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cbb cbbVar = new cbb(sbbVar2, sbbVar2.b, z3, canvas, (sbbVar2.j1.getMeasuredWidth() / 2.0f) + f, (sbbVar2.j1.getMeasuredHeight() / 2.0f) + f2, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n, paint, createBitmap, paint2, f, f2);
                        sbbVar2.D2 = cbbVar;
                        cbbVar.setOnTouchListener(new b02((byte) 27));
                        sbbVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        sbbVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new hh1(sbbVar2, (byte) 2));
                        sbbVar2.F2.addListener(new uab(sbbVar2, (byte) 2));
                        sbbVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = sbbVar2.F2;
                        if (z3) {
                            j = 320;
                        } else {
                            j = 450;
                        }
                        valueAnimator2.setDuration(j);
                        ValueAnimator valueAnimator3 = sbbVar2.F2;
                        if (z3) {
                            k43Var = k43.i;
                        } else {
                            k43Var = k43.h;
                        }
                        valueAnimator3.setInterpolator(k43Var);
                        sbbVar2.F2.start();
                        sbbVar2.n.addView(sbbVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        hl.c3(new bab(sbbVar2, (byte) 2));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!sbbVar.T1) {
                    sbbVar.K();
                    return;
                }
                return;
            case 2:
                c8b c8bVar = sbbVar.L1;
                if (c8bVar != null && !sbbVar.T1) {
                    c8bVar.Y = !c8bVar.Y;
                    ArrayList arrayList = c8bVar.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            ((c8b) obj).Y = sbbVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(sbbVar.L1.y);
                    c8b c8bVar2 = sbbVar.L1;
                    if (c8bVar2.o0 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (sbbVar.h0 == -1) {
                        kg5 kg5Var = sbbVar.l1;
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
                        boolean z4 = sbbVar.l1.W;
                        if (kg5Var.getMeasuredWidth() < 0) {
                            kg5Var.H = M0;
                        } else {
                            hn hnVar = kg5Var.I;
                            if (!ob6.a0 && z4) {
                                z2 = true;
                            }
                            hnVar.t(M0, z2, true);
                        }
                        sbbVar.l1.v();
                    }
                    sbbVar.e0(sbbVar.L1.Y, true);
                    sbbVar.Y0.b();
                    return;
                }
                return;
            case 3:
                boolean j2 = sbbVar.Y0.j();
                sbbVar.Y0.x(-9982, j2);
                ((mf8) sbbVar.k1.c).a(!j2, true);
                return;
            case 4:
                if (sbbVar.C0 != null && !sbbVar.T1) {
                    String A = sbbVar.A();
                    String D = sbbVar.D();
                    if (A != null && !A.equals(D)) {
                        xab xabVar = sbbVar.C0;
                        if (xabVar != null && xabVar.getCameraSession() != null) {
                            if (sbbVar.C0.isFrontface() && !sbbVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = sbbVar.v2.indexOf(D);
                                if (indexOf >= 0) {
                                    sbbVar.u2 = indexOf;
                                    uc7.e1().edit().putInt("frontflash", sbbVar.u2).apply();
                                }
                            } else {
                                sbbVar.C0.getCameraSession().setCurrentFlashMode(D);
                            }
                        }
                        sbbVar.d0(D);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                xab xabVar2 = sbbVar.C0;
                if (xabVar2 != null && sbbVar.g0 == 0) {
                    xabVar2.toggleDual();
                    sbbVar.G0.setValue(sbbVar.C0.isDual());
                    otb otbVar = sbbVar.G0;
                    if (sbbVar.C0.isDual()) {
                        i3 = 2131754882;
                    } else {
                        i3 = 2131754883;
                    }
                    otbVar.setContentDescription(ob6.M0(i3, null));
                    sbbVar.m1.f(true);
                    uc7.e1().edit().putInt("storydualhint", 2).apply();
                    if (sbbVar.n1.W) {
                        uc7.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    sbbVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (sbbVar.g0 == 0 && !sbbVar.b2) {
                    xab xabVar3 = sbbVar.C0;
                    if (xabVar3 != null && xabVar3.isDual()) {
                        sbbVar.C0.toggleDual();
                    }
                    if (!sbbVar.J0.e && !sbbVar.B0.i()) {
                        sbbVar.B0.o(sbbVar.A0);
                        sbbVar.J0.setSelected(sbbVar.A0);
                        sbbVar.H0.a(new bl2(sbbVar.A0, false), true);
                        sbbVar.H0.setSelected(true);
                        xab xabVar4 = sbbVar.C0;
                        if (xabVar4 != null) {
                            xabVar4.recordHevc = !sbbVar.B0.i();
                        }
                        zt4 zt4Var = sbbVar.N0;
                        if (zt4Var != null) {
                            zt4Var.setMultipleOnClick(sbbVar.B0.i());
                            sbbVar.N0.setMaxCount(Math.min(10, al2.b() - sbbVar.B0.getFilledCount()));
                        }
                    }
                    sbbVar.J0.a(!el2Var.e, true);
                    sbbVar.l0(true);
                    return;
                }
                return;
            case 7:
                sbbVar.B0.o(null);
                sbbVar.B0.b();
                sbbVar.J0.setSelected((al2) null);
                xab xabVar5 = sbbVar.C0;
                if (xabVar5 != null) {
                    xabVar5.recordHevc = !sbbVar.B0.i();
                }
                sbbVar.J0.a(false, true);
                sbbVar.l0(true);
                zt4 zt4Var2 = sbbVar.N0;
                if (zt4Var2 != null) {
                    zt4Var2.setMultipleOnClick(sbbVar.B0.i());
                    sbbVar.N0.setMaxCount(Math.min(10, al2.b() - sbbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                sbbVar.j0();
                return;
            case 9:
                xab xabVar6 = sbbVar.C0;
                if (xabVar6 != null && !sbbVar.T1 && !sbbVar.Q1 && xabVar6.isInited() && sbbVar.g0 == 0) {
                    sbbVar.C0.switchCamera();
                    sbbVar.P0.d(180.0f);
                    uc7.e1().edit().putBoolean("stories_camera", sbbVar.C0.isFrontface()).apply();
                    boolean p0 = sbbVar.p0();
                    rk4 rk4Var = sbbVar.s;
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
                sbbVar.j0();
                return;
            case 11:
                c8b c8bVar3 = sbbVar.L1;
                if (c8bVar3 != null) {
                    c8bVar3.f0 = true;
                    c8bVar3.e0 = sbbVar.N1;
                    sbbVar.W();
                    c8b c8bVar4 = sbbVar.L1;
                    if (c8bVar4 != null && !c8bVar4.b0) {
                        hl.d3(new bab(sbbVar, (byte) 23), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (sbbVar.t2) {
                    sbbVar.Z(true);
                    return;
                }
                return;
            case 13:
                sbbVar.k0(-1, false, true);
                return;
            default:
                sbbVar.k0(-1, false, true);
                return;
        }
    }
}
