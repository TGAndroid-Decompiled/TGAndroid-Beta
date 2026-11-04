package ii;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import gi.f6;
public final class w0 {
    public final SensorManager f15284a;
    public Sensor f15285b;
    public long f15286c;
    public Sensor d;
    public long f15287e;
    public Sensor f15288f;
    public Sensor f15289g;
    public long h;
    public Sensor f15290i;
    public long f15291j;
    public org.telegram.ui.web.t0 f15292k;
    public boolean f15293l;
    public f6 f15294m;
    public f6 f15296o;
    public f6 f15298q;
    public f6 f15300s;
    public final t0 f15295n = new t0(this, 0);
    public final t0 f15297p = new t0(this, 1);
    public final u0 f15299r = new u0(this);
    public final v0 f15301t = new v0(this);

    public w0(Context context) {
        this.f15284a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f15293l) {
            this.f15293l = true;
            SensorManager sensorManager = this.f15284a;
            if (sensorManager != null) {
                Sensor sensor = this.f15285b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f15295n, sensor);
                }
                f6 f6Var = this.f15294m;
                if (f6Var != null) {
                    org.telegram.messenger.g0.r(f6Var);
                    this.f15294m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f15297p, sensor2);
                }
                f6 f6Var2 = this.f15296o;
                if (f6Var2 != null) {
                    org.telegram.messenger.g0.r(f6Var2);
                    this.f15296o = null;
                }
                Sensor sensor3 = this.f15289g;
                u0 u0Var = this.f15299r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(u0Var, sensor3);
                }
                Sensor sensor4 = this.f15288f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(u0Var, sensor4);
                }
                f6 f6Var3 = this.f15298q;
                if (f6Var3 != null) {
                    org.telegram.messenger.g0.r(f6Var3);
                    this.f15298q = null;
                }
                Sensor sensor5 = this.f15290i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f15301t, sensor5);
                }
                f6 f6Var4 = this.f15300s;
                if (f6Var4 != null) {
                    org.telegram.messenger.g0.r(f6Var4);
                    this.f15300s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f15284a;
        if (sensorManager != null) {
            if (this.f15285b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f15285b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f15286c = j10;
                if (!this.f15293l) {
                    sensorManager.registerListener(this.f15295n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f15284a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f15287e = j10;
                if (!this.f15293l) {
                    sensorManager.registerListener(this.f15297p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f15284a;
        if (sensorManager != null) {
            v0 v0Var = this.f15301t;
            u0 u0Var = this.f15299r;
            if (z10) {
                if (this.f15290i != null) {
                    f6 f6Var = this.f15300s;
                    if (f6Var != null) {
                        org.telegram.messenger.g0.r(f6Var);
                        this.f15300s = null;
                    }
                    if (!this.f15293l && (sensor = this.f15290i) != null) {
                        sensorManager.unregisterListener(v0Var, sensor);
                    }
                    this.f15290i = null;
                }
                if (this.f15288f == null || this.f15289g == null) {
                    this.f15289g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f15288f = defaultSensor;
                    Sensor sensor2 = this.f15289g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f15293l) {
                            sensorManager.registerListener(u0Var, sensor2, a(j10));
                            sensorManager.registerListener(u0Var, this.f15288f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f15288f != null || this.f15289g != null) {
                    f6 f6Var2 = this.f15298q;
                    if (f6Var2 != null) {
                        org.telegram.messenger.g0.r(f6Var2);
                        this.f15298q = null;
                    }
                    if (!this.f15293l) {
                        Sensor sensor3 = this.f15289g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(u0Var, sensor3);
                        }
                        Sensor sensor4 = this.f15288f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(u0Var, sensor4);
                        }
                    }
                    this.f15289g = null;
                    this.f15288f = null;
                }
                if (this.f15290i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f15290i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f15291j = j10;
                    if (!this.f15293l) {
                        sensorManager.registerListener(v0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f15284a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f15285b;
        if (sensor == null) {
            return true;
        }
        if (!this.f15293l) {
            sensorManager.unregisterListener(this.f15295n, sensor);
        }
        f6 f6Var = this.f15294m;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
            this.f15294m = null;
        }
        this.f15285b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f15284a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f15293l) {
            sensorManager.unregisterListener(this.f15297p, sensor);
        }
        f6 f6Var = this.f15296o;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
            this.f15296o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f15284a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f15289g;
        if (sensor == null && this.f15288f == null && this.f15290i == null) {
            return true;
        }
        if (!this.f15293l) {
            u0 u0Var = this.f15299r;
            if (sensor != null) {
                sensorManager.unregisterListener(u0Var, sensor);
            }
            Sensor sensor2 = this.f15288f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(u0Var, sensor2);
            }
            Sensor sensor3 = this.f15290i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f15301t, sensor3);
            }
        }
        f6 f6Var = this.f15298q;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
            this.f15298q = null;
        }
        f6 f6Var2 = this.f15300s;
        if (f6Var2 != null) {
            org.telegram.messenger.g0.r(f6Var2);
            this.f15300s = null;
        }
        this.f15289g = null;
        this.f15288f = null;
        this.f15290i = null;
        return true;
    }
}
