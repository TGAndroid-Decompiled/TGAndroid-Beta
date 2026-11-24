package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
public final class sx1 implements View.OnClickListener {
    public final yv1 a;
    public final Activity b;
    public final ChatActivityEnterView c;

    public sx1(ChatActivityEnterView chatActivityEnterView, yv1 yv1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = yv1Var;
        this.b = activity;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i;
        int i2;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.y2;
        yv1 yv1Var = this.a;
        if (yv1Var == null) {
            return;
        }
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        v43 v43Var = chatActivityEnterView.f0;
        if (v43Var == null) {
            v43Var = new v43(this.b, 2131231514, cmb.Ml);
            chatActivityEnterView.f0 = v43Var;
        }
        v43Var.a(chatActivityEnterView.W2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        SharedPreferences.Editor edit = oc7.r1(chatActivityEnterView.R).W3.edit();
        edit.putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        lo7.n(chatActivityEnterView.R).c0(chatActivityEnterView.G3, yv1Var.d(), true);
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
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
        imageView.setContentDescription(jb6.M0(i, str));
        chatActivityEnterView.r2(true);
    }
}
