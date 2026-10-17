package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.u6;
import com.google.android.gms.internal.cast.a6;
import ei.bc;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.sn;
public final class n1 extends hm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f11992c;
    public final sn f11993f;
    public int h;
    public int f11994n;
    public final d6 f11996s;
    public final int v;
    public final boolean f11997w;
    public String f11998x;
    public u6 f11999y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f11995r = UserConfig.selectedAccount;
    public final bc E = new bc(this, 13);

    public n1(Context context, sn snVar, d6 d6Var, int i10, boolean z10) {
        this.f11996s = d6Var;
        this.f11992c = context;
        this.f11993f = snVar;
        this.v = i10;
        this.f11997w = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
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
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f11999y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f11994n;
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
        int i10 = this.f11995r;
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
        int i14 = this.f11994n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f11994n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f11994n = i12;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = b1Var.f45941f;
        View view = b1Var.f45938a;
        if (i13 == 0) {
            r2 r2Var = (r2) view;
            r2Var.f22896s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f11997w) {
                r2Var.f22888r0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f11995r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                z10 = true;
                i11 = i14;
            }
            r2Var.W(dialogId, messageObject, i11, z10, false);
            r2Var.setDialogCellDelegate(new k1(this));
        } else if (i13 == 2) {
            ((m1) view).a(this.f11999y);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        b10 b10Var;
        if (i10 != 0) {
            d6 d6Var = this.f11996s;
            Context context = this.f11992c;
            if (i10 != 1) {
                if (i10 != 2) {
                    r2Var = null;
                } else {
                    b10Var = new m1(context, d6Var);
                }
            } else {
                b10 b10Var2 = new b10(context, d6Var);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(7);
                b10Var = b10Var2;
            }
            r2Var = b10Var;
        } else {
            r2Var = new r2(null, this.f11992c, true, this.f11995r, this.f11996s);
        }
        return a6.l(r2Var, r2Var, -1, -2);
    }
}
