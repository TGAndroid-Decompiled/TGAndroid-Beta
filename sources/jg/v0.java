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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
public final class v0 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public u5 f15865a;
    public s71 f15866b;
    public b0 f15867c;
    public final int[] d;
    public final String[] e;
    public boolean f15868f;
    public int h;
    public TL_account.TL_businessGreetingMessage f15869n;
    public boolean f15870r;
    public boolean f15871s;
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

    public static void V(v0 v0Var, ArrayList arrayList, k71 k71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        u61 u61Var = new u61(2);
        u61Var.f33249l = string;
        u61Var.f33252o = string2;
        u61Var.f33250m = "RestrictedEmoji";
        u61Var.f33251n = "👋";
        arrayList.add(u61Var);
        u61 i10 = u61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.L(v0Var.f15870r);
        arrayList.add(i10);
        arrayList.add(u61.C(null));
        if (v0Var.f15870r) {
            b2 d = c2.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                u61 u61Var2 = new u61(17);
                u61Var2.G = d;
                arrayList.add(u61Var2);
            } else {
                u61 c10 = u61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f33254q = true;
                arrayList.add(c10);
            }
            arrayList.add(u61.C(null));
            ic.a.p(R.string.BusinessRecipients, arrayList);
            u61 x9 = u61.x(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            x9.L(v0Var.f15871s);
            arrayList.add(x9);
            u61 x10 = u61.x(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            x10.L(!v0Var.f15871s);
            arrayList.add(x10);
            arrayList.add(u61.C(null));
            v0Var.f15867c.a(arrayList, k71Var, true);
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
            u61 u61Var3 = new u61(14);
            u61Var3.f33253p = strArr;
            u61Var3.f33262z = i11;
            u61Var3.C = oVar;
            u61Var3.B = -1L;
            arrayList.add(u61Var3);
            ic.a.z(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void W(boolean z10) {
        if (this.f15865a == null) {
            return;
        }
        this.f15865a.a(X(), z10);
    }

    public final boolean X() {
        boolean z10;
        b0 b0Var;
        if (this.f15868f) {
            boolean z11 = this.f15870r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f15869n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.v || tL_businessGreetingMessage.recipients.exclude_selected != this.f15871s || ((b0Var = this.f15867c) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void Y() {
        if (!this.f15865a.f23140x.f19326f) {
            if (!X()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f15870r;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View E1 = this.f15866b.E1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(E1, i10);
            } else if (z10 && !this.f15867c.k(this.f15866b)) {
            } else {
                this.f15865a.b(true);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f15870r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f15639a;
                    tL_inputBusinessGreetingMessage.recipients = this.f15867c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.v;
                    updatebusinessgreetingmessage.flags = 1 | updatebusinessgreetingmessage.flags;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f15639a;
                        tL_businessGreetingMessage.recipients = this.f15867c.f();
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
        k71 k71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f15868f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f15869n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15870r = z10;
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
        this.f15871s = z11;
        b0 b0Var = this.f15867c;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        s71 s71Var = this.f15866b;
        if (s71Var != null && (k71Var = s71Var.f32504g3) != null) {
            k71Var.O(true);
        }
        W(true);
        this.f15868f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 14));
        this.f15865a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new ua(this, 26));
        this.f15867c = b0Var;
        b0Var.f15638n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f15869n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        s71 s71Var = new s71(this, new hi.e2(this, 9), new u0(this, 2), null);
        this.f15866b = s71Var;
        s71Var.u1();
        this.f15866b.setSectionsDrawBackground(true);
        s71 s71Var2 = this.f15866b;
        s71Var2.f32504g3.f29878r = false;
        frameLayout.addView(s71Var2, kb1.g(-1.0f, -1));
        Z();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            s71 s71Var = this.f15866b;
            if (s71Var != null && (k71Var = s71Var.f32504g3) != null) {
                k71Var.O(true);
            }
            W(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Z();
        }
    }

    @Override
    public final nm0 getListViewForSimpleGlass() {
        return this.f15866b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (X()) {
            if (z10) {
                if (!this.f15870r) {
                    Y();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u0(this, 1));
                showDialog(alertDialog$Builder.f22369a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
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
