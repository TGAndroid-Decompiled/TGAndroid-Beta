package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8200a;
    public Sensor f8201b;
    public long f8202c;
    public Sensor d;
    public long e;
    public Sensor f8203f;
    public Sensor f8204g;
    public long h;
    public Sensor f8205i;
    public long f8206j;
    public org.telegram.ui.web.y0 f8207k;
    public boolean f8208l;
    public rc f8209m;
    public rc f8211o;
    public rc f8213q;
    public rc f8215s;
    public final x0 f8210n = new x0(this, 0);
    public final x0 f8212p = new x0(this, 1);
    public final y0 f8214r = new y0(this);
    public final z0 f8216t = new z0(this);

    public a1(Context context) {
        this.f8200a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8208l) {
            this.f8208l = true;
            SensorManager sensorManager = this.f8200a;
            if (sensorManager != null) {
                Sensor sensor = this.f8201b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8210n, sensor);
                }
                rc rcVar = this.f8209m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8209m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8212p, sensor2);
                }
                rc rcVar2 = this.f8211o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8211o = null;
                }
                Sensor sensor3 = this.f8204g;
                y0 y0Var = this.f8214r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8203f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8213q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8213q = null;
                }
                Sensor sensor5 = this.f8205i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8216t, sensor5);
                }
                rc rcVar4 = this.f8215s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8215s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8200a;
        if (sensorManager != null) {
            if (this.f8201b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8201b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8202c = j3;
                if (!this.f8208l) {
                    sensorManager.registerListener(this.f8210n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8200a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8208l) {
                    sensorManager.registerListener(this.f8212p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8200a;
        if (sensorManager != null) {
            z0 z0Var = this.f8216t;
            y0 y0Var = this.f8214r;
            if (z10) {
                if (this.f8205i != null) {
                    rc rcVar = this.f8215s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8215s = null;
                    }
                    if (!this.f8208l && (sensor = this.f8205i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8205i = null;
                }
                if (this.f8203f == null || this.f8204g == null) {
                    this.f8204g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8203f = defaultSensor;
                    Sensor sensor2 = this.f8204g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8208l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8203f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8203f != null || this.f8204g != null) {
                    rc rcVar2 = this.f8213q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8213q = null;
                    }
                    if (!this.f8208l) {
                        Sensor sensor3 = this.f8204g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8203f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8204g = null;
                    this.f8203f = null;
                }
                if (this.f8205i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8205i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8206j = j3;
                    if (!this.f8208l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8200a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8201b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8208l) {
            sensorManager.unregisterListener(this.f8210n, sensor);
        }
        rc rcVar = this.f8209m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8209m = null;
        }
        this.f8201b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8200a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8208l) {
            sensorManager.unregisterListener(this.f8212p, sensor);
        }
        rc rcVar = this.f8211o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8211o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8200a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8204g;
        if (sensor == null && this.f8203f == null && this.f8205i == null) {
            return true;
        }
        if (!this.f8208l) {
            y0 y0Var = this.f8214r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8203f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8205i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8216t, sensor3);
            }
        }
        rc rcVar = this.f8213q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8213q = null;
        }
        rc rcVar2 = this.f8215s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8215s = null;
        }
        this.f8204g = null;
        this.f8203f = null;
        this.f8205i = null;
        return true;
    }
}
