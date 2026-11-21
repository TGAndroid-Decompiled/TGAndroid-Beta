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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.we0;
public final class t8 implements View.OnClickListener {
    public final int f15513a;
    public final sa f15514b;

    public t8(sa saVar, int i7) {
        this.f15513a = i7;
        this.f15514b = saVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        nr nrVar;
        boolean z10;
        int i7;
        String N0;
        int i10;
        int i11;
        a0 a0Var;
        int i12 = this.f15513a;
        boolean z11 = false;
        sa saVar = this.f15514b;
        switch (i12) {
            case 0:
                sa saVar2 = this.f15514b;
                if (saVar2.L1 != null && saVar2.D2 == null && saVar2.f15413j1 != null) {
                    ValueAnimator valueAnimator = saVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = saVar2.L1.f14385y0;
                        Bitmap createBitmap = Bitmap.createBitmap(saVar2.f15422n.getWidth(), saVar2.f15422n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        saVar2.f15413j1.setAlpha(0.0f);
                        ga gaVar = saVar2.Y0;
                        if (gaVar != null) {
                            gaVar.f15628h0 = true;
                        }
                        u9 u9Var = saVar2.f15453w1;
                        if (u9Var != null) {
                            u9Var.f14899s0 = true;
                        }
                        saVar2.f15422n.draw(canvas);
                        ga gaVar2 = saVar2.Y0;
                        if (gaVar2 != null) {
                            gaVar2.f15628h0 = false;
                        }
                        u9 u9Var2 = saVar2.f15453w1;
                        if (u9Var2 != null) {
                            u9Var2.f14899s0 = false;
                        }
                        saVar2.f15413j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        saVar2.f15413j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        aa aaVar = new aa(saVar2, saVar2.f15385b, z12, canvas, (saVar2.f15413j1.getMeasuredWidth() / 2.0f) + f10, (saVar2.f15413j1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24141n, paint, createBitmap, paint2, f10, f11);
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
                            nrVar = nr.f37958i;
                        } else {
                            nrVar = nr.h;
                        }
                        valueAnimator3.setInterpolator(nrVar);
                        saVar2.F2.start();
                        saVar2.f15422n.addView(saVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new r8(saVar2, 4));
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
                c7 c7Var = saVar.L1;
                if (c7Var != null && !saVar.T1) {
                    c7Var.Y = !c7Var.Y;
                    ArrayList arrayList = c7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((c7) obj).Y = saVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(saVar.L1.f14384y);
                    c7 c7Var2 = saVar.L1;
                    if (c7Var2.f14366o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (saVar.f15406h0 == -1) {
                        l3 l3Var = saVar.l1;
                        if (c7Var2.Y) {
                            if (isEmpty && !z10) {
                                i10 = 2131744219;
                            } else {
                                i10 = 2131744351;
                            }
                            N0 = gd.N0(i10, null);
                        } else {
                            if (isEmpty && !z10) {
                                i7 = 2131744218;
                            } else {
                                i7 = 2131744350;
                            }
                            N0 = gd.N0(i7, null);
                        }
                        boolean z13 = saVar.l1.W;
                        if (l3Var.getMeasuredWidth() < 0) {
                            l3Var.H = N0;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = l3Var.I;
                            if (!gd.f24241a0 && z13) {
                                z11 = true;
                            }
                            n6Var.t(N0, z11, true);
                        }
                        saVar.l1.x();
                    }
                    saVar.e0(saVar.L1.Y, true);
                    saVar.Y0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = saVar.Y0.k();
                saVar.Y0.x(-9982, k10);
                ((we0) saVar.f15416k1.f15003c).a(!k10, true);
                return;
            case 4:
                if (saVar.C0 != null && !saVar.T1) {
                    String B = saVar.B();
                    String E = saVar.E();
                    if (B != null && !B.equals(E)) {
                        v9 v9Var = saVar.C0;
                        if (v9Var != null && v9Var.getCameraSession() != null) {
                            if (saVar.C0.isFrontface() && !saVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = saVar.f15450v2.indexOf(E);
                                if (indexOf >= 0) {
                                    saVar.f15447u2 = indexOf;
                                    mp.g1().edit().putInt("frontflash", saVar.f15447u2).apply();
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
                if (v9Var2 != null && saVar.f15403g0 == 0) {
                    v9Var2.toggleDual();
                    saVar.G0.setValue(saVar.C0.isDual());
                    eb ebVar = saVar.G0;
                    if (saVar.C0.isDual()) {
                        i11 = 2131754886;
                    } else {
                        i11 = 2131754887;
                    }
                    ebVar.setContentDescription(gd.N0(i11, null));
                    saVar.f15420m1.f(true);
                    mp.g1().edit().putInt("storydualhint", 2).apply();
                    if (saVar.n1.W) {
                        mp.g1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    saVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (saVar.f15403g0 == 0 && !saVar.f15388b2) {
                    v9 v9Var3 = saVar.C0;
                    if (v9Var3 != null && v9Var3.isDual()) {
                        saVar.C0.toggleDual();
                    }
                    if (!saVar.J0.f14205e && !saVar.B0.j()) {
                        saVar.B0.o(saVar.A0);
                        saVar.J0.setSelected(saVar.A0);
                        saVar.H0.a(new w(saVar.A0, false), true);
                        saVar.H0.setSelected(true);
                        v9 v9Var4 = saVar.C0;
                        if (v9Var4 != null) {
                            v9Var4.recordHevc = !saVar.B0.j();
                        }
                        g3 g3Var = saVar.N0;
                        if (g3Var != null) {
                            g3Var.setMultipleOnClick(saVar.B0.j());
                            saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                        }
                    }
                    saVar.J0.a(!a0Var.f14205e, true);
                    saVar.l0(true);
                    return;
                }
                return;
            case 7:
                saVar.B0.o(null);
                saVar.B0.c();
                saVar.J0.setSelected((v) null);
                v9 v9Var5 = saVar.C0;
                if (v9Var5 != null) {
                    v9Var5.recordHevc = !saVar.B0.j();
                }
                saVar.J0.a(false, true);
                saVar.l0(true);
                g3 g3Var2 = saVar.N0;
                if (g3Var2 != null) {
                    g3Var2.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                saVar.j0();
                return;
            case 9:
                v9 v9Var6 = saVar.C0;
                if (v9Var6 != null && !saVar.T1 && !saVar.Q1 && v9Var6.isInited() && saVar.f15403g0 == 0) {
                    saVar.C0.switchCamera();
                    saVar.P0.d(180.0f);
                    sa.Z(saVar.C0.isFrontface());
                    if (saVar.p0()) {
                        saVar.f15438s.c(null);
                        return;
                    } else {
                        saVar.f15438s.d();
                        return;
                    }
                }
                return;
            case 10:
                saVar.j0();
                return;
            case 11:
                c7 c7Var3 = saVar.L1;
                if (c7Var3 != null) {
                    c7Var3.f14350f0 = true;
                    c7Var3.f14347e0 = saVar.N1;
                    saVar.W();
                    c7 c7Var4 = saVar.L1;
                    if (c7Var4 != null && !c7Var4.f14339b0) {
                        org.telegram.messenger.g0.h3(new r8(saVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (saVar.f15444t2) {
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
