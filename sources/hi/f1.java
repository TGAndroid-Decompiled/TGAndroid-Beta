package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
public final class f1 {
    public final SensorManager f12964a;
    public Sensor f12965b;
    public long f12966c;
    public Sensor d;
    public long e;
    public Sensor f12967f;
    public Sensor f12968g;
    public long h;
    public Sensor f12969i;
    public long f12970j;
    public org.telegram.ui.web.x0 f12971k;
    public boolean f12972l;
    public ua f12973m;
    public ua f12975o;
    public ua f12977q;
    public ua f12979s;
    public final c1 f12974n = new c1(this, 0);
    public final c1 f12976p = new c1(this, 1);
    public final d1 f12978r = new d1(this);
    public final e1 f12980t = new e1(this);

    public f1(Context context) {
        this.f12964a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        if (j10 >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.f12972l) {
            this.f12972l = true;
            SensorManager sensorManager = this.f12964a;
            if (sensorManager != null) {
                Sensor sensor = this.f12965b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f12974n, sensor);
                }
                ua uaVar = this.f12973m;
                if (uaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar);
                    this.f12973m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f12976p, sensor2);
                }
                ua uaVar2 = this.f12975o;
                if (uaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar2);
                    this.f12975o = null;
                }
                Sensor sensor3 = this.f12968g;
                d1 d1Var = this.f12978r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(d1Var, sensor3);
                }
                Sensor sensor4 = this.f12967f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(d1Var, sensor4);
                }
                ua uaVar3 = this.f12977q;
                if (uaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar3);
                    this.f12977q = null;
                }
                Sensor sensor5 = this.f12969i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f12980t, sensor5);
                }
                ua uaVar4 = this.f12979s;
                if (uaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar4);
                    this.f12979s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f12964a;
        if (sensorManager != null) {
            if (this.f12965b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f12965b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f12966c = j10;
                if (!this.f12972l) {
                    sensorManager.registerListener(this.f12974n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f12964a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f12972l) {
                    sensorManager.registerListener(this.f12976p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f12964a;
        if (sensorManager != null) {
            e1 e1Var = this.f12980t;
            d1 d1Var = this.f12978r;
            if (z10) {
                if (this.f12969i != null) {
                    ua uaVar = this.f12979s;
                    if (uaVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(uaVar);
                        this.f12979s = null;
                    }
                    if (!this.f12972l && (sensor = this.f12969i) != null) {
                        sensorManager.unregisterListener(e1Var, sensor);
                    }
                    this.f12969i = null;
                }
                if (this.f12967f == null || this.f12968g == null) {
                    this.f12968g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f12967f = defaultSensor;
                    Sensor sensor2 = this.f12968g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f12972l) {
                            sensorManager.registerListener(d1Var, sensor2, a(j10));
                            sensorManager.registerListener(d1Var, this.f12967f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f12967f != null || this.f12968g != null) {
                    ua uaVar2 = this.f12977q;
                    if (uaVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(uaVar2);
                        this.f12977q = null;
                    }
                    if (!this.f12972l) {
                        Sensor sensor3 = this.f12968g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(d1Var, sensor3);
                        }
                        Sensor sensor4 = this.f12967f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(d1Var, sensor4);
                        }
                    }
                    this.f12968g = null;
                    this.f12967f = null;
                }
                if (this.f12969i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f12969i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f12970j = j10;
                    if (!this.f12972l) {
                        sensorManager.registerListener(e1Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f12964a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f12965b;
        if (sensor == null) {
            return true;
        }
        if (!this.f12972l) {
            sensorManager.unregisterListener(this.f12974n, sensor);
        }
        ua uaVar = this.f12973m;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12973m = null;
        }
        this.f12965b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f12964a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f12972l) {
            sensorManager.unregisterListener(this.f12976p, sensor);
        }
        ua uaVar = this.f12975o;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12975o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f12964a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f12968g;
        if (sensor == null && this.f12967f == null && this.f12969i == null) {
            return true;
        }
        if (!this.f12972l) {
            d1 d1Var = this.f12978r;
            if (sensor != null) {
                sensorManager.unregisterListener(d1Var, sensor);
            }
            Sensor sensor2 = this.f12967f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(d1Var, sensor2);
            }
            Sensor sensor3 = this.f12969i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f12980t, sensor3);
            }
        }
        ua uaVar = this.f12977q;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12977q = null;
        }
        ua uaVar2 = this.f12979s;
        if (uaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar2);
            this.f12979s = null;
        }
        this.f12968g = null;
        this.f12967f = null;
        this.f12969i = null;
        return true;
    }
}
