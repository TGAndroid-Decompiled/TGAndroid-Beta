package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g20 implements Runnable {
    public final byte a = 0;
    public final h20 b;
    public final ArrayList c;
    public final String d;

    public g20(h20 h20Var, String str, ArrayList arrayList) {
        this.b = h20Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        int i;
        TLRPC.Document document;
        boolean z;
        String str;
        byte b = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        h20 h20Var = this.b;
        switch (b) {
            case 0:
                h20Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.c3(new g20(h20Var, new ArrayList(), str3));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i2 = i + 1;
                String[] strArr = new String[i2];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k27 k27Var = (k27) arrayList.get(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < i2) {
                            String str4 = strArr[i4];
                            String I0 = k27Var.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(k27Var);
                                } else {
                                    int i5 = k27Var.D;
                                    TLRPC.Message message = k27Var.k;
                                    if (i5 == 0) {
                                        document = message.media.webpage.document;
                                    } else {
                                        document = message.media.document;
                                    }
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i6);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                if (str5 != null) {
                                                    z = str5.toLowerCase().contains(str4);
                                                } else {
                                                    z = false;
                                                }
                                                if (!z && (str = documentAttribute.title) != null) {
                                                    z = str.toLowerCase().contains(str4);
                                                }
                                            } else {
                                                i6++;
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        arrayList2.add(k27Var);
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                }
                gl.c3(new g20(h20Var, arrayList2, str3));
                return;
            default:
                i20 i20Var = h20Var.n;
                if (i20Var.q1) {
                    i20Var.p1 = true;
                    h20Var.d = arrayList;
                    h20Var.e = str3;
                    h20Var.f();
                    i20Var.s1.m0(0);
                    de9.r(null, null, 2131748048, new Object[]{str3}, i20Var.w1);
                    return;
                }
                return;
        }
    }

    public g20(h20 h20Var, ArrayList arrayList, String str) {
        this.b = h20Var;
        this.c = arrayList;
        this.d = str;
    }
}
