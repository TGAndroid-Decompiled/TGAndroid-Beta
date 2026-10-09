package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8922a;
    public Sensor f8923b;
    public long f8924c;
    public Sensor d;
    public long f8925e;
    public Sensor f8926f;
    public Sensor f8927g;
    public long h;
    public Sensor f8928i;
    public long f8929j;
    public org.telegram.ui.web.y0 f8930k;
    public boolean f8931l;
    public rc f8932m;
    public rc f8934o;
    public rc f8936q;
    public rc f8938s;
    public final x0 f8933n = new x0(this, 0);
    public final x0 f8935p = new x0(this, 1);
    public final y0 f8937r = new y0(this);
    public final z0 f8939t = new z0(this);

    public a1(Context context) {
        this.f8922a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8931l) {
            this.f8931l = true;
            SensorManager sensorManager = this.f8922a;
            if (sensorManager != null) {
                Sensor sensor = this.f8923b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8933n, sensor);
                }
                rc rcVar = this.f8932m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8932m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8935p, sensor2);
                }
                rc rcVar2 = this.f8934o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8934o = null;
                }
                Sensor sensor3 = this.f8927g;
                y0 y0Var = this.f8937r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8926f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8936q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8936q = null;
                }
                Sensor sensor5 = this.f8928i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8939t, sensor5);
                }
                rc rcVar4 = this.f8938s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8938s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8922a;
        if (sensorManager != null) {
            if (this.f8923b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8923b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8924c = j3;
                if (!this.f8931l) {
                    sensorManager.registerListener(this.f8933n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8922a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8925e = j3;
                if (!this.f8931l) {
                    sensorManager.registerListener(this.f8935p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8922a;
        if (sensorManager != null) {
            z0 z0Var = this.f8939t;
            y0 y0Var = this.f8937r;
            if (z10) {
                if (this.f8928i != null) {
                    rc rcVar = this.f8938s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8938s = null;
                    }
                    if (!this.f8931l && (sensor = this.f8928i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8928i = null;
                }
                if (this.f8926f == null || this.f8927g == null) {
                    this.f8927g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8926f = defaultSensor;
                    Sensor sensor2 = this.f8927g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8931l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8926f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8926f != null || this.f8927g != null) {
                    rc rcVar2 = this.f8936q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8936q = null;
                    }
                    if (!this.f8931l) {
                        Sensor sensor3 = this.f8927g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8926f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8927g = null;
                    this.f8926f = null;
                }
                if (this.f8928i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8928i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8929j = j3;
                    if (!this.f8931l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8922a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8923b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8931l) {
            sensorManager.unregisterListener(this.f8933n, sensor);
        }
        rc rcVar = this.f8932m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8932m = null;
        }
        this.f8923b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8922a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8931l) {
            sensorManager.unregisterListener(this.f8935p, sensor);
        }
        rc rcVar = this.f8934o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8934o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8922a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8927g;
        if (sensor == null && this.f8926f == null && this.f8928i == null) {
            return true;
        }
        if (!this.f8931l) {
            y0 y0Var = this.f8937r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8926f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8928i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8939t, sensor3);
            }
        }
        rc rcVar = this.f8936q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8936q = null;
        }
        rc rcVar2 = this.f8938s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8938s = null;
        }
        this.f8927g = null;
        this.f8926f = null;
        this.f8928i = null;
        return true;
    }
}
