package ci;

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
import org.telegram.ui.Components.is;
public final class e8 extends FrameLayout {
    public final int f5037a;
    public final org.telegram.ui.Components.j9 f5038b;
    public final org.telegram.ui.Components.y9 f5039c;
    public final TextView d;
    public ViewPropertyAnimator f5040e;

    public e8(Activity activity, int i10) {
        super(activity);
        this.f5037a = i10;
        this.f5038b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        this.f5039c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(y9Var, w7.x5.a(30.0f, 14.0f, 0.0f, 0.0f, 0.0f, 30, 19));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.a(-2.0f, 53.0f, 11.33f, 12.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.85f, -1));
        addView(textView2, w7.x5.a(-2.0f, 53.0f, 29.33f, 12.0f, 0.0f, -1, 51));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f5040e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f5040e = null;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f7 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setInterpolator(is.h).withEndAction(new bi.f(4, this, z10)).setDuration(320L);
            this.f5040e = duration;
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
        int i10 = this.f5037a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.y9 y9Var = this.f5039c;
        org.telegram.ui.Components.j9 j9Var = this.f5038b;
        if (i11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            j9Var.r(user);
            y9Var.e(user, j9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        j9Var.q(chat);
        y9Var.e(chat, j9Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
