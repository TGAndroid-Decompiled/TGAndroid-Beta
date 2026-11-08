package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.h9;
public final class v0 {
    public final SensorManager f14982a;
    public Sensor f14983b;
    public long f14984c;
    public Sensor d;
    public long f14985e;
    public Sensor f14986f;
    public Sensor f14987g;
    public long h;
    public Sensor f14988i;
    public long f14989j;
    public org.telegram.ui.web.u0 f14990k;
    public boolean f14991l;
    public h9 f14992m;
    public h9 f14994o;
    public h9 f14996q;
    public h9 f14998s;
    public final s0 f14993n = new s0(this, 0);
    public final s0 f14995p = new s0(this, 1);
    public final t0 f14997r = new t0(this);
    public final u0 f14999t = new u0(this);

    public v0(Context context) {
        this.f14982a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j3) {
        if (j3 >= 160) {
            return 3;
        }
        if (j3 >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.f14991l) {
            this.f14991l = true;
            SensorManager sensorManager = this.f14982a;
            if (sensorManager != null) {
                Sensor sensor = this.f14983b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f14993n, sensor);
                }
                h9 h9Var = this.f14992m;
                if (h9Var != null) {
                    org.telegram.messenger.g0.r(h9Var);
                    this.f14992m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f14995p, sensor2);
                }
                h9 h9Var2 = this.f14994o;
                if (h9Var2 != null) {
                    org.telegram.messenger.g0.r(h9Var2);
                    this.f14994o = null;
                }
                Sensor sensor3 = this.f14987g;
                t0 t0Var = this.f14997r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f14986f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                h9 h9Var3 = this.f14996q;
                if (h9Var3 != null) {
                    org.telegram.messenger.g0.r(h9Var3);
                    this.f14996q = null;
                }
                Sensor sensor5 = this.f14988i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f14999t, sensor5);
                }
                h9 h9Var4 = this.f14998s;
                if (h9Var4 != null) {
                    org.telegram.messenger.g0.r(h9Var4);
                    this.f14998s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f14982a;
        if (sensorManager != null) {
            if (this.f14983b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f14983b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14984c = j3;
                if (!this.f14991l) {
                    sensorManager.registerListener(this.f14993n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f14982a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14985e = j3;
                if (!this.f14991l) {
                    sensorManager.registerListener(this.f14995p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z9) {
        Sensor sensor;
        SensorManager sensorManager = this.f14982a;
        if (sensorManager != null) {
            u0 u0Var = this.f14999t;
            t0 t0Var = this.f14997r;
            if (z9) {
                if (this.f14988i != null) {
                    h9 h9Var = this.f14998s;
                    if (h9Var != null) {
                        org.telegram.messenger.g0.r(h9Var);
                        this.f14998s = null;
                    }
                    if (!this.f14991l && (sensor = this.f14988i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f14988i = null;
                }
                if (this.f14986f == null || this.f14987g == null) {
                    this.f14987g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f14986f = defaultSensor;
                    Sensor sensor2 = this.f14987g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f14991l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f14986f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f14986f != null || this.f14987g != null) {
                    h9 h9Var2 = this.f14996q;
                    if (h9Var2 != null) {
                        org.telegram.messenger.g0.r(h9Var2);
                        this.f14996q = null;
                    }
                    if (!this.f14991l) {
                        Sensor sensor3 = this.f14987g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f14986f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f14987g = null;
                    this.f14986f = null;
                }
                if (this.f14988i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f14988i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f14989j = j3;
                    if (!this.f14991l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f14982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14983b;
        if (sensor == null) {
            return true;
        }
        if (!this.f14991l) {
            sensorManager.unregisterListener(this.f14993n, sensor);
        }
        h9 h9Var = this.f14992m;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14992m = null;
        }
        this.f14983b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f14982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f14991l) {
            sensorManager.unregisterListener(this.f14995p, sensor);
        }
        h9 h9Var = this.f14994o;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14994o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f14982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14987g;
        if (sensor == null && this.f14986f == null && this.f14988i == null) {
            return true;
        }
        if (!this.f14991l) {
            t0 t0Var = this.f14997r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f14986f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f14988i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f14999t, sensor3);
            }
        }
        h9 h9Var = this.f14996q;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14996q = null;
        }
        h9 h9Var2 = this.f14998s;
        if (h9Var2 != null) {
            org.telegram.messenger.g0.r(h9Var2);
            this.f14998s = null;
        }
        this.f14987g = null;
        this.f14986f = null;
        this.f14988i = null;
        return true;
    }
}
