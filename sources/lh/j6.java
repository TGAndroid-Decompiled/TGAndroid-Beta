package lh;

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

public final class j6 extends FrameLayout {

    public final int f16188a;

    public int f16189b;

    public final hh.h1 f16190c;
    public final FrameLayout d;

    public final jh.a8 f16191e;

    public boolean f16192f;
    public boolean h;

    public j6(Activity activity, int i10, jh.b bVar) {
        super(activity);
        this.f16189b = 1;
        this.f16192f = false;
        this.h = false;
        this.f16188a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        hh.h1 h1Var = new hh.h1(this, getContext());
        this.f16190c = h1Var;
        jh.a4 a4Var = new jh.a4(getContext(), null);
        a4Var.f13033a.getAvatarDrawable().m(i10, currentUser);
        jh.z3 z3Var = a4Var.f13033a;
        z3Var.e(currentUser, z3Var.getAvatarDrawable());
        a4Var.f13034b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), a4Var.f13034b.getPaint().getFontMetricsInt(), false), false);
        a4Var.c(LocaleController.getString(R.string.RightNow), false);
        h1Var.addView(a4Var, h7.z5.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.addView(imageView, h7.z5.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(h1Var, h7.z5.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        jh.a8 a8Var = new jh.a8(getContext(), bVar);
        this.f16191e = a8Var;
        a8Var.f13059o0 = true;
        a8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(a8Var, h7.z5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, h7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(22.0f), i0.b.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, h7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, h7.z5.c(-1.0f, -1));
        h1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        float f10;
        if (z10) {
            if (this.f16192f == z11) {
                return;
            } else {
                this.f16192f = z11;
            }
        } else if (this.h == z11) {
            return;
        } else {
            this.h = z11;
        }
        View view = z10 ? this.f16190c : this.d;
        view.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (z11) {
            f10 = z10 ? 0.5f : 0.2f;
        } else {
            f10 = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f10).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z11 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.f16191e.U.b(org.telegram.ui.Components.t5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
