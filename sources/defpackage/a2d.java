package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class a2d implements OnCompleteListener {
    public final hy4 a;
    public final char b;
    public final go c;
    public final long d;
    public final long e;

    public a2d(hy4 hy4Var, int i, go goVar, long j, long j2) {
        this.a = hy4Var;
        this.b = i;
        this.c = goVar;
        this.d = j;
        this.e = j2;
    }

    public static defpackage.fs2 a(defpackage.u1d r4, defpackage.gg0 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.a(u1d, gg0, int):fs2");
    }

    @Override
    public final void onComplete(Task task) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        hy4 hy4Var = this.a;
        if (hy4Var.f()) {
            mj9 mj9Var = (mj9) lj9.z().b;
            if (mj9Var == null || mj9Var.b) {
                u1d u1dVar = (u1d) hy4Var.s.get(this.c);
                if (u1dVar != null) {
                    xx4 xx4Var = u1dVar.b;
                    if (xx4Var instanceof gg0) {
                        xx4 xx4Var2 = xx4Var;
                        long j3 = this.d;
                        int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        boolean z2 = true;
                        int i7 = 0;
                        if (i6 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        short s = xx4Var2.v;
                        if (mj9Var != null) {
                            z &= mj9Var.c;
                            i = mj9Var.d;
                            i3 = mj9Var.e;
                            i2 = mj9Var.a;
                            if (xx4Var2.B != null && !xx4Var2.r()) {
                                fs2 a = a(u1dVar, xx4Var2, this.b);
                                if (a != null) {
                                    if (!a.c || i6 <= 0) {
                                        z2 = false;
                                    }
                                    i3 = a.e;
                                    z = z2;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int i9 = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i7 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof zn) {
                                Status status = ((zn) exception).getStatus();
                                i4 = status.a;
                                ds2 ds2Var = status.d;
                                if (ds2Var != null) {
                                    i5 = i4;
                                    i7 = ds2Var.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i7 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        b2d b2dVar = new b2d(new sd7(this.b, i5, i7, j, j2, null, null, s, i9), i2, i8, i3);
                        o59 o59Var = hy4Var.y;
                        o59Var.sendMessage(o59Var.obtainMessage(18, b2dVar));
                    }
                }
            }
        }
    }
}
