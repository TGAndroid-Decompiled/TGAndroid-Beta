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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lt;
import org.telegram.ui.a6;
import org.telegram.ui.ad;
import org.telegram.ui.fc;
import org.telegram.ui.h8;
import org.telegram.ui.k9;
import org.telegram.ui.kc;
import org.telegram.ui.qa;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.w6;
import org.telegram.ui.z6;
import org.telegram.ui.z9;
public final class t extends org.telegram.ui.ActionBar.j {
    public final int f8598a;
    public final Object f8599b;

    public t(Object obj, int i10) {
        this.f8598a = i10;
        this.f8599b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f8598a;
        Object obj = this.f8599b;
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
                    k0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    k0Var.f9108c.a(true, true);
                    k0Var.setAllowNestedScroll(false);
                    k0Var.S = null;
                    k0Var.G.Y2.N(true);
                    k0Var.E.f23131r.getText().clear();
                    k0Var.E.f23131r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var.E.f23131r);
                    return;
                } else {
                    return;
                }
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).f9086r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.f9112s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    k0Var2.f9107b.a(true, true);
                    k0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(k0Var2.R);
                    k0Var2.R = null;
                    k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                    k0Var2.f9115y.f23131r.getText().clear();
                    k0Var2.f9115y.f23131r.requestFocus();
                    AndroidUtilities.showKeyboard(k0Var2.f9115y.f23131r);
                    return;
                } else {
                    return;
                }
            case 8:
                fi.k0 k0Var3 = ((fi.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.Y2.N(false);
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
                hg.v0 v0Var = (hg.v0) obj;
                if (i10 == -1) {
                    if (v0Var.onBackPressed(true)) {
                        v0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v0Var.a0();
                    return;
                } else {
                    return;
                }
            case 12:
                hg.x0 x0Var = (hg.x0) obj;
                if (i10 == -1) {
                    if (x0Var.onBackPressed(true)) {
                        x0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    x0Var.X();
                    return;
                } else {
                    return;
                }
            case 13:
                hg.f1 f1Var = (hg.f1) obj;
                if (i10 == -1) {
                    if (f1Var.onBackPressed(true)) {
                        f1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f1Var.W();
                    return;
                } else {
                    return;
                }
            case 14:
                hg.h1 h1Var = (hg.h1) obj;
                if (i10 == -1) {
                    if (h1Var.onBackPressed(true)) {
                        h1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h1Var.d0();
                    return;
                } else {
                    return;
                }
            case 15:
                if (i10 == -1) {
                    ((hg.j1) obj).finishFragment();
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
                z6 z6Var = (z6) obj;
                if (i10 == -1) {
                    if (z6.Z(z6Var).s()) {
                        zh.b bVar = z6Var.Y;
                        if (bVar != null) {
                            bVar.d();
                        }
                        w6 w6Var = z6Var.N;
                        if (w6Var != null) {
                            w6Var.e(false);
                            z6Var.N.d();
                            return;
                        }
                        return;
                    }
                    z6Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    z6Var.m0();
                    return;
                } else if (i10 == 3) {
                    z6.f0(z6Var, false);
                    return;
                } else if (i10 == 4) {
                    z6.f0(z6Var, true);
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
                } else if (i10 == 1 && z9Var.f40404a.getText().length() != 0) {
                    z9.U(z9Var);
                    z9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 27:
                qa qaVar = (qa) obj;
                if (i10 == -1) {
                    qaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    qa.Y(qaVar);
                    qa.Z(qaVar);
                    return;
                } else {
                    return;
                }
            case 28:
                if (i10 == -1) {
                    ((ub) obj).finishFragment();
                    return;
                }
                return;
            default:
                ad adVar = (ad) obj;
                if (i10 == -1) {
                    if (adVar.f32087b >= adVar.S0() && adVar.Q0()) {
                        adVar.V0();
                        return;
                    } else {
                        adVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) adVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    adVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    adVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    adVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    kc kcVar = new kc(adVar, adVar.getParentActivity(), canvas, (adVar.L.getMeasuredWidth() / 2.0f) + f7, (adVar.L.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f7, f10, 0);
                    adVar.m0 = kcVar;
                    kcVar.setOnTouchListener(new bi.d(2));
                    adVar.f32102n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    adVar.f32103o0 = ofFloat;
                    ofFloat.addUpdateListener(new ci.ub(adVar, 1));
                    adVar.f32103o0.addListener(new org.telegram.ui.t4(adVar, 17));
                    adVar.f32103o0.setDuration(400L);
                    adVar.f32103o0.setInterpolator(lt.e);
                    adVar.f32103o0.start();
                    frameLayout.addView(adVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new fc(adVar, 0));
                    return;
                } else {
                    return;
                }
        }
    }
}
