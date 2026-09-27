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
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.q8;
public final class r4 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.e6 f11588n;
    public final Paint f11589r;
    public final HorizontalScrollView f11590s;
    public final ImageView v;
    public Bitmap f11591w;
    public int f11592x;
    public b3 f11593y;

    public r4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f11589r = new Paint(1);
        this.f11592x = 0;
        this.E = new int[4];
        this.f11588n = e6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f11590s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.y5.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.f11210a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11194b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f19381uf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11588n;
        this.f11589r.setColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        this.f11592x = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f11592x, PorterDuff.Mode.SRC_IN));
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
        return this.f11210a;
    }

    public final void h(a aVar, b3 b3Var) {
        s a2;
        this.f11210a = aVar;
        this.f11593y = b3Var;
        c(aVar);
        this.f11591w = null;
        this.f11590s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = s.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f11591w = a2.f11604a;
        }
        this.v.setImageBitmap(this.f11591w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f11591w != null && this.v.getWidth() > this.f11590s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f11591w;
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
        q9 textSelectionHelper;
        if (this.f11592x != org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f11588n)) {
            e();
        }
        if (this.f11591w != null && (b3Var = this.f11593y) != null && (textSelectionHelper = b3Var.f11244a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S >= textSelectionHelper.f20852u0 && S <= textSelectionHelper.f20855x0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f11589r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
