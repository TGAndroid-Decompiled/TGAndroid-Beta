package kg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.ui.Components.n30;
import ph.b8;
import ph.c8;
public final class j extends ViewGroup {
    public final int f10430a = 0;
    public AnimatorSet f10431b;
    public boolean f10432c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f10433f;
    public final ArrayList h;
    public final ScrollView f10434n;

    public j(k kVar, Context context) {
        super(context);
        this.f10434n = kVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f10433f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        c8 c8Var = (c8) this.f10434n;
        c8Var.D = true;
        ArrayList arrayList = c8Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((n30) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        this.f10432c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10431b = animatorSet;
        animatorSet.addListener(new b8(this, arrayList2, 1));
        ArrayList arrayList4 = this.f10433f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            n30 n30Var = (n30) arrayList2.get(i11);
            arrayList5.add(n30Var);
            arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z4) {
        k kVar = (k) this.f10434n;
        kVar.D = true;
        ArrayList arrayList = kVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((n30) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        if (z4) {
            this.f10432c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10431b = animatorSet;
            animatorSet.addListener(new i(this, arrayList2, 1));
            ArrayList arrayList4 = this.f10433f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                n30 n30Var = (n30) arrayList2.get(i11);
                arrayList5.add(n30Var);
                arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(n30Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                removeView((View) arrayList2.get(i12));
            }
            arrayList3.clear();
            this.f10431b = null;
            this.f10432c = false;
            kVar.f10436b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f10430a) {
            case 0:
                AnimatorSet animatorSet = this.f10431b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i11 < arrayList.size()) {
                        ((View) arrayList.get(i11)).setScaleX(1.0f);
                        ((View) arrayList.get(i11)).setScaleY(1.0f);
                        ((View) arrayList.get(i11)).setAlpha(1.0f);
                        i11++;
                    } else {
                        while (true) {
                            ArrayList arrayList2 = this.e;
                            if (i10 < arrayList2.size()) {
                                ((View) arrayList2.get(i10)).setScaleX(0.0f);
                                ((View) arrayList2.get(i10)).setScaleY(0.0f);
                                ((View) arrayList2.get(i10)).setAlpha(0.0f);
                                i10++;
                            } else {
                                arrayList.clear();
                                arrayList2.clear();
                                return;
                            }
                        }
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.f10431b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i13 < arrayList3.size()) {
                        ((View) arrayList3.get(i13)).setScaleX(1.0f);
                        ((View) arrayList3.get(i13)).setScaleY(1.0f);
                        ((View) arrayList3.get(i13)).setAlpha(1.0f);
                        i13++;
                    } else {
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i12 < arrayList4.size()) {
                                ((View) arrayList4.get(i12)).setScaleX(0.0f);
                                ((View) arrayList4.get(i12)).setScaleY(0.0f);
                                ((View) arrayList4.get(i12)).setAlpha(0.0f);
                                i12++;
                            } else {
                                arrayList3.clear();
                                arrayList4.clear();
                                return;
                            }
                        }
                    }
                }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f10430a) {
            case 0:
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                return;
            default:
                int childCount2 = getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = getChildAt(i15);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: kg.j.onMeasure(int, int):void");
    }

    public j(c8 c8Var, Context context) {
        super(context);
        this.f10434n = c8Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f10433f = new ArrayList();
        this.h = new ArrayList();
    }
}
