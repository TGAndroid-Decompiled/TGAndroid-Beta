package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class ws0 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public mw0 k;
    public boolean l;
    public f00 m;
    public f00 o;
    public f00 q;
    public f00 s;
    public final ts0 n = new ts0(this, (byte) 0);
    public final ts0 p = new ts0(this, (byte) 1);
    public final us0 r = new us0(this);
    public final vs0 t = new vs0(this);

    public ws0(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j) {
        if (j >= 160) {
            return 3;
        }
        if (j >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.l) {
            this.l = true;
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                Sensor sensor = this.b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.n, sensor);
                }
                f00 f00Var = this.m;
                if (f00Var != null) {
                    gm.r(f00Var);
                    this.m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.p, sensor2);
                }
                f00 f00Var2 = this.o;
                if (f00Var2 != null) {
                    gm.r(f00Var2);
                    this.o = null;
                }
                Sensor sensor3 = this.g;
                us0 us0Var = this.r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(us0Var, sensor3);
                }
                Sensor sensor4 = this.f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(us0Var, sensor4);
                }
                f00 f00Var3 = this.q;
                if (f00Var3 != null) {
                    gm.r(f00Var3);
                    this.q = null;
                }
                Sensor sensor5 = this.i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.t, sensor5);
                }
                f00 f00Var4 = this.s;
                if (f00Var4 != null) {
                    gm.r(f00Var4);
                    this.s = null;
                }
            }
        }
    }

    public final boolean c(long j) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            if (this.b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.c = j;
                if (!this.l) {
                    sensorManager.registerListener(this.n, defaultSensor, a(j));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j;
                if (!this.l) {
                    sensorManager.registerListener(this.p, defaultSensor, a(j));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j, boolean z) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            vs0 vs0Var = this.t;
            us0 us0Var = this.r;
            if (z) {
                if (this.i != null) {
                    f00 f00Var = this.s;
                    if (f00Var != null) {
                        gm.r(f00Var);
                        this.s = null;
                    }
                    if (!this.l && (sensor = this.i) != null) {
                        sensorManager.unregisterListener(vs0Var, sensor);
                    }
                    this.i = null;
                }
                if (this.f == null || this.g == null) {
                    this.g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f = defaultSensor;
                    Sensor sensor2 = this.g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j;
                        if (!this.l) {
                            sensorManager.registerListener(us0Var, sensor2, a(j));
                            sensorManager.registerListener(us0Var, this.f, a(j));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f != null || this.g != null) {
                    f00 f00Var2 = this.q;
                    if (f00Var2 != null) {
                        gm.r(f00Var2);
                        this.q = null;
                    }
                    if (!this.l) {
                        Sensor sensor3 = this.g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(us0Var, sensor3);
                        }
                        Sensor sensor4 = this.f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(us0Var, sensor4);
                        }
                    }
                    this.g = null;
                    this.f = null;
                }
                if (this.i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.j = j;
                    if (!this.l) {
                        sensorManager.registerListener(vs0Var, defaultSensor2, a(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        f00 f00Var = this.m;
        if (f00Var != null) {
            gm.r(f00Var);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        f00 f00Var = this.o;
        if (f00Var != null) {
            gm.r(f00Var);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            us0 us0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(us0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(us0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        f00 f00Var = this.q;
        if (f00Var != null) {
            gm.r(f00Var);
            this.q = null;
        }
        f00 f00Var2 = this.s;
        if (f00Var2 != null) {
            gm.r(f00Var2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
