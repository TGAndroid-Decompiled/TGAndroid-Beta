package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class v0 {
    public final SensorManager f19079a;
    public Sensor f19080b;
    public long f19081c;
    public Sensor d;
    public long f19082e;
    public Sensor f19083f;
    public Sensor f19084g;
    public long h;
    public Sensor f19085i;
    public long f19086j;
    public org.telegram.ui.web.s0 f19087k;
    public boolean f19088l;
    public kg.i0 f19089m;
    public kg.i0 f19091o;
    public kg.i0 f19093q;
    public kg.i0 f19095s;
    public final s0 f19090n = new s0(this, 0);
    public final s0 f19092p = new s0(this, 1);
    public final t0 f19094r = new t0(this);
    public final u0 f19096t = new u0(this);

    public v0(Context context) {
        this.f19079a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f19088l) {
            this.f19088l = true;
            SensorManager sensorManager = this.f19079a;
            if (sensorManager != null) {
                Sensor sensor = this.f19080b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f19090n, sensor);
                }
                kg.i0 i0Var = this.f19089m;
                if (i0Var != null) {
                    org.telegram.messenger.g0.r(i0Var);
                    this.f19089m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f19092p, sensor2);
                }
                kg.i0 i0Var2 = this.f19091o;
                if (i0Var2 != null) {
                    org.telegram.messenger.g0.r(i0Var2);
                    this.f19091o = null;
                }
                Sensor sensor3 = this.f19084g;
                t0 t0Var = this.f19094r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f19083f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                kg.i0 i0Var3 = this.f19093q;
                if (i0Var3 != null) {
                    org.telegram.messenger.g0.r(i0Var3);
                    this.f19093q = null;
                }
                Sensor sensor5 = this.f19085i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f19096t, sensor5);
                }
                kg.i0 i0Var4 = this.f19095s;
                if (i0Var4 != null) {
                    org.telegram.messenger.g0.r(i0Var4);
                    this.f19095s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f19079a;
        if (sensorManager != null) {
            if (this.f19080b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f19080b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19081c = j3;
                if (!this.f19088l) {
                    sensorManager.registerListener(this.f19090n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f19079a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19082e = j3;
                if (!this.f19088l) {
                    sensorManager.registerListener(this.f19092p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19079a;
        if (sensorManager != null) {
            u0 u0Var = this.f19096t;
            t0 t0Var = this.f19094r;
            if (z10) {
                if (this.f19085i != null) {
                    kg.i0 i0Var = this.f19095s;
                    if (i0Var != null) {
                        org.telegram.messenger.g0.r(i0Var);
                        this.f19095s = null;
                    }
                    if (!this.f19088l && (sensor = this.f19085i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f19085i = null;
                }
                if (this.f19083f == null || this.f19084g == null) {
                    this.f19084g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f19083f = defaultSensor;
                    Sensor sensor2 = this.f19084g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f19088l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f19083f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f19083f != null || this.f19084g != null) {
                    kg.i0 i0Var2 = this.f19093q;
                    if (i0Var2 != null) {
                        org.telegram.messenger.g0.r(i0Var2);
                        this.f19093q = null;
                    }
                    if (!this.f19088l) {
                        Sensor sensor3 = this.f19084g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f19083f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f19084g = null;
                    this.f19083f = null;
                }
                if (this.f19085i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f19085i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f19086j = j3;
                    if (!this.f19088l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19079a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19080b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19088l) {
            sensorManager.unregisterListener(this.f19090n, sensor);
        }
        kg.i0 i0Var = this.f19089m;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19089m = null;
        }
        this.f19080b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19079a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19088l) {
            sensorManager.unregisterListener(this.f19092p, sensor);
        }
        kg.i0 i0Var = this.f19091o;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19091o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19079a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19084g;
        if (sensor == null && this.f19083f == null && this.f19085i == null) {
            return true;
        }
        if (!this.f19088l) {
            t0 t0Var = this.f19094r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f19083f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f19085i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19096t, sensor3);
            }
        }
        kg.i0 i0Var = this.f19093q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19093q = null;
        }
        kg.i0 i0Var2 = this.f19095s;
        if (i0Var2 != null) {
            org.telegram.messenger.g0.r(i0Var2);
            this.f19095s = null;
        }
        this.f19084g = null;
        this.f19083f = null;
        this.f19085i = null;
        return true;
    }
}
