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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class o0 extends FrameLayout {
    public static final int f10748f = 0;
    public final c6 f10749a;
    public final y9 f10750b;
    public final TextView f10751c;
    public hr d;
    public p0 f10752e;

    public o0(Context context, c6 c6Var) {
        super(context);
        this.f10749a = c6Var;
        y9 y9Var = new y9(context);
        this.f10750b = y9Var;
        addView(y9Var, w5.d(30.0f, 30));
        TextView textView = new TextView(context);
        this.f10751c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, w5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = h6.f20552ci;
        c6 c6Var = this.f10749a;
        setBackground(h6.c0(dp, h6.w0(i10, c6Var)));
        this.f10751c.setTextColor(h6.w0(h6.G6, c6Var));
        hr hrVar = this.d;
        if (hrVar != null) {
            if (this.f10752e.d == 7) {
                h6.w1(hrVar, h6.w0(h6.Oh, c6Var), false);
                h6.w1(this.d, h6.w0(h6.Sh, c6Var), true);
                return;
            }
            h6.w1(hrVar, h6.w0(h6.Oh, c6Var), false);
            h6.w1(this.d, h6.w0(h6.Sh, c6Var), true);
        }
    }

    public void setData(p0 p0Var) {
        float f7;
        this.f10752e = p0Var;
        y9 y9Var = this.f10750b;
        y9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.f10760c;
        TextView textView = this.f10751c;
        c6 c6Var = this.f10749a;
        if (i10 == 7) {
            hr M = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.f26892e = dp;
            M.f26893f = dp2;
            h6.w1(this.d, h6.w0(h6.Oh, c6Var), false);
            h6.w1(this.d, h6.w0(h6.Sh, c6Var), true);
            y9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        hr M2 = h6.M(AndroidUtilities.dp(32.0f), p0Var.f10758a);
        this.d = M2;
        int i11 = h6.Oh;
        h6.w1(M2, h6.w0(i11, c6Var), false);
        hr hrVar = this.d;
        int i12 = h6.Sh;
        h6.w1(hrVar, h6.w0(i12, c6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f10762f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19949id == user.f19949id) {
                    hr M3 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.f26892e = dp3;
                    M3.f26893f = dp4;
                    h6.w1(M3, h6.w0(i11, c6Var), false);
                    h6.w1(M3, h6.w0(i12, c6Var), true);
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
