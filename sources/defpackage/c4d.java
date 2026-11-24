package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class c4d implements OnCompleteListener {
    public final i05 a;
    public final char b;
    public final gp c;
    public final long d;
    public final long e;

    public c4d(i05 i05Var, int i, gp gpVar, long j, long j2) {
        this.a = i05Var;
        this.b = i;
        this.c = gpVar;
        this.d = j;
        this.e = j2;
    }

    public static defpackage.qt2 a(defpackage.w3d r4, defpackage.hh0 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4d.a(w3d, hh0, int):qt2");
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
        i05 i05Var = this.a;
        if (i05Var.f()) {
            ol9 ol9Var = (ol9) nl9.C0().b;
            if (ol9Var == null || ol9Var.b) {
                w3d w3dVar = (w3d) i05Var.s.get(this.c);
                if (w3dVar != null) {
                    zz4 zz4Var = w3dVar.b;
                    if (zz4Var instanceof hh0) {
                        zz4 zz4Var2 = zz4Var;
                        long j3 = this.d;
                        int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        boolean z2 = true;
                        int i7 = 0;
                        if (i6 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        short s = zz4Var2.v;
                        if (ol9Var != null) {
                            z &= ol9Var.c;
                            i = ol9Var.d;
                            i3 = ol9Var.e;
                            i2 = ol9Var.a;
                            if (zz4Var2.B != null && !zz4Var2.r()) {
                                qt2 a = a(w3dVar, zz4Var2, this.b);
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
                            if (exception instanceof ap) {
                                Status status = ((ap) exception).getStatus();
                                i4 = status.a;
                                ot2 ot2Var = status.d;
                                if (ot2Var != null) {
                                    i5 = i4;
                                    i7 = ot2Var.b;
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
                        d4d d4dVar = new d4d(new uf7(this.b, i5, i7, j, j2, null, null, s, i9), i2, i8, i3);
                        q79 q79Var = i05Var.y;
                        q79Var.sendMessage(q79Var.obtainMessage(18, d4dVar));
                    }
                }
            }
        }
    }
}
