package ih;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wj;
import org.telegram.ui.gn;
public final class w2 implements wj {
    public final i4 f12288a;

    public w2(i4 i4Var) {
        this.f12288a = i4Var;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        boolean z12;
        i4 i4Var = this.f12288a;
        TL_stories.StoryItem storyItem = i4Var.K1.f11466a;
        if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            accountInstance = i4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, i4Var.f11604x1, (MessageObject) null, (MessageObject) null, storyItem, (gn) null, (MessageObject) null, z10, i9, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j11);
            if (j11 <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            i4Var.k0(z12);
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.o2 o2Var = this.f12288a.F0.f11797f;
            if (o2Var.getParentActivity() == null) {
                return;
            }
            o2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void N() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
    }
}
