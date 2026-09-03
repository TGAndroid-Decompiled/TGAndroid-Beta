package hh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.z8;
import vh.w2;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j f7099a;
    public final s1 f7100b;
    public final ImageReceiver f7101c;
    public final long d;
    public b e;
    public b f7102f;
    public Paint f7103g;
    public final StaticLayout h;
    public float f7104i;
    public float f7105j;
    public ValueAnimator f7106k;
    public float f7107l;
    public boolean f7108m;
    public ValueAnimator f7109n;
    public float f7110o;
    public boolean f7111p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        z8 z8Var = new z8((f6) null);
        int i10 = UserConfig.selectedAccount;
        this.f7107l = 1.0f;
        this.f7108m = true;
        this.f7110o = 0.0f;
        this.f7111p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.f7141a);
        this.f7101c = imageReceiver2;
        this.f7099a = jVar;
        s1 s1Var = jVar.f7150y;
        this.f7100b = s1Var;
        this.d = j10;
        z8Var.f31293p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            z8Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                z8Var.g(1);
                z8Var.f31293p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, z8Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f7136a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
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
            imageReceiver.setForUserOrChat(user, z8Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            str = chat != null ? chat.title : "";
            z8Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f7136a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        Paint M22 = s1Var.M2("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14 = f11 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f10 + f14;
        float f17 = f13 - f12;
        if (f11 > f17) {
            float f18 = (f12 + f13) / 2.0f;
            float f19 = f11 - f17;
            float max = Math.max(0.0f, f12 - f15);
            float max2 = Math.max(0.0f, f16 - f13);
            float f20 = max + max2;
            if (f20 < 0.1f) {
                return f18;
            }
            return w2.c(f19, 2.0f, (max - max2) / f20, f18);
        } else if (f15 < f12) {
            return f12 + f14;
        } else {
            if (f16 > f13) {
                return f13 - f14;
            }
            return f10;
        }
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i10 = i.f7136a;
        float f14 = 21;
        canvas.scale(f12 / AndroidUtilities.dp(f14), f12 / AndroidUtilities.dp(f14));
        ImageReceiver imageReceiver = this.f7101c;
        imageReceiver.setAlpha(((this.f7107l * 0.25f) + 0.75f) * f13);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f7109n) {
            this.f7110o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f7106k) {
            this.f7107l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f7099a.invalidateSelf();
    }
}
