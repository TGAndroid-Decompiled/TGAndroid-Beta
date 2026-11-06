package ah;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.c20;
public final class k implements View.OnKeyListener {
    public boolean f1081a;
    public final HashSet f1082b;
    public final Runnable f1083c;
    public final o d;

    public k(o oVar, HashSet hashSet, Runnable runnable) {
        this.d = oVar;
        this.f1082b = hashSet;
        this.f1083c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        o oVar = this.d;
        ArrayList arrayList = oVar.f1099e;
        if (i7 == 67) {
            boolean z9 = true;
            if (keyEvent.getAction() == 0) {
                if (oVar.f1097b.length() != 0) {
                    z9 = false;
                }
                this.f1081a = z9;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f1081a && !arrayList.isEmpty()) {
                oVar.a((c20) jg.g.i(1, arrayList), this.f1082b, this.f1083c);
                return true;
            }
        }
        return false;
    }
}
