package hh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;

public final class hb {

    public int f9407a;

    public final RectF f9408b;

    public final org.telegram.ui.Components.y5 f9409c;
    public final org.telegram.ui.Components.y5 d;

    public final org.telegram.ui.Components.y5 f9410e;

    public LinearGradient f9411f;

    public final Matrix f9412g;
    public final Paint h;

    public final boolean f9413i;

    public long f9414j;

    public final ImageReceiver f9415k;

    public final org.telegram.ui.Components.y8 f9416l;

    public final org.telegram.ui.Components.y8 f9417m;

    public pz0 f9418n;

    public pz0 f9419o;

    public boolean f9420p;

    public final nc f9421q;

    public int f9422r;

    public Drawable f9423s;

    public Drawable f9424t;

    public pz0 f9425u;
    public int v;

    public final ib f9426w;

    public hb(ib ibVar, boolean z10, long j10) {
        String forcedFirstName;
        jb jbVar = ibVar.f9503r;
        this.f9426w = ibVar;
        this.f9408b = new RectF();
        er erVar = er.h;
        this.f9409c = new org.telegram.ui.Components.y5(ibVar, 0L, 600L, erVar);
        this.d = new org.telegram.ui.Components.y5(ibVar, 0L, 200L, erVar);
        this.f9410e = new org.telegram.ui.Components.y5(ibVar, 0L, 350L, erVar);
        this.f9411f = null;
        this.f9412g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(ibVar);
        this.f9415k = imageReceiver;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f9416l = y8Var;
        org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f9417m = y8Var2;
        this.f9421q = new nc(ibVar);
        this.f9413i = z10;
        this.f9414j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(jbVar.f9557c).getUser(Long.valueOf(j10));
            forcedFirstName = UserObject.getForcedFirstName(user);
            y8Var.r(user);
            imageReceiver.setForUserOrChat(user, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(jbVar.f9557c).getChat(Long.valueOf(-j10));
            forcedFirstName = chat == null ? "" : chat.title;
            y8Var.q(chat);
            imageReceiver.setForUserOrChat(chat, y8Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        y8Var2.g(21);
        y8Var2.h(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23038c8, jbVar.f9556b));
        this.f9418n = new pz0(forcedFirstName, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float fD = this.f9409c.d(this.f9407a, false);
        int i10 = this.f9407a;
        ib ibVar = this.f9426w;
        if (i10 >= 0 && i10 < ibVar.f9498b.size()) {
            z10 = true;
        }
        float fE = this.d.e(z10);
        canvas.save();
        float width = (ibVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, ibVar.f9501f);
        float fDp = ((ibVar.f9501f - (fD + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float fDp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.f9408b.set(fDp - f13, fDp2 - AndroidUtilities.dp(50.0f), f13 + fDp, AndroidUtilities.dp(50.0f) + fDp2);
        float f14 = (0.3f * fE) + 0.7f;
        canvas.scale(f14, f14, fDp, fDp2);
        float fA = this.f9421q.a(0.04f);
        canvas.scale(fA, fA, fDp, fDp2);
        if (fE > 0.0f) {
            float fE2 = this.f9410e.e(this.f9420p);
            if (fE2 < 1.0f) {
                float fDp3 = fDp - (AndroidUtilities.dp(56.0f) / 2.0f);
                float fDp4 = fDp2 - (AndroidUtilities.dp(56.0f) / 2.0f);
                f10 = 255.0f;
                float fDp5 = AndroidUtilities.dp(56.0f);
                f11 = 40.0f;
                float fDp6 = AndroidUtilities.dp(56.0f);
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.f9415k;
                imageReceiver.setImageCoords(fDp3, fDp4, fDp5, fDp6);
                imageReceiver.setAlpha(fE);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (fE2 > 0.0f) {
                int i11 = (int) fDp;
                int iDp = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) fDp2;
                int iDp2 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int iDp3 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int iDp4 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.y8 y8Var = this.f9417m;
                y8Var.setBounds(iDp, iDp2, iDp3, iDp4);
                y8Var.f34866y = (int) (fE * f10 * fE2);
                y8Var.draw(canvas);
                y8Var.f34866y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((fDp - (this.f9419o.f31697c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + fDp2) - (AndroidUtilities.dp(16.0f) / f12), (this.f9419o.f31697c / f12) + fDp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + fDp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, ibVar.d);
        int i13 = (int) (fE * f10);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f9411f != null) {
            Matrix matrix = this.f9412g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f9411f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        pz0 pz0Var = this.f9419o;
        pz0Var.c(fDp - (pz0Var.f31697c / f12), AndroidUtilities.dp(23.0f) + fDp2, fE, -1, canvas);
        pz0 pz0Var2 = this.f9418n;
        pz0Var2.f31708p = width - AndroidUtilities.dp(4.0f);
        pz0Var2.c(fDp - (this.f9418n.l() / f12), AndroidUtilities.dp(42.0f) + fDp2, fE, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, ibVar.f9503r.f9556b), canvas);
        if (this.v > 0) {
            int i14 = (int) fDp;
            int i15 = (int) fDp2;
            this.f9424t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f9423s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f9424t.setAlpha(i13);
            this.f9423s.setAlpha(i13);
            this.f9424t.draw(canvas);
            this.f9423s.draw(canvas);
            pz0 pz0Var3 = this.f9425u;
            pz0Var3.c(fDp - (pz0Var3.f31697c / f12), fDp2 - AndroidUtilities.dp(27.0f), fE, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        String forcedFirstName;
        String string;
        ib ibVar = this.f9426w;
        jb jbVar = ibVar.f9503r;
        if (this.f9413i) {
            if (this.f9420p) {
                j11 = 2666000;
            } else {
                j11 = this.f9414j == UserConfig.getInstance(jbVar.f9557c).getClientUserId() ? 0L : this.f9414j;
            }
            if (j11 != j10) {
                this.f9420p = j10 == 2666000;
                if (j10 == 0 || j10 == 2666000) {
                    j10 = UserConfig.getInstance(jbVar.f9557c).getClientUserId();
                }
                this.f9414j = j10;
                if (this.f9420p) {
                    string = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f9415k;
                    org.telegram.ui.Components.y8 y8Var = this.f9416l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(jbVar.f9557c).getUser(Long.valueOf(this.f9414j));
                        forcedFirstName = UserObject.getForcedFirstName(user);
                        y8Var.r(user);
                        imageReceiver.setForUserOrChat(user, y8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(jbVar.f9557c).getChat(Long.valueOf(-this.f9414j));
                        forcedFirstName = chat == null ? "" : chat.title;
                        y8Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, y8Var);
                    }
                    string = forcedFirstName;
                }
                this.f9418n = new pz0(string, 12.0f, null);
                ibVar.invalidate();
            }
        }
    }
}
