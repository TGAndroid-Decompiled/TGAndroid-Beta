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
    public static final String[] f24316e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f24317f = {"goldfish"};
    public static final String[] f24318g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] f24319i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] f24320j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] f24321k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final m6[] f24322l = {new m6("init.svc.qemud", null, false), new m6("init.svc.qemu-props", null, false), new m6("qemu.hw.mainkeys", null, false), new m6("qemu.sf.fake_camera", null, false), new m6("qemu.sf.lcd_density", null, false), new m6("ro.bootloader", "unknown", false), new m6("ro.bootmode", "unknown", false), new m6("ro.hardware", "goldfish", false), new m6("ro.kernel.android.qemud", null, false), new m6("ro.kernel.qemu.gles", null, false), new m6("ro.kernel.qemu", "1", false), new m6("ro.product.device", "generic", false), new m6("ro.product.model", "sdk", false), new m6("ro.product.name", "sdk", false), new m6("ro.serialno", null, false)};
    public static n6 f24323m;
    public static HashMap f24324n;
    public boolean f24325a;
    public boolean f24326b;
    public final Object f24327c;
    public final Object d;

    public n6(Window window, d9 d9Var) {
        this.f24325a = false;
        this.f24326b = false;
        this.f24327c = window;
        this.d = d9Var;
    }

    public static boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n6.c():boolean");
    }

    public static n6 h(Context context) {
        if (context != null) {
            if (f24323m == null) {
                f24323m = new n6(context.getApplicationContext());
            }
            return f24323m;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public void a() {
        if (this.f24325a) {
            return;
        }
        this.f24325a = true;
        g();
    }

    public boolean b() {
        String str;
        String[] split;
        Context context = (Context) this.f24327c;
        f0.d.b(context, "android.permission.READ_PHONE_STATE");
        if (d(1, f24316e) || d(2, f24319i) || d(3, f24320j) || d(4, f24321k)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i3 = 0; i3 < 2; i3++) {
            File file = fileArr[i3];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (new String(bArr).contains(f24317f[0])) {
                    return true;
                }
            }
        }
        if (d(5, f24318g)) {
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
            m6 m6Var = f24322l[i11];
            String str3 = m6Var.f24168a;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = m6Var.f24169b;
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

    public boolean d(int i3, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (f0.d.b((Context) this.f24327c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if ((str.contains("/") && i3 == 3) || i3 == 4) {
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
        if (!this.f24325a) {
            return;
        }
        this.f24325a = false;
        g();
    }

    public boolean f() {
        if (this.f24325a) {
            return this.f24326b;
        }
        boolean z10 = true;
        try {
            this.f24325a = true;
            if (!this.f24326b) {
                this.f24326b = c();
            }
            if (!this.f24326b) {
                this.f24326b = b();
            }
            if (!this.f24326b) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.f24327c).getPackageManager();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z10 = false;
                this.f24326b = z10;
            }
            if (!this.f24326b) {
                this.f24326b = b6.b();
            }
            return this.f24326b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z10;
        int intValue;
        int i3 = 1;
        if (this.f24325a && ((d9) this.d).run()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f24326b) {
            this.f24326b = z10;
            if (!z10) {
                i3 = -1;
            }
            Window window = (Window) this.f24327c;
            if (f24324n == null) {
                f24324n = new HashMap();
            }
            Integer num = (Integer) f24324n.get(window);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int max = Math.max(0, intValue + i3);
            if (max <= 0) {
                f24324n.remove(window);
            } else {
                f24324n.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap = f24324n;
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
        this.f24327c = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }
}
