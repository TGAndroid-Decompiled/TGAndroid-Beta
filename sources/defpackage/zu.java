package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class zu extends HorizontalScrollView implements tjb, dw {
    public final vg5 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public zu(Activity activity, vg5 vg5Var) {
        super(activity);
        this.a = vg5Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        addView(frameLayout, nme.c(-2.0f, -2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, nme.c(-2.0f, -2));
        updateColors();
    }

    @Override
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override
    public int getBoundRight() {
        if (this.d > getMeasuredWidth()) {
            return getMeasuredWidth();
        }
        return (getMeasuredWidth() + this.d) / 2;
    }

    @Override
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = this.d;
        if (i6 > i5) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        FrameLayout frameLayout = this.b;
        frameLayout.layout((i5 - i6) / 2, 0, (i5 + i6) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        lx5 a;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        int L = gl.L(18.0f);
        vg5Var.getClass();
        imageView.setPadding(L, 0, gl.L(18.0f), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        vg5Var.getClass();
        this.d = gl.L(36.0f);
        if (pageblockmath != null && (a = lx5.a(pageblockmath.source, gl.L(20.0f), false)) != null) {
            imageView.setImageBitmap(a.a);
            int C = ug8.C(vg5Var, 36.0f, a.b);
            this.d = C;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(C, a.c));
        }
    }

    @Override
    public final void updateColors() {
        ((o) this.a).getClass();
        this.c.setColorFilter(new PorterDuffColorFilter(bkb.u0(bkb.F6), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
