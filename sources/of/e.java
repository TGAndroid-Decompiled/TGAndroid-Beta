package of;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.wk0;
public abstract class e extends sk0 {
    public final boolean A;
    public int B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final int f19274r = UserConfig.selectedAccount;
    public final Context f19275s;
    public final int v;
    public final boolean f19276w;
    public final a0.h f19277x;
    public ArrayList f19278y;

    public e(Context context, int i9, boolean z10, a0.h hVar, int i10) {
        boolean z11;
        this.f19275s = context;
        this.v = i9;
        this.f19276w = z10;
        this.f19277x = hVar;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A = z11;
        this.C = i10 == 2;
    }

    @Override
    public final String F(int i9) {
        ArrayList<String> arrayList;
        if (this.B != 2 && !this.E) {
            int i10 = this.f19274r;
            int i11 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i10);
            if (i11 == 2) {
                arrayList = contactsController.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController.sortedUsersSectionsArray;
            }
            int S = S(i9);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i11 != 0 && !this.A) {
                if (S >= 0 && S < arrayList.size()) {
                    return arrayList.get(S);
                }
            } else if (S > 0 && S <= arrayList.size()) {
                return arrayList.get(S - 1);
            }
        }
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.M(int):int");
    }

    @Override
    public final int N(int i9, int i10) {
        return Objects.hash(Integer.valueOf(i9 * (-49612)), O(i9, i10));
    }

    @Override
    public final Object O(int i9, int i10) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i11;
        boolean z10 = this.G;
        int i12 = this.f19274r;
        if (z10 && i9 == 1 && i10 > 1 && i10 - 2 < ContactsController.getInstance(i12).phoneBookContacts.size()) {
            return ContactsController.getInstance(i12).phoneBookContacts.get(i11);
        }
        if (P(i9, i10) == 2) {
            return "Header";
        }
        int i13 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i12);
        if (i13 == 2) {
            hashMap = contactsController.usersMutualSectionsDict;
        } else {
            hashMap = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i12);
        if (i13 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (i13 != 0 && !this.A) {
            if (i9 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i9));
                if (i10 < arrayList2.size()) {
                    return MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList2.get(i10).user_id));
                }
            }
            return null;
        } else if (i9 == 0) {
            return null;
        } else {
            if (this.B == 2) {
                if (i9 == 1) {
                    if (i10 >= this.f19278y.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i12).getUser(Long.valueOf(((TLRPC.TL_contact) this.f19278y.get(i10)).user_id));
                }
            } else {
                int i14 = i9 - 1;
                if (i14 < arrayList.size()) {
                    ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i14));
                    if (i10 >= arrayList3.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList3.get(i10).user_id));
                }
            }
            if (!this.f19276w || i10 < 0 || i10 >= ContactsController.getInstance(i12).phoneBookContacts.size()) {
                return null;
            }
            return ContactsController.getInstance(i12).phoneBookContacts.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.P(int, int):int");
    }

    @Override
    public final View T(int i9, View view) {
        ArrayList<String> arrayList;
        View view2;
        int i10 = this.f19274r;
        int i11 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i10);
        if (i11 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i10);
        if (i11 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f19275s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f25087a = textView;
            j3.r0.u(22.0f, 1, textView);
            j3.r0.w(f6.B6, null, false, textView, 17);
            frameLayout.addView(textView, e6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = frameLayout;
        } else {
            view2 = view;
        }
        r4 r4Var = (r4) view2;
        if (this.B != 2 && !this.D && !this.E) {
            if (i11 != 0 && !this.A) {
                if (i9 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i9));
                    return view2;
                }
                r4Var.setLetter("");
                return view2;
            } else if (i9 == 0) {
                r4Var.setLetter("");
                return view2;
            } else {
                int i12 = i9 - 1;
                if (i12 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i12));
                    return view2;
                }
                r4Var.setLetter("");
                return view2;
            }
        }
        r4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        if (this.G) {
            if (i9 != 1 || i10 <= 1) {
                return false;
            }
        } else {
            int i11 = this.v;
            int i12 = this.f19274r;
            ContactsController contactsController = ContactsController.getInstance(i12);
            if (i11 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            ContactsController contactsController2 = ContactsController.getInstance(i12);
            if (i11 == 2) {
                arrayList = contactsController2.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController2.sortedUsersSectionsArray;
            }
            boolean z10 = this.A;
            if (i11 != 0 && !z10) {
                if (this.E || i10 >= hashMap.get(arrayList.get(i9)).size()) {
                    return false;
                }
            } else if (i9 == 0) {
                if (z10) {
                    if (i10 >= 1) {
                        return false;
                    }
                } else if (this.f19276w) {
                    if (i10 >= 2) {
                        return false;
                    }
                } else if (i10 >= 3) {
                    return false;
                }
            } else if (!this.E) {
                if (this.B == 2) {
                    if (i9 == 1 && i10 >= this.f19278y.size()) {
                        return false;
                    }
                } else {
                    int i13 = i9 - 1;
                    if (i13 < arrayList.size() && i10 >= hashMap.get(arrayList.get(i13)).size()) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i11;
        ArrayList<TLRPC.TL_contact> arrayList2;
        float f10;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i13 = 7;
        boolean z10 = this.A;
        int i14 = this.f19274r;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                p4 p4Var = (p4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < ContactsController.getInstance(i14).phoneBookContacts.size()) {
                                    p4Var.f24871f = ContactsController.getInstance(i14).phoneBookContacts.get(i15);
                                    p4Var.h = null;
                                    p4Var.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        m4 m4Var = (m4) view;
                        if (this.G && i10 == 1 && i9 == 1) {
                            m4Var.setText(LocaleController.getString(R.string.InviteFriends));
                            return;
                        } else if (this.B == 1) {
                            m4Var.setText(LocaleController.getString(R.string.SortedByName));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                            return;
                        }
                    }
                    if (!this.F) {
                        f10 = 96.0f;
                    } else {
                        f10 = 25.0f;
                    }
                    view.setPadding(0, AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(18.0f));
                    return;
                }
                v3 v3Var = (v3) view;
                int i16 = this.B;
                if (i16 == 0) {
                    v3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i16 == 1) {
                    v3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    v3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            p8 p8Var = (p8) view;
            boolean z12 = this.f19276w;
            if (!z12 && z10) {
                int i17 = f6.il;
                p8Var.e(i17, i17);
            } else {
                int i18 = f6.G6;
                p8Var.e(i18, i18);
            }
            if (i9 == 0) {
                if (z12) {
                    if (i10 == 0) {
                        p8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        p8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.C) {
                        p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        return;
                    }
                    p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                    return;
                } else if (i10 == 0) {
                    p8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    p8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            ContactsController.Contact contact = ContactsController.getInstance(i14).phoneBookContacts.get(i10);
            String str = contact.first_name;
            if (str != null && contact.last_name != null) {
                p8Var.i(contact.first_name + " " + contact.last_name, false);
                return;
            } else if (str != null && contact.last_name == null) {
                p8Var.i(str, false);
                return;
            } else {
                p8Var.i(contact.last_name, false);
                return;
            }
        }
        va vaVar = (va) view;
        vaVar.P.f11716a = false;
        if (this.B != 2 && !this.D) {
            i13 = 58;
        }
        vaVar.b(i13, 1);
        if (this.B == 2) {
            arrayList2 = this.f19278y;
        } else {
            int i19 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i14);
            if (i19 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            if (i19 == 2) {
                arrayList = ContactsController.getInstance(i14).sortedUsersMutualSectionsArray;
            } else {
                arrayList = ContactsController.getInstance(i14).sortedUsersSectionsArray;
            }
            if (i19 != 0 && !z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            arrayList2 = hashMap.get(arrayList.get(i9 - i11));
        }
        TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(arrayList2.get(i10).user_id));
        vaVar.e(user, null, null, false);
        if (this.f19277x.h(user.f22527id) < 0) {
            z11 = false;
        }
        vaVar.c(z11, false);
    }

    public final void Y(int i9, boolean z10) {
        this.B = i9;
        if (i9 == 2) {
            if (this.f19278y == null || z10) {
                int i10 = this.f19274r;
                this.f19278y = new ArrayList(ContactsController.getInstance(i10).contacts);
                long j10 = UserConfig.getInstance(i10).clientUserId;
                int size = this.f19278y.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.f19278y.get(i11)).user_id == j10) {
                        this.f19278y.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            Z();
            return;
        }
        l();
    }

    public final void Z() {
        int i9 = this.f19274r;
        if (this.f19278y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
            Collections.sort(this.f19278y, new d(MessagesController.getInstance(i9), currentTime, 0));
            l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        float f10;
        View view2;
        Context context = this.f19275s;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 7) {
                                if (i9 != 8) {
                                    if (i9 != 9) {
                                        view = new z6(context, (j2) null);
                                    } else {
                                        View anVar = new an(context, 5);
                                        anVar.setId(9);
                                        anVar.setTag(-33024);
                                        view2 = anVar;
                                    }
                                } else {
                                    view = new p4(context, false);
                                }
                            } else {
                                view = new m4(this.f19275s, f6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout vVar = new fh.v(this, context, viewGroup, 5);
                            vVar.addView(new iq(context), e6.e(-1, -2, 17));
                            vVar.setLayoutParams(new f2.a1(-1, -2));
                            vVar.setTag(-33024);
                            view2 = vVar;
                        }
                        view = view2;
                    } else {
                        View c3Var = new c3(context, null);
                        float f11 = 72.0f;
                        if (LocaleController.isRTL) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int dp = AndroidUtilities.dp(f10);
                        int dp2 = AndroidUtilities.dp(8.0f);
                        if (!LocaleController.isRTL) {
                            f11 = 28.0f;
                        }
                        c3Var.setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                        view = c3Var;
                    }
                } else {
                    view = new v3(context, null);
                }
            } else {
                view = new p8(context);
            }
        } else {
            va vaVar = new va(context, 58, 1, false);
            vaVar.setCallCellStyle(58);
            view = vaVar;
        }
        return new f2.q1(view);
    }
}
