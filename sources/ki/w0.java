package ki;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class w0 {
    public final SensorManager f19006a;
    public Sensor f19007b;
    public long f19008c;
    public Sensor d;
    public long f19009e;
    public Sensor f19010f;
    public Sensor f19011g;
    public long h;
    public Sensor f19012i;
    public long f19013j;
    public org.telegram.ui.web.s0 f19014k;
    public boolean f19015l;
    public kg.j0 f19016m;
    public kg.j0 f19018o;
    public kg.j0 f19020q;
    public kg.j0 f19022s;
    public final t0 f19017n = new t0(this, 0);
    public final t0 f19019p = new t0(this, 1);
    public final u0 f19021r = new u0(this);
    public final v0 f19023t = new v0(this);

    public w0(Context context) {
        this.f19006a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f19015l) {
            this.f19015l = true;
            SensorManager sensorManager = this.f19006a;
            if (sensorManager != null) {
                Sensor sensor = this.f19007b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f19017n, sensor);
                }
                kg.j0 j0Var = this.f19016m;
                if (j0Var != null) {
                    org.telegram.messenger.g0.r(j0Var);
                    this.f19016m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f19019p, sensor2);
                }
                kg.j0 j0Var2 = this.f19018o;
                if (j0Var2 != null) {
                    org.telegram.messenger.g0.r(j0Var2);
                    this.f19018o = null;
                }
                Sensor sensor3 = this.f19011g;
                u0 u0Var = this.f19021r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(u0Var, sensor3);
                }
                Sensor sensor4 = this.f19010f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(u0Var, sensor4);
                }
                kg.j0 j0Var3 = this.f19020q;
                if (j0Var3 != null) {
                    org.telegram.messenger.g0.r(j0Var3);
                    this.f19020q = null;
                }
                Sensor sensor5 = this.f19012i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f19023t, sensor5);
                }
                kg.j0 j0Var4 = this.f19022s;
                if (j0Var4 != null) {
                    org.telegram.messenger.g0.r(j0Var4);
                    this.f19022s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f19006a;
        if (sensorManager != null) {
            if (this.f19007b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f19007b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19008c = j3;
                if (!this.f19015l) {
                    sensorManager.registerListener(this.f19017n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f19006a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f19009e = j3;
                if (!this.f19015l) {
                    sensorManager.registerListener(this.f19019p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19006a;
        if (sensorManager != null) {
            v0 v0Var = this.f19023t;
            u0 u0Var = this.f19021r;
            if (z10) {
                if (this.f19012i != null) {
                    kg.j0 j0Var = this.f19022s;
                    if (j0Var != null) {
                        org.telegram.messenger.g0.r(j0Var);
                        this.f19022s = null;
                    }
                    if (!this.f19015l && (sensor = this.f19012i) != null) {
                        sensorManager.unregisterListener(v0Var, sensor);
                    }
                    this.f19012i = null;
                }
                if (this.f19010f == null || this.f19011g == null) {
                    this.f19011g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f19010f = defaultSensor;
                    Sensor sensor2 = this.f19011g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f19015l) {
                            sensorManager.registerListener(u0Var, sensor2, a(j3));
                            sensorManager.registerListener(u0Var, this.f19010f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f19010f != null || this.f19011g != null) {
                    kg.j0 j0Var2 = this.f19020q;
                    if (j0Var2 != null) {
                        org.telegram.messenger.g0.r(j0Var2);
                        this.f19020q = null;
                    }
                    if (!this.f19015l) {
                        Sensor sensor3 = this.f19011g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(u0Var, sensor3);
                        }
                        Sensor sensor4 = this.f19010f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(u0Var, sensor4);
                        }
                    }
                    this.f19011g = null;
                    this.f19010f = null;
                }
                if (this.f19012i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f19012i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f19013j = j3;
                    if (!this.f19015l) {
                        sensorManager.registerListener(v0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19006a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19007b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19015l) {
            sensorManager.unregisterListener(this.f19017n, sensor);
        }
        kg.j0 j0Var = this.f19016m;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19016m = null;
        }
        this.f19007b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19006a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19015l) {
            sensorManager.unregisterListener(this.f19019p, sensor);
        }
        kg.j0 j0Var = this.f19018o;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19018o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19006a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19011g;
        if (sensor == null && this.f19010f == null && this.f19012i == null) {
            return true;
        }
        if (!this.f19015l) {
            u0 u0Var = this.f19021r;
            if (sensor != null) {
                sensorManager.unregisterListener(u0Var, sensor);
            }
            Sensor sensor2 = this.f19010f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(u0Var, sensor2);
            }
            Sensor sensor3 = this.f19012i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19023t, sensor3);
            }
        }
        kg.j0 j0Var = this.f19020q;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f19020q = null;
        }
        kg.j0 j0Var2 = this.f19022s;
        if (j0Var2 != null) {
            org.telegram.messenger.g0.r(j0Var2);
            this.f19022s = null;
        }
        this.f19011g = null;
        this.f19010f = null;
        this.f19012i = null;
        return true;
    }
}
