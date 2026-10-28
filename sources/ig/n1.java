package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import di.t6;
import fi.ua;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.wn;
public final class n1 extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f14180c;
    public final wn f14181f;
    public int h;
    public int f14182n;
    public final u6 f14184s;
    public final int v;
    public final boolean f14185w;
    public String f14186x;
    public t6 f14187y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f14183r = UserConfig.selectedAccount;
    public final ua E = new ua(this, 20);

    public n1(Context context, wn wnVar, u6 u6Var, int i10, boolean z10) {
        this.f14184s = u6Var;
        this.f14180c = context;
        this.f14181f = wnVar;
        this.v = i10;
        this.f14185w = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f14187y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f14182n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f14183r;
        int i11 = this.v;
        if (i11 == 0) {
            messages = MediaDataController.getInstance(i10).getFoundMessageObjects();
        } else {
            messages = HashtagSearchController.getInstance(i10).getMessages(i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < messages.size(); i13++) {
            MessageObject messageObject = messages.get(i13);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i14 = this.f14182n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f14182n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f14182n = i12;
        }
        int h10 = h();
        if (h < h10) {
            if (i14 > 0) {
                q(h - i14, i14);
            }
            s(h, h10 - h);
            return;
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i13 == 0) {
            p2 p2Var = (p2) view;
            p2Var.f24723s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f14185w) {
                p2Var.f24715r0 = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i11 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i11 == 0) {
                        i12 = messageFwdHeader.saved_date;
                    }
                    z10 = false;
                    dialogId = savedDialogId;
                } else {
                    i12 = message.date;
                }
                i11 = i12;
                z10 = false;
                dialogId = savedDialogId;
            } else {
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f14183r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                z10 = true;
                i11 = i14;
            }
            p2Var.V(dialogId, messageObject, i11, z10, false);
            p2Var.setDialogCellDelegate(new k1(this));
        } else if (i13 == 2) {
            ((m1) view).a(this.f14187y);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View p2Var;
        c10 c10Var;
        if (i10 != 0) {
            u6 u6Var = this.f14184s;
            Context context = this.f14180c;
            if (i10 != 1) {
                if (i10 != 2) {
                    p2Var = null;
                } else {
                    c10Var = new m1(context, u6Var);
                }
            } else {
                c10 c10Var2 = new c10(context, u6Var);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(7);
                c10Var = c10Var2;
            }
            p2Var = c10Var;
        } else {
            p2Var = new p2(null, this.f14180c, true, this.f14183r, this.f14184s);
        }
        return ic.a.n(p2Var, p2Var, -1, -2);
    }
}
