package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class rf9 extends jb9 implements tjb, eib {
    public ee9 E;
    public boolean F;
    public final int[] G;
    public final wjb n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public rf9(Context context, wjb wjbVar) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.G = new int[4];
        this.n = wjbVar;
        setWillNotDraw(false);
        f(gl.L(16.0f), gl.L(6.0f), gl.L(16.0f), gl.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, nme.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        lk0 lk0Var = this.a;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.kg));
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    public final void g(lk0 lk0Var, ee9 ee9Var) {
        lx5 a;
        this.a = lk0Var;
        this.E = ee9Var;
        c(lk0Var);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a = lx5.a(source, gl.L(gba.T0 + 4), false)) != null) {
            this.x = a.a;
        }
        this.w.setImageBitmap(this.x);
        invalidate();
    }

    public lk0 getRow() {
        return this.a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.x != null && this.w.getWidth() > this.s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.x;
        if (bitmap != null) {
            max = bitmap.getWidth();
        } else {
            max = Math.max(1, getWidth() / 2);
        }
        int width = (getWidth() - max) / 2;
        iArr[0] = width - gl.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = gl.L(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int[] iArr = this.G;
        h(iArr);
        arrayList.add(wse.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ee9 ee9Var;
        fib textSelectionHelper;
        if (this.y != bkb.v0(bkb.F6, this.n)) {
            updateColors();
        }
        if (this.x != null && (ee9Var = this.E) != null && (textSelectionHelper = ee9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], gl.L(4.0f), gl.L(4.0f), this.r);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = bkb.kg;
        wjb wjbVar = this.n;
        this.r.setColor(bkb.v0(i, wjbVar));
        int v0 = bkb.v0(bkb.F6, wjbVar);
        if (!this.F || v0 != this.y) {
            this.F = true;
            this.y = v0;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
