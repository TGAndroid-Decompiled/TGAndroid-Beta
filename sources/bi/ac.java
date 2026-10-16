package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class ac {
    public static final ac[] f2844f = new ac[4];
    public final int f2845a;
    public final LongSparseLongArray f2846b = new LongSparseLongArray();
    public final ArrayList f2847c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final zb e;

    public ac(int i10) {
        new ArrayList();
        this.e = new zb(this);
        this.f2845a = i10;
    }

    public final void a(org.telegram.ui.Components.ka kaVar) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f2847c;
        arrayList.clear();
        for (int i10 = 0; i10 < kaVar.getChildCount(); i10++) {
            View childAt = kaVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                j10 = ((org.telegram.ui.Cells.s2) childAt).getDialogId();
            } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                j10 = ((org.telegram.ui.Cells.xa) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i12 = this.f2845a;
            LongSparseLongArray longSparseLongArray = this.f2846b;
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
            zb zbVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(zbVar);
            AndroidUtilities.runOnUIThread(zbVar, 300L);
        }
    }
}
