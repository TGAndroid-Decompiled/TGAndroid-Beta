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
import m.r3;
import r0.i0;
import r0.l1;
public final class i implements r0.m, l.w {
    public final s f12986a;

    public i(s sVar) {
        this.f12986a = sVar;
    }

    @Override
    public boolean C(l.k kVar) {
        Window.Callback callback;
        if (kVar == kVar.k()) {
            s sVar = this.f12986a;
            if (sVar.P && (callback = sVar.f13021f.getCallback()) != null && !sVar.f13015a0) {
                callback.onMenuOpened(108, kVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = l1Var.d();
        s sVar = this.f12986a;
        Context context = sVar.f13019e;
        int d2 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.E;
        int i7 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.E.getLayoutParams();
            boolean z12 = true;
            if (sVar.E.isShown()) {
                if (sVar.m0 == null) {
                    sVar.m0 = new Rect();
                    sVar.f13030n0 = new Rect();
                }
                Rect rect = sVar.m0;
                Rect rect2 = sVar.f13030n0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.K;
                Method method = r3.f20195a;
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
                ViewGroup viewGroup2 = sVar.K;
                WeakHashMap weakHashMap = i0.f56254a;
                l1 a10 = r0.b0.a(viewGroup2);
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
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 > 0 && sVar.M == null) {
                    View view2 = new View(context);
                    sVar.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.K.addView(sVar.M, -1, layoutParams);
                } else {
                    View view3 = sVar.M;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = sVar.M;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = sVar.M;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!sVar.R && z12) {
                    d2 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                sVar.E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = sVar.M;
        if (view6 != null) {
            if (z10) {
                i7 = 0;
            }
            view6.setVisibility(i7);
        }
        if (d != d2) {
            l1Var2 = l1Var.f(l1Var.b(), d2, l1Var.c(), l1Var.a());
        } else {
            l1Var2 = l1Var;
        }
        return i0.g(view, l1Var2);
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        boolean z11;
        int i7;
        r rVar;
        l.k k10 = kVar.k();
        int i10 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
        }
        s sVar = this.f12986a;
        r[] rVarArr = sVar.V;
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
            if (z11) {
                sVar.g(rVar.f12998a, rVar, k10);
                sVar.j(rVar, true);
                return;
            }
            sVar.j(rVar, z10);
        }
    }
}
