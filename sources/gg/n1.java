package gg;

import ai.w8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.rc;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.zn;
public final class n1 extends qm0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f10739c;
    public final zn f10741f;
    public int h;
    public int f10742n;
    public final e6 f10744s;
    public final int v;
    public final boolean f10745w;
    public String f10746x;
    public w8 f10747y;
    public final HashSet d = new HashSet();
    public final ArrayList f10740e = new ArrayList();
    public final int f10743r = UserConfig.selectedAccount;
    public final rc E = new rc(this, 16);

    public n1(Context context, zn znVar, e6 e6Var, int i10, boolean z10) {
        this.f10744s = e6Var;
        this.f10739c = context;
        this.f10741f = znVar;
        this.v = i10;
        this.f10745w = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f10740e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f10747y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f10740e.size() + this.f10742n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f10740e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f10740e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f10743r;
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
        int i14 = this.f10742n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f10742n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f10742n = i12;
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i13 == 0) {
            s2 s2Var = (s2) view;
            s2Var.f22861s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f10745w) {
                s2Var.f22853r0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f10743r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                z10 = true;
                i11 = i14;
            }
            s2Var.W(dialogId, messageObject, i11, z10, false);
            s2Var.setDialogCellDelegate(new k1(this));
        } else if (i13 == 2) {
            ((m1) view).a(this.f10747y);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View s2Var;
        k10 k10Var;
        if (i10 != 0) {
            e6 e6Var = this.f10744s;
            Context context = this.f10739c;
            if (i10 != 1) {
                if (i10 != 2) {
                    s2Var = null;
                } else {
                    k10Var = new m1(context, e6Var);
                }
            } else {
                k10 k10Var2 = new k10(context, e6Var);
                k10Var2.setIsSingleCell(true);
                k10Var2.setViewType(7);
                k10Var = k10Var2;
            }
            s2Var = k10Var;
        } else {
            s2Var = new s2(null, this.f10739c, true, this.f10743r, this.f10744s);
        }
        return com.google.android.gms.internal.vision.e2.k(s2Var, s2Var, -1, -2);
    }
}
