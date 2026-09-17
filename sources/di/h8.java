package di;

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
import org.telegram.ui.Components.pr;
public final class h8 extends FrameLayout {
    public final int f7355a;
    public final org.telegram.ui.Components.i9 f7356b;
    public final org.telegram.ui.Components.x9 f7357c;
    public final TextView d;
    public ViewPropertyAnimator f7358e;

    public h8(Activity activity, int i10) {
        super(activity);
        this.f7355a = i10;
        this.f7356b = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(activity);
        this.f7357c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(x9Var, w7.x5.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.85f, -1));
        addView(textView2, w7.x5.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f7358e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f7358e = null;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f7 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setInterpolator(pr.h).withEndAction(new ah.u(5, this, z10)).setDuration(320L);
            this.f7358e = duration;
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
        int i10 = this.f7355a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        TextView textView = this.d;
        org.telegram.ui.Components.x9 x9Var = this.f7357c;
        org.telegram.ui.Components.i9 i9Var = this.f7356b;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            i9Var.r(user);
            x9Var.e(user, i9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        i9Var.q(chat);
        x9Var.e(chat, i9Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
