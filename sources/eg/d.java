package eg;

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
import bg.i;
import bg.k;
import bg.u0;
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
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.z8;
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
    public i80 U;
    public ImageReceiver[] f5148a;
    public z8[] f5149b;
    public final t1 f5150c;
    public ImageReceiver d;
    public mi0 f5151e;
    public CharSequence[] f5152f;
    public TLRPC.User[] f5153g;
    public float[] h;
    public boolean[] f5154i;
    public Rect[] f5155j;
    public boolean[] f5156k;
    public int f5159n;
    public int f5160o;
    public Drawable f5161p;
    public String f5162q;
    public int f5163r;
    public StaticLayout f5164s;
    public StaticLayout f5165t;
    public StaticLayout f5166u;
    public TextPaint v;
    public TextPaint f5167w;
    public TextPaint f5168x;
    public TextPaint f5169y;
    public TextPaint f5170z;
    public int f5157l = 0;
    public int f5158m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public d(t1 t1Var) {
        this.f5150c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i9;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            i80 i80Var = this.U;
            t1 t1Var = this.f5150c;
            if (i80Var == null) {
                this.U = new i80(t1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f5165t) != null && (i9 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f5165t.getOffsetForHorizontal(staticLayout.getLineForVertical(i9 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(t1Var);
                        return true;
                    }
                    m80 m80Var = new m80(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.a(m80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        f80 b10 = m80Var.b();
                        b10.e(this.f5165t, spanStart, this.T, this.S);
                        this.f5165t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return true;
                    }
                }
                this.U.d(true);
                t1Var.invalidate();
            }
            if (action == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f5155j;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y10)) {
                            this.O = i10;
                            this.L.setHotspot(x10, y10);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.I.contains(x10, y10)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().S(this.O, t1Var);
                    }
                    t1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        u0.d(messageObject2, new i(messageObject2, 0), new k(0));
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

    public final void b(Canvas canvas, int i9, int i10, b6 b6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        boolean[] zArr;
        MessagesController.PeerColor color;
        int v02;
        int i11;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z zVar = this.L;
            t1 t1Var = this.f5150c;
            if (zVar == null) {
                int w02 = f6.w0(null, f6.f23092i6, false);
                this.K = w02;
                z Y = f6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(t1Var);
            }
            this.f5169y.setColor(f6.f23193o2.getColor());
            this.f5170z.setColor(f6.w0(null, f6.f23228q5, false));
            this.A.setColor(f6.f23193o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f5168x;
                int i12 = f6.Xa;
                textPaint2.setColor(f6.v0(i12, b6Var));
                this.B.setColor(f6.v0(i12, b6Var));
                this.C.setColor(f6.v0(f6.f22951ab, b6Var));
            } else {
                TextPaint textPaint3 = this.f5168x;
                int i13 = f6.Kc;
                textPaint3.setColor(f6.v0(i13, b6Var));
                this.B.setColor(f6.v0(i13, b6Var));
                this.C.setColor(f6.v0(f6.Uc, b6Var));
            }
            if (this.N) {
                this.B.setColor(f6.v0(f6.fk, b6Var));
            }
            canvas.save();
            int dp = i10 - AndroidUtilities.dp(4.0f);
            float f12 = dp;
            canvas.translate(f12, i9);
            this.I.set(dp, i9, this.f5158m + dp, this.f5157l + i9);
            canvas.saveLayer(0.0f, 0.0f, this.f5158m, this.f5157l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f5158m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f5161p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f5161p.draw(canvas);
            }
            String str = this.f5162q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f10);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f5167w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i9;
            this.S = this.f5159n + dp6;
            this.T = (int) ((this.f5163r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f5163r / 2.0f, 0.0f);
            this.f5164s.draw(canvas);
            canvas.translate(0.0f, this.f5159n);
            this.f5165t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f5160o);
            int C = l0.C(6.0f, this.f5160o, dp6);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                boolean[] zArr2 = this.f5156k;
                if (i14 >= zArr2.length) {
                    break;
                } else if (zArr2[i14]) {
                    canvas.save();
                    int i16 = i14;
                    float f16 = 0.0f;
                    do {
                        f16 += this.h[i16] + AndroidUtilities.dp(40.0f);
                        i16++;
                        zArr = this.f5156k;
                        if (i16 >= zArr.length || this.f5154i[i16]) {
                            break;
                        }
                    } while (zArr[i16]);
                    float f17 = f13 - (f16 / 2.0f);
                    canvas.translate(f17, 0.0f);
                    int i17 = ((int) f17) + dp;
                    int i18 = i14;
                    while (true) {
                        TLRPC.User user = this.f5153g[i18];
                        if (this.M.isOutOwner()) {
                            v02 = f6.v0(f6.Xa, b6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = f6.v0(f6.f23250r8[colorId], b6Var);
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
                                    v02 = f6.v0(f6.f23250r8[0], b6Var);
                                }
                            }
                        }
                        int i19 = this.O;
                        if (i19 >= 0 && i19 == i18) {
                            i11 = v02;
                        } else {
                            i11 = i15;
                        }
                        this.f5168x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f5148a[i18].draw(canvas);
                        CharSequence charSequence = this.f5152f[i18];
                        int i20 = i17;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f5168x);
                        this.G.set(0.0f, 0.0f, this.h[i18] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f18 = i20;
                        this.f5155j[i18].set(i20, C, (int) (this.G.width() + f18), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i17 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f18);
                        i18++;
                        boolean[] zArr3 = this.f5156k;
                        if (i18 >= zArr3.length || this.f5154i[i18] || !zArr3[i18]) {
                            break;
                        }
                        i15 = i11;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
                    i14 = i18;
                    i15 = i11;
                } else {
                    i14++;
                }
            }
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.translate(this.f5163r / 2.0f, 0.0f);
            this.f5166u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (f6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int l1 = f6.l1(f11, i15);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    f6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f5155j[this.O]);
                this.L.setCallback(t1Var);
            }
            i80 i80Var = this.U;
            if (i80Var != null && i80Var.f(canvas)) {
                t1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            i80 i80Var = this.U;
            if (i80Var != null) {
                i80Var.d(true);
            }
            t1 t1Var = this.f5150c;
            if (z10) {
                this.L.setCallback(new a(this, 1));
                this.L.setState(this.J);
                t1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i9) {
        boolean z10;
        TLRPC.User user;
        boolean z11;
        TLRPC.User user2 = null;
        this.M = null;
        this.f5164s = null;
        this.f5165t = null;
        this.f5166u = null;
        this.f5157l = 0;
        this.f5158m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f5167w = new TextPaint(1);
                this.f5168x = new TextPaint(1);
                this.f5169y = new TextPaint(1);
                this.f5170z = new TextPaint(1);
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
                this.f5152f = new CharSequence[10];
                this.f5153g = new TLRPC.User[10];
                this.h = new float[10];
                this.f5154i = new boolean[10];
                this.f5155j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f5150c);
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
                this.f5167w.setTypeface(AndroidUtilities.bold());
                this.f5167w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f5167w.setTextAlign(align);
                this.f5167w.setColor(-1);
                this.f5168x.setTypeface(AndroidUtilities.bold());
                this.f5168x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f5169y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f5170z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f5170z.setTextAlign(align);
            }
            if (this.f5148a == null) {
                this.f5148a = new ImageReceiver[10];
                this.f5149b = new z8[10];
                this.f5156k = new boolean[10];
                int i10 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f5148a;
                    if (i10 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i10] = new ImageReceiver(this.f5150c);
                    this.f5148a[i10].setAllowLoadingOnAttachedOnly(true);
                    this.f5148a[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f5149b[i10] = new z8((b6) null);
                    this.f5149b[i10].u(AndroidUtilities.dp(18.0f));
                    this.f5155j[i10] = new Rect();
                    i10++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.f5151e == null) {
                this.f5151e = new mi0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), "" + R.raw.giveaway_results, AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.f5151e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f5148a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f5148a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f5149b = (z8[]) Arrays.copyOf(this.f5149b, size);
                this.f5156k = Arrays.copyOf(this.f5156k, size);
                this.f5152f = (CharSequence[]) Arrays.copyOf(this.f5152f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f5154i = Arrays.copyOf(this.f5154i, size);
                this.f5155j = (Rect[]) Arrays.copyOf(this.f5155j, size);
                this.f5153g = (TLRPC.User[]) Arrays.copyOf(this.f5153g, size);
                for (int i11 = length - 1; i11 < size; i11++) {
                    this.f5148a[i11] = new ImageReceiver(this.f5150c);
                    this.f5148a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f5148a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f5149b[i11] = new z8((b6) null);
                    this.f5149b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f5155j[i11] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), f6.f23061gc, 0, new c(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint2 = this.f5169y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f5164s = rv0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f5165t = rv0.c(this.R, this.f5169y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f5166u = rv0.c(spannableStringBuilder2, this.f5169y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i9, dp2);
            this.f5163r = max - dp2;
            float f10 = max;
            float f11 = dp;
            float f12 = f11 / 2.0f;
            this.d.setImageCoords((f10 / 2.0f) - f12, AndroidUtilities.dp(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f5164s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f5159n = dp3;
            StaticLayout staticLayout2 = this.f5165t;
            this.f5160o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f5166u;
            int lineBottom = this.f5157l + this.f5160o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f5157l = lineBottom;
            this.f5157l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f5158m = max;
            if (this.N) {
                if (this.f5161p == null) {
                    this.f5161p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f5162q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f5161p = null;
                this.f5162q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f5162q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f5156k, false);
            this.f5157l = AndroidUtilities.dp(30.0f) + this.f5157l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Long l10 = arrayList2.get(i12);
                i12++;
                Long l11 = l10;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i13 = 0;
            float f13 = 0.0f;
            while (i13 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i13);
                long longValue = l12.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l12);
                if (user3 != null) {
                    this.f5156k[i13] = true;
                    this.f5153g[i13] = user3;
                    user = user2;
                    this.f5152f[i13] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f5168x.getFontMetricsInt(), false), this.f5168x, f10 * 0.8f, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f5168x;
                    CharSequence charSequence = this.f5152f[i13];
                    fArr[i13] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i13] + AndroidUtilities.dp(40.0f);
                    f13 += dp4;
                    if (i13 > 0) {
                        boolean[] zArr = this.f5154i;
                        if (f13 > 0.9f * f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i13] = z11;
                        if (z11) {
                            this.f5157l = AndroidUtilities.dp(30.0f) + this.f5157l;
                            f13 = dp4;
                        }
                    } else {
                        this.f5154i[i13] = false;
                    }
                    this.f5149b[i13].r(user3);
                    this.f5148a[i13].setForUserOrChat(user3, this.f5149b[i13]);
                    this.f5148a[i13].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f5153g[i13] = user;
                    this.f5156k[i13] = false;
                    this.f5152f[i13] = "";
                    this.f5154i[i13] = false;
                    this.h[i13] = AndroidUtilities.dp(20.0f);
                    this.f5149b[i13].n(longValue, "", "");
                }
                i13++;
                user2 = user;
            }
        }
    }
}
