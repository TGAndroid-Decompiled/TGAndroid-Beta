package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class z18 implements vo5 {
    public final y28 a;

    public z18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final void G(jm6 jm6Var, oac oacVar, boolean z, int i, boolean z2, long j) {
        j5 accountInstance;
        j5 accountInstance2;
        boolean z3;
        j5 accountInstance3;
        y28 y28Var = this.a;
        TL_stories.StoryItem storyItem = y28Var.E1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = y28Var.r1;
            if (jm6Var.b) {
                accountInstance3 = y28Var.getAccountInstance();
                String str = jm6Var.I;
                long j2 = y28Var.r1;
                ArrayList arrayList = jm6Var.n;
                z3a.a0(jm6Var.x, i, j2, 0L, j, 0L, accountInstance3, null, null, null, null, null, null, oacVar, jm6Var.a, str, null, arrayList, null, storyItem, z, false, jm6Var.M);
            } else if (jm6Var.h != null) {
                accountInstance2 = y28Var.getAccountInstance();
                z3a.Y(accountInstance2, jm6Var.h, jm6Var.c, null, y28Var.r1, null, null, null, jm6Var.n, jm6Var.r, null, jm6Var.x, null, oacVar, z, i, false, jm6Var.a, null, 0L, j, 0L, null);
            } else if (jm6Var.I != null) {
                accountInstance = y28Var.getAccountInstance();
                z3a.Y(accountInstance, jm6Var.I, jm6Var.c, null, y28Var.r1, null, null, null, jm6Var.n, jm6Var.r, null, jm6Var.x, null, oacVar, z, i, false, jm6Var.a, null, 0L, j, 0L, null);
            }
            if (j <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            y28Var.a0(z3);
        }
    }

    @Override
    public final int getClassGuid() {
        return this.a.p2;
    }

    @Override
    public final View getFragmentView() {
        return this.a;
    }

    @Override
    public final Activity getParentActivity() {
        return gl.W(this.a.getContext());
    }

    @Override
    public final boolean y() {
        return false;
    }
}
