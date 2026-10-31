package i2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
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
import java.util.regex.Pattern;
import mg.f2;
import mg.i2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.mc;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.gf0;
import org.telegram.ui.hf0;
import org.telegram.ui.ll0;
import org.telegram.ui.m10;
import org.telegram.ui.nj;
import org.telegram.ui.tb0;
import org.telegram.ui.th0;
import org.telegram.ui.tk0;
import org.telegram.ui.un;
import org.telegram.ui.wh0;
import v7.t6;
public final class q implements e2.o, e2.j, jk0, zr, wb0, mc, q4, ik0, hk0, org.telegram.ui.ActionBar.u1, tb0, dk0 {
    public final int f8024a;
    public final int f8025b;
    public final Object f8026c;

    public q(int i10, Object obj, int i11) {
        this.f8024a = i11;
        this.f8025b = i10;
        this.f8026c = obj;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f8024a) {
            case 8:
                org.telegram.messenger.i0.h3(new u(i10, this.f8025b, (fo) this.f8026c, 10), 16L);
                return;
            default:
                org.telegram.messenger.i0.h3(new u(i10, this.f8025b, (yn) this.f8026c, 11), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.f8026c;
        int i10 = this.f8025b;
        try {
            try {
                pVar2 = (m4.p) ((j9.y) obj).get();
                t6.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.f12911a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.f12911a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.f12911a, SystemClock.elapsedRealtime(), r1Var3);
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
    public void b(float f7, float f10, int i10, View view) {
        int i11 = this.f8024a;
        int i12 = this.f8025b;
        Object obj = this.f8026c;
        switch (i11) {
            case 11:
                ContactsActivity.b0((ContactsActivity) obj, i12, view, i10);
                return;
            default:
                wh0 wh0Var = (wh0) obj;
                f2 f2Var = wh0Var.Q1;
                HashSet hashSet = wh0Var.V1;
                if (view instanceof qg.k) {
                    TLRPC.User user = ((qg.k) view).getUser();
                    long j10 = user.f19942id;
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        wh0Var.a2.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == i12 + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        String G = cd.G(wh0Var.f43312h2, "BotMultiContactsSelectorLimit", new Object[0]);
                        p2 p2Var = wh0Var.f21589c;
                        new cc(p2Var, wh0Var.I0).Q(2131623981, 36, G).k(true);
                        try {
                            p2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    f2Var.b(true, hashSet, new th0(wh0Var, 2), null);
                    wh0Var.g1(true, false);
                    if (TextUtils.isEmpty(wh0Var.f43306b2)) {
                        return;
                    }
                    wh0Var.f43306b2 = null;
                    f2Var.setText("");
                    org.telegram.messenger.i0.r(wh0Var.f43316l2);
                    wh0Var.f1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        Pattern pattern = LaunchActivity.D1;
        for (Map.Entry entry : ((HashMap) this.f8026c).entrySet()) {
            jj jjVar = (jj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            qz.C(this.f8025b).r0(oz.d(messageMedia2, jj.B0(jjVar.f16337k), jjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public String e(int i10) {
        Calendar calendar = (Calendar) this.f8026c;
        int i11 = this.f8025b;
        calendar.clear();
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) == i11) {
            cd D0 = cd.D0();
            if (D0.f14997r == null) {
                synchronized (D0) {
                    try {
                        if (D0.f14997r == null) {
                            Locale locale = D0.f15003y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            D0.f14997r = cd.k(locale, D0.N0(2131742791, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return D0.f14997r.format(calendar.getTimeInMillis());
        }
        return cd.D0().u0().format(calendar.getTimeInMillis());
    }

    @Override
    public boolean f(int i10, View view) {
        mj0 mj0Var = (mj0) this.f8026c;
        if (this.f8025b == 5) {
            mj0Var.getClass();
            return false;
        }
        lj0 lj0Var = mj0Var.f28513g0;
        if (lj0Var == null || !(view instanceof kj0)) {
            return false;
        }
        lj0Var.x(mj0Var, ((kj0) view).e, true, false);
        return true;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        int i11 = this.f8024a;
        int i12 = this.f8025b;
        Object obj = this.f8026c;
        switch (i11) {
            case 12:
                ArrayList arrayList = ((LaunchActivity) obj).f33353d0;
                if (!arrayList.isEmpty()) {
                    vp.r1(i12).v3("spambot", (k2) i0.a.g(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
            case 14:
            case 16:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                TLRPC.UserFull a2 = profileActivity.getMessagesController().a2(profileActivity.f33796d1);
                if (a2 != null) {
                    a2.flags2 &= -4194305;
                    a2.note = null;
                    profileActivity.getMessagesStorage().j2(a2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f19934id = profileActivity.getMessagesController().n1(profileActivity.f33796d1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.I5();
                profileActivity.d.s(i12);
                return;
            case 15:
                hf0 hf0Var = ((gf0) obj).f37534a0;
                if (d20.f15147s0 != i12) {
                    ((LaunchActivity) hf0Var.getParentActivity()).O0(i12);
                }
                hf0Var.finishFragment();
                return;
            case 17:
                ll0 ll0Var = ((tk0) obj).f41855a;
                ll0Var.C1(ll0Var.Y[i12]);
                return;
            case 18:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i12, false), true);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f8024a) {
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(boolean z10) {
        un unVar = ((nj) this.f8026c).f39956b;
        int i10 = this.f8025b;
        if (i10 == 15 && w3.T(unVar.e)) {
            TLRPC.Chat chat = unVar.e;
            if (!chat.megagroup || w3.t0(chat)) {
                unVar.getMessagesController().X(2, unVar.f42297j6, z10);
                return;
            }
        }
        if (i10 != 15) {
            zs notificationCenter = unVar.getNotificationCenter();
            int i11 = zs.f19690t;
            notificationCenter.n(unVar, i11);
            unVar.getNotificationCenter().k(i11, new Object[0]);
            unVar.finishFragment();
            unVar.getNotificationCenter().k(zs.K2, Long.valueOf(unVar.f42297j6), unVar.f42243f, unVar.e, Boolean.valueOf(z10));
            return;
        }
        unVar.Ga(unVar.f42394r4, z10);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8024a) {
            case 0:
                ((b2.d1) obj).O(((m1) this.f8026c).f7970a, this.f8025b);
                return;
            case 1:
                b2.d1 d1Var = (b2.d1) obj;
                d1Var.C(this.f8025b, (b2.p0) this.f8026c);
                return;
            default:
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.B((j2.a) this.f8026c, this.f8025b);
                return;
        }
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10;
        n7 n7Var = (n7) this.f8026c;
        if (this.f8025b == n7Var.f28696b) {
            w7 w7Var = n7Var.e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i10 = org.telegram.messenger.i0.L(64.0f);
            } else {
                i10 = 0;
            }
            o7 o7Var = w7Var.f32084z1;
            ValueAnimator valueAnimator = w7Var.J2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                w7Var.J2 = null;
            }
            if (o7Var.getCustomPaddingRight() != i10) {
                ValueAnimator ofInt = ValueAnimator.ofInt(o7Var.getCustomPaddingRight(), i10);
                w7Var.J2 = ofInt;
                if (i10 == 0) {
                    ofInt.setStartDelay(200L);
                    w7Var.J2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                w7Var.J2.setInterpolator(new DecelerateInterpolator());
                w7Var.J2.addUpdateListener(new a6(w7Var, 2));
                w7Var.J2.start();
            }
            if (w7Var.Y1.getTag() != null) {
                w7Var.Z1.setImageBitmap(n10);
            }
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f8024a;
    }

    @Override
    public int run() {
        s4.a0 a0Var = ((bb0) this.f8026c).f36158c;
        int L = org.telegram.messenger.i0.L(60.0f);
        int i10 = this.f8025b;
        a0Var.h1(i10, L);
        return i10;
    }

    public q(j2.a aVar, int i10, b2.e1 e1Var, b2.e1 e1Var2) {
        this.f8024a = 2;
        this.f8026c = aVar;
        this.f8025b = i10;
    }

    public q(Object obj, int i10, int i11) {
        this.f8024a = i11;
        this.f8026c = obj;
        this.f8025b = i10;
    }

    public q(nj njVar, int i10, boolean z10) {
        this.f8024a = 5;
        this.f8026c = njVar;
        this.f8025b = i10;
    }

    @Override
    public void g() {
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        i2 i2Var = (i2) this.f8026c;
        m10 m10Var = i2Var.V1;
        HashSet hashSet = i2Var.Z1;
        if (view instanceof qg.k) {
            qg.k kVar = (qg.k) view;
            TLRPC.User user = kVar.getUser();
            long j10 = user != null ? user.f19942id : -kVar.getChat().f19793id;
            int i11 = this.f8025b;
            boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                i2Var.f13142f2.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i2Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j10));
                i2Var.m1();
                return true;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                m10Var.setVisibility(0);
                m10Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.i0.L(12.0f)).setInterpolator(gr.h).setDuration(320L).withEndAction(!z11 ? new mg.w1(i2Var, 7) : null).start();
                ng.i iVar = i2Var.f13144h2;
                boolean z12 = !z11;
                if (iVar.D != z12) {
                    iVar.D = z12;
                    org.telegram.messenger.i0.d0(iVar.f13793f, new ng.g(z12));
                }
            }
            i2Var.e1();
            i2Var.R1.b(true, hashSet, new mg.w1(i2Var, 8), null);
            i2Var.p1(true, true);
            i2Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void c(View view, float f7, float f10) {
    }
}
