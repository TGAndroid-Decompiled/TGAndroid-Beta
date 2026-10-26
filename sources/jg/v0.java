package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.ua;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
public final class v0 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public u5 f15866a;
    public r71 f15867b;
    public b0 f15868c;
    public final int[] d;
    public final String[] e;
    public boolean f15869f;
    public int h;
    public TL_account.TL_businessGreetingMessage f15870n;
    public boolean f15871r;
    public boolean f15872s;
    public int v;

    public v0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.v = 7;
        this.e = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i10 < iArr2.length) {
                this.e[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void V(v0 v0Var, ArrayList arrayList, j71 j71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        t61 t61Var = new t61(2);
        t61Var.f32875l = string;
        t61Var.f32878o = string2;
        t61Var.f32876m = "RestrictedEmoji";
        t61Var.f32877n = "👋";
        arrayList.add(t61Var);
        t61 i10 = t61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.L(v0Var.f15871r);
        arrayList.add(i10);
        arrayList.add(t61.C(null));
        if (v0Var.f15871r) {
            b2 d = c2.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                t61 t61Var2 = new t61(17);
                t61Var2.G = d;
                arrayList.add(t61Var2);
            } else {
                t61 c10 = t61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f32880q = true;
                arrayList.add(c10);
            }
            arrayList.add(t61.C(null));
            ic.a.p(R.string.BusinessRecipients, arrayList);
            t61 x9 = t61.x(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            x9.L(v0Var.f15872s);
            arrayList.add(x9);
            t61 x10 = t61.x(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            x10.L(!v0Var.f15872s);
            arrayList.add(x10);
            arrayList.add(t61.C(null));
            v0Var.f15868c.a(arrayList, j71Var, true);
            ic.a.z(R.string.BusinessGreetRecipientsInfo, arrayList);
            ic.a.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = v0Var.d;
                if (i11 < iArr.length) {
                    if (iArr[i11] == v0Var.v) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = v0Var.e;
            ig.o oVar = new ig.o(v0Var, 5);
            t61 t61Var3 = new t61(14);
            t61Var3.f32879p = strArr;
            t61Var3.f32888z = i11;
            t61Var3.C = oVar;
            t61Var3.B = -1L;
            arrayList.add(t61Var3);
            ic.a.z(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void W(boolean z10) {
        if (this.f15866a == null) {
            return;
        }
        this.f15866a.a(X(), z10);
    }

    public final boolean X() {
        boolean z10;
        b0 b0Var;
        if (this.f15869f) {
            boolean z11 = this.f15871r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f15870n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.v || tL_businessGreetingMessage.recipients.exclude_selected != this.f15872s || ((b0Var = this.f15868c) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void Y() {
        if (!this.f15866a.f23139x.f19327f) {
            if (!X()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f15871r;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View E1 = this.f15867b.E1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(E1, i10);
            } else if (z10 && !this.f15868c.k(this.f15867b)) {
            } else {
                this.f15866a.b(true);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f15871r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f15640a;
                    tL_inputBusinessGreetingMessage.recipients = this.f15868c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.v;
                    updatebusinessgreetingmessage.flags = 1 | updatebusinessgreetingmessage.flags;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f15640a;
                        tL_businessGreetingMessage.recipients = this.f15868c.f();
                        userFull.business_greeting_message.no_activity_days = this.v;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bi.i0(this, 18));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Z() {
        boolean z10;
        int i10;
        boolean z11;
        j71 j71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f15869f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f15870n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15871r = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.v = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f15872s = z11;
        b0 b0Var = this.f15868c;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        r71 r71Var = this.f15867b;
        if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
            j71Var.O(true);
        }
        W(true);
        this.f15869f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 14));
        this.f15866a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new ua(this, 26));
        this.f15868c = b0Var;
        b0Var.f15639n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f15870n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        r71 r71Var = new r71(this, new hi.e2(this, 9), new u0(this, 2), null);
        this.f15867b = r71Var;
        r71Var.u1();
        this.f15867b.setSectionsDrawBackground(true);
        r71 r71Var2 = this.f15867b;
        r71Var2.f32152g3.f29507r = false;
        frameLayout.addView(r71Var2, gb1.g(-1.0f, -1));
        Z();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            r71 r71Var = this.f15867b;
            if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
                j71Var.O(true);
            }
            W(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Z();
        }
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f15867b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (X()) {
            if (z10) {
                if (!this.f15871r) {
                    Y();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u0(this, 1));
                showDialog(alertDialog$Builder.f22368a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        c2.f(this.currentAccount).h();
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
