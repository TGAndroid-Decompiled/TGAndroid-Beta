package jf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
public final class e0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final d0 f11579a;
    public final boolean f11580b;
    public int f11581c;
    public ViewTreeObserver d;

    public e0(Context context, d0 d0Var) {
        super(context);
        this.f11581c = 0;
        this.f11579a = d0Var;
        this.f11580b = true;
    }

    public final void a() {
        ViewGroup viewGroup;
        int indexOfChild;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(this)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11580b) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.d = viewTreeObserver;
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.d.removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f11580b) {
            this.f11579a.b(this.f11581c);
            this.f11581c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f11580b && (i10 = this.f11581c) != 0) {
            this.f11579a.b(i10);
            this.f11581c = 0;
            return true;
        }
        return true;
    }
}
