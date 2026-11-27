package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
public final class uw1 implements View.OnClickListener {
    public final zu1 a;
    public final Activity b;
    public final ChatActivityEnterView c;

    public uw1(ChatActivityEnterView chatActivityEnterView, zu1 zu1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = zu1Var;
        this.b = activity;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i;
        int i2;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.x2;
        zu1 zu1Var = this.a;
        if (zu1Var == null) {
            return;
        }
        chatActivityEnterView.V2 = !chatActivityEnterView.V2;
        c43 c43Var = chatActivityEnterView.f0;
        if (c43Var == null) {
            c43Var = new c43(this.b, 2131231513, aob.Nl);
            chatActivityEnterView.f0 = c43Var;
        }
        c43Var.a(chatActivityEnterView.V2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        SharedPreferences.Editor edit = uc7.s1(chatActivityEnterView.R).X3.edit();
        edit.putBoolean("silent_" + chatActivityEnterView.F3, chatActivityEnterView.V2).commit();
        ip7.n(chatActivityEnterView.R).c0(chatActivityEnterView.F3, zu1Var.c(), true);
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView != null) {
            if (!chatActivityEnterView.V2) {
                i2 = 54;
            } else {
                i2 = 55;
            }
            undoView.j(i2, 0L, null);
        }
        if (chatActivityEnterView.V2) {
            str = "AccDescrChanSilentOn";
            i = 2131754902;
        } else {
            str = "AccDescrChanSilentOff";
            i = 2131754903;
        }
        imageView.setContentDescription(ob6.M0(i, str));
        chatActivityEnterView.y2(true);
    }
}
