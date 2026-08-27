package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tf0;

public final class u9 implements View.OnClickListener {

    public final int f16916a;

    public final sb f16917b;

    public u9(sb sbVar, int i10) {
        this.f16916a = i10;
        this.f16917b = sbVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f16916a;
        boolean z10 = false;
        sb sbVar = this.f16917b;
        switch (i10) {
            case 0:
                sb sbVar2 = this.f16917b;
                if (sbVar2.G1 != null && sbVar2.f16824y2 == null && sbVar2.f16758e1 != null) {
                    ValueAnimator valueAnimator = sbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = sbVar2.G1.f17243y0;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sbVar2.f16783n.getWidth(), sbVar2.f16783n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        sbVar2.f16758e1.setAlpha(0.0f);
                        hb hbVar = sbVar2.T0;
                        if (hbVar != null) {
                            hbVar.f16563c0 = true;
                        }
                        va vaVar = sbVar2.f16798r1;
                        if (vaVar != null) {
                            vaVar.E0 = true;
                        }
                        sbVar2.f16783n.draw(canvas);
                        hb hbVar2 = sbVar2.T0;
                        if (hbVar2 != null) {
                            hbVar2.f16563c0 = false;
                        }
                        va vaVar2 = sbVar2.f16798r1;
                        if (vaVar2 != null) {
                            vaVar2.E0 = false;
                        }
                        sbVar2.f16758e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        sbVar2.f16758e1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float measuredWidth = (sbVar2.f16758e1.getMeasuredWidth() / 2.0f) + f10;
                        float measuredHeight = (sbVar2.f16758e1.getMeasuredHeight() / 2.0f) + f11;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        bb bbVar = new bb(sbVar2, sbVar2.f16745b, z11, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 0);
                        sbVar2.f16824y2 = bbVar;
                        bbVar.setOnTouchListener(new kh.e(2));
                        sbVar2.f16827z2 = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        sbVar2.A2 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new cb(sbVar2, 0));
                        sbVar2.A2.addListener(new ra(sbVar2, 2));
                        sbVar2.A2.setStartDelay(80L);
                        sbVar2.A2.setDuration(z11 ? 320L : 450L);
                        sbVar2.A2.setInterpolator(z11 ? er.f28124i : er.h);
                        sbVar2.A2.start();
                        sbVar2.f16783n.addView(sbVar2.f16824y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new s9(sbVar2, 4));
                    }
                    break;
                }
                break;
            case 1:
                if (!sbVar.O1) {
                    sbVar.M();
                    break;
                }
                break;
            case 2:
                z7 z7Var = sbVar.G1;
                if (z7Var != null && !sbVar.O1) {
                    z7Var.Y = !z7Var.Y;
                    ArrayList arrayList = z7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((z7) obj).Y = sbVar.G1.Y;
                        }
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(sbVar.G1.f17242y);
                    z7 z7Var2 = sbVar.G1;
                    boolean z12 = z7Var2.f17224o0 != null;
                    if (sbVar.f16750c0 == -1) {
                        w3 w3Var = sbVar.f16765g1;
                        String string = z7Var2.Y ? LocaleController.getString((!zIsEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted) : LocaleController.getString((!zIsEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        boolean z13 = sbVar.f16765g1.R;
                        if (w3Var.getMeasuredWidth() < 0) {
                            w3Var.C = string;
                        } else {
                            org.telegram.ui.Components.i6 i6Var = w3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            i6Var.q(string, z10, true);
                        }
                        sbVar.f16765g1.v();
                    }
                    sbVar.f0(sbVar.G1.Y, true);
                    sbVar.T0.c();
                    break;
                }
                break;
            case 3:
                boolean zK = sbVar.T0.k();
                sbVar.T0.x(-9982, zK);
                ((tf0) sbVar.f16762f1.f662c).a(!zK, true);
                break;
            case 4:
                if (sbVar.f16818x0 != null && !sbVar.O1) {
                    String strC = sbVar.C();
                    String strF = sbVar.F();
                    if (strC != null && !strC.equals(strF)) {
                        wa waVar = sbVar.f16818x0;
                        if (waVar != null && waVar.getCameraSession() != null) {
                            if (!sbVar.f16818x0.isFrontface() || sbVar.f16818x0.getCameraSession().hasFlashModes()) {
                                sbVar.f16818x0.getCameraSession().setCurrentFlashMode(strF);
                            } else {
                                int iIndexOf = sbVar.f16795q2.indexOf(strF);
                                if (iIndexOf >= 0) {
                                    sbVar.f16792p2 = iIndexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", sbVar.f16792p2).apply();
                                }
                            }
                        }
                        sbVar.e0(strF);
                        break;
                    }
                }
                break;
            case 5:
                wa waVar2 = sbVar.f16818x0;
                if (waVar2 != null && sbVar.f16746b0 == 0) {
                    waVar2.toggleDual();
                    sbVar.B0.setValue(sbVar.f16818x0.isDual());
                    sbVar.B0.setContentDescription(LocaleController.getString(sbVar.f16818x0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    sbVar.f16768h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (sbVar.f16771i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    sbVar.f16771i1.e(true);
                    break;
                }
                break;
            case 6:
                if (sbVar.f16746b0 == 0 && !sbVar.W1) {
                    wa waVar3 = sbVar.f16818x0;
                    if (waVar3 != null && waVar3.isDual()) {
                        sbVar.f16818x0.toggleDual();
                    }
                    if (!sbVar.E0.f17137e && !sbVar.f16814w0.j()) {
                        sbVar.f16814w0.o(sbVar.f16810v0);
                        sbVar.E0.setSelected(sbVar.f16810v0);
                        sbVar.C0.a(new v(sbVar.f16810v0, false), true);
                        sbVar.C0.setSelected(true);
                        wa waVar4 = sbVar.f16818x0;
                        if (waVar4 != null) {
                            waVar4.recordHevc = !sbVar.f16814w0.j();
                        }
                        sa saVar = sbVar.I0;
                        if (saVar != null) {
                            saVar.setMultipleOnClick(sbVar.f16814w0.j());
                            sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.f16814w0.getFilledCount()));
                        }
                    }
                    z zVar = sbVar.E0;
                    zVar.a(!zVar.f17137e, true);
                    sbVar.m0(true);
                    break;
                }
                break;
            case 7:
                sbVar.f16814w0.o(null);
                sbVar.f16814w0.e();
                sbVar.E0.setSelected((u) null);
                wa waVar5 = sbVar.f16818x0;
                if (waVar5 != null) {
                    waVar5.recordHevc = !sbVar.f16814w0.j();
                }
                sbVar.E0.a(false, true);
                sbVar.m0(true);
                sa saVar2 = sbVar.I0;
                if (saVar2 != null) {
                    saVar2.setMultipleOnClick(sbVar.f16814w0.j());
                    sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.f16814w0.getFilledCount()));
                }
                break;
            case 8:
                sbVar.k0();
                break;
            case 9:
                wa waVar6 = sbVar.f16818x0;
                if (waVar6 != null && !sbVar.O1 && !sbVar.L1 && waVar6.isInited() && sbVar.f16746b0 == 0) {
                    sbVar.f16818x0.switchCamera();
                    sbVar.K0.d(180.0f);
                    sb.a0(sbVar.f16818x0.isFrontface());
                    if (!sbVar.q0()) {
                        sbVar.f16800s.d();
                    } else {
                        sbVar.f16800s.c(null);
                    }
                    break;
                }
                break;
            case 10:
                sbVar.k0();
                break;
            case 11:
                z7 z7Var3 = sbVar.G1;
                if (z7Var3 != null) {
                    z7Var3.f17208f0 = true;
                    z7Var3.f17205e0 = sbVar.I1;
                    sbVar.X();
                    z7 z7Var4 = sbVar.G1;
                    if (z7Var4 != null && !z7Var4.f17197b0) {
                        AndroidUtilities.runOnUIThread(new s9(sbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (sbVar.f16789o2) {
                    sbVar.Z(true);
                }
                break;
            case 13:
                sbVar.l0(-1, false, true);
                break;
            default:
                sbVar.l0(-1, false, true);
                break;
        }
    }
}
