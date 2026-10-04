package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
public final class b1 {
    public final SensorManager f8923a;
    public Sensor f8924b;
    public long f8925c;
    public Sensor d;
    public long f8926e;
    public Sensor f8927f;
    public Sensor f8928g;
    public long h;
    public Sensor f8929i;
    public long f8930j;
    public org.telegram.ui.web.z0 f8931k;
    public boolean f8932l;
    public qc f8933m;
    public qc f8935o;
    public qc f8937q;
    public qc f8939s;
    public final y0 f8934n = new y0(this, 0);
    public final y0 f8936p = new y0(this, 1);
    public final z0 f8938r = new z0(this);
    public final a1 f8940t = new a1(this);

    public b1(Context context) {
        this.f8923a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8932l) {
            this.f8932l = true;
            SensorManager sensorManager = this.f8923a;
            if (sensorManager != null) {
                Sensor sensor = this.f8924b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8934n, sensor);
                }
                qc qcVar = this.f8933m;
                if (qcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar);
                    this.f8933m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8936p, sensor2);
                }
                qc qcVar2 = this.f8935o;
                if (qcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar2);
                    this.f8935o = null;
                }
                Sensor sensor3 = this.f8928g;
                z0 z0Var = this.f8938r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(z0Var, sensor3);
                }
                Sensor sensor4 = this.f8927f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(z0Var, sensor4);
                }
                qc qcVar3 = this.f8937q;
                if (qcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar3);
                    this.f8937q = null;
                }
                Sensor sensor5 = this.f8929i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8940t, sensor5);
                }
                qc qcVar4 = this.f8939s;
                if (qcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar4);
                    this.f8939s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8923a;
        if (sensorManager != null) {
            if (this.f8924b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8924b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8925c = j3;
                if (!this.f8932l) {
                    sensorManager.registerListener(this.f8934n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8923a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8926e = j3;
                if (!this.f8932l) {
                    sensorManager.registerListener(this.f8936p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8923a;
        if (sensorManager != null) {
            a1 a1Var = this.f8940t;
            z0 z0Var = this.f8938r;
            if (z10) {
                if (this.f8929i != null) {
                    qc qcVar = this.f8939s;
                    if (qcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar);
                        this.f8939s = null;
                    }
                    if (!this.f8932l && (sensor = this.f8929i) != null) {
                        sensorManager.unregisterListener(a1Var, sensor);
                    }
                    this.f8929i = null;
                }
                if (this.f8927f == null || this.f8928g == null) {
                    this.f8928g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8927f = defaultSensor;
                    Sensor sensor2 = this.f8928g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8932l) {
                            sensorManager.registerListener(z0Var, sensor2, a(j3));
                            sensorManager.registerListener(z0Var, this.f8927f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8927f != null || this.f8928g != null) {
                    qc qcVar2 = this.f8937q;
                    if (qcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(qcVar2);
                        this.f8937q = null;
                    }
                    if (!this.f8932l) {
                        Sensor sensor3 = this.f8928g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(z0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8927f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(z0Var, sensor4);
                        }
                    }
                    this.f8928g = null;
                    this.f8927f = null;
                }
                if (this.f8929i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8929i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8930j = j3;
                    if (!this.f8932l) {
                        sensorManager.registerListener(a1Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8923a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8924b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8932l) {
            sensorManager.unregisterListener(this.f8934n, sensor);
        }
        qc qcVar = this.f8933m;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8933m = null;
        }
        this.f8924b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8923a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8932l) {
            sensorManager.unregisterListener(this.f8936p, sensor);
        }
        qc qcVar = this.f8935o;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8935o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8923a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8928g;
        if (sensor == null && this.f8927f == null && this.f8929i == null) {
            return true;
        }
        if (!this.f8932l) {
            z0 z0Var = this.f8938r;
            if (sensor != null) {
                sensorManager.unregisterListener(z0Var, sensor);
            }
            Sensor sensor2 = this.f8927f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(z0Var, sensor2);
            }
            Sensor sensor3 = this.f8929i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8940t, sensor3);
            }
        }
        qc qcVar = this.f8937q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            this.f8937q = null;
        }
        qc qcVar2 = this.f8939s;
        if (qcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar2);
            this.f8939s = null;
        }
        this.f8928g = null;
        this.f8927f = null;
        this.f8929i = null;
        return true;
    }
}
