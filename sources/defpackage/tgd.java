package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public abstract class tgd {
    public static final sjf a = new sjf((byte) 23);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void b(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.mu8 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgd.b(android.content.Context, java.util.concurrent.Executor, mu8, boolean):void");
    }
}
