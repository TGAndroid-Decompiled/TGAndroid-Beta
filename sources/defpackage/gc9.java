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
public final class gc9 extends jb9 implements tjb, eib, tb9, sp3 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final sb9 G;
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
    public te9 T;
    public k27 U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final wjb r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public gc9(int i, wjb wjbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = gl.L(10.0f);
        this.I = L;
        int L2 = gl.L(44.0f);
        this.J = L2;
        this.K = gl.L(16.0f);
        this.L = gl.L(16.0f);
        this.W = -1;
        this.b0 = zkb.b;
        this.n = i;
        this.r = wjbVar;
        setWillNotDraw(false);
        setMinimumHeight(gl.L(66.0f));
        this.H = up3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        int i2 = this.K;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(gl.L(6.0f));
        sb9 sb9Var = new sb9(context, wjbVar, new v39(this, (byte) 2));
        this.G = sb9Var;
        addView(sb9Var.a, nme.e(-2, -2, 51));
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
        hashSet.add(Integer.valueOf(bkb.kg));
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
        int i3 = zkb.b;
        if (i2 != i3) {
            this.b0 = i3;
            try {
                RadialProgress2 radialProgress2 = this.E;
                wjb wjbVar = this.r;
                if (radialProgress2 != null && (i = this.W) >= 0) {
                    radialProgress2.d = bkb.v0(i, wjbVar);
                }
                if (this.a0 && (getBackground() instanceof ed9)) {
                    ((ed9) getBackground()).a(bkb.v0(bkb.c6, wjbVar));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i) {
        int i2;
        int L = gl.L(16.0f);
        if (this.N) {
            i = 0;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += gl.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = gl.L(31.0f);
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
        k27 k27Var;
        String str3;
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        gl5 gl5Var = null;
        if (lk0Var != null && (iy6Var = lk0Var.g) != null) {
            str = iy6Var.e;
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
        boolean W2 = k27.W2(document);
        if (!z && !W2) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.M = z2;
        int L = gl.L(16.0f);
        if (this.N) {
            i = 0;
        } else {
            i = this.c;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += gl.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = gl.L(31.0f);
        } else {
            i2 = this.I;
        }
        int i4 = this.K;
        int i5 = this.J;
        this.E.p(i4, i2, i4 + i5, i5 + i2);
        ImageReceiver imageReceiver = this.F;
        if (z) {
            imageReceiver.i0(this.L, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
            imageReceiver.d0(gl5.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 320, false, null, true);
            te9 te9Var = this.T;
            if (te9Var == null) {
                k27Var = null;
            } else {
                k27Var = te9Var.a.q3;
            }
            imageReceiver.i0(this.L, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
            if (w != null) {
                gl5Var = gl5.c(w, document);
            }
            gl5 gl5Var2 = gl5Var;
            BitmapDrawable i6 = fl5.i(document.thumbs);
            if (k27Var == null) {
                k27Var = this.U;
            }
            imageReceiver.d0(gl5Var2, "86_86", i6, null, k27Var, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public mc9 getCaptionEditText() {
        return this.G.a;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    @Override
    public lk0 getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        if (lk0Var != null && (iy6Var = lk0Var.g) != null) {
            return iy6Var.h;
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
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        if (lk0Var != null && (iy6Var = lk0Var.g) != null && iy6Var.a()) {
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
        iy6 iy6Var;
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
        int L = gl.L(f) + i;
        int L2 = gl.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i2 = getMeasuredWidth();
        } else {
            i2 = gl.q.x;
        }
        int L3 = (i2 - L) - gl.L(16.0f);
        if (this.N) {
            i3 = this.c;
        } else {
            i3 = 0;
        }
        int max = Math.max(L2, L3 - i3);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setTypeface(gl.o());
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(gl.L(13.0f));
        String B = ba4.B(h);
        if (TextUtils.isEmpty(B) && (iy6Var = this.a.g) != null && !TextUtils.isEmpty(iy6Var.e)) {
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
            iy6 iy6Var2 = this.a.g;
            if (iy6Var2 != null && !TextUtils.isEmpty(iy6Var2.e)) {
                j = new File(this.a.g.e).length();
            } else {
                j = 0;
            }
        }
        this.S = new StaticLayout(gl.i0(j, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void n(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc9.n(boolean):void");
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
        up3.q(this.n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int height;
        fib textSelectionHelper;
        int i2;
        float f2;
        if (h() != null) {
            boolean z = this.M;
            wjb wjbVar = this.r;
            if (z && !this.F.h(canvas, null)) {
                int v0 = bkb.v0(bkb.we, wjbVar);
                Paint paint = this.w;
                paint.setColor(v0);
                canvas.drawRoundRect(this.L, gl.L(10.0f), gl.L(86.0f) + this.L, gl.L(96.0f), gl.L(6.0f), gl.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i = this.L;
                f = 97.0f;
            } else {
                i = this.K;
                f = 54.0f;
            }
            int L = gl.L(f) + i;
            this.x.setColor(bkb.v0(bkb.te, wjbVar));
            int L2 = gl.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.y.setColor(bkb.v0(bkb.de, wjbVar));
            StaticLayout staticLayout = this.R;
            int i3 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = gl.L(2.0f) + L2 + height;
            if (this.S != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.S.draw(canvas);
                canvas.restore();
            }
            if (this.T != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.T.a.getTextSelectionHelper()) != null && textSelectionHelper.w()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                    if (this.N) {
                        i2 = 0;
                    } else {
                        i2 = this.c;
                    }
                    float L4 = gl.L(8.0f) + i2;
                    float L5 = gl.L(2.0f);
                    int width = getWidth();
                    if (this.N) {
                        i3 = this.c;
                    }
                    float L6 = (width - i3) - gl.L(8.0f);
                    if (this.M) {
                        f2 = 104.0f;
                    } else {
                        f2 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, gl.L(f2), gl.L(8.0f), gl.L(8.0f), this.s);
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
        this.G.g(i6, i5, i7, gl.L(f));
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
        setMeasuredDimension(size, gl.L(f) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc9.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.s.setColor(bkb.v0(bkb.kg, this.r));
        sb9 sb9Var = this.G;
        if (sb9Var != null) {
            sb9Var.a();
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
