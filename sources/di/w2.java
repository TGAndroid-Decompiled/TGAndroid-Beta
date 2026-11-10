package di;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lj;
public final class w2 implements lj {
    public final j4 f9897a;

    public w2(j4 j4Var) {
        this.f9897a = j4Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.f2 f2Var = this.f9897a.f9229s0.f9613f;
            if (f2Var.getParentActivity() == null) {
                return;
            }
            f2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        org.telegram.messenger.c accountInstance;
        boolean z11;
        j4 j4Var = this.f9897a;
        TL_stories.StoryItem storyItem = j4Var.f9250x1.f9069a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = j4Var.getAccountInstance();
            gz.V(i7, j4Var.f9201k1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z9, false);
            if (j10 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var.i0(z11);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
