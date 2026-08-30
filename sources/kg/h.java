package kg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import kh.a2;
import org.telegram.ui.Components.n30;
public final class h implements View.OnKeyListener {
    public boolean f10424a;
    public final HashSet f10425b;
    public final Runnable f10426c;
    public final k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.f10425b = hashSet;
        this.f10426c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.e;
        if (i10 == 67) {
            boolean z4 = true;
            if (keyEvent.getAction() == 0) {
                if (kVar.f10436b.length() != 0) {
                    z4 = false;
                }
                this.f10424a = z4;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f10424a && !arrayList.isEmpty()) {
                kVar.a((n30) a2.i(1, arrayList), this.f10425b, this.f10426c);
                return true;
            }
        }
        return false;
    }
}
