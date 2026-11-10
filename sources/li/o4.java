package li;

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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class o4 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public y2 D;
    public boolean E;
    public final int[] F;
    public final h6 f18745n;
    public final Paint f18746r;
    public final HorizontalScrollView f18747s;
    public final ImageView f18748w;
    public Bitmap f18749x;
    public int f18750y;

    public o4(Context context, h6 h6Var) {
        super(context);
        this.f18746r = new Paint(1);
        this.f18750y = 0;
        this.F = new int[4];
        this.f18745n = h6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f18748w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f18747s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, ha.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f18994a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18395b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f27990ig));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    public final void g(a aVar, y2 y2Var) {
        q a10;
        this.f18994a = aVar;
        this.D = y2Var;
        c(aVar);
        this.f18749x = null;
        this.f18747s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = q.a(source, org.telegram.messenger.g0.L(iz.W0 + 4), false)) != null) {
            this.f18749x = a10.f18784a;
        }
        this.f18748w.setImageBitmap(this.f18749x);
        invalidate();
    }

    public a getRow() {
        return this.f18994a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f18749x != null && this.f18748w.getWidth() > this.f18747s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f18749x;
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
        int[] iArr = this.F;
        h(iArr);
        arrayList.add(c8.m1.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y2 y2Var;
        i9 textSelectionHelper;
        if (this.f18750y != m6.w0(m6.G6, this.f18745n)) {
            updateColors();
        }
        if (this.f18749x != null && (y2Var = this.D) != null && (textSelectionHelper = y2Var.f19003a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f29332p0 && R <= textSelectionHelper.f29335s0) {
                int[] iArr = this.F;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f18746r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f27990ig;
        h6 h6Var = this.f18745n;
        this.f18746r.setColor(m6.w0(i7, h6Var));
        int w02 = m6.w0(m6.G6, h6Var);
        if (!this.E || w02 != this.f18750y) {
            this.E = true;
            this.f18750y = w02;
            this.f18748w.setColorFilter(new PorterDuffColorFilter(this.f18750y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
