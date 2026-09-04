package fi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f9529a;
    public Sensor f9530b;
    public long f9531c;
    public Sensor d;
    public long f9532e;
    public Sensor f9533f;
    public Sensor f9534g;
    public long h;
    public Sensor f9535i;
    public long f9536j;
    public org.telegram.ui.web.z0 f9537k;
    public boolean f9538l;
    public nb f9539m;
    public nb f9541o;
    public nb f9543q;
    public nb f9545s;
    public final x0 f9540n = new x0(this, 0);
    public final x0 f9542p = new x0(this, 1);
    public final y0 f9544r = new y0(this);
    public final z0 f9546t = new z0(this);

    public a1(Context context) {
        this.f9529a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f9538l) {
            this.f9538l = true;
            SensorManager sensorManager = this.f9529a;
            if (sensorManager != null) {
                Sensor sensor = this.f9530b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f9540n, sensor);
                }
                nb nbVar = this.f9539m;
                if (nbVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar);
                    this.f9539m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f9542p, sensor2);
                }
                nb nbVar2 = this.f9541o;
                if (nbVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar2);
                    this.f9541o = null;
                }
                Sensor sensor3 = this.f9534g;
                y0 y0Var = this.f9544r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f9533f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                nb nbVar3 = this.f9543q;
                if (nbVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar3);
                    this.f9543q = null;
                }
                Sensor sensor5 = this.f9535i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f9546t, sensor5);
                }
                nb nbVar4 = this.f9545s;
                if (nbVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar4);
                    this.f9545s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f9529a;
        if (sensorManager != null) {
            if (this.f9530b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f9530b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9531c = j3;
                if (!this.f9538l) {
                    sensorManager.registerListener(this.f9540n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f9529a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9532e = j3;
                if (!this.f9538l) {
                    sensorManager.registerListener(this.f9542p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f9529a;
        if (sensorManager != null) {
            z0 z0Var = this.f9546t;
            y0 y0Var = this.f9544r;
            if (z10) {
                if (this.f9535i != null) {
                    nb nbVar = this.f9545s;
                    if (nbVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nbVar);
                        this.f9545s = null;
                    }
                    if (!this.f9538l && (sensor = this.f9535i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f9535i = null;
                }
                if (this.f9533f == null || this.f9534g == null) {
                    this.f9534g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f9533f = defaultSensor;
                    Sensor sensor2 = this.f9534g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f9538l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f9533f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f9533f != null || this.f9534g != null) {
                    nb nbVar2 = this.f9543q;
                    if (nbVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(nbVar2);
                        this.f9543q = null;
                    }
                    if (!this.f9538l) {
                        Sensor sensor3 = this.f9534g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f9533f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f9534g = null;
                    this.f9533f = null;
                }
                if (this.f9535i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f9535i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f9536j = j3;
                    if (!this.f9538l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f9529a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9530b;
        if (sensor == null) {
            return true;
        }
        if (!this.f9538l) {
            sensorManager.unregisterListener(this.f9540n, sensor);
        }
        nb nbVar = this.f9539m;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9539m = null;
        }
        this.f9530b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f9529a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f9538l) {
            sensorManager.unregisterListener(this.f9542p, sensor);
        }
        nb nbVar = this.f9541o;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9541o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f9529a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9534g;
        if (sensor == null && this.f9533f == null && this.f9535i == null) {
            return true;
        }
        if (!this.f9538l) {
            y0 y0Var = this.f9544r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f9533f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f9535i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f9546t, sensor3);
            }
        }
        nb nbVar = this.f9543q;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9543q = null;
        }
        nb nbVar2 = this.f9545s;
        if (nbVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar2);
            this.f9545s = null;
        }
        this.f9534g = null;
        this.f9533f = null;
        this.f9535i = null;
        return true;
    }
}
