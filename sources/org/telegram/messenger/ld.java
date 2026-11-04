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
public final class ld extends c1 implements cs, ia, ja {
    public static volatile ld[] P = new ld[4];
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
    public final ma N;
    public final la O;
    public final a0.h f23974a;
    public final ArrayList f23975b;
    public final a0.h f23976c;
    public final a0.h d;
    public final LocationManager f23977e;
    public final jd f23978f;
    public final jd h;
    public final jd f23979n;
    public final gi.w5 f23980r;
    public Location f23981s;
    public long f23982w;
    public boolean f23983x;
    public long f23984y;

    public ld(int i3) {
        super(i3);
        this.f23974a = new a0.h();
        this.f23975b = new ArrayList();
        this.f23976c = new a0.h();
        this.d = new a0.h();
        this.f23978f = new jd(this, 0);
        this.h = new jd(this, 0);
        this.f23979n = new jd(this, 0);
        this.f23980r = new gi.w5(this, 25);
        this.f23983x = true;
        this.G = new SparseIntArray();
        this.H = new a0.h();
        this.J = new ArrayList();
        this.K = new a0.h();
        this.f23977e = (LocationManager) t0.f25457b.getSystemService("location");
        this.N = ((k4.j) t0.j()).onCreateLocationServicesAPI(t0.f25457b, this, this);
        la onCreateLocationRequest = ((k4.j) t0.j()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        v9 v9Var = (v9) onCreateLocationRequest;
        v9Var.getClass();
        LocationRequest locationRequest = v9Var.f25842a;
        locationRequest.f7735a = 100;
        long j10 = locationRequest.f7737c;
        long j11 = locationRequest.f7736b;
        if (j10 == j11 / 6) {
            locationRequest.f7737c = 166L;
        }
        if (locationRequest.f7741r == j11) {
            locationRequest.f7741r = 1000L;
        }
        locationRequest.f7736b = 1000L;
        locationRequest.f7737c = 1000L;
        g0.h3(new cd(this, 5));
        getMessagesStorage().f24934a.c(new cd(this, 0));
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
        for (int i3 = 0; i3 < codePointCount; i3++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i3) - (-127397)));
        }
        return sb2.toString();
    }

    public static String c(double d, double d10) {
        if (d10 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d <= -88.0d || d >= 40.0d || d10 <= 0.0d) {
            if (d > -60.0d && d < 20.0d && d10 <= 0.0d) {
                return "Atlantic Ocean";
            }
            if (d10 <= 30.0d && d >= 20.0d && d < 150.0d) {
                return "Indian Ocean";
            }
            if ((d <= 106.0d && d >= -60.0d) || d10 <= 0.0d) {
                if ((d <= 150.0d && d >= -60.0d) || d10 > 0.0d) {
                    return null;
                }
                return "Pacific Ocean";
            }
            return "Pacific Ocean";
        }
        return "Atlantic Ocean";
    }

    public static void d(Location location, int i3, kg.o0 o0Var) {
        Locale locale;
        Locale locale2;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(o0Var);
        if (runnable != null) {
            Utilities.f21387e.a(runnable);
            hashMap.remove(o0Var);
        }
        if (location == null) {
            o0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = bd.E0().f21812y;
        } catch (Exception unused) {
            locale = bd.E0().f21813z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        p5 p5Var = Utilities.f21387e;
        sj sjVar = new sj(locale3, location, i3, locale2, o0Var, 1);
        p5Var.e(sjVar, 300L);
        R.put(o0Var, sjVar);
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

    public static ld f(int i3) {
        ld ldVar;
        ld ldVar2 = P[i3];
        if (ldVar2 == null) {
            synchronized (ld.class) {
                try {
                    ldVar = P[i3];
                    if (ldVar == null) {
                        ld[] ldVarArr = P;
                        ld ldVar3 = new ld(i3);
                        ldVarArr[i3] = ldVar3;
                        ldVar = ldVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ldVar;
        }
        return ldVar2;
    }

    public static int g() {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i3 += f(i10).J.size();
        }
        return i3;
    }

    public static void q() {
        try {
            if (!b8.nf.d("android.permission.ACCESS_COARSE_LOCATION") && !b8.nf.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            t0.f25457b.startService(new Intent(t0.f25457b, LocationSharingService.class));
        } catch (Throwable th2) {
            a8.g(th2, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i3 = LocationSharingService.d;
        new e0.j0(t0.f25457b).b(6, "live_location_paused");
        t0.f25457b.stopService(new Intent(t0.f25457b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ld.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        long j10;
        ArrayList arrayList2;
        int i11 = hs.F4;
        a0.h hVar = this.f23976c;
        if (i3 == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l10 = (Long) objArr[0];
                long longValue = l10.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z10 = false;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        zi ziVar = (zi) arrayList3.get(i12);
                        if (ziVar.D3()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (zi.C1(((TLRPC.Message) arrayList2.get(i13)).from_id) == ziVar.Z0()) {
                                        arrayList2.set(i13, ziVar.f26868k);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    arrayList2.add(ziVar.f26868k);
                                    break;
                                }
                            }
                            z10 = true;
                        } else {
                            TLRPC.Message message = ziVar.f26868k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = zi.B0(message);
                                if (m5.E(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z10) {
                        hs.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i3 == hs.f23325w) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.J;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        kd kdVar = (kd) arrayList4.get(i14);
                        zi ziVar2 = kdVar.h;
                        if (ziVar2 != null) {
                            j10 = zi.v0(ziVar2.f26868k);
                        } else {
                            j10 = 0;
                        }
                        if (longValue2 == j10 && arrayList5.contains(Integer.valueOf(kdVar.f23811b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(kdVar.f23810a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k(((Long) arrayList6.get(i15)).longValue());
                        }
                    }
                }
            }
        } else if (i3 == hs.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    zi ziVar3 = (zi) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        } else if (zi.C1(((TLRPC.Message) arrayList.get(i17)).from_id) == ziVar3.Z0()) {
                            if (!ziVar3.D3()) {
                                arrayList.remove(i17);
                            } else {
                                arrayList.set(i17, ziVar3.f26868k);
                            }
                            z11 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z11) {
                    hs.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final kd h(long j10) {
        return (kd) this.K.f(j10);
    }

    public final boolean i(long j10) {
        if (this.K.h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public final void j(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!m5.C(j10) && (arrayList = (ArrayList) this.f23976c.f(j10)) != null && !arrayList.isEmpty()) {
            a0.h hVar = this.d;
            Integer num = (Integer) hVar.f(j10);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                hVar.k(Integer.valueOf(elapsedRealtime), j10);
                int i3 = 0;
                if (m5.z(j10)) {
                    long j11 = -j10;
                    if (t3.S(this.currentAccount, j11)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i3 < size) {
                            i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i3)).f27022id, i3, 1, tL_messages_readMessageContents.f27040id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().h1(j11);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new dd(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i3 < size2) {
                    i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i3)).f27022id, i3, 1, tL_messages_readMessageContents.f27106id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new dd(this, 2));
            }
        }
    }

    public final void k(long j10) {
        Utilities.d.c(new id(this, j10, 0));
    }

    public final void l(kd kdVar, int i3) {
        getMessagesStorage().f24934a.c(new k7(this, i3, kdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.f23981s = location;
            if (location != null) {
                g0.h3(new hc(4));
            }
        }
    }

    public final void n(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.F = true;
        if (!z10 && ((location2 = this.f23981s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.f23983x) {
                this.f23982w = SystemClock.elapsedRealtime() - 10000;
                this.f23983x = false;
            }
        } else {
            this.f23982w = SystemClock.elapsedRealtime() - 30000;
            this.f23983x = false;
        }
        m(location);
    }

    public final void o(int i3, long j10, boolean z10) {
        kd kdVar = (kd) this.K.f(j10);
        if (kdVar != null) {
            kdVar.f23814f = i3;
        }
        getMessagesStorage().f24934a.c(new ci.i9(this, i3, j10, 2));
        if (z10) {
            Utilities.d.c(new cd(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.f23977e;
        if (!this.E) {
            this.f23984y = SystemClock.elapsedRealtime();
            this.E = true;
            if (this.L == null) {
                ((k4.j) t0.j()).getClass();
                this.L = Boolean.valueOf(lt.f24103b.hasServices());
            }
            if (this.L.booleanValue()) {
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gi.v5) this.N).f13688b).f();
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            try {
                this.f23977e.requestLocationUpdates("gps", 1L, 0.0f, this.f23978f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                this.f23977e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                this.f23977e.requestLocationUpdates("passive", 1L, 0.0f, this.f23979n);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            if (this.f23981s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.f23981s == null) {
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
            ((k4.j) t0.j()).getClass();
            this.L = Boolean.valueOf(lt.f24103b.hasServices());
        }
        if (this.L.booleanValue()) {
            try {
                ((k4.j) t0.j()).removeLocationUpdates(this.f23980r);
                ((com.google.android.gms.common.api.internal.d0) ((gi.v5) this.N).f13688b).g();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        jd jdVar = this.f23978f;
        LocationManager locationManager = this.f23977e;
        locationManager.removeUpdates(jdVar);
        if (z10) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.f23979n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.f23975b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            boolean z11 = false;
            while (i3 < arrayList.size()) {
                kd kdVar = (kd) arrayList.get(i3);
                if (kdVar.f23812c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i3);
                    this.f23974a.l(kdVar.f23810a);
                    l(kdVar, 1);
                    g0.h3(new ed(this, kdVar, 2));
                    i3--;
                    z11 = true;
                }
                i3++;
            }
            if (z11 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (this.E) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.F || Math.abs(this.f23984y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.I && Math.abs(this.f23982w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.f23981s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.f23984y)) {
                this.F = false;
                this.f23983x = true;
                if (SystemClock.elapsedRealtime() - this.f23982w > 2000) {
                    z10 = true;
                }
                this.f23984y = elapsedRealtime;
                this.f23982w = SystemClock.elapsedRealtime();
                a(z10);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.f23982w - SystemClock.elapsedRealtime()) > 30000) {
            this.f23984y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
