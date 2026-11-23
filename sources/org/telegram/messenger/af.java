package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f22907a;
    public final bf f22908b;

    public af(bf bfVar, int i7) {
        this.f22907a = i7;
        this.f22908b = bfVar;
    }

    @Override
    public final void run() {
        boolean z10;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i7;
        String absolutePath;
        File file2;
        switch (this.f22907a) {
            case 0:
                bf bfVar = this.f22908b;
                bfVar.f23085s.a(bfVar.f23083n);
                return;
            case 1:
                bf bfVar2 = this.f22908b;
                if (!bfVar2.h) {
                    bfVar2.f23079b.show();
                    return;
                }
                return;
            case 2:
                bf bfVar3 = this.f22908b;
                boolean z11 = bfVar3.f23086w;
                c cVar = bfVar3.f23078a;
                ArrayList arrayList = bfVar3.f23080c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                gj gjVar = (gj) arrayList.get(i10);
                                if (!bfVar3.b(gjVar)) {
                                    String str2 = gjVar.f24213k.attachPath;
                                    TLRPC.Document F0 = gjVar.F0();
                                    TLRPC.Document document = gjVar.f24194f3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = w7.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        w7.G(cVar.f23202a);
                                        TLRPC.MessageMedia m12 = gj.m1(gjVar);
                                        TLRPC.Document document2 = gjVar.f24194f3;
                                        if (document2 != null) {
                                            file2 = w7.J(document2, null, false, true);
                                        } else {
                                            File M = w7.M(gjVar.f24213k, false, true);
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
                                        bfVar3.f23084r = new CountDownLatch(1);
                                        g0.g3(new z4(26, bfVar3, gjVar));
                                        bfVar3.f23084r.await();
                                    }
                                    if (!bfVar3.f23082f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.f23202a);
                                            file3 = w7.J(gjVar.f24213k, null, true, true);
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
                                            if (z11) {
                                                i7 = 3;
                                            } else {
                                                i7 = 2;
                                            }
                                            MediaController.f0(i7, file3, B);
                                            bfVar3.f23083n++;
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
                            for (int i11 = 0; i11 < size2; i11++) {
                                gj gjVar2 = (gj) arrayList.get(i11);
                                if (!bfVar3.b(gjVar2)) {
                                    TLRPC.Document F02 = gjVar2.F0();
                                    TLRPC.Document document3 = gjVar2.f24194f3;
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
                                    String str3 = gjVar2.f24213k.attachPath;
                                    if (gjVar2.f24194f3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (gjVar2.f24194f3 != null) {
                                        w7.G(cVar.f23202a);
                                        file = w7.J(gjVar2.f24194f3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            w7.G(cVar.f23202a);
                                            str3 = w7.M(gjVar2.f24213k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        bfVar3.f23084r = new CountDownLatch(1);
                                        g0.g3(new z4(26, bfVar3, gjVar2));
                                        bfVar3.f23084r.await();
                                    }
                                    if (file.exists()) {
                                        bfVar3.a(file, file4, gjVar2.t1());
                                        bfVar3.f23083n++;
                                    }
                                }
                            }
                        }
                        if (bfVar3.d.isEmpty()) {
                            g0.g3(new af(bfVar3, 4));
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        a8.g(e, z10);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
                break;
            case 3:
                try {
                    this.f22908b.f23079b.dismiss();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                bf bfVar4 = this.f22908b;
                org.telegram.ui.ActionBar.t1 t1Var = bfVar4.f23079b;
                c cVar2 = bfVar4.f23078a;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        bfVar4.h = true;
                    }
                    if (bfVar4.f23085s != null) {
                        g0.g3(new af(bfVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i13 = cVar2.f23202a;
                ls.f(i13).n(bfVar4, 142);
                ls.f(i13).n(bfVar4, 141);
                ls.f(i13).n(bfVar4, 143);
                return;
        }
    }
}
