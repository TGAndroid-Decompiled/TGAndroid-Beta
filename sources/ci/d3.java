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
import org.telegram.ui.Components.ek;
import org.telegram.ui.gn;
public final class d3 implements ek {
    public final q4 f5314a;

    public d3(q4 q4Var) {
        this.f5314a = q4Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        boolean z12;
        q4 q4Var = this.f5314a;
        TL_stories.StoryItem storyItem = q4Var.O1.f5688a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = q4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, q4Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (gn) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q4Var.k0(z12);
        }
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.n2 n2Var = this.f5314a.J0.f5187f;
            if (n2Var.getParentActivity() == null) {
                return;
            }
            n2Var.getParentActivity().startActivityForResult(intent, 21);
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
