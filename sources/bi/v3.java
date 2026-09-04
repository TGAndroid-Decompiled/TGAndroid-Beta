package bi;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fk;
import org.telegram.ui.sn;
public final class v3 implements fk {
    public final o5 f3891a;

    public v3(o5 o5Var) {
        this.f3891a = o5Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        boolean z12;
        o5 o5Var = this.f3891a;
        TL_stories.StoryItem storyItem = o5Var.O1.f3310a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = o5Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, o5Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (sn) null, (MessageObject) null, z10, i10, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j10);
            if (j10 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            o5Var.k0(z12);
        }
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.n2 n2Var = this.f3891a.J0.f3545f;
            if (n2Var.getParentActivity() == null) {
                return;
            }
            n2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
