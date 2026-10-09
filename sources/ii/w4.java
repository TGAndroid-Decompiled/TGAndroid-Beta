package ii;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.hs;
import v7.n8;
public final class w4 extends a0 implements org.telegram.ui.ActionBar.z5, n9, m0 {
    public static Paint f12771k0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final fh.d I;
    public final rb.a J;
    public final ArrayList K;
    public final HashMap L;
    public vh.f M;
    public q3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.g6 U;
    public int V;
    public int W;
    public float f12772a0;
    public boolean f12773b0;
    public float f12774c0;
    public float f12775d0;
    public int f12776e0;
    public int f12777f0;
    public int f12778g0;
    public VelocityTracker f12779h0;
    public ValueAnimator f12780i0;
    public final Path f12781j0;
    public final org.telegram.ui.ActionBar.e6 f12782n;
    public final Paint f12783r;
    public final Paint f12784s;
    public final l0 v;
    public final ImageView f12785w;
    public final ImageView f12786x;
    public final ArrayList f12787y;

    public w4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        this.f12783r = new Paint(1);
        this.f12784s = new Paint(1);
        this.f12787y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && SharedConfig.chatBlurEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.g6(this, 0L, 320L, hs.h);
        this.f12781j0 = new Path();
        this.f12782n = e6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        l0 l0Var = new l0(context, e6Var, new a6.i(this, 29));
        this.v = l0Var;
        addView(l0Var.f12546a, w7.x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            fh.d dVar = new fh.d(new fh.c());
            this.I = dVar;
            dVar.g(AndroidUtilities.dp(24.0f));
            this.J = new rb.a(11);
        }
        ImageView h = h();
        this.f12785w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, w7.x5.a(32.0f, 12.0f, 12.0f, 12.0f, 12.0f, 32, 53));
        h.setOnClickListener(new t4(this, 1));
        ImageView h10 = h();
        this.f12786x = h10;
        h10.setVisibility(8);
        addView(h10, w7.x5.a(32.0f, 12.0f, 12.0f, 66.0f, 12.0f, 32, 53));
        h10.setOnClickListener(new t4(this, 2));
        e();
    }

    private vh.f getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        vh.f fVar = this.M;
        if (fVar != null && fVar.f49675i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = vh.f.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int i11;
        int size = this.f12787y.size();
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.f12772a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i12 = i10 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12772a0, i12 - i11);
            this.f12780i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f12780i0.setInterpolator(hs.h);
            this.f12780i0.addUpdateListener(new ai.a(this, 28));
            this.f12780i0.addListener(new ei.v2(this, i12, 2));
            this.f12780i0.start();
        }
        i10 = 1;
        int i122 = i10 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f12772a0, i122 - i11);
        this.f12780i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f12780i0.setInterpolator(hs.h);
        this.f12780i0.addUpdateListener(new ai.a(this, 28));
        this.f12780i0.addListener(new ei.v2(this, i122, 2));
        this.f12780i0.start();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.v.f(i10, i11);
    }

    @Override
    public final void b() {
        this.v.i();
    }

    @Override
    public final int d() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int size;
        if (this.E.contains(view)) {
            a aVar = this.f12251a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f12241k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f12781j0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.Gd;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12782n;
        this.f12783r.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f12784s.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21119uf, e6Var));
        l0 l0Var = this.v;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override
    public i1 getCaptionEditText() {
        return this.v.f12546a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f12251a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.H && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ch.e eVar = (ch.e) this.I.l();
            eVar.o(this.J);
            eVar.q(AndroidUtilities.dp(16.0f));
            this.L.put(imageView, eVar);
        } else {
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.f12782n;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
            int i11 = org.telegram.ui.ActionBar.i6.f20797d6;
            imageView.setBackground(new d2(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var)), 20, 20)));
        }
        w7.z5.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        ch.e eVar;
        if (imageView.getVisibility() != 0 || (eVar = (ch.e) this.L.get(imageView)) == null) {
            return;
        }
        eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        eVar.O = true;
        eVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        w4 w4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = w4Var.getPaddingTop();
        int paddingLeft = w4Var.getPaddingLeft();
        int i17 = 0;
        int max = Math.max(0, (w4Var.getWidth() - paddingLeft) - w4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = w4Var.f12251a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f12241k.size();
        }
        if (size > 0) {
            Path path = w4Var.f12781j0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, w4Var.P + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, w4Var.P + paddingTop);
        }
        boolean l4 = w4Var.l();
        char c11 = 2;
        int i18 = 1;
        ArrayList arrayList = w4Var.f12787y;
        if (l4 && arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = w4Var.f12251a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f12241k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = w4Var.f12783r;
        if (z10 && (((i16 = w4Var.W) == 0 && w4Var.f12772a0 < 0.0f) || (i16 == arrayList.size() - 1 && w4Var.f12772a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, w4Var.P + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = w4Var.G;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + w4Var.P);
                z4 z4Var = (z4) arrayList.get(0);
                ImageReceiver imageReceiver = z4Var.f12879b;
                if (z4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(z4Var.f12878a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i19 = 0;
        while (i19 < arrayList.size() && i19 < arrayList2.size()) {
            z4 z4Var2 = (z4) arrayList.get(i19);
            RectF rectF3 = (RectF) arrayList2.get(i19);
            if (z10) {
                if (i19 == 0) {
                    i12 = i10;
                } else {
                    i12 = i17;
                }
                if (i19 == arrayList.size() - i18) {
                    i13 = i10;
                } else {
                    i13 = i17;
                }
                if (i19 == arrayList.size() - i18) {
                    i14 = i10;
                } else {
                    i14 = i17;
                }
                if (i19 == 0) {
                    i15 = i10;
                } else {
                    i15 = i17;
                }
                c10 = c11;
                z4Var2.f12878a.setRoundRadius(i12, i13, i14, i15);
                z4Var2.f12879b.setRoundRadius(i12, i13, i14, i15);
            } else {
                c10 = c11;
                z4Var2.f12878a.setRoundRadius(i17, i17, i17, i17);
                z4Var2.f12879b.setRoundRadius(i17, i17, i17, i17);
            }
            boolean c12 = z4Var2.c();
            ImageReceiver imageReceiver2 = z4Var2.f12878a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (z4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = z4Var2.d;
            u uVar = z4Var2.f12881e;
            if (uVar != null && uVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i20 = dp / 2;
                radialProgress2.q(round - i20, round2 - i20, round + i20, round2 + i20);
                i11 = 1;
                radialProgress2.o(z4Var2.f12881e.f12714f, true);
                radialProgress2.draw(canvas2);
            } else {
                i11 = i18;
            }
            u uVar2 = z4Var2.f12881e;
            if (uVar2 != null && uVar2.f12721n && z4Var2.c()) {
                vh.f spoilerEffect = w4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = z4Var2.f12879b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (z4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, w4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i19++;
            w4Var = this;
            canvas2 = canvas;
            i18 = i11;
            c11 = c10;
            i17 = 0;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.N != null && this.f12251a != null) {
            List m10 = m();
            if (!m10.isEmpty() && (m10.size() != 1 || ((u) m10.get(0)).f12710a != 0)) {
                if (i10 >= 0 && i10 < m10.size() && ((u) m10.get(i10)).a()) {
                    x3.O1(this.f12251a, (u) m10.get(i10), this.N.f12636a);
                    return;
                }
                return;
            }
            q3 q3Var = this.N;
            a aVar = this.f12251a;
            x3 x3Var = q3Var.f12636a;
            x3Var.Z3 = aVar;
            x3Var.f12809f3.k(0);
        }
    }

    public final boolean l() {
        a aVar = this.f12251a;
        if (aVar != null && (aVar.f12234b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f12251a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        u uVar = aVar.f12238g;
        if (uVar != null) {
            return Collections.singletonList(uVar);
        }
        return Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m10 = m();
        while (true) {
            arrayList = this.f12787y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            z4 z4Var = new z4(this, this.f12782n);
            if (this.O) {
                z4Var.f12878a.onAttachedToWindow();
                z4Var.f12879b.onAttachedToWindow();
                z4Var.a();
            }
            arrayList.add(z4Var);
        }
        while (arrayList.size() > m10.size()) {
            z4 z4Var2 = (z4) hg.c.x(1, arrayList);
            z4Var2.f12878a.onDetachedFromWindow();
            z4Var2.f12879b.onDetachedFromWindow();
            z4Var2.f12880c = null;
        }
        for (int i10 = 0; i10 < m10.size(); i10++) {
            z4 z4Var3 = (z4) arrayList.get(i10);
            z4Var3.f12881e = (u) m10.get(i10);
            z4Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= m10.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new t4(this, 0));
            addView(h, w7.x5.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f12785w.bringToFront();
        this.f12786x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            View view = (ImageView) hg.c.x(1, arrayList2);
            removeView(view);
            this.K.remove(view);
            this.L.remove(view);
        }
        if (this.M != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u uVar = ((z4) arrayList.get(i11)).f12881e;
                if (uVar != null && uVar.f12721n) {
                    return;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (this.f12787y.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        ImageView imageView = this.f12786x;
        imageView.setVisibility(i11);
        if (z11) {
            if (l()) {
                i10 = R.drawable.iv_media_slideshow;
            } else {
                i10 = R.drawable.iv_media_collage;
            }
            if (i10 == this.V) {
                return;
            }
            this.V = i10;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12787y;
            if (i10 < arrayList.size()) {
                z4 z4Var = (z4) arrayList.get(i10);
                z4Var.f12878a.onAttachedToWindow();
                z4Var.f12879b.onAttachedToWindow();
                z4Var.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.O = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f12779h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12779h0 = null;
        }
        this.f12773b0 = false;
        while (true) {
            ArrayList arrayList = this.f12787y;
            if (i10 >= arrayList.size()) {
                break;
            }
            z4 z4Var = (z4) arrayList.get(i10);
            z4Var.f12878a.onDetachedFromWindow();
            z4Var.f12879b.onDetachedFromWindow();
            z4Var.f12880c = null;
            i10++;
        }
        vh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.f12780i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12780i0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fh.d dVar;
        ImageView imageView;
        ImageView imageView2;
        o9 textSelectionHelper;
        float f7;
        float f10;
        int dp;
        float f11;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.g6 g6Var = this.U;
        float f12 = g6Var.f26599c;
        ArrayList arrayList = this.f12787y;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (f12771k0 == null) {
                Paint paint = new Paint(1);
                f12771k0 = paint;
                paint.setColor(-1);
                f12771k0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.P) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.f12772a0;
            if (dp4 < max) {
                f7 = 13.0f;
                dp2 = ((max - dp4) / 2.0f) + paddingLeft;
                f10 = 23.0f;
                f11 = 4.0f;
            } else {
                f7 = 13.0f;
                int dp5 = AndroidUtilities.dp(13.0f);
                f10 = 23.0f;
                f11 = 4.0f;
                dp2 = (AndroidUtilities.dp(4.0f) + paddingLeft) - (Utilities.clamp(f13 - (((max - AndroidUtilities.dp(8.0f)) / 2) / dp5), Math.max(0, (size - (dp * 2)) - 1), 0.0f) * dp5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - AndroidUtilities.dp(f10), max + paddingLeft, getPaddingTop() + this.P);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f13));
                f12771k0.setAlpha((int) com.google.android.gms.internal.vision.e2.A(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(AndroidUtilities.dp(f11) + dp2 + (AndroidUtilities.dp(f7) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f12771k0);
            }
            canvas.restore();
        }
        q3 q3Var = this.N;
        if (q3Var != null && (textSelectionHelper = q3Var.f12636a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f22609p0 && R <= textSelectionHelper.f22612s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.f12784s);
            }
        }
        if (this.H && (dVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f9939n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.f12786x;
                    imageView2 = this.f12785w;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i11++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (g6Var.f26603i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i15 = i12 - i10;
        int max = Math.max(0, (i15 - paddingLeft) - paddingRight);
        int i16 = i15 - paddingRight;
        if (n8.b(this.f12251a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.P);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f12785w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f12786x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m10 = m();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < m10.size() && ((u) m10.get(i19)).f12710a != 0) {
                    ArrayList arrayList2 = this.G;
                    if (i19 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i19);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.P) {
                            int i21 = ((int) rectF.left) + dp + paddingLeft;
                            int i22 = ((int) rectF.top) + dp;
                            imageView3.layout(i21, i22, imageView3.getMeasuredWidth() + i21, imageView3.getMeasuredHeight() + i22);
                            float f7 = 1.0f;
                            if (this.H) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int dp2 = left - AndroidUtilities.dp(4.0f);
                                if (imageView3.getMeasuredWidth() + i21 > dp2) {
                                    f7 = Math.max(0.0f, 1.0f - ((measuredWidth - dp2) / imageView3.getMeasuredWidth()));
                                }
                            }
                            imageView3.setAlpha(f7);
                            if (f7 > 0.01f) {
                                i20 = 0;
                            }
                            imageView3.setVisibility(i20);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i19++;
                    }
                }
                imageView3.setVisibility(8);
                i19++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ii.w4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (y3 >= getPaddingTop() && y3 < getPaddingTop() + this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (l() && !this.U.f26603i) {
            ArrayList arrayList = this.f12787y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f12776e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f12776e0 = viewConfiguration.getScaledTouchSlop();
                        this.f12777f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f12778g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f12774c0 = x10;
                    this.f12775d0 = y3;
                    this.f12773b0 = false;
                    VelocityTracker velocityTracker2 = this.f12779h0;
                    if (velocityTracker2 == null) {
                        this.f12779h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f12779h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f12780i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f12780i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f12779h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x10 - this.f12774c0;
                    float f11 = y3 - this.f12775d0;
                    if (!this.f12773b0 && Math.abs(f10) > this.f12776e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.f12773b0 = true;
                        this.T = -1;
                    }
                    if (this.f12773b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.f12772a0 = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f12779h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f12779h0.computeCurrentVelocity(1000, this.f12778g0);
                        float xVelocity = this.f12779h0.getXVelocity();
                        float yVelocity = this.f12779h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f12777f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f7 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f12779h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f12779h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f12773b0) {
                        this.f12773b0 = false;
                        settle(f7);
                    } else if (actionMasked == 1) {
                        int i13 = this.T;
                        int i14 = this.W;
                        if (i13 == i14) {
                            k(i14);
                        }
                    }
                    this.T = -1;
                    return true;
                }
                return true;
            }
        }
        ArrayList arrayList2 = this.G;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i10)).contains(x10, y3)) {
                    i11 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            this.T = i11;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i15)).contains(x10, y3)) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                int i16 = this.T;
                if (i15 == i16) {
                    k(i16);
                }
            }
            if (this.T == -1 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.T = -1;
            if (!z11 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else {
            if (actionMasked == 3) {
                this.T = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
    }
}
