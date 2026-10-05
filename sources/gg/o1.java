package gg;

import ai.v8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.qc;
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
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.yn;
public final class o1 extends yl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f10733c;
    public final yn f10735f;
    public int h;
    public int f10736n;
    public final d6 f10738s;
    public final int v;
    public final boolean f10739w;
    public String f10740x;
    public v8 f10741y;
    public final HashSet d = new HashSet();
    public final ArrayList f10734e = new ArrayList();
    public final int f10737r = UserConfig.selectedAccount;
    public final qc E = new qc(this, 16);

    public o1(Context context, yn ynVar, d6 d6Var, int i10, boolean z10) {
        this.f10738s = d6Var;
        this.f10733c = context;
        this.f10735f = ynVar;
        this.v = i10;
        this.f10739w = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f10734e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f10741y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f10734e.size() + this.f10736n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f10734e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f10734e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f10737r;
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
        int i14 = this.f10736n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f10736n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f10736n = i12;
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = c1Var.f46542f;
        View view = c1Var.f46538a;
        if (i13 == 0) {
            s2 s2Var = (s2) view;
            s2Var.f22868s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f10739w) {
                s2Var.f22860r0 = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i11 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i11 == 0) {
                        i12 = messageFwdHeader.saved_date;
                    } else {
                        dialogId = savedDialogId;
                        z10 = false;
                    }
                } else {
                    i12 = message.date;
                }
                dialogId = savedDialogId;
                i11 = i12;
                z10 = false;
            } else {
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f10737r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z10 = true;
            }
            s2Var.U(dialogId, messageObject, i11, z10, false);
            s2Var.setDialogCellDelegate(new l1(this));
        } else if (i13 == 2) {
            ((n1) view).a(this.f10741y);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s2Var;
        w00 w00Var;
        if (i10 != 0) {
            d6 d6Var = this.f10738s;
            Context context = this.f10733c;
            if (i10 != 1) {
                if (i10 != 2) {
                    s2Var = null;
                } else {
                    w00Var = new n1(context, d6Var);
                }
            } else {
                w00 w00Var2 = new w00(context, d6Var);
                w00Var2.setIsSingleCell(true);
                w00Var2.setViewType(7);
                w00Var = w00Var2;
            }
            s2Var = w00Var;
        } else {
            s2Var = new s2(null, this.f10733c, true, this.f10737r, this.f10738s);
        }
        return com.google.android.gms.internal.vision.e2.k(s2Var, s2Var, -1, -2);
    }
}
