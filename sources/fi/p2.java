package fi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck;
public final class p2 implements ck {
    public final z3 f12412a;

    public p2(z3 z3Var) {
        this.f12412a = z3Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.g2 g2Var = this.f12412a.f12913t0.f12007f;
            if (g2Var.getParentActivity() == null) {
                return;
            }
            g2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        boolean z12;
        z3 z3Var = this.f12412a;
        TL_stories.StoryItem storyItem = z3Var.f12934y1.f12762a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = z3Var.getAccountInstance();
            zy.V(i7, z3Var.l1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z3Var.i0(z12);
        }
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
