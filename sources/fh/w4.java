package fh;

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
import kh.fb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.xs;
import org.telegram.ui.ac;
import org.telegram.ui.bq;
import org.telegram.ui.g8;
import org.telegram.ui.gc;
import org.telegram.ui.ho;
import org.telegram.ui.hp;
import org.telegram.ui.i9;
import org.telegram.ui.ma;
import org.telegram.ui.op;
import org.telegram.ui.pb;
import org.telegram.ui.s9;
import org.telegram.ui.vo;
import org.telegram.ui.x9;
import org.telegram.ui.xc;
import org.telegram.ui.y6;
public final class w4 extends org.telegram.ui.ActionBar.j {
    public final int f6834a;
    public final Object f6835b;

    public w4(Object obj, int i9) {
        this.f6834a = i9;
        this.f6835b = obj;
    }

    @Override
    public final void b(int i9) {
        int i10 = this.f6834a;
        Object obj = this.f6835b;
        switch (i10) {
            case 0:
                if (i9 == -1) {
                    ((g6) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i9 == -1) {
                    ((gh.r) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                hg.s sVar = (hg.s) obj;
                if (i9 == -1 && !sVar.W(true)) {
                    sVar.finishFragment();
                    return;
                }
                return;
            case 3:
                if (i9 == -1) {
                    ((mh.t) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i9 == -1) {
                    ((mh.c3) obj).q();
                    return;
                }
                return;
            case 5:
                if (i9 == -1) {
                    ((mh.r4) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i9 == -1) {
                    ((nh.f) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i9 == -1) {
                    ((nh.o) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i9 == -1) {
                    ((nh.r) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                nh.j0 j0Var = ((nh.d0) obj).h;
                if (i9 == -1) {
                    if (j0Var.J) {
                        j0Var.dismiss();
                        return;
                    }
                    j0Var.v.d.U2.N(false);
                    j0Var.d.D(0);
                    return;
                } else if (i9 == 3) {
                    j0Var.f18650c.a(true, true);
                    j0Var.setAllowNestedScroll(false);
                    j0Var.O = null;
                    j0Var.C.U2.N(true);
                    j0Var.A.f30664r.getText().clear();
                    j0Var.A.f30664r.requestFocus();
                    AndroidUtilities.showKeyboard(j0Var.A.f30664r);
                    return;
                } else {
                    return;
                }
            case 10:
                nh.j0 j0Var2 = ((nh.e0) obj).f18627r;
                if (i9 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", j0Var2.f18651e);
                    j0Var2.f18655s.presentFragment(new nh.o(bundle));
                    j0Var2.dismiss();
                    return;
                } else if (i9 == 3) {
                    j0Var2.f18649b.a(true, true);
                    j0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(j0Var2.N);
                    j0Var2.N = null;
                    j0Var2.B.h(0L, j0Var2.f18651e, 0L, 0L, null, false, null, true);
                    j0Var2.f18658y.f30664r.getText().clear();
                    j0Var2.f18658y.f30664r.requestFocus();
                    AndroidUtilities.showKeyboard(j0Var2.f18658y.f30664r);
                    return;
                } else {
                    return;
                }
            case 11:
                nh.j0 j0Var3 = ((nh.i0) obj).h;
                if (i9 == -1) {
                    j0Var3.v.d.U2.N(false);
                    j0Var3.d.D(0);
                    return;
                }
                return;
            case 12:
                if (i9 == -1) {
                    ((org.telegram.ui.h) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i9 == -1) {
                    ((org.telegram.ui.l) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i9 == -1) {
                    ((org.telegram.ui.p) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i9 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i9 == -1) {
                    ((org.telegram.ui.z5) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                y6 y6Var = (y6) obj;
                if (i9 == -1) {
                    if (y6.Y(y6Var).s()) {
                        hh.b bVar = y6Var.U;
                        if (bVar != null) {
                            bVar.d();
                        }
                        org.telegram.ui.v6 v6Var = y6Var.J;
                        if (v6Var != null) {
                            v6Var.e(false);
                            y6Var.J.d();
                            return;
                        }
                        return;
                    }
                    y6Var.finishFragment();
                    return;
                } else if (i9 == 1) {
                    y6Var.l0();
                    return;
                } else if (i9 == 3) {
                    y6.e0(y6Var, false);
                    return;
                } else if (i9 == 4) {
                    y6.e0(y6Var, true);
                    return;
                } else {
                    return;
                }
            case 18:
                g8 g8Var = (g8) obj;
                if (i9 == -1) {
                    if (g8Var.L == 0 && g8Var.M == 0 && !g8Var.C) {
                        g8Var.finishFragment();
                        return;
                    }
                    g8Var.C = false;
                    g8Var.L = 0;
                    g8Var.M = 0;
                    g8Var.s0();
                    g8Var.n0();
                    return;
                }
                return;
            case 19:
                i9 i9Var = (i9) obj;
                if (i9 == -1) {
                    if (i9.Y(i9Var).s()) {
                        i9Var.j0(true);
                        return;
                    } else {
                        i9Var.finishFragment();
                        return;
                    }
                } else if (i9 == 2) {
                    i9Var.o0(false);
                    return;
                } else {
                    return;
                }
            case 20:
                if (i9 == -1) {
                    ((s9) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                x9 x9Var = (x9) obj;
                if (i9 == -1) {
                    x9Var.finishFragment();
                    return;
                } else if (i9 == 1 && x9Var.f44406a.getText().length() != 0) {
                    x9.T(x9Var);
                    x9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 22:
                ma maVar = (ma) obj;
                if (i9 == -1) {
                    maVar.finishFragment();
                    return;
                } else if (i9 == 1) {
                    ma.X(maVar);
                    ma.Y(maVar);
                    return;
                } else {
                    return;
                }
            case 23:
                if (i9 == -1) {
                    ((pb) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                xc xcVar = (xc) obj;
                if (i9 == -1) {
                    if (xcVar.f44462b >= xcVar.S0() && xcVar.Q0()) {
                        xcVar.V0();
                        return;
                    } else {
                        xcVar.finishFragment();
                        return;
                    }
                } else if (i9 == 1) {
                    FrameLayout frameLayout = (FrameLayout) xcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    xcVar.H.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    xcVar.H.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    xcVar.H.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    gc gcVar = new gc(xcVar, xcVar.getParentActivity(), canvas, (xcVar.H.getMeasuredWidth() / 2.0f) + f10, (xcVar.H.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 0);
                    xcVar.f44473i0 = gcVar;
                    gcVar.setOnTouchListener(new jh.d(2));
                    xcVar.f44474j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xcVar.f44475k0 = ofFloat;
                    ofFloat.addUpdateListener(new fb(xcVar, 1));
                    xcVar.f44475k0.addListener(new mh.x(xcVar, 23));
                    xcVar.f44475k0.setDuration(400L);
                    xcVar.f44475k0.setInterpolator(xs.f34754e);
                    xcVar.f44475k0.start();
                    frameLayout.addView(xcVar.f44473i0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new ac(xcVar, 0));
                    return;
                } else {
                    return;
                }
            case 25:
                ho hoVar = (ho) obj;
                if (i9 == -1) {
                    if (hoVar.d0(true)) {
                        hoVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    hoVar.i0();
                    return;
                } else {
                    return;
                }
            case 26:
                vo voVar = (vo) obj;
                if (i9 == -1) {
                    voVar.finishFragment();
                    return;
                } else if (i9 == 1) {
                    fr frVar = voVar.f43545r;
                    if (frVar == null || frVar.f28558c <= 0.0f) {
                        voVar.X();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 27:
                if (i9 == -1) {
                    ((hp) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i9 == -1) {
                    ((op) obj).finishFragment();
                    return;
                }
                return;
            default:
                bq bqVar = (bq) obj;
                if (i9 == -1) {
                    if (bqVar.l0(true)) {
                        bqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    bqVar.q0(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
