package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wy1 extends j67 {
    public final ykc E0;
    public final ChatActivityEnterView F0;

    public wy1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar, ykc ykcVar) {
        super(context, ylbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = ykcVar;
    }

    @Override
    public final void m(long j) {
        this.F0.setEffectId(j);
        ykc ykcVar = this.E0;
        if (ykcVar != null) {
            ykcVar.invalidate();
        }
    }
}
