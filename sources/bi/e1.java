package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
public final class e1 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0, org.telegram.messenger.z5 {
    public final RadialProgress2 D;
    public final ImageReceiver E;
    public final n0 F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public StaticLayout Q;
    public StaticLayout R;
    public y3 S;
    public kj T;
    public TLRPC.Document U;
    public int V;
    public boolean W;
    public int f2972a0;
    public final int f2973n;
    public final org.telegram.ui.ActionBar.p6 f2974r;
    public final Paint f2975s;
    public final Paint f2976w;
    public final TextPaint f2977x;
    public final TextPaint f2978y;

    public e1(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2975s = new Paint(1);
        this.f2976w = new Paint(1);
        this.f2977x = new TextPaint(1);
        this.f2978y = new TextPaint(1);
        int L = org.telegram.messenger.i0.L(10.0f);
        this.H = L;
        int L2 = org.telegram.messenger.i0.L(44.0f);
        this.I = L2;
        this.J = org.telegram.messenger.i0.L(16.0f);
        this.K = org.telegram.messenger.i0.L(16.0f);
        this.V = -1;
        this.f2972a0 = a7.f20159b;
        this.f2973n = i10;
        this.f2974r = p6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.i0.L(66.0f));
        this.G = org.telegram.messenger.b6.q(i10).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.D = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        int i11 = this.J;
        radialProgress2.r(i11, L, i11 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.f14425z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        n0 n0Var = new n0(context, p6Var, new a4.l(this, 6));
        this.F = n0Var;
        addView(n0Var.f3214a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void D(boolean z10) {
        m(true);
    }

    @Override
    public final void N(String str) {
        this.D.p(true, 1.0f);
        m(true);
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21029ig));
    }

    @Override
    public final void b() {
        this.F.i();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.F.c(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11 = this.f2972a0;
        int i12 = a7.f20159b;
        if (i11 != i12) {
            this.f2972a0 = i12;
            try {
                RadialProgress2 radialProgress2 = this.D;
                org.telegram.ui.ActionBar.p6 p6Var = this.f2974r;
                if (radialProgress2 != null && (i10 = this.V) >= 0) {
                    radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                }
                if (this.W && (getBackground() instanceof h2)) {
                    ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var));
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i10) {
        int i11;
        int L = org.telegram.messenger.i0.L(16.0f);
        if (this.M) {
            i10 = 0;
        }
        int i12 = L + i10;
        this.K = i12;
        if (this.L) {
            i12 += org.telegram.messenger.i0.L(21.0f);
        }
        this.J = i12;
        if (this.L) {
            i11 = org.telegram.messenger.i0.L(31.0f);
        } else {
            i11 = this.H;
        }
        int i13 = this.J;
        int i14 = this.I;
        this.D.r(i13, i11, i13 + i14, i14 + i11);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        kj kjVar;
        String str3;
        w wVar;
        a aVar = this.f2881a;
        jc jcVar = null;
        if (aVar != null && (wVar = aVar.f2821g) != null) {
            str = wVar.e;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        if (document != null && (str3 = document.mime_type) != null) {
            str2 = str3.toLowerCase();
        } else {
            str2 = "";
        }
        if (k() && file != null && file.exists() && (str2.startsWith("image/") || str2.equals("video/mp4"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean W2 = kj.W2(document);
        if (!z10 && !W2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.L = z11;
        int L = org.telegram.messenger.i0.L(16.0f);
        if (this.M) {
            i10 = 0;
        } else {
            i10 = this.f2883c;
        }
        int i12 = L + i10;
        this.K = i12;
        if (this.L) {
            i12 += org.telegram.messenger.i0.L(21.0f);
        }
        this.J = i12;
        if (this.L) {
            i11 = org.telegram.messenger.i0.L(31.0f);
        } else {
            i11 = this.H;
        }
        int i13 = this.J;
        int i14 = this.I;
        this.D.r(i13, i11, i13 + i14, i14 + i11);
        ImageReceiver imageReceiver = this.E;
        if (z10) {
            imageReceiver.y0(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f), org.telegram.messenger.i0.L(86.0f));
            imageReceiver.q0(jc.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, 320, false, null, true);
            y3 y3Var = this.S;
            if (y3Var == null) {
                kjVar = null;
            } else {
                kjVar = y3Var.f3465a.f2940p3;
            }
            imageReceiver.y0(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f), org.telegram.messenger.i0.L(86.0f));
            if (w9 != null) {
                jcVar = jc.c(w9, document);
            }
            jc jcVar2 = jcVar;
            BitmapDrawable m10 = ic.m(document.thumbs);
            if (kjVar == null) {
                kjVar = this.T;
            }
            imageReceiver.q0(jcVar2, "86_86", m10, null, kjVar, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public n1 getCaptionEditText() {
        return this.F.f3214a;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.D.p(true, min);
    }

    public final TLRPC.Document j() {
        w wVar;
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null) {
            return wVar.h;
        }
        return null;
    }

    public final boolean k() {
        w wVar;
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null && wVar.a()) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i10;
        float f7;
        int i11;
        int i12;
        w wVar;
        TLRPC.Document j10 = j();
        if (j10 == null) {
            return;
        }
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int L = org.telegram.messenger.i0.L(f7) + i10;
        int L2 = org.telegram.messenger.i0.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i11 = getMeasuredWidth();
        } else {
            i11 = org.telegram.messenger.i0.f16172q.x;
        }
        int L3 = (i11 - L) - org.telegram.messenger.i0.L(16.0f);
        if (this.M) {
            i12 = this.f2883c;
        } else {
            i12 = 0;
        }
        int max = Math.max(L2, L3 - i12);
        TextPaint textPaint = this.f2977x;
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        TextPaint textPaint2 = this.f2978y;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        String B = b8.B(j10);
        if (TextUtils.isEmpty(B) && (wVar = this.f2881a.f2821g) != null && !TextUtils.isEmpty(wVar.e)) {
            B = new File(this.f2881a.f2821g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j11 = j10.size;
        if (j11 <= 0) {
            w wVar2 = this.f2881a.f2821g;
            if (wVar2 != null && !TextUtils.isEmpty(wVar2.e)) {
                j11 = new File(this.f2881a.f2821g.e).length();
            } else {
                j11 = 0;
            }
        }
        this.R = new StaticLayout(org.telegram.messenger.i0.i0(j11, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void m(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e1.m(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.D.n(this);
        this.E.P();
        m(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.E.R();
        org.telegram.messenger.b6.q(this.f2973n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int height;
        k9 textSelectionHelper;
        int i11;
        float f10;
        if (j() != null) {
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.p6 p6Var = this.f2974r;
            if (z10 && !this.E.h(canvas, null)) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21250ue, p6Var);
                Paint paint = this.f2976w;
                paint.setColor(w02);
                canvas.drawRoundRect(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f) + this.K, org.telegram.messenger.i0.L(96.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            }
            this.D.draw(canvas);
            if (this.L) {
                i10 = this.K;
                f7 = 97.0f;
            } else {
                i10 = this.J;
                f7 = 54.0f;
            }
            int L = org.telegram.messenger.i0.L(f7) + i10;
            this.f2977x.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21194re, p6Var));
            int L2 = org.telegram.messenger.i0.L(12.0f);
            if (this.Q != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.Q.draw(canvas);
                canvas.restore();
            }
            this.f2978y.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20900be, p6Var));
            StaticLayout staticLayout = this.Q;
            int i12 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = org.telegram.messenger.i0.L(2.0f) + L2 + height;
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.R.draw(canvas);
                canvas.restore();
            }
            if (this.S != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.S.f3465a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f22187p0 && R <= textSelectionHelper.f22190s0) {
                    if (this.M) {
                        i11 = 0;
                    } else {
                        i11 = this.f2883c;
                    }
                    float L4 = org.telegram.messenger.i0.L(8.0f) + i11;
                    float L5 = org.telegram.messenger.i0.L(2.0f);
                    int width = getWidth();
                    if (this.M) {
                        i12 = this.f2883c;
                    }
                    float L6 = (width - i12) - org.telegram.messenger.i0.L(8.0f);
                    if (this.L) {
                        f10 = 104.0f;
                    } else {
                        f10 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f2975s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        boolean z11 = this.M;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f2883c;
        }
        if (z11) {
            i15 = this.f2883c;
        }
        int i16 = i12 - i10;
        if (this.L) {
            f7 = 106.0f;
        } else {
            f7 = 66.0f;
        }
        this.F.g(i14, i15, i16, org.telegram.messenger.i0.L(f7));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.M;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f2883c;
        }
        if (z10) {
            i13 = this.f2883c;
        }
        int h = this.F.h(i12, i13, size);
        if (this.L) {
            f7 = 106.0f;
        } else {
            f7 = 66.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(f7) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.f2975s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21029ig, this.f2974r));
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.a();
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
