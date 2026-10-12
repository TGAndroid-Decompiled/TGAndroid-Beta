package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8919a;
    public Sensor f8920b;
    public long f8921c;
    public Sensor d;
    public long f8922e;
    public Sensor f8923f;
    public Sensor f8924g;
    public long h;
    public Sensor f8925i;
    public long f8926j;
    public org.telegram.ui.web.y0 f8927k;
    public boolean f8928l;
    public rc f8929m;
    public rc f8931o;
    public rc f8933q;
    public rc f8935s;
    public final x0 f8930n = new x0(this, 0);
    public final x0 f8932p = new x0(this, 1);
    public final y0 f8934r = new y0(this);
    public final z0 f8936t = new z0(this);

    public a1(Context context) {
        this.f8919a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8928l) {
            this.f8928l = true;
            SensorManager sensorManager = this.f8919a;
            if (sensorManager != null) {
                Sensor sensor = this.f8920b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8930n, sensor);
                }
                rc rcVar = this.f8929m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8929m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8932p, sensor2);
                }
                rc rcVar2 = this.f8931o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8931o = null;
                }
                Sensor sensor3 = this.f8924g;
                y0 y0Var = this.f8934r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8923f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8933q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8933q = null;
                }
                Sensor sensor5 = this.f8925i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8936t, sensor5);
                }
                rc rcVar4 = this.f8935s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8935s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8919a;
        if (sensorManager != null) {
            if (this.f8920b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8920b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8921c = j3;
                if (!this.f8928l) {
                    sensorManager.registerListener(this.f8930n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8919a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8922e = j3;
                if (!this.f8928l) {
                    sensorManager.registerListener(this.f8932p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8919a;
        if (sensorManager != null) {
            z0 z0Var = this.f8936t;
            y0 y0Var = this.f8934r;
            if (z10) {
                if (this.f8925i != null) {
                    rc rcVar = this.f8935s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8935s = null;
                    }
                    if (!this.f8928l && (sensor = this.f8925i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8925i = null;
                }
                if (this.f8923f == null || this.f8924g == null) {
                    this.f8924g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8923f = defaultSensor;
                    Sensor sensor2 = this.f8924g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8928l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8923f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8923f != null || this.f8924g != null) {
                    rc rcVar2 = this.f8933q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8933q = null;
                    }
                    if (!this.f8928l) {
                        Sensor sensor3 = this.f8924g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8923f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8924g = null;
                    this.f8923f = null;
                }
                if (this.f8925i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8925i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8926j = j3;
                    if (!this.f8928l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8919a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8920b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8928l) {
            sensorManager.unregisterListener(this.f8930n, sensor);
        }
        rc rcVar = this.f8929m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8929m = null;
        }
        this.f8920b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8919a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8928l) {
            sensorManager.unregisterListener(this.f8932p, sensor);
        }
        rc rcVar = this.f8931o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8931o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8919a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8924g;
        if (sensor == null && this.f8923f == null && this.f8925i == null) {
            return true;
        }
        if (!this.f8928l) {
            y0 y0Var = this.f8934r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8923f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8925i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8936t, sensor3);
            }
        }
        rc rcVar = this.f8933q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8933q = null;
        }
        rc rcVar2 = this.f8935s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8935s = null;
        }
        this.f8924g = null;
        this.f8923f = null;
        this.f8925i = null;
        return true;
    }
}
