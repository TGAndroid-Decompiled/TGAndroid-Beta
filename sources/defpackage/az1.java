package defpackage;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class az1 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF I = new RectF();
    public final yy1 E;
    public ViewTreeObserver F;
    public boolean G;
    public TextPaint H;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public long d;
    public int e;
    public ViewGroup f;
    public jq1 h;
    public long n;
    public yy1 r;
    public long s;
    public final ArrayList w;
    public final LongSparseArray x;
    public final LongSparseArray y;

    public az1(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.w = new ArrayList();
        this.x = new LongSparseArray();
        this.y = new LongSparseArray();
        this.E = new yy1(this, (byte) 1);
        this.a = gba.c1;
    }

    public final void a() {
        yy1 yy1Var = this.r;
        if (yy1Var != null) {
            gl.r(yy1Var);
            this.r = null;
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = na7.q1(this.e).h1(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new np0((byte) 0));
            arrayList.clear();
        }
    }

    public final void b(int i, long j, ViewGroup viewGroup, jq1 jq1Var) {
        this.d = j;
        this.e = i;
        this.f = viewGroup;
        this.h = jq1Var;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az1.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.F.addOnGlobalLayoutListener(this);
        this.F.addOnScrollChangedListener(this);
        gl.d3(this.E, 400L);
        if (w01.a) {
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
        this.s = 0L;
        gl.r(this.E);
        if (w01.a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.a) {
            if (this.H == null) {
                TextPaint textPaint = new TextPaint(1);
                this.H = textPaint;
                textPaint.setColor(-16776961);
                this.H.setTextSize(gl.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = bkb.Im;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.x;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                zy1 zy1Var = (zy1) longSparseArray.valueAt(i);
                RectF rectF2 = zy1Var.c;
                canvas.drawRect(rectF2, bkb.Jm);
                canvas.save();
                canvas.translate(rectF2.left, moe.a(moe.a(rectF2.centerY() - gl.L(20.0f), rectF.top - gl.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - gl.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), gl.L(40.0f), bkb.Hm);
                canvas.translate(gl.L(10.0f), gl.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + zy1Var.g, 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, (float) gl.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + zy1Var.h, 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f = zy1Var.k;
                if (f == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((zy1Var.j / f) * 1000.0f);
                }
                sb.append(round);
                canvas.drawText(sb.toString(), 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, gl.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + zy1Var.b(), 0.0f, 0.0f, this.H);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
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
