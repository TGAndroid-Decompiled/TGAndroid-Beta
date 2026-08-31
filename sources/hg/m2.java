package hg;

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
import org.telegram.messenger.j5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fc0;
import org.telegram.ui.fn0;
import org.telegram.ui.ij0;
import org.telegram.ui.jj;
import org.telegram.ui.ng0;
import org.telegram.ui.nm0;
import org.telegram.ui.og0;
import org.telegram.ui.wc0;
import org.telegram.ui.xn;
public final class m2 implements ml0, h5.j, MessagesStorage.BooleanCallback, uc0, ImageReceiver.ImageReceiverDelegate, y4, ll0, kl0, org.telegram.ui.ActionBar.c2, wc0, gl0 {
    public final int f7569a;
    public final int f7570b;
    public final Object f7571c;

    public m2(int i10, Object obj, int i11) {
        this.f7569a = i11;
        this.f7570b = i10;
        this.f7571c = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f7569a) {
            case 6:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f7570b, (mo) this.f7571c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f7570b, (io) this.f7571c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f7569a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f7569a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f7571c, this.f7570b, view, i10);
                return;
            default:
                ij0.P((ij0) this.f7571c, this.f7570b, view);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        Pattern pattern = LaunchActivity.f34134y1;
        for (Map.Entry entry : ((HashMap) this.f7571c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f7570b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        int i10;
        x7 x7Var = (x7) this.f7571c;
        if (this.f7570b == x7Var.f32966b) {
            c8 c8Var = ((s7) x7Var).f30997e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            t7 t7Var = c8Var.G;
            ValueAnimator valueAnimator = c8Var.P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c8Var.P0 = null;
            }
            if (t7Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(t7Var.getCustomPaddingRight(), i10);
                c8Var.P0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    c8Var.P0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                c8Var.P0.setInterpolator(new DecelerateInterpolator());
                c8Var.P0.addUpdateListener(new f6(c8Var, 2));
                c8Var.P0.start();
            }
            if (c8Var.f25836f0.getTag() != null) {
                c8Var.f25837g0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f7571c;
        calendar.clear();
        int i11 = this.f7570b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public boolean f(int i10, View view) {
        rk0 rk0Var = (rk0) this.f7571c;
        if (this.f7570b == 5) {
            rk0Var.getClass();
            return false;
        }
        qk0 qk0Var = rk0Var.f30761d0;
        if (qk0Var == null || !(view instanceof pk0)) {
            return false;
        }
        qk0Var.o(rk0Var, ((pk0) view).f30101e, true, false);
        return true;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f7569a) {
            case 1:
                ((j3.y1) obj).onMediaItemTransition((j3.c1) this.f7571c, this.f7570b);
                return;
            default:
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.h((k3.a) this.f7571c, this.f7570b);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f7569a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f7571c).f34136a0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f7570b).openByUserName("spambot", (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f7571c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f34569b1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f20982id = profileActivity.getMessagesController().getInputUser(profileActivity.f34569b1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f7570b);
                return;
            case 13:
                og0 og0Var = ((ng0) this.f7571c).S;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f7570b;
                if (i11 != i12) {
                    ((LaunchActivity) og0Var.getParentActivity()).K0(i12);
                }
                og0Var.finishFragment();
                return;
            case 15:
                fn0 fn0Var = ((nm0) this.f7571c).f39483a;
                fn0Var.z1(fn0Var.V[this.f7570b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f7571c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f7570b, false), true);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f7569a;
    }

    @Override
    public int run() {
        f2.j0 j0Var = ((fc0) this.f7571c).f36845c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f7570b;
        j0Var.h1(i10, dp);
        return i10;
    }

    public m2(Object obj, int i10, int i11) {
        this.f7569a = i11;
        this.f7571c = obj;
        this.f7570b = i10;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        v2 v2Var = (v2) this.f7571c;
        lg.a aVar = v2Var.f7632a0;
        HashSet hashSet = v2Var.f7636e0;
        if (view instanceof lg.n) {
            lg.n nVar = (lg.n) view;
            TLRPC.User user = nVar.getUser();
            long j10 = user != null ? user.f20990id : -nVar.getChat().f20843id;
            int i11 = this.f7570b;
            boolean z4 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                v2Var.f7642k0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == v2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                v2Var.f0();
                return true;
            }
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z4 != z10) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(pr.h).setDuration(320L).withEndAction(!z10 ? new g2(v2Var, 7) : null).start();
                ig.h hVar = v2Var.m0;
                boolean z11 = !z10;
                if (hVar.f8105x != z11) {
                    hVar.f8105x = z11;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f8100f, (h5.d) new ig.f(z11));
                }
            }
            v2Var.W();
            v2Var.W.b(true, hashSet, new g2(v2Var, 8), null);
            v2Var.i0(true, true);
            v2Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z4) {
        xn xnVar = ((jj) this.f7571c).f38171b;
        int i10 = this.f7570b;
        if (i10 == 15 && ChatObject.isChannel(xnVar.f43165e)) {
            TLRPC.Chat chat = xnVar.f43165e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                xnVar.getMessagesController().deleteDialog(xnVar.Q5, 2, z4);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = xnVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(xnVar, i11);
            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            xnVar.finishFragment();
            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.Q5), xnVar.f43178f, xnVar.f43165e, Boolean.valueOf(z4));
            return;
        }
        xnVar.qa(xnVar.f43116a4, z4);
    }

    public m2(k3.a aVar, int i10, j3.z1 z1Var, j3.z1 z1Var2) {
        this.f7569a = 2;
        this.f7571c = aVar;
        this.f7570b = i10;
    }

    public m2(jj jjVar, int i10, boolean z4) {
        this.f7569a = 3;
        this.f7571c = jjVar;
        this.f7570b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }
}
