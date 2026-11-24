package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
public final class fw1 implements View.OnClickListener {
    public final mu1 a;
    public final Activity b;
    public final ChatActivityEnterView c;

    public fw1(ChatActivityEnterView chatActivityEnterView, mu1 mu1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = mu1Var;
        this.b = activity;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i;
        int i2;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.y2;
        mu1 mu1Var = this.a;
        if (mu1Var == null) {
            return;
        }
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        k33 k33Var = chatActivityEnterView.f0;
        if (k33Var == null) {
            k33Var = new k33(this.b, 2131231513, bkb.Ml);
            chatActivityEnterView.f0 = k33Var;
        }
        k33Var.a(chatActivityEnterView.W2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        SharedPreferences.Editor edit = na7.q1(chatActivityEnterView.R).W3.edit();
        edit.putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        im7.n(chatActivityEnterView.R).c0(chatActivityEnterView.G3, mu1Var.d(), true);
        mu1Var.b6();
        UndoView undoView = mu1Var.N3;
        if (undoView != null) {
            if (!chatActivityEnterView.W2) {
                i2 = 54;
            } else {
                i2 = 55;
            }
            undoView.j(i2, 0L, null);
        }
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i = 2131754907;
        }
        imageView.setContentDescription(k96.M0(i, str));
        chatActivityEnterView.m2(true);
    }
}
