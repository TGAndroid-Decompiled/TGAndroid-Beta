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
import ci.xb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kt;
import org.telegram.ui.a7;
import org.telegram.ui.b6;
import org.telegram.ui.ba;
import org.telegram.ui.cd;
import org.telegram.ui.hc;
import org.telegram.ui.j8;
import org.telegram.ui.m9;
import org.telegram.ui.nc;
import org.telegram.ui.sa;
import org.telegram.ui.w9;
import org.telegram.ui.wb;
import org.telegram.ui.x6;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f8616a;
    public final Object f8617b;

    public t(Object obj, int i10) {
        this.f8616a = i10;
        this.f8617b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f8616a;
        Object obj = this.f8617b;
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
                    k0Var.f9126c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.Y2.N(true);
                    k0Var.E.f22546r.getText().clear();
                    k0Var.E.f22546r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f22546r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).f9104r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f9130s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9125b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f9133y.f22546r.getText().clear();
                    k0Var2.f9133y.f22546r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9133y.f22546r);
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
                    ((org.telegram.ui.p) obj).finishFragment();
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
                    ((b6) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                a7 a7Var = (a7) obj;
                if (i10 == -1) {
                    if (a7.Z(a7Var).s()) {
                        zh.b bVar = a7Var.f31741c0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        x6 x6Var = a7Var.M;
                        if (x6Var != null) {
                            x6Var.f(false);
                            a7Var.M.e();
                            return;
                        }
                        return;
                    }
                    a7Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    a7Var.m0();
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
                j8 j8Var = (j8) obj;
                if (i10 == -1) {
                    if (j8Var.P == 0 && j8Var.Q == 0 && !j8Var.G) {
                        j8Var.finishFragment();
                        return;
                    }
                    j8Var.G = false;
                    j8Var.P = 0;
                    j8Var.Q = 0;
                    j8Var.t0();
                    j8Var.o0();
                    return;
                }
                return;
            case 24:
                m9 m9Var = (m9) obj;
                if (i10 == -1) {
                    if (m9.Z(m9Var).s()) {
                        m9Var.k0(true);
                        return;
                    } else {
                        m9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    m9Var.p0(false);
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
                } else if (i10 == 1 && baVar.f32087a.getText().length() != 0) {
                    ba.U(baVar);
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
                    sa.Y(saVar);
                    sa.Z(saVar);
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
                    if (cdVar.f32730b >= cdVar.S0() && cdVar.Q0()) {
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
                    nc ncVar = new nc(cdVar, cdVar.getParentActivity(), canvas, (cdVar.L.getMeasuredWidth() / 2.0f) + f7, (cdVar.L.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                    cdVar.m0 = ncVar;
                    ncVar.setOnTouchListener(new bi.d(2));
                    cdVar.f32745n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cdVar.f32746o0 = ofFloat;
                    ofFloat.addUpdateListener(new xb(cdVar, 1));
                    cdVar.f32746o0.addListener(new org.telegram.ui.t4(cdVar, 17));
                    cdVar.f32746o0.setDuration(400L);
                    cdVar.f32746o0.setInterpolator(kt.e);
                    cdVar.f32746o0.start();
                    frameLayout.addView(cdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(cdVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
