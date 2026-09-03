package nh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class s0 extends FrameLayout {
    public final p0 f15840a;
    public final org.telegram.ui.Components.p9 f15841b;
    public final org.telegram.ui.Components.z8 f15842c;
    public final ImageView d;
    public final q0 e;
    public u0 f15843f;

    public s0(Context context) {
        super(context);
        k7.d6.a(this);
        p0 p0Var = new p0(this, context);
        this.f15840a = p0Var;
        p0Var.setOrientation(0);
        addView(p0Var, k7.b6.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f15842c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f15841b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        p0Var.addView(p9Var, k7.b6.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        p0Var.addView(imageView, k7.b6.t(18, 18, 19, 0, 0, 3, 0));
        q0 q0Var = new q0(context);
        this.e = q0Var;
        q0Var.setLines(1);
        q0Var.setSingleLine();
        q0Var.setTextColor(-1);
        q0Var.setTextSize(1, 14.0f);
        q0Var.setTypeface(AndroidUtilities.bold());
        p0Var.addView(q0Var, k7.b6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(u0 u0Var) {
        this.f15843f = u0Var;
        long j10 = u0Var.f15928b;
        org.telegram.ui.Components.p9 p9Var = this.f15841b;
        org.telegram.ui.Components.z8 z8Var = this.f15842c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(u0Var.f15928b));
            z8Var.r(user);
            p9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-u0Var.f15928b));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        int i10 = u0Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new k0(getContext(), u0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(u0Var.f15928b));
        this.f15840a.invalidate();
    }
}
