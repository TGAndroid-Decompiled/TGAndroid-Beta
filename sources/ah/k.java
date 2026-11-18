package ah;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m20;
public final class k implements View.OnKeyListener {
    public boolean f1078a;
    public final HashSet f1079b;
    public final Runnable f1080c;
    public final o d;

    public k(o oVar, HashSet hashSet, Runnable runnable) {
        this.d = oVar;
        this.f1079b = hashSet;
        this.f1080c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        o oVar = this.d;
        ArrayList arrayList = oVar.f1096e;
        if (i7 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (oVar.f1094b.length() != 0) {
                    z10 = false;
                }
                this.f1078a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f1078a && !arrayList.isEmpty()) {
                oVar.a((m20) i5.c.h(1, arrayList), this.f1079b, this.f1080c);
                return true;
            }
        }
        return false;
    }
}
