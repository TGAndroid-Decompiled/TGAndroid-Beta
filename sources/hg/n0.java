package hg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wq;
import w7.z5;
public final class n0 extends FrameLayout implements b6 {
    public final g6 f12015a;
    public final u9 f12016b;
    public final TextView f12017c;
    public wq d;
    public o0 e;

    public n0(Context context, g6 g6Var) {
        super(context);
        this.f12015a = g6Var;
        u9 u9Var = new u9(context);
        this.f12016b = u9Var;
        addView(u9Var, z5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f12017c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        float f7;
        this.e = o0Var;
        u9 u9Var = this.f12016b;
        u9Var.getImageReceiver().clearImage();
        int i10 = o0Var.d;
        String str = o0Var.f12030c;
        TextView textView = this.f12017c;
        g6 g6Var = this.f12015a;
        if (i10 == 7) {
            wq M = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f32325f = dp2;
            k6.y1(this.d, k6.w0(k6.Oh, g6Var), false);
            k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
            u9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        wq M2 = k6.M(AndroidUtilities.dp(32.0f), o0Var.f12028a);
        this.d = M2;
        int i11 = k6.Oh;
        k6.y1(M2, k6.w0(i11, g6Var), false);
        wq wqVar = this.d;
        int i12 = k6.Sh;
        k6.y1(wqVar, k6.w0(i12, g6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f12031f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20491id == user.f20491id) {
                    wq M3 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f32325f = dp4;
                    k6.y1(M3, k6.w0(i11, g6Var), false);
                    k6.y1(M3, k6.w0(i12, g6Var), true);
                    u9Var.setImageDrawable(M3);
                } else {
                    u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    u9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f7 = 10.0f;
                } else {
                    f7 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                u9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            u9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }

    @Override
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        g6 g6Var = this.f12015a;
        if (z10) {
            k6.z1(k6.w0(k6.f21177ci, g6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.c0(AndroidUtilities.dp(28.0f), k6.w0(k6.f21177ci, g6Var)));
        }
        TextView textView = this.f12017c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, g6Var));
        }
        wq wqVar = this.d;
        if (wqVar != null && (o0Var = this.e) != null) {
            if (o0Var.d == 7) {
                k6.y1(wqVar, k6.w0(k6.Oh, g6Var), false);
                k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
                return;
            }
            k6.y1(wqVar, k6.w0(k6.Oh, g6Var), false);
            k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
