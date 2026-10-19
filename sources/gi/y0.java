package gi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f11548a;
    public Sensor f11549b;
    public long f11550c;
    public Sensor d;
    public long e;
    public Sensor f11551f;
    public Sensor f11552g;
    public long h;
    public Sensor f11553i;
    public long f11554j;
    public org.telegram.ui.web.x0 f11555k;
    public boolean f11556l;
    public bc f11557m;
    public bc f11559o;
    public bc f11561q;
    public bc f11563s;
    public final v0 f11558n = new v0(this, 0);
    public final v0 f11560p = new v0(this, 1);
    public final w0 f11562r = new w0(this);
    public final x0 f11564t = new x0(this);

    public y0(Context context) {
        this.f11548a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f11556l) {
            this.f11556l = true;
            SensorManager sensorManager = this.f11548a;
            if (sensorManager != null) {
                Sensor sensor = this.f11549b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f11558n, sensor);
                }
                bc bcVar = this.f11557m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    this.f11557m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f11560p, sensor2);
                }
                bc bcVar2 = this.f11559o;
                if (bcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar2);
                    this.f11559o = null;
                }
                Sensor sensor3 = this.f11552g;
                w0 w0Var = this.f11562r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f11551f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                bc bcVar3 = this.f11561q;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    this.f11561q = null;
                }
                Sensor sensor5 = this.f11553i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f11564t, sensor5);
                }
                bc bcVar4 = this.f11563s;
                if (bcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar4);
                    this.f11563s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f11548a;
        if (sensorManager != null) {
            if (this.f11549b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f11549b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f11550c = j10;
                if (!this.f11556l) {
                    sensorManager.registerListener(this.f11558n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f11548a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f11556l) {
                    sensorManager.registerListener(this.f11560p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f11548a;
        if (sensorManager != null) {
            x0 x0Var = this.f11564t;
            w0 w0Var = this.f11562r;
            if (z10) {
                if (this.f11553i != null) {
                    bc bcVar = this.f11563s;
                    if (bcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar);
                        this.f11563s = null;
                    }
                    if (!this.f11556l && (sensor = this.f11553i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f11553i = null;
                }
                if (this.f11551f == null || this.f11552g == null) {
                    this.f11552g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f11551f = defaultSensor;
                    Sensor sensor2 = this.f11552g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f11556l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f11551f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f11551f != null || this.f11552g != null) {
                    bc bcVar2 = this.f11561q;
                    if (bcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar2);
                        this.f11561q = null;
                    }
                    if (!this.f11556l) {
                        Sensor sensor3 = this.f11552g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f11551f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f11552g = null;
                    this.f11551f = null;
                }
                if (this.f11553i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f11553i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f11554j = j10;
                    if (!this.f11556l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f11548a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11549b;
        if (sensor == null) {
            return true;
        }
        if (!this.f11556l) {
            sensorManager.unregisterListener(this.f11558n, sensor);
        }
        bc bcVar = this.f11557m;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11557m = null;
        }
        this.f11549b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f11548a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f11556l) {
            sensorManager.unregisterListener(this.f11560p, sensor);
        }
        bc bcVar = this.f11559o;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11559o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f11548a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11552g;
        if (sensor == null && this.f11551f == null && this.f11553i == null) {
            return true;
        }
        if (!this.f11556l) {
            w0 w0Var = this.f11562r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f11551f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f11553i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f11564t, sensor3);
            }
        }
        bc bcVar = this.f11561q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11561q = null;
        }
        bc bcVar2 = this.f11563s;
        if (bcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar2);
            this.f11563s = null;
        }
        this.f11552g = null;
        this.f11551f = null;
        this.f11553i = null;
        return true;
    }
}
