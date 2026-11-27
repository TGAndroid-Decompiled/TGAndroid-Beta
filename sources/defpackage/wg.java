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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
public final class wg implements dq7, on5, lz0, bf7, hj, s69, ln3, b86, qc6, fd, o69, ot2, occ {
    public final byte a;
    public final int b;
    public final Object c;

    public wg(oq1 oq1Var, int i, boolean z) {
        this.a = (byte) 3;
        this.c = oq1Var;
        this.b = i;
    }

    @Override
    public final void A(boolean z) {
        zu1 zu1Var = ((oq1) this.c).b;
        int i = this.b;
        if (i == 15 && xc2.T(zu1Var.e)) {
            TLRPC.Chat chat = zu1Var.e;
            if (!chat.megagroup || xc2.t0(chat)) {
                zu1Var.getMessagesController().V(2, zu1Var.l6, z);
                return;
            }
        }
        if (i != 15) {
            jn7 notificationCenter = zu1Var.getNotificationCenter();
            int i2 = jn7.s;
            notificationCenter.n(zu1Var, i2);
            zu1Var.getNotificationCenter().k(i2, new Object[0]);
            zu1Var.finishFragment();
            zu1Var.getNotificationCenter().k(jn7.K2, Long.valueOf(zu1Var.l6), zu1Var.f, zu1Var.e, Boolean.valueOf(z));
            return;
        }
        zu1Var.Ia(zu1Var.s4, z);
    }

    @Override
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(float[] fArr, long j, int i) {
        Object obj;
        switch (this.a) {
            case 7:
                co3 co3Var = (co3) this.c;
                int i2 = this.b;
                if (!co3Var.h && i2 == co3Var.p) {
                    if (fArr != null && DictationAsr.E()) {
                        co3Var.c.d(DictationLid.d, fArr, i);
                    }
                    mn3 l = DictationLid.l(Math.min(0.6f, DictationLid.h(i)), fArr);
                    pm3 pm3Var = null;
                    if (l != null) {
                        if (l.c) {
                            String str = l.a;
                            pm3 pm3Var2 = co3Var.l;
                            nm3 M = DictationAsr.M(str, pm3Var2, false, false);
                            if (M != null) {
                                pm3Var = new pm3(M, str, (ArrayList) pm3Var2.d, (byte) 0);
                            }
                            if (pm3Var != null) {
                                DictationLid.j(l.a);
                                co3Var.k(l.a);
                            }
                        } else {
                            pm3Var = DictationAsr.Y(DictationLid.d, fArr, co3Var.l, false);
                            if (pm3Var != null) {
                                co3Var.k(pm3Var.t());
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("tinyasr stop: tinylid ");
                    sb.append(i);
                    sb.append(" ms speech in ");
                    sb.append(j);
                    sb.append(" ms: ");
                    sb.append(l);
                    sb.append(" → ");
                    if (pm3Var != null) {
                        obj = pm3Var;
                    } else {
                        obj = "-";
                    }
                    sb.append(obj);
                    Log.d("Dictation", sb.toString());
                    if (pm3Var != null) {
                        nm3 nm3Var = (nm3) pm3Var.b;
                        pm3 pm3Var3 = co3Var.l;
                        if (nm3Var != ((nm3) pm3Var3.b) || !((String) pm3Var.c).equals((String) pm3Var3.c)) {
                            co3Var.i(pm3Var);
                            return;
                        }
                    }
                    co3Var.e();
                    return;
                }
                return;
            default:
                t86 t86Var = (t86) this.c;
                t86Var.x.b.add(new c70(t86Var, this.b, fArr, i, j));
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        u26 u26Var;
        u26 u26Var2;
        xw6 xw6Var = (xw6) this.c;
        int i = this.b;
        try {
            try {
                u26Var2 = (u26) ((x76) obj).get();
                yve.l(u26Var2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                efd.g("MediaSessionStub", "Library operation failed", e);
                String str = u26.d;
                t9a t9aVar = new t9a("no error message provided", -1, Bundle.EMPTY);
                u26Var = new u26(t9aVar.a, SystemClock.elapsedRealtime(), t9aVar);
                u26Var2 = u26Var;
                ww6 ww6Var = xw6Var.e;
                ww6Var.getClass();
                ww6Var.d(i, u26Var2);
            } catch (CancellationException e2) {
                efd.g("MediaSessionStub", "Library operation cancelled", e2);
                String str2 = u26.d;
                t9a t9aVar2 = new t9a("no error message provided", 1, Bundle.EMPTY);
                u26Var = new u26(t9aVar2.a, SystemClock.elapsedRealtime(), t9aVar2);
                u26Var2 = u26Var;
                ww6 ww6Var2 = xw6Var.e;
                ww6Var2.getClass();
                ww6Var2.d(i, u26Var2);
            } catch (ExecutionException e3) {
                e = e3;
                efd.g("MediaSessionStub", "Library operation failed", e);
                String str3 = u26.d;
                t9a t9aVar3 = new t9a("no error message provided", -1, Bundle.EMPTY);
                u26Var = new u26(t9aVar3.a, SystemClock.elapsedRealtime(), t9aVar3);
                u26Var2 = u26Var;
                ww6 ww6Var22 = xw6Var.e;
                ww6Var22.getClass();
                ww6Var22.d(i, u26Var2);
            }
            ww6 ww6Var222 = xw6Var.e;
            ww6Var222.getClass();
            ww6Var222.d(i, u26Var2);
        } catch (RemoteException e4) {
            efd.g("MediaSessionStub", "Failed to send result to browser " + xw6Var, e4);
        }
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            r47 r47Var = (r47) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            r7a.B(this.b).q0(p7a.d(messageMedia2, r47.B0(r47Var.k), r47Var, null, null, null, true, 0));
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
            ob6 D0 = ob6.D0();
            if (D0.r == null) {
                synchronized (D0) {
                    if (D0.r == null) {
                        Locale locale = D0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        D0.r = ob6.k(D0.O0(2131742397, "formatterMonthOnly", null), "MMMM", locale);
                    }
                }
            }
            return D0.r.format(calendar.getTimeInMillis());
        }
        return ob6.D0().u0().format(calendar.getTimeInMillis());
    }

    @Override
    public final void cancel() {
        ConnectionsManager.getInstance(((i01) this.c).a).cancelRequest(this.b, true);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 6:
                ((ContactsActivity) obj).k0(view, i2, i);
                return;
            default:
                pi7 pi7Var = (pi7) obj;
                mi7 mi7Var = pi7Var.T1;
                HashSet hashSet = pi7Var.Y1;
                if (view instanceof e3a) {
                    TLRPC.User user = ((e3a) view).getUser();
                    long j = user.id;
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                        pi7Var.d2.put(Long.valueOf(j), user);
                    }
                    if (hashSet.size() == i2 + 1) {
                        hashSet.remove(Long.valueOf(j));
                        String G = ob6.G(pi7Var.k2, "BotMultiContactsSelectorLimit", new Object[0]);
                        ex0 ex0Var = pi7Var.c;
                        new d31(ex0Var, pi7Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            ex0Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    mi7Var.b(true, hashSet, new hi7(pi7Var, (byte) 2), null);
                    pi7Var.c1(true, false);
                    if (!TextUtils.isEmpty(pi7Var.e2)) {
                        pi7Var.e2 = null;
                        mi7Var.setText("");
                        hl.r(pi7Var.o2);
                        pi7Var.b1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        final lm7 lm7Var = (lm7) this.c;
        Object obj = b8cVar.H;
        if ((obj instanceof r47) && (view instanceof v94)) {
            v94 v94Var = (v94) view;
            r47 r47Var = (r47) obj;
            ArrayList arrayList = (ArrayList) b8cVar.I;
            HashMap hashMap = lm7Var.V;
            int i5 = this.b;
            km7 km7Var = (km7) hashMap.get(lm7.B0(i5, r47Var));
            if (km7Var == null) {
                km7Var = lm7Var.U;
            }
            if (!km7Var.b() && lm7Var.fragmentView != null) {
                if (i5 != 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = new ArrayList(Collections.singletonList(r47Var));
                }
                final TLRPC.Chat M0 = lm7Var.getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k)));
                boolean V = xc2.V(M0);
                if (V && M0.in_news) {
                    z = true;
                } else {
                    z = false;
                }
                if (V && !z && !xc2.r0(M0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fu5 I = fu5.I(lm7Var, v94Var);
                if (i != 0) {
                    I.b(2131232327, ob6.M0(2131747991, null), new yl7(lm7Var, i5, r47Var, (byte) 0), false);
                    b8 z3 = I.z();
                    if (z3 != null && z3.getImageView() != null) {
                        z3.getImageView().setScaleX(1.25f);
                        z3.getImageView().setScaleY(1.25f);
                    }
                    I.b(2131232326, ob6.M0(2131747986, null), new yl7(lm7Var, i5, r47Var, (byte) 1), false);
                    b8 z4 = I.z();
                    if (z4 != null && z4.getImageView() != null) {
                        z4.getImageView().setScaleX(1.25f);
                        z4.getImageView().setScaleY(1.25f);
                    }
                    I.j();
                }
                I.b(2131232209, ob6.M0(2131751727, null), new yl7(i5, r47Var, lm7Var), false);
                I.b(2131232170, ob6.M0(2131750547, null), new y36(lm7Var, i5, r47Var, arrayList), false);
                if (V && !z2) {
                    I.j();
                    I.b(2131232260, ob6.M0(2131752504, null), new Runnable() {
                        @Override
                        public final void run() {
                            byte b = r3;
                            TLRPC.Chat chat = M0;
                            lm7 lm7Var2 = lm7Var;
                            switch (b) {
                                case 0:
                                    lm7Var2.d0(chat, false);
                                    return;
                                default:
                                    lm7Var2.d0(chat, true);
                                    return;
                            }
                        }
                    }, false);
                    if (!z) {
                        I.b(2131232455, ob6.M0(2131752502, null), new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r3;
                                TLRPC.Chat chat = M0;
                                lm7 lm7Var2 = lm7Var;
                                switch (b) {
                                    case 0:
                                        lm7Var2.d0(chat, false);
                                        return;
                                    default:
                                        lm7Var2.d0(chat, true);
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                if (i != 0) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                int i6 = i2 + 2;
                if (V && !z2) {
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (V && !z2) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int L = hl.L(16.0f) + uh9.y(8.0f, i + i4, hl.L(48.0f) * i7);
                int[] iArr = new int[2];
                lm7Var.fragmentView.getLocationInWindow(iArr);
                int p0 = lm7Var.p0() + iArr[1];
                int L2 = hl.L(72.0f) + ((lm7Var.fragmentView.getRootView().getHeight() - iArr[1]) - lm7Var.fragmentView.getHeight()) + lm7Var.G;
                int width = v94Var.getWidth();
                float w = qu6.w((((lm7Var.fragmentView.getRootView().getHeight() - p0) - L2) - L) - hl.L(32.0f), v94Var.getHeight(), (width - hl.L(32.0f)) / width, 0.3f);
                float L3 = hl.L(20.0f) / w;
                I.X(new gm7(lm7Var.getThemedColor(aob.d6), L3));
                I.l = (int) L3;
                I.k = 0;
                I.u = true;
                I.v = true;
                I.L = true;
                I.U = w;
                I.T = true;
                I.P = p0;
                I.Q = L2;
                I.c0 = true;
                I.V = true;
                I.a0();
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void invoke(Object obj) {
        bg8 bg8Var = (bg8) obj;
        bg8Var.r(this.b, (ft6) this.c);
    }

    @Override
    public final int run() {
        x46 x46Var = ((q86) this.c).c;
        int L = hl.L(60.0f);
        int i = this.b;
        x46Var.g1(i, L);
        return i;
    }

    @Override
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int i;
        z10 z10Var = (z10) this.c;
        if (this.b == z10Var.b) {
            j20 j20Var = z10Var.e;
            Bitmap n = imageReceiver.n();
            if ((n != null && imageReceiver.C()) || imageReceiver.B()) {
                i = hl.L(64.0f);
            } else {
                i = 0;
            }
            a20 a20Var = j20Var.C1;
            ValueAnimator valueAnimator = j20Var.M2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                j20Var.M2 = null;
            }
            if (a20Var.getCustomPaddingRight() != i) {
                ValueAnimator ofInt = ValueAnimator.ofInt(a20Var.getCustomPaddingRight(), i);
                j20Var.M2 = ofInt;
                if (i == 0) {
                    ofInt.setStartDelay(200L);
                    j20Var.M2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                j20Var.M2.setInterpolator(new DecelerateInterpolator());
                j20Var.M2.addUpdateListener(new g0(j20Var, (byte) 9));
                j20Var.M2.start();
            }
            if (j20Var.b2.getTag() != null) {
                j20Var.c2.setImageBitmap(n);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 10:
                String str = LaunchActivity.C1;
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    uc7.s1(i2).H3("spambot", (e) c00.g(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
                qh6 qh6Var = ((ph6) obj).h0;
                if (yac.t0 != i2) {
                    ((LaunchActivity) qh6Var.getParentActivity()).N0(i2);
                }
                qh6Var.finishFragment();
                return;
            case 17:
                b18 b18Var = ((m08) obj).a;
                b18Var.C1(b18Var.Z[i2]);
                return;
            case 18:
                ((PrivacyControlActivity) obj).presentFragment(new PrivacyControlActivity(i2, false), true);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull Y1 = profileActivity.getMessagesController().Y1(profileActivity.e1);
                if (Y1 != null) {
                    Y1.flags2 &= -4194305;
                    Y1.note = null;
                    profileActivity.getMessagesStorage().g2(Y1, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().o1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.f4();
                profileActivity.d.s(i2);
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        int i3 = this.b;
        switch (b) {
            case 4:
                hl.d3(new bt(i, i3, (nc2) obj, (byte) 3), 16L);
                return;
            default:
                hl.d3(new bt(i, i3, (hc2) obj, (byte) 4), 16L);
                return;
        }
    }

    public wg(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public wg(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    private final void f(View view, float f, float f2) {
    }

    private final void g(View view, float f, float f2) {
    }
}
