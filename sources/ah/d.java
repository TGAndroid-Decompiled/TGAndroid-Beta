package ah;

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
import ei.e;
import java.util.ArrayList;
import java.util.Arrays;
import k2.p1;
import m2.p0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bc;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.t0;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u8;
import xg.s;
public final class d {
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
    public y L;
    public zi M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public p0 U;
    public ImageReceiver[] f450a;
    public u8[] f451b;
    public final q1 f452c;
    public ImageReceiver d;
    public ch0 f453e;
    public CharSequence[] f454f;
    public TLRPC.User[] f455g;
    public float[] h;
    public boolean[] f456i;
    public Rect[] f457j;
    public boolean[] f458k;
    public int f461n;
    public int f462o;
    public Drawable f463p;
    public String f464q;
    public int f465r;
    public StaticLayout f466s;
    public StaticLayout f467t;
    public StaticLayout f468u;
    public TextPaint v;
    public TextPaint f469w;
    public TextPaint f470x;
    public TextPaint f471y;
    public TextPaint f472z;
    public int f459l = 0;
    public int f460m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public d(q1 q1Var) {
        this.f452c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i3;
        zi ziVar = this.M;
        if (ziVar != null && ziVar.x3()) {
            p0 p0Var = this.U;
            q1 q1Var = this.f452c;
            if (p0Var == null) {
                this.U = new p0(q1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f467t) != null && (i3 = y9 - this.S) > 0) {
                int offsetForHorizontal = this.f467t.getOffsetForHorizontal(staticLayout.getLineForVertical(i3 - g0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(q1Var);
                        return true;
                    }
                    t70 t70Var = new t70(clickableSpanArr[0], null, x10, y9, 0);
                    this.U.b(t70Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        n70 b10 = t70Var.b();
                        b10.e(this.f467t, spanStart, this.T, this.S);
                        this.f467t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return true;
                    }
                }
                this.U.f(true);
                q1Var.invalidate();
            }
            if (action == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f457j;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y9)) {
                            this.O = i10;
                            this.L.setHotspot(x10, y9);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.I.contains(x10, y9)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().z1(q1Var, this.O);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    zi ziVar2 = this.M;
                    if (ziVar2 != null && ziVar2.f26868k != null) {
                        s.d(ziVar2, new xg.d(ziVar2, 0), new e(28));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.f(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i3, int i10, e6 e6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        wo woVar;
        int w02;
        int i11;
        zi ziVar = this.M;
        if (ziVar != null && ziVar.x3()) {
            y yVar = this.L;
            q1 q1Var = this.f452c;
            bc bcVar = null;
            if (yVar == null) {
                int x02 = k6.x0(null, k6.f27972i6, false);
                this.K = x02;
                y a02 = k6.a0(x02, 12, 12);
                this.L = a02;
                a02.setCallback(q1Var);
            }
            this.f471y.setColor(k6.f28077o2.getColor());
            this.f472z.setColor(k6.x0(null, k6.f28120q5, false));
            this.A.setColor(k6.f28077o2.getColor());
            if (this.M.Q3()) {
                TextPaint textPaint2 = this.f470x;
                int i12 = k6.Lb;
                textPaint2.setColor(k6.w0(i12, e6Var));
                this.B.setColor(k6.w0(i12, e6Var));
                this.C.setColor(k6.w0(k6.Ob, e6Var));
            } else {
                TextPaint textPaint3 = this.f470x;
                int i13 = k6.f28278yd;
                textPaint3.setColor(k6.w0(i13, e6Var));
                this.B.setColor(k6.w0(i13, e6Var));
                this.C.setColor(k6.w0(k6.Id, e6Var));
            }
            if (this.N) {
                this.B.setColor(k6.w0(k6.Tk, e6Var));
            }
            canvas.save();
            int L = i10 - g0.L(4.0f);
            float f13 = L;
            canvas.translate(f13, i3);
            this.I.set(L, i3, this.f460m + L, this.f459l + i3);
            canvas.saveLayer(0.0f, 0.0f, this.f460m, this.f459l, this.D, 31);
            this.d.h(canvas, null);
            float f14 = this.f460m / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.H.width();
            int L4 = g0.L(10.0f) + this.H.height();
            this.F.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, g0.L(11.0f), g0.L(11.0f), this.E);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.F.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas.drawRoundRect(this.F, g0.L(10.0f), g0.L(10.0f), this.B);
            Drawable drawable = this.f463p;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.F.left), g0.L(6.96f) + ((int) this.F.centerY()));
                this.f463p.draw(canvas);
            }
            String str = this.f464q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.F.centerY() + g0.L(4.0f);
            if (this.N) {
                textPaint = this.f469w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i3;
            this.S = this.f461n + L6;
            this.T = (int) ((this.f465r / 2.0f) + f13);
            canvas.save();
            canvas.translate(this.f465r / 2.0f, 0.0f);
            this.f466s.draw(canvas);
            canvas.translate(0.0f, this.f461n);
            this.f467t.draw(canvas);
            canvas.restore();
            float f17 = 6.0f;
            canvas.translate(0.0f, g0.L(6.0f) + this.f462o);
            int C = k5.C(6.0f, this.f462o, L6);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                boolean[] zArr = this.f458k;
                if (i14 >= zArr.length) {
                    break;
                } else if (zArr[i14]) {
                    canvas.save();
                    int i16 = i14;
                    float f18 = 0.0f;
                    while (true) {
                        f12 = f17;
                        f18 += this.h[i16] + g0.L(40.0f);
                        i16++;
                        boolean[] zArr2 = this.f458k;
                        if (i16 >= zArr2.length || this.f456i[i16] || !zArr2[i16]) {
                            break;
                        }
                        f17 = f12;
                    }
                    float f19 = f14 - (f18 / 2.0f);
                    canvas.translate(f19, 0.0f);
                    int i17 = ((int) f19) + L;
                    int i18 = i14;
                    while (true) {
                        TLRPC.User user = this.f455g[i18];
                        if (this.M.Q3()) {
                            w02 = k6.w0(k6.Lb, e6Var);
                        } else {
                            int e10 = l10.e(user);
                            if (e10 < 7) {
                                w02 = k6.w0(k6.f28142r8[e10], e6Var);
                            } else {
                                xo xoVar = hp.s1(h10.f22829t0).f23099q4;
                                if (xoVar == null) {
                                    woVar = bcVar;
                                } else {
                                    woVar = xoVar.d(e10);
                                }
                                if (woVar != 0) {
                                    w02 = woVar.f();
                                } else {
                                    w02 = k6.w0(k6.f28142r8[0], e6Var);
                                }
                            }
                        }
                        int i19 = this.O;
                        if (i19 >= 0 && i19 == i18) {
                            i11 = w02;
                        } else {
                            i11 = i15;
                        }
                        this.f470x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f450a[i18].h(canvas, bcVar);
                        CharSequence charSequence = this.f454f[i18];
                        int i20 = i17;
                        canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.f470x);
                        this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                        canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                        float f20 = i20;
                        this.f457j[i18].set(i20, C, (int) (this.G.width() + f20), g0.L(24.0f) + C);
                        canvas.translate(this.G.width() + g0.L(f12), 0.0f);
                        i17 = (int) (this.G.width() + g0.L(f12) + f20);
                        i18++;
                        boolean[] zArr3 = this.f458k;
                        if (i18 >= zArr3.length || this.f456i[i18] || !zArr3[i18]) {
                            break;
                        }
                        i15 = i11;
                        bcVar = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i14 = i18;
                    i15 = i11;
                    bcVar = null;
                    f17 = f12;
                } else {
                    i14++;
                    bcVar = null;
                }
            }
            canvas.translate(0.0f, g0.L(f17));
            canvas.save();
            canvas.translate(this.f465r / 2.0f, 0.0f);
            this.f468u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (k6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int r12 = k6.r1(f11, i15);
                if (this.K != r12) {
                    y yVar2 = this.L;
                    this.K = r12;
                    k6.H1(yVar2, r12, true);
                }
                this.L.setBounds(this.f457j[this.O]);
                this.L.setCallback(q1Var);
            }
            p0 p0Var = this.U;
            if (p0Var != null && p0Var.h(canvas)) {
                q1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        zi ziVar = this.M;
        if (ziVar != null && ziVar.x3() && this.L != null) {
            p0 p0Var = this.U;
            if (p0Var != null) {
                p0Var.f(true);
            }
            q1 q1Var = this.f452c;
            if (z10) {
                this.L.setCallback(new a(this, 1));
                this.L.setState(this.J);
                q1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i3, zi ziVar) {
        boolean z10;
        float f10;
        boolean z11;
        this.M = null;
        this.f466s = null;
        this.f467t = null;
        this.f468u = null;
        this.f459l = 0;
        this.f460m = 0;
        this.N = false;
        if (ziVar.x3()) {
            this.M = ziVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f469w = new TextPaint(1);
                this.f470x = new TextPaint(1);
                this.f471y = new TextPaint(1);
                this.f472z = new TextPaint(1);
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
                this.f454f = new CharSequence[10];
                this.f455g = new TLRPC.User[10];
                this.h = new float[10];
                this.f456i = new boolean[10];
                this.f457j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f452c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(g0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f469w.setTypeface(g0.o());
                this.f469w.setTextSize(g0.L(12.0f));
                this.f469w.setTextAlign(align);
                this.f469w.setColor(-1);
                this.f470x.setTypeface(g0.o());
                this.f470x.setTextSize(g0.L(13.0f));
                this.A.setTextSize(g0.L(13.0f));
                this.f471y.setTextSize(g0.L(14.0f));
                this.f472z.setTextSize(g0.L(14.0f));
                this.f472z.setTextAlign(align);
            }
            if (this.f450a == null) {
                this.f450a = new ImageReceiver[10];
                this.f451b = new u8[10];
                this.f458k = new boolean[10];
                int i10 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f450a;
                    if (i10 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i10] = new ImageReceiver(this.f452c);
                    ImageReceiver imageReceiver2 = this.f450a[i10];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.f451b[i10] = new u8((e6) null);
                    this.f451b[i10].u(g0.L(18.0f));
                    this.f457j[i10] = new Rect();
                    i10++;
                }
            }
            this.d.f21274v0 = false;
            if (this.f453e == null) {
                this.f453e = new ch0(2131624039, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.w0(this.f453e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) ziVar.f26868k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f450a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f450a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f451b = (u8[]) Arrays.copyOf(this.f451b, size);
                this.f458k = Arrays.copyOf(this.f458k, size);
                this.f454f = (CharSequence[]) Arrays.copyOf(this.f454f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f456i = Arrays.copyOf(this.f456i, size);
                this.f457j = (Rect[]) Arrays.copyOf(this.f457j, size);
                this.f455g = (TLRPC.User[]) Arrays.copyOf(this.f455g, size);
                for (int i11 = length - 1; i11 < size; i11++) {
                    this.f450a[i11] = new ImageReceiver(this.f452c);
                    ImageReceiver imageReceiver3 = this.f450a[i11];
                    imageReceiver3.A1 = true;
                    imageReceiver3.J0(g0.L(12.0f));
                    this.f451b[i11] = new u8((e6) null);
                    this.f451b[i11].u(g0.L(18.0f));
                    this.f457j[i11] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder X2 = g0.X2(bd.M0(2131753386, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder S2 = g0.S2(bd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), k6.Uc, 0, new c(this, ziVar, tL_messageMediaGiveawayResults, 0), null);
            this.R.append((CharSequence) g0.K2(S2, g0.X2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder X22 = g0.X2(bd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) X22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), S2.length() + 2, X22.length() + S2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.X2(bd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) bd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) bd.M0(2131753388, null));
            }
            TextPaint textPaint2 = this.f471y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f466s = lu0.c(spannableStringBuilder, textPaint2, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f467t = lu0.c(this.R, this.f471y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f468u = lu0.c(spannableStringBuilder2, this.f471y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i3, L2);
            this.f465r = max - L2;
            float f11 = max;
            float f12 = L;
            float f13 = f12 / 2.0f;
            this.d.y0((f11 / 2.0f) - f13, g0.L(70.0f) - f13, f12, f12);
            StaticLayout staticLayout = this.f466s;
            int L3 = g0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f461n = L3;
            StaticLayout staticLayout2 = this.f467t;
            this.f462o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.f468u;
            int lineBottom = this.f459l + this.f462o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f459l = lineBottom;
            this.f459l = g0.L(128.0f) + lineBottom;
            this.f460m = max;
            if (this.N) {
                if (this.f463p == null) {
                    this.f463p = p1.g(t0.f25457b, 2131231124);
                }
                this.f464q = bd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f463p = null;
                this.f464q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f464q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f14 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f458k, false);
            this.f459l = g0.L(30.0f) + this.f459l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Long l10 = arrayList2.get(i12);
                i12++;
                Long l11 = l10;
                if (hp.s1(h10.f22829t0).a2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i13 = 0;
            float f15 = 0.0f;
            while (i13 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i13);
                long longValue = l12.longValue();
                TLRPC.User a22 = hp.s1(h10.f22829t0).a2(l12);
                if (a22 != null) {
                    this.f458k[i13] = true;
                    this.f455g[i13] = a22;
                    f10 = f14;
                    this.f454f[i13] = TextUtils.ellipsize(i6.m(l10.p(a22), this.f470x.getFontMetricsInt(), false, null, 0), this.f470x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f470x;
                    CharSequence charSequence = this.f454f[i13];
                    fArr[i13] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i13] + g0.L(40.0f);
                    f15 += L4;
                    if (i13 > 0) {
                        boolean[] zArr = this.f456i;
                        if (f15 > 0.9f * f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i13] = z11;
                        if (z11) {
                            this.f459l = g0.L(30.0f) + this.f459l;
                            f15 = L4;
                        }
                    } else {
                        this.f456i[i13] = false;
                    }
                    this.f451b[i13].r(a22);
                    this.f450a[i13].i0(a22, this.f451b[i13], null);
                    this.f450a[i13].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    f10 = f14;
                    this.f455g[i13] = null;
                    this.f458k[i13] = false;
                    this.f454f[i13] = "";
                    this.f456i[i13] = false;
                    this.h[i13] = g0.L(f10);
                    this.f451b[i13].k(longValue, "", "", null);
                }
                i13++;
                f14 = f10;
            }
        }
    }
}
