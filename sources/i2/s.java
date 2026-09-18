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
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ed0;
import org.telegram.ui.mj;
import org.telegram.ui.o20;
import org.telegram.ui.oc0;
import org.telegram.ui.pn0;
import org.telegram.ui.sj0;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;
import org.telegram.ui.xm0;
import org.telegram.ui.zn;
public final class s implements e2.m, MessagesStorage.BooleanCallback, zc0, ImageReceiver.ImageReceiverDelegate, d5, ml0, ll0, a2, ed0, hl0, nl0 {
    public final int f10872a;
    public final int f10873b;
    public final Object f10874c;

    public s(int i10, Object obj, int i11) {
        this.f10872a = i11;
        this.f10873b = i10;
        this.f10874c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f10872a) {
            case 6:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10873b, (oo) this.f10874c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.f10873b, (ko) this.f10874c, 9), 16L);
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f10874c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f10873b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f10872a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f10874c, this.f10873b, view, i10);
                return;
            default:
                sj0.P((sj0) this.f10874c, this.f10873b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        qk0 qk0Var = (qk0) this.f10874c;
        if (this.f10873b == 5) {
            qk0Var.getClass();
            return false;
        }
        pk0 pk0Var = qk0Var.f27650g0;
        if (pk0Var == null || !(view instanceof ok0)) {
            return false;
        }
        pk0Var.h(qk0Var, ((ok0) view).e, true, false);
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f10872a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        e8 e8Var = (e8) this.f10874c;
        if (this.f10873b == e8Var.f23806b) {
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
            if (j8Var.f25211i0.getTag() != null) {
                j8Var.f25212j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f10872a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f10874c).f31064d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f10873b).openByUserName("spambot", (n2) hg.k0.g(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f10874c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f31513e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f18435id = profileActivity.getMessagesController().getInputUser(profileActivity.f31513e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f10873b);
                return;
            case 13:
                xg0 xg0Var = ((wg0) this.f10874c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f10873b;
                if (i11 != i12) {
                    ((LaunchActivity) xg0Var.getParentActivity()).K0(i12);
                }
                xg0Var.finishFragment();
                return;
            case 15:
                pn0 pn0Var = ((xm0) this.f10874c).f39521a;
                pn0Var.z1(pn0Var.Y[this.f10873b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f10874c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f10873b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10872a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((g1) this.f10874c).f10718a, this.f10873b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f10874c, this.f10873b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f10874c, this.f10873b);
                return;
        }
    }

    @Override
    public String j(int i10) {
        Calendar calendar = (Calendar) this.f10874c;
        calendar.clear();
        int i11 = this.f10873b;
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
        int i10 = this.f10872a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((oc0) this.f10874c).f36166c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f10873b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f10872a = 2;
        this.f10874c = aVar;
        this.f10873b = i10;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.f10874c;
        o20 o20Var = m1Var.f43410d0;
        HashSet hashSet = m1Var.f43414h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f18443id : -lVar.getChat().f18296id;
            int i11 = this.f10873b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                m1Var.f43419n0.put(Long.valueOf(j3), user);
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
                ug.g gVar = m1Var.f43421p0;
                boolean z12 = !z11;
                if (gVar.f44000y != z12) {
                    gVar.f44000y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f43994f, (e2.h) new m4.n0(3, z12));
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
        zn znVar = ((mj) this.f10874c).f35681b;
        int i10 = this.f10873b;
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
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f40263f, znVar.e, Boolean.valueOf(z10));
            return;
        }
        znVar.qa(znVar.f40243d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f10872a = i11;
        this.f10874c = obj;
        this.f10873b = i10;
    }

    public s(mj mjVar, int i10, boolean z10) {
        this.f10872a = 3;
        this.f10874c = mjVar;
        this.f10873b = i10;
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
