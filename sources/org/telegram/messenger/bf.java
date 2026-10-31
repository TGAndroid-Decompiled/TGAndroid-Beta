package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f14759a;
    public final cf f14760b;

    public bf(cf cfVar, int i10) {
        this.f14759a = i10;
        this.f14760b = cfVar;
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
        switch (this.f14759a) {
            case 0:
                cf cfVar = this.f14760b;
                cfVar.f15017s.a(cfVar.f15015n);
                return;
            case 1:
                cf cfVar2 = this.f14760b;
                if (!cfVar2.h) {
                    cfVar2.f15012b.show();
                    return;
                }
                return;
            case 2:
                cf cfVar3 = this.f14760b;
                boolean z11 = cfVar3.f15018w;
                c cVar = cfVar3.f15011a;
                ArrayList arrayList = cfVar3.f15013c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                jj jjVar = (jj) arrayList.get(i11);
                                if (!cfVar3.b(jjVar)) {
                                    String str2 = jjVar.f16337k.attachPath;
                                    TLRPC.Document F0 = jjVar.F0();
                                    TLRPC.Document document = jjVar.f16297a3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = b8.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        b8.G(cVar.f14863a);
                                        TLRPC.MessageMedia n12 = jj.n1(jjVar);
                                        TLRPC.Document document2 = jjVar.f16297a3;
                                        if (document2 != null) {
                                            file2 = b8.K(document2, null, false, true);
                                        } else {
                                            File N = b8.N(jjVar.f16337k, false, true);
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
                                        cfVar3.f15016r = new CountDownLatch(1);
                                        i0.g3(new t6(24, cfVar3, jjVar));
                                        cfVar3.f15016r.await();
                                    }
                                    if (!cfVar3.f15014f) {
                                        if (!file3.exists()) {
                                            b8.G(cVar.f14863a);
                                            file3 = b8.K(jjVar.f16337k, null, true, true);
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
                                            cfVar3.f15015n++;
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
                                jj jjVar2 = (jj) arrayList.get(i12);
                                if (!cfVar3.b(jjVar2)) {
                                    TLRPC.Document F02 = jjVar2.F0();
                                    TLRPC.Document document3 = jjVar2.f16297a3;
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
                                    String str3 = jjVar2.f16337k.attachPath;
                                    if (jjVar2.f16297a3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (jjVar2.f16297a3 != null) {
                                        b8.G(cVar.f14863a);
                                        file = b8.K(jjVar2.f16297a3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            b8.G(cVar.f14863a);
                                            str3 = b8.N(jjVar2.f16337k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        cfVar3.f15016r = new CountDownLatch(1);
                                        i0.g3(new t6(24, cfVar3, jjVar2));
                                        cfVar3.f15016r.await();
                                    }
                                    if (file.exists()) {
                                        cfVar3.a(file, file4, jjVar2.u1());
                                        cfVar3.f15015n++;
                                    }
                                }
                            }
                        }
                        if (cfVar3.d.isEmpty()) {
                            i0.g3(new bf(cfVar3, 4));
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
                    this.f14760b.f15012b.dismiss();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                cf cfVar4 = this.f14760b;
                org.telegram.ui.ActionBar.x1 x1Var = cfVar4.f15012b;
                c cVar2 = cfVar4.f15011a;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        cfVar4.h = true;
                    }
                    if (cfVar4.f15017s != null) {
                        i0.g3(new bf(cfVar4, 0));
                    }
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
                int i14 = cVar2.f14863a;
                zs.f(i14).n(cfVar4, 142);
                zs.f(i14).n(cfVar4, 141);
                zs.f(i14).n(cfVar4, 143);
                return;
        }
    }
}
