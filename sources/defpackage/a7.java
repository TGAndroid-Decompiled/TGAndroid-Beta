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
        y54 y54Var;
        float f2;
        xr5 xr5Var;
        m8 m8Var3;
        m8 m8Var4;
        byte b;
        float f3;
        float f4;
        jx9 jx9Var;
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
                r32 r32Var = (r32) obj;
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    r32Var.c0();
                }
                return false;
            case 3:
                xv2 xv2Var = (xv2) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (xv2Var.n) {
                        xv2Var.c();
                    } else {
                        xv2Var.b();
                    }
                }
                return true;
            case 4:
                m8 m8Var5 = (m8) ((f9) obj).b;
                if (motionEvent.getActionMasked() == 1 && m8Var5 != null && m8Var5.isShowing()) {
                    Rect rect = gl.Q;
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
                        ul9 ul9Var = qVar.Q;
                        if (ul9Var != null && i3 == 5) {
                            boolean z2 = qVar.l0;
                            qVar.l0 = !z2;
                            ul9.v();
                            if (ul9Var.a0 == 5 && (y54Var = ul9Var.W) != null) {
                                if (!z2) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = 1.0f;
                                }
                                y54Var.R(f2);
                            }
                            oac oacVar = qVar.V;
                            if (oacVar != null) {
                                oacVar.t = qVar.l0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (qVar.l0) {
                                f5 = 1.0f;
                            }
                            ug8.s(animate, f5, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        tl9 tl9Var = qVar.S;
                        if (tl9Var.a == 3 && !tl9Var.f) {
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
                            ml9 ml9Var = qVar.T;
                            if (ml9Var == null) {
                                f = 1.0f;
                            } else {
                                f = ml9Var.c;
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
                cs5 cs5Var = (cs5) ((WeakReference) obj).get();
                if (cs5Var != null && (xr5Var = cs5Var.m) != null && xr5Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 2) {
                        cs5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked2 == 1) {
                        cs5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = cs5Var.s0;
                        if (view2 != null) {
                            cs5Var.s0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        cs5Var.r0 = null;
                    } else if (actionMasked2 == 3) {
                        View view3 = cs5Var.s0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            cs5Var.s0 = null;
                        }
                        view.setOnTouchListener(null);
                        cs5Var.r0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 8:
                rw5 rw5Var = (rw5) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var3 = rw5Var.H1) != null && m8Var3.isShowing()) {
                    view.getHitRect(rw5Var.J1);
                    if (!rw5Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rw5Var.H1.d(true);
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
                uz6 uz6Var = (uz6) obj;
                uz6Var.getClass();
                return xv2.e().h(motionEvent, uz6Var.getListView(), uz6Var.x, null, uz6Var.a);
            case 11:
                f37 f37Var = (f37) obj;
                if (motionEvent.getAction() == 1) {
                    f37Var.d0.a(true);
                }
                return true;
            case 12:
                wt7 wt7Var = (wt7) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var4 = wt7Var.x1) != null && m8Var4.isShowing()) {
                    view.getHitRect(wt7Var.z1);
                    if (!wt7Var.z1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wt7Var.x1.d(true);
                    }
                }
                return false;
            case 13:
                q48 q48Var = (q48) obj;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int L = gl.L(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f6 = q48Var.f;
                    float f7 = L;
                    float f8 = f6 - f7;
                    int i6 = (f8 > x3 ? 1 : (f8 == x3 ? 0 : -1));
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f9 = q48Var.h;
                        if (f9 - f7 < y3 && f9 + f7 > y3) {
                            q48Var.n = (byte) 1;
                            q48Var.requestDisallowInterceptTouchEvent(true);
                            q48Var.r = x3;
                            q48Var.s = y3;
                        }
                    }
                    float f10 = q48Var.d;
                    int i7 = ((f8 + f10) > x3 ? 1 : ((f8 + f10) == x3 ? 0 : -1));
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f11 = q48Var.h;
                        if (f11 - f7 < y3 && f11 + f7 > y3) {
                            q48Var.n = (byte) 2;
                            q48Var.requestDisallowInterceptTouchEvent(true);
                            q48Var.r = x3;
                            q48Var.s = y3;
                        }
                    }
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f12 = q48Var.h;
                        float f13 = q48Var.e;
                        if ((f12 - f7) + f13 < y3 && f12 + f7 + f13 > y3) {
                            q48Var.n = (byte) 3;
                            q48Var.requestDisallowInterceptTouchEvent(true);
                            q48Var.r = x3;
                            q48Var.s = y3;
                        }
                    }
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f14 = q48Var.h;
                        float f15 = q48Var.e;
                        if ((f14 - f7) + f15 < y3 && f14 + f7 + f15 > y3) {
                            q48Var.n = (byte) 4;
                            q48Var.requestDisallowInterceptTouchEvent(true);
                            q48Var.r = x3;
                            q48Var.s = y3;
                        }
                    }
                    if (f6 < x3 && f6 + f10 > x3) {
                        float f16 = q48Var.h;
                        if (f16 < y3 && f16 + q48Var.e > y3) {
                            q48Var.n = (byte) 5;
                            q48Var.requestDisallowInterceptTouchEvent(true);
                            q48Var.r = x3;
                            q48Var.s = y3;
                        }
                    }
                    q48Var.n = (byte) 0;
                    q48Var.r = x3;
                    q48Var.s = y3;
                } else if (motionEvent.getAction() == 1) {
                    q48Var.n = (byte) 0;
                } else if (motionEvent.getAction() == 2 && (b = q48Var.n) != 0) {
                    float f17 = x3 - q48Var.r;
                    float f18 = y3 - q48Var.s;
                    if (b == 5) {
                        float f19 = q48Var.f + f17;
                        q48Var.f = f19;
                        float f20 = q48Var.h + f18;
                        q48Var.h = f20;
                        int i8 = q48Var.y;
                        float f21 = i8;
                        if (f19 < f21) {
                            q48Var.f = f21;
                        } else {
                            float f22 = q48Var.d;
                            float f23 = i8 + q48Var.w;
                            if (f19 + f22 > f23) {
                                q48Var.f = f23 - f22;
                            }
                        }
                        int i9 = q48Var.E;
                        float f24 = i9;
                        if (f20 < f24) {
                            q48Var.h = f24;
                        } else {
                            float f25 = q48Var.e;
                            float f26 = i9 + q48Var.x;
                            if (f20 + f25 > f26) {
                                q48Var.h = f26 - f25;
                            }
                        }
                    } else if (b == 1) {
                        float f27 = q48Var.d;
                        if (f27 - f17 < 160.0f) {
                            f17 = f27 - 160.0f;
                        }
                        float f28 = q48Var.f;
                        float f29 = q48Var.y;
                        if (f28 + f17 < f29) {
                            f17 = f29 - f28;
                        }
                        if (!q48Var.H) {
                            float f30 = q48Var.h;
                            float f31 = q48Var.E;
                            if (f30 + f17 < f31) {
                                f17 = f31 - f30;
                            }
                            q48Var.f = f28 + f17;
                            q48Var.h = f30 + f17;
                            q48Var.d = f27 - f17;
                            q48Var.e -= f17;
                        } else {
                            float f32 = q48Var.e;
                            if (f32 - f18 < 160.0f) {
                                f18 = f32 - 160.0f;
                            }
                            float f33 = q48Var.h;
                            float f34 = q48Var.E;
                            if (f33 + f18 < f34) {
                                f18 = f34 - f33;
                            }
                            q48Var.f = f28 + f17;
                            q48Var.h = f33 + f18;
                            q48Var.d = f27 - f17;
                            q48Var.e = f32 - f18;
                        }
                    } else if (b == 2) {
                        float f35 = q48Var.d;
                        if (f35 + f17 < 160.0f) {
                            f17 = -(f35 - 160.0f);
                        }
                        float f36 = q48Var.f;
                        float f37 = q48Var.y + q48Var.w;
                        if (f36 + f35 + f17 > f37) {
                            f17 = (f37 - f36) - f35;
                        }
                        if (!q48Var.H) {
                            float f38 = q48Var.h;
                            float f39 = q48Var.E;
                            if (f38 - f17 < f39) {
                                f17 = f38 - f39;
                            }
                            q48Var.h = f38 - f17;
                            q48Var.d = f35 + f17;
                            q48Var.e += f17;
                        } else {
                            float f40 = q48Var.e;
                            if (f40 - f18 < 160.0f) {
                                f18 = f40 - 160.0f;
                            }
                            float f41 = q48Var.h;
                            float f42 = q48Var.E;
                            if (f41 + f18 < f42) {
                                f18 = f42 - f41;
                            }
                            q48Var.h = f41 + f18;
                            q48Var.d = f35 + f17;
                            q48Var.e = f40 - f18;
                        }
                    } else if (b == 3) {
                        float f43 = q48Var.d;
                        if (f43 - f17 < 160.0f) {
                            f17 = f43 - 160.0f;
                        }
                        float f44 = q48Var.f;
                        float f45 = q48Var.y;
                        if (f44 + f17 < f45) {
                            f17 = f45 - f44;
                        }
                        boolean z3 = q48Var.H;
                        float f46 = q48Var.h;
                        if (!z3) {
                            float f47 = f46 + f43;
                            int i10 = q48Var.E;
                            int i11 = q48Var.x;
                            if (f47 - f17 > i10 + i11) {
                                f17 = (f47 - i10) - i11;
                            }
                            q48Var.f = f44 + f17;
                            q48Var.d = f43 - f17;
                            q48Var.e -= f17;
                        } else {
                            float f48 = q48Var.e;
                            float f49 = q48Var.E + q48Var.x;
                            if (f46 + f48 + f18 > f49) {
                                f18 = (f49 - f46) - f48;
                            }
                            q48Var.f = f44 + f17;
                            q48Var.d = f43 - f17;
                            float f50 = f48 + f18;
                            q48Var.e = f50;
                            if (f50 < 160.0f) {
                                q48Var.e = 160.0f;
                            }
                        }
                    } else if (b == 4) {
                        float f51 = q48Var.f;
                        float f52 = q48Var.d;
                        float f53 = q48Var.y + q48Var.w;
                        if (f51 + f52 + f17 > f53) {
                            f17 = (f53 - f51) - f52;
                        }
                        boolean z4 = q48Var.H;
                        float f54 = q48Var.h;
                        if (!z4) {
                            float f55 = q48Var.E + q48Var.x;
                            if (f54 + f52 + f17 > f55) {
                                f17 = (f55 - f54) - f52;
                            }
                            f3 = f52 + f17;
                            q48Var.d = f3;
                            f4 = q48Var.e + f17;
                            q48Var.e = f4;
                        } else {
                            float f56 = q48Var.e;
                            float f57 = q48Var.E + q48Var.x;
                            if (f54 + f56 + f18 > f57) {
                                f18 = (f57 - f54) - f56;
                            }
                            f3 = f52 + f17;
                            q48Var.d = f3;
                            f4 = f56 + f18;
                            q48Var.e = f4;
                        }
                        if (f3 < 160.0f) {
                            q48Var.d = 160.0f;
                        }
                        if (f4 < 160.0f) {
                            q48Var.e = 160.0f;
                        }
                    }
                    q48Var.r = x3;
                    q48Var.s = y3;
                    q48Var.invalidate();
                }
                return true;
            case 14:
                ve8 ve8Var = (ve8) obj;
                if (ve8Var.U == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) ve8Var.U).getBackgroundDrawable();
                RectF rectF = gl.P;
                rectF.set(backgroundDrawable.getBounds());
                rectF.offset(ve8Var.U.getX(), ve8Var.U.getY());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                ve8Var.b(true);
                return true;
            case 15:
                tx9 tx9Var = (tx9) obj;
                if (motionEvent.getAction() != 0 || (jx9Var = tx9Var.V1) == null) {
                    return false;
                }
                jx9Var.run();
                return true;
            case 16:
                u0b u0bVar = (u0b) obj;
                if (u0bVar.L1) {
                    return false;
                }
                return xv2.e().h(motionEvent, u0bVar.m1, u0bVar.B1, u0bVar.g2, u0bVar.J0);
            default:
                jpb jpbVar = (jpb) obj;
                if (jpbVar.T == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) jpbVar.T).getBackgroundDrawable();
                RectF rectF2 = gl.P;
                rectF2.set(backgroundDrawable2.getBounds());
                rectF2.offset(jpbVar.T.getX(), jpbVar.T.getY());
                if (rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                jpbVar.b(true);
                return true;
        }
    }
}
