package i2;

import a8.yb;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import bi.sc;
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
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.fg0;
import org.telegram.ui.gg0;
import org.telegram.ui.gj;
import org.telegram.ui.in0;
import org.telegram.ui.kc0;
import org.telegram.ui.qm0;
import org.telegram.ui.tb0;
import org.telegram.ui.un;
public final class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, id0, ImageReceiver.ImageReceiverDelegate, e5, bm0, am0, b2, kc0, wl0, cm0 {
    public final int f13716a;
    public final int f13717b;
    public final Object f13718c;

    public r(int i10, Object obj, int i11) {
        this.f13716a = i11;
        this.f13717b = i10;
        this.f13718c = obj;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f13716a) {
            case 7:
                AndroidUtilities.runOnUIThread(new v(i10, this.f13717b, (ap) this.f13718c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new v(i10, this.f13717b, (wo) this.f13718c, 9), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.f13718c;
        int i10 = this.f13717b;
        try {
            try {
                pVar2 = (m4.p) ((k9.y) obj).get();
                yb.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.f18214a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e10) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.f18214a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.f18214a, SystemClock.elapsedRealtime(), r1Var3);
                pVar2 = pVar;
                m4.v vVar22 = wVar.d;
                vVar22.getClass();
                vVar22.a(i10, pVar2);
            }
            m4.v vVar222 = wVar.d;
            vVar222.getClass();
            vVar222.a(i10, pVar2);
        } catch (RemoteException e12) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + wVar, e12);
        }
    }

    @Override
    public boolean c(int i10, View view) {
        fl0 fl0Var = (fl0) this.f13718c;
        if (this.f13717b == 5) {
            fl0Var.getClass();
            return false;
        }
        el0 el0Var = fl0Var.f28244g0;
        if (el0Var == null || !(view instanceof dl0)) {
            return false;
        }
        el0Var.p(fl0Var, ((dl0) view).e, true, false);
        return true;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f13716a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.D1;
        for (Map.Entry entry : ((HashMap) this.f13718c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f13717b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        h8 h8Var = (h8) this.f13718c;
        if (this.f13717b == h8Var.f28859b) {
            m8 m8Var = ((c8) h8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            d8 d8Var = m8Var.I;
            ValueAnimator valueAnimator = m8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                m8Var.S0 = null;
            }
            if (d8Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(d8Var.getCustomPaddingRight(), i10);
                m8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    m8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                m8Var.S0.setInterpolator(new DecelerateInterpolator());
                m8Var.S0.addUpdateListener(new n6(m8Var, 2));
                m8Var.S0.start();
            }
            if (m8Var.f30432h0.getTag() != null) {
                m8Var.f30433i0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        o5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        switch (this.f13716a) {
            case 10:
                ContactsActivity.Y((ContactsActivity) this.f13718c, this.f13717b, view, i10);
                return;
            default:
                cj0.P((cj0) this.f13718c, this.f13717b, view);
                return;
        }
    }

    @Override
    public String f(int i10) {
        Calendar calendar = (Calendar) this.f13718c;
        calendar.clear();
        int i11 = this.f13717b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void h(e2 e2Var, int i10) {
        int i11 = this.f13716a;
        int i12 = this.f13717b;
        Object obj = this.f13718c;
        switch (i11) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) obj).f35529d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(i12).openByUserName("spambot", (r2) ic.a.g(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i13 = ProfileActivity.R6;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35979e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f22168id = profileActivity.getMessagesController().getInputUser(profileActivity.f35979e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.v5();
                profileActivity.d.u(i12);
                return;
            case 14:
                gg0 gg0Var = ((fg0) obj).f39362a0;
                if (UserConfig.selectedAccount != i12) {
                    ((LaunchActivity) gg0Var.getParentActivity()).P0(i12);
                }
                gg0Var.finishFragment();
                return;
            case 16:
                in0 in0Var = ((qm0) obj).f42875a;
                in0Var.z1(in0Var.Y[i12]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i12, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f13716a) {
            case 0:
                ((b2.e1) obj).onTimelineChanged(((k1) this.f13718c).f13638a, this.f13717b);
                return;
            case 1:
                ((b2.e1) obj).onMediaItemTransition((b2.p0) this.f13718c, this.f13717b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f13718c, this.f13717b);
                return;
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f13716a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        o5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((tb0) this.f13718c).f43725c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f13717b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public r(j2.a aVar, int i10, b2.f1 f1Var, b2.f1 f1Var2) {
        this.f13716a = 2;
        this.f13718c = aVar;
        this.f13717b = i10;
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        vg.n1 n1Var = (vg.n1) this.f13718c;
        sc scVar = n1Var.f50212d0;
        HashSet hashSet = n1Var.f50216h0;
        if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            long j10 = user != null ? user.f22176id : -lVar.getChat().f22027id;
            int i11 = this.f13717b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                n1Var.f50221n0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == n1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                n1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                scVar.setVisibility(0);
                scVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(ds.h).setDuration(320L).withEndAction(!z11 ? new vg.a1(n1Var, 7) : null).start();
                wg.h hVar = n1Var.f50223p0;
                boolean z12 = !z11;
                if (hVar.f51204y != z12) {
                    hVar.f51204y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f51198f, (Utilities.Callback<View>) new wg.f(z12));
                }
            }
            n1Var.W();
            n1Var.Z.b(true, hashSet, new vg.a1(n1Var, 8), null);
            n1Var.i0(true, true);
            n1Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        un unVar = ((gj) this.f13718c).f39709b;
        int i10 = this.f13717b;
        if (i10 == 15 && ChatObject.isChannel(unVar.e)) {
            TLRPC.Chat chat = unVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                unVar.getMessagesController().deleteDialog(unVar.f44252f6, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = unVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(unVar, i11);
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            unVar.finishFragment();
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(unVar.f44252f6), unVar.f44245f, unVar.e, Boolean.valueOf(z10));
            return;
        }
        unVar.Aa(unVar.f44373p4, z10);
    }

    public r(Object obj, int i10, int i11) {
        this.f13716a = i11;
        this.f13718c = obj;
        this.f13717b = i10;
    }

    public r(gj gjVar, int i10, boolean z10) {
        this.f13716a = 4;
        this.f13718c = gjVar;
        this.f13717b = i10;
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void b(View view, float f7, float f10) {
    }
}
