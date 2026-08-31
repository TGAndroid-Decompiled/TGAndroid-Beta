package lg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.p30;
public final class h implements View.OnKeyListener {
    public boolean f12546a;
    public final HashSet f12547b;
    public final Runnable f12548c;
    public final k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.f12547b = hashSet;
        this.f12548c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.f12561e;
        if (i10 == 67) {
            boolean z4 = true;
            if (keyEvent.getAction() == 0) {
                if (kVar.f12559b.length() != 0) {
                    z4 = false;
                }
                this.f12546a = z4;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f12546a && !arrayList.isEmpty()) {
                kVar.a((p30) l.d.i(1, arrayList), this.f12547b, this.f12548c);
                return true;
            }
        }
        return false;
    }
}
