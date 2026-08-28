package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
public final class hb {
    public int f8243a;
    public final RectF f8244b;
    public final org.telegram.ui.Components.y5 f8245c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 f8246e;
    public LinearGradient f8247f;
    public final Matrix f8248g;
    public final Paint h;
    public final boolean f8249i;
    public long f8250j;
    public final ImageReceiver f8251k;
    public final org.telegram.ui.Components.z8 f8252l;
    public final org.telegram.ui.Components.z8 f8253m;
    public nz0 f8254n;
    public nz0 f8255o;
    public boolean f8256p;
    public final pc f8257q;
    public int f8258r;
    public Drawable f8259s;
    public Drawable f8260t;
    public nz0 f8261u;
    public int v;
    public final ib f8262w;

    public hb(ib ibVar, boolean z10, long j10) {
        String str;
        jb jbVar = ibVar.f8317r;
        this.f8262w = ibVar;
        this.f8244b = new RectF();
        gr grVar = gr.h;
        this.f8245c = new org.telegram.ui.Components.y5(ibVar, 0L, 600L, grVar);
        this.d = new org.telegram.ui.Components.y5(ibVar, 0L, 200L, grVar);
        this.f8246e = new org.telegram.ui.Components.y5(ibVar, 0L, 350L, grVar);
        this.f8247f = null;
        this.f8248g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(ibVar);
        this.f8251k = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f8252l = z8Var;
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f8253m = z8Var2;
        this.f8257q = new pc(ibVar);
        this.f8249i = z10;
        this.f8250j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(jbVar.f8369c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(jbVar.f8369c).getChat(Long.valueOf(-j10));
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
        z8Var2.h(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22985c8, jbVar.f8368b));
        this.f8254n = new nz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10 = false;
        float d = this.f8245c.d(this.f8243a, false);
        int i9 = this.f8243a;
        ib ibVar = this.f8262w;
        if (i9 >= 0 && i9 < ibVar.f8312b.size()) {
            z10 = true;
        }
        float e10 = this.d.e(z10);
        canvas.save();
        float width = (ibVar.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, ibVar.f8315f);
        float dp = ((ibVar.f8315f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f13 = width / 2.0f;
        this.f8244b.set(dp - f13, dp2 - AndroidUtilities.dp(50.0f), f13 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f14 = (0.3f * e10) + 0.7f;
        canvas.scale(f14, f14, dp, dp2);
        float a2 = this.f8257q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e10 > 0.0f) {
            float e11 = this.f8246e.e(this.f8256p);
            if (e11 < 1.0f) {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
                ImageReceiver imageReceiver = this.f8251k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f10 = 255.0f;
                f11 = 40.0f;
                f12 = 2.0f;
            }
            if (e11 > 0.0f) {
                int i10 = (int) dp;
                int dp3 = i10 - (AndroidUtilities.dp(56.0f) / 2);
                int i11 = (int) dp2;
                int dp4 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i10;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                org.telegram.ui.Components.z8 z8Var = this.f8253m;
                z8Var.setBounds(dp3, dp4, dp5, dp6);
                z8Var.f35242y = (int) (e10 * f10 * e11);
                z8Var.draw(canvas);
                z8Var.f35242y = 255;
            }
        } else {
            f10 = 255.0f;
            f11 = 40.0f;
            f12 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f8255o.f31223c / f12)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f12), (this.f8255o.f31223c / f12) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f12) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, ibVar.d);
        int i12 = (int) (e10 * f10);
        Paint paint = this.h;
        paint.setAlpha(i12);
        if (this.f8247f != null) {
            Matrix matrix = this.f8248g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f8247f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f12, rectF.height() / f12, paint);
        nz0 nz0Var = this.f8255o;
        nz0Var.c(dp - (nz0Var.f31223c / f12), AndroidUtilities.dp(23.0f) + dp2, e10, -1, canvas);
        nz0 nz0Var2 = this.f8254n;
        nz0Var2.f31234p = width - AndroidUtilities.dp(4.0f);
        nz0Var2.c(dp - (this.f8254n.l() / f12), AndroidUtilities.dp(42.0f) + dp2, e10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, ibVar.f8317r.f8368b), canvas);
        if (this.v > 0) {
            int i13 = (int) dp;
            int i14 = (int) dp2;
            this.f8260t.setBounds(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i13, i14 - AndroidUtilities.dp(16.0f));
            this.f8259s.setBounds(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(f11), AndroidUtilities.dp(12.0f) + i13, i14 - AndroidUtilities.dp(16.0f));
            this.f8260t.setAlpha(i12);
            this.f8259s.setAlpha(i12);
            this.f8260t.draw(canvas);
            this.f8259s.draw(canvas);
            nz0 nz0Var3 = this.f8261u;
            nz0Var3.c(dp - (nz0Var3.f31223c / f12), dp2 - AndroidUtilities.dp(27.0f), e10, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        ib ibVar = this.f8262w;
        jb jbVar = ibVar.f8317r;
        if (this.f8249i) {
            if (this.f8256p) {
                j11 = 2666000;
            } else if (this.f8250j == UserConfig.getInstance(jbVar.f8369c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f8250j;
            }
            if (j11 != j10) {
                int i9 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f8256p = z10;
                if (j10 == 0 || i9 == 0) {
                    j10 = UserConfig.getInstance(jbVar.f8369c).getClientUserId();
                }
                this.f8250j = j10;
                if (this.f8256p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f8251k;
                    org.telegram.ui.Components.z8 z8Var = this.f8252l;
                    if (j10 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(jbVar.f8369c).getUser(Long.valueOf(this.f8250j));
                        str = UserObject.getForcedFirstName(user);
                        z8Var.r(user);
                        imageReceiver.setForUserOrChat(user, z8Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(jbVar.f8369c).getChat(Long.valueOf(-this.f8250j));
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
                this.f8254n = new nz0(str2, 12.0f, null);
                ibVar.invalidate();
            }
        }
    }
}
