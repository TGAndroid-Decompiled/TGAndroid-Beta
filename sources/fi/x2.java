package fi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.g20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e40;
public final class x2 implements e40 {
    public final b4 f12492a;

    public x2(b4 b4Var) {
        this.f12492a = b4Var;
    }

    @Override
    public final long a() {
        return this.f12492a.l1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f12492a.f11488j2;
    }

    @Override
    public final View getFragmentView() {
        return this.f12492a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f12492a.getContext());
    }

    @Override
    public final void u(ff ffVar, g20 g20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        b4 b4Var = this.f12492a;
        TL_stories.StoryItem storyItem = b4Var.f11543y1.f12579a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = b4Var.l1;
            if (ffVar.f27708b) {
                if (g20Var != null) {
                    accountInstance4 = b4Var.getAccountInstance();
                    String str = ffVar.I;
                    long j10 = b4Var.l1;
                    ArrayList arrayList = ffVar.f27718n;
                    ez.b0(ffVar.f27727x, i7, i10, j10, 0L, j3, 0L, ffVar.f27707a, str, null, arrayList, accountInstance4, null, null, null, null, null, g20Var, null, storyItem, null, z10, false, ffVar.M);
                } else {
                    accountInstance3 = b4Var.getAccountInstance();
                    String str2 = ffVar.I;
                    long j11 = b4Var.l1;
                    ArrayList arrayList2 = ffVar.f27718n;
                    ez.b0(ffVar.f27727x, i7, i10, j11, 0L, j3, 0L, ffVar.f27707a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
                }
            } else if (ffVar.h != null) {
                accountInstance2 = b4Var.getAccountInstance();
                ez.Z(accountInstance2, ffVar.h, ffVar.f27709c, null, b4Var.l1, null, null, null, ffVar.f27718n, ffVar.f27722r, null, ffVar.f27727x, null, g20Var, z10, i7, false, ffVar.f27707a, null, 0L, j3, 0L, null);
            } else if (ffVar.I != null) {
                accountInstance = b4Var.getAccountInstance();
                ez.Z(accountInstance, ffVar.I, ffVar.f27709c, null, b4Var.l1, null, null, null, ffVar.f27718n, ffVar.f27722r, null, ffVar.f27727x, null, g20Var, z10, i7, false, ffVar.f27707a, null, 0L, j3, 0L, null);
            }
            if (j3 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            b4Var.i0(z12);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
