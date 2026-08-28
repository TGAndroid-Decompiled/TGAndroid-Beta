package of;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.o9;
public final class l0 extends FrameLayout {
    public static final int f19403f = 0;
    public final b6 f19404a;
    public final o9 f19405b;
    public final TextView f19406c;
    public fq d;
    public m0 f19407e;

    public l0(Context context, b6 b6Var) {
        super(context);
        this.f19404a = b6Var;
        o9 o9Var = new o9(context);
        this.f19405b = o9Var;
        addView(o9Var, e6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f19406c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, e6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i9 = f6.ci;
        b6 b6Var = this.f19404a;
        setBackground(f6.b0(dp, f6.v0(i9, b6Var)));
        this.f19406c.setTextColor(f6.v0(f6.G6, b6Var));
        fq fqVar = this.d;
        if (fqVar != null) {
            if (this.f19407e.d == 7) {
                f6.v1(fqVar, f6.v0(f6.Oh, b6Var), false);
                f6.v1(this.d, f6.v0(f6.Sh, b6Var), true);
                return;
            }
            f6.v1(fqVar, f6.v0(f6.Oh, b6Var), false);
            f6.v1(this.d, f6.v0(f6.Sh, b6Var), true);
        }
    }

    public void setData(m0 m0Var) {
        float f10;
        this.f19407e = m0Var;
        o9 o9Var = this.f19405b;
        o9Var.getImageReceiver().clearImage();
        int i9 = m0Var.d;
        String str = m0Var.f19420c;
        TextView textView = this.f19406c;
        b6 b6Var = this.f19404a;
        if (i9 == 7) {
            fq L = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.f28545e = dp;
            L.f28546f = dp2;
            f6.v1(this.d, f6.v0(f6.Oh, b6Var), false);
            f6.v1(this.d, f6.v0(f6.Sh, b6Var), true);
            o9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        fq L2 = f6.L(AndroidUtilities.dp(32.0f), m0Var.f19418a);
        this.d = L2;
        int i10 = f6.Oh;
        f6.v1(L2, f6.v0(i10, b6Var), false);
        fq fqVar = this.d;
        int i11 = f6.Sh;
        f6.v1(fqVar, f6.v0(i11, b6Var), true);
        if (m0Var.d == 4) {
            TLObject tLObject = m0Var.f19422f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id == user.f22527id) {
                    fq L3 = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.f28545e = dp3;
                    L3.f28546f = dp4;
                    f6.v1(L3, f6.v0(i10, b6Var), false);
                    f6.v1(L3, f6.v0(i11, b6Var), true);
                    o9Var.setImageDrawable(L3);
                } else {
                    o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    o9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = o9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f10 = 10.0f;
                } else {
                    f10 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                o9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            o9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
