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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class cb {
    public int f13856a;
    public final RectF f13857b;
    public final org.telegram.ui.Components.z5 f13858c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 f13859e;
    public LinearGradient f13860f;
    public final Matrix f13861g;
    public final Paint h;
    public final boolean f13862i;
    public long f13863j;
    public final ImageReceiver f13864k;
    public final org.telegram.ui.Components.z8 f13865l;
    public final org.telegram.ui.Components.z8 f13866m;
    public k01 f13867n;
    public k01 f13868o;
    public boolean f13869p;
    public final rc f13870q;
    public int f13871r;
    public Drawable f13872s;
    public Drawable f13873t;
    public k01 f13874u;
    public int v;
    public final db f13875w;

    public cb(db dbVar, boolean z4, long j10) {
        String str;
        eb ebVar = dbVar.f13926r;
        this.f13875w = dbVar;
        this.f13857b = new RectF();
        pr prVar = pr.h;
        this.f13858c = new org.telegram.ui.Components.z5(dbVar, 0L, 600L, prVar);
        this.d = new org.telegram.ui.Components.z5(dbVar, 0L, 200L, prVar);
        this.f13859e = new org.telegram.ui.Components.z5(dbVar, 0L, 350L, prVar);
        this.f13860f = null;
        this.f13861g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(dbVar);
        this.f13864k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f13865l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f13866m = z8Var2;
        this.f13870q = new rc(dbVar);
        this.f13862i = z4;
        this.f13863j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(ebVar.f13991c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(ebVar.f13991c).getChat(Long.valueOf(-j10));
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
        z8Var2.h(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21645c8, ebVar.f13990b));
        this.f13867n = new k01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4 = false;
        float d = this.f13858c.d(this.f13856a, false);
        int i10 = this.f13856a;
        db dbVar = this.f13875w;
        if (i10 >= 0 && i10 < dbVar.f13921b.size()) {
            z4 = true;
        }
        float e6 = this.d.e(z4);
        canvas.save();
        float width = (dbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, dbVar.f13924f);
        float dp = ((dbVar.f13924f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.f13857b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e6) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.f13870q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e6 > 0.0f) {
            float e10 = this.f13859e.e(this.f13869p);
            if (e10 < 1.0f) {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.f13864k;
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
                org.telegram.ui.Components.z8 z8Var = this.f13866m;
                z8Var.setBounds(dp3, dp4, dp5, dp6);
                z8Var.f33855y = (int) (e6 * f10 * e10);
                z8Var.draw(canvas);
                z8Var.f33855y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f13868o.f28227c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f12), (this.f13868o.f28227c / f12) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, dbVar.d);
        int i13 = (int) (e6 * f10);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f13860f != null) {
            Matrix matrix = this.f13861g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f13860f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        k01 k01Var = this.f13868o;
        k01Var.c(dp - (k01Var.f28227c / f12), AndroidUtilities.dp(23.0f) + dp2, e6, -1, canvas);
        k01 k01Var2 = this.f13867n;
        k01Var2.f28238p = width - AndroidUtilities.dp(4.0f);
        k01Var2.c(dp - (this.f13867n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e6, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, dbVar.f13926r.f13990b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f13873t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f13872s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f13873t.setAlpha(i13);
            this.f13872s.setAlpha(i13);
            this.f13873t.draw(canvas);
            this.f13872s.draw(canvas);
            k01 k01Var3 = this.f13874u;
            k01Var3.c(dp - (k01Var3.f28227c / f12), dp2 - AndroidUtilities.dp(27.0f), e6, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z4;
        String str;
        String str2;
        db dbVar = this.f13875w;
        eb ebVar = dbVar.f13926r;
        if (this.f13862i) {
            if (this.f13869p) {
                j11 = 2666000;
            } else if (this.f13863j == UserConfig.getInstance(ebVar.f13991c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f13863j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13869p = z4;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(ebVar.f13991c).getClientUserId();
                }
                this.f13863j = j10;
                if (this.f13869p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f13864k;
                    org.telegram.ui.Components.z8 z8Var = this.f13865l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(ebVar.f13991c).getUser(Long.valueOf(this.f13863j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(ebVar.f13991c).getChat(Long.valueOf(-this.f13863j));
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
                this.f13867n = new k01(str2, 12.0f, null);
                dbVar.invalidate();
            }
        }
    }
}
