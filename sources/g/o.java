package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
public final class o extends p {
    public final int f13334c = 0;
    public final s d;
    public final Object f13335e;

    public o(s sVar, android.support.v4.media.session.a0 a0Var) {
        super(sVar);
        this.d = sVar;
        this.f13335e = a0Var;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f13334c) {
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
        boolean z9;
        long j3;
        Location location2;
        switch (this.f13334c) {
            case 0:
                if (((PowerManager) this.f13335e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f13335e;
                dh.a aVar = (dh.a) a0Var.d;
                LocationManager locationManager = (LocationManager) a0Var.f1764c;
                if (aVar.f8701b > System.currentTimeMillis()) {
                    z9 = aVar.f8700a;
                } else {
                    Context context = (Context) a0Var.f1763b;
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
                    z9 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (y.d == null) {
                            y.d = new Object();
                        }
                        y yVar = y.d;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (yVar.f13392c == 1) {
                            z9 = true;
                        }
                        long j10 = yVar.f13391b;
                        long j11 = yVar.f13390a;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j12 = yVar.f13391b;
                        if (j10 != -1 && j11 != -1) {
                            if (currentTimeMillis > j11) {
                                j10 = j12;
                            } else if (currentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j3 = j10 + 60000;
                        } else {
                            j3 = currentTimeMillis + 43200000;
                        }
                        aVar.f8700a = z9;
                        aVar.f8701b = j3;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z9 = true;
                        }
                    }
                }
                if (!z9) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public final void k() {
        switch (this.f13334c) {
            case 0:
                this.d.d(true);
                return;
            default:
                this.d.d(true);
                return;
        }
    }

    public o(s sVar, Context context) {
        super(sVar);
        this.d = sVar;
        this.f13335e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
