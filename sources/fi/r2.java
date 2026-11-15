package fi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tj;
public final class r2 implements tj {
    public final b4 f12260a;

    public r2(b4 b4Var) {
        this.f12260a = b4Var;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.e2 e2Var = this.f12260a.f11522t0.f11844f;
            if (e2Var.getParentActivity() == null) {
                return;
            }
            e2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        boolean z12;
        b4 b4Var = this.f12260a;
        TL_stories.StoryItem storyItem = b4Var.f11543y1.f12579a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = b4Var.getAccountInstance();
            ez.V(i7, b4Var.l1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            b4Var.i0(z12);
        }
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
