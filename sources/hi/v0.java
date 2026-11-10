package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.v9;
public final class v0 {
    public final SensorManager f14984a;
    public Sensor f14985b;
    public long f14986c;
    public Sensor d;
    public long f14987e;
    public Sensor f14988f;
    public Sensor f14989g;
    public long h;
    public Sensor f14990i;
    public long f14991j;
    public org.telegram.ui.web.u0 f14992k;
    public boolean f14993l;
    public v9 f14994m;
    public v9 f14996o;
    public v9 f14998q;
    public v9 f15000s;
    public final s0 f14995n = new s0(this, 0);
    public final s0 f14997p = new s0(this, 1);
    public final t0 f14999r = new t0(this);
    public final u0 f15001t = new u0(this);

    public v0(Context context) {
        this.f14984a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f14993l) {
            this.f14993l = true;
            SensorManager sensorManager = this.f14984a;
            if (sensorManager != null) {
                Sensor sensor = this.f14985b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f14995n, sensor);
                }
                v9 v9Var = this.f14994m;
                if (v9Var != null) {
                    org.telegram.messenger.g0.r(v9Var);
                    this.f14994m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f14997p, sensor2);
                }
                v9 v9Var2 = this.f14996o;
                if (v9Var2 != null) {
                    org.telegram.messenger.g0.r(v9Var2);
                    this.f14996o = null;
                }
                Sensor sensor3 = this.f14989g;
                t0 t0Var = this.f14999r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f14988f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                v9 v9Var3 = this.f14998q;
                if (v9Var3 != null) {
                    org.telegram.messenger.g0.r(v9Var3);
                    this.f14998q = null;
                }
                Sensor sensor5 = this.f14990i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f15001t, sensor5);
                }
                v9 v9Var4 = this.f15000s;
                if (v9Var4 != null) {
                    org.telegram.messenger.g0.r(v9Var4);
                    this.f15000s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f14984a;
        if (sensorManager != null) {
            if (this.f14985b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f14985b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14986c = j3;
                if (!this.f14993l) {
                    sensorManager.registerListener(this.f14995n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f14984a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14987e = j3;
                if (!this.f14993l) {
                    sensorManager.registerListener(this.f14997p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z9) {
        Sensor sensor;
        SensorManager sensorManager = this.f14984a;
        if (sensorManager != null) {
            u0 u0Var = this.f15001t;
            t0 t0Var = this.f14999r;
            if (z9) {
                if (this.f14990i != null) {
                    v9 v9Var = this.f15000s;
                    if (v9Var != null) {
                        org.telegram.messenger.g0.r(v9Var);
                        this.f15000s = null;
                    }
                    if (!this.f14993l && (sensor = this.f14990i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f14990i = null;
                }
                if (this.f14988f == null || this.f14989g == null) {
                    this.f14989g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f14988f = defaultSensor;
                    Sensor sensor2 = this.f14989g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f14993l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f14988f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f14988f != null || this.f14989g != null) {
                    v9 v9Var2 = this.f14998q;
                    if (v9Var2 != null) {
                        org.telegram.messenger.g0.r(v9Var2);
                        this.f14998q = null;
                    }
                    if (!this.f14993l) {
                        Sensor sensor3 = this.f14989g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f14988f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f14989g = null;
                    this.f14988f = null;
                }
                if (this.f14990i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f14990i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f14991j = j3;
                    if (!this.f14993l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f14984a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14985b;
        if (sensor == null) {
            return true;
        }
        if (!this.f14993l) {
            sensorManager.unregisterListener(this.f14995n, sensor);
        }
        v9 v9Var = this.f14994m;
        if (v9Var != null) {
            org.telegram.messenger.g0.r(v9Var);
            this.f14994m = null;
        }
        this.f14985b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f14984a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f14993l) {
            sensorManager.unregisterListener(this.f14997p, sensor);
        }
        v9 v9Var = this.f14996o;
        if (v9Var != null) {
            org.telegram.messenger.g0.r(v9Var);
            this.f14996o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f14984a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14989g;
        if (sensor == null && this.f14988f == null && this.f14990i == null) {
            return true;
        }
        if (!this.f14993l) {
            t0 t0Var = this.f14999r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f14988f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f14990i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f15001t, sensor3);
            }
        }
        v9 v9Var = this.f14998q;
        if (v9Var != null) {
            org.telegram.messenger.g0.r(v9Var);
            this.f14998q = null;
        }
        v9 v9Var2 = this.f15000s;
        if (v9Var2 != null) {
            org.telegram.messenger.g0.r(v9Var2);
            this.f15000s = null;
        }
        this.f14989g = null;
        this.f14988f = null;
        this.f14990i = null;
        return true;
    }
}
