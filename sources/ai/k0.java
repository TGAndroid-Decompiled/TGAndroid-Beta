package ai;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.bq0;
public final class k0 implements bq0 {
    public final Utilities.CallbackReturn f1561a;
    public final r2 f1562b;
    public final Utilities.Callback f1563c;

    public k0(Utilities.CallbackReturn callbackReturn, r2 r2Var, Utilities.Callback callback) {
        this.f1561a = callbackReturn;
        this.f1562b = r2Var;
        this.f1563c = callback;
    }

    @Override
    public final void a(ArrayList arrayList) {
        String str;
        if (!arrayList.isEmpty()) {
            str = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path;
        } else {
            str = null;
        }
        if (str == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e0(str, this.f1561a, this.f1562b, this.f1563c));
    }

    @Override
    public final void b() {
    }
}
