package lh;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public final class cb {
    public int f12253a;
    public final RectF f12254b;
    public final org.telegram.ui.Components.z5 f12255c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public LinearGradient f12256f;
    public final Matrix f12257g;
    public final Paint h;
    public final boolean f12258i;
    public long f12259j;
    public final ImageReceiver f12260k;
    public final org.telegram.ui.Components.z8 f12261l;
    public final org.telegram.ui.Components.z8 f12262m;
    public k01 f12263n;
    public k01 f12264o;
    public boolean f12265p;
    public final rc f12266q;
    public int f12267r;
    public Drawable f12268s;
    public Drawable f12269t;
    public k01 f12270u;
    public int v;
    public final db f12271w;

    public cb(db dbVar, boolean z4, long j10) {
        String str;
        eb ebVar = dbVar.f12311r;
        this.f12271w = dbVar;
        this.f12254b = new RectF();
        mr mrVar = mr.h;
        this.f12255c = new org.telegram.ui.Components.z5(dbVar, 0L, 600L, mrVar);
        this.d = new org.telegram.ui.Components.z5(dbVar, 0L, 200L, mrVar);
        this.e = new org.telegram.ui.Components.z5(dbVar, 0L, 350L, mrVar);
        this.f12256f = null;
        this.f12257g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(dbVar);
        this.f12260k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.f12261l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.f12262m = z8Var2;
        this.f12266q = new rc(dbVar);
        this.f12258i = z4;
        this.f12259j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(ebVar.f12365c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(ebVar.f12365c).getChat(Long.valueOf(-j10));
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
        z8Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19865c8, ebVar.f12364b));
        this.f12263n = new k01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4 = false;
        float d = this.f12255c.d(this.f12253a, false);
        int i10 = this.f12253a;
        db dbVar = this.f12271w;
        if (i10 >= 0 && i10 < dbVar.f12307b.size()) {
            z4 = true;
        }
        float e = this.d.e(z4);
        canvas.save();
        float width = (dbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, dbVar.f12309f);
        float dp = ((dbVar.f12309f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.f12254b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.f12266q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e6 = this.e.e(this.f12265p);
            if (e6 < 1.0f) {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.f12260k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (e6 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.z8 z8Var = this.f12262m;
                z8Var.setBounds(dp3, dp4, dp5, dp6);
                z8Var.f31301y = (int) (e * f10 * e6);
                z8Var.draw(canvas);
                z8Var.f31301y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f12264o.f26124c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f12), (this.f12264o.f26124c / f12) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, dbVar.d);
        int i13 = (int) (e * f10);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f12256f != null) {
            Matrix matrix = this.f12257g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f12256f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        k01 k01Var = this.f12264o;
        k01Var.c(dp - (k01Var.f26124c / f12), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        k01 k01Var2 = this.f12263n;
        k01Var2.f26134p = width - AndroidUtilities.dp(4.0f);
        k01Var2.c(dp - (this.f12263n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, dbVar.f12311r.f12364b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f12269t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f12268s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f12269t.setAlpha(i13);
            this.f12268s.setAlpha(i13);
            this.f12269t.draw(canvas);
            this.f12268s.draw(canvas);
            k01 k01Var3 = this.f12270u;
            k01Var3.c(dp - (k01Var3.f26124c / f12), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z4;
        String str;
        String str2;
        db dbVar = this.f12271w;
        eb ebVar = dbVar.f12311r;
        if (this.f12258i) {
            if (this.f12265p) {
                j11 = 2666000;
            } else if (this.f12259j == UserConfig.getInstance(ebVar.f12365c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f12259j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f12265p = z4;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(ebVar.f12365c).getClientUserId();
                }
                this.f12259j = j10;
                if (this.f12265p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f12260k;
                    org.telegram.ui.Components.z8 z8Var = this.f12261l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(ebVar.f12365c).getUser(Long.valueOf(this.f12259j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(ebVar.f12365c).getChat(Long.valueOf(-this.f12259j));
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
                this.f12263n = new k01(str2, 12.0f, null);
                dbVar.invalidate();
            }
        }
    }
}
