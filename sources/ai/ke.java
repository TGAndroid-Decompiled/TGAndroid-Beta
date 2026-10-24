package ai;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.zr;
public final class ke {
    public int f1645a;
    public final RectF f1646b;
    public final org.telegram.ui.Components.d6 f1647c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f1648f;
    public final Matrix f1649g;
    public final Paint h;
    public final boolean f1650i;
    public long f1651j;
    public final ImageReceiver f1652k;
    public final org.telegram.ui.Components.f9 f1653l;
    public final org.telegram.ui.Components.f9 f1654m;
    public h11 f1655n;
    public h11 f1656o;
    public boolean f1657p;
    public final org.telegram.ui.Components.wc f1658q;
    public int f1659r;
    public Drawable f1660s;
    public Drawable f1661t;
    public h11 f1662u;
    public int v;
    public final le f1663w;

    public ke(le leVar, boolean z10, long j10) {
        String str;
        me meVar = leVar.v;
        this.f1663w = leVar;
        this.f1646b = new RectF();
        zr zrVar = zr.h;
        this.f1647c = new org.telegram.ui.Components.d6(leVar, 0L, 600L, zrVar);
        this.d = new org.telegram.ui.Components.d6(leVar, 0L, 200L, zrVar);
        this.e = new org.telegram.ui.Components.d6(leVar, 0L, 350L, zrVar);
        this.f1648f = null;
        this.f1649g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(leVar);
        this.f1652k = imageReceiver;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.f1653l = f9Var;
        org.telegram.ui.Components.f9 f9Var2 = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.f1654m = f9Var2;
        this.f1658q = new org.telegram.ui.Components.wc(leVar);
        this.f1650i = z10;
        this.f1651j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(meVar.f1841c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            f9Var.r(user);
            imageReceiver.setForUserOrChat(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(meVar.f1841c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            f9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, f9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        f9Var2.g(21);
        f9Var2.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21167c8, meVar.f1840b));
        this.f1655n = new h11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f1647c.d(this.f1645a, false);
        int i10 = this.f1645a;
        le leVar = this.f1663w;
        if (i10 >= 0 && i10 < leVar.d.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (leVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, leVar.f1791n);
        float dp = ((leVar.f1791n - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f1646b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f1658q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f1657p);
            if (e7 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f1652k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.f9 f9Var = this.f1654m;
                f9Var.setBounds(dp3, dp4, dp5, dp6);
                f9Var.f26253y = (int) (e * f11 * e7);
                f9Var.draw(canvas);
                f9Var.f26253y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f1656o.f26843c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f1656o.f26843c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, leVar.f1790f);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f1648f != null) {
            Matrix matrix = this.f1649g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f1648f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        h11 h11Var = this.f1656o;
        h11Var.c(dp - (h11Var.f26843c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        h11 h11Var2 = this.f1655n;
        h11Var2.f26853p = width - AndroidUtilities.dp(4.0f);
        h11Var2.c(dp - (this.f1655n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, leVar.v.f1840b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f1661t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1660s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1661t.setAlpha(i13);
            this.f1660s.setAlpha(i13);
            this.f1661t.draw(canvas);
            this.f1660s.draw(canvas);
            h11 h11Var3 = this.f1662u;
            h11Var3.c(dp - (h11Var3.f26843c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        le leVar = this.f1663w;
        me meVar = leVar.v;
        if (this.f1650i) {
            if (this.f1657p) {
                j11 = 2666000;
            } else if (this.f1651j == UserConfig.getInstance(meVar.f1841c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f1651j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1657p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(meVar.f1841c).getClientUserId();
                }
                this.f1651j = j10;
                if (this.f1657p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f1652k;
                    org.telegram.ui.Components.f9 f9Var = this.f1653l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(meVar.f1841c).getUser(Long.valueOf(this.f1651j));
                        str = UserObject.getForcedFirstName(user);
                        f9Var.r(user);
                        imageReceiver.setForUserOrChat(user, f9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(meVar.f1841c).getChat(Long.valueOf(-this.f1651j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        f9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, f9Var);
                    }
                    str2 = str;
                }
                this.f1655n = new h11(str2, 12.0f, null);
                leVar.invalidate();
            }
        }
    }
}
