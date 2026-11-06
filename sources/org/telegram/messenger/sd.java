package org.telegram.messenger;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class sd extends c1 implements ls, pa, qa {
    public static volatile sd[] O = new sd[4];
    public static final String[] P = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap Q = new HashMap();
    public boolean D;
    public boolean E;
    public final SparseIntArray F;
    public final a0.h G;
    public long H;
    public final ArrayList I;
    public final a0.h J;
    public Boolean K;
    public boolean L;
    public final ta M;
    public final sa N;
    public final a0.h f25441a;
    public final ArrayList f25442b;
    public final a0.h f25443c;
    public final a0.h d;
    public final LocationManager f25444e;
    public final qd f25445f;
    public final qd h;
    public final qd f25446n;
    public final g6.d0 f25447r;
    public Location f25448s;
    public long f25449w;
    public boolean f25450x;
    public long f25451y;

    public sd(int i7) {
        super(i7);
        this.f25441a = new a0.h();
        this.f25442b = new ArrayList();
        this.f25443c = new a0.h();
        this.d = new a0.h();
        this.f25445f = new qd(this, 0);
        this.h = new qd(this, 0);
        this.f25446n = new qd(this, 0);
        this.f25447r = new g6.d0(this, 26);
        this.f25450x = true;
        this.F = new SparseIntArray();
        this.G = new a0.h();
        this.I = new ArrayList();
        this.J = new a0.h();
        this.f25444e = (LocationManager) t0.f25555b.getSystemService("location");
        this.M = ((h6.m) t0.j()).onCreateLocationServicesAPI(t0.f25555b, this, this);
        sa onCreateLocationRequest = ((h6.m) t0.j()).onCreateLocationRequest();
        this.N = onCreateLocationRequest;
        ba baVar = (ba) onCreateLocationRequest;
        baVar.getClass();
        LocationRequest locationRequest = baVar.f21605a;
        locationRequest.f7680a = 100;
        long j3 = locationRequest.f7682c;
        long j10 = locationRequest.f7681b;
        if (j3 == j10 / 6) {
            locationRequest.f7682c = 166L;
        }
        if (locationRequest.f7686r == j10) {
            locationRequest.f7686r = 1000L;
        }
        locationRequest.f7681b = 1000L;
        locationRequest.f7682c = 1000L;
        g0.h3(new id(this, 5));
        getMessagesStorage().f26688a.c(new id(this, 0));
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
        HashMap hashMap = Q;
        Runnable runnable = (Runnable) hashMap.get(r0Var);
        if (runnable != null) {
            Utilities.f21333e.a(runnable);
            hashMap.remove(r0Var);
        }
        if (location == null) {
            r0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = hd.E0().f22899y;
        } catch (Exception unused) {
            locale = hd.E0().f22900z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        p5 p5Var = Utilities.f21333e;
        ck ckVar = new ck(locale3, location, i7, locale2, r0Var, 1);
        p5Var.d(ckVar, 300L);
        Q.put(r0Var, ckVar);
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

    public static sd f(int i7) {
        sd sdVar;
        sd sdVar2 = O[i7];
        if (sdVar2 == null) {
            synchronized (sd.class) {
                try {
                    sdVar = O[i7];
                    if (sdVar == null) {
                        sd[] sdVarArr = O;
                        sd sdVar3 = new sd(i7);
                        sdVarArr[i7] = sdVar3;
                        sdVar = sdVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return sdVar;
        }
        return sdVar2;
    }

    public static int g() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i7 += f(i10).I.size();
        }
        return i7;
    }

    public static void q() {
        try {
            if (!c8.ia.d("android.permission.ACCESS_COARSE_LOCATION") && !c8.ia.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            t0.f25555b.startService(new Intent(t0.f25555b, LocationSharingService.class));
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
        new e0.i0(t0.f25555b).b(6, "live_location_paused");
        t0.f25555b.stopService(new Intent(t0.f25555b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sd.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        long j3;
        ArrayList arrayList2;
        int i11 = qs.F4;
        a0.h hVar = this.f25443c;
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l10 = (Long) objArr[0];
                long longValue = l10.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z9 = false;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        ij ijVar = (ij) arrayList3.get(i12);
                        if (ijVar.D3()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (ij.C1(((TLRPC.Message) arrayList2.get(i13)).from_id) == ijVar.Z0()) {
                                        arrayList2.set(i13, ijVar.f23237k);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    arrayList2.add(ijVar.f23237k);
                                    break;
                                }
                            }
                            z9 = true;
                        } else {
                            TLRPC.Message message = ijVar.f23237k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = ij.B0(message);
                                if (m5.E(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z9) {
                        qs.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i7 == qs.f25079w) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.I;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        rd rdVar = (rd) arrayList4.get(i14);
                        ij ijVar2 = rdVar.h;
                        if (ijVar2 != null) {
                            j3 = ij.v0(ijVar2.f23237k);
                        } else {
                            j3 = 0;
                        }
                        if (longValue2 == j3 && arrayList5.contains(Integer.valueOf(rdVar.f25266b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(rdVar.f25265a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k(((Long) arrayList6.get(i15)).longValue());
                        }
                    }
                }
            }
        } else if (i7 == qs.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ij ijVar3 = (ij) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        } else if (ij.C1(((TLRPC.Message) arrayList.get(i17)).from_id) == ijVar3.Z0()) {
                            if (!ijVar3.D3()) {
                                arrayList.remove(i17);
                            } else {
                                arrayList.set(i17, ijVar3.f23237k);
                            }
                            z10 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z10) {
                    qs.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final rd h(long j3) {
        return (rd) this.J.f(j3);
    }

    public final boolean i(long j3) {
        if (this.J.h(j3) >= 0) {
            return true;
        }
        return false;
    }

    public final void j(long j3) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!m5.C(j3) && (arrayList = (ArrayList) this.f25443c.f(j3)) != null && !arrayList.isEmpty()) {
            a0.h hVar = this.d;
            Integer num = (Integer) hVar.f(j3);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                hVar.k(Integer.valueOf(elapsedRealtime), j3);
                int i7 = 0;
                if (m5.z(j3)) {
                    long j10 = -j3;
                    if (t3.S(this.currentAccount, j10)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i7 < size) {
                            i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i7)).f26973id, i7, 1, tL_messages_readMessageContents.f26991id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().h1(j10);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new jd(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i7 < size2) {
                    i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i7)).f26973id, i7, 1, tL_messages_readMessageContents.f27057id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new jd(this, 2));
            }
        }
    }

    public final void k(long j3) {
        Utilities.d.c(new od(this, j3, 0));
    }

    public final void l(rd rdVar, int i7) {
        getMessagesStorage().f26688a.c(new k7(this, i7, rdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.f25448s = location;
            if (location != null) {
                g0.h3(new pd(0));
            }
        }
    }

    public final void n(Location location, boolean z9) {
        Location location2;
        if (location == null) {
            return;
        }
        this.E = true;
        if (!z9 && ((location2 = this.f25448s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.f25450x) {
                this.f25449w = SystemClock.elapsedRealtime() - 10000;
                this.f25450x = false;
            }
        } else {
            this.f25449w = SystemClock.elapsedRealtime() - 30000;
            this.f25450x = false;
        }
        m(location);
    }

    public final void o(int i7, long j3, boolean z9) {
        rd rdVar = (rd) this.J.f(j3);
        if (rdVar != null) {
            rdVar.f25269f = i7;
        }
        getMessagesStorage().f26688a.c(new bi.ia(this, i7, j3, 2));
        if (z9) {
            Utilities.d.c(new id(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.f25444e;
        if (!this.D) {
            this.f25451y = SystemClock.elapsedRealtime();
            this.D = true;
            if (this.K == null) {
                ((h6.m) t0.j()).getClass();
                this.K = Boolean.valueOf(tt.f25652b.hasServices());
            }
            if (this.K.booleanValue()) {
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gf.g) this.M).f13889b).e();
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            try {
                this.f25444e.requestLocationUpdates("gps", 1L, 0.0f, this.f25445f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                this.f25444e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                this.f25444e.requestLocationUpdates("passive", 1L, 0.0f, this.f25446n);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            if (this.f25448s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.f25448s == null) {
                        m(locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
        }
    }

    public final void r(boolean z9) {
        this.D = false;
        if (this.K == null) {
            ((h6.m) t0.j()).getClass();
            this.K = Boolean.valueOf(tt.f25652b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((h6.m) t0.j()).removeLocationUpdates(this.f25447r);
                ((com.google.android.gms.common.api.internal.d0) ((gf.g) this.M).f13889b).f();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        qd qdVar = this.f25445f;
        LocationManager locationManager = this.f25444e;
        locationManager.removeUpdates(qdVar);
        if (z9) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.f25446n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.f25442b;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            boolean z10 = false;
            while (i7 < arrayList.size()) {
                rd rdVar = (rd) arrayList.get(i7);
                if (rdVar.f25267c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i7);
                    this.f25441a.l(rdVar.f25265a);
                    l(rdVar, 1);
                    g0.h3(new kd(this, rdVar, 2));
                    i7--;
                    z10 = true;
                }
                i7++;
            }
            if (z10 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (this.D) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.E || Math.abs(this.f25451y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.H && Math.abs(this.f25449w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.f25448s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.f25451y)) {
                this.E = false;
                this.f25450x = true;
                if (SystemClock.elapsedRealtime() - this.f25449w > 2000) {
                    z9 = true;
                }
                this.f25451y = elapsedRealtime;
                this.f25449w = SystemClock.elapsedRealtime();
                a(z9);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.f25449w - SystemClock.elapsedRealtime()) > 30000) {
            this.f25451y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
