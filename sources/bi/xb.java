package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class xb {
    public static final xb[] f4001f = new xb[4];
    public final int f4002a;
    public final LongSparseLongArray f4003b = new LongSparseLongArray();
    public final ArrayList f4004c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final wb f4005e;

    public xb(int i10) {
        new ArrayList();
        this.f4005e = new wb(this);
        this.f4002a = i10;
    }

    public final void a(org.telegram.ui.Components.ia iaVar) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f4004c;
        arrayList.clear();
        for (int i10 = 0; i10 < iaVar.getChildCount(); i10++) {
            View childAt = iaVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                j3 = ((org.telegram.ui.Cells.r2) childAt).getDialogId();
            } else if (childAt instanceof org.telegram.ui.Cells.za) {
                j3 = ((org.telegram.ui.Cells.za) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i11 = this.f4002a;
            LongSparseLongArray longSparseLongArray = this.f4003b;
            if (j3 > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            wb wbVar = this.f4005e;
            AndroidUtilities.cancelRunOnUIThread(wbVar);
            AndroidUtilities.runOnUIThread(wbVar, 300L);
        }
    }
}
