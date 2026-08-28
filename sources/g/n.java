package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;
public final class n extends f2.x {
    public final int f6992c = 1;
    public final q d;
    public final Object f6993e;

    public n(q qVar, a5.m mVar) {
        super(qVar);
        this.d = qVar;
        this.f6993e = mVar;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f6992c) {
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
        switch (this.f6992c) {
            case 0:
                if (((PowerManager) this.f6993e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                a5.m mVar = (a5.m) this.f6993e;
                x xVar = (x) mVar.d;
                LocationManager locationManager = (LocationManager) mVar.f99c;
                if (xVar.f7045a > System.currentTimeMillis()) {
                    z10 = xVar.f7046b;
                } else {
                    Context context = (Context) mVar.f98b;
                    Location location3 = null;
                    if (f0.e.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
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
                    if (f0.e.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
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
                        if (w.d == null) {
                            w.d = new Object();
                        }
                        w wVar = w.d;
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (wVar.f7044c == 1) {
                            z10 = true;
                        }
                        long j11 = wVar.f7043b;
                        long j12 = wVar.f7042a;
                        wVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = wVar.f7043b;
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
                        xVar.f7046b = z10;
                        xVar.f7045a = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i9 = Calendar.getInstance().get(11);
                        if (i9 < 6 || i9 >= 22) {
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
        switch (this.f6992c) {
            case 0:
                this.d.d(true);
                return;
            default:
                this.d.d(true);
                return;
        }
    }

    public n(q qVar, Context context) {
        super(qVar);
        this.d = qVar;
        this.f6993e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
