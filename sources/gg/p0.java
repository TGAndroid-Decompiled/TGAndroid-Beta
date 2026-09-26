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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class p0 extends FrameLayout {
    public static final int f9869f = 0;
    public final d6 f9870a;
    public final w9 f9871b;
    public final TextView f9872c;
    public qq d;
    public q0 e;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.f9870a = d6Var;
        w9 w9Var = new w9(context);
        this.f9871b = w9Var;
        addView(w9Var, y5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f9872c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = h6.f19052ci;
        d6 d6Var = this.f9870a;
        setBackground(h6.b0(dp, h6.v0(i10, d6Var)));
        this.f9872c.setTextColor(h6.v0(h6.G6, d6Var));
        qq qqVar = this.d;
        if (qqVar != null) {
            if (this.e.d == 7) {
                h6.v1(qqVar, h6.v0(h6.Oh, d6Var), false);
                h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
                return;
            }
            h6.v1(qqVar, h6.v0(h6.Oh, d6Var), false);
            h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
        }
    }

    public void setData(q0 q0Var) {
        float f7;
        this.e = q0Var;
        w9 w9Var = this.f9871b;
        w9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.f9880c;
        TextView textView = this.f9872c;
        d6 d6Var = this.f9870a;
        if (i10 == 7) {
            qq L = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f27735f = dp2;
            h6.v1(this.d, h6.v0(h6.Oh, d6Var), false);
            h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        qq L2 = h6.L(AndroidUtilities.dp(32.0f), q0Var.f9878a);
        this.d = L2;
        int i11 = h6.Oh;
        h6.v1(L2, h6.v0(i11, d6Var), false);
        qq qqVar = this.d;
        int i12 = h6.Sh;
        h6.v1(qqVar, h6.v0(i12, d6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f9881f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18482id == user.f18482id) {
                    qq L3 = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f27735f = dp4;
                    h6.v1(L3, h6.v0(i11, d6Var), false);
                    h6.v1(L3, h6.v0(i12, d6Var), true);
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
