package jh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.y9;

public final class q9 {

    public static final q9[] f13873f = new q9[4];

    public final int f13874a;

    public final LongSparseLongArray f13875b = new LongSparseLongArray();

    public final ArrayList f13876c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final p9 f13877e;

    public q9(int i10) {
        new ArrayList();
        this.f13877e = new p9(this);
        this.f13874a = i10;
    }

    public final void a(y9 y9Var) {
        TLRPC.UserStatus userStatus;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f13876c;
        arrayList.clear();
        for (int i10 = 0; i10 < y9Var.getChildCount(); i10++) {
            View childAt = y9Var.getChildAt(i10);
            long dialogId = childAt instanceof org.telegram.ui.Cells.p2 ? ((org.telegram.ui.Cells.p2) childAt).getDialogId() : childAt instanceof sa ? ((sa) childAt).getDialogId() : 0L;
            int i11 = this.f13874a;
            LongSparseLongArray longSparseLongArray = this.f13875b;
            if (dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(dialogId));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && jCurrentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, jCurrentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialogId));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && jCurrentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, jCurrentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        p9 p9Var = this.f13877e;
        AndroidUtilities.cancelRunOnUIThread(p9Var);
        AndroidUtilities.runOnUIThread(p9Var, 300L);
    }
}
