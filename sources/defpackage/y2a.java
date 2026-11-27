package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class y2a implements View.OnKeyListener {
    public boolean a;
    public final HashSet b;
    public final Runnable c;
    public final b3a d;

    public y2a(b3a b3aVar, HashSet hashSet, Runnable runnable) {
        this.d = b3aVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        b3a b3aVar = this.d;
        ArrayList arrayList = b3aVar.e;
        if (i == 67) {
            boolean z = true;
            if (keyEvent.getAction() == 0) {
                if (b3aVar.b.length() != 0) {
                    z = false;
                }
                this.a = z;
                return false;
            } else if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                b3aVar.a((zc5) c00.g(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
