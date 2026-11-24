package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
public final class mn implements Choreographer.FrameCallback {
    public final byte a;
    public final Object b;

    public mn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void doFrame(long j) {
        boolean z;
        float f;
        float min;
        boolean z2;
        switch (this.a) {
            case 0:
                nn nnVar = (nn) ((qx4) ((mv6) this.b).b).a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = nnVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i = 0; i < arrayList.size(); i++) {
                    yla ylaVar = (yla) arrayList.get(i);
                    if (ylaVar != null) {
                        aia aiaVar = nnVar.a;
                        Long l = (Long) aiaVar.get(ylaVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                aiaVar.remove(ylaVar);
                            }
                        }
                        long j2 = ylaVar.i;
                        if (j2 == 0) {
                            ylaVar.i = uptimeMillis;
                            ylaVar.g(ylaVar.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            ylaVar.i = uptimeMillis;
                            int i2 = (ylaVar.n > Float.MAX_VALUE ? 1 : (ylaVar.n == Float.MAX_VALUE ? 0 : -1));
                            zla zlaVar = ylaVar.m;
                            if (i2 != 0) {
                                double d = zlaVar.i;
                                z = true;
                                long j4 = j3 / 2;
                                r1 c = zlaVar.c(ylaVar.b, ylaVar.a, j4);
                                zla zlaVar2 = ylaVar.m;
                                zlaVar2.i = ylaVar.n;
                                ylaVar.n = Float.MAX_VALUE;
                                r1 c2 = zlaVar2.c(c.a, c.b, j4);
                                f = c2.a;
                                ylaVar.b = f;
                                ylaVar.a = c2.b;
                            } else {
                                z = true;
                                r1 c3 = zlaVar.c(ylaVar.b, ylaVar.a, j3);
                                f = c3.a;
                                ylaVar.b = f;
                                ylaVar.a = c3.b;
                            }
                            float max = Math.max(f, ylaVar.h);
                            ylaVar.b = max;
                            ylaVar.b = Math.min(max, ylaVar.g);
                            float f2 = ylaVar.a;
                            zla zlaVar3 = ylaVar.m;
                            if (Math.abs(f2) < zlaVar3.e && Math.abs(min - ((float) zlaVar3.i)) < zlaVar3.d) {
                                ylaVar.b = (float) ylaVar.m.i;
                                ylaVar.a = 0.0f;
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            float min2 = Math.min(ylaVar.b, ylaVar.g);
                            ylaVar.b = min2;
                            float max2 = Math.max(min2, ylaVar.h);
                            ylaVar.b = max2;
                            ylaVar.g(max2);
                            if (z2) {
                                ylaVar.e(false);
                            }
                        }
                    }
                }
                if (nnVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    nnVar.e = false;
                }
                if (arrayList.size() > 0) {
                    mv6 mv6Var = nnVar.d;
                    if (mv6Var == null) {
                        mv6Var = new mv6(nnVar.c);
                        nnVar.d = mv6Var;
                    }
                    ((Choreographer) mv6Var.c).postFrameCallback((mn) mv6Var.d);
                    return;
                }
                return;
            default:
                gjb gjbVar = ((ijb) this.b).a;
                if (gjbVar != null) {
                    Handler handler = gjbVar.getHandler();
                    if (handler != null && gjbVar.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((ijb) this.b).a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
