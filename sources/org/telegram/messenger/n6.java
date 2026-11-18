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
    public static final String[] f25884e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f25885f = {"goldfish"};
    public static final String[] f25886g = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] h = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] f25887i = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] f25888j = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] f25889k = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final f5.a[] f25890l = {new f5.a(2, "init.svc.qemud", null), new f5.a(2, "init.svc.qemu-props", null), new f5.a(2, "qemu.hw.mainkeys", null), new f5.a(2, "qemu.sf.fake_camera", null), new f5.a(2, "qemu.sf.lcd_density", null), new f5.a(2, "ro.bootloader", "unknown"), new f5.a(2, "ro.bootmode", "unknown"), new f5.a(2, "ro.hardware", "goldfish"), new f5.a(2, "ro.kernel.android.qemud", null), new f5.a(2, "ro.kernel.qemu.gles", null), new f5.a(2, "ro.kernel.qemu", "1"), new f5.a(2, "ro.product.device", "generic"), new f5.a(2, "ro.product.model", "sdk"), new f5.a(2, "ro.product.name", "sdk"), new f5.a(2, "ro.serialno", null)};
    public static n6 f25891m;
    public static HashMap f25892n;
    public boolean f25893a;
    public boolean f25894b;
    public final Object f25895c;
    public final Object d;

    public n6(Window window, h9 h9Var) {
        this.f25893a = false;
        this.f25894b = false;
        this.f25895c = window;
        this.d = h9Var;
    }

    public static boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n6.c():boolean");
    }

    public static n6 h(Context context) {
        if (context != null) {
            if (f25891m == null) {
                f25891m = new n6(context.getApplicationContext());
            }
            return f25891m;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public void a() {
        if (this.f25893a) {
            return;
        }
        this.f25893a = true;
        g();
    }

    public boolean b() {
        String str;
        String[] split;
        Context context = (Context) this.f25895c;
        f0.d.b(context, "android.permission.READ_PHONE_STATE");
        if (d(1, f25884e) || d(2, f25887i) || d(3, f25888j) || d(4, f25889k)) {
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
                if (new String(bArr).contains(f25885f[0])) {
                    return true;
                }
            }
        }
        if (d(5, f25886g)) {
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
            f5.a aVar = f25890l[i11];
            String str3 = aVar.f11247b;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = aVar.f11248c;
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
            if (f0.d.b((Context) this.f25895c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
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
        if (!this.f25893a) {
            return;
        }
        this.f25893a = false;
        g();
    }

    public boolean f() {
        if (this.f25893a) {
            return this.f25894b;
        }
        boolean z10 = true;
        try {
            this.f25893a = true;
            if (!this.f25894b) {
                this.f25894b = c();
            }
            if (!this.f25894b) {
                this.f25894b = b();
            }
            if (!this.f25894b) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.f25895c).getPackageManager();
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
                z10 = false;
                this.f25894b = z10;
            }
            if (!this.f25894b) {
                this.f25894b = c6.b();
            }
            return this.f25894b;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        boolean z10;
        int intValue;
        int i7 = 1;
        if (this.f25893a && ((h9) this.d).run()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f25894b) {
            this.f25894b = z10;
            if (!z10) {
                i7 = -1;
            }
            Window window = (Window) this.f25895c;
            if (f25892n == null) {
                f25892n = new HashMap();
            }
            Integer num = (Integer) f25892n.get(window);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int max = Math.max(0, intValue + i7);
            if (max <= 0) {
                f25892n.remove(window);
            } else {
                f25892n.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap = f25892n;
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
        this.f25895c = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }
}
