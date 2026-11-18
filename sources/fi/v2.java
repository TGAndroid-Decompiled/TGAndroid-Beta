package fi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m40;
public final class v2 implements m40 {
    public final z3 f12639a;

    public v2(z3 z3Var) {
        this.f12639a = z3Var;
    }

    @Override
    public final long a() {
        return this.f12639a.l1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f12639a.f12841j2;
    }

    @Override
    public final View getFragmentView() {
        return this.f12639a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f12639a.getContext());
    }

    @Override
    public final void u(ef efVar, e20 e20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z3 z3Var = this.f12639a;
        TL_stories.StoryItem storyItem = z3Var.f12896y1.f12723a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = z3Var.l1;
            if (efVar.f27849b) {
                if (e20Var != null) {
                    accountInstance4 = z3Var.getAccountInstance();
                    String str = efVar.I;
                    long j10 = z3Var.l1;
                    ArrayList arrayList = efVar.f27859n;
                    zy.b0(efVar.f27868x, i7, i10, j10, 0L, j3, 0L, efVar.f27848a, str, null, arrayList, accountInstance4, null, null, null, null, null, e20Var, null, storyItem, null, z10, false, efVar.M);
                } else {
                    accountInstance3 = z3Var.getAccountInstance();
                    String str2 = efVar.I;
                    long j11 = z3Var.l1;
                    ArrayList arrayList2 = efVar.f27859n;
                    zy.b0(efVar.f27868x, i7, i10, j11, 0L, j3, 0L, efVar.f27848a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, efVar.M);
                }
            } else if (efVar.h != null) {
                accountInstance2 = z3Var.getAccountInstance();
                zy.Z(accountInstance2, efVar.h, efVar.f27850c, null, z3Var.l1, null, null, null, efVar.f27859n, efVar.f27863r, null, efVar.f27868x, null, e20Var, z10, i7, false, efVar.f27848a, null, 0L, j3, 0L, null);
            } else if (efVar.I != null) {
                accountInstance = z3Var.getAccountInstance();
                zy.Z(accountInstance, efVar.I, efVar.f27850c, null, z3Var.l1, null, null, null, efVar.f27859n, efVar.f27863r, null, efVar.f27868x, null, e20Var, z10, i7, false, efVar.f27848a, null, 0L, j3, 0L, null);
            }
            if (j3 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z3Var.i0(z12);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
