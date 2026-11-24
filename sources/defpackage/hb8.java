package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class hb8 extends blb {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public hb8(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (this.a && z) {
            this.c.setVisibility(i);
        }
    }

    @Override
    public float getAlpha() {
        if (this.a) {
            return this.b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.a = true;
            this.c.setVisibility(getVisibility());
            this.c.setAlpha(this.b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a) {
            this.a = false;
            this.c.setVisibility(8);
            super.setAlpha(this.b);
        }
    }

    @Override
    public void setAlpha(float f) {
        this.b = f;
        if (this.a) {
            this.c.setAlpha(f);
        } else {
            super.setAlpha(f);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.a) {
            this.c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i) {
        b(i, true);
    }
}
