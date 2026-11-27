package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class gj9 extends ze9 implements snb, zlb, jf9 {
    public static final int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public ej9 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final if9 M;
    public final int n;
    public final vnb r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final TextPaint y;

    public gj9(int i, vnb vnbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        this.n = i;
        this.r = vnbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(2131232218).mutate();
        f(hl.L(16.0f), hl.L(6.0f), hl.L(16.0f), hl.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new jn8(this, (byte) 12));
        addView(view, tre.e(-1, -2, 51));
        if9 if9Var = new if9(context, vnbVar, new ve9(this, (byte) 2));
        this.M = if9Var;
        addView(if9Var.a, tre.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        mk0 mk0Var = this.a;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i, int i2) {
        return this.M.f(i, i2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.gf));
        hashSet.add(Integer.valueOf(aob.xe));
        hashSet.add(Integer.valueOf(aob.lg));
        hashSet.add(Integer.valueOf(aob.G6));
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

    public final void g(mk0 mk0Var, ej9 ej9Var) {
        this.a = mk0Var;
        this.H = ej9Var;
        c(mk0Var);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public dg9 getCaptionEditText() {
        return this.M.a;
    }

    @Override
    public mk0 getRow() {
        return this.a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i = this.L;
            if (measuredWidth > 0 && i > 0) {
                float f = hl.p;
                int i2 = (int) (measuredWidth / f);
                int i3 = (int) (i / f);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i2 + "x" + i3;
                if (!str.equals(this.J)) {
                    this.J = str;
                    int i4 = uc7.s1(this.n).f3;
                    this.I = i4;
                    if (i4 == 2) {
                        imageReceiver.d0(jn5.p(jxc.b(map.geo, i2, i3, 15, Math.min(2, (int) Math.ceil(hl.p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.e0(hl.e0(this.n, geoPoint.lat, geoPoint._long, i2, i3, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.g0(null);
        this.J = null;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.M.e(arrayList);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.I();
        this.J = null;
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        amb textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), this.s);
            int r = (int) imageReceiver.r();
            int s = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int A = bp1.A(2, r, drawable);
                int y = bp1.y(2, s, drawable);
                drawable.setBounds(A, y, drawable.getIntrinsicWidth() + A, drawable.getIntrinsicHeight() + y);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.I == 2 && imageReceiver.E()) {
                    Drawable drawable2 = this.K;
                    if (drawable2 == null) {
                        drawable2 = getContext().getResources().getDrawable(2131231650).mutate();
                        this.K = drawable2;
                    }
                    int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r2 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s2 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.i1 * 255.0f));
                    this.K.setBounds(r2, s2, intrinsicWidth + r2, intrinsicHeight + s2);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        ej9 ej9Var = this.H;
        if (ej9Var != null && (textSelectionHelper = ((li9) ej9Var).a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S > textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int max = Math.max(0, (i5 - paddingLeft) - paddingRight);
        this.E.i0(paddingLeft, getPaddingTop(), max, this.L);
        int paddingTop = getPaddingTop() + this.L;
        this.G.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.M.g(paddingLeft, paddingRight, i5, getPaddingTop() + this.L);
        h();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.w > 0 && map.h > 0) {
            this.L = Math.max(Math.min((int) (((max - hl.L(32.0f)) * map.h) / map.w), hl.L(420.0f)), hl.L(120.0f));
        } else {
            this.L = (hl.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override
    public final void updateColors() {
        int i = aob.gf;
        vnb vnbVar = this.r;
        this.s.setColor(aob.v0(i, vnbVar));
        this.w.setColor(aob.v0(aob.xe, vnbVar));
        this.x.setColor(aob.v0(aob.lg, vnbVar));
        int i2 = aob.G6;
        this.y.setColor(aob.p1(0.5f, aob.v0(i2, vnbVar)));
        this.F.setColorFilter(new PorterDuffColorFilter(aob.p1(0.5f, aob.v0(i2, vnbVar)), PorterDuff.Mode.SRC_IN));
        if9 if9Var = this.M;
        if (if9Var != null) {
            if9Var.a();
        }
    }
}
