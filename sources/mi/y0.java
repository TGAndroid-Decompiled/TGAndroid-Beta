package mi;

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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.RadialProgress2;
public final class y0 extends y implements org.telegram.ui.ActionBar.z5, g9, l0, org.telegram.messenger.x5 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final k0 G;
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
    public zi U;
    public TLRPC.Document V;
    public int W;
    public boolean f20034a0;
    public int f20035b0;
    public final int f20036n;
    public final org.telegram.ui.ActionBar.e6 f20037r;
    public final Paint f20038s;
    public final Paint f20039w;
    public final TextPaint f20040x;
    public final TextPaint f20041y;

    public y0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f20038s = new Paint(1);
        this.f20039w = new Paint(1);
        this.f20040x = new TextPaint(1);
        this.f20041y = new TextPaint(1);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.I = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.J = L2;
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.L = org.telegram.messenger.g0.L(16.0f);
        this.W = -1;
        this.f20035b0 = r6.f28515b;
        this.f20036n = i3;
        this.f20037r = e6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.H = org.telegram.messenger.z5.q(i3).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.K;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        k0 k0Var = new k0(context, e6Var, new hi.d(this, 13));
        this.G = k0Var;
        addView(k0Var.f19716a, mf.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void C(boolean z10) {
        m(true);
    }

    @Override
    public final void M(String str) {
        this.E.p(true, 1.0f);
        m(true);
    }

    @Override
    public final boolean a(int i3, int i10) {
        return this.G.f(i3, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
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
        int i3;
        int i10 = this.f20035b0;
        int i11 = r6.f28515b;
        if (i10 != i11) {
            this.f20035b0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.E;
                org.telegram.ui.ActionBar.e6 e6Var = this.f20037r;
                if (radialProgress2 != null && (i3 = this.W) >= 0) {
                    radialProgress2.d = k6.w0(i3, e6Var);
                }
                if (this.f20034a0 && (getBackground() instanceof z1)) {
                    ((z1) getBackground()).a(k6.w0(k6.f27878d6, e6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i3) {
        int i10;
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i3 = 0;
        }
        int i11 = L + i3;
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
        int i3;
        int i10;
        zi ziVar;
        String str3;
        s sVar;
        a aVar = this.f20029a;
        ac acVar = null;
        if (aVar != null && (sVar = aVar.f19435g) != null) {
            str = sVar.f19862e;
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
        boolean X2 = zi.X2(document);
        if (!z10 && !X2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.M = z11;
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i3 = 0;
        } else {
            i3 = this.f20031c;
        }
        int i11 = L + i3;
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
            imageReceiver.q0(ac.g(str), "86_86", null, null, document, 1);
        } else if (X2) {
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 320, false, null, true);
            o3 o3Var = this.T;
            if (o3Var == null) {
                ziVar = null;
            } else {
                ziVar = o3Var.f19790a.f19918q3;
            }
            imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            if (w10 != null) {
                acVar = ac.c(w10, document);
            }
            ac acVar2 = acVar;
            BitmapDrawable m10 = zb.m(document.thumbs);
            if (ziVar == null) {
                ziVar = this.U;
            }
            imageReceiver.q0(acVar2, "86_86", m10, null, ziVar, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public h1 getCaptionEditText() {
        return this.G.f19716a;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    @Override
    public a getRow() {
        return this.f20029a;
    }

    public final TLRPC.Document h() {
        s sVar;
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null) {
            return sVar.h;
        }
        return null;
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.p(true, min);
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void l() {
        int i3;
        float f10;
        int i10;
        int i11;
        s sVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i3 = this.L;
            f10 = 97.0f;
        } else {
            i3 = this.K;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i3;
        int L2 = org.telegram.messenger.g0.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = org.telegram.messenger.g0.f22608q.x;
        }
        int L3 = (i10 - L) - org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i11 = this.f20031c;
        } else {
            i11 = 0;
        }
        int max = Math.max(L2, L3 - i11);
        TextPaint textPaint = this.f20040x;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = this.f20041y;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String B = w7.B(h);
        if (TextUtils.isEmpty(B) && (sVar = this.f20029a.f19435g) != null && !TextUtils.isEmpty(sVar.f19862e)) {
            B = new File(this.f20029a.f19435g.f19862e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = h.size;
        if (j10 <= 0) {
            s sVar2 = this.f20029a.f19435g;
            if (sVar2 != null && !TextUtils.isEmpty(sVar2.f19862e)) {
                j10 = new File(this.f20029a.f19435g.f19862e).length();
            } else {
                j10 = 0;
            }
        }
        this.S = new StaticLayout(org.telegram.messenger.g0.i0(j10, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void m(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: mi.y0.m(boolean):void");
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
        org.telegram.messenger.z5.q(this.f20036n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        int height;
        h9 textSelectionHelper;
        int i10;
        float f11;
        if (h() != null) {
            boolean z10 = this.M;
            org.telegram.ui.ActionBar.e6 e6Var = this.f20037r;
            if (z10 && !this.F.h(canvas, null)) {
                int w02 = k6.w0(k6.f28203ue, e6Var);
                Paint paint = this.f20039w;
                paint.setColor(w02);
                canvas.drawRoundRect(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.L, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i3 = this.L;
                f10 = 97.0f;
            } else {
                i3 = this.K;
                f10 = 54.0f;
            }
            int L = org.telegram.messenger.g0.L(f10) + i3;
            this.f20040x.setColor(k6.w0(k6.f28147re, e6Var));
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.f20041y.setColor(k6.w0(k6.f27850be, e6Var));
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
            if (this.T != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.T.f19790a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f29352p0 && R <= textSelectionHelper.f29355s0) {
                    if (this.N) {
                        i10 = 0;
                    } else {
                        i10 = this.f20031c;
                    }
                    float L4 = org.telegram.messenger.g0.L(8.0f) + i10;
                    float L5 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.N) {
                        i11 = this.f20031c;
                    }
                    float L6 = (width - i11) - org.telegram.messenger.g0.L(8.0f);
                    if (this.M) {
                        f11 = 104.0f;
                    } else {
                        f11 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f20038s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        float f10;
        boolean z11 = this.N;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f20031c;
        }
        if (z11) {
            i14 = this.f20031c;
        }
        int i15 = i11 - i3;
        if (this.M) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        this.G.g(i13, i14, i15, org.telegram.messenger.g0.L(f10));
        l();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i3);
        boolean z10 = this.N;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f20031c;
        }
        if (z10) {
            i12 = this.f20031c;
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
        throw new UnsupportedOperationException("Method not decompiled: mi.y0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.f20038s.setColor(k6.w0(k6.ig, this.f20037r));
        k0 k0Var = this.G;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
