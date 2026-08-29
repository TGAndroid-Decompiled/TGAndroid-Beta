package fh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.e9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j f6773a;
    public final s1 f6774b;
    public final ImageReceiver f6775c;
    public final long d;
    public b f6776e;
    public b f6777f;
    public Paint f6778g;
    public final StaticLayout h;
    public float f6779i;
    public float f6780j;
    public ValueAnimator f6781k;
    public float f6782l;
    public boolean f6783m;
    public ValueAnimator f6784n;
    public float f6785o;
    public boolean f6786p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f9;
        CharSequence ellipsize;
        e9 e9Var = new e9((c6) null);
        int i10 = UserConfig.selectedAccount;
        this.f6782l = 1.0f;
        this.f6783m = true;
        this.f6785o = 0.0f;
        this.f6786p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.f6816a);
        this.f6775c = imageReceiver2;
        this.f6773a = jVar;
        s1 s1Var = jVar.f6826y;
        this.f6774b = s1Var;
        this.d = j10;
        e9Var.f27964p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            e9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                e9Var.g(1);
                e9Var.f27964p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, e9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f6812a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
                Paint M2 = s1Var.M2("paintChatActionText");
                if (str2 == null && M2 != null) {
                    int dp = AndroidUtilities.dp(48);
                    TextPaint textPaint = new TextPaint(M2);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.displaySize.x - dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            imageReceiver.setForUserOrChat(user, e9Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            str = chat != null ? chat.title : "";
            e9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, e9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f6812a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
        Paint M22 = s1Var.M2("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f9, float f10, float f11, float f12) {
        float f13 = f10 / 2.0f;
        float f14 = f9 - f13;
        float f15 = f9 + f13;
        float f16 = f12 - f11;
        if (f10 > f16) {
            float f17 = (f11 + f12) / 2.0f;
            float f18 = f10 - f16;
            float max = Math.max(0.0f, f11 - f14);
            float max2 = Math.max(0.0f, f15 - f12);
            float f19 = max + max2;
            if (f19 < 0.1f) {
                return f17;
            }
            return u3.c.c(f18, 2.0f, (max - max2) / f19, f17);
        } else if (f14 < f11) {
            return f11 + f13;
        } else {
            if (f15 > f12) {
                return f12 - f13;
            }
            return f9;
        }
    }

    public final void a(Canvas canvas, float f9, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f9 - f11, f10 - f11);
        int i10 = i.f6812a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        ImageReceiver imageReceiver = this.f6775c;
        imageReceiver.setAlpha(((this.f6782l * 0.25f) + 0.75f) * f12);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f6784n) {
            this.f6785o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f6781k) {
            this.f6782l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f6773a.invalidateSelf();
    }
}
