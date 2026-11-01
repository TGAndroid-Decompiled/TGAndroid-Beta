package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class cf implements Runnable {
    public final int f15141a;
    public final df f15142b;

    public cf(df dfVar, int i10) {
        this.f15141a = i10;
        this.f15142b = dfVar;
    }

    @Override
    public final void run() {
        boolean z10;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i10;
        String absolutePath;
        File file2;
        switch (this.f15141a) {
            case 0:
                df dfVar = this.f15142b;
                dfVar.f15379s.a(dfVar.f15377n);
                return;
            case 1:
                df dfVar2 = this.f15142b;
                if (!dfVar2.h) {
                    dfVar2.f15374b.show();
                    return;
                }
                return;
            case 2:
                df dfVar3 = this.f15142b;
                boolean z11 = dfVar3.f15380w;
                c cVar = dfVar3.f15373a;
                ArrayList arrayList = dfVar3.f15375c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                kj kjVar = (kj) arrayList.get(i11);
                                if (!dfVar3.b(kjVar)) {
                                    String str2 = kjVar.f16690k.attachPath;
                                    TLRPC.Document F0 = kjVar.F0();
                                    TLRPC.Document document = kjVar.f16650a3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = b8.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        b8.G(cVar.f15043a);
                                        TLRPC.MessageMedia n12 = kj.n1(kjVar);
                                        TLRPC.Document document2 = kjVar.f16650a3;
                                        if (document2 != null) {
                                            file2 = b8.K(document2, null, false, true);
                                        } else {
                                            File N = b8.N(kjVar.f16690k, false, true);
                                            if (n12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) n12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = b8.K(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = N;
                                        }
                                        str2 = file2.toString();
                                    }
                                    File file3 = new File(str2);
                                    if (!file3.exists()) {
                                        dfVar3.f15378r = new CountDownLatch(1);
                                        i0.g3(new t6(24, dfVar3, kjVar));
                                        dfVar3.f15378r.await();
                                    }
                                    if (!dfVar3.f15376f) {
                                        if (!file3.exists()) {
                                            b8.G(cVar.f15043a);
                                            file3 = b8.K(kjVar.f16690k, null, true, true);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("saving file: correcting path from ");
                                            sb2.append(str2);
                                            sb2.append(" to ");
                                            if (file3 == null) {
                                                absolutePath = null;
                                            } else {
                                                absolutePath = file3.getAbsolutePath();
                                            }
                                            sb2.append(absolutePath);
                                            f8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            if (z11) {
                                                i10 = 3;
                                            } else {
                                                i10 = 2;
                                            }
                                            MediaController.f0(i10, file3, B);
                                            dfVar3.f15377n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z11) {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                            } else {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            }
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                kj kjVar2 = (kj) arrayList.get(i12);
                                if (!dfVar3.b(kjVar2)) {
                                    TLRPC.Document F02 = kjVar2.F0();
                                    TLRPC.Document document3 = kjVar2.f16650a3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = b8.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i13 = 0; i13 < 10; i13++) {
                                            if (lastIndexOf != -1) {
                                                str = B2.substring(0, lastIndexOf) + "(" + (i13 + 1) + ")" + B2.substring(lastIndexOf);
                                            } else {
                                                str = B2 + "(" + (i13 + 1) + ")";
                                            }
                                            file4 = new File(externalStoragePublicDirectory, str);
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str3 = kjVar2.f16690k.attachPath;
                                    if (kjVar2.f16650a3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (kjVar2.f16650a3 != null) {
                                        b8.G(cVar.f15043a);
                                        file = b8.K(kjVar2.f16650a3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            b8.G(cVar.f15043a);
                                            str3 = b8.N(kjVar2.f16690k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        dfVar3.f15378r = new CountDownLatch(1);
                                        i0.g3(new t6(24, dfVar3, kjVar2));
                                        dfVar3.f15378r.await();
                                    }
                                    if (file.exists()) {
                                        dfVar3.a(file, file4, kjVar2.u1());
                                        dfVar3.f15377n++;
                                    }
                                }
                            }
                        }
                        if (dfVar3.d.isEmpty()) {
                            i0.g3(new cf(dfVar3, 4));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        e = e;
                        z10 = true;
                        f8.g(e, z10);
                        return;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z10 = true;
                }
                break;
            case 3:
                try {
                    this.f15142b.f15374b.dismiss();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                df dfVar4 = this.f15142b;
                org.telegram.ui.ActionBar.x1 x1Var = dfVar4.f15374b;
                c cVar2 = dfVar4.f15373a;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        dfVar4.h = true;
                    }
                    if (dfVar4.f15379s != null) {
                        i0.g3(new cf(dfVar4, 0));
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
                int i14 = cVar2.f15043a;
                at.f(i14).n(dfVar4, 142);
                at.f(i14).n(dfVar4, 141);
                at.f(i14).n(dfVar4, 143);
                return;
        }
    }
}
