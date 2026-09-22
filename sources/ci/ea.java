package ci;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.ui.Components.m30;
public final class ea extends ViewGroup {
    public final int f4606a = 0;
    public AnimatorSet f4607b;
    public boolean f4608c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f4609f;
    public final ArrayList h;
    public final ScrollView f4610n;

    public ea(xg.i iVar, Context context) {
        super(context);
        this.f4610n = iVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f4609f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        fa faVar = (fa) this.f4610n;
        faVar.G = true;
        ArrayList arrayList = faVar.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((m30) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        this.f4608c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4607b = animatorSet;
        animatorSet.addListener(new da(this, arrayList2, 1));
        ArrayList arrayList4 = this.f4609f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            m30 m30Var = (m30) arrayList2.get(i11);
            arrayList5.add(m30Var);
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        xg.i iVar = (xg.i) this.f4610n;
        iVar.G = true;
        ArrayList arrayList = iVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((m30) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.f4608c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4607b = animatorSet;
            animatorSet.addListener(new xg.h(this, arrayList2, 1));
            ArrayList arrayList4 = this.f4609f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                m30 m30Var = (m30) arrayList2.get(i11);
                arrayList5.add(m30Var);
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                removeView((View) arrayList2.get(i12));
            }
            arrayList3.clear();
            this.f4607b = null;
            this.f4608c = false;
            iVar.f46092b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f4606a) {
            case 0:
                AnimatorSet animatorSet = this.f4607b;
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
                AnimatorSet animatorSet2 = this.f4607b;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f4606a) {
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
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ea.onMeasure(int, int):void");
    }

    public ea(fa faVar, Context context) {
        super(context);
        this.f4610n = faVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f4609f = new ArrayList();
        this.h = new ArrayList();
    }
}
