package ei;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.yy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lj;
public final class z2 implements lj {
    public final j4 f11265a;

    public z2(j4 j4Var) {
        this.f11265a = j4Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.d2 d2Var = this.f11265a.f10506t0.f10922f;
            if (d2Var.getParentActivity() == null) {
                return;
            }
            d2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        boolean z12;
        j4 j4Var = this.f11265a;
        TL_stories.StoryItem storyItem = j4Var.f10527y1.f10358a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = j4Var.getAccountInstance();
            yy.V(i3, j4Var.f10477l1, 0L, j11, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            j4Var.i0(z12);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
