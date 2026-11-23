package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
public final class m4 extends y implements org.telegram.ui.ActionBar.b6, i9, j0 {
    public static final int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public k4 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final i0 M;
    public final int f22239n;
    public final h6 f22240r;
    public final Paint f22241s;
    public final Paint f22242w;
    public final Paint f22243x;
    public final TextPaint f22244y;

    public m4(int i7, Context context, h6 h6Var) {
        super(context);
        this.f22241s = new Paint(1);
        this.f22242w = new Paint(1);
        this.f22243x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f22244y = textPaint;
        this.f22239n = i7;
        this.f22240r = h6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(2131232215).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new hi.o4(this, 19));
        addView(view, ma.e(-1, -2, 51));
        i0 i0Var = new i0(context, h6Var, new hi.t5(this, 21));
        this.M = i0Var;
        addView(i0Var.f22168a, ma.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f22531a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21935b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.M.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29445gf));
        hashSet.add(Integer.valueOf(m6.f29761xe));
        hashSet.add(Integer.valueOf(m6.f29537lg));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void b() {
        this.M.i();
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.M.c(canvas);
    }

    public final void g(a aVar, k4 k4Var) {
        this.f22531a = aVar;
        this.H = k4Var;
        c(aVar);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public f1 getCaptionEditText() {
        return this.M.f22168a;
    }

    @Override
    public a getRow() {
        return this.f22531a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i7 = this.L;
            if (measuredWidth > 0 && i7 > 0) {
                float f10 = org.telegram.messenger.g0.f24045p;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i7 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.J)) {
                    this.J = str;
                    int i12 = np.u1(this.f22239n).f25928p3;
                    this.I = i12;
                    if (i12 == 2) {
                        imageReceiver.q0(gc.p(i20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f24045p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.o0(org.telegram.messenger.g0.e0(this.f22239n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.w0(null);
        this.J = null;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.M.e(arrayList);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.P();
        this.J = null;
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        j9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), this.f22241s);
            int r10 = (int) imageReceiver.r();
            int s5 = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int C = org.telegram.ui.Cells.c0.C(2, r10, drawable);
                int A = org.telegram.ui.Cells.c0.A(2, s5, drawable);
                drawable.setBounds(C, A, drawable.getIntrinsicWidth() + C, drawable.getIntrinsicHeight() + A);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.I == 2 && imageReceiver.L()) {
                    if (this.K == null) {
                        this.K = getContext().getResources().getDrawable(2131231647).mutate();
                    }
                    int intrinsicWidth = (int) (this.K.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s9 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.f22672i1 * 255.0f));
                    this.K.setBounds(r11, s9, intrinsicWidth + r11, intrinsicHeight + s9);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        k4 k4Var = this.H;
        if (k4Var != null && (textSelectionHelper = ((p3) k4Var).f22312a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f30923p0 && R <= textSelectionHelper.f30926s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.f22243x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i7;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.E.y0(paddingLeft, getPaddingTop(), max, this.L);
        int paddingTop = getPaddingTop() + this.L;
        this.G.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.M.g(paddingLeft, paddingRight, i13, getPaddingTop() + this.L);
        h();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f28659w > 0 && map.h > 0) {
            this.L = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.f28659w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        } else {
            this.L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29445gf;
        h6 h6Var = this.f22240r;
        this.f22241s.setColor(m6.w0(i7, h6Var));
        this.f22242w.setColor(m6.w0(m6.f29761xe, h6Var));
        this.f22243x.setColor(m6.w0(m6.f29537lg, h6Var));
        int i10 = m6.G6;
        this.f22244y.setColor(m6.r1(0.5f, m6.w0(i10, h6Var)));
        this.F.setColorFilter(new PorterDuffColorFilter(m6.r1(0.5f, m6.w0(i10, h6Var)), PorterDuff.Mode.SRC_IN));
        i0 i0Var = this.M;
        if (i0Var != null) {
            i0Var.a();
        }
    }
}
