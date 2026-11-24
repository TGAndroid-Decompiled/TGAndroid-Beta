package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;
public class ro4 extends ScrollView {
    public final int a;
    public final vf6 b;
    public final ArrayList c;
    public final qo4 d;
    public int e;
    public oo4 f;
    public boolean h;
    public int n;

    public ro4(Context context, int i) {
        super(context);
        this.b = new vf6();
        this.c = new ArrayList();
        this.a = i;
        qo4 qo4Var = new qo4(this, context);
        this.d = qo4Var;
        setVerticalScrollBarEnabled(false);
        addView(qo4Var, nme.c(-2.0f, -1));
    }

    public void a(ya5 ya5Var) {
        qo4 qo4Var = this.d;
        ArrayList arrayList = qo4Var.c;
        ro4 ro4Var = qo4Var.r;
        ro4Var.c.add(ya5Var);
        if (!ya5Var.d) {
            ro4Var.b.k(ya5Var, ya5Var.getUid());
        }
        AnimatorSet animatorSet = qo4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            qo4Var.a.setupEndValues();
            qo4Var.a.cancel();
        }
        qo4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        qo4Var.a = animatorSet2;
        animatorSet2.addListener(new po4(qo4Var, (byte) 1));
        qo4Var.a.setDuration(150L);
        qo4Var.d = ya5Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(qo4Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(qo4Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(qo4Var.d, View.ALPHA, 0.0f, 1.0f));
        qo4Var.addView(ya5Var);
    }

    public void b() {
        qo4 qo4Var = this.d;
        ArrayList arrayList = qo4Var.c;
        ro4 ro4Var = qo4Var.r;
        ro4Var.h = true;
        ArrayList arrayList2 = ro4Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = qo4Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i = 0; i < arrayList3.size(); i++) {
            ((ya5) arrayList3.get(i)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = qo4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            qo4Var.a.setupEndValues();
            qo4Var.a.cancel();
        }
        qo4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        qo4Var.a = animatorSet2;
        animatorSet2.addListener(new u5(qo4Var, arrayList3, (byte) 23));
        arrayList.clear();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            ya5 ya5Var = (ya5) arrayList3.get(i2);
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
        }
        qo4Var.requestLayout();
    }

    public void c(ya5 ya5Var) {
        qo4 qo4Var = this.d;
        ArrayList arrayList = qo4Var.e;
        ArrayList arrayList2 = qo4Var.c;
        ro4 ro4Var = qo4Var.r;
        ro4Var.h = true;
        if (!ya5Var.d) {
            ro4Var.b.l(ya5Var.getUid());
        }
        ro4Var.c.remove(ya5Var);
        ya5Var.setOnClickListener(null);
        AnimatorSet animatorSet = qo4Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            qo4Var.a.cancel();
        }
        qo4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        qo4Var.a = animatorSet2;
        animatorSet2.addListener(new u5(qo4Var, ya5Var, (byte) 22));
        qo4Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(ya5Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(ya5Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(ya5Var, View.ALPHA, 1.0f, 0.0f));
        qo4Var.requestLayout();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f = this.e;
        float y = motionEvent.getY();
        if (action == 0 && y > f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ViewGroup getSpansContainer() {
        return this.d;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = de9.w(20.0f, this.n, rect.top);
        rect.bottom = de9.w(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setDelegate(oo4 oo4Var) {
        this.f = oo4Var;
    }
}
