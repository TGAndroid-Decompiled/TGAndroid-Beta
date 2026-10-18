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
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dj0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.gm0;
import org.telegram.ui.hj;
import org.telegram.ui.kc0;
import org.telegram.ui.sb0;
import org.telegram.ui.sn;
import org.telegram.ui.xm0;
import v7.u6;
public final class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, kd0, ImageReceiver.ImageReceiverDelegate, e5, yl0, xl0, a2, kc0, tl0, zl0 {
    public final int f12574a;
    public final int f12575b;
    public final Object f12576c;

    public r(int i10, Object obj, int i11) {
        this.f12574a = i11;
        this.f12575b = i10;
        this.f12576c = obj;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f12574a) {
            case 7:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f12575b, (yo) this.f12576c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f12575b, (uo) this.f12576c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        switch (this.f12574a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        cl0 cl0Var = (cl0) this.f12576c;
        if (this.f12575b == 5) {
            cl0Var.getClass();
            return false;
        }
        bl0 bl0Var = cl0Var.f25280g0;
        if (bl0Var == null || !(view instanceof al0)) {
            return false;
        }
        bl0Var.l(cl0Var, ((al0) view).e, true, false);
        return true;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f12574a;
    }

    @Override
    public void accept(Object obj) {
        m4.o oVar;
        m4.o oVar2;
        m4.v vVar = (m4.v) this.f12576c;
        int i10 = this.f12575b;
        try {
            try {
                oVar2 = (m4.o) ((j9.y) obj).get();
                u6.l(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.o.d;
                m4.q1 q1Var = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var.f16687a, SystemClock.elapsedRealtime(), q1Var);
                oVar2 = oVar;
                m4.u uVar = vVar.d;
                uVar.getClass();
                uVar.a(i10, oVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.o.d;
                m4.q1 q1Var2 = new m4.q1("no error message provided", 1, Bundle.EMPTY);
                oVar = new m4.o(q1Var2.f16687a, SystemClock.elapsedRealtime(), q1Var2);
                oVar2 = oVar;
                m4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.a(i10, oVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.o.d;
                m4.q1 q1Var3 = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var3.f16687a, SystemClock.elapsedRealtime(), q1Var3);
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
        for (Map.Entry entry : ((HashMap) this.f12576c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f12575b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f12574a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f12576c, this.f12575b, view, i10);
                return;
            default:
                dj0.Q((dj0) this.f12576c, this.f12575b, view);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        f8 f8Var = (f8) this.f12576c;
        if (this.f12575b == f8Var.f26169b) {
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
            if (k8Var.f27782i0.getTag() != null) {
                k8Var.f27783j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        k5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f12576c;
        calendar.clear();
        int i11 = this.f12575b;
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
        switch (this.f12574a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f12576c).f33156d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f12575b).openByUserName("spambot", (n2) d.h(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f12576c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f33614f1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20418id = profileActivity.getMessagesController().getInputUser(profileActivity.f33614f1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f12575b);
                return;
            case 14:
                fg0 fg0Var = ((eg0) this.f12576c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f12575b;
                if (i11 != i12) {
                    ((LaunchActivity) fg0Var.getParentActivity()).O0(i12);
                }
                fg0Var.finishFragment();
                return;
            case 16:
                xm0 xm0Var = ((gm0) this.f12576c).f37241a;
                xm0Var.y1(xm0Var.Y[this.f12575b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f12576c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f12575b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f12574a) {
            case 0:
                ((b2.d1) obj).onTimelineChanged(((i1) this.f12576c).f12448a, this.f12575b);
                return;
            case 1:
                ((b2.d1) obj).onMediaItemTransition((b2.o0) this.f12576c, this.f12575b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f12576c, this.f12575b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        k5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        s4.b0 b0Var = ((sb0) this.f12576c).f41078c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f12575b;
        b0Var.h1(i10, dp);
        return i10;
    }

    public r(j2.a aVar, int i10, b2.e1 e1Var, b2.e1 e1Var2) {
        this.f12574a = 2;
        this.f12576c = aVar;
        this.f12575b = i10;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        ug.m1 m1Var = (ug.m1) this.f12576c;
        bd bdVar = m1Var.f47753d0;
        HashSet hashSet = m1Var.f47757h0;
        if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            long j10 = user != null ? user.f20426id : -kVar.getChat().f20279id;
            int i11 = this.f12575b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                m1Var.f47762n0.put(Long.valueOf(j10), user);
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
                vg.h hVar = m1Var.f47764p0;
                boolean z12 = !z11;
                if (hVar.f48427y != z12) {
                    hVar.f48427y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f48421f, (Utilities.Callback<View>) new vg.f(z12));
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
        sn snVar = ((hj) this.f12576c).f37584b;
        int i10 = this.f12575b;
        if (i10 == 15 && ChatObject.isChannel(snVar.e)) {
            TLRPC.Chat chat = snVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                snVar.getMessagesController().deleteDialog(snVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = snVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(snVar, i11);
            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            snVar.finishFragment();
            snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.T5), snVar.f41229f, snVar.e, Boolean.valueOf(z10));
            return;
        }
        snVar.va(snVar.f41209d4, z10);
    }

    public r(Object obj, int i10, int i11) {
        this.f12574a = i11;
        this.f12576c = obj;
        this.f12575b = i10;
    }

    public r(hj hjVar, int i10, boolean z10) {
        this.f12574a = 4;
        this.f12576c = hjVar;
        this.f12575b = i10;
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
