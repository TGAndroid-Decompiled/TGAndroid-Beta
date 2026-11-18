package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class w0 {
    public final SensorManager f19003a;
    public Sensor f19004b;
    public long f19005c;
    public Sensor d;
    public long f19006e;
    public Sensor f19007f;
    public Sensor f19008g;
    public long h;
    public Sensor f19009i;
    public long f19010j;
    public org.telegram.ui.web.s0 f19011k;
    public boolean f19012l;
    public kg.j0 f19013m;
    public kg.j0 f19015o;
    public kg.j0 f19017q;
    public kg.j0 f19019s;
    public final t0 f19014n = new t0(this, 0);
    public final t0 f19016p = new t0(this, 1);
    public final u0 f19018r = new u0(this);
    public final v0 f19020t = new v0(this);

    public w0(Context context) {
        this.f19003a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f19012l) {
            this.f19012l = true;
            SensorManager sensorManager = this.f19003a;
            if (sensorManager != null) {
                Sensor sensor = this.f19004b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f19014n, sensor);
                }
                kg.j0 j0Var = this.f19013m;
                if (j0Var != null) {
                    org.telegram.messenger.g0.r(j0Var);
                    this.f19013m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f19016p, sensor2);
                }
                kg.j0 j0Var2 = this.f19015o;
                if (j0Var2 != null) {
                    org.telegram.messenger.g0.r(j0Var2);
                    this.f19015o = null;
                }
                Sensor sensor3 = this.f19008g;
                u0 u0Var = this.f19018r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(u0Var, sensor3);
                }
                Sensor sensor4 = this.f19007f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(u0Var, sensor4);
                }
                kg.j0 j0Var3 = this.f19017q;
                if (j0Var3 != null) {
                    org.telegram.messenger.g0.r(j0Var3);
                    this.f19017q = null;
                }
                Sensor sensor5 = this.f19009i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f19020t, sensor5);
                }
                kg.j0 j0Var4 = this.f19019s;
                if (j0Var4 != null) {
                    org.telegram.messenger.g0.r(j0Var4);
                    this.f19019s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f19003a;
        if (sensorManager != null) {
            if (this.f19004b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f19004b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19005c = j3;
                if (!this.f19012l) {
                    sensorManager.registerListener(this.f19014n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f19003a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19006e = j3;
                if (!this.f19012l) {
                    sensorManager.registerListener(this.f19016p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19003a;
        if (sensorManager != null) {
            v0 v0Var = this.f19020t;
            u0 u0Var = this.f19018r;
            if (z10) {
                if (this.f19009i != null) {
                    kg.j0 j0Var = this.f19019s;
                    if (j0Var != null) {
                        org.telegram.messenger.g0.r(j0Var);
                        this.f19019s = null;
                    }
                    if (!this.f19012l && (sensor = this.f19009i) != null) {
                        sensorManager.unregisterListener(v0Var, sensor);
                    }
                    this.f19009i = null;
                }
                if (this.f19007f == null || this.f19008g == null) {
                    this.f19008g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f19007f = defaultSensor;
                    Sensor sensor2 = this.f19008g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f19012l) {
                            sensorManager.registerListener(u0Var, sensor2, a(j3));
                            sensorManager.registerListener(u0Var, this.f19007f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f19007f != null || this.f19008g != null) {
                    kg.j0 j0Var2 = this.f19017q;
                    if (j0Var2 != null) {
                        org.telegram.messenger.g0.r(j0Var2);
                        this.f19017q = null;
                    }
                    if (!this.f19012l) {
                        Sensor sensor3 = this.f19008g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(u0Var, sensor3);
                        }
                        Sensor sensor4 = this.f19007f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(u0Var, sensor4);
                        }
                    }
                    this.f19008g = null;
                    this.f19007f = null;
                }
                if (this.f19009i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f19009i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f19010j = j3;
                    if (!this.f19012l) {
                        sensorManager.registerListener(v0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19003a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19004b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19012l) {
            sensorManager.unregisterListener(this.f19014n, sensor);
        }
        kg.j0 j0Var = this.f19013m;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19013m = null;
        }
        this.f19004b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19003a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19012l) {
            sensorManager.unregisterListener(this.f19016p, sensor);
        }
        kg.j0 j0Var = this.f19015o;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19015o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19003a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19008g;
        if (sensor == null && this.f19007f == null && this.f19009i == null) {
            return true;
        }
        if (!this.f19012l) {
            u0 u0Var = this.f19018r;
            if (sensor != null) {
                sensorManager.unregisterListener(u0Var, sensor);
            }
            Sensor sensor2 = this.f19007f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(u0Var, sensor2);
            }
            Sensor sensor3 = this.f19009i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19020t, sensor3);
            }
        }
        kg.j0 j0Var = this.f19017q;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19017q = null;
        }
        kg.j0 j0Var2 = this.f19019s;
        if (j0Var2 != null) {
            org.telegram.messenger.g0.r(j0Var2);
            this.f19019s = null;
        }
        this.f19008g = null;
        this.f19007f = null;
        this.f19009i = null;
        return true;
    }
}
