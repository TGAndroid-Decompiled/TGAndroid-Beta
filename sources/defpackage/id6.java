package defpackage;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.TLRPC;
public final class id6 extends rf0 implements fn7, nj5, oj5 {
    public static volatile id6[] P = new id6[4];
    public static final String[] Q = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap R = new HashMap();
    public boolean E;
    public boolean F;
    public final SparseIntArray G;
    public final zh6 H;
    public long I;
    public final ArrayList J;
    public final zh6 K;
    public Boolean L;
    public boolean M;
    public final rj5 N;
    public final qj5 O;
    public final zh6 a;
    public final ArrayList b;
    public final zh6 c;
    public final zh6 d;
    public final LocationManager e;
    public final gd6 f;
    public final gd6 h;
    public final gd6 n;
    public final aj3 r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public id6(int i) {
        super(i);
        this.a = new zh6();
        this.b = new ArrayList();
        this.c = new zh6();
        this.d = new zh6();
        this.f = new gd6(this, (byte) 0);
        this.h = new gd6(this, (byte) 0);
        this.n = new gd6(this, (byte) 0);
        this.r = new aj3(this, (byte) 17);
        this.x = true;
        this.G = new SparseIntArray();
        this.H = new zh6();
        this.J = new ArrayList();
        this.K = new zh6();
        this.e = (LocationManager) a.b.getSystemService("location");
        this.N = ((pm3) a.i()).onCreateLocationServicesAPI(a.b, this, this);
        qj5 onCreateLocationRequest = ((pm3) a.i()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        t05 t05Var = (t05) onCreateLocationRequest;
        t05Var.c();
        t05Var.b();
        t05Var.a();
        hl.c3(new zc6(this, (byte) 4));
        getMessagesStorage().a.c(new zc6(this, (byte) 0));
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codePointCount; i++) {
            sb.append(Character.toChars(Character.codePointAt(upperCase, i) - (-127397)));
        }
        return sb.toString();
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

    public static void d(Location location, int i, vc6 vc6Var) {
        Locale locale;
        Locale locale2;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(vc6Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(vc6Var);
        }
        if (location == null) {
            vc6Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = ob6.D0().y;
        } catch (Exception unused) {
            locale = ob6.D0().z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        to3 to3Var = Utilities.e;
        fd6 fd6Var = new fd6(locale3, location, i, locale2, vc6Var);
        to3Var.d(fd6Var, 300L);
        R.put(vc6Var, fd6Var);
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

    public static id6 f(int i) {
        id6 id6Var;
        id6 id6Var2 = P[i];
        if (id6Var2 == null) {
            synchronized (id6.class) {
                id6Var = P[i];
                if (id6Var == null) {
                    id6[] id6VarArr = P;
                    id6 id6Var3 = new id6(i);
                    id6VarArr[i] = id6Var3;
                    id6Var = id6Var3;
                }
            }
            return id6Var;
        }
        return id6Var2;
    }

    public static int g() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += f(i2).J.size();
        }
        return i;
    }

    public static void q() {
        try {
            if (!jve.d("android.permission.ACCESS_COARSE_LOCATION") && !jve.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
            } else {
                a.b.startService(new Intent(a.b, LocationSharingService.class));
            }
        } catch (Throwable th) {
            cc4.g(th, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i = LocationSharingService.d;
        new oo7(a.b).b(6, "live_location_paused");
        a.b.stopService(new Intent(a.b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id6.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        int i3 = jn7.I4;
        zh6 zh6Var = this.c;
        if (i == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l = (Long) objArr[0];
                long longValue = l.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) zh6Var.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z = false;
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        r47 r47Var = (r47) arrayList3.get(i4);
                        if (r47Var.C3()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < arrayList2.size()) {
                                    if (r47.B1(((TLRPC.Message) arrayList2.get(i5)).from_id) == r47Var.Z0()) {
                                        arrayList2.set(i5, r47Var.k);
                                        break;
                                    }
                                    i5++;
                                } else {
                                    arrayList2.add(r47Var.k);
                                    break;
                                }
                            }
                            z = true;
                        } else {
                            TLRPC.Message message = r47Var.k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = r47.B0(message);
                                if (wf3.D(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z) {
                        jn7.e().k(i3, l, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i == jn7.v) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.J;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        hd6 hd6Var = (hd6) arrayList4.get(i6);
                        r47 r47Var2 = hd6Var.h;
                        if (r47Var2 != null) {
                            j = r47.v0(r47Var2.k);
                        } else {
                            j = 0;
                        }
                        if (longValue2 == j && arrayList5.contains(Integer.valueOf(hd6Var.b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(hd6Var.a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            k(((Long) arrayList6.get(i7)).longValue());
                        }
                    }
                }
            }
        } else if (i == jn7.m0) {
            Long l2 = (Long) objArr[0];
            long longValue3 = l2.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) zh6Var.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                    r47 r47Var3 = (r47) arrayList7.get(i8);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        } else if (r47.B1(((TLRPC.Message) arrayList.get(i9)).from_id) == r47Var3.Z0()) {
                            if (!r47Var3.C3()) {
                                arrayList.remove(i9);
                            } else {
                                arrayList.set(i9, r47Var3.k);
                            }
                            z2 = true;
                        } else {
                            i9++;
                        }
                    }
                }
                if (z2) {
                    jn7.e().k(i3, l2, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final hd6 h(long j) {
        return (hd6) this.K.f(j);
    }

    public final boolean i(long j) {
        if (this.K.h(j) >= 0) {
            return true;
        }
        return false;
    }

    public final void j(long j) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (!wf3.B(j) && (arrayList = (ArrayList) this.c.f(j)) != null && !arrayList.isEmpty()) {
            zh6 zh6Var = this.d;
            Integer num = (Integer) zh6Var.f(j);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                zh6Var.k(j, Integer.valueOf(elapsedRealtime));
                int i = 0;
                if (wf3.y(j)) {
                    long j2 = -j;
                    if (xc2.S(this.currentAccount, j2)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i < size) {
                            i = qd4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().h1(j2);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ad6(this, (byte) 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i < size2) {
                    i = qd4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ad6(this, (byte) 2));
            }
        }
    }

    public final void k(long j) {
        Utilities.d.c(new kt(this, j, (byte) 19));
    }

    public final void l(hd6 hd6Var, int i) {
        getMessagesStorage().a.c(new sb4(this, i, hd6Var, (byte) 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                hl.c3(new jm3((byte) 26));
            }
        }
    }

    public final void n(Location location, boolean z) {
        Location location2;
        if (location == null) {
            return;
        }
        this.F = true;
        if (!z && ((location2 = this.s) == null || location2.distanceTo(location) < 20.0f)) {
            if (this.x) {
                this.w = SystemClock.elapsedRealtime() - 10000;
                this.x = false;
            }
        } else {
            this.w = SystemClock.elapsedRealtime() - 30000;
            this.x = false;
        }
        m(location);
    }

    public final void o(int i, long j, boolean z) {
        hd6 hd6Var = (hd6) this.K.f(j);
        if (hd6Var != null) {
            hd6Var.f = i;
        }
        getMessagesStorage().a.c(new lb2(this, i, j, (byte) 1));
        if (z) {
            Utilities.d.c(new zc6(this, (byte) 6));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (!this.E) {
            this.y = SystemClock.elapsedRealtime();
            this.E = true;
            Boolean bool = this.L;
            if (bool == null) {
                ((pm3) a.i()).getClass();
                bool = Boolean.valueOf(b.b.hasServices());
                this.L = bool;
            }
            if (bool.booleanValue()) {
                try {
                    ((d6d) ((aj3) this.N).b).c();
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            try {
                this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            try {
                this.e.requestLocationUpdates("passive", 1L, 0.0f, this.n);
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
            if (this.s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.s == null) {
                        m(locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
            }
        }
    }

    public final void r(boolean z) {
        this.E = false;
        Boolean bool = this.L;
        if (bool == null) {
            ((pm3) a.i()).getClass();
            bool = Boolean.valueOf(b.b.hasServices());
            this.L = bool;
        }
        if (bool.booleanValue()) {
            try {
                ((pm3) a.i()).removeLocationUpdates(this.r);
                ((d6d) ((aj3) this.N).b).d();
            } catch (Throwable th) {
                cc4.g(th, false);
            }
        }
        gd6 gd6Var = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(gd6Var);
        if (z) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.b;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            int i = 0;
            boolean z2 = false;
            while (i < arrayList.size()) {
                hd6 hd6Var = (hd6) arrayList.get(i);
                if (hd6Var.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i);
                    this.a.l(hd6Var.a);
                    l(hd6Var, 1);
                    hl.c3(new dd6(this, hd6Var, (byte) 2));
                    i--;
                    z2 = true;
                }
                i++;
            }
            if (z2 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (this.E) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.F || Math.abs(this.y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.I && Math.abs(this.w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.y)) {
                this.F = false;
                this.x = true;
                if (SystemClock.elapsedRealtime() - this.w > 2000) {
                    z = true;
                }
                this.y = elapsedRealtime;
                this.w = SystemClock.elapsedRealtime();
                a(z);
            }
        } else if (!arrayList.isEmpty() && Math.abs(this.w - SystemClock.elapsedRealtime()) > 30000) {
            this.y = SystemClock.elapsedRealtime();
            p();
        }
    }
}
