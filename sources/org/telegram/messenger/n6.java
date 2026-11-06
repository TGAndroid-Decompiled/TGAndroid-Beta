package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
public final class n6 {
    public static final String[] f24132e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f24133f = {"goldfish"};
    public static final String[] f24134g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] f24135i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] f24136j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] f24137k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final m6[] f24138l = {new m6(0, "init.svc.qemud", null), new m6(0, "init.svc.qemu-props", null), new m6(0, "qemu.hw.mainkeys", null), new m6(0, "qemu.sf.fake_camera", null), new m6(0, "qemu.sf.lcd_density", null), new m6(0, "ro.bootloader", "unknown"), new m6(0, "ro.bootmode", "unknown"), new m6(0, "ro.hardware", "goldfish"), new m6(0, "ro.kernel.android.qemud", null), new m6(0, "ro.kernel.qemu.gles", null), new m6(0, "ro.kernel.qemu", "1"), new m6(0, "ro.product.device", "generic"), new m6(0, "ro.product.model", "sdk"), new m6(0, "ro.product.name", "sdk"), new m6(0, "ro.serialno", null)};
    public static n6 f24139m;
    public static HashMap f24140n;
    public boolean f24141a;
    public boolean f24142b;
    public final Object f24143c;
    public final Object d;

    public n6(Window window, j9 j9Var) {
        this.f24141a = false;
        this.f24142b = false;
        this.f24143c = window;
        this.d = j9Var;
    }

    public static boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n6.c():boolean");
    }

    public static n6 h(Context context) {
        if (context != null) {
            if (f24139m == null) {
                f24139m = new n6(context.getApplicationContext());
            }
            return f24139m;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public void a() {
        if (this.f24141a) {
            return;
        }
        this.f24141a = true;
        g();
    }

    public boolean b() {
        String str;
        String[] split;
        Context context = (Context) this.f24143c;
        f0.d.b(context, "android.permission.READ_PHONE_STATE");
        if (d(1, f24132e) || d(2, f24135i) || d(3, f24136j) || d(4, f24137k)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i7 = 0; i7 < 2; i7++) {
            File file = fileArr[i7];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (new String(bArr).contains(f24133f[0])) {
                    return true;
                }
            }
        }
        if (d(5, f24134g)) {
            return true;
        }
        if (f0.d.b(context, "android.permission.INTERNET") == 0) {
            String[] strArr = {"/system/bin/netcfg"};
            StringBuilder sb2 = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File("/system/bin/"));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr2 = new byte[1024];
                while (inputStream.read(bArr2) != -1) {
                    sb2.append(new String(bArr2));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                for (String str2 : sb3.split("\n")) {
                    if ((str2.contains("wlan0") || str2.contains("tunl0") || str2.contains("eth0")) && str2.contains("10.0.2.15")) {
                        return true;
                    }
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 15; i11++) {
            m6 m6Var = f24138l[i11];
            String str3 = m6Var.f23985b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = m6Var.f23986c;
            if (str4 == null && str != null) {
                i10++;
            }
            if (str4 != null && str.contains(str4)) {
                i10++;
            }
        }
        if (i10 >= 5 && d(6, h)) {
            return true;
        }
        return false;
    }

    public boolean d(int i7, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (f0.d.b((Context) this.f24143c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if ((str.contains("/") && i7 == 3) || i7 == 4) {
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

    public void e() {
        if (!this.f24141a) {
            return;
        }
        this.f24141a = false;
        g();
    }

    public boolean f() {
        if (this.f24141a) {
            return this.f24142b;
        }
        boolean z9 = true;
        try {
            this.f24141a = true;
            if (!this.f24142b) {
                this.f24142b = c();
            }
            if (!this.f24142b) {
                this.f24142b = b();
            }
            if (!this.f24142b) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.f24143c).getPackageManager();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z9 = false;
                this.f24142b = z9;
            }
            if (!this.f24142b) {
                this.f24142b = b6.b();
            }
            return this.f24142b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z9;
        int intValue;
        int i7 = 1;
        if (this.f24141a && ((j9) this.d).run()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.f24142b) {
            this.f24142b = z9;
            if (!z9) {
                i7 = -1;
            }
            Window window = (Window) this.f24143c;
            if (f24140n == null) {
                f24140n = new HashMap();
            }
            Integer num = (Integer) f24140n.get(window);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int max = Math.max(0, intValue + i7);
            if (max <= 0) {
                f24140n.remove(window);
            } else {
                f24140n.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap = f24140n;
                if (hashMap != null && hashMap.get(window) != null) {
                    window.addFlags(8192);
                    g0.h2();
                    return;
                }
                window.clearFlags(8192);
                g0.h2();
            }
        }
    }

    public n6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24143c = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }
}
