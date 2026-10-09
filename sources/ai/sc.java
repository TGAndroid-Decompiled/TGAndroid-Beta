package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class sc {
    public static final sc[] f1715f = new sc[4];
    public final int f1716a;
    public final LongSparseLongArray f1717b = new LongSparseLongArray();
    public final ArrayList f1718c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final rc f1719e;

    public sc(int i10) {
        new ArrayList();
        this.f1719e = new rc(this);
        this.f1716a = i10;
    }

    public final void a(org.telegram.ui.Components.la laVar) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f1718c;
        arrayList.clear();
        for (int i10 = 0; i10 < laVar.getChildCount(); i10++) {
            View childAt = laVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                j3 = ((org.telegram.ui.Cells.s2) childAt).getDialogId();
            } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                j3 = ((org.telegram.ui.Cells.xa) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i12 = this.f1716a;
            LongSparseLongArray longSparseLongArray = this.f1717b;
            if (i11 > 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j3));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            rc rcVar = this.f1719e;
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            AndroidUtilities.runOnUIThread(rcVar, 300L);
        }
    }
}
