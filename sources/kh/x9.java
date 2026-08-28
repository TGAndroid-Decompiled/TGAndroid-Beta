package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qf0;
public final class x9 implements View.OnClickListener {
    public final int f16383a;
    public final wb f16384b;

    public x9(wb wbVar, int i9) {
        this.f16383a = i9;
        this.f16384b = wbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        gr grVar;
        boolean z10;
        int i9;
        String string;
        int i10;
        int i11;
        z zVar;
        int i12 = this.f16383a;
        boolean z11 = false;
        wb wbVar = this.f16384b;
        switch (i12) {
            case 0:
                wb wbVar2 = this.f16384b;
                if (wbVar2.G1 != null && wbVar2.f16328y2 == null && wbVar2.f16262e1 != null) {
                    ValueAnimator valueAnimator = wbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = wbVar2.G1.f14951y0;
                        Bitmap createBitmap = Bitmap.createBitmap(wbVar2.f16287n.getWidth(), wbVar2.f16287n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wbVar2.f16262e1.setAlpha(0.0f);
                        kb kbVar = wbVar2.T0;
                        if (kbVar != null) {
                            kbVar.f15934c0 = true;
                        }
                        ya yaVar = wbVar2.f16302r1;
                        if (yaVar != null) {
                            yaVar.E0 = true;
                        }
                        wbVar2.f16287n.draw(canvas);
                        kb kbVar2 = wbVar2.T0;
                        if (kbVar2 != null) {
                            kbVar2.f15934c0 = false;
                        }
                        ya yaVar2 = wbVar2.f16302r1;
                        if (yaVar2 != null) {
                            yaVar2.E0 = false;
                        }
                        wbVar2.f16262e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wbVar2.f16262e1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        eb ebVar = new eb(wbVar2, wbVar2.f16249b, z12, canvas, (wbVar2.f16262e1.getMeasuredWidth() / 2.0f) + f10, (wbVar2.f16262e1.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 0);
                        wbVar2.f16328y2 = ebVar;
                        ebVar.setOnTouchListener(new jh.d(2));
                        wbVar2.f16331z2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wbVar2.A2 = ofFloat;
                        ofFloat.addUpdateListener(new fb(wbVar2, 0));
                        wbVar2.A2.addListener(new ua(wbVar2, 2));
                        wbVar2.A2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = wbVar2.A2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = wbVar2.A2;
                        if (z12) {
                            grVar = gr.f28846i;
                        } else {
                            grVar = gr.h;
                        }
                        valueAnimator3.setInterpolator(grVar);
                        wbVar2.A2.start();
                        wbVar2.f16287n.addView(wbVar2.f16328y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new v9(wbVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!wbVar.O1) {
                    wbVar.M();
                    return;
                }
                return;
            case 2:
                a8 a8Var = wbVar.G1;
                if (a8Var != null && !wbVar.O1) {
                    a8Var.Y = !a8Var.Y;
                    ArrayList arrayList = a8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            ((a8) obj).Y = wbVar.G1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(wbVar.G1.f14950y);
                    a8 a8Var2 = wbVar.G1;
                    if (a8Var2.f14932o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (wbVar.f16254c0 == -1) {
                        x3 x3Var = wbVar.f16269g1;
                        if (a8Var2.Y) {
                            if (isEmpty && !z10) {
                                i10 = R.string.StorySoundMuted;
                            } else {
                                i10 = R.string.StoryOriginalSoundMuted;
                            }
                            string = LocaleController.getString(i10);
                        } else {
                            if (isEmpty && !z10) {
                                i9 = R.string.StorySoundNotMuted;
                            } else {
                                i9 = R.string.StoryOriginalSoundNotMuted;
                            }
                            string = LocaleController.getString(i9);
                        }
                        boolean z13 = wbVar.f16269g1.R;
                        if (x3Var.getMeasuredWidth() < 0) {
                            x3Var.C = string;
                        } else {
                            org.telegram.ui.Components.i6 i6Var = x3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            i6Var.q(string, z11, true);
                        }
                        wbVar.f16269g1.v();
                    }
                    wbVar.f0(wbVar.G1.Y, true);
                    wbVar.T0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = wbVar.T0.k();
                wbVar.T0.x(-9982, k10);
                ((qf0) wbVar.f16266f1.f15398c).a(!k10, true);
                return;
            case 4:
                if (wbVar.f16322x0 != null && !wbVar.O1) {
                    String C = wbVar.C();
                    String F = wbVar.F();
                    if (C != null && !C.equals(F)) {
                        za zaVar = wbVar.f16322x0;
                        if (zaVar != null && zaVar.getCameraSession() != null) {
                            if (wbVar.f16322x0.isFrontface() && !wbVar.f16322x0.getCameraSession().hasFlashModes()) {
                                int indexOf = wbVar.f16299q2.indexOf(F);
                                if (indexOf >= 0) {
                                    wbVar.f16296p2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", wbVar.f16296p2).apply();
                                }
                            } else {
                                wbVar.f16322x0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        wbVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                za zaVar2 = wbVar.f16322x0;
                if (zaVar2 != null && wbVar.f16250b0 == 0) {
                    zaVar2.toggleDual();
                    wbVar.B0.setValue(wbVar.f16322x0.isDual());
                    ic icVar = wbVar.B0;
                    if (wbVar.f16322x0.isDual()) {
                        i11 = R.string.AccDescrDualCameraOn;
                    } else {
                        i11 = R.string.AccDescrDualCameraOff;
                    }
                    icVar.setContentDescription(LocaleController.getString(i11));
                    wbVar.f16272h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (wbVar.f16275i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    wbVar.f16275i1.e(true);
                    return;
                }
                return;
            case 6:
                if (wbVar.f16250b0 == 0 && !wbVar.W1) {
                    za zaVar3 = wbVar.f16322x0;
                    if (zaVar3 != null && zaVar3.isDual()) {
                        wbVar.f16322x0.toggleDual();
                    }
                    if (!wbVar.E0.f16418e && !wbVar.f16318w0.j()) {
                        wbVar.f16318w0.o(wbVar.f16314v0);
                        wbVar.E0.setSelected(wbVar.f16314v0);
                        wbVar.C0.a(new v(wbVar.f16314v0, false), true);
                        wbVar.C0.setSelected(true);
                        za zaVar4 = wbVar.f16322x0;
                        if (zaVar4 != null) {
                            zaVar4.recordHevc = !wbVar.f16318w0.j();
                        }
                        va vaVar = wbVar.I0;
                        if (vaVar != null) {
                            vaVar.setMultipleOnClick(wbVar.f16318w0.j());
                            wbVar.I0.setMaxCount(Math.min(10, u.b() - wbVar.f16318w0.getFilledCount()));
                        }
                    }
                    wbVar.E0.a(!zVar.f16418e, true);
                    wbVar.m0(true);
                    return;
                }
                return;
            case 7:
                wbVar.f16318w0.o(null);
                wbVar.f16318w0.e();
                wbVar.E0.setSelected((u) null);
                za zaVar5 = wbVar.f16322x0;
                if (zaVar5 != null) {
                    zaVar5.recordHevc = !wbVar.f16318w0.j();
                }
                wbVar.E0.a(false, true);
                wbVar.m0(true);
                va vaVar2 = wbVar.I0;
                if (vaVar2 != null) {
                    vaVar2.setMultipleOnClick(wbVar.f16318w0.j());
                    wbVar.I0.setMaxCount(Math.min(10, u.b() - wbVar.f16318w0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                wbVar.k0();
                return;
            case 9:
                za zaVar6 = wbVar.f16322x0;
                if (zaVar6 != null && !wbVar.O1 && !wbVar.L1 && zaVar6.isInited() && wbVar.f16250b0 == 0) {
                    wbVar.f16322x0.switchCamera();
                    wbVar.K0.d(180.0f);
                    wb.a0(wbVar.f16322x0.isFrontface());
                    if (wbVar.q0()) {
                        wbVar.f16304s.c(null);
                        return;
                    } else {
                        wbVar.f16304s.d();
                        return;
                    }
                }
                return;
            case 10:
                wbVar.k0();
                return;
            case 11:
                a8 a8Var3 = wbVar.G1;
                if (a8Var3 != null) {
                    a8Var3.f14916f0 = true;
                    a8Var3.f14913e0 = wbVar.I1;
                    wbVar.X();
                    a8 a8Var4 = wbVar.G1;
                    if (a8Var4 != null && !a8Var4.f14905b0) {
                        AndroidUtilities.runOnUIThread(new v9(wbVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (wbVar.f16293o2) {
                    wbVar.Z(true);
                    return;
                }
                return;
            case 13:
                wbVar.l0(-1, false, true);
                return;
            default:
                wbVar.l0(-1, false, true);
                return;
        }
    }
}
