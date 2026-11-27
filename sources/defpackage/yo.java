package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
public final class yo extends zo {
    public final byte c = 0;
    public final cp d;
    public final Object e;

    public yo(cp cpVar, Context context) {
        super(cpVar);
        this.d = cpVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override
    public final IntentFilter d() {
        switch (this.c) {
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
        boolean z;
        long j;
        Location location2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (((PowerManager) obj).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                ko9 ko9Var = (ko9) obj;
                qeb qebVar = (qeb) ko9Var.d;
                LocationManager locationManager = (LocationManager) ko9Var.c;
                if (qebVar.a > System.currentTimeMillis()) {
                    z = qebVar.b;
                } else {
                    Context context = (Context) ko9Var.b;
                    Location location3 = null;
                    if (ive.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (ive.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 != null && (location == null || location3.getTime() > location.getTime())) {
                        location = location3;
                    }
                    z = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        s6c s6cVar = s6c.d;
                        s6c s6cVar2 = s6cVar;
                        if (s6cVar == null) {
                            ?? obj2 = new Object();
                            s6c.d = obj2;
                            s6cVar2 = obj2;
                        }
                        s6c s6cVar3 = s6cVar2;
                        s6cVar3.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        s6cVar3.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (s6cVar3.c) {
                            z = true;
                        }
                        long j2 = s6cVar3.b;
                        long j3 = s6cVar3.a;
                        s6cVar3.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = s6cVar3.b;
                        if (j2 != -1 && j3 != -1) {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        qebVar.b = z;
                        qebVar.a = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    @Override
    public final void k() {
        byte b = this.c;
        cp cpVar = this.d;
        switch (b) {
            case 0:
                cpVar.d(true);
                return;
            default:
                cpVar.d(true);
                return;
        }
    }

    public yo(cp cpVar, ko9 ko9Var) {
        super(cpVar);
        this.d = cpVar;
        this.e = ko9Var;
    }
}
