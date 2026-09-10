package bi;

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
import org.telegram.ui.Components.wr;
public final class j9 extends FrameLayout {
    public final int f2969a;
    public final org.telegram.ui.Components.g9 f2970b;
    public final org.telegram.ui.Components.w9 f2971c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public j9(Activity activity, int i10) {
        super(activity);
        this.f2969a = i10;
        this.f2970b = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        this.f2971c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(w9Var, w7.a6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.85f, -1));
        addView(textView2, w7.a6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f7 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setInterpolator(wr.h).withEndAction(new ai.j(4, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = 1.0f;
        }
        setAlpha(f7);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long peerDialogId;
        String str;
        int i10 = this.f2969a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        TextView textView = this.d;
        org.telegram.ui.Components.w9 w9Var = this.f2971c;
        org.telegram.ui.Components.g9 g9Var = this.f2970b;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            g9Var.r(user);
            w9Var.e(user, g9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        g9Var.q(chat);
        w9Var.e(chat, g9Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
