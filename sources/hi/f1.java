package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
public final class f1 {
    public final SensorManager f12963a;
    public Sensor f12964b;
    public long f12965c;
    public Sensor d;
    public long e;
    public Sensor f12966f;
    public Sensor f12967g;
    public long h;
    public Sensor f12968i;
    public long f12969j;
    public org.telegram.ui.web.x0 f12970k;
    public boolean f12971l;
    public ua f12972m;
    public ua f12974o;
    public ua f12976q;
    public ua f12978s;
    public final c1 f12973n = new c1(this, 0);
    public final c1 f12975p = new c1(this, 1);
    public final d1 f12977r = new d1(this);
    public final e1 f12979t = new e1(this);

    public f1(Context context) {
        this.f12963a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f12971l) {
            this.f12971l = true;
            SensorManager sensorManager = this.f12963a;
            if (sensorManager != null) {
                Sensor sensor = this.f12964b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f12973n, sensor);
                }
                ua uaVar = this.f12972m;
                if (uaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar);
                    this.f12972m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f12975p, sensor2);
                }
                ua uaVar2 = this.f12974o;
                if (uaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar2);
                    this.f12974o = null;
                }
                Sensor sensor3 = this.f12967g;
                d1 d1Var = this.f12977r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(d1Var, sensor3);
                }
                Sensor sensor4 = this.f12966f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(d1Var, sensor4);
                }
                ua uaVar3 = this.f12976q;
                if (uaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar3);
                    this.f12976q = null;
                }
                Sensor sensor5 = this.f12968i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f12979t, sensor5);
                }
                ua uaVar4 = this.f12978s;
                if (uaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar4);
                    this.f12978s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f12963a;
        if (sensorManager != null) {
            if (this.f12964b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f12964b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f12965c = j10;
                if (!this.f12971l) {
                    sensorManager.registerListener(this.f12973n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f12963a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f12971l) {
                    sensorManager.registerListener(this.f12975p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f12963a;
        if (sensorManager != null) {
            e1 e1Var = this.f12979t;
            d1 d1Var = this.f12977r;
            if (z10) {
                if (this.f12968i != null) {
                    ua uaVar = this.f12978s;
                    if (uaVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(uaVar);
                        this.f12978s = null;
                    }
                    if (!this.f12971l && (sensor = this.f12968i) != null) {
                        sensorManager.unregisterListener(e1Var, sensor);
                    }
                    this.f12968i = null;
                }
                if (this.f12966f == null || this.f12967g == null) {
                    this.f12967g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f12966f = defaultSensor;
                    Sensor sensor2 = this.f12967g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f12971l) {
                            sensorManager.registerListener(d1Var, sensor2, a(j10));
                            sensorManager.registerListener(d1Var, this.f12966f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f12966f != null || this.f12967g != null) {
                    ua uaVar2 = this.f12976q;
                    if (uaVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(uaVar2);
                        this.f12976q = null;
                    }
                    if (!this.f12971l) {
                        Sensor sensor3 = this.f12967g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(d1Var, sensor3);
                        }
                        Sensor sensor4 = this.f12966f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(d1Var, sensor4);
                        }
                    }
                    this.f12967g = null;
                    this.f12966f = null;
                }
                if (this.f12968i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f12968i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f12969j = j10;
                    if (!this.f12971l) {
                        sensorManager.registerListener(e1Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f12963a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f12964b;
        if (sensor == null) {
            return true;
        }
        if (!this.f12971l) {
            sensorManager.unregisterListener(this.f12973n, sensor);
        }
        ua uaVar = this.f12972m;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12972m = null;
        }
        this.f12964b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f12963a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f12971l) {
            sensorManager.unregisterListener(this.f12975p, sensor);
        }
        ua uaVar = this.f12974o;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12974o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f12963a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f12967g;
        if (sensor == null && this.f12966f == null && this.f12968i == null) {
            return true;
        }
        if (!this.f12971l) {
            d1 d1Var = this.f12977r;
            if (sensor != null) {
                sensorManager.unregisterListener(d1Var, sensor);
            }
            Sensor sensor2 = this.f12966f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(d1Var, sensor2);
            }
            Sensor sensor3 = this.f12968i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f12979t, sensor3);
            }
        }
        ua uaVar = this.f12976q;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            this.f12976q = null;
        }
        ua uaVar2 = this.f12978s;
        if (uaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar2);
            this.f12978s = null;
        }
        this.f12967g = null;
        this.f12966f = null;
        this.f12968i = null;
        return true;
    }
}
