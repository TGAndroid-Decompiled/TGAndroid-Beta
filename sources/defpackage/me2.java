package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class me2 extends LinearLayout {
    public v29 a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public FrameLayout c;
    public int d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;

    public final void a() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.n + this.r);
        }
    }

    public final void b() {
        float f = (1.0f - this.f) * this.e;
        this.b.setTranslationX(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me2.onMeasure(int, int):void");
    }

    public void setExpandSize(float f) {
        this.b.setTranslationY(f);
        this.n = f;
        a();
    }

    public void setMaxHeight(int i) {
        this.d = i;
    }

    public void setPopupAlpha(float f) {
        this.b.setAlpha(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new x92(this, actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 5));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            th8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new le2(this, (byte) 0));
        }
    }

    public void setReactionsLayout(v29 v29Var) {
        this.a = v29Var;
        if (v29Var != null) {
            v29Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f) {
        this.b.setReactionsTransitionProgress(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
            float f2 = (f * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.c.setPivotY(0.0f);
            this.r = (1.0f - f) * (-this.b.getMeasuredHeight());
            a();
            this.c.setScaleX(f2);
            this.c.setScaleY(f2);
        }
    }
}
