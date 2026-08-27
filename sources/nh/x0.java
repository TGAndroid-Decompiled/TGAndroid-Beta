package nh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;

public final class x0 {

    public final SensorManager f19026a;

    public Sensor f19027b;

    public long f19028c;
    public Sensor d;

    public long f19029e;

    public Sensor f19030f;

    public Sensor f19031g;
    public long h;

    public Sensor f19032i;

    public long f19033j;

    public org.telegram.ui.web.w0 f19034k;

    public boolean f19035l;

    public f0 f19036m;

    public f0 f19038o;

    public f0 f19040q;

    public f0 f19042s;

    public final u0 f19037n = new u0(this, 0);

    public final u0 f19039p = new u0(this, 1);

    public final v0 f19041r = new v0(this);

    public final w0 f19043t = new w0(this);

    public x0(Context context) {
        this.f19026a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        return j10 >= 60 ? 2 : 1;
    }

    public final void b() {
        if (this.f19035l) {
            return;
        }
        this.f19035l = true;
        SensorManager sensorManager = this.f19026a;
        if (sensorManager != null) {
            Sensor sensor = this.f19027b;
            if (sensor != null) {
                sensorManager.unregisterListener(this.f19037n, sensor);
            }
            f0 f0Var = this.f19036m;
            if (f0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(f0Var);
                this.f19036m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.f19039p, sensor2);
            }
            f0 f0Var2 = this.f19038o;
            if (f0Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(f0Var2);
                this.f19038o = null;
            }
            Sensor sensor3 = this.f19031g;
            v0 v0Var = this.f19041r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(v0Var, sensor3);
            }
            Sensor sensor4 = this.f19030f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(v0Var, sensor4);
            }
            f0 f0Var3 = this.f19040q;
            if (f0Var3 != null) {
                AndroidUtilities.cancelRunOnUIThread(f0Var3);
                this.f19040q = null;
            }
            Sensor sensor5 = this.f19032i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.f19043t, sensor5);
            }
            f0 f0Var4 = this.f19042s;
            if (f0Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(f0Var4);
                this.f19042s = null;
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        if (this.f19027b == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.f19027b = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.f19028c = j10;
            if (!this.f19035l) {
                sensorManager.registerListener(this.f19037n, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        if (this.d == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.d = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.f19029e = j10;
            if (!this.f19035l) {
                sensorManager.registerListener(this.f19039p, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        w0 w0Var = this.f19043t;
        v0 v0Var = this.f19041r;
        if (z10) {
            if (this.f19032i != null) {
                f0 f0Var = this.f19042s;
                if (f0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var);
                    this.f19042s = null;
                }
                if (!this.f19035l && (sensor = this.f19032i) != null) {
                    sensorManager.unregisterListener(w0Var, sensor);
                }
                this.f19032i = null;
            }
            if (this.f19030f == null || this.f19031g == null) {
                this.f19031g = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.f19030f = defaultSensor;
                Sensor sensor2 = this.f19031g;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.h = j10;
                if (!this.f19035l) {
                    sensorManager.registerListener(v0Var, sensor2, a(j10));
                    sensorManager.registerListener(v0Var, this.f19030f, a(j10));
                    return true;
                }
            }
        } else {
            if (this.f19030f != null || this.f19031g != null) {
                f0 f0Var2 = this.f19040q;
                if (f0Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var2);
                    this.f19040q = null;
                }
                if (!this.f19035l) {
                    Sensor sensor3 = this.f19031g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(v0Var, sensor3);
                    }
                    Sensor sensor4 = this.f19030f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(v0Var, sensor4);
                    }
                }
                this.f19031g = null;
                this.f19030f = null;
            }
            if (this.f19032i == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.f19032i = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.f19033j = j10;
                if (!this.f19035l) {
                    sensorManager.registerListener(w0Var, defaultSensor2, a(j10));
                }
            }
        }
        return true;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19027b;
        if (sensor == null) {
            return true;
        }
        if (!this.f19035l) {
            sensorManager.unregisterListener(this.f19037n, sensor);
        }
        f0 f0Var = this.f19036m;
        if (f0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            this.f19036m = null;
        }
        this.f19027b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f19035l) {
            sensorManager.unregisterListener(this.f19039p, sensor);
        }
        f0 f0Var = this.f19038o;
        if (f0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            this.f19038o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f19026a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f19031g;
        if (sensor == null && this.f19030f == null && this.f19032i == null) {
            return true;
        }
        if (!this.f19035l) {
            v0 v0Var = this.f19041r;
            if (sensor != null) {
                sensorManager.unregisterListener(v0Var, sensor);
            }
            Sensor sensor2 = this.f19030f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(v0Var, sensor2);
            }
            Sensor sensor3 = this.f19032i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f19043t, sensor3);
            }
        }
        f0 f0Var = this.f19040q;
        if (f0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            this.f19040q = null;
        }
        f0 f0Var2 = this.f19042s;
        if (f0Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var2);
            this.f19042s = null;
        }
        this.f19031g = null;
        this.f19030f = null;
        this.f19032i = null;
        return true;
    }
}
