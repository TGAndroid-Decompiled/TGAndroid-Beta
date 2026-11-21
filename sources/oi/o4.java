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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
public final class o4 extends y implements org.telegram.ui.ActionBar.b6, i9 {
    public z2 E;
    public boolean F;
    public final int[] G;
    public final h6 f22282n;
    public final Paint f22283r;
    public final HorizontalScrollView f22284s;
    public final ImageView f22285w;
    public Bitmap f22286x;
    public int f22287y;

    public o4(Context context, h6 h6Var) {
        super(context);
        this.f22283r = new Paint(1);
        this.f22287y = 0;
        this.G = new int[4];
        this.f22282n = h6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f22285w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f22284s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, ma.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f22528a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21932b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29534lg));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    public final void g(a aVar, z2 z2Var) {
        p a10;
        this.f22528a = aVar;
        this.E = z2Var;
        c(aVar);
        this.f22286x = null;
        this.f22284s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = p.a(source, org.telegram.messenger.g0.L(bz.W0 + 4), false)) != null) {
            this.f22286x = a10.f22300a;
        }
        this.f22285w.setImageBitmap(this.f22286x);
        invalidate();
    }

    public a getRow() {
        return this.f22528a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f22286x != null && this.f22285w.getWidth() > this.f22284s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f22286x;
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
        z2 z2Var;
        j9 textSelectionHelper;
        if (this.f22287y != m6.w0(m6.G6, this.f22282n)) {
            updateColors();
        }
        if (this.f22286x != null && (z2Var = this.E) != null && (textSelectionHelper = z2Var.f22588a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30920p0 && R <= textSelectionHelper.f30923s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f22283r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29534lg;
        h6 h6Var = this.f22282n;
        this.f22283r.setColor(m6.w0(i7, h6Var));
        int w02 = m6.w0(m6.G6, h6Var);
        if (!this.F || w02 != this.f22287y) {
            this.F = true;
            this.f22287y = w02;
            this.f22285w.setColorFilter(new PorterDuffColorFilter(this.f22287y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
