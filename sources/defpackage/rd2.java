package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class rd2 extends LinearLayout {
    public i49 a;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd2.onMeasure(int, int):void");
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new q72(this, actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 6));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            fj8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new qd2(this, (byte) 0));
        }
    }

    public void setReactionsLayout(i49 i49Var) {
        this.a = i49Var;
        if (i49Var != null) {
            i49Var.setChatScrimView(this);
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
