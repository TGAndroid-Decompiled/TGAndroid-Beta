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
import org.telegram.messenger.p5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ej0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.jj;
import org.telegram.ui.kn0;
import org.telegram.ui.mc0;
import org.telegram.ui.sm0;
import org.telegram.ui.wb0;
import org.telegram.ui.wn;
public final class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, jd0, ImageReceiver.ImageReceiverDelegate, e5, cm0, bm0, b2, mc0, xl0, dm0 {
    public final int f13715a;
    public final int f13716b;
    public final Object f13717c;

    public r(int i10, Object obj, int i11) {
        this.f13715a = i11;
        this.f13716b = i10;
        this.f13717c = obj;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f13715a) {
            case 7:
                AndroidUtilities.runOnUIThread(new v(i10, this.f13716b, (ap) this.f13717c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new v(i10, this.f13716b, (wo) this.f13717c, 9), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.f13717c;
        int i10 = this.f13716b;
        try {
            try {
                pVar2 = (m4.p) ((k9.y) obj).get();
                yb.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.f18213a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e10) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.f18213a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.f18213a, SystemClock.elapsedRealtime(), r1Var3);
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
        gl0 gl0Var = (gl0) this.f13717c;
        if (this.f13716b == 5) {
            gl0Var.getClass();
            return false;
        }
        fl0 fl0Var = gl0Var.f28622g0;
        if (fl0Var == null || !(view instanceof el0)) {
            return false;
        }
        fl0Var.p(gl0Var, ((el0) view).e, true, false);
        return true;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f13715a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.D1;
        for (Map.Entry entry : ((HashMap) this.f13717c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f13716b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        h8 h8Var = (h8) this.f13717c;
        if (this.f13716b == h8Var.f28910b) {
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
            if (m8Var.f30439h0.getTag() != null) {
                m8Var.f30440i0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        p5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        switch (this.f13715a) {
            case 10:
                ContactsActivity.Y((ContactsActivity) this.f13717c, this.f13716b, view, i10);
                return;
            default:
                ej0.P((ej0) this.f13717c, this.f13716b, view);
                return;
        }
    }

    @Override
    public String f(int i10) {
        Calendar calendar = (Calendar) this.f13717c;
        calendar.clear();
        int i11 = this.f13716b;
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
        int i11 = this.f13715a;
        int i12 = this.f13716b;
        Object obj = this.f13717c;
        switch (i11) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) obj).f35553d0;
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
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f36003e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f22169id = profileActivity.getMessagesController().getInputUser(profileActivity.f36003e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.v5();
                profileActivity.d.u(i12);
                return;
            case 14:
                ig0 ig0Var = ((hg0) obj).f39882a0;
                if (UserConfig.selectedAccount != i12) {
                    ((LaunchActivity) ig0Var.getParentActivity()).P0(i12);
                }
                ig0Var.finishFragment();
                return;
            case 16:
                kn0 kn0Var = ((sm0) obj).f43362a;
                kn0Var.z1(kn0Var.Y[i12]);
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
        switch (this.f13715a) {
            case 0:
                ((b2.e1) obj).onTimelineChanged(((k1) this.f13717c).f13637a, this.f13716b);
                return;
            case 1:
                ((b2.e1) obj).onMediaItemTransition((b2.p0) this.f13717c, this.f13716b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f13717c, this.f13716b);
                return;
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f13715a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        p5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((wb0) this.f13717c).f44623c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f13716b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public r(j2.a aVar, int i10, b2.f1 f1Var, b2.f1 f1Var2) {
        this.f13715a = 2;
        this.f13717c = aVar;
        this.f13716b = i10;
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        vg.n1 n1Var = (vg.n1) this.f13717c;
        sc scVar = n1Var.f50247d0;
        HashSet hashSet = n1Var.f50251h0;
        if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            long j10 = user != null ? user.f22177id : -lVar.getChat().f22028id;
            int i11 = this.f13716b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                n1Var.f50256n0.put(Long.valueOf(j10), user);
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
                wg.h hVar = n1Var.f50258p0;
                boolean z12 = !z11;
                if (hVar.f51262y != z12) {
                    hVar.f51262y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f51256f, (Utilities.Callback<View>) new wg.f(z12));
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
        wn wnVar = ((jj) this.f13717c).f40550b;
        int i10 = this.f13716b;
        if (i10 == 15 && ChatObject.isChannel(wnVar.e)) {
            TLRPC.Chat chat = wnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                wnVar.getMessagesController().deleteDialog(wnVar.f45168j6, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = wnVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(wnVar, i11);
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            wnVar.finishFragment();
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.f45168j6), wnVar.f45113f, wnVar.e, Boolean.valueOf(z10));
            return;
        }
        wnVar.Da(wnVar.f45241p4, z10);
    }

    public r(Object obj, int i10, int i11) {
        this.f13715a = i11;
        this.f13717c = obj;
        this.f13716b = i10;
    }

    public r(jj jjVar, int i10, boolean z10) {
        this.f13715a = 4;
        this.f13717c = jjVar;
        this.f13716b = i10;
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
