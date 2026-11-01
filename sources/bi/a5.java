package bi;

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
import org.telegram.messenger.uz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class a5 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public i3 D;
    public boolean E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.p6 f2843n;
    public final Paint f2844r;
    public final HorizontalScrollView f2845s;
    public final ImageView f2846w;
    public Bitmap f2847x;
    public int f2848y;

    public a5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2844r = new Paint(1);
        this.f2848y = 0;
        this.F = new int[4];
        this.f2843n = p6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.f2846w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f2845s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.b6.e(-1, -2, 16));
        updateColors();
    }

    private String getSource() {
        a aVar = this.f2881a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return ((TL_iv.pageBlockMath) pageBlock).source;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21029ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    public final void g(a aVar, i3 i3Var) {
        u a2;
        this.f2881a = aVar;
        this.D = i3Var;
        c(aVar);
        this.f2847x = null;
        this.f2845s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = u.a(source, org.telegram.messenger.i0.L(uz.W0 + 4), false)) != null) {
            this.f2847x = a2.f3369a;
        }
        this.f2846w.setImageBitmap(this.f2847x);
        invalidate();
    }

    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        int[] iArr = this.F;
        j(iArr);
        arrayList.add(v7.b5.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public final void j(int[] iArr) {
        int max;
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.f2847x != null && this.f2846w.getWidth() > this.f2845s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.f2847x;
        if (bitmap != null) {
            max = bitmap.getWidth();
        } else {
            max = Math.max(1, getWidth() / 2);
        }
        int width = (getWidth() - max) / 2;
        iArr[0] = width - org.telegram.messenger.i0.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = org.telegram.messenger.i0.L(4.0f) + width + max;
        iArr[3] = height;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i3 i3Var;
        k9 textSelectionHelper;
        if (this.f2848y != org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f2843n)) {
            updateColors();
        }
        if (this.f2847x != null && (i3Var = this.D) != null && (textSelectionHelper = i3Var.f3074a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22187p0 && R <= textSelectionHelper.f22190s0) {
                int[] iArr = this.F;
                j(iArr);
                canvas.drawRoundRect(iArr[0], iArr[1], iArr[2], iArr[3], org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.f2844r);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.f21029ig;
        org.telegram.ui.ActionBar.p6 p6Var = this.f2843n;
        this.f2844r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var);
        if (!this.E || w02 != this.f2848y) {
            this.E = true;
            this.f2848y = w02;
            this.f2846w.setColorFilter(new PorterDuffColorFilter(this.f2848y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
