package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ih.h6;
import java.util.ArrayList;
import java.util.HashSet;
import mh.m2;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.qn;
public final class j1 extends vk0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f19376c;
    public final qn f19378f;
    public int h;
    public int f19379n;
    public final b6 f19381s;
    public final int v;
    public final boolean f19382w;
    public String f19383x;
    public h6 f19384y;
    public final HashSet d = new HashSet();
    public final ArrayList f19377e = new ArrayList();
    public final int f19380r = UserConfig.selectedAccount;
    public final m2 A = new m2(this, 3);

    public j1(Context context, qn qnVar, b6 b6Var, int i9, boolean z10) {
        this.f19381s = b6Var;
        this.f19376c = context;
        this.f19378f = qnVar;
        this.v = i9;
        this.f19382w = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f19377e;
            if (i9 < arrayList.size()) {
                return arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesListUpdated && objArr[0] == this.f19384y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f19377e.size() + this.f19379n;
    }

    @Override
    public final int j(int i9) {
        if (i9 < this.f19377e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f19377e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i9 = this.f19380r;
        int i10 = this.v;
        if (i10 == 0) {
            messages = MediaDataController.getInstance(i9).getFoundMessageObjects();
        } else {
            messages = HashtagSearchController.getInstance(i9).getMessages(i10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < messages.size(); i12++) {
            MessageObject messageObject = messages.get(i12);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i13 = this.f19379n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!HashtagSearchController.getInstance(i9).isEndReached(i10) && this.h != 0) {
                i11 = Utilities.clamp(HashtagSearchController.getInstance(i9).getCount(i10) - this.h, 3, 0);
            }
            this.f19379n = i11;
        } else {
            if (!MediaDataController.getInstance(i9).searchEndReached() && this.h != 0) {
                i11 = Utilities.clamp(MediaDataController.getInstance(i9).getSearchCount() - this.h, 3, 0);
            }
            this.f19379n = i11;
        }
        int h10 = h();
        if (h < h10) {
            if (i13 > 0) {
                q(h - i13, i13);
            }
            s(h, h10 - h);
            return;
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        int i11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i12 == 0) {
            r2 r2Var = (r2) view;
            r2Var.f25024o2 = true;
            MessageObject messageObject = (MessageObject) E(i9);
            long dialogId = messageObject.getDialogId();
            int i13 = messageObject.messageOwner.date;
            if (this.f19382w) {
                r2Var.f25017n0 = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i10 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i10 == 0) {
                        i11 = messageFwdHeader.saved_date;
                    } else {
                        dialogId = savedDialogId;
                        z10 = false;
                    }
                } else {
                    i11 = message.date;
                }
                dialogId = savedDialogId;
                i10 = i11;
                z10 = false;
            } else {
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f19380r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i10 = i13;
                z10 = true;
            }
            r2Var.V(dialogId, messageObject, i10, z10, false);
            r2Var.setDialogCellDelegate(new g1(this));
        } else if (i12 == 2) {
            ((i1) view).a(this.f19384y);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View r2Var;
        e00 e00Var;
        if (i9 != 0) {
            b6 b6Var = this.f19381s;
            Context context = this.f19376c;
            if (i9 != 1) {
                if (i9 != 2) {
                    r2Var = null;
                } else {
                    e00Var = new i1(context, b6Var);
                }
            } else {
                e00 e00Var2 = new e00(context, b6Var);
                e00Var2.setIsSingleCell(true);
                e00Var2.setViewType(7);
                e00Var = e00Var2;
            }
            r2Var = e00Var;
        } else {
            r2Var = new r2(null, this.f19376c, true, this.f19380r, this.f19381s);
        }
        return j3.r0.s(r2Var, r2Var, -1, -2);
    }
}
