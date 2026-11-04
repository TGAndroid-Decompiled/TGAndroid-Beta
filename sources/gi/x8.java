package gi;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.xq;
public final class x8 implements View.OnClickListener {
    public final int f13869a;
    public final va f13870b;

    public x8(va vaVar, int i3) {
        this.f13869a = i3;
        this.f13870b = vaVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        xq xqVar;
        boolean z10;
        int i3;
        String M0;
        int i10;
        int i11;
        y yVar;
        int i12 = this.f13869a;
        boolean z11 = false;
        va vaVar = this.f13870b;
        switch (i12) {
            case 0:
                va vaVar2 = this.f13870b;
                if (vaVar2.L1 != null && vaVar2.D2 == null && vaVar2.f13730j1 != null) {
                    ValueAnimator valueAnimator = vaVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = vaVar2.L1.f12752y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vaVar2.f13738n.getWidth(), vaVar2.f13738n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vaVar2.f13730j1.setAlpha(0.0f);
                        ja jaVar = vaVar2.Y0;
                        if (jaVar != null) {
                            jaVar.f13948h0 = true;
                        }
                        x9 x9Var = vaVar2.f13770w1;
                        if (x9Var != null) {
                            x9Var.f13227s0 = true;
                        }
                        vaVar2.f13738n.draw(canvas);
                        ja jaVar2 = vaVar2.Y0;
                        if (jaVar2 != null) {
                            jaVar2.f13948h0 = false;
                        }
                        x9 x9Var2 = vaVar2.f13770w1;
                        if (x9Var2 != null) {
                            x9Var2.f13227s0 = false;
                        }
                        vaVar2.f13730j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vaVar2.f13730j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        da daVar = new da(vaVar2, vaVar2.f13702b, z12, canvas, (vaVar2.f13730j1.getMeasuredWidth() / 2.0f) + f10, (vaVar2.f13730j1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n, paint, createBitmap, paint2, f10, f11);
                        vaVar2.D2 = daVar;
                        daVar.setOnTouchListener(new fi.a(2));
                        vaVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vaVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new ea(vaVar2, 0));
                        vaVar2.F2.addListener(new v9(vaVar2, 2));
                        vaVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = vaVar2.F2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = vaVar2.F2;
                        if (z12) {
                            xqVar = xq.f40454i;
                        } else {
                            xqVar = xq.h;
                        }
                        valueAnimator3.setInterpolator(xqVar);
                        vaVar2.F2.start();
                        vaVar2.f13738n.addView(vaVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new v8(vaVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!vaVar.T1) {
                    vaVar.L();
                    return;
                }
                return;
            case 2:
                f7 f7Var = vaVar.L1;
                if (f7Var != null && !vaVar.T1) {
                    f7Var.Y = !f7Var.Y;
                    ArrayList arrayList = f7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((f7) obj).Y = vaVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vaVar.L1.f12751y);
                    f7 f7Var2 = vaVar.L1;
                    if (f7Var2.f12733o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (vaVar.f13723h0 == -1) {
                        l3 l3Var = vaVar.f13735l1;
                        if (f7Var2.Y) {
                            if (isEmpty && !z10) {
                                i10 = 2131744470;
                            } else {
                                i10 = 2131744602;
                            }
                            M0 = bd.M0(i10, null);
                        } else {
                            if (isEmpty && !z10) {
                                i3 = 2131744469;
                            } else {
                                i3 = 2131744601;
                            }
                            M0 = bd.M0(i3, null);
                        }
                        boolean z13 = vaVar.f13735l1.W;
                        if (l3Var.getMeasuredWidth() < 0) {
                            l3Var.H = M0;
                        } else {
                            org.telegram.ui.Components.g6 g6Var = l3Var.I;
                            if (!bd.f21784a0 && z13) {
                                z11 = true;
                            }
                            g6Var.t(M0, z11, true);
                        }
                        vaVar.f13735l1.w();
                    }
                    vaVar.e0(vaVar.L1.Y, true);
                    vaVar.Y0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = vaVar.Y0.k();
                vaVar.Y0.x(-9982, k10);
                ((je0) vaVar.k1.f13304c).a(!k10, true);
                return;
            case 4:
                if (vaVar.C0 != null && !vaVar.T1) {
                    String B = vaVar.B();
                    String E = vaVar.E();
                    if (B != null && !B.equals(E)) {
                        y9 y9Var = vaVar.C0;
                        if (y9Var != null && y9Var.getCameraSession() != null) {
                            if (vaVar.C0.isFrontface() && !vaVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = vaVar.f13767v2.indexOf(E);
                                if (indexOf >= 0) {
                                    vaVar.f13764u2 = indexOf;
                                    hp.e1().edit().putInt("frontflash", vaVar.f13764u2).apply();
                                }
                            } else {
                                vaVar.C0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        vaVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                y9 y9Var2 = vaVar.C0;
                if (y9Var2 != null && vaVar.f13720g0 == 0) {
                    y9Var2.toggleDual();
                    vaVar.G0.setValue(vaVar.C0.isDual());
                    hb hbVar = vaVar.G0;
                    if (vaVar.C0.isDual()) {
                        i11 = 2131754886;
                    } else {
                        i11 = 2131754887;
                    }
                    hbVar.setContentDescription(bd.M0(i11, null));
                    vaVar.m1.f(true);
                    hp.e1().edit().putInt("storydualhint", 2).apply();
                    if (vaVar.f13740n1.W) {
                        hp.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vaVar.f13740n1.f(true);
                    return;
                }
                return;
            case 6:
                if (vaVar.f13720g0 == 0 && !vaVar.f13705b2) {
                    y9 y9Var3 = vaVar.C0;
                    if (y9Var3 != null && y9Var3.isDual()) {
                        vaVar.C0.toggleDual();
                    }
                    if (!vaVar.J0.f13878e && !vaVar.B0.j()) {
                        vaVar.B0.o(vaVar.A0);
                        vaVar.J0.setSelected(vaVar.A0);
                        vaVar.H0.a(new u(vaVar.A0, false), true);
                        vaVar.H0.setSelected(true);
                        y9 y9Var4 = vaVar.C0;
                        if (y9Var4 != null) {
                            y9Var4.recordHevc = !vaVar.B0.j();
                        }
                        g3 g3Var = vaVar.N0;
                        if (g3Var != null) {
                            g3Var.setMultipleOnClick(vaVar.B0.j());
                            vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                        }
                    }
                    vaVar.J0.a(!yVar.f13878e, true);
                    vaVar.l0(true);
                    return;
                }
                return;
            case 7:
                vaVar.B0.o(null);
                vaVar.B0.c();
                vaVar.J0.setSelected((t) null);
                y9 y9Var5 = vaVar.C0;
                if (y9Var5 != null) {
                    y9Var5.recordHevc = !vaVar.B0.j();
                }
                vaVar.J0.a(false, true);
                vaVar.l0(true);
                g3 g3Var2 = vaVar.N0;
                if (g3Var2 != null) {
                    g3Var2.setMultipleOnClick(vaVar.B0.j());
                    vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                vaVar.j0();
                return;
            case 9:
                y9 y9Var6 = vaVar.C0;
                if (y9Var6 != null && !vaVar.T1 && !vaVar.Q1 && y9Var6.isInited() && vaVar.f13720g0 == 0) {
                    vaVar.C0.switchCamera();
                    vaVar.P0.d(180.0f);
                    va.Z(vaVar.C0.isFrontface());
                    if (vaVar.p0()) {
                        vaVar.f13755s.c(null);
                        return;
                    } else {
                        vaVar.f13755s.d();
                        return;
                    }
                }
                return;
            case 10:
                vaVar.j0();
                return;
            case 11:
                f7 f7Var3 = vaVar.L1;
                if (f7Var3 != null) {
                    f7Var3.f12717f0 = true;
                    f7Var3.f12714e0 = vaVar.N1;
                    vaVar.W();
                    f7 f7Var4 = vaVar.L1;
                    if (f7Var4 != null && !f7Var4.f12706b0) {
                        org.telegram.messenger.g0.i3(new v8(vaVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (vaVar.f13761t2) {
                    vaVar.Y(true);
                    return;
                }
                return;
            case 13:
                vaVar.k0(-1, false, true);
                return;
            default:
                vaVar.k0(-1, false, true);
                return;
        }
    }
}
