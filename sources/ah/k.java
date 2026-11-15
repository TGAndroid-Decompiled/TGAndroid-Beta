package ah;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.f20;
public final class k implements View.OnKeyListener {
    public boolean f1079a;
    public final HashSet f1080b;
    public final Runnable f1081c;
    public final o d;

    public k(o oVar, HashSet hashSet, Runnable runnable) {
        this.d = oVar;
        this.f1080b = hashSet;
        this.f1081c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        o oVar = this.d;
        ArrayList arrayList = oVar.f1097e;
        if (i7 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (oVar.f1095b.length() != 0) {
                    z10 = false;
                }
                this.f1079a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f1079a && !arrayList.isEmpty()) {
                oVar.a((f20) i5.c.h(1, arrayList), this.f1080b, this.f1081c);
                return true;
            }
        }
        return false;
    }
}
