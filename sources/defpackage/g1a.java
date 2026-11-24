package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class g1a implements View.OnKeyListener {
    public boolean a;
    public final HashSet b;
    public final Runnable c;
    public final j1a d;

    public g1a(j1a j1aVar, HashSet hashSet, Runnable runnable) {
        this.d = j1aVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        j1a j1aVar = this.d;
        ArrayList arrayList = j1aVar.e;
        if (i == 67) {
            boolean z = true;
            if (keyEvent.getAction() == 0) {
                if (j1aVar.b.length() != 0) {
                    z = false;
                }
                this.a = z;
                return false;
            } else if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                j1aVar.a((wc5) b10.f(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
