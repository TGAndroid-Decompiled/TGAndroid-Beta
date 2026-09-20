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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import v7.q8;
public final class q4 extends a0 implements org.telegram.ui.ActionBar.z5, q9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.f6 f11575n;
    public final Paint f11576r;
    public final HorizontalScrollView f11577s;
    public final ImageView v;
    public Bitmap f11578w;
    public int f11579x;
    public a3 f11580y;

    public q4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f11576r = new Paint(1);
        this.f11579x = 0;
        this.E = new int[4];
        this.f11575n = f6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f11577s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.y5.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f11221a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = j6.f19416uf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f11575n;
        this.f11576r.setColor(j6.v0(i10, f6Var));
        this.f11579x = j6.v0(j6.G6, f6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f11579x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(q8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f11221a;
    }

    public final void h(a aVar, a3 a3Var) {
        s a2;
        this.f11221a = aVar;
        this.f11580y = a3Var;
        c(aVar);
        this.f11578w = null;
        this.f11577s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = s.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f11578w = a2.f11609a;
        }
        this.v.setImageBitmap(this.f11578w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f11578w != null && this.v.getWidth() > this.f11577s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f11578w;
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
        r9 textSelectionHelper;
        if (this.f11579x != j6.v0(j6.G6, this.f11575n)) {
            e();
        }
        if (this.f11578w != null && (a3Var = this.f11580y) != null && (textSelectionHelper = a3Var.f11234a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S >= textSelectionHelper.f20889u0 && S <= textSelectionHelper.f20892x0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f11576r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
