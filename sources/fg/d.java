package fg;

import ag.n0;
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
import cg.h;
import cg.q0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.y8;

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
    public z L;
    public MessageObject M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public m80 U;

    public ImageReceiver[] f6079a;

    public y8[] f6080b;

    public final s1 f6081c;
    public ImageReceiver d;

    public oi0 f6082e;

    public CharSequence[] f6083f;

    public TLRPC.User[] f6084g;
    public float[] h;

    public boolean[] f6085i;

    public Rect[] f6086j;

    public boolean[] f6087k;

    public int f6090n;

    public int f6091o;

    public Drawable f6092p;

    public String f6093q;

    public int f6094r;

    public StaticLayout f6095s;

    public StaticLayout f6096t;

    public StaticLayout f6097u;
    public TextPaint v;

    public TextPaint f6098w;

    public TextPaint f6099x;

    public TextPaint f6100y;

    public TextPaint f6101z;

    public int f6088l = 0;

    public int f6089m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public d(s1 s1Var) {
        this.f6081c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            m80 m80Var = this.U;
            s1 s1Var = this.f6081c;
            if (m80Var == null) {
                this.U = new m80(s1Var);
            }
            int action = motionEvent.getAction();
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f6096t) != null && (i10 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f6096t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x8 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(s1Var);
                        return true;
                    }
                    q80 q80Var = new q80(clickableSpanArr[0], null, x8, y10, 0);
                    this.U.a(q80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        j80 j80VarB = q80Var.b();
                        j80VarB.e(this.f6096t, spanStart, this.T, this.S);
                        this.f6096t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), j80VarB);
                        return true;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return true;
                    }
                }
                this.U.d(true);
                s1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f6086j;
                    if (i11 >= rectArr.length) {
                        if (!this.I.contains(x8, y10)) {
                            break;
                        }
                        this.Q = true;
                        return true;
                    }
                    if (rectArr[i11].contains(x8, y10)) {
                        this.O = i11;
                        this.L.setHotspot(x8, y10);
                        this.P = true;
                        c(true);
                        return true;
                    }
                    i11++;
                }
            } else if (action == 1) {
                if (this.P) {
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().R(this.O, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        q0.d(messageObject2, new n0(messageObject2, 2), new h(0));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.d(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i10, int i11, c6 c6Var) {
        boolean[] zArr;
        int color1;
        int i12;
        MessageObject messageObject = this.M;
        if (messageObject == null || !messageObject.isGiveawayResults()) {
            return;
        }
        z zVar = this.L;
        s1 s1Var = this.f6081c;
        if (zVar == null) {
            int iW0 = g6.w0(null, g6.f23144i6, false);
            this.K = iW0;
            z zVarY = g6.Y(iW0, 12, 12);
            this.L = zVarY;
            zVarY.setCallback(s1Var);
        }
        this.f6100y.setColor(g6.f23247o2.getColor());
        this.f6101z.setColor(g6.w0(null, g6.f23283q5, false));
        this.A.setColor(g6.f23247o2.getColor());
        if (this.M.isOutOwner()) {
            TextPaint textPaint = this.f6099x;
            int i13 = g6.Xa;
            textPaint.setColor(g6.v0(i13, c6Var));
            this.B.setColor(g6.v0(i13, c6Var));
            this.C.setColor(g6.v0(g6.f23003ab, c6Var));
        } else {
            TextPaint textPaint2 = this.f6099x;
            int i14 = g6.Kc;
            textPaint2.setColor(g6.v0(i14, c6Var));
            this.B.setColor(g6.v0(i14, c6Var));
            this.C.setColor(g6.v0(g6.Uc, c6Var));
        }
        if (this.N) {
            this.B.setColor(g6.v0(g6.fk, c6Var));
        }
        canvas.save();
        int iDp = i11 - AndroidUtilities.dp(4.0f);
        float f10 = iDp;
        canvas.translate(f10, i10);
        this.I.set(iDp, i10, this.f6089m + iDp, this.f6088l + i10);
        canvas.saveLayer(0.0f, 0.0f, this.f6089m, this.f6088l, this.D, 31);
        this.d.draw(canvas);
        float f11 = this.f6089m / 2.0f;
        float fDp = AndroidUtilities.dp(106.0f);
        int iDp2 = AndroidUtilities.dp(12.0f) + this.H.width();
        int iDp3 = AndroidUtilities.dp(10.0f) + this.H.height();
        this.F.set(f11 - ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f), fDp - ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f), ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f) + f11, ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f) + fDp);
        canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
        float f12 = iDp2 / 2.0f;
        float f13 = iDp3 / 2.0f;
        this.F.set(f11 - f12, fDp - f13, f11 + f12, fDp + f13);
        canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
        Drawable drawable = this.f6092p;
        if (drawable != null) {
            drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
            this.f6092p.draw(canvas);
        }
        canvas.drawText(this.f6093q, this.F.centerX() + AndroidUtilities.dp(this.N ? 8.0f : 0.0f), this.F.centerY() + AndroidUtilities.dp(4.0f), this.N ? this.f6098w : this.v);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
        int iDp4 = AndroidUtilities.dp(128.0f) + i10;
        this.S = this.f6090n + iDp4;
        this.T = (int) ((this.f6094r / 2.0f) + f10);
        canvas.save();
        canvas.translate(this.f6094r / 2.0f, 0.0f);
        this.f6095s.draw(canvas);
        canvas.translate(0.0f, this.f6090n);
        this.f6096t.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f6091o);
        int iC = y1.C(6.0f, this.f6091o, iDp4);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            boolean[] zArr2 = this.f6087k;
            if (i15 >= zArr2.length) {
                break;
            }
            if (zArr2[i15]) {
                canvas.save();
                int i17 = i15;
                float fDp2 = 0.0f;
                do {
                    fDp2 += this.h[i17] + AndroidUtilities.dp(40.0f);
                    i17++;
                    zArr = this.f6087k;
                    if (i17 >= zArr.length || this.f6085i[i17]) {
                        break;
                    }
                } while (zArr[i17]);
                float f14 = f11 - (fDp2 / 2.0f);
                canvas.translate(f14, 0.0f);
                int iWidth = ((int) f14) + iDp;
                int i18 = i15;
                while (true) {
                    TLRPC.User user = this.f6084g[i18];
                    if (this.M.isOutOwner()) {
                        color1 = g6.v0(g6.Xa, c6Var);
                    } else {
                        int colorId = UserObject.getColorId(user);
                        if (colorId < 7) {
                            color1 = g6.v0(g6.f23303r8[colorId], c6Var);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(colorId);
                            color1 = color != null ? color.getColor1() : g6.v0(g6.f23303r8[0], c6Var);
                        }
                    }
                    int i19 = this.O;
                    i12 = (i19 < 0 || i19 != i18) ? i16 : color1;
                    this.f6099x.setColor(color1);
                    this.C.setColor(color1);
                    this.C.setAlpha(25);
                    this.f6079a[i18].draw(canvas);
                    CharSequence charSequence = this.f6083f[i18];
                    int i20 = iWidth;
                    canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f6099x);
                    this.G.set(0.0f, 0.0f, this.h[i18] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                    float f15 = i20;
                    this.f6086j[i18].set(i20, iC, (int) (this.G.width() + f15), AndroidUtilities.dp(24.0f) + iC);
                    canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    iWidth = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f15);
                    i18++;
                    boolean[] zArr3 = this.f6087k;
                    if (i18 >= zArr3.length || this.f6085i[i18] || !zArr3[i18]) {
                        break;
                    } else {
                        i16 = i12;
                    }
                }
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                iC += AndroidUtilities.dp(30.0f);
                i15 = i18;
                i16 = i12;
            } else {
                i15++;
            }
        }
        canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas.save();
        canvas.translate(this.f6094r / 2.0f, 0.0f);
        this.f6097u.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.O >= 0) {
            int iL1 = g6.l1(g6.I.q() ? 0.12f : 0.1f, i16);
            if (this.K != iL1) {
                z zVar2 = this.L;
                this.K = iL1;
                g6.B1(zVar2, iL1, true);
            }
            this.L.setBounds(this.f6086j[this.O]);
            this.L.setCallback(s1Var);
        }
        m80 m80Var = this.U;
        if (m80Var == null || !m80Var.f(canvas)) {
            return;
        }
        s1Var.invalidate();
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject == null || !messageObject.isGiveawayResults() || this.L == null) {
            return;
        }
        m80 m80Var = this.U;
        if (m80Var != null) {
            m80Var.d(true);
        }
        s1 s1Var = this.f6081c;
        if (!z10) {
            this.L.setState(StateSet.NOTHING);
            s1Var.invalidate();
        } else {
            this.L.setCallback(new a(this, 1));
            this.L.setState(this.J);
            s1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        TLRPC.User user;
        TLRPC.User user2 = null;
        this.M = null;
        this.f6095s = null;
        this.f6096t = null;
        this.f6097u = null;
        this.f6088l = 0;
        this.f6089m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f6098w = new TextPaint(1);
                this.f6099x = new TextPaint(1);
                this.f6100y = new TextPaint(1);
                this.f6101z = new TextPaint(1);
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
                this.f6083f = new CharSequence[10];
                this.f6084g = new TLRPC.User[10];
                this.h = new float[10];
                this.f6085i = new boolean[10];
                this.f6086j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f6081c);
                this.d = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(AndroidUtilities.bold());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f6098w.setTypeface(AndroidUtilities.bold());
                this.f6098w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f6098w.setTextAlign(align);
                this.f6098w.setColor(-1);
                this.f6099x.setTypeface(AndroidUtilities.bold());
                this.f6099x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f6100y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f6101z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f6101z.setTextAlign(align);
            }
            if (this.f6079a == null) {
                this.f6079a = new ImageReceiver[10];
                this.f6080b = new y8[10];
                this.f6087k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f6079a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f6081c);
                    this.f6079a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f6079a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f6080b[i11] = new y8((c6) null);
                    this.f6080b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f6086j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.f6082e == null) {
                this.f6082e = new oi0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), "" + R.raw.giveaway_results, AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.f6082e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f6079a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f6079a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f6080b = (y8[]) Arrays.copyOf(this.f6080b, size);
                this.f6087k = Arrays.copyOf(this.f6087k, size);
                this.f6083f = (CharSequence[]) Arrays.copyOf(this.f6083f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f6085i = Arrays.copyOf(this.f6085i, size);
                this.f6086j = (Rect[]) Arrays.copyOf(this.f6086j, size);
                this.f6084g = (TLRPC.User[]) Arrays.copyOf(this.f6084g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f6079a[i12] = new ImageReceiver(this.f6081c);
                    this.f6079a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f6079a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f6080b[i12] = new y8((c6) null);
                    this.f6080b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f6086j[i12] = new Rect();
                }
            }
            int iDp = AndroidUtilities.dp(90.0f);
            int iDp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), g6.gc, 0, new c(this, messageObject, tL_messageMediaGiveawayResults, 0));
            this.R.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", spannableStringBuilderReplaceSingleTag, AndroidUtilities.replaceTags("**" + tL_messageMediaGiveawayResults.winners_count + "**")));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tL_messageMediaGiveawayResults.winners_count));
            this.R.append((CharSequence) spannableStringBuilderReplaceTags2);
            this.R.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilderReplaceSingleTag.length() + 2, spannableStringBuilderReplaceTags2.length() + spannableStringBuilderReplaceSingleTag.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z10 = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint2 = this.f6100y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float fDp = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f6095s = tv0.c(spannableStringBuilder, textPaint2, iDp2, alignment, fDp, false, truncateAt, iDp2, 10, true);
            this.f6096t = tv0.c(this.R, this.f6100y, iDp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, iDp2, 10, true);
            this.f6097u = tv0.c(spannableStringBuilder2, this.f6100y, iDp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, iDp2, 10, true);
            int iMax = Math.max(i10, iDp2);
            this.f6094r = iMax - iDp2;
            float f10 = iMax;
            float f11 = iDp;
            float f12 = f11 / 2.0f;
            this.d.setImageCoords((f10 / 2.0f) - f12, AndroidUtilities.dp(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f6095s;
            int iDp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f6090n = iDp3;
            StaticLayout staticLayout2 = this.f6096t;
            this.f6091o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + iDp3;
            StaticLayout staticLayout3 = this.f6097u;
            int lineBottom = this.f6088l + this.f6091o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f6088l = lineBottom;
            this.f6088l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f6089m = iMax;
            if (this.N) {
                if (this.f6092p == null) {
                    this.f6092p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f6093q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f6092p = null;
                this.f6093q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f6093q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f6087k, false);
            this.f6088l = AndroidUtilities.dp(30.0f) + this.f6088l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Long l10 = arrayList2.get(i13);
                i13++;
                Long l11 = l10;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i14 = 0;
            float f13 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i14);
                long jLongValue = l12.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l12);
                if (user3 != null) {
                    this.f6087k[i14] = true;
                    this.f6084g[i14] = user3;
                    user = user2;
                    this.f6083f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f6099x.getFontMetricsInt(), false), this.f6099x, f10 * 0.8f, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f6099x;
                    CharSequence charSequence = this.f6083f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float fDp2 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f13 += fDp2;
                    if (i14 > 0) {
                        boolean[] zArr = this.f6085i;
                        boolean z11 = f13 > 0.9f * f10;
                        zArr[i14] = z11;
                        if (z11) {
                            this.f6088l = AndroidUtilities.dp(30.0f) + this.f6088l;
                            f13 = fDp2;
                        }
                    } else {
                        this.f6085i[i14] = false;
                    }
                    this.f6080b[i14].r(user3);
                    this.f6079a[i14].setForUserOrChat(user3, this.f6080b[i14]);
                    this.f6079a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f6084g[i14] = user;
                    this.f6087k[i14] = false;
                    this.f6083f[i14] = "";
                    this.f6085i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f6080b[i14].n(jLongValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
