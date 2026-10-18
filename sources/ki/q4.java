package ki;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
public final class q4 extends a0 implements org.telegram.ui.ActionBar.y5, m9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.d6 f15459n;
    public final Paint f15460r;
    public final HorizontalScrollView f15461s;
    public final ImageView v;
    public Bitmap f15462w;
    public int f15463x;
    public a3 f15464y;

    public q4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f15460r = new Paint(1);
        this.f15463x = 0;
        this.E = new int[4];
        this.f15459n = d6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f15461s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.z5.e(-1, -2, 16));
        d();
    }

    private String getSource() {
        a aVar = this.f15110a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15094b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d() {
        int i10 = h6.f21310uf;
        org.telegram.ui.ActionBar.d6 d6Var = this.f15459n;
        this.f15460r.setColor(h6.w0(i10, d6Var));
        this.f15463x = h6.w0(h6.G6, d6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f15463x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(w7.j.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f15110a;
    }

    public final void h(a aVar, a3 a3Var) {
        r a2;
        this.f15110a = aVar;
        this.f15464y = a3Var;
        c(aVar);
        this.f15462w = null;
        this.f15461s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = r.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f15462w = a2.f15475a;
        }
        this.v.setImageBitmap(this.f15462w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f15462w != null && this.v.getWidth() > this.f15461s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f15462w;
        if (bitmap != null) {
            max = bitmap.getWidth();
        } else {
            max = Math.max(1, getWidth() / 2);
        }
        int width = (getWidth() - max) / 2;
        iArr[0] = width - AndroidUtilities.dp(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = AndroidUtilities.dp(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a3 a3Var;
        n9 textSelectionHelper;
        if (this.f15463x != h6.w0(h6.G6, this.f15459n)) {
            d();
        }
        if (this.f15462w != null && (a3Var = this.f15464y) != null && (textSelectionHelper = a3Var.f15118a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22653p0 && R <= textSelectionHelper.f22656s0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f15460r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
