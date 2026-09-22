package ai;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class l1 extends FrameLayout {
    public final i1 f1168a;
    public final org.telegram.ui.Components.u9 f1169b;
    public final org.telegram.ui.Components.f9 f1170c;
    public final ImageView d;
    public final j1 e;
    public n1 f1171f;

    public l1(Context context) {
        super(context);
        w7.z5.a(this);
        i1 i1Var = new i1(this, context);
        this.f1168a = i1Var;
        i1Var.setOrientation(0);
        addView(i1Var, w7.x5.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f1170c = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f1169b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        i1Var.addView(u9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        i1Var.addView(imageView, w7.x5.t(18, 18, 19, 0, 0, 3, 0));
        j1 j1Var = new j1(context);
        this.e = j1Var;
        j1Var.setLines(1);
        j1Var.setSingleLine();
        j1Var.setTextColor(-1);
        j1Var.setTextSize(1, 14.0f);
        j1Var.setTypeface(AndroidUtilities.bold());
        i1Var.addView(j1Var, w7.x5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(n1 n1Var) {
        this.f1171f = n1Var;
        long j3 = n1Var.f1277b;
        org.telegram.ui.Components.u9 u9Var = this.f1169b;
        org.telegram.ui.Components.f9 f9Var = this.f1170c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(n1Var.f1277b));
            f9Var.r(user);
            u9Var.e(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-n1Var.f1277b));
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
        }
        int i10 = n1Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new c1(getContext(), n1Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(n1Var.f1277b));
        this.f1168a.invalidate();
    }
}
