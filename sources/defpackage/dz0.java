package defpackage;

import java.util.ArrayList;
public final class dz0 {
    public final byte a;
    public final xz0 b;
    public final int c;

    public dz0(xz0 xz0Var, int i, byte b) {
        this.a = b;
        this.b = xz0Var;
        this.c = i;
    }

    public final void a(final long j) {
        switch (this.a) {
            case 0:
                final xz0 xz0Var = this.b;
                mz0 mz0Var = xz0Var.a;
                final int i = this.c;
                mz0Var.j(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j2 = j;
                        int i2 = i;
                        xz0 xz0Var2 = xz0Var;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = xz0Var2.P;
                                mz0 mz0Var2 = xz0Var2.a;
                                if (i2 == xz0Var2.b && xz0Var2.c == 1) {
                                    if (j2 <= 0) {
                                        xz0.d(xz0Var2.m);
                                        xz0Var2.m = mz0Var2.j(new gz0(xz0Var2, (byte) 0), 1000L);
                                        return;
                                    }
                                    xz0Var2.j = j2;
                                    xz0Var2.k = mz0Var2.h();
                                    long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(xz0Var2.i * 1000, 1000L) + 3000)), j2 - 1000);
                                    if (min <= 0) {
                                        xz0.d(xz0Var2.m);
                                        xz0Var2.m = mz0Var2.j(new gz0(xz0Var2, (byte) 0), 1000L);
                                        return;
                                    }
                                    xz0Var2.c = (byte) 2;
                                    long j3 = xz0Var2.f;
                                    if (j3 < 0) {
                                        StringBuilder o = ik8.o(j2, "edge ", ", starting at ");
                                        o.append(min);
                                        mz0Var2.c(o.toString());
                                        xz0Var2.g = min;
                                        xz0Var2.e = xz0.m(min);
                                    } else if (!xz0Var2.F && j2 < j3 - 30000) {
                                        StringBuilder o2 = ik8.o(j2, "edge ", " behind the buffer at ");
                                        o2.append(xz0Var2.f);
                                        o2.append(": a new timeline, starting at ");
                                        o2.append(min);
                                        mz0Var2.c(o2.toString());
                                        xz0Var2.e(true);
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj = arrayList.get(i3);
                                            i3++;
                                            xz0Var2.f((sz0) obj);
                                        }
                                        arrayList.clear();
                                        xz0Var2.h = false;
                                        xz0Var2.g = min;
                                        xz0Var2.e = xz0.m(min);
                                    } else if (min <= j3) {
                                        xz0Var2.e = Math.max(xz0Var2.e, xz0Var2.b());
                                        StringBuilder o3 = ik8.o(j2, "edge ", ", anchor ");
                                        o3.append(min);
                                        o3.append(" inside the buffer, continuing at ");
                                        o3.append(xz0Var2.e);
                                        mz0Var2.c(o3.toString());
                                    } else {
                                        StringBuilder o4 = ik8.o(j2, "edge ", ", jumping to ");
                                        o4.append(min);
                                        mz0Var2.c(o4.toString());
                                        xz0Var2.e(true);
                                        int size2 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayList.get(i4);
                                            i4++;
                                            xz0Var2.f((sz0) obj2);
                                        }
                                        arrayList.clear();
                                        xz0Var2.h = false;
                                        xz0Var2.g = min;
                                        xz0Var2.e = xz0.m(min);
                                    }
                                    xz0Var2.w();
                                    return;
                                }
                                return;
                            default:
                                if (i2 == xz0Var2.b) {
                                    xz0Var2.s = false;
                                    if (xz0Var2.c == 2 && j2 > 0) {
                                        xz0Var2.j = j2;
                                        xz0Var2.k = xz0Var2.a.h();
                                        xz0Var2.E();
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, 0L);
                return;
            default:
                final xz0 xz0Var2 = this.b;
                mz0 mz0Var2 = xz0Var2.a;
                final int i2 = this.c;
                mz0Var2.j(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j2 = j;
                        int i22 = i2;
                        xz0 xz0Var22 = xz0Var2;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = xz0Var22.P;
                                mz0 mz0Var22 = xz0Var22.a;
                                if (i22 == xz0Var22.b && xz0Var22.c == 1) {
                                    if (j2 <= 0) {
                                        xz0.d(xz0Var22.m);
                                        xz0Var22.m = mz0Var22.j(new gz0(xz0Var22, (byte) 0), 1000L);
                                        return;
                                    }
                                    xz0Var22.j = j2;
                                    xz0Var22.k = mz0Var22.h();
                                    long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(xz0Var22.i * 1000, 1000L) + 3000)), j2 - 1000);
                                    if (min <= 0) {
                                        xz0.d(xz0Var22.m);
                                        xz0Var22.m = mz0Var22.j(new gz0(xz0Var22, (byte) 0), 1000L);
                                        return;
                                    }
                                    xz0Var22.c = (byte) 2;
                                    long j3 = xz0Var22.f;
                                    if (j3 < 0) {
                                        StringBuilder o = ik8.o(j2, "edge ", ", starting at ");
                                        o.append(min);
                                        mz0Var22.c(o.toString());
                                        xz0Var22.g = min;
                                        xz0Var22.e = xz0.m(min);
                                    } else if (!xz0Var22.F && j2 < j3 - 30000) {
                                        StringBuilder o2 = ik8.o(j2, "edge ", " behind the buffer at ");
                                        o2.append(xz0Var22.f);
                                        o2.append(": a new timeline, starting at ");
                                        o2.append(min);
                                        mz0Var22.c(o2.toString());
                                        xz0Var22.e(true);
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj = arrayList.get(i3);
                                            i3++;
                                            xz0Var22.f((sz0) obj);
                                        }
                                        arrayList.clear();
                                        xz0Var22.h = false;
                                        xz0Var22.g = min;
                                        xz0Var22.e = xz0.m(min);
                                    } else if (min <= j3) {
                                        xz0Var22.e = Math.max(xz0Var22.e, xz0Var22.b());
                                        StringBuilder o3 = ik8.o(j2, "edge ", ", anchor ");
                                        o3.append(min);
                                        o3.append(" inside the buffer, continuing at ");
                                        o3.append(xz0Var22.e);
                                        mz0Var22.c(o3.toString());
                                    } else {
                                        StringBuilder o4 = ik8.o(j2, "edge ", ", jumping to ");
                                        o4.append(min);
                                        mz0Var22.c(o4.toString());
                                        xz0Var22.e(true);
                                        int size2 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayList.get(i4);
                                            i4++;
                                            xz0Var22.f((sz0) obj2);
                                        }
                                        arrayList.clear();
                                        xz0Var22.h = false;
                                        xz0Var22.g = min;
                                        xz0Var22.e = xz0.m(min);
                                    }
                                    xz0Var22.w();
                                    return;
                                }
                                return;
                            default:
                                if (i22 == xz0Var22.b) {
                                    xz0Var22.s = false;
                                    if (xz0Var22.c == 2 && j2 > 0) {
                                        xz0Var22.j = j2;
                                        xz0Var22.k = xz0Var22.a.h();
                                        xz0Var22.E();
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, 0L);
                return;
        }
    }
}
