package cg;

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
import java.util.Iterator;
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
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dj;
import org.telegram.ui.dj0;
import org.telegram.ui.gm0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.oc0;
import org.telegram.ui.rn;
import org.telegram.ui.xb0;
import org.telegram.ui.xm0;

public final class p2 implements sk0, d5.k, MessagesStorage.BooleanCallback, bc0, ImageReceiver.ImageReceiverDelegate, x4, rk0, qk0, org.telegram.ui.ActionBar.a2, oc0, mk0 {

    public final int f2804a;

    public final int f2805b;

    public final Object f2806c;

    public p2(int i10, Object obj, int i11) {
        this.f2804a = i11;
        this.f2805b = i10;
        this.f2806c = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f2804a) {
            case 5:
                AndroidUtilities.runOnUIThread(new h3.z(i10, this.f2805b, (bo) this.f2806c, 7), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new h3.z(i10, this.f2805b, (xn) this.f2806c, 8), 16L);
                break;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        wj0 wj0Var = (wj0) this.f2806c;
        if (this.f2805b == 5) {
            wj0Var.getClass();
            return false;
        }
        vj0 vj0Var = wj0Var.f34240c0;
        if (vj0Var == null || !(view instanceof uj0)) {
            return false;
        }
        vj0Var.n(wj0Var, ((uj0) view).f33102e, true, false);
        return true;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f2804a) {
            case 8:
                ContactsActivity.U((ContactsActivity) this.f2806c, this.f2805b, view, i10);
                break;
            default:
                dj0.P((dj0) this.f2806c, this.f2805b, view);
                break;
        }
    }

    @Override
    public void c0(View view, float f10, float f11) {
        int i10 = this.f2804a;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap map = (HashMap) this.f2806c;
        Pattern pattern = LaunchActivity.f35496x1;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.f2805b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        w7 w7Var = (w7) this.f2806c;
        if (this.f2805b == w7Var.f34130b) {
            b8 b8Var = ((r7) w7Var).f32096e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int iDp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            s7 s7Var = b8Var.F;
            ValueAnimator valueAnimator = b8Var.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                b8Var.O0 = null;
            }
            if (s7Var.getCustomPaddingRight() != iDp) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(s7Var.getCustomPaddingRight(), iDp);
                b8Var.O0 = valueAnimatorOfInt;
                if (iDp == 0) {
                    valueAnimatorOfInt.setStartDelay(200L);
                    b8Var.O0.setDuration(100L);
                } else {
                    valueAnimatorOfInt.setDuration(200L);
                }
                b8Var.O0.setInterpolator(new DecelerateInterpolator());
                b8Var.O0.addUpdateListener(new e6(b8Var, 2));
                b8Var.O0.start();
            }
            if (b8Var.f27017e0.getTag() != null) {
                b8Var.f27019f0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2804a) {
            case 9:
                ArrayList arrayList = ((LaunchActivity) this.f2806c).Z;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f2805b).openByUserName("spambot", (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList), 1);
                }
                break;
            case 10:
            case 11:
            case 13:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f2806c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35923a1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f22519id = profileActivity.getMessagesController().getInputUser(profileActivity.f35923a1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f2805b);
                break;
            case 12:
                ig0 ig0Var = ((hg0) this.f2806c).R;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f2805b;
                if (i11 != i12) {
                    ((LaunchActivity) ig0Var.getParentActivity()).K0(i12);
                }
                ig0Var.finishFragment();
                break;
            case 14:
                xm0 xm0Var = ((gm0) this.f2806c).f38446a;
                xm0Var.z1(xm0Var.U[this.f2805b]);
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f2806c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f2805b, false), true);
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f2804a) {
        }
        return false;
    }

    @Override
    public String g(int i10) {
        Calendar calendar = (Calendar) this.f2806c;
        calendar.clear();
        int i11 = this.f2805b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        ((h3.a2) obj).onMediaItemTransition((h3.f1) this.f2806c, this.f2805b);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        f2.k0 k0Var = ((xb0) this.f2806c).f44374c;
        int iDp = AndroidUtilities.dp(60.0f);
        int i10 = this.f2805b;
        k0Var.h1(i10, iDp);
        return i10;
    }

    public p2(Object obj, int i10, int i11) {
        this.f2804a = i11;
        this.f2806c = obj;
        this.f2805b = i10;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        y2 y2Var = (y2) this.f2806c;
        gg.a aVar = y2Var.Z;
        HashSet hashSet = y2Var.f2871d0;
        if (!(view instanceof gg.o)) {
            return false;
        }
        gg.o oVar = (gg.o) view;
        TLRPC.User user = oVar.getUser();
        long j10 = user != null ? user.f22527id : -oVar.getChat().f22380id;
        int i11 = this.f2805b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            y2Var.f2877j0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == y2Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            y2Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(er.h).setDuration(320L).withEndAction(!z11 ? new j2(y2Var, 7) : null).start();
            dg.h hVar = y2Var.f2879l0;
            boolean z12 = !z11;
            if (hVar.f4968x != z12) {
                hVar.f4968x = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f4963f, (d5.d) new dg.f(z12));
            }
        }
        y2Var.W();
        y2Var.V.b(true, hashSet, new j2(y2Var, 8), null);
        y2Var.i0(true, true);
        y2Var.X();
        return true;
    }

    @Override
    public void run(boolean z10) {
        rn rnVar = ((dj) this.f2806c).f37415b;
        int i10 = this.f2805b;
        if (i10 == 15 && ChatObject.isChannel(rnVar.f42026e)) {
            TLRPC.Chat chat = rnVar.f42026e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                rnVar.getMessagesController().deleteDialog(rnVar.P5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            rnVar.qa(rnVar.Z3, z10);
            return;
        }
        NotificationCenter notificationCenter = rnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(rnVar, i11);
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        rnVar.finishFragment();
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(rnVar.P5), rnVar.f42039f, rnVar.f42026e, Boolean.valueOf(z10));
    }

    public p2(dj djVar, int i10, boolean z10) {
        this.f2804a = 2;
        this.f2806c = djVar;
        this.f2805b = i10;
    }

    @Override
    public void i() {
    }

    @Override
    public void s(float f10) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}
