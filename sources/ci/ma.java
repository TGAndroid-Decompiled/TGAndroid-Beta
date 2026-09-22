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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.qr;
public final class ma implements View.OnClickListener {
    public final int f5049a;
    public final oc f5050b;

    public ma(oc ocVar, int i10) {
        this.f5049a = i10;
        this.f5050b = ocVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        qr qrVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f5049a;
        boolean z11 = false;
        oc ocVar = this.f5050b;
        switch (i13) {
            case 0:
                oc ocVar2 = this.f5050b;
                if (ocVar2.K1 != null && ocVar2.C2 == null && ocVar2.f5229i1 != null) {
                    ValueAnimator valueAnimator = ocVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = ocVar2.K1.f5188y0;
                        Bitmap createBitmap = Bitmap.createBitmap(ocVar2.f5241n.getWidth(), ocVar2.f5241n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ocVar2.f5229i1.setAlpha(0.0f);
                        cc ccVar = ocVar2.X0;
                        if (ccVar != null) {
                            ccVar.f4511g0 = true;
                        }
                        qb qbVar = ocVar2.f5269v1;
                        if (qbVar != null) {
                            qbVar.I0 = true;
                        }
                        ocVar2.f5241n.draw(canvas);
                        cc ccVar2 = ocVar2.X0;
                        if (ccVar2 != null) {
                            ccVar2.f4511g0 = false;
                        }
                        qb qbVar2 = ocVar2.f5269v1;
                        if (qbVar2 != null) {
                            qbVar2.I0 = false;
                        }
                        ocVar2.f5229i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ocVar2.f5229i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wb wbVar = new wb(ocVar2, ocVar2.f5204b, z12, canvas, (ocVar2.f5229i1.getMeasuredWidth() / 2.0f) + f7, (ocVar2.f5229i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        ocVar2.C2 = wbVar;
                        wbVar.setOnTouchListener(new bi.d(2));
                        ocVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ocVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new xb(ocVar2, 0));
                        ocVar2.E2.addListener(new mb(ocVar2, 2));
                        ocVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = ocVar2.E2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = ocVar2.E2;
                        if (z12) {
                            qrVar = qr.f27422i;
                        } else {
                            qrVar = qr.h;
                        }
                        valueAnimator3.setInterpolator(qrVar);
                        ocVar2.E2.start();
                        ocVar2.f5241n.addView(ocVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ka(ocVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!ocVar.S1) {
                    ocVar.M();
                    return;
                }
                return;
            case 2:
                o8 o8Var = ocVar.K1;
                if (o8Var != null && !ocVar.S1) {
                    o8Var.Y = !o8Var.Y;
                    ArrayList arrayList = o8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((o8) obj).Y = ocVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(ocVar.K1.f5187y);
                    o8 o8Var2 = ocVar.K1;
                    if (o8Var2.f5169o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ocVar.f5222g0 == -1) {
                        f4 f4Var = ocVar.f5235k1;
                        if (o8Var2.Y) {
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
                        boolean z13 = ocVar.f5235k1.V;
                        if (f4Var.getMeasuredWidth() < 0) {
                            f4Var.G = string;
                        } else {
                            org.telegram.ui.Components.m6 m6Var = f4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            m6Var.q(string, z11, true);
                        }
                        ocVar.f5235k1.u();
                    }
                    ocVar.f0(ocVar.K1.Y, true);
                    ocVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = ocVar.X0.k();
                ocVar.X0.x(-9982, k10);
                ((fg0) ocVar.f5232j1.f5514c).a(!k10, true);
                return;
            case 4:
                if (ocVar.B0 != null && !ocVar.S1) {
                    String C = ocVar.C();
                    String F = ocVar.F();
                    if (C != null && !C.equals(F)) {
                        rb rbVar = ocVar.B0;
                        if (rbVar != null && rbVar.getCameraSession() != null) {
                            if (ocVar.B0.isFrontface() && !ocVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = ocVar.f5267u2.indexOf(F);
                                if (indexOf >= 0) {
                                    ocVar.f5264t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", ocVar.f5264t2).apply();
                                }
                            } else {
                                ocVar.B0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        ocVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rb rbVar2 = ocVar.B0;
                if (rbVar2 != null && ocVar.f5219f0 == 0) {
                    rbVar2.toggleDual();
                    ocVar.F0.setValue(ocVar.B0.isDual());
                    bd bdVar = ocVar.F0;
                    if (ocVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    bdVar.setContentDescription(LocaleController.getString(i12));
                    ocVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (ocVar.f5239m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    ocVar.f5239m1.e(true);
                    return;
                }
                return;
            case 6:
                if (ocVar.f5219f0 == 0 && !ocVar.a2) {
                    rb rbVar3 = ocVar.B0;
                    if (rbVar3 != null && rbVar3.isDual()) {
                        ocVar.B0.toggleDual();
                    }
                    if (!ocVar.I0.e && !ocVar.A0.j()) {
                        ocVar.A0.o(ocVar.f5283z0);
                        ocVar.I0.setSelected(ocVar.f5283z0);
                        ocVar.G0.a(new u(ocVar.f5283z0, false), true);
                        ocVar.G0.setSelected(true);
                        rb rbVar4 = ocVar.B0;
                        if (rbVar4 != null) {
                            rbVar4.recordHevc = !ocVar.A0.j();
                        }
                        nb nbVar = ocVar.M0;
                        if (nbVar != null) {
                            nbVar.setMultipleOnClick(ocVar.A0.j());
                            ocVar.M0.setMaxCount(Math.min(10, t.b() - ocVar.A0.getFilledCount()));
                        }
                    }
                    ocVar.I0.a(!yVar.e, true);
                    ocVar.m0(true);
                    return;
                }
                return;
            case 7:
                ocVar.A0.o(null);
                ocVar.A0.e();
                ocVar.I0.setSelected((t) null);
                rb rbVar5 = ocVar.B0;
                if (rbVar5 != null) {
                    rbVar5.recordHevc = !ocVar.A0.j();
                }
                ocVar.I0.a(false, true);
                ocVar.m0(true);
                nb nbVar2 = ocVar.M0;
                if (nbVar2 != null) {
                    nbVar2.setMultipleOnClick(ocVar.A0.j());
                    ocVar.M0.setMaxCount(Math.min(10, t.b() - ocVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                ocVar.k0();
                return;
            case 9:
                rb rbVar6 = ocVar.B0;
                if (rbVar6 != null && !ocVar.S1 && !ocVar.P1 && rbVar6.isInited() && ocVar.f5219f0 == 0) {
                    ocVar.B0.switchCamera();
                    ocVar.O0.d(180.0f);
                    oc.a0(ocVar.B0.isFrontface());
                    if (ocVar.q0()) {
                        ocVar.f5258s.c(null);
                        return;
                    } else {
                        ocVar.f5258s.d();
                        return;
                    }
                }
                return;
            case 10:
                ocVar.k0();
                return;
            case 11:
                o8 o8Var3 = ocVar.K1;
                if (o8Var3 != null) {
                    o8Var3.f5153f0 = true;
                    o8Var3.f5150e0 = ocVar.M1;
                    ocVar.X();
                    o8 o8Var4 = ocVar.K1;
                    if (o8Var4 != null && !o8Var4.f5143b0) {
                        AndroidUtilities.runOnUIThread(new ka(ocVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (ocVar.f5261s2) {
                    ocVar.Z(true);
                    return;
                }
                return;
            case 13:
                ocVar.l0(-1, false, true);
                return;
            default:
                ocVar.l0(-1, false, true);
                return;
        }
    }
}
