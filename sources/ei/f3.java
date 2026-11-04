package ei;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.b20;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.x30;
public final class f3 implements x30 {
    public final j4 f10262a;

    public f3(j4 j4Var) {
        this.f10262a = j4Var;
    }

    @Override
    public final long a() {
        return this.f10262a.f10477l1;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int getClassGuid() {
        return this.f10262a.f10471j2;
    }

    @Override
    public final View getFragmentView() {
        return this.f10262a;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f10262a.getContext());
    }

    @Override
    public final void u(ye yeVar, b20 b20Var, boolean z10, int i3, int i10, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        boolean z12;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        j4 j4Var = this.f10262a;
        TL_stories.StoryItem storyItem = j4Var.f10527y1.f10358a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            storyItem.dialogId = j4Var.f10477l1;
            if (yeVar.f25310b) {
                if (b20Var != null) {
                    accountInstance4 = j4Var.getAccountInstance();
                    String str = yeVar.I;
                    long j11 = j4Var.f10477l1;
                    ArrayList arrayList = yeVar.f25320n;
                    yy.b0(yeVar.f25329x, i3, i10, j11, 0L, j10, 0L, yeVar.f25309a, str, null, arrayList, accountInstance4, null, null, null, null, null, b20Var, null, storyItem, null, z10, false, yeVar.M);
                } else {
                    accountInstance3 = j4Var.getAccountInstance();
                    String str2 = yeVar.I;
                    long j12 = j4Var.f10477l1;
                    ArrayList arrayList2 = yeVar.f25320n;
                    yy.b0(yeVar.f25329x, i3, i10, j12, 0L, j10, 0L, yeVar.f25309a, str2, null, arrayList2, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, yeVar.M);
                }
            } else if (yeVar.h != null) {
                accountInstance2 = j4Var.getAccountInstance();
                yy.Z(accountInstance2, yeVar.h, yeVar.f25311c, null, j4Var.f10477l1, null, null, null, yeVar.f25320n, yeVar.f25324r, null, yeVar.f25329x, null, b20Var, z10, i3, false, yeVar.f25309a, null, 0L, j10, 0L, null);
            } else if (yeVar.I != null) {
                accountInstance = j4Var.getAccountInstance();
                yy.Z(accountInstance, yeVar.I, yeVar.f25311c, null, j4Var.f10477l1, null, null, null, yeVar.f25320n, yeVar.f25324r, null, yeVar.f25329x, null, b20Var, z10, i3, false, yeVar.f25309a, null, 0L, j10, 0L, null);
            }
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            j4Var.i0(z12);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
