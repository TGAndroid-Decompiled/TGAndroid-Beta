package fi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.f20;
import org.telegram.messenger.ff;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p40;
public final class v2 implements p40 {
    public final z3 f12683a;

    public v2(z3 z3Var) {
        this.f12683a = z3Var;
    }

    @Override
    public final long a() {
        return this.f12683a.l1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f12683a.f12882j2;
    }

    @Override
    public final View getFragmentView() {
        return this.f12683a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f12683a.getContext());
    }

    @Override
    public final void u(ff ffVar, f20 f20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z3 z3Var = this.f12683a;
        TL_stories.StoryItem storyItem = z3Var.f12937y1.f12765a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = z3Var.l1;
            if (ffVar.f28059b) {
                if (f20Var != null) {
                    accountInstance4 = z3Var.getAccountInstance();
                    String str = ffVar.I;
                    long j10 = z3Var.l1;
                    ArrayList arrayList = ffVar.f28069n;
                    az.b0(ffVar.f28078x, i7, i10, j10, 0L, j3, 0L, ffVar.f28058a, str, null, arrayList, accountInstance4, null, null, null, null, null, f20Var, null, storyItem, null, z10, false, ffVar.M);
                } else {
                    accountInstance3 = z3Var.getAccountInstance();
                    String str2 = ffVar.I;
                    long j11 = z3Var.l1;
                    ArrayList arrayList2 = ffVar.f28069n;
                    az.b0(ffVar.f28078x, i7, i10, j11, 0L, j3, 0L, ffVar.f28058a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
                }
            } else if (ffVar.h != null) {
                accountInstance2 = z3Var.getAccountInstance();
                az.Z(accountInstance2, ffVar.h, ffVar.f28060c, null, z3Var.l1, null, null, null, ffVar.f28069n, ffVar.f28073r, null, ffVar.f28078x, null, f20Var, z10, i7, false, ffVar.f28058a, null, 0L, j3, 0L, null);
            } else if (ffVar.I != null) {
                accountInstance = z3Var.getAccountInstance();
                az.Z(accountInstance, ffVar.I, ffVar.f28060c, null, z3Var.l1, null, null, null, ffVar.f28069n, ffVar.f28073r, null, ffVar.f28078x, null, f20Var, z10, i7, false, ffVar.f28058a, null, 0L, j3, 0L, null);
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
