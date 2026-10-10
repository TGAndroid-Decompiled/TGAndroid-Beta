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
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.is;
public final class ja implements View.OnClickListener {
    public final int f5291a;
    public final lc f5292b;

    public ja(lc lcVar, int i10) {
        this.f5291a = i10;
        this.f5292b = lcVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        is isVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f5291a;
        boolean z11 = false;
        lc lcVar = this.f5292b;
        switch (i13) {
            case 0:
                lc lcVar2 = this.f5292b;
                if (lcVar2.K1 != null && lcVar2.C2 == null && lcVar2.f5487i1 != null) {
                    ValueAnimator valueAnimator = lcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = lcVar2.K1.f5444y0;
                        Bitmap createBitmap = Bitmap.createBitmap(lcVar2.f5499n.getWidth(), lcVar2.f5499n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lcVar2.f5487i1.setAlpha(0.0f);
                        zb zbVar = lcVar2.X0;
                        if (zbVar != null) {
                            zbVar.f4767g0 = true;
                        }
                        nb nbVar = lcVar2.f5527v1;
                        if (nbVar != null) {
                            nbVar.I0 = true;
                        }
                        lcVar2.f5499n.draw(canvas);
                        zb zbVar2 = lcVar2.X0;
                        if (zbVar2 != null) {
                            zbVar2.f4767g0 = false;
                        }
                        nb nbVar2 = lcVar2.f5527v1;
                        if (nbVar2 != null) {
                            nbVar2.I0 = false;
                        }
                        lcVar2.f5487i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lcVar2.f5487i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        tb tbVar = new tb(lcVar2, lcVar2.f5461b, z12, canvas, (lcVar2.f5487i1.getMeasuredWidth() / 2.0f) + f7, (lcVar2.f5487i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        lcVar2.C2 = tbVar;
                        tbVar.setOnTouchListener(new bi.d(2));
                        lcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new ub(lcVar2, 0));
                        lcVar2.E2.addListener(new jb(lcVar2, 2));
                        lcVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = lcVar2.E2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = lcVar2.E2;
                        if (z12) {
                            isVar = is.f27445i;
                        } else {
                            isVar = is.h;
                        }
                        valueAnimator3.setInterpolator(isVar);
                        lcVar2.E2.start();
                        lcVar2.f5499n.addView(lcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ha(lcVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!lcVar.S1) {
                    lcVar.L();
                    return;
                }
                return;
            case 2:
                l8 l8Var = lcVar.K1;
                if (l8Var != null && !lcVar.S1) {
                    l8Var.Y = !l8Var.Y;
                    ArrayList arrayList = l8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((l8) obj).Y = lcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(lcVar.K1.f5443y);
                    l8 l8Var2 = lcVar.K1;
                    if (l8Var2.f5425o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (lcVar.f5480g0 == -1) {
                        d4 d4Var = lcVar.f5493k1;
                        if (l8Var2.Y) {
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
                        boolean z13 = lcVar.f5493k1.V;
                        if (d4Var.getMeasuredWidth() < 0) {
                            d4Var.G = string;
                        } else {
                            org.telegram.ui.Components.q6 q6Var = d4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            q6Var.t(string, z11, true);
                        }
                        lcVar.f5493k1.u();
                    }
                    lcVar.e0(lcVar.K1.Y, true);
                    lcVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = lcVar.X0.k();
                lcVar.X0.x(-9982, k10);
                ((ih0) lcVar.f5490j1.f5908c).a(!k10, true);
                return;
            case 4:
                if (lcVar.B0 != null && !lcVar.S1) {
                    String B = lcVar.B();
                    String E = lcVar.E();
                    if (B != null && !B.equals(E)) {
                        ob obVar = lcVar.B0;
                        if (obVar != null && obVar.getCameraSession() != null) {
                            if (lcVar.B0.isFrontface() && !lcVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = lcVar.f5525u2.indexOf(E);
                                if (indexOf >= 0) {
                                    lcVar.f5522t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", lcVar.f5522t2).apply();
                                }
                            } else {
                                lcVar.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        lcVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ob obVar2 = lcVar.B0;
                if (obVar2 != null && lcVar.f5477f0 == 0) {
                    obVar2.toggleDual();
                    lcVar.F0.setValue(lcVar.B0.isDual());
                    yc ycVar = lcVar.F0;
                    if (lcVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    ycVar.setContentDescription(LocaleController.getString(i12));
                    lcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (lcVar.f5497m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    lcVar.f5497m1.e(true);
                    return;
                }
                return;
            case 6:
                if (lcVar.f5477f0 == 0 && !lcVar.a2) {
                    ob obVar3 = lcVar.B0;
                    if (obVar3 != null && obVar3.isDual()) {
                        lcVar.B0.toggleDual();
                    }
                    if (!lcVar.I0.f6336e && !lcVar.A0.j()) {
                        lcVar.A0.o(lcVar.f5541z0);
                        lcVar.I0.setSelected(lcVar.f5541z0);
                        lcVar.G0.a(new u(lcVar.f5541z0, false), true);
                        lcVar.G0.setSelected(true);
                        ob obVar4 = lcVar.B0;
                        if (obVar4 != null) {
                            obVar4.recordHevc = !lcVar.A0.j();
                        }
                        kb kbVar = lcVar.M0;
                        if (kbVar != null) {
                            kbVar.setMultipleOnClick(lcVar.A0.j());
                            lcVar.M0.setMaxCount(Math.min(10, t.b() - lcVar.A0.getFilledCount()));
                        }
                    }
                    lcVar.I0.a(!yVar.f6336e, true);
                    lcVar.l0(true);
                    return;
                }
                return;
            case 7:
                lcVar.A0.o(null);
                lcVar.A0.e();
                lcVar.I0.setSelected((t) null);
                ob obVar5 = lcVar.B0;
                if (obVar5 != null) {
                    obVar5.recordHevc = !lcVar.A0.j();
                }
                lcVar.I0.a(false, true);
                lcVar.l0(true);
                kb kbVar2 = lcVar.M0;
                if (kbVar2 != null) {
                    kbVar2.setMultipleOnClick(lcVar.A0.j());
                    lcVar.M0.setMaxCount(Math.min(10, t.b() - lcVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                lcVar.j0();
                return;
            case 9:
                ob obVar6 = lcVar.B0;
                if (obVar6 != null && !lcVar.S1 && !lcVar.P1 && obVar6.isInited() && lcVar.f5477f0 == 0) {
                    lcVar.B0.switchCamera();
                    lcVar.O0.d(180.0f);
                    lc.Z(lcVar.B0.isFrontface());
                    if (lcVar.p0()) {
                        lcVar.f5516s.c(null);
                        return;
                    } else {
                        lcVar.f5516s.d();
                        return;
                    }
                }
                return;
            case 10:
                lcVar.j0();
                return;
            case 11:
                l8 l8Var3 = lcVar.K1;
                if (l8Var3 != null) {
                    l8Var3.f5409f0 = true;
                    l8Var3.f5406e0 = lcVar.M1;
                    lcVar.W();
                    l8 l8Var4 = lcVar.K1;
                    if (l8Var4 != null && !l8Var4.f5398b0) {
                        AndroidUtilities.runOnUIThread(new ha(lcVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (lcVar.f5519s2) {
                    lcVar.Y(true);
                    return;
                }
                return;
            case 13:
                lcVar.k0(-1, false, true);
                return;
            default:
                lcVar.k0(-1, false, true);
                return;
        }
    }
}
