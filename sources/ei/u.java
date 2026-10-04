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
import org.telegram.ui.Components.nt;
import org.telegram.ui.a7;
import org.telegram.ui.b6;
import org.telegram.ui.ba;
import org.telegram.ui.cd;
import org.telegram.ui.hc;
import org.telegram.ui.k6;
import org.telegram.ui.k8;
import org.telegram.ui.m9;
import org.telegram.ui.mc;
import org.telegram.ui.sa;
import org.telegram.ui.w9;
import org.telegram.ui.wb;
public final class u extends org.telegram.ui.ActionBar.j {
    public final int f9356a;
    public final Object f9357b;

    public u(Object obj, int i10) {
        this.f9356a = i10;
        this.f9357b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f9356a;
        Object obj = this.f9357b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((v) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((l3) obj).q();
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
                    k0Var.v.d.f25245f3.N(false);
                    k0Var.d.E(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f9915c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.f25245f3.N(true);
                    k0Var.E.f26247r.getText().clear();
                    k0Var.E.f26247r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f26247r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).f9891r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.f9916e);
                    k0Var2.f9920s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9914b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.f9916e, 0L, 0L, null, false, null, true);
                    k0Var2.f9923y.f26247r.getText().clear();
                    k0Var2.f9923y.f26247r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9923y.f26247r);
                    return;
                } else {
                    return;
                }
            case 8:
                fi.k0 k0Var3 = ((fi.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.f25245f3.N(false);
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
                    cVar.W();
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
                    u0Var.Z();
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
                    w0Var.W();
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
                    e1Var.U();
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
                    ((org.telegram.ui.q) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.q4) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((b6) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                a7 a7Var = (a7) obj;
                if (i10 == -1) {
                    if (a7.Y(a7Var).s()) {
                        zh.b bVar = a7Var.f34686e0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        k6 k6Var = a7Var.M;
                        if (k6Var != null) {
                            k6Var.f(false);
                            a7Var.M.e();
                            return;
                        }
                        return;
                    }
                    a7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    a7Var.j0();
                    return;
                } else if (i10 == 3) {
                    a7.f0(a7Var, false);
                    return;
                } else if (i10 == 4) {
                    a7.f0(a7Var, true);
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
                m9 m9Var = (m9) obj;
                if (i10 == -1) {
                    if (m9.Y(m9Var).s()) {
                        m9Var.e0(true);
                        return;
                    } else {
                        m9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    m9Var.j0(false);
                    return;
                } else {
                    return;
                }
            case 25:
                if (i10 == -1) {
                    ((w9) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                ba baVar = (ba) obj;
                if (i10 == -1) {
                    baVar.finishFragment();
                    return;
                } else if (i10 == 1 && baVar.f35040a.getText().length() != 0) {
                    ba.S(baVar);
                    baVar.finishFragment();
                    return;
                } else {
                    return;
                }
            case 27:
                sa saVar = (sa) obj;
                if (i10 == -1) {
                    saVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    sa.X(saVar);
                    sa.Y(saVar);
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
                    if (cdVar.f35411b >= cdVar.S0() && cdVar.Q0()) {
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
                    cdVar.f35427n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cdVar.f35428o0 = ofFloat;
                    ofFloat.addUpdateListener(new tb(cdVar, 1));
                    cdVar.f35428o0.addListener(new org.telegram.ui.u4(cdVar, 17));
                    cdVar.f35428o0.setDuration(400L);
                    cdVar.f35428o0.setInterpolator(nt.f29062e);
                    cdVar.f35428o0.start();
                    frameLayout.addView(cdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(cdVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
