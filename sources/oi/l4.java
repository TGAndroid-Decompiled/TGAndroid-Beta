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
import c8.da;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
public final class l4 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public w2 E;
    public boolean F;
    public final int[] G;
    public final e6 f21799n;
    public final Paint f21800r;
    public final HorizontalScrollView f21801s;
    public final ImageView f21802w;
    public Bitmap f21803x;
    public int f21804y;

    public l4(Context context, e6 e6Var) {
        super(context);
        this.f21800r = new Paint(1);
        this.f21804y = 0;
        this.G = new int[4];
        this.f21799n = e6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f21802w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f21801s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, ja.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f22106a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.f29005lg));
        hashSet.add(Integer.valueOf(j6.G6));
    }

    public final void g(a aVar, w2 w2Var) {
        p a10;
        this.f22106a = aVar;
        this.E = w2Var;
        c(aVar);
        this.f21803x = null;
        this.f21801s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = p.a(source, org.telegram.messenger.g0.L(gz.W0 + 4), false)) != null) {
            this.f21803x = a10.f21862a;
        }
        this.f21802w.setImageBitmap(this.f21803x);
        invalidate();
    }

    public a getRow() {
        return this.f22106a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f21803x != null && this.f21802w.getWidth() > this.f21801s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f21803x;
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
        arrayList.add(da.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w2 w2Var;
        h9 textSelectionHelper;
        if (this.f21804y != j6.w0(j6.G6, this.f21799n)) {
            updateColors();
        }
        if (this.f21803x != null && (w2Var = this.E) != null && (textSelectionHelper = w2Var.f22092a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30411p0 && R <= textSelectionHelper.f30414s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f21800r);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = j6.f29005lg;
        e6 e6Var = this.f21799n;
        this.f21800r.setColor(j6.w0(i7, e6Var));
        int w02 = j6.w0(j6.G6, e6Var);
        if (!this.F || w02 != this.f21804y) {
            this.F = true;
            this.f21804y = w02;
            this.f21802w.setColorFilter(new PorterDuffColorFilter(this.f21804y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
