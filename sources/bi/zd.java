package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r11;
public final class zd {
    public int f5868a;
    public final RectF f5869b;
    public final org.telegram.ui.Components.h6 f5870c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 e;
    public LinearGradient f5871f;
    public final Matrix f5872g;
    public final Paint h;
    public final boolean f5873i;
    public long f5874j;
    public final ImageReceiver f5875k;
    public final org.telegram.ui.Components.j9 f5876l;
    public final org.telegram.ui.Components.j9 f5877m;
    public r11 f5878n;
    public r11 f5879o;
    public boolean f5880p;
    public final org.telegram.ui.Components.xc f5881q;
    public int f5882r;
    public Drawable f5883s;
    public Drawable f5884t;
    public r11 f5885u;
    public int v;
    public final ae f5886w;

    public zd(ae aeVar, boolean z10, long j10) {
        String str;
        be beVar = aeVar.v;
        this.f5886w = aeVar;
        this.f5869b = new RectF();
        ds dsVar = ds.h;
        this.f5870c = new org.telegram.ui.Components.h6(aeVar, 0L, 600L, dsVar);
        this.d = new org.telegram.ui.Components.h6(aeVar, 0L, 200L, dsVar);
        this.e = new org.telegram.ui.Components.h6(aeVar, 0L, 350L, dsVar);
        this.f5871f = null;
        this.f5872g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(aeVar);
        this.f5875k = imageReceiver;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f5876l = j9Var;
        org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f5877m = j9Var2;
        this.f5881q = new org.telegram.ui.Components.xc(aeVar);
        this.f5873i = z10;
        this.f5874j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(beVar.f4400c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            imageReceiver.setForUserOrChat(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(beVar.f4400c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            j9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        j9Var2.g(21);
        j9Var2.h(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23340c8, beVar.f4399b));
        this.f5878n = new r11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f5870c.d(this.f5868a, false);
        int i10 = this.f5868a;
        ae aeVar = this.f5886w;
        if (i10 >= 0 && i10 < aeVar.d.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (aeVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, aeVar.f4297n);
        float dp = ((aeVar.f4297n - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f5869b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f5881q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e10 = this.e.e(this.f5880p);
            if (e10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f5875k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.j9 j9Var = this.f5877m;
                j9Var.setBounds(dp3, dp4, dp5, dp6);
                j9Var.f29566y = (int) (e * f11 * e10);
                j9Var.draw(canvas);
                j9Var.f29566y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f5879o.f32090c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f5879o.f32090c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, aeVar.f4296f);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f5871f != null) {
            Matrix matrix = this.f5872g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f5871f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        r11 r11Var = this.f5879o;
        r11Var.c(dp - (r11Var.f32090c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        r11 r11Var2 = this.f5878n;
        r11Var2.f32100p = width - AndroidUtilities.dp(4.0f);
        r11Var2.c(dp - (this.f5878n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, aeVar.v.f4399b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f5884t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f5883s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f5884t.setAlpha(i13);
            this.f5883s.setAlpha(i13);
            this.f5884t.draw(canvas);
            this.f5883s.draw(canvas);
            r11 r11Var3 = this.f5885u;
            r11Var3.c(dp - (r11Var3.f32090c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        ae aeVar = this.f5886w;
        be beVar = aeVar.v;
        if (this.f5873i) {
            if (this.f5880p) {
                j11 = 2666000;
            } else if (this.f5874j == UserConfig.getInstance(beVar.f4400c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f5874j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5880p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(beVar.f4400c).getClientUserId();
                }
                this.f5874j = j10;
                if (this.f5880p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f5875k;
                    org.telegram.ui.Components.j9 j9Var = this.f5876l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(beVar.f4400c).getUser(Long.valueOf(this.f5874j));
                        str = UserObject.getForcedFirstName(user);
                        j9Var.r(user);
                        imageReceiver.setForUserOrChat(user, j9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(beVar.f4400c).getChat(Long.valueOf(-this.f5874j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        j9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, j9Var);
                    }
                    str2 = str;
                }
                this.f5878n = new r11(str2, 12.0f, null);
                aeVar.invalidate();
            }
        }
    }
}
