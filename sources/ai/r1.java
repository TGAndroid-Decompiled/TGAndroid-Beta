package ai;

import a8.ja;
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
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.kc;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.yn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.be0;
import org.telegram.ui.ce0;
import org.telegram.ui.ek0;
import org.telegram.ui.kg0;
import org.telegram.ui.ma0;
import org.telegram.ui.ng0;
import org.telegram.ui.nj0;
import org.telegram.ui.qg0;
import org.telegram.ui.si;
import org.telegram.ui.x90;
public final class r1 implements b1, h2.o, nr, eb0, kc, r4, ij0, hj0, org.telegram.ui.ActionBar.q1, ma0, dj0, h2.j, jj0 {
    public final int f1516a;
    public final int f1517b;
    public final Object f1518c;

    public r1(int i7, Object obj, int i10) {
        this.f1516a = i10;
        this.f1517b = i7;
        this.f1518c = obj;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7;
        p7 p7Var = (p7) this.f1518c;
        if (this.f1517b == p7Var.f38231b) {
            y7 y7Var = p7Var.f38233e;
            Bitmap n10 = imageReceiver.n();
            if ((n10 != null && imageReceiver.J()) || imageReceiver.I()) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            q7 q7Var = y7Var.D1;
            ValueAnimator valueAnimator = y7Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                y7Var.N2 = null;
            }
            if (q7Var.getCustomPaddingRight() != i7) {
                ValueAnimator ofInt = ValueAnimator.ofInt(q7Var.getCustomPaddingRight(), i7);
                y7Var.N2 = ofInt;
                if (i7 == 0) {
                    ofInt.setStartDelay(200L);
                    y7Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                y7Var.N2.setInterpolator(new DecelerateInterpolator());
                y7Var.N2.addUpdateListener(new c6(y7Var, 2));
                y7Var.N2.start();
            }
            if (y7Var.f41896c2.getTag() != null) {
                y7Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f1516a) {
            case 9:
                org.telegram.messenger.g0.i3(new jg.q(i7, this.f1517b, (ho) this.f1518c, 12), 16L);
                return;
            default:
                org.telegram.messenger.g0.i3(new jg.q(i7, this.f1517b, (yn) this.f1518c, 13), 16L);
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
                b2 b2Var = (b2) this.f1518c;
                int i11 = this.f1517b;
                if (!b2Var.f1146j && i11 == b2Var.C) {
                    float min = Math.min(0.6f, DictationLid.i(i7));
                    c1 n10 = DictationLid.n(min, fArr);
                    if (n10 == null || ((!n10.f1171c && (!"other".equals(n10.f1169a) || n10.f1170b < min)) || (!"other".equals(n10.f1169a) && DictationAsr.R(n10.f1169a, b2Var.f1162y, false) != null))) {
                        z10 = false;
                    } else {
                        Log.d("Dictation", "tinyasr stop: tinylid " + i7 + " ms speech in " + j3 + " ms: " + n10 + " → Google?");
                        b2Var.N = true;
                        if (b2Var.h(n10.f1169a)) {
                            y yVar = b2Var.f1159u;
                            if (yVar != null) {
                                j10 = yVar.c() / 32;
                            } else {
                                j10 = 0;
                            }
                            b2Var.f1139f.postDelayed(new n1(b2Var, 5), j10 + 10000);
                            return;
                        }
                        z10 = false;
                        b2Var.N = false;
                    }
                    if (n10 != null && n10.f1171c) {
                        a0Var = DictationAsr.R(n10.f1169a, b2Var.f1162y, z10);
                        if (a0Var != null) {
                            DictationLid.l(n10.f1169a);
                            b2Var.r(n10.f1169a);
                        }
                    } else if (n10 != null) {
                        a0Var = DictationAsr.Q(DictationLid.d, fArr, b2Var.f1162y, false);
                        if (a0Var != null) {
                            b2Var.r(a0Var.i());
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
                        s sVar = (s) a0Var.f1706b;
                        android.support.v4.media.session.a0 a0Var2 = b2Var.f1162y;
                        if (sVar != ((s) a0Var2.f1706b) || !((String) a0Var.f1707c).equals((String) a0Var2.f1707c)) {
                            b2Var.o(a0Var);
                            return;
                        }
                    }
                    b2Var.g();
                    return;
                }
                return;
            case 1:
                int i12 = this.f1517b;
                b2 b2Var2 = ((w1) this.f1518c).f1611b;
                b2Var2.Y = false;
                int i13 = b2Var2.f1131a0;
                if (i12 == i13) {
                    b2Var2.f1136d0 = i7;
                }
                if (fArr != null) {
                    int i14 = b2Var2.f1148k;
                    if (!b2Var2.f1146j && !b2Var2.f1144i && i12 == i13 && b2Var2.f1158t != i14) {
                        String[] strArr = DictationLid.d;
                        int i15 = 0;
                        for (int i16 = 1; i16 < fArr.length; i16++) {
                            if (fArr[i16] > fArr[i15]) {
                                i15 = i16;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList = b2Var2.f1155q;
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
                                if (t0.c(strArr[i21], str3)) {
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
                        r.b.t(n11, b2Var2.f1156r, "Dictation");
                        if (str2 != null && !"nospeech".equals(strArr[i17]) && !"other".equals(strArr[i17]) && f12 >= 0.3f) {
                            for (int i22 = 0; i22 < strArr.length; i22++) {
                                if (t0.c(strArr[i22], str2)) {
                                    f11 += fArr[i22];
                                }
                            }
                            if (!t0.c(str2, b2Var2.f1156r) && f10 >= 0.8f && f11 >= 0.6f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && t0.c(str2, b2Var2.f1140f0)) {
                                i10 = b2Var2.f1135c0 + 1;
                            } else if (z11) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            b2Var2.f1135c0 = i10;
                            if (z11) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            b2Var2.f1140f0 = str;
                            if (i10 >= 2) {
                                int i23 = b2Var2.f1136d0;
                                if (i23 < 5000) {
                                    b2Var2.f1157s++;
                                    if (b2Var2.L != null) {
                                        Log.d("Dictation", "live transcript: no switch to " + str2 + " (tinylid)");
                                        return;
                                    }
                                    b2Var2.v(str2, "tinylid");
                                    b2Var2.r(str2);
                                    int i24 = b2Var2.f1160w;
                                    b2Var2.f1161x = i24;
                                    b2Var2.Z = i24;
                                    b2Var2.f1131a0++;
                                    b2Var2.f1136d0 = 0;
                                    b2Var2.f1138e0 = false;
                                    b2Var2.f1135c0 = 0;
                                    b2Var2.f1140f0 = null;
                                    b2Var2.f1158t = i14;
                                    h2 h2Var = b2Var2.f1141g;
                                    if (h2Var.h(i14)) {
                                        StringBuilder m10 = i5.c.m(i14, "session ", " discarded: ");
                                        m10.append(h2.c(h2.i(h2Var.f1239b, h2Var.f1240c)));
                                        h2Var.j(m10.toString());
                                        h2Var.f1239b = "";
                                        h2Var.f1240c = "";
                                        h2Var.d = false;
                                        h2Var.f1242f = false;
                                    }
                                    b2Var2.d();
                                    b2Var2.f1139f.post(new l1(b2Var2, i14, 1));
                                    return;
                                } else if (!b2Var2.f1138e0) {
                                    b2Var2.f1138e0 = true;
                                    r.b.t(i5.c.m(i23, "language locked: ", " ms of speech in "), b2Var2.f1156r, "Dictation");
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
                final n2 n2Var = (n2) this.f1518c;
                final int i25 = this.f1517b;
                n2Var.f1417t.f1423b.add(new Runnable() {
                    @Override
                    public final void run() {
                        android.support.v4.media.session.a0 R;
                        String nativeSessionPush;
                        n2 n2Var2 = n2.this;
                        int i26 = i25;
                        float[] fArr2 = fArr;
                        int i27 = i7;
                        long j11 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = n2Var2.f1410m;
                        n2Var2.f1414q = false;
                        if (i26 == n2Var2.f1411n && n2Var2.d != null && fArr2 != null) {
                            int i28 = 0;
                            while (true) {
                                int[] iArr = DictationLid.f42592j;
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
                            n2Var2.f1412o = i28;
                            if (i28 < 0) {
                                n2Var2.f1409l.reset();
                                byteArrayOutputStream.reset();
                            }
                            c1 n12 = DictationLid.n(DictationLid.i(i27), fArr2);
                            android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) n2Var2.d.d;
                            StringBuilder sb4 = new StringBuilder("live captions ");
                            int i29 = n2Var2.f1400a;
                            i5.c.y(sb4, i29, ": tinylid ", i27, " ms speech in ");
                            sb4.append(j11);
                            sb4.append(" ms: ");
                            sb4.append(n12);
                            sb4.append(" (");
                            sb4.append(a0Var3);
                            sb4.append(")");
                            Log.d("Dictation", sb4.toString());
                            if (n12 != null) {
                                String str4 = n12.f1169a;
                                if (n12.f1171c && (R = DictationAsr.R(str4, a0Var3, false)) != null) {
                                    s sVar2 = (s) R.f1706b;
                                    if (sVar2 == ((s) a0Var3.f1706b) && ((String) R.f1707c).equals((String) a0Var3.f1707c)) {
                                        n2Var2.f1415r = true;
                                        n2Var2.f1408k = str4;
                                    } else if (!n2Var2.f1415r || n12.f1170b >= 0.8f) {
                                        if (sVar2 != null && sVar2.d != 0) {
                                            w c10 = w.c(R, n2Var2);
                                            if (c10 != null) {
                                                n2Var2.f1415r = true;
                                                n2Var2.f1408k = str4;
                                                StringBuilder m11 = i5.c.m(i29, "live captions ", ": replaying ");
                                                m11.append(byteArrayOutputStream.size() / 32);
                                                m11.append(" ms in ");
                                                m11.append(R);
                                                Log.d("Dictation", m11.toString());
                                                w wVar = n2Var2.d;
                                                long j12 = wVar.f1601c;
                                                if (j12 != 0) {
                                                    DictationAsr.nativeSessionFree(j12);
                                                    wVar.f1601c = 0L;
                                                    DictationAsr.M((s) wVar.f1602e);
                                                }
                                                n2Var2.d = c10;
                                                n2Var2.h = 0;
                                                n2Var2.f1405g = 0;
                                                int i30 = n2Var2.f1416s;
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                w wVar2 = n2Var2.d;
                                                int length = byteArray.length;
                                                long j13 = wVar2.f1601c;
                                                if (j13 != 0) {
                                                    nativeSessionPush = DictationAsr.nativeSessionPush(j13, byteArray, 0, length);
                                                    wVar2.b(nativeSessionPush);
                                                }
                                                if (n2Var2.f1416s == i30 && !n2Var2.f1407j.isEmpty()) {
                                                    n2Var2.f1407j = "";
                                                    org.telegram.messenger.g0.h3(new k2((Object) n2Var2, n2Var2.f1404f, (Serializable) "", false, 0));
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        org.telegram.messenger.g0.h3(new a3.f(R, 7));
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
                ja.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.k1 k1Var = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var.f54758a, SystemClock.elapsedRealtime(), k1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.k1 k1Var2 = new p4.k1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(k1Var2.f54758a, SystemClock.elapsedRealtime(), k1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.k1 k1Var3 = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var3.f54758a, SystemClock.elapsedRealtime(), k1Var3);
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
    public boolean b(int i7, View view) {
        mi0 mi0Var = (mi0) this.f1518c;
        if (this.f1517b == 5) {
            mi0Var.getClass();
            return false;
        }
        li0 li0Var = mi0Var.f37275h0;
        if (li0Var == null || !(view instanceof ki0)) {
            return false;
        }
        li0Var.h(mi0Var, ((ki0) view).f36527e, true, false);
        return true;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f1516a) {
            case 12:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        String str = LaunchActivity.C1;
        for (Map.Entry entry : ((HashMap) this.f1518c).entrySet()) {
            gj gjVar = (gj) entry.getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            ez.C(this.f1517b).r0(cz.d(messageMedia2, gj.B0(gjVar.f23817k), gjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override
    public String e(int i7) {
        Calendar calendar = (Calendar) this.f1518c;
        int i10 = this.f1517b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) == i10) {
            hd E0 = hd.E0();
            if (E0.f24123r == null) {
                synchronized (E0) {
                    try {
                        if (E0.f24123r == null) {
                            Locale locale = E0.f24129y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.f24123r = hd.k(locale, E0.O0(2131742766, "formatterMonthOnly", null), "MMMM");
                        }
                    } finally {
                    }
                }
            }
            return E0.f24123r.format(calendar.getTimeInMillis());
        }
        return hd.E0().v0().format(calendar.getTimeInMillis());
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
                qg0 qg0Var = (qg0) obj;
                ng0 ng0Var = qg0Var.U1;
                HashSet hashSet = qg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.f28200id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        qg0Var.f50610e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == i11 + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        String G = hd.G(qg0Var.f50617l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.k2 k2Var = qg0Var.f29685c;
                        new cc(k2Var, qg0Var.J0).Q(2131623982, 36, G).k(true);
                        try {
                            k2Var.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ng0Var.b(true, hashSet, new kg0(qg0Var, 2), null);
                    qg0Var.g1(true, false);
                    if (TextUtils.isEmpty(qg0Var.f50611f2)) {
                        return;
                    }
                    qg0Var.f50611f2 = null;
                    ng0Var.setText("");
                    org.telegram.messenger.g0.r(qg0Var.f50621p2);
                    qg0Var.f1(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f1516a;
        int i11 = this.f1517b;
        Object obj = this.f1518c;
        switch (i10) {
            case 13:
                ArrayList arrayList = ((LaunchActivity) obj).f42630e0;
                if (!arrayList.isEmpty()) {
                    np.s1(i11).y3("spambot", (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList), 1, null);
                    return;
                }
                return;
            case 14:
            case 15:
            case 17:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.f43094e1);
                if (b22 != null) {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                    profileActivity.getMessagesStorage().j2(b22, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.f28192id = profileActivity.getMessagesController().o1(profileActivity.f43094e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.M5();
                profileActivity.d.s(i11);
                return;
            case 16:
                ce0 ce0Var = ((be0) obj).f45699h0;
                if (m10.f24934t0 != i11) {
                    ((LaunchActivity) ce0Var.getParentActivity()).O0(i11);
                }
                ce0Var.finishFragment();
                return;
            case 18:
                ek0 ek0Var = ((nj0) obj).f49572a;
                ek0Var.D1(ek0Var.Z[i11]);
                return;
            case 19:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1516a) {
            case 3:
                ((e2.a1) obj).L(((l2.g1) this.f1518c).f19005a, this.f1517b);
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
    public void j(boolean z10) {
        an anVar = ((si) this.f1518c).f51228b;
        int i7 = this.f1517b;
        if (i7 == 15 && t3.T(anVar.f45173e)) {
            TLRPC.Chat chat = anVar.f45173e;
            if (!chat.megagroup || t3.t0(chat)) {
                anVar.getMessagesController().X(2, anVar.f45259k6, z10);
                return;
            }
        }
        if (i7 != 15) {
            ns notificationCenter = anVar.getNotificationCenter();
            int i10 = ns.f25572t;
            notificationCenter.n(anVar, i10);
            anVar.getNotificationCenter().k(i10, new Object[0]);
            anVar.finishFragment();
            anVar.getNotificationCenter().k(ns.K2, Long.valueOf(anVar.f45259k6), anVar.f45187f, anVar.f45173e, Boolean.valueOf(z10));
            return;
        }
        anVar.Ta(anVar.f45358s4, z10);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f1516a;
    }

    @Override
    public int run() {
        v4.b0 b0Var = ((x90) this.f1518c).f53127c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.f1517b;
        b0Var.h1(i7, L);
        return i7;
    }

    public r1(Object obj, int i7, int i10) {
        this.f1516a = i10;
        this.f1518c = obj;
        this.f1517b = i7;
    }

    public r1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.f1516a = 5;
        this.f1518c = aVar;
        this.f1517b = i7;
    }

    public r1(si siVar, int i7, boolean z10) {
        this.f1516a = 6;
        this.f1518c = siVar;
        this.f1517b = i7;
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        wg.c1 c1Var = (wg.c1) this.f1518c;
        ah.a aVar = c1Var.Z1;
        HashSet hashSet = c1Var.d2;
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            long j3 = user != null ? user.f28200id : -rVar.getChat().f28051id;
            int i10 = this.f1517b;
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                c1Var.f59152j2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == c1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                c1Var.m1();
                return true;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(er.h).setDuration(320L).withEndAction(!z11 ? new wg.v0(c1Var, 7) : null).start();
                xg.i iVar = c1Var.f59154l2;
                boolean z12 = !z11;
                if (iVar.E != z12) {
                    iVar.E = z12;
                    org.telegram.messenger.g0.d0(iVar.f59937f, new xg.g(z12));
                }
            }
            c1Var.e1();
            c1Var.V1.b(true, hashSet, new wg.v0(c1Var, 8), null);
            c1Var.p1(true, true);
            c1Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    private final void c(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
