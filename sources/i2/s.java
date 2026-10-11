package i2;

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
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.l20;
import org.telegram.ui.lc0;
import org.telegram.ui.mn0;
import org.telegram.ui.oj;
import org.telegram.ui.rj0;
import org.telegram.ui.ug0;
import org.telegram.ui.um0;
import org.telegram.ui.vg0;
import org.telegram.ui.zn;
public final class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, qd0, ImageReceiver.ImageReceiverDelegate, f5, hm0, gm0, z1, bd0, cm0, im0 {
    public final int f11882a;
    public final int f11883b;
    public final Object f11884c;

    public s(int i10, Object obj, int i11) {
        this.f11882a = i11;
        this.f11883b = i10;
        this.f11884c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f11882a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11883b, (ep) this.f11884c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11883b, (ap) this.f11884c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f11882a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.l lVar;
        m4.l lVar2;
        m4.r rVar = (m4.r) this.f11884c;
        int i10 = this.f11883b;
        try {
            try {
                lVar2 = (m4.l) ((i9.w) obj).get();
                e2.d.e(lVar2, "LibraryResult must not be null");
            } catch (InterruptedException e7) {
                e = e7;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.k1 k1Var = new m4.k1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(k1Var.f16187a, SystemClock.elapsedRealtime(), k1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e10) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.l.d;
                m4.k1 k1Var2 = new m4.k1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(k1Var2.f16187a, SystemClock.elapsedRealtime(), k1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.l.d;
                m4.k1 k1Var3 = new m4.k1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(k1Var3.f16187a, SystemClock.elapsedRealtime(), k1Var3);
                lVar2 = lVar;
                m4.q qVar22 = rVar.d;
                e2.d.h(qVar22);
                qVar22.a(i10, lVar2);
            }
            m4.q qVar222 = rVar.d;
            e2.d.h(qVar222);
            qVar222.a(i10, lVar2);
        } catch (RemoteException e12) {
            e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e12);
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f11884c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f11883b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f11882a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f11884c, this.f11883b, view, i10);
                return;
            default:
                rj0.Q((rj0) this.f11884c, this.f11883b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ll0 ll0Var = (ll0) this.f11884c;
        if (this.f11883b == 5) {
            ll0Var.getClass();
            return false;
        }
        kl0 kl0Var = ll0Var.f28472g0;
        if (kl0Var == null || !(view instanceof jl0)) {
            return false;
        }
        kl0Var.m(ll0Var, ((jl0) view).f27779e, true, false);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        g8 g8Var = (g8) this.f11884c;
        if (this.f11883b == g8Var.f26679b) {
            l8 l8Var = ((b8) g8Var).f24931e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            c8 c8Var = l8Var.J;
            ValueAnimator valueAnimator = l8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                l8Var.S0 = null;
            }
            if (c8Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(c8Var.getCustomPaddingRight(), i10);
                l8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    l8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                l8Var.S0.setInterpolator(new DecelerateInterpolator());
                l8Var.S0.addUpdateListener(new m6(l8Var, 2));
                l8Var.S0.start();
            }
            if (l8Var.f28240i0.getTag() != null) {
                l8Var.f28241j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f11884c;
        calendar.clear();
        int i11 = this.f11883b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f11882a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f11884c).f33845d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f11883b).openByUserName("spambot", (m2) hg.c.g(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f11884c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f34305e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20207id = profileActivity.getMessagesController().getInputUser(profileActivity.f34305e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f11883b);
                return;
            case 14:
                vg0 vg0Var = ((ug0) this.f11884c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f11883b;
                if (i11 != i12) {
                    ((LaunchActivity) vg0Var.getParentActivity()).K0(i12);
                }
                vg0Var.finishFragment();
                return;
            case 16:
                mn0 mn0Var = ((um0) this.f11884c).f42684a;
                mn0Var.y1(mn0Var.Y[this.f11883b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f11884c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f11883b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11882a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((h1) this.f11884c).f11723a, this.f11883b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f11884c, this.f11883b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f11884c, this.f11883b);
                return;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f11882a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.d0 d0Var = ((lc0) this.f11884c).f39618c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f11883b;
        d0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f11882a = 2;
        this.f11884c = aVar;
        this.f11883b = i10;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f11884c;
        l20 l20Var = m1Var.f48459d0;
        HashSet hashSet = m1Var.f48463h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f20215id : -lVar.getChat().f20068id;
            int i11 = this.f11883b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f48468n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == m1Var.a0() + 1) {
                hashSet.remove(Long.valueOf(j3));
                m1Var.g0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                l20Var.setVisibility(0);
                l20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(is.h).setDuration(320L).withEndAction(!z11 ? new tg.z0(m1Var, 7) : null).start();
                ug.h hVar = m1Var.f48470p0;
                boolean z12 = !z11;
                if (hVar.f49069y != z12) {
                    hVar.f49069y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f49063f, (Utilities.Callback<View>) new ug.f(z12));
                }
            }
            m1Var.X();
            m1Var.Z.b(true, hashSet, new tg.z0(m1Var, 8), null);
            m1Var.j0(true, true);
            m1Var.Y();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        zn znVar = ((oj) this.f11884c).f40590b;
        int i10 = this.f11883b;
        if (i10 == 15 && ChatObject.isChannel(znVar.f44786e)) {
            TLRPC.Chat chat = znVar.f44786e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                znVar.getMessagesController().deleteDialog(znVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = znVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(znVar, i11);
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            znVar.finishFragment();
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f44798f, znVar.f44786e, Boolean.valueOf(z10));
            return;
        }
        znVar.va(znVar.f44777d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f11882a = i11;
        this.f11884c = obj;
        this.f11883b = i10;
    }

    public s(oj ojVar, int i10, boolean z10) {
        this.f11882a = 4;
        this.f11884c = ojVar;
        this.f11883b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
