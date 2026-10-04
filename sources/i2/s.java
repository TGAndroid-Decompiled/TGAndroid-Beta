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
import org.telegram.messenger.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.kn0;
import org.telegram.ui.lc0;
import org.telegram.ui.lj;
import org.telegram.ui.o20;
import org.telegram.ui.oj0;
import org.telegram.ui.sm0;
import org.telegram.ui.tg0;
import org.telegram.ui.ug0;
import org.telegram.ui.yn;
public final class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, cd0, ImageReceiver.ImageReceiverDelegate, d5, ol0, nl0, a2, bd0, jl0, pl0 {
    public final int f11832a;
    public final int f11833b;
    public final Object f11834c;

    public s(int i10, Object obj, int i11) {
        this.f11832a = i11;
        this.f11833b = i10;
        this.f11834c = obj;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f11832a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11833b, (ro) this.f11834c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11833b, (no) this.f11834c, 9), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.l lVar;
        m4.l lVar2;
        m4.r rVar = (m4.r) this.f11834c;
        int i10 = this.f11833b;
        try {
            try {
                lVar2 = (m4.l) ((i9.w) obj).get();
                e2.d.e(lVar2, "LibraryResult must not be null");
            } catch (InterruptedException e7) {
                e = e7;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.i1 i1Var = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var.f16184a, SystemClock.elapsedRealtime(), i1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e10) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.l.d;
                m4.i1 i1Var2 = new m4.i1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(i1Var2.f16184a, SystemClock.elapsedRealtime(), i1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.l.d;
                m4.i1 i1Var3 = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var3.f16184a, SystemClock.elapsedRealtime(), i1Var3);
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
        for (Map.Entry entry : ((HashMap) this.f11834c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f11833b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f11832a) {
            case 10:
                ContactsActivity.S((ContactsActivity) this.f11834c, this.f11833b, view, i10);
                return;
            default:
                oj0.N((oj0) this.f11834c, this.f11833b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        sk0 sk0Var = (sk0) this.f11834c;
        if (this.f11833b == 5) {
            sk0Var.getClass();
            return false;
        }
        rk0 rk0Var = sk0Var.f30771g0;
        if (rk0Var == null || !(view instanceof qk0)) {
            return false;
        }
        rk0Var.h(sk0Var, ((qk0) view).f30061e, true, false);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        e8 e8Var = (e8) this.f11834c;
        if (this.f11833b == e8Var.f25997b) {
            j8 j8Var = ((z7) e8Var).f33394e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            a8 a8Var = j8Var.J;
            ValueAnimator valueAnimator = j8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                j8Var.S0 = null;
            }
            if (a8Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(a8Var.getCustomPaddingRight(), i10);
                j8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    j8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                j8Var.S0.setInterpolator(new DecelerateInterpolator());
                j8Var.S0.addUpdateListener(new k6(j8Var, 2));
                j8Var.S0.start();
            }
            if (j8Var.f27634i0.getTag() != null) {
                j8Var.f27635j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f11834c;
        calendar.clear();
        int i11 = this.f11833b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public boolean f1(View view) {
        switch (this.f11832a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f11832a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f11834c).f33774d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f11833b).openByUserName("spambot", (n2) hg.k0.g(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f11834c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f34234e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20177id = profileActivity.getMessagesController().getInputUser(profileActivity.f34234e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f11833b);
                return;
            case 14:
                ug0 ug0Var = ((tg0) this.f11834c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f11833b;
                if (i11 != i12) {
                    ((LaunchActivity) ug0Var.getParentActivity()).K0(i12);
                }
                ug0Var.finishFragment();
                return;
            case 16:
                kn0 kn0Var = ((sm0) this.f11834c).f40532a;
                kn0Var.z1(kn0Var.Y[this.f11833b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f11834c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f11833b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11832a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((h1) this.f11834c).f11673a, this.f11833b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f11834c, this.f11833b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f11834c, this.f11833b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((lc0) this.f11834c).f38231c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f11833b;
        c0Var.h1(i10, dp);
        return i10;
    }

    @Override
    public void s0(View view, float f7, float f10) {
        int i10 = this.f11832a;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f11832a = 2;
        this.f11834c = aVar;
        this.f11833b = i10;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f11834c;
        o20 o20Var = m1Var.f47044d0;
        HashSet hashSet = m1Var.f47048h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f20185id : -lVar.getChat().f20038id;
            int i11 = this.f11833b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f47053n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == m1Var.Y() + 1) {
                hashSet.remove(Long.valueOf(j3));
                m1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                o20Var.setVisibility(0);
                o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(tr.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
                ug.h hVar = m1Var.f47055p0;
                boolean z12 = !z11;
                if (hVar.f47675y != z12) {
                    hVar.f47675y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f47669f, (Utilities.Callback<View>) new ug.f(z12));
                }
            }
            m1Var.U();
            m1Var.Z.b(true, hashSet, new tg.a1(m1Var, 8), null);
            m1Var.i0(true, true);
            m1Var.W();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        yn ynVar = ((lj) this.f11834c).f38279b;
        int i10 = this.f11833b;
        if (i10 == 15 && ChatObject.isChannel(ynVar.f43315e)) {
            TLRPC.Chat chat = ynVar.f43315e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                ynVar.getMessagesController().deleteDialog(ynVar.R5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = ynVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(ynVar, i11);
            ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            ynVar.finishFragment();
            ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(ynVar.R5), ynVar.f43327f, ynVar.f43315e, Boolean.valueOf(z10));
            return;
        }
        ynVar.pa(ynVar.f43280b4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f11832a = i11;
        this.f11834c = obj;
        this.f11833b = i10;
    }

    public s(lj ljVar, int i10, boolean z10) {
        this.f11832a = 4;
        this.f11834c = ljVar;
        this.f11833b = i10;
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
