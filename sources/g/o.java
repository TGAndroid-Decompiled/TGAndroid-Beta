package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;

public final class o extends f2.w {

    public final int f6273c = 1;
    public final r d;

    public final Object f6274e;

    public o(r rVar, a5.n nVar) {
        super(rVar);
        this.d = rVar;
        this.f6274e = nVar;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f6273c) {
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
        Location lastKnownLocation;
        switch (this.f6273c) {
            case 0:
                return ((PowerManager) this.f6274e).isPowerSaveMode() ? 2 : 1;
            default:
                a5.n nVar = (a5.n) this.f6274e;
                y yVar = (y) nVar.d;
                LocationManager locationManager = (LocationManager) nVar.f101c;
                if (yVar.f6326a <= System.currentTimeMillis()) {
                    Context context = (Context) nVar.f100b;
                    Location lastKnownLocation2 = null;
                    if (f0.e.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (f0.e.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z10 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (x.d == null) {
                            x.d = new x();
                        }
                        x xVar = x.d;
                        xVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        xVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z10 = xVar.f6325c == 1;
                        long j11 = xVar.f6324b;
                        long j12 = xVar.f6323a;
                        xVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j13 = xVar.f6324b;
                        if (j11 == -1 || j12 == -1) {
                            j10 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j12) {
                                j11 = j13;
                            } else if (jCurrentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j10 = j11 + 60000;
                        }
                        yVar.f6327b = z10;
                        yVar.f6326a = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z10 = true;
                        }
                    }
                    break;
                } else {
                    z10 = yVar.f6327b;
                }
                return z10 ? 2 : 1;
        }
    }

    @Override
    public final void k() {
        switch (this.f6273c) {
            case 0:
                this.d.d(true);
                break;
            default:
                this.d.d(true);
                break;
        }
    }

    public o(r rVar, Context context) {
        super(rVar);
        this.d = rVar;
        this.f6274e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
