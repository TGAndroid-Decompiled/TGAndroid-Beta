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
import org.telegram.messenger.l5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.nc0;
import org.telegram.ui.o20;
import org.telegram.ui.pn0;
import org.telegram.ui.sj;
import org.telegram.ui.tj0;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;
import org.telegram.ui.xm0;
public final class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, ud0, ImageReceiver.ImageReceiverDelegate, f5, mm0, lm0, z1, dd0, hm0, nm0 {
    public final int f11881a;
    public final int f11882b;
    public final Object f11883c;

    public s(int i10, Object obj, int i11) {
        this.f11881a = i11;
        this.f11882b = i10;
        this.f11883c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f11881a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11882b, (gp) this.f11883c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f11882b, (cp) this.f11883c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f11881a) {
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
        m4.r rVar = (m4.r) this.f11883c;
        int i10 = this.f11882b;
        try {
            try {
                lVar2 = (m4.l) ((i9.w) obj).get();
                e2.d.e(lVar2, "LibraryResult must not be null");
            } catch (InterruptedException e7) {
                e = e7;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.k1 k1Var = new m4.k1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(k1Var.f15876a, SystemClock.elapsedRealtime(), k1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e10) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.l.d;
                m4.k1 k1Var2 = new m4.k1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(k1Var2.f15876a, SystemClock.elapsedRealtime(), k1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.l.d;
                m4.k1 k1Var3 = new m4.k1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(k1Var3.f15876a, SystemClock.elapsedRealtime(), k1Var3);
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
        for (Map.Entry entry : ((HashMap) this.f11883c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f11882b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f11881a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f11883c, this.f11882b, view, i10);
                return;
            default:
                tj0.Q((tj0) this.f11883c, this.f11882b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        nl0 nl0Var = (nl0) this.f11883c;
        if (this.f11882b == 5) {
            nl0Var.getClass();
            return false;
        }
        ml0 ml0Var = nl0Var.f28841g0;
        if (ml0Var == null || !(view instanceof ll0)) {
            return false;
        }
        ml0Var.h(nl0Var, ((ll0) view).f28221e, true, false);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        g8 g8Var = (g8) this.f11883c;
        if (this.f11882b == g8Var.f26319b) {
            l8 l8Var = ((b8) g8Var).f24569e;
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
            if (l8Var.f28065i0.getTag() != null) {
                l8Var.f28066j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f11883c;
        calendar.clear();
        int i11 = this.f11882b;
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
        switch (this.f11881a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f11883c).f33622d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f11882b).openByUserName("spambot", (m2) hg.c.h(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f11883c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f34082e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f19942id = profileActivity.getMessagesController().getInputUser(profileActivity.f34082e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f11882b);
                return;
            case 14:
                xg0 xg0Var = ((wg0) this.f11883c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f11882b;
                if (i11 != i12) {
                    ((LaunchActivity) xg0Var.getParentActivity()).K0(i12);
                }
                xg0Var.finishFragment();
                return;
            case 16:
                pn0 pn0Var = ((xm0) this.f11883c).f44047a;
                pn0Var.y1(pn0Var.Y[this.f11882b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f11883c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f11882b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11881a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((h1) this.f11883c).f11722a, this.f11882b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f11883c, this.f11882b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f11883c, this.f11882b);
                return;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f11881a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        l5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.d0 d0Var = ((nc0) this.f11883c).f40377c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f11882b;
        d0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f11881a = 2;
        this.f11883c = aVar;
        this.f11882b = i10;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f11883c;
        o20 o20Var = m1Var.f48597d0;
        HashSet hashSet = m1Var.f48601h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f19950id : -lVar.getChat().f19803id;
            int i11 = this.f11882b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f48606n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == m1Var.a0() + 1) {
                hashSet.remove(Long.valueOf(j3));
                m1Var.g0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                o20Var.setVisibility(0);
                o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(js.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
                ug.h hVar = m1Var.f48608p0;
                boolean z12 = !z11;
                if (hVar.f49184y != z12) {
                    hVar.f49184y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f49178f, (Utilities.Callback<View>) new ug.f(z12));
                }
            }
            m1Var.X();
            m1Var.Z.b(true, hashSet, new tg.a1(m1Var, 8), null);
            m1Var.j0(true, true);
            m1Var.Y();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = ((sj) this.f11883c).f41941b;
        int i10 = this.f11882b;
        if (i10 == 15 && ChatObject.isChannel(eoVar.f37246e)) {
            TLRPC.Chat chat = eoVar.f37246e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                eoVar.getMessagesController().deleteDialog(eoVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = eoVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(eoVar, i11);
            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            eoVar.finishFragment();
            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f37258f, eoVar.f37246e, Boolean.valueOf(z10));
            return;
        }
        eoVar.va(eoVar.f37237d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f11881a = i11;
        this.f11883c = obj;
        this.f11882b = i10;
    }

    public s(sj sjVar, int i10, boolean z10) {
        this.f11881a = 4;
        this.f11883c = sjVar;
        this.f11882b = i10;
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
