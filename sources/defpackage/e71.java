package defpackage;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public final class e71 implements Runnable {
    public final byte a;
    public final y71 b;

    public e71(y71 y71Var, byte b) {
        this.a = b;
        this.b = y71Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                y71 y71Var = this.b;
                y71Var.resumeDelayedFragmentAnimation();
                y71Var.L = false;
                y71Var.A0(true);
                y71Var.y0();
                return;
            case 1:
                y71 y71Var2 = this.b;
                y71Var2.getFileLoader().d.c();
                c81 c81Var = new c81(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                y71Var2.k0(bc4.j(4), 6, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(0), 0, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(100), 0, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(2), 1, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(101), 1, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(1), 4, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(6), 6, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(3), 2, longSparseArray, c81Var);
                y71Var2.k0(bc4.j(5), 2, longSparseArray, c81Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < longSparseArray.size(); i++) {
                    s71 s71Var = (s71) longSparseArray.valueAt(i);
                    arrayList.add(s71Var);
                    if (y71Var2.getMessagesController().a2(((s71) arrayList.get(i)).a) == null) {
                        long j = s71Var.a;
                        if (j > 0) {
                            arrayList2.add(Long.valueOf(j));
                        } else {
                            arrayList3.add(Long.valueOf(j));
                        }
                    }
                }
                Collections.sort(c81Var.d, new sa((byte) 14));
                Collections.sort(c81Var.e, new sa((byte) 14));
                Collections.sort(c81Var.f, new sa((byte) 14));
                Collections.sort(c81Var.g, new sa((byte) 14));
                Collections.sort(c81Var.h, new sa((byte) 14));
                y71Var2.getMessagesStorage().a.c(new f71(y71Var2, arrayList2, arrayList3, arrayList, c81Var, (byte) 0));
                return;
            default:
                y71 y71Var3 = this.b;
                y71Var3.f = y71.n0(bc4.j(4), 5);
                if (!y71.i0) {
                    y71Var3.n = y71.n0(bc4.j(4), 4);
                    if (!y71.i0) {
                        long n0 = y71.n0(bc4.j(0), 0);
                        y71Var3.y = n0;
                        y71Var3.y = y71.n0(bc4.j(100), 0) + n0;
                        if (!y71.i0) {
                            long n02 = y71.n0(bc4.j(2), 0);
                            y71Var3.E = n02;
                            y71Var3.E = y71.n0(bc4.j(101), 0) + n02;
                            if (!y71.i0) {
                                y71Var3.F = y71.n0(gm.O0(), 1);
                                boolean z = e21.a;
                                if (!y71.i0) {
                                    long n03 = y71.n0(bc4.j(3), 1);
                                    y71Var3.r = n03;
                                    y71Var3.r = y71.n0(bc4.j(5), 1) + n03;
                                    if (!y71.i0) {
                                        long n04 = y71.n0(bc4.j(3), 2);
                                        y71Var3.x = n04;
                                        y71Var3.x = y71.n0(bc4.j(5), 2) + n04;
                                        if (!y71.i0) {
                                            y71Var3.G = y71.n0(new File(bc4.j(4), "acache"), 0);
                                            if (!y71.i0) {
                                                y71Var3.h = y71.n0(bc4.j(4), 3);
                                                if (!y71.i0) {
                                                    y71Var3.G += y71Var3.h;
                                                    y71Var3.s = y71.n0(bc4.j(1), 0);
                                                    y71Var3.w = y71.n0(bc4.j(6), 0);
                                                    if (!y71.i0) {
                                                        long j2 = y71Var3.f + y71Var3.n + y71Var3.E + y71Var3.F + y71Var3.s + y71Var3.y + y71Var3.r + y71Var3.x + y71Var3.w + y71Var3.G;
                                                        y71.k0 = Long.valueOf(j2);
                                                        y71Var3.H = j2;
                                                        y71.j0 = System.currentTimeMillis();
                                                        ArrayList c1 = gm.c1();
                                                        File file = (File) c1.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(gda.e0)) {
                                                            int size = c1.size();
                                                            for (int i2 = 0; i2 < size; i2++) {
                                                                File file2 = (File) c1.get(i2);
                                                                if (file2.getAbsolutePath().startsWith(gda.e0)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            y71Var3.I = statFs.getBlockCountLong() * blockSizeLong;
                                                            y71Var3.J = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                        }
                                                        gm.c3(new e71(y71Var3, (byte) 0));
                                                        lc4 lc4Var = y71Var3.getFileLoader().d;
                                                        lc4Var.d();
                                                        lc4Var.a.c(new e71(y71Var3, (byte) 1));
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
