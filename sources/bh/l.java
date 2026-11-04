package bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import gi.p8;
import gi.q8;
import java.util.ArrayList;
import org.telegram.ui.Components.y10;
public final class l extends ViewGroup {
    public final int f3327a = 0;
    public AnimatorSet f3328b;
    public boolean f3329c;
    public final ArrayList d;
    public final ArrayList f3330e;
    public final ArrayList f3331f;
    public final ArrayList h;
    public final ScrollView f3332n;

    public l(m mVar, Context context) {
        super(context);
        this.f3332n = mVar;
        this.d = new ArrayList();
        this.f3330e = new ArrayList();
        this.f3331f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        q8 q8Var = (q8) this.f3332n;
        q8Var.I = true;
        ArrayList arrayList = q8Var.f13442e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((y10) arrayList2.get(i3)).setOnClickListener(null);
        }
        c();
        this.f3329c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3328b = animatorSet;
        animatorSet.addListener(new p8(this, arrayList2, 1));
        ArrayList arrayList4 = this.f3331f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.f3330e.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            y10 y10Var = (y10) arrayList2.get(i10);
            arrayList5.add(y10Var);
            arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        m mVar = (m) this.f3332n;
        mVar.I = true;
        ArrayList arrayList = mVar.f3336e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((y10) arrayList2.get(i3)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.f3329c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3328b = animatorSet;
            animatorSet.addListener(new k(this, arrayList2, 1));
            ArrayList arrayList4 = this.f3331f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.f3330e.clear();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                y10 y10Var = (y10) arrayList2.get(i10);
                arrayList5.add(y10Var);
                arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                removeView((View) arrayList2.get(i11));
            }
            arrayList3.clear();
            this.f3328b = null;
            this.f3329c = false;
            mVar.f3334b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f3327a) {
            case 0:
                AnimatorSet animatorSet = this.f3328b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i3 = 0;
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
                            ArrayList arrayList2 = this.f3330e;
                            if (i3 < arrayList2.size()) {
                                ((View) arrayList2.get(i3)).setScaleX(0.0f);
                                ((View) arrayList2.get(i3)).setScaleY(0.0f);
                                ((View) arrayList2.get(i3)).setAlpha(0.0f);
                                i3++;
                            } else {
                                arrayList.clear();
                                arrayList2.clear();
                                return;
                            }
                        }
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.f3328b;
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
                            ArrayList arrayList4 = this.f3330e;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f3327a) {
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
        throw new UnsupportedOperationException("Method not decompiled: bh.l.onMeasure(int, int):void");
    }

    public l(q8 q8Var, Context context) {
        super(context);
        this.f3332n = q8Var;
        this.d = new ArrayList();
        this.f3330e = new ArrayList();
        this.f3331f = new ArrayList();
        this.h = new ArrayList();
    }
}
