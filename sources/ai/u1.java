package ai;

import a8.la;
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
import bi.l4;
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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
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
public final class u1 implements e1, h2.o, lr, pb0, jc, a5, sj0, rj0, org.telegram.ui.ActionBar.q1, na0, nj0, h2.j {
    public final int f1545a;
    public final int f1546b;
    public final Object f1547c;

    public u1(int i7, Object obj, int i10) {
        this.f1545a = i10;
        this.f1546b = i7;
        this.f1547c = obj;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f1545a) {
            case 9:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1546b, (qo) this.f1547c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1546b, (l4) this.f1547c, 13), 16L);
                return;
        }
    }

    @Override
    public void a(final float[] fArr, final long j3, final int i7) {
        boolean z10;
        android.support.v4.media.session.a0 a0Var;
        Object obj;
        long j10;
        float f10;
        boolean z11;
        int i10;
        String str;
        switch (this.f1545a) {
            case 0:
                e2 e2Var = (e2) this.f1547c;
                int i11 = this.f1546b;
                if (!e2Var.f1178j && i11 == e2Var.C) {
                    float min = Math.min(0.6f, DictationLid.i(i7));
                    f1 n10 = DictationLid.n(min, fArr);
                    if (n10 == null || ((!n10.f1198c && (!"other".equals(n10.f1196a) || n10.f1197b < min)) || (!"other".equals(n10.f1196a) && DictationAsr.V(n10.f1196a, e2Var.f1192y, false) != null))) {
                        z10 = false;
                    } else {
                        Log.d("Dictation", "tinyasr stop: tinylid " + i7 + " ms speech in " + j3 + " ms: " + n10 + " → Google?");
                        e2Var.L = true;
                        if (e2Var.h(n10.f1196a)) {
                            z zVar = e2Var.f1189u;
                            if (zVar != null) {
                                j10 = zVar.c() / 32;
                            } else {
                                j10 = 0;
                            }
                            e2Var.f1171f.postDelayed(new q1(e2Var, 5), j10 + 10000);
                            return;
                        }
                        z10 = false;
                        e2Var.L = false;
                    }
                    if (n10 != null && n10.f1198c) {
                        a0Var = DictationAsr.V(n10.f1196a, e2Var.f1192y, z10);
                        if (a0Var != null) {
                            DictationLid.l(n10.f1196a);
                            e2Var.r(n10.f1196a);
                        }
                    } else if (n10 != null) {
                        a0Var = DictationAsr.U(DictationLid.d, fArr, e2Var.f1192y, false);
                        if (a0Var != null) {
                            e2Var.r(a0Var.i());
                        }
                    } else {
                        a0Var = null;
                    }
                    StringBuilder sb2 = new StringBuilder("tinyasr stop: tinylid ");
                    sb2.append(i7);
                    sb2.append(" ms speech in ");
                    sb2.append(j3);
                    sb2.append(" ms: ");
                    sb2.append(n10);
                    sb2.append(" → ");
                    if (a0Var != null) {
                        obj = a0Var;
                    } else {
                        obj = "-";
                    }
                    sb2.append(obj);
                    Log.d("Dictation", sb2.toString());
                    if (a0Var != null) {
                        t tVar = (t) a0Var.f1717b;
                        android.support.v4.media.session.a0 a0Var2 = e2Var.f1192y;
                        if (tVar != ((t) a0Var2.f1717b) || !((String) a0Var.f1718c).equals((String) a0Var2.f1718c)) {
                            e2Var.o(a0Var);
                            return;
                        }
                    }
                    e2Var.g();
                    return;
                }
                return;
            case 1:
                int i12 = this.f1546b;
                e2 e2Var2 = ((z1) this.f1547c).f1648b;
                e2Var2.W = false;
                int i13 = e2Var2.Y;
                if (i12 == i13) {
                    e2Var2.f1165b0 = i7;
                }
                if (fArr != null) {
                    int i14 = e2Var2.f1179k;
                    if (!e2Var2.f1178j && !e2Var2.f1176i && i12 == i13 && e2Var2.f1188t != i14) {
                        String[] strArr = DictationLid.d;
                        int i15 = 0;
                        for (int i16 = 1; i16 < fArr.length; i16++) {
                            if (fArr[i16] > fArr[i15]) {
                                i15 = i16;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList = e2Var2.f1185q;
                        int size = arrayList.size();
                        float f11 = 0.0f;
                        int i17 = i15;
                        int i18 = 0;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        String str2 = null;
                        while (i18 < size) {
                            Object obj2 = arrayList.get(i18);
                            int i19 = i18 + 1;
                            int i20 = size;
                            String str3 = (String) obj2;
                            ArrayList arrayList2 = arrayList;
                            float f14 = 0.0f;
                            for (int i21 = 0; i21 < strArr.length; i21++) {
                                if (w0.d(strArr[i21], str3)) {
                                    f14 += fArr[i21];
                                }
                            }
                            f12 += f14;
                            if (f14 > f13) {
                                str2 = str3;
                                f13 = f14;
                            }
                            sb3.append(' ');
                            sb3.append(str3);
                            sb3.append('=');
                            sb3.append(String.format(Locale.US, "%.2f", Float.valueOf(f14)));
                            i18 = i19;
                            size = i20;
                            str2 = str2;
                            arrayList = arrayList2;
                        }
                        if (f12 > 0.0f) {
                            f10 = f13 / f12;
                        } else {
                            f10 = 0.0f;
                        }
                        StringBuilder n11 = i5.c.n("session ", i14, " tinylid ", i7, " ms speech in ");
                        n11.append(j3);
                        n11.append(" ms: top ");
                        n11.append(strArr[i17]);
                        Locale locale = Locale.US;
                        n11.append(String.format(locale, " %.2f", Float.valueOf(fArr[i17])));
                        n11.append(" |");
                        n11.append((Object) sb3);
                        n11.append(" → ");
                        n11.append(str2);
                        n11.append(String.format(locale, " %.2f", Float.valueOf(f10)));
                        n11.append(" current=");
                        p5.c.t(n11, e2Var2.f1186r, "Dictation");
                        if (str2 != null && !"nospeech".equals(strArr[i17]) && !"other".equals(strArr[i17]) && f12 >= 0.3f) {
                            for (int i22 = 0; i22 < strArr.length; i22++) {
                                if (w0.d(strArr[i22], str2)) {
                                    f11 += fArr[i22];
                                }
                            }
                            if (!w0.d(str2, e2Var2.f1186r) && f10 >= 0.8f && f11 >= 0.6f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && w0.d(str2, e2Var2.f1168d0)) {
                                i10 = e2Var2.f1163a0 + 1;
                            } else if (z11) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            e2Var2.f1163a0 = i10;
                            if (z11) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            e2Var2.f1168d0 = str;
                            if (i10 >= 2) {
                                int i23 = e2Var2.f1165b0;
                                if (i23 < 5000) {
                                    e2Var2.f1187s++;
                                    if (e2Var2.J != null) {
                                        Log.d("Dictation", "live transcript: no switch to " + str2 + " (tinylid)");
                                        return;
                                    }
                                    e2Var2.v(str2, "tinylid");
                                    e2Var2.r(str2);
                                    int i24 = e2Var2.f1190w;
                                    e2Var2.f1191x = i24;
                                    e2Var2.X = i24;
                                    e2Var2.Y++;
                                    e2Var2.f1165b0 = 0;
                                    e2Var2.f1167c0 = false;
                                    e2Var2.f1163a0 = 0;
                                    e2Var2.f1168d0 = null;
                                    e2Var2.f1188t = i14;
                                    k2 k2Var = e2Var2.f1173g;
                                    if (k2Var.h(i14)) {
                                        StringBuilder m10 = i5.c.m(i14, "session ", " discarded: ");
                                        m10.append(k2.c(k2.i(k2Var.f1266b, k2Var.f1267c)));
                                        k2Var.j(m10.toString());
                                        k2Var.f1266b = "";
                                        k2Var.f1267c = "";
                                        k2Var.d = false;
                                        k2Var.f1269f = false;
                                    }
                                    e2Var2.d();
                                    e2Var2.f1171f.post(new o1(e2Var2, i14, 1));
                                    return;
                                } else if (!e2Var2.f1167c0) {
                                    e2Var2.f1167c0 = true;
                                    p5.c.t(i5.c.m(i23, "language locked: ", " ms of speech in "), e2Var2.f1186r, "Dictation");
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                final q2 q2Var = (q2) this.f1547c;
                final int i25 = this.f1546b;
                q2Var.f1437t.f1446b.add(new Runnable() {
                    @Override
                    public final void run() {
                        android.support.v4.media.session.a0 V;
                        String nativeSessionPush;
                        q2 q2Var2 = q2.this;
                        int i26 = i25;
                        float[] fArr2 = fArr;
                        int i27 = i7;
                        long j11 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = q2Var2.f1430m;
                        q2Var2.f1434q = false;
                        if (i26 == q2Var2.f1431n && q2Var2.d != null && fArr2 != null) {
                            int i28 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f43078j;
                                if (i28 < iArr.length) {
                                    if (iArr[i28] > i27) {
                                        break;
                                    }
                                    i28++;
                                } else {
                                    i28 = -1;
                                    break;
                                }
                            }
                            q2Var2.f1432o = i28;
                            if (i28 < 0) {
                                q2Var2.f1429l.reset();
                                byteArrayOutputStream.reset();
                            }
                            f1 n12 = DictationLid.n(DictationLid.i(i27), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) q2Var2.d.d;
                            StringBuilder sb4 = new StringBuilder("live captions ");
                            int i29 = q2Var2.f1420a;
                            i5.c.z(sb4, i29, ": tinylid ", i27, " ms speech in ");
                            sb4.append(j11);
                            sb4.append(" ms: ");
                            sb4.append(n12);
                            sb4.append(" (");
                            sb4.append(a0Var3);
                            sb4.append(")");
                            Log.d("Dictation", sb4.toString());
                            if (n12 != null) {
                                String str4 = n12.f1196a;
                                if (n12.f1198c && (V = DictationAsr.V(str4, a0Var3, false)) != null) {
                                    t tVar2 = (t) V.f1717b;
                                    if (tVar2 == ((t) a0Var3.f1717b) && ((String) V.f1718c).equals((String) a0Var3.f1718c)) {
                                        q2Var2.f1435r = true;
                                        q2Var2.f1428k = str4;
                                    } else if (!q2Var2.f1435r || n12.f1197b >= 0.8f) {
                                        if (tVar2 != null && tVar2.f1512f != 0) {
                                            x c10 = x.c(V, q2Var2);
                                            if (c10 != null) {
                                                q2Var2.f1435r = true;
                                                q2Var2.f1428k = str4;
                                                StringBuilder m11 = i5.c.m(i29, "live captions ", ": replaying ");
                                                m11.append(byteArrayOutputStream.size() / 32);
                                                m11.append(" ms in ");
                                                m11.append(V);
                                                Log.d("Dictation", m11.toString());
                                                x xVar = q2Var2.d;
                                                long j12 = xVar.f1597c;
                                                if (j12 != 0) {
                                                    DictationAsr.nativeSessionFree(j12);
                                                    xVar.f1597c = 0L;
                                                    DictationAsr.Q((t) xVar.f1598e);
                                                }
                                                q2Var2.d = c10;
                                                q2Var2.h = 0;
                                                q2Var2.f1425g = 0;
                                                int i30 = q2Var2.f1436s;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                x xVar2 = q2Var2.d;
                                                int length = byteArray.length;
                                                long j13 = xVar2.f1597c;
                                                if (j13 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j13, byteArray, 0, length);
                                                    xVar2.b(nativeSessionPush);
                                                }
                                                if (q2Var2.f1436s == i30 && !q2Var2.f1427j.isEmpty()) {
                                                    q2Var2.f1427j = "";
                                                    org.telegram.messenger.g0.g3(new n2((Object) q2Var2, q2Var2.f1424f, (Serializable) "", false, 0));
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        org.telegram.messenger.g0.g3(new a3.f(V, 8));
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
        p4.v vVar = (p4.v) this.f1547c;
        int i7 = this.f1546b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                la.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.m1 m1Var = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var.f55371a, SystemClock.elapsedRealtime(), m1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.m1 m1Var2 = new p4.m1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(m1Var2.f55371a, SystemClock.elapsedRealtime(), m1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.m1 m1Var3 = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var3.f55371a, SystemClock.elapsedRealtime(), m1Var3);
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
        for (Map.Entry entry : ((HashMap) this.f1547c).entrySet()) {
            fj fjVar = (fj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            zy.C(this.f1546b).r0(xy.d(messageMedia2, fj.B0(fjVar.f23993k), fjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f1545a) {
            case 12:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        xi0 xi0Var = (xi0) this.f1547c;
        if (this.f1546b == 5) {
            xi0Var.getClass();
            return false;
        }
        wi0 wi0Var = xi0Var.f42128h0;
        if (wi0Var == null || !(view instanceof vi0)) {
            return false;
        }
        wi0Var.g(xi0Var, ((vi0) view).f40838e, true, false);
        return true;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((ti) this.f1547c).f52334b;
        int i7 = this.f1546b;
        if (i7 == 15 && v3.T(bnVar.f46001e)) {
            TLRPC.Chat chat = bnVar.f46001e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.f46099l6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ks notificationCenter = bnVar.getNotificationCenter();
            int i10 = ks.f25218t;
            notificationCenter.n(bnVar, i10);
            bnVar.getNotificationCenter().k(i10, new Object[0]);
            bnVar.finishFragment();
            bnVar.getNotificationCenter().k(ks.K2, Long.valueOf(bnVar.f46099l6), bnVar.f46015f, bnVar.f46001e, Boolean.valueOf(z10));
            return;
        }
        bnVar.Ta(bnVar.f46187s4, z10);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.f1545a;
        int i11 = this.f1546b;
        Object obj = this.f1547c;
        switch (i10) {
            case 12:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                vg0 vg0Var = (vg0) obj;
                sg0 sg0Var = vg0Var.U1;
                HashSet hashSet = vg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28580id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        vg0Var.f52816e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = gd.G(vg0Var.f52823l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.m2 m2Var = vg0Var.f30176c;
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
                    if (!TextUtils.isEmpty(vg0Var.f52817f2)) {
                        vg0Var.f52817f2 = null;
                        sg0Var.setText("");
                        org.telegram.messenger.g0.r(vg0Var.f52827p2);
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
        int i10 = this.f1545a;
        int i11 = this.f1546b;
        Object obj = this.f1547c;
        switch (i10) {
            case 13:
                ArrayList arrayList = ((LaunchActivity) obj).f43116e0;
                if (!arrayList.isEmpty()) {
                    mp.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 14:
            case 15:
            case 17:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43581e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28572id = profileActivity.getMessagesController().q1(profileActivity.f43581e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                return;
            case 16:
                de0 de0Var = ((ce0) obj).f46539h0;
                if (j10.f24798t0 != i11) {
                    ((LaunchActivity) de0Var.getParentActivity()).O0(i11);
                }
                de0Var.finishFragment();
                return;
            case 18:
                hk0 hk0Var = ((qj0) obj).f51291a;
                hk0Var.D1(hk0Var.Z[i11]);
                return;
            case 19:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public String i(int i7) {
        Calendar calendar = (Calendar) this.f1547c;
        int i10 = this.f1546b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            gd E0 = gd.E0();
            if (E0.f24263r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24263r == null) {
                            Locale locale = E0.f24269y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24263r = gd.k(locale, E0.P0(2131742502, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24263r.format(calendar.getTimeInMillis());
        }
        return gd.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1545a) {
            case 3:
                ((e2.a1) obj).L(((l2.g1) this.f1547c).f19397a, this.f1546b);
                return;
            case 4:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f1546b, (e2.l0) this.f1547c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C((m2.a) this.f1547c, this.f1546b);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        w7 w7Var = (w7) this.f1547c;
        if (this.f1546b == w7Var.f41682b) {
            f8 f8Var = w7Var.f41684e;
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
            if (f8Var.f35111c2.getTag() != null) {
                f8Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public int run() {
        v4.c0 c0Var = ((z90) this.f1547c).f54501c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1546b;
        c0Var.h1(i7, L);
        return i7;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f1545a;
    }

    public u1(Object obj, int i7, int i10) {
        this.f1545a = i10;
        this.f1547c = obj;
        this.f1546b = i7;
    }

    public u1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1545a = 5;
        this.f1547c = aVar;
        this.f1546b = i7;
    }

    public u1(ti tiVar, int i7, boolean z10) {
        this.f1545a = 6;
        this.f1547c = tiVar;
        this.f1546b = i7;
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
