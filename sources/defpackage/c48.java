package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class c48 implements vq5 {
    public final a58 a;

    public c48(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void G(jo6 jo6Var, rcc rccVar, boolean z, int i, boolean z2, long j) {
        j5 accountInstance;
        j5 accountInstance2;
        boolean z3;
        j5 accountInstance3;
        a58 a58Var = this.a;
        TL_stories.StoryItem storyItem = a58Var.E1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = a58Var.r1;
            if (jo6Var.b) {
                accountInstance3 = a58Var.getAccountInstance();
                String str = jo6Var.I;
                long j2 = a58Var.r1;
                ArrayList arrayList = jo6Var.n;
                a6a.a0(jo6Var.x, i, j2, 0L, j, 0L, accountInstance3, null, null, null, null, null, null, rccVar, jo6Var.a, str, null, arrayList, null, storyItem, z, false, jo6Var.M);
            } else if (jo6Var.h != null) {
                accountInstance2 = a58Var.getAccountInstance();
                a6a.Y(accountInstance2, jo6Var.h, jo6Var.c, null, a58Var.r1, null, null, null, jo6Var.n, jo6Var.r, null, jo6Var.x, null, rccVar, z, i, false, jo6Var.a, null, 0L, j, 0L, null);
            } else if (jo6Var.I != null) {
                accountInstance = a58Var.getAccountInstance();
                a6a.Y(accountInstance, jo6Var.I, jo6Var.c, null, a58Var.r1, null, null, null, jo6Var.n, jo6Var.r, null, jo6Var.x, null, rccVar, z, i, false, jo6Var.a, null, 0L, j, 0L, null);
            }
            if (j <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a58Var.a0(z3);
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
        return gm.W(this.a.getContext());
    }

    @Override
    public final boolean x() {
        return false;
    }
}
