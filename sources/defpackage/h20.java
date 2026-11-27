package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h20 implements Runnable {
    public final byte a = 0;
    public final i20 b;
    public final ArrayList c;
    public final String d;

    public h20(i20 i20Var, String str, ArrayList arrayList) {
        this.b = i20Var;
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
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new h20(i20Var, new ArrayList(), str3));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase, true, false);
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
                    r47 r47Var = (r47) arrayList.get(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < i2) {
                            String str4 = strArr[i4];
                            String I0 = r47Var.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(r47Var);
                                } else {
                                    int i5 = r47Var.D;
                                    TLRPC.Message message = r47Var.k;
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
                                        arrayList2.add(r47Var);
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                }
                hl.c3(new h20(i20Var, arrayList2, str3));
                return;
            default:
                j20 j20Var = i20Var.n;
                if (j20Var.q1) {
                    j20Var.p1 = true;
                    i20Var.d = arrayList;
                    i20Var.e = str3;
                    i20Var.f();
                    j20Var.s1.m0(0);
                    uh9.r(null, null, 2131747971, new Object[]{str3}, j20Var.w1);
                    return;
                }
                return;
        }
    }

    public h20(i20 i20Var, ArrayList arrayList, String str) {
        this.b = i20Var;
        this.c = arrayList;
        this.d = str;
    }
}
