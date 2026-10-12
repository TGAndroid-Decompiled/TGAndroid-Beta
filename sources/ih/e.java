package ih;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ak;
import w7.s;
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
    public ViewTreeObserver E;
    public boolean F;
    public TextPaint G;
    public final boolean f11728a;
    public final RectF f11729b;
    public final RectF f11730c;
    public long d;
    public int e;
    public ViewGroup f11731f;
    public ViewGroup h;
    public long f11732n;
    public c f11733r;
    public long f11734s;
    public final ArrayList v;
    public final LongSparseArray f11735w;
    public final LongSparseArray f11736x;
    public final c f11737y;

    public e(Context context) {
        super(context);
        this.f11729b = new RectF();
        this.f11730c = new RectF();
        this.v = new ArrayList();
        this.f11735w = new LongSparseArray();
        this.f11736x = new LongSparseArray();
        this.f11737y = new c(this, 1);
        this.f11728a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        c cVar = this.f11733r;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f11733r = null;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.e).getInputPeer(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
            arrayList.clear();
        }
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, ak akVar) {
        this.d = j10;
        this.e = i10;
        this.f11731f = viewGroup;
        this.h = akVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ih.e.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11734s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.E = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.E.addOnGlobalLayoutListener(this);
        this.E.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.f11737y, 400L);
        if (BuildVars.LOGS_ENABLED) {
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
        this.f11734s = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.f11737y);
        if (BuildVars.LOGS_ENABLED) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f11728a) {
            if (this.G == null) {
                TextPaint textPaint = new TextPaint(1);
                this.G = textPaint;
                textPaint.setColor(-16776961);
                this.G.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = g6.Ol;
            RectF rectF = this.f11730c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f11735w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) longSparseArray.valueAt(i10);
                RectF rectF2 = dVar.f11720c;
                canvas.drawRect(rectF2, g6.Pl);
                canvas.save();
                canvas.translate(rectF2.left, s.a(s.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), g6.Nl);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.f11722g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f7 = dVar.f11725k;
                if (f7 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((dVar.f11724j / f7) * 1000.0f);
                }
                sb2.append(round);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, AndroidUtilities.dp(16.0f));
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.f11729b;
        this.f11730c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
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
