package bi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class x7 extends FrameLayout {
    public final int f3916a;
    public int f3917b;
    public final w7 f3918c;
    public final FrameLayout d;
    public final zh.p6 e;
    public boolean f3919f;
    public boolean h;

    public x7(Activity activity, int i10, zh.b bVar) {
        super(activity);
        this.f3917b = 1;
        this.f3919f = false;
        this.h = false;
        this.f3916a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        w7 w7Var = new w7(this, getContext());
        this.f3918c = w7Var;
        zh.x2 x2Var = new zh.x2(getContext(), null);
        x2Var.f49036a.getAvatarDrawable().m(i10, currentUser);
        gg.i1 i1Var = x2Var.f49036a;
        i1Var.e(currentUser, i1Var.getAvatarDrawable());
        x2Var.f49037b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), x2Var.f49037b.getPaint().getFontMetricsInt(), false), false);
        x2Var.c(LocaleController.getString(R.string.RightNow), false);
        w7Var.addView(x2Var, w7.a6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w7Var.addView(imageView, w7.a6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(w7Var, w7.a6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        zh.p6 p6Var = new zh.p6(getContext(), bVar);
        this.e = p6Var;
        p6Var.f48794s0 = true;
        p6Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(p6Var, w7.a6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, w7.a6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, w7.a6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, w7.a6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, w7.a6.c(-1.0f, -1));
        w7Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f7;
        if (z10) {
            if (this.f3919f != z11) {
                this.f3919f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f3918c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f10 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 0.5f;
            } else {
                f7 = 0.2f;
            }
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.f48778b0.b(org.telegram.ui.Components.y5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
