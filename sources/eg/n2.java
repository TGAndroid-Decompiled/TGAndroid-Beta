package eg;

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
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dm0;
import org.telegram.ui.eg0;
import org.telegram.ui.ej;
import org.telegram.ui.fg0;
import org.telegram.ui.tn;
import org.telegram.ui.ub0;
import org.telegram.ui.vm0;
import org.telegram.ui.zi0;
public final class n2 implements cl0, f5.j, MessagesStorage.BooleanCallback, mc0, ImageReceiver.ImageReceiverDelegate, b5, bl0, al0, org.telegram.ui.ActionBar.b2, org.telegram.ui.mc0, wk0 {
    public final int f6100a;
    public final int f6101b;
    public final Object f6102c;

    public n2(int i10, Object obj, int i11) {
        this.f6100a = i11;
        this.f6101b = i10;
        this.f6102c = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f6100a) {
            case 5:
                AndroidUtilities.runOnUIThread(new j3.y(i10, this.f6101b, (io) this.f6102c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j3.y(i10, this.f6101b, (eo) this.f6102c, 8), 16L);
                return;
        }
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        switch (this.f6100a) {
            case 8:
                ContactsActivity.U((ContactsActivity) this.f6102c, this.f6101b, view, i10);
                return;
            default:
                zi0.P((zi0) this.f6102c, this.f6101b, view);
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f6100a) {
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        fk0 fk0Var = (fk0) this.f6102c;
        if (this.f6101b == 5) {
            fk0Var.getClass();
            return false;
        }
        ek0 ek0Var = fk0Var.f28438c0;
        if (ek0Var == null || !(view instanceof dk0)) {
            return false;
        }
        ek0Var.Q(fk0Var, ((dk0) view).f27797e, true, false);
        return true;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.f35560x1;
        for (Map.Entry entry : ((HashMap) this.f6102c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f6101b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        b8 b8Var = (b8) this.f6102c;
        if (this.f6101b == b8Var.f27001b) {
            g8 g8Var = ((w7) b8Var).f34341e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            x7 x7Var = g8Var.F;
            ValueAnimator valueAnimator = g8Var.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g8Var.O0 = null;
            }
            if (x7Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), i10);
                g8Var.O0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    g8Var.O0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                g8Var.O0.setInterpolator(new DecelerateInterpolator());
                g8Var.O0.addUpdateListener(new j6(g8Var, 2));
                g8Var.O0.start();
            }
            if (g8Var.f28783e0.getTag() != null) {
                g8Var.f28785f0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f6102c;
        calendar.clear();
        int i11 = this.f6101b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f6100a) {
            case 9:
                ArrayList arrayList = ((LaunchActivity) this.f6102c).Z;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f6101b).openByUserName("spambot", (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList), 1);
                    return;
                }
                return;
            case 10:
            case 11:
            case 13:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f6102c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35986a1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f22531id = profileActivity.getMessagesController().getInputUser(profileActivity.f35986a1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f6101b);
                return;
            case 12:
                fg0 fg0Var = ((eg0) this.f6102c).R;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f6101b;
                if (i11 != i12) {
                    ((LaunchActivity) fg0Var.getParentActivity()).K0(i12);
                }
                fg0Var.finishFragment();
                return;
            case 14:
                vm0 vm0Var = ((dm0) this.f6102c).f37561a;
                vm0Var.z1(vm0Var.U[this.f6101b]);
                return;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f6102c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f6101b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((j3.a2) obj).onMediaItemTransition((j3.f1) this.f6102c, this.f6101b);
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f6100a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        f2.j0 j0Var = ((ub0) this.f6102c).f43216c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f6101b;
        j0Var.h1(i10, dp);
        return i10;
    }

    public n2(Object obj, int i10, int i11) {
        this.f6100a = i11;
        this.f6102c = obj;
        this.f6101b = i10;
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        w2 w2Var = (w2) this.f6102c;
        ig.a aVar = w2Var.Z;
        HashSet hashSet = w2Var.f6165d0;
        if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            TLRPC.User user = nVar.getUser();
            long j10 = user != null ? user.f22539id : -nVar.getChat().f22392id;
            int i11 = this.f6101b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                w2Var.f6171j0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == w2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                w2Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(jr.h).setDuration(320L).withEndAction(!z11 ? new h2(w2Var, 7) : null).start();
                fg.h hVar = w2Var.f6173l0;
                boolean z12 = !z11;
                if (hVar.f6763x != z12) {
                    hVar.f6763x = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f6758f, (f5.d) new fg.f(z12));
                }
            }
            w2Var.W();
            w2Var.V.b(true, hashSet, new h2(w2Var, 8), null);
            w2Var.i0(true, true);
            w2Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        tn tnVar = ((ej) this.f6102c).f37848b;
        int i10 = this.f6101b;
        if (i10 == 15 && ChatObject.isChannel(tnVar.f42787e)) {
            TLRPC.Chat chat = tnVar.f42787e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                tnVar.getMessagesController().deleteDialog(tnVar.P5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = tnVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(tnVar, i11);
            tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            tnVar.finishFragment();
            tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(tnVar.P5), tnVar.f42801f, tnVar.f42787e, Boolean.valueOf(z10));
            return;
        }
        tnVar.qa(tnVar.Z3, z10);
    }

    public n2(ej ejVar, int i10, boolean z10) {
        this.f6100a = 2;
        this.f6102c = ejVar;
        this.f6101b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void r(float f9) {
    }

    private final void a(View view, float f9, float f10) {
    }

    private final void f(View view, float f9, float f10) {
    }
}
