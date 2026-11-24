package defpackage;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class x51 implements Runnable {
    public final byte a;
    public final r61 b;

    public x51(r61 r61Var, byte b) {
        this.a = b;
        this.b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                r61 r61Var = this.b;
                r61Var.resumeDelayedFragmentAnimation();
                r61Var.L = false;
                r61Var.z0(true);
                r61Var.x0();
                return;
            case 1:
                r61 r61Var2 = this.b;
                r61Var2.getFileLoader().d.c();
                v61 v61Var = new v61(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                r61Var2.j0(ba4.j(4), 6, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(0), 0, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(100), 0, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(2), 1, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(101), 1, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(1), 4, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(6), 6, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(3), 2, longSparseArray, v61Var);
                r61Var2.j0(ba4.j(5), 2, longSparseArray, v61Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < longSparseArray.size(); i++) {
                    l61 l61Var = (l61) longSparseArray.valueAt(i);
                    arrayList.add(l61Var);
                    if (r61Var2.getMessagesController().Z1(((l61) arrayList.get(i)).a) == null) {
                        long j = l61Var.a;
                        if (j > 0) {
                            arrayList2.add(Long.valueOf(j));
                        } else {
                            arrayList3.add(Long.valueOf(j));
                        }
                    }
                }
                Collections.sort(v61Var.d, new sa((byte) 14));
                Collections.sort(v61Var.e, new sa((byte) 14));
                Collections.sort(v61Var.f, new sa((byte) 14));
                Collections.sort(v61Var.g, new sa((byte) 14));
                Collections.sort(v61Var.h, new sa((byte) 14));
                r61Var2.getMessagesStorage().a.c(new y51(r61Var2, arrayList2, arrayList3, arrayList, v61Var, (byte) 0));
                return;
            default:
                r61 r61Var3 = this.b;
                r61Var3.f = r61.m0(ba4.j(4), 5);
                if (!r61.i0) {
                    r61Var3.n = r61.m0(ba4.j(4), 4);
                    if (!r61.i0) {
                        long m0 = r61.m0(ba4.j(0), 0);
                        r61Var3.y = m0;
                        r61Var3.y = r61.m0(ba4.j(100), 0) + m0;
                        if (!r61.i0) {
                            long m02 = r61.m0(ba4.j(2), 0);
                            r61Var3.E = m02;
                            r61Var3.E = r61.m0(ba4.j(101), 0) + m02;
                            if (!r61.i0) {
                                r61Var3.F = r61.m0(gl.O0(), 1);
                                boolean z = w01.a;
                                if (!r61.i0) {
                                    long m03 = r61.m0(ba4.j(3), 1);
                                    r61Var3.r = m03;
                                    r61Var3.r = r61.m0(ba4.j(5), 1) + m03;
                                    if (!r61.i0) {
                                        long m04 = r61.m0(ba4.j(3), 2);
                                        r61Var3.x = m04;
                                        r61Var3.x = r61.m0(ba4.j(5), 2) + m04;
                                        if (!r61.i0) {
                                            r61Var3.G = r61.m0(new File(ba4.j(4), "acache"), 0);
                                            if (!r61.i0) {
                                                r61Var3.h = r61.m0(ba4.j(4), 3);
                                                if (!r61.i0) {
                                                    r61Var3.G += r61Var3.h;
                                                    r61Var3.s = r61.m0(ba4.j(1), 0);
                                                    r61Var3.w = r61.m0(ba4.j(6), 0);
                                                    if (!r61.i0) {
                                                        long j2 = r61Var3.f + r61Var3.n + r61Var3.E + r61Var3.F + r61Var3.s + r61Var3.y + r61Var3.r + r61Var3.x + r61Var3.w + r61Var3.G;
                                                        r61.k0 = Long.valueOf(j2);
                                                        r61Var3.H = j2;
                                                        r61.j0 = System.currentTimeMillis();
                                                        ArrayList c1 = gl.c1();
                                                        File file = (File) c1.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(gba.e0)) {
                                                            int size = c1.size();
                                                            for (int i2 = 0; i2 < size; i2++) {
                                                                File file2 = (File) c1.get(i2);
                                                                if (file2.getAbsolutePath().startsWith(gba.e0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            r61Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            r61Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
                                                        }
                                                        gl.d3(new x51(r61Var3, (byte) 0));
                                                        la4 la4Var = r61Var3.getFileLoader().d;
                                                        la4Var.d();
                                                        la4Var.a.c(new x51(r61Var3, (byte) 1));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
