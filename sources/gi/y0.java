package gi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f11575a;
    public Sensor f11576b;
    public long f11577c;
    public Sensor d;
    public long e;
    public Sensor f11578f;
    public Sensor f11579g;
    public long h;
    public Sensor f11580i;
    public long f11581j;
    public org.telegram.ui.web.y0 f11582k;
    public boolean f11583l;
    public bc f11584m;
    public bc f11586o;
    public bc f11588q;
    public bc f11590s;
    public final v0 f11585n = new v0(this, 0);
    public final v0 f11587p = new v0(this, 1);
    public final w0 f11589r = new w0(this);
    public final x0 f11591t = new x0(this);

    public y0(Context context) {
        this.f11575a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f11583l) {
            this.f11583l = true;
            SensorManager sensorManager = this.f11575a;
            if (sensorManager != null) {
                Sensor sensor = this.f11576b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f11585n, sensor);
                }
                bc bcVar = this.f11584m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    this.f11584m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f11587p, sensor2);
                }
                bc bcVar2 = this.f11586o;
                if (bcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar2);
                    this.f11586o = null;
                }
                Sensor sensor3 = this.f11579g;
                w0 w0Var = this.f11589r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f11578f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                bc bcVar3 = this.f11588q;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    this.f11588q = null;
                }
                Sensor sensor5 = this.f11580i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f11591t, sensor5);
                }
                bc bcVar4 = this.f11590s;
                if (bcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar4);
                    this.f11590s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f11575a;
        if (sensorManager != null) {
            if (this.f11576b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f11576b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f11577c = j10;
                if (!this.f11583l) {
                    sensorManager.registerListener(this.f11585n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f11575a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f11583l) {
                    sensorManager.registerListener(this.f11587p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f11575a;
        if (sensorManager != null) {
            x0 x0Var = this.f11591t;
            w0 w0Var = this.f11589r;
            if (z10) {
                if (this.f11580i != null) {
                    bc bcVar = this.f11590s;
                    if (bcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar);
                        this.f11590s = null;
                    }
                    if (!this.f11583l && (sensor = this.f11580i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f11580i = null;
                }
                if (this.f11578f == null || this.f11579g == null) {
                    this.f11579g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f11578f = defaultSensor;
                    Sensor sensor2 = this.f11579g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f11583l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f11578f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f11578f != null || this.f11579g != null) {
                    bc bcVar2 = this.f11588q;
                    if (bcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(bcVar2);
                        this.f11588q = null;
                    }
                    if (!this.f11583l) {
                        Sensor sensor3 = this.f11579g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f11578f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f11579g = null;
                    this.f11578f = null;
                }
                if (this.f11580i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f11580i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f11581j = j10;
                    if (!this.f11583l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f11575a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11576b;
        if (sensor == null) {
            return true;
        }
        if (!this.f11583l) {
            sensorManager.unregisterListener(this.f11585n, sensor);
        }
        bc bcVar = this.f11584m;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11584m = null;
        }
        this.f11576b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f11575a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f11583l) {
            sensorManager.unregisterListener(this.f11587p, sensor);
        }
        bc bcVar = this.f11586o;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11586o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f11575a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f11579g;
        if (sensor == null && this.f11578f == null && this.f11580i == null) {
            return true;
        }
        if (!this.f11583l) {
            w0 w0Var = this.f11589r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f11578f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f11580i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f11591t, sensor3);
            }
        }
        bc bcVar = this.f11588q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            this.f11588q = null;
        }
        bc bcVar2 = this.f11590s;
        if (bcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar2);
            this.f11590s = null;
        }
        this.f11579g = null;
        this.f11578f = null;
        this.f11580i = null;
        return true;
    }
}
