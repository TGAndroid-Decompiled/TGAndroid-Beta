package defpackage;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class eo6 implements Runnable {
    public final byte a;
    public final fo6 b;

    public eo6(fo6 fo6Var, byte b) {
        this.a = b;
        this.b = fo6Var;
    }

    @Override
    public final void run() {
        boolean z;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i;
        String absolutePath;
        File file2;
        byte b = this.a;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                fo6Var.s.a(fo6Var.n);
                return;
            case 1:
                if (!fo6Var.h) {
                    fo6Var.b.show();
                    return;
                }
                return;
            case 2:
                boolean z2 = fo6Var.w;
                j5 j5Var = fo6Var.a;
                ArrayList arrayList = fo6Var.c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                k47 k47Var = (k47) arrayList.get(i2);
                                if (!fo6Var.b(k47Var)) {
                                    String str2 = k47Var.k.attachPath;
                                    TLRPC.Document F0 = k47Var.F0();
                                    TLRPC.Document document = k47Var.f3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = bc4.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        bc4.G(j5Var.a);
                                        TLRPC.MessageMedia m1 = k47.m1(k47Var);
                                        TLRPC.Document document2 = k47Var.f3;
                                        if (document2 != null) {
                                            file2 = bc4.J(document2, null, false, true);
                                        } else {
                                            File M = bc4.M(k47Var.k, false, true);
                                            if (m1 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m1;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = bc4.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str2 = file2.toString();
                                    }
                                    File file3 = new File(str2);
                                    if (!file3.exists()) {
                                        fo6Var.r = new CountDownLatch(1);
                                        gm.c3(new lj6(fo6Var, k47Var, (byte) 8));
                                        fo6Var.r.await();
                                    }
                                    if (!fo6Var.f) {
                                        if (!file3.exists()) {
                                            bc4.G(j5Var.a);
                                            file3 = bc4.J(k47Var.k, null, true, true);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("saving file: correcting path from ");
                                            sb.append(str2);
                                            sb.append(" to ");
                                            if (file3 == null) {
                                                absolutePath = null;
                                            } else {
                                                absolutePath = file3.getAbsolutePath();
                                            }
                                            sb.append(absolutePath);
                                            fc4.b(sb.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            if (z2) {
                                                i = 3;
                                            } else {
                                                i = 2;
                                            }
                                            MediaController.e0(i, file3, B);
                                            fo6Var.n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z2) {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                            } else {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            }
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                k47 k47Var2 = (k47) arrayList.get(i3);
                                if (!fo6Var.b(k47Var2)) {
                                    TLRPC.Document F02 = k47Var2.F0();
                                    TLRPC.Document document3 = k47Var2.f3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = bc4.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i4 = 0; i4 < 10; i4++) {
                                            if (lastIndexOf != -1) {
                                                str = B2.substring(0, lastIndexOf) + "(" + (i4 + 1) + ")" + B2.substring(lastIndexOf);
                                            } else {
                                                str = B2 + "(" + (i4 + 1) + ")";
                                            }
                                            file4 = new File(externalStoragePublicDirectory, str);
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str3 = k47Var2.k.attachPath;
                                    if (k47Var2.f3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (k47Var2.f3 != null) {
                                        bc4.G(j5Var.a);
                                        file = bc4.J(k47Var2.f3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            bc4.G(j5Var.a);
                                            str3 = bc4.M(k47Var2.k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        fo6Var.r = new CountDownLatch(1);
                                        gm.c3(new lj6(fo6Var, k47Var2, (byte) 8));
                                        fo6Var.r.await();
                                    }
                                    if (file.exists()) {
                                        fo6Var.a(file, file4, k47Var2.t1());
                                        fo6Var.n++;
                                    }
                                }
                            }
                        }
                        if (fo6Var.d.isEmpty()) {
                            gm.c3(new eo6(fo6Var, (byte) 4));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        fc4.g(e, z);
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 3:
                try {
                    fo6Var.b.dismiss();
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            default:
                he heVar = fo6Var.b;
                j5 j5Var2 = fo6Var.a;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        fo6Var.h = true;
                    }
                    if (fo6Var.s != null) {
                        gm.c3(new eo6(fo6Var, (byte) 0));
                    }
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                int i5 = j5Var2.a;
                nm7.f(i5).n(fo6Var, 143);
                nm7.f(i5).n(fo6Var, 142);
                nm7.f(i5).n(fo6Var, 144);
                return;
        }
    }
}
