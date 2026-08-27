package gf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

public final class f0 extends View implements ViewTreeObserver.OnPreDrawListener {

    public final e0 f6965a;

    public final boolean f6966b;

    public int f6967c;
    public ViewTreeObserver d;

    public f0(Context context, e0 e0Var) {
        super(context);
        this.f6967c = 0;
        this.f6965a = e0Var;
        this.f6966b = true;
    }

    public final void a() {
        ViewGroup viewGroup;
        int iIndexOfChild;
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(this)) < 0 || iIndexOfChild == viewGroup.getChildCount() - 1) {
            return;
        }
        viewGroup.bringChildToFront(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6966b) {
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
        if (this.f6966b) {
            return;
        }
        this.f6965a.a(this.f6967c);
        this.f6967c = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (!this.f6966b || (i10 = this.f6967c) == 0) {
            return true;
        }
        this.f6965a.a(i10);
        this.f6967c = 0;
        return true;
    }
}
