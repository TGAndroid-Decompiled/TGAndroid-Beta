package g;

import a8.h0;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;
public final class n extends o {
    public final int f12150c = 1;
    public final r d;
    public final Object e;

    public n(r rVar, h0 h0Var) {
        super(rVar);
        this.d = rVar;
        this.e = h0Var;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f12150c) {
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
        switch (this.f12150c) {
            case 0:
                if (((PowerManager) this.e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                h0 h0Var = (h0) this.e;
                ch.a aVar = (ch.a) h0Var.d;
                LocationManager locationManager = (LocationManager) h0Var.f512c;
                if (aVar.f6297b > System.currentTimeMillis()) {
                    z10 = aVar.f6296a;
                } else {
                    Context context = (Context) h0Var.f511b;
                    Location location3 = null;
                    if (f0.c.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
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
                    if (f0.c.a(context, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z10 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (x.d == null) {
                            x.d = new Object();
                        }
                        x xVar = x.d;
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (xVar.f12203c == 1) {
                            z10 = true;
                        }
                        long j11 = xVar.f12202b;
                        long j12 = xVar.f12201a;
                        xVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = xVar.f12202b;
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
                        aVar.f6296a = z10;
                        aVar.f6297b = j10;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
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
        switch (this.f12150c) {
            case 0:
                this.d.d(true);
                return;
            default:
                this.d.d(true);
                return;
        }
    }

    public n(r rVar, Context context) {
        super(rVar);
        this.d = rVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
