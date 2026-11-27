package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class jya implements View.OnClickListener {
    public final byte a;
    public final cza b;

    public jya(cza czaVar, byte b) {
        this.a = b;
        this.b = czaVar;
    }

    @Override
    public final void onClick(View view) {
        e Q;
        e Q2;
        byte b = this.a;
        cza czaVar = this.b;
        switch (b) {
            case 0:
                if (czaVar.e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q.showAsSheet(new nza(), obj);
                    return;
                }
                return;
            default:
                if (czaVar.e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.a = true;
                    Q2.showAsSheet(new nza(), obj2);
                    return;
                }
                return;
        }
    }
}
