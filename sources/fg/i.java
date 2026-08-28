package fg;

import android.view.KeyEvent;
import android.view.View;
import j3.r0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.w20;
public final class i implements View.OnKeyListener {
    public boolean f6294a;
    public final HashSet f6295b;
    public final Runnable f6296c;
    public final m d;

    public i(m mVar, HashSet hashSet, Runnable runnable) {
        this.d = mVar;
        this.f6295b = hashSet;
        this.f6296c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        m mVar = this.d;
        ArrayList arrayList = mVar.f6312e;
        if (i9 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (mVar.f6310b.length() != 0) {
                    z10 = false;
                }
                this.f6294a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f6294a && !arrayList.isEmpty()) {
                mVar.a((w20) r0.j(1, arrayList), this.f6295b, this.f6296c);
                return true;
            }
        }
        return false;
    }
}
