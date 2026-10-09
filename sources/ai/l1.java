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
    public final i1 f1320a;
    public final org.telegram.ui.Components.y9 f1321b;
    public final org.telegram.ui.Components.j9 f1322c;
    public final ImageView d;
    public final j1 f1323e;
    public n1 f1324f;

    public l1(Context context) {
        super(context);
        w7.z5.a(this);
        i1 i1Var = new i1(this, context);
        this.f1320a = i1Var;
        i1Var.setOrientation(0);
        addView(i1Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 6.0f, 0.0f, -2, 119));
        this.f1322c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f1321b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        i1Var.addView(y9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        i1Var.addView(imageView, w7.x5.t(18, 18, 19, 0, 0, 3, 0));
        j1 j1Var = new j1(context);
        this.f1323e = j1Var;
        j1Var.setLines(1);
        j1Var.setSingleLine();
        j1Var.setTextColor(-1);
        j1Var.setTextSize(1, 14.0f);
        j1Var.setTypeface(AndroidUtilities.bold());
        i1Var.addView(j1Var, w7.x5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(n1 n1Var) {
        this.f1324f = n1Var;
        int i10 = (n1Var.f1442b > 0L ? 1 : (n1Var.f1442b == 0L ? 0 : -1));
        org.telegram.ui.Components.y9 y9Var = this.f1321b;
        org.telegram.ui.Components.j9 j9Var = this.f1322c;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(n1Var.f1442b));
            j9Var.r(user);
            y9Var.e(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-n1Var.f1442b));
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
        }
        int i11 = n1Var.f1444e;
        ImageView imageView = this.d;
        if (i11 > 0) {
            imageView.setImageDrawable(new c1(getContext(), n1Var.f1444e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.f1323e.setText(DialogObject.getName(n1Var.f1442b));
        this.f1320a.invalidate();
    }
}
