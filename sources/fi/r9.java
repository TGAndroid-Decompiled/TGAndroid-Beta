package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eh0;
public final class r9 implements View.OnClickListener {
    public final int f11557a;
    public final sb f11558b;

    public r9(sb sbVar, int i10) {
        this.f11557a = i10;
        this.f11558b = sbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        ds dsVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f11557a;
        boolean z11 = false;
        sb sbVar = this.f11558b;
        switch (i13) {
            case 0:
                sb sbVar2 = this.f11558b;
                if (sbVar2.K1 != null && sbVar2.C2 == null && sbVar2.f11632i1 != null) {
                    ValueAnimator valueAnimator = sbVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = sbVar2.K1.f11936y0;
                        Bitmap createBitmap = Bitmap.createBitmap(sbVar2.f11644n.getWidth(), sbVar2.f11644n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        sbVar2.f11632i1.setAlpha(0.0f);
                        gb gbVar = sbVar2.X0;
                        if (gbVar != null) {
                            gbVar.f11370g0 = true;
                        }
                        ta taVar = sbVar2.f11672v1;
                        if (taVar != null) {
                            taVar.f10821x0 = true;
                        }
                        sbVar2.f11644n.draw(canvas);
                        gb gbVar2 = sbVar2.X0;
                        if (gbVar2 != null) {
                            gbVar2.f11370g0 = false;
                        }
                        ta taVar2 = sbVar2.f11672v1;
                        if (taVar2 != null) {
                            taVar2.f10821x0 = false;
                        }
                        sbVar2.f11632i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        sbVar2.f11632i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ab abVar = new ab(sbVar2, sbVar2.f11607b, z12, canvas, (sbVar2.f11632i1.getMeasuredWidth() / 2.0f) + f7, (sbVar2.f11632i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10);
                        sbVar2.C2 = abVar;
                        abVar.setOnTouchListener(new ei.d(2));
                        sbVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        sbVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new bb(sbVar2, 0));
                        sbVar2.E2.addListener(new pa(sbVar2, 2));
                        sbVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = sbVar2.E2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = sbVar2.E2;
                        if (z12) {
                            dsVar = ds.f27532i;
                        } else {
                            dsVar = ds.h;
                        }
                        valueAnimator3.setInterpolator(dsVar);
                        sbVar2.E2.start();
                        sbVar2.f11644n.addView(sbVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new p9(sbVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!sbVar.S1) {
                    sbVar.L();
                    return;
                }
                return;
            case 2:
                w7 w7Var = sbVar.K1;
                if (w7Var != null && !sbVar.S1) {
                    w7Var.Y = !w7Var.Y;
                    ArrayList arrayList = w7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((w7) obj).Y = sbVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(sbVar.K1.f11935y);
                    w7 w7Var2 = sbVar.K1;
                    if (w7Var2.f11917o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (sbVar.f11625g0 == -1) {
                        v3 v3Var = sbVar.f11638k1;
                        if (w7Var2.Y) {
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
                        boolean z13 = sbVar.f11638k1.V;
                        if (v3Var.getMeasuredWidth() < 0) {
                            v3Var.G = string;
                        } else {
                            org.telegram.ui.Components.r6 r6Var = v3Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            r6Var.t(string, z11, true);
                        }
                        sbVar.f11638k1.u();
                    }
                    sbVar.e0(sbVar.K1.Y, true);
                    sbVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = sbVar.X0.k();
                sbVar.X0.x(-9982, k10);
                ((eh0) sbVar.f11635j1.f10864c).a(!k10, true);
                return;
            case 4:
                if (sbVar.B0 != null && !sbVar.S1) {
                    String B = sbVar.B();
                    String E = sbVar.E();
                    if (B != null && !B.equals(E)) {
                        va vaVar = sbVar.B0;
                        if (vaVar != null && vaVar.getCameraSession() != null) {
                            if (sbVar.B0.isFrontface() && !sbVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = sbVar.f11670u2.indexOf(E);
                                if (indexOf >= 0) {
                                    sbVar.f11667t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", sbVar.f11667t2).apply();
                                }
                            } else {
                                sbVar.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        sbVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                va vaVar2 = sbVar.B0;
                if (vaVar2 != null && sbVar.f11622f0 == 0) {
                    vaVar2.toggleDual();
                    sbVar.F0.setValue(sbVar.B0.isDual());
                    ec ecVar = sbVar.F0;
                    if (sbVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    ecVar.setContentDescription(LocaleController.getString(i12));
                    sbVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (sbVar.f11642m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    sbVar.f11642m1.e(true);
                    return;
                }
                return;
            case 6:
                if (sbVar.f11622f0 == 0 && !sbVar.a2) {
                    va vaVar3 = sbVar.B0;
                    if (vaVar3 != null && vaVar3.isDual()) {
                        sbVar.B0.toggleDual();
                    }
                    if (!sbVar.I0.e && !sbVar.A0.j()) {
                        sbVar.A0.o(sbVar.f11686z0);
                        sbVar.I0.setSelected(sbVar.f11686z0);
                        sbVar.G0.a(new u(sbVar.f11686z0, false), true);
                        sbVar.G0.setSelected(true);
                        va vaVar4 = sbVar.B0;
                        if (vaVar4 != null) {
                            vaVar4.recordHevc = !sbVar.A0.j();
                        }
                        qa qaVar = sbVar.M0;
                        if (qaVar != null) {
                            qaVar.setMultipleOnClick(sbVar.A0.j());
                            sbVar.M0.setMaxCount(Math.min(10, t.b() - sbVar.A0.getFilledCount()));
                        }
                    }
                    sbVar.I0.a(!yVar.e, true);
                    sbVar.l0(true);
                    return;
                }
                return;
            case 7:
                sbVar.A0.o(null);
                sbVar.A0.e();
                sbVar.I0.setSelected((t) null);
                va vaVar5 = sbVar.B0;
                if (vaVar5 != null) {
                    vaVar5.recordHevc = !sbVar.A0.j();
                }
                sbVar.I0.a(false, true);
                sbVar.l0(true);
                qa qaVar2 = sbVar.M0;
                if (qaVar2 != null) {
                    qaVar2.setMultipleOnClick(sbVar.A0.j());
                    sbVar.M0.setMaxCount(Math.min(10, t.b() - sbVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                sbVar.j0();
                return;
            case 9:
                va vaVar6 = sbVar.B0;
                if (vaVar6 != null && !sbVar.S1 && !sbVar.P1 && vaVar6.isInited() && sbVar.f11622f0 == 0) {
                    sbVar.B0.switchCamera();
                    sbVar.O0.d(180.0f);
                    sb.Z(sbVar.B0.isFrontface());
                    if (sbVar.p0()) {
                        sbVar.f11661s.c(null);
                        return;
                    } else {
                        sbVar.f11661s.d();
                        return;
                    }
                }
                return;
            case 10:
                sbVar.j0();
                return;
            case 11:
                w7 w7Var3 = sbVar.K1;
                if (w7Var3 != null) {
                    w7Var3.f11901f0 = true;
                    w7Var3.f11898e0 = sbVar.M1;
                    sbVar.W();
                    w7 w7Var4 = sbVar.K1;
                    if (w7Var4 != null && !w7Var4.f11891b0) {
                        AndroidUtilities.runOnUIThread(new p9(sbVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (sbVar.f11664s2) {
                    sbVar.Y(true);
                    return;
                }
                return;
            case 13:
                sbVar.k0(-1, false, true);
                return;
            default:
                sbVar.k0(-1, false, true);
                return;
        }
    }
}
