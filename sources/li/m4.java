package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class m4 extends y implements org.telegram.ui.ActionBar.a6, h9, k0 {
    public static final int M = 0;
    public final ImageReceiver D;
    public final Drawable E;
    public final View F;
    public k4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final j0 L;
    public final int f18702n;
    public final f6 f18703r;
    public final Paint f18704s;
    public final Paint f18705w;
    public final Paint f18706x;
    public final TextPaint f18707y;

    public m4(int i7, Context context, f6 f6Var) {
        super(context);
        this.f18704s = new Paint(1);
        this.f18705w = new Paint(1);
        this.f18706x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f18707y = textPaint;
        this.f18702n = i7;
        this.f18703r = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.D = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(2131232213).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new ii.g(this, 12));
        addView(view, ha.e(-1, -2, 51));
        j0 j0Var = new j0(context, f6Var, new g6.d0(this, 14));
        this.L = j0Var;
        addView(j0Var.f18651a, ha.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f18989a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18392b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.L.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27860df));
        hashSet.add(Integer.valueOf(k6.f28176ue));
        hashSet.add(Integer.valueOf(k6.f27952ig));
        hashSet.add(Integer.valueOf(k6.G6));
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

    public final void g(a aVar, k4 k4Var) {
        this.f18989a = aVar;
        this.G = k4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public g1 getCaptionEditText() {
        return this.L.f18651a;
    }

    @Override
    public a getRow() {
        return this.f18989a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.D;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i7 = this.K;
            if (measuredWidth > 0 && i7 > 0) {
                float f10 = org.telegram.messenger.g0.f22562p;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i7 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.I)) {
                    this.I = str;
                    int i12 = qp.s1(this.f18702n).f24838m3;
                    this.H = i12;
                    if (i12 == 2) {
                        imageReceiver.q0(hc.p(m20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22562p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.o0(org.telegram.messenger.g0.e0(this.f18702n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
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
    public final void k(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.P();
        this.I = null;
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.D;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), this.f18704s);
            int r10 = (int) imageReceiver.r();
            int s5 = (int) imageReceiver.s();
            Drawable drawable = this.E;
            if (drawable != null) {
                int z9 = org.telegram.ui.Cells.f1.z(2, r10, drawable);
                int y10 = org.telegram.ui.Cells.f1.y(2, s5, drawable);
                drawable.setBounds(z9, y10, drawable.getIntrinsicWidth() + z9, drawable.getIntrinsicHeight() + y10);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.H == 2 && imageReceiver.L()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(2131231646).mutate();
                    }
                    int intrinsicWidth = (int) (this.J.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.J.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s9 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.J.setAlpha((int) (imageReceiver.f21197h1 * 255.0f));
                    this.J.setBounds(r11, s9, intrinsicWidth + r11, intrinsicHeight + s9);
                    this.J.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        k4 k4Var = this.G;
        if (k4Var != null && (textSelectionHelper = ((p3) k4Var).f18775a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f29317p0 && R <= textSelectionHelper.f29320s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.f18706x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i7;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.D.y0(paddingLeft, getPaddingTop(), max, this.K);
        int paddingTop = getPaddingTop() + this.K;
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.L.g(paddingLeft, paddingRight, i13, getPaddingTop() + this.K);
        h();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f27181w > 0 && map.h > 0) {
            this.K = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.f27181w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        } else {
            this.K = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }

    @Override
    public final void updateColors() {
        int i7 = k6.f27860df;
        f6 f6Var = this.f18703r;
        this.f18704s.setColor(k6.w0(i7, f6Var));
        this.f18705w.setColor(k6.w0(k6.f28176ue, f6Var));
        this.f18706x.setColor(k6.w0(k6.f27952ig, f6Var));
        int i10 = k6.G6;
        this.f18707y.setColor(k6.r1(0.5f, k6.w0(i10, f6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(k6.r1(0.5f, k6.w0(i10, f6Var)), PorterDuff.Mode.SRC_IN));
        j0 j0Var = this.L;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
