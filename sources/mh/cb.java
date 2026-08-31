package mh;

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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class cb {
    public int f13854a;
    public final RectF f13855b;
    public final org.telegram.ui.Components.z5 f13856c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 f13857e;
    public LinearGradient f13858f;
    public final Matrix f13859g;
    public final Paint h;
    public final boolean f13860i;
    public long f13861j;
    public final ImageReceiver f13862k;
    public final org.telegram.ui.Components.z8 f13863l;
    public final org.telegram.ui.Components.z8 f13864m;
    public l01 f13865n;
    public l01 f13866o;
    public boolean f13867p;
    public final rc f13868q;
    public int f13869r;
    public Drawable f13870s;
    public Drawable f13871t;
    public l01 f13872u;
    public int v;
    public final db f13873w;

    public cb(db dbVar, boolean z4, long j10) {
        String str;
        eb ebVar = dbVar.f13924r;
        this.f13873w = dbVar;
        this.f13855b = new RectF();
        pr prVar = pr.h;
        this.f13856c = new org.telegram.ui.Components.z5(dbVar, 0L, 600L, prVar);
        this.d = new org.telegram.ui.Components.z5(dbVar, 0L, 200L, prVar);
        this.f13857e = new org.telegram.ui.Components.z5(dbVar, 0L, 350L, prVar);
        this.f13858f = null;
        this.f13859g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(dbVar);
        this.f13862k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f13863l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f13864m = z8Var2;
        this.f13868q = new rc(dbVar);
        this.f13860i = z4;
        this.f13861j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(ebVar.f13989c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(ebVar.f13989c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            z8Var.q(chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        z8Var2.g(21);
        z8Var2.h(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21643c8, ebVar.f13988b));
        this.f13865n = new l01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4 = false;
        float d = this.f13856c.d(this.f13854a, false);
        int i10 = this.f13854a;
        db dbVar = this.f13873w;
        if (i10 >= 0 && i10 < dbVar.f13919b.size()) {
            z4 = true;
        }
        float e6 = this.d.e(z4);
        canvas.save();
        float width = (dbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, dbVar.f13922f);
        float dp = ((dbVar.f13922f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.f13855b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e6) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.f13868q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e6 > 0.0f) {
            float e10 = this.f13857e.e(this.f13867p);
            if (e10 < 1.0f) {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.f13862k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e6);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.z8 z8Var = this.f13864m;
                z8Var.setBounds(dp3, dp4, dp5, dp6);
                z8Var.f33811y = (int) (e6 * f10 * e10);
                z8Var.draw(canvas);
                z8Var.f33811y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f13866o.f28521c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f12), (this.f13866o.f28521c / f12) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, dbVar.d);
        int i13 = (int) (e6 * f10);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f13858f != null) {
            Matrix matrix = this.f13859g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f13858f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        l01 l01Var = this.f13866o;
        l01Var.c(dp - (l01Var.f28521c / f12), AndroidUtilities.dp(23.0f) + dp2, e6, -1, canvas);
        l01 l01Var2 = this.f13865n;
        l01Var2.f28532p = width - AndroidUtilities.dp(4.0f);
        l01Var2.c(dp - (this.f13865n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e6, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, dbVar.f13924r.f13988b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f13871t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f13870s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f13871t.setAlpha(i13);
            this.f13870s.setAlpha(i13);
            this.f13871t.draw(canvas);
            this.f13870s.draw(canvas);
            l01 l01Var3 = this.f13872u;
            l01Var3.c(dp - (l01Var3.f28521c / f12), dp2 - AndroidUtilities.dp(27.0f), e6, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z4;
        String str;
        String str2;
        db dbVar = this.f13873w;
        eb ebVar = dbVar.f13924r;
        if (this.f13860i) {
            if (this.f13867p) {
                j11 = 2666000;
            } else if (this.f13861j == UserConfig.getInstance(ebVar.f13989c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f13861j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13867p = z4;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(ebVar.f13989c).getClientUserId();
                }
                this.f13861j = j10;
                if (this.f13867p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f13862k;
                    org.telegram.ui.Components.z8 z8Var = this.f13863l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(ebVar.f13989c).getUser(Long.valueOf(this.f13861j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(ebVar.f13989c).getChat(Long.valueOf(-this.f13861j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        z8Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, z8Var);
                    }
                    str2 = str;
                }
                this.f13865n = new l01(str2, 12.0f, null);
                dbVar.invalidate();
            }
        }
    }
}
