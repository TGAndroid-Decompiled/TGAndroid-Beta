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
public final class nd extends f1 implements us, pa, qa {
    public static volatile nd[] O = new nd[4];
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
    public final a0.h f17082a;
    public final ArrayList f17083b;
    public final a0.h f17084c;
    public final a0.h d;
    public final LocationManager e;
    public final ld f17085f;
    public final ld h;
    public final ld f17086n;
    public final m2.t f17087r;
    public Location f17088s;
    public long f17089w;
    public boolean f17090x;
    public long f17091y;

    public nd(int i10) {
        super(i10);
        this.f17082a = new a0.h();
        this.f17083b = new ArrayList();
        this.f17084c = new a0.h();
        this.d = new a0.h();
        this.f17085f = new ld(this, 0);
        this.h = new ld(this, 0);
        this.f17086n = new ld(this, 0);
        this.f17087r = new m2.t(this, 6);
        this.f17090x = true;
        this.F = new SparseIntArray();
        this.G = new a0.h();
        this.I = new ArrayList();
        this.J = new a0.h();
        this.e = (LocationManager) w0.f19025b.getSystemService("location");
        this.M = ((li.k) w0.j()).onCreateLocationServicesAPI(w0.f19025b, this, this);
        sa onCreateLocationRequest = ((li.k) w0.j()).onCreateLocationRequest();
        this.N = onCreateLocationRequest;
        ca caVar = (ca) onCreateLocationRequest;
        caVar.getClass();
        LocationRequest locationRequest = caVar.f14925a;
        locationRequest.f5401a = 100;
        long j10 = locationRequest.f5403c;
        long j11 = locationRequest.f5402b;
        if (j10 == j11 / 6) {
            locationRequest.f5403c = 166L;
        }
        if (locationRequest.f5406r == j11) {
            locationRequest.f5406r = 1000L;
        }
        locationRequest.f5402b = 1000L;
        locationRequest.f5403c = 1000L;
        i0.g3(new ed(this, 5));
        getMessagesStorage().f15938a.c(new ed(this, 0));
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
        for (int i10 = 0; i10 < codePointCount; i10++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i10) - (-127397)));
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

    public static void d(Location location, int i10, zf.h0 h0Var) {
        Locale locale;
        Locale locale2;
        HashMap hashMap = Q;
        Runnable runnable = (Runnable) hashMap.get(h0Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(h0Var);
        }
        if (location == null) {
            h0Var.L(null, null, null, null, null);
            return;
        }
        try {
            locale = cd.D0().f15003y;
        } catch (Exception unused) {
            locale = cd.D0().f15004z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        r5 r5Var = Utilities.e;
        kk kkVar = new kk(locale3, location, i10, locale2, h0Var, 1);
        r5Var.d(kkVar, 300L);
        Q.put(h0Var, kkVar);
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

    public static nd f(int i10) {
        nd ndVar;
        nd ndVar2 = O[i10];
        if (ndVar2 == null) {
            synchronized (nd.class) {
                try {
                    ndVar = O[i10];
                    if (ndVar == null) {
                        nd[] ndVarArr = O;
                        nd ndVar3 = new nd(i10);
                        ndVarArr[i10] = ndVar3;
                        ndVar = ndVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ndVar;
        }
        return ndVar2;
    }

    public static int g() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 += f(i11).I.size();
        }
        return i10;
    }

    public static void q() {
        try {
            if (!w7.c6.d("android.permission.ACCESS_COARSE_LOCATION") && !w7.c6.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            w0.f19025b.startService(new Intent(w0.f19025b, LocationSharingService.class));
        } catch (Throwable th2) {
            f8.g(th2, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i10 = LocationSharingService.d;
        new e0.k0(w0.f19025b).b(6, "live_location_paused");
        w0.f19025b.stopService(new Intent(w0.f19025b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nd.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        long j10;
        ArrayList arrayList2;
        int i12 = zs.F4;
        a0.h hVar = this.f17084c;
        if (i10 == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l4 = (Long) objArr[0];
                long longValue = l4.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z10 = false;
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        jj jjVar = (jj) arrayList3.get(i13);
                        if (jjVar.C3()) {
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (jj.C1(((TLRPC.Message) arrayList2.get(i14)).from_id) == jjVar.Z0()) {
                                        arrayList2.set(i14, jjVar.f16337k);
                                        break;
                                    }
                                    i14++;
                                } else {
                                    arrayList2.add(jjVar.f16337k);
                                    break;
                                }
                            }
                            z10 = true;
                        } else {
                            TLRPC.Message message = jjVar.f16337k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = jj.B0(message);
                                if (o5.E(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z10) {
                        zs.e().k(i12, l4, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i10 == zs.f19710w) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.I;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        md mdVar = (md) arrayList4.get(i15);
                        jj jjVar2 = mdVar.h;
                        if (jjVar2 != null) {
                            j10 = jj.v0(jjVar2.f16337k);
                        } else {
                            j10 = 0;
                        }
                        if (longValue2 == j10 && arrayList5.contains(Integer.valueOf(mdVar.f16941b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(mdVar.f16940a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                            k(((Long) arrayList6.get(i16)).longValue());
                        }
                    }
                }
            }
        } else if (i10 == zs.m0) {
            Long l10 = (Long) objArr[0];
            long longValue3 = l10.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    jj jjVar3 = (jj) arrayList7.get(i17);
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            break;
                        } else if (jj.C1(((TLRPC.Message) arrayList.get(i18)).from_id) == jjVar3.Z0()) {
                            if (!jjVar3.C3()) {
                                arrayList.remove(i18);
                            } else {
                                arrayList.set(i18, jjVar3.f16337k);
                            }
                            z11 = true;
                        } else {
                            i18++;
                        }
                    }
                }
                if (z11) {
                    zs.e().k(i12, l10, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final md h(long j10) {
        return (md) this.J.f(j10);
    }

    public final boolean i(long j10) {
        if (this.J.h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public final void j(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!o5.C(j10) && (arrayList = (ArrayList) this.f17084c.f(j10)) != null && !arrayList.isEmpty()) {
            a0.h hVar = this.d;
            Integer num = (Integer) hVar.f(j10);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                hVar.k(Integer.valueOf(elapsedRealtime), j10);
                int i10 = 0;
                if (o5.z(j10)) {
                    long j11 = -j10;
                    if (w3.S(this.currentAccount, j11)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i10 < size) {
                            i10 = c3.i0.j(((TLRPC.Message) arrayList.get(i10)).f19814id, i10, 1, tL_messages_readMessageContents.f19832id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().g1(j11);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new fd(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    i10 = c3.i0.j(((TLRPC.Message) arrayList.get(i10)).f19814id, i10, 1, tL_messages_readMessageContents.f19898id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new fd(this, 2));
            }
        }
    }

    public final void k(long j10) {
        Utilities.d.c(new kd(this, j10, 0));
    }

    public final void l(md mdVar, int i10) {
        getMessagesStorage().f15938a.c(new o7(this, i10, mdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.f17088s = location;
            if (location != null) {
                i0.g3(new ag.f3(21));
            }
        }
    }

    public final void n(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.E = true;
        if (!z10 && ((location2 = this.f17088s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.f17090x) {
                this.f17089w = SystemClock.elapsedRealtime() - 10000;
                this.f17090x = false;
            }
        } else {
            this.f17089w = SystemClock.elapsedRealtime() - 30000;
            this.f17090x = false;
        }
        m(location);
    }

    public final void o(int i10, long j10, boolean z10) {
        md mdVar = (md) this.J.f(j10);
        if (mdVar != null) {
            mdVar.f16943f = i10;
        }
        getMessagesStorage().f15938a.c(new dd(this, i10, j10, 0));
        if (z10) {
            Utilities.d.c(new ed(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (!this.D) {
            this.f17091y = SystemClock.elapsedRealtime();
            this.D = true;
            if (this.K == null) {
                ((li.k) w0.j()).getClass();
                this.K = Boolean.valueOf(eu.f15451b.hasServices());
            }
            if (this.K.booleanValue()) {
                try {
                    ((com.google.android.gms.common.api.internal.h0) this.M).f4415a.d();
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
            try {
                this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f17085f);
            } catch (Exception e) {
                f8.g(e, true);
            }
            try {
                this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            try {
                this.e.requestLocationUpdates("passive", 1L, 0.0f, this.f17086n);
            } catch (Exception e10) {
                f8.g(e10, true);
            }
            if (this.f17088s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.f17088s == null) {
                        m(locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
        }
    }

    public final void r(boolean z10) {
        this.D = false;
        if (this.K == null) {
            ((li.k) w0.j()).getClass();
            this.K = Boolean.valueOf(eu.f15451b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((li.k) w0.j()).removeLocationUpdates(this.f17087r);
                ((com.google.android.gms.common.api.internal.h0) this.M).f4415a.e();
            } catch (Throwable th2) {
                f8.g(th2, false);
            }
        }
        ld ldVar = this.f17085f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(ldVar);
        if (z10) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.f17086n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.f17083b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            boolean z11 = false;
            while (i10 < arrayList.size()) {
                md mdVar = (md) arrayList.get(i10);
                if (mdVar.f16942c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i10);
                    this.f17082a.l(mdVar.f16940a);
                    l(mdVar, 1);
                    i0.g3(new gd(this, mdVar, 2));
                    i10--;
                    z11 = true;
                }
                i10++;
            }
            if (z11 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (this.D) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.E || Math.abs(this.f17091y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.H && Math.abs(this.f17089w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.f17088s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.f17091y)) {
                this.E = false;
                this.f17090x = true;
                if (SystemClock.elapsedRealtime() - this.f17089w > 2000) {
                    z10 = true;
                }
                this.f17091y = elapsedRealtime;
                this.f17089w = SystemClock.elapsedRealtime();
                a(z10);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.f17089w - SystemClock.elapsedRealtime()) > 30000) {
            this.f17091y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
