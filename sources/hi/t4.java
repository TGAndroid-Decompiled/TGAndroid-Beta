package hi;

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
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import v7.g8;
public final class t4 extends b0 implements org.telegram.ui.ActionBar.a6, r9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.f6 f9860n;
    public final Paint f9861r;
    public final HorizontalScrollView f9862s;
    public final ImageView v;
    public Bitmap f9863w;
    public int f9864x;
    public d3 f9865y;

    public t4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9861r = new Paint(1);
        this.f9864x = 0;
        this.E = new int[4];
        this.f9860n = f6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f9862s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.a6.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f9464a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.f18245uf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9860n;
        this.f9861r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f9864x = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f9864x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(g8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f9464a;
    }

    public final void h(a aVar, d3 d3Var) {
        t a2;
        this.f9464a = aVar;
        this.f9865y = d3Var;
        c(aVar);
        this.f9863w = null;
        this.f9862s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = t.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f9863w = a2.f9850a;
        }
        this.v.setImageBitmap(this.f9863w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f9863w != null && this.v.getWidth() > this.f9862s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f9863w;
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
        d3 d3Var;
        s9 textSelectionHelper;
        if (this.f9864x != org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f9860n)) {
            e();
        }
        if (this.f9863w != null && (d3Var = this.f9865y) != null && (textSelectionHelper = d3Var.f9518a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f20047u0 && R <= textSelectionHelper.f20050x0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f9861r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
