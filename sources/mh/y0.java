package mh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
public final class y0 {
    public final SensorManager f18211a;
    public Sensor f18212b;
    public long f18213c;
    public Sensor d;
    public long f18214e;
    public Sensor f18215f;
    public Sensor f18216g;
    public long h;
    public Sensor f18217i;
    public long f18218j;
    public org.telegram.ui.web.v0 f18219k;
    public boolean f18220l;
    public kh.f1 f18221m;
    public kh.f1 f18223o;
    public kh.f1 f18225q;
    public kh.f1 f18227s;
    public final v0 f18222n = new v0(this, 0);
    public final v0 f18224p = new v0(this, 1);
    public final w0 f18226r = new w0(this);
    public final x0 f18228t = new x0(this);

    public y0(Context context) {
        this.f18211a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f18220l) {
            this.f18220l = true;
            SensorManager sensorManager = this.f18211a;
            if (sensorManager != null) {
                Sensor sensor = this.f18212b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f18222n, sensor);
                }
                kh.f1 f1Var = this.f18221m;
                if (f1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    this.f18221m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f18224p, sensor2);
                }
                kh.f1 f1Var2 = this.f18223o;
                if (f1Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var2);
                    this.f18223o = null;
                }
                Sensor sensor3 = this.f18216g;
                w0 w0Var = this.f18226r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(w0Var, sensor3);
                }
                Sensor sensor4 = this.f18215f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(w0Var, sensor4);
                }
                kh.f1 f1Var3 = this.f18225q;
                if (f1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var3);
                    this.f18225q = null;
                }
                Sensor sensor5 = this.f18217i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f18228t, sensor5);
                }
                kh.f1 f1Var4 = this.f18227s;
                if (f1Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var4);
                    this.f18227s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f18211a;
        if (sensorManager != null) {
            if (this.f18212b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f18212b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18213c = j10;
                if (!this.f18220l) {
                    sensorManager.registerListener(this.f18222n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f18211a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f18214e = j10;
                if (!this.f18220l) {
                    sensorManager.registerListener(this.f18224p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f18211a;
        if (sensorManager != null) {
            x0 x0Var = this.f18228t;
            w0 w0Var = this.f18226r;
            if (z10) {
                if (this.f18217i != null) {
                    kh.f1 f1Var = this.f18227s;
                    if (f1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(f1Var);
                        this.f18227s = null;
                    }
                    if (!this.f18220l && (sensor = this.f18217i) != null) {
                        sensorManager.unregisterListener(x0Var, sensor);
                    }
                    this.f18217i = null;
                }
                if (this.f18215f == null || this.f18216g == null) {
                    this.f18216g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f18215f = defaultSensor;
                    Sensor sensor2 = this.f18216g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f18220l) {
                            sensorManager.registerListener(w0Var, sensor2, a(j10));
                            sensorManager.registerListener(w0Var, this.f18215f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f18215f != null || this.f18216g != null) {
                    kh.f1 f1Var2 = this.f18225q;
                    if (f1Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(f1Var2);
                        this.f18225q = null;
                    }
                    if (!this.f18220l) {
                        Sensor sensor3 = this.f18216g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(w0Var, sensor3);
                        }
                        Sensor sensor4 = this.f18215f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(w0Var, sensor4);
                        }
                    }
                    this.f18216g = null;
                    this.f18215f = null;
                }
                if (this.f18217i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f18217i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f18218j = j10;
                    if (!this.f18220l) {
                        sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f18211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18212b;
        if (sensor == null) {
            return true;
        }
        if (!this.f18220l) {
            sensorManager.unregisterListener(this.f18222n, sensor);
        }
        kh.f1 f1Var = this.f18221m;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.f18221m = null;
        }
        this.f18212b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f18211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f18220l) {
            sensorManager.unregisterListener(this.f18224p, sensor);
        }
        kh.f1 f1Var = this.f18223o;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.f18223o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f18211a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f18216g;
        if (sensor == null && this.f18215f == null && this.f18217i == null) {
            return true;
        }
        if (!this.f18220l) {
            w0 w0Var = this.f18226r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f18215f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.f18217i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f18228t, sensor3);
            }
        }
        kh.f1 f1Var = this.f18225q;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.f18225q = null;
        }
        kh.f1 f1Var2 = this.f18227s;
        if (f1Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var2);
            this.f18227s = null;
        }
        this.f18216g = null;
        this.f18215f = null;
        this.f18217i = null;
        return true;
    }
}
