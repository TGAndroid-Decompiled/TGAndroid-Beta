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
import c8.ga;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
public final class n4 extends x implements org.telegram.ui.ActionBar.b6, i9 {
    public y2 E;
    public boolean F;
    public final int[] G;
    public final h6 f22219n;
    public final Paint f22220r;
    public final HorizontalScrollView f22221s;
    public final ImageView f22222w;
    public Bitmap f22223x;
    public int f22224y;

    public n4(Context context, h6 h6Var) {
        super(context);
        this.f22220r = new Paint(1);
        this.f22224y = 0;
        this.G = new int[4];
        this.f22219n = h6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f22222w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f22221s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, na.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f22468a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21901b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29503lg));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    public final void g(a aVar, y2 y2Var) {
        p a10;
        this.f22468a = aVar;
        this.E = y2Var;
        c(aVar);
        this.f22223x = null;
        this.f22221s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = p.a(source, org.telegram.messenger.g0.L(cz.W0 + 4), false)) != null) {
            this.f22223x = a10.f22256a;
        }
        this.f22222w.setImageBitmap(this.f22223x);
        invalidate();
    }

    public a getRow() {
        return this.f22468a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f22223x != null && this.f22222w.getWidth() > this.f22221s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f22223x;
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
        arrayList.add(ga.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y2 y2Var;
        j9 textSelectionHelper;
        if (this.f22224y != m6.w0(m6.G6, this.f22219n)) {
            updateColors();
        }
        if (this.f22223x != null && (y2Var = this.E) != null && (textSelectionHelper = y2Var.f22528a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30889p0 && R <= textSelectionHelper.f30892s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f22220r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29503lg;
        h6 h6Var = this.f22219n;
        this.f22220r.setColor(m6.w0(i7, h6Var));
        int w02 = m6.w0(m6.G6, h6Var);
        if (!this.F || w02 != this.f22224y) {
            this.F = true;
            this.f22224y = w02;
            this.f22222w.setColorFilter(new PorterDuffColorFilter(this.f22224y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
