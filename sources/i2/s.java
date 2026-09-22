package i2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
import org.telegram.messenger.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fd0;
import org.telegram.ui.nj;
import org.telegram.ui.o20;
import org.telegram.ui.pc0;
import org.telegram.ui.pn0;
import org.telegram.ui.uj0;
import org.telegram.ui.xg0;
import org.telegram.ui.xm0;
import org.telegram.ui.yg0;
import org.telegram.ui.zn;
public final class s implements e2.m, MessagesStorage.BooleanCallback, bd0, ImageReceiver.ImageReceiverDelegate, c5, ol0, nl0, a2, fd0, jl0, pl0 {
    public final int f10873a;
    public final int f10874b;
    public final Object f10875c;

    public s(int i10, Object obj, int i11) {
        this.f10873a = i11;
        this.f10874b = i10;
        this.f10875c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f10873a) {
            case 6:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10874b, (oo) this.f10875c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10874b, (ko) this.f10875c, 9), 16L);
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f10875c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f10874b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f10873a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f10875c, this.f10874b, view, i10);
                return;
            default:
                uj0.P((uj0) this.f10875c, this.f10874b, view);
                return;
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f10873a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        sk0 sk0Var = (sk0) this.f10875c;
        if (this.f10874b == 5) {
            sk0Var.getClass();
            return false;
        }
        rk0 rk0Var = sk0Var.f28242g0;
        if (rk0Var == null || !(view instanceof qk0)) {
            return false;
        }
        rk0Var.h(sk0Var, ((qk0) view).e, true, false);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        d8 d8Var = (d8) this.f10875c;
        if (this.f10874b == d8Var.f23583b) {
            i8 i8Var = ((y7) d8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            z7 z7Var = i8Var.J;
            ValueAnimator valueAnimator = i8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i8Var.S0 = null;
            }
            if (z7Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(z7Var.getCustomPaddingRight(), i10);
                i8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    i8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                i8Var.S0.setInterpolator(new DecelerateInterpolator());
                i8Var.S0.addUpdateListener(new j6(i8Var, 2));
                i8Var.S0.start();
            }
            if (i8Var.f25008i0.getTag() != null) {
                i8Var.f25009j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f10875c;
        calendar.clear();
        int i11 = this.f10874b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10873a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((g1) this.f10875c).f10719a, this.f10874b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f10875c, this.f10874b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f10875c, this.f10874b);
                return;
        }
    }

    @Override
    public void k(b2 b2Var, int i10) {
        switch (this.f10873a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f10875c).f31125d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f10874b).openByUserName("spambot", (n2) hg.k0.g(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f10875c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f31574e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f18482id = profileActivity.getMessagesController().getInputUser(profileActivity.f31574e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f10874b);
                return;
            case 13:
                yg0 yg0Var = ((xg0) this.f10875c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f10874b;
                if (i11 != i12) {
                    ((LaunchActivity) yg0Var.getParentActivity()).K0(i12);
                }
                yg0Var.finishFragment();
                return;
            case 15:
                pn0 pn0Var = ((xm0) this.f10875c).f39646a;
                pn0Var.z1(pn0Var.Y[this.f10874b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f10875c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f10874b, false), true);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f10873a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((pc0) this.f10875c).f36560c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f10874b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f10873a = 2;
        this.f10875c = aVar;
        this.f10874b = i10;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f10875c;
        o20 o20Var = m1Var.f43475d0;
        HashSet hashSet = m1Var.f43479h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f18490id : -lVar.getChat().f18343id;
            int i11 = this.f10874b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f43484n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == m1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                m1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                o20Var.setVisibility(0);
                o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(qr.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
                ug.g gVar = m1Var.f43486p0;
                boolean z12 = !z11;
                if (gVar.f44065y != z12) {
                    gVar.f44065y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f44059f, (e2.h) new m4.n0(3, z12));
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
        zn znVar = ((nj) this.f10875c).f36059b;
        int i10 = this.f10874b;
        if (i10 == 15 && ChatObject.isChannel(znVar.e)) {
            TLRPC.Chat chat = znVar.e;
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
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f40326f, znVar.e, Boolean.valueOf(z10));
            return;
        }
        znVar.qa(znVar.f40306d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f10873a = i11;
        this.f10875c = obj;
        this.f10874b = i10;
    }

    public s(nj njVar, int i10, boolean z10) {
        this.f10873a = 3;
        this.f10875c = njVar;
        this.f10874b = i10;
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
