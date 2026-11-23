package org.telegram.messenger;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class rd extends c1 implements gs, oa, pa {
    public static volatile rd[] P = new rd[4];
    public static final String[] Q = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap R = new HashMap();
    public boolean E;
    public boolean F;
    public final SparseIntArray G;
    public final a0.h H;
    public long I;
    public final ArrayList J;
    public final a0.h K;
    public Boolean L;
    public boolean M;
    public final sa N;
    public final ra O;
    public final a0.h f26590a;
    public final ArrayList f26591b;
    public final a0.h f26592c;
    public final a0.h d;
    public final LocationManager f26593e;
    public final pd f26594f;
    public final pd h;
    public final pd f26595n;
    public final hi.t5 f26596r;
    public Location f26597s;
    public long f26598w;
    public boolean f26599x;
    public long f26600y;

    public rd(int i7) {
        super(i7);
        this.f26590a = new a0.h();
        this.f26591b = new ArrayList();
        this.f26592c = new a0.h();
        this.d = new a0.h();
        this.f26594f = new pd(this, 0);
        this.h = new pd(this, 0);
        this.f26595n = new pd(this, 0);
        this.f26596r = new hi.t5(this, 27);
        this.f26599x = true;
        this.G = new SparseIntArray();
        this.H = new a0.h();
        this.J = new ArrayList();
        this.K = new a0.h();
        this.f26593e = (LocationManager) t0.f26931b.getSystemService("location");
        this.N = ((h6.m) t0.j()).onCreateLocationServicesAPI(t0.f26931b, this, this);
        ra onCreateLocationRequest = ((h6.m) t0.j()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        aa aaVar = (aa) onCreateLocationRequest;
        aaVar.c();
        aaVar.b();
        aaVar.a();
        g0.g3(new id(this, 5));
        getMessagesStorage().f27250a.c(new id(this, 0));
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int codePointCount = upperCase.codePointCount(0, upperCase.length());
        if (codePointCount > 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < codePointCount; i7++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i7) - (-127397)));
        }
        return sb2.toString();
    }

    public static String c(double d, double d2) {
        if (d2 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d <= -88.0d || d >= 40.0d || d2 <= 0.0d) {
            if (d > -60.0d && d < 20.0d && d2 <= 0.0d) {
                return "Atlantic Ocean";
            }
            if (d2 <= 30.0d && d >= 20.0d && d < 150.0d) {
                return "Indian Ocean";
            }
            if ((d <= 106.0d && d >= -60.0d) || d2 <= 0.0d) {
                if ((d <= 150.0d && d >= -60.0d) || d2 > 0.0d) {
                    return null;
                }
                return "Pacific Ocean";
            }
            return "Pacific Ocean";
        }
        return "Atlantic Ocean";
    }

    public static void d(Location location, int i7, jg.r0 r0Var) {
        Locale locale;
        Locale locale2;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(r0Var);
        if (runnable != null) {
            Utilities.f22810e.a(runnable);
            hashMap.remove(r0Var);
        }
        if (location == null) {
            r0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = hd.E0().f24472y;
        } catch (Exception unused) {
            locale = hd.E0().f24473z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        q5 q5Var = Utilities.f22810e;
        zj zjVar = new zj(locale3, location, i7, locale2, r0Var, 1);
        q5Var.d(zjVar, 300L);
        R.put(r0Var, zjVar);
    }

    public static int e(Location location) {
        float bearing = location.getBearing();
        if (bearing > 0.0f && bearing < 1.0f) {
            if (bearing < 0.5f) {
                return 360;
            }
            return 1;
        }
        return (int) bearing;
    }

    public static rd f(int i7) {
        rd rdVar;
        rd rdVar2 = P[i7];
        if (rdVar2 == null) {
            synchronized (rd.class) {
                try {
                    rdVar = P[i7];
                    if (rdVar == null) {
                        rd[] rdVarArr = P;
                        rd rdVar3 = new rd(i7);
                        rdVarArr[i7] = rdVar3;
                        rdVar = rdVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return rdVar;
        }
        return rdVar2;
    }

    public static int g() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i7 += f(i10).J.size();
        }
        return i7;
    }

    public static void q() {
        try {
            if (!c8.na.d("android.permission.ACCESS_COARSE_LOCATION") && !c8.na.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            t0.f26931b.startService(new Intent(t0.f26931b, LocationSharingService.class));
        } catch (Throwable th2) {
            a8.g(th2, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i7 = LocationSharingService.d;
        new e0.i0(t0.f26931b).b(6, "live_location_paused");
        t0.f26931b.stopService(new Intent(t0.f26931b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rd.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        long j3;
        ArrayList arrayList2;
        int i11 = ls.I4;
        a0.h hVar = this.f26592c;
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l10 = (Long) objArr[0];
                long longValue = l10.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z10 = false;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        gj gjVar = (gj) arrayList3.get(i12);
                        if (gjVar.C3()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (gj.B1(((TLRPC.Message) arrayList2.get(i13)).from_id) == gjVar.Z0()) {
                                        arrayList2.set(i13, gjVar.f24213k);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    arrayList2.add(gjVar.f24213k);
                                    break;
                                }
                            }
                            z10 = true;
                        } else {
                            TLRPC.Message message = gjVar.f24213k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = gj.B0(message);
                                if (n5.E(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z10) {
                        ls.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i7 == ls.f25404w) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.J;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        qd qdVar = (qd) arrayList4.get(i14);
                        gj gjVar2 = qdVar.h;
                        if (gjVar2 != null) {
                            j3 = gj.v0(gjVar2.f24213k);
                        } else {
                            j3 = 0;
                        }
                        if (longValue2 == j3 && arrayList5.contains(Integer.valueOf(qdVar.f26435b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(qdVar.f26434a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k(((Long) arrayList6.get(i15)).longValue());
                        }
                    }
                }
            }
        } else if (i7 == ls.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    gj gjVar3 = (gj) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        } else if (gj.B1(((TLRPC.Message) arrayList.get(i17)).from_id) == gjVar3.Z0()) {
                            if (!gjVar3.C3()) {
                                arrayList.remove(i17);
                            } else {
                                arrayList.set(i17, gjVar3.f24213k);
                            }
                            z11 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z11) {
                    ls.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final qd h(long j3) {
        return (qd) this.K.f(j3);
    }

    public final boolean i(long j3) {
        if (this.K.h(j3) >= 0) {
            return true;
        }
        return false;
    }

    public final void j(long j3) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!n5.C(j3) && (arrayList = (ArrayList) this.f26592c.f(j3)) != null && !arrayList.isEmpty()) {
            a0.h hVar = this.d;
            Integer num = (Integer) hVar.f(j3);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                hVar.k(Integer.valueOf(elapsedRealtime), j3);
                int i7 = 0;
                if (n5.z(j3)) {
                    long j10 = -j3;
                    if (v3.S(this.currentAccount, j10)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i7 < size) {
                            i7 = com.google.android.gms.internal.vision.e2.f(((TLRPC.Message) arrayList.get(i7)).f28455id, i7, 1, tL_messages_readMessageContents.f28473id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().j1(j10);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new jd(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i7 < size2) {
                    i7 = com.google.android.gms.internal.vision.e2.f(((TLRPC.Message) arrayList.get(i7)).f28455id, i7, 1, tL_messages_readMessageContents.f28539id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new jd(this, 2));
            }
        }
    }

    public final void k(long j3) {
        Utilities.d.c(new od(this, j3, 0));
    }

    public final void l(qd qdVar, int i7) {
        getMessagesStorage().f27250a.c(new l7(this, i7, qdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.f26597s = location;
            if (location != null) {
                g0.g3(new j2(8));
            }
        }
    }

    public final void n(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.F = true;
        if (!z10 && ((location2 = this.f26597s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.f26599x) {
                this.f26598w = SystemClock.elapsedRealtime() - 10000;
                this.f26599x = false;
            }
        } else {
            this.f26598w = SystemClock.elapsedRealtime() - 30000;
            this.f26599x = false;
        }
        m(location);
    }

    public final void o(int i7, long j3, boolean z10) {
        qd qdVar = (qd) this.K.f(j3);
        if (qdVar != null) {
            qdVar.f26438f = i7;
        }
        getMessagesStorage().f27250a.c(new di.c9(this, i7, j3, 2));
        if (z10) {
            Utilities.d.c(new id(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.f26593e;
        if (!this.E) {
            this.f26600y = SystemClock.elapsedRealtime();
            this.E = true;
            if (this.L == null) {
                ((h6.m) t0.j()).getClass();
                this.L = Boolean.valueOf(ot.f26165b.hasServices());
            }
            if (this.L.booleanValue()) {
                try {
                    ((com.google.android.gms.common.api.internal.d0) this.N).f6282a.d();
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            try {
                this.f26593e.requestLocationUpdates("gps", 1L, 0.0f, this.f26594f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                this.f26593e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                this.f26593e.requestLocationUpdates("passive", 1L, 0.0f, this.f26595n);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            if (this.f26597s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.f26597s == null) {
                        m(locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
        }
    }

    public final void r(boolean z10) {
        this.E = false;
        if (this.L == null) {
            ((h6.m) t0.j()).getClass();
            this.L = Boolean.valueOf(ot.f26165b.hasServices());
        }
        if (this.L.booleanValue()) {
            try {
                ((h6.m) t0.j()).removeLocationUpdates(this.f26596r);
                ((com.google.android.gms.common.api.internal.d0) this.N).f6282a.e();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        pd pdVar = this.f26594f;
        LocationManager locationManager = this.f26593e;
        locationManager.removeUpdates(pdVar);
        if (z10) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.f26595n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.f26591b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            boolean z11 = false;
            while (i7 < arrayList.size()) {
                qd qdVar = (qd) arrayList.get(i7);
                if (qdVar.f26436c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i7);
                    this.f26590a.l(qdVar.f26434a);
                    l(qdVar, 1);
                    g0.g3(new kd(this, qdVar, 2));
                    i7--;
                    z11 = true;
                }
                i7++;
            }
            if (z11 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (this.E) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.F || Math.abs(this.f26600y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.I && Math.abs(this.f26598w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.f26597s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.f26600y)) {
                this.F = false;
                this.f26599x = true;
                if (SystemClock.elapsedRealtime() - this.f26598w > 2000) {
                    z10 = true;
                }
                this.f26600y = elapsedRealtime;
                this.f26598w = SystemClock.elapsedRealtime();
                a(z10);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.f26598w - SystemClock.elapsedRealtime()) > 30000) {
            this.f26600y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
