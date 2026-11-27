package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
public final class m58 implements k32 {
    public final o68 a;

    public m58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        k5 accountInstance;
        boolean z3;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = o68Var.getAccountInstance();
            r7a.U(i, o68Var.l1, 0L, j2, 0L, accountInstance, null, null, null, null, null, null, null, null, str, null, arrayList, arrayList, null, null, null, null, storyItem, z, false);
            if (j2 <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            o68Var.a0(z3);
        }
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            e eVar = this.a.t0.f;
            if (eVar.getParentActivity() == null) {
                return;
            }
            eVar.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
