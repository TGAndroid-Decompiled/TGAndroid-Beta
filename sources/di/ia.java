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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gh0;
public final class ia implements View.OnClickListener {
    public final int f7084a;
    public final kc f7085b;

    public ia(kc kcVar, int i10) {
        this.f7084a = i10;
        this.f7085b = kcVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        es esVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f7084a;
        boolean z11 = false;
        kc kcVar = this.f7085b;
        switch (i13) {
            case 0:
                kc kcVar2 = this.f7085b;
                if (kcVar2.K1 != null && kcVar2.C2 == null && kcVar2.f7262i1 != null) {
                    ValueAnimator valueAnimator = kcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = kcVar2.K1.f7221y0;
                        Bitmap createBitmap = Bitmap.createBitmap(kcVar2.f7274n.getWidth(), kcVar2.f7274n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kcVar2.f7262i1.setAlpha(0.0f);
                        yb ybVar = kcVar2.X0;
                        if (ybVar != null) {
                            ybVar.f6603g0 = true;
                        }
                        mb mbVar = kcVar2.f7302v1;
                        if (mbVar != null) {
                            mbVar.I0 = true;
                        }
                        kcVar2.f7274n.draw(canvas);
                        yb ybVar2 = kcVar2.X0;
                        if (ybVar2 != null) {
                            ybVar2.f6603g0 = false;
                        }
                        mb mbVar2 = kcVar2.f7302v1;
                        if (mbVar2 != null) {
                            mbVar2.I0 = false;
                        }
                        kcVar2.f7262i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kcVar2.f7262i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        sb sbVar = new sb(kcVar2, kcVar2.f7237b, z12, canvas, (kcVar2.f7262i1.getMeasuredWidth() / 2.0f) + f7, (kcVar2.f7262i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        kcVar2.C2 = sbVar;
                        sbVar.setOnTouchListener(new ci.d(2));
                        kcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new tb(kcVar2, 0));
                        kcVar2.E2.addListener(new ib(kcVar2, 2));
                        kcVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = kcVar2.E2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = kcVar2.E2;
                        if (z12) {
                            esVar = es.f24773i;
                        } else {
                            esVar = es.h;
                        }
                        valueAnimator3.setInterpolator(esVar);
                        kcVar2.E2.start();
                        kcVar2.f7274n.addView(kcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ga(kcVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!kcVar.S1) {
                    kcVar.L();
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
                    boolean isEmpty = TextUtils.isEmpty(kcVar.K1.f7220y);
                    k8 k8Var2 = kcVar.K1;
                    if (k8Var2.f7202o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (kcVar.f7255g0 == -1) {
                        d4 d4Var = kcVar.f7268k1;
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
                        boolean z13 = kcVar.f7268k1.V;
                        if (d4Var.getMeasuredWidth() < 0) {
                            d4Var.G = string;
                        } else {
                            org.telegram.ui.Components.r6 r6Var = d4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            r6Var.t(string, z11, true);
                        }
                        kcVar.f7268k1.u();
                    }
                    kcVar.e0(kcVar.K1.Y, true);
                    kcVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = kcVar.X0.k();
                kcVar.X0.x(-9982, k10);
                ((gh0) kcVar.f7265j1.f7588c).a(!k10, true);
                return;
            case 4:
                if (kcVar.B0 != null && !kcVar.S1) {
                    String B = kcVar.B();
                    String E = kcVar.E();
                    if (B != null && !B.equals(E)) {
                        nb nbVar = kcVar.B0;
                        if (nbVar != null && nbVar.getCameraSession() != null) {
                            if (kcVar.B0.isFrontface() && !kcVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = kcVar.f7300u2.indexOf(E);
                                if (indexOf >= 0) {
                                    kcVar.f7297t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", kcVar.f7297t2).apply();
                                }
                            } else {
                                kcVar.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        kcVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nb nbVar2 = kcVar.B0;
                if (nbVar2 != null && kcVar.f7252f0 == 0) {
                    nbVar2.toggleDual();
                    kcVar.F0.setValue(kcVar.B0.isDual());
                    wc wcVar = kcVar.F0;
                    if (kcVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    wcVar.setContentDescription(LocaleController.getString(i12));
                    kcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (kcVar.f7272m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    kcVar.f7272m1.e(true);
                    return;
                }
                return;
            case 6:
                if (kcVar.f7252f0 == 0 && !kcVar.a2) {
                    nb nbVar3 = kcVar.B0;
                    if (nbVar3 != null && nbVar3.isDual()) {
                        kcVar.B0.toggleDual();
                    }
                    if (!kcVar.I0.e && !kcVar.A0.j()) {
                        kcVar.A0.o(kcVar.f7316z0);
                        kcVar.I0.setSelected(kcVar.f7316z0);
                        kcVar.G0.a(new u(kcVar.f7316z0, false), true);
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
                    kcVar.I0.a(!yVar.e, true);
                    kcVar.l0(true);
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
                kcVar.l0(true);
                jb jbVar2 = kcVar.M0;
                if (jbVar2 != null) {
                    jbVar2.setMultipleOnClick(kcVar.A0.j());
                    kcVar.M0.setMaxCount(Math.min(10, t.b() - kcVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                kcVar.j0();
                return;
            case 9:
                nb nbVar6 = kcVar.B0;
                if (nbVar6 != null && !kcVar.S1 && !kcVar.P1 && nbVar6.isInited() && kcVar.f7252f0 == 0) {
                    kcVar.B0.switchCamera();
                    kcVar.O0.d(180.0f);
                    kc.Z(kcVar.B0.isFrontface());
                    if (kcVar.p0()) {
                        kcVar.f7291s.c(null);
                        return;
                    } else {
                        kcVar.f7291s.d();
                        return;
                    }
                }
                return;
            case 10:
                kcVar.j0();
                return;
            case 11:
                k8 k8Var3 = kcVar.K1;
                if (k8Var3 != null) {
                    k8Var3.f7186f0 = true;
                    k8Var3.f7183e0 = kcVar.M1;
                    kcVar.W();
                    k8 k8Var4 = kcVar.K1;
                    if (k8Var4 != null && !k8Var4.f7176b0) {
                        AndroidUtilities.runOnUIThread(new ga(kcVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (kcVar.f7294s2) {
                    kcVar.Y(true);
                    return;
                }
                return;
            case 13:
                kcVar.k0(-1, false, true);
                return;
            default:
                kcVar.k0(-1, false, true);
                return;
        }
    }
}
