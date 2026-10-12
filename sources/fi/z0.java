package fi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import di.x8;
import org.telegram.messenger.AndroidUtilities;
public final class z0 {
    public final SensorManager f9684a;
    public Sensor f9685b;
    public long f9686c;
    public Sensor d;
    public long e;
    public Sensor f9687f;
    public Sensor f9688g;
    public long h;
    public Sensor f9689i;
    public long f9690j;
    public org.telegram.ui.web.y0 f9691k;
    public boolean f9692l;
    public x8 f9693m;
    public x8 f9695o;
    public x8 f9697q;
    public x8 f9699s;
    public final w0 f9694n = new w0(this, 0);
    public final w0 f9696p = new w0(this, 1);
    public final x0 f9698r = new x0(this);
    public final y0 f9700t = new y0(this);

    public z0(Context context) {
        this.f9684a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        if (j10 >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.f9692l) {
            this.f9692l = true;
            SensorManager sensorManager = this.f9684a;
            if (sensorManager != null) {
                Sensor sensor = this.f9685b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f9694n, sensor);
                }
                x8 x8Var = this.f9693m;
                if (x8Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var);
                    this.f9693m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f9696p, sensor2);
                }
                x8 x8Var2 = this.f9695o;
                if (x8Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var2);
                    this.f9695o = null;
                }
                Sensor sensor3 = this.f9688g;
                x0 x0Var = this.f9698r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(x0Var, sensor3);
                }
                Sensor sensor4 = this.f9687f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(x0Var, sensor4);
                }
                x8 x8Var3 = this.f9697q;
                if (x8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var3);
                    this.f9697q = null;
                }
                Sensor sensor5 = this.f9689i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f9700t, sensor5);
                }
                x8 x8Var4 = this.f9699s;
                if (x8Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var4);
                    this.f9699s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f9684a;
        if (sensorManager != null) {
            if (this.f9685b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f9685b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9686c = j10;
                if (!this.f9692l) {
                    sensorManager.registerListener(this.f9694n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f9684a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f9692l) {
                    sensorManager.registerListener(this.f9696p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f9684a;
        if (sensorManager != null) {
            y0 y0Var = this.f9700t;
            x0 x0Var = this.f9698r;
            if (z10) {
                if (this.f9689i != null) {
                    x8 x8Var = this.f9699s;
                    if (x8Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(x8Var);
                        this.f9699s = null;
                    }
                    if (!this.f9692l && (sensor = this.f9689i) != null) {
                        sensorManager.unregisterListener(y0Var, sensor);
                    }
                    this.f9689i = null;
                }
                if (this.f9687f == null || this.f9688g == null) {
                    this.f9688g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f9687f = defaultSensor;
                    Sensor sensor2 = this.f9688g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f9692l) {
                            sensorManager.registerListener(x0Var, sensor2, a(j10));
                            sensorManager.registerListener(x0Var, this.f9687f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f9687f != null || this.f9688g != null) {
                    x8 x8Var2 = this.f9697q;
                    if (x8Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(x8Var2);
                        this.f9697q = null;
                    }
                    if (!this.f9692l) {
                        Sensor sensor3 = this.f9688g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(x0Var, sensor3);
                        }
                        Sensor sensor4 = this.f9687f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(x0Var, sensor4);
                        }
                    }
                    this.f9688g = null;
                    this.f9687f = null;
                }
                if (this.f9689i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f9689i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f9690j = j10;
                    if (!this.f9692l) {
                        sensorManager.registerListener(y0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f9684a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9685b;
        if (sensor == null) {
            return true;
        }
        if (!this.f9692l) {
            sensorManager.unregisterListener(this.f9694n, sensor);
        }
        x8 x8Var = this.f9693m;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9693m = null;
        }
        this.f9685b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f9684a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f9692l) {
            sensorManager.unregisterListener(this.f9696p, sensor);
        }
        x8 x8Var = this.f9695o;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9695o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f9684a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9688g;
        if (sensor == null && this.f9687f == null && this.f9689i == null) {
            return true;
        }
        if (!this.f9692l) {
            x0 x0Var = this.f9698r;
            if (sensor != null) {
                sensorManager.unregisterListener(x0Var, sensor);
            }
            Sensor sensor2 = this.f9687f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(x0Var, sensor2);
            }
            Sensor sensor3 = this.f9689i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f9700t, sensor3);
            }
        }
        x8 x8Var = this.f9697q;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9697q = null;
        }
        x8 x8Var2 = this.f9699s;
        if (x8Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var2);
            this.f9699s = null;
        }
        this.f9688g = null;
        this.f9687f = null;
        this.f9689i = null;
        return true;
    }
}
