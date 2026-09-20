package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8217a;
    public Sensor f8218b;
    public long f8219c;
    public Sensor d;
    public long e;
    public Sensor f8220f;
    public Sensor f8221g;
    public long h;
    public Sensor f8222i;
    public long f8223j;
    public org.telegram.ui.web.z0 f8224k;
    public boolean f8225l;
    public uc f8226m;
    public uc f8228o;
    public uc f8230q;
    public uc f8232s;
    public final x0 f8227n = new x0(this, 0);
    public final x0 f8229p = new x0(this, 1);
    public final y0 f8231r = new y0(this);
    public final z0 f8233t = new z0(this);

    public a1(Context context) {
        this.f8217a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8225l) {
            this.f8225l = true;
            SensorManager sensorManager = this.f8217a;
            if (sensorManager != null) {
                Sensor sensor = this.f8218b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8227n, sensor);
                }
                uc ucVar = this.f8226m;
                if (ucVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar);
                    this.f8226m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8229p, sensor2);
                }
                uc ucVar2 = this.f8228o;
                if (ucVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar2);
                    this.f8228o = null;
                }
                Sensor sensor3 = this.f8221g;
                y0 y0Var = this.f8231r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8220f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                uc ucVar3 = this.f8230q;
                if (ucVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar3);
                    this.f8230q = null;
                }
                Sensor sensor5 = this.f8222i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8233t, sensor5);
                }
                uc ucVar4 = this.f8232s;
                if (ucVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar4);
                    this.f8232s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8217a;
        if (sensorManager != null) {
            if (this.f8218b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8218b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8219c = j3;
                if (!this.f8225l) {
                    sensorManager.registerListener(this.f8227n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8217a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8225l) {
                    sensorManager.registerListener(this.f8229p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8217a;
        if (sensorManager != null) {
            z0 z0Var = this.f8233t;
            y0 y0Var = this.f8231r;
            if (z10) {
                if (this.f8222i != null) {
                    uc ucVar = this.f8232s;
                    if (ucVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar);
                        this.f8232s = null;
                    }
                    if (!this.f8225l && (sensor = this.f8222i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8222i = null;
                }
                if (this.f8220f == null || this.f8221g == null) {
                    this.f8221g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8220f = defaultSensor;
                    Sensor sensor2 = this.f8221g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8225l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8220f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8220f != null || this.f8221g != null) {
                    uc ucVar2 = this.f8230q;
                    if (ucVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar2);
                        this.f8230q = null;
                    }
                    if (!this.f8225l) {
                        Sensor sensor3 = this.f8221g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8220f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8221g = null;
                    this.f8220f = null;
                }
                if (this.f8222i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8222i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8223j = j3;
                    if (!this.f8225l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8217a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8218b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8225l) {
            sensorManager.unregisterListener(this.f8227n, sensor);
        }
        uc ucVar = this.f8226m;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8226m = null;
        }
        this.f8218b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8217a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8225l) {
            sensorManager.unregisterListener(this.f8229p, sensor);
        }
        uc ucVar = this.f8228o;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8228o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8217a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8221g;
        if (sensor == null && this.f8220f == null && this.f8222i == null) {
            return true;
        }
        if (!this.f8225l) {
            y0 y0Var = this.f8231r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8220f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8222i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8233t, sensor3);
            }
        }
        uc ucVar = this.f8230q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8230q = null;
        }
        uc ucVar2 = this.f8232s;
        if (ucVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar2);
            this.f8232s = null;
        }
        this.f8221g = null;
        this.f8220f = null;
        this.f8222i = null;
        return true;
    }
}
