package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class yja extends LinearLayout {
    public final rja a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final x66 e;
    public boolean f;

    public yja(Context context, rja rjaVar, boolean z) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new x66(new vja(this), d53.h, 380L);
        this.f = true;
        this.a = rjaVar;
        this.b = z;
        setOrientation(0);
        setGravity(21);
    }

    public static int e(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean g(View view) {
        if (view.getVisibility() != 8) {
            if (!(view instanceof zja) || ((zja) view).D0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final zja a(int i, int i2) {
        return b(i, i2, null, null, gm.L(48.0f), null);
    }

    public final zja b(final int i, int i2, String str, p09 p09Var, int i3, String str2) {
        int i4;
        int i5;
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        rja rjaVar = this.a;
        boolean z2 = this.b;
        if (z2) {
            i4 = rjaVar.j0;
        } else {
            i4 = rjaVar.i0;
        }
        if (z2) {
            i5 = rjaVar.h0;
        } else {
            i5 = rjaVar.g0;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        final zja zjaVar = new zja(context, this, i4, i5, z, rjaVar.a);
        zjaVar.setTag(Integer.valueOf(i));
        if (str != null) {
            zjaVar.F.setText(str);
            if (i3 == 0) {
                i3 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int L = gm.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            boolean A = wi8.A(p09Var);
            s09 s09Var = zjaVar.y;
            if (A) {
                s09Var.setAnimation(p09Var);
            } else if (p09Var != null) {
                s09Var.setImageDrawable(p09Var);
            } else if (i2 != 0) {
                s09Var.setImageResource(i2);
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int i6 = -gm.L(5.0f);
            layoutParams.rightMargin = i6;
            layoutParams.leftMargin = i6;
        }
        addView(zjaVar, -1, layoutParams);
        zjaVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rja rjaVar2 = yja.this.a;
                zja zjaVar2 = zjaVar;
                if (zjaVar2.t()) {
                    c6 c6Var = rjaVar2.W;
                    if (c6Var == null || c6Var.a()) {
                        zjaVar2.U(null, null);
                    }
                } else if (zjaVar2.B0) {
                    rjaVar2.C(true, true);
                } else {
                    c6 c6Var2 = rjaVar2.W;
                    if (c6Var2 != null) {
                        c6Var2.b(i);
                    }
                }
            }
        });
        if (str2 != null) {
            zjaVar.setContentDescription(str2);
        }
        return zjaVar;
    }

    public final void c(int i, int i2, int i3, String str) {
        b(i, i2, null, null, i3, str);
    }

    public final void d() {
        int i;
        Iterator it = this.c.values().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ((xja) it.next()).b = false;
        }
        float width = getWidth() - getPaddingRight();
        x66 x66Var = this.e;
        float f = x66Var.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / gm.L(46.0f));
        ArrayList arrayList = x66Var.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u66 u66Var = (u66) obj;
            xja xjaVar = (xja) u66Var.a;
            View view = xjaVar.a;
            RectF b = u66Var.b();
            xjaVar.b = true;
            view.setTranslationX((((width - Math.max(f, b.right)) + b.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            xjaVar.c(u66Var.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                ((r7) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        w66 w66Var = this.e.d;
        return (gm.L(8.0f) * w66Var.c.a) + w66Var.f.a;
    }

    public float getTargetPillWidth() {
        View childAt;
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            if (g(getChildAt(i))) {
                f += e(childAt);
            }
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        return f + gm.L(8.0f);
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        rja rjaVar = this.a;
        boolean z = this.b;
        if (z) {
            i = rjaVar.h0;
        } else {
            i = rjaVar.g0;
        }
        if (z) {
            i2 = rjaVar.j0;
        } else {
            i2 = rjaVar.i0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                TextView textView = r7Var.F;
                r7Var.setIconColor(i);
                if (textView != null) {
                    textView.setTextColor(i);
                    i3 = 5;
                } else {
                    i3 = 1;
                }
                r7Var.setBackground(cmb.f0(i2, i3, -1));
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        HashMap hashMap;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            hashMap = this.c;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            xja xjaVar = (xja) hashMap.get(childAt);
            if (xjaVar != null && g(childAt)) {
                arrayList.add(xjaVar);
            }
            i5++;
        }
        if (!this.f && isLaidOut()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e.m(arrayList, z2);
        this.f = false;
        d();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            xja xjaVar2 = (xja) hashMap.get(childAt2);
            if (xjaVar2 != null && !xjaVar2.b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof zja) {
                    ((zja) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.a.invalidate();
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new xja(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
