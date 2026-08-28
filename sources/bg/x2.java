package bg;

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
import org.telegram.messenger.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bj;
import org.telegram.ui.bj0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.fm0;
import org.telegram.ui.kc0;
import org.telegram.ui.qn;
import org.telegram.ui.sb0;
import org.telegram.ui.wm0;
public final class x2 implements pk0, d5.k, MessagesStorage.BooleanCallback, xb0, ImageReceiver.ImageReceiverDelegate, x4, ok0, nk0, org.telegram.ui.ActionBar.b2, kc0, jk0 {
    public final int f1998a;
    public final int f1999b;
    public final Object f2000c;

    public x2(int i9, Object obj, int i10) {
        this.f1998a = i10;
        this.f1999b = i9;
        this.f2000c = obj;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f1998a) {
            case 5:
                AndroidUtilities.runOnUIThread(new h3.y(i9, this.f1999b, (eo) this.f2000c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new h3.y(i9, this.f1999b, (zn) this.f2000c, 9), 16L);
                return;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        uj0 uj0Var = (uj0) this.f2000c;
        if (this.f1999b == 5) {
            uj0Var.getClass();
            return false;
        }
        tj0 tj0Var = uj0Var.f33049c0;
        if (tj0Var == null || !(view instanceof sj0)) {
            return false;
        }
        tj0Var.d(uj0Var, ((sj0) view).f32477e, true, false);
        return true;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        switch (this.f1998a) {
            case 8:
                ContactsActivity.T((ContactsActivity) this.f2000c, this.f1999b, view, i9);
                return;
            default:
                bj0.O((bj0) this.f2000c, this.f1999b, view);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        Pattern pattern = LaunchActivity.f35493x1;
        for (Map.Entry entry : ((HashMap) this.f2000c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f1999b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i9;
        x7 x7Var = (x7) this.f2000c;
        if (this.f1999b == x7Var.f34594b) {
            c8 c8Var = ((s7) x7Var).f32386e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i9 = AndroidUtilities.dp(64.0f);
            } else {
                i9 = 0;
            }
            t7 t7Var = c8Var.F;
            ValueAnimator valueAnimator = c8Var.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c8Var.O0 = null;
            }
            if (t7Var.getCustomPaddingRight() != i9) {
                ValueAnimator ofInt = ValueAnimator.ofInt(t7Var.getCustomPaddingRight(), i9);
                c8Var.O0 = ofInt;
                if (i9 == 0) {
                    ofInt.setStartDelay(200L);
                    c8Var.O0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                c8Var.O0.setInterpolator(new DecelerateInterpolator());
                c8Var.O0.addUpdateListener(new e6(c8Var, 2));
                c8Var.O0.start();
            }
            if (c8Var.f27385e0.getTag() != null) {
                c8Var.f27387f0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f1998a) {
            case 9:
                ArrayList arrayList = ((LaunchActivity) this.f2000c).Z;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f1999b).openByUserName("spambot", (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList), 1);
                    return;
                }
                return;
            case 10:
            case 11:
            case 13:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f2000c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35920a1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f22519id = profileActivity.getMessagesController().getInputUser(profileActivity.f35920a1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f1999b);
                return;
            case 12:
                fg0 fg0Var = ((eg0) this.f2000c).R;
                int i10 = UserConfig.selectedAccount;
                int i11 = this.f1999b;
                if (i10 != i11) {
                    ((LaunchActivity) fg0Var.getParentActivity()).K0(i11);
                }
                fg0Var.finishFragment();
                return;
            case 14:
                wm0 wm0Var = ((fm0) this.f2000c).f38315a;
                wm0Var.z1(wm0Var.U[this.f1999b]);
                return;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f2000c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f1999b, false), true);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f1998a) {
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(int i9) {
        Calendar calendar = (Calendar) this.f2000c;
        calendar.clear();
        int i10 = this.f1999b;
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i9 - 120);
        if (calendar.get(1) == i10) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void g0(View view, float f10, float f11) {
        int i9 = this.f1998a;
    }

    @Override
    public void invoke(Object obj) {
        ((h3.a2) obj).onMediaItemTransition((h3.f1) this.f2000c, this.f1999b);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        f2.m0 m0Var = ((sb0) this.f2000c).f42651c;
        int dp = AndroidUtilities.dp(60.0f);
        int i9 = this.f1999b;
        m0Var.h1(i9, dp);
        return i9;
    }

    public x2(Object obj, int i9, int i10) {
        this.f1998a = i10;
        this.f2000c = obj;
        this.f1999b = i9;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        g3 g3Var = (g3) this.f2000c;
        fg.a aVar = g3Var.Z;
        HashSet hashSet = g3Var.f1776d0;
        if (view instanceof fg.p) {
            fg.p pVar = (fg.p) view;
            TLRPC.User user = pVar.getUser();
            long j10 = user != null ? user.f22527id : -pVar.getChat().f22380id;
            int i10 = this.f1999b;
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                g3Var.f1782j0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == g3Var.Y() + 1) {
                hashSet.remove(Long.valueOf(j10));
                g3Var.e0();
                return true;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(gr.h).setDuration(320L).withEndAction(!z11 ? new r2(g3Var, 7) : null).start();
                cg.h hVar = g3Var.f1784l0;
                boolean z12 = !z11;
                if (hVar.f2424x != z12) {
                    hVar.f2424x = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f2419f, (d5.d) new cg.f(z12));
                }
            }
            g3Var.V();
            g3Var.V.b(true, hashSet, new r2(g3Var, 8), null);
            g3Var.h0(true, true);
            g3Var.W();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        qn qnVar = ((bj) this.f2000c).f36877b;
        int i9 = this.f1999b;
        if (i9 == 15 && ChatObject.isChannel(qnVar.f41890e)) {
            TLRPC.Chat chat = qnVar.f41890e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                qnVar.getMessagesController().deleteDialog(qnVar.P5, 2, z10);
                return;
            }
        }
        if (i9 != 15) {
            NotificationCenter notificationCenter = qnVar.getNotificationCenter();
            int i10 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(qnVar, i10);
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            qnVar.finishFragment();
            qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.P5), qnVar.f41903f, qnVar.f41890e, Boolean.valueOf(z10));
            return;
        }
        qnVar.qa(qnVar.Z3, z10);
    }

    public x2(bj bjVar, int i9, boolean z10) {
        this.f1998a = 2;
        this.f2000c = bjVar;
        this.f1999b = i9;
    }

    @Override
    public void j() {
    }

    @Override
    public void u(float f10) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}
