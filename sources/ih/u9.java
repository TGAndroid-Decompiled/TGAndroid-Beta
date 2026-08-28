package ih;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.aa;
public final class u9 {
    public static final u9[] f12212f = new u9[4];
    public final int f12213a;
    public final LongSparseLongArray f12214b = new LongSparseLongArray();
    public final ArrayList f12215c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final t9 f12216e;

    public u9(int i9) {
        new ArrayList();
        this.f12216e = new t9(this);
        this.f12213a = i9;
    }

    public final void a(aa aaVar) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f12215c;
        arrayList.clear();
        for (int i9 = 0; i9 < aaVar.getChildCount(); i9++) {
            View childAt = aaVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                j10 = ((org.telegram.ui.Cells.r2) childAt).getDialogId();
            } else if (childAt instanceof va) {
                j10 = ((va) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i10 = this.f12213a;
            LongSparseLongArray longSparseLongArray = this.f12214b;
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !user.bot && !user.self && !user.contact && (userStatus = user.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (ChatObject.isChannel(chat) && !ChatObject.isMonoForum(chat) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            t9 t9Var = this.f12216e;
            AndroidUtilities.cancelRunOnUIThread(t9Var);
            AndroidUtilities.runOnUIThread(t9Var, 300L);
        }
    }
}
