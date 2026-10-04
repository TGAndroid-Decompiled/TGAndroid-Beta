package gg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class p0 extends FrameLayout {
    public static final int f10745f = 0;
    public final d6 f10746a;
    public final w9 f10747b;
    public final TextView f10748c;
    public sq d;
    public q0 f10749e;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.f10746a = d6Var;
        w9 w9Var = new w9(context);
        this.f10747b = w9Var;
        addView(w9Var, z5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f10748c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = i6.f20815ci;
        d6 d6Var = this.f10746a;
        setBackground(i6.b0(dp, i6.v0(i10, d6Var)));
        this.f10748c.setTextColor(i6.v0(i6.G6, d6Var));
        sq sqVar = this.d;
        if (sqVar != null) {
            if (this.f10749e.d == 7) {
                i6.v1(sqVar, i6.v0(i6.Oh, d6Var), false);
                i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
                return;
            }
            i6.v1(sqVar, i6.v0(i6.Oh, d6Var), false);
            i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
        }
    }

    public void setData(q0 q0Var) {
        float f7;
        this.f10749e = q0Var;
        w9 w9Var = this.f10747b;
        w9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.f10757c;
        TextView textView = this.f10748c;
        d6 d6Var = this.f10746a;
        if (i10 == 7) {
            sq L = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.f30858e = dp;
            L.f30859f = dp2;
            i6.v1(this.d, i6.v0(i6.Oh, d6Var), false);
            i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        sq L2 = i6.L(AndroidUtilities.dp(32.0f), q0Var.f10755a);
        this.d = L2;
        int i11 = i6.Oh;
        i6.v1(L2, i6.v0(i11, d6Var), false);
        sq sqVar = this.d;
        int i12 = i6.Sh;
        i6.v1(sqVar, i6.v0(i12, d6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f10759f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20189id == user.f20189id) {
                    sq L3 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.f30858e = dp3;
                    L3.f30859f = dp4;
                    i6.v1(L3, i6.v0(i11, d6Var), false);
                    i6.v1(L3, i6.v0(i12, d6Var), true);
                    w9Var.setImageDrawable(L3);
                } else {
                    w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    w9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f7 = 10.0f;
                } else {
                    f7 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                w9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            w9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
