package jh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class bb {
    public int f11823a;
    public final RectF f11824b;
    public final org.telegram.ui.Components.d6 f11825c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f11826e;
    public LinearGradient f11827f;
    public final Matrix f11828g;
    public final Paint h;
    public final boolean f11829i;
    public long f11830j;
    public final ImageReceiver f11831k;
    public final org.telegram.ui.Components.e9 f11832l;
    public final org.telegram.ui.Components.e9 f11833m;
    public zz0 f11834n;
    public zz0 f11835o;
    public boolean f11836p;
    public final uc f11837q;
    public int f11838r;
    public Drawable f11839s;
    public Drawable f11840t;
    public zz0 f11841u;
    public int v;
    public final cb f11842w;

    public bb(cb cbVar, boolean z10, long j10) {
        String str;
        db dbVar = cbVar.f11893r;
        this.f11842w = cbVar;
        this.f11824b = new RectF();
        jr jrVar = jr.h;
        this.f11825c = new org.telegram.ui.Components.d6(cbVar, 0L, 600L, jrVar);
        this.d = new org.telegram.ui.Components.d6(cbVar, 0L, 200L, jrVar);
        this.f11826e = new org.telegram.ui.Components.d6(cbVar, 0L, 350L, jrVar);
        this.f11827f = null;
        this.f11828g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(cbVar);
        this.f11831k = imageReceiver;
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f11832l = e9Var;
        org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f11833m = e9Var2;
        this.f11837q = new uc(cbVar);
        this.f11829i = z10;
        this.f11830j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(dbVar.f11974c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            e9Var.r(user);
            imageReceiver.setForUserOrChat(user, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(dbVar.f11974c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            e9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, e9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        e9Var2.g(21);
        e9Var2.h(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23046c8, dbVar.f11973b));
        this.f11834n = new zz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f11825c.d(this.f11823a, false);
        int i10 = this.f11823a;
        cb cbVar = this.f11842w;
        if (i10 >= 0 && i10 < cbVar.f11888b.size()) {
            z10 = true;
        }
        float e10 = this.d.e(z10);
        canvas.save();
        float width = (cbVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, cbVar.f11891f);
        float dp = ((cbVar.f11891f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f11824b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e10) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f11837q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e10 > 0.0f) {
            float e11 = this.f11826e.e(this.f11836p);
            if (e11 < 1.0f) {
                f9 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f11831k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f9 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e11 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                org.telegram.ui.Components.e9 e9Var = this.f11833m;
                e9Var.setBounds(dp3, dp4, dp5, dp6);
                e9Var.f27972y = (int) (e10 * f9 * e11);
                e9Var.draw(canvas);
                e9Var.f27972y = 255;
            }
        } else {
            f9 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f11835o.f35462c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f11835o.f35462c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, cbVar.d);
        int i13 = (int) (e10 * f9);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f11827f != null) {
            Matrix matrix = this.f11828g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f11827f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        zz0 zz0Var = this.f11835o;
        zz0Var.c(dp - (zz0Var.f35462c / f11), AndroidUtilities.dp(23.0f) + dp2, e10, -1, canvas);
        zz0 zz0Var2 = this.f11834n;
        zz0Var2.f35473p = width - AndroidUtilities.dp(4.0f);
        zz0Var2.c(dp - (this.f11834n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, cbVar.f11893r.f11973b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f11840t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f11839s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f11840t.setAlpha(i13);
            this.f11839s.setAlpha(i13);
            this.f11840t.draw(canvas);
            this.f11839s.draw(canvas);
            zz0 zz0Var3 = this.f11841u;
            zz0Var3.c(dp - (zz0Var3.f35462c / f11), dp2 - AndroidUtilities.dp(27.0f), e10, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        cb cbVar = this.f11842w;
        db dbVar = cbVar.f11893r;
        if (this.f11829i) {
            if (this.f11836p) {
                j11 = 2666000;
            } else if (this.f11830j == UserConfig.getInstance(dbVar.f11974c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f11830j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11836p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(dbVar.f11974c).getClientUserId();
                }
                this.f11830j = j10;
                if (this.f11836p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f11831k;
                    org.telegram.ui.Components.e9 e9Var = this.f11832l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(dbVar.f11974c).getUser(Long.valueOf(this.f11830j));
                        str = UserObject.getForcedFirstName(user);
                        e9Var.r(user);
                        imageReceiver.setForUserOrChat(user, e9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(dbVar.f11974c).getChat(Long.valueOf(-this.f11830j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        e9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, e9Var);
                    }
                    str2 = str;
                }
                this.f11834n = new zz0(str2, 12.0f, null);
                cbVar.invalidate();
            }
        }
    }
}
