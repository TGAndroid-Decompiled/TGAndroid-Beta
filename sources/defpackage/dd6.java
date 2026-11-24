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
public final class dd6 extends pg0 implements jm7, kj5, lj5 {
    public static volatile dd6[] P = new dd6[4];
    public static final String[] Q = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap R = new HashMap();
    public boolean E;
    public boolean F;
    public final SparseIntArray G;
    public final vh6 H;
    public long I;
    public final ArrayList J;
    public final vh6 K;
    public Boolean L;
    public boolean M;
    public final oj5 N;
    public final nj5 O;
    public final vh6 a;
    public final ArrayList b;
    public final vh6 c;
    public final vh6 d;
    public final LocationManager e;
    public final bd6 f;
    public final bd6 h;
    public final bd6 n;
    public final fk3 r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public dd6(int i) {
        super(i);
        this.a = new vh6();
        this.b = new ArrayList();
        this.c = new vh6();
        this.d = new vh6();
        this.f = new bd6(this, (byte) 0);
        this.h = new bd6(this, (byte) 0);
        this.n = new bd6(this, (byte) 0);
        this.r = new fk3(this);
        this.x = true;
        this.G = new SparseIntArray();
        this.H = new vh6();
        this.J = new ArrayList();
        this.K = new vh6();
        this.e = (LocationManager) a.b.getSystemService("location");
        this.N = ((in3) a.i()).onCreateLocationServicesAPI(a.b, this, this);
        nj5 onCreateLocationRequest = ((in3) a.i()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        o05 o05Var = (o05) onCreateLocationRequest;
        o05Var.c();
        o05Var.b();
        o05Var.a();
        gm.c3(new uc6(this, (byte) 5));
        getMessagesStorage().a.c(new uc6(this, (byte) 0));
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

    public static void d(Location location, int i, qc6 qc6Var) {
        Locale locale;
        Locale locale2;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(qc6Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(qc6Var);
        }
        if (location == null) {
            qc6Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = jb6.D0().y;
        } catch (Exception unused) {
            locale = jb6.D0().z;
        }
        Locale locale3 = locale;
        if (locale3.getLanguage().contains("en")) {
            locale2 = locale3;
        } else {
            locale2 = Locale.US;
        }
        mp3 mp3Var = Utilities.e;
        ad6 ad6Var = new ad6(locale3, location, i, locale2, qc6Var);
        mp3Var.d(ad6Var, 300L);
        R.put(qc6Var, ad6Var);
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

    public static dd6 f(int i) {
        dd6 dd6Var;
        dd6 dd6Var2 = P[i];
        if (dd6Var2 == null) {
            synchronized (dd6.class) {
                dd6Var = P[i];
                if (dd6Var == null) {
                    dd6[] dd6VarArr = P;
                    dd6 dd6Var3 = new dd6(i);
                    dd6VarArr[i] = dd6Var3;
                    dd6Var = dd6Var3;
                }
            }
            return dd6Var;
        }
        return dd6Var2;
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
            if (!use.d("android.permission.ACCESS_COARSE_LOCATION") && !use.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
            } else {
                a.b.startService(new Intent(a.b, LocationSharingService.class));
            }
        } catch (Throwable th) {
            fc4.g(th, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i = LocationSharingService.d;
        new sn7(a.b).b(6, "live_location_paused");
        a.b.stopService(new Intent(a.b, LocationSharingService.class));
    }

    public final void a(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd6.a(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        int i3 = nm7.J4;
        vh6 vh6Var = this.c;
        if (i == 1) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                Long l = (Long) objArr[0];
                long longValue = l.longValue();
                if (i(longValue) && (arrayList2 = (ArrayList) vh6Var.f(longValue)) != null) {
                    ArrayList arrayList3 = (ArrayList) objArr[1];
                    boolean z = false;
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        k47 k47Var = (k47) arrayList3.get(i4);
                        if (k47Var.C3()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < arrayList2.size()) {
                                    if (k47.B1(((TLRPC.Message) arrayList2.get(i5)).from_id) == k47Var.Z0()) {
                                        arrayList2.set(i5, k47Var.k);
                                        break;
                                    }
                                    i5++;
                                } else {
                                    arrayList2.add(k47Var.k);
                                    break;
                                }
                            }
                            z = true;
                        } else {
                            TLRPC.Message message = k47Var.k;
                            if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                long B0 = k47.B0(message);
                                if (pg3.D(B0)) {
                                    o(0, B0, false);
                                }
                            }
                        }
                    }
                    if (z) {
                        nm7.e().k(i3, l, Integer.valueOf(this.currentAccount));
                    }
                }
            }
        } else if (i == nm7.v) {
            if (!((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList4 = this.J;
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayList5 = (ArrayList) objArr[0];
                    long longValue2 = ((Long) objArr[1]).longValue();
                    ArrayList arrayList6 = null;
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        cd6 cd6Var = (cd6) arrayList4.get(i6);
                        k47 k47Var2 = cd6Var.h;
                        if (k47Var2 != null) {
                            j = k47.v0(k47Var2.k);
                        } else {
                            j = 0;
                        }
                        if (longValue2 == j && arrayList5.contains(Integer.valueOf(cd6Var.b))) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(Long.valueOf(cd6Var.a));
                        }
                    }
                    if (arrayList6 != null) {
                        for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                            k(((Long) arrayList6.get(i7)).longValue());
                        }
                    }
                }
            }
        } else if (i == nm7.m0) {
            Long l2 = (Long) objArr[0];
            long longValue3 = l2.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) vh6Var.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                    k47 k47Var3 = (k47) arrayList7.get(i8);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        } else if (k47.B1(((TLRPC.Message) arrayList.get(i9)).from_id) == k47Var3.Z0()) {
                            if (!k47Var3.C3()) {
                                arrayList.remove(i9);
                            } else {
                                arrayList.set(i9, k47Var3.k);
                            }
                            z2 = true;
                        } else {
                            i9++;
                        }
                    }
                }
                if (z2) {
                    nm7.e().k(i3, l2, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final cd6 h(long j) {
        return (cd6) this.K.f(j);
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
        if (!pg3.B(j) && (arrayList = (ArrayList) this.c.f(j)) != null && !arrayList.isEmpty()) {
            vh6 vh6Var = this.d;
            Integer num = (Integer) vh6Var.f(j);
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
            if (num == null || num.intValue() + 60 <= elapsedRealtime) {
                vh6Var.k(Integer.valueOf(elapsedRealtime), j);
                int i = 0;
                if (pg3.y(j)) {
                    long j2 = -j;
                    if (sd2.S(this.currentAccount, j2)) {
                        tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                        int size = arrayList.size();
                        while (i < size) {
                            i = td4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
                        }
                        tL_messages_readMessageContents.channel = getMessagesController().g1(j2);
                        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new vc6(this, (byte) 2));
                    }
                }
                tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
                int size2 = arrayList.size();
                while (i < size2) {
                    i = td4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
                }
                getConnectionsManager().sendRequest(tL_messages_readMessageContents, new vc6(this, (byte) 2));
            }
        }
    }

    public final void k(long j) {
        Utilities.d.c(new fu(this, j, (byte) 19));
    }

    public final void l(cd6 cd6Var, int i) {
        getMessagesStorage().a.c(new ob4(this, i, cd6Var, (byte) 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                gm.c3(new bn3((byte) 24));
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
        cd6 cd6Var = (cd6) this.K.f(j);
        if (cd6Var != null) {
            cd6Var.f = i;
        }
        getMessagesStorage().a.c(new gc2(this, i, j, (byte) 1));
        if (z) {
            Utilities.d.c(new uc6(this, (byte) 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (!this.E) {
            this.y = SystemClock.elapsedRealtime();
            this.E = true;
            Boolean bool = this.L;
            if (bool == null) {
                ((in3) a.i()).getClass();
                bool = Boolean.valueOf(b.b.hasServices());
                this.L = bool;
            }
            if (bool.booleanValue()) {
                try {
                    ((o3d) ((fk3) this.N).a).c();
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
            try {
                this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            try {
                this.e.requestLocationUpdates("passive", 1L, 0.0f, this.n);
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
            if (this.s == null) {
                try {
                    m(locationManager.getLastKnownLocation("gps"));
                    if (this.s == null) {
                        m(locationManager.getLastKnownLocation("network"));
                    }
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
            }
        }
    }

    public final void r(boolean z) {
        this.E = false;
        Boolean bool = this.L;
        if (bool == null) {
            ((in3) a.i()).getClass();
            bool = Boolean.valueOf(b.b.hasServices());
            this.L = bool;
        }
        if (bool.booleanValue()) {
            try {
                ((in3) a.i()).removeLocationUpdates(this.r);
                ((o3d) ((fk3) this.N).a).d();
            } catch (Throwable th) {
                fc4.g(th, false);
            }
        }
        bd6 bd6Var = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(bd6Var);
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
                cd6 cd6Var = (cd6) arrayList.get(i);
                if (cd6Var.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i);
                    this.a.l(cd6Var.a);
                    l(cd6Var, 1);
                    gm.c3(new wc6(this, cd6Var, (byte) 2));
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
