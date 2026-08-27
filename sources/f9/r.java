package f9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import h9.o0;
import h9.p0;
import h9.u0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class r {

    public static final HashMap f5985f;

    public static final String f5986g;

    public final Context f5987a;

    public final x f5988b;

    public final a f5989c;
    public final g5.b d;

    public final c3.g f5990e;

    static {
        HashMap map = new HashMap();
        f5985f = map;
        s3.c.i(5, map, "armeabi", 6, "armeabi-v7a");
        s3.c.i(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f5986g = "Crashlytics Android SDK/18.6.0";
    }

    public r(Context context, x xVar, a aVar, g5.b bVar, c3.g gVar) {
        this.f5987a = context;
        this.f5988b = xVar;
        this.f5989c = aVar;
        this.d = bVar;
        this.f5990e = gVar;
    }

    public static p0 c(com.google.firebase.messaging.t tVar, int i10) {
        int i11;
        String str = (String) tVar.f4620c;
        String str2 = (String) tVar.f4619b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) tVar.f4621e;
        if (i10 >= 8) {
            com.google.firebase.messaging.t tVar3 = tVar2;
            while (tVar3 != null) {
                tVar3 = (com.google.firebase.messaging.t) tVar3.f4621e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        p0 p0VarC = null;
        if (tVar2 != null && i11 == 0) {
            p0VarC = c(tVar2, i10 + 1);
        }
        return new p0(str, str2, listD, p0VarC, i11);
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            af.h hVar = new af.h();
            hVar.f277e = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            hVar.f274a = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            hVar.f275b = str;
            hVar.f276c = fileName;
            hVar.d = Long.valueOf(lineNumber);
            arrayList.add(hVar.l());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f5989c;
        String str = aVar.f5918e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f5916b));
        }
        throw new NullPointerException("Null name");
    }

    public final u0 b(int i10) {
        boolean z10;
        Float fValueOf;
        Context context = this.f5987a;
        int i11 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e9) {
                    e = e9;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
            } else {
                fValueOf = null;
                z10 = false;
            }
        } catch (IllegalStateException e10) {
            e = e10;
            z10 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z10 || fValueOf == null) {
            i11 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i11 = 3;
        }
        boolean z11 = (h.g() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
        long jB = h.b(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j10 = jB - memoryInfo.availMem;
        if (j10 <= 0) {
            j10 = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f4602a = dValueOf;
        mVar.f4603b = Integer.valueOf(i11);
        mVar.f4604c = Boolean.valueOf(z11);
        mVar.d = Integer.valueOf(i10);
        mVar.f4605e = Long.valueOf(j10);
        mVar.f4606f = Long.valueOf(blockCount);
        return mVar.h();
    }
}
