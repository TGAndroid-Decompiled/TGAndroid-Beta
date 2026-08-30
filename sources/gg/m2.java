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
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.ec0;
import org.telegram.ui.hj0;
import org.telegram.ui.jj;
import org.telegram.ui.lm0;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.vc0;
import org.telegram.ui.xn;
public final class m2 implements ll0, h5.j, MessagesStorage.BooleanCallback, sc0, ImageReceiver.ImageReceiverDelegate, y4, kl0, jl0, org.telegram.ui.ActionBar.c2, vc0, fl0 {
    public final int f6718a;
    public final int f6719b;
    public final Object f6720c;

    public m2(int i10, Object obj, int i11) {
        this.f6718a = i11;
        this.f6719b = i10;
        this.f6720c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f6718a) {
            case 6:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f6719b, (ko) this.f6720c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.f6719b, (go) this.f6720c, 8), 16L);
                return;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        switch (this.f6718a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f6720c, this.f6719b, view, i10);
                return;
            default:
                hj0.P((hj0) this.f6720c, this.f6719b, view);
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        Pattern pattern = LaunchActivity.f31612y1;
        for (Map.Entry entry : ((HashMap) this.f6720c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f6719b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        int i10;
        x7 x7Var = (x7) this.f6720c;
        if (this.f6719b == x7Var.f30589b) {
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
            if (c8Var.f23893f0.getTag() != null) {
                c8Var.f23894g0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f6720c;
        calendar.clear();
        int i11 = this.f6719b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public boolean e1(View view) {
        switch (this.f6718a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        pk0 pk0Var = (pk0) this.f6720c;
        if (this.f6719b == 5) {
            pk0Var.getClass();
            return false;
        }
        ok0 ok0Var = pk0Var.f27894d0;
        if (ok0Var == null || !(view instanceof nk0)) {
            return false;
        }
        ok0Var.i(pk0Var, ((nk0) view).e, true, false);
        return true;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6718a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f6720c).f31614a0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f6719b).openByUserName("spambot", (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f6720c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f32037b1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f19323id = profileActivity.getMessagesController().getInputUser(profileActivity.f32037b1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f6719b);
                return;
            case 13:
                ng0 ng0Var = ((mg0) this.f6720c).S;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f6719b;
                if (i11 != i12) {
                    ((LaunchActivity) ng0Var.getParentActivity()).K0(i12);
                }
                ng0Var.finishFragment();
                return;
            case 15:
                dn0 dn0Var = ((lm0) this.f6720c).f36108a;
                dn0Var.z1(dn0Var.V[this.f6719b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f6720c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f6719b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f6718a) {
            case 1:
                ((j3.y1) obj).onMediaItemTransition((j3.c1) this.f6720c, this.f6719b);
                return;
            default:
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.h((k3.a) this.f6720c, this.f6719b);
                return;
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
        int i10 = this.f6718a;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public int run() {
        f2.i0 i0Var = ((ec0) this.f6720c).f33984c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f6719b;
        i0Var.h1(i10, dp);
        return i10;
    }

    public m2(Object obj, int i10, int i11) {
        this.f6718a = i11;
        this.f6720c = obj;
        this.f6719b = i10;
    }

    @Override
    public boolean mo18c(float f10, float f11, int i10, View view) {
        v2 v2Var = (v2) this.f6720c;
        kg.a aVar = v2Var.f6776a0;
        HashSet hashSet = v2Var.f6780e0;
        if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
            TLRPC.User user = nVar.getUser();
            long j10 = user != null ? user.f19331id : -nVar.getChat().f19184id;
            int i11 = this.f6719b;
            boolean z4 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                v2Var.f6786k0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == v2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                v2Var.f0();
                return true;
            }
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z4 != z10) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(nr.h).setDuration(320L).withEndAction(!z10 ? new g2(v2Var, 7) : null).start();
                hg.h hVar = v2Var.m0;
                boolean z11 = !z10;
                if (hVar.f7107x != z11) {
                    hVar.f7107x = z11;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f7102f, (h5.d) new hg.f(z11));
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
        xn xnVar = ((jj) this.f6720c).f35363b;
        int i10 = this.f6719b;
        if (i10 == 15 && ChatObject.isChannel(xnVar.e)) {
            TLRPC.Chat chat = xnVar.e;
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
            xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.Q5), xnVar.f40009f, xnVar.e, Boolean.valueOf(z4));
            return;
        }
        xnVar.qa(xnVar.f39948a4, z4);
    }

    public m2(k3.a aVar, int i10, j3.z1 z1Var, j3.z1 z1Var2) {
        this.f6718a = 2;
        this.f6720c = aVar;
        this.f6719b = i10;
    }

    public m2(jj jjVar, int i10, boolean z4) {
        this.f6718a = 3;
        this.f6720c = jjVar;
        this.f6719b = i10;
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
