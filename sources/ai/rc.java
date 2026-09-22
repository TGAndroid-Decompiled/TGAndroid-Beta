package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class rc {
    public static final rc[] f1483f = new rc[4];
    public final int f1484a;
    public final LongSparseLongArray f1485b = new LongSparseLongArray();
    public final ArrayList f1486c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final qc e;

    public rc(int i10) {
        new ArrayList();
        this.e = new qc(this);
        this.f1484a = i10;
    }

    public final void a(org.telegram.ui.Components.ha haVar) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f1486c;
        arrayList.clear();
        for (int i10 = 0; i10 < haVar.getChildCount(); i10++) {
            View childAt = haVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                j3 = ((org.telegram.ui.Cells.s2) childAt).getDialogId();
            } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                j3 = ((org.telegram.ui.Cells.ab) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i11 = this.f1484a;
            LongSparseLongArray longSparseLongArray = this.f1485b;
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
            qc qcVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            AndroidUtilities.runOnUIThread(qcVar, 300L);
        }
    }
}
