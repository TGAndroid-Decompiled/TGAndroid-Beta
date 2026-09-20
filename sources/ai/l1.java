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
    public final i1 f1171a;
    public final org.telegram.ui.Components.v9 f1172b;
    public final org.telegram.ui.Components.g9 f1173c;
    public final ImageView d;
    public final j1 e;
    public n1 f1174f;

    public l1(Context context) {
        super(context);
        w7.b6.a(this);
        i1 i1Var = new i1(this, context);
        this.f1171a = i1Var;
        i1Var.setOrientation(0);
        addView(i1Var, w7.y5.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f1173c = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f1172b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        i1Var.addView(v9Var, w7.y5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        i1Var.addView(imageView, w7.y5.t(18, 18, 19, 0, 0, 3, 0));
        j1 j1Var = new j1(context);
        this.e = j1Var;
        j1Var.setLines(1);
        j1Var.setSingleLine();
        j1Var.setTextColor(-1);
        j1Var.setTextSize(1, 14.0f);
        j1Var.setTypeface(AndroidUtilities.bold());
        i1Var.addView(j1Var, w7.y5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(n1 n1Var) {
        this.f1174f = n1Var;
        long j3 = n1Var.f1280b;
        org.telegram.ui.Components.v9 v9Var = this.f1172b;
        org.telegram.ui.Components.g9 g9Var = this.f1173c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(n1Var.f1280b));
            g9Var.r(user);
            v9Var.e(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-n1Var.f1280b));
            g9Var.q(chat);
            v9Var.e(chat, g9Var);
        }
        int i10 = n1Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new c1(getContext(), n1Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(n1Var.f1280b));
        this.f1171a.invalidate();
    }
}
