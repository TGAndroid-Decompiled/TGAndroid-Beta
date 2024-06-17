package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmuDetector {
    private static final String IP = "10.0.2.15";
    private static final int MIN_PROPERTIES_THRESHOLD = 5;

    @SuppressLint({"StaticFieldLeak"})
    private static EmuDetector mEmulatorDetector;
    private boolean detectResult;
    private boolean detected;
    private final Context mContext;
    private List<String> mListPackageName;
    private static final String[] PHONE_NUMBERS = {"15555215554", "15555215556", "15555215558", "15555215560", "15555215562", "15555215564", "15555215566", "15555215568", "15555215570", "15555215572", "15555215574", "15555215576", "15555215578", "15555215580", "15555215582", "15555215584"};
    private static final String[] DEVICE_IDS = {"000000000000000", "e21833235b6eef10", "012345678912345"};
    private static final String[] IMSI_IDS = {"310260000000000"};
    private static final String[] GENY_FILES = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    private static final String[] QEMU_DRIVERS = {"goldfish"};
    private static final String[] PIPES = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    private static final String[] X86_FILES = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    private static final String[] ANDY_FILES = {"fstab.andy", "ueventd.andy.rc"};
    private static final String[] NOX_FILES = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    private static final String[] BLUE_FILES = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    private static final Property[] PROPERTIES = {new Property("init.svc.qemud", null), new Property("init.svc.qemu-props", null), new Property("qemu.hw.mainkeys", null), new Property("qemu.sf.fake_camera", null), new Property("qemu.sf.lcd_density", null), new Property("ro.bootloader", "unknown"), new Property("ro.bootmode", "unknown"), new Property("ro.hardware", "goldfish"), new Property("ro.kernel.android.qemud", null), new Property("ro.kernel.qemu.gles", null), new Property("ro.kernel.qemu", "1"), new Property("ro.product.device", "generic"), new Property("ro.product.model", "sdk"), new Property("ro.product.name", "sdk"), new Property("ro.serialno", null)};
    private boolean isTelephony = false;
    private boolean isCheckPackage = true;

    public enum EmulatorTypes {
        GENY,
        ANDY,
        NOX,
        BLUE,
        PIPES,
        X86
    }

    public interface OnEmulatorDetectorListener {
        void onResult(boolean z);
    }

    public static class Property {
        public String name;
        public String seek_value;

        public Property(String str, String str2) {
            this.name = str;
            this.seek_value = str2;
        }
    }

    public static EmuDetector with(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        if (mEmulatorDetector == null) {
            mEmulatorDetector = new EmuDetector(context.getApplicationContext());
        }
        return mEmulatorDetector;
    }

    private EmuDetector(Context context) {
        ArrayList arrayList = new ArrayList();
        this.mListPackageName = arrayList;
        this.mContext = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        this.mListPackageName.add("com.bluestacks");
        this.mListPackageName.add("com.bignox.app");
        this.mListPackageName.add("com.vphone.launcher");
    }

    public boolean isCheckTelephony() {
        return this.isTelephony;
    }

    public boolean isCheckPackage() {
        return this.isCheckPackage;
    }

    public EmuDetector setCheckTelephony(boolean z) {
        this.isTelephony = z;
        return this;
    }

    public EmuDetector setCheckPackage(boolean z) {
        this.isCheckPackage = z;
        return this;
    }

    public EmuDetector addPackageName(String str) {
        this.mListPackageName.add(str);
        return this;
    }

    public EmuDetector addPackageName(List<String> list) {
        this.mListPackageName.addAll(list);
        return this;
    }

    public boolean detect() {
        if (this.detected) {
            return this.detectResult;
        }
        try {
            this.detected = true;
            if (!this.detectResult) {
                this.detectResult = checkBasic();
            }
            if (!this.detectResult) {
                this.detectResult = checkAdvanced();
            }
            if (!this.detectResult) {
                this.detectResult = checkPackageName();
            }
            if (!this.detectResult) {
                this.detectResult = EmuInputDevicesDetector.detect();
            }
            return this.detectResult;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean checkBasic() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.EmuDetector.checkBasic():boolean");
    }

    private boolean checkAdvanced() {
        return checkTelephony() || checkFiles(GENY_FILES, EmulatorTypes.GENY) || checkFiles(ANDY_FILES, EmulatorTypes.ANDY) || checkFiles(NOX_FILES, EmulatorTypes.NOX) || checkFiles(BLUE_FILES, EmulatorTypes.BLUE) || checkQEmuDrivers() || checkFiles(PIPES, EmulatorTypes.PIPES) || checkIp() || (checkQEmuProps() && checkFiles(X86_FILES, EmulatorTypes.X86));
    }

    private boolean checkPackageName() {
        if (this.isCheckPackage && !this.mListPackageName.isEmpty()) {
            PackageManager packageManager = this.mContext.getPackageManager();
            Iterator<String> it = this.mListPackageName.iterator();
            while (it.hasNext()) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(it.next());
                if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkTelephony() {
        return ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") == 0 && this.isTelephony && isSupportTelePhony() && (checkPhoneNumber() || checkDeviceId() || checkImsi() || checkOperatorNameAndroid());
    }

    private boolean checkPhoneNumber() {
        String line1Number = ((TelephonyManager) this.mContext.getSystemService("phone")).getLine1Number();
        for (String str : PHONE_NUMBERS) {
            if (str.equalsIgnoreCase(line1Number)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDeviceId() {
        String deviceId = ((TelephonyManager) this.mContext.getSystemService("phone")).getDeviceId();
        for (String str : DEVICE_IDS) {
            if (str.equalsIgnoreCase(deviceId)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkImsi() {
        String subscriberId = ((TelephonyManager) this.mContext.getSystemService("phone")).getSubscriberId();
        for (String str : IMSI_IDS) {
            if (str.equalsIgnoreCase(subscriberId)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkOperatorNameAndroid() {
        return ((TelephonyManager) this.mContext.getSystemService("phone")).getNetworkOperatorName().equalsIgnoreCase("android");
    }

    private boolean checkQEmuDrivers() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str = new String(bArr);
                for (String str2 : QEMU_DRIVERS) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean checkFiles(String[] strArr, EmulatorTypes emulatorTypes) {
        File file;
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                if ((str.contains("/") && emulatorTypes == EmulatorTypes.NOX) || emulatorTypes == EmulatorTypes.BLUE) {
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

    private boolean checkQEmuProps() {
        int i = 0;
        for (Property property : PROPERTIES) {
            String prop = getProp(this.mContext, property.name);
            String str = property.seek_value;
            if (str == null && prop != null) {
                i++;
            }
            if (str != null && prop.contains(str)) {
                i++;
            }
        }
        return i >= 5;
    }

    private boolean checkIp() {
        if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.INTERNET") != 0) {
            return false;
        }
        String[] strArr = {"/system/bin/netcfg"};
        StringBuilder sb = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            processBuilder.directory(new File("/system/bin/"));
            processBuilder.redirectErrorStream(true);
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[1024];
            while (inputStream.read(bArr) != -1) {
                sb.append(new String(bArr));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return false;
        }
        for (String str : sb2.split("\n")) {
            if ((str.contains("wlan0") || str.contains("tunl0") || str.contains("eth0")) && str.contains(IP)) {
                return true;
            }
        }
        return false;
    }

    private String getProp(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean isSupportTelePhony() {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
