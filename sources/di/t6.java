package di;

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
public final class t6 extends FrameLayout {
    public final int f7832a;
    public int f7833b;
    public final bi.i7 f7834c;
    public final FrameLayout d;
    public final bi.ha e;
    public boolean f7835f;
    public boolean h;

    public t6(Activity activity, int i10, bi.b bVar) {
        super(activity);
        this.f7833b = 1;
        this.f7835f = false;
        this.h = false;
        this.f7832a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        bi.i7 i7Var = new bi.i7(this, getContext());
        this.f7834c = i7Var;
        bi.m5 m5Var = new bi.m5(getContext(), null);
        m5Var.f3309a.getAvatarDrawable().m(i10, currentUser);
        bi.k5 k5Var = m5Var.f3309a;
        k5Var.e(currentUser, k5Var.getAvatarDrawable());
        m5Var.f3310b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), m5Var.f3310b.getPaint().getFontMetricsInt(), false), false);
        m5Var.c(LocaleController.getString(R.string.RightNow), false);
        i7Var.addView(m5Var, w7.a6.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i7Var.addView(imageView, w7.a6.a(40.0f, 12.0f, 15.0f, 12.0f, 0.0f, 40, 53));
        addView(i7Var, w7.a6.d(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        bi.ha haVar = new bi.ha(getContext(), bVar);
        this.e = haVar;
        haVar.f3148s0 = true;
        haVar.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(haVar, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, w7.a6.a(28.0f, 0.0f, 0.0f, 12.0f, 16.0f, 28, 85));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 19));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, w7.a6.a(28.0f, 0.0f, 0.0f, 9.0f, 0.0f, 28, 21));
        frameLayout.addView(frameLayout2, w7.a6.a(44.0f, 9.0f, 8.0f, 55.0f, 8.0f, -1, 87));
        addView(frameLayout, w7.a6.d(-1.0f, -1));
        i7Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f7;
        if (z10) {
            if (this.f7835f != z11) {
                this.f7835f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f7834c;
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
        this.e.f3132b0.b(org.telegram.ui.Components.b6.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
