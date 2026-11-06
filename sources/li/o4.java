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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class o4 extends y implements org.telegram.ui.ActionBar.a6, h9 {
    public y2 D;
    public boolean E;
    public final int[] F;
    public final f6 f18739n;
    public final Paint f18740r;
    public final HorizontalScrollView f18741s;
    public final ImageView f18742w;
    public Bitmap f18743x;
    public int f18744y;

    public o4(Context context, f6 f6Var) {
        super(context);
        this.f18740r = new Paint(1);
        this.f18744y = 0;
        this.F = new int[4];
        this.f18739n = f6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f18742w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f18741s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, ha.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f18986a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18389b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27948ig));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    public final void g(a aVar, y2 y2Var) {
        q a10;
        this.f18986a = aVar;
        this.D = y2Var;
        c(aVar);
        this.f18743x = null;
        this.f18741s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = q.a(source, org.telegram.messenger.g0.L(iz.W0 + 4), false)) != null) {
            this.f18743x = a10.f18778a;
        }
        this.f18742w.setImageBitmap(this.f18743x);
        invalidate();
    }

    public a getRow() {
        return this.f18986a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f18743x != null && this.f18742w.getWidth() > this.f18741s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f18743x;
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
        if (this.f18744y != k6.w0(k6.G6, this.f18739n)) {
            updateColors();
        }
        if (this.f18743x != null && (y2Var = this.D) != null && (textSelectionHelper = y2Var.f18995a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f29313p0 && R <= textSelectionHelper.f29316s0) {
                int[] iArr = this.F;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f18740r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = k6.f27948ig;
        f6 f6Var = this.f18739n;
        this.f18740r.setColor(k6.w0(i7, f6Var));
        int w02 = k6.w0(k6.G6, f6Var);
        if (!this.E || w02 != this.f18744y) {
            this.E = true;
            this.f18744y = w02;
            this.f18742w.setColorFilter(new PorterDuffColorFilter(this.f18744y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
