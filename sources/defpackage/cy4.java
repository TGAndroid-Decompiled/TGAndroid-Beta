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
public final class cy4 {
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
    public fg0 L;
    public k47 M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public i66 U;
    public ImageReceiver[] a;
    public pc0[] b;
    public final rc2 c;
    public ImageReceiver d;
    public p09 e;
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

    public cy4(rc2 rc2Var) {
        this.c = rc2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i;
        k47 k47Var = this.M;
        if (k47Var != null && k47Var.w3()) {
            i66 i66Var = this.U;
            rc2 rc2Var = this.c;
            if (i66Var == null) {
                this.U = new i66(rc2Var);
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.t) != null && (i = y - this.S) > 0) {
                int offsetForHorizontal = this.t.getOffsetForHorizontal(staticLayout.getLineForVertical(i - gm.L(10.0f)), x - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.e(true);
                        clickableSpanArr[0].onClick(rc2Var);
                        return true;
                    }
                    m66 m66Var = new m66(clickableSpanArr[0], null, x, y, 0);
                    this.U.a(m66Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        b66 b = m66Var.b();
                        b.e(this.t, spanStart, this.T, this.S);
                        this.t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b);
                        return true;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return true;
                    }
                }
                this.U.e(true);
                rc2Var.invalidate();
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
                    if (rc2Var.getDelegate() != null) {
                        rc2Var.getDelegate().i0(rc2Var, this.O);
                    }
                    rc2Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    k47 k47Var2 = this.M;
                    if (k47Var2 != null && k47Var2.k != null) {
                        oo0.e(k47Var2, new mf2(k47Var2, (byte) 6), new bn0((byte) 1));
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

    public final void b(Canvas canvas, int i, int i2, ylb ylbVar) {
        float f;
        TextPaint textPaint;
        float f2;
        float f3;
        ec7 ec7Var;
        int v0;
        int i3;
        k47 k47Var = this.M;
        if (k47Var != null && k47Var.w3()) {
            fg0 fg0Var = this.L;
            rc2 rc2Var = this.c;
            in5 in5Var = null;
            if (fg0Var == null) {
                int w0 = cmb.w0(null, cmb.h6, false);
                this.K = w0;
                fg0 Y = cmb.Y(w0, 12, 12);
                this.L = Y;
                Y.setCallback(rc2Var);
            }
            this.y.setColor(cmb.n2.getColor());
            this.z.setColor(cmb.w0(null, cmb.p5, false));
            this.A.setColor(cmb.n2.getColor());
            boolean O3 = this.M.O3();
            TextPaint textPaint2 = this.x;
            if (O3) {
                int i4 = cmb.Nb;
                textPaint2.setColor(cmb.v0(i4, ylbVar));
                this.B.setColor(cmb.v0(i4, ylbVar));
                this.C.setColor(cmb.v0(cmb.Qb, ylbVar));
            } else {
                int i5 = cmb.Ad;
                textPaint2.setColor(cmb.v0(i5, ylbVar));
                this.B.setColor(cmb.v0(i5, ylbVar));
                this.C.setColor(cmb.v0(cmb.Kd, ylbVar));
            }
            if (this.N) {
                this.B.setColor(cmb.v0(cmb.Vk, ylbVar));
            }
            canvas.save();
            int L = i2 - gm.L(4.0f);
            float f4 = L;
            canvas.translate(f4, i);
            this.I.set(L, i, this.m + L, this.l + i);
            canvas.saveLayer(0.0f, 0.0f, this.m, this.l, this.D, 31);
            this.d.h(canvas, null);
            float f5 = this.m / 2.0f;
            float L2 = gm.L(106.0f);
            int L3 = gm.L(12.0f) + this.H.width();
            int L4 = gm.L(10.0f) + this.H.height();
            this.F.set(f5 - ((gm.L(2.0f) + L3) / 2.0f), L2 - ((gm.L(2.0f) + L4) / 2.0f), ((gm.L(2.0f) + L3) / 2.0f) + f5, ((gm.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, gm.L(11.0f), gm.L(11.0f), this.E);
            float f6 = L3 / 2.0f;
            float f7 = L4 / 2.0f;
            this.F.set(f5 - f6, L2 - f7, f5 + f6, L2 + f7);
            canvas.drawRoundRect(this.F, gm.L(10.0f), gm.L(10.0f), this.B);
            Drawable drawable = this.p;
            if (drawable != null) {
                drawable.setBounds(gm.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - gm.L(6.96f), gm.L(21.24f) + ((int) this.F.left), gm.L(6.96f) + ((int) this.F.centerY()));
                this.p.draw(canvas);
            }
            String str = this.q;
            float centerX = this.F.centerX();
            if (this.N) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            float L5 = centerX + gm.L(f);
            float centerY = this.F.centerY() + gm.L(4.0f);
            if (this.N) {
                textPaint = this.w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, gm.L(128.0f));
            int L6 = gm.L(128.0f) + i;
            this.S = this.n + L6;
            this.T = (int) ((this.r / 2.0f) + f4);
            canvas.save();
            canvas.translate(this.r / 2.0f, 0.0f);
            this.s.draw(canvas);
            canvas.translate(0.0f, this.n);
            this.t.draw(canvas);
            canvas.restore();
            float f8 = 6.0f;
            canvas.translate(0.0f, gm.L(6.0f) + this.o);
            int v = hg9.v(6.0f, this.o, L6);
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
                        f9 += this.h[i8] + gm.L(40.0f);
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
                            v0 = cmb.v0(cmb.Nb, ylbVar);
                        } else {
                            int f11 = m9c.f(user);
                            if (f11 < 7) {
                                v0 = cmb.v0(cmb.q8[f11], ylbVar);
                            } else {
                                fc7 fc7Var = oc7.r1(z8c.t0).E3;
                                if (fc7Var == null) {
                                    ec7Var = in5Var;
                                } else {
                                    ec7Var = fc7Var.d(f11);
                                }
                                if (ec7Var != 0) {
                                    v0 = ec7Var.f();
                                } else {
                                    v0 = cmb.v0(cmb.q8[0], ylbVar);
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
                        this.a[i10].h(canvas, in5Var);
                        CharSequence charSequence = this.f[i10];
                        int i12 = i9;
                        canvas.drawText(charSequence, 0, charSequence.length(), gm.L(30.0f), gm.L(16.0f), this.x);
                        this.G.set(0.0f, 0.0f, this.h[i10] + gm.L(40.0f), gm.L(24.0f));
                        canvas.drawRoundRect(this.G, gm.L(12.0f), gm.L(12.0f), this.C);
                        float f12 = i12;
                        this.j[i10].set(i12, v, (int) (this.G.width() + f12), gm.L(24.0f) + v);
                        canvas.translate(this.G.width() + gm.L(f3), 0.0f);
                        i9 = (int) (this.G.width() + gm.L(f3) + f12);
                        i10++;
                        boolean[] zArr3 = this.k;
                        if (i10 >= zArr3.length || this.i[i10] || !zArr3[i10]) {
                            break;
                        }
                        i7 = i3;
                        in5Var = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, gm.L(30.0f));
                    v += gm.L(30.0f);
                    i6 = i10;
                    i7 = i3;
                    in5Var = null;
                    f8 = f3;
                } else {
                    i6++;
                    in5Var = null;
                }
            }
            canvas.translate(0.0f, gm.L(f8));
            canvas.save();
            canvas.translate(this.r / 2.0f, 0.0f);
            this.u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (cmb.I.o()) {
                    f2 = 0.12f;
                } else {
                    f2 = 0.1f;
                }
                int p1 = cmb.p1(f2, i7);
                if (this.K != p1) {
                    fg0 fg0Var2 = this.L;
                    this.K = p1;
                    cmb.F1(fg0Var2, p1, true);
                }
                this.L.setBounds(this.j[this.O]);
                this.L.setCallback(rc2Var);
            }
            i66 i66Var = this.U;
            if (i66Var != null && i66Var.g(canvas)) {
                rc2Var.invalidate();
            }
        }
    }

    public final void c(boolean z) {
        k47 k47Var = this.M;
        if (k47Var != null && k47Var.w3() && this.L != null) {
            i66 i66Var = this.U;
            if (i66Var != null) {
                i66Var.e(true);
            }
            fg0 fg0Var = this.L;
            rc2 rc2Var = this.c;
            if (z) {
                fg0Var.setCallback(new jo(this, (byte) 6));
                this.L.setState(this.J);
                rc2Var.invalidate();
                return;
            }
            fg0Var.setState(StateSet.NOTHING);
            rc2Var.invalidate();
        }
    }

    public final void d(int i, k47 k47Var) {
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
        if (k47Var.w3()) {
            this.M = k47Var;
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
                this.v.setTypeface(gm.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(gm.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.w.setTypeface(gm.o());
                this.w.setTextSize(gm.L(12.0f));
                this.w.setTextAlign(align);
                this.w.setColor(-1);
                this.x.setTypeface(gm.o());
                this.x.setTextSize(gm.L(13.0f));
                this.A.setTextSize(gm.L(13.0f));
                this.y.setTextSize(gm.L(14.0f));
                this.z.setTextSize(gm.L(14.0f));
                this.z.setTextAlign(align);
            }
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new pc0[10];
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
                    imageReceiver2.q0(gm.L(12.0f));
                    this.b[i2] = new pc0((ylb) null);
                    this.b[i2].s(gm.L(18.0f));
                    this.j[i2] = new Rect();
                    i2++;
                }
            }
            this.d.v0 = false;
            p09 p09Var = this.e;
            if (p09Var == null) {
                p09Var = new p09(2131624040, gm.L(120.0f), gm.L(120.0f));
                this.e = p09Var;
            }
            this.d.g0(p09Var);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) k47Var.k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.b = (pc0[]) Arrays.copyOf(this.b, size);
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
                    imageReceiver3.q0(gm.L(12.0f));
                    this.b[i3] = new pc0((ylb) null);
                    this.b[i3].s(gm.L(18.0f));
                    this.j[i3] = new Rect();
                }
            }
            int L = gm.L(90.0f);
            int L2 = gm.L(230.0f);
            SpannableStringBuilder S2 = gm.S2(jb6.M0(2131753351, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(S2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, S2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder N2 = gm.N2(jb6.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), cmb.Wc, 0, new by4(this, k47Var, tL_messageMediaGiveawayResults, (byte) 0), null);
            this.R.append((CharSequence) gm.G2(N2, gm.S2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder S22 = gm.S2(jb6.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) S22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), N2.length() + 2, S22.length() + N2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) gm.S2(jb6.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
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
                spannableStringBuilder2.append((CharSequence) jb6.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) jb6.M0(2131753353, null));
            }
            TextPaint textPaint2 = this.y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.s = oya.c(spannableStringBuilder, textPaint2, L2, alignment, gm.L(2.0f), truncateAt, L2, 10, true);
            this.t = oya.c(this.R, this.y, L2, alignment, gm.L(2.0f), truncateAt, L2, 10, true);
            this.u = oya.c(spannableStringBuilder2, this.y, L2, alignment, gm.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i, L2);
            this.r = max - L2;
            float f2 = max;
            float f3 = L;
            float f4 = f3 / 2.0f;
            this.d.i0((f2 / 2.0f) - f4, gm.L(70.0f) - f4, f3, f3);
            StaticLayout staticLayout = this.s;
            int L3 = gm.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.n = L3;
            StaticLayout staticLayout2 = this.t;
            this.o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.u;
            int lineBottom = this.l + this.o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.l = lineBottom;
            this.l = gm.L(128.0f) + lineBottom;
            this.m = max;
            if (this.N) {
                if (this.p == null) {
                    this.p = b10.d(a.b, 2131231127);
                }
                str = jb6.E((int) tL_messageMediaGiveawayResults.stars, ',');
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
                rect.right = gm.L(20.0f) + rect.right;
            }
            Arrays.fill(this.k, false);
            this.l = gm.L(30.0f) + this.l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Long l = arrayList2.get(i4);
                i4++;
                Long l2 = l;
                if (oc7.r1(z8c.t0).W1(l2) != null) {
                    arrayList.add(l2);
                }
            }
            int i5 = 0;
            float f6 = 0.0f;
            while (i5 < arrayList.size()) {
                Long l3 = (Long) arrayList.get(i5);
                long longValue = l3.longValue();
                TLRPC.User W1 = oc7.r1(z8c.t0).W1(l3);
                if (W1 != null) {
                    this.k[i5] = true;
                    this.g[i5] = W1;
                    f = f5;
                    this.f[i5] = TextUtils.ellipsize(gw3.m(m9c.r(W1), this.x.getFontMetricsInt(), false, null, 0), this.x, 0.8f * f2, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint3 = this.x;
                    CharSequence charSequence = this.f[i5];
                    fArr[i5] = textPaint3.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i5] + gm.L(40.0f);
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
                            this.l = gm.L(30.0f) + this.l;
                            f6 = L4;
                        }
                    } else {
                        zArr[i5] = false;
                    }
                    this.b[i5].q(W1);
                    this.a[i5].U(W1, this.b[i5], null);
                    this.a[i5].i0(0.0f, 0.0f, gm.L(24.0f), gm.L(24.0f));
                } else {
                    f = f5;
                    this.g[i5] = null;
                    this.k[i5] = false;
                    this.f[i5] = "";
                    this.i[i5] = false;
                    this.h[i5] = gm.L(f);
                    this.b[i5].j(longValue, "", "", null);
                }
                i5++;
                f5 = f;
            }
        }
    }
}
