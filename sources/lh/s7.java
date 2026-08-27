package lh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

public final class s7 extends FrameLayout {

    public final int f16730a;

    public final org.telegram.ui.Components.y8 f16731b;

    public final org.telegram.ui.Components.n9 f16732c;
    public final TextView d;

    public ViewPropertyAnimator f16733e;

    public s7(Activity activity, int i10) {
        super(activity);
        this.f16730a = i10;
        this.f16731b = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(activity);
        this.f16732c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(n9Var, h7.z5.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, h7.z5.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.85f, -1));
        addView(textView2, h7.z5.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f16733e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f16733e = null;
        }
        if (!z11) {
            setVisibility(z10 ? 0 : 8);
            setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(er.h).withEndAction(new fh.f(10, this, z10)).setDuration(320L);
            this.f16733e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i10 = this.f16730a;
        long clientUserId = inputPeer == null ? UserConfig.getInstance(i10).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.n9 n9Var = this.f16732c;
        org.telegram.ui.Components.y8 y8Var = this.f16731b;
        if (clientUserId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(clientUserId));
            y8Var.r(user);
            n9Var.e(user, y8Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-clientUserId));
        y8Var.q(chat);
        n9Var.e(chat, y8Var);
        textView.setText(chat == null ? "" : chat.title);
    }
}
