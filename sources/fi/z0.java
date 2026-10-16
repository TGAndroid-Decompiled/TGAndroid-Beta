package fi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import di.x8;
import org.telegram.messenger.AndroidUtilities;
public final class z0 {
    public final SensorManager f9687a;
    public Sensor f9688b;
    public long f9689c;
    public Sensor d;
    public long e;
    public Sensor f9690f;
    public Sensor f9691g;
    public long h;
    public Sensor f9692i;
    public long f9693j;
    public org.telegram.ui.web.z0 f9694k;
    public boolean f9695l;
    public x8 f9696m;
    public x8 f9698o;
    public x8 f9700q;
    public x8 f9702s;
    public final w0 f9697n = new w0(this, 0);
    public final w0 f9699p = new w0(this, 1);
    public final x0 f9701r = new x0(this);
    public final y0 f9703t = new y0(this);

    public z0(Context context) {
        this.f9687a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f9695l) {
            this.f9695l = true;
            SensorManager sensorManager = this.f9687a;
            if (sensorManager != null) {
                Sensor sensor = this.f9688b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f9697n, sensor);
                }
                x8 x8Var = this.f9696m;
                if (x8Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var);
                    this.f9696m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f9699p, sensor2);
                }
                x8 x8Var2 = this.f9698o;
                if (x8Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var2);
                    this.f9698o = null;
                }
                Sensor sensor3 = this.f9691g;
                x0 x0Var = this.f9701r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(x0Var, sensor3);
                }
                Sensor sensor4 = this.f9690f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(x0Var, sensor4);
                }
                x8 x8Var3 = this.f9700q;
                if (x8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var3);
                    this.f9700q = null;
                }
                Sensor sensor5 = this.f9692i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f9703t, sensor5);
                }
                x8 x8Var4 = this.f9702s;
                if (x8Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var4);
                    this.f9702s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f9687a;
        if (sensorManager != null) {
            if (this.f9688b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f9688b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f9689c = j10;
                if (!this.f9695l) {
                    sensorManager.registerListener(this.f9697n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f9687a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f9695l) {
                    sensorManager.registerListener(this.f9699p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f9687a;
        if (sensorManager != null) {
            y0 y0Var = this.f9703t;
            x0 x0Var = this.f9701r;
            if (z10) {
                if (this.f9692i != null) {
                    x8 x8Var = this.f9702s;
                    if (x8Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(x8Var);
                        this.f9702s = null;
                    }
                    if (!this.f9695l && (sensor = this.f9692i) != null) {
                        sensorManager.unregisterListener(y0Var, sensor);
                    }
                    this.f9692i = null;
                }
                if (this.f9690f == null || this.f9691g == null) {
                    this.f9691g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f9690f = defaultSensor;
                    Sensor sensor2 = this.f9691g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f9695l) {
                            sensorManager.registerListener(x0Var, sensor2, a(j10));
                            sensorManager.registerListener(x0Var, this.f9690f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f9690f != null || this.f9691g != null) {
                    x8 x8Var2 = this.f9700q;
                    if (x8Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(x8Var2);
                        this.f9700q = null;
                    }
                    if (!this.f9695l) {
                        Sensor sensor3 = this.f9691g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(x0Var, sensor3);
                        }
                        Sensor sensor4 = this.f9690f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(x0Var, sensor4);
                        }
                    }
                    this.f9691g = null;
                    this.f9690f = null;
                }
                if (this.f9692i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f9692i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f9693j = j10;
                    if (!this.f9695l) {
                        sensorManager.registerListener(y0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f9687a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9688b;
        if (sensor == null) {
            return true;
        }
        if (!this.f9695l) {
            sensorManager.unregisterListener(this.f9697n, sensor);
        }
        x8 x8Var = this.f9696m;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9696m = null;
        }
        this.f9688b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f9687a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f9695l) {
            sensorManager.unregisterListener(this.f9699p, sensor);
        }
        x8 x8Var = this.f9698o;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9698o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f9687a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f9691g;
        if (sensor == null && this.f9690f == null && this.f9692i == null) {
            return true;
        }
        if (!this.f9695l) {
            x0 x0Var = this.f9701r;
            if (sensor != null) {
                sensorManager.unregisterListener(x0Var, sensor);
            }
            Sensor sensor2 = this.f9690f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(x0Var, sensor2);
            }
            Sensor sensor3 = this.f9692i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f9703t, sensor3);
            }
        }
        x8 x8Var = this.f9700q;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            this.f9700q = null;
        }
        x8 x8Var2 = this.f9702s;
        if (x8Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var2);
            this.f9702s = null;
        }
        this.f9691g = null;
        this.f9690f = null;
        this.f9692i = null;
        return true;
    }
}
