package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.d3;
public abstract class e extends im0 {
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float M;
    public final Context f14039s;
    public final int v;
    public final boolean f14040w;
    public final a0.h f14041x;
    public ArrayList f14042y;
    public final int f14038r = UserConfig.selectedAccount;
    public float L = 1.0f;
    public final ArrayList N = new ArrayList();

    public e(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        boolean z11;
        this.f14039s = context;
        this.v = i10;
        this.f14040w = z10;
        this.f14041x = hVar;
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
            int i11 = this.f14038r;
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
                return null;
            } else if (S > 0 && S <= arrayList.size()) {
                return arrayList.get(S - 1);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ig.e.M(int):int");
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
        int i13 = this.f14038r;
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
                    if (i11 >= this.f14042y.size()) {
                        return null;
                    }
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.f14042y.get(i11)).user_id));
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
            if (!this.f14040w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
                return null;
            }
            return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ig.e.P(int, int):int");
    }

    @Override
    public final View T(int i10, View view) {
        ArrayList<String> arrayList;
        int i11 = this.f14038r;
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
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f14039s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f25586a = textView;
            ic.a.o(22.0f, 1, textView);
            f7.V(textView, y6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, kb1.h(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.N.add(frameLayout);
            view2 = frameLayout;
        }
        v4 v4Var = (v4) view2;
        float f7 = this.M;
        if (f7 > 0.0f) {
            v4Var.setLetterTextSize(f7);
        }
        v4Var.setLetterProgress(this.L);
        if (this.F != 2 && !this.H && !this.I) {
            if (i12 != 0 && !this.E) {
                if (i10 < arrayList.size()) {
                    v4Var.setLetter(arrayList.get(i10));
                    return view2;
                }
                v4Var.setLetter("");
                return view2;
            } else if (i10 == 0) {
                v4Var.setLetter("");
                return view2;
            } else {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    v4Var.setLetter(arrayList.get(i13));
                    return view2;
                }
                v4Var.setLetter("");
                return view2;
            }
        }
        v4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        if (this.K) {
            if (i10 != 1 || i11 <= 1) {
                return false;
            }
        } else {
            int i12 = this.v;
            int i13 = this.f14038r;
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
                } else if (this.f14040w) {
                    if (i11 >= 2) {
                        return false;
                    }
                } else if (i11 >= 3) {
                    return false;
                }
            } else if (!this.I) {
                if (this.F == 2) {
                    if (i10 == 1 && i11 >= this.f14042y.size()) {
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
    public final void W(int i10, int i11, s4.e1 e1Var) {
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap;
        ArrayList<String> arrayList;
        int i12;
        ArrayList<TLRPC.TL_contact> arrayList2;
        float f7;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        int i14 = 7;
        boolean z10 = this.E;
        int i15 = this.f14038r;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4) {
                        if (i13 != 7) {
                            if (i13 == 8) {
                                t4 t4Var = (t4) view;
                                int i16 = i11 - 2;
                                if (i16 >= 0 && i16 < ContactsController.getInstance(i15).phoneBookContacts.size()) {
                                    t4Var.a(ContactsController.getInstance(i15).phoneBookContacts.get(i16), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        q4 q4Var = (q4) view;
                        if (this.K && i11 == 1 && i10 == 1) {
                            q4Var.setText(LocaleController.getString(R.string.InviteFriends));
                            return;
                        } else if (this.F == 1) {
                            q4Var.setText(LocaleController.getString(R.string.SortedByName));
                            return;
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
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
                z3 z3Var = (z3) view;
                int i17 = this.F;
                if (i17 == 0) {
                    z3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i17 == 1) {
                    z3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    z3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            v8 v8Var = (v8) view;
            boolean z12 = this.f14040w;
            if (!z12 && z10) {
                int i18 = y6.il;
                v8Var.g(i18, i18);
            } else {
                int i19 = y6.G6;
                v8Var.g(i19, i19);
            }
            if (i10 == 0) {
                if (z12) {
                    if (i11 == 0) {
                        v8Var.r(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                        return;
                    } else if (i11 == 1) {
                        v8Var.r(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.G) {
                        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        return;
                    }
                    v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                    return;
                } else if (i11 == 0) {
                    v8Var.r(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
                    return;
                } else if (i11 == 1) {
                    v8Var.r(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            ContactsController.Contact contact = ContactsController.getInstance(i15).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str != null && contact.last_name != null) {
                v8Var.k(contact.first_name + " " + contact.last_name, false);
                return;
            } else if (str != null && contact.last_name == null) {
                v8Var.k(str, false);
                return;
            } else {
                v8Var.k(contact.last_name, false);
                return;
            }
        }
        ab abVar = (ab) view;
        abVar.T.f9311a = false;
        if (this.F != 2 && !this.H) {
            i14 = 58;
        }
        abVar.b(i14, 1);
        if (this.F == 2) {
            arrayList2 = this.f14042y;
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
        abVar.d(user, null, null, false);
        if (this.f14041x.h(user.f22177id) < 0) {
            z11 = false;
        }
        abVar.c(z11, false);
    }

    public final void Y(int i10, boolean z10) {
        this.F = i10;
        if (i10 == 2) {
            if (this.f14042y == null || z10) {
                int i11 = this.f14038r;
                this.f14042y = new ArrayList(ContactsController.getInstance(i11).contacts);
                long j10 = UserConfig.getInstance(i11).clientUserId;
                int size = this.f14042y.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.f14042y.get(i12)).user_id == j10) {
                        this.f14042y.remove(i12);
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
        int i10 = this.f14038r;
        if (this.f14042y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.f14042y, new d(MessagesController.getInstance(i10), currentTime, 0));
            l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        float f7;
        View view2;
        Context context = this.f14039s;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    if (i10 != 9) {
                                        view = new org.telegram.ui.Cells.f7(context, (d3) null);
                                    } else {
                                        View vnVar = new vn(context, 4);
                                        vnVar.setId(9);
                                        vnVar.setTag(-33024);
                                        view2 = vnVar;
                                    }
                                } else {
                                    view = new t4(context, false);
                                }
                            } else {
                                view = new q4(this.f14039s, y6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout pVar = new bh.p(this, context, viewGroup, 4);
                            pVar.addView(new dr(context), kb1.i(-1, -2, 17));
                            pVar.setLayoutParams(new s4.q0(-1, -2));
                            pVar.setTag(-33024);
                            view2 = pVar;
                        }
                        view = view2;
                    } else {
                        View a3Var = new a3(context, null);
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
                        a3Var.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                        view = a3Var;
                    }
                } else {
                    view = new z3(context, null);
                }
            } else {
                view = new v8(context);
            }
        } else {
            ab abVar = new ab(context, 58, 1, false);
            abVar.setCallCellStyle(58);
            view = abVar;
        }
        return new s4.e1(view);
    }
}
