package nh;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xj;
import org.telegram.ui.nn;
public final class v2 implements xj {
    public final d4 f15985a;

    public v2(d4 d4Var) {
        this.f15985a = d4Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        AccountInstance accountInstance;
        boolean z11;
        d4 d4Var = this.f15985a;
        TL_stories.StoryItem storyItem = d4Var.L1.f15111a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = d4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, d4Var.f15258y1, (MessageObject) null, (MessageObject) null, storyItem, (nn) null, (MessageObject) null, z4, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            d4Var.k0(z11);
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.p2 p2Var = this.f15985a.G0.f15461f;
            if (p2Var.getParentActivity() == null) {
                return;
            }
            p2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
