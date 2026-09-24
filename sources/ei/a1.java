package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8199a;
    public Sensor f8200b;
    public long f8201c;
    public Sensor d;
    public long e;
    public Sensor f8202f;
    public Sensor f8203g;
    public long h;
    public Sensor f8204i;
    public long f8205j;
    public org.telegram.ui.web.y0 f8206k;
    public boolean f8207l;
    public rc f8208m;
    public rc f8210o;
    public rc f8212q;
    public rc f8214s;
    public final x0 f8209n = new x0(this, 0);
    public final x0 f8211p = new x0(this, 1);
    public final y0 f8213r = new y0(this);
    public final z0 f8215t = new z0(this);

    public a1(Context context) {
        this.f8199a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8207l) {
            this.f8207l = true;
            SensorManager sensorManager = this.f8199a;
            if (sensorManager != null) {
                Sensor sensor = this.f8200b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8209n, sensor);
                }
                rc rcVar = this.f8208m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    this.f8208m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8211p, sensor2);
                }
                rc rcVar2 = this.f8210o;
                if (rcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar2);
                    this.f8210o = null;
                }
                Sensor sensor3 = this.f8203g;
                y0 y0Var = this.f8213r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8202f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                rc rcVar3 = this.f8212q;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    this.f8212q = null;
                }
                Sensor sensor5 = this.f8204i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8215t, sensor5);
                }
                rc rcVar4 = this.f8214s;
                if (rcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar4);
                    this.f8214s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8199a;
        if (sensorManager != null) {
            if (this.f8200b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8200b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8201c = j3;
                if (!this.f8207l) {
                    sensorManager.registerListener(this.f8209n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8199a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8207l) {
                    sensorManager.registerListener(this.f8211p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8199a;
        if (sensorManager != null) {
            z0 z0Var = this.f8215t;
            y0 y0Var = this.f8213r;
            if (z10) {
                if (this.f8204i != null) {
                    rc rcVar = this.f8214s;
                    if (rcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar);
                        this.f8214s = null;
                    }
                    if (!this.f8207l && (sensor = this.f8204i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8204i = null;
                }
                if (this.f8202f == null || this.f8203g == null) {
                    this.f8203g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8202f = defaultSensor;
                    Sensor sensor2 = this.f8203g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8207l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8202f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8202f != null || this.f8203g != null) {
                    rc rcVar2 = this.f8212q;
                    if (rcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(rcVar2);
                        this.f8212q = null;
                    }
                    if (!this.f8207l) {
                        Sensor sensor3 = this.f8203g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8202f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8203g = null;
                    this.f8202f = null;
                }
                if (this.f8204i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8204i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8205j = j3;
                    if (!this.f8207l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8199a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8200b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8207l) {
            sensorManager.unregisterListener(this.f8209n, sensor);
        }
        rc rcVar = this.f8208m;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8208m = null;
        }
        this.f8200b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8199a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8207l) {
            sensorManager.unregisterListener(this.f8211p, sensor);
        }
        rc rcVar = this.f8210o;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8210o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8199a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8203g;
        if (sensor == null && this.f8202f == null && this.f8204i == null) {
            return true;
        }
        if (!this.f8207l) {
            y0 y0Var = this.f8213r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8202f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8204i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8215t, sensor3);
            }
        }
        rc rcVar = this.f8212q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            this.f8212q = null;
        }
        rc rcVar2 = this.f8214s;
        if (rcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar2);
            this.f8214s = null;
        }
        this.f8203g = null;
        this.f8202f = null;
        this.f8204i = null;
        return true;
    }
}
