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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
public final class q4 extends a0 implements org.telegram.ui.ActionBar.b6, n9 {
    public boolean E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.g6 f15520n;
    public final Paint f15521r;
    public final HorizontalScrollView f15522s;
    public final ImageView v;
    public Bitmap f15523w;
    public int f15524x;
    public a3 f15525y;

    public q4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15521r = new Paint(1);
        this.f15524x = 0;
        this.F = new int[4];
        this.f15520n = g6Var;
        setWillNotDraw(false);
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f15522s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.z5.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f15157a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15141b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21508uf));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.F;
        h(iArr);
        arrayList.add(w7.j.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public final void g(a aVar, a3 a3Var) {
        r a2;
        this.f15157a = aVar;
        this.f15525y = a3Var;
        c(aVar);
        this.f15523w = null;
        this.f15522s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = r.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f15523w = a2.f15536a;
        }
        this.v.setImageBitmap(this.f15523w);
        invalidate();
    }

    public a getRow() {
        return this.f15157a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f15523w != null && this.v.getWidth() > this.f15522s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f15523w;
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
        o9 textSelectionHelper;
        if (this.f15524x != k6.w0(k6.G6, this.f15520n)) {
            updateColors();
        }
        if (this.f15523w != null && (a3Var = this.f15525y) != null && (textSelectionHelper = a3Var.f15165a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22862p0 && R <= textSelectionHelper.f22865s0) {
                int[] iArr = this.F;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f15521r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = k6.f21508uf;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15520n;
        this.f15521r.setColor(k6.w0(i10, g6Var));
        int w02 = k6.w0(k6.G6, g6Var);
        if (!this.E || w02 != this.f15524x) {
            this.E = true;
            this.f15524x = w02;
            this.v.setColorFilter(new PorterDuffColorFilter(this.f15524x, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
