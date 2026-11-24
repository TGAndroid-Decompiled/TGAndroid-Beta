package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class y38 implements f42 {
    public final a58 a;

    public y38(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        j5 accountInstance;
        boolean z3;
        a58 a58Var = this.a;
        TL_stories.StoryItem storyItem = a58Var.E1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = a58Var.getAccountInstance();
            a6a.U(i, a58Var.r1, 0L, j2, 0L, accountInstance, null, null, null, null, null, null, null, null, str, null, arrayList, arrayList, null, null, null, null, storyItem, z, false);
            if (j2 <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a58Var.a0(z3);
        }
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            d dVar = this.a.z0.f;
            if (dVar.getParentActivity() == null) {
                return;
            }
            dVar.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
