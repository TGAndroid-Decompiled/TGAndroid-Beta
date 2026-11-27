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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class b7 implements View.OnTouchListener {
    public final byte a;
    public final Object b;

    public b7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n8 n8Var;
        n8 n8Var2;
        float f;
        s64 s64Var;
        float f2;
        zt5 zt5Var;
        n8 n8Var3;
        n8 n8Var4;
        byte b;
        float f3;
        float f4;
        c1a c1aVar;
        byte b2 = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b2) {
            case 0:
                s7 s7Var = (s7) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var = s7Var.d) != null && n8Var.isShowing()) {
                    view.getHitRect(s7Var.J);
                    if (!s7Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        s7Var.d.d(true);
                    }
                }
                return false;
            case 1:
                o oVar = (o) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = oVar.I) != null && n8Var2.isShowing()) {
                    view.getHitRect(oVar.E0);
                    if (!oVar.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oVar.I.d(true);
                    }
                }
                return false;
            case 2:
                h42 h42Var = (h42) obj;
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    h42Var.b0();
                }
                return false;
            case 3:
                rw2 rw2Var = (rw2) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (rw2Var.n) {
                        rw2Var.c();
                    } else {
                        rw2Var.b();
                    }
                }
                return true;
            case 4:
                n8 n8Var5 = (n8) ((g9) obj).b;
                if (motionEvent.getActionMasked() == 1 && n8Var5 != null && n8Var5.isShowing()) {
                    Rect rect = hl.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n8Var5.d(true);
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
                            actionBarLayout.c0((e) actionBarLayout.getFragmentStack().get(0), false);
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
                        jp9 jp9Var = qVar.Q;
                        if (jp9Var != null && i3 == 5) {
                            boolean z2 = qVar.l0;
                            qVar.l0 = !z2;
                            jp9.v();
                            if (jp9Var.a0 == 5 && (s64Var = jp9Var.W) != null) {
                                if (!z2) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = 1.0f;
                                }
                                s64Var.R(f2);
                            }
                            oec oecVar = qVar.V;
                            if (oecVar != null) {
                                oecVar.t = qVar.l0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (qVar.l0) {
                                f5 = 1.0f;
                            }
                            ik8.s(animate, f5, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ip9 ip9Var = qVar.S;
                        if (ip9Var.a == 3 && !ip9Var.f) {
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
                            bp9 bp9Var = qVar.T;
                            if (bp9Var == null) {
                                f = 1.0f;
                            } else {
                                f = bp9Var.c;
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
                fu5 fu5Var = (fu5) ((WeakReference) obj).get();
                if (fu5Var != null && (zt5Var = fu5Var.m) != null && zt5Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 2) {
                        fu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked2 == 1) {
                        fu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = fu5Var.v0;
                        if (view2 != null) {
                            fu5Var.v0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        fu5Var.u0 = null;
                    } else if (actionMasked2 == 3) {
                        View view3 = fu5Var.v0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            fu5Var.v0 = null;
                        }
                        view.setOnTouchListener(null);
                        fu5Var.u0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 8:
                wy5 wy5Var = (wy5) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var3 = wy5Var.B1) != null && n8Var3.isShowing()) {
                    view.getHitRect(wy5Var.D1);
                    if (!wy5Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wy5Var.B1.d(true);
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
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return rw2.e().h(motionEvent, b27Var.getListView(), b27Var.x, null, b27Var.a);
            case 11:
                m57 m57Var = (m57) obj;
                if (motionEvent.getAction() == 1) {
                    m57Var.d0.a(true);
                }
                return true;
            case 12:
                dx7 dx7Var = (dx7) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var4 = dx7Var.r1) != null && n8Var4.isShowing()) {
                    view.getHitRect(dx7Var.t1);
                    if (!dx7Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dx7Var.r1.d(true);
                    }
                }
                return false;
            case 13:
                f88 f88Var = (f88) obj;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int L = hl.L(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f6 = f88Var.f;
                    float f7 = L;
                    float f8 = f6 - f7;
                    int i6 = (f8 > x3 ? 1 : (f8 == x3 ? 0 : -1));
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f9 = f88Var.h;
                        if (f9 - f7 < y3 && f9 + f7 > y3) {
                            f88Var.n = (byte) 1;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    float f10 = f88Var.d;
                    int i7 = ((f8 + f10) > x3 ? 1 : ((f8 + f10) == x3 ? 0 : -1));
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f11 = f88Var.h;
                        if (f11 - f7 < y3 && f11 + f7 > y3) {
                            f88Var.n = (byte) 2;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (i6 < 0 && f6 + f7 > x3) {
                        float f12 = f88Var.h;
                        float f13 = f88Var.e;
                        if ((f12 - f7) + f13 < y3 && f12 + f7 + f13 > y3) {
                            f88Var.n = (byte) 3;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (i7 < 0 && f6 + f7 + f10 > x3) {
                        float f14 = f88Var.h;
                        float f15 = f88Var.e;
                        if ((f14 - f7) + f15 < y3 && f14 + f7 + f15 > y3) {
                            f88Var.n = (byte) 4;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (f6 < x3 && f6 + f10 > x3) {
                        float f16 = f88Var.h;
                        if (f16 < y3 && f16 + f88Var.e > y3) {
                            f88Var.n = (byte) 5;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    f88Var.n = (byte) 0;
                    f88Var.r = x3;
                    f88Var.s = y3;
                } else if (motionEvent.getAction() == 1) {
                    f88Var.n = (byte) 0;
                } else if (motionEvent.getAction() == 2 && (b = f88Var.n) != 0) {
                    float f17 = x3 - f88Var.r;
                    float f18 = y3 - f88Var.s;
                    if (b == 5) {
                        float f19 = f88Var.f + f17;
                        f88Var.f = f19;
                        float f20 = f88Var.h + f18;
                        f88Var.h = f20;
                        int i8 = f88Var.y;
                        float f21 = i8;
                        if (f19 < f21) {
                            f88Var.f = f21;
                        } else {
                            float f22 = f88Var.d;
                            float f23 = i8 + f88Var.w;
                            if (f19 + f22 > f23) {
                                f88Var.f = f23 - f22;
                            }
                        }
                        int i9 = f88Var.E;
                        float f24 = i9;
                        if (f20 < f24) {
                            f88Var.h = f24;
                        } else {
                            float f25 = f88Var.e;
                            float f26 = i9 + f88Var.x;
                            if (f20 + f25 > f26) {
                                f88Var.h = f26 - f25;
                            }
                        }
                    } else if (b == 1) {
                        float f27 = f88Var.d;
                        if (f27 - f17 < 160.0f) {
                            f17 = f27 - 160.0f;
                        }
                        float f28 = f88Var.f;
                        float f29 = f88Var.y;
                        if (f28 + f17 < f29) {
                            f17 = f29 - f28;
                        }
                        if (!f88Var.H) {
                            float f30 = f88Var.h;
                            float f31 = f88Var.E;
                            if (f30 + f17 < f31) {
                                f17 = f31 - f30;
                            }
                            f88Var.f = f28 + f17;
                            f88Var.h = f30 + f17;
                            f88Var.d = f27 - f17;
                            f88Var.e -= f17;
                        } else {
                            float f32 = f88Var.e;
                            if (f32 - f18 < 160.0f) {
                                f18 = f32 - 160.0f;
                            }
                            float f33 = f88Var.h;
                            float f34 = f88Var.E;
                            if (f33 + f18 < f34) {
                                f18 = f34 - f33;
                            }
                            f88Var.f = f28 + f17;
                            f88Var.h = f33 + f18;
                            f88Var.d = f27 - f17;
                            f88Var.e = f32 - f18;
                        }
                    } else if (b == 2) {
                        float f35 = f88Var.d;
                        if (f35 + f17 < 160.0f) {
                            f17 = -(f35 - 160.0f);
                        }
                        float f36 = f88Var.f;
                        float f37 = f88Var.y + f88Var.w;
                        if (f36 + f35 + f17 > f37) {
                            f17 = (f37 - f36) - f35;
                        }
                        if (!f88Var.H) {
                            float f38 = f88Var.h;
                            float f39 = f88Var.E;
                            if (f38 - f17 < f39) {
                                f17 = f38 - f39;
                            }
                            f88Var.h = f38 - f17;
                            f88Var.d = f35 + f17;
                            f88Var.e += f17;
                        } else {
                            float f40 = f88Var.e;
                            if (f40 - f18 < 160.0f) {
                                f18 = f40 - 160.0f;
                            }
                            float f41 = f88Var.h;
                            float f42 = f88Var.E;
                            if (f41 + f18 < f42) {
                                f18 = f42 - f41;
                            }
                            f88Var.h = f41 + f18;
                            f88Var.d = f35 + f17;
                            f88Var.e = f40 - f18;
                        }
                    } else if (b == 3) {
                        float f43 = f88Var.d;
                        if (f43 - f17 < 160.0f) {
                            f17 = f43 - 160.0f;
                        }
                        float f44 = f88Var.f;
                        float f45 = f88Var.y;
                        if (f44 + f17 < f45) {
                            f17 = f45 - f44;
                        }
                        boolean z3 = f88Var.H;
                        float f46 = f88Var.h;
                        if (!z3) {
                            float f47 = f46 + f43;
                            int i10 = f88Var.E;
                            int i11 = f88Var.x;
                            if (f47 - f17 > i10 + i11) {
                                f17 = (f47 - i10) - i11;
                            }
                            f88Var.f = f44 + f17;
                            f88Var.d = f43 - f17;
                            f88Var.e -= f17;
                        } else {
                            float f48 = f88Var.e;
                            float f49 = f88Var.E + f88Var.x;
                            if (f46 + f48 + f18 > f49) {
                                f18 = (f49 - f46) - f48;
                            }
                            f88Var.f = f44 + f17;
                            f88Var.d = f43 - f17;
                            float f50 = f48 + f18;
                            f88Var.e = f50;
                            if (f50 < 160.0f) {
                                f88Var.e = 160.0f;
                            }
                        }
                    } else if (b == 4) {
                        float f51 = f88Var.f;
                        float f52 = f88Var.d;
                        float f53 = f88Var.y + f88Var.w;
                        if (f51 + f52 + f17 > f53) {
                            f17 = (f53 - f51) - f52;
                        }
                        boolean z4 = f88Var.H;
                        float f54 = f88Var.h;
                        if (!z4) {
                            float f55 = f88Var.E + f88Var.x;
                            if (f54 + f52 + f17 > f55) {
                                f17 = (f55 - f54) - f52;
                            }
                            f3 = f52 + f17;
                            f88Var.d = f3;
                            f4 = f88Var.e + f17;
                            f88Var.e = f4;
                        } else {
                            float f56 = f88Var.e;
                            float f57 = f88Var.E + f88Var.x;
                            if (f54 + f56 + f18 > f57) {
                                f18 = (f57 - f54) - f56;
                            }
                            f3 = f52 + f17;
                            f88Var.d = f3;
                            f4 = f56 + f18;
                            f88Var.e = f4;
                        }
                        if (f3 < 160.0f) {
                            f88Var.d = 160.0f;
                        }
                        if (f4 < 160.0f) {
                            f88Var.e = 160.0f;
                        }
                    }
                    f88Var.r = x3;
                    f88Var.s = y3;
                    f88Var.invalidate();
                }
                return true;
            case 14:
                ji8 ji8Var = (ji8) obj;
                if (ji8Var.U == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) ji8Var.U).getBackgroundDrawable();
                RectF rectF = hl.P;
                rectF.set(backgroundDrawable.getBounds());
                rectF.offset(ji8Var.U.getX(), ji8Var.U.getY());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                ji8Var.b(true);
                return true;
            case 15:
                n1a n1aVar = (n1a) obj;
                if (motionEvent.getAction() != 0 || (c1aVar = n1aVar.V1) == null) {
                    return false;
                }
                c1aVar.run();
                return true;
            case 16:
                s4b s4bVar = (s4b) obj;
                if (s4bVar.L1) {
                    return false;
                }
                return rw2.e().h(motionEvent, s4bVar.m1, s4bVar.B1, s4bVar.g2, s4bVar.J0);
            default:
                ktb ktbVar = (ktb) obj;
                if (ktbVar.T == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) ktbVar.T).getBackgroundDrawable();
                RectF rectF2 = hl.P;
                rectF2.set(backgroundDrawable2.getBounds());
                rectF2.offset(ktbVar.T.getX(), ktbVar.T.getY());
                if (rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                ktbVar.b(true);
                return true;
        }
    }
}
