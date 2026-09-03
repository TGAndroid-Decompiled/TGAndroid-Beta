package lg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.p30;
public final class h implements View.OnKeyListener {
    public boolean f12548a;
    public final HashSet f12549b;
    public final Runnable f12550c;
    public final k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.f12549b = hashSet;
        this.f12550c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.f12563e;
        if (i10 == 67) {
            boolean z4 = true;
            if (keyEvent.getAction() == 0) {
                if (kVar.f12561b.length() != 0) {
                    z4 = false;
                }
                this.f12548a = z4;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f12548a && !arrayList.isEmpty()) {
                kVar.a((p30) l.d.i(1, arrayList), this.f12549b, this.f12550c);
                return true;
            }
        }
        return false;
    }
}
