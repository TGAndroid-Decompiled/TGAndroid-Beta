package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class xf9 extends ze9 implements snb, zlb, jf9, jq3 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final if9 G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public byte Q;
    public StaticLayout R;
    public StaticLayout S;
    public ki9 T;
    public r47 U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final vnb r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public xf9(int i, vnb vnbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = hl.L(10.0f);
        this.I = L;
        int L2 = hl.L(44.0f);
        this.J = L2;
        this.K = hl.L(16.0f);
        this.L = hl.L(16.0f);
        this.W = -1;
        this.b0 = yob.b;
        this.n = i;
        this.r = vnbVar;
        setWillNotDraw(false);
        setMinimumHeight(hl.L(66.0f));
        this.H = lq3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(24.0f));
        int i2 = this.K;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(hl.L(6.0f));
        if9 if9Var = new if9(context, vnbVar, new k09(this, (byte) 3));
        this.G = if9Var;
        addView(if9Var.a, tre.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void B(boolean z) {
        n(true);
    }

    @Override
    public final void N(String str) {
        this.E.o(true, 1.0f);
        n(true);
    }

    @Override
    public final boolean a(int i, int i2) {
        return this.G.f(i, i2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.lg));
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
        int i;
        int i2 = this.b0;
        int i3 = yob.b;
        if (i2 != i3) {
            this.b0 = i3;
            try {
                RadialProgress2 radialProgress2 = this.E;
                vnb vnbVar = this.r;
                if (radialProgress2 != null && (i = this.W) >= 0) {
                    radialProgress2.d = aob.v0(i, vnbVar);
                }
                if (this.a0 && (getBackground() instanceof vg9)) {
                    ((vg9) getBackground()).a(aob.v0(aob.d6, vnbVar));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i) {
        int i2;
        int L = hl.L(16.0f);
        if (this.N) {
            i = 0;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += hl.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = hl.L(31.0f);
        } else {
            i2 = this.I;
        }
        int i4 = this.K;
        int i5 = this.J;
        this.E.p(i4, i2, i4 + i5, i5 + i2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        r47 r47Var;
        String str3;
        p07 p07Var;
        mk0 mk0Var = this.a;
        jn5 jn5Var = null;
        if (mk0Var != null && (p07Var = mk0Var.g) != null) {
            str = p07Var.e;
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
            z = true;
        } else {
            z = false;
        }
        boolean W2 = r47.W2(document);
        if (!z && !W2) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.M = z2;
        int L = hl.L(16.0f);
        if (this.N) {
            i = 0;
        } else {
            i = this.c;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += hl.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = hl.L(31.0f);
        } else {
            i2 = this.I;
        }
        int i4 = this.K;
        int i5 = this.J;
        this.E.p(i4, i2, i4 + i5, i5 + i2);
        ImageReceiver imageReceiver = this.F;
        if (z) {
            imageReceiver.i0(this.L, hl.L(10.0f), hl.L(86.0f), hl.L(86.0f));
            imageReceiver.d0(jn5.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 320, false, null, true);
            ki9 ki9Var = this.T;
            if (ki9Var == null) {
                r47Var = null;
            } else {
                r47Var = ki9Var.a.q3;
            }
            imageReceiver.i0(this.L, hl.L(10.0f), hl.L(86.0f), hl.L(86.0f));
            if (w != null) {
                jn5Var = jn5.c(w, document);
            }
            jn5 jn5Var2 = jn5Var;
            BitmapDrawable i6 = in5.i(document.thumbs);
            if (r47Var == null) {
                r47Var = this.U;
            }
            imageReceiver.d0(jn5Var2, "86_86", i6, null, r47Var, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public dg9 getCaptionEditText() {
        return this.G.a;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    @Override
    public mk0 getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null) {
            return p07Var.h;
        }
        return null;
    }

    @Override
    public final void i(long j, long j2) {
        float min;
        if (j2 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j) / ((float) j2));
        }
        this.E.o(true, min);
    }

    public final boolean j() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null && p07Var.a()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void m() {
        int i;
        float f;
        int i2;
        int i3;
        p07 p07Var;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i = this.L;
            f = 97.0f;
        } else {
            i = this.K;
            f = 54.0f;
        }
        int L = hl.L(f) + i;
        int L2 = hl.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i2 = getMeasuredWidth();
        } else {
            i2 = hl.q.x;
        }
        int L3 = (i2 - L) - hl.L(16.0f);
        if (this.N) {
            i3 = this.c;
        } else {
            i3 = 0;
        }
        int max = Math.max(L2, L3 - i3);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setTypeface(hl.o());
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(hl.L(13.0f));
        String B = xb4.B(h);
        if (TextUtils.isEmpty(B) && (p07Var = this.a.g) != null && !TextUtils.isEmpty(p07Var.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j = h.size;
        if (j <= 0) {
            p07 p07Var2 = this.a.g;
            if (p07Var2 != null && !TextUtils.isEmpty(p07Var2.e)) {
                j = new File(this.a.g.e).length();
            } else {
                j = 0;
            }
        }
        this.S = new StaticLayout(hl.i0(j, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void n(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf9.n(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        this.E.m(this);
        this.F.I();
        n(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        this.F.K();
        lq3.q(this.n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int height;
        amb textSelectionHelper;
        int i2;
        float f2;
        if (h() != null) {
            boolean z = this.M;
            vnb vnbVar = this.r;
            if (z && !this.F.h(canvas, null)) {
                int v0 = aob.v0(aob.xe, vnbVar);
                Paint paint = this.w;
                paint.setColor(v0);
                canvas.drawRoundRect(this.L, hl.L(10.0f), hl.L(86.0f) + this.L, hl.L(96.0f), hl.L(6.0f), hl.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i = this.L;
                f = 97.0f;
            } else {
                i = this.K;
                f = 54.0f;
            }
            int L = hl.L(f) + i;
            this.x.setColor(aob.v0(aob.ue, vnbVar));
            int L2 = hl.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.y.setColor(aob.v0(aob.ee, vnbVar));
            StaticLayout staticLayout = this.R;
            int i3 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = hl.L(2.0f) + L2 + height;
            if (this.S != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.S.draw(canvas);
                canvas.restore();
            }
            if (this.T != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.T.a.getTextSelectionHelper()) != null && textSelectionHelper.w()) {
                ((RecyclerView) getParent()).getClass();
                int S = RecyclerView.S(this);
                if (S > textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                    if (this.N) {
                        i2 = 0;
                    } else {
                        i2 = this.c;
                    }
                    float L4 = hl.L(8.0f) + i2;
                    float L5 = hl.L(2.0f);
                    int width = getWidth();
                    if (this.N) {
                        i3 = this.c;
                    }
                    float L6 = (width - i3) - hl.L(8.0f);
                    if (this.M) {
                        f2 = 104.0f;
                    } else {
                        f2 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, hl.L(f2), hl.L(8.0f), hl.L(8.0f), this.s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        boolean z2 = this.N;
        int i5 = this.c;
        int i6 = 0;
        if (!z2) {
            i6 = i5;
            i5 = 0;
        }
        int i7 = i3 - i;
        if (this.M) {
            f = 106.0f;
        } else {
            f = 66.0f;
        }
        this.G.g(i6, i5, i7, hl.L(f));
        m();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.N;
        int i3 = this.c;
        int i4 = 0;
        if (!z) {
            i4 = i3;
            i3 = 0;
        }
        int h = this.G.h(i4, i3, size);
        if (this.M) {
            f = 106.0f;
        } else {
            f = 66.0f;
        }
        setMeasuredDimension(size, hl.L(f) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf9.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.s.setColor(aob.v0(aob.lg, this.r));
        if9 if9Var = this.G;
        if (if9Var != null) {
            if9Var.a();
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
