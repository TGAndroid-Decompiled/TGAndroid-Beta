package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
public final class c34 implements ws4 {
    public static HashMap E;
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f = {"goldfish"};
    public static final String[] h = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] n = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] r = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] s = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] w = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final we3[] x = {new we3("init.svc.qemud", null), new we3("init.svc.qemu-props", null), new we3("qemu.hw.mainkeys", null), new we3("qemu.sf.fake_camera", null), new we3("qemu.sf.lcd_density", null), new we3("ro.bootloader", "unknown"), new we3("ro.bootmode", "unknown"), new we3("ro.hardware", "goldfish"), new we3("ro.kernel.android.qemud", null), new we3("ro.kernel.qemu.gles", null), new we3("ro.kernel.qemu", "1"), new we3("ro.product.device", "generic"), new we3("ro.product.model", "sdk"), new we3("ro.product.name", "sdk"), new we3("ro.serialno", null)};
    public static c34 y;
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    public c34() {
        this.c = new Path();
        this.d = new Rect();
    }

    public static boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c34.d():boolean");
    }

    public static c34 m(Context context) {
        if (context != null) {
            c34 c34Var = y;
            if (c34Var == null) {
                Context applicationContext = context.getApplicationContext();
                ?? obj = new Object();
                ArrayList arrayList = new ArrayList();
                obj.d = arrayList;
                obj.c = applicationContext;
                arrayList.add("com.google.android.launcher.layouts.genymotion");
                arrayList.add("com.bluestacks");
                arrayList.add("com.bignox.app");
                arrayList.add("com.vphone.launcher");
                y = obj;
                return obj;
            }
            return c34Var;
        }
        lq5.j("Context must not be null.");
        return null;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        i();
    }

    public final boolean b(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z = this.b;
        zu1 zu1Var = (zu1) this.d;
        ArrayList arrayList = zu1Var.M6;
        int i2 = i - zu1Var.D0.K;
        if (i2 >= 0 && i2 < arrayList.size()) {
            r47 r47Var = (r47) arrayList.get(i2);
            if (r47Var.U == 0) {
                if (!z) {
                    if (sparseArray.get(r47Var.e1(), null) == null) {
                        return true;
                    }
                    return false;
                } else if (sparseArray.get(r47Var.e1(), null) != null) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        String str;
        String[] split;
        Context context = (Context) this.c;
        sr.b(context, "android.permission.READ_PHONE_STATE");
        if (e(1, e) || e(2, r) || e(3, s) || e(4, w)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (new String(bArr).contains(f[0])) {
                    return true;
                }
            }
        }
        if (e(5, h)) {
            return true;
        }
        if (sr.b(context, "android.permission.INTERNET") == 0) {
            String[] strArr = {"/system/bin/netcfg"};
            StringBuilder sb = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File("/system/bin/"));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr2 = new byte[1024];
                while (inputStream.read(bArr2) != -1) {
                    sb.append(new String(bArr2));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                for (String str2 : sb2.split("\n")) {
                    if ((str2.contains("wlan0") || str2.contains("tunl0") || str2.contains("eth0")) && str2.contains("10.0.2.15")) {
                        return true;
                    }
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 15; i3++) {
            we3 we3Var = x[i3];
            String str3 = we3Var.a;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = we3Var.b;
            if (str4 == null && str != null) {
                i2++;
            }
            if (str4 != null && str.contains(str4)) {
                i2++;
            }
        }
        if (i2 >= 5 && e(6, n)) {
            return true;
        }
        return false;
    }

    public final boolean e(int i, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (sr.b((Context) this.c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if ((str.contains("/") && i == 3) || i == 4) {
                    file = new File(Environment.getExternalStorageDirectory() + str);
                } else {
                    file = new File(str);
                }
            } else {
                file = new File(str);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (!this.a) {
            this.a = true;
            rj4 rj4Var = (rj4) this.c;
            if (rj4Var != null) {
                rj4Var.run();
            }
            g25 g25Var = (g25) this.d;
            if (g25Var != null && !this.b) {
                g25Var.run();
            }
        }
    }

    public final void g() {
        if (!this.a) {
            return;
        }
        this.a = false;
        i();
    }

    public final boolean h() {
        if (this.a) {
            return this.b;
        }
        boolean z = true;
        try {
            this.a = true;
            boolean z2 = this.b;
            if (!z2) {
                z2 = d();
                this.b = z2;
            }
            if (!z2) {
                z2 = c();
                this.b = z2;
            }
            if (!z2) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.c).getPackageManager();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z = false;
                this.b = z;
                z2 = z;
            }
            if (!z2) {
                boolean a = mdd.a();
                this.b = a;
                return a;
            }
            return z2;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void i() {
        boolean z;
        int intValue;
        int i = 1;
        if (this.a && ((kk4) this.d).run()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.b) {
            this.b = z;
            if (!z) {
                i = -1;
            }
            Window window = (Window) this.c;
            HashMap hashMap = E;
            if (hashMap == null) {
                hashMap = new HashMap();
                E = hashMap;
            }
            Integer num = (Integer) hashMap.get(window);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int max = Math.max(0, intValue + i);
            HashMap hashMap2 = E;
            if (max <= 0) {
                hashMap2.remove(window);
            } else {
                hashMap2.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap3 = E;
                if (hashMap3 != null && hashMap3.get(window) != null) {
                    window.addFlags(8192);
                    hl.f2();
                    return;
                }
                window.clearFlags(8192);
                hl.f2();
            }
        }
    }

    public final boolean j(Rect rect, boolean z, boolean z2) {
        boolean z3;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z2 && this.b == z && z2 && z) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.a = z2;
        this.b = z;
        rect2.set(rect);
        return z3;
    }

    public final void l(float r8, float r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c34.l(float, float, int, boolean):void");
    }

    @Override
    public final void onSuccess(Object obj) {
        yw6 yw6Var = (yw6) obj;
        yx6 yx6Var = ((qy6) this.d).j;
        my6 my6Var = new my6(this, yw6Var, this.a, this.b, (xw6) this.c, (byte) 0);
        yx6Var.getClass();
        my6Var.run();
    }

    public c34(rj4 rj4Var, g25 g25Var) {
        this.c = rj4Var;
        this.d = g25Var;
    }

    public c34(Window window, kk4 kk4Var) {
        this.a = false;
        this.b = false;
        this.c = window;
        this.d = kk4Var;
    }

    @Override
    public final void k(Throwable th) {
    }
}
