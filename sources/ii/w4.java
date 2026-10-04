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
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.tr;
import v7.o8;
public final class w4 extends a0 implements org.telegram.ui.ActionBar.y5, p9, m0 {
    public static Paint f12723k0;
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
    public final org.telegram.ui.Components.e6 U;
    public int V;
    public int W;
    public float f12724a0;
    public boolean f12725b0;
    public float f12726c0;
    public float f12727d0;
    public int f12728e0;
    public int f12729f0;
    public int f12730g0;
    public VelocityTracker f12731h0;
    public ValueAnimator f12732i0;
    public final Path f12733j0;
    public final org.telegram.ui.ActionBar.d6 f12734n;
    public final Paint f12735r;
    public final Paint f12736s;
    public final l0 v;
    public final ImageView f12737w;
    public final ImageView f12738x;
    public final ArrayList f12739y;

    public w4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z10;
        this.f12735r = new Paint(1);
        this.f12736s = new Paint(1);
        this.f12739y = new ArrayList();
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
        this.U = new org.telegram.ui.Components.e6(this, 0L, 320L, tr.h);
        this.f12733j0 = new Path();
        this.f12734n = d6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        l0 l0Var = new l0(context, d6Var, new a4.m(this, 23));
        this.v = l0Var;
        addView(l0Var.f12496a, w7.z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            fh.d dVar = new fh.d(new fh.c());
            this.I = dVar;
            dVar.e(AndroidUtilities.dp(24.0f));
            this.J = new rb.a(11);
        }
        ImageView h = h();
        this.f12737w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, w7.z5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new t4(this, 1));
        ImageView h10 = h();
        this.f12738x = h10;
        h10.setVisibility(8);
        addView(h10, w7.z5.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h10.setOnClickListener(new t4(this, 2));
        e();
    }

    private vh.f getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        vh.f fVar = this.M;
        if (fVar != null && fVar.f48377i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = vh.f.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int size = this.f12739y.size();
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.f12724a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i11 = this.W;
            int i12 = i10 + i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12724a0, i12 - i11);
            this.f12732i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f12732i0.setInterpolator(tr.h);
            this.f12732i0.addUpdateListener(new ai.a(this, 28));
            this.f12732i0.addListener(new ei.w2(this, i12, 2));
            this.f12732i0.start();
        }
        i10 = 1;
        int i112 = this.W;
        int i122 = i10 + i112;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f12724a0, i122 - i112);
        this.f12732i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f12732i0.setInterpolator(tr.h);
        this.f12732i0.addUpdateListener(new ai.a(this, 28));
        this.f12732i0.addListener(new ei.w2(this, i122, 2));
        this.f12732i0.start();
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
            a aVar = this.f12203a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f12193k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f12733j0;
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f12734n;
        this.f12735r.setColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f12736s.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21143uf, d6Var));
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
        return this.v.f12496a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f12203a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.H && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fh.d dVar = this.I;
            dVar.getClass();
            ch.e eVar = new ch.e(dVar);
            eVar.x(this.J);
            eVar.z(AndroidUtilities.dp(16.0f));
            this.L.put(imageView, eVar);
        } else {
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.f12734n;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN));
            int i11 = org.telegram.ui.ActionBar.i6.f20817d6;
            imageView.setBackground(new d2(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var)), 20, 20)));
        }
        w7.b6.a(imageView);
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
        eVar.P = true;
        eVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        w4 w4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = w4Var.getPaddingTop();
        int paddingLeft = w4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (w4Var.getWidth() - paddingLeft) - w4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = w4Var.f12203a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f12193k.size();
        }
        if (size > 0) {
            Path path = w4Var.f12733j0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, w4Var.P + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, w4Var.P + paddingTop);
        }
        boolean l4 = w4Var.l();
        int i17 = 1;
        ArrayList arrayList = w4Var.f12739y;
        if (l4 && arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = w4Var.f12203a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f12193k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = w4Var.f12735r;
        if (z10 && (((i15 = w4Var.W) == 0 && w4Var.f12724a0 < 0.0f) || (i15 == arrayList.size() - 1 && w4Var.f12724a0 > 0.0f))) {
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
                ImageReceiver imageReceiver = z4Var.f12832b;
                if (z4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(z4Var.f12831a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList.size() && i18 < arrayList2.size()) {
            z4 z4Var2 = (z4) arrayList.get(i18);
            RectF rectF3 = (RectF) arrayList2.get(i18);
            if (z10) {
                if (i18 == 0) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                if (i18 == arrayList.size() - i17) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                if (i18 == arrayList.size() - i17) {
                    i13 = i10;
                } else {
                    i13 = 0;
                }
                if (i18 == 0) {
                    i14 = i10;
                } else {
                    i14 = 0;
                }
                z4Var2.f12831a.setRoundRadius(i11, i12, i13, i14);
                z4Var2.f12832b.setRoundRadius(i11, i12, i13, i14);
            } else {
                z4Var2.f12831a.setRoundRadius(i16, i16, i16, i16);
                z4Var2.f12832b.setRoundRadius(i16, i16, i16, i16);
            }
            boolean c10 = z4Var2.c();
            ImageReceiver imageReceiver2 = z4Var2.f12831a;
            if (!c10) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (z4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = z4Var2.d;
            u uVar = z4Var2.f12834e;
            if (uVar != null && uVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = dp / 2;
                radialProgress2.q(round - i19, round2 - i19, round + i19, round2 + i19);
                radialProgress2.o(z4Var2.f12834e.f12666f, true);
                radialProgress2.draw(canvas2);
            }
            u uVar2 = z4Var2.f12834e;
            if (uVar2 != null && uVar2.f12673n && z4Var2.c()) {
                vh.f spoilerEffect = w4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = z4Var2.f12832b;
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
            i18++;
            w4Var = this;
            canvas2 = canvas;
            i16 = 0;
            i17 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.N != null && this.f12203a != null) {
            List m10 = m();
            if (!m10.isEmpty() && (m10.size() != 1 || ((u) m10.get(0)).f12662a != 0)) {
                if (i10 >= 0 && i10 < m10.size() && ((u) m10.get(i10)).a()) {
                    x3.P1(this.f12203a, (u) m10.get(i10), this.N.f12588a);
                    return;
                }
                return;
            }
            q3 q3Var = this.N;
            a aVar = this.f12203a;
            x3 x3Var = q3Var.f12588a;
            x3Var.f12762i4 = aVar;
            x3Var.f12769o3.r(0);
        }
    }

    public final boolean l() {
        a aVar = this.f12203a;
        if (aVar != null && (aVar.f12186b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f12203a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12186b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        u uVar = aVar.f12190g;
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
            arrayList = this.f12739y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            z4 z4Var = new z4(this, this.f12734n);
            if (this.O) {
                z4Var.f12831a.onAttachedToWindow();
                z4Var.f12832b.onAttachedToWindow();
                z4Var.a();
            }
            arrayList.add(z4Var);
        }
        while (arrayList.size() > m10.size()) {
            z4 z4Var2 = (z4) hg.k0.w(1, arrayList);
            z4Var2.f12831a.onDetachedFromWindow();
            z4Var2.f12832b.onDetachedFromWindow();
            z4Var2.f12833c = null;
        }
        for (int i10 = 0; i10 < m10.size(); i10++) {
            z4 z4Var3 = (z4) arrayList.get(i10);
            z4Var3.f12834e = (u) m10.get(i10);
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
            addView(h, w7.z5.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f12737w.bringToFront();
        this.f12738x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            View view = (ImageView) hg.k0.w(1, arrayList2);
            removeView(view);
            this.K.remove(view);
            this.L.remove(view);
        }
        if (this.M != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u uVar = ((z4) arrayList.get(i11)).f12834e;
                if (uVar != null && uVar.f12673n) {
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
        if (this.f12739y.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        ImageView imageView = this.f12738x;
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
            ArrayList arrayList = this.f12739y;
            if (i10 < arrayList.size()) {
                z4 z4Var = (z4) arrayList.get(i10);
                z4Var.f12831a.onAttachedToWindow();
                z4Var.f12832b.onAttachedToWindow();
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
        VelocityTracker velocityTracker = this.f12731h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12731h0 = null;
        }
        this.f12725b0 = false;
        while (true) {
            ArrayList arrayList = this.f12739y;
            if (i10 >= arrayList.size()) {
                break;
            }
            z4 z4Var = (z4) arrayList.get(i10);
            z4Var.f12831a.onDetachedFromWindow();
            z4Var.f12832b.onDetachedFromWindow();
            z4Var.f12833c = null;
            i10++;
        }
        vh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.f12732i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12732i0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fh.d dVar;
        ImageView imageView;
        ImageView imageView2;
        q9 textSelectionHelper;
        float f7;
        float f10;
        int dp;
        float f11;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.e6 e6Var = this.U;
        float f12 = e6Var.f25933c;
        ArrayList arrayList = this.f12739y;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (f12723k0 == null) {
                Paint paint = new Paint(1);
                f12723k0 = paint;
                paint.setColor(-1);
                f12723k0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.P) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.f0.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.f12724a0;
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
                f12723k0.setAlpha((int) com.google.android.gms.internal.vision.e2.B(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(AndroidUtilities.dp(f11) + dp2 + (AndroidUtilities.dp(f7) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f12723k0);
            }
            canvas.restore();
        }
        q3 q3Var = this.N;
        if (q3Var != null && (textSelectionHelper = q3Var.f12588a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f22694u0 && R <= textSelectionHelper.f22697x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.f12736s);
            }
        }
        if (this.H && (dVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f9864r) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.c();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.f12738x;
                    imageView2 = this.f12737w;
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
        if (e6Var.f25937i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i15 = i12 - i10;
        int max = Math.max(0, (i15 - paddingLeft) - paddingRight);
        int i16 = i15 - paddingRight;
        if (o8.b(this.f12203a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.P);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f12737w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f12738x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m10 = m();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < m10.size() && ((u) m10.get(i19)).f12662a != 0) {
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
                                int measuredWidth = imageView3.getMeasuredWidth() + i21;
                                if (measuredWidth > dp2) {
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
        if (l() && !this.U.f25937i) {
            ArrayList arrayList = this.f12739y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f12728e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f12728e0 = viewConfiguration.getScaledTouchSlop();
                        this.f12729f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f12730g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f12726c0 = x10;
                    this.f12727d0 = y3;
                    this.f12725b0 = false;
                    VelocityTracker velocityTracker2 = this.f12731h0;
                    if (velocityTracker2 == null) {
                        this.f12731h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f12731h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f12732i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f12732i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f12731h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x10 - this.f12726c0;
                    float f11 = y3 - this.f12727d0;
                    if (!this.f12725b0 && Math.abs(f10) > this.f12728e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.f12725b0 = true;
                        this.T = -1;
                    }
                    if (this.f12725b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.f12724a0 = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f12731h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f12731h0.computeCurrentVelocity(1000, this.f12730g0);
                        float xVelocity = this.f12731h0.getXVelocity();
                        float yVelocity = this.f12731h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f12729f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f7 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f12731h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f12731h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f12725b0) {
                        this.f12725b0 = false;
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
