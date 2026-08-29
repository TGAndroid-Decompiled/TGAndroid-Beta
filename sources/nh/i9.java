package nh;

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
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.jr;
public final class i9 implements View.OnClickListener {
    public final int f17908a;
    public final gb f17909b;

    public i9(gb gbVar, int i10) {
        this.f17908a = i10;
        this.f17909b = gbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        jr jrVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f17908a;
        boolean z11 = false;
        gb gbVar = this.f17909b;
        switch (i13) {
            case 0:
                gb gbVar2 = this.f17909b;
                if (gbVar2.G1 != null && gbVar2.f17818y2 == null && gbVar2.f17752e1 != null) {
                    ValueAnimator valueAnimator = gbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = gbVar2.G1.f18304y0;
                        Bitmap createBitmap = Bitmap.createBitmap(gbVar2.f17777n.getWidth(), gbVar2.f17777n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gbVar2.f17752e1.setAlpha(0.0f);
                        va vaVar = gbVar2.T0;
                        if (vaVar != null) {
                            vaVar.f17649c0 = true;
                        }
                        ja jaVar = gbVar2.f17792r1;
                        if (jaVar != null) {
                            jaVar.E0 = true;
                        }
                        gbVar2.f17777n.draw(canvas);
                        va vaVar2 = gbVar2.T0;
                        if (vaVar2 != null) {
                            vaVar2.f17649c0 = false;
                        }
                        ja jaVar2 = gbVar2.f17792r1;
                        if (jaVar2 != null) {
                            jaVar2.E0 = false;
                        }
                        gbVar2.f17752e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gbVar2.f17752e1.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        pa paVar = new pa(gbVar2, gbVar2.f17739b, z12, canvas, (gbVar2.f17752e1.getMeasuredWidth() / 2.0f) + f9, (gbVar2.f17752e1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f9, f10, 0);
                        gbVar2.f17818y2 = paVar;
                        paVar.setOnTouchListener(new mh.d(2));
                        gbVar2.f17821z2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gbVar2.A2 = ofFloat;
                        ofFloat.addUpdateListener(new qa(gbVar2, 0));
                        gbVar2.A2.addListener(new fa(gbVar2, 2));
                        gbVar2.A2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = gbVar2.A2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = gbVar2.A2;
                        if (z12) {
                            jrVar = jr.f29802i;
                        } else {
                            jrVar = jr.h;
                        }
                        valueAnimator3.setInterpolator(jrVar);
                        gbVar2.A2.start();
                        gbVar2.f17777n.addView(gbVar2.f17818y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g9(gbVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!gbVar.O1) {
                    gbVar.M();
                    return;
                }
                return;
            case 2:
                o7 o7Var = gbVar.G1;
                if (o7Var != null && !gbVar.O1) {
                    o7Var.Y = !o7Var.Y;
                    ArrayList arrayList = o7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((o7) obj).Y = gbVar.G1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(gbVar.G1.f18303y);
                    o7 o7Var2 = gbVar.G1;
                    if (o7Var2.f18285o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (gbVar.f17744c0 == -1) {
                        t3 t3Var = gbVar.f17759g1;
                        if (o7Var2.Y) {
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
                        boolean z13 = gbVar.f17759g1.R;
                        if (t3Var.getMeasuredWidth() < 0) {
                            t3Var.C = string;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = t3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            n6Var.q(string, z11, true);
                        }
                        gbVar.f17759g1.v();
                    }
                    gbVar.f0(gbVar.G1.Y, true);
                    gbVar.T0.c();
                    return;
                }
                return;
            case 3:
                boolean k9 = gbVar.T0.k();
                gbVar.T0.x(-9982, k9);
                ((cg0) gbVar.f17756f1.f3158c).a(!k9, true);
                return;
            case 4:
                if (gbVar.f17812x0 != null && !gbVar.O1) {
                    String C = gbVar.C();
                    String F = gbVar.F();
                    if (C != null && !C.equals(F)) {
                        ka kaVar = gbVar.f17812x0;
                        if (kaVar != null && kaVar.getCameraSession() != null) {
                            if (gbVar.f17812x0.isFrontface() && !gbVar.f17812x0.getCameraSession().hasFlashModes()) {
                                int indexOf = gbVar.f17789q2.indexOf(F);
                                if (indexOf >= 0) {
                                    gbVar.f17786p2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", gbVar.f17786p2).apply();
                                }
                            } else {
                                gbVar.f17812x0.getCameraSession().setCurrentFlashMode(F);
                            }
                        }
                        gbVar.e0(F);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ka kaVar2 = gbVar.f17812x0;
                if (kaVar2 != null && gbVar.f17740b0 == 0) {
                    kaVar2.toggleDual();
                    gbVar.B0.setValue(gbVar.f17812x0.isDual());
                    sb sbVar = gbVar.B0;
                    if (gbVar.f17812x0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    sbVar.setContentDescription(LocaleController.getString(i12));
                    gbVar.f17762h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (gbVar.f17765i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    gbVar.f17765i1.e(true);
                    return;
                }
                return;
            case 6:
                if (gbVar.f17740b0 == 0 && !gbVar.W1) {
                    ka kaVar3 = gbVar.f17812x0;
                    if (kaVar3 != null && kaVar3.isDual()) {
                        gbVar.f17812x0.toggleDual();
                    }
                    if (!gbVar.E0.f18848e && !gbVar.f17808w0.j()) {
                        gbVar.f17808w0.o(gbVar.f17804v0);
                        gbVar.E0.setSelected(gbVar.f17804v0);
                        gbVar.C0.a(new u(gbVar.f17804v0, false), true);
                        gbVar.C0.setSelected(true);
                        ka kaVar4 = gbVar.f17812x0;
                        if (kaVar4 != null) {
                            kaVar4.recordHevc = !gbVar.f17808w0.j();
                        }
                        ga gaVar = gbVar.I0;
                        if (gaVar != null) {
                            gaVar.setMultipleOnClick(gbVar.f17808w0.j());
                            gbVar.I0.setMaxCount(Math.min(10, t.b() - gbVar.f17808w0.getFilledCount()));
                        }
                    }
                    gbVar.E0.a(!yVar.f18848e, true);
                    gbVar.m0(true);
                    return;
                }
                return;
            case 7:
                gbVar.f17808w0.o(null);
                gbVar.f17808w0.e();
                gbVar.E0.setSelected((t) null);
                ka kaVar5 = gbVar.f17812x0;
                if (kaVar5 != null) {
                    kaVar5.recordHevc = !gbVar.f17808w0.j();
                }
                gbVar.E0.a(false, true);
                gbVar.m0(true);
                ga gaVar2 = gbVar.I0;
                if (gaVar2 != null) {
                    gaVar2.setMultipleOnClick(gbVar.f17808w0.j());
                    gbVar.I0.setMaxCount(Math.min(10, t.b() - gbVar.f17808w0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                gbVar.k0();
                return;
            case 9:
                ka kaVar6 = gbVar.f17812x0;
                if (kaVar6 != null && !gbVar.O1 && !gbVar.L1 && kaVar6.isInited() && gbVar.f17740b0 == 0) {
                    gbVar.f17812x0.switchCamera();
                    gbVar.K0.d(180.0f);
                    gb.a0(gbVar.f17812x0.isFrontface());
                    if (gbVar.q0()) {
                        gbVar.f17794s.c(null);
                        return;
                    } else {
                        gbVar.f17794s.d();
                        return;
                    }
                }
                return;
            case 10:
                gbVar.k0();
                return;
            case 11:
                o7 o7Var3 = gbVar.G1;
                if (o7Var3 != null) {
                    o7Var3.f18269f0 = true;
                    o7Var3.f18266e0 = gbVar.I1;
                    gbVar.X();
                    o7 o7Var4 = gbVar.G1;
                    if (o7Var4 != null && !o7Var4.f18258b0) {
                        AndroidUtilities.runOnUIThread(new g9(gbVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (gbVar.f17783o2) {
                    gbVar.Z(true);
                    return;
                }
                return;
            case 13:
                gbVar.l0(-1, false, true);
                return;
            default:
                gbVar.l0(-1, false, true);
                return;
        }
    }
}
