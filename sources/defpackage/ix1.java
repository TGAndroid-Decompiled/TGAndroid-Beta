package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ix1 extends j47 {
    public final yic E0;
    public final ChatActivityEnterView F0;

    public ix1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar, yic yicVar) {
        super(context, wjbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = yicVar;
    }

    @Override
    public final void m(long j) {
        this.F0.setEffectId(j);
        yic yicVar = this.E0;
        if (yicVar != null) {
            yicVar.invalidate();
        }
    }
}
