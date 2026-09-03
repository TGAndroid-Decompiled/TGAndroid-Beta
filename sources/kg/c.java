package kg;

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
import dg.h0;
import hg.h;
import hg.p0;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.z80;
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
    public d90 U;
    public ImageReceiver[] f11210a;
    public z8[] f11211b;
    public final t1 f11212c;
    public ImageReceiver d;
    public hj0 f11213e;
    public CharSequence[] f11214f;
    public TLRPC.User[] f11215g;
    public float[] h;
    public boolean[] f11216i;
    public Rect[] f11217j;
    public boolean[] f11218k;
    public int f11221n;
    public int f11222o;
    public Drawable f11223p;
    public String f11224q;
    public int f11225r;
    public StaticLayout f11226s;
    public StaticLayout f11227t;
    public StaticLayout f11228u;
    public TextPaint v;
    public TextPaint f11229w;
    public TextPaint f11230x;
    public TextPaint f11231y;
    public TextPaint f11232z;
    public int f11219l = 0;
    public int f11220m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(t1 t1Var) {
        this.f11212c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            d90 d90Var = this.U;
            t1 t1Var = this.f11212c;
            if (d90Var == null) {
                this.U = new d90(t1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f11227t) != null && (i10 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f11227t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(t1Var);
                        return true;
                    }
                    h90 h90Var = new h90(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.a(h90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        z80 b10 = h90Var.b();
                        b10.e(this.f11227t, spanStart, this.T, this.S);
                        this.f11227t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return true;
                    }
                }
                this.U.d(true);
                t1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f11217j;
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
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().L(this.O, t1Var);
                    }
                    t1Var.playSoundEffect(0);
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

    public final void b(Canvas canvas, int i10, int i11, g6 g6Var) {
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
            t1 t1Var = this.f11212c;
            if (zVar == null) {
                int w02 = k6.w0(null, k6.f21752i6, false);
                this.K = w02;
                z Y = k6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(t1Var);
            }
            this.f11231y.setColor(k6.f21855o2.getColor());
            this.f11232z.setColor(k6.w0(null, k6.f21895q5, false));
            this.A.setColor(k6.f21855o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f11230x;
                int i13 = k6.Xa;
                textPaint2.setColor(k6.v0(i13, g6Var));
                this.B.setColor(k6.v0(i13, g6Var));
                this.C.setColor(k6.v0(k6.f21611ab, g6Var));
            } else {
                TextPaint textPaint3 = this.f11230x;
                int i14 = k6.Kc;
                textPaint3.setColor(k6.v0(i14, g6Var));
                this.B.setColor(k6.v0(i14, g6Var));
                this.C.setColor(k6.v0(k6.Uc, g6Var));
            }
            if (this.N) {
                this.B.setColor(k6.v0(k6.fk, g6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f12 = dp;
            canvas.translate(f12, i10);
            this.I.set(dp, i10, this.f11220m + dp, this.f11219l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f11220m, this.f11219l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f11220m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f11223p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f11223p.draw(canvas);
            }
            String str = this.f11224q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f10);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f11229w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f11221n + dp6;
            this.T = (int) ((this.f11225r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f11225r / 2.0f, 0.0f);
            this.f11226s.draw(canvas);
            canvas.translate(0.0f, this.f11221n);
            this.f11227t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f11222o);
            int C = y3.C(6.0f, this.f11222o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f11218k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f16 = 0.0f;
                    do {
                        f16 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f11218k;
                        if (i17 >= zArr.length || this.f11216i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f17 = f13 - (f16 / 2.0f);
                    canvas.translate(f17, 0.0f);
                    int i18 = ((int) f17) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f11215g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = k6.v0(k6.Xa, g6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = k6.v0(k6.f21916r8[colorId], g6Var);
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
                                    v02 = k6.v0(k6.f21916r8[0], g6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f11230x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f11210a[i19].draw(canvas);
                        CharSequence charSequence = this.f11214f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f11230x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f18 = i21;
                        this.f11217j[i19].set(i21, C, (int) (this.G.width() + f18), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f18);
                        i19++;
                        boolean[] zArr3 = this.f11218k;
                        if (i19 >= zArr3.length || this.f11216i[i19] || !zArr3[i19]) {
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
            canvas.translate(this.f11225r / 2.0f, 0.0f);
            this.f11228u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (k6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int l1 = k6.l1(f11, i16);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    k6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f11217j[this.O]);
                this.L.setCallback(t1Var);
            }
            d90 d90Var = this.U;
            if (d90Var != null && d90Var.f(canvas)) {
                t1Var.invalidate();
            }
        }
    }

    public final void c(boolean z4) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            d90 d90Var = this.U;
            if (d90Var != null) {
                d90Var.d(true);
            }
            t1 t1Var = this.f11212c;
            if (z4) {
                this.L.setCallback(new f(this, 3));
                this.L.setState(this.J);
                t1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z4;
        TLRPC.User user;
        boolean z10;
        TLRPC.User user2 = null;
        this.M = null;
        this.f11226s = null;
        this.f11227t = null;
        this.f11228u = null;
        this.f11219l = 0;
        this.f11220m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f11229w = new TextPaint(1);
                this.f11230x = new TextPaint(1);
                this.f11231y = new TextPaint(1);
                this.f11232z = new TextPaint(1);
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
                this.f11214f = new CharSequence[10];
                this.f11215g = new TLRPC.User[10];
                this.h = new float[10];
                this.f11216i = new boolean[10];
                this.f11217j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f11212c);
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
                this.f11229w.setTypeface(AndroidUtilities.bold());
                this.f11229w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f11229w.setTextAlign(align);
                this.f11229w.setColor(-1);
                this.f11230x.setTypeface(AndroidUtilities.bold());
                this.f11230x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f11231y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f11232z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f11232z.setTextAlign(align);
            }
            if (this.f11210a == null) {
                this.f11210a = new ImageReceiver[10];
                this.f11211b = new z8[10];
                this.f11218k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f11210a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f11212c);
                    this.f11210a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f11210a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f11211b[i11] = new z8((g6) null);
                    this.f11211b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f11217j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.f11213e == null) {
                this.f11213e = new hj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.f11213e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f11210a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f11210a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f11211b = (z8[]) Arrays.copyOf(this.f11211b, size);
                this.f11218k = Arrays.copyOf(this.f11218k, size);
                this.f11214f = (CharSequence[]) Arrays.copyOf(this.f11214f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f11216i = Arrays.copyOf(this.f11216i, size);
                this.f11217j = (Rect[]) Arrays.copyOf(this.f11217j, size);
                this.f11215g = (TLRPC.User[]) Arrays.copyOf(this.f11215g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f11210a[i12] = new ImageReceiver(this.f11212c);
                    this.f11210a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f11210a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f11211b[i12] = new z8((g6) null);
                    this.f11211b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f11217j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), k6.f21722gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f11231y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f11226s = kw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f11227t = kw0.c(this.R, this.f11231y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f11228u = kw0.c(spannableStringBuilder2, this.f11231y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f11225r = max - dp2;
            float f10 = max;
            float f11 = dp;
            float f12 = f11 / 2.0f;
            this.d.setImageCoords((f10 / 2.0f) - f12, AndroidUtilities.dp(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f11226s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f11221n = dp3;
            StaticLayout staticLayout2 = this.f11227t;
            this.f11222o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f11228u;
            int lineBottom = this.f11219l + this.f11222o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f11219l = lineBottom;
            this.f11219l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f11220m = max;
            if (this.N) {
                if (this.f11223p == null) {
                    this.f11223p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f11224q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f11223p = null;
                this.f11224q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f11224q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f11218k, false);
            this.f11219l = AndroidUtilities.dp(30.0f) + this.f11219l;
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
                    this.f11218k[i14] = true;
                    this.f11215g[i14] = user3;
                    user = user2;
                    this.f11214f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f11230x.getFontMetricsInt(), false), this.f11230x, 0.8f * f10, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f11230x;
                    CharSequence charSequence = this.f11214f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f13 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f11216i;
                        if (f13 > 0.9f * f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr[i14] = z10;
                        if (z10) {
                            this.f11219l = AndroidUtilities.dp(30.0f) + this.f11219l;
                            f13 = dp4;
                        }
                    } else {
                        this.f11216i[i14] = false;
                    }
                    this.f11211b[i14].r(user3);
                    this.f11210a[i14].setForUserOrChat(user3, this.f11211b[i14]);
                    this.f11210a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f11215g[i14] = user;
                    this.f11218k[i14] = false;
                    this.f11214f[i14] = "";
                    this.f11216i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f11211b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
