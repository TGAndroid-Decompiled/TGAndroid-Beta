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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.xn;
public final class o1 extends xl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f9864c;
    public final xn f9865f;
    public int h;
    public int f9866n;
    public final e6 f9868s;
    public final int v;
    public final boolean f9869w;
    public String f9870x;
    public v8 f9871y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f9867r = UserConfig.selectedAccount;
    public final qc E = new qc(this, 16);

    public o1(Context context, xn xnVar, e6 e6Var, int i10, boolean z10) {
        this.f9868s = e6Var;
        this.f9864c = context;
        this.f9865f = xnVar;
        this.v = i10;
        this.f9869w = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
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
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f9871y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f9866n;
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
        int i10 = this.f9867r;
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
        int i14 = this.f9866n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f9866n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f9866n = i12;
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
        int i13 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i13 == 0) {
            s2 s2Var = (s2) view;
            s2Var.f21014s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f9869w) {
                s2Var.f21006r0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f9867r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z10 = true;
            }
            s2Var.W(dialogId, messageObject, i11, z10, false);
            s2Var.setDialogCellDelegate(new l1(this));
        } else if (i13 == 2) {
            ((n1) view).a(this.f9871y);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s2Var;
        v00 v00Var;
        if (i10 != 0) {
            e6 e6Var = this.f9868s;
            Context context = this.f9864c;
            if (i10 != 1) {
                if (i10 != 2) {
                    s2Var = null;
                } else {
                    v00Var = new n1(context, e6Var);
                }
            } else {
                v00 v00Var2 = new v00(context, e6Var);
                v00Var2.setIsSingleCell(true);
                v00Var2.setViewType(7);
                v00Var = v00Var2;
            }
            s2Var = v00Var;
        } else {
            s2Var = new s2(null, this.f9864c, true, this.f9867r, this.f9868s);
        }
        return com.google.android.gms.internal.vision.e2.k(s2Var, s2Var, -1, -2);
    }
}
