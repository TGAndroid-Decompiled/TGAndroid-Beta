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
import kh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.aa;
import org.telegram.ui.b7;
import org.telegram.ui.bd;
import org.telegram.ui.d6;
import org.telegram.ui.dp;
import org.telegram.ui.ec;
import org.telegram.ui.j8;
import org.telegram.ui.jq;
import org.telegram.ui.kc;
import org.telegram.ui.l9;
import org.telegram.ui.lc;
import org.telegram.ui.pa;
import org.telegram.ui.po;
import org.telegram.ui.pr;
import org.telegram.ui.qp;
import org.telegram.ui.s4;
import org.telegram.ui.s5;
import org.telegram.ui.sb;
import org.telegram.ui.v9;
import org.telegram.ui.xp;
import org.telegram.ui.y6;
public final class m1 extends org.telegram.ui.ActionBar.j {
    public final int f5355a;
    public final Object f5356b;

    public m1(Object obj, int i10) {
        this.f5355a = i10;
        this.f5356b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.f5355a;
        Object obj = this.f5356b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((o1) obj).dismiss();
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
                        mh.b bVar = b7Var.V;
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
                } else if (i10 == 1 && aaVar.f32497a.getText().length() != 0) {
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
                    if (bdVar.f32912b >= bdVar.S0() && bdVar.Q0()) {
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
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    kc kcVar = new kc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.I.getMeasuredWidth() / 2.0f) + f10, (bdVar.I.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                    bdVar.f32923j0 = kcVar;
                    kcVar.setOnTouchListener(new oh.d(2));
                    bdVar.f32924k0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f32925l0 = ofFloat;
                    ofFloat.addUpdateListener(new lc(bdVar, 0));
                    bdVar.f32925l0.addListener(new s5(bdVar, 16));
                    bdVar.f32925l0.setDuration(400L);
                    bdVar.f32925l0.setInterpolator(gt.e);
                    bdVar.f32925l0.start();
                    frameLayout.addView(bdVar.f32923j0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new ec(bdVar, 0));
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
                dp dpVar = (dp) obj;
                if (i10 == -1) {
                    dpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    mr mrVar = dpVar.f33767r;
                    if (mrVar == null || mrVar.f27111c <= 0.0f) {
                        dpVar.Y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((qp) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                jq jqVar = (jq) obj;
                if (i10 == -1) {
                    if (jqVar.m0(true)) {
                        jqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    jqVar.r0(true);
                    return;
                } else {
                    return;
                }
            case 22:
                pr prVar = (pr) obj;
                if (i10 == -1) {
                    if (prVar.g0(true)) {
                        prVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    prVar.u0();
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
                    if (!liVar.f26748v0.i()) {
                        liVar.dismiss();
                        return;
                    }
                    return;
                }
                liVar.f26748v0.t(i10);
                return;
            case 26:
                if (i10 == -1) {
                    ((d40) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1 && (runnable = ((of0) obj).f27560r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((vg0) obj).dismiss();
                    return;
                }
                return;
            default:
                ((lq0) obj).onBackPressed();
                return;
        }
    }
}
