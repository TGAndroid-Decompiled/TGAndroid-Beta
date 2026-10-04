package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
public final class b1 {
    public final SensorManager f8924a;
    public Sensor f8925b;
    public long f8926c;
    public Sensor d;
    public long f8927e;
    public Sensor f8928f;
    public Sensor f8929g;
    public long h;
    public Sensor f8930i;
    public long f8931j;
    public org.telegram.ui.web.z0 f8932k;
    public boolean f8933l;
    public qc f8934m;
    public qc f8936o;
    public qc f8938q;
    public qc f8940s;
    public final y0 f8935n = new y0(this, 0);
    public final y0 f8937p = new y0(this, 1);
    public final z0 f8939r = new z0(this);
    public final a1 f8941t = new a1(this);

    public b1(Context context) {
        this.f8924a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8933l) {
            this.f8933l = true;
            SensorManager sensorManager = this.f8924a;
            if (sensorManager != null) {
                Sensor sensor = this.f8925b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8935n, sensor);
                }
                qc qcVar = this.f8934m;
                if (qcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar);
                    this.f8934m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8937p, sensor2);
                }
                qc qcVar2 = this.f8936o;
                if (qcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar2);
                    this.f8936o = null;
                }
                Sensor sensor3 = this.f8929g;
                z0 z0Var = this.f8939r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(z0Var, sensor3);
                }
                Sensor sensor4 = this.f8928f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(z0Var, sensor4);
                }
                qc qcVar3 = this.f8938q;
                if (qcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar3);
                    this.f8938q = null;
                }
                Sensor sensor5 = this.f8930i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8941t, sensor5);
                }
                qc qcVar4 = this.f8940s;
                if (qcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar4);
                    this.f8940s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8924a;
        if (sensorManager != null) {
            if (this.f8925b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8925b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8926c = j3;
                if (!this.f8933l) {
                    sensorManager.registerListener(this.f8935n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8924a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8927e = j3;
                if (!this.f8933l) {
                    sensorManager.registerListener(this.f8937p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8924a;
        if (sensorManager != null) {
            a1 a1Var = this.f8941t;
            z0 z0Var = this.f8939r;
            if (z10) {
                if (this.f8930i != null) {
                    qc qcVar = this.f8940s;
                    if (qcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar);
                        this.f8940s = null;
                    }
                    if (!this.f8933l && (sensor = this.f8930i) != null) {
                        sensorManager.unregisterListener(a1Var, sensor);
                    }
                    this.f8930i = null;
                }
                if (this.f8928f == null || this.f8929g == null) {
                    this.f8929g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8928f = defaultSensor;
                    Sensor sensor2 = this.f8929g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8933l) {
                            sensorManager.registerListener(z0Var, sensor2, a(j3));
                            sensorManager.registerListener(z0Var, this.f8928f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8928f != null || this.f8929g != null) {
                    qc qcVar2 = this.f8938q;
                    if (qcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar2);
                        this.f8938q = null;
                    }
                    if (!this.f8933l) {
                        Sensor sensor3 = this.f8929g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(z0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8928f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(z0Var, sensor4);
                        }
                    }
                    this.f8929g = null;
                    this.f8928f = null;
                }
                if (this.f8930i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8930i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8931j = j3;
                    if (!this.f8933l) {
                        sensorManager.registerListener(a1Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8924a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8925b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8933l) {
            sensorManager.unregisterListener(this.f8935n, sensor);
        }
        qc qcVar = this.f8934m;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8934m = null;
        }
        this.f8925b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8924a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8933l) {
            sensorManager.unregisterListener(this.f8937p, sensor);
        }
        qc qcVar = this.f8936o;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8936o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8924a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8929g;
        if (sensor == null && this.f8928f == null && this.f8930i == null) {
            return true;
        }
        if (!this.f8933l) {
            z0 z0Var = this.f8939r;
            if (sensor != null) {
                sensorManager.unregisterListener(z0Var, sensor);
            }
            Sensor sensor2 = this.f8928f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(z0Var, sensor2);
            }
            Sensor sensor3 = this.f8930i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8941t, sensor3);
            }
        }
        qc qcVar = this.f8938q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8938q = null;
        }
        qc qcVar2 = this.f8940s;
        if (qcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar2);
            this.f8940s = null;
        }
        this.f8929g = null;
        this.f8928f = null;
        this.f8930i = null;
        return true;
    }
}
