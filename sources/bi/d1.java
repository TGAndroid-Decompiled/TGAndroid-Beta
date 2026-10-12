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
    public final a1 f2938a;
    public final org.telegram.ui.Components.z9 f2939b;
    public final org.telegram.ui.Components.k9 f2940c;
    public final ImageView d;
    public final b1 e;
    public f1 f2941f;

    public d1(Context context) {
        super(context);
        w7.c6.a(this);
        a1 a1Var = new a1(this, context);
        this.f2938a = a1Var;
        a1Var.setOrientation(0);
        addView(a1Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 6.0f, 0.0f, -2, 119));
        this.f2940c = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f2939b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        a1Var.addView(z9Var, w7.a6.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        a1Var.addView(imageView, w7.a6.t(18, 18, 19, 0, 0, 3, 0));
        b1 b1Var = new b1(context);
        this.e = b1Var;
        b1Var.setLines(1);
        b1Var.setSingleLine();
        b1Var.setTextColor(-1);
        b1Var.setTextSize(1, 14.0f);
        b1Var.setTypeface(AndroidUtilities.bold());
        a1Var.addView(b1Var, w7.a6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(f1 f1Var) {
        this.f2941f = f1Var;
        int i10 = (f1Var.f3008b > 0L ? 1 : (f1Var.f3008b == 0L ? 0 : -1));
        org.telegram.ui.Components.z9 z9Var = this.f2939b;
        org.telegram.ui.Components.k9 k9Var = this.f2940c;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(f1Var.f3008b));
            k9Var.r(user);
            z9Var.e(user, k9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-f1Var.f3008b));
            k9Var.q(chat);
            z9Var.e(chat, k9Var);
        }
        int i11 = f1Var.e;
        ImageView imageView = this.d;
        if (i11 > 0) {
            imageView.setImageDrawable(new u0(getContext(), f1Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(f1Var.f3008b));
        this.f2938a.invalidate();
    }
}
