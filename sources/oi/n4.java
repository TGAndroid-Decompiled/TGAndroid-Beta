package oi;

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
import c8.fa;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class n4 extends x implements org.telegram.ui.ActionBar.c6, h9 {
    public y2 E;
    public boolean F;
    public final int[] G;
    public final i6 f22192n;
    public final Paint f22193r;
    public final HorizontalScrollView f22194s;
    public final ImageView f22195w;
    public Bitmap f22196x;
    public int f22197y;

    public n4(Context context, i6 i6Var) {
        super(context);
        this.f22193r = new Paint(1);
        this.f22197y = 0;
        this.G = new int[4];
        this.f22192n = i6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f22195w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f22194s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, ma.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f22442a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21910b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29552lg));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    public final void g(a aVar, y2 y2Var) {
        p a10;
        this.f22442a = aVar;
        this.E = y2Var;
        c(aVar);
        this.f22196x = null;
        this.f22194s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = p.a(source, org.telegram.messenger.g0.L(bz.W0 + 4), false)) != null) {
            this.f22196x = a10.f22229a;
        }
        this.f22195w.setImageBitmap(this.f22196x);
        invalidate();
    }

    public a getRow() {
        return this.f22442a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f22196x != null && this.f22195w.getWidth() > this.f22194s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f22196x;
        if (bitmap != null) {
            max = bitmap.getWidth();
        } else {
            max = Math.max(1, getWidth() / 2);
        }
        int width = (getWidth() - max) / 2;
        iArr[0] = width - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = org.telegram.messenger.g0.L(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int[] iArr = this.G;
        h(iArr);
        arrayList.add(fa.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y2 y2Var;
        i9 textSelectionHelper;
        if (this.f22197y != n6.w0(n6.G6, this.f22192n)) {
            updateColors();
        }
        if (this.f22196x != null && (y2Var = this.E) != null && (textSelectionHelper = y2Var.f22505a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30828p0 && R <= textSelectionHelper.f30831s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f22193r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29552lg;
        i6 i6Var = this.f22192n;
        this.f22193r.setColor(n6.w0(i7, i6Var));
        int w02 = n6.w0(n6.G6, i6Var);
        if (!this.F || w02 != this.f22197y) {
            this.F = true;
            this.f22197y = w02;
            this.f22195w.setColorFilter(new PorterDuffColorFilter(this.f22197y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
