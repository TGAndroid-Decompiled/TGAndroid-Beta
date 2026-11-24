package defpackage;

import java.util.ArrayList;
public final class vy0 {
    public final byte a;
    public final pz0 b;
    public final int c;

    public vy0(pz0 pz0Var, int i, byte b) {
        this.a = b;
        this.b = pz0Var;
        this.c = i;
    }

    public final void a(final long j) {
        switch (this.a) {
            case 0:
                final pz0 pz0Var = this.b;
                ez0 ez0Var = pz0Var.a;
                final int i = this.c;
                ez0Var.j(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j2 = j;
                        int i2 = i;
                        pz0 pz0Var2 = pz0Var;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = pz0Var2.P;
                                ez0 ez0Var2 = pz0Var2.a;
                                if (i2 == pz0Var2.b && pz0Var2.c == 1) {
                                    if (j2 <= 0) {
                                        pz0.d(pz0Var2.m);
                                        pz0Var2.m = ez0Var2.j(new yy0(pz0Var2, (byte) 0), 1000L);
                                        return;
                                    }
                                    pz0Var2.j = j2;
                                    pz0Var2.k = ez0Var2.h();
                                    long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(pz0Var2.i * 1000, 1000L) + 3000)), j2 - 1000);
                                    if (min <= 0) {
                                        pz0.d(pz0Var2.m);
                                        pz0Var2.m = ez0Var2.j(new yy0(pz0Var2, (byte) 0), 1000L);
                                        return;
                                    }
                                    pz0Var2.c = (byte) 2;
                                    long j3 = pz0Var2.f;
                                    if (j3 < 0) {
                                        StringBuilder o = ug8.o(j2, "edge ", ", starting at ");
                                        o.append(min);
                                        ez0Var2.d(o.toString());
                                        pz0Var2.g = min;
                                        pz0Var2.e = pz0.m(min);
                                    } else if (!pz0Var2.F && j2 < j3 - 30000) {
                                        StringBuilder o2 = ug8.o(j2, "edge ", " behind the buffer at ");
                                        o2.append(pz0Var2.f);
                                        o2.append(": a new timeline, starting at ");
                                        o2.append(min);
                                        ez0Var2.d(o2.toString());
                                        pz0Var2.e(true);
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj = arrayList.get(i3);
                                            i3++;
                                            pz0Var2.f((kz0) obj);
                                        }
                                        arrayList.clear();
                                        pz0Var2.h = false;
                                        pz0Var2.g = min;
                                        pz0Var2.e = pz0.m(min);
                                    } else if (min <= j3) {
                                        pz0Var2.e = Math.max(pz0Var2.e, pz0Var2.b());
                                        StringBuilder o3 = ug8.o(j2, "edge ", ", anchor ");
                                        o3.append(min);
                                        o3.append(" inside the buffer, continuing at ");
                                        o3.append(pz0Var2.e);
                                        ez0Var2.d(o3.toString());
                                    } else {
                                        StringBuilder o4 = ug8.o(j2, "edge ", ", jumping to ");
                                        o4.append(min);
                                        ez0Var2.d(o4.toString());
                                        pz0Var2.e(true);
                                        int size2 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayList.get(i4);
                                            i4++;
                                            pz0Var2.f((kz0) obj2);
                                        }
                                        arrayList.clear();
                                        pz0Var2.h = false;
                                        pz0Var2.g = min;
                                        pz0Var2.e = pz0.m(min);
                                    }
                                    pz0Var2.w();
                                    return;
                                }
                                return;
                            default:
                                if (i2 == pz0Var2.b) {
                                    pz0Var2.s = false;
                                    if (pz0Var2.c == 2 && j2 > 0) {
                                        pz0Var2.j = j2;
                                        pz0Var2.k = pz0Var2.a.h();
                                        pz0Var2.E();
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
                final pz0 pz0Var2 = this.b;
                ez0 ez0Var2 = pz0Var2.a;
                final int i2 = this.c;
                ez0Var2.j(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j2 = j;
                        int i22 = i2;
                        pz0 pz0Var22 = pz0Var2;
                        switch (b) {
                            case 0:
                                ArrayList arrayList = pz0Var22.P;
                                ez0 ez0Var22 = pz0Var22.a;
                                if (i22 == pz0Var22.b && pz0Var22.c == 1) {
                                    if (j2 <= 0) {
                                        pz0.d(pz0Var22.m);
                                        pz0Var22.m = ez0Var22.j(new yy0(pz0Var22, (byte) 0), 1000L);
                                        return;
                                    }
                                    pz0Var22.j = j2;
                                    pz0Var22.k = ez0Var22.h();
                                    long min = Math.min(Math.max(j2 - 30000, j2 - (Math.min(pz0Var22.i * 1000, 1000L) + 3000)), j2 - 1000);
                                    if (min <= 0) {
                                        pz0.d(pz0Var22.m);
                                        pz0Var22.m = ez0Var22.j(new yy0(pz0Var22, (byte) 0), 1000L);
                                        return;
                                    }
                                    pz0Var22.c = (byte) 2;
                                    long j3 = pz0Var22.f;
                                    if (j3 < 0) {
                                        StringBuilder o = ug8.o(j2, "edge ", ", starting at ");
                                        o.append(min);
                                        ez0Var22.d(o.toString());
                                        pz0Var22.g = min;
                                        pz0Var22.e = pz0.m(min);
                                    } else if (!pz0Var22.F && j2 < j3 - 30000) {
                                        StringBuilder o2 = ug8.o(j2, "edge ", " behind the buffer at ");
                                        o2.append(pz0Var22.f);
                                        o2.append(": a new timeline, starting at ");
                                        o2.append(min);
                                        ez0Var22.d(o2.toString());
                                        pz0Var22.e(true);
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj = arrayList.get(i3);
                                            i3++;
                                            pz0Var22.f((kz0) obj);
                                        }
                                        arrayList.clear();
                                        pz0Var22.h = false;
                                        pz0Var22.g = min;
                                        pz0Var22.e = pz0.m(min);
                                    } else if (min <= j3) {
                                        pz0Var22.e = Math.max(pz0Var22.e, pz0Var22.b());
                                        StringBuilder o3 = ug8.o(j2, "edge ", ", anchor ");
                                        o3.append(min);
                                        o3.append(" inside the buffer, continuing at ");
                                        o3.append(pz0Var22.e);
                                        ez0Var22.d(o3.toString());
                                    } else {
                                        StringBuilder o4 = ug8.o(j2, "edge ", ", jumping to ");
                                        o4.append(min);
                                        ez0Var22.d(o4.toString());
                                        pz0Var22.e(true);
                                        int size2 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayList.get(i4);
                                            i4++;
                                            pz0Var22.f((kz0) obj2);
                                        }
                                        arrayList.clear();
                                        pz0Var22.h = false;
                                        pz0Var22.g = min;
                                        pz0Var22.e = pz0.m(min);
                                    }
                                    pz0Var22.w();
                                    return;
                                }
                                return;
                            default:
                                if (i22 == pz0Var22.b) {
                                    pz0Var22.s = false;
                                    if (pz0Var22.c == 2 && j2 > 0) {
                                        pz0Var22.j = j2;
                                        pz0Var22.k = pz0Var22.a.h();
                                        pz0Var22.E();
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
