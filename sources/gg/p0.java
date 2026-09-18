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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class p0 extends FrameLayout {
    public static final int f9887f = 0;
    public final e6 f9888a;
    public final w9 f9889b;
    public final TextView f9890c;
    public pq d;
    public q0 e;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f9888a = e6Var;
        w9 w9Var = new w9(context);
        this.f9889b = w9Var;
        addView(w9Var, y5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f9890c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = j6.f19055ci;
        e6 e6Var = this.f9888a;
        setBackground(j6.b0(dp, j6.v0(i10, e6Var)));
        this.f9890c.setTextColor(j6.v0(j6.G6, e6Var));
        pq pqVar = this.d;
        if (pqVar != null) {
            if (this.e.d == 7) {
                j6.v1(pqVar, j6.v0(j6.Oh, e6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, e6Var), true);
                return;
            }
            j6.v1(pqVar, j6.v0(j6.Oh, e6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, e6Var), true);
        }
    }

    public void setData(q0 q0Var) {
        float f7;
        this.e = q0Var;
        w9 w9Var = this.f9889b;
        w9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.f9898c;
        TextView textView = this.f9890c;
        e6 e6Var = this.f9888a;
        if (i10 == 7) {
            pq L = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f27299f = dp2;
            j6.v1(this.d, j6.v0(j6.Oh, e6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, e6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        pq L2 = j6.L(AndroidUtilities.dp(32.0f), q0Var.f9896a);
        this.d = L2;
        int i11 = j6.Oh;
        j6.v1(L2, j6.v0(i11, e6Var), false);
        pq pqVar = this.d;
        int i12 = j6.Sh;
        j6.v1(pqVar, j6.v0(i12, e6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f9899f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18443id == user.f18443id) {
                    pq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f27299f = dp4;
                    j6.v1(L3, j6.v0(i11, e6Var), false);
                    j6.v1(L3, j6.v0(i12, e6Var), true);
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
