package ii;

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
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import v7.o8;
public final class s4 extends a0 implements org.telegram.ui.ActionBar.z5, n9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.e6 f12679n;
    public final Paint f12680r;
    public final HorizontalScrollView f12681s;
    public final ImageView v;
    public Bitmap f12682w;
    public int f12683x;
    public b3 f12684y;

    public s4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12680r = new Paint(1);
        this.f12683x = 0;
        this.E = new int[4];
        this.f12679n = e6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f12681s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.x5.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f12251a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f21123uf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12679n;
        this.f12680r.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f12683x = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f12683x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(o8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f12251a;
    }

    public final void h(a aVar, b3 b3Var) {
        s a2;
        this.f12251a = aVar;
        this.f12684y = b3Var;
        c(aVar);
        this.f12682w = null;
        this.f12681s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = s.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f12682w = a2.f12665a;
        }
        this.v.setImageBitmap(this.f12682w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f12682w != null && this.v.getWidth() > this.f12681s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f12682w;
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
        b3 b3Var;
        o9 textSelectionHelper;
        if (this.f12683x != org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.f12679n)) {
            e();
        }
        if (this.f12682w != null && (b3Var = this.f12684y) != null && (textSelectionHelper = b3Var.f12288a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22613p0 && R <= textSelectionHelper.f22616s0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f12680r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
