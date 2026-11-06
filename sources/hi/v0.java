package hi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import fi.h9;
public final class v0 {
    public final SensorManager f14979a;
    public Sensor f14980b;
    public long f14981c;
    public Sensor d;
    public long f14982e;
    public Sensor f14983f;
    public Sensor f14984g;
    public long h;
    public Sensor f14985i;
    public long f14986j;
    public org.telegram.ui.web.u0 f14987k;
    public boolean f14988l;
    public h9 f14989m;
    public h9 f14991o;
    public h9 f14993q;
    public h9 f14995s;
    public final s0 f14990n = new s0(this, 0);
    public final s0 f14992p = new s0(this, 1);
    public final t0 f14994r = new t0(this);
    public final u0 f14996t = new u0(this);

    public v0(Context context) {
        this.f14979a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f14988l) {
            this.f14988l = true;
            SensorManager sensorManager = this.f14979a;
            if (sensorManager != null) {
                Sensor sensor = this.f14980b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f14990n, sensor);
                }
                h9 h9Var = this.f14989m;
                if (h9Var != null) {
                    org.telegram.messenger.g0.r(h9Var);
                    this.f14989m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f14992p, sensor2);
                }
                h9 h9Var2 = this.f14991o;
                if (h9Var2 != null) {
                    org.telegram.messenger.g0.r(h9Var2);
                    this.f14991o = null;
                }
                Sensor sensor3 = this.f14984g;
                t0 t0Var = this.f14994r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f14983f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                h9 h9Var3 = this.f14993q;
                if (h9Var3 != null) {
                    org.telegram.messenger.g0.r(h9Var3);
                    this.f14993q = null;
                }
                Sensor sensor5 = this.f14985i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f14996t, sensor5);
                }
                h9 h9Var4 = this.f14995s;
                if (h9Var4 != null) {
                    org.telegram.messenger.g0.r(h9Var4);
                    this.f14995s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f14979a;
        if (sensorManager != null) {
            if (this.f14980b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f14980b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14981c = j3;
                if (!this.f14988l) {
                    sensorManager.registerListener(this.f14990n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f14979a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f14982e = j3;
                if (!this.f14988l) {
                    sensorManager.registerListener(this.f14992p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z9) {
        Sensor sensor;
        SensorManager sensorManager = this.f14979a;
        if (sensorManager != null) {
            u0 u0Var = this.f14996t;
            t0 t0Var = this.f14994r;
            if (z9) {
                if (this.f14985i != null) {
                    h9 h9Var = this.f14995s;
                    if (h9Var != null) {
                        org.telegram.messenger.g0.r(h9Var);
                        this.f14995s = null;
                    }
                    if (!this.f14988l && (sensor = this.f14985i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f14985i = null;
                }
                if (this.f14983f == null || this.f14984g == null) {
                    this.f14984g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f14983f = defaultSensor;
                    Sensor sensor2 = this.f14984g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f14988l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j3));
                            sensorManager.registerListener(t0Var, this.f14983f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f14983f != null || this.f14984g != null) {
                    h9 h9Var2 = this.f14993q;
                    if (h9Var2 != null) {
                        org.telegram.messenger.g0.r(h9Var2);
                        this.f14993q = null;
                    }
                    if (!this.f14988l) {
                        Sensor sensor3 = this.f14984g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f14983f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f14984g = null;
                    this.f14983f = null;
                }
                if (this.f14985i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f14985i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f14986j = j3;
                    if (!this.f14988l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f14979a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14980b;
        if (sensor == null) {
            return true;
        }
        if (!this.f14988l) {
            sensorManager.unregisterListener(this.f14990n, sensor);
        }
        h9 h9Var = this.f14989m;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14989m = null;
        }
        this.f14980b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f14979a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f14988l) {
            sensorManager.unregisterListener(this.f14992p, sensor);
        }
        h9 h9Var = this.f14991o;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14991o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f14979a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f14984g;
        if (sensor == null && this.f14983f == null && this.f14985i == null) {
            return true;
        }
        if (!this.f14988l) {
            t0 t0Var = this.f14994r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f14983f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f14985i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f14996t, sensor3);
            }
        }
        h9 h9Var = this.f14993q;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.f14993q = null;
        }
        h9 h9Var2 = this.f14995s;
        if (h9Var2 != null) {
            org.telegram.messenger.g0.r(h9Var2);
            this.f14995s = null;
        }
        this.f14984g = null;
        this.f14983f = null;
        this.f14985i = null;
        return true;
    }
}
