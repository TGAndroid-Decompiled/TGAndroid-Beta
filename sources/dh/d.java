package dh;

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
import org.telegram.ui.Components.y8;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    public final j f4978a;

    public final s1 f4979b;

    public final ImageReceiver f4980c;
    public final long d;

    public b f4981e;

    public b f4982f;

    public Paint f4983g;
    public final StaticLayout h;

    public float f4984i;

    public float f4985j;

    public ValueAnimator f4986k;

    public float f4987l;

    public boolean f4988m;

    public ValueAnimator f4989n;

    public float f4990o;

    public boolean f4991p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String name;
        String string;
        y8 y8Var = new y8((c6) null);
        int i10 = UserConfig.selectedAccount;
        this.f4987l = 1.0f;
        this.f4988m = true;
        this.f4990o = 0.0f;
        this.f4991p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.f5021a);
        this.f4980c = imageReceiver2;
        this.f4978a = jVar;
        s1 s1Var = jVar.f5031y;
        this.f4979b = s1Var;
        this.d = j10;
        y8Var.f34858p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            y8Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                string = LocaleController.getString(R.string.SavedMessages);
                y8Var.g(1);
                y8Var.f34858p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, y8Var, 0L, null, user, 0);
            } else {
                imageReceiver = imageReceiver2;
                name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                imageReceiver.setForUserOrChat(user, y8Var);
            }
            float f10 = i.f5017a;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(f10 / 2.0f));
            imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            Paint paintL2 = s1Var.L2("paintChatActionText");
            if (string != null || paintL2 == null) {
            }
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(48);
            TextPaint textPaint = new TextPaint(paintL2);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(string, textPaint, iDp, TextUtils.TruncateAt.END);
            this.h = new StaticLayout(charSequenceEllipsize, textPaint, (int) Math.ceil(textPaint.measureText(charSequenceEllipsize, 0, charSequenceEllipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        imageReceiver = imageReceiver2;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        name = chat != null ? chat.title : "";
        y8Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat, y8Var);
        string = name;
        float f11 = i.f5017a;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f11 / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
        Paint paintL3 = s1Var.L2("paintChatActionText");
        if (string != null) {
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14 = f11 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f10 + f14;
        float f17 = f13 - f12;
        if (f11 <= f17) {
            if (f15 < f12) {
                return f12 + f14;
            }
            return f16 > f13 ? f13 - f14 : f10;
        }
        float f18 = (f12 + f13) / 2.0f;
        float f19 = f11 - f17;
        float fMax = Math.max(0.0f, f12 - f15);
        float fMax2 = Math.max(0.0f, f16 - f13);
        float f20 = fMax + fMax2;
        return f20 < 0.1f ? f18 : s3.c.c(f19, 2.0f, (fMax - fMax2) / f20, f18);
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i10 = i.f5017a;
        float f14 = 21;
        canvas.scale(f12 / AndroidUtilities.dp(f14), f12 / AndroidUtilities.dp(f14));
        float f15 = ((this.f4987l * 0.25f) + 0.75f) * f13;
        ImageReceiver imageReceiver = this.f4980c;
        imageReceiver.setAlpha(f15);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f4989n) {
            this.f4990o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f4986k) {
            this.f4987l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f4978a.invalidateSelf();
    }
}
