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
    public final i4 f8868a;

    public c3(i4 i4Var) {
        this.f8868a = i4Var;
    }

    @Override
    public final long a() {
        return this.f8868a.f9164k1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f8868a.f9158i2;
    }

    @Override
    public final View getFragmentView() {
        return this.f8868a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f8868a.getContext());
    }

    @Override
    public final void u(gf gfVar, j20 j20Var, boolean z9, int i7, int i10, boolean z10, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z11;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        i4 i4Var = this.f8868a;
        TL_stories.StoryItem storyItem = i4Var.f9213x1.f9038a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = i4Var.f9164k1;
            if (gfVar.f26845b) {
                if (j20Var != null) {
                    accountInstance4 = i4Var.getAccountInstance();
                    String str = gfVar.I;
                    long j10 = i4Var.f9164k1;
                    ArrayList arrayList = gfVar.f26855n;
                    gz.b0(gfVar.f26864x, i7, i10, j10, 0L, j3, 0L, gfVar.f26844a, str, null, arrayList, accountInstance4, null, null, null, null, null, j20Var, null, storyItem, null, z9, false, gfVar.M);
                } else {
                    accountInstance3 = i4Var.getAccountInstance();
                    String str2 = gfVar.I;
                    long j11 = i4Var.f9164k1;
                    ArrayList arrayList2 = gfVar.f26855n;
                    gz.b0(gfVar.f26864x, i7, i10, j11, 0L, j3, 0L, gfVar.f26844a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z9, false, gfVar.M);
                }
            } else if (gfVar.h != null) {
                accountInstance2 = i4Var.getAccountInstance();
                gz.Z(accountInstance2, gfVar.h, gfVar.f26846c, null, i4Var.f9164k1, null, null, null, gfVar.f26855n, gfVar.f26859r, null, gfVar.f26864x, null, j20Var, z9, i7, false, gfVar.f26844a, null, 0L, j3, 0L, null);
            } else if (gfVar.I != null) {
                accountInstance = i4Var.getAccountInstance();
                gz.Z(accountInstance, gfVar.I, gfVar.f26846c, null, i4Var.f9164k1, null, null, null, gfVar.f26855n, gfVar.f26859r, null, gfVar.f26864x, null, j20Var, z9, i7, false, gfVar.f26844a, null, 0L, j3, 0L, null);
            }
            if (j3 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var.i0(z11);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
