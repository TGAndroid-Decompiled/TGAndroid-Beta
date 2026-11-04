package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
public final class o extends p {
    public final int f11718c = 0;
    public final s d;
    public final Object f11719e;

    public o(s sVar, android.support.v4.media.session.a0 a0Var) {
        super(sVar);
        this.d = sVar;
        this.f11719e = a0Var;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f11718c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override
    public final int e() {
        Location location;
        boolean z10;
        long j10;
        Location location2;
        switch (this.f11718c) {
            case 0:
                if (((PowerManager) this.f11719e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f11719e;
                eh.a aVar = (eh.a) a0Var.d;
                LocationManager locationManager = (LocationManager) a0Var.f1187c;
                if (aVar.f9979b > System.currentTimeMillis()) {
                    z10 = aVar.f9978a;
                } else {
                    Context context = (Context) a0Var.f1186b;
                    Location location3 = null;
                    if (f0.d.c(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (f0.d.c(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z10 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (y.d == null) {
                            y.d = new Object();
                        }
                        y yVar = y.d;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (yVar.f11777c == 1) {
                            z10 = true;
                        }
                        long j11 = yVar.f11776b;
                        long j12 = yVar.f11775a;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = yVar.f11776b;
                        if (j11 != -1 && j12 != -1) {
                            if (currentTimeMillis > j12) {
                                j11 = j13;
                            } else if (currentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j10 = j11 + 60000;
                        } else {
                            j10 = currentTimeMillis + 43200000;
                        }
                        aVar.f9978a = z10;
                        aVar.f9979b = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public final void k() {
        switch (this.f11718c) {
            case 0:
                this.d.e(true);
                return;
            default:
                this.d.e(true);
                return;
        }
    }

    public o(s sVar, Context context) {
        super(sVar);
        this.d = sVar;
        this.f11719e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
