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
public final class he9 extends jd9 implements vlb, fkb, td9, cr3 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final sd9 G;
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
    public xg9 T;
    public k47 U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final ylb r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public he9(int i, ylb ylbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = gm.L(10.0f);
        this.I = L;
        int L2 = gm.L(44.0f);
        this.J = L2;
        this.K = gm.L(16.0f);
        this.L = gm.L(16.0f);
        this.W = -1;
        this.b0 = anb.b;
        this.n = i;
        this.r = ylbVar;
        setWillNotDraw(false);
        setMinimumHeight(gm.L(66.0f));
        this.H = er3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(24.0f));
        int i2 = this.K;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(gm.L(6.0f));
        sd9 sd9Var = new sd9(context, ylbVar, new oo8(this, (byte) 6));
        this.G = sd9Var;
        addView(sd9Var.a, qoe.e(-2, -2, 51));
        updateColors();
    }

    @Override
    public final void A(boolean z) {
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
        hashSet.add(Integer.valueOf(cmb.kg));
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
        int i3 = anb.b;
        if (i2 != i3) {
            this.b0 = i3;
            try {
                RadialProgress2 radialProgress2 = this.E;
                ylb ylbVar = this.r;
                if (radialProgress2 != null && (i = this.W) >= 0) {
                    radialProgress2.d = cmb.v0(i, ylbVar);
                }
                if (this.a0 && (getBackground() instanceof gf9)) {
                    ((gf9) getBackground()).a(cmb.v0(cmb.c6, ylbVar));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override
    public final void e(int i) {
        int i2;
        int L = gm.L(16.0f);
        if (this.N) {
            i = 0;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += gm.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = gm.L(31.0f);
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
        k47 k47Var;
        String str3;
        i07 i07Var;
        ll0 ll0Var = this.a;
        gn5 gn5Var = null;
        if (ll0Var != null && (i07Var = ll0Var.g) != null) {
            str = i07Var.e;
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
        boolean W2 = k47.W2(document);
        if (!z && !W2) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.M = z2;
        int L = gm.L(16.0f);
        if (this.N) {
            i = 0;
        } else {
            i = this.c;
        }
        int i3 = L + i;
        this.L = i3;
        if (this.M) {
            i3 += gm.L(21.0f);
        }
        this.K = i3;
        if (this.M) {
            i2 = gm.L(31.0f);
        } else {
            i2 = this.I;
        }
        int i4 = this.K;
        int i5 = this.J;
        this.E.p(i4, i2, i4 + i5, i5 + i2);
        ImageReceiver imageReceiver = this.F;
        if (z) {
            imageReceiver.i0(this.L, gm.L(10.0f), gm.L(86.0f), gm.L(86.0f));
            imageReceiver.d0(gn5.g(str), "86_86", null, null, document, 1);
        } else if (W2) {
            TLRPC.PhotoSize w = bc4.w(document.thumbs, 320, false, null, true);
            xg9 xg9Var = this.T;
            if (xg9Var == null) {
                k47Var = null;
            } else {
                k47Var = xg9Var.a.q3;
            }
            imageReceiver.i0(this.L, gm.L(10.0f), gm.L(86.0f), gm.L(86.0f));
            if (w != null) {
                gn5Var = gn5.c(w, document);
            }
            gn5 gn5Var2 = gn5Var;
            BitmapDrawable i6 = fn5.i(document.thumbs);
            if (k47Var == null) {
                k47Var = this.U;
            }
            imageReceiver.d0(gn5Var2, "86_86", i6, null, k47Var, 1);
        } else {
            imageReceiver.f();
        }
    }

    @Override
    public ne9 getCaptionEditText() {
        return this.G.a;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    @Override
    public ll0 getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        i07 i07Var;
        ll0 ll0Var = this.a;
        if (ll0Var != null && (i07Var = ll0Var.g) != null) {
            return i07Var.h;
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
        i07 i07Var;
        ll0 ll0Var = this.a;
        if (ll0Var != null && (i07Var = ll0Var.g) != null && i07Var.a()) {
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
        i07 i07Var;
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
        int L = gm.L(f) + i;
        int L2 = gm.L(40.0f);
        if (getMeasuredWidth() > 0) {
            i2 = getMeasuredWidth();
        } else {
            i2 = gm.q.x;
        }
        int L3 = (i2 - L) - gm.L(16.0f);
        if (this.N) {
            i3 = this.c;
        } else {
            i3 = 0;
        }
        int max = Math.max(L2, L3 - i3);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(gm.L(15.0f));
        textPaint.setTypeface(gm.o());
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(gm.L(13.0f));
        String B = bc4.B(h);
        if (TextUtils.isEmpty(B) && (i07Var = this.a.g) != null && !TextUtils.isEmpty(i07Var.e)) {
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
            i07 i07Var2 = this.a.g;
            if (i07Var2 != null && !TextUtils.isEmpty(i07Var2.e)) {
                j = new File(this.a.g.e).length();
            } else {
                j = 0;
            }
        }
        this.S = new StaticLayout(gm.i0(j, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void n(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he9.n(boolean):void");
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
        er3.q(this.n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int height;
        gkb textSelectionHelper;
        int i2;
        float f2;
        if (h() != null) {
            boolean z = this.M;
            ylb ylbVar = this.r;
            if (z && !this.F.h(canvas, null)) {
                int v0 = cmb.v0(cmb.we, ylbVar);
                Paint paint = this.w;
                paint.setColor(v0);
                canvas.drawRoundRect(this.L, gm.L(10.0f), gm.L(86.0f) + this.L, gm.L(96.0f), gm.L(6.0f), gm.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i = this.L;
                f = 97.0f;
            } else {
                i = this.K;
                f = 54.0f;
            }
            int L = gm.L(f) + i;
            this.x.setColor(cmb.v0(cmb.te, ylbVar));
            int L2 = gm.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.y.setColor(cmb.v0(cmb.de, ylbVar));
            StaticLayout staticLayout = this.R;
            int i3 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int L3 = gm.L(2.0f) + L2 + height;
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
                    float L4 = gm.L(8.0f) + i2;
                    float L5 = gm.L(2.0f);
                    int width = getWidth();
                    if (this.N) {
                        i3 = this.c;
                    }
                    float L6 = (width - i3) - gm.L(8.0f);
                    if (this.M) {
                        f2 = 104.0f;
                    } else {
                        f2 = 64.0f;
                    }
                    canvas.drawRoundRect(L4, L5, L6, gm.L(f2), gm.L(8.0f), gm.L(8.0f), this.s);
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
        this.G.g(i6, i5, i7, gm.L(f));
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
        setMeasuredDimension(size, gm.L(f) + h);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he9.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        this.s.setColor(cmb.v0(cmb.kg, this.r));
        sd9 sd9Var = this.G;
        if (sd9Var != null) {
            sd9Var.a();
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
