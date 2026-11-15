package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ke0;
public final class u8 implements View.OnClickListener {
    public final int f15197a;
    public final sa f15198b;

    public u8(sa saVar, int i7) {
        this.f15197a = i7;
        this.f15198b = saVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        er erVar;
        boolean z10;
        int i7;
        String M0;
        int i10;
        int i11;
        y yVar;
        int i12 = this.f15197a;
        boolean z11 = false;
        sa saVar = this.f15198b;
        switch (i12) {
            case 0:
                sa saVar2 = this.f15198b;
                if (saVar2.L1 != null && saVar2.D2 == null && saVar2.f15067j1 != null) {
                    ValueAnimator valueAnimator = saVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = saVar2.L1.f14173y0;
                        Bitmap createBitmap = Bitmap.createBitmap(saVar2.f15076n.getWidth(), saVar2.f15076n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        saVar2.f15067j1.setAlpha(0.0f);
                        ga gaVar = saVar2.Y0;
                        if (gaVar != null) {
                            gaVar.f15350h0 = true;
                        }
                        u9 u9Var = saVar2.f15107w1;
                        if (u9Var != null) {
                            u9Var.f14688s0 = true;
                        }
                        saVar2.f15076n.draw(canvas);
                        ga gaVar2 = saVar2.Y0;
                        if (gaVar2 != null) {
                            gaVar2.f15350h0 = false;
                        }
                        u9 u9Var2 = saVar2.f15107w1;
                        if (u9Var2 != null) {
                            u9Var2.f14688s0 = false;
                        }
                        saVar2.f15067j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        saVar2.f15067j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        aa aaVar = new aa(saVar2, saVar2.f15039b, z12, canvas, (saVar2.f15067j1.getMeasuredWidth() / 2.0f) + f10, (saVar2.f15067j1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23606n, paint, createBitmap, paint2, f10, f11);
                        saVar2.D2 = aaVar;
                        aaVar.setOnTouchListener(new gi.a(2));
                        saVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        saVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new ba(saVar2, 0));
                        saVar2.F2.addListener(new s9(saVar2, 2));
                        saVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = saVar2.F2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = saVar2.F2;
                        if (z12) {
                            erVar = er.f34421i;
                        } else {
                            erVar = er.h;
                        }
                        valueAnimator3.setInterpolator(erVar);
                        saVar2.F2.start();
                        saVar2.f15076n.addView(saVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new s8(saVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!saVar.T1) {
                    saVar.L();
                    return;
                }
                return;
            case 2:
                d7 d7Var = saVar.L1;
                if (d7Var != null && !saVar.T1) {
                    d7Var.Y = !d7Var.Y;
                    ArrayList arrayList = d7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((d7) obj).Y = saVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(saVar.L1.f14172y);
                    d7 d7Var2 = saVar.L1;
                    if (d7Var2.f14154o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (saVar.f15060h0 == -1) {
                        l3 l3Var = saVar.l1;
                        if (d7Var2.Y) {
                            if (isEmpty && !z10) {
                                i10 = 2131744460;
                            } else {
                                i10 = 2131744592;
                            }
                            M0 = hd.M0(i10, null);
                        } else {
                            if (isEmpty && !z10) {
                                i7 = 2131744459;
                            } else {
                                i7 = 2131744591;
                            }
                            M0 = hd.M0(i7, null);
                        }
                        boolean z13 = saVar.l1.W;
                        if (l3Var.getMeasuredWidth() < 0) {
                            l3Var.H = M0;
                        } else {
                            org.telegram.ui.Components.g6 g6Var = l3Var.I;
                            if (!hd.f24104a0 && z13) {
                                z11 = true;
                            }
                            g6Var.t(M0, z11, true);
                        }
                        saVar.l1.w();
                    }
                    saVar.e0(saVar.L1.Y, true);
                    saVar.Y0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = saVar.Y0.k();
                saVar.Y0.x(-9982, k10);
                ((ke0) saVar.f15070k1.f14762c).a(!k10, true);
                return;
            case 4:
                if (saVar.C0 != null && !saVar.T1) {
                    String B = saVar.B();
                    String E = saVar.E();
                    if (B != null && !B.equals(E)) {
                        v9 v9Var = saVar.C0;
                        if (v9Var != null && v9Var.getCameraSession() != null) {
                            if (saVar.C0.isFrontface() && !saVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = saVar.f15104v2.indexOf(E);
                                if (indexOf >= 0) {
                                    saVar.f15101u2 = indexOf;
                                    np.e1().edit().putInt("frontflash", saVar.f15101u2).apply();
                                }
                            } else {
                                saVar.C0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        saVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                v9 v9Var2 = saVar.C0;
                if (v9Var2 != null && saVar.f15057g0 == 0) {
                    v9Var2.toggleDual();
                    saVar.G0.setValue(saVar.C0.isDual());
                    eb ebVar = saVar.G0;
                    if (saVar.C0.isDual()) {
                        i11 = 2131754886;
                    } else {
                        i11 = 2131754887;
                    }
                    ebVar.setContentDescription(hd.M0(i11, null));
                    saVar.f15074m1.f(true);
                    np.e1().edit().putInt("storydualhint", 2).apply();
                    if (saVar.n1.W) {
                        np.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    saVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (saVar.f15057g0 == 0 && !saVar.f15042b2) {
                    v9 v9Var3 = saVar.C0;
                    if (v9Var3 != null && v9Var3.isDual()) {
                        saVar.C0.toggleDual();
                    }
                    if (!saVar.J0.f15403e && !saVar.B0.j()) {
                        saVar.B0.o(saVar.A0);
                        saVar.J0.setSelected(saVar.A0);
                        saVar.H0.a(new u(saVar.A0, false), true);
                        saVar.H0.setSelected(true);
                        v9 v9Var4 = saVar.C0;
                        if (v9Var4 != null) {
                            v9Var4.recordHevc = !saVar.B0.j();
                        }
                        g3 g3Var = saVar.N0;
                        if (g3Var != null) {
                            g3Var.setMultipleOnClick(saVar.B0.j());
                            saVar.N0.setMaxCount(Math.min(10, t.b() - saVar.B0.getFilledCount()));
                        }
                    }
                    saVar.J0.a(!yVar.f15403e, true);
                    saVar.l0(true);
                    return;
                }
                return;
            case 7:
                saVar.B0.o(null);
                saVar.B0.c();
                saVar.J0.setSelected((t) null);
                v9 v9Var5 = saVar.C0;
                if (v9Var5 != null) {
                    v9Var5.recordHevc = !saVar.B0.j();
                }
                saVar.J0.a(false, true);
                saVar.l0(true);
                g3 g3Var2 = saVar.N0;
                if (g3Var2 != null) {
                    g3Var2.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, t.b() - saVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                saVar.j0();
                return;
            case 9:
                v9 v9Var6 = saVar.C0;
                if (v9Var6 != null && !saVar.T1 && !saVar.Q1 && v9Var6.isInited() && saVar.f15057g0 == 0) {
                    saVar.C0.switchCamera();
                    saVar.P0.d(180.0f);
                    sa.Z(saVar.C0.isFrontface());
                    if (saVar.p0()) {
                        saVar.f15092s.c(null);
                        return;
                    } else {
                        saVar.f15092s.d();
                        return;
                    }
                }
                return;
            case 10:
                saVar.j0();
                return;
            case 11:
                d7 d7Var3 = saVar.L1;
                if (d7Var3 != null) {
                    d7Var3.f14138f0 = true;
                    d7Var3.f14135e0 = saVar.N1;
                    saVar.W();
                    d7 d7Var4 = saVar.L1;
                    if (d7Var4 != null && !d7Var4.f14127b0) {
                        org.telegram.messenger.g0.i3(new s8(saVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (saVar.f15098t2) {
                    saVar.Y(true);
                    return;
                }
                return;
            case 13:
                saVar.k0(-1, false, true);
                return;
            default:
                saVar.k0(-1, false, true);
                return;
        }
    }
}
