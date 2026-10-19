package gi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f11550a;
    public Sensor f11551b;
    public long f11552c;
    public Sensor d;
    public long e;
    public Sensor f11553f;
    public Sensor f11554g;
    public long h;
    public Sensor f11555i;
    public long f11556j;
    public org.telegram.ui.web.x0 f11557k;
    public boolean f11558l;
    public bc f11559m;
    public bc f11561o;
    public bc f11563q;
    public bc f11565s;
    public final v0 f11560n = new v0(this, 0);
    public final v0 f11562p = new v0(this, 1);
    public final w0 f11564r = new w0(this);
    public final x0 f11566t = new x0(this);

    public y0(Context context) {
        this.f11550a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f11558l) {
            this.f11558l = true;
            SensorManager sensorManager = this.f11550a;
            if (sensorManager != null) {
                Sensor sensor = this.f11551b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f11560n, sensor);
                }
                bc bcVar = this.f11559m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    this.f11559m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f11562p, sensor2);
                }
                bc bcVar2 = this.f11561o;
                if (bcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar2);
                    this.f11561o = null;
                }
                Sensor sensor3 = this.f11554g;
                w0 w0Var = this.f11564r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f11553f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                bc bcVar3 = this.f11563q;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    this.f11563q = null;
                }
                Sensor sensor5 = this.f11555i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f11566t, sensor5);
                }
                bc bcVar4 = this.f11565s;
                if (bcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar4);
                    this.f11565s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f11550a;
        if (sensorManager != null) {
            if (this.f11551b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f11551b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f11552c = j10;
                if (!this.f11558l) {
                    sensorManager.registerListener(this.f11560n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f11550a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f11558l) {
                    sensorManager.registerListener(this.f11562p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f11550a;
        if (sensorManager != null) {
            x0 x0Var = this.f11566t;
            w0 w0Var = this.f11564r;
            if (z10) {
                if (this.f11555i != null) {
                    bc bcVar = this.f11565s;
                    if (bcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar);
                        this.f11565s = null;
                    }
                    if (!this.f11558l && (sensor = this.f11555i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f11555i = null;
                }
                if (this.f11553f == null || this.f11554g == null) {
                    this.f11554g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f11553f = defaultSensor;
                    Sensor sensor2 = this.f11554g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f11558l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f11553f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f11553f != null || this.f11554g != null) {
                    bc bcVar2 = this.f11563q;
                    if (bcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar2);
                        this.f11563q = null;
                    }
                    if (!this.f11558l) {
                        Sensor sensor3 = this.f11554g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f11553f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f11554g = null;
                    this.f11553f = null;
                }
                if (this.f11555i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f11555i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f11556j = j10;
                    if (!this.f11558l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f11550a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11551b;
        if (sensor == null) {
            return true;
        }
        if (!this.f11558l) {
            sensorManager.unregisterListener(this.f11560n, sensor);
        }
        bc bcVar = this.f11559m;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11559m = null;
        }
        this.f11551b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f11550a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f11558l) {
            sensorManager.unregisterListener(this.f11562p, sensor);
        }
        bc bcVar = this.f11561o;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11561o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f11550a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11554g;
        if (sensor == null && this.f11553f == null && this.f11555i == null) {
            return true;
        }
        if (!this.f11558l) {
            w0 w0Var = this.f11564r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f11553f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f11555i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f11566t, sensor3);
            }
        }
        bc bcVar = this.f11563q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11563q = null;
        }
        bc bcVar2 = this.f11565s;
        if (bcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar2);
            this.f11565s = null;
        }
        this.f11554g = null;
        this.f11553f = null;
        this.f11555i = null;
        return true;
    }
}
