package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bi.d8;
import di.nb;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.co;
public final class o1 extends kl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f11193c;
    public final co f11195f;
    public int h;
    public int f11196n;
    public final f6 f11198s;
    public final int v;
    public final boolean f11199w;
    public String f11200x;
    public d8 f11201y;
    public final HashSet d = new HashSet();
    public final ArrayList f11194e = new ArrayList();
    public final int f11197r = UserConfig.selectedAccount;
    public final nb E = new nb(this, 21);

    public o1(Context context, co coVar, f6 f6Var, int i10, boolean z10) {
        this.f11198s = f6Var;
        this.f11193c = context;
        this.f11195f = coVar;
        this.v = i10;
        this.f11199w = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f11194e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f11201y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f11194e.size() + this.f11196n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f11194e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f11194e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f11197r;
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
        int i14 = this.f11196n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f11196n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f11196n = i12;
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
        int i13 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i13 == 0) {
            r2 r2Var = (r2) view;
            r2Var.f22625s2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f11199w) {
                r2Var.f22617r0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f11197r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z10 = true;
            }
            r2Var.W(dialogId, messageObject, i11, z10, false);
            r2Var.setDialogCellDelegate(new l1(this));
        } else if (i13 == 2) {
            ((n1) view).a(this.f11201y);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        t00 t00Var;
        if (i10 != 0) {
            f6 f6Var = this.f11198s;
            Context context = this.f11193c;
            if (i10 != 1) {
                if (i10 != 2) {
                    r2Var = null;
                } else {
                    t00Var = new n1(context, f6Var);
                }
            } else {
                t00 t00Var2 = new t00(context, f6Var);
                t00Var2.setIsSingleCell(true);
                t00Var2.setViewType(7);
                t00Var = t00Var2;
            }
            r2Var = t00Var;
        } else {
            r2Var = new r2(null, this.f11193c, true, this.f11197r, this.f11198s);
        }
        return com.google.android.gms.internal.vision.e2.l(r2Var, r2Var, -1, -2);
    }
}
