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
import ci.ub;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.au;
import org.telegram.ui.a6;
import org.telegram.ui.aa;
import org.telegram.ui.bd;
import org.telegram.ui.g8;
import org.telegram.ui.gc;
import org.telegram.ui.j9;
import org.telegram.ui.lc;
import org.telegram.ui.ra;
import org.telegram.ui.v6;
import org.telegram.ui.v9;
import org.telegram.ui.vb;
import org.telegram.ui.y6;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f9358a;
    public final Object f9359b;

    public t(Object obj, int i10) {
        this.f9358a = i10;
        this.f9359b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f9358a;
        Object obj = this.f9359b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((u) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((k3) obj).r();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((d5) obj).finishFragment();
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
                    k0Var.v.d.W2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f9991c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.W2.N(true);
                    k0Var.E.f30614r.getText().clear();
                    k0Var.E.f30614r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f30614r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).f9967r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.f9992e);
                    k0Var2.f9996s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9990b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.f9992e, 0L, 0L, null, false, null, true);
                    k0Var2.f9999y.f30614r.getText().clear();
                    k0Var2.f9999y.f30614r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9999y.f30614r);
                    return;
                } else {
                    return;
                }
            case 8:
                fi.k0 k0Var3 = ((fi.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.W2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 9:
                hg.d dVar = (hg.d) obj;
                if (i10 == -1) {
                    if (dVar.onBackPressed(true)) {
                        dVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    dVar.X();
                    return;
                } else {
                    return;
                }
            case 10:
                hg.n nVar = (hg.n) obj;
                if (i10 == -1) {
                    if (nVar.onBackPressed(true)) {
                        nVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    nVar.h0();
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
                    ((hg.f2) obj).finishFragment();
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
                    ((org.telegram.ui.q) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((a6) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                y6 y6Var = (y6) obj;
                if (i10 == -1) {
                    if (y6.Z(y6Var).t()) {
                        zh.b bVar = y6Var.Y;
                        if (bVar != null) {
                            bVar.d();
                        }
                        v6 v6Var = y6Var.N;
                        if (v6Var != null) {
                            v6Var.e(false);
                            y6Var.N.d();
                            return;
                        }
                        return;
                    }
                    y6Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    y6Var.m0();
                    return;
                } else if (i10 == 3) {
                    y6.f0(y6Var, false);
                    return;
                } else if (i10 == 4) {
                    y6.f0(y6Var, true);
                    return;
                } else {
                    return;
                }
            case 23:
                g8 g8Var = (g8) obj;
                if (i10 == -1) {
                    if (g8Var.P == 0 && g8Var.Q == 0 && !g8Var.G) {
                        g8Var.finishFragment();
                        return;
                    }
                    g8Var.G = false;
                    g8Var.P = 0;
                    g8Var.Q = 0;
                    g8Var.t0();
                    g8Var.o0();
                    return;
                }
                return;
            case 24:
                j9 j9Var = (j9) obj;
                if (i10 == -1) {
                    if (j9.Z(j9Var).t()) {
                        j9Var.k0(true);
                        return;
                    } else {
                        j9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    j9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 25:
                if (i10 == -1) {
                    ((v9) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                aa aaVar = (aa) obj;
                if (i10 == -1) {
                    aaVar.finishFragment();
                    return;
                } else if (i10 == 1 && aaVar.f35882a.getText().length() != 0) {
                    aa.U(aaVar);
                    aaVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 27:
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
            case 28:
                if (i10 == -1) {
                    ((vb) obj).finishFragment();
                    return;
                }
                return;
            default:
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.f36249b >= bdVar.S0() && bdVar.Q0()) {
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
                    bdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    bdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    bdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    lc lcVar = new lc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = lcVar;
                    lcVar.setOnTouchListener(new bi.d(2));
                    bdVar.f36265n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.f36266o0 = ofFloat;
                    ofFloat.addUpdateListener(new ub(bdVar, 1));
                    bdVar.f36266o0.addListener(new org.telegram.ui.t4(bdVar, 17));
                    bdVar.f36266o0.setDuration(400L);
                    bdVar.f36266o0.setInterpolator(au.f24775e);
                    bdVar.f36266o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new gc(bdVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
