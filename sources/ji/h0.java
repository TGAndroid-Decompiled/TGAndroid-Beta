package ji;

import android.text.Editable;
import bi.n8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fo;
public final class h0 implements Runnable {
    public final int f13288a = 1;
    public final int f13289b;
    public final int f13290c;
    public final Object d;
    public final Object e;
    public final Object f13291f;
    public final Object h;

    public h0(m4.j1 j1Var, m4.w wVar, int i10, m4.f0 f0Var, int i11, m4.h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f13289b = i10;
        this.f13291f = f0Var;
        this.f13290c = i11;
        this.h = h1Var;
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
        fo foVar;
        boolean z10;
        int i13 = this.f13288a;
        final int i14 = this.f13290c;
        Object obj = this.h;
        Object obj2 = this.f13291f;
        Object obj3 = this.e;
        int i15 = this.f13289b;
        Object obj4 = this.d;
        switch (i13) {
            case 0:
                h1 h1Var = (h1) obj3;
                o9 o9Var = (o9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((n4.s) obj4).f16032c;
                if (h1Var.length() >= i15 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && o9Var.j0(j0Var.L(), 0, i14, i15)) {
                    k0Var.d = true;
                    h1Var.setSelection(i15);
                    k0Var.d = false;
                    return;
                }
                return;
            case 1:
                final m4.w wVar = (m4.w) obj3;
                final m4.f0 f0Var = (m4.f0) obj2;
                final m4.h1 h1Var2 = (m4.h1) obj;
                qi.e eVar = ((m4.j1) obj4).f15475b;
                if (!eVar.u(wVar, i15)) {
                    m4.j1.P0(f0Var, wVar, i14, new m4.t1(-4));
                    return;
                }
                pb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                if (i15 == 27) {
                    h1Var2.c(f0Var, wVar, i14);
                    eVar.b(wVar, i15, new Object());
                    return;
                }
                eVar.b(wVar, i15, new m4.h() {
                    @Override
                    public final j9.y run() {
                        return (j9.y) h1.this.c(f0Var, wVar, i14);
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
                    AndroidUtilities.runOnUIThread(new n8(vjVar, vjVar.h, new ArrayList(), new ArrayList(), 15));
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
                vj vjVar2 = vjVar;
                ArrayList arrayList5 = new ArrayList();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i17);
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
                    int i18 = 0;
                    char c11 = 0;
                    while (i18 < i16) {
                        int i19 = i18;
                        String str4 = strArr2[i19];
                        if ((str == null || (!str.startsWith(str4) && !yh.v(" ", str4, str))) && (str2 == null || (!str2.startsWith(str4) && !yh.v(" ", str4, str2)))) {
                            str3 = str;
                            TLRPC.User user2 = contact.user;
                            if (user2 != null && (publicUsername = UserObject.getPublicUsername(user2)) != null && publicUsername.startsWith(str4)) {
                                c10 = 2;
                            } else if (!lowerCase2.startsWith(str4) && !yh.v(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !yh.v(" ", str4, translitString2)))) {
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
                                longSparseIntArray.put(user4.f19363id, 1);
                            }
                            arrayList4.add(contact);
                            i17++;
                            vjVar2 = vjVar3;
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
                    vjVar2 = vjVar3;
                    arrayList2 = arrayList;
                    strArr = strArr2;
                }
                vj vjVar4 = vjVar2;
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
                            if (lowerCase3.startsWith(str6) || yh.v(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || yh.v(" ", str6, translitString3)))) {
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
                AndroidUtilities.runOnUIThread(new n8(vjVar4, this.f13290c, arrayList4, arrayList5, 15));
                return;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                fo foVar2 = (fo) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f23018q1;
                vi viVar = chatAttachAlertPhotoLayout.f27671b;
                if (viVar.F && !viVar.G) {
                    PhotoViewer.t1().K2(null, m2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.f32303n = false;
                    i12 = 3;
                } else {
                    i12 = i15;
                }
                if (viVar.H) {
                    i12 = 13;
                }
                int i22 = i12;
                PhotoViewer t13 = PhotoViewer.t1();
                lm lmVar = chatAttachAlertPhotoLayout.f23038h1;
                if (viVar.H) {
                    foVar = null;
                } else {
                    foVar = foVar2;
                }
                t13.g2(arrayList6, this.f13290c, i22, false, lmVar, foVar);
                PhotoViewer.t1().x2(viVar.Q);
                if (viVar.F && !viVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (viVar.T0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer t14 = PhotoViewer.t1();
                    if (viVar.U0 != null) {
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
                    Editable text = viVar.o1().getText();
                    t15.f32328p7 = true;
                    t15.f32336q7 = text;
                    t15.A2(null, text, false, false);
                    t15.t3(null);
                    return;
                }
                return;
        }
    }

    public h0(n4.s sVar, h1 h1Var, int i10, o9 o9Var, j0 j0Var, int i11) {
        this.d = sVar;
        this.e = h1Var;
        this.f13289b = i10;
        this.f13291f = o9Var;
        this.h = j0Var;
        this.f13290c = i11;
    }

    public h0(vj vjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = vjVar;
        this.e = str;
        this.f13291f = arrayList;
        this.h = arrayList2;
        this.f13289b = i10;
        this.f13290c = i11;
    }

    public h0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, int i11, fo foVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.f13289b = i10;
        this.e = m2Var;
        this.f13291f = arrayList;
        this.f13290c = i11;
        this.h = foVar;
    }
}
