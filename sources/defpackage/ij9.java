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
public final class ij9 extends ze9 implements snb, zlb {
    public vh9 E;
    public boolean F;
    public final int[] G;
    public final vnb n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public ij9(Context context, vnb vnbVar) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.G = new int[4];
        this.n = vnbVar;
        setWillNotDraw(false);
        f(hl.L(16.0f), hl.L(6.0f), hl.L(16.0f), hl.L(6.0f));
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
        addView(horizontalScrollView, tre.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        mk0 mk0Var = this.a;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.lg));
        hashSet.add(Integer.valueOf(aob.G6));
    }

    public final void g(mk0 mk0Var, vh9 vh9Var) {
        qz5 a;
        this.a = mk0Var;
        this.E = vh9Var;
        c(mk0Var);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a = qz5.a(source, hl.L(xea.S0 + 4), false)) != null) {
            this.x = a.a;
        }
        this.w.setImageBitmap(this.x);
        invalidate();
    }

    public mk0 getRow() {
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
        iArr[0] = width - hl.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = hl.L(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int[] iArr = this.G;
        h(iArr);
        arrayList.add(oxe.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vh9 vh9Var;
        amb textSelectionHelper;
        if (this.y != aob.v0(aob.G6, this.n)) {
            updateColors();
        }
        if (this.x != null && (vh9Var = this.E) != null && (textSelectionHelper = vh9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S >= textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], hl.L(4.0f), hl.L(4.0f), this.r);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int i = aob.lg;
        vnb vnbVar = this.n;
        this.r.setColor(aob.v0(i, vnbVar));
        int v0 = aob.v0(aob.G6, vnbVar);
        if (!this.F || v0 != this.y) {
            this.F = true;
            this.y = v0;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
