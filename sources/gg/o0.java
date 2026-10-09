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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class o0 extends FrameLayout {
    public static final int f10750f = 0;
    public final e6 f10751a;
    public final y9 f10752b;
    public final TextView f10753c;
    public fr d;
    public p0 f10754e;

    public o0(Context context, e6 e6Var) {
        super(context);
        this.f10751a = e6Var;
        y9 y9Var = new y9(context);
        this.f10752b = y9Var;
        addView(y9Var, x5.d(30.0f, 30));
        TextView textView = new TextView(context);
        this.f10753c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, x5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = i6.f20790ci;
        e6 e6Var = this.f10751a;
        setBackground(i6.c0(dp, i6.w0(i10, e6Var)));
        this.f10753c.setTextColor(i6.w0(i6.G6, e6Var));
        fr frVar = this.d;
        if (frVar != null) {
            if (this.f10754e.d == 7) {
                i6.w1(frVar, i6.w0(i6.Oh, e6Var), false);
                i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
                return;
            }
            i6.w1(frVar, i6.w0(i6.Oh, e6Var), false);
            i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
        }
    }

    public void setData(p0 p0Var) {
        float f7;
        this.f10754e = p0Var;
        y9 y9Var = this.f10752b;
        y9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.f10762c;
        TextView textView = this.f10753c;
        e6 e6Var = this.f10751a;
        if (i10 == 7) {
            fr M = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.f26466e = dp;
            M.f26467f = dp2;
            i6.w1(this.d, i6.w0(i6.Oh, e6Var), false);
            i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
            y9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        fr M2 = i6.M(AndroidUtilities.dp(32.0f), p0Var.f10760a);
        this.d = M2;
        int i11 = i6.Oh;
        i6.w1(M2, i6.w0(i11, e6Var), false);
        fr frVar = this.d;
        int i12 = i6.Sh;
        i6.w1(frVar, i6.w0(i12, e6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f10764f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20185id == user.f20185id) {
                    fr M3 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.f26466e = dp3;
                    M3.f26467f = dp4;
                    i6.w1(M3, i6.w0(i11, e6Var), false);
                    i6.w1(M3, i6.w0(i12, e6Var), true);
                    y9Var.setImageDrawable(M3);
                } else {
                    y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    y9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f7 = 10.0f;
                } else {
                    f7 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                y9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            y9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
