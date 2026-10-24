package ci;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck;
import org.telegram.ui.in;
public final class c3 implements ck {
    public final p4 f5216a;

    public c3(p4 p4Var) {
        this.f5216a = p4Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        boolean z12;
        p4 p4Var = this.f5216a;
        TL_stories.StoryItem storyItem = p4Var.O1.f5595a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = p4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, p4Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (in) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            p4Var.j0(z12);
        }
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.o2 o2Var = this.f5216a.J0.f6233f;
            if (o2Var.getParentActivity() == null) {
                return;
            }
            o2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
