package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.wa;
public final class ha {
    public static final ha[] f5427f = new ha[4];
    public final int f5428a;
    public final LongSparseLongArray f5429b = new LongSparseLongArray();
    public final ArrayList f5430c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ga e;

    public ha(int i10) {
        new ArrayList();
        this.e = new ga(this);
        this.f5428a = i10;
    }

    public final void a(org.telegram.ui.Components.ga gaVar) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f5430c;
        arrayList.clear();
        for (int i10 = 0; i10 < gaVar.getChildCount(); i10++) {
            View childAt = gaVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q2) {
                j10 = ((org.telegram.ui.Cells.q2) childAt).getDialogId();
            } else if (childAt instanceof wa) {
                j10 = ((wa) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i12 = this.f5428a;
            LongSparseLongArray longSparseLongArray = this.f5429b;
            if (i11 > 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            ga gaVar2 = this.e;
            AndroidUtilities.cancelRunOnUIThread(gaVar2);
            AndroidUtilities.runOnUIThread(gaVar2, 300L);
        }
    }
}
