package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.aj;
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
    public final c D;
    public ViewTreeObserver E;
    public boolean F;
    public TextPaint G;
    public final boolean f17027a;
    public final RectF f17028b;
    public final RectF f17029c;
    public long d;
    public int f17030e;
    public ViewGroup f17031f;
    public ViewGroup h;
    public long f17032n;
    public c f17033r;
    public long f17034s;
    public final ArrayList f17035w;
    public final LongSparseArray f17036x;
    public final LongSparseArray f17037y;

    public e(Context context) {
        super(context);
        this.f17028b = new RectF();
        this.f17029c = new RectF();
        this.f17035w = new ArrayList();
        this.f17036x = new LongSparseArray();
        this.f17037y = new LongSparseArray();
        this.D = new c(this, 1);
        this.f17027a = iz.f23404g1;
    }

    public final void a() {
        c cVar = this.f17033r;
        if (cVar != null) {
            g0.r(cVar);
            this.f17033r = null;
        }
        ArrayList arrayList = this.f17035w;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = qp.s1(this.f17030e).j1(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f17030e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
            arrayList.clear();
        }
    }

    public final void b(int i7, long j3, ViewGroup viewGroup, aj ajVar) {
        this.d = j3;
        this.f17030e = i7;
        this.f17031f = viewGroup;
        this.h = ajVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: jh.e.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17034s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.E = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.E.addOnGlobalLayoutListener(this);
        this.E.addOnScrollChangedListener(this);
        g0.i3(this.D, 400L);
        if (r2.f25212a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.E.removeOnPreDrawListener(this);
            this.E.removeOnGlobalLayoutListener(this);
            this.E.removeOnScrollChangedListener(this);
        }
        this.E = null;
        this.f17034s = 0L;
        g0.r(this.D);
        if (r2.f25212a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f17027a) {
            if (this.G == null) {
                TextPaint textPaint = new TextPaint(1);
                this.G = textPaint;
                textPaint.setColor(-16776961);
                this.G.setTextSize(g0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = k6.Fm;
            RectF rectF = this.f17029c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f17036x;
            int size = longSparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) longSparseArray.valueAt(i7);
                RectF rectF2 = dVar.f17018c;
                canvas.drawRect(rectF2, k6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, j9.a(j9.a(rectF2.centerY() - g0.L(20.0f), rectF.top - g0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - g0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), g0.L(40.0f), k6.Em);
                canvas.translate(g0.L(10.0f), g0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.f17021g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) g0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = dVar.f17024k;
                if (f10 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((dVar.f17023j / f10) * 1000.0f);
                }
                sb2.append(round);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, g0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + dVar.b(), 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.F = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        RectF rectF = this.f17028b;
        this.f17029c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.F) {
            c();
            this.F = false;
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.F = true;
    }
}
