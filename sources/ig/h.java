package ig;

import android.view.KeyEvent;
import android.view.View;
import j7.l1;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.j30;
public final class h implements View.OnKeyListener {
    public boolean f8981a;
    public final HashSet f8982b;
    public final Runnable f8983c;
    public final k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.f8982b = hashSet;
        this.f8983c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.f8996e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (kVar.f8994b.length() != 0) {
                    z10 = false;
                }
                this.f8981a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f8981a && !arrayList.isEmpty()) {
                kVar.a((j30) l1.i(1, arrayList), this.f8982b, this.f8983c);
                return true;
            }
        }
        return false;
    }
}
