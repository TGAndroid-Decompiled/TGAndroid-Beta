package i2;

import ai.bd;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bj0;
import org.telegram.ui.cg0;
import org.telegram.ui.dg0;
import org.telegram.ui.em0;
import org.telegram.ui.fj;
import org.telegram.ui.ic0;
import org.telegram.ui.qb0;
import org.telegram.ui.qn;
import org.telegram.ui.vm0;
import v7.u6;
public final class s implements e2.o, e2.j, MessagesStorage.BooleanCallback, kd0, ImageReceiver.ImageReceiverDelegate, e5, zl0, yl0, a2, ic0, ul0, am0 {
    public final int f12575a;
    public final int f12576b;
    public final Object f12577c;

    public s(int i10, Object obj, int i11) {
        this.f12575a = i11;
        this.f12576b = i10;
        this.f12577c = obj;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f12575a) {
            case 7:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f12576b, (yo) this.f12577c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f12576b, (uo) this.f12577c, 9), 16L);
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        switch (this.f12575a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        dl0 dl0Var = (dl0) this.f12577c;
        if (this.f12576b == 5) {
            dl0Var.getClass();
            return false;
        }
        cl0 cl0Var = dl0Var.f25541g0;
        if (cl0Var == null || !(view instanceof bl0)) {
            return false;
        }
        cl0Var.o(dl0Var, ((bl0) view).e, true, false);
        return true;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f12575a;
    }

    @Override
    public void accept(Object obj) {
        m4.o oVar;
        m4.o oVar2;
        m4.v vVar = (m4.v) this.f12577c;
        int i10 = this.f12576b;
        try {
            try {
                oVar2 = (m4.o) ((j9.y) obj).get();
                u6.l(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.o.d;
                m4.q1 q1Var = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var.f16686a, SystemClock.elapsedRealtime(), q1Var);
                oVar2 = oVar;
                m4.u uVar = vVar.d;
                uVar.getClass();
                uVar.a(i10, oVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.o.d;
                m4.q1 q1Var2 = new m4.q1("no error message provided", 1, Bundle.EMPTY);
                oVar = new m4.o(q1Var2.f16686a, SystemClock.elapsedRealtime(), q1Var2);
                oVar2 = oVar;
                m4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.a(i10, oVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.o.d;
                m4.q1 q1Var3 = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var3.f16686a, SystemClock.elapsedRealtime(), q1Var3);
                oVar2 = oVar;
                m4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.a(i10, oVar2);
            }
            m4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.a(i10, oVar2);
        } catch (RemoteException e11) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e11);
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.f12577c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f12576b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f12575a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f12577c, this.f12576b, view, i10);
                return;
            default:
                bj0.Q((bj0) this.f12577c, this.f12576b, view);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        f8 f8Var = (f8) this.f12577c;
        if (this.f12576b == f8Var.f26143b) {
            k8 k8Var = ((a8) f8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            b8 b8Var = k8Var.J;
            ValueAnimator valueAnimator = k8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                k8Var.S0 = null;
            }
            if (b8Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(b8Var.getCustomPaddingRight(), i10);
                k8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    k8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                k8Var.S0.setInterpolator(new DecelerateInterpolator());
                k8Var.S0.addUpdateListener(new l6(k8Var, 2));
                k8Var.S0.start();
            }
            if (k8Var.f27789i0.getTag() != null) {
                k8Var.f27790j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        n5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f12577c;
        calendar.clear();
        int i11 = this.f12576b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f12575a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f12577c).f33165d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f12576b).openByUserName("spambot", (n2) e.h(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f12577c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f33623f1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20418id = profileActivity.getMessagesController().getInputUser(profileActivity.f33623f1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f12576b);
                return;
            case 14:
                dg0 dg0Var = ((cg0) this.f12577c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f12576b;
                if (i11 != i12) {
                    ((LaunchActivity) dg0Var.getParentActivity()).O0(i12);
                }
                dg0Var.finishFragment();
                return;
            case 16:
                vm0 vm0Var = ((em0) this.f12577c).f36690a;
                vm0Var.y1(vm0Var.Y[this.f12576b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f12577c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f12576b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12575a) {
            case 0:
                ((b2.d1) obj).onTimelineChanged(((j1) this.f12577c).f12449a, this.f12576b);
                return;
            case 1:
                ((b2.d1) obj).onMediaItemTransition((b2.o0) this.f12577c, this.f12576b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f12577c, this.f12576b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        n5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.b0 b0Var = ((qb0) this.f12577c).f40528c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f12576b;
        b0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.e1 e1Var, b2.e1 e1Var2) {
        this.f12575a = 2;
        this.f12577c = aVar;
        this.f12576b = i10;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        ug.m1 m1Var = (ug.m1) this.f12577c;
        bd bdVar = m1Var.f47716d0;
        HashSet hashSet = m1Var.f47720h0;
        if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            long j10 = user != null ? user.f20426id : -kVar.getChat().f20279id;
            int i11 = this.f12576b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                m1Var.f47725n0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == m1Var.a0() + 1) {
                hashSet.remove(Long.valueOf(j10));
                m1Var.g0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                bdVar.setVisibility(0);
                bdVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(bs.h).setDuration(320L).withEndAction(!z11 ? new ug.z0(m1Var, 7) : null).start();
                vg.h hVar = m1Var.f47727p0;
                boolean z12 = !z11;
                if (hVar.f48390y != z12) {
                    hVar.f48390y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f48384f, (Utilities.Callback<View>) new vg.f(z12));
                }
            }
            m1Var.X();
            m1Var.Z.b(true, hashSet, new ug.z0(m1Var, 8), null);
            m1Var.j0(true, true);
            m1Var.Y();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        qn qnVar = ((fj) this.f12577c).f37023b;
        int i10 = this.f12576b;
        if (i10 == 15 && ChatObject.isChannel(qnVar.e)) {
            TLRPC.Chat chat = qnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                qnVar.getMessagesController().deleteDialog(qnVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = qnVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(qnVar, i11);
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            qnVar.finishFragment();
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.T5), qnVar.f40679f, qnVar.e, Boolean.valueOf(z10));
            return;
        }
        qnVar.va(qnVar.f40659d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f12575a = i11;
        this.f12577c = obj;
        this.f12576b = i10;
    }

    public s(fj fjVar, int i10, boolean z10) {
        this.f12575a = 4;
        this.f12577c = fjVar;
        this.f12576b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
