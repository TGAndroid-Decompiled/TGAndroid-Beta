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
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.g20;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class m4 extends y implements org.telegram.ui.ActionBar.c6, h9, j0 {
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
    public final int f22307n;
    public final i6 f22308r;
    public final Paint f22309s;
    public final Paint f22310w;
    public final Paint f22311x;
    public final TextPaint f22312y;

    public m4(int i7, Context context, i6 i6Var) {
        super(context);
        this.f22309s = new Paint(1);
        this.f22310w = new Paint(1);
        this.f22311x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f22312y = textPaint;
        this.f22307n = i7;
        this.f22308r = i6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(2131232218).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new hi.z4(this, 19));
        addView(view, na.e(-1, -2, 51));
        i0 i0Var = new i0(context, i6Var, new hi.u0(this, 22));
        this.M = i0Var;
        addView(i0Var.f22236a, na.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.f22598a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f22001b;
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
        hashSet.add(Integer.valueOf(n6.f29515gf));
        hashSet.add(Integer.valueOf(n6.f29831xe));
        hashSet.add(Integer.valueOf(n6.f29607lg));
        hashSet.add(Integer.valueOf(n6.G6));
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
        this.f22598a = aVar;
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
        return this.M.f22236a;
    }

    @Override
    public a getRow() {
        return this.f22598a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
            int measuredWidth = getMeasuredWidth();
            int i7 = this.L;
            if (measuredWidth > 0 && i7 > 0) {
                float f10 = org.telegram.messenger.g0.f24225p;
                int i10 = (int) (measuredWidth / f10);
                int i11 = (int) (i7 / f10);
                String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
                if (!str.equals(this.J)) {
                    this.J = str;
                    int i12 = mp.u1(this.f22307n).f25824p3;
                    this.I = i12;
                    if (i12 == 2) {
                        imageReceiver.r0(fc.p(g20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.f24225p)))), null, null, null, null, 0);
                        return;
                    }
                    TLRPC.GeoPoint geoPoint = map.geo;
                    imageReceiver.p0(org.telegram.messenger.g0.e0(this.f22307n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
                    return;
                }
                return;
            }
            return;
        }
        imageReceiver.x0(null);
        this.J = null;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.M.e(arrayList);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.Q();
        this.J = null;
        h();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        i9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B(), this.f22309s);
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
                if (this.I == 2 && imageReceiver.M()) {
                    if (this.K == null) {
                        this.K = getContext().getResources().getDrawable(2131231650).mutate();
                    }
                    int intrinsicWidth = (int) (this.K.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s9 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.f22739i1 * 255.0f));
                    this.K.setBounds(r11, s9, intrinsicWidth + r11, intrinsicHeight + s9);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        k4 k4Var = this.H;
        if (k4Var != null && (textSelectionHelper = ((p3) k4Var).f22378a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f30923p0 && R <= textSelectionHelper.f30926s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.f22311x);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i7;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.E.z0(paddingLeft, getPaddingTop(), max, this.L);
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
        if (map != null && map.f28717w > 0 && map.h > 0) {
            this.L = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.f28717w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        } else {
            this.L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29515gf;
        i6 i6Var = this.f22308r;
        this.f22309s.setColor(n6.w0(i7, i6Var));
        this.f22310w.setColor(n6.w0(n6.f29831xe, i6Var));
        this.f22311x.setColor(n6.w0(n6.f29607lg, i6Var));
        int i10 = n6.G6;
        this.f22312y.setColor(n6.r1(0.5f, n6.w0(i10, i6Var)));
        this.F.setColorFilter(new PorterDuffColorFilter(n6.r1(0.5f, n6.w0(i10, i6Var)), PorterDuff.Mode.SRC_IN));
        i0 i0Var = this.M;
        if (i0Var != null) {
            i0Var.a();
        }
    }
}
