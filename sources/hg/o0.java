package hg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class o0 extends FrameLayout {
    public static final int f10690f = 0;
    public final c6 f10691a;
    public final z9 f10692b;
    public final TextView f10693c;
    public cr d;
    public p0 e;

    public o0(Context context, c6 c6Var) {
        super(context);
        this.f10691a = c6Var;
        z9 z9Var = new z9(context);
        this.f10692b = z9Var;
        addView(z9Var, a6.d(30.0f, 30));
        TextView textView = new TextView(context);
        this.f10693c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, a6.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = g6.f19894ci;
        c6 c6Var = this.f10691a;
        setBackground(g6.c0(dp, g6.w0(i10, c6Var)));
        this.f10693c.setTextColor(g6.w0(g6.G6, c6Var));
        cr crVar = this.d;
        if (crVar != null) {
            if (this.e.d == 7) {
                g6.w1(crVar, g6.w0(g6.Oh, c6Var), false);
                g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
                return;
            }
            g6.w1(crVar, g6.w0(g6.Oh, c6Var), false);
            g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
        }
    }

    public void setData(p0 p0Var) {
        float f7;
        this.e = p0Var;
        z9 z9Var = this.f10692b;
        z9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.f10701c;
        TextView textView = this.f10693c;
        c6 c6Var = this.f10691a;
        if (i10 == 7) {
            cr M = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f24194f = dp2;
            g6.w1(this.d, g6.w0(g6.Oh, c6Var), false);
            g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
            z9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        cr M2 = g6.M(AndroidUtilities.dp(32.0f), p0Var.f10699a);
        this.d = M2;
        int i11 = g6.Oh;
        g6.w1(M2, g6.w0(i11, c6Var), false);
        cr crVar = this.d;
        int i12 = g6.Sh;
        g6.w1(crVar, g6.w0(i12, c6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f10702f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19363id == user.f19363id) {
                    cr M3 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f24194f = dp4;
                    g6.w1(M3, g6.w0(i11, c6Var), false);
                    g6.w1(M3, g6.w0(i12, c6Var), true);
                    z9Var.setImageDrawable(M3);
                } else {
                    z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    z9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f7 = 10.0f;
                } else {
                    f7 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                z9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            z9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
