package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.voip.GroupCallMessage;
public final class qn4 implements be3 {
    public final a6 a;
    public final t75 b;

    public qn4(a6 a6Var, GroupCallMessage groupCallMessage) {
        t75 t75Var = new t75(a6Var.getContext());
        this.b = t75Var;
        t75Var.setBackgroundColor(bm2.o(-16777216, 34));
        wla wlaVar = t75Var.w;
        wlaVar.setMaxLines(1);
        wlaVar.setSingleLine(true);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        t75Var.set(groupCallMessage);
        t75Var.setAlpha(0.0f);
        this.a = a6Var;
        a6Var.addView(t75Var);
    }

    @Override
    public final void a() {
        this.a.removeView(this.b);
    }
}
