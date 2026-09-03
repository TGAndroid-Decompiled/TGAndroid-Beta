package kg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import kf.k0;
import org.telegram.ui.Components.o30;
public final class h implements View.OnKeyListener {
    public boolean f10534a;
    public final HashSet f10535b;
    public final Runnable f10536c;
    public final k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.f10535b = hashSet;
        this.f10536c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.e;
        if (i10 == 67) {
            boolean z4 = true;
            if (keyEvent.getAction() == 0) {
                if (kVar.f10546b.length() != 0) {
                    z4 = false;
                }
                this.f10534a = z4;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f10534a && !arrayList.isEmpty()) {
                kVar.a((o30) k0.i(1, arrayList), this.f10535b, this.f10536c);
                return true;
            }
        }
        return false;
    }
}
