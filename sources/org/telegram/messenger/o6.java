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
public final class o6 {
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f17385f = {"goldfish"};
    public static final String[] f17386g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] f17387i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] f17388j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] f17389k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final c5.a[] f17390l = {new c5.a(4, "init.svc.qemud", null), new c5.a(4, "init.svc.qemu-props", null), new c5.a(4, "qemu.hw.mainkeys", null), new c5.a(4, "qemu.sf.fake_camera", null), new c5.a(4, "qemu.sf.lcd_density", null), new c5.a(4, "ro.bootloader", "unknown"), new c5.a(4, "ro.bootmode", "unknown"), new c5.a(4, "ro.hardware", "goldfish"), new c5.a(4, "ro.kernel.android.qemud", null), new c5.a(4, "ro.kernel.qemu.gles", null), new c5.a(4, "ro.kernel.qemu", "1"), new c5.a(4, "ro.product.device", "generic"), new c5.a(4, "ro.product.model", "sdk"), new c5.a(4, "ro.product.name", "sdk"), new c5.a(4, "ro.serialno", null)};
    public static o6 f17391m;
    public static HashMap f17392n;
    public boolean f17393a;
    public boolean f17394b;
    public final Object f17395c;
    public final Object d;

    public o6(Window window, k9 k9Var) {
        this.f17393a = false;
        this.f17394b = false;
        this.f17395c = window;
        this.d = k9Var;
    }

    public static boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.o6.c():boolean");
    }

    public static o6 h(Context context) {
        if (context != null) {
            if (f17391m == null) {
                f17391m = new o6(context.getApplicationContext());
            }
            return f17391m;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public void a() {
        if (this.f17393a) {
            return;
        }
        this.f17393a = true;
        g();
    }

    public boolean b() {
        String str;
        String[] split;
        Context context = (Context) this.f17395c;
        f0.c.b(context, "android.permission.READ_PHONE_STATE");
        if (d(1, e) || d(2, f17387i) || d(3, f17388j) || d(4, f17389k)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                if (new String(bArr).contains(f17385f[0])) {
                    return true;
                }
            }
        }
        if (d(5, f17386g)) {
            return true;
        }
        if (f0.c.b(context, "android.permission.INTERNET") == 0) {
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
        int i11 = 0;
        for (int i12 = 0; i12 < 15; i12++) {
            c5.a aVar = f17390l[i12];
            String str3 = aVar.f3731b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = aVar.f3732c;
            if (str4 == null && str != null) {
                i11++;
            }
            if (str4 != null && str.contains(str4)) {
                i11++;
            }
        }
        if (i11 >= 5 && d(6, h)) {
            return true;
        }
        return false;
    }

    public boolean d(int i10, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (f0.c.b((Context) this.f17395c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if ((str.contains("/") && i10 == 3) || i10 == 4) {
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
        if (!this.f17393a) {
            return;
        }
        this.f17393a = false;
        g();
    }

    public boolean f() {
        if (this.f17393a) {
            return this.f17394b;
        }
        boolean z10 = true;
        try {
            this.f17393a = true;
            if (!this.f17394b) {
                this.f17394b = c();
            }
            if (!this.f17394b) {
                this.f17394b = b();
            }
            if (!this.f17394b) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.f17395c).getPackageManager();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z10 = false;
                this.f17394b = z10;
            }
            if (!this.f17394b) {
                this.f17394b = d6.c();
            }
            return this.f17394b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z10;
        int intValue;
        int i10 = 1;
        if (this.f17393a && ((k9) this.d).run()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f17394b) {
            this.f17394b = z10;
            if (!z10) {
                i10 = -1;
            }
            Window window = (Window) this.f17395c;
            if (f17392n == null) {
                f17392n = new HashMap();
            }
            Integer num = (Integer) f17392n.get(window);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int max = Math.max(0, intValue + i10);
            if (max <= 0) {
                f17392n.remove(window);
            } else {
                f17392n.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap = f17392n;
                if (hashMap != null && hashMap.get(window) != null) {
                    window.addFlags(8192);
                    i0.h2();
                    return;
                }
                window.clearFlags(8192);
                i0.h2();
            }
        }
    }

    public o6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f17395c = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }
}
