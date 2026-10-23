package ci;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class u0 extends FrameLayout {
    public final r0 f5971a;
    public final org.telegram.ui.Components.w9 f5972b;
    public final org.telegram.ui.Components.h9 f5973c;
    public final ImageView d;
    public final s0 e;
    public w0 f5974f;

    public u0(Context context) {
        super(context);
        w7.b6.a(this);
        r0 r0Var = new r0(this, context);
        this.f5971a = r0Var;
        r0Var.setOrientation(0);
        addView(r0Var, w7.z5.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f5973c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f5972b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        r0Var.addView(w9Var, w7.z5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        r0Var.addView(imageView, w7.z5.t(18, 18, 19, 0, 0, 3, 0));
        s0 s0Var = new s0(context);
        this.e = s0Var;
        s0Var.setLines(1);
        s0Var.setSingleLine();
        s0Var.setTextColor(-1);
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTypeface(AndroidUtilities.bold());
        r0Var.addView(s0Var, w7.z5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(w0 w0Var) {
        this.f5974f = w0Var;
        int i10 = (w0Var.f6038b > 0L ? 1 : (w0Var.f6038b == 0L ? 0 : -1));
        org.telegram.ui.Components.w9 w9Var = this.f5972b;
        org.telegram.ui.Components.h9 h9Var = this.f5973c;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(w0Var.f6038b));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-w0Var.f6038b));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        int i11 = w0Var.e;
        ImageView imageView = this.d;
        if (i11 > 0) {
            imageView.setImageDrawable(new m0(getContext(), w0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(w0Var.f6038b));
        this.f5971a.invalidate();
    }
}
