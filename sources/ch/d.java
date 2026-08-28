package ch;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.z8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j f2434a;
    public final t1 f2435b;
    public final ImageReceiver f2436c;
    public final long d;
    public b f2437e;
    public b f2438f;
    public Paint f2439g;
    public final StaticLayout h;
    public float f2440i;
    public float f2441j;
    public ValueAnimator f2442k;
    public float f2443l;
    public boolean f2444m;
    public ValueAnimator f2445n;
    public float f2446o;
    public boolean f2447p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        z8 z8Var = new z8((b6) null);
        int i9 = UserConfig.selectedAccount;
        this.f2443l = 1.0f;
        this.f2444m = true;
        this.f2446o = 0.0f;
        this.f2447p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.f2477a);
        this.f2436c = imageReceiver2;
        this.f2434a = jVar;
        t1 t1Var = jVar.f2487y;
        this.f2435b = t1Var;
        this.d = j10;
        z8Var.f35234p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            z8Var.m(i9, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                z8Var.g(1);
                z8Var.f35234p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, z8Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f2473a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                Paint M2 = t1Var.M2("paintChatActionText");
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
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            str = chat != null ? chat.title : "";
            z8Var.k(i9, chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(i.f2473a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        Paint M22 = t1Var.M2("paintChatActionText");
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
            return j2.b(f19, 2.0f, (max - max2) / f20, f18);
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
        int i9 = i.f2473a;
        float f14 = 21;
        canvas.scale(f12 / AndroidUtilities.dp(f14), f12 / AndroidUtilities.dp(f14));
        ImageReceiver imageReceiver = this.f2436c;
        imageReceiver.setAlpha(((this.f2443l * 0.25f) + 0.75f) * f13);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f2445n) {
            this.f2446o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f2442k) {
            this.f2443l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f2434a.invalidateSelf();
    }
}
