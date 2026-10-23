package ci;

import ai.qa;
import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yn0;
public final class d5 extends yn0 {
    public qa f5256f;
    public final t5 h;

    public d5(t5 t5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = t5Var;
    }

    @Override
    public final void a(String str) {
        qa qaVar = this.f5256f;
        if (qaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qaVar);
        }
        this.f5256f = new qa(17, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.f5256f, 300L);
        } else {
            this.f5256f.run();
        }
        if (this.f5256f != null) {
            t5 t5Var = this.h;
            if (!t5Var.Q) {
                t5Var.Q = true;
                t5Var.f5960w.E();
                t5Var.f5961x.h1(0, -t5Var.f5958r.getPaddingTop());
            }
        }
    }
}
