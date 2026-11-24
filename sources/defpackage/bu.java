package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.o;
public final class bu extends View implements sp3, eib {
    public int E;
    public int F;
    public int G;
    public int H;
    public byte I;
    public boolean J;
    public final int K;
    public TL_iv.pageBlockAudio L;
    public TLRPC.Document M;
    public k27 N;
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public final RadialProgress2 e;
    public final xu9 f;
    public boolean h;
    public int n;
    public final int r;
    public int s;
    public String w;
    public bw x;
    public StaticLayout y;

    public bu(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.r = gl.L(58.0f);
        this.a = vg5Var;
        this.b = dxVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        this.K = up3.q(((o) vg5Var).Y).k();
        xu9 xu9Var = new xu9(this);
        this.f = xu9Var;
        xu9Var.h = new l0(this, (byte) 19);
    }

    private int getIconForCurrentState() {
        byte b = this.I;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void B(boolean z) {
        a(true);
    }

    @Override
    public final void N(String str) {
        this.e.o(true, 1.0f);
        a(true);
    }

    public final void a(boolean z) {
        int i = ((o) this.a).Y;
        String r = ba4.r(null, this.M);
        ba4.G(i);
        boolean exists = ba4.J(this.M, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            up3.q(i).v(this);
            boolean D = MediaController.w().D(this.N);
            if (D && (!D || !MediaController.w().C())) {
                this.I = (byte) 1;
            } else {
                this.I = (byte) 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            up3.q(i).a(r, null, this);
            if (!ba4.G(i).S(r)) {
                this.I = (byte) 2;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z);
            } else {
                this.I = (byte) 3;
                Float s = fl5.z().s(r);
                if (s != null) {
                    radialProgress2.o(z, s.floatValue());
                } else {
                    radialProgress2.o(z, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z);
            }
        }
        b();
    }

    public final void b() {
        k27 k27Var;
        int i;
        if (this.M != null && (k27Var = this.N) != null) {
            xu9 xu9Var = this.f;
            if (!xu9Var.e) {
                xu9Var.g(k27Var.b0);
            }
            if (MediaController.w().D(this.N)) {
                i = this.N.i0;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < this.M.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i2);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i = (int) documentAttribute.duration;
                            break;
                        }
                        i2++;
                    } else {
                        i = 0;
                        break;
                    }
                }
            }
            String g0 = gl.g0(i, false, false);
            String str = this.w;
            if (str == null || !str.equals(g0)) {
                this.w = g0;
                TextPaint textPaint = o.g1;
                textPaint.setTextSize(gl.L(16.0f));
                this.y = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint2 = o.g1;
            ((o) this.a).getClass();
            textPaint2.setColor(bkb.w0(null, bkb.F6, false));
            invalidate();
        }
    }

    public k27 getMessageObject() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void i(long j, long j2) {
        this.e.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.I != 3) {
            a(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.x;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.c;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
        bw bwVar3 = this.d;
        if (bwVar3 != null) {
            arrayList.add(bwVar3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        bw bwVar = this.x;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.c;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
        bw bwVar3 = this.d;
        if (bwVar3 != null) {
            bwVar3.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        up3.q(((o) this.a).Y).v(this);
        bw bwVar = this.x;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.c;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
        bw bwVar3 = this.d;
        if (bwVar3 != null) {
            bwVar3.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        int i = bkb.Ye;
        int i2 = bkb.Ze;
        int i3 = bkb.kd;
        int i4 = bkb.ld;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i, i2, i3, i4);
        int i5 = bkb.re;
        vg5 vg5Var = this.a;
        ((o) vg5Var).getClass();
        radialProgress2.d = bkb.u0(i5);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.E, this.F);
        int i6 = bkb.ke;
        ((o) vg5Var).getClass();
        int u0 = bkb.u0(i6);
        int i7 = bkb.le;
        ((o) vg5Var).getClass();
        int u02 = bkb.u0(i7);
        int i8 = bkb.ne;
        ((o) vg5Var).getClass();
        int u03 = bkb.u0(i8);
        ((o) vg5Var).getClass();
        int u04 = bkb.u0(i8);
        int i9 = bkb.me;
        ((o) vg5Var).getClass();
        int u05 = bkb.u0(i9);
        xu9 xu9Var = this.f;
        xu9Var.f(u0, u02, u03, u04, u05);
        xu9Var.b(canvas);
        canvas.restore();
        if (this.y != null) {
            canvas.save();
            canvas.translate(gl.L(54.0f) + this.G, gl.L(6.0f) + this.F);
            this.y.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        if (this.x != null) {
            canvas.save();
            this.x.s = gl.L(54.0f) + this.G;
            this.x.w = this.F - gl.L(16.0f);
            bw bwVar = this.x;
            canvas.translate(bwVar.s, bwVar.w);
            o.s(vg5Var, canvas, this, 0);
            this.x.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        bw bwVar2 = this.c;
        int i11 = this.r;
        if (bwVar2 != null) {
            canvas.save();
            bw bwVar3 = this.c;
            int i12 = this.n;
            bwVar3.s = i12;
            bwVar3.w = i11;
            canvas.translate(i12, i11);
            o.s(vg5Var, canvas, this, i10);
            this.c.d(canvas, this);
            canvas.restore();
            i10++;
        }
        if (this.d != null) {
            canvas.save();
            bw bwVar4 = this.d;
            int i13 = this.n;
            bwVar4.s = i13;
            int i14 = this.s;
            bwVar4.w = i11 + i14;
            canvas.translate(i13, i11 + i14);
            o.s(vg5Var, canvas, this, i10);
            this.d.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, vg5Var, this.L, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754873, null));
        if (this.x != null) {
            sb.append(", ");
            sb.append(this.x.d.getText());
        }
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int L;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i);
        int L2 = gl.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.L;
        if (pageblockaudio != null) {
            int i4 = pageblockaudio.level;
            if (i4 > 0) {
                L = gl.L(18.0f) + gl.L(i4 * 14);
                this.n = L;
            } else {
                L = gl.L(18.0f);
                this.n = L;
            }
            int L3 = (size - L) - gl.L(18.0f);
            int L4 = gl.L(44.0f);
            this.G = gl.L(16.0f);
            int L5 = gl.L(5.0f);
            this.H = L5;
            int i5 = this.G;
            this.e.p(i5, L5, i5 + L4, L5 + L4);
            TL_iv.pageBlockAudio pageblockaudio2 = this.L;
            bw m = o.m(this.a, this, null, pageblockaudio2.caption.text, L3, this.r, pageblockaudio2, this.b);
            this.c = m;
            if (m != null) {
                int height = this.c.d.getHeight() + gl.L(8.0f);
                this.s = height;
                L2 = de9.w(8.0f, height, L2);
            }
            i3 = L2;
            TL_iv.pageBlockAudio pageblockaudio3 = this.L;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i6 = this.r + this.s;
            if (this.b.H) {
                alignment = lwa.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            bw n = o.n(this.a, this, null, richText, L3, i6, pageblockaudio3, alignment2, 0, this.b);
            this.d = n;
            if (n != null) {
                i3 += this.d.d.getHeight() + gl.L(4.0f);
            }
            if (!this.h && this.L.level <= 0) {
                i3 += gl.L(8.0f);
            }
            String w1 = this.N.w1(false);
            String y1 = this.N.y1(false);
            int w = de9.w(50.0f, this.G, L4);
            this.E = w;
            int L6 = (size - w) - gl.L(18.0f);
            if (TextUtils.isEmpty(y1) && TextUtils.isEmpty(w1)) {
                this.x = null;
                this.F = ((L4 - gl.L(30.0f)) / 2) + this.H;
            } else {
                if (!TextUtils.isEmpty(y1) && !TextUtils.isEmpty(w1)) {
                    spannableStringBuilder = new SpannableStringBuilder(tb4.p(w1, " - ", y1));
                } else if (!TextUtils.isEmpty(y1)) {
                    spannableStringBuilder = new SpannableStringBuilder(y1);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(w1);
                }
                if (!TextUtils.isEmpty(w1)) {
                    spannableStringBuilder.setSpan(new z3c(gl.o()), 0, w1.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, bkb.N2, L6, TextUtils.TruncateAt.END);
                bw bwVar = new bw(this.a);
                this.x = bwVar;
                bwVar.d = new StaticLayout(ellipsize, o.g1, L6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.x.n = this.L;
                this.F = gl.L(11.0f) + ((L4 - gl.L(30.0f)) / 2) + this.H;
            }
            this.f.h(L6, gl.L(30.0f));
        } else {
            i3 = 1;
        }
        setMeasuredDimension(size, i3);
        b();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void l(long j, long j2) {
    }
}
