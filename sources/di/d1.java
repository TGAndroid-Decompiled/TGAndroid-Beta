package di;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
public final class d1 {
    public final SensorManager f6572a;
    public Sensor f6573b;
    public long f6574c;
    public Sensor d;
    public long e;
    public Sensor f6575f;
    public Sensor f6576g;
    public long h;
    public Sensor f6577i;
    public long f6578j;
    public org.telegram.ui.web.y0 f6579k;
    public boolean f6580l;
    public wc f6581m;
    public wc f6583o;
    public wc f6585q;
    public wc f6587s;
    public final a1 f6582n = new a1(this, 0);
    public final a1 f6584p = new a1(this, 1);
    public final b1 f6586r = new b1(this);
    public final c1 f6588t = new c1(this);

    public d1(Context context) {
        this.f6572a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f6580l) {
            this.f6580l = true;
            SensorManager sensorManager = this.f6572a;
            if (sensorManager != null) {
                Sensor sensor = this.f6573b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f6582n, sensor);
                }
                wc wcVar = this.f6581m;
                if (wcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar);
                    this.f6581m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f6584p, sensor2);
                }
                wc wcVar2 = this.f6583o;
                if (wcVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar2);
                    this.f6583o = null;
                }
                Sensor sensor3 = this.f6576g;
                b1 b1Var = this.f6586r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(b1Var, sensor3);
                }
                Sensor sensor4 = this.f6575f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(b1Var, sensor4);
                }
                wc wcVar3 = this.f6585q;
                if (wcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar3);
                    this.f6585q = null;
                }
                Sensor sensor5 = this.f6577i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f6588t, sensor5);
                }
                wc wcVar4 = this.f6587s;
                if (wcVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar4);
                    this.f6587s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f6572a;
        if (sensorManager != null) {
            if (this.f6573b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f6573b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f6574c = j3;
                if (!this.f6580l) {
                    sensorManager.registerListener(this.f6582n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f6572a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f6580l) {
                    sensorManager.registerListener(this.f6584p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f6572a;
        if (sensorManager != null) {
            c1 c1Var = this.f6588t;
            b1 b1Var = this.f6586r;
            if (z10) {
                if (this.f6577i != null) {
                    wc wcVar = this.f6587s;
                    if (wcVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(wcVar);
                        this.f6587s = null;
                    }
                    if (!this.f6580l && (sensor = this.f6577i) != null) {
                        sensorManager.unregisterListener(c1Var, sensor);
                    }
                    this.f6577i = null;
                }
                if (this.f6575f == null || this.f6576g == null) {
                    this.f6576g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f6575f = defaultSensor;
                    Sensor sensor2 = this.f6576g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f6580l) {
                            sensorManager.registerListener(b1Var, sensor2, a(j3));
                            sensorManager.registerListener(b1Var, this.f6575f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f6575f != null || this.f6576g != null) {
                    wc wcVar2 = this.f6585q;
                    if (wcVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(wcVar2);
                        this.f6585q = null;
                    }
                    if (!this.f6580l) {
                        Sensor sensor3 = this.f6576g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(b1Var, sensor3);
                        }
                        Sensor sensor4 = this.f6575f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(b1Var, sensor4);
                        }
                    }
                    this.f6576g = null;
                    this.f6575f = null;
                }
                if (this.f6577i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f6577i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f6578j = j3;
                    if (!this.f6580l) {
                        sensorManager.registerListener(c1Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f6572a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f6573b;
        if (sensor == null) {
            return true;
        }
        if (!this.f6580l) {
            sensorManager.unregisterListener(this.f6582n, sensor);
        }
        wc wcVar = this.f6581m;
        if (wcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar);
            this.f6581m = null;
        }
        this.f6573b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f6572a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f6580l) {
            sensorManager.unregisterListener(this.f6584p, sensor);
        }
        wc wcVar = this.f6583o;
        if (wcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar);
            this.f6583o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f6572a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f6576g;
        if (sensor == null && this.f6575f == null && this.f6577i == null) {
            return true;
        }
        if (!this.f6580l) {
            b1 b1Var = this.f6586r;
            if (sensor != null) {
                sensorManager.unregisterListener(b1Var, sensor);
            }
            Sensor sensor2 = this.f6575f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(b1Var, sensor2);
            }
            Sensor sensor3 = this.f6577i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f6588t, sensor3);
            }
        }
        wc wcVar = this.f6585q;
        if (wcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar);
            this.f6585q = null;
        }
        wc wcVar2 = this.f6587s;
        if (wcVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar2);
            this.f6587s = null;
        }
        this.f6576g = null;
        this.f6575f = null;
        this.f6577i = null;
        return true;
    }
}
