package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class gz9 extends ViewGroup {
    public final byte a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final ScrollView n;

    public gz9(hz9 hz9Var, Context context) {
        super(context);
        this.n = hz9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void a() {
        v5b v5bVar = (v5b) this.n;
        v5bVar.I = true;
        ArrayList arrayList = v5bVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((ya5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new u5b(this, arrayList2, (byte) 1));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ya5 ya5Var = (ya5) arrayList2.get(i2);
            arrayList5.add(ya5Var);
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public final void b(boolean z) {
        hz9 hz9Var = (hz9) this.n;
        hz9Var.I = true;
        ArrayList arrayList = hz9Var.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((ya5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        if (z) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new fz9(this, arrayList2, (byte) 1));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ya5 ya5Var = (ya5) arrayList2.get(i2);
                arrayList5.add(ya5Var);
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                removeView((View) arrayList2.get(i3));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            hz9Var.b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        int i = 0;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((View) arrayList.get(i2)).setScaleX(1.0f);
                    ((View) arrayList.get(i2)).setScaleY(1.0f);
                    ((View) arrayList.get(i2)).setAlpha(1.0f);
                }
                while (i < arrayList2.size()) {
                    ((View) arrayList2.get(i)).setScaleX(0.0f);
                    ((View) arrayList2.get(i)).setScaleY(0.0f);
                    ((View) arrayList2.get(i)).setAlpha(0.0f);
                    i++;
                }
                arrayList.clear();
                arrayList2.clear();
                return;
            default:
                AnimatorSet animatorSet2 = this.b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setScaleX(1.0f);
                    ((View) arrayList.get(i3)).setScaleY(1.0f);
                    ((View) arrayList.get(i3)).setAlpha(1.0f);
                }
                while (i < arrayList2.size()) {
                    ((View) arrayList2.get(i)).setScaleX(0.0f);
                    ((View) arrayList2.get(i)).setScaleY(0.0f);
                    ((View) arrayList2.get(i)).setAlpha(0.0f);
                    i++;
                }
                arrayList.clear();
                arrayList2.clear();
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                return;
            default:
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = getChildAt(i6);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz9.onMeasure(int, int):void");
    }

    public gz9(v5b v5bVar, Context context) {
        super(context);
        this.n = v5bVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
