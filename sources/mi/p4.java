package mi;

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
import b8.mf;
import b8.oe;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.az;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
public final class p4 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public z2 E;
    public boolean F;
    public final int[] G;
    public final org.telegram.ui.ActionBar.e6 f19806n;
    public final Paint f19807r;
    public final HorizontalScrollView f19808s;
    public final ImageView f19809w;
    public Bitmap f19810x;
    public int f19811y;

    public p4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19807r = new Paint(1);
        this.f19811y = 0;
        this.G = new int[4];
        this.f19806n = e6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f19809w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f19808s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, mf.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f20029a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    public final void g(a aVar, z2 z2Var) {
        q a10;
        this.f20029a = aVar;
        this.E = z2Var;
        c(aVar);
        this.f19810x = null;
        this.f19808s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = q.a(source, org.telegram.messenger.g0.L(az.W0 + 4), false)) != null) {
            this.f19810x = a10.f19824a;
        }
        this.f19809w.setImageBitmap(this.f19810x);
        invalidate();
    }

    public a getRow() {
        return this.f20029a;
    }

    public final void h(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f19810x != null && this.f19809w.getWidth() > this.f19808s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f19810x;
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
        arrayList.add(oe.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z2 z2Var;
        h9 textSelectionHelper;
        if (this.f19811y != k6.w0(k6.G6, this.f19806n)) {
            updateColors();
        }
        if (this.f19810x != null && (z2Var = this.E) != null && (textSelectionHelper = z2Var.f20085a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f29352p0 && R <= textSelectionHelper.f29355s0) {
                int[] iArr = this.G;
                h(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.f19807r);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i3 = k6.ig;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19806n;
        this.f19807r.setColor(k6.w0(i3, e6Var));
        int w02 = k6.w0(k6.G6, e6Var);
        if (!this.F || w02 != this.f19811y) {
            this.F = true;
            this.f19811y = w02;
            this.f19809w.setColorFilter(new PorterDuffColorFilter(this.f19811y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
