package fg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
import kh.p9;
import kh.q9;
import org.telegram.ui.Components.w20;
public final class l extends ViewGroup {
    public final int f6303a = 0;
    public AnimatorSet f6304b;
    public boolean f6305c;
    public final ArrayList d;
    public final ArrayList f6306e;
    public final ArrayList f6307f;
    public final ArrayList h;
    public final ScrollView f6308n;

    public l(m mVar, Context context) {
        super(context);
        this.f6308n = mVar;
        this.d = new ArrayList();
        this.f6306e = new ArrayList();
        this.f6307f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        q9 q9Var = (q9) this.f6308n;
        q9Var.C = true;
        ArrayList arrayList = q9Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            ((w20) arrayList2.get(i9)).setOnClickListener(null);
        }
        c();
        this.f6305c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6304b = animatorSet;
        animatorSet.addListener(new p9(this, arrayList2, 1));
        ArrayList arrayList4 = this.f6307f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.f6306e.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            w20 w20Var = (w20) arrayList2.get(i10);
            arrayList5.add(w20Var);
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        m mVar = (m) this.f6308n;
        mVar.C = true;
        ArrayList arrayList = mVar.f6312e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            ((w20) arrayList2.get(i9)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.f6305c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6304b = animatorSet;
            animatorSet.addListener(new k(this, arrayList2, 1));
            ArrayList arrayList4 = this.f6307f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.f6306e.clear();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                w20 w20Var = (w20) arrayList2.get(i10);
                arrayList5.add(w20Var);
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                removeView((View) arrayList2.get(i11));
            }
            arrayList3.clear();
            this.f6304b = null;
            this.f6305c = false;
            mVar.f6310b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f6303a) {
            case 0:
                AnimatorSet animatorSet = this.f6304b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i9 = 0;
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
                            ArrayList arrayList2 = this.f6306e;
                            if (i9 < arrayList2.size()) {
                                ((View) arrayList2.get(i9)).setScaleX(0.0f);
                                ((View) arrayList2.get(i9)).setScaleY(0.0f);
                                ((View) arrayList2.get(i9)).setAlpha(0.0f);
                                i9++;
                            } else {
                                arrayList.clear();
                                arrayList2.clear();
                                return;
                            }
                        }
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.f6304b;
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
                            ArrayList arrayList4 = this.f6306e;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f6303a) {
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
        throw new UnsupportedOperationException("Method not decompiled: fg.l.onMeasure(int, int):void");
    }

    public l(q9 q9Var, Context context) {
        super(context);
        this.f6308n = q9Var;
        this.d = new ArrayList();
        this.f6306e = new ArrayList();
        this.f6307f = new ArrayList();
        this.h = new ArrayList();
    }
}
