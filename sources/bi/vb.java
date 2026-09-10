package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.wr;
public final class vb implements View.OnClickListener {
    public final int f3802a;
    public final ce f3803b;

    public vb(ce ceVar, int i10) {
        this.f3802a = i10;
        this.f3803b = ceVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        wr wrVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        c0 c0Var;
        int i13 = this.f3802a;
        boolean z11 = false;
        ce ceVar = this.f3803b;
        switch (i13) {
            case 0:
                ce ceVar2 = this.f3803b;
                if (ceVar2.K1 != null && ceVar2.C2 == null && ceVar2.f2458i1 != null) {
                    ValueAnimator valueAnimator = ceVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = ceVar2.K1.f3608y0;
                        Bitmap createBitmap = Bitmap.createBitmap(ceVar2.f2470n.getWidth(), ceVar2.f2470n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ceVar2.f2458i1.setAlpha(0.0f);
                        nd ndVar = ceVar2.X0;
                        if (ndVar != null) {
                            ndVar.f2641g0 = true;
                        }
                        ad adVar = ceVar2.f2498v1;
                        if (adVar != null) {
                            adVar.I0 = true;
                        }
                        ceVar2.f2470n.draw(canvas);
                        nd ndVar2 = ceVar2.X0;
                        if (ndVar2 != null) {
                            ndVar2.f2641g0 = false;
                        }
                        ad adVar2 = ceVar2.f2498v1;
                        if (adVar2 != null) {
                            adVar2.I0 = false;
                        }
                        ceVar2.f2458i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ceVar2.f2458i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gd gdVar = new gd(ceVar2, ceVar2.f2433b, z12, canvas, (ceVar2.f2458i1.getMeasuredWidth() / 2.0f) + f7, (ceVar2.f2458i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        ceVar2.C2 = gdVar;
                        gdVar.setOnTouchListener(new ai.h(2));
                        ceVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ceVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new hd(ceVar2, 0));
                        ceVar2.E2.addListener(new vc(ceVar2, 2));
                        ceVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = ceVar2.E2;
                        if (z12) {
                            j3 = 320;
                        } else {
                            j3 = 450;
                        }
                        valueAnimator2.setDuration(j3);
                        ValueAnimator valueAnimator3 = ceVar2.E2;
                        if (z12) {
                            wrVar = wr.f28821i;
                        } else {
                            wrVar = wr.h;
                        }
                        valueAnimator3.setInterpolator(wrVar);
                        ceVar2.E2.start();
                        ceVar2.f2470n.addView(ceVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new tb(ceVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!ceVar.S1) {
                    ceVar.M();
                    return;
                }
                return;
            case 2:
                r9 r9Var = ceVar.K1;
                if (r9Var != null && !ceVar.S1) {
                    r9Var.Y = !r9Var.Y;
                    ArrayList arrayList = r9Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((r9) obj).Y = ceVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(ceVar.K1.f3607y);
                    r9 r9Var2 = ceVar.K1;
                    if (r9Var2.f3589o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ceVar.f2451g0 == -1) {
                        x4 x4Var = ceVar.f2464k1;
                        if (r9Var2.Y) {
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
                        boolean z13 = ceVar.f2464k1.V;
                        if (x4Var.getMeasuredWidth() < 0) {
                            x4Var.G = string;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = x4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            n6Var.q(string, z11, true);
                        }
                        ceVar.f2464k1.u();
                    }
                    ceVar.f0(ceVar.K1.Y, true);
                    ceVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = ceVar.X0.k();
                ceVar.X0.x(-9982, k10);
                ((pg0) ceVar.f2461j1.f3652c).a(!k10, true);
                return;
            case 4:
                if (ceVar.B0 != null && !ceVar.S1) {
                    String C = ceVar.C();
                    String F = ceVar.F();
                    if (C != null && !C.equals(F)) {
                        bd bdVar = ceVar.B0;
                        if (bdVar != null && bdVar.getCameraSession() != null) {
                            if (ceVar.B0.isFrontface() && !ceVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = ceVar.f2496u2.indexOf(F);
                                if (indexOf >= 0) {
                                    ceVar.f2493t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", ceVar.f2493t2).apply();
                                }
                            } else {
                                ceVar.B0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        ceVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                bd bdVar2 = ceVar.B0;
                if (bdVar2 != null && ceVar.f2448f0 == 0) {
                    bdVar2.toggleDual();
                    ceVar.F0.setValue(ceVar.B0.isDual());
                    oe oeVar = ceVar.F0;
                    if (ceVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    oeVar.setContentDescription(LocaleController.getString(i12));
                    ceVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (ceVar.f2468m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    ceVar.f2468m1.e(true);
                    return;
                }
                return;
            case 6:
                if (ceVar.f2448f0 == 0 && !ceVar.a2) {
                    bd bdVar3 = ceVar.B0;
                    if (bdVar3 != null && bdVar3.isDual()) {
                        ceVar.B0.toggleDual();
                    }
                    if (!ceVar.I0.e && !ceVar.A0.j()) {
                        ceVar.A0.o(ceVar.f2512z0);
                        ceVar.I0.setSelected(ceVar.f2512z0);
                        ceVar.G0.a(new y(ceVar.f2512z0, false), true);
                        ceVar.G0.setSelected(true);
                        bd bdVar4 = ceVar.B0;
                        if (bdVar4 != null) {
                            bdVar4.recordHevc = !ceVar.A0.j();
                        }
                        xc xcVar = ceVar.M0;
                        if (xcVar != null) {
                            xcVar.setMultipleOnClick(ceVar.A0.j());
                            ceVar.M0.setMaxCount(Math.min(10, x.b() - ceVar.A0.getFilledCount()));
                        }
                    }
                    ceVar.I0.a(!c0Var.e, true);
                    ceVar.m0(true);
                    return;
                }
                return;
            case 7:
                ceVar.A0.o(null);
                ceVar.A0.e();
                ceVar.I0.setSelected((x) null);
                bd bdVar5 = ceVar.B0;
                if (bdVar5 != null) {
                    bdVar5.recordHevc = !ceVar.A0.j();
                }
                ceVar.I0.a(false, true);
                ceVar.m0(true);
                xc xcVar2 = ceVar.M0;
                if (xcVar2 != null) {
                    xcVar2.setMultipleOnClick(ceVar.A0.j());
                    ceVar.M0.setMaxCount(Math.min(10, x.b() - ceVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                ceVar.k0();
                return;
            case 9:
                bd bdVar6 = ceVar.B0;
                if (bdVar6 != null && !ceVar.S1 && !ceVar.P1 && bdVar6.isInited() && ceVar.f2448f0 == 0) {
                    ceVar.B0.switchCamera();
                    ceVar.O0.d(180.0f);
                    ce.a0(ceVar.B0.isFrontface());
                    if (ceVar.q0()) {
                        ceVar.f2487s.c(null);
                        return;
                    } else {
                        ceVar.f2487s.d();
                        return;
                    }
                }
                return;
            case 10:
                ceVar.k0();
                return;
            case 11:
                r9 r9Var3 = ceVar.K1;
                if (r9Var3 != null) {
                    r9Var3.f3573f0 = true;
                    r9Var3.f3570e0 = ceVar.M1;
                    ceVar.X();
                    r9 r9Var4 = ceVar.K1;
                    if (r9Var4 != null && !r9Var4.f3563b0) {
                        AndroidUtilities.runOnUIThread(new tb(ceVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (ceVar.f2490s2) {
                    ceVar.Z(true);
                    return;
                }
                return;
            case 13:
                ceVar.l0(-1, false, true);
                return;
            default:
                ceVar.l0(-1, false, true);
                return;
        }
    }
}
