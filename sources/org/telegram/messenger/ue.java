package org.telegram.messenger;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f25688a;
    public final ve f25689b;

    public ue(ve veVar, int i3) {
        this.f25688a = i3;
        this.f25689b = veVar;
    }

    @Override
    public final void run() {
        boolean z10;
        File externalStoragePublicDirectory;
        File file;
        String str;
        int i3;
        String absolutePath;
        File file2;
        switch (this.f25688a) {
            case 0:
                ve veVar = this.f25689b;
                veVar.f25860s.a(veVar.f25858n);
                return;
            case 1:
                ve veVar2 = this.f25689b;
                if (!veVar2.h) {
                    veVar2.f25854b.show();
                    return;
                }
                return;
            case 2:
                ve veVar3 = this.f25689b;
                boolean z11 = veVar3.f25861w;
                c cVar = veVar3.f25853a;
                ArrayList arrayList = veVar3.f25855c;
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                zi ziVar = (zi) arrayList.get(i10);
                                if (!veVar3.b(ziVar)) {
                                    String str2 = ziVar.f26868k.attachPath;
                                    TLRPC.Document F0 = ziVar.F0();
                                    TLRPC.Document document = ziVar.f26839d3;
                                    if (document != null) {
                                        str2 = null;
                                        F0 = document;
                                    }
                                    String B = w7.B(F0);
                                    if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        w7.G(cVar.f21919a);
                                        TLRPC.MessageMedia n12 = zi.n1(ziVar);
                                        TLRPC.Document document2 = ziVar.f26839d3;
                                        if (document2 != null) {
                                            file2 = w7.K(document2, null, false, true);
                                        } else {
                                            File N = w7.N(ziVar.f26868k, false, true);
                                            if (n12 instanceof TLRPC.TL_messageMediaDocument) {
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) n12;
                                                if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                                    file2 = w7.K(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                                }
                                            }
                                            file2 = N;
                                        }
                                        str2 = file2.toString();
                                    }
                                    File file3 = new File(str2);
                                    if (!file3.exists()) {
                                        veVar3.f25859r = new CountDownLatch(1);
                                        g0.h3(new y4(26, veVar3, ziVar));
                                        veVar3.f25859r.await();
                                    }
                                    if (!veVar3.f25857f) {
                                        if (!file3.exists()) {
                                            w7.G(cVar.f21919a);
                                            file3 = w7.K(ziVar.f26868k, null, true, true);
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
                                                i3 = 3;
                                            } else {
                                                i3 = 2;
                                            }
                                            MediaController.f0(i3, file3, B);
                                            veVar3.f25858n++;
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
                                zi ziVar2 = (zi) arrayList.get(i11);
                                if (!veVar3.b(ziVar2)) {
                                    TLRPC.Document F02 = ziVar2.F0();
                                    TLRPC.Document document3 = ziVar2.f26839d3;
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
                                    String str3 = ziVar2.f26868k.attachPath;
                                    if (ziVar2.f26839d3 != null) {
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.length() > 0 && !new File(str3).exists()) {
                                        str3 = null;
                                    }
                                    if (ziVar2.f26839d3 != null) {
                                        w7.G(cVar.f21919a);
                                        file = w7.K(ziVar2.f26839d3, null, false, true);
                                    } else {
                                        if (str3 == null || str3.length() == 0) {
                                            w7.G(cVar.f21919a);
                                            str3 = w7.N(ziVar2.f26868k, false, true).toString();
                                        }
                                        file = new File(str3);
                                    }
                                    if (!file.exists()) {
                                        veVar3.f25859r = new CountDownLatch(1);
                                        g0.h3(new y4(26, veVar3, ziVar2));
                                        veVar3.f25859r.await();
                                    }
                                    if (file.exists()) {
                                        veVar3.a(file, file4, ziVar2.u1());
                                        veVar3.f25858n++;
                                    }
                                }
                            }
                        }
                        if (veVar3.d.isEmpty()) {
                            g0.h3(new ue(veVar3, 4));
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
                    this.f25689b.f25854b.dismiss();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                ve veVar4 = this.f25689b;
                org.telegram.ui.ActionBar.s1 s1Var = veVar4.f25854b;
                c cVar2 = veVar4.f25853a;
                try {
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
                    } else {
                        veVar4.h = true;
                    }
                    if (veVar4.f25860s != null) {
                        g0.h3(new ue(veVar4, 0));
                    }
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
                int i13 = cVar2.f21919a;
                hs.f(i13).n(veVar4, 142);
                hs.f(i13).n(veVar4, 141);
                hs.f(i13).n(veVar4, 143);
                return;
        }
    }
}
