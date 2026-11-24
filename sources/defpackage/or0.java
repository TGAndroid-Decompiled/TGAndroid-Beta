package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class or0 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public cv0 k;
    public boolean l;
    public oz m;
    public oz o;
    public oz q;
    public oz s;
    public final lr0 n = new lr0(this, (byte) 0);
    public final lr0 p = new lr0(this, (byte) 1);
    public final mr0 r = new mr0(this);
    public final nr0 t = new nr0(this);

    public or0(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j) {
        if (j >= 160) {
            return 3;
        }
        if (j >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.l) {
            this.l = true;
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                Sensor sensor = this.b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.n, sensor);
                }
                oz ozVar = this.m;
                if (ozVar != null) {
                    gl.r(ozVar);
                    this.m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.p, sensor2);
                }
                oz ozVar2 = this.o;
                if (ozVar2 != null) {
                    gl.r(ozVar2);
                    this.o = null;
                }
                Sensor sensor3 = this.g;
                mr0 mr0Var = this.r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(mr0Var, sensor3);
                }
                Sensor sensor4 = this.f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(mr0Var, sensor4);
                }
                oz ozVar3 = this.q;
                if (ozVar3 != null) {
                    gl.r(ozVar3);
                    this.q = null;
                }
                Sensor sensor5 = this.i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.t, sensor5);
                }
                oz ozVar4 = this.s;
                if (ozVar4 != null) {
                    gl.r(ozVar4);
                    this.s = null;
                }
            }
        }
    }

    public final boolean c(long j) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            if (this.b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.c = j;
                if (!this.l) {
                    sensorManager.registerListener(this.n, defaultSensor, a(j));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j;
                if (!this.l) {
                    sensorManager.registerListener(this.p, defaultSensor, a(j));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j, boolean z) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            nr0 nr0Var = this.t;
            mr0 mr0Var = this.r;
            if (z) {
                if (this.i != null) {
                    oz ozVar = this.s;
                    if (ozVar != null) {
                        gl.r(ozVar);
                        this.s = null;
                    }
                    if (!this.l && (sensor = this.i) != null) {
                        sensorManager.unregisterListener(nr0Var, sensor);
                    }
                    this.i = null;
                }
                if (this.f == null || this.g == null) {
                    this.g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f = defaultSensor;
                    Sensor sensor2 = this.g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j;
                        if (!this.l) {
                            sensorManager.registerListener(mr0Var, sensor2, a(j));
                            sensorManager.registerListener(mr0Var, this.f, a(j));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f != null || this.g != null) {
                    oz ozVar2 = this.q;
                    if (ozVar2 != null) {
                        gl.r(ozVar2);
                        this.q = null;
                    }
                    if (!this.l) {
                        Sensor sensor3 = this.g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(mr0Var, sensor3);
                        }
                        Sensor sensor4 = this.f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(mr0Var, sensor4);
                        }
                    }
                    this.g = null;
                    this.f = null;
                }
                if (this.i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.j = j;
                    if (!this.l) {
                        sensorManager.registerListener(nr0Var, defaultSensor2, a(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        oz ozVar = this.m;
        if (ozVar != null) {
            gl.r(ozVar);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        oz ozVar = this.o;
        if (ozVar != null) {
            gl.r(ozVar);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            mr0 mr0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(mr0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(mr0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        oz ozVar = this.q;
        if (ozVar != null) {
            gl.r(ozVar);
            this.q = null;
        }
        oz ozVar2 = this.s;
        if (ozVar2 != null) {
            gl.r(ozVar2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
