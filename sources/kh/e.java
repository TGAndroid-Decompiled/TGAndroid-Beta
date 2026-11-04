package kh;

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
import b8.be;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.r2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.wi;
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF I = new RectF();
    public final c E;
    public ViewTreeObserver F;
    public boolean G;
    public TextPaint H;
    public final boolean f17269a;
    public final RectF f17270b;
    public final RectF f17271c;
    public long d;
    public int f17272e;
    public ViewGroup f17273f;
    public ViewGroup h;
    public long f17274n;
    public c f17275r;
    public long f17276s;
    public final ArrayList f17277w;
    public final LongSparseArray f17278x;
    public final LongSparseArray f17279y;

    public e(Context context) {
        super(context);
        this.f17270b = new RectF();
        this.f17271c = new RectF();
        this.f17277w = new ArrayList();
        this.f17278x = new LongSparseArray();
        this.f17279y = new LongSparseArray();
        this.E = new c(this, 1);
        this.f17269a = az.f21631g1;
    }

    public final void a() {
        c cVar = this.f17275r;
        if (cVar != null) {
            g0.r(cVar);
            this.f17275r = null;
        }
        ArrayList arrayList = this.f17277w;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = hp.s1(this.f17272e).j1(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f17272e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
            arrayList.clear();
        }
    }

    public final void b(int i3, long j10, ViewGroup viewGroup, wi wiVar) {
        this.d = j10;
        this.f17272e = i3;
        this.f17273f = viewGroup;
        this.h = wiVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: kh.e.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17276s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.F.addOnGlobalLayoutListener(this);
        this.F.addOnScrollChangedListener(this);
        g0.i3(this.E, 400L);
        if (r2.f25040a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
            this.F.removeOnGlobalLayoutListener(this);
            this.F.removeOnScrollChangedListener(this);
        }
        this.F = null;
        this.f17276s = 0L;
        g0.r(this.E);
        if (r2.f25040a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f17269a) {
            if (this.H == null) {
                TextPaint textPaint = new TextPaint(1);
                this.H = textPaint;
                textPaint.setColor(-16776961);
                this.H.setTextSize(g0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = k6.Fm;
            RectF rectF = this.f17271c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f17278x;
            int size = longSparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = (d) longSparseArray.valueAt(i3);
                RectF rectF2 = dVar.f17260c;
                canvas.drawRect(rectF2, k6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, be.a(be.a(rectF2.centerY() - g0.L(20.0f), rectF.top - g0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - g0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), g0.L(40.0f), k6.Em);
                canvas.translate(g0.L(10.0f), g0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.f17263g, 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, (float) g0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = dVar.f17266k;
                if (f10 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((dVar.f17265j / f10) * 1000.0f);
                }
                sb2.append(round);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, g0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + dVar.b(), 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.G = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        RectF rectF = this.f17270b;
        this.f17271c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.G) {
            c();
            this.G = false;
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.G = true;
    }
}
