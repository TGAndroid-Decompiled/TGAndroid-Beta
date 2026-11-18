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
public final class qd extends c1 implements fs, na, oa {
    public static volatile qd[] P = new qd[4];
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
    public final ra N;
    public final qa O;
    public final a0.h f26381a;
    public final ArrayList f26382b;
    public final a0.h f26383c;
    public final a0.h d;
    public final LocationManager f26384e;
    public final od f26385f;
    public final od h;
    public final od f26386n;
    public final hi.u5 f26387r;
    public Location f26388s;
    public long f26389w;
    public boolean f26390x;
    public long f26391y;

    public qd(int i7) {
        super(i7);
        this.f26381a = new a0.h();
        this.f26382b = new ArrayList();
        this.f26383c = new a0.h();
        this.d = new a0.h();
        this.f26385f = new od(this, 0);
        this.h = new od(this, 0);
        this.f26386n = new od(this, 0);
        this.f26387r = new hi.u5(this, 27);
        this.f26390x = true;
        this.G = new SparseIntArray();
        this.H = new a0.h();
        this.J = new ArrayList();
        this.K = new a0.h();
        this.f26384e = (LocationManager) t0.f26915b.getSystemService("location");
        this.N = ((h6.m) t0.j()).onCreateLocationServicesAPI(t0.f26915b, this, this);
        qa onCreateLocationRequest = ((h6.m) t0.j()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        z9 z9Var = (z9) onCreateLocationRequest;
        z9Var.c();
        z9Var.b();
        z9Var.a();
        g0.g3(new hd(this, 5));
        getMessagesStorage().f27054a.c(new hd(this, 0));
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
            Utilities.f22782e.a(runnable);
            hashMap.remove(r0Var);
        }
        if (location == null) {
            r0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = gd.E0().f24244y;
        } catch (Exception unused) {
            locale = gd.E0().f24245z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        q5 q5Var = Utilities.f22782e;
        yj yjVar = new yj(locale3, location, i7, locale2, r0Var, 1);
        q5Var.d(yjVar, 300L);
        R.put(r0Var, yjVar);
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

    public static qd f(int i7) {
        qd qdVar;
        qd qdVar2 = P[i7];
        if (qdVar2 == null) {
            synchronized (qd.class) {
                try {
                    qdVar = P[i7];
                    if (qdVar == null) {
                        qd[] qdVarArr = P;
                        qd qdVar3 = new qd(i7);
                        qdVarArr[i7] = qdVar3;
                        qdVar = qdVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return qdVar;
        }
        return qdVar2;
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
            t0.f26915b.startService(new Intent(t0.f26915b, LocationSharingService.class));
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
        new e0.i0(t0.f26915b).b(6, "live_location_paused");
        t0.f26915b.stopService(new Intent(t0.f26915b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qd.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        long j3;
        ArrayList arrayList2;
        int i11 = ks.H4;
        a0.h hVar = this.f26383c;
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l10 = (Long) objArr[0];
                long longValue = l10.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z10 = false;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        fj fjVar = (fj) arrayList3.get(i12);
                        if (fjVar.C3()) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (fj.B1(((TLRPC.Message) arrayList2.get(i13)).from_id) == fjVar.Z0()) {
                                        arrayList2.set(i13, fjVar.f23968k);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    arrayList2.add(fjVar.f23968k);
                                    break;
                                }
                            }
                            z10 = true;
                        } else {
                            TLRPC.Message message = fjVar.f23968k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = fj.B0(message);
                                if (n5.E(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z10) {
                        ks.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i7 == ks.f25212w) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.J;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        pd pdVar = (pd) arrayList4.get(i14);
                        fj fjVar2 = pdVar.h;
                        if (fjVar2 != null) {
                            j3 = fj.v0(fjVar2.f23968k);
                        } else {
                            j3 = 0;
                        }
                        if (longValue2 == j3 && arrayList5.contains(Integer.valueOf(pdVar.f26228b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(pdVar.f26227a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k(((Long) arrayList6.get(i15)).longValue());
                        }
                    }
                }
            }
        } else if (i7 == ks.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    fj fjVar3 = (fj) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        } else if (fj.B1(((TLRPC.Message) arrayList.get(i17)).from_id) == fjVar3.Z0()) {
                            if (!fjVar3.C3()) {
                                arrayList.remove(i17);
                            } else {
                                arrayList.set(i17, fjVar3.f23968k);
                            }
                            z11 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z11) {
                    ks.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final pd h(long j3) {
        return (pd) this.K.f(j3);
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
        if (!n5.C(j3) && (arrayList = (ArrayList) this.f26383c.f(j3)) != null && !arrayList.isEmpty()) {
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
                            i7 = com.google.android.gms.internal.vision.e2.f(((TLRPC.Message) arrayList.get(i7)).f28426id, i7, 1, tL_messages_readMessageContents.f28444id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().j1(j10);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new id(this, 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i7 < size2) {
                    i7 = com.google.android.gms.internal.vision.e2.f(((TLRPC.Message) arrayList.get(i7)).f28426id, i7, 1, tL_messages_readMessageContents.f28510id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new id(this, 2));
            }
        }
    }

    public final void k(long j3) {
        Utilities.d.c(new nd(this, j3, 0));
    }

    public final void l(pd pdVar, int i7) {
        getMessagesStorage().f27054a.c(new l7(this, i7, pdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.f26388s = location;
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
        if (!z10 && ((location2 = this.f26388s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.f26390x) {
                this.f26389w = SystemClock.elapsedRealtime() - 10000;
                this.f26390x = false;
            }
        } else {
            this.f26389w = SystemClock.elapsedRealtime() - 30000;
            this.f26390x = false;
        }
        m(location);
    }

    public final void o(int i7, long j3, boolean z10) {
        pd pdVar = (pd) this.K.f(j3);
        if (pdVar != null) {
            pdVar.f26231f = i7;
        }
        getMessagesStorage().f27054a.c(new di.b9(this, i7, j3, 2));
        if (z10) {
            Utilities.d.c(new hd(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.f26384e;
        if (!this.E) {
            this.f26391y = SystemClock.elapsedRealtime();
            this.E = true;
            if (this.L == null) {
                ((h6.m) t0.j()).getClass();
                this.L = Boolean.valueOf(nt.f25968b.hasServices());
            }
            if (this.L.booleanValue()) {
                try {
                    ((com.google.android.gms.common.api.internal.d0) this.N).f6253a.d();
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            try {
                this.f26384e.requestLocationUpdates("gps", 1L, 0.0f, this.f26385f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                this.f26384e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                this.f26384e.requestLocationUpdates("passive", 1L, 0.0f, this.f26386n);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            if (this.f26388s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.f26388s == null) {
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
            this.L = Boolean.valueOf(nt.f25968b.hasServices());
        }
        if (this.L.booleanValue()) {
            try {
                ((h6.m) t0.j()).removeLocationUpdates(this.f26387r);
                ((com.google.android.gms.common.api.internal.d0) this.N).f6253a.e();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        od odVar = this.f26385f;
        LocationManager locationManager = this.f26384e;
        locationManager.removeUpdates(odVar);
        if (z10) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.f26386n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.f26382b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            boolean z11 = false;
            while (i7 < arrayList.size()) {
                pd pdVar = (pd) arrayList.get(i7);
                if (pdVar.f26229c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i7);
                    this.f26381a.l(pdVar.f26227a);
                    l(pdVar, 1);
                    g0.g3(new jd(this, pdVar, 2));
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
            if (this.F || Math.abs(this.f26391y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.I && Math.abs(this.f26389w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.f26388s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.f26391y)) {
                this.F = false;
                this.f26390x = true;
                if (SystemClock.elapsedRealtime() - this.f26389w > 2000) {
                    z10 = true;
                }
                this.f26391y = elapsedRealtime;
                this.f26389w = SystemClock.elapsedRealtime();
                a(z10);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.f26389w - SystemClock.elapsedRealtime()) > 30000) {
            this.f26391y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
