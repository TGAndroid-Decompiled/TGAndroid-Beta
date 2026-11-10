package di;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b40;
public final class c3 implements b40 {
    public final j4 f8873a;

    public c3(j4 j4Var) {
        this.f8873a = j4Var;
    }

    @Override
    public final long a() {
        return this.f8873a.f9201k1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f8873a.f9195i2;
    }

    @Override
    public final View getFragmentView() {
        return this.f8873a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f8873a.getContext());
    }

    @Override
    public final void u(gf gfVar, j20 j20Var, boolean z9, int i7, int i10, boolean z10, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z11;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        j4 j4Var = this.f8873a;
        TL_stories.StoryItem storyItem = j4Var.f9250x1.f9069a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = j4Var.f9201k1;
            if (gfVar.f26849b) {
                if (j20Var != null) {
                    accountInstance4 = j4Var.getAccountInstance();
                    String str = gfVar.I;
                    long j10 = j4Var.f9201k1;
                    ArrayList arrayList = gfVar.f26859n;
                    gz.b0(gfVar.f26868x, i7, i10, j10, 0L, j3, 0L, gfVar.f26848a, str, null, arrayList, accountInstance4, null, null, null, null, null, j20Var, null, storyItem, null, z9, false, gfVar.M);
                } else {
                    accountInstance3 = j4Var.getAccountInstance();
                    String str2 = gfVar.I;
                    long j11 = j4Var.f9201k1;
                    ArrayList arrayList2 = gfVar.f26859n;
                    gz.b0(gfVar.f26868x, i7, i10, j11, 0L, j3, 0L, gfVar.f26848a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z9, false, gfVar.M);
                }
            } else if (gfVar.h != null) {
                accountInstance2 = j4Var.getAccountInstance();
                gz.Z(accountInstance2, gfVar.h, gfVar.f26850c, null, j4Var.f9201k1, null, null, null, gfVar.f26859n, gfVar.f26863r, null, gfVar.f26868x, null, j20Var, z9, i7, false, gfVar.f26848a, null, 0L, j3, 0L, null);
            } else if (gfVar.I != null) {
                accountInstance = j4Var.getAccountInstance();
                gz.Z(accountInstance, gfVar.I, gfVar.f26850c, null, j4Var.f9201k1, null, null, null, gfVar.f26859n, gfVar.f26863r, null, gfVar.f26868x, null, j20Var, z9, i7, false, gfVar.f26848a, null, 0L, j3, 0L, null);
            }
            if (j3 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var.i0(z11);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
