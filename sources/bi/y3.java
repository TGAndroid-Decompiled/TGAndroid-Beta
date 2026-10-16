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
import org.telegram.ui.Components.gk;
import org.telegram.ui.un;
public final class y3 implements gk {
    public final q5 f4010a;

    public y3(q5 q5Var) {
        this.f4010a = q5Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        boolean z12;
        q5 q5Var = this.f4010a;
        TL_stories.StoryItem storyItem = q5Var.O1.f3417a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = q5Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, q5Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (un) null, (MessageObject) null, z10, i10, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q5Var.k0(z12);
        }
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.m2 m2Var = this.f4010a.J0.f3677f;
            if (m2Var.getParentActivity() == null) {
                return;
            }
            m2Var.getParentActivity().startActivityForResult(intent, 21);
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
