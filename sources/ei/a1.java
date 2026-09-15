package ei;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f8212a;
    public Sensor f8213b;
    public long f8214c;
    public Sensor d;
    public long e;
    public Sensor f8215f;
    public Sensor f8216g;
    public long h;
    public Sensor f8217i;
    public long f8218j;
    public org.telegram.ui.web.z0 f8219k;
    public boolean f8220l;
    public uc f8221m;
    public uc f8223o;
    public uc f8225q;
    public uc f8227s;
    public final x0 f8222n = new x0(this, 0);
    public final x0 f8224p = new x0(this, 1);
    public final y0 f8226r = new y0(this);
    public final z0 f8228t = new z0(this);

    public a1(Context context) {
        this.f8212a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f8220l) {
            this.f8220l = true;
            SensorManager sensorManager = this.f8212a;
            if (sensorManager != null) {
                Sensor sensor = this.f8213b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f8222n, sensor);
                }
                uc ucVar = this.f8221m;
                if (ucVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar);
                    this.f8221m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f8224p, sensor2);
                }
                uc ucVar2 = this.f8223o;
                if (ucVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar2);
                    this.f8223o = null;
                }
                Sensor sensor3 = this.f8216g;
                y0 y0Var = this.f8226r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f8215f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                uc ucVar3 = this.f8225q;
                if (ucVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar3);
                    this.f8225q = null;
                }
                Sensor sensor5 = this.f8217i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f8228t, sensor5);
                }
                uc ucVar4 = this.f8227s;
                if (ucVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar4);
                    this.f8227s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f8212a;
        if (sensorManager != null) {
            if (this.f8213b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f8213b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f8214c = j3;
                if (!this.f8220l) {
                    sensorManager.registerListener(this.f8222n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f8212a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j3;
                if (!this.f8220l) {
                    sensorManager.registerListener(this.f8224p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f8212a;
        if (sensorManager != null) {
            z0 z0Var = this.f8228t;
            y0 y0Var = this.f8226r;
            if (z10) {
                if (this.f8217i != null) {
                    uc ucVar = this.f8227s;
                    if (ucVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar);
                        this.f8227s = null;
                    }
                    if (!this.f8220l && (sensor = this.f8217i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f8217i = null;
                }
                if (this.f8215f == null || this.f8216g == null) {
                    this.f8216g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f8215f = defaultSensor;
                    Sensor sensor2 = this.f8216g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f8220l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f8215f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f8215f != null || this.f8216g != null) {
                    uc ucVar2 = this.f8225q;
                    if (ucVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(ucVar2);
                        this.f8225q = null;
                    }
                    if (!this.f8220l) {
                        Sensor sensor3 = this.f8216g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f8215f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f8216g = null;
                    this.f8215f = null;
                }
                if (this.f8217i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f8217i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f8218j = j3;
                    if (!this.f8220l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f8212a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8213b;
        if (sensor == null) {
            return true;
        }
        if (!this.f8220l) {
            sensorManager.unregisterListener(this.f8222n, sensor);
        }
        uc ucVar = this.f8221m;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8221m = null;
        }
        this.f8213b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f8212a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f8220l) {
            sensorManager.unregisterListener(this.f8224p, sensor);
        }
        uc ucVar = this.f8223o;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8223o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f8212a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f8216g;
        if (sensor == null && this.f8215f == null && this.f8217i == null) {
            return true;
        }
        if (!this.f8220l) {
            y0 y0Var = this.f8226r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f8215f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f8217i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f8228t, sensor3);
            }
        }
        uc ucVar = this.f8225q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            this.f8225q = null;
        }
        uc ucVar2 = this.f8227s;
        if (ucVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar2);
            this.f8227s = null;
        }
        this.f8216g = null;
        this.f8215f = null;
        this.f8217i = null;
        return true;
    }
}
