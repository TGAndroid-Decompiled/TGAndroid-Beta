package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class v0 {
    public final SensorManager f19016a;
    public Sensor f19017b;
    public long f19018c;
    public Sensor d;
    public long f19019e;
    public Sensor f19020f;
    public Sensor f19021g;
    public long h;
    public Sensor f19022i;
    public long f19023j;
    public org.telegram.ui.web.s0 f19024k;
    public boolean f19025l;
    public kg.i0 f19026m;
    public kg.i0 f19028o;
    public kg.i0 f19030q;
    public kg.i0 f19032s;
    public final s0 f19027n = new s0(this, 0);
    public final s0 f19029p = new s0(this, 1);
    public final t0 f19031r = new t0(this);
    public final u0 f19033t = new u0(this);

    public v0(Context context) {
        this.f19016a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f19025l) {
            this.f19025l = true;
            SensorManager sensorManager = this.f19016a;
            if (sensorManager != null) {
                Sensor sensor = this.f19017b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f19027n, sensor);
                }
                kg.i0 i0Var = this.f19026m;
                if (i0Var != null) {
                    org.telegram.messenger.g0.r(i0Var);
                    this.f19026m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f19029p, sensor2);
                }
                kg.i0 i0Var2 = this.f19028o;
                if (i0Var2 != null) {
                    org.telegram.messenger.g0.r(i0Var2);
                    this.f19028o = null;
                }
                Sensor sensor3 = this.f19021g;
                t0 t0Var = this.f19031r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f19020f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                kg.i0 i0Var3 = this.f19030q;
                if (i0Var3 != null) {
                    org.telegram.messenger.g0.r(i0Var3);
                    this.f19030q = null;
                }
                Sensor sensor5 = this.f19022i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f19033t, sensor5);
                }
                kg.i0 i0Var4 = this.f19032s;
                if (i0Var4 != null) {
                    org.telegram.messenger.g0.r(i0Var4);
                    this.f19032s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f19016a;
        if (sensorManager != null) {
            if (this.f19017b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f19017b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19018c = j3;
                if (!this.f19025l) {
                    sensorManager.registerListener(this.f19027n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f19016a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19019e = j3;
                if (!this.f19025l) {
                    sensorManager.registerListener(this.f19029p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19016a;
        if (sensorManager != null) {
            u0 u0Var = this.f19033t;
            t0 t0Var = this.f19031r;
            if (z10) {
                if (this.f19022i != null) {
                    kg.i0 i0Var = this.f19032s;
                    if (i0Var != null) {
                        org.telegram.messenger.g0.r(i0Var);
                        this.f19032s = null;
                    }
                    if (!this.f19025l && (sensor = this.f19022i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f19022i = null;
                }
                if (this.f19020f == null || this.f19021g == null) {
                    this.f19021g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f19020f = defaultSensor;
                    Sensor sensor2 = this.f19021g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f19025l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f19020f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f19020f != null || this.f19021g != null) {
                    kg.i0 i0Var2 = this.f19030q;
                    if (i0Var2 != null) {
                        org.telegram.messenger.g0.r(i0Var2);
                        this.f19030q = null;
                    }
                    if (!this.f19025l) {
                        Sensor sensor3 = this.f19021g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f19020f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f19021g = null;
                    this.f19020f = null;
                }
                if (this.f19022i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f19022i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f19023j = j3;
                    if (!this.f19025l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19017b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19025l) {
            sensorManager.unregisterListener(this.f19027n, sensor);
        }
        kg.i0 i0Var = this.f19026m;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19026m = null;
        }
        this.f19017b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19025l) {
            sensorManager.unregisterListener(this.f19029p, sensor);
        }
        kg.i0 i0Var = this.f19028o;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19028o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19021g;
        if (sensor == null && this.f19020f == null && this.f19022i == null) {
            return true;
        }
        if (!this.f19025l) {
            t0 t0Var = this.f19031r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f19020f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f19022i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19033t, sensor3);
            }
        }
        kg.i0 i0Var = this.f19030q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            this.f19030q = null;
        }
        kg.i0 i0Var2 = this.f19032s;
        if (i0Var2 != null) {
            org.telegram.messenger.g0.r(i0Var2);
            this.f19032s = null;
        }
        this.f19021g = null;
        this.f19020f = null;
        this.f19022i = null;
        return true;
    }
}
