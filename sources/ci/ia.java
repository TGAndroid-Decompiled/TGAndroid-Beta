package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.va;
public final class ia {
    public static final ia[] f5521f = new ia[4];
    public final int f5522a;
    public final LongSparseLongArray f5523b = new LongSparseLongArray();
    public final ArrayList f5524c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ha e;

    public ia(int i10) {
        new ArrayList();
        this.e = new ha(this);
        this.f5522a = i10;
    }

    public final void a(org.telegram.ui.Components.ia iaVar) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f5524c;
        arrayList.clear();
        for (int i10 = 0; i10 < iaVar.getChildCount(); i10++) {
            View childAt = iaVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                j10 = ((org.telegram.ui.Cells.r2) childAt).getDialogId();
            } else if (childAt instanceof va) {
                j10 = ((va) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i12 = this.f5522a;
            LongSparseLongArray longSparseLongArray = this.f5523b;
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
            ha haVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(haVar);
            AndroidUtilities.runOnUIThread(haVar, 300L);
        }
    }
}
