package ei;

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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;
public final class v9 implements View.OnClickListener {
    public final int f9945a;
    public final vb f9946b;

    public v9(vb vbVar, int i10) {
        this.f9945a = i10;
        this.f9946b = vbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        bs bsVar;
        boolean z10;
        int i10;
        String string;
        int i11;
        int i12;
        y yVar;
        int i13 = this.f9945a;
        boolean z11 = false;
        vb vbVar = this.f9946b;
        switch (i13) {
            case 0:
                vb vbVar2 = this.f9946b;
                if (vbVar2.K1 != null && vbVar2.C2 == null && vbVar2.f9976i1 != null) {
                    ValueAnimator valueAnimator = vbVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z12 = vbVar2.K1.f8744y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vbVar2.f9988n.getWidth(), vbVar2.f9988n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vbVar2.f9976i1.setAlpha(0.0f);
                        jb jbVar = vbVar2.X0;
                        if (jbVar != null) {
                            jbVar.f9716g0 = true;
                        }
                        xa xaVar = vbVar2.f10016v1;
                        if (xaVar != null) {
                            xaVar.I0 = true;
                        }
                        vbVar2.f9988n.draw(canvas);
                        jb jbVar2 = vbVar2.X0;
                        if (jbVar2 != null) {
                            jbVar2.f9716g0 = false;
                        }
                        xa xaVar2 = vbVar2.f10016v1;
                        if (xaVar2 != null) {
                            xaVar2.I0 = false;
                        }
                        vbVar2.f9976i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vbVar2.f9976i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        db dbVar = new db(vbVar2, vbVar2.f9951b, z12, canvas, (vbVar2.f9976i1.getMeasuredWidth() / 2.0f) + f7, (vbVar2.f9976i1.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                        vbVar2.C2 = dbVar;
                        dbVar.setOnTouchListener(new di.d(2));
                        vbVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vbVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new eb(vbVar2, 0));
                        vbVar2.E2.addListener(new ta(vbVar2, 2));
                        vbVar2.E2.setStartDelay(80L);
                        ValueAnimator valueAnimator2 = vbVar2.E2;
                        if (z12) {
                            j10 = 320;
                        } else {
                            j10 = 450;
                        }
                        valueAnimator2.setDuration(j10);
                        ValueAnimator valueAnimator3 = vbVar2.E2;
                        if (z12) {
                            bsVar = bs.f25032i;
                        } else {
                            bsVar = bs.h;
                        }
                        valueAnimator3.setInterpolator(bsVar);
                        vbVar2.E2.start();
                        vbVar2.f9988n.addView(vbVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new t9(vbVar2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!vbVar.S1) {
                    vbVar.L();
                    return;
                }
                return;
            case 2:
                a8 a8Var = vbVar.K1;
                if (a8Var != null && !vbVar.S1) {
                    a8Var.Y = !a8Var.Y;
                    ArrayList arrayList = a8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            ((a8) obj).Y = vbVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vbVar.K1.f8743y);
                    a8 a8Var2 = vbVar.K1;
                    if (a8Var2.f8725o0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (vbVar.f9969g0 == -1) {
                        x3 x3Var = vbVar.f9982k1;
                        if (a8Var2.Y) {
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
                        boolean z13 = vbVar.f9982k1.V;
                        if (x3Var.getMeasuredWidth() < 0) {
                            x3Var.G = string;
                        } else {
                            org.telegram.ui.Components.p6 p6Var = x3Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z11 = true;
                            }
                            p6Var.t(string, z11, true);
                        }
                        vbVar.f9982k1.u();
                    }
                    vbVar.e0(vbVar.K1.Y, true);
                    vbVar.X0.c();
                    return;
                }
                return;
            case 3:
                boolean k10 = vbVar.X0.k();
                vbVar.X0.x(-9982, k10);
                ((ah0) vbVar.f9979j1.f9071c).a(!k10, true);
                return;
            case 4:
                if (vbVar.B0 != null && !vbVar.S1) {
                    String B = vbVar.B();
                    String E = vbVar.E();
                    if (B != null && !B.equals(E)) {
                        ya yaVar = vbVar.B0;
                        if (yaVar != null && yaVar.getCameraSession() != null) {
                            if (vbVar.B0.isFrontface() && !vbVar.B0.getCameraSession().hasFlashModes()) {
                                int indexOf = vbVar.f10014u2.indexOf(E);
                                if (indexOf >= 0) {
                                    vbVar.f10011t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", vbVar.f10011t2).apply();
                                }
                            } else {
                                vbVar.B0.getCameraSession().setCurrentFlashMode(E);
                            }
                        }
                        vbVar.d0(E);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ya yaVar2 = vbVar.B0;
                if (yaVar2 != null && vbVar.f9966f0 == 0) {
                    yaVar2.toggleDual();
                    vbVar.F0.setValue(vbVar.B0.isDual());
                    ic icVar = vbVar.F0;
                    if (vbVar.B0.isDual()) {
                        i12 = R.string.AccDescrDualCameraOn;
                    } else {
                        i12 = R.string.AccDescrDualCameraOff;
                    }
                    icVar.setContentDescription(LocaleController.getString(i12));
                    vbVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (vbVar.f9986m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vbVar.f9986m1.e(true);
                    return;
                }
                return;
            case 6:
                if (vbVar.f9966f0 == 0 && !vbVar.a2) {
                    ya yaVar3 = vbVar.B0;
                    if (yaVar3 != null && yaVar3.isDual()) {
                        vbVar.B0.toggleDual();
                    }
                    if (!vbVar.I0.e && !vbVar.A0.j()) {
                        vbVar.A0.o(vbVar.f10030z0);
                        vbVar.I0.setSelected(vbVar.f10030z0);
                        vbVar.G0.a(new u(vbVar.f10030z0, false), true);
                        vbVar.G0.setSelected(true);
                        ya yaVar4 = vbVar.B0;
                        if (yaVar4 != null) {
                            yaVar4.recordHevc = !vbVar.A0.j();
                        }
                        ua uaVar = vbVar.M0;
                        if (uaVar != null) {
                            uaVar.setMultipleOnClick(vbVar.A0.j());
                            vbVar.M0.setMaxCount(Math.min(10, t.b() - vbVar.A0.getFilledCount()));
                        }
                    }
                    vbVar.I0.a(!yVar.e, true);
                    vbVar.l0(true);
                    return;
                }
                return;
            case 7:
                vbVar.A0.o(null);
                vbVar.A0.e();
                vbVar.I0.setSelected((t) null);
                ya yaVar5 = vbVar.B0;
                if (yaVar5 != null) {
                    yaVar5.recordHevc = !vbVar.A0.j();
                }
                vbVar.I0.a(false, true);
                vbVar.l0(true);
                ua uaVar2 = vbVar.M0;
                if (uaVar2 != null) {
                    uaVar2.setMultipleOnClick(vbVar.A0.j());
                    vbVar.M0.setMaxCount(Math.min(10, t.b() - vbVar.A0.getFilledCount()));
                    return;
                }
                return;
            case 8:
                vbVar.j0();
                return;
            case 9:
                ya yaVar6 = vbVar.B0;
                if (yaVar6 != null && !vbVar.S1 && !vbVar.P1 && yaVar6.isInited() && vbVar.f9966f0 == 0) {
                    vbVar.B0.switchCamera();
                    vbVar.O0.d(180.0f);
                    vb.Z(vbVar.B0.isFrontface());
                    if (vbVar.p0()) {
                        vbVar.f10005s.c(null);
                        return;
                    } else {
                        vbVar.f10005s.d();
                        return;
                    }
                }
                return;
            case 10:
                vbVar.j0();
                return;
            case 11:
                a8 a8Var3 = vbVar.K1;
                if (a8Var3 != null) {
                    a8Var3.f8709f0 = true;
                    a8Var3.f8706e0 = vbVar.M1;
                    vbVar.W();
                    a8 a8Var4 = vbVar.K1;
                    if (a8Var4 != null && !a8Var4.f8699b0) {
                        AndroidUtilities.runOnUIThread(new t9(vbVar, 24), 400L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if (vbVar.f10008s2) {
                    vbVar.Y(true);
                    return;
                }
                return;
            case 13:
                vbVar.k0(-1, false, true);
                return;
            default:
                vbVar.k0(-1, false, true);
                return;
        }
    }
}
