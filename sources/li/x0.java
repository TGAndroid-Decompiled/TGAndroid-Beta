package li;

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
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
public final class x0 extends y implements org.telegram.ui.ActionBar.c6, h9, k0, org.telegram.messenger.x5 {
    public final RadialProgress2 D;
    public final ImageReceiver E;
    public final j0 F;
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
    public o3 S;
    public ij T;
    public TLRPC.Document U;
    public int V;
    public boolean W;
    public int f18974a0;
    public final int f18975n;
    public final h6 f18976r;
    public final Paint f18977s;
    public final Paint f18978w;
    public final TextPaint f18979x;
    public final TextPaint f18980y;

    public x0(int i7, Context context, h6 h6Var) {
        super(context);
        this.f18977s = new Paint(1);
        this.f18978w = new Paint(1);
        this.f18979x = new TextPaint(1);
        this.f18980y = new TextPaint(1);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.H = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.I = L2;
        this.J = org.telegram.messenger.g0.L(16.0f);
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.V = -1;
        this.f18974a0 = t6.f28531b;
        this.f18975n = i7;
        this.f18976r = h6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.G = org.telegram.messenger.z5.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, h6Var);
        this.D = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.J;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.f21241z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        j0 j0Var = new j0(context, h6Var, new g6.d0(this, 12));
        this.F = j0Var;
        addView(j0Var.f18654a, ha.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void C(boolean z9) {
        m(true);
    }

    @Override
    public final void M(String str) {
        this.D.p(true, 1.0f);
        m(true);
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.F.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f27990ig));
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
        int i7;
        int i10 = this.f18974a0;
        int i11 = t6.f28531b;
        if (i10 != i11) {
            this.f18974a0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.D;
                h6 h6Var = this.f18976r;
                if (radialProgress2 != null && (i7 = this.V) >= 0) {
                    radialProgress2.d = m6.w0(i7, h6Var);
                }
                if (this.W && (getBackground() instanceof y1)) {
                    ((y1) getBackground()).a(m6.w0(m6.f27890d6, h6Var));
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
        if (this.M) {
            i7 = 0;
        }
        int i11 = L + i7;
        this.K = i11;
        if (this.L) {
            i11 += org.telegram.messenger.g0.L(21.0f);
        }
        this.J = i11;
        if (this.L) {
            i10 = org.telegram.messenger.g0.L(31.0f);
        } else {
            i10 = this.H;
        }
        int i12 = this.J;
        int i13 = this.I;
        this.D.r(i12, i10, i12 + i13, i13 + i10);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        ij ijVar;
        String str3;
        s sVar;
        a aVar = this.f18994a;
        hc hcVar = null;
        if (aVar != null && (sVar = aVar.f18399g) != null) {
            str = sVar.f18820e;
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
            z9 = true;
        } else {
            z9 = false;
        }
        boolean W2 = ij.W2(document);
        if (!z9 && !W2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.L = z10;
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.M) {
            i7 = 0;
        } else {
            i7 = this.f18996c;
        }
        int i11 = L + i7;
        this.K = i11;
        if (this.L) {
            i11 += org.telegram.messenger.g0.L(21.0f);
        }
        this.J = i11;
        if (this.L) {
            i10 = org.telegram.messenger.g0.L(31.0f);
        } else {
            i10 = this.H;
        }
        int i12 = this.J;
        int i13 = this.I;
        this.D.r(i12, i10, i12 + i13, i13 + i10);
        ImageReceiver imageReceiver = this.E;
        if (z9) {
            imageReceiver.y0(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            imageReceiver.q0(hc.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 320, false, null, true);
            o3 o3Var = this.S;
            if (o3Var == null) {
                ijVar = null;
            } else {
                ijVar = o3Var.f18744a.f18894p3;
            }
            imageReceiver.y0(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            if (w10 != null) {
                hcVar = hc.c(w10, document);
            }
            hc hcVar2 = hcVar;
            BitmapDrawable m10 = gc.m(document.thumbs);
            if (ijVar == null) {
                ijVar = this.T;
            }
            imageReceiver.q0(hcVar2, "86_86", m10, null, ijVar, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public g1 getCaptionEditText() {
        return this.F.f18654a;
    }

    @Override
    public int getObserverTag() {
        return this.G;
    }

    @Override
    public a getRow() {
        return this.f18994a;
    }

    public final TLRPC.Document h() {
        s sVar;
        a aVar = this.f18994a;
        if (aVar != null && (sVar = aVar.f18399g) != null) {
            return sVar.h;
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
        this.D.p(true, min);
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f18994a;
        if (aVar != null && (sVar = aVar.f18399g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    public final void l() {
        int i7;
        float f10;
        int i10;
        int i11;
        s sVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.L) {
            i7 = this.K;
            f10 = 97.0f;
        } else {
            i7 = this.J;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i7;
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = org.telegram.messenger.g0.f22567q.x;
        }
        int L3 = (i10 - L) - org.telegram.messenger.g0.L(16.0f);
        if (this.M) {
            i11 = this.f18996c;
        } else {
            i11 = 0;
        }
        int max = Math.max(L2, L3 - i11);
        TextPaint textPaint = this.f18979x;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = this.f18980y;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String B = w7.B(h);
        if (TextUtils.isEmpty(B) && (sVar = this.f18994a.f18399g) != null && !TextUtils.isEmpty(sVar.f18820e)) {
            B = new File(this.f18994a.f18399g.f18820e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = h.size;
        if (j3 <= 0) {
            s sVar2 = this.f18994a.f18399g;
            if (sVar2 != null && !TextUtils.isEmpty(sVar2.f18820e)) {
                j3 = new File(this.f18994a.f18399g.f18820e).length();
            } else {
                j3 = 0;
            }
        }
        this.R = new StaticLayout(org.telegram.messenger.g0.i0(j3, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void m(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: li.x0.m(boolean):void");
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
        org.telegram.messenger.z5.q(this.f18975n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int height;
        i9 textSelectionHelper;
        int i10;
        float f11;
        if (h() != null) {
            boolean z9 = this.L;
            h6 h6Var = this.f18976r;
            if (z9 && !this.E.h(canvas, null)) {
                int w02 = m6.w0(m6.f28214ue, h6Var);
                Paint paint = this.f18978w;
                paint.setColor(w02);
                canvas.drawRoundRect(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.K, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            }
            this.D.draw(canvas);
            if (this.L) {
                i7 = this.K;
                f10 = 97.0f;
            } else {
                i7 = this.J;
                f10 = 54.0f;
            }
            int L = org.telegram.messenger.g0.L(f10) + i7;
            this.f18979x.setColor(m6.w0(m6.f28157re, h6Var));
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (this.Q != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.Q.draw(canvas);
                canvas.restore();
            }
            this.f18980y.setColor(m6.w0(m6.f27860be, h6Var));
            StaticLayout staticLayout = this.Q;
            int i11 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = org.telegram.messenger.g0.L(2.0f) + L2 + height;
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.R.draw(canvas);
                canvas.restore();
            }
            if (this.S != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.S.f18744a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f29332p0 && R <= textSelectionHelper.f29335s0) {
                    if (this.M) {
                        i10 = 0;
                    } else {
                        i10 = this.f18996c;
                    }
                    float L4 = org.telegram.messenger.g0.L(8.0f) + i10;
                    float L5 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.M) {
                        i11 = this.f18996c;
                    }
                    float L6 = (width - i11) - org.telegram.messenger.g0.L(8.0f);
                    if (this.L) {
                        f11 = 104.0f;
                    } else {
                        f11 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f18977s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        boolean z10 = this.M;
        int i14 = 0;
        if (z10) {
            i13 = 0;
        } else {
            i13 = this.f18996c;
        }
        if (z10) {
            i14 = this.f18996c;
        }
        int i15 = i11 - i7;
        if (this.L) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        this.F.g(i13, i14, i15, org.telegram.messenger.g0.L(f10));
        l();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.M;
        int i12 = 0;
        if (z9) {
            i11 = 0;
        } else {
            i11 = this.f18996c;
        }
        if (z9) {
            i12 = this.f18996c;
        }
        int h = this.F.h(i11, i12, size);
        if (this.L) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(f10) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.x0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.f18977s.setColor(m6.w0(m6.f27990ig, this.f18976r));
        j0 j0Var = this.F;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
