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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.hc0;
import org.telegram.ui.j20;
import org.telegram.ui.kj;
import org.telegram.ui.kj0;
import org.telegram.ui.nm0;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.wn;
import org.telegram.ui.xc0;
public final class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, dd0, ImageReceiver.ImageReceiverDelegate, d5, pl0, ol0, z1, xc0, kl0, ql0 {
    public final int f10874a;
    public final int f10875b;
    public final Object f10876c;

    public s(int i10, Object obj, int i11) {
        this.f10874a = i11;
        this.f10875b = i10;
        this.f10876c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f10874a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10875b, (ro) this.f10876c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10875b, (no) this.f10876c, 9), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.l lVar;
        m4.l lVar2;
        m4.r rVar = (m4.r) this.f10876c;
        int i10 = this.f10875b;
        try {
            try {
                lVar2 = (m4.l) ((i9.w) obj).get();
                e2.d.e(lVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.i1 i1Var = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var.f14844a, SystemClock.elapsedRealtime(), i1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e7) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.l.d;
                m4.i1 i1Var2 = new m4.i1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(i1Var2.f14844a, SystemClock.elapsedRealtime(), i1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.l.d;
                m4.i1 i1Var3 = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var3.f14844a, SystemClock.elapsedRealtime(), i1Var3);
                lVar2 = lVar;
                m4.q qVar22 = rVar.d;
                e2.d.h(qVar22);
                qVar22.a(i10, lVar2);
            }
            m4.q qVar222 = rVar.d;
            e2.d.h(qVar222);
            qVar222.a(i10, lVar2);
        } catch (RemoteException e11) {
            e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e11);
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f10876c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f10875b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f10874a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f10876c, this.f10875b, view, i10);
                return;
            default:
                kj0.P((kj0) this.f10876c, this.f10875b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        tk0 tk0Var = (tk0) this.f10876c;
        if (this.f10875b == 5) {
            tk0Var.getClass();
            return false;
        }
        sk0 sk0Var = tk0Var.f28568g0;
        if (sk0Var == null || !(view instanceof rk0)) {
            return false;
        }
        sk0Var.h(tk0Var, ((rk0) view).e, true, false);
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f10874a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        e8 e8Var = (e8) this.f10876c;
        if (this.f10875b == e8Var.f23906b) {
            j8 j8Var = ((z7) e8Var).e;
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
            if (j8Var.f25324i0.getTag() != null) {
                j8Var.f25325j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f10874a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f10876c).f31180d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f10875b).openByUserName("spambot", (m2) hg.c.g(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f10876c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f31629e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f18491id = profileActivity.getMessagesController().getInputUser(profileActivity.f31629e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f10875b);
                return;
            case 14:
                qg0 qg0Var = ((pg0) this.f10876c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f10875b;
                if (i11 != i12) {
                    ((LaunchActivity) qg0Var.getParentActivity()).K0(i12);
                }
                qg0Var.finishFragment();
                return;
            case 16:
                fn0 fn0Var = ((nm0) this.f10876c).f36041a;
                fn0Var.z1(fn0Var.Y[this.f10875b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f10876c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f10875b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10874a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((h1) this.f10876c).f10726a, this.f10875b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f10876c, this.f10875b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f10876c, this.f10875b);
                return;
        }
    }

    @Override
    public String j(int i10) {
        Calendar calendar = (Calendar) this.f10876c;
        calendar.clear();
        int i11 = this.f10875b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f10874a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((hc0) this.f10876c).f34279c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f10875b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f10874a = 2;
        this.f10876c = aVar;
        this.f10875b = i10;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f10876c;
        j20 j20Var = m1Var.f43547d0;
        HashSet hashSet = m1Var.f43551h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f18499id : -lVar.getChat().f18352id;
            int i11 = this.f10875b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f43556n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == m1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                m1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                j20Var.setVisibility(0);
                j20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(tr.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
                ug.h hVar = m1Var.f43558p0;
                boolean z12 = !z11;
                if (hVar.f44136y != z12) {
                    hVar.f44136y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f44130f, (Utilities.Callback<View>) new ug.f(z12));
                }
            }
            m1Var.W();
            m1Var.Z.b(true, hashSet, new tg.a1(m1Var, 8), null);
            m1Var.i0(true, true);
            m1Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        wn wnVar = ((kj) this.f10876c).f35167b;
        int i10 = this.f10875b;
        if (i10 == 15 && ChatObject.isChannel(wnVar.e)) {
            TLRPC.Chat chat = wnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                wnVar.getMessagesController().deleteDialog(wnVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = wnVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(wnVar, i11);
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            wnVar.finishFragment();
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.T5), wnVar.f39564f, wnVar.e, Boolean.valueOf(z10));
            return;
        }
        wnVar.qa(wnVar.f39544d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f10874a = i11;
        this.f10876c = obj;
        this.f10875b = i10;
    }

    public s(kj kjVar, int i10, boolean z10) {
        this.f10874a = 4;
        this.f10876c = kjVar;
        this.f10875b = i10;
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
