package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;
public final class ia implements View.OnClickListener {
    public final int f5178a;
    public final kc f5179b;

    public ia(kc kcVar, int i10) {
        this.f5178a = i10;
        this.f5179b = kcVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        tr trVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f5178a;
        boolean z11 = false;
        kc kcVar = this.f5179b;
        switch (i13) {
            case 0:
                kc kcVar2 = this.f5179b;
                if (kcVar2.K1 != null && kcVar2.C2 == null && kcVar2.f5402i1 != null) {
                    ValueAnimator valueAnimator = kcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = kcVar2.K1.f5359y0;
                        Bitmap createBitmap = Bitmap.createBitmap(kcVar2.f5414n.getWidth(), kcVar2.f5414n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kcVar2.f5402i1.setAlpha(0.0f);
                        yb ybVar = kcVar2.X0;
                        if (ybVar != null) {
                            ybVar.f4748g0 = true;
                        }
                        mb mbVar = kcVar2.f5442v1;
                        if (mbVar != null) {
                            mbVar.I0 = true;
                        }
                        kcVar2.f5414n.draw(canvas);
                        yb ybVar2 = kcVar2.X0;
                        if (ybVar2 != null) {
                            ybVar2.f4748g0 = false;
                        }
                        mb mbVar2 = kcVar2.f5442v1;
                        if (mbVar2 != null) {
                            mbVar2.I0 = false;
                        }
                        kcVar2.f5402i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kcVar2.f5402i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        sb sbVar = new sb(kcVar2, kcVar2.f5376b, z12, canvas, (kcVar2.f5402i1.getMeasuredWidth() / 2.0f) + f7, (kcVar2.f5402i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        kcVar2.C2 = sbVar;
                        sbVar.setOnTouchListener(new bi.d(2));
                        kcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new tb(kcVar2, 0));
                        kcVar2.E2.addListener(new ib(kcVar2, 2));
                        kcVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = kcVar2.E2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = kcVar2.E2;
                        if (z12) {
                            trVar = tr.f31143i;
                        } else {
                            trVar = tr.h;
                        }
                        valueAnimator3.setInterpolator(trVar);
                        kcVar2.E2.start();
                        kcVar2.f5414n.addView(kcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ga(kcVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!kcVar.S1) {
                    kcVar.M();
                    return;
                }
                return;
            case 2:
                k8 k8Var = kcVar.K1;
                if (k8Var != null && !kcVar.S1) {
                    k8Var.Y = !k8Var.Y;
                    ArrayList arrayList = k8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((k8) obj).Y = kcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(kcVar.K1.f5358y);
                    k8 k8Var2 = kcVar.K1;
                    if (k8Var2.f5340o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (kcVar.f5395g0 == -1) {
                        e4 e4Var = kcVar.f5408k1;
                        if (k8Var2.Y) {
                            if (isEmpty && !z10) {
                                i11 = R.string.StorySoundMuted;
                            } else {
                                i11 = R.string.StoryOriginalSoundMuted;
                            }
                            string = LocaleController.getString(i11);
                        } else {
                            if (isEmpty && !z10) {
                                i10 = R.string.StorySoundNotMuted;
                            } else {
                                i10 = R.string.StoryOriginalSoundNotMuted;
                            }
                            string = LocaleController.getString(i10);
                        }
                        boolean z13 = kcVar.f5408k1.V;
                        if (e4Var.getMeasuredWidth() < 0) {
                            e4Var.G = string;
                        } else {
                            org.telegram.ui.Components.o6 o6Var = e4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            o6Var.q(string, z11, true);
                        }
                        kcVar.f5408k1.u();
                    }
                    kcVar.f0(kcVar.K1.Y, true);
                    kcVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = kcVar.X0.k();
                kcVar.X0.x(-9982, k10);
                ((sg0) kcVar.f5405j1.f5868c).a(!k10, true);
                return;
            case 4:
                if (kcVar.B0 != null && !kcVar.S1) {
                    String C = kcVar.C();
                    String F = kcVar.F();
                    if (C != null && !C.equals(F)) {
                        nb nbVar = kcVar.B0;
                        if (nbVar != null && nbVar.getCameraSession() != null) {
                            if (kcVar.B0.isFrontface() && !kcVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = kcVar.f5440u2.indexOf(F);
                                if (indexOf >= 0) {
                                    kcVar.f5437t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", kcVar.f5437t2).apply();
                                }
                            } else {
                                kcVar.B0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        kcVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nb nbVar2 = kcVar.B0;
                if (nbVar2 != null && kcVar.f5392f0 == 0) {
                    nbVar2.toggleDual();
                    kcVar.F0.setValue(kcVar.B0.isDual());
                    xc xcVar = kcVar.F0;
                    if (kcVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    xcVar.setContentDescription(LocaleController.getString(i12));
                    kcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (kcVar.f5412m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    kcVar.f5412m1.e(true);
                    return;
                }
                return;
            case 6:
                if (kcVar.f5392f0 == 0 && !kcVar.a2) {
                    nb nbVar3 = kcVar.B0;
                    if (nbVar3 != null && nbVar3.isDual()) {
                        kcVar.B0.toggleDual();
                    }
                    if (!kcVar.I0.f6326e && !kcVar.A0.j()) {
                        kcVar.A0.o(kcVar.f5456z0);
                        kcVar.I0.setSelected(kcVar.f5456z0);
                        kcVar.G0.a(new u(kcVar.f5456z0, false), true);
                        kcVar.G0.setSelected(true);
                        nb nbVar4 = kcVar.B0;
                        if (nbVar4 != null) {
                            nbVar4.recordHevc = !kcVar.A0.j();
                        }
                        jb jbVar = kcVar.M0;
                        if (jbVar != null) {
                            jbVar.setMultipleOnClick(kcVar.A0.j());
                            kcVar.M0.setMaxCount(Math.min(10, t.b() - kcVar.A0.getFilledCount()));
                        }
                    }
                    kcVar.I0.a(!yVar.f6326e, true);
                    kcVar.m0(true);
                    return;
                }
                return;
            case 7:
                kcVar.A0.o(null);
                kcVar.A0.e();
                kcVar.I0.setSelected((t) null);
                nb nbVar5 = kcVar.B0;
                if (nbVar5 != null) {
                    nbVar5.recordHevc = !kcVar.A0.j();
                }
                kcVar.I0.a(false, true);
                kcVar.m0(true);
                jb jbVar2 = kcVar.M0;
                if (jbVar2 != null) {
                    jbVar2.setMultipleOnClick(kcVar.A0.j());
                    kcVar.M0.setMaxCount(Math.min(10, t.b() - kcVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                kcVar.k0();
                return;
            case 9:
                nb nbVar6 = kcVar.B0;
                if (nbVar6 != null && !kcVar.S1 && !kcVar.P1 && nbVar6.isInited() && kcVar.f5392f0 == 0) {
                    kcVar.B0.switchCamera();
                    kcVar.O0.d(180.0f);
                    kc.a0(kcVar.B0.isFrontface());
                    if (kcVar.q0()) {
                        kcVar.f5431s.c(null);
                        return;
                    } else {
                        kcVar.f5431s.d();
                        return;
                    }
                }
                return;
            case 10:
                kcVar.k0();
                return;
            case 11:
                k8 k8Var3 = kcVar.K1;
                if (k8Var3 != null) {
                    k8Var3.f5324f0 = true;
                    k8Var3.f5321e0 = kcVar.M1;
                    kcVar.X();
                    k8 k8Var4 = kcVar.K1;
                    if (k8Var4 != null && !k8Var4.f5313b0) {
                        AndroidUtilities.runOnUIThread(new ga(kcVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (kcVar.f5434s2) {
                    kcVar.Z(true);
                    return;
                }
                return;
            case 13:
                kcVar.l0(-1, false, true);
                return;
            default:
                kcVar.l0(-1, false, true);
                return;
        }
    }
}
