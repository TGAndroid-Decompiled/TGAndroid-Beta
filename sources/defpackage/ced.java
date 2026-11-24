package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public abstract class ced {
    public static final dhf a = new dhf((byte) 23);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void b(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.ft8 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ced.b(android.content.Context, java.util.concurrent.Executor, ft8, boolean):void");
    }
}
