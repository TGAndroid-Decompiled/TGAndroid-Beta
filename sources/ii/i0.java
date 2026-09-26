package ii;

import ai.c9;
import android.text.Editable;
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
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yl;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wn;
public final class i0 implements Runnable {
    public final int f11411a = 1;
    public final int f11412b;
    public final int f11413c;
    public final Object d;
    public final Object e;
    public final Object f11414f;
    public final Object h;

    public i0(m4.a1 a1Var, m4.r rVar, int i10, m4.a0 a0Var, int i11, m4.z0 z0Var) {
        this.d = a1Var;
        this.e = rVar;
        this.f11412b = i10;
        this.f11414f = a0Var;
        this.f11413c = i11;
        this.h = z0Var;
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
        wn wnVar;
        boolean z10;
        int i14 = this.f11411a;
        final int i15 = this.f11413c;
        Object obj = this.h;
        Object obj2 = this.f11414f;
        Object obj3 = this.e;
        int i16 = this.f11412b;
        Object obj4 = this.d;
        switch (i14) {
            case 0:
                i1 i1Var = (i1) obj3;
                q9 q9Var = (q9) obj2;
                k0 k0Var = (k0) obj;
                l0 l0Var = (l0) ((n4.y) obj4).f15223c;
                if (i1Var.length() >= i16 && i1Var.getSelectionStart() != i1Var.getSelectionEnd() && q9Var.k0(k0Var.I(), 0, i15, i16)) {
                    l0Var.d = true;
                    i1Var.setSelection(i16);
                    l0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.a0 a0Var = (m4.a0) obj2;
                final m4.z0 z0Var = (m4.z0) obj;
                oi.f fVar = ((m4.a1) obj4).f14714b;
                if (!fVar.B(rVar, i16)) {
                    m4.a1.O0(a0Var, rVar, i15, new m4.k1(-4));
                    return;
                }
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                if (i16 == 27) {
                    z0Var.h(a0Var, rVar, i15);
                    fVar.d(rVar, i16, new Object());
                    return;
                }
                fVar.d(rVar, i16, new m4.d() {
                    @Override
                    public final i9.w run() {
                        return (i9.w) z0.this.h(a0Var, rVar, i15);
                    }
                });
                return;
            case 2:
                vj vjVar = (vj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                vjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    vjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new c9(vjVar, vjVar.h, new ArrayList(), new ArrayList(), 15));
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
                vj vjVar2 = vjVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i18 = 0;
                while (i18 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i18);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    vj vjVar3 = vjVar2;
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
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, translitString2)))) {
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
                                longSparseIntArray.put(user4.f18482id, 1);
                            }
                            arrayList4.add(contact);
                            i18++;
                            vjVar2 = vjVar3;
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
                    vjVar2 = vjVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                vj vjVar4 = vjVar2;
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
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, translitString3)))) {
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
                AndroidUtilities.runOnUIThread(new c9(vjVar4, this.f11413c, arrayList4, arrayList5, 15));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                wn wnVar2 = (wn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f22120q1;
                wi wiVar = chatAttachAlertPhotoLayout.f27087b;
                if (wiVar.F && !wiVar.G) {
                    PhotoViewer.t1().J2(null, m2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f31299n = false;
                    i12 = 3;
                } else {
                    i12 = i16;
                }
                if (wiVar.H) {
                    i13 = 13;
                } else {
                    i13 = i12;
                }
                PhotoViewer t13 = PhotoViewer.t1();
                yl ylVar = chatAttachAlertPhotoLayout.f22140h1;
                if (wiVar.H) {
                    wnVar = null;
                } else {
                    wnVar = wnVar2;
                }
                t13.f2(arrayList6, this.f11413c, i13, false, ylVar, wnVar);
                PhotoViewer.t1().w2(wiVar.Q);
                if (wiVar.F && !wiVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (wiVar.Q0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (wiVar.R0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t14.P = z10;
                }
                if (wiVar.G) {
                    PhotoViewer.t1().X0(null, null, false, wiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t15 = PhotoViewer.t1();
                    Editable text = wiVar.m1().getText();
                    t15.f31324p7 = true;
                    t15.f31332q7 = text;
                    t15.z2(null, text, false, false);
                    t15.s3(null);
                    return;
                }
                return;
        }
    }

    public i0(n4.y yVar, i1 i1Var, int i10, q9 q9Var, k0 k0Var, int i11) {
        this.d = yVar;
        this.e = i1Var;
        this.f11412b = i10;
        this.f11414f = q9Var;
        this.h = k0Var;
        this.f11413c = i11;
    }

    public i0(vj vjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = vjVar;
        this.e = str;
        this.f11414f = arrayList;
        this.h = arrayList2;
        this.f11412b = i10;
        this.f11413c = i11;
    }

    public i0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, int i11, wn wnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f11412b = i10;
        this.e = m2Var;
        this.f11414f = arrayList;
        this.f11413c = i11;
        this.h = wnVar;
    }
}
