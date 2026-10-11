package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8921a;
    public Sensor f8922b;
    public long f8923c;
    public Sensor d;
    public long f8924e;
    public Sensor f8925f;
    public Sensor f8926g;
    public long h;
    public Sensor f8927i;
    public long f8928j;
    public org.telegram.ui.web.y0 f8929k;
    public boolean f8930l;
    public rc f8931m;
    public rc f8933o;
    public rc f8935q;
    public rc f8937s;
    public final x0 f8932n = new x0(this, 0);
    public final x0 f8934p = new x0(this, 1);
    public final y0 f8936r = new y0(this);
    public final z0 f8938t = new z0(this);

    public a1(Context context) {
        this.f8921a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8930l) {
            this.f8930l = true;
            SensorManager sensorManager = this.f8921a;
            if (sensorManager != null) {
                Sensor sensor = this.f8922b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8932n, sensor);
                }
                rc rcVar = this.f8931m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8931m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8934p, sensor2);
                }
                rc rcVar2 = this.f8933o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8933o = null;
                }
                Sensor sensor3 = this.f8926g;
                y0 y0Var = this.f8936r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8925f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8935q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8935q = null;
                }
                Sensor sensor5 = this.f8927i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8938t, sensor5);
                }
                rc rcVar4 = this.f8937s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8937s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8921a;
        if (sensorManager != null) {
            if (this.f8922b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8922b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8923c = j3;
                if (!this.f8930l) {
                    sensorManager.registerListener(this.f8932n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8921a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8924e = j3;
                if (!this.f8930l) {
                    sensorManager.registerListener(this.f8934p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8921a;
        if (sensorManager != null) {
            z0 z0Var = this.f8938t;
            y0 y0Var = this.f8936r;
            if (z10) {
                if (this.f8927i != null) {
                    rc rcVar = this.f8937s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8937s = null;
                    }
                    if (!this.f8930l && (sensor = this.f8927i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8927i = null;
                }
                if (this.f8925f == null || this.f8926g == null) {
                    this.f8926g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8925f = defaultSensor;
                    Sensor sensor2 = this.f8926g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8930l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8925f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8925f != null || this.f8926g != null) {
                    rc rcVar2 = this.f8935q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8935q = null;
                    }
                    if (!this.f8930l) {
                        Sensor sensor3 = this.f8926g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8925f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8926g = null;
                    this.f8925f = null;
                }
                if (this.f8927i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8927i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8928j = j3;
                    if (!this.f8930l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8921a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8922b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8930l) {
            sensorManager.unregisterListener(this.f8932n, sensor);
        }
        rc rcVar = this.f8931m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8931m = null;
        }
        this.f8922b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8921a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8930l) {
            sensorManager.unregisterListener(this.f8934p, sensor);
        }
        rc rcVar = this.f8933o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8933o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8921a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8926g;
        if (sensor == null && this.f8925f == null && this.f8927i == null) {
            return true;
        }
        if (!this.f8930l) {
            y0 y0Var = this.f8936r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8925f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8927i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8938t, sensor3);
            }
        }
        rc rcVar = this.f8935q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8935q = null;
        }
        rc rcVar2 = this.f8937s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8937s = null;
        }
        this.f8926g = null;
        this.f8925f = null;
        this.f8927i = null;
        return true;
    }
}
