package nh;

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
import org.telegram.ui.Components.jr;
public final class h7 extends FrameLayout {
    public final int f17847a;
    public final org.telegram.ui.Components.e9 f17848b;
    public final org.telegram.ui.Components.t9 f17849c;
    public final TextView d;
    public ViewPropertyAnimator f17850e;

    public h7(Activity activity, int i10) {
        super(activity);
        this.f17847a = i10;
        this.f17848b = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
        this.f17849c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(t9Var, i7.f6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, i7.f6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.85f, -1));
        addView(textView2, i7.f6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f17850e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f17850e = null;
        }
        float f9 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f9 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f9).setInterpolator(jr.h).withEndAction(new hh.f(10, this, z10)).setDuration(320L);
            this.f17850e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f9 = 1.0f;
        }
        setAlpha(f9);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long peerDialogId;
        String str;
        int i10 = this.f17847a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        TextView textView = this.d;
        org.telegram.ui.Components.t9 t9Var = this.f17849c;
        org.telegram.ui.Components.e9 e9Var = this.f17848b;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            e9Var.r(user);
            t9Var.e(user, e9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        e9Var.q(chat);
        t9Var.e(chat, e9Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
