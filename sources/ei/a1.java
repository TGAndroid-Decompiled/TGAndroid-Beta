package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8214a;
    public Sensor f8215b;
    public long f8216c;
    public Sensor d;
    public long e;
    public Sensor f8217f;
    public Sensor f8218g;
    public long h;
    public Sensor f8219i;
    public long f8220j;
    public org.telegram.ui.web.z0 f8221k;
    public boolean f8222l;
    public uc f8223m;
    public uc f8225o;
    public uc f8227q;
    public uc f8229s;
    public final x0 f8224n = new x0(this, 0);
    public final x0 f8226p = new x0(this, 1);
    public final y0 f8228r = new y0(this);
    public final z0 f8230t = new z0(this);

    public a1(Context context) {
        this.f8214a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8222l) {
            this.f8222l = true;
            SensorManager sensorManager = this.f8214a;
            if (sensorManager != null) {
                Sensor sensor = this.f8215b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8224n, sensor);
                }
                uc ucVar = this.f8223m;
                if (ucVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar);
                    this.f8223m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8226p, sensor2);
                }
                uc ucVar2 = this.f8225o;
                if (ucVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar2);
                    this.f8225o = null;
                }
                Sensor sensor3 = this.f8218g;
                y0 y0Var = this.f8228r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8217f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                uc ucVar3 = this.f8227q;
                if (ucVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar3);
                    this.f8227q = null;
                }
                Sensor sensor5 = this.f8219i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8230t, sensor5);
                }
                uc ucVar4 = this.f8229s;
                if (ucVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar4);
                    this.f8229s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8214a;
        if (sensorManager != null) {
            if (this.f8215b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8215b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8216c = j3;
                if (!this.f8222l) {
                    sensorManager.registerListener(this.f8224n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8214a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8222l) {
                    sensorManager.registerListener(this.f8226p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8214a;
        if (sensorManager != null) {
            z0 z0Var = this.f8230t;
            y0 y0Var = this.f8228r;
            if (z10) {
                if (this.f8219i != null) {
                    uc ucVar = this.f8229s;
                    if (ucVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar);
                        this.f8229s = null;
                    }
                    if (!this.f8222l && (sensor = this.f8219i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8219i = null;
                }
                if (this.f8217f == null || this.f8218g == null) {
                    this.f8218g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8217f = defaultSensor;
                    Sensor sensor2 = this.f8218g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8222l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8217f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8217f != null || this.f8218g != null) {
                    uc ucVar2 = this.f8227q;
                    if (ucVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar2);
                        this.f8227q = null;
                    }
                    if (!this.f8222l) {
                        Sensor sensor3 = this.f8218g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8217f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8218g = null;
                    this.f8217f = null;
                }
                if (this.f8219i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8219i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8220j = j3;
                    if (!this.f8222l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8214a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8215b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8222l) {
            sensorManager.unregisterListener(this.f8224n, sensor);
        }
        uc ucVar = this.f8223m;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8223m = null;
        }
        this.f8215b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8214a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8222l) {
            sensorManager.unregisterListener(this.f8226p, sensor);
        }
        uc ucVar = this.f8225o;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8225o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8214a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8218g;
        if (sensor == null && this.f8217f == null && this.f8219i == null) {
            return true;
        }
        if (!this.f8222l) {
            y0 y0Var = this.f8228r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8217f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8219i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8230t, sensor3);
            }
        }
        uc ucVar = this.f8227q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8227q = null;
        }
        uc ucVar2 = this.f8229s;
        if (ucVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar2);
            this.f8229s = null;
        }
        this.f8218g = null;
        this.f8217f = null;
        this.f8219i = null;
        return true;
    }
}
