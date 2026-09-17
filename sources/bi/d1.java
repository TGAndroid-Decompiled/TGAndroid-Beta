package bi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class d1 extends FrameLayout {
    public final a1 f2847a;
    public final org.telegram.ui.Components.x9 f2848b;
    public final org.telegram.ui.Components.i9 f2849c;
    public final ImageView d;
    public final b1 f2850e;
    public f1 f2851f;

    public d1(Context context) {
        super(context);
        w7.z5.a(this);
        a1 a1Var = new a1(this, context);
        this.f2847a = a1Var;
        a1Var.setOrientation(0);
        addView(a1Var, w7.x5.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f2849c = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f2848b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        a1Var.addView(x9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        a1Var.addView(imageView, w7.x5.t(18, 18, 19, 0, 0, 3, 0));
        b1 b1Var = new b1(context);
        this.f2850e = b1Var;
        b1Var.setLines(1);
        b1Var.setSingleLine();
        b1Var.setTextColor(-1);
        b1Var.setTextSize(1, 14.0f);
        b1Var.setTypeface(AndroidUtilities.bold());
        a1Var.addView(b1Var, w7.x5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(f1 f1Var) {
        this.f2851f = f1Var;
        long j3 = f1Var.f2948b;
        org.telegram.ui.Components.x9 x9Var = this.f2848b;
        org.telegram.ui.Components.i9 i9Var = this.f2849c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(f1Var.f2948b));
            i9Var.r(user);
            x9Var.e(user, i9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-f1Var.f2948b));
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
        }
        int i10 = f1Var.f2950e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new u0(getContext(), f1Var.f2950e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f2850e.setText(DialogObject.getName(f1Var.f2948b));
        this.f2847a.invalidate();
    }
}
