package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class v0 {
    public final SensorManager f19013a;
    public Sensor f19014b;
    public long f19015c;
    public Sensor d;
    public long f19016e;
    public Sensor f19017f;
    public Sensor f19018g;
    public long h;
    public Sensor f19019i;
    public long f19020j;
    public org.telegram.ui.web.s0 f19021k;
    public boolean f19022l;
    public kg.i0 f19023m;
    public kg.i0 f19025o;
    public kg.i0 f19027q;
    public kg.i0 f19029s;
    public final s0 f19024n = new s0(this, 0);
    public final s0 f19026p = new s0(this, 1);
    public final t0 f19028r = new t0(this);
    public final u0 f19030t = new u0(this);

    public v0(Context context) {
        this.f19013a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f19022l) {
            this.f19022l = true;
            SensorManager sensorManager = this.f19013a;
            if (sensorManager != null) {
                Sensor sensor = this.f19014b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f19024n, sensor);
                }
                kg.i0 i0Var = this.f19023m;
                if (i0Var != null) {
                    org.telegram.messenger.g0.r(i0Var);
                    this.f19023m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f19026p, sensor2);
                }
                kg.i0 i0Var2 = this.f19025o;
                if (i0Var2 != null) {
                    org.telegram.messenger.g0.r(i0Var2);
                    this.f19025o = null;
                }
                Sensor sensor3 = this.f19018g;
                t0 t0Var = this.f19028r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f19017f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                kg.i0 i0Var3 = this.f19027q;
                if (i0Var3 != null) {
                    org.telegram.messenger.g0.r(i0Var3);
                    this.f19027q = null;
                }
                Sensor sensor5 = this.f19019i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f19030t, sensor5);
                }
                kg.i0 i0Var4 = this.f19029s;
                if (i0Var4 != null) {
                    org.telegram.messenger.g0.r(i0Var4);
                    this.f19029s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f19013a;
        if (sensorManager != null) {
            if (this.f19014b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f19014b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19015c = j3;
                if (!this.f19022l) {
                    sensorManager.registerListener(this.f19024n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f19013a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19016e = j3;
                if (!this.f19022l) {
                    sensorManager.registerListener(this.f19026p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19013a;
        if (sensorManager != null) {
            u0 u0Var = this.f19030t;
            t0 t0Var = this.f19028r;
            if (z10) {
                if (this.f19019i != null) {
                    kg.i0 i0Var = this.f19029s;
                    if (i0Var != null) {
                        org.telegram.messenger.g0.r(i0Var);
                        this.f19029s = null;
                    }
                    if (!this.f19022l && (sensor = this.f19019i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f19019i = null;
                }
                if (this.f19017f == null || this.f19018g == null) {
                    this.f19018g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f19017f = defaultSensor;
                    Sensor sensor2 = this.f19018g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f19022l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f19017f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f19017f != null || this.f19018g != null) {
                    kg.i0 i0Var2 = this.f19027q;
                    if (i0Var2 != null) {
                        org.telegram.messenger.g0.r(i0Var2);
                        this.f19027q = null;
                    }
                    if (!this.f19022l) {
                        Sensor sensor3 = this.f19018g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f19017f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f19018g = null;
                    this.f19017f = null;
                }
                if (this.f19019i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f19019i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f19020j = j3;
                    if (!this.f19022l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19013a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19014b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19022l) {
            sensorManager.unregisterListener(this.f19024n, sensor);
        }
        kg.i0 i0Var = this.f19023m;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19023m = null;
        }
        this.f19014b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19013a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19022l) {
            sensorManager.unregisterListener(this.f19026p, sensor);
        }
        kg.i0 i0Var = this.f19025o;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19025o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19013a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19018g;
        if (sensor == null && this.f19017f == null && this.f19019i == null) {
            return true;
        }
        if (!this.f19022l) {
            t0 t0Var = this.f19028r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f19017f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f19019i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19030t, sensor3);
            }
        }
        kg.i0 i0Var = this.f19027q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19027q = null;
        }
        kg.i0 i0Var2 = this.f19029s;
        if (i0Var2 != null) {
            org.telegram.messenger.g0.r(i0Var2);
            this.f19029s = null;
        }
        this.f19018g = null;
        this.f19017f = null;
        this.f19019i = null;
        return true;
    }
}
