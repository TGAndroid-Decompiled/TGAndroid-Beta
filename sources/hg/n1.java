package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bi.g8;
import com.google.android.gms.internal.play_billing.k3;
import di.x8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.fo;
public final class n1 extends lm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f10684c;
    public final fo f10685f;
    public int h;
    public int f10686n;
    public final c6 f10688s;
    public final int v;
    public final boolean f10689w;
    public String f10690x;
    public g8 f10691y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f10687r = UserConfig.selectedAccount;
    public final x8 E = new x8(this, 23);

    public n1(Context context, fo foVar, c6 c6Var, int i10, boolean z10) {
        this.f10688s = c6Var;
        this.f10684c = context;
        this.f10685f = foVar;
        this.v = i10;
        this.f10689w = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
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
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f10691y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f10686n;
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
        int i10 = this.f10687r;
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
        int i14 = this.f10686n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f10686n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f10686n = i12;
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
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i13 == 0) {
            s2 s2Var = (s2) view;
            s2Var.f21592s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f10689w) {
                s2Var.f21584r0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f10687r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                z10 = true;
                i11 = i14;
            }
            s2Var.W(dialogId, messageObject, i11, z10, false);
            s2Var.setDialogCellDelegate(new k1(this));
        } else if (i13 == 2) {
            ((m1) view).a(this.f10691y);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View s2Var;
        f10 f10Var;
        if (i10 != 0) {
            c6 c6Var = this.f10688s;
            Context context = this.f10684c;
            if (i10 != 1) {
                if (i10 != 2) {
                    s2Var = null;
                } else {
                    f10Var = new m1(context, c6Var);
                }
            } else {
                f10 f10Var2 = new f10(context, c6Var);
                f10Var2.setIsSingleCell(true);
                f10Var2.setViewType(7);
                f10Var = f10Var2;
            }
            s2Var = f10Var;
        } else {
            s2Var = new s2(null, this.f10684c, true, this.f10687r, this.f10688s);
        }
        return k3.l(s2Var, s2Var, -1, -2);
    }
}
