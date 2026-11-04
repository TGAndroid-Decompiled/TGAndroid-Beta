package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.e20;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
public final class n4 extends y implements org.telegram.ui.ActionBar.z5, g9, l0 {
    public static final int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public l4 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final k0 M;
    public final int f19762n;
    public final org.telegram.ui.ActionBar.e6 f19763r;
    public final Paint f19764s;
    public final Paint f19765w;
    public final Paint f19766x;
    public final TextPaint f19767y;

    public n4(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19764s = new Paint(1);
        this.f19765w = new Paint(1);
        this.f19766x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f19767y = textPaint;
        this.f19762n = i3;
        this.f19763r = e6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(2131232213).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new ii.m(this, 15));
        addView(view, mf.e(-1, -2, 51));
        k0 k0Var = new k0(context, e6Var, new hi.d(this, 15));
        this.M = k0Var;
        addView(k0Var.f19716a, mf.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f20029a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return (TL_iv.pageBlockMap) pageBlock;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean a(int i3, int i10) {
        return this.M.f(i3, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27887df));
        hashSet.add(Integer.valueOf(k6.f28203ue));
        hashSet.add(Integer.valueOf(k6.ig));
        hashSet.add(Integer.valueOf(k6.G6));
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

    public final void g(a aVar, l4 l4Var) {
        this.f20029a = aVar;
        this.H = l4Var;
        c(aVar);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override
    public h1 getCaptionEditText() {
        return this.M.f19716a;
    }

    @Override
    public a getRow() {
        return this.f20029a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.L;
            if (measuredWidth > 0 && i3 > 0) {
                float f10 = org.telegram.messenger.g0.f22607p;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i3 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.J)) {
                    this.J = str;
                    int i12 = hp.s1(this.f19762n).f23072n3;
                    this.I = i12;
                    if (i12 == 2) {
                        imageReceiver.q0(ac.p(e20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f22607p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.o0(org.telegram.messenger.g0.e0(this.f19762n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
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
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), this.f19764s);
            int r5 = (int) imageReceiver.r();
            int s6 = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int C = org.telegram.ui.Cells.f1.C(2, r5, drawable);
                int B = org.telegram.ui.Cells.f1.B(2, s6, drawable);
                drawable.setBounds(C, B, drawable.getIntrinsicWidth() + C, drawable.getIntrinsicHeight() + B);
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
                    int r9 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s10 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.f21249i1 * 255.0f));
                    this.K.setBounds(r9, s10, intrinsicWidth + r9, intrinsicHeight + s10);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        l4 l4Var = this.H;
        if (l4Var != null && (textSelectionHelper = ((p3) l4Var).f19805a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f29352p0 && R <= textSelectionHelper.f29355s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.f19766x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i3;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.E.y0(paddingLeft, getPaddingTop(), max, this.L);
        int paddingTop = getPaddingTop() + this.L;
        this.G.layout(paddingLeft, getPaddingTop(), max + paddingLeft, paddingTop);
        this.M.g(paddingLeft, paddingRight, i13, getPaddingTop() + this.L);
        h();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.f27226w > 0 && map.h > 0) {
            this.L = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.f27226w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        } else {
            this.L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override
    public final void updateColors() {
        int i3 = k6.f27887df;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19763r;
        this.f19764s.setColor(k6.w0(i3, e6Var));
        this.f19765w.setColor(k6.w0(k6.f28203ue, e6Var));
        this.f19766x.setColor(k6.w0(k6.ig, e6Var));
        int i10 = k6.G6;
        this.f19767y.setColor(k6.r1(0.5f, k6.w0(i10, e6Var)));
        this.F.setColorFilter(new PorterDuffColorFilter(k6.r1(0.5f, k6.w0(i10, e6Var)), PorterDuff.Mode.SRC_IN));
        k0 k0Var = this.M;
        if (k0Var != null) {
            k0Var.a();
        }
    }
}
