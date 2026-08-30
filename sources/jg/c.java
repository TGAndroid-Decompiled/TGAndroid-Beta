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
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f90;
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
    public b90 U;
    public ImageReceiver[] f9395a;
    public z8[] f9396b;
    public final t1 f9397c;
    public ImageReceiver d;
    public gj0 e;
    public CharSequence[] f9398f;
    public TLRPC.User[] f9399g;
    public float[] h;
    public boolean[] f9400i;
    public Rect[] f9401j;
    public boolean[] f9402k;
    public int f9405n;
    public int f9406o;
    public Drawable f9407p;
    public String f9408q;
    public int f9409r;
    public StaticLayout f9410s;
    public StaticLayout f9411t;
    public StaticLayout f9412u;
    public TextPaint v;
    public TextPaint f9413w;
    public TextPaint f9414x;
    public TextPaint f9415y;
    public TextPaint f9416z;
    public int f9403l = 0;
    public int f9404m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(t1 t1Var) {
        this.f9397c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            b90 b90Var = this.U;
            t1 t1Var = this.f9397c;
            if (b90Var == null) {
                this.U = new b90(t1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f9411t) != null && (i10 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f9411t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(t1Var);
                        return true;
                    }
                    f90 f90Var = new f90(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.a(f90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        y80 b10 = f90Var.b();
                        b10.e(this.f9411t, spanStart, this.T, this.S);
                        this.f9411t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.U.d(true);
                t1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f9401j;
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
                        t1Var.getDelegate().N(this.O, t1Var);
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
            t1 t1Var = this.f9397c;
            if (zVar == null) {
                int w02 = j6.w0(null, j6.f19996i6, false);
                this.K = w02;
                z Y = j6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(t1Var);
            }
            this.f9415y.setColor(j6.f20099o2.getColor());
            this.f9416z.setColor(j6.w0(null, j6.f20139q5, false));
            this.A.setColor(j6.f20099o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f9414x;
                int i13 = j6.Xa;
                textPaint2.setColor(j6.v0(i13, f6Var));
                this.B.setColor(j6.v0(i13, f6Var));
                this.C.setColor(j6.v0(j6.f19856ab, f6Var));
            } else {
                TextPaint textPaint3 = this.f9414x;
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
            this.I.set(dp, i10, this.f9404m + dp, this.f9403l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f9404m, this.f9403l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f9404m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f9407p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f9407p.draw(canvas);
            }
            String str = this.f9408q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f10);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f9413w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f9405n + dp6;
            this.T = (int) ((this.f9409r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f9409r / 2.0f, 0.0f);
            this.f9410s.draw(canvas);
            canvas.translate(0.0f, this.f9405n);
            this.f9411t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f9406o);
            int C = y3.C(6.0f, this.f9406o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f9402k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f16 = 0.0f;
                    do {
                        f16 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f9402k;
                        if (i17 >= zArr.length || this.f9400i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f17 = f13 - (f16 / 2.0f);
                    canvas.translate(f17, 0.0f);
                    int i18 = ((int) f17) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f9399g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = j6.v0(j6.Xa, f6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = j6.v0(j6.f20160r8[colorId], f6Var);
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
                                    v02 = j6.v0(j6.f20160r8[0], f6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f9414x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f9395a[i19].draw(canvas);
                        CharSequence charSequence = this.f9398f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f9414x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f18 = i21;
                        this.f9401j[i19].set(i21, C, (int) (this.G.width() + f18), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f18);
                        i19++;
                        boolean[] zArr3 = this.f9402k;
                        if (i19 >= zArr3.length || this.f9400i[i19] || !zArr3[i19]) {
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
            canvas.translate(this.f9409r / 2.0f, 0.0f);
            this.f9412u.draw(canvas);
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
                this.L.setBounds(this.f9401j[this.O]);
                this.L.setCallback(t1Var);
            }
            b90 b90Var = this.U;
            if (b90Var != null && b90Var.f(canvas)) {
                t1Var.invalidate();
            }
        }
    }

    public final void c(boolean z4) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            b90 b90Var = this.U;
            if (b90Var != null) {
                b90Var.d(true);
            }
            t1 t1Var = this.f9397c;
            if (z4) {
                this.L.setCallback(new f(this, 2));
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
        this.f9410s = null;
        this.f9411t = null;
        this.f9412u = null;
        this.f9403l = 0;
        this.f9404m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f9413w = new TextPaint(1);
                this.f9414x = new TextPaint(1);
                this.f9415y = new TextPaint(1);
                this.f9416z = new TextPaint(1);
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
                this.f9398f = new CharSequence[10];
                this.f9399g = new TLRPC.User[10];
                this.h = new float[10];
                this.f9400i = new boolean[10];
                this.f9401j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f9397c);
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
                this.f9413w.setTypeface(AndroidUtilities.bold());
                this.f9413w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f9413w.setTextAlign(align);
                this.f9413w.setColor(-1);
                this.f9414x.setTypeface(AndroidUtilities.bold());
                this.f9414x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f9415y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f9416z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f9416z.setTextAlign(align);
            }
            if (this.f9395a == null) {
                this.f9395a = new ImageReceiver[10];
                this.f9396b = new z8[10];
                this.f9402k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f9395a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f9397c);
                    this.f9395a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f9395a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f9396b[i11] = new z8((f6) null);
                    this.f9396b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f9401j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new gj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), "" + R.raw.giveaway_results, AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f9395a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f9395a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f9396b = (z8[]) Arrays.copyOf(this.f9396b, size);
                this.f9402k = Arrays.copyOf(this.f9402k, size);
                this.f9398f = (CharSequence[]) Arrays.copyOf(this.f9398f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f9400i = Arrays.copyOf(this.f9400i, size);
                this.f9401j = (Rect[]) Arrays.copyOf(this.f9401j, size);
                this.f9399g = (TLRPC.User[]) Arrays.copyOf(this.f9399g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f9395a[i12] = new ImageReceiver(this.f9397c);
                    this.f9395a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f9395a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f9396b[i12] = new z8((f6) null);
                    this.f9396b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f9401j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), j6.f19966gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f9415y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f9410s = kw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f9411t = kw0.c(this.R, this.f9415y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f9412u = kw0.c(spannableStringBuilder2, this.f9415y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f9409r = max - dp2;
            float f10 = max;
            float f11 = dp;
            float f12 = f11 / 2.0f;
            this.d.setImageCoords((f10 / 2.0f) - f12, AndroidUtilities.dp(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f9410s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f9405n = dp3;
            StaticLayout staticLayout2 = this.f9411t;
            this.f9406o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f9412u;
            int lineBottom = this.f9403l + this.f9406o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f9403l = lineBottom;
            this.f9403l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f9404m = max;
            if (this.N) {
                if (this.f9407p == null) {
                    this.f9407p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f9408q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f9407p = null;
                this.f9408q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f9408q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f9402k, false);
            this.f9403l = AndroidUtilities.dp(30.0f) + this.f9403l;
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
                    this.f9402k[i14] = true;
                    this.f9399g[i14] = user3;
                    user = user2;
                    this.f9398f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f9414x.getFontMetricsInt(), false), this.f9414x, f10 * 0.8f, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f9414x;
                    CharSequence charSequence = this.f9398f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f13 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f9400i;
                        if (f13 > 0.9f * f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr[i14] = z10;
                        if (z10) {
                            this.f9403l = AndroidUtilities.dp(30.0f) + this.f9403l;
                            f13 = dp4;
                        }
                    } else {
                        this.f9400i[i14] = false;
                    }
                    this.f9396b[i14].r(user3);
                    this.f9395a[i14].setForUserOrChat(user3, this.f9396b[i14]);
                    this.f9395a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f9399g[i14] = user;
                    this.f9402k[i14] = false;
                    this.f9398f[i14] = "";
                    this.f9400i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f9396b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
