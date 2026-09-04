package ji;

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
public final class r4 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.f6 f14145n;
    public final Paint f14146r;
    public final HorizontalScrollView f14147s;
    public final ImageView v;
    public Bitmap f14148w;
    public int f14149x;
    public z2 f14150y;

    public r4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14146r = new Paint(1);
        this.f14149x = 0;
        this.E = new int[4];
        this.f14145n = f6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f14147s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.x5.e(-1, -2, 16));
        d();
    }

    private String getSource() {
        a aVar = this.f13749a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13732b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.f20981uf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f14145n;
        this.f14146r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f14149x = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.f14149x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(w7.g.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.f13749a;
    }

    public final void h(a aVar, z2 z2Var) {
        s a2;
        this.f13749a = aVar;
        this.f14150y = z2Var;
        c(aVar);
        this.f14148w = null;
        this.f14147s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = s.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.f14148w = a2.f14154a;
        }
        this.v.setImageBitmap(this.f14148w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f14148w != null && this.v.getWidth() > this.f14147s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f14148w;
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
        q9 textSelectionHelper;
        if (this.f14149x != org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f14145n)) {
            d();
        }
        if (this.f14148w != null && (z2Var = this.f14150y) != null && (textSelectionHelper = z2Var.f14374a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22500u0 && R <= textSelectionHelper.f22503x0) {
                int[] iArr = this.E;
                i(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.f14146r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
