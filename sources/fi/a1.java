package fi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
public final class a1 {
    public final SensorManager f9557a;
    public Sensor f9558b;
    public long f9559c;
    public Sensor d;
    public long f9560e;
    public Sensor f9561f;
    public Sensor f9562g;
    public long h;
    public Sensor f9563i;
    public long f9564j;
    public org.telegram.ui.web.z0 f9565k;
    public boolean f9566l;
    public nb f9567m;
    public nb f9569o;
    public nb f9571q;
    public nb f9573s;
    public final x0 f9568n = new x0(this, 0);
    public final x0 f9570p = new x0(this, 1);
    public final y0 f9572r = new y0(this);
    public final z0 f9574t = new z0(this);

    public a1(Context context) {
        this.f9557a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f9566l) {
            this.f9566l = true;
            SensorManager sensorManager = this.f9557a;
            if (sensorManager != null) {
                Sensor sensor = this.f9558b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f9568n, sensor);
                }
                nb nbVar = this.f9567m;
                if (nbVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar);
                    this.f9567m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f9570p, sensor2);
                }
                nb nbVar2 = this.f9569o;
                if (nbVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar2);
                    this.f9569o = null;
                }
                Sensor sensor3 = this.f9562g;
                y0 y0Var = this.f9572r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(y0Var, sensor3);
                }
                Sensor sensor4 = this.f9561f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(y0Var, sensor4);
                }
                nb nbVar3 = this.f9571q;
                if (nbVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar3);
                    this.f9571q = null;
                }
                Sensor sensor5 = this.f9563i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f9574t, sensor5);
                }
                nb nbVar4 = this.f9573s;
                if (nbVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar4);
                    this.f9573s = null;
                }
            }
        }
    }

    public final boolean c(long j3) {
        SensorManager sensorManager = this.f9557a;
        if (sensorManager != null) {
            if (this.f9558b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f9558b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9559c = j3;
                if (!this.f9566l) {
                    sensorManager.registerListener(this.f9568n, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j3) {
        SensorManager sensorManager = this.f9557a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9560e = j3;
                if (!this.f9566l) {
                    sensorManager.registerListener(this.f9570p, defaultSensor, a(j3));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f9557a;
        if (sensorManager != null) {
            z0 z0Var = this.f9574t;
            y0 y0Var = this.f9572r;
            if (z10) {
                if (this.f9563i != null) {
                    nb nbVar = this.f9573s;
                    if (nbVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nbVar);
                        this.f9573s = null;
                    }
                    if (!this.f9566l && (sensor = this.f9563i) != null) {
                        sensorManager.unregisterListener(z0Var, sensor);
                    }
                    this.f9563i = null;
                }
                if (this.f9561f == null || this.f9562g == null) {
                    this.f9562g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f9561f = defaultSensor;
                    Sensor sensor2 = this.f9562g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j3;
                        if (!this.f9566l) {
                            sensorManager.registerListener(y0Var, sensor2, a(j3));
                            sensorManager.registerListener(y0Var, this.f9561f, a(j3));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f9561f != null || this.f9562g != null) {
                    nb nbVar2 = this.f9571q;
                    if (nbVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(nbVar2);
                        this.f9571q = null;
                    }
                    if (!this.f9566l) {
                        Sensor sensor3 = this.f9562g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(y0Var, sensor3);
                        }
                        Sensor sensor4 = this.f9561f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(y0Var, sensor4);
                        }
                    }
                    this.f9562g = null;
                    this.f9561f = null;
                }
                if (this.f9563i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f9563i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f9564j = j3;
                    if (!this.f9566l) {
                        sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f9557a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9558b;
        if (sensor == null) {
            return true;
        }
        if (!this.f9566l) {
            sensorManager.unregisterListener(this.f9568n, sensor);
        }
        nb nbVar = this.f9567m;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9567m = null;
        }
        this.f9558b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f9557a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f9566l) {
            sensorManager.unregisterListener(this.f9570p, sensor);
        }
        nb nbVar = this.f9569o;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9569o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f9557a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9562g;
        if (sensor == null && this.f9561f == null && this.f9563i == null) {
            return true;
        }
        if (!this.f9566l) {
            y0 y0Var = this.f9572r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f9561f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.f9563i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f9574t, sensor3);
            }
        }
        nb nbVar = this.f9571q;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.f9571q = null;
        }
        nb nbVar2 = this.f9573s;
        if (nbVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar2);
            this.f9573s = null;
        }
        this.f9562g = null;
        this.f9561f = null;
        this.f9563i = null;
        return true;
    }
}
