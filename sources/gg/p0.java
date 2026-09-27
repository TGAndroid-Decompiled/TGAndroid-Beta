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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class p0 extends FrameLayout {
    public static final int f9875f = 0;
    public final e6 f9876a;
    public final w9 f9877b;
    public final TextView f9878c;
    public rq d;
    public q0 e;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.f9876a = e6Var;
        w9 w9Var = new w9(context);
        this.f9877b = w9Var;
        addView(w9Var, y5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f9878c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = i6.f19050ci;
        e6 e6Var = this.f9876a;
        setBackground(i6.b0(dp, i6.v0(i10, e6Var)));
        this.f9878c.setTextColor(i6.v0(i6.G6, e6Var));
        rq rqVar = this.d;
        if (rqVar != null) {
            if (this.e.d == 7) {
                i6.v1(rqVar, i6.v0(i6.Oh, e6Var), false);
                i6.v1(this.d, i6.v0(i6.Sh, e6Var), true);
                return;
            }
            i6.v1(rqVar, i6.v0(i6.Oh, e6Var), false);
            i6.v1(this.d, i6.v0(i6.Sh, e6Var), true);
        }
    }

    public void setData(q0 q0Var) {
        float f7;
        this.e = q0Var;
        w9 w9Var = this.f9877b;
        w9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.f9886c;
        TextView textView = this.f9878c;
        e6 e6Var = this.f9876a;
        if (i10 == 7) {
            rq L = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f28065f = dp2;
            i6.v1(this.d, i6.v0(i6.Oh, e6Var), false);
            i6.v1(this.d, i6.v0(i6.Sh, e6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        rq L2 = i6.L(AndroidUtilities.dp(32.0f), q0Var.f9884a);
        this.d = L2;
        int i11 = i6.Oh;
        i6.v1(L2, i6.v0(i11, e6Var), false);
        rq rqVar = this.d;
        int i12 = i6.Sh;
        i6.v1(rqVar, i6.v0(i12, e6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f9887f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18476id == user.f18476id) {
                    rq L3 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f28065f = dp4;
                    i6.v1(L3, i6.v0(i11, e6Var), false);
                    i6.v1(L3, i6.v0(i12, e6Var), true);
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
