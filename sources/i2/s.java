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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.y7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.fd0;
import org.telegram.ui.oj;
import org.telegram.ui.pc0;
import org.telegram.ui.q20;
import org.telegram.ui.qn0;
import org.telegram.ui.tj0;
import org.telegram.ui.xg0;
import org.telegram.ui.yg0;
import org.telegram.ui.ym0;
public final class s implements e2.m, MessagesStorage.BooleanCallback, qc0, ImageReceiver.ImageReceiverDelegate, b5, cl0, bl0, b2, fd0, xk0, dl0 {
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
                tj0.P((tj0) this.f10874c, this.f10873b, view);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        gk0 gk0Var = (gk0) this.f10874c;
        if (this.f10873b == 5) {
            gk0Var.getClass();
            return false;
        }
        fk0 fk0Var = gk0Var.f24281g0;
        if (fk0Var == null || !(view instanceof ek0)) {
            return false;
        }
        fk0Var.h(gk0Var, ((ek0) view).e, true, false);
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
        c8 c8Var = (c8) this.f10874c;
        if (this.f10873b == c8Var.f22955b) {
            h8 h8Var = ((x7) c8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            y7 y7Var = h8Var.J;
            ValueAnimator valueAnimator = h8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                h8Var.S0 = null;
            }
            if (y7Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(y7Var.getCustomPaddingRight(), i10);
                h8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    h8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                h8Var.S0.setInterpolator(new DecelerateInterpolator());
                h8Var.S0.addUpdateListener(new i6(h8Var, 2));
                h8Var.S0.start();
            }
            if (h8Var.f24554i0.getTag() != null) {
                h8Var.f24555j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
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
    public void f(c2 c2Var, int i10) {
        switch (this.f10872a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.f10874c).f30834d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f10873b).openByUserName("spambot", (o2) hg.k0.h(1, arrayList), 1);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f10874c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f31282e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f18260id = profileActivity.getMessagesController().getInputUser(profileActivity.f31282e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f10873b);
                return;
            case 13:
                yg0 yg0Var = ((xg0) this.f10874c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f10873b;
                if (i11 != i12) {
                    ((LaunchActivity) yg0Var.getParentActivity()).K0(i12);
                }
                yg0Var.finishFragment();
                return;
            case 15:
                qn0 qn0Var = ((ym0) this.f10874c).f39936a;
                qn0Var.z1(qn0Var.Y[this.f10873b]);
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
    public void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f10872a;
    }

    @Override
    public int run() {
        s4.c0 c0Var = ((pc0) this.f10874c).f36594c;
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
        tg.n1 n1Var = (tg.n1) this.f10874c;
        q20 q20Var = n1Var.f43200d0;
        HashSet hashSet = n1Var.f43204h0;
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            long j3 = user != null ? user.f18268id : -lVar.getChat().f18121id;
            int i11 = this.f10873b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                n1Var.f43209n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == n1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                n1Var.f0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                q20Var.setVisibility(0);
                q20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(qr.h).setDuration(320L).withEndAction(!z11 ? new tg.b1(n1Var, 7) : null).start();
                ug.g gVar = n1Var.f43211p0;
                boolean z12 = !z11;
                if (gVar.f43765y != z12) {
                    gVar.f43765y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f43759f, (e2.h) new m4.o0(3, z12));
                }
            }
            n1Var.W();
            n1Var.Z.b(true, hashSet, new tg.b1(n1Var, 8), null);
            n1Var.i0(true, true);
            n1Var.X();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        bo boVar = ((oj) this.f10874c).f36362b;
        int i10 = this.f10873b;
        if (i10 == 15 && ChatObject.isChannel(boVar.e)) {
            TLRPC.Chat chat = boVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                boVar.getMessagesController().deleteDialog(boVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = boVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(boVar, i11);
            boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            boVar.finishFragment();
            boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(boVar.T5), boVar.f32277f, boVar.e, Boolean.valueOf(z10));
            return;
        }
        boVar.qa(boVar.f32257d4, z10);
    }

    public s(Object obj, int i10, int i11) {
        this.f10872a = i11;
        this.f10874c = obj;
        this.f10873b = i10;
    }

    public s(oj ojVar, int i10, boolean z10) {
        this.f10872a = 3;
        this.f10874c = ojVar;
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

    private final void h(View view, float f7, float f10) {
    }
}
