package ki;

import ai.cb;
import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.qn;
public final class h0 implements Runnable {
    public final int f15295a = 1;
    public final int f15296b;
    public final int f15297c;
    public final Object d;
    public final Object e;
    public final Object f15298f;
    public final Object h;

    public h0(m4.i1 i1Var, m4.v vVar, int i10, m4.f0 f0Var, int i11, m4.g1 g1Var) {
        this.d = i1Var;
        this.e = vVar;
        this.f15296b = i10;
        this.f15298f = f0Var;
        this.f15297c = i11;
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
        qn qnVar;
        boolean z10;
        int i13 = this.f15295a;
        final int i14 = this.f15297c;
        Object obj = this.h;
        Object obj2 = this.f15298f;
        Object obj3 = this.e;
        int i15 = this.f15296b;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                h1 h1Var = (h1) obj3;
                n9 n9Var = (n9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((qf.b) obj4).f44448c;
                if (h1Var.length() >= i15 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && n9Var.j0(j0Var.D(), 0, i14, i15)) {
                    k0Var.d = true;
                    h1Var.setSelection(i15);
                    k0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.v vVar = (m4.v) obj3;
                final m4.f0 f0Var = (m4.f0) obj2;
                final m4.g1 g1Var = (m4.g1) obj;
                qi.e eVar = ((m4.i1) obj4).f16564b;
                if (!eVar.x(vVar, i15)) {
                    m4.i1.P0(f0Var, vVar, i14, new m4.s1(-4));
                    return;
                }
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                if (i15 == 27) {
                    g1Var.e(f0Var, vVar, i14);
                    eVar.d(vVar, i15, new Object());
                    return;
                }
                eVar.d(vVar, i15, new m4.g() {
                    @Override
                    public final j9.y run() {
                        return (j9.y) g1.this.e(f0Var, vVar, i14);
                    }
                });
                return;
            case 2:
                tj tjVar = (tj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                tjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    tjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new cb(tjVar, tjVar.h, new ArrayList(), new ArrayList(), 16));
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
                tj tjVar2 = tjVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i17);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    tj tjVar3 = tjVar2;
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
                        if ((str == null || (!str.startsWith(str4) && !org.telegram.messenger.g0.w(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !org.telegram.messenger.g0.w(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.g0.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.g0.w(" ", str4, translitString2)))) {
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
                                longSparseIntArray.put(user4.f20423id, 1);
                            }
                            arrayList4.add(contact);
                            i17++;
                            tjVar2 = tjVar3;
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
                    tjVar2 = tjVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                tj tjVar4 = tjVar2;
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
                            if (lowerCase3.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.g0.w(" ", str6, translitString3)))) {
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
                AndroidUtilities.runOnUIThread(new cb(tjVar4, this.f15297c, arrayList4, arrayList5, 16));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                qn qnVar2 = (qn) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24077q1;
                ti tiVar = chatAttachAlertPhotoLayout.f28173b;
                if (tiVar.F && !tiVar.G) {
                    PhotoViewer.u1().M2(null, n2Var, null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.h = 0;
                    u12.f33355n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (tiVar.H) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer u13 = PhotoViewer.u1();
                im imVar = chatAttachAlertPhotoLayout.f24097h1;
                if (tiVar.H) {
                    qnVar = null;
                } else {
                    qnVar = qnVar2;
                }
                u13.i2(arrayList6, this.f15297c, i22, false, imVar, qnVar);
                PhotoViewer.u1().z2(tiVar.Q);
                if (tiVar.F && !tiVar.G) {
                    PhotoViewer.u1().O = false;
                } else if (tiVar.T0 != 0) {
                    PhotoViewer.u1().O = true;
                    PhotoViewer u14 = PhotoViewer.u1();
                    if (tiVar.U0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u14.P = z10;
                }
                if (tiVar.G) {
                    PhotoViewer.u1().Z0(null, null, false, tiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer u15 = PhotoViewer.u1();
                    Editable text = tiVar.o1().getText();
                    u15.f33380p7 = true;
                    u15.f33388q7 = text;
                    u15.C2(null, text, false, false);
                    u15.v3(null);
                    return;
                }
                return;
        }
    }

    public h0(tj tjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = tjVar;
        this.e = str;
        this.f15298f = arrayList;
        this.h = arrayList2;
        this.f15296b = i10;
        this.f15297c = i11;
    }

    public h0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, int i11, qn qnVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f15296b = i10;
        this.e = n2Var;
        this.f15298f = arrayList;
        this.f15297c = i11;
        this.h = qnVar;
    }

    public h0(qf.b bVar, h1 h1Var, int i10, n9 n9Var, j0 j0Var, int i11) {
        this.d = bVar;
        this.e = h1Var;
        this.f15296b = i10;
        this.f15298f = n9Var;
        this.h = j0Var;
        this.f15297c = i11;
    }
}
