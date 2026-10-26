package li;

import a8.ae;
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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.gb1;
public final class q4 extends z implements p6, r9 {
    public boolean E;
    public final int[] F;
    public final u6 f17430n;
    public final Paint f17431r;
    public final HorizontalScrollView f17432s;
    public final ImageView v;
    public Bitmap f17433w;
    public int f17434x;
    public z2 f17435y;

    public q4(Context context, u6 u6Var) {
        super(context);
        this.f17431r = new Paint(1);
        this.f17434x = 0;
        this.F = new int[4];
        this.f17430n = u6Var;
        setWillNotDraw(false);
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f17432s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, gb1.i(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f17653a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23682uf));
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.F;
        h(iArr);
        arrayList.add(ae.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public final void g(a aVar, z2 z2Var) {
        r a2;
        this.f17653a = aVar;
        this.f17435y = z2Var;
        c(aVar);
        this.f17433w = null;
        this.f17432s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = r.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f17433w = a2.f17436a;
        }
        this.v.setImageBitmap(this.f17433w);
        invalidate();
    }

    public a getRow() {
        return this.f17653a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f17433w != null && this.v.getWidth() > this.f17432s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f17433w;
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
        z2 z2Var;
        s9 textSelectionHelper;
        if (this.f17434x != y6.w0(y6.G6, this.f17430n)) {
            updateColors();
        }
        if (this.f17433w != null && (z2Var = this.f17435y) != null && (textSelectionHelper = z2Var.f17663a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f25410p0 && R <= textSelectionHelper.f25413s0) {
                int[] iArr = this.F;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f17431r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = y6.f23682uf;
        u6 u6Var = this.f17430n;
        this.f17431r.setColor(y6.w0(i10, u6Var));
        int w02 = y6.w0(y6.G6, u6Var);
        if (!this.E || w02 != this.f17434x) {
            this.E = true;
            this.f17434x = w02;
            this.v.setColorFilter(new PorterDuffColorFilter(this.f17434x, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
