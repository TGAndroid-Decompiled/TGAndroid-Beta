package bh;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import org.telegram.ui.Components.y10;
public final class i implements View.OnKeyListener {
    public boolean f3318a;
    public final HashSet f3319b;
    public final Runnable f3320c;
    public final m d;

    public i(m mVar, HashSet hashSet, Runnable runnable) {
        this.d = mVar;
        this.f3319b = hashSet;
        this.f3320c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        m mVar = this.d;
        ArrayList arrayList = mVar.f3336e;
        if (i3 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (mVar.f3334b.length() != 0) {
                    z10 = false;
                }
                this.f3318a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f3318a && !arrayList.isEmpty()) {
                mVar.a((y10) p1.h(1, arrayList), this.f3319b, this.f3320c);
                return true;
            }
        }
        return false;
    }
}
