package hg;

import ag.i0;
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
import eg.h;
import eg.q0;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z80;
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
    public v80 U;
    public ImageReceiver[] f8026a;
    public e9[] f8027b;
    public final s1 f8028c;
    public ImageReceiver d;
    public xi0 f8029e;
    public CharSequence[] f8030f;
    public TLRPC.User[] f8031g;
    public float[] h;
    public boolean[] f8032i;
    public Rect[] f8033j;
    public boolean[] f8034k;
    public int f8037n;
    public int f8038o;
    public Drawable f8039p;
    public String f8040q;
    public int f8041r;
    public StaticLayout f8042s;
    public StaticLayout f8043t;
    public StaticLayout f8044u;
    public TextPaint v;
    public TextPaint f8045w;
    public TextPaint f8046x;
    public TextPaint f8047y;
    public TextPaint f8048z;
    public int f8035l = 0;
    public int f8036m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public d(s1 s1Var) {
        this.f8028c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            v80 v80Var = this.U;
            s1 s1Var = this.f8028c;
            if (v80Var == null) {
                this.U = new v80(s1Var);
            }
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f8043t) != null && (i10 = y8 - this.S) > 0) {
                int offsetForHorizontal = this.f8043t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x4 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(s1Var);
                        return true;
                    }
                    z80 z80Var = new z80(clickableSpanArr[0], null, x4, y8, 0);
                    this.U.a(z80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        s80 b10 = z80Var.b();
                        b10.e(this.f8043t, spanStart, this.T, this.S);
                        this.f8043t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return true;
                    }
                }
                this.U.d(true);
                s1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f8033j;
                    if (i11 < rectArr.length) {
                        if (rectArr[i11].contains(x4, y8)) {
                            this.O = i11;
                            this.L.setHotspot(x4, y8);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i11++;
                    } else if (this.I.contains(x4, y8)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().L(this.O, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        q0.d(messageObject2, new i0(messageObject2, 7), new h(0));
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
        float f9;
        TextPaint textPaint;
        float f10;
        boolean[] zArr;
        MessagesController.PeerColor color;
        int v02;
        int i12;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z zVar = this.L;
            s1 s1Var = this.f8028c;
            if (zVar == null) {
                int w02 = g6.w0(null, g6.f23152i6, false);
                this.K = w02;
                z Y = g6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(s1Var);
            }
            this.f8047y.setColor(g6.f23256o2.getColor());
            this.f8048z.setColor(g6.w0(null, g6.f23294q5, false));
            this.A.setColor(g6.f23256o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f8046x;
                int i13 = g6.Xa;
                textPaint2.setColor(g6.v0(i13, c6Var));
                this.B.setColor(g6.v0(i13, c6Var));
                this.C.setColor(g6.v0(g6.f23013ab, c6Var));
            } else {
                TextPaint textPaint3 = this.f8046x;
                int i14 = g6.Kc;
                textPaint3.setColor(g6.v0(i14, c6Var));
                this.B.setColor(g6.v0(i14, c6Var));
                this.C.setColor(g6.v0(g6.Uc, c6Var));
            }
            if (this.N) {
                this.B.setColor(g6.v0(g6.fk, c6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f11 = dp;
            canvas.translate(f11, i10);
            this.I.set(dp, i10, this.f8036m + dp, this.f8035l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f8036m, this.f8035l, this.D, 31);
            this.d.draw(canvas);
            float f12 = this.f8036m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f12 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f12, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f13 = dp3 / 2.0f;
            float f14 = dp4 / 2.0f;
            this.F.set(f12 - f13, dp2 - f14, f12 + f13, dp2 + f14);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f8039p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f8039p.draw(canvas);
            }
            String str = this.f8040q;
            float centerX = this.F.centerX();
            if (this.N) {
                f9 = 8.0f;
            } else {
                f9 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f9);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f8045w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f8037n + dp6;
            this.T = (int) ((this.f8041r / 2.0f) + f11);
            canvas.save();
            canvas.translate(this.f8041r / 2.0f, 0.0f);
            this.f8042s.draw(canvas);
            canvas.translate(0.0f, this.f8037n);
            this.f8043t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f8038o);
            int C = x3.C(6.0f, this.f8038o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f8034k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f15 = 0.0f;
                    do {
                        f15 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f8034k;
                        if (i17 >= zArr.length || this.f8032i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f16 = f12 - (f15 / 2.0f);
                    canvas.translate(f16, 0.0f);
                    int i18 = ((int) f16) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f8031g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = g6.v0(g6.Xa, c6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = g6.v0(g6.f23312r8[colorId], c6Var);
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
                                    v02 = g6.v0(g6.f23312r8[0], c6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f8046x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f8026a[i19].draw(canvas);
                        CharSequence charSequence = this.f8030f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f8046x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f17 = i21;
                        this.f8033j[i19].set(i21, C, (int) (this.G.width() + f17), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f17);
                        i19++;
                        boolean[] zArr3 = this.f8034k;
                        if (i19 >= zArr3.length || this.f8032i[i19] || !zArr3[i19]) {
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
            canvas.translate(this.f8041r / 2.0f, 0.0f);
            this.f8044u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (g6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int l1 = g6.l1(f10, i16);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    g6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f8033j[this.O]);
                this.L.setCallback(s1Var);
            }
            v80 v80Var = this.U;
            if (v80Var != null && v80Var.f(canvas)) {
                s1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            v80 v80Var = this.U;
            if (v80Var != null) {
                v80Var.d(true);
            }
            s1 s1Var = this.f8028c;
            if (z10) {
                this.L.setCallback(new a(this, 1));
                this.L.setState(this.J);
                s1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            s1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z10;
        TLRPC.User user;
        boolean z11;
        TLRPC.User user2 = null;
        this.M = null;
        this.f8042s = null;
        this.f8043t = null;
        this.f8044u = null;
        this.f8035l = 0;
        this.f8036m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f8045w = new TextPaint(1);
                this.f8046x = new TextPaint(1);
                this.f8047y = new TextPaint(1);
                this.f8048z = new TextPaint(1);
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
                this.f8030f = new CharSequence[10];
                this.f8031g = new TLRPC.User[10];
                this.h = new float[10];
                this.f8032i = new boolean[10];
                this.f8033j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f8028c);
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
                this.f8045w.setTypeface(AndroidUtilities.bold());
                this.f8045w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f8045w.setTextAlign(align);
                this.f8045w.setColor(-1);
                this.f8046x.setTypeface(AndroidUtilities.bold());
                this.f8046x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f8047y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f8048z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f8048z.setTextAlign(align);
            }
            if (this.f8026a == null) {
                this.f8026a = new ImageReceiver[10];
                this.f8027b = new e9[10];
                this.f8034k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f8026a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f8028c);
                    this.f8026a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f8026a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f8027b[i11] = new e9((c6) null);
                    this.f8027b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f8033j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.f8029e == null) {
                this.f8029e = new xi0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), "" + R.raw.giveaway_results, AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.f8029e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f8026a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f8026a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f8027b = (e9[]) Arrays.copyOf(this.f8027b, size);
                this.f8034k = Arrays.copyOf(this.f8034k, size);
                this.f8030f = (CharSequence[]) Arrays.copyOf(this.f8030f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f8032i = Arrays.copyOf(this.f8032i, size);
                this.f8033j = (Rect[]) Arrays.copyOf(this.f8033j, size);
                this.f8031g = (TLRPC.User[]) Arrays.copyOf(this.f8031g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f8026a[i12] = new ImageReceiver(this.f8028c);
                    this.f8026a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f8026a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f8027b[i12] = new e9((c6) null);
                    this.f8027b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f8033j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), g6.gc, 0, new c(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f8047y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f8042s = bw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f8043t = bw0.c(this.R, this.f8047y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f8044u = bw0.c(spannableStringBuilder2, this.f8047y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f8041r = max - dp2;
            float f9 = max;
            float f10 = dp;
            float f11 = f10 / 2.0f;
            this.d.setImageCoords((f9 / 2.0f) - f11, AndroidUtilities.dp(70.0f) - f11, f10, f10);
            StaticLayout staticLayout = this.f8042s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f8037n = dp3;
            StaticLayout staticLayout2 = this.f8043t;
            this.f8038o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f8044u;
            int lineBottom = this.f8035l + this.f8038o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f8035l = lineBottom;
            this.f8035l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f8036m = max;
            if (this.N) {
                if (this.f8039p == null) {
                    this.f8039p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f8040q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f8039p = null;
                this.f8040q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f8040q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f8034k, false);
            this.f8035l = AndroidUtilities.dp(30.0f) + this.f8035l;
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
            float f12 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i14);
                long longValue = l12.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l12);
                if (user3 != null) {
                    this.f8034k[i14] = true;
                    this.f8031g[i14] = user3;
                    user = user2;
                    this.f8030f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f8046x.getFontMetricsInt(), false), this.f8046x, f9 * 0.8f, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f8046x;
                    CharSequence charSequence = this.f8030f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f12 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f8032i;
                        if (f12 > 0.9f * f9) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f8035l = AndroidUtilities.dp(30.0f) + this.f8035l;
                            f12 = dp4;
                        }
                    } else {
                        this.f8032i[i14] = false;
                    }
                    this.f8027b[i14].r(user3);
                    this.f8026a[i14].setForUserOrChat(user3, this.f8027b[i14]);
                    this.f8026a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f8031g[i14] = user;
                    this.f8034k[i14] = false;
                    this.f8030f[i14] = "";
                    this.f8032i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f8027b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
