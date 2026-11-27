package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class r6d implements OnCompleteListener {
    public final n05 a;
    public final char b;
    public final ho c;
    public final long d;
    public final long e;

    public r6d(n05 n05Var, int i, ho hoVar, long j, long j2) {
        this.a = n05Var;
        this.b = i;
        this.c = hoVar;
        this.d = j;
        this.e = j2;
    }

    public static defpackage.ys2 a(defpackage.l6d r4, defpackage.hg0 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6d.a(l6d, hg0, int):ys2");
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
        n05 n05Var = this.a;
        if (n05Var.f()) {
            an9 an9Var = (an9) zm9.I0().b;
            if (an9Var == null || an9Var.b) {
                l6d l6dVar = (l6d) n05Var.s.get(this.c);
                if (l6dVar != null) {
                    d05 d05Var = l6dVar.b;
                    if (d05Var instanceof hg0) {
                        d05 d05Var2 = d05Var;
                        long j3 = this.d;
                        int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        boolean z2 = true;
                        int i7 = 0;
                        if (i6 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        short s = d05Var2.v;
                        if (an9Var != null) {
                            z &= an9Var.c;
                            i = an9Var.d;
                            i3 = an9Var.e;
                            i2 = an9Var.a;
                            if (d05Var2.B != null && !d05Var2.r()) {
                                ys2 a = a(l6dVar, d05Var2, this.b);
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
                            if (exception instanceof ao) {
                                Status status = ((ao) exception).getStatus();
                                i4 = status.a;
                                ws2 ws2Var = status.d;
                                if (ws2Var != null) {
                                    i5 = i4;
                                    i7 = ws2Var.b;
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
                        s6d s6dVar = new s6d(new bg7(this.b, i5, i7, j, j2, null, null, s, i9), i2, i8, i3);
                        b99 b99Var = n05Var.y;
                        b99Var.sendMessage(b99Var.obtainMessage(18, s6dVar));
                    }
                }
            }
        }
    }
}
