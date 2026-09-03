package nh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.aa;
public final class q9 {
    public static final q9[] f15792f = new q9[4];
    public final int f15793a;
    public final LongSparseLongArray f15794b = new LongSparseLongArray();
    public final ArrayList f15795c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final p9 e;

    public q9(int i10) {
        new ArrayList();
        this.e = new p9(this);
        this.f15793a = i10;
    }

    public final void a(aa aaVar) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f15795c;
        arrayList.clear();
        for (int i10 = 0; i10 < aaVar.getChildCount(); i10++) {
            View childAt = aaVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q2) {
                j10 = ((org.telegram.ui.Cells.q2) childAt).getDialogId();
            } else if (childAt instanceof ua) {
                j10 = ((ua) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = this.f15793a;
            LongSparseLongArray longSparseLongArray = this.f15794b;
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            p9 p9Var = this.e;
            AndroidUtilities.cancelRunOnUIThread(p9Var);
            AndroidUtilities.runOnUIThread(p9Var, 300L);
        }
    }
}
