package ei;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.tb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mt;
import org.telegram.ui.b7;
import org.telegram.ui.c6;
import org.telegram.ui.ca;
import org.telegram.ui.cd;
import org.telegram.ui.hc;
import org.telegram.ui.k8;
import org.telegram.ui.mc;
import org.telegram.ui.n9;
import org.telegram.ui.ta;
import org.telegram.ui.wb;
import org.telegram.ui.x9;
import org.telegram.ui.y6;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f8601a;
    public final Object f8602b;

    public t(Object obj, int i10) {
        this.f8601a = i10;
        this.f8602b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f8601a;
        Object obj = this.f8602b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((u) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((k3) obj).q();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((e5) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((fi.f) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((fi.p) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((fi.s) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                fi.k0 k0Var = ((fi.e0) obj).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.Y2.N(false);
                    k0Var.d.E(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f9113c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.Y2.N(true);
                    k0Var.E.f23850r.getText().clear();
                    k0Var.E.f23850r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f23850r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).f9091r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f9117s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9112b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f9120y.f23850r.getText().clear();
                    k0Var2.f9120y.f23850r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9120y.f23850r);
                    return;
                } else {
                    return;
                }
            case 8:
                fi.k0 k0Var3 = ((fi.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.Y2.N(false);
                    k0Var3.d.E(0);
                    return;
                }
                return;
            case 9:
                hg.c cVar = (hg.c) obj;
                if (i10 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    cVar.X();
                    return;
                } else {
                    return;
                }
            case 10:
                hg.m mVar = (hg.m) obj;
                if (i10 == -1) {
                    if (mVar.onBackPressed(true)) {
                        mVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    mVar.h0();
                    return;
                } else {
                    return;
                }
            case 11:
                hg.u0 u0Var = (hg.u0) obj;
                if (i10 == -1) {
                    if (u0Var.onBackPressed(true)) {
                        u0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    u0Var.a0();
                    return;
                } else {
                    return;
                }
            case 12:
                hg.w0 w0Var = (hg.w0) obj;
                if (i10 == -1) {
                    if (w0Var.onBackPressed(true)) {
                        w0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    w0Var.X();
                    return;
                } else {
                    return;
                }
            case 13:
                hg.e1 e1Var = (hg.e1) obj;
                if (i10 == -1) {
                    if (e1Var.onBackPressed(true)) {
                        e1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    e1Var.W();
                    return;
                } else {
                    return;
                }
            case 14:
                hg.g1 g1Var = (hg.g1) obj;
                if (i10 == -1) {
                    if (g1Var.onBackPressed(true)) {
                        g1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    g1Var.d0();
                    return;
                } else {
                    return;
                }
            case 15:
                if (i10 == -1) {
                    ((hg.i1) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((hg.e2) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.h) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.l) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.r) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.r4) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((c6) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                b7 b7Var = (b7) obj;
                if (i10 == -1) {
                    if (b7.Z(b7Var).t()) {
                        zh.b bVar = b7Var.f32260c0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        y6 y6Var = b7Var.M;
                        if (y6Var != null) {
                            y6Var.f(false);
                            b7Var.M.e();
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
            case 23:
                k8 k8Var = (k8) obj;
                if (i10 == -1) {
                    if (k8Var.P == 0 && k8Var.Q == 0 && !k8Var.G) {
                        k8Var.finishFragment();
                        return;
                    }
                    k8Var.G = false;
                    k8Var.P = 0;
                    k8Var.Q = 0;
                    k8Var.t0();
                    k8Var.o0();
                    return;
                }
                return;
            case 24:
                n9 n9Var = (n9) obj;
                if (i10 == -1) {
                    if (n9.b0(n9Var).t()) {
                        n9Var.l0(true);
                        return;
                    } else {
                        n9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    n9Var.q0(false);
                    return;
                } else {
                    return;
                }
            case 25:
                if (i10 == -1) {
                    ((x9) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                ca caVar = (ca) obj;
                if (i10 == -1) {
                    caVar.finishFragment();
                    return;
                } else if (i10 == 1 && caVar.f32642a.getText().length() != 0) {
                    ca.U(caVar);
                    caVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 27:
                ta taVar = (ta) obj;
                if (i10 == -1) {
                    taVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ta.Y(taVar);
                    ta.Z(taVar);
                    return;
                } else {
                    return;
                }
            case 28:
                if (i10 == -1) {
                    ((wb) obj).finishFragment();
                    return;
                }
                return;
            default:
                cd cdVar = (cd) obj;
                if (i10 == -1) {
                    if (cdVar.f32663b >= cdVar.S0() && cdVar.Q0()) {
                        cdVar.V0();
                        return;
                    } else {
                        cdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) cdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    cdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    cdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    cdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    mc mcVar = new mc(cdVar, cdVar.getParentActivity(), canvas, (cdVar.L.getMeasuredWidth() / 2.0f) + f7, (cdVar.L.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                    cdVar.m0 = mcVar;
                    mcVar.setOnTouchListener(new bi.d(2));
                    cdVar.f32678n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cdVar.f32679o0 = ofFloat;
                    ofFloat.addUpdateListener(new tb(cdVar, 1));
                    cdVar.f32679o0.addListener(new org.telegram.ui.v4(cdVar, 17));
                    cdVar.f32679o0.setDuration(400L);
                    cdVar.f32679o0.setInterpolator(mt.e);
                    cdVar.f32679o0.start();
                    frameLayout.addView(cdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(cdVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
