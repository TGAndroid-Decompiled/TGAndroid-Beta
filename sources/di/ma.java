package di;

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
import org.telegram.ui.Components.pr;
public final class ma implements View.OnClickListener {
    public final int f7660a;
    public final pc f7661b;

    public ma(pc pcVar, int i10) {
        this.f7660a = i10;
        this.f7661b = pcVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        pr prVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f7660a;
        boolean z11 = false;
        pc pcVar = this.f7661b;
        switch (i13) {
            case 0:
                pc pcVar2 = this.f7661b;
                if (pcVar2.K1 != null && pcVar2.C2 == null && pcVar2.f7870i1 != null) {
                    ValueAnimator valueAnimator = pcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = pcVar2.K1.f7790y0;
                        Bitmap createBitmap = Bitmap.createBitmap(pcVar2.f7882n.getWidth(), pcVar2.f7882n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        pcVar2.f7870i1.setAlpha(0.0f);
                        dc dcVar = pcVar2.X0;
                        if (dcVar != null) {
                            dcVar.f7079g0 = true;
                        }
                        rb rbVar = pcVar2.f7910v1;
                        if (rbVar != null) {
                            rbVar.I0 = true;
                        }
                        pcVar2.f7882n.draw(canvas);
                        dc dcVar2 = pcVar2.X0;
                        if (dcVar2 != null) {
                            dcVar2.f7079g0 = false;
                        }
                        rb rbVar2 = pcVar2.f7910v1;
                        if (rbVar2 != null) {
                            rbVar2.I0 = false;
                        }
                        pcVar2.f7870i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        pcVar2.f7870i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xb xbVar = new xb(pcVar2, pcVar2.f7844b, z12, canvas, (pcVar2.f7870i1.getMeasuredWidth() / 2.0f) + f7, (pcVar2.f7870i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        pcVar2.C2 = xbVar;
                        xbVar.setOnTouchListener(new ci.d(2));
                        pcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        pcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new yb(pcVar2, 0));
                        pcVar2.E2.addListener(new mb(pcVar2, 2));
                        pcVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = pcVar2.E2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = pcVar2.E2;
                        if (z12) {
                            prVar = pr.f29468i;
                        } else {
                            prVar = pr.h;
                        }
                        valueAnimator3.setInterpolator(prVar);
                        pcVar2.E2.start();
                        pcVar2.f7882n.addView(pcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ka(pcVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!pcVar.S1) {
                    pcVar.M();
                    return;
                }
                return;
            case 2:
                o8 o8Var = pcVar.K1;
                if (o8Var != null && !pcVar.S1) {
                    o8Var.Y = !o8Var.Y;
                    ArrayList arrayList = o8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((o8) obj).Y = pcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(pcVar.K1.f7789y);
                    o8 o8Var2 = pcVar.K1;
                    if (o8Var2.f7771o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pcVar.f7863g0 == -1) {
                        f4 f4Var = pcVar.f7876k1;
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
                        boolean z13 = pcVar.f7876k1.V;
                        if (f4Var.getMeasuredWidth() < 0) {
                            f4Var.G = string;
                        } else {
                            org.telegram.ui.Components.p6 p6Var = f4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            p6Var.q(string, z11, true);
                        }
                        pcVar.f7876k1.u();
                    }
                    pcVar.f0(pcVar.K1.Y, true);
                    pcVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = pcVar.X0.k();
                pcVar.X0.x(-9982, k10);
                ((fg0) pcVar.f7873j1.f8069c).a(!k10, true);
                return;
            case 4:
                if (pcVar.B0 != null && !pcVar.S1) {
                    String C = pcVar.C();
                    String F = pcVar.F();
                    if (C != null && !C.equals(F)) {
                        sb sbVar = pcVar.B0;
                        if (sbVar != null && sbVar.getCameraSession() != null) {
                            if (pcVar.B0.isFrontface() && !pcVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = pcVar.f7908u2.indexOf(F);
                                if (indexOf >= 0) {
                                    pcVar.f7905t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", pcVar.f7905t2).apply();
                                }
                            } else {
                                pcVar.B0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        pcVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sb sbVar2 = pcVar.B0;
                if (sbVar2 != null && pcVar.f7860f0 == 0) {
                    sbVar2.toggleDual();
                    pcVar.F0.setValue(pcVar.B0.isDual());
                    bd bdVar = pcVar.F0;
                    if (pcVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    bdVar.setContentDescription(LocaleController.getString(i12));
                    pcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (pcVar.f7880m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    pcVar.f7880m1.e(true);
                    return;
                }
                return;
            case 6:
                if (pcVar.f7860f0 == 0 && !pcVar.a2) {
                    sb sbVar3 = pcVar.B0;
                    if (sbVar3 != null && sbVar3.isDual()) {
                        pcVar.B0.toggleDual();
                    }
                    if (!pcVar.I0.f8443e && !pcVar.A0.j()) {
                        pcVar.A0.o(pcVar.f7924z0);
                        pcVar.I0.setSelected(pcVar.f7924z0);
                        pcVar.G0.a(new u(pcVar.f7924z0, false), true);
                        pcVar.G0.setSelected(true);
                        sb sbVar4 = pcVar.B0;
                        if (sbVar4 != null) {
                            sbVar4.recordHevc = !pcVar.A0.j();
                        }
                        ob obVar = pcVar.M0;
                        if (obVar != null) {
                            obVar.setMultipleOnClick(pcVar.A0.j());
                            pcVar.M0.setMaxCount(Math.min(10, t.b() - pcVar.A0.getFilledCount()));
                        }
                    }
                    pcVar.I0.a(!yVar.f8443e, true);
                    pcVar.m0(true);
                    return;
                }
                return;
            case 7:
                pcVar.A0.o(null);
                pcVar.A0.e();
                pcVar.I0.setSelected((t) null);
                sb sbVar5 = pcVar.B0;
                if (sbVar5 != null) {
                    sbVar5.recordHevc = !pcVar.A0.j();
                }
                pcVar.I0.a(false, true);
                pcVar.m0(true);
                ob obVar2 = pcVar.M0;
                if (obVar2 != null) {
                    obVar2.setMultipleOnClick(pcVar.A0.j());
                    pcVar.M0.setMaxCount(Math.min(10, t.b() - pcVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                pcVar.k0();
                return;
            case 9:
                sb sbVar6 = pcVar.B0;
                if (sbVar6 != null && !pcVar.S1 && !pcVar.P1 && sbVar6.isInited() && pcVar.f7860f0 == 0) {
                    pcVar.B0.switchCamera();
                    pcVar.O0.d(180.0f);
                    pc.a0(pcVar.B0.isFrontface());
                    if (pcVar.q0()) {
                        pcVar.f7899s.c(null);
                        return;
                    } else {
                        pcVar.f7899s.d();
                        return;
                    }
                }
                return;
            case 10:
                pcVar.k0();
                return;
            case 11:
                o8 o8Var3 = pcVar.K1;
                if (o8Var3 != null) {
                    o8Var3.f7755f0 = true;
                    o8Var3.f7752e0 = pcVar.M1;
                    pcVar.X();
                    o8 o8Var4 = pcVar.K1;
                    if (o8Var4 != null && !o8Var4.f7744b0) {
                        AndroidUtilities.runOnUIThread(new ka(pcVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (pcVar.f7902s2) {
                    pcVar.Z(true);
                    return;
                }
                return;
            case 13:
                pcVar.l0(-1, false, true);
                return;
            default:
                pcVar.l0(-1, false, true);
                return;
        }
    }
}
