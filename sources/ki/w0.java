package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class w0 {
    public final SensorManager f18614a;
    public Sensor f18615b;
    public long f18616c;
    public Sensor d;
    public long f18617e;
    public Sensor f18618f;
    public Sensor f18619g;
    public long h;
    public Sensor f18620i;
    public long f18621j;
    public org.telegram.ui.web.s0 f18622k;
    public boolean f18623l;
    public kg.j1 f18624m;
    public kg.j1 f18626o;
    public kg.j1 f18628q;
    public kg.j1 f18630s;
    public final t0 f18625n = new t0(this, 0);
    public final t0 f18627p = new t0(this, 1);
    public final u0 f18629r = new u0(this);
    public final v0 f18631t = new v0(this);

    public w0(Context context) {
        this.f18614a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f18623l) {
            this.f18623l = true;
            SensorManager sensorManager = this.f18614a;
            if (sensorManager != null) {
                Sensor sensor = this.f18615b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f18625n, sensor);
                }
                kg.j1 j1Var = this.f18624m;
                if (j1Var != null) {
                    org.telegram.messenger.g0.r(j1Var);
                    this.f18624m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f18627p, sensor2);
                }
                kg.j1 j1Var2 = this.f18626o;
                if (j1Var2 != null) {
                    org.telegram.messenger.g0.r(j1Var2);
                    this.f18626o = null;
                }
                Sensor sensor3 = this.f18619g;
                u0 u0Var = this.f18629r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(u0Var, sensor3);
                }
                Sensor sensor4 = this.f18618f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(u0Var, sensor4);
                }
                kg.j1 j1Var3 = this.f18628q;
                if (j1Var3 != null) {
                    org.telegram.messenger.g0.r(j1Var3);
                    this.f18628q = null;
                }
                Sensor sensor5 = this.f18620i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f18631t, sensor5);
                }
                kg.j1 j1Var4 = this.f18630s;
                if (j1Var4 != null) {
                    org.telegram.messenger.g0.r(j1Var4);
                    this.f18630s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f18614a;
        if (sensorManager != null) {
            if (this.f18615b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f18615b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18616c = j3;
                if (!this.f18623l) {
                    sensorManager.registerListener(this.f18625n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f18614a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18617e = j3;
                if (!this.f18623l) {
                    sensorManager.registerListener(this.f18627p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f18614a;
        if (sensorManager != null) {
            v0 v0Var = this.f18631t;
            u0 u0Var = this.f18629r;
            if (z10) {
                if (this.f18620i != null) {
                    kg.j1 j1Var = this.f18630s;
                    if (j1Var != null) {
                        org.telegram.messenger.g0.r(j1Var);
                        this.f18630s = null;
                    }
                    if (!this.f18623l && (sensor = this.f18620i) != null) {
                        sensorManager.unregisterListener(v0Var, sensor);
                    }
                    this.f18620i = null;
                }
                if (this.f18618f == null || this.f18619g == null) {
                    this.f18619g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f18618f = defaultSensor;
                    Sensor sensor2 = this.f18619g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f18623l) {
                            sensorManager.registerListener(u0Var, sensor2, a(j3));
                            sensorManager.registerListener(u0Var, this.f18618f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f18618f != null || this.f18619g != null) {
                    kg.j1 j1Var2 = this.f18628q;
                    if (j1Var2 != null) {
                        org.telegram.messenger.g0.r(j1Var2);
                        this.f18628q = null;
                    }
                    if (!this.f18623l) {
                        Sensor sensor3 = this.f18619g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(u0Var, sensor3);
                        }
                        Sensor sensor4 = this.f18618f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(u0Var, sensor4);
                        }
                    }
                    this.f18619g = null;
                    this.f18618f = null;
                }
                if (this.f18620i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f18620i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f18621j = j3;
                    if (!this.f18623l) {
                        sensorManager.registerListener(v0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f18614a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18615b;
        if (sensor == null) {
            return true;
        }
        if (!this.f18623l) {
            sensorManager.unregisterListener(this.f18625n, sensor);
        }
        kg.j1 j1Var = this.f18624m;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            this.f18624m = null;
        }
        this.f18615b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f18614a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f18623l) {
            sensorManager.unregisterListener(this.f18627p, sensor);
        }
        kg.j1 j1Var = this.f18626o;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            this.f18626o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f18614a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18619g;
        if (sensor == null && this.f18618f == null && this.f18620i == null) {
            return true;
        }
        if (!this.f18623l) {
            u0 u0Var = this.f18629r;
            if (sensor != null) {
                sensorManager.unregisterListener(u0Var, sensor);
            }
            Sensor sensor2 = this.f18618f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(u0Var, sensor2);
            }
            Sensor sensor3 = this.f18620i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f18631t, sensor3);
            }
        }
        kg.j1 j1Var = this.f18628q;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            this.f18628q = null;
        }
        kg.j1 j1Var2 = this.f18630s;
        if (j1Var2 != null) {
            org.telegram.messenger.g0.r(j1Var2);
            this.f18630s = null;
        }
        this.f18619g = null;
        this.f18618f = null;
        this.f18620i = null;
        return true;
    }
}
