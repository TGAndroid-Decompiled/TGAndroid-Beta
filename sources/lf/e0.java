package lf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
public final class e0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final d0 f11973a;
    public final boolean f11974b;
    public int f11975c;
    public ViewTreeObserver d;

    public e0(Context context, d0 d0Var) {
        super(context);
        this.f11975c = 0;
        this.f11973a = d0Var;
        this.f11974b = true;
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
        if (this.f11974b) {
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
        if (!this.f11974b) {
            this.f11973a.a(this.f11975c);
            this.f11975c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f11974b && (i10 = this.f11975c) != 0) {
            this.f11973a.a(i10);
            this.f11975c = 0;
            return true;
        }
        return true;
    }
}
