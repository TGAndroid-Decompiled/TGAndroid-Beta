package ji;

import android.text.Editable;
import bi.k8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
public final class h0 implements Runnable {
    public final int f13942a = 1;
    public final int f13943b;
    public final int f13944c;
    public final Object d;
    public final Object f13945e;
    public final Object f13946f;
    public final Object h;

    public h0(m4.f1 f1Var, m4.r rVar, int i10, m4.a0 a0Var, int i11, m4.e1 e1Var) {
        this.d = f1Var;
        this.f13945e = rVar;
        this.f13943b = i10;
        this.f13946f = a0Var;
        this.f13944c = i11;
        this.h = e1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        char c10;
        String publicUsername;
        int i12;
        int i13;
        co coVar;
        boolean z10;
        int i14 = this.f13942a;
        final int i15 = this.f13944c;
        Object obj = this.h;
        Object obj2 = this.f13946f;
        Object obj3 = this.f13945e;
        int i16 = this.f13943b;
        Object obj4 = this.d;
        switch (i14) {
            case 0:
                h1 h1Var = (h1) obj3;
                q9 q9Var = (q9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((pf.b) obj4).f44047c;
                if (h1Var.length() >= i16 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && q9Var.k0(j0Var.D(), 0, i15, i16)) {
                    k0Var.d = true;
                    h1Var.setSelection(i16);
                    k0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.a0 a0Var = (m4.a0) obj2;
                final m4.e1 e1Var = (m4.e1) obj;
                fg.f fVar = ((m4.f1) obj4).f15891b;
                if (!fVar.C(rVar, i16)) {
                    m4.f1.O0(a0Var, rVar, i15, new m4.p1(-4));
                    return;
                }
                ob.a aVar = a0Var.f15829e;
                a0Var.s(rVar);
                aVar.getClass();
                if (i16 == 27) {
                    e1Var.h(a0Var, rVar, i15);
                    fVar.d(rVar, i16, new Object());
                    return;
                }
                fVar.d(rVar, i16, new m4.d() {
                    @Override
                    public final i9.w run() {
                        return (i9.w) e1.this.h(a0Var, rVar, i15);
                    }
                });
                return;
            case 2:
                uj ujVar = (uj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ujVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    ujVar.h = -1;
                    AndroidUtilities.runOnUIThread(new k8(ujVar, ujVar.h, new ArrayList(), new ArrayList(), 15));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i17 = i10 + 1;
                String[] strArr = new String[i17];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                uj ujVar2 = ujVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i18 = 0;
                while (i18 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i18);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    uj ujVar3 = ujVar2;
                    TLRPC.User user = contact.user;
                    if (user != null) {
                        arrayList = arrayList2;
                        str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        str2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    } else {
                        arrayList = arrayList2;
                        str = null;
                        str2 = null;
                    }
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    String[] strArr2 = strArr;
                    int i19 = 0;
                    char c11 = 0;
                    while (i19 < i17) {
                        int i20 = i19;
                        String str4 = strArr2[i20];
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.w1.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.w1.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.w1.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.w1.w(" ", str4, translitString2)))) {
                                c10 = c11;
                            } else {
                                c10 = 3;
                            }
                        } else {
                            str3 = str;
                            c10 = 1;
                        }
                        String str5 = lowerCase2;
                        if (c10 != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                            if (c10 == 3) {
                                arrayList5.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str4));
                            } else if (c10 == 1) {
                                TLRPC.User user3 = contact.user;
                                arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str4));
                            } else {
                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str4));
                            }
                            TLRPC.User user4 = contact.user;
                            if (user4 != null) {
                                longSparseIntArray.put(user4.f20016id, 1);
                            }
                            arrayList4.add(contact);
                            i18++;
                            ujVar2 = ujVar3;
                            arrayList2 = arrayList;
                            strArr = strArr2;
                        } else {
                            i19 = i20 + 1;
                            lowerCase2 = str5;
                            c11 = c10;
                            str = str3;
                        }
                    }
                    i18++;
                    ujVar2 = ujVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                uj ujVar4 = ujVar2;
                String[] strArr3 = strArr;
                int i21 = 0;
                while (i21 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i21);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_contact.user_id));
                        String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        char c12 = 0;
                        int i22 = 0;
                        while (i22 < i17) {
                            String str6 = strArr3[i22];
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, translitString3)))) {
                                i11 = i21;
                                c12 = 1;
                            } else {
                                i11 = i21;
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                    c12 = 2;
                                }
                            }
                            if (c12 != 0 && user5.phone != null) {
                                if (c12 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                }
                                arrayList4.add(user5);
                                i21 = i11 + 1;
                            } else {
                                i22++;
                                i21 = i11;
                            }
                        }
                    }
                    i11 = i21;
                    i21 = i11 + 1;
                }
                AndroidUtilities.runOnUIThread(new k8(ujVar4, this.f13944c, arrayList4, arrayList5, 15));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                co coVar2 = (co) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f23831q1;
                vi viVar = chatAttachAlertPhotoLayout.f28753b;
                if (viVar.F && !viVar.G) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f33625n = false;
                    i12 = 3;
                } else {
                    i12 = i16;
                }
                if (viVar.H) {
                    i13 = 13;
                } else {
                    i13 = i12;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                xl xlVar = chatAttachAlertPhotoLayout.f23851h1;
                if (viVar.H) {
                    coVar = null;
                } else {
                    coVar = coVar2;
                }
                t13.f2(arrayList6, this.f13944c, i13, false, xlVar, coVar);
                PhotoViewer.t1().x2(viVar.Q);
                if (viVar.F && !viVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (viVar.Q0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (viVar.R0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.P = z10;
                }
                if (viVar.G) {
                    PhotoViewer.t1().X0(null, null, false, viVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = viVar.m1().getText();
                    t15.f33650p7 = true;
                    t15.f33658q7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
        }
    }

    public h0(uj ujVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = ujVar;
        this.f13945e = str;
        this.f13946f = arrayList;
        this.h = arrayList2;
        this.f13943b = i10;
        this.f13944c = i11;
    }

    public h0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, int i11, co coVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f13943b = i10;
        this.f13945e = n2Var;
        this.f13946f = arrayList;
        this.f13944c = i11;
        this.h = coVar;
    }

    public h0(pf.b bVar, h1 h1Var, int i10, q9 q9Var, j0 j0Var, int i11) {
        this.d = bVar;
        this.f13945e = h1Var;
        this.f13943b = i10;
        this.f13946f = q9Var;
        this.h = j0Var;
        this.f13944c = i11;
    }
}
