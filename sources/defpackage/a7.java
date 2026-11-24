package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class a7 implements View.OnTouchListener {
    public final byte a;
    public final Object b;

    public a7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        float f;
        h74 h74Var;
        float f2;
        wt5 wt5Var;
        m8 m8Var3;
        m8 m8Var4;
        byte b;
        float f3;
        float f4;
        lz9 lz9Var;
        byte b2 = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b2) {
            case 0:
                r7 r7Var = (r7) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
                    view.getHitRect(r7Var.J);
                    if (!r7Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r7Var.d.d(true);
                    }
                }
                return false;
            case 1:
                o oVar = (o) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = oVar.I) != null && m8Var2.isShowing()) {
                    view.getHitRect(oVar.E0);
                    if (!oVar.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oVar.I.d(true);
                    }
                }
                return false;
            case 2:
                c52 c52Var = (c52) obj;
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    c52Var.c0();
                }
                return false;
            case 3:
                hx2 hx2Var = (hx2) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (hx2Var.n) {
                        hx2Var.c();
                    } else {
                        hx2Var.b();
                    }
                }
                return true;
            case 4:
                m8 m8Var5 = (m8) ((f9) obj).b;
                if (motionEvent.getActionMasked() == 1 && m8Var5 != null && m8Var5.isShowing()) {
                    Rect rect = gm.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m8Var5.d(true);
                    }
                }
                return false;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                if (externalActionActivity.c.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int[] iArr = new int[2];
                externalActionActivity.d.getView().getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                if (externalActionActivity.d.h()) {
                    return false;
                }
                if (x > i && x < externalActionActivity.d.getView().getWidth() + i && y > i2 && y < externalActionActivity.d.getView().getHeight() + i2) {
                    return false;
                }
                if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                    while (true) {
                        int size = externalActionActivity.d.getFragmentStack().size() - 1;
                        ActionBarLayout actionBarLayout = externalActionActivity.d;
                        if (size > 0) {
                            actionBarLayout.c0((d) actionBarLayout.getFragmentStack().get(0), false);
                        } else {
                            actionBarLayout.j(true, false);
                        }
                    }
                }
                return true;
            case 6:
                q qVar = (q) obj;
                if (qVar.Q == null || qVar.S == null) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                float f5 = 0.0f;
                if (actionMasked == 0) {
                    ValueAnimator valueAnimator = qVar.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.E0 = false;
                    qVar.C0 = motionEvent.getPointerId(0);
                    qVar.D0 = -1;
                    int i3 = qVar.S.a;
                    if (i3 == 5) {
                        ImageView imageView = qVar.J;
                        un9 un9Var = qVar.Q;
                        if (un9Var != null && i3 == 5) {
                            boolean z2 = qVar.l0;
                            qVar.l0 = !z2;
                            un9.v();
                            if (un9Var.a0 == 5 && (h74Var = un9Var.W) != null) {
                                if (!z2) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = 1.0f;
                                }
                                h74Var.R(f2);
                            }
                            rcc rccVar = qVar.V;
                            if (rccVar != null) {
                                rccVar.t = qVar.l0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (qVar.l0) {
                                f5 = 1.0f;
                            }
                            wi8.s(animate, f5, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        tn9 tn9Var = qVar.S;
                        if (tn9Var.a == 3 && !tn9Var.f) {
                            qVar.C0 = motionEvent.getPointerId(0);
                            qVar.D0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            qVar.A0 = hypot;
                            if (hypot > 0.0f) {
                                z = true;
                            }
                            qVar.E0 = z;
                            qVar.B0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && qVar.E0) {
                        int findPointerIndex = motionEvent.findPointerIndex(qVar.C0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(qVar.D0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / qVar.A0;
                            mn9 mn9Var = qVar.T;
                            if (mn9Var == null) {
                                f = 1.0f;
                            } else {
                                f = mn9Var.c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f > 1.0f) {
                                f5 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f - 1.0f)));
                            }
                            qVar.B0 = f5;
                            qVar.Q.y(f5);
                        } else {
                            qVar.l();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && qVar.E0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == qVar.C0 || pointerId == qVar.D0) {
                            qVar.l();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && qVar.E0) {
                        qVar.l();
                    }
                }
                return true;
            case 7:
                bu5 bu5Var = (bu5) ((WeakReference) obj).get();
                if (bu5Var != null && (wt5Var = bu5Var.m) != null && wt5Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 2) {
                        bu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked2 == 1) {
                        bu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = bu5Var.s0;
                        if (view2 != null) {
                            bu5Var.s0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        bu5Var.r0 = null;
                    } else if (actionMasked2 == 3) {
                        View view3 = bu5Var.s0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            bu5Var.s0 = null;
                        }
                        view.setOnTouchListener(null);
                        bu5Var.r0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 8:
                ry5 ry5Var = (ry5) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var3 = ry5Var.H1) != null && m8Var3.isShowing()) {
                    view.getHitRect(ry5Var.J1);
                    if (!ry5Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ry5Var.H1.d(true);
                    }
                }
                return false;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                if (launchActivity.p0.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int[] iArr2 = new int[2];
                launchActivity.q0.getView().getLocationOnScreen(iArr2);
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                if (launchActivity.q0.h()) {
                    return false;
                }
                if (x2 > i4 && x2 < launchActivity.q0.getView().getWidth() + i4 && y2 > i5 && y2 < launchActivity.q0.getView().getHeight() + i5) {
                    return false;
                }
                if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                    while (true) {
                        int size2 = launchActivity.q0.getFragmentStack().size() - 1;
                        ActionBarLayout actionBarLayout2 = launchActivity.q0;
                        if (size2 > 0) {
                            actionBarLayout2.c0(actionBarLayout2.getFragmentStack().get(0), false);
                        } else {
                            actionBarLayout2.j(true, false);
                        }
                    }
                }
                return true;
            case 10:
                u17 u17Var = (u17) obj;
                u17Var.getClass();
                return hx2.e().h(motionEvent, u17Var.getListView(), u17Var.x, null, u17Var.a);
            case 11:
                f57 f57Var = (f57) obj;
                if (motionEvent.getAction() == 1) {
                    f57Var.d0.a(true);
                }
                return true;
            case 12:
                xv7 xv7Var = (xv7) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var4 = xv7Var.x1) != null && m8Var4.isShowing()) {
                    view.getHitRect(xv7Var.z1);
                    if (!xv7Var.z1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        xv7Var.x1.d(true);
                    }
                }
                return false;
            case 13:
                s68 s68Var = (s68) obj;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int L = gm.L(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f6 = s68Var.f;
                    float f7 = L;
                    float f8 = f6 - f7;
                    int i6 = (f8 > x3 ? 1 : (f8 == x3 ? 0 : -1));
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f9 = s68Var.h;
                        if (f9 - f7 < y3 && f9 + f7 > y3) {
                            s68Var.n = (byte) 1;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    float f10 = s68Var.d;
                    int i7 = ((f8 + f10) > x3 ? 1 : ((f8 + f10) == x3 ? 0 : -1));
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f11 = s68Var.h;
                        if (f11 - f7 < y3 && f11 + f7 > y3) {
                            s68Var.n = (byte) 2;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f12 = s68Var.h;
                        float f13 = s68Var.e;
                        if ((f12 - f7) + f13 < y3 && f12 + f7 + f13 > y3) {
                            s68Var.n = (byte) 3;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f14 = s68Var.h;
                        float f15 = s68Var.e;
                        if ((f14 - f7) + f15 < y3 && f14 + f7 + f15 > y3) {
                            s68Var.n = (byte) 4;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (f6 < x3 && f6 + f10 > x3) {
                        float f16 = s68Var.h;
                        if (f16 < y3 && f16 + s68Var.e > y3) {
                            s68Var.n = (byte) 5;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    s68Var.n = (byte) 0;
                    s68Var.r = x3;
                    s68Var.s = y3;
                } else if (motionEvent.getAction() == 1) {
                    s68Var.n = (byte) 0;
                } else if (motionEvent.getAction() == 2 && (b = s68Var.n) != 0) {
                    float f17 = x3 - s68Var.r;
                    float f18 = y3 - s68Var.s;
                    if (b == 5) {
                        float f19 = s68Var.f + f17;
                        s68Var.f = f19;
                        float f20 = s68Var.h + f18;
                        s68Var.h = f20;
                        int i8 = s68Var.y;
                        float f21 = i8;
                        if (f19 < f21) {
                            s68Var.f = f21;
                        } else {
                            float f22 = s68Var.d;
                            float f23 = i8 + s68Var.w;
                            if (f19 + f22 > f23) {
                                s68Var.f = f23 - f22;
                            }
                        }
                        int i9 = s68Var.E;
                        float f24 = i9;
                        if (f20 < f24) {
                            s68Var.h = f24;
                        } else {
                            float f25 = s68Var.e;
                            float f26 = i9 + s68Var.x;
                            if (f20 + f25 > f26) {
                                s68Var.h = f26 - f25;
                            }
                        }
                    } else if (b == 1) {
                        float f27 = s68Var.d;
                        if (f27 - f17 < 160.0f) {
                            f17 = f27 - 160.0f;
                        }
                        float f28 = s68Var.f;
                        float f29 = s68Var.y;
                        if (f28 + f17 < f29) {
                            f17 = f29 - f28;
                        }
                        if (!s68Var.H) {
                            float f30 = s68Var.h;
                            float f31 = s68Var.E;
                            if (f30 + f17 < f31) {
                                f17 = f31 - f30;
                            }
                            s68Var.f = f28 + f17;
                            s68Var.h = f30 + f17;
                            s68Var.d = f27 - f17;
                            s68Var.e -= f17;
                        } else {
                            float f32 = s68Var.e;
                            if (f32 - f18 < 160.0f) {
                                f18 = f32 - 160.0f;
                            }
                            float f33 = s68Var.h;
                            float f34 = s68Var.E;
                            if (f33 + f18 < f34) {
                                f18 = f34 - f33;
                            }
                            s68Var.f = f28 + f17;
                            s68Var.h = f33 + f18;
                            s68Var.d = f27 - f17;
                            s68Var.e = f32 - f18;
                        }
                    } else if (b == 2) {
                        float f35 = s68Var.d;
                        if (f35 + f17 < 160.0f) {
                            f17 = -(f35 - 160.0f);
                        }
                        float f36 = s68Var.f;
                        float f37 = s68Var.y + s68Var.w;
                        if (f36 + f35 + f17 > f37) {
                            f17 = (f37 - f36) - f35;
                        }
                        if (!s68Var.H) {
                            float f38 = s68Var.h;
                            float f39 = s68Var.E;
                            if (f38 - f17 < f39) {
                                f17 = f38 - f39;
                            }
                            s68Var.h = f38 - f17;
                            s68Var.d = f35 + f17;
                            s68Var.e += f17;
                        } else {
                            float f40 = s68Var.e;
                            if (f40 - f18 < 160.0f) {
                                f18 = f40 - 160.0f;
                            }
                            float f41 = s68Var.h;
                            float f42 = s68Var.E;
                            if (f41 + f18 < f42) {
                                f18 = f42 - f41;
                            }
                            s68Var.h = f41 + f18;
                            s68Var.d = f35 + f17;
                            s68Var.e = f40 - f18;
                        }
                    } else if (b == 3) {
                        float f43 = s68Var.d;
                        if (f43 - f17 < 160.0f) {
                            f17 = f43 - 160.0f;
                        }
                        float f44 = s68Var.f;
                        float f45 = s68Var.y;
                        if (f44 + f17 < f45) {
                            f17 = f45 - f44;
                        }
                        boolean z3 = s68Var.H;
                        float f46 = s68Var.h;
                        if (!z3) {
                            float f47 = f46 + f43;
                            int i10 = s68Var.E;
                            int i11 = s68Var.x;
                            if (f47 - f17 > i10 + i11) {
                                f17 = (f47 - i10) - i11;
                            }
                            s68Var.f = f44 + f17;
                            s68Var.d = f43 - f17;
                            s68Var.e -= f17;
                        } else {
                            float f48 = s68Var.e;
                            float f49 = s68Var.E + s68Var.x;
                            if (f46 + f48 + f18 > f49) {
                                f18 = (f49 - f46) - f48;
                            }
                            s68Var.f = f44 + f17;
                            s68Var.d = f43 - f17;
                            float f50 = f48 + f18;
                            s68Var.e = f50;
                            if (f50 < 160.0f) {
                                s68Var.e = 160.0f;
                            }
                        }
                    } else if (b == 4) {
                        float f51 = s68Var.f;
                        float f52 = s68Var.d;
                        float f53 = s68Var.y + s68Var.w;
                        if (f51 + f52 + f17 > f53) {
                            f17 = (f53 - f51) - f52;
                        }
                        boolean z4 = s68Var.H;
                        float f54 = s68Var.h;
                        if (!z4) {
                            float f55 = s68Var.E + s68Var.x;
                            if (f54 + f52 + f17 > f55) {
                                f17 = (f55 - f54) - f52;
                            }
                            f3 = f52 + f17;
                            s68Var.d = f3;
                            f4 = s68Var.e + f17;
                            s68Var.e = f4;
                        } else {
                            float f56 = s68Var.e;
                            float f57 = s68Var.E + s68Var.x;
                            if (f54 + f56 + f18 > f57) {
                                f18 = (f57 - f54) - f56;
                            }
                            f3 = f52 + f17;
                            s68Var.d = f3;
                            f4 = f56 + f18;
                            s68Var.e = f4;
                        }
                        if (f3 < 160.0f) {
                            s68Var.d = 160.0f;
                        }
                        if (f4 < 160.0f) {
                            s68Var.e = 160.0f;
                        }
                    }
                    s68Var.r = x3;
                    s68Var.s = y3;
                    s68Var.invalidate();
                }
                return true;
            case 14:
                xg8 xg8Var = (xg8) obj;
                if (xg8Var.U == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) xg8Var.U).getBackgroundDrawable();
                RectF rectF = gm.P;
                rectF.set(backgroundDrawable.getBounds());
                rectF.offset(xg8Var.U.getX(), xg8Var.U.getY());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                xg8Var.b(true);
                return true;
            case 15:
                vz9 vz9Var = (vz9) obj;
                if (motionEvent.getAction() != 0 || (lz9Var = vz9Var.V1) == null) {
                    return false;
                }
                lz9Var.run();
                return true;
            case 16:
                x2b x2bVar = (x2b) obj;
                if (x2bVar.L1) {
                    return false;
                }
                return hx2.e().h(motionEvent, x2bVar.m1, x2bVar.B1, x2bVar.g2, x2bVar.J0);
            default:
                krb krbVar = (krb) obj;
                if (krbVar.T == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) krbVar.T).getBackgroundDrawable();
                RectF rectF2 = gm.P;
                rectF2.set(backgroundDrawable2.getBounds());
                rectF2.offset(krbVar.T.getX(), krbVar.T.getY());
                if (rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                krbVar.b(true);
                return true;
        }
    }
}
