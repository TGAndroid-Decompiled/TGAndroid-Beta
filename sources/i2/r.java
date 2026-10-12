package i2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.bh0;
import org.telegram.ui.bn0;
import org.telegram.ui.fo;
import org.telegram.ui.id0;
import org.telegram.ui.rc0;
import org.telegram.ui.s20;
import org.telegram.ui.sj;
import org.telegram.ui.un0;
import org.telegram.ui.xj0;
import v7.u6;
public final class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, qd0, ImageReceiver.ImageReceiverDelegate, f5, cm0, bm0, z1, id0, xl0, dm0 {
    public final int f11145a;
    public final int f11146b;
    public final Object f11147c;

    public r(int i10, Object obj, int i11) {
        this.f11145a = i11;
        this.f11146b = i10;
        this.f11147c = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f11145a) {
            case 7:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f11146b, (bp) this.f11147c, 7), 16L);
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.f11146b, (xo) this.f11147c, 8), 16L);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        gl0 gl0Var = (gl0) this.f11147c;
        if (this.f11146b == 5) {
            gl0Var.getClass();
            return false;
        }
        fl0 fl0Var = gl0Var.f25333g0;
        if (fl0Var == null || !(view instanceof el0)) {
            return false;
        }
        fl0Var.r(gl0Var, ((el0) view).e, true, false);
        return true;
    }

    @Override
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.f11147c;
        int i10 = this.f11146b;
        try {
            try {
                pVar2 = (m4.p) ((j9.y) obj).get();
                u6.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.f15598a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.f15598a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.f15598a, SystemClock.elapsedRealtime(), r1Var3);
                pVar2 = pVar;
                m4.v vVar22 = wVar.d;
                vVar22.getClass();
                vVar22.a(i10, pVar2);
            }
            m4.v vVar222 = wVar.d;
            vVar222.getClass();
            vVar222.a(i10, pVar2);
        } catch (RemoteException e11) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + wVar, e11);
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f11147c).entrySet()) {
            MessageObject messageObject = (MessageObject) entry.getValue();
            SendMessagesHelper.getInstance(this.f11146b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f11145a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        switch (this.f11145a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.f11147c, this.f11146b, view, i10);
                return;
            default:
                xj0.Q((xj0) this.f11147c, this.f11146b, view);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        h8 h8Var = (h8) this.f11147c;
        if (this.f11146b == h8Var.f25536b) {
            m8 m8Var = ((c8) h8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            if ((bitmap != null && imageReceiver.hasImageLoaded()) || imageReceiver.hasBitmapImage()) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            d8 d8Var = m8Var.J;
            ValueAnimator valueAnimator = m8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                m8Var.S0 = null;
            }
            if (d8Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(d8Var.getCustomPaddingRight(), i10);
                m8Var.S0 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    m8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                m8Var.S0.setInterpolator(new DecelerateInterpolator());
                m8Var.S0.addUpdateListener(new n6(m8Var, 2));
                m8Var.S0.start();
            }
            if (m8Var.f27244i0.getTag() != null) {
                m8Var.f27245j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f11147c;
        calendar.clear();
        int i11 = this.f11146b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            return LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis());
        }
        return LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f11145a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.f11147c).f32109d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f11146b).openByUserName("spambot", (m2) d.g(1, arrayList), 1);
                    return;
                }
                return;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f11147c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f32559e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f19355id = profileActivity.getMessagesController().getInputUser(profileActivity.f32559e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.f11146b);
                return;
            case 14:
                bh0 bh0Var = ((ah0) this.f11147c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.f11146b;
                if (i11 != i12) {
                    ((LaunchActivity) bh0Var.getParentActivity()).K0(i12);
                }
                bh0Var.finishFragment();
                return;
            case 16:
                un0 un0Var = ((bn0) this.f11147c).f34600a;
                un0Var.y1(un0Var.Y[this.f11146b]);
                return;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f11147c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f11146b, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11145a) {
            case 0:
                ((b2.e1) obj).onTimelineChanged(((k1) this.f11147c).f11065a, this.f11146b);
                return;
            case 1:
                ((b2.e1) obj).onMediaItemTransition((b2.p0) this.f11147c, this.f11146b);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g((j2.a) this.f11147c, this.f11146b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        l5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f11145a;
    }

    @Override
    public int run() {
        s4.b0 b0Var = ((rc0) this.f11147c).f39759c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.f11146b;
        b0Var.h1(i10, dp);
        return i10;
    }

    public r(j2.a aVar, int i10, b2.f1 f1Var, b2.f1 f1Var2) {
        this.f11145a = 2;
        this.f11147c = aVar;
        this.f11146b = i10;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        ug.m1 m1Var = (ug.m1) this.f11147c;
        s20 s20Var = m1Var.f46343d0;
        HashSet hashSet = m1Var.f46347h0;
        if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            long j10 = user != null ? user.f19363id : -lVar.getChat().f19216id;
            int i11 = this.f11146b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                m1Var.f46352n0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == m1Var.a0() + 1) {
                hashSet.remove(Long.valueOf(j10));
                m1Var.g0();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                s20Var.setVisibility(0);
                s20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(es.h).setDuration(320L).withEndAction(!z11 ? new ug.a1(m1Var, 7) : null).start();
                vg.h hVar = m1Var.f46354p0;
                boolean z12 = !z11;
                if (hVar.f46995y != z12) {
                    hVar.f46995y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f46989f, (Utilities.Callback<View>) new vg.f(z12));
                }
            }
            m1Var.X();
            m1Var.Z.b(true, hashSet, new ug.a1(m1Var, 8), null);
            m1Var.j0(true, true);
            m1Var.Y();
            return true;
        }
        return false;
    }

    @Override
    public void run(boolean z10) {
        fo foVar = ((sj) this.f11147c).f40157b;
        int i10 = this.f11146b;
        if (i10 == 15 && ChatObject.isChannel(foVar.e)) {
            TLRPC.Chat chat = foVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                foVar.getMessagesController().deleteDialog(foVar.T5, 2, z10);
                return;
            }
        }
        if (i10 != 15) {
            NotificationCenter notificationCenter = foVar.getNotificationCenter();
            int i11 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(foVar, i11);
            foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            foVar.finishFragment();
            foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(foVar.T5), foVar.f35935f, foVar.e, Boolean.valueOf(z10));
            return;
        }
        foVar.va(foVar.f35915d4, z10);
    }

    public r(Object obj, int i10, int i11) {
        this.f11145a = i11;
        this.f11147c = obj;
        this.f11146b = i10;
    }

    public r(sj sjVar, int i10, boolean z10) {
        this.f11145a = 4;
        this.f11147c = sjVar;
        this.f11146b = i10;
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
