package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class ez9 implements View.OnKeyListener {
    public boolean a;
    public final HashSet b;
    public final Runnable c;
    public final hz9 d;

    public ez9(hz9 hz9Var, HashSet hashSet, Runnable runnable) {
        this.d = hz9Var;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        hz9 hz9Var = this.d;
        ArrayList arrayList = hz9Var.e;
        if (i == 67) {
            boolean z = true;
            if (keyEvent.getAction() == 0) {
                if (hz9Var.b.length() != 0) {
                    z = false;
                }
                this.a = z;
                return false;
            } else if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                hz9Var.a((ya5) b00.f(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
