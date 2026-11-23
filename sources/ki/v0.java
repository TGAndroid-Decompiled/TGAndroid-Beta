package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class v0 {
    public final SensorManager f18982a;
    public Sensor f18983b;
    public long f18984c;
    public Sensor d;
    public long f18985e;
    public Sensor f18986f;
    public Sensor f18987g;
    public long h;
    public Sensor f18988i;
    public long f18989j;
    public org.telegram.ui.web.s0 f18990k;
    public boolean f18991l;
    public kg.s0 f18992m;
    public kg.s0 f18994o;
    public kg.s0 f18996q;
    public kg.s0 f18998s;
    public final s0 f18993n = new s0(this, 0);
    public final s0 f18995p = new s0(this, 1);
    public final t0 f18997r = new t0(this);
    public final u0 f18999t = new u0(this);

    public v0(Context context) {
        this.f18982a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f18991l) {
            this.f18991l = true;
            SensorManager sensorManager = this.f18982a;
            if (sensorManager != null) {
                Sensor sensor = this.f18983b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f18993n, sensor);
                }
                kg.s0 s0Var = this.f18992m;
                if (s0Var != null) {
                    org.telegram.messenger.g0.r(s0Var);
                    this.f18992m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f18995p, sensor2);
                }
                kg.s0 s0Var2 = this.f18994o;
                if (s0Var2 != null) {
                    org.telegram.messenger.g0.r(s0Var2);
                    this.f18994o = null;
                }
                Sensor sensor3 = this.f18987g;
                t0 t0Var = this.f18997r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f18986f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                kg.s0 s0Var3 = this.f18996q;
                if (s0Var3 != null) {
                    org.telegram.messenger.g0.r(s0Var3);
                    this.f18996q = null;
                }
                Sensor sensor5 = this.f18988i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f18999t, sensor5);
                }
                kg.s0 s0Var4 = this.f18998s;
                if (s0Var4 != null) {
                    org.telegram.messenger.g0.r(s0Var4);
                    this.f18998s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f18982a;
        if (sensorManager != null) {
            if (this.f18983b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f18983b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18984c = j3;
                if (!this.f18991l) {
                    sensorManager.registerListener(this.f18993n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f18982a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18985e = j3;
                if (!this.f18991l) {
                    sensorManager.registerListener(this.f18995p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f18982a;
        if (sensorManager != null) {
            u0 u0Var = this.f18999t;
            t0 t0Var = this.f18997r;
            if (z10) {
                if (this.f18988i != null) {
                    kg.s0 s0Var = this.f18998s;
                    if (s0Var != null) {
                        org.telegram.messenger.g0.r(s0Var);
                        this.f18998s = null;
                    }
                    if (!this.f18991l && (sensor = this.f18988i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f18988i = null;
                }
                if (this.f18986f == null || this.f18987g == null) {
                    this.f18987g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f18986f = defaultSensor;
                    Sensor sensor2 = this.f18987g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f18991l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f18986f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f18986f != null || this.f18987g != null) {
                    kg.s0 s0Var2 = this.f18996q;
                    if (s0Var2 != null) {
                        org.telegram.messenger.g0.r(s0Var2);
                        this.f18996q = null;
                    }
                    if (!this.f18991l) {
                        Sensor sensor3 = this.f18987g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f18986f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f18987g = null;
                    this.f18986f = null;
                }
                if (this.f18988i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f18988i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f18989j = j3;
                    if (!this.f18991l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f18982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18983b;
        if (sensor == null) {
            return true;
        }
        if (!this.f18991l) {
            sensorManager.unregisterListener(this.f18993n, sensor);
        }
        kg.s0 s0Var = this.f18992m;
        if (s0Var != null) {
            org.telegram.messenger.g0.r(s0Var);
            this.f18992m = null;
        }
        this.f18983b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f18982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f18991l) {
            sensorManager.unregisterListener(this.f18995p, sensor);
        }
        kg.s0 s0Var = this.f18994o;
        if (s0Var != null) {
            org.telegram.messenger.g0.r(s0Var);
            this.f18994o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f18982a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18987g;
        if (sensor == null && this.f18986f == null && this.f18988i == null) {
            return true;
        }
        if (!this.f18991l) {
            t0 t0Var = this.f18997r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f18986f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f18988i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f18999t, sensor3);
            }
        }
        kg.s0 s0Var = this.f18996q;
        if (s0Var != null) {
            org.telegram.messenger.g0.r(s0Var);
            this.f18996q = null;
        }
        kg.s0 s0Var2 = this.f18998s;
        if (s0Var2 != null) {
            org.telegram.messenger.g0.r(s0Var2);
            this.f18998s = null;
        }
        this.f18987g = null;
        this.f18986f = null;
        this.f18988i = null;
        return true;
    }
}
