package di;

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
import bi.hd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.pt;
import org.telegram.ui.b6;
import org.telegram.ui.cd;
import org.telegram.ui.h8;
import org.telegram.ui.hc;
import org.telegram.ui.k9;
import org.telegram.ui.nc;
import org.telegram.ui.ra;
import org.telegram.ui.u9;
import org.telegram.ui.v6;
import org.telegram.ui.wb;
import org.telegram.ui.y6;
import org.telegram.ui.z9;
public final class w extends org.telegram.ui.ActionBar.k {
    public final int f6969a;
    public final Object f6970b;

    public w(Object obj, int i10) {
        this.f6969a = i10;
        this.f6970b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f6969a;
        Object obj = this.f6970b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((x) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((n3) obj).q();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((i5) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((ei.f) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((ei.p) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((ei.s) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                ei.k0 k0Var = ((ei.e0) obj).h;
                if (i10 == -1) {
                    if (k0Var.N) {
                        k0Var.dismiss();
                        return;
                    }
                    k0Var.v.d.Y2.N(false);
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f7570c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.Y2.N(true);
                    k0Var.E.f24572r.getText().clear();
                    k0Var.E.f24572r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f24572r);
                    return;
                } else {
                    return;
                }
            case 7:
                ei.k0 k0Var2 = ((ei.f0) obj).f7548r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f7574s.presentFragment(new ei.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f7569b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f7577y.f24572r.getText().clear();
                    k0Var2.f7577y.f24572r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f7577y.f24572r);
                    return;
                } else {
                    return;
                }
            case 8:
                ei.k0 k0Var3 = ((ei.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.Y2.N(false);
                    k0Var3.d.D(0);
                    return;
                }
                return;
            case 9:
                gg.c cVar = (gg.c) obj;
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
                gg.n nVar = (gg.n) obj;
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
                gg.y0 y0Var = (gg.y0) obj;
                if (i10 == -1) {
                    if (y0Var.onBackPressed(true)) {
                        y0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    y0Var.a0();
                    return;
                } else {
                    return;
                }
            case 12:
                gg.a1 a1Var = (gg.a1) obj;
                if (i10 == -1) {
                    if (a1Var.onBackPressed(true)) {
                        a1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    a1Var.X();
                    return;
                } else {
                    return;
                }
            case 13:
                gg.k1 k1Var = (gg.k1) obj;
                if (i10 == -1) {
                    if (k1Var.onBackPressed(true)) {
                        k1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    k1Var.W();
                    return;
                } else {
                    return;
                }
            case 14:
                gg.m1 m1Var = (gg.m1) obj;
                if (i10 == -1) {
                    if (m1Var.onBackPressed(true)) {
                        m1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    m1Var.d0();
                    return;
                } else {
                    return;
                }
            case 15:
                if (i10 == -1) {
                    ((gg.o1) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((gg.n2) obj).finishFragment();
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
                y6 y6Var = (y6) obj;
                if (i10 == -1) {
                    if (y6.Z(y6Var).s()) {
                        yh.b bVar = y6Var.Y;
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
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.P == 0 && h8Var.Q == 0 && !h8Var.G) {
                        h8Var.finishFragment();
                        return;
                    }
                    h8Var.G = false;
                    h8Var.P = 0;
                    h8Var.Q = 0;
                    h8Var.t0();
                    h8Var.o0();
                    return;
                }
                return;
            case 24:
                k9 k9Var = (k9) obj;
                if (i10 == -1) {
                    if (k9.Z(k9Var).s()) {
                        k9Var.k0(true);
                        return;
                    } else {
                        k9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    k9Var.p0(false);
                    return;
                } else {
                    return;
                }
            case 25:
                if (i10 == -1) {
                    ((u9) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                z9 z9Var = (z9) obj;
                if (i10 == -1) {
                    z9Var.finishFragment();
                    return;
                } else if (i10 == 1 && z9Var.f39235a.getText().length() != 0) {
                    z9.U(z9Var);
                    z9Var.finishFragment();
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
                    ((wb) obj).finishFragment();
                    return;
                }
                return;
            default:
                cd cdVar = (cd) obj;
                if (i10 == -1) {
                    if (cdVar.f31610b >= cdVar.S0() && cdVar.Q0()) {
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
                    ncVar.setOnTouchListener(new ai.h(2));
                    cdVar.f31625n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cdVar.f31626o0 = ofFloat;
                    ofFloat.addUpdateListener(new hd(cdVar, 1));
                    cdVar.f31626o0.addListener(new v5(cdVar, 7));
                    cdVar.f31626o0.setDuration(400L);
                    cdVar.f31626o0.setInterpolator(pt.e);
                    cdVar.f31626o0.start();
                    frameLayout.addView(cdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new hc(cdVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
