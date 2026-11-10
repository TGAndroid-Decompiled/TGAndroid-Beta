package g;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.t3;
import r0.i0;
import r0.k1;
public final class i implements r0.m, l.w {
    public final s f13329a;

    public i(s sVar) {
        this.f13329a = sVar;
    }

    @Override
    public boolean A(l.k kVar) {
        Window.Callback callback;
        if (kVar == kVar.k()) {
            s sVar = this.f13329a;
            if (sVar.O && (callback = sVar.f13364f.getCallback()) != null && !sVar.Z) {
                callback.onMenuOpened(108, kVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        boolean z9;
        k1 k1Var2;
        int b10;
        int c10;
        boolean z10;
        int color;
        int d = k1Var.d();
        s sVar = this.f13329a;
        Context context = sVar.f13362e;
        int d2 = k1Var.d();
        ActionBarContextView actionBarContextView = sVar.D;
        int i7 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.D.getLayoutParams();
            boolean z11 = true;
            if (sVar.D.isShown()) {
                if (sVar.f13371l0 == null) {
                    sVar.f13371l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f13371l0;
                Rect rect2 = sVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = t3.f19264a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = sVar.J;
                WeakHashMap weakHashMap = i0.f54202a;
                k1 a10 = r0.b0.a(viewGroup2);
                if (a10 == null) {
                    b10 = 0;
                } else {
                    b10 = a10.b();
                }
                if (a10 == null) {
                    c10 = 0;
                } else {
                    c10 = a10.c();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                if (i10 > 0 && sVar.L == null) {
                    View view2 = new View(context);
                    sVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                } else {
                    View view3 = sVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = sVar.L;
                if (view4 == null) {
                    z11 = false;
                }
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!sVar.Q && z11) {
                    d2 = 0;
                }
                z9 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                z11 = false;
            }
            if (z11) {
                sVar.D.setLayoutParams(marginLayoutParams);
            }
        } else {
            z9 = false;
        }
        View view6 = sVar.L;
        if (view6 != null) {
            if (z9) {
                i7 = 0;
            }
            view6.setVisibility(i7);
        }
        if (d != d2) {
            k1Var2 = k1Var.f(k1Var.b(), d2, k1Var.c(), k1Var.a());
        } else {
            k1Var2 = k1Var;
        }
        return i0.g(view, k1Var2);
    }

    @Override
    public void c(l.k kVar, boolean z9) {
        boolean z10;
        int i7;
        r rVar;
        l.k k10 = kVar.k();
        int i10 = 0;
        if (k10 != kVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            kVar = k10;
        }
        s sVar = this.f13329a;
        r[] rVarArr = sVar.U;
        if (rVarArr != null) {
            i7 = rVarArr.length;
        } else {
            i7 = 0;
        }
        while (true) {
            if (i10 < i7) {
                rVar = rVarArr[i10];
                if (rVar != null && rVar.h == kVar) {
                    break;
                }
                i10++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (z10) {
                sVar.f(rVar.f13341a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z9);
        }
    }
}
