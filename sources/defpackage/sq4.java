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
public class sq4 extends ScrollView {
    public final int a;
    public final vh6 b;
    public final ArrayList c;
    public final rq4 d;
    public int e;
    public pq4 f;
    public boolean h;
    public int n;

    public sq4(Context context, int i) {
        super(context);
        this.b = new vh6();
        this.c = new ArrayList();
        this.a = i;
        rq4 rq4Var = new rq4(this, context);
        this.d = rq4Var;
        setVerticalScrollBarEnabled(false);
        addView(rq4Var, qoe.c(-2.0f, -1));
    }

    public void a(wc5 wc5Var) {
        rq4 rq4Var = this.d;
        ArrayList arrayList = rq4Var.c;
        sq4 sq4Var = rq4Var.r;
        sq4Var.c.add(wc5Var);
        if (!wc5Var.d) {
            sq4Var.b.k(wc5Var, wc5Var.getUid());
        }
        AnimatorSet animatorSet = rq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            rq4Var.a.setupEndValues();
            rq4Var.a.cancel();
        }
        rq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        rq4Var.a = animatorSet2;
        animatorSet2.addListener(new qq4(rq4Var, (byte) 1));
        rq4Var.a.setDuration(150L);
        rq4Var.d = wc5Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(rq4Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(rq4Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(rq4Var.d, View.ALPHA, 0.0f, 1.0f));
        rq4Var.addView(wc5Var);
    }

    public void b() {
        rq4 rq4Var = this.d;
        ArrayList arrayList = rq4Var.c;
        sq4 sq4Var = rq4Var.r;
        sq4Var.h = true;
        ArrayList arrayList2 = sq4Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = rq4Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i = 0; i < arrayList3.size(); i++) {
            ((wc5) arrayList3.get(i)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = rq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            rq4Var.a.setupEndValues();
            rq4Var.a.cancel();
        }
        rq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        rq4Var.a = animatorSet2;
        animatorSet2.addListener(new u5(rq4Var, arrayList3, (byte) 23));
        arrayList.clear();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            wc5 wc5Var = (wc5) arrayList3.get(i2);
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, View.ALPHA, 1.0f, 0.0f));
        }
        rq4Var.requestLayout();
    }

    public void c(wc5 wc5Var) {
        rq4 rq4Var = this.d;
        ArrayList arrayList = rq4Var.e;
        ArrayList arrayList2 = rq4Var.c;
        sq4 sq4Var = rq4Var.r;
        sq4Var.h = true;
        if (!wc5Var.d) {
            sq4Var.b.l(wc5Var.getUid());
        }
        sq4Var.c.remove(wc5Var);
        wc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = rq4Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            rq4Var.a.cancel();
        }
        rq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        rq4Var.a = animatorSet2;
        animatorSet2.addListener(new u5(rq4Var, wc5Var, (byte) 22));
        rq4Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(wc5Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(wc5Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(wc5Var, View.ALPHA, 1.0f, 0.0f));
        rq4Var.requestLayout();
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
        rect.top = hg9.v(20.0f, this.n, rect.top);
        rect.bottom = hg9.v(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setDelegate(pq4 pq4Var) {
        this.f = pq4Var;
    }
}
