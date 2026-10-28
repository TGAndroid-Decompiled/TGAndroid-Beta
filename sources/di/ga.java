package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Components.nm0;
public final class ga {
    public static final ga[] f8598f = new ga[4];
    public final int f8599a;
    public final LongSparseLongArray f8600b = new LongSparseLongArray();
    public final ArrayList f8601c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final fa e;

    public ga(int i10) {
        new ArrayList();
        this.e = new fa(this);
        this.f8599a = i10;
    }

    public final void a(nm0 nm0Var) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f8601c;
        arrayList.clear();
        for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
            View childAt = nm0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                j10 = ((org.telegram.ui.Cells.p2) childAt).getDialogId();
            } else if (childAt instanceof ab) {
                j10 = ((ab) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i12 = this.f8599a;
            LongSparseLongArray longSparseLongArray = this.f8600b;
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
            fa faVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(faVar);
            AndroidUtilities.runOnUIThread(faVar, 300L);
        }
    }
}
