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
public final class jh implements dn7, ll5, dz0, sc7, gj, d39, um3, x56, ed, ma6, z29, us2 {
    public final byte a;
    public final int b;
    public final Object c;

    public jh(aq1 aq1Var, int i, boolean z) {
        this.a = (byte) 3;
        this.c = aq1Var;
        this.b = i;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int i;
        y10 y10Var = (y10) this.c;
        if (this.b == y10Var.b) {
            i20 i20Var = y10Var.e;
            Bitmap n = imageReceiver.n();
            if ((n != null && imageReceiver.C()) || imageReceiver.B()) {
                i = gl.L(64.0f);
            } else {
                i = 0;
            }
            z10 z10Var = i20Var.C1;
            ValueAnimator valueAnimator = i20Var.M2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i20Var.M2 = null;
            }
            if (z10Var.getCustomPaddingRight() != i) {
                ValueAnimator ofInt = ValueAnimator.ofInt(z10Var.getCustomPaddingRight(), i);
                i20Var.M2 = ofInt;
                if (i == 0) {
                    ofInt.setStartDelay(200L);
                    i20Var.M2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                i20Var.M2.setInterpolator(new DecelerateInterpolator());
                i20Var.M2.addUpdateListener(new f0(i20Var, (byte) 9));
                i20Var.M2.start();
            }
            if (i20Var.b2.getTag() != null) {
                i20Var.c2.setImageBitmap(n);
            }
        }
    }

    @Override
    public final void a(float[] fArr, long j, int i) {
        xl3 xl3Var;
        Object obj;
        switch (this.a) {
            case 7:
                ln3 ln3Var = (ln3) this.c;
                int i2 = this.b;
                if (!ln3Var.h && i2 == ln3Var.p) {
                    vm3 k = DictationLid.k(Math.min(0.6f, DictationLid.g(i)), fArr);
                    if (k != null) {
                        if (k.c) {
                            xl3Var = DictationAsr.X(k.a, ln3Var.l, false);
                            if (xl3Var != null) {
                                DictationLid.i(k.a);
                                ln3Var.k(k.a);
                            }
                        } else {
                            xl3Var = DictationAsr.W(DictationLid.d, fArr, ln3Var.l, false);
                            if (xl3Var != null) {
                                ln3Var.k(xl3Var.u());
                            }
                        }
                    } else {
                        xl3Var = null;
                    }
                    StringBuilder sb = new StringBuilder("tinyasr stop: tinylid ");
                    sb.append(i);
                    sb.append(" ms speech in ");
                    sb.append(j);
                    sb.append(" ms: ");
                    sb.append(k);
                    sb.append(" → ");
                    if (xl3Var != null) {
                        obj = xl3Var;
                    } else {
                        obj = "-";
                    }
                    sb.append(obj);
                    Log.d("Dictation", sb.toString());
                    if (xl3Var != null) {
                        vl3 vl3Var = (vl3) xl3Var.b;
                        xl3 xl3Var2 = ln3Var.l;
                        if (vl3Var != ((vl3) xl3Var2.b) || !((String) xl3Var.c).equals((String) xl3Var2.c)) {
                            ln3Var.i(xl3Var);
                            return;
                        }
                    }
                    ln3Var.e();
                    return;
                }
                return;
            default:
                p66 p66Var = (p66) this.c;
                p66Var.x.b.add(new a70(p66Var, this.b, fArr, i, j));
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        q06 q06Var;
        q06 q06Var2;
        su6 su6Var = (su6) this.c;
        int i = this.b;
        try {
            try {
                q06Var2 = (q06) ((t56) obj).get();
                gre.l(q06Var2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                lad.g("MediaSessionStub", "Library operation failed", e);
                String str = q06.d;
                b6a b6aVar = new b6a("no error message provided", -1, Bundle.EMPTY);
                q06Var = new q06(b6aVar.a, SystemClock.elapsedRealtime(), b6aVar);
                q06Var2 = q06Var;
                ru6 ru6Var = su6Var.e;
                ru6Var.getClass();
                ru6Var.d(i, q06Var2);
            } catch (CancellationException e2) {
                lad.g("MediaSessionStub", "Library operation cancelled", e2);
                String str2 = q06.d;
                b6a b6aVar2 = new b6a("no error message provided", 1, Bundle.EMPTY);
                q06Var = new q06(b6aVar2.a, SystemClock.elapsedRealtime(), b6aVar2);
                q06Var2 = q06Var;
                ru6 ru6Var2 = su6Var.e;
                ru6Var2.getClass();
                ru6Var2.d(i, q06Var2);
            } catch (ExecutionException e3) {
                e = e3;
                lad.g("MediaSessionStub", "Library operation failed", e);
                String str3 = q06.d;
                b6a b6aVar3 = new b6a("no error message provided", -1, Bundle.EMPTY);
                q06Var = new q06(b6aVar3.a, SystemClock.elapsedRealtime(), b6aVar3);
                q06Var2 = q06Var;
                ru6 ru6Var22 = su6Var.e;
                ru6Var22.getClass();
                ru6Var22.d(i, q06Var2);
            }
            ru6 ru6Var222 = su6Var.e;
            ru6Var222.getClass();
            ru6Var222.d(i, q06Var2);
        } catch (RemoteException e4) {
            lad.g("MediaSessionStub", "Failed to send result to browser " + su6Var, e4);
        }
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            k27 k27Var = (k27) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            z3a.B(this.b).q0(x3a.d(messageMedia2, k27.B0(k27Var.k), k27Var, null, null, null, true, 0));
            messageMedia = messageMedia2;
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
            k96 D0 = k96.D0();
            if (D0.r == null) {
                synchronized (D0) {
                    if (D0.r == null) {
                        Locale locale = D0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        D0.r = k96.k(locale, D0.O0(2131742503, "formatterMonthOnly", null), "MMMM");
                    }
                }
            }
            return D0.r.format(calendar.getTimeInMillis());
        }
        return k96.D0().u0().format(calendar.getTimeInMillis());
    }

    @Override
    public final void cancel() {
        ConnectionsManager.getInstance(((zz0) this.c).a).cancelRequest(this.b, true);
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 6:
                ((ContactsActivity) obj).k0(view, i2, i);
                return;
            default:
                gg7 gg7Var = (gg7) obj;
                dg7 dg7Var = gg7Var.T1;
                HashSet hashSet = gg7Var.Y1;
                if (view instanceof kz9) {
                    TLRPC.User user = ((kz9) view).getUser();
                    long j = user.id;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                        gg7Var.d2.put(Long.valueOf(j), user);
                    }
                    if (hashSet.size() == i2 + 1) {
                        hashSet.remove(Long.valueOf(j));
                        String G = k96.G(gg7Var.k2, "BotMultiContactsSelectorLimit", new Object[0]);
                        ww0 ww0Var = gg7Var.c;
                        new u21(ww0Var, gg7Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            ww0Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    dg7Var.b(true, hashSet, new yf7(gg7Var, (byte) 2), null);
                    gg7Var.b1(true, false);
                    if (!TextUtils.isEmpty(gg7Var.e2)) {
                        gg7Var.e2 = null;
                        dg7Var.setText("");
                        gl.r(gg7Var.o2);
                        gg7Var.a1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        mc8 mc8Var = (mc8) obj;
        mc8Var.r(this.b, (br6) this.c);
    }

    @Override
    public final void k(boolean z) {
        mu1 mu1Var = ((aq1) this.c).b;
        int i = this.b;
        if (i == 15 && hc2.T(mu1Var.e)) {
            TLRPC.Chat chat = mu1Var.e;
            if (!chat.megagroup || hc2.t0(chat)) {
                mu1Var.getMessagesController().T(2, mu1Var.l6, z);
                return;
            }
        }
        if (i != 15) {
            kk7 notificationCenter = mu1Var.getNotificationCenter();
            int i2 = kk7.s;
            notificationCenter.n(mu1Var, i2);
            mu1Var.getNotificationCenter().k(i2, new Object[0]);
            mu1Var.finishFragment();
            mu1Var.getNotificationCenter().k(kk7.J2, Long.valueOf(mu1Var.l6), mu1Var.f, mu1Var.e, Boolean.valueOf(z));
            return;
        }
        mu1Var.va(mu1Var.s4, z);
    }

    @Override
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final int run() {
        t26 t26Var = ((m66) this.c).c;
        int L = gl.L(60.0f);
        int i = this.b;
        t26Var.g1(i, L);
        return i;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        int i3 = this.b;
        switch (b) {
            case 4:
                gl.e3(new bt(i, i3, (xb2) obj, (byte) 3), 16L);
                return;
            default:
                gl.e3(new bt(i, i3, (rb2) obj, (byte) 4), 16L);
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 9:
                String str = LaunchActivity.C1;
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    na7.q1(i2).z3("spambot", (d) b00.f(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
                mf6 mf6Var = ((lf6) obj).h0;
                if (y6c.t0 != i2) {
                    ((LaunchActivity) mf6Var.getParentActivity()).N0(i2);
                }
                mf6Var.finishFragment();
                return;
            case 16:
                vx7 vx7Var = ((gx7) obj).a;
                vx7Var.B1(vx7Var.Z[i2]);
                return;
            case 17:
                ((PrivacyControlActivity) obj).presentFragment(new PrivacyControlActivity(i2, false), true);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull W1 = profileActivity.getMessagesController().W1(profileActivity.e1);
                if (W1 != null) {
                    W1.flags2 &= -4194305;
                    W1.note = null;
                    profileActivity.getMessagesStorage().g2(W1, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().m1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.e4();
                profileActivity.d.r(i2);
                return;
        }
    }

    public jh(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public jh(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }

    private final void d(View view, float f, float f2) {
    }

    private final void f(View view, float f, float f2) {
    }
}
