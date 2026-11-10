package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f21657a;
    public final cf f21658b;

    public bf(cf cfVar, int i7) {
        this.f21657a = i7;
        this.f21658b = cfVar;
    }

    @Override
    public final void run() {
        boolean z9;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i7;
        String absolutePath;
        File file2;
        switch (this.f21657a) {
            case 0:
                cf cfVar = this.f21658b;
                cfVar.f21853s.a(cfVar.f21851n);
                return;
            case 1:
                cf cfVar2 = this.f21658b;
                if (!cfVar2.h) {
                    cfVar2.f21847b.show();
                    return;
                }
                return;
            case 2:
                cf cfVar3 = this.f21658b;
                boolean z10 = cfVar3.f21854w;
                c cVar = cfVar3.f21846a;
                ArrayList arrayList = cfVar3.f21848c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                ij ijVar = (ij) arrayList.get(i10);
                                if (!cfVar3.b(ijVar)) {
                                    String str2 = ijVar.f23266k.attachPath;
                                    TLRPC.Document F0 = ijVar.F0();
                                    TLRPC.Document document = ijVar.f23237d3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = w7.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        w7.G(cVar.f21770a);
                                        TLRPC.MessageMedia m12 = ij.m1(ijVar);
                                        TLRPC.Document document2 = ijVar.f23237d3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(ijVar.f23266k, false, true);
                                            if (m12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) m12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = w7.J(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = M;
                                        }
                                        str2 = file2.toString();
                                    }
                                    File file3 = new File(str2);
                                    if (!file3.exists()) {
                                        cfVar3.f21852r = new CountDownLatch(1);
                                        g0.h3(new x4(26, cfVar3, ijVar));
                                        cfVar3.f21852r.await();
                                    }
                                    if (!cfVar3.f21850f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.f21770a);
                                            file3 = w7.J(ijVar.f23266k, null, true, true);
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
                                            a8.b(sb2.toString());
                                        }
                                        if (file3 != null && file3.exists()) {
                                            if (z10) {
                                                i7 = 3;
                                            } else {
                                                i7 = 2;
                                            }
                                            MediaController.f0(i7, file3, B);
                                            cfVar3.f21851n++;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z10) {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                            } else {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                            }
                            externalStoragePublicDirectory.mkdir();
                            int size2 = arrayList.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ij ijVar2 = (ij) arrayList.get(i11);
                                if (!cfVar3.b(ijVar2)) {
                                    TLRPC.Document F02 = ijVar2.F0();
                                    TLRPC.Document document3 = ijVar2.f23237d3;
                                    if (document3 != null) {
                                        F02 = document3;
                                    }
                                    String B2 = w7.B(F02);
                                    File file4 = new File(externalStoragePublicDirectory, B2);
                                    if (file4.exists()) {
                                        int lastIndexOf = B2.lastIndexOf(46);
                                        for (int i12 = 0; i12 < 10; i12++) {
                                            if (lastIndexOf != -1) {
                                                str = B2.substring(0, lastIndexOf) + "(" + (i12 + 1) + ")" + B2.substring(lastIndexOf);
                                            } else {
                                                str = B2 + "(" + (i12 + 1) + ")";
                                            }
                                            file4 = new File(externalStoragePublicDirectory, str);
                                            if (file4.exists()) {
                                            }
                                        }
                                    }
                                    if (!file4.exists()) {
                                        file4.createNewFile();
                                    }
                                    String str3 = ijVar2.f23266k.attachPath;
                                    if (ijVar2.f23237d3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (ijVar2.f23237d3 != null) {
                                        w7.G(cVar.f21770a);
                                        file = w7.J(ijVar2.f23237d3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            w7.G(cVar.f21770a);
                                            str3 = w7.M(ijVar2.f23266k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        cfVar3.f21852r = new CountDownLatch(1);
                                        g0.h3(new x4(26, cfVar3, ijVar2));
                                        cfVar3.f21852r.await();
                                    }
                                    if (file.exists()) {
                                        cfVar3.a(file, file4, ijVar2.t1());
                                        cfVar3.f21851n++;
                                    }
                                }
                            }
                        }
                        if (cfVar3.d.isEmpty()) {
                            g0.h3(new bf(cfVar3, 4));
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        z9 = true;
                        a8.g(e, z9);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z9 = true;
                }
                break;
            case 3:
                try {
                    this.f21658b.f21847b.dismiss();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                cf cfVar4 = this.f21658b;
                org.telegram.ui.ActionBar.u1 u1Var = cfVar4.f21847b;
                c cVar2 = cfVar4.f21846a;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
                    } else {
                        cfVar4.h = true;
                    }
                    if (cfVar4.f21853s != null) {
                        g0.h3(new bf(cfVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i13 = cVar2.f21770a;
                qs.f(i13).n(cfVar4, 142);
                qs.f(i13).n(cfVar4, 141);
                qs.f(i13).n(cfVar4, 143);
                return;
        }
    }
}
