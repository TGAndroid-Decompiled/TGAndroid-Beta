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
public class vq4 extends ScrollView {
    public final int a;
    public final zh6 b;
    public final ArrayList c;
    public final uq4 d;
    public int e;
    public sq4 f;
    public boolean h;
    public int n;

    public vq4(Context context, int i) {
        super(context);
        this.b = new zh6();
        this.c = new ArrayList();
        this.a = i;
        uq4 uq4Var = new uq4(this, context);
        this.d = uq4Var;
        setVerticalScrollBarEnabled(false);
        addView(uq4Var, tre.c(-2.0f, -1));
    }

    public void a(zc5 zc5Var) {
        uq4 uq4Var = this.d;
        ArrayList arrayList = uq4Var.c;
        vq4 vq4Var = uq4Var.r;
        vq4Var.c.add(zc5Var);
        if (!zc5Var.d) {
            vq4Var.b.k(zc5Var.getUid(), zc5Var);
        }
        AnimatorSet animatorSet = uq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            uq4Var.a.setupEndValues();
            uq4Var.a.cancel();
        }
        uq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        uq4Var.a = animatorSet2;
        animatorSet2.addListener(new tq4(uq4Var, (byte) 1));
        uq4Var.a.setDuration(150L);
        uq4Var.d = zc5Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(uq4Var.d, View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(uq4Var.d, View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(uq4Var.d, View.ALPHA, 0.0f, 1.0f));
        uq4Var.addView(zc5Var);
    }

    public void b() {
        uq4 uq4Var = this.d;
        ArrayList arrayList = uq4Var.c;
        vq4 vq4Var = uq4Var.r;
        vq4Var.h = true;
        ArrayList arrayList2 = vq4Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = uq4Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i = 0; i < arrayList3.size(); i++) {
            ((zc5) arrayList3.get(i)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = uq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            uq4Var.a.setupEndValues();
            uq4Var.a.cancel();
        }
        uq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        uq4Var.a = animatorSet2;
        animatorSet2.addListener(new v5(uq4Var, arrayList3, (byte) 23));
        arrayList.clear();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            zc5 zc5Var = (zc5) arrayList3.get(i2);
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, View.ALPHA, 1.0f, 0.0f));
        }
        uq4Var.requestLayout();
    }

    public void c(zc5 zc5Var) {
        uq4 uq4Var = this.d;
        ArrayList arrayList = uq4Var.e;
        ArrayList arrayList2 = uq4Var.c;
        vq4 vq4Var = uq4Var.r;
        vq4Var.h = true;
        if (!zc5Var.d) {
            vq4Var.b.l(zc5Var.getUid());
        }
        vq4Var.c.remove(zc5Var);
        zc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = uq4Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            uq4Var.a.cancel();
        }
        uq4Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        uq4Var.a = animatorSet2;
        animatorSet2.addListener(new v5(uq4Var, zc5Var, (byte) 22));
        uq4Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(zc5Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(zc5Var, View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(zc5Var, View.ALPHA, 1.0f, 0.0f));
        uq4Var.requestLayout();
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
        rect.top = uh9.w(20.0f, this.n, rect.top);
        rect.bottom = uh9.w(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setDelegate(sq4 sq4Var) {
        this.f = sq4Var;
    }
}
