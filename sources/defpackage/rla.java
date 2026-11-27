package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class rla extends LinearLayout {
    public final jla a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final b76 e;
    public boolean f;

    public rla(Context context, jla jlaVar, boolean z) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new b76(new ola(this), k43.h, 380L);
        this.f = true;
        this.a = jlaVar;
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
            if (!(view instanceof sla) || ((sla) view).D0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final sla a(int i, int i2) {
        return b(i, i2, null, null, hl.L(48.0f), null);
    }

    public final sla b(final int i, int i2, String str, b29 b29Var, int i3, String str2) {
        int i4;
        int i5;
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        jla jlaVar = this.a;
        boolean z2 = this.b;
        if (z2) {
            i4 = jlaVar.p0;
        } else {
            i4 = jlaVar.o0;
        }
        if (z2) {
            i5 = jlaVar.n0;
        } else {
            i5 = jlaVar.m0;
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        final sla slaVar = new sla(context, this, i4, i5, z, jlaVar.a);
        slaVar.setTag(Integer.valueOf(i));
        if (str != null) {
            slaVar.F.setText(str);
            if (i3 == 0) {
                i3 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int L = hl.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            boolean A = ik8.A(b29Var);
            e29 e29Var = slaVar.y;
            if (A) {
                e29Var.setAnimation(b29Var);
            } else if (b29Var != null) {
                e29Var.setImageDrawable(b29Var);
            } else if (i2 != 0) {
                e29Var.setImageResource(i2);
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int i6 = -hl.L(5.0f);
            layoutParams.rightMargin = i6;
            layoutParams.leftMargin = i6;
        }
        addView(slaVar, -1, layoutParams);
        slaVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                jla jlaVar2 = rla.this.a;
                sla slaVar2 = slaVar;
                if (slaVar2.t()) {
                    d6 d6Var = jlaVar2.f0;
                    if (d6Var == null || d6Var.a()) {
                        slaVar2.U(null, null);
                    }
                } else if (slaVar2.B0) {
                    jlaVar2.F(true, true);
                } else {
                    d6 d6Var2 = jlaVar2.f0;
                    if (d6Var2 != null) {
                        d6Var2.b(i);
                    }
                }
            }
        });
        if (str2 != null) {
            slaVar.setContentDescription(str2);
        }
        return slaVar;
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
            ((qla) it.next()).b = false;
        }
        float width = getWidth() - getPaddingRight();
        b76 b76Var = this.e;
        float f = b76Var.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / hl.L(46.0f));
        ArrayList arrayList = b76Var.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y66 y66Var = (y66) obj;
            qla qlaVar = (qla) y66Var.a;
            View view = qlaVar.a;
            RectF b = y66Var.b();
            qlaVar.b = true;
            view.setTranslationX((((width - Math.max(f, b.right)) + b.left) + ((LinearLayout.LayoutParams) view.getLayoutParams()).leftMargin) - view.getLeft());
            qlaVar.c(y66Var.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                ((s7) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        a76 a76Var = this.e.d;
        return (hl.L(8.0f) * a76Var.c.a) + a76Var.f.a;
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
        return f + hl.L(8.0f);
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        jla jlaVar = this.a;
        boolean z = this.b;
        if (z) {
            i = jlaVar.n0;
        } else {
            i = jlaVar.m0;
        }
        if (z) {
            i2 = jlaVar.p0;
        } else {
            i2 = jlaVar.o0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                TextView textView = s7Var.F;
                s7Var.setIconColor(i);
                if (textView != null) {
                    textView.setTextColor(i);
                    i3 = 5;
                } else {
                    i3 = 1;
                }
                s7Var.setBackground(aob.f0(i2, i3, -1));
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
            qla qlaVar = (qla) hashMap.get(childAt);
            if (qlaVar != null && g(childAt)) {
                arrayList.add(qlaVar);
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
            qla qlaVar2 = (qla) hashMap.get(childAt2);
            if (qlaVar2 != null && !qlaVar2.b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof sla) {
                    ((sla) childAt2).X();
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
        this.c.put(view, new qla(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
