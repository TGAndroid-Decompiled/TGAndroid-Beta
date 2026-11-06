package ah;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import fi.o8;
import fi.p8;
import java.util.ArrayList;
import org.telegram.ui.Components.c20;
public final class n extends ViewGroup {
    public final int f1090a = 0;
    public AnimatorSet f1091b;
    public boolean f1092c;
    public final ArrayList d;
    public final ArrayList f1093e;
    public final ArrayList f1094f;
    public final ArrayList h;
    public final ScrollView f1095n;

    public n(o oVar, Context context) {
        super(context);
        this.f1095n = oVar;
        this.d = new ArrayList();
        this.f1093e = new ArrayList();
        this.f1094f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        p8 p8Var = (p8) this.f1095n;
        p8Var.H = true;
        ArrayList arrayList = p8Var.f12614e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((c20) arrayList2.get(i7)).setOnClickListener(null);
        }
        c();
        this.f1092c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1091b = animatorSet;
        animatorSet.addListener(new o8(this, arrayList2, 1));
        ArrayList arrayList4 = this.f1094f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.f1093e.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            c20 c20Var = (c20) arrayList2.get(i10);
            arrayList5.add(c20Var);
            arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z9) {
        o oVar = (o) this.f1095n;
        oVar.H = true;
        ArrayList arrayList = oVar.f1099e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((c20) arrayList2.get(i7)).setOnClickListener(null);
        }
        c();
        if (z9) {
            this.f1092c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1091b = animatorSet;
            animatorSet.addListener(new m(this, arrayList2, 1));
            ArrayList arrayList4 = this.f1094f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.f1093e.clear();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                c20 c20Var = (c20) arrayList2.get(i10);
                arrayList5.add(c20Var);
                arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                removeView((View) arrayList2.get(i11));
            }
            arrayList3.clear();
            this.f1091b = null;
            this.f1092c = false;
            oVar.f1097b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f1090a) {
            case 0:
                AnimatorSet animatorSet = this.f1091b;
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
                            ArrayList arrayList2 = this.f1093e;
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
                AnimatorSet animatorSet2 = this.f1091b;
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
                            ArrayList arrayList4 = this.f1093e;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f1090a) {
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

    public n(p8 p8Var, Context context) {
        super(context);
        this.f1095n = p8Var;
        this.d = new ArrayList();
        this.f1093e = new ArrayList();
        this.f1094f = new ArrayList();
        this.h = new ArrayList();
    }
}
