package kh;

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
    public final int f15600a;
    public int f15601b;
    public final gh.h1 f15602c;
    public final FrameLayout d;
    public final ih.e8 f15603e;
    public boolean f15604f;
    public boolean h;

    public l6(Activity activity, int i9, ih.b bVar) {
        super(activity);
        this.f15601b = 1;
        this.f15604f = false;
        this.h = false;
        this.f15600a = i9;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        gh.h1 h1Var = new gh.h1(this, getContext());
        this.f15602c = h1Var;
        ih.e4 e4Var = new ih.e4(getContext(), null);
        e4Var.f11354a.getAvatarDrawable().m(i9, currentUser);
        ih.d4 d4Var = e4Var.f11354a;
        d4Var.e(currentUser, d4Var.getAvatarDrawable());
        e4Var.f11355b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), e4Var.f11355b.getPaint().getFontMetricsInt(), false), false);
        e4Var.c(LocaleController.getString(R.string.RightNow), false);
        h1Var.addView(e4Var, g7.e6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.addView(imageView, g7.e6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(h1Var, g7.e6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        ih.e8 e8Var = new ih.e8(getContext(), bVar);
        this.f15603e = e8Var;
        e8Var.f11388o0 = true;
        e8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(e8Var, g7.e6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, g7.e6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, g7.e6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, g7.e6.c(-1.0f, -1));
        h1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z10) {
            if (this.f15604f != z11) {
                this.f15604f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f15602c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f11 = 0.0f;
        if (z11) {
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 0.2f;
            }
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.f15603e.U.b(org.telegram.ui.Components.t5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
