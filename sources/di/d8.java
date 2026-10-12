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
import org.telegram.ui.Components.es;
public final class d8 extends FrameLayout {
    public final int f6832a;
    public final org.telegram.ui.Components.k9 f6833b;
    public final org.telegram.ui.Components.z9 f6834c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public d8(Activity activity, int i10) {
        super(activity);
        this.f6832a = i10;
        this.f6833b = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(activity);
        this.f6834c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(z9Var, w7.a6.a(30.0f, 14.0f, 0.0f, 0.0f, 0.0f, 30, 19));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.a(-2.0f, 53.0f, 11.33f, 12.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.85f, -1));
        addView(textView2, w7.a6.a(-2.0f, 53.0f, 29.33f, 12.0f, 0.0f, -1, 51));
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
            ViewPropertyAnimator duration = animate.alpha(f7).setInterpolator(es.h).withEndAction(new ah.t(5, this, z10)).setDuration(320L);
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
        int i10 = this.f6832a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.z9 z9Var = this.f6834c;
        org.telegram.ui.Components.k9 k9Var = this.f6833b;
        if (i11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            k9Var.r(user);
            z9Var.e(user, k9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        k9Var.q(chat);
        z9Var.e(chat, k9Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
