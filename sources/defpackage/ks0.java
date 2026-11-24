package defpackage;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ks0 implements Runnable {
    public final byte a = 4;
    public final boolean b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public ks0(ss0 ss0Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        this.d = ss0Var;
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
                ((ss0) this.d).s0((TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z = true;
                hq6 hq6Var = (hq6) this.d;
                boolean z2 = this.b;
                ArrayList arrayList6 = (ArrayList) this.h;
                vf6 vf6Var = (vf6) this.n;
                long j = this.c;
                hq6Var.getMessagesController().a4((ArrayList) this.e, z2);
                hq6Var.getMessagesController().U3((ArrayList) this.f, z2);
                int size = arrayList6.size();
                int i = 0;
                boolean z3 = false;
                while (i < size) {
                    k27 k27Var = (k27) arrayList6.get(i);
                    SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(k27Var.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(k27Var.e1())) != null) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            k27 k27Var2 = (k27) arrayList.get(i2);
                            k27Var2.C = k27Var;
                            k27Var2.m();
                            TLRPC.MessageAction messageAction = k27Var2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                k27Var2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                k27Var2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                k27Var2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                k27Var2.p0(null, z);
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
                    hq6Var.getNotificationCenter().k(55, Long.valueOf(j), arrayList6, vf6Var);
                    return;
                }
                return;
            case 2:
                ny6 ny6Var = (ny6) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z4 = this.b;
                long j2 = this.c;
                py6 py6Var = (py6) this.h;
                ny6Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z4) {
                        ny6Var.a.put(j2, tL_messages_chatInviteImporters);
                    }
                }
                py6Var.run(tLObject, tL_error);
                return;
            case 3:
                gta gtaVar = (gta) this.d;
                i8c i8cVar = (i8c) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.h;
                long j3 = this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.n;
                boolean z5 = this.b;
                if (!gtaVar.e) {
                    gta.c("NO_BALANCE");
                    i8cVar.a(Boolean.FALSE, null);
                    return;
                }
                gtaVar.f(tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z5, i8cVar);
                return;
            default:
                b1c b1cVar = (b1c) this.d;
                x0c x0cVar = (x0c) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z6 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j4 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (b1cVar) {
                    arrayList2 = x0cVar.b;
                    arrayList3 = x0cVar.d;
                    arrayList4 = x0cVar.c;
                    str = x0cVar.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList7 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList7.size());
                    for (int i3 = 0; i3 < min; i3++) {
                        ((m8c) arrayList3.get(i3)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i3), rzb.L0((TLRPC.TL_textWithEntities) arrayList4.get(i3), arrayList7.get(i3)), str);
                    }
                } else {
                    if (tL_error2 != null) {
                        if ("TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                            int i4 = 0;
                            while (i4 < arrayList2.size()) {
                                int intValue = ((Integer) arrayList2.get(i4)).intValue();
                                m8c m8cVar = (m8c) arrayList3.get(i4);
                                ArrayList arrayList8 = arrayList3;
                                String str2 = str;
                                rzb.D0(((TLRPC.TL_textWithEntities) arrayList4.get(i4)).text, null, str2, new n0c(b1cVar, m8cVar, z6, intValue, str2, j4, (byte) 1));
                                i4++;
                                arrayList3 = arrayList8;
                                str = str2;
                                arrayList4 = arrayList4;
                            }
                        } else {
                            arrayList5 = arrayList3;
                            if ("TO_LANG_INVALID".equals(tL_error2.text)) {
                                b1cVar.K(j4, false);
                                kk7.e().k(295, 1, k96.M0(2131743707, null));
                            } else if ("QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                kk7.e().k(295, 1, k96.M0(2131743708, null));
                            }
                        }
                    } else {
                        arrayList5 = arrayList3;
                    }
                    for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                        ((m8c) arrayList5.get(i5)).a(Boolean.valueOf(z6), (Integer) arrayList2.get(i5), null, x0cVar.e);
                    }
                }
                synchronized (b1cVar) {
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        hashSet.remove(arrayList2.get(i6));
                    }
                }
                return;
        }
    }

    public ks0(hq6 hq6Var, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, vf6 vf6Var, long j) {
        this.d = hq6Var;
        this.e = arrayList;
        this.b = z;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = vf6Var;
        this.c = j;
    }

    public ks0(ny6 ny6Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, long j, py6 py6Var) {
        this.d = ny6Var;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z;
        this.c = j;
        this.h = py6Var;
    }

    public ks0(gta gtaVar, i8c i8cVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        this.d = gtaVar;
        this.e = i8cVar;
        this.f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.c = j;
        this.n = tL_textWithEntities;
        this.b = z;
    }

    public ks0(b1c b1cVar, x0c x0cVar, TLObject tLObject, boolean z, TLRPC.TL_error tL_error, long j, HashSet hashSet) {
        this.d = b1cVar;
        this.f = x0cVar;
        this.n = tLObject;
        this.b = z;
        this.e = tL_error;
        this.c = j;
        this.h = hashSet;
    }
}
