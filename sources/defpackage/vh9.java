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
public final class vh9 extends jd9 implements vlb, fkb {
    public ig9 E;
    public boolean F;
    public final int[] G;
    public final ylb n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public vh9(Context context, ylb ylbVar) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.G = new int[4];
        this.n = ylbVar;
        setWillNotDraw(false);
        f(gm.L(16.0f), gm.L(6.0f), gm.L(16.0f), gm.L(6.0f));
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
        addView(horizontalScrollView, qoe.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        ll0 ll0Var = this.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.kg));
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    public final void g(ll0 ll0Var, ig9 ig9Var) {
        lz5 a;
        this.a = ll0Var;
        this.E = ig9Var;
        c(ll0Var);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a = lz5.a(source, gm.L(gda.S0 + 4), false)) != null) {
            this.x = a.a;
        }
        this.w.setImageBitmap(this.x);
        invalidate();
    }

    public ll0 getRow() {
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
        iArr[0] = width - gm.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = gm.L(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int[] iArr = this.G;
        h(iArr);
        arrayList.add(zue.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ig9 ig9Var;
        gkb textSelectionHelper;
        if (this.y != cmb.v0(cmb.F6, this.n)) {
            updateColors();
        }
        if (this.x != null && (ig9Var = this.E) != null && (textSelectionHelper = ig9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], gm.L(4.0f), gm.L(4.0f), this.r);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = cmb.kg;
        ylb ylbVar = this.n;
        this.r.setColor(cmb.v0(i, ylbVar));
        int v0 = cmb.v0(cmb.F6, ylbVar);
        if (!this.F || v0 != this.y) {
            this.F = true;
            this.y = v0;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
