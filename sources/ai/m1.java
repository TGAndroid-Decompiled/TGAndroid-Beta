package ai;

import a8.ma;
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
import bi.o4;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.kc;
import org.telegram.messenger.ls;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
import org.telegram.ui.na0;
import org.telegram.ui.pg0;
import org.telegram.ui.qj0;
import org.telegram.ui.sg0;
import org.telegram.ui.ti;
import org.telegram.ui.vg0;
import org.telegram.ui.z90;
public final class m1 implements y0, h2.o, mr, pb0, kc, a5, sj0, rj0, org.telegram.ui.ActionBar.q1, na0, nj0, h2.j {
    public final int f1373a;
    public final int f1374b;
    public final Object f1375c;

    public m1(int i7, Object obj, int i10) {
        this.f1373a = i10;
        this.f1374b = i7;
        this.f1375c = obj;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f1373a) {
            case 8:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1374b, (qo) this.f1375c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1374b, (o4) this.f1375c, 13), 16L);
                return;
        }
    }

    @Override
    public void a(final float[] fArr, final long j3, final int i7) {
        android.support.v4.media.session.a0 a0Var;
        Object obj;
        switch (this.f1373a) {
            case 0:
                v1 v1Var = (v1) this.f1375c;
                int i10 = this.f1374b;
                if (!v1Var.h && i10 == v1Var.f1565p) {
                    z0 k10 = DictationLid.k(Math.min(0.6f, DictationLid.g(i7)), fArr);
                    if (k10 != null && k10.f1607c) {
                        a0Var = DictationAsr.U(k10.f1605a, v1Var.f1561l, false);
                        if (a0Var != null) {
                            DictationLid.i(k10.f1605a);
                            v1Var.k(k10.f1605a);
                        }
                    } else if (k10 != null) {
                        a0Var = DictationAsr.T(DictationLid.d, fArr, v1Var.f1561l, false);
                        if (a0Var != null) {
                            v1Var.k(a0Var.i());
                        }
                    } else {
                        a0Var = null;
                    }
                    StringBuilder sb2 = new StringBuilder("tinyasr stop: tinylid ");
                    sb2.append(i7);
                    sb2.append(" ms speech in ");
                    sb2.append(j3);
                    sb2.append(" ms: ");
                    sb2.append(k10);
                    sb2.append(" → ");
                    if (a0Var != null) {
                        obj = a0Var;
                    } else {
                        obj = "-";
                    }
                    sb2.append(obj);
                    Log.d("Dictation", sb2.toString());
                    if (a0Var != null) {
                        p pVar = (p) a0Var.f1675b;
                        android.support.v4.media.session.a0 a0Var2 = v1Var.f1561l;
                        if (pVar != ((p) a0Var2.f1675b) || !((String) a0Var.f1676c).equals((String) a0Var2.f1676c)) {
                            v1Var.i(a0Var);
                            return;
                        }
                    }
                    v1Var.e();
                    return;
                }
                return;
            default:
                final h2 h2Var = (h2) this.f1375c;
                final int i11 = this.f1374b;
                h2Var.f1266x.f1295b.add(new Runnable() {
                    @Override
                    public final void run() {
                        android.support.v4.media.session.a0 U;
                        String nativeSessionPush;
                        int i12;
                        h2 h2Var2 = h2.this;
                        int i13 = i11;
                        float[] fArr2 = fArr;
                        int i14 = i7;
                        long j10 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = h2Var2.f1260q;
                        h2Var2.f1264u = false;
                        if (i13 == h2Var2.f1261r && h2Var2.d != null && fArr2 != null) {
                            int i15 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f43047j;
                                if (i15 < iArr.length) {
                                    if (iArr[i15] > i14) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = -1;
                                    break;
                                }
                            }
                            h2Var2.f1262s = i15;
                            if (i15 < 0) {
                                h2Var2.f1259p.reset();
                                byteArrayOutputStream.reset();
                            }
                            z0 k11 = DictationLid.k(DictationLid.g(i14), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) h2Var2.d.d;
                            StringBuilder sb3 = new StringBuilder("live captions ");
                            int i16 = h2Var2.f1246a;
                            i5.c.z(sb3, i16, ": tinylid ", i14, " ms speech in ");
                            sb3.append(j10);
                            sb3.append(" ms: ");
                            sb3.append(k11);
                            sb3.append(" (");
                            sb3.append(a0Var3);
                            sb3.append(")");
                            Log.d("Dictation", sb3.toString());
                            if (k11 != null) {
                                String str = k11.f1605a;
                                if (k11.f1607c && (U = DictationAsr.U(str, a0Var3, false)) != null) {
                                    p pVar2 = (p) U.f1675b;
                                    int max = Math.max(0, i14 - h2Var2.f1258o);
                                    h2Var2.f1258o = Math.max(h2Var2.f1258o, i14);
                                    if (pVar2 == ((p) a0Var3.f1675b) && ((String) U.f1676c).equals((String) a0Var3.f1676c)) {
                                        h2Var2.v = true;
                                        if (!str.equals(h2Var2.f1254k)) {
                                            i12 = 0;
                                            h2Var2.f1255l = 0;
                                        } else {
                                            i12 = 0;
                                        }
                                        h2Var2.f1254k = str;
                                        h2Var2.f1255l = Math.min(30000, h2Var2.f1255l + max);
                                        h2Var2.f1256m = null;
                                        h2Var2.f1257n = i12;
                                    } else if (!h2Var2.v || k11.f1606b >= 0.8f) {
                                        if (!str.equals(h2Var2.f1256m)) {
                                            h2Var2.f1256m = str;
                                            h2Var2.f1257n = 0;
                                        }
                                        int min = Math.min(30000, h2Var2.f1257n + max);
                                        h2Var2.f1257n = min;
                                        if (min < h2Var2.f1255l / 4) {
                                            StringBuilder m10 = i5.c.m(i16, "live captions ", ": staying in ");
                                            m10.append(h2Var2.f1254k);
                                            m10.append(" (");
                                            m10.append(h2Var2.f1255l);
                                            m10.append(" ms), ");
                                            m10.append(h2Var2.f1256m);
                                            m10.append(" has ");
                                            m10.append(h2Var2.f1257n);
                                            m10.append(" ms");
                                            Log.d("Dictation", m10.toString());
                                        } else if (pVar2 != null && pVar2.f1446f != 0) {
                                            t c10 = t.c(U, h2Var2);
                                            if (c10 != null) {
                                                h2Var2.v = true;
                                                h2Var2.f1254k = str;
                                                h2Var2.f1255l = h2Var2.f1257n;
                                                h2Var2.f1256m = null;
                                                h2Var2.f1257n = 0;
                                                StringBuilder m11 = i5.c.m(i16, "live captions ", ": replaying ");
                                                m11.append(byteArrayOutputStream.size() / 32);
                                                m11.append(" ms in ");
                                                m11.append(U);
                                                Log.d("Dictation", m11.toString());
                                                t tVar = h2Var2.d;
                                                long j11 = tVar.f1531c;
                                                if (j11 != 0) {
                                                    DictationAsr.nativeSessionFree(j11);
                                                    tVar.f1531c = 0L;
                                                    DictationAsr.P((p) tVar.f1532e);
                                                }
                                                h2Var2.d = c10;
                                                h2Var2.h = 0;
                                                h2Var2.f1251g = 0;
                                                int i17 = h2Var2.f1265w;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                t tVar2 = h2Var2.d;
                                                int length = byteArray.length;
                                                long j12 = tVar2.f1531c;
                                                if (j12 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j12, byteArray, 0, length);
                                                    tVar2.b(nativeSessionPush);
                                                }
                                                if (h2Var2.f1265w == i17 && !h2Var2.f1253j.isEmpty()) {
                                                    h2Var2.f1253j = "";
                                                    org.telegram.messenger.g0.g3(new e2((Object) h2Var2, h2Var2.f1250f, (Serializable) "", false, 0));
                                                }
                                            }
                                        } else {
                                            org.telegram.messenger.g0.g3(new a3.f(U, 7));
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        p4.o oVar;
        p4.o oVar2;
        p4.v vVar = (p4.v) this.f1375c;
        int i7 = this.f1374b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                ma.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.m1 m1Var = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var.f55355a, SystemClock.elapsedRealtime(), m1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.m1 m1Var2 = new p4.m1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(m1Var2.f55355a, SystemClock.elapsedRealtime(), m1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.m1 m1Var3 = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var3.f55355a, SystemClock.elapsedRealtime(), m1Var3);
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
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.f1375c).entrySet()) {
            gj gjVar = (gj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            az.C(this.f1374b).r0(yy.d(messageMedia2, gj.B0(gjVar.f24177k), gjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f1373a) {
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        xi0 xi0Var = (xi0) this.f1375c;
        if (this.f1374b == 5) {
            xi0Var.getClass();
            return false;
        }
        wi0 wi0Var = xi0Var.f42075h0;
        if (wi0Var == null || !(view instanceof vi0)) {
            return false;
        }
        wi0Var.g(xi0Var, ((vi0) view).f40790e, true, false);
        return true;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((ti) this.f1375c).f52284b;
        int i7 = this.f1374b;
        if (i7 == 15 && v3.T(bnVar.f45958e)) {
            TLRPC.Chat chat = bnVar.f45958e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.f46056l6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ls notificationCenter = bnVar.getNotificationCenter();
            int i10 = ls.f25348t;
            notificationCenter.n(bnVar, i10);
            bnVar.getNotificationCenter().k(i10, new Object[0]);
            bnVar.finishFragment();
            bnVar.getNotificationCenter().k(ls.K2, Long.valueOf(bnVar.f46056l6), bnVar.f45972f, bnVar.f45958e, Boolean.valueOf(z10));
            return;
        }
        bnVar.Ta(bnVar.f46144s4, z10);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.f1373a;
        int i11 = this.f1374b;
        Object obj = this.f1375c;
        switch (i10) {
            case 11:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                vg0 vg0Var = (vg0) obj;
                sg0 sg0Var = vg0Var.U1;
                HashSet hashSet = vg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28547id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        vg0Var.f52801e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = hd.G(vg0Var.f52808l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.m2 m2Var = vg0Var.f30145c;
                        new lc(m2Var, vg0Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            m2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    sg0Var.b(true, hashSet, new pg0(vg0Var, 2), null);
                    vg0Var.h1(true, false);
                    if (!TextUtils.isEmpty(vg0Var.f52802f2)) {
                        vg0Var.f52802f2 = null;
                        sg0Var.setText("");
                        org.telegram.messenger.g0.r(vg0Var.f52812p2);
                        vg0Var.g1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f1373a;
        int i11 = this.f1374b;
        Object obj = this.f1375c;
        switch (i10) {
            case 12:
                ArrayList arrayList = ((LaunchActivity) obj).f43085e0;
                if (!arrayList.isEmpty()) {
                    np.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 13:
            case 14:
            case 16:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43550e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28539id = profileActivity.getMessagesController().q1(profileActivity.f43550e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                return;
            case 15:
                de0 de0Var = ((ce0) obj).f46528h0;
                if (k10.f24932t0 != i11) {
                    ((LaunchActivity) de0Var.getParentActivity()).O0(i11);
                }
                de0Var.finishFragment();
                return;
            case 17:
                hk0 hk0Var = ((qj0) obj).f51228a;
                hk0Var.D1(hk0Var.Z[i11]);
                return;
            case 18:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public String i(int i7) {
        Calendar calendar = (Calendar) this.f1375c;
        int i10 = this.f1374b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            hd E0 = hd.E0();
            if (E0.f24430r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24430r == null) {
                            Locale locale = E0.f24436y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24430r = hd.k(locale, E0.P0(2131742502, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24430r.format(calendar.getTimeInMillis());
        }
        return hd.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1373a) {
            case 2:
                ((e2.a1) obj).L(((l2.g1) this.f1375c).f19366a, this.f1374b);
                return;
            case 3:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f1374b, (e2.l0) this.f1375c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C((m2.a) this.f1375c, this.f1374b);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        w7 w7Var = (w7) this.f1375c;
        if (this.f1374b == w7Var.f41649b) {
            f8 f8Var = w7Var.f41651e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            x7 x7Var = f8Var.D1;
            ValueAnimator valueAnimator = f8Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                f8Var.N2 = null;
            }
            if (x7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), i7);
                f8Var.N2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    f8Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                f8Var.N2.setInterpolator(new DecelerateInterpolator());
                f8Var.N2.addUpdateListener(new org.telegram.ui.Components.x(f8Var, 3));
                f8Var.N2.start();
            }
            if (f8Var.f35088c2.getTag() != null) {
                f8Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public int run() {
        v4.b0 b0Var = ((z90) this.f1375c).f54468c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1374b;
        b0Var.h1(i7, L);
        return i7;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f1373a;
    }

    public m1(Object obj, int i7, int i10) {
        this.f1373a = i10;
        this.f1375c = obj;
        this.f1374b = i7;
    }

    public m1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1373a = 4;
        this.f1375c = aVar;
        this.f1374b = i7;
    }

    public m1(ti tiVar, int i7, boolean z10) {
        this.f1373a = 5;
        this.f1375c = tiVar;
        this.f1374b = i7;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
