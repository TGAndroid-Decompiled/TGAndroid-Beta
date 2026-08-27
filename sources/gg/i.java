package gg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.a30;

public final class i implements View.OnKeyListener {

    public boolean f7094a;

    public final HashSet f7095b;

    public final Runnable f7096c;
    public final l d;

    public i(l lVar, HashSet hashSet, Runnable runnable) {
        this.d = lVar;
        this.f7095b = hashSet;
        this.f7096c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        l lVar = this.d;
        ArrayList arrayList = lVar.f7109e;
        if (i10 == 67) {
            if (keyEvent.getAction() == 0) {
                this.f7094a = lVar.f7107b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.f7094a && !arrayList.isEmpty()) {
                lVar.a((a30) i0.a.i(1, arrayList), this.f7095b, this.f7096c);
                return true;
            }
        }
        return false;
    }
}
