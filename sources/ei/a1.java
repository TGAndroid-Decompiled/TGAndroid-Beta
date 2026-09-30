package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8211a;
    public Sensor f8212b;
    public long f8213c;
    public Sensor d;
    public long e;
    public Sensor f8214f;
    public Sensor f8215g;
    public long h;
    public Sensor f8216i;
    public long f8217j;
    public org.telegram.ui.web.y0 f8218k;
    public boolean f8219l;
    public rc f8220m;
    public rc f8222o;
    public rc f8224q;
    public rc f8226s;
    public final x0 f8221n = new x0(this, 0);
    public final x0 f8223p = new x0(this, 1);
    public final y0 f8225r = new y0(this);
    public final z0 f8227t = new z0(this);

    public a1(Context context) {
        this.f8211a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8219l) {
            this.f8219l = true;
            SensorManager sensorManager = this.f8211a;
            if (sensorManager != null) {
                Sensor sensor = this.f8212b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8221n, sensor);
                }
                rc rcVar = this.f8220m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8220m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8223p, sensor2);
                }
                rc rcVar2 = this.f8222o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8222o = null;
                }
                Sensor sensor3 = this.f8215g;
                y0 y0Var = this.f8225r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8214f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8224q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8224q = null;
                }
                Sensor sensor5 = this.f8216i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8227t, sensor5);
                }
                rc rcVar4 = this.f8226s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8226s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8211a;
        if (sensorManager != null) {
            if (this.f8212b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8212b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8213c = j3;
                if (!this.f8219l) {
                    sensorManager.registerListener(this.f8221n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8211a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8219l) {
                    sensorManager.registerListener(this.f8223p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8211a;
        if (sensorManager != null) {
            z0 z0Var = this.f8227t;
            y0 y0Var = this.f8225r;
            if (z10) {
                if (this.f8216i != null) {
                    rc rcVar = this.f8226s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8226s = null;
                    }
                    if (!this.f8219l && (sensor = this.f8216i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8216i = null;
                }
                if (this.f8214f == null || this.f8215g == null) {
                    this.f8215g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8214f = defaultSensor;
                    Sensor sensor2 = this.f8215g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8219l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8214f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8214f != null || this.f8215g != null) {
                    rc rcVar2 = this.f8224q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8224q = null;
                    }
                    if (!this.f8219l) {
                        Sensor sensor3 = this.f8215g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8214f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8215g = null;
                    this.f8214f = null;
                }
                if (this.f8216i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8216i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8217j = j3;
                    if (!this.f8219l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8212b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8219l) {
            sensorManager.unregisterListener(this.f8221n, sensor);
        }
        rc rcVar = this.f8220m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8220m = null;
        }
        this.f8212b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8219l) {
            sensorManager.unregisterListener(this.f8223p, sensor);
        }
        rc rcVar = this.f8222o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8222o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8215g;
        if (sensor == null && this.f8214f == null && this.f8216i == null) {
            return true;
        }
        if (!this.f8219l) {
            y0 y0Var = this.f8225r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8214f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8216i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8227t, sensor3);
            }
        }
        rc rcVar = this.f8224q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8224q = null;
        }
        rc rcVar2 = this.f8226s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8226s = null;
        }
        this.f8215g = null;
        this.f8214f = null;
        this.f8216i = null;
        return true;
    }
}
