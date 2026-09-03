package jg;

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
import cg.h0;
import gg.h;
import gg.p0;
import i.f;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z8;
public final class c {
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
    public c90 U;
    public ImageReceiver[] f9376a;
    public z8[] f9377b;
    public final s1 f9378c;
    public ImageReceiver d;
    public gj0 e;
    public CharSequence[] f9379f;
    public TLRPC.User[] f9380g;
    public float[] h;
    public boolean[] f9381i;
    public Rect[] f9382j;
    public boolean[] f9383k;
    public int f9386n;
    public int f9387o;
    public Drawable f9388p;
    public String f9389q;
    public int f9390r;
    public StaticLayout f9391s;
    public StaticLayout f9392t;
    public StaticLayout f9393u;
    public TextPaint v;
    public TextPaint f9394w;
    public TextPaint f9395x;
    public TextPaint f9396y;
    public TextPaint f9397z;
    public int f9384l = 0;
    public int f9385m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(s1 s1Var) {
        this.f9378c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            c90 c90Var = this.U;
            s1 s1Var = this.f9378c;
            if (c90Var == null) {
                this.U = new c90(s1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f9392t) != null && (i10 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f9392t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(s1Var);
                        return true;
                    }
                    g90 g90Var = new g90(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.a(g90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        y80 b10 = g90Var.b();
                        b10.e(this.f9392t, spanStart, this.T, this.S);
                        this.f9392t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.U.d(true);
                s1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f9382j;
                    if (i11 < rectArr.length) {
                        if (rectArr[i11].contains(x10, y10)) {
                            this.O = i11;
                            this.L.setHotspot(x10, y10);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i11++;
                    } else if (this.I.contains(x10, y10)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().N(this.O, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        p0.d(messageObject2, new h0(messageObject2, 7), new h(0));
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

    public final void b(Canvas canvas, int i10, int i11, f6 f6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        boolean[] zArr;
        MessagesController.PeerColor color;
        int v02;
        int i12;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z zVar = this.L;
            s1 s1Var = this.f9378c;
            if (zVar == null) {
                int w02 = j6.w0(null, j6.f19971i6, false);
                this.K = w02;
                z Y = j6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(s1Var);
            }
            this.f9396y.setColor(j6.f20074o2.getColor());
            this.f9397z.setColor(j6.w0(null, j6.f20114q5, false));
            this.A.setColor(j6.f20074o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f9395x;
                int i13 = j6.Xa;
                textPaint2.setColor(j6.v0(i13, f6Var));
                this.B.setColor(j6.v0(i13, f6Var));
                this.C.setColor(j6.v0(j6.f19831ab, f6Var));
            } else {
                TextPaint textPaint3 = this.f9395x;
                int i14 = j6.Kc;
                textPaint3.setColor(j6.v0(i14, f6Var));
                this.B.setColor(j6.v0(i14, f6Var));
                this.C.setColor(j6.v0(j6.Uc, f6Var));
            }
            if (this.N) {
                this.B.setColor(j6.v0(j6.fk, f6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f12 = dp;
            canvas.translate(f12, i10);
            this.I.set(dp, i10, this.f9385m + dp, this.f9384l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f9385m, this.f9384l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f9385m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f9388p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f9388p.draw(canvas);
            }
            String str = this.f9389q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f10);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f9394w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f9386n + dp6;
            this.T = (int) ((this.f9390r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f9390r / 2.0f, 0.0f);
            this.f9391s.draw(canvas);
            canvas.translate(0.0f, this.f9386n);
            this.f9392t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f9387o);
            int C = y3.C(6.0f, this.f9387o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f9383k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f16 = 0.0f;
                    do {
                        f16 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f9383k;
                        if (i17 >= zArr.length || this.f9381i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f17 = f13 - (f16 / 2.0f);
                    canvas.translate(f17, 0.0f);
                    int i18 = ((int) f17) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f9380g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = j6.v0(j6.Xa, f6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = j6.v0(j6.f20134r8[colorId], f6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    v02 = color.getColor1();
                                } else {
                                    v02 = j6.v0(j6.f20134r8[0], f6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f9395x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f9376a[i19].draw(canvas);
                        CharSequence charSequence = this.f9379f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f9395x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f18 = i21;
                        this.f9382j[i19].set(i21, C, (int) (this.G.width() + f18), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f18);
                        i19++;
                        boolean[] zArr3 = this.f9383k;
                        if (i19 >= zArr3.length || this.f9381i[i19] || !zArr3[i19]) {
                            break;
                        }
                        i16 = i12;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
                    i15 = i19;
                    i16 = i12;
                } else {
                    i15++;
                }
            }
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.translate(this.f9390r / 2.0f, 0.0f);
            this.f9393u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (j6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int l1 = j6.l1(f11, i16);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    j6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f9382j[this.O]);
                this.L.setCallback(s1Var);
            }
            c90 c90Var = this.U;
            if (c90Var != null && c90Var.f(canvas)) {
                s1Var.invalidate();
            }
        }
    }

    public final void c(boolean z4) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            c90 c90Var = this.U;
            if (c90Var != null) {
                c90Var.d(true);
            }
            s1 s1Var = this.f9378c;
            if (z4) {
                this.L.setCallback(new f(this, 2));
                this.L.setState(this.J);
                s1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            s1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z4;
        TLRPC.User user;
        boolean z10;
        TLRPC.User user2 = null;
        this.M = null;
        this.f9391s = null;
        this.f9392t = null;
        this.f9393u = null;
        this.f9384l = 0;
        this.f9385m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f9394w = new TextPaint(1);
                this.f9395x = new TextPaint(1);
                this.f9396y = new TextPaint(1);
                this.f9397z = new TextPaint(1);
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
                this.f9379f = new CharSequence[10];
                this.f9380g = new TLRPC.User[10];
                this.h = new float[10];
                this.f9381i = new boolean[10];
                this.f9382j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f9378c);
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
                this.f9394w.setTypeface(AndroidUtilities.bold());
                this.f9394w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f9394w.setTextAlign(align);
                this.f9394w.setColor(-1);
                this.f9395x.setTypeface(AndroidUtilities.bold());
                this.f9395x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f9396y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f9397z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f9397z.setTextAlign(align);
            }
            if (this.f9376a == null) {
                this.f9376a = new ImageReceiver[10];
                this.f9377b = new z8[10];
                this.f9383k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f9376a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f9378c);
                    this.f9376a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f9376a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f9377b[i11] = new z8((f6) null);
                    this.f9377b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f9382j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new gj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f9376a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f9376a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f9377b = (z8[]) Arrays.copyOf(this.f9377b, size);
                this.f9383k = Arrays.copyOf(this.f9383k, size);
                this.f9379f = (CharSequence[]) Arrays.copyOf(this.f9379f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f9381i = Arrays.copyOf(this.f9381i, size);
                this.f9382j = (Rect[]) Arrays.copyOf(this.f9382j, size);
                this.f9380g = (TLRPC.User[]) Arrays.copyOf(this.f9380g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f9376a[i12] = new ImageReceiver(this.f9378c);
                    this.f9376a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f9376a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f9377b[i12] = new z8((f6) null);
                    this.f9377b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f9382j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), j6.f19941gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
            this.R.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", replaceSingleTag, AndroidUtilities.replaceTags("**" + tL_messageMediaGiveawayResults.winners_count + "**")));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tL_messageMediaGiveawayResults.winners_count));
            this.R.append((CharSequence) replaceTags2);
            this.R.setSpan(new RelativeSizeSpan(1.05f), replaceSingleTag.length() + 2, replaceTags2.length() + replaceSingleTag.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.N = z4;
            if (z4) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint2 = this.f9396y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f9391s = kw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f9392t = kw0.c(this.R, this.f9396y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f9393u = kw0.c(spannableStringBuilder2, this.f9396y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f9390r = max - dp2;
            float f10 = max;
            float f11 = dp;
            float f12 = f11 / 2.0f;
            this.d.setImageCoords((f10 / 2.0f) - f12, AndroidUtilities.dp(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f9391s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f9386n = dp3;
            StaticLayout staticLayout2 = this.f9392t;
            this.f9387o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f9393u;
            int lineBottom = this.f9384l + this.f9387o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f9384l = lineBottom;
            this.f9384l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f9385m = max;
            if (this.N) {
                if (this.f9388p == null) {
                    this.f9388p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f9389q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f9388p = null;
                this.f9389q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f9389q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f9383k, false);
            this.f9384l = AndroidUtilities.dp(30.0f) + this.f9384l;
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
                long longValue = l12.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l12);
                if (user3 != null) {
                    this.f9383k[i14] = true;
                    this.f9380g[i14] = user3;
                    user = user2;
                    this.f9379f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f9395x.getFontMetricsInt(), false), this.f9395x, 0.8f * f10, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f9395x;
                    CharSequence charSequence = this.f9379f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f13 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f9381i;
                        if (f13 > 0.9f * f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr[i14] = z10;
                        if (z10) {
                            this.f9384l = AndroidUtilities.dp(30.0f) + this.f9384l;
                            f13 = dp4;
                        }
                    } else {
                        this.f9381i[i14] = false;
                    }
                    this.f9377b[i14].r(user3);
                    this.f9376a[i14].setForUserOrChat(user3, this.f9377b[i14]);
                    this.f9376a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f9380g[i14] = user;
                    this.f9383k[i14] = false;
                    this.f9379f[i14] = "";
                    this.f9381i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f9377b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
