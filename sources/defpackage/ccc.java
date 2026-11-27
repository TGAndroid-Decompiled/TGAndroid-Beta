package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.UsersSelectActivity;
public final class ccc extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public zc5 d;
    public zc5 e;
    public final UsersSelectActivity f;

    public ccc(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f = usersSelectActivity;
        this.c = new ArrayList();
    }

    public final void a(zc5 zc5Var, boolean z) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.Q.add(zc5Var);
        long uid = zc5Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x++;
        }
        usersSelectActivity.P.k(uid, zc5Var);
        m7 m7Var = usersSelectActivity.c;
        m7Var.t(false, TextUtils.isEmpty(m7Var.getText()));
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a = animatorSet2;
            animatorSet2.addListener(new omb(this, (byte) 14));
            this.a.setDuration(150L);
            this.d = zc5Var;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(zc5Var);
    }

    public final void b(zc5 zc5Var) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.w = true;
        long uid = zc5Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x--;
        }
        usersSelectActivity.P.l(uid);
        usersSelectActivity.Q.remove(zc5Var);
        zc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new wd8((Object) this, (Object) zc5Var, (byte) 20));
        this.a.setDuration(150L);
        this.e = zc5Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int D;
        int i3;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(26.0f);
        int L2 = hl.L(10.0f);
        int L3 = hl.L(10.0f);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.c;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt instanceof zc5) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i5 > L) {
                    L2 = uh9.w(8.0f, childAt.getMeasuredHeight(), L2);
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + i6 > L) {
                    L3 = uh9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i6 = 0;
                }
                int L4 = hl.L(13.0f) + i5;
                if (!this.b) {
                    zc5 zc5Var = this.e;
                    if (childAt == zc5Var) {
                        childAt.setTranslationX(hl.L(13.0f) + i6);
                        childAt.setTranslationY(L3);
                    } else if (zc5Var != null) {
                        float f = L4;
                        if (childAt.getTranslationX() != f) {
                            i3 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f));
                        } else {
                            i3 = 1;
                        }
                        float f2 = L2;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.e) {
                    i5 = uh9.w(9.0f, childAt.getMeasuredWidth(), i5);
                }
                i6 = uh9.w(9.0f, childAt.getMeasuredWidth(), i6);
            }
            i4++;
        }
        if (hl.O1()) {
            D = hl.L(372.0f) / 3;
        } else {
            Point point = hl.q;
            D = ik8.D(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i5 < D) {
            L2 += hl.L(40.0f);
            i5 = 0;
        }
        if (L - i6 < D) {
            L3 += hl.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.c.measure(View.MeasureSpec.makeMeasureSpec(L - i5, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
        if (!this.b) {
            int L5 = hl.L(42.0f) + L3;
            int L6 = hl.L(16.0f) + i5;
            usersSelectActivity.S = L2;
            if (this.a != null) {
                int L7 = hl.L(42.0f) + L2;
                if (usersSelectActivity.E != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f3 = L6;
                if (usersSelectActivity.c.getTranslationX() != f3) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, property2, f3));
                }
                float translationY = usersSelectActivity.c.getTranslationY();
                float f4 = usersSelectActivity.S;
                if (translationY != f4) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, property, f4));
                }
                usersSelectActivity.c.setAllowDrawCursor(false);
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                usersSelectActivity.E = L5;
                usersSelectActivity.c.setTranslationX(L6);
                usersSelectActivity.c.setTranslationY(usersSelectActivity.S);
            }
        } else if (this.a != null && !usersSelectActivity.w && this.e == null) {
            m7 m7Var = usersSelectActivity.c;
            m7Var.bringPointIntoView(m7Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.E);
    }
}
