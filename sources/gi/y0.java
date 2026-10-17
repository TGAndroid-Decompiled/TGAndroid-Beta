package gi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f11549a;
    public Sensor f11550b;
    public long f11551c;
    public Sensor d;
    public long e;
    public Sensor f11552f;
    public Sensor f11553g;
    public long h;
    public Sensor f11554i;
    public long f11555j;
    public org.telegram.ui.web.x0 f11556k;
    public boolean f11557l;
    public bc f11558m;
    public bc f11560o;
    public bc f11562q;
    public bc f11564s;
    public final v0 f11559n = new v0(this, 0);
    public final v0 f11561p = new v0(this, 1);
    public final w0 f11563r = new w0(this);
    public final x0 f11565t = new x0(this);

    public y0(Context context) {
        this.f11549a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f11557l) {
            this.f11557l = true;
            SensorManager sensorManager = this.f11549a;
            if (sensorManager != null) {
                Sensor sensor = this.f11550b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f11559n, sensor);
                }
                bc bcVar = this.f11558m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    this.f11558m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f11561p, sensor2);
                }
                bc bcVar2 = this.f11560o;
                if (bcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar2);
                    this.f11560o = null;
                }
                Sensor sensor3 = this.f11553g;
                w0 w0Var = this.f11563r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f11552f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                bc bcVar3 = this.f11562q;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    this.f11562q = null;
                }
                Sensor sensor5 = this.f11554i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f11565t, sensor5);
                }
                bc bcVar4 = this.f11564s;
                if (bcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar4);
                    this.f11564s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f11549a;
        if (sensorManager != null) {
            if (this.f11550b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f11550b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f11551c = j10;
                if (!this.f11557l) {
                    sensorManager.registerListener(this.f11559n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f11549a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f11557l) {
                    sensorManager.registerListener(this.f11561p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f11549a;
        if (sensorManager != null) {
            x0 x0Var = this.f11565t;
            w0 w0Var = this.f11563r;
            if (z10) {
                if (this.f11554i != null) {
                    bc bcVar = this.f11564s;
                    if (bcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar);
                        this.f11564s = null;
                    }
                    if (!this.f11557l && (sensor = this.f11554i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f11554i = null;
                }
                if (this.f11552f == null || this.f11553g == null) {
                    this.f11553g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f11552f = defaultSensor;
                    Sensor sensor2 = this.f11553g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f11557l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f11552f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f11552f != null || this.f11553g != null) {
                    bc bcVar2 = this.f11562q;
                    if (bcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar2);
                        this.f11562q = null;
                    }
                    if (!this.f11557l) {
                        Sensor sensor3 = this.f11553g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f11552f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f11553g = null;
                    this.f11552f = null;
                }
                if (this.f11554i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f11554i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f11555j = j10;
                    if (!this.f11557l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f11549a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11550b;
        if (sensor == null) {
            return true;
        }
        if (!this.f11557l) {
            sensorManager.unregisterListener(this.f11559n, sensor);
        }
        bc bcVar = this.f11558m;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11558m = null;
        }
        this.f11550b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f11549a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f11557l) {
            sensorManager.unregisterListener(this.f11561p, sensor);
        }
        bc bcVar = this.f11560o;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11560o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f11549a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11553g;
        if (sensor == null && this.f11552f == null && this.f11554i == null) {
            return true;
        }
        if (!this.f11557l) {
            w0 w0Var = this.f11563r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f11552f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f11554i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f11565t, sensor3);
            }
        }
        bc bcVar = this.f11562q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11562q = null;
        }
        bc bcVar2 = this.f11564s;
        if (bcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar2);
            this.f11564s = null;
        }
        this.f11553g = null;
        this.f11552f = null;
        this.f11554i = null;
        return true;
    }
}
