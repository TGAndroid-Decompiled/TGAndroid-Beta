package org.telegram.messenger;

import android.view.View;
import java.util.List;

public final class Emoji$$ExternalSyntheticLambda3 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public Emoji$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Runnable) this.f$0).run();
                break;
            case 1:
                ((ChatThemeController) this.f$0).lambda$init$0((List) obj);
                break;
            default:
                ((View) this.f$0).invalidate();
                break;
        }
    }
}
