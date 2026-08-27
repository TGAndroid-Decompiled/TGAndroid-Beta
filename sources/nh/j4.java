package nh;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.rn;
import rh.g5;
import rh.o5;
import rh.p5;
import rh.t5;
import rh.y4;

public final class j4 implements Runnable {

    public final int f18783a;

    public final int f18784b;

    public final int f18785c;
    public final Object d;

    public final Object f18786e;

    public final Object f18787f;

    public j4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18783a = 1;
        this.d = mediaController;
        this.f18784b = i10;
        this.f18786e = tL_error;
        this.f18787f = tLObject;
        this.f18785c = i11;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11;
        char c10;
        Object obj;
        switch (this.f18783a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.f18786e;
                o4.g(this.f18784b, user, document, this.f18785c, new f4((org.telegram.ui.web.s) this.f18787f, document, 0));
                break;
            case 1:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.f18784b, (TLRPC.TL_error) this.f18786e, (TLObject) this.f18787f, this.f18785c);
                break;
            case 2:
                rn rnVar = (rn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.f18786e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f18787f;
                rnVar.f42211sb = this.f18784b;
                rnVar.f42224tb = this.f18785c;
                rnVar.f42237ub = characterStyle;
                s1Var.invalidate();
                break;
            case 3:
                pf.c1 c1Var = (pf.c1) this.d;
                String str = (String) this.f18786e;
                ArrayList arrayList2 = (ArrayList) this.f18787f;
                c1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.f18784b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new gh.e1(c1Var, i12, new ArrayList(), new ArrayList(), c1Var.D, 28));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i13 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i13];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        int size = arrayList2.size();
                        int i15 = this.f18785c;
                        if (i14 >= size) {
                            int i16 = i12;
                            if (c1Var.C == null) {
                                c1Var.C = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i15).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i17);
                                    i17++;
                                    ContactsController.Contact contact2 = contact;
                                    pf.b1 b1Var = new pf.b1();
                                    b1Var.f45740b = contact2;
                                    b1Var.f45739a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    c1Var.C.add(b1Var);
                                }
                            }
                            for (int i18 = 0; i18 < c1Var.C.size(); i18++) {
                                pf.b1 b1Var2 = (pf.b1) c1Var.C.get(i18);
                                if ((translitString != null && (b1Var2.f45739a.toLowerCase().contains(translitString) || b1Var2.f45739a.toLowerCase().contains(translitString))) || b1Var2.f45739a.toLowerCase().contains(lowerCase) || b1Var2.f45739a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(b1Var2.f45740b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new gh.e1(c1Var, i16, arrayList3, arrayList4, arrayList5, 28));
                        } else {
                            int i19 = i13;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                            if (c1Var.v || !user2.self) {
                                String[] strArr2 = new String[3];
                                strArr2[0] = ContactsController.formatName(user2.first_name, user2.last_name).toLowerCase();
                                String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                                strArr2[1] = translitString2;
                                if (strArr2[0].equals(translitString2)) {
                                    strArr2[1] = null;
                                }
                                if (UserObject.isReplyUser(user2)) {
                                    strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                } else if (user2.self) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                int i20 = i19;
                                int i21 = 0;
                                char c11 = 0;
                                while (true) {
                                    arrayList = arrayList2;
                                    if (i21 < i20) {
                                        String str2 = strArr[i21];
                                        i10 = i12;
                                        i11 = i20;
                                        for (int i22 = 0; i22 < 3; i22++) {
                                            String str3 = strArr2[i22];
                                            if (str3 != null && (str3.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, str3))) {
                                                c11 = 1;
                                                String publicUsername = UserObject.getPublicUsername(user2);
                                                if (c11 == 0 || publicUsername == null || !publicUsername.startsWith(str2)) {
                                                    c10 = c11;
                                                } else {
                                                    c10 = 2;
                                                }
                                                if (c10 != 0) {
                                                    if (c10 == 1) {
                                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                        obj = null;
                                                    } else {
                                                        obj = null;
                                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str2));
                                                    }
                                                    arrayList3.add(user2);
                                                }
                                                i21++;
                                                c11 = c10;
                                                i20 = i11;
                                                arrayList2 = arrayList;
                                                i12 = i10;
                                            }
                                            break;
                                        }
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (c11 == 0) {
                                            c10 = c11;
                                        } else {
                                            c10 = c11;
                                        }
                                        if (c10 != 0) {
                                            if (c10 == 1) {
                                                arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                obj = null;
                                            } else {
                                                obj = null;
                                                arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str2));
                                            }
                                            arrayList3.add(user2);
                                        }
                                        i21++;
                                        c11 = c10;
                                        i20 = i11;
                                        arrayList2 = arrayList;
                                        i12 = i10;
                                    } else {
                                        i10 = i12;
                                        i11 = i20;
                                    }
                                    break;
                                }
                                i14++;
                                i13 = i11;
                                arrayList2 = arrayList;
                                i12 = i10;
                            } else {
                                arrayList = arrayList2;
                                i10 = i12;
                                i11 = i19;
                            }
                            i14++;
                            i13 = i11;
                            arrayList2 = arrayList;
                            i12 = i10;
                        }
                    }
                }
                break;
            case 4:
                rh.n0 n0Var = (rh.n0) this.d;
                rh.d1 d1Var = (rh.d1) this.f18786e;
                j9 j9Var = (j9) this.f18787f;
                rh.q0 q0Var = n0Var.f47288a;
                int length2 = d1Var.length();
                int i23 = this.f18784b;
                if (length2 >= i23 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && j9Var.k0(q0Var, 0, this.f18785c, i23)) {
                    q0Var.f47389n = true;
                    d1Var.setSelection(i23);
                    q0Var.f47389n = false;
                    break;
                }
                break;
            case 5:
                n2.b0 b0Var = (n2.b0) this.d;
                rh.d1 d1Var2 = (rh.d1) this.f18786e;
                j9 j9Var2 = (j9) this.f18787f;
                y4 y4Var = (y4) b0Var.f18130b;
                int length3 = d1Var2.length();
                int i24 = this.f18784b;
                if (length3 >= i24 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd()) {
                    if (j9Var2.y()) {
                        y4Var.f47611w = true;
                        d1Var2.setSelection(i24);
                        y4Var.f47611w = false;
                    } else if (j9Var2.k0(y4Var, 0, this.f18785c, i24)) {
                        y4Var.f47611w = true;
                        d1Var2.setSelection(i24);
                        y4Var.f47611w = false;
                    }
                    break;
                }
                break;
            case 6:
                o0.b bVar = (o0.b) this.d;
                rh.d1 d1Var3 = (rh.d1) this.f18786e;
                j9 j9Var3 = (j9) this.f18787f;
                g5 g5Var = (g5) bVar.f19088b;
                int length4 = d1Var3.length();
                int i25 = this.f18784b;
                if (length4 >= i25 && d1Var3.getSelectionStart() != d1Var3.getSelectionEnd() && j9Var3.k0(g5Var, 0, this.f18785c, i25)) {
                    g5Var.C = true;
                    d1Var3.setSelection(i25);
                    g5Var.C = false;
                    break;
                }
                break;
            case 7:
                o5 o5Var = (o5) this.d;
                rh.d1 d1Var4 = (rh.d1) this.f18786e;
                j9 j9Var4 = (j9) this.f18787f;
                t5 t5Var = o5Var.f47322a;
                int length5 = d1Var4.length();
                int i26 = this.f18784b;
                if (length5 >= i26 && d1Var4.getSelectionStart() != d1Var4.getSelectionEnd()) {
                    if (j9Var4.y()) {
                        t5Var.B = true;
                        d1Var4.setSelection(i26);
                        t5Var.B = false;
                    } else if (j9Var4.k0(t5Var, 0, this.f18785c, i26)) {
                        t5Var.B = true;
                        d1Var4.setSelection(i26);
                        t5Var.B = false;
                    }
                    break;
                }
                break;
            default:
                p5 p5Var = (p5) this.d;
                rh.d1 d1Var5 = (rh.d1) this.f18786e;
                j9 j9Var5 = (j9) this.f18787f;
                t5 t5Var2 = p5Var.f47379a;
                int length6 = d1Var5.length();
                int i27 = this.f18784b;
                if (length6 >= i27 && d1Var5.getSelectionStart() != d1Var5.getSelectionEnd()) {
                    if (j9Var5.y()) {
                        t5Var2.f47483n = true;
                        d1Var5.setSelection(i27);
                        t5Var2.f47483n = false;
                    } else if (j9Var5.k0(t5Var2, 1, this.f18785c, i27)) {
                        t5Var2.f47483n = true;
                        d1Var5.setSelection(i27);
                        t5Var2.f47483n = false;
                    }
                    break;
                }
                break;
        }
    }

    public j4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.f18783a = 0;
        this.f18784b = i10;
        this.d = user;
        this.f18786e = document;
        this.f18785c = i11;
        this.f18787f = sVar;
    }

    public j4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.f18783a = i12;
        this.d = obj;
        this.f18786e = obj2;
        this.f18784b = i10;
        this.f18787f = obj3;
        this.f18785c = i11;
    }

    public j4(rn rnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.f18783a = 2;
        this.d = rnVar;
        this.f18784b = i10;
        this.f18785c = i11;
        this.f18786e = characterStyle;
        this.f18787f = s1Var;
    }
}
