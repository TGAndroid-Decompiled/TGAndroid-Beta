package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yx1 extends q67 {
    public final knc E0;
    public final ChatActivityEnterView F0;

    public yx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar, knc kncVar) {
        super(context, vnbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = kncVar;
    }

    @Override
    public final void m(long j) {
        this.F0.setEffectId(j);
        knc kncVar = this.E0;
        if (kncVar != null) {
            kncVar.invalidate();
        }
    }
}
