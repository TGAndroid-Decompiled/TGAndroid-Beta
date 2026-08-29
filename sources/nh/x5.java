package nh;

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
public final class x5 extends FrameLayout {
    public final int f18827a;
    public int f18828b;
    public final bg.z3 f18829c;
    public final FrameLayout d;
    public final lh.a8 f18830e;
    public boolean f18831f;
    public boolean h;

    public x5(Activity activity, int i10, lh.b bVar) {
        super(activity);
        this.f18828b = 1;
        this.f18831f = false;
        this.h = false;
        this.f18827a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        bg.z3 z3Var = new bg.z3(this, getContext());
        this.f18829c = z3Var;
        lh.z3 z3Var2 = new lh.z3(getContext(), null);
        z3Var2.f16453a.getAvatarDrawable().m(i10, currentUser);
        lh.y3 y3Var = z3Var2.f16453a;
        y3Var.e(currentUser, y3Var.getAvatarDrawable());
        z3Var2.f16454b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), z3Var2.f16454b.getPaint().getFontMetricsInt(), false), false);
        z3Var2.c(LocaleController.getString(R.string.RightNow), false);
        z3Var.addView(z3Var2, i7.f6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        z3Var.addView(imageView, i7.f6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(z3Var, i7.f6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        lh.a8 a8Var = new lh.a8(getContext(), bVar);
        this.f18830e = a8Var;
        a8Var.f15353o0 = true;
        a8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(a8Var, i7.f6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, i7.f6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, i7.f6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, i7.f6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, i7.f6.c(-1.0f, -1));
        z3Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f9;
        if (z10) {
            if (this.f18831f != z11) {
                this.f18831f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f18829c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f10 = 0.0f;
        if (z11) {
            if (z10) {
                f9 = 0.5f;
            } else {
                f9 = 0.2f;
            }
        } else {
            f9 = 0.0f;
        }
        animate.alpha(f9).start();
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
        this.f18830e.U.b(org.telegram.ui.Components.y5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
