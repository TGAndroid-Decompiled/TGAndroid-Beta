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
import org.telegram.ui.Components.f11;
public final class je {
    public int f1597a;
    public final RectF f1598b;
    public final org.telegram.ui.Components.f6 f1599c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public LinearGradient f1600f;
    public final Matrix f1601g;
    public final Paint h;
    public final boolean f1602i;
    public long f1603j;
    public final ImageReceiver f1604k;
    public final org.telegram.ui.Components.h9 f1605l;
    public final org.telegram.ui.Components.h9 f1606m;
    public f11 f1607n;
    public f11 f1608o;
    public boolean f1609p;
    public final org.telegram.ui.Components.yc f1610q;
    public int f1611r;
    public Drawable f1612s;
    public Drawable f1613t;
    public f11 f1614u;
    public int v;
    public final ke f1615w;

    public je(ke keVar, boolean z10, long j10) {
        String str;
        le leVar = keVar.f1671r;
        this.f1615w = keVar;
        this.f1598b = new RectF();
        bs bsVar = bs.h;
        this.f1599c = new org.telegram.ui.Components.f6(keVar, 0L, 600L, bsVar);
        this.d = new org.telegram.ui.Components.f6(keVar, 0L, 200L, bsVar);
        this.e = new org.telegram.ui.Components.f6(keVar, 0L, 350L, bsVar);
        this.f1600f = null;
        this.f1601g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(keVar);
        this.f1604k = imageReceiver;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f1605l = h9Var;
        org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f1606m = h9Var2;
        this.f1610q = new org.telegram.ui.Components.yc(keVar);
        this.f1602i = z10;
        this.f1603j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(leVar.f1791c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(leVar.f1791c).getChat(Long.valueOf(-j10));
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
        h9Var2.h(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20977c8, leVar.f1790b));
        this.f1607n = new f11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f1599c.d(this.f1597a, false);
        int i10 = this.f1597a;
        ke keVar = this.f1615w;
        if (i10 >= 0 && i10 < keVar.f1667b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (keVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, keVar.f1669f);
        float dp = ((keVar.f1669f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f1598b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f1610q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f1609p);
            if (e7 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f1604k;
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
                org.telegram.ui.Components.h9 h9Var = this.f1606m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f26834y = (int) (e * f11 * e7);
                h9Var.draw(canvas);
                h9Var.f26834y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f1608o.f26025c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f1608o.f26025c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, keVar.d);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f1600f != null) {
            Matrix matrix = this.f1601g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f1600f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        f11 f11Var = this.f1608o;
        f11Var.c(dp - (f11Var.f26025c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        f11 f11Var2 = this.f1607n;
        f11Var2.f26035p = width - AndroidUtilities.dp(4.0f);
        f11Var2.c(dp - (this.f1607n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, keVar.f1671r.f1790b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f1613t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1612s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f1613t.setAlpha(i13);
            this.f1612s.setAlpha(i13);
            this.f1613t.draw(canvas);
            this.f1612s.draw(canvas);
            f11 f11Var3 = this.f1614u;
            f11Var3.c(dp - (f11Var3.f26025c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        ke keVar = this.f1615w;
        le leVar = keVar.f1671r;
        if (this.f1602i) {
            if (this.f1609p) {
                j11 = 2666000;
            } else if (this.f1603j == UserConfig.getInstance(leVar.f1791c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f1603j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1609p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(leVar.f1791c).getClientUserId();
                }
                this.f1603j = j10;
                if (this.f1609p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f1604k;
                    org.telegram.ui.Components.h9 h9Var = this.f1605l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(leVar.f1791c).getUser(Long.valueOf(this.f1603j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(leVar.f1791c).getChat(Long.valueOf(-this.f1603j));
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
                this.f1607n = new f11(str2, 12.0f, null);
                keVar.invalidate();
            }
        }
    }
}
