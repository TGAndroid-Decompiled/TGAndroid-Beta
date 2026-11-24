package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
public final class ji implements hp7, ln5, k01, ue7, gk, g59, eo3, x76, ee, lc6, c59, fu2 {
    public final byte a;
    public final int b;
    public final Object c;

    public ji(nr1 nr1Var, int i, boolean z) {
        this.a = (byte) 3;
        this.c = nr1Var;
        this.b = i;
    }

    @Override
    public final void a(float[] fArr, long j, int i) {
        in3 in3Var;
        Object obj;
        switch (this.a) {
            case 7:
                vo3 vo3Var = (vo3) this.c;
                int i2 = this.b;
                if (!vo3Var.h && i2 == vo3Var.p) {
                    fo3 k = DictationLid.k(Math.min(0.6f, DictationLid.g(i)), fArr);
                    if (k != null) {
                        if (k.c) {
                            in3Var = DictationAsr.X(k.a, vo3Var.l, false);
                            if (in3Var != null) {
                                DictationLid.i(k.a);
                                vo3Var.k(k.a);
                            }
                        } else {
                            in3Var = DictationAsr.W(DictationLid.d, fArr, vo3Var.l, false);
                            if (in3Var != null) {
                                vo3Var.k(in3Var.t());
                            }
                        }
                    } else {
                        in3Var = null;
                    }
                    StringBuilder sb = new StringBuilder("tinyasr stop: tinylid ");
                    sb.append(i);
                    sb.append(" ms speech in ");
                    sb.append(j);
                    sb.append(" ms: ");
                    sb.append(k);
                    sb.append(" → ");
                    if (in3Var != null) {
                        obj = in3Var;
                    } else {
                        obj = "-";
                    }
                    sb.append(obj);
                    Log.d("Dictation", sb.toString());
                    if (in3Var != null) {
                        gn3 gn3Var = (gn3) in3Var.b;
                        in3 in3Var2 = vo3Var.l;
                        if (gn3Var != ((gn3) in3Var2.b) || !((String) in3Var.c).equals((String) in3Var2.c)) {
                            vo3Var.i(in3Var);
                            return;
                        }
                    }
                    vo3Var.e();
                    return;
                }
                return;
            default:
                p86 p86Var = (p86) this.c;
                p86Var.x.b.add(new a80(p86Var, this.b, fArr, i, j));
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        q26 q26Var;
        q26 q26Var2;
        sw6 sw6Var = (sw6) this.c;
        int i = this.b;
        try {
            try {
                q26Var2 = (q26) ((t76) obj).get();
                jte.l(q26Var2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                ncd.g("MediaSessionStub", "Library operation failed", e);
                String str = q26.d;
                d8a d8aVar = new d8a("no error message provided", -1, Bundle.EMPTY);
                q26Var = new q26(d8aVar.a, SystemClock.elapsedRealtime(), d8aVar);
                q26Var2 = q26Var;
                rw6 rw6Var = sw6Var.e;
                rw6Var.getClass();
                rw6Var.d(i, q26Var2);
            } catch (CancellationException e2) {
                ncd.g("MediaSessionStub", "Library operation cancelled", e2);
                String str2 = q26.d;
                d8a d8aVar2 = new d8a("no error message provided", 1, Bundle.EMPTY);
                q26Var = new q26(d8aVar2.a, SystemClock.elapsedRealtime(), d8aVar2);
                q26Var2 = q26Var;
                rw6 rw6Var2 = sw6Var.e;
                rw6Var2.getClass();
                rw6Var2.d(i, q26Var2);
            } catch (ExecutionException e3) {
                e = e3;
                ncd.g("MediaSessionStub", "Library operation failed", e);
                String str3 = q26.d;
                d8a d8aVar3 = new d8a("no error message provided", -1, Bundle.EMPTY);
                q26Var = new q26(d8aVar3.a, SystemClock.elapsedRealtime(), d8aVar3);
                q26Var2 = q26Var;
                rw6 rw6Var22 = sw6Var.e;
                rw6Var22.getClass();
                rw6Var22.d(i, q26Var2);
            }
            rw6 rw6Var222 = sw6Var.e;
            rw6Var222.getClass();
            rw6Var222.d(i, q26Var2);
        } catch (RemoteException e4) {
            ncd.g("MediaSessionStub", "Failed to send result to browser " + sw6Var, e4);
        }
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            k47 k47Var = (k47) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            a6a.B(this.b).q0(y5a.d(messageMedia2, k47.B0(k47Var.k), k47Var, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int i;
        y20 y20Var = (y20) this.c;
        if (this.b == y20Var.b) {
            i30 i30Var = y20Var.e;
            Bitmap n = imageReceiver.n();
            if ((n != null && imageReceiver.C()) || imageReceiver.B()) {
                i = gm.L(64.0f);
            } else {
                i = 0;
            }
            z20 z20Var = i30Var.C1;
            ValueAnimator valueAnimator = i30Var.M2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i30Var.M2 = null;
            }
            if (z20Var.getCustomPaddingRight() != i) {
                ValueAnimator ofInt = ValueAnimator.ofInt(z20Var.getCustomPaddingRight(), i);
                i30Var.M2 = ofInt;
                if (i == 0) {
                    ofInt.setStartDelay(200L);
                    i30Var.M2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                i30Var.M2.setInterpolator(new DecelerateInterpolator());
                i30Var.M2.addUpdateListener(new f0(i30Var, (byte) 10));
                i30Var.M2.start();
            }
            if (i30Var.b2.getTag() != null) {
                i30Var.c2.setImageBitmap(n);
            }
        }
    }

    @Override
    public final String c(int i) {
        Calendar calendar = (Calendar) this.c;
        int i2 = this.b;
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, 0);
        calendar.add(2, i - 120);
        if (calendar.get(1) == i2) {
            jb6 D0 = jb6.D0();
            if (D0.r == null) {
                synchronized (D0) {
                    if (D0.r == null) {
                        Locale locale = D0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        D0.r = jb6.k(locale, D0.O0(2131742429, "formatterMonthOnly", null), "MMMM");
                    }
                }
            }
            return D0.r.format(calendar.getTimeInMillis());
        }
        return jb6.D0().u0().format(calendar.getTimeInMillis());
    }

    @Override
    public final void cancel() {
        ConnectionsManager.getInstance(((h11) this.c).a).cancelRequest(this.b, true);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 6:
                ((ContactsActivity) obj).l0(view, i2, i);
                return;
            default:
                ji7 ji7Var = (ji7) obj;
                gi7 gi7Var = ji7Var.T1;
                HashSet hashSet = ji7Var.Y1;
                if (view instanceof m1a) {
                    TLRPC.User user = ((m1a) view).getUser();
                    long j = user.id;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                        ji7Var.d2.put(Long.valueOf(j), user);
                    }
                    if (hashSet.size() == i2 + 1) {
                        hashSet.remove(Long.valueOf(j));
                        String G = jb6.G(ji7Var.k2, "BotMultiContactsSelectorLimit", new Object[0]);
                        dy0 dy0Var = ji7Var.c;
                        new c41(dy0Var, ji7Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            dy0Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    gi7Var.b(true, hashSet, new bi7(ji7Var, (byte) 2), null);
                    ji7Var.b1(true, false);
                    if (!TextUtils.isEmpty(ji7Var.e2)) {
                        ji7Var.e2 = null;
                        gi7Var.setText("");
                        gm.r(ji7Var.o2);
                        ji7Var.a1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        pe8 pe8Var = (pe8) obj;
        pe8Var.r(this.b, (bt6) this.c);
    }

    @Override
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 9:
                String str = LaunchActivity.C1;
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    oc7.r1(i2).C3("spambot", (d) b10.f(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
                mh6 mh6Var = ((lh6) obj).h0;
                if (z8c.t0 != i2) {
                    ((LaunchActivity) mh6Var.getParentActivity()).N0(i2);
                }
                mh6Var.finishFragment();
                return;
            case 16:
                xz7 xz7Var = ((iz7) obj).a;
                xz7Var.C1(xz7Var.Z[i2]);
                return;
            case 17:
                ((PrivacyControlActivity) obj).presentFragment(new PrivacyControlActivity(i2, false), true);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                TLRPC.UserFull X1 = profileActivity.getMessagesController().X1(profileActivity.e1);
                if (X1 != null) {
                    X1.flags2 &= -4194305;
                    X1.note = null;
                    profileActivity.getMessagesStorage().g2(X1, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().n1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.i4();
                profileActivity.d.s(i2);
                return;
        }
    }

    @Override
    public final int run() {
        u46 u46Var = ((m86) this.c).c;
        int L = gm.L(60.0f);
        int i = this.b;
        u46Var.g1(i, L);
        return i;
    }

    @Override
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        int i3 = this.b;
        switch (b) {
            case 4:
                gm.d3(new cu(i, i3, (id2) obj, (byte) 3), 16L);
                return;
            default:
                gm.d3(new cu(i, i3, (cd2) obj, (byte) 4), 16L);
                return;
        }
    }

    @Override
    public final void z(boolean z) {
        yv1 yv1Var = ((nr1) this.c).b;
        int i = this.b;
        if (i == 15 && sd2.T(yv1Var.e)) {
            TLRPC.Chat chat = yv1Var.e;
            if (!chat.megagroup || sd2.t0(chat)) {
                yv1Var.getMessagesController().T(2, yv1Var.l6, z);
                return;
            }
        }
        if (i != 15) {
            nm7 notificationCenter = yv1Var.getNotificationCenter();
            int i2 = nm7.s;
            notificationCenter.n(yv1Var, i2);
            yv1Var.getNotificationCenter().k(i2, new Object[0]);
            yv1Var.finishFragment();
            yv1Var.getNotificationCenter().k(nm7.K2, Long.valueOf(yv1Var.l6), yv1Var.f, yv1Var.e, Boolean.valueOf(z));
            return;
        }
        yv1Var.Ha(yv1Var.s4, z);
    }

    public ji(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public ji(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    private final void e(View view, float f, float f2) {
    }

    private final void f(View view, float f, float f2) {
    }
}
