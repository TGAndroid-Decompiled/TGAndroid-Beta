package kh;

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
import org.telegram.ui.Components.gr;
public final class t7 extends FrameLayout {
    public final int f16092a;
    public final org.telegram.ui.Components.z8 f16093b;
    public final org.telegram.ui.Components.o9 f16094c;
    public final TextView d;
    public ViewPropertyAnimator f16095e;

    public t7(Activity activity, int i9) {
        super(activity);
        this.f16092a = i9;
        this.f16093b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
        this.f16094c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(o9Var, g7.e6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.85f, -1));
        addView(textView2, g7.e6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f16095e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f16095e = null;
        }
        float f10 = 0.0f;
        int i9 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(gr.h).withEndAction(new eh.f(10, this, z10)).setDuration(320L);
            this.f16095e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i9 = 8;
        }
        setVisibility(i9);
        if (z10) {
            f10 = 1.0f;
        }
        setAlpha(f10);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long peerDialogId;
        String str;
        int i9 = this.f16092a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i9).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        TextView textView = this.d;
        org.telegram.ui.Components.o9 o9Var = this.f16094c;
        org.telegram.ui.Components.z8 z8Var = this.f16093b;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
            z8Var.r(user);
            o9Var.e(user, z8Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
        z8Var.q(chat);
        o9Var.e(chat, z8Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
