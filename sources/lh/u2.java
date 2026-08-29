package lh;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.zj;
import org.telegram.ui.jn;
public final class u2 implements zj {
    public final d4 f16291a;

    public u2(d4 d4Var) {
        this.f16291a = d4Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        boolean z12;
        d4 d4Var = this.f16291a;
        TL_stories.StoryItem storyItem = d4Var.K1.f15374a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = d4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, d4Var.f15540x1, (MessageObject) null, (MessageObject) null, storyItem, (jn) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            d4Var.k0(z12);
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.o2 o2Var = this.f16291a.F0.f15756f;
            if (o2Var.getParentActivity() == null) {
                return;
            }
            o2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
