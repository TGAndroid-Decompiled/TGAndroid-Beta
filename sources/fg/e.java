package fg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.n7;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yq;
import w7.a6;
public abstract class e extends rl0 {
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int f7995r = UserConfig.selectedAccount;
    public final Context f7996s;
    public final int v;
    public final boolean f7997w;
    public final a0.i f7998x;
    public ArrayList f7999y;

    public e(Context context, int i10, boolean z10, a0.i iVar, int i11) {
        boolean z11;
        this.f7996s = context;
        this.v = i10;
        this.f7997w = z10;
        this.f7998x = iVar;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.G = i11 == 2;
    }

    @Override
    public final String F(int i10) {
        ArrayList<String> arrayList;
        if (this.F != 2 && !this.I) {
            int i11 = this.f7995r;
            int i12 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i11);
            if (i12 == 2) {
                arrayList = contactsController.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController.sortedUsersSectionsArray;
            }
            int S = S(i10);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i12 != 0 && !this.E) {
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
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: fg.e.M(int):int");
    }

    @Override
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override
    public final Object O(int i10, int i11) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        boolean z10 = this.K;
        int i13 = this.f7995r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return ContactsController.getInstance(i13).phoneBookContacts.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i13);
        if (i14 == 2) {
            hashMap = contactsController.usersMutualSectionsDict;
        } else {
            hashMap = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        if (i14 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (i14 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList2.get(i11).user_id));
                }
            }
            return null;
        } else if (i10 == 0) {
            return null;
        } else {
            if (this.F == 2) {
                if (i10 == 1) {
                    if (i11 >= this.f7999y.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.f7999y.get(i11)).user_id));
                }
            } else {
                int i15 = i10 - 1;
                if (i15 < arrayList.size()) {
                    ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i15));
                    if (i11 >= arrayList3.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList3.get(i11).user_id));
                }
            }
            if (!this.f7997w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
                return null;
            }
            return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: fg.e.P(int, int):int");
    }

    @Override
    public final View T(int i10, View view) {
        ArrayList<String> arrayList;
        View view2;
        int i11 = this.f7995r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        if (i12 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        if (i12 == 2) {
            arrayList = contactsController2.sortedUsersMutualSectionsArray;
        } else {
            arrayList = contactsController2.sortedUsersSectionsArray;
        }
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f7996s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f19894a = textView;
            com.google.android.gms.internal.vision.e2.k(22.0f, 1, textView);
            com.google.android.gms.internal.vision.e2.p(j6.B6, null, false, textView, 17);
            frameLayout.addView(textView, a6.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = frameLayout;
        } else {
            view2 = view;
        }
        r4 r4Var = (r4) view2;
        if (this.F != 2 && !this.H && !this.I) {
            if (i12 != 0 && !this.E) {
                if (i10 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i10));
                    return view2;
                }
                r4Var.setLetter("");
                return view2;
            } else if (i10 == 0) {
                r4Var.setLetter("");
                return view2;
            } else {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    r4Var.setLetter(arrayList.get(i13));
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
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        if (this.K) {
            if (i10 != 1 || i11 <= 1) {
                return false;
            }
        } else {
            int i12 = this.v;
            int i13 = this.f7995r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            if (i12 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            if (i12 == 2) {
                arrayList = contactsController2.sortedUsersMutualSectionsArray;
            } else {
                arrayList = contactsController2.sortedUsersSectionsArray;
            }
            boolean z10 = this.E;
            if (i12 != 0 && !z10) {
                if (this.I || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                    return false;
                }
            } else if (i10 == 0) {
                if (z10) {
                    if (i11 >= 1) {
                        return false;
                    }
                } else if (this.f7997w) {
                    if (i11 >= 2) {
                        return false;
                    }
                } else if (i11 >= 3) {
                    return false;
                }
            } else if (!this.I) {
                if (this.F == 2) {
                    if (i10 == 1 && i11 >= this.f7999y.size()) {
                        return false;
                    }
                } else {
                    int i14 = i10 - 1;
                    if (i14 < arrayList.size() && i11 >= hashMap.get(arrayList.get(i14)).size()) {
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
    public final void W(int i10, int i11, s4.c1 c1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        ArrayList<TLRPC.TL_contact> arrayList2;
        float f7;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        int i14 = 7;
        boolean z10 = this.E;
        int i15 = this.f7995r;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4) {
                        if (i13 != 7) {
                            if (i13 == 8) {
                                p4 p4Var = (p4) view;
                                int i16 = i11 - 2;
                                if (i16 >= 0 && i16 < ContactsController.getInstance(i15).phoneBookContacts.size()) {
                                    p4Var.f19675f = ContactsController.getInstance(i15).phoneBookContacts.get(i16);
                                    p4Var.h = null;
                                    p4Var.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        m4 m4Var = (m4) view;
                        if (this.K && i11 == 1 && i10 == 1) {
                            m4Var.setText(LocaleController.getString(R.string.InviteFriends));
                            return;
                        } else if (this.F == 1) {
                            m4Var.setText(LocaleController.getString(R.string.SortedByName));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                            return;
                        }
                    }
                    if (!this.J) {
                        f7 = 96.0f;
                    } else {
                        f7 = 25.0f;
                    }
                    view.setPadding(0, AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(18.0f));
                    return;
                }
                u3 u3Var = (u3) view;
                int i17 = this.F;
                if (i17 == 0) {
                    u3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i17 == 1) {
                    u3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    u3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            s8 s8Var = (s8) view;
            boolean z12 = this.f7997w;
            if (!z12 && z10) {
                int i18 = j6.il;
                s8Var.e(i18, i18);
            } else {
                int i19 = j6.G6;
                s8Var.e(i19, i19);
            }
            if (i10 == 0) {
                if (z12) {
                    if (i11 == 0) {
                        s8Var.p(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                        return;
                    } else if (i11 == 1) {
                        s8Var.p(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.G) {
                        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        return;
                    }
                    s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                    return;
                } else if (i11 == 0) {
                    s8Var.p(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
                    return;
                } else if (i11 == 1) {
                    s8Var.p(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            ContactsController.Contact contact = ContactsController.getInstance(i15).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str != null && contact.last_name != null) {
                s8Var.i(contact.first_name + " " + contact.last_name, false);
                return;
            } else if (str != null && contact.last_name == null) {
                s8Var.i(str, false);
                return;
            } else {
                s8Var.i(contact.last_name, false);
                return;
            }
        }
        bb bbVar = (bb) view;
        bbVar.T.f49048a = false;
        if (this.F != 2 && !this.H) {
            i14 = 58;
        }
        bbVar.b(i14, 1);
        if (this.F == 2) {
            arrayList2 = this.f7999y;
        } else {
            int i20 = this.v;
            ContactsController contactsController = ContactsController.getInstance(i15);
            if (i20 == 2) {
                hashMap = contactsController.usersMutualSectionsDict;
            } else {
                hashMap = contactsController.usersSectionsDict;
            }
            if (i20 == 2) {
                arrayList = ContactsController.getInstance(i15).sortedUsersMutualSectionsArray;
            } else {
                arrayList = ContactsController.getInstance(i15).sortedUsersSectionsArray;
            }
            if (i20 != 0 && !z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            arrayList2 = hashMap.get(arrayList.get(i10 - i12));
        }
        TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(arrayList2.get(i11).user_id));
        bbVar.d(user, null, null, false);
        if (this.f7998x.h(user.f17342id) < 0) {
            z11 = false;
        }
        bbVar.c(z11, false);
    }

    public final void Y(int i10, boolean z10) {
        this.F = i10;
        if (i10 == 2) {
            if (this.f7999y == null || z10) {
                int i11 = this.f7995r;
                this.f7999y = new ArrayList(ContactsController.getInstance(i11).contacts);
                long j3 = UserConfig.getInstance(i11).clientUserId;
                int size = this.f7999y.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.f7999y.get(i12)).user_id == j3) {
                        this.f7999y.remove(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            Z();
            return;
        }
        l();
    }

    public final void Z() {
        int i10 = this.f7995r;
        if (this.f7999y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.f7999y, new d(MessagesController.getInstance(i10), currentTime, 0));
            l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        float f7;
        View view2;
        Context context = this.f7996s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 9) {
                                        view = new c7(context, (r6) null);
                                    } else {
                                        View qnVar = new qn(context, 3);
                                        qnVar.setId(9);
                                        qnVar.setTag(-33024);
                                        view2 = qnVar;
                                    }
                                } else {
                                    view = new p4(context, false);
                                }
                            } else {
                                view = new m4(this.f7996s, j6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout n7Var = new n7(this, context, viewGroup, 1);
                            n7Var.addView(new yq(context), a6.e(-1, -2, 17));
                            n7Var.setLayoutParams(new s4.p0(-1, -2));
                            n7Var.setTag(-33024);
                            view2 = n7Var;
                        }
                        view = view2;
                    } else {
                        View c3Var = new c3(context, null);
                        float f10 = 72.0f;
                        if (LocaleController.isRTL) {
                            f7 = 28.0f;
                        } else {
                            f7 = 72.0f;
                        }
                        int dp = AndroidUtilities.dp(f7);
                        int dp2 = AndroidUtilities.dp(8.0f);
                        if (!LocaleController.isRTL) {
                            f10 = 28.0f;
                        }
                        c3Var.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                        view = c3Var;
                    }
                } else {
                    view = new u3(context, null);
                }
            } else {
                view = new s8(context);
            }
        } else {
            bb bbVar = new bb(context, 58, 1, false);
            bbVar.setCallCellStyle(58);
            view = bbVar;
        }
        return new s4.c1(view);
    }
}
