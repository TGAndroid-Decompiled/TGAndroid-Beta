package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class q58 implements yq5 {
    public final o68 a;

    public q58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void G(no6 no6Var, oec oecVar, boolean z, int i, boolean z2, long j) {
        k5 accountInstance;
        k5 accountInstance2;
        boolean z3;
        k5 accountInstance3;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = o68Var.l1;
            if (no6Var.b) {
                accountInstance3 = o68Var.getAccountInstance();
                String str = no6Var.I;
                long j2 = o68Var.l1;
                ArrayList arrayList = no6Var.n;
                r7a.a0(no6Var.x, i, j2, 0L, j, 0L, accountInstance3, null, null, null, null, null, null, oecVar, no6Var.a, str, null, arrayList, null, storyItem, z, false, no6Var.M);
            } else if (no6Var.h != null) {
                accountInstance2 = o68Var.getAccountInstance();
                r7a.Y(accountInstance2, no6Var.h, no6Var.c, null, o68Var.l1, null, null, null, no6Var.n, no6Var.r, null, no6Var.x, null, oecVar, z, i, false, no6Var.a, null, 0L, j, 0L, null);
            } else if (no6Var.I != null) {
                accountInstance = o68Var.getAccountInstance();
                r7a.Y(accountInstance, no6Var.I, no6Var.c, null, o68Var.l1, null, null, null, no6Var.n, no6Var.r, null, no6Var.x, null, oecVar, z, i, false, no6Var.a, null, 0L, j, 0L, null);
            }
            if (j <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            o68Var.a0(z3);
        }
    }

    @Override
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override
    public final View getFragmentView() {
        return this.a;
    }

    @Override
    public final Activity getParentActivity() {
        return hl.W(this.a.getContext());
    }

    @Override
    public final boolean y() {
        return false;
    }
}
