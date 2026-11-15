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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
public final class j4 extends x implements org.telegram.ui.ActionBar.z5, g9, i0 {
    public static final int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public h4 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final h0 M;
    public final int f21758n;
    public final e6 f21759r;
    public final Paint f21760s;
    public final Paint f21761w;
    public final Paint f21762x;
    public final TextPaint f21763y;

    public j4(int i7, Context context, e6 e6Var) {
        super(context);
        this.f21760s = new Paint(1);
        this.f21761w = new Paint(1);
        this.f21762x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f21763y = textPaint;
        this.f21758n = i7;
        this.f21759r = e6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(2131232214).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new hi.p5(this, 18));
        addView(view, ja.e(-1, -2, 51));
        h0 h0Var = new h0(context, e6Var, new ia.d(this, 18));
        this.M = h0Var;
        addView(h0Var.f21719a, ja.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f22106a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
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
        hashSet.add(Integer.valueOf(j6.f28913gf));
        hashSet.add(Integer.valueOf(j6.f29229xe));
        hashSet.add(Integer.valueOf(j6.f29005lg));
        hashSet.add(Integer.valueOf(j6.G6));
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

    public final void g(a aVar, h4 h4Var) {
        this.f22106a = aVar;
        this.H = h4Var;
        c(aVar);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public e1 getCaptionEditText() {
        return this.M.f21719a;
    }

    @Override
    public a getRow() {
        return this.f22106a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i7 = this.L;
            if (measuredWidth > 0 && i7 > 0) {
                float f10 = org.telegram.messenger.g0.f23610p;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i7 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.J)) {
                    this.J = str;
                    int i12 = np.s1(this.f21758n).f25346n3;
                    this.I = i12;
                    if (i12 == 2) {
                        imageReceiver.q0(gc.p(k20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f23610p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.o0(org.telegram.messenger.g0.e0(this.f21758n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
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
        h9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), this.f21760s);
            int r10 = (int) imageReceiver.r();
            int s5 = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int A = org.telegram.ui.Cells.y0.A(2, r10, drawable);
                int y10 = org.telegram.ui.Cells.y0.y(2, s5, drawable);
                drawable.setBounds(A, y10, drawable.getIntrinsicWidth() + A, drawable.getIntrinsicHeight() + y10);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.I == 2 && imageReceiver.L()) {
                    if (this.K == null) {
                        this.K = getContext().getResources().getDrawable(2131231646).mutate();
                    }
                    int intrinsicWidth = (int) (this.K.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s9 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.f22278i1 * 255.0f));
                    this.K.setBounds(r11, s9, intrinsicWidth + r11, intrinsicHeight + s9);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        h4 h4Var = this.H;
        if (h4Var != null && (textSelectionHelper = ((m3) h4Var).f21814a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f30411p0 && R <= textSelectionHelper.f30414s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.f21762x);
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
        if (map != null && map.f28276w > 0 && map.h > 0) {
            this.L = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.f28276w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        } else {
            this.L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override
    public final void updateColors() {
        int i7 = j6.f28913gf;
        e6 e6Var = this.f21759r;
        this.f21760s.setColor(j6.w0(i7, e6Var));
        this.f21761w.setColor(j6.w0(j6.f29229xe, e6Var));
        this.f21762x.setColor(j6.w0(j6.f29005lg, e6Var));
        int i10 = j6.G6;
        this.f21763y.setColor(j6.r1(0.5f, j6.w0(i10, e6Var)));
        this.F.setColorFilter(new PorterDuffColorFilter(j6.r1(0.5f, j6.w0(i10, e6Var)), PorterDuff.Mode.SRC_IN));
        h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.a();
        }
    }
}
