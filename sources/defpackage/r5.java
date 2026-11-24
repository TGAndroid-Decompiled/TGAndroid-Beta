package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.a;
public final class r5 implements View.OnClickListener {
    public final byte a;
    public final a b;

    public r5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                if (!aVar.o0 && (runnable = aVar.k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                if (!aVar.K && aVar.o0) {
                    aVar.o(true);
                    return;
                }
                c6 c6Var = aVar.v0;
                if (c6Var != null) {
                    c6Var.b(-1);
                    return;
                }
                return;
        }
    }
}
