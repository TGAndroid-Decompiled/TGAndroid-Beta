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
import c8.m9;
import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.np;
import org.telegram.messenger.s2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.bj;
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF I = new RectF();
    public final c E;
    public ViewTreeObserver F;
    public boolean G;
    public TextPaint H;
    public final boolean f17756a;
    public final RectF f17757b;
    public final RectF f17758c;
    public long d;
    public int f17759e;
    public ViewGroup f17760f;
    public ViewGroup h;
    public long f17761n;
    public c f17762r;
    public long f17763s;
    public final ArrayList f17764w;
    public final LongSparseArray f17765x;
    public final LongSparseArray f17766y;

    public e(Context context) {
        super(context);
        this.f17757b = new RectF();
        this.f17758c = new RectF();
        this.f17764w = new ArrayList();
        this.f17765x = new LongSparseArray();
        this.f17766y = new LongSparseArray();
        this.E = new c(this, 1);
        this.f17756a = cz.f23373g1;
    }

    public final void a() {
        c cVar = this.f17762r;
        if (cVar != null) {
            g0.r(cVar);
            this.f17762r = null;
        }
        ArrayList arrayList = this.f17764w;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = np.u1(this.f17759e).l1(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f17759e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
            arrayList.clear();
        }
    }

    public final void b(int i7, long j3, ViewGroup viewGroup, bj bjVar) {
        this.d = j3;
        this.f17759e = i7;
        this.f17760f = viewGroup;
        this.h = bjVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: jh.e.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17763s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.F.addOnGlobalLayoutListener(this);
        this.F.addOnScrollChangedListener(this);
        g0.h3(this.E, 400L);
        if (s2.f26694a) {
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
        this.f17763s = 0L;
        g0.r(this.E);
        if (s2.f26694a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f17756a) {
            if (this.H == null) {
                TextPaint textPaint = new TextPaint(1);
                this.H = textPaint;
                textPaint.setColor(-16776961);
                this.H.setTextSize(g0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = m6.Im;
            RectF rectF = this.f17758c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f17765x;
            int size = longSparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) longSparseArray.valueAt(i7);
                RectF rectF2 = dVar.f17747c;
                canvas.drawRect(rectF2, m6.Jm);
                canvas.save();
                canvas.translate(rectF2.left, m9.a(m9.a(rectF2.centerY() - g0.L(20.0f), rectF.top - g0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - g0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), g0.L(40.0f), m6.Hm);
                canvas.translate(g0.L(10.0f), g0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.f17750g, 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, (float) g0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = dVar.f17753k;
                if (f10 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((dVar.f17752j / f10) * 1000.0f);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        RectF rectF = this.f17757b;
        this.f17758c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
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
