package gi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f11551a;
    public Sensor f11552b;
    public long f11553c;
    public Sensor d;
    public long e;
    public Sensor f11554f;
    public Sensor f11555g;
    public long h;
    public Sensor f11556i;
    public long f11557j;
    public org.telegram.ui.web.x0 f11558k;
    public boolean f11559l;
    public bc f11560m;
    public bc f11562o;
    public bc f11564q;
    public bc f11566s;
    public final v0 f11561n = new v0(this, 0);
    public final v0 f11563p = new v0(this, 1);
    public final w0 f11565r = new w0(this);
    public final x0 f11567t = new x0(this);

    public y0(Context context) {
        this.f11551a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f11559l) {
            this.f11559l = true;
            SensorManager sensorManager = this.f11551a;
            if (sensorManager != null) {
                Sensor sensor = this.f11552b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f11561n, sensor);
                }
                bc bcVar = this.f11560m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    this.f11560m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f11563p, sensor2);
                }
                bc bcVar2 = this.f11562o;
                if (bcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar2);
                    this.f11562o = null;
                }
                Sensor sensor3 = this.f11555g;
                w0 w0Var = this.f11565r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f11554f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                bc bcVar3 = this.f11564q;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    this.f11564q = null;
                }
                Sensor sensor5 = this.f11556i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f11567t, sensor5);
                }
                bc bcVar4 = this.f11566s;
                if (bcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar4);
                    this.f11566s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f11551a;
        if (sensorManager != null) {
            if (this.f11552b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f11552b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f11553c = j10;
                if (!this.f11559l) {
                    sensorManager.registerListener(this.f11561n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f11551a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f11559l) {
                    sensorManager.registerListener(this.f11563p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f11551a;
        if (sensorManager != null) {
            x0 x0Var = this.f11567t;
            w0 w0Var = this.f11565r;
            if (z10) {
                if (this.f11556i != null) {
                    bc bcVar = this.f11566s;
                    if (bcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar);
                        this.f11566s = null;
                    }
                    if (!this.f11559l && (sensor = this.f11556i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f11556i = null;
                }
                if (this.f11554f == null || this.f11555g == null) {
                    this.f11555g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f11554f = defaultSensor;
                    Sensor sensor2 = this.f11555g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f11559l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f11554f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f11554f != null || this.f11555g != null) {
                    bc bcVar2 = this.f11564q;
                    if (bcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar2);
                        this.f11564q = null;
                    }
                    if (!this.f11559l) {
                        Sensor sensor3 = this.f11555g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f11554f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f11555g = null;
                    this.f11554f = null;
                }
                if (this.f11556i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f11556i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f11557j = j10;
                    if (!this.f11559l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f11551a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11552b;
        if (sensor == null) {
            return true;
        }
        if (!this.f11559l) {
            sensorManager.unregisterListener(this.f11561n, sensor);
        }
        bc bcVar = this.f11560m;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11560m = null;
        }
        this.f11552b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f11551a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f11559l) {
            sensorManager.unregisterListener(this.f11563p, sensor);
        }
        bc bcVar = this.f11562o;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11562o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f11551a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11555g;
        if (sensor == null && this.f11554f == null && this.f11556i == null) {
            return true;
        }
        if (!this.f11559l) {
            w0 w0Var = this.f11565r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f11554f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f11556i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f11567t, sensor3);
            }
        }
        bc bcVar = this.f11564q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11564q = null;
        }
        bc bcVar2 = this.f11566s;
        if (bcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar2);
            this.f11566s = null;
        }
        this.f11555g = null;
        this.f11554f = null;
        this.f11556i = null;
        return true;
    }
}
