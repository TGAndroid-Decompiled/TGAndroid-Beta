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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
public final class ie {
    public int f1534a;
    public final RectF f1535b;
    public final org.telegram.ui.Components.f6 f1536c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public LinearGradient f1537f;
    public final Matrix f1538g;
    public final Paint h;
    public final boolean f1539i;
    public long f1540j;
    public final ImageReceiver f1541k;
    public final org.telegram.ui.Components.h9 f1542l;
    public final org.telegram.ui.Components.h9 f1543m;
    public d11 f1544n;
    public d11 f1545o;
    public boolean f1546p;
    public final org.telegram.ui.Components.yc f1547q;
    public int f1548r;
    public Drawable f1549s;
    public Drawable f1550t;
    public d11 f1551u;
    public int v;
    public final je f1552w;

    public ie(je jeVar, boolean z10, long j10) {
        String str;
        ke keVar = jeVar.f1614r;
        this.f1552w = jeVar;
        this.f1535b = new RectF();
        bs bsVar = bs.h;
        this.f1536c = new org.telegram.ui.Components.f6(jeVar, 0L, 600L, bsVar);
        this.d = new org.telegram.ui.Components.f6(jeVar, 0L, 200L, bsVar);
        this.e = new org.telegram.ui.Components.f6(jeVar, 0L, 350L, bsVar);
        this.f1537f = null;
        this.f1538g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(jeVar);
        this.f1541k = imageReceiver;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f1542l = h9Var;
        org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f1543m = h9Var2;
        this.f1547q = new org.telegram.ui.Components.yc(jeVar);
        this.f1539i = z10;
        this.f1540j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(keVar.f1738c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(keVar.f1738c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            h9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, h9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        h9Var2.g(21);
        h9Var2.h(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20969c8, keVar.f1737b));
        this.f1544n = new d11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f1536c.d(this.f1534a, false);
        int i10 = this.f1534a;
        je jeVar = this.f1552w;
        if (i10 >= 0 && i10 < jeVar.f1610b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (jeVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, jeVar.f1612f);
        float dp = ((jeVar.f1612f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f1535b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f1547q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f1546p);
            if (e7 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f1541k;
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
                org.telegram.ui.Components.h9 h9Var = this.f1543m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f26830y = (int) (e * f11 * e7);
                h9Var.draw(canvas);
                h9Var.f26830y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f1545o.f25437c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f1545o.f25437c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, jeVar.d);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f1537f != null) {
            Matrix matrix = this.f1538g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f1537f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        d11 d11Var = this.f1545o;
        d11Var.c(dp - (d11Var.f25437c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        d11 d11Var2 = this.f1544n;
        d11Var2.f25447p = width - AndroidUtilities.dp(4.0f);
        d11Var2.c(dp - (this.f1544n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, jeVar.f1614r.f1737b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f1550t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1549s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1550t.setAlpha(i13);
            this.f1549s.setAlpha(i13);
            this.f1550t.draw(canvas);
            this.f1549s.draw(canvas);
            d11 d11Var3 = this.f1551u;
            d11Var3.c(dp - (d11Var3.f25437c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        je jeVar = this.f1552w;
        ke keVar = jeVar.f1614r;
        if (this.f1539i) {
            if (this.f1546p) {
                j11 = 2666000;
            } else if (this.f1540j == UserConfig.getInstance(keVar.f1738c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f1540j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1546p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(keVar.f1738c).getClientUserId();
                }
                this.f1540j = j10;
                if (this.f1546p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f1541k;
                    org.telegram.ui.Components.h9 h9Var = this.f1542l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(keVar.f1738c).getUser(Long.valueOf(this.f1540j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(keVar.f1738c).getChat(Long.valueOf(-this.f1540j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        h9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, h9Var);
                    }
                    str2 = str;
                }
                this.f1544n = new d11(str2, 12.0f, null);
                jeVar.invalidate();
            }
        }
    }
}
