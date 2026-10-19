package ei;

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
public final class l6 extends FrameLayout {
    public final int f9376a;
    public int f9377b;
    public final ai.w1 f9378c;
    public final FrameLayout d;
    public final ci.s8 e;
    public boolean f9379f;
    public boolean h;

    public l6(Activity activity, int i10, ci.b bVar) {
        super(activity);
        this.f9377b = 1;
        this.f9379f = false;
        this.h = false;
        this.f9376a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        ai.w1 w1Var = new ai.w1(this, getContext());
        this.f9378c = w1Var;
        ci.m4 m4Var = new ci.m4(getContext(), null);
        m4Var.f5608a.getAvatarDrawable().m(i10, currentUser);
        ci.k4 k4Var = m4Var.f5608a;
        k4Var.e(currentUser, k4Var.getAvatarDrawable());
        m4Var.f5609b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), m4Var.f5609b.getPaint().getFontMetricsInt(), false), false);
        m4Var.c(LocaleController.getString(R.string.RightNow), false);
        w1Var.addView(m4Var, w7.z5.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        w1Var.addView(imageView, w7.z5.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(w1Var, w7.z5.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        ci.s8 s8Var = new ci.s8(getContext(), bVar);
        this.e = s8Var;
        s8Var.f5993s0 = true;
        s8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(s8Var, w7.z5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, w7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, w7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, w7.z5.c(-1.0f, -1));
        w1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f7;
        if (z10) {
            if (this.f9379f != z11) {
                this.f9379f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f9378c;
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
        this.e.f5977b0.b(org.telegram.ui.Components.a6.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
