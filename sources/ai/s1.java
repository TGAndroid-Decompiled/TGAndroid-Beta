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
import bi.i4;
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
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.z4;
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
import org.telegram.ui.ma0;
import org.telegram.ui.og0;
import org.telegram.ui.rg0;
import org.telegram.ui.ti;
import org.telegram.ui.ug0;
import org.telegram.ui.y90;
public final class s1 implements c1, h2.o, lr, ob0, jc, z4, qj0, pj0, org.telegram.ui.ActionBar.r1, ma0, lj0, h2.j {
    public final int f1516a;
    public final int f1517b;
    public final Object f1518c;

    public s1(int i7, Object obj, int i10) {
        this.f1516a = i10;
        this.f1517b = i7;
        this.f1518c = obj;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f1516a) {
            case 9:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1517b, (oo) this.f1518c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.f1517b, (i4) this.f1518c, 13), 16L);
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
        switch (this.f1516a) {
            case 0:
                c2 c2Var = (c2) this.f1518c;
                int i11 = this.f1517b;
                if (!c2Var.f1153j && i11 == c2Var.C) {
                    float min = Math.min(0.6f, DictationLid.i(i7));
                    d1 n10 = DictationLid.n(min, fArr);
                    if (n10 == null || ((!n10.f1177c && (!"other".equals(n10.f1175a) || n10.f1176b < min)) || (!"other".equals(n10.f1175a) && DictationAsr.R(n10.f1175a, c2Var.f1167y, false) != null))) {
                        z10 = false;
                    } else {
                        Log.d("Dictation", "tinyasr stop: tinylid " + i7 + " ms speech in " + j3 + " ms: " + n10 + " → Google?");
                        c2Var.L = true;
                        if (c2Var.h(n10.f1175a)) {
                            z zVar = c2Var.f1164u;
                            if (zVar != null) {
                                j10 = zVar.c() / 32;
                            } else {
                                j10 = 0;
                            }
                            c2Var.f1146f.postDelayed(new o1(c2Var, 5), j10 + 10000);
                            return;
                        }
                        z10 = false;
                        c2Var.L = false;
                    }
                    if (n10 != null && n10.f1177c) {
                        a0Var = DictationAsr.R(n10.f1175a, c2Var.f1167y, z10);
                        if (a0Var != null) {
                            DictationLid.l(n10.f1175a);
                            c2Var.r(n10.f1175a);
                        }
                    } else if (n10 != null) {
                        a0Var = DictationAsr.Q(DictationLid.d, fArr, c2Var.f1167y, false);
                        if (a0Var != null) {
                            c2Var.r(a0Var.i());
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
                        t tVar = (t) a0Var.f1704b;
                        android.support.v4.media.session.a0 a0Var2 = c2Var.f1167y;
                        if (tVar != ((t) a0Var2.f1704b) || !((String) a0Var.f1705c).equals((String) a0Var2.f1705c)) {
                            c2Var.o(a0Var);
                            return;
                        }
                    }
                    c2Var.g();
                    return;
                }
                return;
            case 1:
                int i12 = this.f1517b;
                c2 c2Var2 = ((x1) this.f1518c).f1611b;
                c2Var2.W = false;
                int i13 = c2Var2.Y;
                if (i12 == i13) {
                    c2Var2.f1140b0 = i7;
                }
                if (fArr != null) {
                    int i14 = c2Var2.f1154k;
                    if (!c2Var2.f1153j && !c2Var2.f1151i && i12 == i13 && c2Var2.f1163t != i14) {
                        String[] strArr = DictationLid.d;
                        int i15 = 0;
                        for (int i16 = 1; i16 < fArr.length; i16++) {
                            if (fArr[i16] > fArr[i15]) {
                                i15 = i16;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList = c2Var2.f1160q;
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
                                if (u0.d(strArr[i21], str3)) {
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
                        p5.c.t(n11, c2Var2.f1161r, "Dictation");
                        if (str2 != null && !"nospeech".equals(strArr[i17]) && !"other".equals(strArr[i17]) && f12 >= 0.3f) {
                            for (int i22 = 0; i22 < strArr.length; i22++) {
                                if (u0.d(strArr[i22], str2)) {
                                    f11 += fArr[i22];
                                }
                            }
                            if (!u0.d(str2, c2Var2.f1161r) && f10 >= 0.8f && f11 >= 0.6f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && u0.d(str2, c2Var2.f1143d0)) {
                                i10 = c2Var2.f1138a0 + 1;
                            } else if (z11) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            c2Var2.f1138a0 = i10;
                            if (z11) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            c2Var2.f1143d0 = str;
                            if (i10 >= 2) {
                                int i23 = c2Var2.f1140b0;
                                if (i23 < 5000) {
                                    c2Var2.f1162s++;
                                    if (c2Var2.J != null) {
                                        Log.d("Dictation", "live transcript: no switch to " + str2 + " (tinylid)");
                                        return;
                                    }
                                    c2Var2.v(str2, "tinylid");
                                    c2Var2.r(str2);
                                    int i24 = c2Var2.f1165w;
                                    c2Var2.f1166x = i24;
                                    c2Var2.X = i24;
                                    c2Var2.Y++;
                                    c2Var2.f1140b0 = 0;
                                    c2Var2.f1142c0 = false;
                                    c2Var2.f1138a0 = 0;
                                    c2Var2.f1143d0 = null;
                                    c2Var2.f1163t = i14;
                                    i2 i2Var = c2Var2.f1148g;
                                    if (i2Var.h(i14)) {
                                        StringBuilder m10 = i5.c.m(i14, "session ", " discarded: ");
                                        m10.append(i2.c(i2.i(i2Var.f1240b, i2Var.f1241c)));
                                        i2Var.j(m10.toString());
                                        i2Var.f1240b = "";
                                        i2Var.f1241c = "";
                                        i2Var.d = false;
                                        i2Var.f1243f = false;
                                    }
                                    c2Var2.d();
                                    c2Var2.f1146f.post(new m1(c2Var2, i14, 1));
                                    return;
                                } else if (!c2Var2.f1142c0) {
                                    c2Var2.f1142c0 = true;
                                    p5.c.t(i5.c.m(i23, "language locked: ", " ms of speech in "), c2Var2.f1161r, "Dictation");
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
                final o2 o2Var = (o2) this.f1518c;
                final int i25 = this.f1517b;
                o2Var.f1414t.f1421b.add(new Runnable() {
                    @Override
                    public final void run() {
                        android.support.v4.media.session.a0 R;
                        String nativeSessionPush;
                        o2 o2Var2 = o2.this;
                        int i26 = i25;
                        float[] fArr2 = fArr;
                        int i27 = i7;
                        long j11 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = o2Var2.f1407m;
                        o2Var2.f1411q = false;
                        if (i26 == o2Var2.f1408n && o2Var2.d != null && fArr2 != null) {
                            int i28 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f43037j;
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
                            o2Var2.f1409o = i28;
                            if (i28 < 0) {
                                o2Var2.f1406l.reset();
                                byteArrayOutputStream.reset();
                            }
                            d1 n12 = DictationLid.n(DictationLid.i(i27), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) o2Var2.d.d;
                            StringBuilder sb4 = new StringBuilder("live captions ");
                            int i29 = o2Var2.f1397a;
                            i5.c.z(sb4, i29, ": tinylid ", i27, " ms speech in ");
                            sb4.append(j11);
                            sb4.append(" ms: ");
                            sb4.append(n12);
                            sb4.append(" (");
                            sb4.append(a0Var3);
                            sb4.append(")");
                            Log.d("Dictation", sb4.toString());
                            if (n12 != null) {
                                String str4 = n12.f1175a;
                                if (n12.f1177c && (R = DictationAsr.R(str4, a0Var3, false)) != null) {
                                    t tVar2 = (t) R.f1704b;
                                    if (tVar2 == ((t) a0Var3.f1704b) && ((String) R.f1705c).equals((String) a0Var3.f1705c)) {
                                        o2Var2.f1412r = true;
                                        o2Var2.f1405k = str4;
                                    } else if (!o2Var2.f1412r || n12.f1176b >= 0.8f) {
                                        if (tVar2 != null && tVar2.d != 0) {
                                            x c10 = x.c(R, o2Var2);
                                            if (c10 != null) {
                                                o2Var2.f1412r = true;
                                                o2Var2.f1405k = str4;
                                                StringBuilder m11 = i5.c.m(i29, "live captions ", ": replaying ");
                                                m11.append(byteArrayOutputStream.size() / 32);
                                                m11.append(" ms in ");
                                                m11.append(R);
                                                Log.d("Dictation", m11.toString());
                                                x xVar = o2Var2.d;
                                                long j12 = xVar.f1601c;
                                                if (j12 != 0) {
                                                    DictationAsr.nativeSessionFree(j12);
                                                    xVar.f1601c = 0L;
                                                    DictationAsr.M((t) xVar.f1602e);
                                                }
                                                o2Var2.d = c10;
                                                o2Var2.h = 0;
                                                o2Var2.f1402g = 0;
                                                int i30 = o2Var2.f1413s;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                x xVar2 = o2Var2.d;
                                                int length = byteArray.length;
                                                long j13 = xVar2.f1601c;
                                                if (j13 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j13, byteArray, 0, length);
                                                    xVar2.b(nativeSessionPush);
                                                }
                                                if (o2Var2.f1413s == i30 && !o2Var2.f1404j.isEmpty()) {
                                                    o2Var2.f1404j = "";
                                                    org.telegram.messenger.g0.g3(new l2((Object) o2Var2, o2Var2.f1401f, (Serializable) "", false, 0));
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        org.telegram.messenger.g0.g3(new a3.f(R, 8));
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
        p4.v vVar = (p4.v) this.f1518c;
        int i7 = this.f1517b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                la.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.m1 m1Var = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var.f55345a, SystemClock.elapsedRealtime(), m1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.m1 m1Var2 = new p4.m1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(m1Var2.f55345a, SystemClock.elapsedRealtime(), m1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.m1 m1Var3 = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var3.f55345a, SystemClock.elapsedRealtime(), m1Var3);
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
        for (Map.Entry entry : ((HashMap) this.f1518c).entrySet()) {
            fj fjVar = (fj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            zy.C(this.f1517b).r0(xy.d(messageMedia2, fj.B0(fjVar.f23968k), fjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f1516a) {
            case 12:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        vi0 vi0Var = (vi0) this.f1518c;
        if (this.f1517b == 5) {
            vi0Var.getClass();
            return false;
        }
        ui0 ui0Var = vi0Var.f40657h0;
        if (ui0Var == null || !(view instanceof ti0)) {
            return false;
        }
        ui0Var.g(vi0Var, ((ti0) view).f40012e, true, false);
        return true;
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((ti) this.f1518c).f52293b;
        int i7 = this.f1517b;
        if (i7 == 15 && v3.T(bnVar.f45987e)) {
            TLRPC.Chat chat = bnVar.f45987e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.f46085l6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ks notificationCenter = bnVar.getNotificationCenter();
            int i10 = ks.f25192t;
            notificationCenter.n(bnVar, i10);
            bnVar.getNotificationCenter().k(i10, new Object[0]);
            bnVar.finishFragment();
            bnVar.getNotificationCenter().k(ks.K2, Long.valueOf(bnVar.f46085l6), bnVar.f46001f, bnVar.f45987e, Boolean.valueOf(z10));
            return;
        }
        bnVar.Ta(bnVar.f46173s4, z10);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.f1516a;
        int i11 = this.f1517b;
        Object obj = this.f1518c;
        switch (i10) {
            case 12:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                return;
            default:
                ug0 ug0Var = (ug0) obj;
                rg0 rg0Var = ug0Var.U1;
                HashSet hashSet = ug0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28554id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        ug0Var.f52555e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = gd.G(ug0Var.f52562l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.n2 n2Var = ug0Var.f30195c;
                        new lc(n2Var, ug0Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            n2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    rg0Var.b(true, hashSet, new og0(ug0Var, 2), null);
                    ug0Var.h1(true, false);
                    if (!TextUtils.isEmpty(ug0Var.f52556f2)) {
                        ug0Var.f52556f2 = null;
                        rg0Var.setText("");
                        org.telegram.messenger.g0.r(ug0Var.f52566p2);
                        ug0Var.g1(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f1516a;
        int i11 = this.f1517b;
        Object obj = this.f1518c;
        switch (i10) {
            case 13:
                ArrayList arrayList = ((LaunchActivity) obj).f43075e0;
                if (!arrayList.isEmpty()) {
                    mp.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 14:
            case 15:
            case 17:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.f43540e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28546id = profileActivity.getMessagesController().q1(profileActivity.f43540e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                return;
            case 16:
                de0 de0Var = ((ce0) obj).f46512h0;
                if (j10.f24773t0 != i11) {
                    ((LaunchActivity) de0Var.getParentActivity()).O0(i11);
                }
                de0Var.finishFragment();
                return;
            case 18:
                hk0 hk0Var = ((org.telegram.ui.qj0) obj).f51277a;
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
        Calendar calendar = (Calendar) this.f1518c;
        int i10 = this.f1517b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            gd E0 = gd.E0();
            if (E0.f24238r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24238r == null) {
                            Locale locale = E0.f24244y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24238r = gd.k(locale, E0.O0(2131742508, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24238r.format(calendar.getTimeInMillis());
        }
        return gd.E0().v0().format(calendar.getTimeInMillis());
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1516a) {
            case 3:
                ((e2.a1) obj).L(((l2.g1) this.f1518c).f19372a, this.f1517b);
                return;
            case 4:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.f1517b, (e2.l0) this.f1518c);
                return;
            default:
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C((m2.a) this.f1518c, this.f1517b);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        w7 w7Var = (w7) this.f1518c;
        if (this.f1517b == w7Var.f41574b) {
            g8 g8Var = w7Var.f41576e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            x7 x7Var = g8Var.D1;
            ValueAnimator valueAnimator = g8Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g8Var.N2 = null;
            }
            if (x7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), i7);
                g8Var.N2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    g8Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                g8Var.N2.setInterpolator(new DecelerateInterpolator());
                g8Var.N2.addUpdateListener(new org.telegram.ui.Components.w(g8Var, 3));
                g8Var.N2.start();
            }
            if (g8Var.f35388c2.getTag() != null) {
                g8Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public int run() {
        v4.c0 c0Var = ((y90) this.f1518c).f54102c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1517b;
        c0Var.h1(i7, L);
        return i7;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f1516a;
    }

    public s1(Object obj, int i7, int i10) {
        this.f1516a = i10;
        this.f1518c = obj;
        this.f1517b = i7;
    }

    public s1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1516a = 5;
        this.f1518c = aVar;
        this.f1517b = i7;
    }

    public s1(ti tiVar, int i7, boolean z10) {
        this.f1516a = 6;
        this.f1518c = tiVar;
        this.f1517b = i7;
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
