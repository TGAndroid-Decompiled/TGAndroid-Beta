package gg;

import ag.u;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import java.util.ArrayList;
import lh.m2;
import lh.m9;
import lh.n9;
import lh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.a30;

public final class k extends ViewGroup {

    public final int f7100a = 0;

    public AnimatorSet f7101b;

    public boolean f7102c;
    public final ArrayList d;

    public final ArrayList f7103e;

    public final ArrayList f7104f;
    public final ArrayList h;

    public final ScrollView f7105n;

    public k(l lVar, Context context) {
        super(context);
        this.f7105n = lVar;
        this.d = new ArrayList();
        this.f7103e = new ArrayList();
        this.f7104f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        n9 n9Var = (n9) this.f7105n;
        int i10 = 1;
        n9Var.C = true;
        ArrayList arrayList = n9Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((a30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        this.f7102c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7101b = animatorSet;
        animatorSet.addListener(new m9(this, arrayList2, i10));
        ArrayList arrayList4 = this.f7104f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.f7103e.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            a30 a30Var = (a30) arrayList2.get(i12);
            arrayList5.add(a30Var);
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        l lVar = (l) this.f7105n;
        int i10 = 1;
        lVar.C = true;
        ArrayList arrayList = lVar.f7109e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((a30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.f7102c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7101b = animatorSet;
            animatorSet.addListener(new j(this, arrayList2, i10));
            ArrayList arrayList4 = this.f7104f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.f7103e.clear();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                a30 a30Var = (a30) arrayList2.get(i12);
                arrayList5.add(a30Var);
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                removeView((View) arrayList2.get(i13));
            }
            arrayList3.clear();
            this.f7101b = null;
            this.f7102c = false;
            lVar.f7107b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.f7100a) {
            case 0:
                AnimatorSet animatorSet = this.f7101b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i11 >= arrayList.size()) {
                        while (true) {
                            ArrayList arrayList2 = this.f7103e;
                            if (i10 >= arrayList2.size()) {
                                arrayList.clear();
                                arrayList2.clear();
                            } else {
                                ((View) arrayList2.get(i10)).setScaleX(0.0f);
                                ((View) arrayList2.get(i10)).setScaleY(0.0f);
                                ((View) arrayList2.get(i10)).setAlpha(0.0f);
                                i10++;
                            }
                        }
                    } else {
                        ((View) arrayList.get(i11)).setScaleX(1.0f);
                        ((View) arrayList.get(i11)).setScaleY(1.0f);
                        ((View) arrayList.get(i11)).setAlpha(1.0f);
                        i11++;
                    }
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = this.f7101b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i13 >= arrayList3.size()) {
                        while (true) {
                            ArrayList arrayList4 = this.f7103e;
                            if (i12 >= arrayList4.size()) {
                                arrayList3.clear();
                                arrayList4.clear();
                            } else {
                                ((View) arrayList4.get(i12)).setScaleX(0.0f);
                                ((View) arrayList4.get(i12)).setScaleY(0.0f);
                                ((View) arrayList4.get(i12)).setAlpha(0.0f);
                                i12++;
                            }
                        }
                    } else {
                        ((View) arrayList3.get(i13)).setScaleX(1.0f);
                        ((View) arrayList3.get(i13)).setScaleY(1.0f);
                        ((View) arrayList3.get(i13)).setAlpha(1.0f);
                        i13++;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f7100a) {
            case 0:
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                break;
            default:
                int childCount2 = getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = getChildAt(i15);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iX;
        int i12;
        int i13;
        ?? r10;
        int iC;
        int i14;
        int i15;
        char c10;
        int iX2;
        int iC2;
        int i16;
        float f10;
        int i17 = this.f7100a;
        ScrollView scrollView = this.f7105n;
        ArrayList arrayList = this.f7104f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i17) {
            case 0:
                l lVar = (l) scrollView;
                g gVar = lVar.f7107b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i10);
                int iDp = size - AndroidUtilities.dp(28.0f);
                int iDp2 = AndroidUtilities.dp(10.0f);
                int iDp3 = AndroidUtilities.dp(10.0f);
                int i18 = 0;
                int i19 = 0;
                int iC3 = 0;
                while (i18 < childCount) {
                    View childAt = getChildAt(i18);
                    int i20 = childCount;
                    if (childAt instanceof a30) {
                        int i21 = i19;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                        boolean zContains = arrayList2.contains(childAt);
                        if (zContains || childAt.getMeasuredWidth() + i21 <= iDp) {
                            iC = i21;
                        } else {
                            iDp2 = y1.C(4.0f, childAt.getMeasuredHeight(), iDp2);
                            iC = 0;
                        }
                        if (childAt.getMeasuredWidth() + iC3 > iDp) {
                            iDp3 = y1.C(4.0f, childAt.getMeasuredHeight(), iDp3);
                            iC3 = 0;
                        }
                        int iDp4 = AndroidUtilities.dp(14.0f) + iC;
                        if (this.f7102c) {
                            i14 = iDp;
                        } else if (zContains) {
                            childAt.setTranslationX(AndroidUtilities.dp(14.0f) + iC3);
                            childAt.setTranslationY(iDp3);
                            i14 = iDp;
                        } else if (arrayList2.isEmpty()) {
                            i14 = iDp;
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        } else {
                            float f11 = iDp4;
                            i14 = iDp;
                            if (childAt.getTranslationX() != f11) {
                                i15 = 1;
                                c10 = 0;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f11));
                            } else {
                                i15 = 1;
                                c10 = 0;
                            }
                            float f12 = iDp2;
                            if (childAt.getTranslationY() != f12) {
                                float[] fArr = new float[i15];
                                fArr[c10] = f12;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                            }
                        }
                        if (!zContains) {
                            iC = y1.C(6.0f, childAt.getMeasuredWidth(), iC);
                        }
                        iC3 = y1.C(6.0f, childAt.getMeasuredWidth(), iC3);
                        i19 = iC;
                    } else {
                        i14 = iDp;
                    }
                    i18++;
                    childCount = i20;
                    iDp = i14;
                }
                int i22 = iDp;
                int i23 = i19;
                if (AndroidUtilities.isTablet()) {
                    iX = AndroidUtilities.dp(376.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    iX = rl.x(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i22 - i23 < iX) {
                    iDp2 += AndroidUtilities.dp(36.0f);
                    i12 = 0;
                } else {
                    i12 = i23;
                }
                if (i22 - iC3 < iX) {
                    iDp3 += AndroidUtilities.dp(36.0f);
                }
                gVar.measure(View.MeasureSpec.makeMeasureSpec(i22 - i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                gVar.setHintVisible(gVar.getMeasuredWidth() > lVar.f7108c, true);
                if (!this.f7102c) {
                    int iDp5 = AndroidUtilities.dp(38.0f) + iDp3;
                    int iDp6 = AndroidUtilities.dp(16.0f) + i12;
                    lVar.D = iDp2;
                    if (this.f7101b != null) {
                        int iDp7 = AndroidUtilities.dp(38.0f) + iDp2;
                        float f13 = lVar.E;
                        float f14 = iDp7;
                        if (f13 != f14) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13, f14);
                            valueAnimatorOfFloat.addUpdateListener(new u(lVar, 4));
                            arrayList.add(valueAnimatorOfFloat);
                        }
                        float f15 = iDp6;
                        if (gVar.getTranslationX() != f15) {
                            i13 = 1;
                            r10 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property, f15));
                        } else {
                            i13 = 1;
                            r10 = 0;
                        }
                        float translationY = gVar.getTranslationY();
                        float f16 = lVar.D;
                        if (translationY != f16) {
                            float[] fArr2 = new float[i13];
                            fArr2[r10] = f16;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property2, fArr2));
                        }
                        gVar.setAllowDrawCursor(r10);
                        this.f7101b.playTogether(arrayList);
                        this.f7101b.setDuration(180L);
                        this.f7101b.setInterpolator(new LinearInterpolator());
                        this.f7101b.start();
                        this.f7102c = true;
                    } else {
                        lVar.E = iDp5;
                        gVar.setTranslationX(iDp6);
                        gVar.setTranslationY(lVar.D);
                    }
                } else if (this.f7101b != null && !lVar.C && arrayList2.isEmpty()) {
                    gVar.bringPointIntoView(gVar.getSelectionStart());
                }
                setMeasuredDimension(size, (int) lVar.E);
                break;
            default:
                n9 n9Var = (n9) scrollView;
                z8 z8Var = n9Var.f16444f;
                g gVar2 = n9Var.f16440a;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i10);
                int iDp8 = size2 - AndroidUtilities.dp(14.0f);
                int iDp9 = AndroidUtilities.dp(10.0f);
                int iDp10 = AndroidUtilities.dp(10.0f);
                int iDp11 = iDp9;
                int i24 = 0;
                int i25 = 0;
                int iC4 = 0;
                while (i24 < childCount2) {
                    View childAt2 = getChildAt(i24);
                    if (childAt2 instanceof a30) {
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                        boolean zContains2 = arrayList2.contains(childAt2);
                        if (zContains2 || childAt2.getMeasuredWidth() + i25 <= iDp8) {
                            iC2 = i25;
                        } else {
                            iDp11 = y1.C(4.0f, childAt2.getMeasuredHeight(), iDp11);
                            iC2 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + iC4 > iDp8) {
                            iDp10 = y1.C(4.0f, childAt2.getMeasuredHeight(), iDp10);
                            i16 = 0;
                        } else {
                            i16 = iC4;
                        }
                        int iDp12 = AndroidUtilities.dp(7.0f) + iC2;
                        if (!this.f7102c) {
                            if (zContains2) {
                                childAt2.setTranslationX(AndroidUtilities.dp(7.0f) + i16);
                                childAt2.setTranslationY(iDp10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(iDp12);
                                childAt2.setTranslationY(iDp11);
                            } else {
                                float f17 = iDp12;
                                if (childAt2.getTranslationX() != f17) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f17));
                                }
                                float f18 = iDp11;
                                if (childAt2.getTranslationY() != f18) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f18));
                                }
                            }
                        }
                        if (zContains2 == 0) {
                            f10 = 4.0f;
                            iC2 = y1.C(4.0f, childAt2.getMeasuredWidth(), iC2);
                        } else {
                            f10 = 4.0f;
                        }
                        iC4 = y1.C(f10, childAt2.getMeasuredWidth(), i16);
                        i25 = iC2;
                    }
                    i24++;
                    z8Var = z8Var;
                    childCount2 = childCount2;
                    iDp8 = iDp8;
                }
                z8 z8Var2 = z8Var;
                int i26 = iDp8;
                if (AndroidUtilities.isTablet()) {
                    iX2 = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    iX2 = rl.x(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i26 - i25 < iX2) {
                    iDp11 += AndroidUtilities.dp(36.0f);
                    i25 = 0;
                }
                if (i26 - iC4 < iX2) {
                    iDp10 += AndroidUtilities.dp(36.0f);
                }
                gVar2.measure(View.MeasureSpec.makeMeasureSpec(i26 - i25, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                gVar2.setHintVisible(gVar2.getMeasuredWidth() > n9Var.f16441b, true);
                if (!this.f7102c) {
                    int iDp13 = AndroidUtilities.dp(38.0f) + iDp10;
                    int iDp14 = AndroidUtilities.dp(16.0f) + i25;
                    n9Var.D = iDp11;
                    if (this.f7101b != null) {
                        int iDp15 = AndroidUtilities.dp(38.0f) + iDp11;
                        n9Var.F = iDp15;
                        float f19 = n9Var.E;
                        float f20 = iDp15;
                        if (f19 != f20) {
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f19, f20);
                            valueAnimatorOfFloat2.addUpdateListener(new m2(n9Var, 9));
                            arrayList.add(valueAnimatorOfFloat2);
                        }
                        float f21 = iDp14;
                        if (gVar2.getTranslationX() != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property, f21));
                        }
                        float translationY2 = gVar2.getTranslationY();
                        float f22 = n9Var.D;
                        if (translationY2 != f22) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property2, f22));
                        }
                        gVar2.setAllowDrawCursor(false);
                        this.f7101b.playTogether(arrayList);
                        this.f7101b.setDuration(180L);
                        this.f7101b.setInterpolator(new LinearInterpolator());
                        this.f7101b.start();
                        this.f7102c = true;
                        if (z8Var2 != null) {
                            z8Var2.run();
                        }
                    } else {
                        n9Var.F = iDp13;
                        n9Var.E = iDp13;
                        gVar2.setTranslationX(iDp14);
                        gVar2.setTranslationY(n9Var.D);
                        if (z8Var2 != null) {
                            z8Var2.run();
                        }
                        if (n9Var.G) {
                            post(new kh.c(this, 19));
                            n9Var.G = false;
                        }
                    }
                } else if (this.f7101b != null) {
                    if (!n9Var.C && arrayList2.isEmpty()) {
                        gVar2.bringPointIntoView(gVar2.getSelectionStart());
                    }
                    if (n9Var.G) {
                        n9Var.fullScroll(130);
                        n9Var.G = false;
                    }
                }
                setMeasuredDimension(size2, (int) n9Var.E);
                break;
        }
    }

    public k(n9 n9Var, Context context) {
        super(context);
        this.f7105n = n9Var;
        this.d = new ArrayList();
        this.f7103e = new ArrayList();
        this.f7104f = new ArrayList();
        this.h = new ArrayList();
    }
}
