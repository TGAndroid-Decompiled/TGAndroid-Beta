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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.dd0;
import org.telegram.ui.nc0;
import org.telegram.ui.nj;
import org.telegram.ui.o20;
import org.telegram.ui.pn0;
import org.telegram.ui.tj0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.xm0;
public final class t implements e2.m, MessagesStorage.BooleanCallback, rc0, ImageReceiver.ImageReceiverDelegate, d5, bl0, al0, a2, dd0, wk0, cl0 {
    public final int f11730a;
    public final int f11731b;
    public final Object f11732c;

    public t(int i10, Object obj, int i11) {
        this.f11730a = i11;
        this.f11731b = i10;
        this.f11732c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f11730a) {
            case 6:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f11731b, (no) this.f11732c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f11731b, (jo) this.f11732c, 9), 16L);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        fk0 fk0Var = (fk0) this.f11732c;
        if (this.f11731b == 5) {
            fk0Var.getClass();
            return false;
        }
        ek0 ek0Var = fk0Var.f26094g0;
        if (ek0Var == null || !(view instanceof dk0)) {
            return false;
        }
        ek0Var.B(fk0Var, ((dk0) view).f25410e, true, false);
        return true;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f11732c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f11731b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f11730a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f11732c, this.f11731b, view, i10);
                return;
            default:
                tj0.P((tj0) this.f11732c, this.f11731b, view);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f11730a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        f8 f8Var = (f8) this.f11732c;
        if (this.f11731b == f8Var.f25953b) {
            k8 k8Var = ((a8) f8Var).f24300e;
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
            if (k8Var.f27725i0.getTag() != null) {
                k8Var.f27726j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public String f(int i10) {
        Calendar calendar = (Calendar) this.f11732c;
        calendar.clear();
        int i11 = this.f11731b;
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
        switch (this.f11730a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f11732c).f33429d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f11731b).openByUserName("spambot", (n2) g.h(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f11732c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f33888e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20008id = profileActivity.getMessagesController().getInputUser(profileActivity.f33888e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f11731b);
                return;
            case 13:
                wg0 wg0Var = ((vg0) this.f11732c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f11731b;
                if (i11 != i12) {
                    ((LaunchActivity) wg0Var.getParentActivity()).K0(i12);
                }
                wg0Var.finishFragment();
                return;
            case 15:
                pn0 pn0Var = ((xm0) this.f11732c).f42763a;
                pn0Var.z1(pn0Var.Y[this.f11731b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f11732c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f11731b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11730a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((g1) this.f11732c).f11554a, this.f11731b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f11732c, this.f11731b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f11732c, this.f11731b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f11730a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((nc0) this.f11732c).f38918c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f11731b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public t(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f11730a = 2;
        this.f11732c = aVar;
        this.f11731b = i10;
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        ug.n1 n1Var = (ug.n1) this.f11732c;
        o20 o20Var = n1Var.f47160d0;
        HashSet hashSet = n1Var.f47164h0;
        if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f20016id : -lVar.getChat().f19869id;
            int i11 = this.f11731b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                n1Var.f47169n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == n1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                n1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                o20Var.setVisibility(0);
                o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(pr.h).setDuration(320L).withEndAction(!z11 ? new ug.b1(n1Var, 7) : null).start();
                vg.g gVar = n1Var.f47171p0;
                boolean z12 = !z11;
                if (gVar.f47830y != z12) {
                    gVar.f47830y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f47824f, (e2.h) new m4.n0(3, z12));
                }
            }
            n1Var.W();
            n1Var.Z.b(true, hashSet, new ug.b1(n1Var, 8), null);
            n1Var.i0(true, true);
            n1Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        co coVar = ((nj) this.f11732c).f38967b;
        int i10 = this.f11731b;
        if (i10 == 15 && ChatObject.isChannel(coVar.f35237e)) {
            TLRPC.Chat chat = coVar.f35237e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                coVar.getMessagesController().deleteDialog(coVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = coVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(coVar, i11);
            coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            coVar.finishFragment();
            coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(coVar.T5), coVar.f35249f, coVar.f35237e, Boolean.valueOf(z10));
            return;
        }
        coVar.qa(coVar.f35228d4, z10);
    }

    public t(Object obj, int i10, int i11) {
        this.f11730a = i11;
        this.f11732c = obj;
        this.f11731b = i10;
    }

    public t(nj njVar, int i10, boolean z10) {
        this.f11730a = 3;
        this.f11732c = njVar;
        this.f11731b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
