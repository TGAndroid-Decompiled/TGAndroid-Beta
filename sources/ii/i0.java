package ii;

import ai.d9;
import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ai;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zn;
public final class i0 implements Runnable {
    public final int f12467a = 1;
    public final int f12468b;
    public final int f12469c;
    public final Object d;
    public final Object f12470e;
    public final Object f12471f;
    public final Object h;

    public i0(m4.c1 c1Var, m4.r rVar, int i10, m4.b0 b0Var, int i11, m4.b1 b1Var) {
        this.d = c1Var;
        this.f12470e = rVar;
        this.f12468b = i10;
        this.f12471f = b0Var;
        this.f12469c = i11;
        this.h = b1Var;
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
        zn znVar;
        boolean z10;
        int i13 = this.f12467a;
        final int i14 = this.f12469c;
        Object obj = this.h;
        Object obj2 = this.f12471f;
        Object obj3 = this.f12470e;
        int i15 = this.f12468b;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                i1 i1Var = (i1) obj3;
                o9 o9Var = (o9) obj2;
                k0 k0Var = (k0) obj;
                l0 l0Var = (l0) ((n4.x) obj4).f16695c;
                if (i1Var.length() >= i15 && i1Var.getSelectionStart() != i1Var.getSelectionEnd() && o9Var.j0(k0Var.C(), 0, i14, i15)) {
                    l0Var.d = true;
                    i1Var.setSelection(i15);
                    l0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.b0 b0Var = (m4.b0) obj2;
                final m4.b1 b1Var = (m4.b1) obj;
                pi.f fVar = ((m4.c1) obj4).f16069b;
                if (!fVar.B(rVar, i15)) {
                    m4.c1.N0(b0Var, rVar, i14, new m4.m1(-4));
                    return;
                }
                na.d dVar = b0Var.f16044e;
                b0Var.s(rVar);
                dVar.getClass();
                if (i15 == 27) {
                    b1Var.h(b0Var, rVar, i14);
                    fVar.d(rVar, i15, new Object());
                    return;
                }
                fVar.d(rVar, i15, new m4.d() {
                    @Override
                    public final i9.w run() {
                        return (i9.w) b1.this.h(b0Var, rVar, i14);
                    }
                });
                return;
            case 2:
                yj yjVar = (yj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    yjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new d9(yjVar, yjVar.h, new ArrayList(), new ArrayList(), 15));
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
                int i16 = i10 + 1;
                String[] strArr = new String[i16];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                yj yjVar2 = yjVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i17);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    yj yjVar3 = yjVar2;
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
                    int i18 = 0;
                    char c11 = 0;
                    while (i18 < i16) {
                        int i19 = i18;
                        String str4 = strArr2[i19];
                        if ((str == null || (!str.startsWith(str4) && !ai.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !ai.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !ai.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !ai.w(" ", str4, translitString2)))) {
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
                                longSparseIntArray.put(user4.f20215id, 1);
                            }
                            arrayList4.add(contact);
                            i17++;
                            yjVar2 = yjVar3;
                            arrayList2 = arrayList;
                            strArr = strArr2;
                        } else {
                            i18 = i19 + 1;
                            lowerCase2 = str5;
                            c11 = c10;
                            str = str3;
                        }
                    }
                    i17++;
                    yjVar2 = yjVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                yj yjVar4 = yjVar2;
                String[] strArr3 = strArr;
                int i20 = 0;
                while (i20 < arrayList3.size()) {
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i20);
                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                        TLRPC.User user5 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_contact.user_id));
                        String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        boolean z11 = false;
                        int i21 = 0;
                        while (i21 < i16) {
                            String str6 = strArr3[i21];
                            if (lowerCase3.startsWith(str6) || ai.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || ai.w(" ", str6, translitString3)))) {
                                i11 = i20;
                                z11 = true;
                            } else {
                                i11 = i20;
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                    z11 = true;
                                }
                            }
                            if (z11 && user5.phone != null) {
                                if (z11) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                }
                                arrayList4.add(user5);
                                i20 = i11 + 1;
                            } else {
                                i21++;
                                i20 = i11;
                            }
                        }
                    }
                    i11 = i20;
                    i20 = i11 + 1;
                }
                AndroidUtilities.runOnUIThread(new d9(yjVar4, this.f12469c, arrayList4, arrayList5, 15));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                zn znVar2 = (zn) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24049q1;
                yi yiVar = chatAttachAlertPhotoLayout.f30245b;
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().K2(null, m2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f34042n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (yiVar.H) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer t13 = PhotoViewer.t1();
                om omVar = chatAttachAlertPhotoLayout.f24069h1;
                if (yiVar.H) {
                    znVar = null;
                } else {
                    znVar = znVar2;
                }
                t13.g2(arrayList6, this.f12469c, i22, false, omVar, znVar);
                PhotoViewer.t1().x2(yiVar.Q);
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (yiVar.T0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (yiVar.U0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.P = z10;
                }
                if (yiVar.G) {
                    PhotoViewer.t1().Y0(null, null, false, yiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = yiVar.o1().getText();
                    t15.f34067p7 = true;
                    t15.f34075q7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
        }
    }

    public i0(n4.x xVar, i1 i1Var, int i10, o9 o9Var, k0 k0Var, int i11) {
        this.d = xVar;
        this.f12470e = i1Var;
        this.f12468b = i10;
        this.f12471f = o9Var;
        this.h = k0Var;
        this.f12469c = i11;
    }

    public i0(yj yjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = yjVar;
        this.f12470e = str;
        this.f12471f = arrayList;
        this.h = arrayList2;
        this.f12468b = i10;
        this.f12469c = i11;
    }

    public i0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, int i11, zn znVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f12468b = i10;
        this.f12470e = m2Var;
        this.f12471f = arrayList;
        this.f12469c = i11;
        this.h = znVar;
    }
}
