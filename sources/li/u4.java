package li;

import a8.zd;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
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
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class u4 extends z implements p6, r9, k0 {
    public static Paint m0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final hh.d I;
    public final u7.s J;
    public final ArrayList K;
    public final HashMap L;
    public xh.f M;
    public o3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.h6 U;
    public int V;
    public int W;
    public float f17516a0;
    public boolean f17517b0;
    public float f17518c0;
    public float f17519d0;
    public int f17520e0;
    public int f17521f0;
    public int f17522g0;
    public VelocityTracker f17523h0;
    public ValueAnimator f17524i0;
    public final ArrayList f17525j0;
    public int f17526k0;
    public final Path f17527l0;
    public final u6 f17528n;
    public final Paint f17529r;
    public final Paint f17530s;
    public final j0 v;
    public final ImageView f17531w;
    public final ImageView f17532x;
    public final ArrayList f17533y;

    public u4(Context context, u6 u6Var) {
        super(context);
        boolean z10;
        this.f17529r = new Paint(1);
        this.f17530s = new Paint(1);
        this.f17533y = new ArrayList();
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
        this.U = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.f17525j0 = new ArrayList();
        this.f17526k0 = f7.f22628b;
        this.f17527l0 = new Path();
        this.f17528n = u6Var;
        setWillNotDraw(false);
        f(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        j0 j0Var = new j0(context, u6Var, new jg.s0(this, 7));
        this.v = j0Var;
        addView(j0Var.f17306a, gb1.i(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            hh.d dVar = new hh.d(new hh.c());
            this.I = dVar;
            dVar.d(AndroidUtilities.dp(24.0f));
            this.J = new u7.s(12);
        }
        ImageView g7 = g();
        this.f17531w = g7;
        g7.setImageResource(R.drawable.iv_media_add);
        addView(g7, gb1.h(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        g7.setOnClickListener(new r4(this, 1));
        ImageView g10 = g();
        this.f17532x = g10;
        g10.setVisibility(8);
        addView(g10, gb1.h(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        g10.setOnClickListener(new r4(this, 2));
        updateColors();
    }

    private xh.f getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        xh.f fVar = this.M;
        if (fVar != null && fVar.f51855i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = xh.f.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int i11;
        int size = this.f17533y.size();
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.f17516a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i12 = i10 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f17516a0, i12 - i11);
            this.f17524i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f17524i0.setInterpolator(ds.h);
            this.f17524i0.addUpdateListener(new fi.e4(this, 9));
            this.f17524i0.addListener(new hi.y2(this, i12, 2));
            this.f17524i0.start();
        }
        i10 = 1;
        int i122 = i10 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f17516a0, i122 - i11);
        this.f17524i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f17524i0.setInterpolator(ds.h);
        this.f17524i0.addUpdateListener(new fi.e4(this, 9));
        this.f17524i0.addListener(new hi.y2(this, i122, 2));
        this.f17524i0.start();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.v.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Gd));
        hashSet.add(Integer.valueOf(y6.f23682uf));
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
        ArrayList arrayList = this.f17525j0;
        u6 u6Var = this.f17528n;
        int i10 = this.f17526k0;
        int i11 = f7.f22628b;
        if (i10 != i11) {
            this.f17526k0 = i11;
            try {
                int w02 = y6.w0(y6.f23356d6, u6Var);
                if (getBackground() instanceof y1) {
                    ((y1) getBackground()).a(w02);
                }
                int v = y6.v(w02, y6.w0(y6.f23448i6, u6Var));
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Drawable drawable = (Drawable) arrayList.get(i12);
                    if (drawable instanceof RippleDrawable) {
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable;
                        if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                            ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                            if (shapeDrawable.getPaint().getColor() != w02) {
                                shapeDrawable.getPaint().setColor(w02);
                                rippleDrawable.setColor(ColorStateList.valueOf(v));
                                rippleDrawable.invalidateSelf();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int size;
        if (this.E.contains(view)) {
            a aVar = this.f17653a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f17060k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f17527l0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    public final ImageView g() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.H && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            eh.e eVar = new eh.e(this.I);
            eVar.v(this.J);
            eVar.x(AndroidUtilities.dp(16.0f));
            this.L.put(imageView, eVar);
        } else {
            int i10 = y6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            u6 u6Var = this.f17528n;
            f7.t(imageView, i10, u6Var, mode);
            int i11 = y6.f23356d6;
            org.telegram.ui.Cells.y a02 = y6.a0(y6.w0(i11, u6Var), y6.v(y6.w0(i11, u6Var), y6.w0(y6.f23448i6, u6Var)), 20, 20);
            this.f17525j0.add(a02);
            imageView.setBackground(new a2(a02));
        }
        gb1.b(imageView);
        this.K.add(imageView);
        return imageView;
    }

    @Override
    public g1 getCaptionEditText() {
        return this.v.f17306a;
    }

    @Override
    public a getRow() {
        return this.f17653a;
    }

    public final void h(Canvas canvas, ImageView imageView) {
        eh.e eVar;
        if (imageView.getVisibility() != 0 || (eVar = (eh.e) this.L.get(imageView)) == null) {
            return;
        }
        eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        eVar.f9974g0 = true;
        eVar.draw(canvas);
    }

    public final void i(Canvas canvas) {
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
        u4 u4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = u4Var.getPaddingTop();
        int paddingLeft = u4Var.getPaddingLeft();
        int i17 = 0;
        int max = Math.max(0, (u4Var.getWidth() - paddingLeft) - u4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = u4Var.f17653a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f17060k.size();
        }
        if (size > 0) {
            Path path = u4Var.f17527l0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, u4Var.P + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, u4Var.P + paddingTop);
        }
        boolean k10 = u4Var.k();
        char c11 = 2;
        int i18 = 1;
        ArrayList arrayList = u4Var.f17533y;
        if (k10 && arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = u4Var.f17653a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f17060k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = u4Var.f17529r;
        if (z10 && (((i16 = u4Var.W) == 0 && u4Var.f17516a0 < 0.0f) || (i16 == arrayList.size() - 1 && u4Var.f17516a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, u4Var.P + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = u4Var.G;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + u4Var.P);
                x4 x4Var = (x4) arrayList.get(0);
                ImageReceiver imageReceiver = x4Var.f17625b;
                if (x4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(x4Var.f17624a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i19 = 0;
        while (i19 < arrayList.size() && i19 < arrayList2.size()) {
            x4 x4Var2 = (x4) arrayList.get(i19);
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
                x4Var2.f17624a.setRoundRadius(i12, i13, i14, i15);
                x4Var2.f17625b.setRoundRadius(i12, i13, i14, i15);
            } else {
                c10 = c11;
                x4Var2.f17624a.setRoundRadius(i17, i17, i17, i17);
                x4Var2.f17625b.setRoundRadius(i17, i17, i17, i17);
            }
            boolean c12 = x4Var2.c();
            ImageReceiver imageReceiver2 = x4Var2.f17624a;
            if (!c12) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (x4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = x4Var2.d;
            t tVar = x4Var2.e;
            if (tVar != null && tVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i20 = dp / 2;
                radialProgress2.r(round - i20, round2 - i20, round + i20, round2 + i20);
                i11 = 1;
                radialProgress2.p(x4Var2.e.f17480f, true);
                radialProgress2.draw(canvas2);
            } else {
                i11 = i18;
            }
            t tVar2 = x4Var2.e;
            if (tVar2 != null && tVar2.f17487n && x4Var2.c()) {
                xh.f spoilerEffect = u4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = x4Var2.f17625b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (x4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, u4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i19++;
            u4Var = this;
            canvas2 = canvas;
            i18 = i11;
            c11 = c10;
            i17 = 0;
        }
        canvas.restore();
    }

    public final void j(int i10) {
        if (this.N != null && this.f17653a != null) {
            List l4 = l();
            if (!l4.isEmpty() && (l4.size() != 1 || ((t) l4.get(0)).f17477a != 0)) {
                if (i10 >= 0 && i10 < l4.size() && ((t) l4.get(i10)).a()) {
                    v3.T1(this.f17653a, (t) l4.get(i10), this.N.f17391a);
                    return;
                }
                return;
            }
            o3 o3Var = this.N;
            a aVar = this.f17653a;
            v3 v3Var = o3Var.f17391a;
            v3Var.f17550j4 = aVar;
            v3Var.f17557p3.m(0);
        }
    }

    public final boolean k() {
        a aVar = this.f17653a;
        if (aVar != null && (aVar.f17054b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List l() {
        a aVar = this.f17653a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        t tVar = aVar.f17057g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List l4 = l();
        while (true) {
            arrayList = this.f17533y;
            if (arrayList.size() >= l4.size()) {
                break;
            }
            x4 x4Var = new x4(this, this.f17528n);
            if (this.O) {
                x4Var.f17624a.onAttachedToWindow();
                x4Var.f17625b.onAttachedToWindow();
                x4Var.a();
            }
            arrayList.add(x4Var);
        }
        while (arrayList.size() > l4.size()) {
            x4 x4Var2 = (x4) ic.a.y(1, arrayList);
            x4Var2.f17624a.onDetachedFromWindow();
            x4Var2.f17625b.onDetachedFromWindow();
            x4Var2.f17626c = null;
        }
        for (int i10 = 0; i10 < l4.size(); i10++) {
            x4 x4Var3 = (x4) arrayList.get(i10);
            x4Var3.e = (t) l4.get(i10);
            x4Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= l4.size()) {
                break;
            }
            ImageView g7 = g();
            g7.setImageResource(R.drawable.iv_media_dots);
            g7.setOnClickListener(new r4(this, 0));
            addView(g7, gb1.i(32, 32, 51));
            arrayList2.add(g7);
        }
        this.f17531w.bringToFront();
        this.f17532x.bringToFront();
        while (arrayList2.size() > l4.size()) {
            View view = (ImageView) ic.a.y(1, arrayList2);
            removeView(view);
            this.K.remove(view);
            this.L.remove(view);
        }
        if (this.M != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t tVar = ((x4) arrayList.get(i11)).e;
                if (tVar != null && tVar.f17487n) {
                    return;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (this.f17533y.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        ImageView imageView = this.f17532x;
        imageView.setVisibility(i11);
        if (z11) {
            if (k()) {
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
            ArrayList arrayList = this.f17533y;
            if (i10 < arrayList.size()) {
                x4 x4Var = (x4) arrayList.get(i10);
                x4Var.f17624a.onAttachedToWindow();
                x4Var.f17625b.onAttachedToWindow();
                x4Var.a();
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
        VelocityTracker velocityTracker = this.f17523h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17523h0 = null;
        }
        this.f17517b0 = false;
        while (true) {
            ArrayList arrayList = this.f17533y;
            if (i10 >= arrayList.size()) {
                break;
            }
            x4 x4Var = (x4) arrayList.get(i10);
            x4Var.f17624a.onDetachedFromWindow();
            x4Var.f17625b.onDetachedFromWindow();
            x4Var.f17626c = null;
            i10++;
        }
        xh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.f17524i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17524i0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hh.d dVar;
        ImageView imageView;
        ImageView imageView2;
        s9 textSelectionHelper;
        float f7;
        float f10;
        int dp;
        float f11;
        float dp2;
        int paddingTop = getPaddingTop();
        i(canvas);
        org.telegram.ui.Components.h6 h6Var = this.U;
        float f12 = h6Var.f28811c;
        ArrayList arrayList = this.f17533y;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (m0 == null) {
                Paint paint = new Paint(1);
                m0 = paint;
                paint.setColor(-1);
                m0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.P) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + vh.b(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.f17516a0;
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
                m0.setAlpha((int) c3.h0.C(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(AndroidUtilities.dp(f11) + dp2 + (AndroidUtilities.dp(f7) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), m0);
            }
            canvas.restore();
        }
        o3 o3Var = this.N;
        if (o3Var != null && (textSelectionHelper = o3Var.f17391a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f25410p0 && R <= textSelectionHelper.f25413s0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.f17530s);
            }
        }
        if (this.H && (dVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f12843r) {
                    try {
                        i(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.f17532x;
                    imageView2 = this.f17531w;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        h(canvas, imageView3);
                    }
                    i11++;
                }
                h(canvas, imageView);
                h(canvas, imageView2);
            }
        }
        if (h6Var.f28814i) {
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
        if (zd.b(this.f17653a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.P);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f17531w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f17532x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List l4 = l();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < l4.size() && ((t) l4.get(i19)).f17477a != 0) {
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
                                    f7 = org.telegram.ui.d3.v(measuredWidth - dp2, imageView3.getMeasuredWidth(), 1.0f, 0.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: li.u4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (y3 >= getPaddingTop() && y3 < getPaddingTop() + this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (k() && !this.U.f28814i) {
            ArrayList arrayList = this.f17533y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f17520e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f17520e0 = viewConfiguration.getScaledTouchSlop();
                        this.f17521f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f17522g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.f17518c0 = x9;
                    this.f17519d0 = y3;
                    this.f17517b0 = false;
                    VelocityTracker velocityTracker2 = this.f17523h0;
                    if (velocityTracker2 == null) {
                        this.f17523h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f17523h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f17524i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f17524i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f17523h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x9 - this.f17518c0;
                    float f11 = y3 - this.f17519d0;
                    if (!this.f17517b0 && Math.abs(f10) > this.f17520e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.f17517b0 = true;
                        this.T = -1;
                    }
                    if (this.f17517b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.f17516a0 = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f17523h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f17523h0.computeCurrentVelocity(1000, this.f17522g0);
                        float xVelocity = this.f17523h0.getXVelocity();
                        float yVelocity = this.f17523h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f17521f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f7 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f17523h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f17523h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.f17517b0) {
                        this.f17517b0 = false;
                        settle(f7);
                    } else if (actionMasked == 1) {
                        int i13 = this.T;
                        int i14 = this.W;
                        if (i13 == i14) {
                            j(i14);
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
                } else if (((RectF) arrayList2.get(i10)).contains(x9, y3)) {
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
                        if (((RectF) arrayList2.get(i15)).contains(x9, y3)) {
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
                    j(i16);
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

    @Override
    public final void updateColors() {
        int i10 = y6.Gd;
        u6 u6Var = this.f17528n;
        this.f17529r.setColor(y6.w0(i10, u6Var));
        this.f17530s.setColor(y6.w0(y6.f23682uf, u6Var));
        j0 j0Var = this.v;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
