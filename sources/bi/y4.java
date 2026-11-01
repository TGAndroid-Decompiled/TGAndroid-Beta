package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c30;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class y4 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0 {
    public static final int M = 0;
    public final ImageReceiver D;
    public final Drawable E;
    public final View F;
    public w4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final n0 L;
    public final int f3466n;
    public final org.telegram.ui.ActionBar.p6 f3467r;
    public final Paint f3468s;
    public final Paint f3469w;
    public final Paint f3470x;
    public final TextPaint f3471y;

    public y4(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f3468s = new Paint(1);
        this.f3469w = new Paint(1);
        this.f3470x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f3471y = textPaint;
        this.f3466n = i10;
        this.f3467r = p6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.D = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(2131232212).mutate();
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new ag.g(this, 6));
        addView(view, w7.b6.e(-1, -2, 51));
        n0 n0Var = new n0(context, p6Var, new za.c(this, 10));
        this.L = n0Var;
        addView(n0Var.f3214a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f2881a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.L.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20939df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21250ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21029ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override
    public final void b() {
        this.L.i();
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.L.c(canvas);
    }

    public final void g(a aVar, w4 w4Var) {
        this.f2881a = aVar;
        this.G = w4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        j();
        requestLayout();
        invalidate();
    }

    @Override
    public n1 getCaptionEditText() {
        return this.L.f3214a;
    }

    @Override
    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    public final void j() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.D;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i10 = this.K;
            if (measuredWidth > 0 && i10 > 0) {
                float f7 = org.telegram.messenger.i0.f16171p;
                int i11 = (int) (measuredWidth / f7);
                int i12 = (int) (i10 / f7);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
                if (!str.equals(this.I)) {
                    this.I = str;
                    int i13 = wp.r1(this.f3466n).f19185m3;
                    this.H = i13;
                    if (i13 == 2) {
                        imageReceiver.q0(jc.p(c30.b(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.f16171p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.o0(org.telegram.messenger.i0.e0(this.f3466n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.w0(null);
        this.I = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.P();
        this.I = null;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.D;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), this.f3468s);
            int r10 = (int) imageReceiver.r();
            int s10 = (int) imageReceiver.s();
            Drawable drawable = this.E;
            if (drawable != null) {
                int z10 = org.telegram.ui.Cells.f1.z(2, r10, drawable);
                int y3 = org.telegram.ui.Cells.f1.y(2, s10, drawable);
                drawable.setBounds(z10, y3, drawable.getIntrinsicWidth() + z10, drawable.getIntrinsicHeight() + y3);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.H == 2 && imageReceiver.L()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(2131231645).mutate();
                    }
                    int intrinsicWidth = (int) (this.J.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.J.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s11 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.J.setAlpha((int) (imageReceiver.f14385h1 * 255.0f));
                    this.J.setBounds(r11, s11, intrinsicWidth + r11, intrinsicHeight + s11);
                    this.J.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        w4 w4Var = this.G;
        if (w4Var != null && (textSelectionHelper = ((z3) w4Var).f3478a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f22187p0 && R <= textSelectionHelper.f22190s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.f3470x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.D.y0(paddingLeft, getPaddingTop(), max, this.K);
        int paddingTop = getPaddingTop() + this.K;
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.L.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.K);
        j();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f20018w > 0 && map.h > 0) {
            this.K = Math.max(Math.min((int) (((max - org.telegram.messenger.i0.L(32.0f)) * map.h) / map.f20018w), org.telegram.messenger.i0.L(420.0f)), org.telegram.messenger.i0.L(120.0f));
        } else {
            this.K = (org.telegram.messenger.i0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.f20939df;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3467r;
        this.f3468s.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f3469w.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21250ue, p6Var));
        this.f3470x.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21029ig, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.f3471y.setColor(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)), PorterDuff.Mode.SRC_IN));
        n0 n0Var = this.L;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
