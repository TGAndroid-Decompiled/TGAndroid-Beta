package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8216a;
    public Sensor f8217b;
    public long f8218c;
    public Sensor d;
    public long e;
    public Sensor f8219f;
    public Sensor f8220g;
    public long h;
    public Sensor f8221i;
    public long f8222j;
    public org.telegram.ui.web.z0 f8223k;
    public boolean f8224l;
    public uc f8225m;
    public uc f8227o;
    public uc f8229q;
    public uc f8231s;
    public final x0 f8226n = new x0(this, 0);
    public final x0 f8228p = new x0(this, 1);
    public final y0 f8230r = new y0(this);
    public final z0 f8232t = new z0(this);

    public a1(Context context) {
        this.f8216a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8224l) {
            this.f8224l = true;
            SensorManager sensorManager = this.f8216a;
            if (sensorManager != null) {
                Sensor sensor = this.f8217b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8226n, sensor);
                }
                uc ucVar = this.f8225m;
                if (ucVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar);
                    this.f8225m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8228p, sensor2);
                }
                uc ucVar2 = this.f8227o;
                if (ucVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar2);
                    this.f8227o = null;
                }
                Sensor sensor3 = this.f8220g;
                y0 y0Var = this.f8230r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8219f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                uc ucVar3 = this.f8229q;
                if (ucVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar3);
                    this.f8229q = null;
                }
                Sensor sensor5 = this.f8221i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8232t, sensor5);
                }
                uc ucVar4 = this.f8231s;
                if (ucVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar4);
                    this.f8231s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8216a;
        if (sensorManager != null) {
            if (this.f8217b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8217b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8218c = j3;
                if (!this.f8224l) {
                    sensorManager.registerListener(this.f8226n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8216a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8224l) {
                    sensorManager.registerListener(this.f8228p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8216a;
        if (sensorManager != null) {
            z0 z0Var = this.f8232t;
            y0 y0Var = this.f8230r;
            if (z10) {
                if (this.f8221i != null) {
                    uc ucVar = this.f8231s;
                    if (ucVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar);
                        this.f8231s = null;
                    }
                    if (!this.f8224l && (sensor = this.f8221i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8221i = null;
                }
                if (this.f8219f == null || this.f8220g == null) {
                    this.f8220g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8219f = defaultSensor;
                    Sensor sensor2 = this.f8220g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8224l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8219f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8219f != null || this.f8220g != null) {
                    uc ucVar2 = this.f8229q;
                    if (ucVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar2);
                        this.f8229q = null;
                    }
                    if (!this.f8224l) {
                        Sensor sensor3 = this.f8220g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8219f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8220g = null;
                    this.f8219f = null;
                }
                if (this.f8221i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8221i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8222j = j3;
                    if (!this.f8224l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8216a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8217b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8224l) {
            sensorManager.unregisterListener(this.f8226n, sensor);
        }
        uc ucVar = this.f8225m;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8225m = null;
        }
        this.f8217b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8216a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8224l) {
            sensorManager.unregisterListener(this.f8228p, sensor);
        }
        uc ucVar = this.f8227o;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8227o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8216a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8220g;
        if (sensor == null && this.f8219f == null && this.f8221i == null) {
            return true;
        }
        if (!this.f8224l) {
            y0 y0Var = this.f8230r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8219f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8221i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8232t, sensor3);
            }
        }
        uc ucVar = this.f8229q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8229q = null;
        }
        uc ucVar2 = this.f8231s;
        if (ucVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar2);
            this.f8231s = null;
        }
        this.f8220g = null;
        this.f8219f = null;
        this.f8221i = null;
        return true;
    }
}
