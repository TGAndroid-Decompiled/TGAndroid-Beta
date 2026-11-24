package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class aw4 {
    public TextPaint A;
    public Paint B;
    public Paint C;
    public Paint D;
    public Paint E;
    public RectF F;
    public RectF G;
    public Rect H;
    public Rect I;
    public int[] J;
    public int K;
    public ff0 L;
    public k27 M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public i46 U;
    public ImageReceiver[] a;
    public pb0[] b;
    public final gb2 c;
    public ImageReceiver d;
    public oy8 e;
    public CharSequence[] f;
    public TLRPC.User[] g;
    public float[] h;
    public boolean[] i;
    public Rect[] j;
    public boolean[] k;
    public int n;
    public int o;
    public Drawable p;
    public String q;
    public int r;
    public StaticLayout s;
    public StaticLayout t;
    public StaticLayout u;
    public TextPaint v;
    public TextPaint w;
    public TextPaint x;
    public TextPaint y;
    public TextPaint z;
    public int l = 0;
    public int m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public aw4(gb2 gb2Var) {
        this.c = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i;
        k27 k27Var = this.M;
        if (k27Var != null && k27Var.w3()) {
            i46 i46Var = this.U;
            gb2 gb2Var = this.c;
            if (i46Var == null) {
                this.U = new i46(gb2Var);
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.t) != null && (i = y - this.S) > 0) {
                int offsetForHorizontal = this.t.getOffsetForHorizontal(staticLayout.getLineForVertical(i - gl.L(10.0f)), x - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.e(true);
                        clickableSpanArr[0].onClick(gb2Var);
                        return true;
                    }
                    m46 m46Var = new m46(clickableSpanArr[0], null, x, y, 0);
                    this.U.a(m46Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        b46 b = m46Var.b();
                        b.e(this.t, spanStart, this.T, this.S);
                        this.t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b);
                        return true;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return true;
                    }
                }
                this.U.e(true);
                gb2Var.invalidate();
            }
            if (action == 0) {
                int i2 = 0;
                while (true) {
                    Rect[] rectArr = this.j;
                    if (i2 < rectArr.length) {
                        if (rectArr[i2].contains(x, y)) {
                            this.O = i2;
                            this.L.setHotspot(x, y);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i2++;
                    } else if (this.I.contains(x, y)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (gb2Var.getDelegate() != null) {
                        gb2Var.getDelegate().l0(gb2Var, this.O);
                    }
                    gb2Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    k27 k27Var2 = this.M;
                    if (k27Var2 != null && k27Var2.k != null) {
                        on0.e(k27Var2, new be2(k27Var2, (byte) 6), new bm0((byte) 1));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.e(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i, int i2, wjb wjbVar) {
        float f;
        TextPaint textPaint;
        float f2;
        float f3;
        da7 da7Var;
        int v0;
        int i3;
        k27 k27Var = this.M;
        if (k27Var != null && k27Var.w3()) {
            ff0 ff0Var = this.L;
            gb2 gb2Var = this.c;
            il5 il5Var = null;
            if (ff0Var == null) {
                int w0 = bkb.w0(null, bkb.h6, false);
                this.K = w0;
                ff0 Y = bkb.Y(w0, 12, 12);
                this.L = Y;
                Y.setCallback(gb2Var);
            }
            this.y.setColor(bkb.n2.getColor());
            this.z.setColor(bkb.w0(null, bkb.p5, false));
            this.A.setColor(bkb.n2.getColor());
            boolean O3 = this.M.O3();
            TextPaint textPaint2 = this.x;
            if (O3) {
                int i4 = bkb.Nb;
                textPaint2.setColor(bkb.v0(i4, wjbVar));
                this.B.setColor(bkb.v0(i4, wjbVar));
                this.C.setColor(bkb.v0(bkb.Qb, wjbVar));
            } else {
                int i5 = bkb.Ad;
                textPaint2.setColor(bkb.v0(i5, wjbVar));
                this.B.setColor(bkb.v0(i5, wjbVar));
                this.C.setColor(bkb.v0(bkb.Kd, wjbVar));
            }
            if (this.N) {
                this.B.setColor(bkb.v0(bkb.Vk, wjbVar));
            }
            canvas.save();
            int L = i2 - gl.L(4.0f);
            float f4 = L;
            canvas.translate(f4, i);
            this.I.set(L, i, this.m + L, this.l + i);
            canvas.saveLayer(0.0f, 0.0f, this.m, this.l, this.D, 31);
            this.d.h(canvas, null);
            float f5 = this.m / 2.0f;
            float L2 = gl.L(106.0f);
            int L3 = gl.L(12.0f) + this.H.width();
            int L4 = gl.L(10.0f) + this.H.height();
            this.F.set(f5 - ((gl.L(2.0f) + L3) / 2.0f), L2 - ((gl.L(2.0f) + L4) / 2.0f), ((gl.L(2.0f) + L3) / 2.0f) + f5, ((gl.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, gl.L(11.0f), gl.L(11.0f), this.E);
            float f6 = L3 / 2.0f;
            float f7 = L4 / 2.0f;
            this.F.set(f5 - f6, L2 - f7, f5 + f6, L2 + f7);
            canvas.drawRoundRect(this.F, gl.L(10.0f), gl.L(10.0f), this.B);
            Drawable drawable = this.p;
            if (drawable != null) {
                drawable.setBounds(gl.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - gl.L(6.96f), gl.L(21.24f) + ((int) this.F.left), gl.L(6.96f) + ((int) this.F.centerY()));
                this.p.draw(canvas);
            }
            String str = this.q;
            float centerX = this.F.centerX();
            if (this.N) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            float L5 = centerX + gl.L(f);
            float centerY = this.F.centerY() + gl.L(4.0f);
            if (this.N) {
                textPaint = this.w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, gl.L(128.0f));
            int L6 = gl.L(128.0f) + i;
            this.S = this.n + L6;
            this.T = (int) ((this.r / 2.0f) + f4);
            canvas.save();
            canvas.translate(this.r / 2.0f, 0.0f);
            this.s.draw(canvas);
            canvas.translate(0.0f, this.n);
            this.t.draw(canvas);
            canvas.restore();
            float f8 = 6.0f;
            canvas.translate(0.0f, gl.L(6.0f) + this.o);
            int w = de9.w(6.0f, this.o, L6);
            int i6 = 0;
            int i7 = 0;
            while (true) {
                boolean[] zArr = this.k;
                if (i6 >= zArr.length) {
                    break;
                } else if (zArr[i6]) {
                    canvas.save();
                    int i8 = i6;
                    float f9 = 0.0f;
                    while (true) {
                        f3 = f8;
                        f9 += this.h[i8] + gl.L(40.0f);
                        i8++;
                        boolean[] zArr2 = this.k;
                        if (i8 >= zArr2.length || this.i[i8] || !zArr2[i8]) {
                            break;
                        }
                        f8 = f3;
                    }
                    float f10 = f5 - (f9 / 2.0f);
                    canvas.translate(f10, 0.0f);
                    int i9 = ((int) f10) + L;
                    int i10 = i6;
                    while (true) {
                        TLRPC.User user = this.g[i10];
                        if (this.M.O3()) {
                            v0 = bkb.v0(bkb.Nb, wjbVar);
                        } else {
                            int f11 = l7c.f(user);
                            if (f11 < 7) {
                                v0 = bkb.v0(bkb.q8[f11], wjbVar);
                            } else {
                                ea7 ea7Var = na7.q1(y6c.t0).E3;
                                if (ea7Var == null) {
                                    da7Var = il5Var;
                                } else {
                                    da7Var = ea7Var.d(f11);
                                }
                                if (da7Var != 0) {
                                    v0 = da7Var.f();
                                } else {
                                    v0 = bkb.v0(bkb.q8[0], wjbVar);
                                }
                            }
                        }
                        int i11 = this.O;
                        if (i11 >= 0 && i11 == i10) {
                            i3 = v0;
                        } else {
                            i3 = i7;
                        }
                        this.x.setColor(v0);
                        this.C.setColor(v0);
                        this.C.setAlpha(25);
                        this.a[i10].h(canvas, il5Var);
                        CharSequence charSequence = this.f[i10];
                        int i12 = i9;
                        canvas.drawText(charSequence, 0, charSequence.length(), gl.L(30.0f), gl.L(16.0f), this.x);
                        this.G.set(0.0f, 0.0f, this.h[i10] + gl.L(40.0f), gl.L(24.0f));
                        canvas.drawRoundRect(this.G, gl.L(12.0f), gl.L(12.0f), this.C);
                        float f12 = i12;
                        this.j[i10].set(i12, w, (int) (this.G.width() + f12), gl.L(24.0f) + w);
                        canvas.translate(this.G.width() + gl.L(f3), 0.0f);
                        i9 = (int) (this.G.width() + gl.L(f3) + f12);
                        i10++;
                        boolean[] zArr3 = this.k;
                        if (i10 >= zArr3.length || this.i[i10] || !zArr3[i10]) {
                            break;
                        }
                        i7 = i3;
                        il5Var = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, gl.L(30.0f));
                    w += gl.L(30.0f);
                    i6 = i10;
                    i7 = i3;
                    il5Var = null;
                    f8 = f3;
                } else {
                    i6++;
                    il5Var = null;
                }
            }
            canvas.translate(0.0f, gl.L(f8));
            canvas.save();
            canvas.translate(this.r / 2.0f, 0.0f);
            this.u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (bkb.I.o()) {
                    f2 = 0.12f;
                } else {
                    f2 = 0.1f;
                }
                int p1 = bkb.p1(f2, i7);
                if (this.K != p1) {
                    ff0 ff0Var2 = this.L;
                    this.K = p1;
                    bkb.F1(ff0Var2, p1, true);
                }
                this.L.setBounds(this.j[this.O]);
                this.L.setCallback(gb2Var);
            }
            i46 i46Var = this.U;
            if (i46Var != null && i46Var.g(canvas)) {
                gb2Var.invalidate();
            }
        }
    }

    public final void c(boolean z) {
        k27 k27Var = this.M;
        if (k27Var != null && k27Var.w3() && this.L != null) {
            i46 i46Var = this.U;
            if (i46Var != null) {
                i46Var.e(true);
            }
            ff0 ff0Var = this.L;
            gb2 gb2Var = this.c;
            if (z) {
                ff0Var.setCallback(new in(this, (byte) 6));
                this.L.setState(this.J);
                gb2Var.invalidate();
                return;
            }
            ff0Var.setState(StateSet.NOTHING);
            gb2Var.invalidate();
        }
    }

    public final void d(int i, k27 k27Var) {
        boolean z;
        String str;
        float f;
        boolean z2;
        this.M = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.l = 0;
        this.m = 0;
        this.N = false;
        if (k27Var.w3()) {
            this.M = k27Var;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.w = new TextPaint(1);
                this.x = new TextPaint(1);
                this.y = new TextPaint(1);
                this.z = new TextPaint(1);
                this.A = new TextPaint(1);
                this.B = new Paint(1);
                this.C = new Paint(1);
                this.D = new Paint();
                this.E = new Paint();
                this.F = new RectF();
                this.G = new RectF();
                this.H = new Rect();
                this.I = new Rect();
                this.J = new int[]{16842910, 16842919};
                this.f = new CharSequence[10];
                this.g = new TLRPC.User[10];
                this.h = new float[10];
                this.i = new boolean[10];
                this.j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(gl.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(gl.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.w.setTypeface(gl.o());
                this.w.setTextSize(gl.L(12.0f));
                this.w.setTextAlign(align);
                this.w.setColor(-1);
                this.x.setTypeface(gl.o());
                this.x.setTextSize(gl.L(13.0f));
                this.A.setTextSize(gl.L(13.0f));
                this.y.setTextSize(gl.L(14.0f));
                this.z.setTextSize(gl.L(14.0f));
                this.z.setTextAlign(align);
            }
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new pb0[10];
                this.k = new boolean[10];
                int i2 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i2 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i2] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i2];
                    imageReceiver2.A1 = true;
                    imageReceiver2.q0(gl.L(12.0f));
                    this.b[i2] = new pb0((wjb) null);
                    this.b[i2].s(gl.L(18.0f));
                    this.j[i2] = new Rect();
                    i2++;
                }
            }
            this.d.v0 = false;
            oy8 oy8Var = this.e;
            if (oy8Var == null) {
                oy8Var = new oy8(2131624040, gl.L(120.0f), gl.L(120.0f));
                this.e = oy8Var;
            }
            this.d.g0(oy8Var);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) k27Var.k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.b = (pb0[]) Arrays.copyOf(this.b, size);
                this.k = Arrays.copyOf(this.k, size);
                this.f = (CharSequence[]) Arrays.copyOf(this.f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.i = Arrays.copyOf(this.i, size);
                this.j = (Rect[]) Arrays.copyOf(this.j, size);
                this.g = (TLRPC.User[]) Arrays.copyOf(this.g, size);
                for (int i3 = length - 1; i3 < size; i3++) {
                    this.a[i3] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i3];
                    imageReceiver3.A1 = true;
                    imageReceiver3.q0(gl.L(12.0f));
                    this.b[i3] = new pb0((wjb) null);
                    this.b[i3].s(gl.L(18.0f));
                    this.j[i3] = new Rect();
                }
            }
            int L = gl.L(90.0f);
            int L2 = gl.L(230.0f);
            SpannableStringBuilder T2 = gl.T2(k96.M0(2131753383, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(T2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, T2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder O2 = gl.O2(k96.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), bkb.Wc, 0, new zv4(this, k27Var, tL_messageMediaGiveawayResults, (byte) 0), null);
            this.R.append((CharSequence) gl.H2(O2, gl.T2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder T22 = gl.T2(k96.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) T22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), O2.length() + 2, T22.length() + O2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) gl.T2(k96.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.N = z;
            if (z) {
                spannableStringBuilder2.append((CharSequence) k96.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) k96.M0(2131753385, null));
            }
            TextPaint textPaint2 = this.y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.s = lwa.c(spannableStringBuilder, textPaint2, L2, alignment, gl.L(2.0f), truncateAt, L2, 10, true);
            this.t = lwa.c(this.R, this.y, L2, alignment, gl.L(2.0f), truncateAt, L2, 10, true);
            this.u = lwa.c(spannableStringBuilder2, this.y, L2, alignment, gl.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i, L2);
            this.r = max - L2;
            float f2 = max;
            float f3 = L;
            float f4 = f3 / 2.0f;
            this.d.i0((f2 / 2.0f) - f4, gl.L(70.0f) - f4, f3, f3);
            StaticLayout staticLayout = this.s;
            int L3 = gl.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.n = L3;
            StaticLayout staticLayout2 = this.t;
            this.o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.u;
            int lineBottom = this.l + this.o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.l = lineBottom;
            this.l = gl.L(128.0f) + lineBottom;
            this.m = max;
            if (this.N) {
                if (this.p == null) {
                    this.p = b00.d(a.b, 2131231126);
                }
                str = k96.E((int) tL_messageMediaGiveawayResults.stars, ',');
                this.q = str;
            } else {
                this.p = null;
                str = "x" + tL_messageMediaGiveawayResults.winners_count;
                this.q = str;
            }
            this.v.getTextBounds(str, 0, str.length(), this.H);
            float f5 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = gl.L(20.0f) + rect.right;
            }
            Arrays.fill(this.k, false);
            this.l = gl.L(30.0f) + this.l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Long l = arrayList2.get(i4);
                i4++;
                Long l2 = l;
                if (na7.q1(y6c.t0).V1(l2) != null) {
                    arrayList.add(l2);
                }
            }
            int i5 = 0;
            float f6 = 0.0f;
            while (i5 < arrayList.size()) {
                Long l3 = (Long) arrayList.get(i5);
                long longValue = l3.longValue();
                TLRPC.User V1 = na7.q1(y6c.t0).V1(l3);
                if (V1 != null) {
                    this.k[i5] = true;
                    this.g[i5] = V1;
                    f = f5;
                    this.f[i5] = TextUtils.ellipsize(vu3.m(l7c.q(V1), this.x.getFontMetricsInt(), false, null, 0), this.x, 0.8f * f2, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint3 = this.x;
                    CharSequence charSequence = this.f[i5];
                    fArr[i5] = textPaint3.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i5] + gl.L(40.0f);
                    f6 += L4;
                    boolean[] zArr = this.i;
                    if (i5 > 0) {
                        if (f6 > 0.9f * f2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zArr[i5] = z2;
                        if (z2) {
                            this.l = gl.L(30.0f) + this.l;
                            f6 = L4;
                        }
                    } else {
                        zArr[i5] = false;
                    }
                    this.b[i5].q(V1);
                    this.a[i5].U(V1, this.b[i5], null);
                    this.a[i5].i0(0.0f, 0.0f, gl.L(24.0f), gl.L(24.0f));
                } else {
                    f = f5;
                    this.g[i5] = null;
                    this.k[i5] = false;
                    this.f[i5] = "";
                    this.i[i5] = false;
                    this.h[i5] = gl.L(f);
                    this.b[i5].j(longValue, "", "", null);
                }
                i5++;
                f5 = f;
            }
        }
    }
}
