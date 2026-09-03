package eg;

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
import kh.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.a7;
import org.telegram.ui.ca;
import org.telegram.ui.d7;
import org.telegram.ui.dd;
import org.telegram.ui.f6;
import org.telegram.ui.fc;
import org.telegram.ui.fp;
import org.telegram.ui.l8;
import org.telegram.ui.lq;
import org.telegram.ui.mc;
import org.telegram.ui.n9;
import org.telegram.ui.nc;
import org.telegram.ui.ra;
import org.telegram.ui.ro;
import org.telegram.ui.rr;
import org.telegram.ui.sp;
import org.telegram.ui.u4;
import org.telegram.ui.u5;
import org.telegram.ui.ub;
import org.telegram.ui.x9;
import org.telegram.ui.zp;
public final class m1 extends org.telegram.ui.ActionBar.j {
    public final int f5344a;
    public final Object f5345b;

    public m1(Object obj, int i10) {
        this.f5344a = i10;
        this.f5345b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f5344a;
        Object obj = this.f5345b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((o1) obj).dismiss();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((q5) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((lh.q) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                mg.s sVar = (mg.s) obj;
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
                    ((u4) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((f6) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                d7 d7Var = (d7) obj;
                if (i10 == -1) {
                    if (d7.Z(d7Var).s()) {
                        mh.b bVar = d7Var.V;
                        if (bVar != null) {
                            bVar.d();
                        }
                        a7 a7Var = d7Var.K;
                        if (a7Var != null) {
                            a7Var.e(false);
                            d7Var.K.d();
                            return;
                        }
                        return;
                    }
                    d7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    d7Var.m0();
                    return;
                } else if (i10 == 3) {
                    d7.f0(d7Var, false);
                    return;
                } else if (i10 == 4) {
                    d7.f0(d7Var, true);
                    return;
                } else {
                    return;
                }
            case 10:
                l8 l8Var = (l8) obj;
                if (i10 == -1) {
                    if (l8Var.M == 0 && l8Var.N == 0 && !l8Var.D) {
                        l8Var.finishFragment();
                        return;
                    }
                    l8Var.D = false;
                    l8Var.M = 0;
                    l8Var.N = 0;
                    l8Var.t0();
                    l8Var.o0();
                    return;
                }
                return;
            case 11:
                n9 n9Var = (n9) obj;
                if (i10 == -1) {
                    if (n9.Z(n9Var).s()) {
                        n9Var.k0(true);
                        return;
                    } else {
                        n9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    n9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 12:
                if (i10 == -1) {
                    ((x9) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                ca caVar = (ca) obj;
                if (i10 == -1) {
                    caVar.finishFragment();
                    return;
                } else if (i10 == 1 && caVar.f33052a.getText().length() != 0) {
                    ca.U(caVar);
                    caVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 14:
                ra raVar = (ra) obj;
                if (i10 == -1) {
                    raVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ra.Y(raVar);
                    ra.Z(raVar);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i10 == -1) {
                    ((ub) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                dd ddVar = (dd) obj;
                if (i10 == -1) {
                    if (ddVar.f33418b >= ddVar.S0() && ddVar.Q0()) {
                        ddVar.V0();
                        return;
                    } else {
                        ddVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) ddVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    ddVar.I.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    ddVar.I.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    ddVar.I.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    mc mcVar = new mc(ddVar, ddVar.getParentActivity(), canvas, (ddVar.I.getMeasuredWidth() / 2.0f) + f10, (ddVar.I.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                    ddVar.f33429j0 = mcVar;
                    mcVar.setOnTouchListener(new oh.d(2));
                    ddVar.f33430k0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ddVar.f33431l0 = ofFloat;
                    ofFloat.addUpdateListener(new nc(ddVar, 0));
                    ddVar.f33431l0.addListener(new u5(ddVar, 16));
                    ddVar.f33431l0.setDuration(400L);
                    ddVar.f33431l0.setInterpolator(ft.e);
                    ddVar.f33431l0.start();
                    frameLayout.addView(ddVar.f33429j0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new fc(ddVar, 0));
                    return;
                } else {
                    return;
                }
            case 17:
                ro roVar = (ro) obj;
                if (i10 == -1) {
                    if (roVar.e0(true)) {
                        roVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    roVar.j0();
                    return;
                } else {
                    return;
                }
            case 18:
                fp fpVar = (fp) obj;
                if (i10 == -1) {
                    fpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    lr lrVar = fpVar.f34198r;
                    if (lrVar == null || lrVar.f26868c <= 0.0f) {
                        fpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((sp) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((zp) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                lq lqVar = (lq) obj;
                if (i10 == -1) {
                    if (lqVar.m0(true)) {
                        lqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    lqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 22:
                rr rrVar = (rr) obj;
                if (i10 == -1) {
                    if (rrVar.g0(true)) {
                        rrVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    rrVar.u0();
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
                li liVar = (li) obj;
                if (i10 == -1) {
                    if (!liVar.f26744v0.i()) {
                        liVar.dismiss();
                        return;
                    }
                    return;
                }
                liVar.f26744v0.t(i10);
                return;
            case 26:
                if (i10 == -1) {
                    ((e40) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1 && (runnable = ((pf0) obj).f27849r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((wg0) obj).dismiss();
                    return;
                }
                return;
            default:
                ((lq0) obj).onBackPressed();
                return;
        }
    }
}
