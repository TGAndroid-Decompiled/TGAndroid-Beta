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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ve0;
public final class o9 implements View.OnClickListener {
    public final int f15168a;
    public final nb f15169b;

    public o9(nb nbVar, int i7) {
        this.f15168a = i7;
        this.f15169b = nbVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        kr krVar;
        boolean z10;
        int i7;
        String N0;
        int i10;
        int i11;
        h0 h0Var;
        int i12 = this.f15168a;
        boolean z11 = false;
        nb nbVar = this.f15169b;
        switch (i12) {
            case 0:
                nb nbVar2 = this.f15169b;
                if (nbVar2.L1 != null && nbVar2.D2 == null && nbVar2.f15086j1 != null) {
                    ValueAnimator valueAnimator = nbVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = nbVar2.L1.f15783y0;
                        Bitmap createBitmap = Bitmap.createBitmap(nbVar2.f15095n.getWidth(), nbVar2.f15095n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        nbVar2.f15086j1.setAlpha(0.0f);
                        bb bbVar = nbVar2.Y0;
                        if (bbVar != null) {
                            bbVar.f14456h0 = true;
                        }
                        pa paVar = nbVar2.f15126w1;
                        if (paVar != null) {
                            paVar.f15588s0 = true;
                        }
                        nbVar2.f15095n.draw(canvas);
                        bb bbVar2 = nbVar2.Y0;
                        if (bbVar2 != null) {
                            bbVar2.f14456h0 = false;
                        }
                        pa paVar2 = nbVar2.f15126w1;
                        if (paVar2 != null) {
                            paVar2.f15588s0 = false;
                        }
                        nbVar2.f15086j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        nbVar2.f15086j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        va vaVar = new va(nbVar2, nbVar2.f15058b, z12, canvas, (nbVar2.f15086j1.getMeasuredWidth() / 2.0f) + f10, (nbVar2.f15086j1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24221n, paint, createBitmap, paint2, f10, f11);
                        nbVar2.D2 = vaVar;
                        vaVar.setOnTouchListener(new gi.a(2));
                        nbVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        nbVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new wa(nbVar2, 0));
                        nbVar2.F2.addListener(new na(nbVar2, 2));
                        nbVar2.F2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = nbVar2.F2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = nbVar2.F2;
                        if (z12) {
                            krVar = kr.f36860i;
                        } else {
                            krVar = kr.h;
                        }
                        valueAnimator3.setInterpolator(krVar);
                        nbVar2.F2.start();
                        nbVar2.f15095n.addView(nbVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new m9(nbVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!nbVar.T1) {
                    nbVar.L();
                    return;
                }
                return;
            case 2:
                x7 x7Var = nbVar.L1;
                if (x7Var != null && !nbVar.T1) {
                    x7Var.Y = !x7Var.Y;
                    ArrayList arrayList = x7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((x7) obj).Y = nbVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(nbVar.L1.f15782y);
                    x7 x7Var2 = nbVar.L1;
                    if (x7Var2.f15764o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (nbVar.f15079h0 == -1) {
                        u3 u3Var = nbVar.l1;
                        if (x7Var2.Y) {
                            if (isEmpty && !z10) {
                                i10 = 2131744216;
                            } else {
                                i10 = 2131744348;
                            }
                            N0 = gd.N0(i10, null);
                        } else {
                            if (isEmpty && !z10) {
                                i7 = 2131744215;
                            } else {
                                i7 = 2131744347;
                            }
                            N0 = gd.N0(i7, null);
                        }
                        boolean z13 = nbVar.l1.W;
                        if (u3Var.getMeasuredWidth() < 0) {
                            u3Var.H = N0;
                        } else {
                            org.telegram.ui.Components.m6 m6Var = u3Var.I;
                            if (!gd.f24314a0 && z13) {
                                z11 = true;
                            }
                            m6Var.t(N0, z11, true);
                        }
                        nbVar.l1.x();
                    }
                    nbVar.e0(nbVar.L1.Y, true);
                    nbVar.Y0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = nbVar.Y0.k();
                nbVar.Y0.x(-9982, k10);
                ((ve0) nbVar.f15089k1.f15678c).a(!k10, true);
                return;
            case 4:
                if (nbVar.C0 != null && !nbVar.T1) {
                    String B = nbVar.B();
                    String E = nbVar.E();
                    if (B != null && !B.equals(E)) {
                        qa qaVar = nbVar.C0;
                        if (qaVar != null && qaVar.getCameraSession() != null) {
                            if (nbVar.C0.isFrontface() && !nbVar.C0.getCameraSession().hasFlashModes()) {
                                int indexOf = nbVar.f15123v2.indexOf(E);
                                if (indexOf >= 0) {
                                    nbVar.f15120u2 = indexOf;
                                    mp.g1().edit().putInt("frontflash", nbVar.f15120u2).apply();
                                }
                            } else {
                                nbVar.C0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        nbVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                qa qaVar2 = nbVar.C0;
                if (qaVar2 != null && nbVar.f15076g0 == 0) {
                    qaVar2.toggleDual();
                    nbVar.G0.setValue(nbVar.C0.isDual());
                    zb zbVar = nbVar.G0;
                    if (nbVar.C0.isDual()) {
                        i11 = 2131754886;
                    } else {
                        i11 = 2131754887;
                    }
                    zbVar.setContentDescription(gd.N0(i11, null));
                    nbVar.f15093m1.f(true);
                    mp.g1().edit().putInt("storydualhint", 2).apply();
                    if (nbVar.n1.W) {
                        mp.g1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    nbVar.n1.f(true);
                    return;
                }
                return;
            case 6:
                if (nbVar.f15076g0 == 0 && !nbVar.f15061b2) {
                    qa qaVar3 = nbVar.C0;
                    if (qaVar3 != null && qaVar3.isDual()) {
                        nbVar.C0.toggleDual();
                    }
                    if (!nbVar.J0.f14570e && !nbVar.B0.j()) {
                        nbVar.B0.o(nbVar.A0);
                        nbVar.J0.setSelected(nbVar.A0);
                        nbVar.H0.a(new d0(nbVar.A0, false), true);
                        nbVar.H0.setSelected(true);
                        qa qaVar4 = nbVar.C0;
                        if (qaVar4 != null) {
                            qaVar4.recordHevc = !nbVar.B0.j();
                        }
                        p3 p3Var = nbVar.N0;
                        if (p3Var != null) {
                            p3Var.setMultipleOnClick(nbVar.B0.j());
                            nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                        }
                    }
                    nbVar.J0.a(!h0Var.f14570e, true);
                    nbVar.l0(true);
                    return;
                }
                return;
            case 7:
                nbVar.B0.o(null);
                nbVar.B0.c();
                nbVar.J0.setSelected((c0) null);
                qa qaVar5 = nbVar.C0;
                if (qaVar5 != null) {
                    qaVar5.recordHevc = !nbVar.B0.j();
                }
                nbVar.J0.a(false, true);
                nbVar.l0(true);
                p3 p3Var2 = nbVar.N0;
                if (p3Var2 != null) {
                    p3Var2.setMultipleOnClick(nbVar.B0.j());
                    nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                nbVar.j0();
                return;
            case 9:
                qa qaVar6 = nbVar.C0;
                if (qaVar6 != null && !nbVar.T1 && !nbVar.Q1 && qaVar6.isInited() && nbVar.f15076g0 == 0) {
                    nbVar.C0.switchCamera();
                    nbVar.P0.d(180.0f);
                    nb.Z(nbVar.C0.isFrontface());
                    if (nbVar.p0()) {
                        nbVar.f15111s.c(null);
                        return;
                    } else {
                        nbVar.f15111s.d();
                        return;
                    }
                }
                return;
            case 10:
                nbVar.j0();
                return;
            case 11:
                x7 x7Var3 = nbVar.L1;
                if (x7Var3 != null) {
                    x7Var3.f15748f0 = true;
                    x7Var3.f15745e0 = nbVar.N1;
                    nbVar.W();
                    x7 x7Var4 = nbVar.L1;
                    if (x7Var4 != null && !x7Var4.f15737b0) {
                        org.telegram.messenger.g0.h3(new m9(nbVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (nbVar.f15117t2) {
                    nbVar.Y(true);
                    return;
                }
                return;
            case 13:
                nbVar.k0(-1, false, true);
                return;
            default:
                nbVar.k0(-1, false, true);
                return;
        }
    }
}
