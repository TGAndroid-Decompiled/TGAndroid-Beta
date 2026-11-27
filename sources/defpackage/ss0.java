package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ss0 implements Runnable {
    public final byte a = 5;
    public final boolean b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public ss0(at0 at0Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        this.d = at0Var;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z;
        this.c = j;
        this.n = tLObject;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        switch (this.a) {
            case 0:
                ((at0) this.d).s0((TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z = true;
                ls6 ls6Var = (ls6) this.d;
                boolean z2 = this.b;
                ArrayList arrayList6 = (ArrayList) this.h;
                zh6 zh6Var = (zh6) this.n;
                long j = this.c;
                ls6Var.getMessagesController().j4((ArrayList) this.e, z2);
                ls6Var.getMessagesController().c4((ArrayList) this.f, z2);
                int size = arrayList6.size();
                int i = 0;
                boolean z3 = false;
                while (i < size) {
                    r47 r47Var = (r47) arrayList6.get(i);
                    SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(r47Var.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(r47Var.e1())) != null) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            r47 r47Var2 = (r47) arrayList.get(i2);
                            r47Var2.C = r47Var;
                            r47Var2.m();
                            TLRPC.MessageAction messageAction = r47Var2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                r47Var2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                r47Var2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                r47Var2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                r47Var2.p0(null, z);
                            }
                            i2++;
                            z = true;
                        }
                        z3 = true;
                    }
                    i++;
                    z = true;
                }
                if (z3) {
                    ls6Var.getNotificationCenter().k(56, Long.valueOf(j), arrayList6, zh6Var);
                    return;
                }
                return;
            case 2:
                u07 u07Var = (u07) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z4 = this.b;
                long j2 = this.c;
                w07 w07Var = (w07) this.h;
                u07Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z4) {
                        u07Var.a.put(j2, tL_messages_chatInviteImporters);
                    }
                }
                w07Var.run(tLObject, tL_error);
                return;
            case 3:
                ((lm7) this.d).w0((TLRPC.TL_error) this.e, (TLObject) this.n, (TLRPC.TL_channels_editChannelNews) this.f, this.c, this.b, (j61) this.h);
                return;
            case 4:
                jxa jxaVar = (jxa) this.d;
                icc iccVar = (icc) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.h;
                long j3 = this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.n;
                boolean z5 = this.b;
                if (!jxaVar.e) {
                    jxa.c("NO_BALANCE");
                    iccVar.a(Boolean.FALSE, null);
                    return;
                }
                jxaVar.f(tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z5, iccVar);
                return;
            default:
                a5c a5cVar = (a5c) this.d;
                w4c w4cVar = (w4c) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z6 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j4 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (a5cVar) {
                    arrayList2 = w4cVar.b;
                    arrayList3 = w4cVar.d;
                    arrayList4 = w4cVar.c;
                    str = w4cVar.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList7 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList7.size());
                    for (int i3 = 0; i3 < min; i3++) {
                        ((mcc) arrayList3.get(i3)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i3), r3c.M0((TLRPC.TL_textWithEntities) arrayList4.get(i3), arrayList7.get(i3)), str);
                    }
                } else {
                    if (tL_error2 != null) {
                        if ("TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                            int i4 = 0;
                            while (i4 < arrayList2.size()) {
                                int intValue = ((Integer) arrayList2.get(i4)).intValue();
                                mcc mccVar = (mcc) arrayList3.get(i4);
                                ArrayList arrayList8 = arrayList3;
                                String str2 = str;
                                r3c.E0(((TLRPC.TL_textWithEntities) arrayList4.get(i4)).text, null, str2, new n4c(a5cVar, mccVar, z6, intValue, str2, j4, (byte) 1));
                                i4++;
                                arrayList3 = arrayList8;
                                str = str2;
                                arrayList4 = arrayList4;
                            }
                        } else {
                            arrayList5 = arrayList3;
                            if ("TO_LANG_INVALID".equals(tL_error2.text)) {
                                a5cVar.K(j4, false);
                                jn7.e().k(296, 1, ob6.M0(2131743601, null));
                            } else if ("QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                jn7.e().k(296, 1, ob6.M0(2131743602, null));
                            }
                        }
                    } else {
                        arrayList5 = arrayList3;
                    }
                    for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                        ((mcc) arrayList5.get(i5)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i5), null, w4cVar.e);
                    }
                }
                synchronized (a5cVar) {
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        hashSet.remove(arrayList2.get(i6));
                    }
                }
                return;
        }
    }

    public ss0(ls6 ls6Var, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, zh6 zh6Var, long j) {
        this.d = ls6Var;
        this.e = arrayList;
        this.b = z;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = zh6Var;
        this.c = j;
    }

    public ss0(u07 u07Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, long j, w07 w07Var) {
        this.d = u07Var;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z;
        this.c = j;
        this.h = w07Var;
    }

    public ss0(lm7 lm7Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews, long j, boolean z, j61 j61Var) {
        this.d = lm7Var;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_channels_editChannelNews;
        this.c = j;
        this.b = z;
        this.h = j61Var;
    }

    public ss0(jxa jxaVar, icc iccVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.d = jxaVar;
        this.e = iccVar;
        this.f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.c = j;
        this.n = tL_textWithEntities;
        this.b = z;
    }

    public ss0(a5c a5cVar, w4c w4cVar, TLObject tLObject, boolean z, TLRPC.TL_error tL_error, long j, HashSet hashSet) {
        this.d = a5cVar;
        this.f = w4cVar;
        this.n = tLObject;
        this.b = z;
        this.e = tL_error;
        this.c = j;
        this.h = hashSet;
    }
}
