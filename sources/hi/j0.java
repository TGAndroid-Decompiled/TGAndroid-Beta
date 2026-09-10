package hi;

import android.text.Editable;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
public final class j0 implements Runnable {
    public final int f9668a = 1;
    public final int f9669b;
    public final int f9670c;
    public final Object d;
    public final Object e;
    public final Object f9671f;
    public final Object h;

    public j0(m4.h1 h1Var, m4.r rVar, int i10, m4.b0 b0Var, int i11, m4.g1 g1Var) {
        this.d = h1Var;
        this.e = rVar;
        this.f9669b = i10;
        this.f9671f = b0Var;
        this.f9670c = i11;
        this.h = g1Var;
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
        eo eoVar;
        boolean z10;
        int i14 = this.f9668a;
        final int i15 = this.f9670c;
        Object obj = this.h;
        Object obj2 = this.f9671f;
        Object obj3 = this.e;
        int i16 = this.f9669b;
        Object obj4 = this.d;
        switch (i14) {
            case 0:
                k1 k1Var = (k1) obj3;
                s9 s9Var = (s9) obj2;
                l0 l0Var = (l0) obj;
                m0 m0Var = (m0) ((n4.y) obj4).f13825c;
                if (k1Var.length() >= i16 && k1Var.getSelectionStart() != k1Var.getSelectionEnd() && s9Var.k0(l0Var.M(), 0, i15, i16)) {
                    m0Var.d = true;
                    k1Var.setSelection(i16);
                    m0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.b0 b0Var = (m4.b0) obj2;
                final m4.g1 g1Var = (m4.g1) obj;
                ki.f fVar = ((m4.h1) obj4).f13376b;
                if (!fVar.A(rVar, i16)) {
                    m4.h1.O0(b0Var, rVar, i15, new m4.r1(-4));
                    return;
                }
                na.d dVar = b0Var.e;
                b0Var.s(rVar);
                dVar.getClass();
                if (i16 == 27) {
                    g1Var.i(b0Var, rVar, i15);
                    fVar.d(rVar, i16, new Object());
                    return;
                }
                fVar.d(rVar, i16, new m4.d() {
                    @Override
                    public final i9.w run() {
                        return (i9.w) g1.this.i(b0Var, rVar, i15);
                    }
                });
                return;
            case 2:
                xj xjVar = (xj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                xjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    xjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new di.q((Object) xjVar, xjVar.h, new ArrayList(), (Serializable) new ArrayList(), 15));
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
                xj xjVar2 = xjVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i18 = 0;
                while (i18 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i18);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    xj xjVar3 = xjVar2;
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
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.a2.w(" ", str4, translitString2)))) {
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
                                longSparseIntArray.put(user4.f17342id, 1);
                            }
                            arrayList4.add(contact);
                            i18++;
                            xjVar2 = xjVar3;
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
                    xjVar2 = xjVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                xj xjVar4 = xjVar2;
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
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.a2.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.a2.w(" ", str6, translitString3)))) {
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
                AndroidUtilities.runOnUIThread(new di.q((Object) xjVar4, this.f9670c, arrayList4, (Serializable) arrayList5, 15));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                eo eoVar2 = (eo) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f20983q1;
                yi yiVar = chatAttachAlertPhotoLayout.f26422b;
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f30125n = false;
                    i12 = 3;
                } else {
                    i12 = i16;
                }
                if (yiVar.H) {
                    i13 = 13;
                } else {
                    i13 = i12;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                cm cmVar = chatAttachAlertPhotoLayout.f21003h1;
                if (yiVar.H) {
                    eoVar = null;
                } else {
                    eoVar = eoVar2;
                }
                t13.f2(arrayList6, this.f9670c, i13, false, cmVar, eoVar);
                PhotoViewer.t1().x2(yiVar.Q);
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (yiVar.Q0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (yiVar.R0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.P = z10;
                }
                if (yiVar.G) {
                    PhotoViewer.t1().X0(null, null, false, yiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = yiVar.m1().getText();
                    t15.f30150p7 = true;
                    t15.f30158q7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
        }
    }

    public j0(n4.y yVar, k1 k1Var, int i10, s9 s9Var, l0 l0Var, int i11) {
        this.d = yVar;
        this.e = k1Var;
        this.f9669b = i10;
        this.f9671f = s9Var;
        this.h = l0Var;
        this.f9670c = i11;
    }

    public j0(xj xjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = xjVar;
        this.e = str;
        this.f9671f = arrayList;
        this.h = arrayList2;
        this.f9669b = i10;
        this.f9670c = i11;
    }

    public j0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, int i11, eo eoVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f9669b = i10;
        this.e = p2Var;
        this.f9671f = arrayList;
        this.f9670c = i11;
        this.h = eoVar;
    }
}
