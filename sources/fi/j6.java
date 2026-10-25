package fi;

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
import org.telegram.ui.Components.gb1;
public final class j6 extends FrameLayout {
    public final int f11057a;
    public int f11058b;
    public final bi.t1 f11059c;
    public final FrameLayout d;
    public final di.p8 e;
    public boolean f11060f;
    public boolean h;

    public j6(Activity activity, int i10, di.b bVar) {
        super(activity);
        this.f11058b = 1;
        this.f11060f = false;
        this.h = false;
        this.f11057a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        bi.t1 t1Var = new bi.t1(this, getContext());
        this.f11059c = t1Var;
        di.m4 m4Var = new di.m4(getContext(), null);
        m4Var.f8776a.getAvatarDrawable().m(i10, currentUser);
        di.k4 k4Var = m4Var.f8776a;
        k4Var.f(currentUser, k4Var.getAvatarDrawable());
        m4Var.f8777b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), m4Var.f8777b.getPaint().getFontMetricsInt(), false), false);
        m4Var.c(LocaleController.getString(R.string.RightNow), false);
        t1Var.addView(m4Var, gb1.h(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        t1Var.addView(imageView, gb1.h(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(t1Var, gb1.g(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        di.p8 p8Var = new di.p8(getContext(), bVar);
        this.e = p8Var;
        p8Var.f8927s0 = true;
        p8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(p8Var, gb1.h(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, gb1.h(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, gb1.h(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, gb1.h(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, gb1.h(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, gb1.g(-1.0f, -1));
        t1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f7;
        if (z10) {
            if (this.f11060f != z11) {
                this.f11060f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f11059c;
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
        this.e.f8911b0.b(org.telegram.ui.Components.c6.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
