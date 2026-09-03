package gg;

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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.gc0;
import org.telegram.ui.jj0;
import org.telegram.ui.lj;
import org.telegram.ui.nm0;
import org.telegram.ui.og0;
import org.telegram.ui.pg0;
import org.telegram.ui.xc0;
import org.telegram.ui.zn;
public final class m2 implements kl0, h5.j, MessagesStorage.BooleanCallback, tc0, ImageReceiver.ImageReceiverDelegate, y4, jl0, il0, org.telegram.ui.ActionBar.c2, xc0, el0 {
    public final int f6705a;
    public final int f6706b;
    public final Object f6707c;

    public m2(int i10, Object obj, int i11) {
        this.f6705a = i11;
        this.f6706b = i10;
        this.f6707c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f6705a) {
            case 6:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f6706b, (jo) this.f6707c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f6706b, (fo) this.f6707c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean Z0(View view) {
        switch (this.f6705a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        Pattern pattern = LaunchActivity.f31586y1;
        for (Map.Entry entry : ((HashMap) this.f6707c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f6706b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f6705a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f6707c, this.f6706b, view, i10);
                return;
            default:
                jj0.P((jj0) this.f6707c, this.f6706b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        pk0 pk0Var = (pk0) this.f6707c;
        if (this.f6706b == 5) {
            pk0Var.getClass();
            return false;
        }
        ok0 ok0Var = pk0Var.f27889d0;
        if (ok0Var == null || !(view instanceof nk0)) {
            return false;
        }
        ok0Var.j(pk0Var, ((nk0) view).e, true, false);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        int i10;
        x7 x7Var = (x7) this.f6707c;
        if (this.f6706b == x7Var.f30520b) {
            c8 c8Var = ((s7) x7Var).e;
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
            if (c8Var.f23848f0.getTag() != null) {
                c8Var.f23849g0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f6707c;
        calendar.clear();
        int i11 = this.f6706b;
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
        switch (this.f6705a) {
            case 1:
                ((j3.y1) obj).onMediaItemTransition((j3.c1) this.f6707c, this.f6706b);
                return;
            default:
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.h((k3.a) this.f6707c, this.f6706b);
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6705a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f6707c).f31588a0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f6706b).openByUserName("spambot", (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f6707c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f32011b1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f19298id = profileActivity.getMessagesController().getInputUser(profileActivity.f32011b1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f6706b);
                return;
            case 13:
                pg0 pg0Var = ((og0) this.f6707c).S;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f6706b;
                if (i11 != i12) {
                    ((LaunchActivity) pg0Var.getParentActivity()).K0(i12);
                }
                pg0Var.finishFragment();
                return;
            case 15:
                fn0 fn0Var = ((nm0) this.f6707c).f36539a;
                fn0Var.z1(fn0Var.V[this.f6706b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f6707c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f6706b, false), true);
                return;
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
        int i10 = this.f6705a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        f2.i0 i0Var = ((gc0) this.f6707c).f34410c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f6706b;
        i0Var.h1(i10, dp);
        return i10;
    }

    public m2(Object obj, int i10, int i11) {
        this.f6705a = i11;
        this.f6707c = obj;
        this.f6706b = i10;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        v2 v2Var = (v2) this.f6707c;
        kg.a aVar = v2Var.f6763a0;
        HashSet hashSet = v2Var.f6767e0;
        if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
            TLRPC.User user = nVar.getUser();
            long j10 = user != null ? user.f19306id : -nVar.getChat().f19159id;
            int i11 = this.f6706b;
            boolean z4 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                v2Var.f6773k0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == v2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                v2Var.f0();
                return true;
            }
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z4 != z10) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(mr.h).setDuration(320L).withEndAction(!z10 ? new g2(v2Var, 7) : null).start();
                hg.h hVar = v2Var.m0;
                boolean z11 = !z10;
                if (hVar.f7090x != z11) {
                    hVar.f7090x = z11;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f7085f, (h5.d) new hg.f(z11));
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
        zn znVar = ((lj) this.f6707c).f35790b;
        int i10 = this.f6706b;
        if (i10 == 15 && ChatObject.isChannel(znVar.e)) {
            TLRPC.Chat chat = znVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                znVar.getMessagesController().deleteDialog(znVar.Q5, 2, z4);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = znVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(znVar, i11);
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            znVar.finishFragment();
            znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.Q5), znVar.f40575f, znVar.e, Boolean.valueOf(z4));
            return;
        }
        znVar.qa(znVar.f40514a4, z4);
    }

    public m2(k3.a aVar, int i10, j3.z1 z1Var, j3.z1 z1Var2) {
        this.f6705a = 2;
        this.f6707c = aVar;
        this.f6706b = i10;
    }

    public m2(lj ljVar, int i10, boolean z4) {
        this.f6705a = 3;
        this.f6707c = ljVar;
        this.f6706b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void f(View view, float f10, float f11) {
    }
}
