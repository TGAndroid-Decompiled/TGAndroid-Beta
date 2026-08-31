package fg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.aa;
import org.telegram.ui.b7;
import org.telegram.ui.bd;
import org.telegram.ui.d6;
import org.telegram.ui.dc;
import org.telegram.ui.ep;
import org.telegram.ui.j8;
import org.telegram.ui.kc;
import org.telegram.ui.kq;
import org.telegram.ui.l9;
import org.telegram.ui.lc;
import org.telegram.ui.pa;
import org.telegram.ui.po;
import org.telegram.ui.qr;
import org.telegram.ui.rp;
import org.telegram.ui.s4;
import org.telegram.ui.s5;
import org.telegram.ui.sb;
import org.telegram.ui.v9;
import org.telegram.ui.y6;
import org.telegram.ui.yp;
public final class l1 extends org.telegram.ui.ActionBar.j {
    public final int f6379a;
    public final Object f6380b;

    public l1(Object obj, int i10) {
        this.f6379a = i10;
        this.f6380b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f6379a;
        Object obj = this.f6380b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((n1) obj).dismiss();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((r5) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((mh.p) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                ng.s sVar = (ng.s) obj;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((org.telegram.ui.i) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((org.telegram.ui.n) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.r) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((s4) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((d6) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                b7 b7Var = (b7) obj;
                if (i10 == -1) {
                    if (b7.Z(b7Var).s()) {
                        nh.b bVar = b7Var.V;
                        if (bVar != null) {
                            bVar.d();
                        }
                        y6 y6Var = b7Var.K;
                        if (y6Var != null) {
                            y6Var.e(false);
                            b7Var.K.d();
                            return;
                        }
                        return;
                    }
                    b7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    b7Var.m0();
                    return;
                } else if (i10 == 3) {
                    b7.f0(b7Var, false);
                    return;
                } else if (i10 == 4) {
                    b7.f0(b7Var, true);
                    return;
                } else {
                    return;
                }
            case 10:
                j8 j8Var = (j8) obj;
                if (i10 == -1) {
                    if (j8Var.M == 0 && j8Var.N == 0 && !j8Var.D) {
                        j8Var.finishFragment();
                        return;
                    }
                    j8Var.D = false;
                    j8Var.M = 0;
                    j8Var.N = 0;
                    j8Var.t0();
                    j8Var.o0();
                    return;
                }
                return;
            case 11:
                l9 l9Var = (l9) obj;
                if (i10 == -1) {
                    if (l9.Z(l9Var).s()) {
                        l9Var.k0(true);
                        return;
                    } else {
                        l9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    l9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 12:
                if (i10 == -1) {
                    ((v9) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                aa aaVar = (aa) obj;
                if (i10 == -1) {
                    aaVar.finishFragment();
                    return;
                } else if (i10 == 1 && aaVar.f35101a.getText().length() != 0) {
                    aa.U(aaVar);
                    aaVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 14:
                pa paVar = (pa) obj;
                if (i10 == -1) {
                    paVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    pa.Y(paVar);
                    pa.Z(paVar);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i10 == -1) {
                    ((sb) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.f35422b >= bdVar.S0() && bdVar.Q0()) {
                        bdVar.V0();
                        return;
                    } else {
                        bdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    bdVar.I.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    bdVar.I.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    bdVar.I.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    kc kcVar = new kc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.I.getMeasuredWidth() / 2.0f) + f10, (bdVar.I.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 0);
                    bdVar.f35434j0 = kcVar;
                    kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                    bdVar.f35435k0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f35436l0 = ofFloat;
                    ofFloat.addUpdateListener(new lc(bdVar, 0));
                    bdVar.f35436l0.addListener(new s5(bdVar, 16));
                    bdVar.f35436l0.setDuration(400L);
                    bdVar.f35436l0.setInterpolator(jt.f28199e);
                    bdVar.f35436l0.start();
                    frameLayout.addView(bdVar.f35434j0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new dc(bdVar, 0));
                    return;
                } else {
                    return;
                }
            case 17:
                po poVar = (po) obj;
                if (i10 == -1) {
                    if (poVar.e0(true)) {
                        poVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    poVar.j0();
                    return;
                } else {
                    return;
                }
            case 18:
                ep epVar = (ep) obj;
                if (i10 == -1) {
                    epVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    or orVar = epVar.f36651r;
                    if (orVar == null || orVar.f29840c <= 0.0f) {
                        epVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((rp) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((yp) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                kq kqVar = (kq) obj;
                if (i10 == -1) {
                    if (kqVar.m0(true)) {
                        kqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    kqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 22:
                qr qrVar = (qr) obj;
                if (i10 == -1) {
                    if (qrVar.g0(true)) {
                        qrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    qrVar.u0();
                    return;
                } else {
                    return;
                }
            case 23:
                c8 c8Var = (c8) obj;
                if (i10 == -1) {
                    c8Var.dismiss();
                    return;
                } else {
                    c8Var.t0(i10);
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((sa) obj).dismiss();
                    return;
                }
                return;
            case 25:
                mi miVar = (mi) obj;
                if (i10 == -1) {
                    if (!miVar.f29100v0.i()) {
                        miVar.dismiss();
                        return;
                    }
                    return;
                }
                miVar.f29100v0.t(i10);
                return;
            case 26:
                if (i10 == -1) {
                    ((f40) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1 && (runnable = ((qf0) obj).f30390r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((xg0) obj).dismiss();
                    return;
                }
                return;
            default:
                ((mq0) obj).onBackPressed();
                return;
        }
    }
}
