package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;
public final class o extends p {
    public final int f10211c = 1;
    public final s d;
    public final Object f10212e;

    public o(s sVar, aa.a aVar) {
        super(sVar);
        this.d = sVar;
        this.f10212e = aVar;
    }

    @Override
    public final IntentFilter d() {
        switch (this.f10211c) {
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
        long j3;
        Location location2;
        switch (this.f10211c) {
            case 0:
                if (((PowerManager) this.f10212e).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                aa.a aVar = (aa.a) this.f10212e;
                bh.a aVar2 = (bh.a) aVar.d;
                LocationManager locationManager = (LocationManager) aVar.f372c;
                if (aVar2.f2649b > System.currentTimeMillis()) {
                    z10 = aVar2.f2648a;
                } else {
                    Context context = (Context) aVar.f371b;
                    Location location3 = null;
                    if (f0.e.a(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
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
                        if (y.d == null) {
                            y.d = new Object();
                        }
                        y yVar = y.d;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (yVar.f10269c == 1) {
                            z10 = true;
                        }
                        long j10 = yVar.f10268b;
                        long j11 = yVar.f10267a;
                        yVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j12 = yVar.f10268b;
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
                        aVar2.f2648a = z10;
                        aVar2.f2649b = j3;
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
        switch (this.f10211c) {
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
        this.f10212e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
