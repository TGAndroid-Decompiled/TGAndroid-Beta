package ag;

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
import gh.y5;
import lh.cb;
import lh.h9;
import nh.p4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ws;
import org.telegram.ui.a6;
import org.telegram.ui.bc;
import org.telegram.ui.h8;
import org.telegram.ui.hc;
import org.telegram.ui.j9;
import org.telegram.ui.jo;
import org.telegram.ui.jp;
import org.telegram.ui.na;
import org.telegram.ui.q4;
import org.telegram.ui.qb;
import org.telegram.ui.qp;
import org.telegram.ui.t9;
import org.telegram.ui.w6;
import org.telegram.ui.xc;
import org.telegram.ui.xo;
import org.telegram.ui.y9;
import org.telegram.ui.z6;

public final class e2 extends org.telegram.ui.ActionBar.j {

    public final int f355a;

    public final Object f356b;

    public e2(Object obj, int i10) {
        this.f355a = i10;
        this.f356b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f355a;
        Object obj = this.f356b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((g2) obj).dismiss();
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((y5) obj).finishFragment();
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((hh.r) obj).finishFragment();
                }
                break;
            case 3:
                ig.s sVar = (ig.s) obj;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((nh.s) obj).finishFragment();
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((nh.b3) obj).q();
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((p4) obj).finishFragment();
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((oh.f) obj).finishFragment();
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((oh.o) obj).finishFragment();
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((oh.r) obj).finishFragment();
                }
                break;
            case 10:
                oh.j0 j0Var = ((oh.d0) obj).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        j0Var.f19499c.a(true, true);
                        j0Var.setAllowNestedScroll(false);
                        j0Var.O = null;
                        j0Var.C.U2.N(true);
                        j0Var.A.f31468r.getText().clear();
                        j0Var.A.f31468r.requestFocus();
                        AndroidUtilities.showKeyboard(j0Var.A.f31468r);
                    }
                } else if (!j0Var.J) {
                    j0Var.v.d.U2.N(false);
                    j0Var.d.D(0);
                } else {
                    j0Var.dismiss();
                }
                break;
            case 11:
                oh.j0 j0Var2 = ((oh.e0) obj).f19476r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", j0Var2.f19500e);
                    j0Var2.f19504s.presentFragment(new oh.o(bundle));
                    j0Var2.dismiss();
                } else if (i10 == 3) {
                    j0Var2.f19498b.a(true, true);
                    j0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(j0Var2.N);
                    j0Var2.N = null;
                    j0Var2.B.h(0L, j0Var2.f19500e, 0L, 0L, null, false, null, true);
                    j0Var2.f19507y.f31468r.getText().clear();
                    j0Var2.f19507y.f31468r.requestFocus();
                    AndroidUtilities.showKeyboard(j0Var2.f19507y.f31468r);
                }
                break;
            case 12:
                oh.j0 j0Var3 = ((oh.i0) obj).h;
                if (i10 == -1) {
                    j0Var3.v.d.U2.N(false);
                    j0Var3.d.D(0);
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.h) obj).finishFragment();
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.m) obj).finishFragment();
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.q) obj).finishFragment();
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((q4) obj).finishFragment();
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((a6) obj).finishFragment();
                }
                break;
            case 18:
                z6 z6Var = (z6) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        z6Var.m0();
                    } else if (i10 == 3) {
                        z6.f0(z6Var, false);
                    } else if (i10 == 4) {
                        z6.f0(z6Var, true);
                    }
                } else if (!((org.telegram.ui.ActionBar.n2) z6Var).actionBar.t()) {
                    z6Var.finishFragment();
                } else {
                    ih.b bVar = z6Var.U;
                    if (bVar != null) {
                        bVar.d();
                    }
                    w6 w6Var = z6Var.J;
                    if (w6Var != null) {
                        w6Var.e(false);
                        z6Var.J.d();
                    }
                }
                break;
            case 19:
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.L == 0 && h8Var.M == 0 && !h8Var.C) {
                        h8Var.finishFragment();
                    } else {
                        h8Var.C = false;
                        h8Var.L = 0;
                        h8Var.M = 0;
                        h8Var.t0();
                        h8Var.o0();
                    }
                }
                break;
            case 20:
                j9 j9Var = (j9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        j9Var.p0(false);
                    }
                } else if (!((org.telegram.ui.ActionBar.n2) j9Var).actionBar.t()) {
                    j9Var.finishFragment();
                } else {
                    j9Var.k0(true);
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((t9) obj).finishFragment();
                }
                break;
            case 22:
                y9 y9Var = (y9) obj;
                if (i10 == -1) {
                    y9Var.finishFragment();
                    break;
                } else if (i10 == 1 && y9Var.f44740a.getText().length() != 0) {
                    y9.U(y9Var);
                    y9Var.finishFragment();
                    break;
                }
                break;
            case 23:
                na naVar = (na) obj;
                if (i10 == -1) {
                    naVar.finishFragment();
                } else if (i10 == 1) {
                    na.Y(naVar);
                    na.Z(naVar);
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((qb) obj).finishFragment();
                }
                break;
            case 25:
                xc xcVar = (xc) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) xcVar.getParentActivity().getWindow().getDecorView();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
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
                        float measuredWidth = (xcVar.H.getMeasuredWidth() / 2.0f) + f10;
                        float measuredHeight = (xcVar.H.getMeasuredHeight() / 2.0f) + f11;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        hc hcVar = new hc(xcVar, xcVar.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 0);
                        xcVar.f44393i0 = hcVar;
                        hcVar.setOnTouchListener(new kh.e(2));
                        xcVar.f44394j0 = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        xcVar.f44395k0 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new cb(xcVar, 1));
                        xcVar.f44395k0.addListener(new h9(xcVar, 25));
                        xcVar.f44395k0.setDuration(400L);
                        xcVar.f44395k0.setInterpolator(ws.f34319e);
                        xcVar.f44395k0.start();
                        frameLayout.addView(xcVar.f44393i0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new bc(xcVar, 0));
                    }
                } else if (xcVar.f44382b >= xcVar.S0() && xcVar.Q0()) {
                    xcVar.V0();
                } else {
                    xcVar.finishFragment();
                }
                break;
            case 26:
                jo joVar = (jo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        joVar.j0();
                    }
                } else if (joVar.e0(true)) {
                    joVar.finishFragment();
                }
                break;
            case 27:
                xo xoVar = (xo) obj;
                if (i10 == -1) {
                    xoVar.finishFragment();
                } else if (i10 == 1) {
                    dr drVar = xoVar.f44569r;
                    if (drVar == null || drVar.f27834c <= 0.0f) {
                        xoVar.Y();
                    }
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((jp) obj).finishFragment();
                }
                break;
            default:
                if (i10 == -1) {
                    ((qp) obj).finishFragment();
                }
                break;
        }
    }
}
