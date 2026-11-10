package l2;

import a8.ia;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ee0;
import org.telegram.ui.ek0;
import org.telegram.ui.fe0;
import org.telegram.ui.ng0;
import org.telegram.ui.nj0;
import org.telegram.ui.pa0;
import org.telegram.ui.qg0;
import org.telegram.ui.tg0;
import org.telegram.ui.ui;
import org.telegram.ui.z90;
public final class q implements h2.o, qr, db0, lc, s4, dj0, cj0, org.telegram.ui.ActionBar.r1, pa0, yi0, h2.j, ej0 {
    public final int f17994a;
    public final int f17995b;
    public final Object f17996c;

    public q(int i7, Object obj, int i10) {
        this.f17994a = i10;
        this.f17995b = i7;
        this.f17996c = obj;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f17994a) {
            case 6:
                org.telegram.messenger.g0.i3(new jg.r(i7, this.f17995b, (wn) this.f17996c, 11), 16L);
                return;
            default:
                org.telegram.messenger.g0.i3(new jg.r(i7, this.f17995b, (pn) this.f17996c, 12), 16L);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        p4.o oVar;
        p4.o oVar2;
        p4.v vVar = (p4.v) this.f17996c;
        int i7 = this.f17995b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                ia.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.k1 k1Var = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var.f53352a, SystemClock.elapsedRealtime(), k1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.k1 k1Var2 = new p4.k1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(k1Var2.f53352a, SystemClock.elapsedRealtime(), k1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.k1 k1Var3 = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var3.f53352a, SystemClock.elapsedRealtime(), k1Var3);
                oVar2 = oVar;
                p4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.i(i7, oVar2);
            }
            p4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.i(i7, oVar2);
        } catch (RemoteException e13) {
            h2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e13);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        ii0 ii0Var = (ii0) this.f17996c;
        if (this.f17995b == 5) {
            ii0Var.getClass();
            return false;
        }
        hi0 hi0Var = ii0Var.f34651g0;
        if (hi0Var == null || !(view instanceof gi0)) {
            return false;
        }
        hi0Var.i(ii0Var, ((gi0) view).f33906e, true, false);
        return true;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        String str = LaunchActivity.B1;
        for (Map.Entry entry : ((HashMap) this.f17996c).entrySet()) {
            ij ijVar = (ij) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            gz.C(this.f17995b).r0(ez.d(messageMedia2, ij.B0(ijVar.f23266k), ijVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.f17994a;
        int i11 = this.f17995b;
        Object obj = this.f17996c;
        switch (i10) {
            case 9:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                tg0 tg0Var = (tg0) obj;
                qg0 qg0Var = tg0Var.T1;
                HashSet hashSet = tg0Var.Y1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f27109id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        tg0Var.d2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = id.G(tg0Var.f50275k2, "BotMultiContactsSelectorLimit", new Object[0]);
                        m2 m2Var = tg0Var.f28675c;
                        new gc(m2Var, tg0Var.I0).Q(2131623981, 36, G).k(true);
                        try {
                            m2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    qg0Var.b(true, hashSet, new ng0(tg0Var, 2), null);
                    tg0Var.g1(true, false);
                    if (TextUtils.isEmpty(tg0Var.f50269e2)) {
                        return;
                    }
                    tg0Var.f50269e2 = null;
                    qg0Var.setText("");
                    org.telegram.messenger.g0.r(tg0Var.f50279o2);
                    tg0Var.f1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        int i7;
        r7 r7Var = (r7) this.f17996c;
        if (this.f17995b == r7Var.f37527b) {
            a8 a8Var = r7Var.f37529e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            s7 s7Var = a8Var.C1;
            ValueAnimator valueAnimator = a8Var.M2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a8Var.M2 = null;
            }
            if (s7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(s7Var.getCustomPaddingRight(), i7);
                a8Var.M2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    a8Var.M2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                a8Var.M2.setInterpolator(new DecelerateInterpolator());
                a8Var.M2.addUpdateListener(new d6(a8Var, 2));
                a8Var.M2.start();
            }
            if (a8Var.f31735b2.getTag() != null) {
                a8Var.f31736c2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f17994a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f17994a;
        int i11 = this.f17995b;
        Object obj = this.f17996c;
        switch (i10) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) obj).f41258d0;
                if (!arrayList.isEmpty()) {
                    qp.s1(i11).y3("spambot", (f2) jg.g.i(1, arrayList), 1, null);
                    return;
                }
                return;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f41714d1);
                if (b22 != null) {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                    profileActivity.getMessagesStorage().j2(b22, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f27101id = profileActivity.getMessagesController().o1(profileActivity.f41714d1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.M5();
                profileActivity.d.s(i11);
                return;
            case 13:
                fe0 fe0Var = ((ee0) obj).f45255g0;
                if (p10.f24474s0 != i11) {
                    ((LaunchActivity) fe0Var.getParentActivity()).O0(i11);
                }
                fe0Var.finishFragment();
                return;
            case 15:
                ek0 ek0Var = ((nj0) obj).f48219a;
                ek0Var.D1(ek0Var.Y[i11]);
                return;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public String h(int i7) {
        Calendar calendar = (Calendar) this.f17996c;
        int i10 = this.f17995b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            id E0 = id.E0();
            if (E0.f23183r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f23183r == null) {
                            Locale locale = E0.f23189y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f23183r = id.k(locale, E0.O0(2131742766, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f23183r.format(calendar.getTimeInMillis());
        }
        return id.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f17994a) {
            case 0:
                ((e2.a1) obj).L(((k1) this.f17996c).f17915a, this.f17995b);
                return;
            case 1:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f17995b, (e2.l0) this.f17996c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.A((m2.a) this.f17996c, this.f17995b);
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        cn cnVar = ((ui) this.f17996c).f50508b;
        int i7 = this.f17995b;
        if (i7 == 15 && t3.T(cnVar.f44473e)) {
            TLRPC.Chat chat = cnVar.f44473e;
            if (!chat.megagroup || t3.t0(chat)) {
                cnVar.getMessagesController().X(2, cnVar.f44545j6, z9);
                return;
            }
        }
        if (i7 != 15) {
            qs notificationCenter = cnVar.getNotificationCenter();
            int i10 = qs.f25080t;
            notificationCenter.n(cnVar, i10);
            cnVar.getNotificationCenter().k(i10, new Object[0]);
            cnVar.finishFragment();
            cnVar.getNotificationCenter().k(qs.K2, Long.valueOf(cnVar.f44545j6), cnVar.f44487f, cnVar.f44473e, Boolean.valueOf(z9));
            return;
        }
        cnVar.Sa(cnVar.f44643r4, z9);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f17994a;
    }

    @Override
    public int run() {
        v4.b0 b0Var = ((z90) this.f17996c).f52336c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f17995b;
        b0Var.h1(i7, L);
        return i7;
    }

    public q(Object obj, int i7, int i10) {
        this.f17994a = i10;
        this.f17996c = obj;
        this.f17995b = i7;
    }

    public q(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f17994a = 2;
        this.f17996c = aVar;
        this.f17995b = i7;
    }

    public q(ui uiVar, int i7, boolean z9) {
        this.f17994a = 3;
        this.f17996c = uiVar;
        this.f17995b = i7;
    }

    @Override
    public void i() {
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        wg.f1 f1Var = (wg.f1) this.f17996c;
        ah.a aVar = f1Var.Y1;
        HashSet hashSet = f1Var.f57727c2;
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            long j3 = user != null ? user.f27109id : -rVar.getChat().f26960id;
            int i10 = this.f17995b;
            boolean z9 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                f1Var.f57732i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == f1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                f1Var.m1();
                return true;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z9 != z10) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(wq.h).setDuration(320L).withEndAction(!z10 ? new wg.x0(f1Var, 7) : null).start();
                xg.i iVar = f1Var.f57734k2;
                boolean z11 = !z10;
                if (iVar.D != z11) {
                    iVar.D = z11;
                    org.telegram.messenger.g0.d0(iVar.f58753f, new xg.g(z11));
                }
            }
            f1Var.e1();
            f1Var.U1.b(true, hashSet, new wg.x0(f1Var, 8), null);
            f1Var.p1(true, true);
            f1Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }
}
