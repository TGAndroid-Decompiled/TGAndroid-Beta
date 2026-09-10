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
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.nc0;
import org.telegram.ui.on0;
import org.telegram.ui.p20;
import org.telegram.ui.pj;
import org.telegram.ui.sj0;
import org.telegram.ui.wg0;
import org.telegram.ui.wm0;
import org.telegram.ui.xg0;
public final class s implements e2.m, MessagesStorage.BooleanCallback, zc0, ImageReceiver.ImageReceiverDelegate, c5, ll0, kl0, c2, dd0, gl0, ml0 {
    public final int f10350a;
    public final int f10351b;
    public final Object f10352c;

    public s(int i10, Object obj, int i11) {
        this.f10350a = i11;
        this.f10351b = i10;
        this.f10352c = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f10350a) {
            case 6:
                AndroidUtilities.runOnUIThread(new fg.n(i10, this.f10351b, (to) this.f10352c, 8), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fg.n(i10, this.f10351b, (po) this.f10352c, 9), 16L);
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f10352c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f10351b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        switch (this.f10350a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.f10352c, this.f10351b, view, i10);
                return;
            default:
                sj0.P((sj0) this.f10352c, this.f10351b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        pk0 pk0Var = (pk0) this.f10352c;
        if (this.f10351b == 5) {
            pk0Var.getClass();
            return false;
        }
        ok0 ok0Var = pk0Var.f26174g0;
        if (ok0Var == null || !(view instanceof nk0)) {
            return false;
        }
        ok0Var.l(pk0Var, ((nk0) view).e, true, false);
        return true;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f10350a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        e8 e8Var = (e8) this.f10352c;
        if (this.f10351b == e8Var.f22612b) {
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
                j8Var.S0.addUpdateListener(new j6(j8Var, 2));
                j8Var.S0.start();
            }
            if (j8Var.f24287i0.getTag() != null) {
                j8Var.f24288j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f10350a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f10352c).f29933d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f10351b).openByUserName("spambot", (p2) hc.b.i(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f10352c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f30381e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f17334id = profileActivity.getMessagesController().getInputUser(profileActivity.f30381e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f10351b);
                return;
            case 13:
                xg0 xg0Var = ((wg0) this.f10352c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f10351b;
                if (i11 != i12) {
                    ((LaunchActivity) xg0Var.getParentActivity()).K0(i12);
                }
                xg0Var.finishFragment();
                return;
            case 15:
                on0 on0Var = ((wm0) this.f10352c).f38247a;
                on0Var.z1(on0Var.Y[this.f10351b]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f10352c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f10351b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10350a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((f1) this.f10352c).f10187a, this.f10351b);
                return;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.f10352c, this.f10351b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f10352c, this.f10351b);
                return;
        }
    }

    @Override
    public String k(int i10) {
        Calendar calendar = (Calendar) this.f10352c;
        calendar.clear();
        int i11 = this.f10351b;
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
        m5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f10350a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((nc0) this.f10352c).f35211c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f10351b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.f10350a = 2;
        this.f10352c = aVar;
        this.f10351b = i10;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        sg.p1 p1Var = (sg.p1) this.f10352c;
        p20 p20Var = p1Var.f41970d0;
        HashSet hashSet = p1Var.f41974h0;
        if (view instanceof wg.k) {
            wg.k kVar = (wg.k) view;
            TLRPC.User user = kVar.getUser();
            long j3 = user != null ? user.f17342id : -kVar.getChat().f17195id;
            int i11 = this.f10351b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                p1Var.f41979n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == p1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                p1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                p20Var.setVisibility(0);
                p20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(wr.h).setDuration(320L).withEndAction(!z11 ? new sg.d1(p1Var, 7) : null).start();
                tg.g gVar = p1Var.f41981p0;
                boolean z12 = !z11;
                if (gVar.f42177y != z12) {
                    gVar.f42177y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f42171f, (e2.h) new m4.o0(3, z12));
                }
            }
            p1Var.W();
            p1Var.Z.b(true, hashSet, new sg.d1(p1Var, 8), null);
            p1Var.i0(true, true);
            p1Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        eo eoVar = ((pj) this.f10352c).f35851b;
        int i10 = this.f10351b;
        if (i10 == 15 && ChatObject.isChannel(eoVar.e)) {
            TLRPC.Chat chat = eoVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                eoVar.getMessagesController().deleteDialog(eoVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = eoVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(eoVar, i11);
            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            eoVar.finishFragment();
            eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f32318f, eoVar.e, Boolean.valueOf(z10));
            return;
        }
        eoVar.qa(eoVar.f32298d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f10350a = i11;
        this.f10352c = obj;
        this.f10351b = i10;
    }

    public s(pj pjVar, int i10, boolean z10) {
        this.f10350a = 3;
        this.f10352c = pjVar;
        this.f10351b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f7) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }
}
