package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8201a;
    public Sensor f8202b;
    public long f8203c;
    public Sensor d;
    public long e;
    public Sensor f8204f;
    public Sensor f8205g;
    public long h;
    public Sensor f8206i;
    public long f8207j;
    public org.telegram.ui.web.z0 f8208k;
    public boolean f8209l;
    public qc f8210m;
    public qc f8212o;
    public qc f8214q;
    public qc f8216s;
    public final x0 f8211n = new x0(this, 0);
    public final x0 f8213p = new x0(this, 1);
    public final y0 f8215r = new y0(this);
    public final z0 f8217t = new z0(this);

    public a1(Context context) {
        this.f8201a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8209l) {
            this.f8209l = true;
            SensorManager sensorManager = this.f8201a;
            if (sensorManager != null) {
                Sensor sensor = this.f8202b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8211n, sensor);
                }
                qc qcVar = this.f8210m;
                if (qcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar);
                    this.f8210m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8213p, sensor2);
                }
                qc qcVar2 = this.f8212o;
                if (qcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar2);
                    this.f8212o = null;
                }
                Sensor sensor3 = this.f8205g;
                y0 y0Var = this.f8215r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8204f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                qc qcVar3 = this.f8214q;
                if (qcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar3);
                    this.f8214q = null;
                }
                Sensor sensor5 = this.f8206i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8217t, sensor5);
                }
                qc qcVar4 = this.f8216s;
                if (qcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar4);
                    this.f8216s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8201a;
        if (sensorManager != null) {
            if (this.f8202b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8202b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8203c = j3;
                if (!this.f8209l) {
                    sensorManager.registerListener(this.f8211n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8201a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8209l) {
                    sensorManager.registerListener(this.f8213p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8201a;
        if (sensorManager != null) {
            z0 z0Var = this.f8217t;
            y0 y0Var = this.f8215r;
            if (z10) {
                if (this.f8206i != null) {
                    qc qcVar = this.f8216s;
                    if (qcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar);
                        this.f8216s = null;
                    }
                    if (!this.f8209l && (sensor = this.f8206i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8206i = null;
                }
                if (this.f8204f == null || this.f8205g == null) {
                    this.f8205g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8204f = defaultSensor;
                    Sensor sensor2 = this.f8205g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8209l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8204f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8204f != null || this.f8205g != null) {
                    qc qcVar2 = this.f8214q;
                    if (qcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar2);
                        this.f8214q = null;
                    }
                    if (!this.f8209l) {
                        Sensor sensor3 = this.f8205g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8204f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8205g = null;
                    this.f8204f = null;
                }
                if (this.f8206i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8206i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8207j = j3;
                    if (!this.f8209l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8201a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8202b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8209l) {
            sensorManager.unregisterListener(this.f8211n, sensor);
        }
        qc qcVar = this.f8210m;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8210m = null;
        }
        this.f8202b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8201a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8209l) {
            sensorManager.unregisterListener(this.f8213p, sensor);
        }
        qc qcVar = this.f8212o;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8212o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8201a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8205g;
        if (sensor == null && this.f8204f == null && this.f8206i == null) {
            return true;
        }
        if (!this.f8209l) {
            y0 y0Var = this.f8215r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8204f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8206i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8217t, sensor3);
            }
        }
        qc qcVar = this.f8214q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8214q = null;
        }
        qc qcVar2 = this.f8216s;
        if (qcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar2);
            this.f8216s = null;
        }
        this.f8205g = null;
        this.f8204f = null;
        this.f8206i = null;
        return true;
    }
}
