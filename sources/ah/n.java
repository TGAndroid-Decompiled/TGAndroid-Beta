package ah;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import hi.m8;
import hi.n8;
import java.util.ArrayList;
import org.telegram.ui.Components.m20;
public final class n extends ViewGroup {
    public final int f1087a = 0;
    public AnimatorSet f1088b;
    public boolean f1089c;
    public final ArrayList d;
    public final ArrayList f1090e;
    public final ArrayList f1091f;
    public final ArrayList h;
    public final ScrollView f1092n;

    public n(o oVar, Context context) {
        super(context);
        this.f1092n = oVar;
        this.d = new ArrayList();
        this.f1090e = new ArrayList();
        this.f1091f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        n8 n8Var = (n8) this.f1092n;
        n8Var.I = true;
        ArrayList arrayList = n8Var.f15108e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((m20) arrayList2.get(i7)).setOnClickListener(null);
        }
        c();
        this.f1089c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1088b = animatorSet;
        animatorSet.addListener(new m8(this, arrayList2, 1));
        ArrayList arrayList4 = this.f1091f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.f1090e.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            m20 m20Var = (m20) arrayList2.get(i10);
            arrayList5.add(m20Var);
            arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        o oVar = (o) this.f1092n;
        oVar.I = true;
        ArrayList arrayList = oVar.f1096e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((m20) arrayList2.get(i7)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.f1089c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1088b = animatorSet;
            animatorSet.addListener(new m(this, arrayList2, 1));
            ArrayList arrayList4 = this.f1091f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.f1090e.clear();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                m20 m20Var = (m20) arrayList2.get(i10);
                arrayList5.add(m20Var);
                arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m20Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                removeView((View) arrayList2.get(i11));
            }
            arrayList3.clear();
            this.f1088b = null;
            this.f1089c = false;
            oVar.f1094b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f1087a) {
            case 0:
                AnimatorSet animatorSet = this.f1088b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setScaleX(1.0f);
                        ((View) arrayList.get(i10)).setScaleY(1.0f);
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        while (true) {
                            ArrayList arrayList2 = this.f1090e;
                            if (i7 < arrayList2.size()) {
                                ((View) arrayList2.get(i7)).setScaleX(0.0f);
                                ((View) arrayList2.get(i7)).setScaleY(0.0f);
                                ((View) arrayList2.get(i7)).setAlpha(0.0f);
                                i7++;
                            } else {
                                arrayList.clear();
                                arrayList2.clear();
                                return;
                            }
                        }
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.f1088b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i12 < arrayList3.size()) {
                        ((View) arrayList3.get(i12)).setScaleX(1.0f);
                        ((View) arrayList3.get(i12)).setScaleY(1.0f);
                        ((View) arrayList3.get(i12)).setAlpha(1.0f);
                        i12++;
                    } else {
                        while (true) {
                            ArrayList arrayList4 = this.f1090e;
                            if (i11 < arrayList4.size()) {
                                ((View) arrayList4.get(i11)).setScaleX(0.0f);
                                ((View) arrayList4.get(i11)).setScaleY(0.0f);
                                ((View) arrayList4.get(i11)).setAlpha(0.0f);
                                i11++;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f1087a) {
            case 0:
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                return;
            default:
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ah.n.onMeasure(int, int):void");
    }

    public n(n8 n8Var, Context context) {
        super(context);
        this.f1092n = n8Var;
        this.d = new ArrayList();
        this.f1090e = new ArrayList();
        this.f1091f = new ArrayList();
        this.h = new ArrayList();
    }
}
