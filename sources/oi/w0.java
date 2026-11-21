package oi;

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
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;
public final class w0 extends y implements org.telegram.ui.ActionBar.b6, i9, j0, org.telegram.messenger.y5 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final i0 G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public StaticLayout R;
    public StaticLayout S;
    public o3 T;
    public fj U;
    public TLRPC.Document V;
    public int W;
    public boolean f22485a0;
    public int f22486b0;
    public final int f22487n;
    public final h6 f22488r;
    public final Paint f22489s;
    public final Paint f22490w;
    public final TextPaint f22491x;
    public final TextPaint f22492y;

    public w0(int i7, Context context, h6 h6Var) {
        super(context);
        this.f22489s = new Paint(1);
        this.f22490w = new Paint(1);
        this.f22491x = new TextPaint(1);
        this.f22492y = new TextPaint(1);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.I = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.J = L2;
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.L = org.telegram.messenger.g0.L(16.0f);
        this.W = -1;
        this.f22486b0 = t6.f30066b;
        this.f22487n = i7;
        this.f22488r = h6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.H = org.telegram.messenger.a6.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, h6Var);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.K;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        i0 i0Var = new i0(context, h6Var, new hi.t5(this, 19));
        this.G = i0Var;
        addView(i0Var.f22165a, ma.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void C(boolean z10) {
        m(true);
    }

    @Override
    public final void N(String str) {
        this.E.p(true, 1.0f);
        m(true);
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.G.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29534lg));
    }

    @Override
    public final void b() {
        this.G.i();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.G.c(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10 = this.f22486b0;
        int i11 = t6.f30066b;
        if (i10 != i11) {
            this.f22486b0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.E;
                h6 h6Var = this.f22488r;
                if (radialProgress2 != null && (i7 = this.W) >= 0) {
                    radialProgress2.d = m6.w0(i7, h6Var);
                }
                if (this.f22485a0 && (getBackground() instanceof y1)) {
                    ((y1) getBackground()).a(m6.w0(m6.f29378d6, h6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i7) {
        int i10;
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i7 = 0;
        }
        int i11 = L + i7;
        this.L = i11;
        if (this.M) {
            i11 += org.telegram.messenger.g0.L(21.0f);
        }
        this.K = i11;
        if (this.M) {
            i10 = org.telegram.messenger.g0.L(31.0f);
        } else {
            i10 = this.I;
        }
        int i12 = this.K;
        int i13 = this.J;
        this.E.r(i12, i10, i12 + i13, i13 + i10);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        fj fjVar;
        String str3;
        r rVar;
        a aVar = this.f22528a;
        fc fcVar = null;
        if (aVar != null && (rVar = aVar.f21936g) != null) {
            str = rVar.f22344e;
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
        if (j() && file != null && file.exists() && (str2.startsWith("image/") || str2.equals("video/mp4"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean W2 = fj.W2(document);
        if (!z10 && !W2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.M = z11;
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i7 = 0;
        } else {
            i7 = this.f22530c;
        }
        int i11 = L + i7;
        this.L = i11;
        if (this.M) {
            i11 += org.telegram.messenger.g0.L(21.0f);
        }
        this.K = i11;
        if (this.M) {
            i10 = org.telegram.messenger.g0.L(31.0f);
        } else {
            i10 = this.I;
        }
        int i12 = this.K;
        int i13 = this.J;
        this.E.r(i12, i10, i12 + i13, i13 + i10);
        ImageReceiver imageReceiver = this.F;
        if (z10) {
            imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            imageReceiver.q0(fc.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 320, false, null, true);
            o3 o3Var = this.T;
            if (o3Var == null) {
                fjVar = null;
            } else {
                fjVar = o3Var.f22281a.f22427q3;
            }
            imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            if (w10 != null) {
                fcVar = fc.c(w10, document);
            }
            fc fcVar2 = fcVar;
            BitmapDrawable m10 = ec.m(document.thumbs);
            if (fjVar == null) {
                fjVar = this.U;
            }
            imageReceiver.q0(fcVar2, "86_86", m10, null, fjVar, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public f1 getCaptionEditText() {
        return this.G.f22165a;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    @Override
    public a getRow() {
        return this.f22528a;
    }

    public final TLRPC.Document h() {
        r rVar;
        a aVar = this.f22528a;
        if (aVar != null && (rVar = aVar.f21936g) != null) {
            return rVar.h;
        }
        return null;
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.p(true, min);
    }

    public final boolean j() {
        r rVar;
        a aVar = this.f22528a;
        if (aVar != null && (rVar = aVar.f21936g) != null && rVar.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void l() {
        int i7;
        float f10;
        int i10;
        int i11;
        r rVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i7 = this.L;
            f10 = 97.0f;
        } else {
            i7 = this.K;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i7;
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = org.telegram.messenger.g0.f24146q.x;
        }
        int L3 = (i10 - L) - org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i11 = this.f22530c;
        } else {
            i11 = 0;
        }
        int max = Math.max(L2, L3 - i11);
        TextPaint textPaint = this.f22491x;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = this.f22492y;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String B = w7.B(h);
        if (TextUtils.isEmpty(B) && (rVar = this.f22528a.f21936g) != null && !TextUtils.isEmpty(rVar.f22344e)) {
            B = new File(this.f22528a.f21936g.f22344e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = h.size;
        if (j3 <= 0) {
            r rVar2 = this.f22528a.f21936g;
            if (rVar2 != null && !TextUtils.isEmpty(rVar2.f22344e)) {
                j3 = new File(this.f22528a.f21936g.f22344e).length();
            } else {
                j3 = 0;
            }
        }
        this.S = new StaticLayout(org.telegram.messenger.g0.i0(j3, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void m(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: oi.w0.m(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        this.E.n(this);
        this.F.P();
        m(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        this.F.R();
        org.telegram.messenger.a6.q(this.f22487n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int height;
        j9 textSelectionHelper;
        int i10;
        float f11;
        if (h() != null) {
            boolean z10 = this.M;
            h6 h6Var = this.f22488r;
            if (z10 && !this.F.h(canvas, null)) {
                int w02 = m6.w0(m6.f29758xe, h6Var);
                Paint paint = this.f22490w;
                paint.setColor(w02);
                canvas.drawRoundRect(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.L, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i7 = this.L;
                f10 = 97.0f;
            } else {
                i7 = this.K;
                f10 = 54.0f;
            }
            int L = org.telegram.messenger.g0.L(f10) + i7;
            this.f22491x.setColor(m6.w0(m6.f29702ue, h6Var));
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.f22492y.setColor(m6.w0(m6.f29404ee, h6Var));
            StaticLayout staticLayout = this.R;
            int i11 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = org.telegram.messenger.g0.L(2.0f) + L2 + height;
            if (this.S != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.S.draw(canvas);
                canvas.restore();
            }
            if (this.T != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.T.f22281a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f30920p0 && R <= textSelectionHelper.f30923s0) {
                    if (this.N) {
                        i10 = 0;
                    } else {
                        i10 = this.f22530c;
                    }
                    float L4 = org.telegram.messenger.g0.L(8.0f) + i10;
                    float L5 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.N) {
                        i11 = this.f22530c;
                    }
                    float L6 = (width - i11) - org.telegram.messenger.g0.L(8.0f);
                    if (this.M) {
                        f11 = 104.0f;
                    } else {
                        f11 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f22489s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        boolean z11 = this.N;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f22530c;
        }
        if (z11) {
            i14 = this.f22530c;
        }
        int i15 = i11 - i7;
        if (this.M) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        this.G.g(i13, i14, i15, org.telegram.messenger.g0.L(f10));
        l();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        boolean z10 = this.N;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f22530c;
        }
        if (z10) {
            i12 = this.f22530c;
        }
        int h = this.G.h(i11, i12, size);
        if (this.M) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(f10) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.w0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.f22489s.setColor(m6.w0(m6.f29534lg, this.f22488r));
        i0 i0Var = this.G;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
