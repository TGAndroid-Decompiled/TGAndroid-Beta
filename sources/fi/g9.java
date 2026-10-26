package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ce;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.x30;
public final class g9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final t8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.e2 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final n9 W;
    public int f10920a;
    public final a0.h f10921b;
    public final ArrayList f10922c;
    public final HashMap d;
    public final FrameLayout e;
    public final mm0 f10923f;
    public final s4.c0 h;
    public final c9 f10924n;
    public final e9 f10925r;
    public final View f10926s;
    public final d v;
    public final d f10927w;
    public final z8 f10928x;
    public final org.telegram.ui.Cells.z3 f10929y;

    public g9(n9 n9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        org.telegram.ui.ActionBar.u6 u6Var9;
        org.telegram.ui.ActionBar.u6 u6Var10;
        this.W = n9Var;
        this.f10921b = new a0.h();
        this.f10922c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, u6Var);
        this.f10929y = z3Var;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        z8 z8Var = new z8(this, context, u6Var2, new w8(this, 4));
        this.f10928x = z8Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23427h5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, z8Var, u6Var3);
        z8Var.setOnSearchTextChange(new x8(this, 3));
        u6Var4 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        t8 t8Var = new t8(context, u6Var4);
        this.E = t8Var;
        t8Var.h = new w8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, gb1.i(-1, -1, 119));
        u6Var5 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        mm0 mm0Var = new mm0(context, u6Var5);
        this.f10923f = mm0Var;
        mm0Var.setClipToPadding(false);
        mm0Var.setTranslateSelector(true);
        u6Var6 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        c9 c9Var = new c9(this, context, u6Var6, z8Var, new di.e4(n9Var, 2));
        this.f10924n = c9Var;
        mm0Var.setAdapter(c9Var);
        c9Var.h = mm0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setOnScrollListener(new a9(0, this));
        mm0Var.setOnItemClickListener(new ai.f0(14, this, context));
        frameLayout.addView(mm0Var, gb1.g(-1.0f, -1));
        b9 b9Var = new b9(this);
        b9Var.n(350L);
        b9Var.o(ds.h);
        b9Var.C = false;
        b9Var.f47763m = false;
        mm0Var.setItemAnimator(b9Var);
        frameLayout.addView(z8Var, gb1.i(-1, -2, 55));
        frameLayout.addView(z3Var, gb1.i(-1, 32, 55));
        addView(t8Var, gb1.i(-1, -2, 55));
        e9 e9Var = new e9(this, context);
        this.f10925r = e9Var;
        e9Var.setClickable(true);
        e9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.k3) n9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.k3) n9Var).backgroundPaddingLeft;
        e9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        u6Var7 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, e9Var, u6Var7);
        u6Var8 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        d dVar = new d(context, u6Var8, true);
        this.v = dVar;
        dVar.setOnClickListener(new v8(this, 0));
        dVar.f();
        e9Var.addView(dVar, gb1.u(-1, 48, 87));
        u6Var9 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        d dVar2 = new d(context, u6Var9, false);
        this.f10927w = dVar2;
        dVar2.setOnClickListener(new v8(this, 1));
        dVar2.f();
        e9Var.addView(dVar2, gb1.x(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f10926s = view;
        u6Var10 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, view, u6Var10);
        addView(view, gb1.h(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(e9Var, gb1.i(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f10920a == 6) {
            ArrayList arrayList = this.f10922c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f10921b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                if (((Boolean) hVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
                }
                i11++;
            }
            if (z10) {
                g(true);
                e(true);
                f(true);
            }
        }
    }

    public final void b(int i10) {
        int i11;
        this.f10920a = i10;
        this.f10921b.b();
        ArrayList arrayList = this.f10922c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        n9 n9Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(n9Var.d);
            hashMap.putAll(n9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(n9Var.J);
        } else if (i10 == 1) {
            ArrayList K0 = n9.K0(n9Var);
            for (int i12 = 0; i12 < K0.size(); i12 = c3.h0.j(((TLRPC.User) K0.get(i12)).f22176id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(n9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(n9Var.f11316n);
            hashMap.putAll(n9Var.f11317r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f10924n.getClass();
        this.h.l1(false);
        i(false);
        z8 z8Var = this.f10928x;
        z8Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        z8Var.setVisibility(i11);
        z8Var.L = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f10920a;
        mm0 mm0Var = this.f10923f;
        if (i13 != 0) {
            mm0Var.v0(0);
        }
        mm0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.t.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f10928x.K), 0);
        while (true) {
            mm0 mm0Var = this.f10923f;
            if (i10 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f7, childAt.getY());
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f10920a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        n9 n9Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f22176id != 777000 && j11 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f10922c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                u6Var2 = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var2);
                alertDialog$Builder.f22368a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.p();
                return;
            }
            Context context2 = getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, u6Var);
            alertDialog$Builder2.f22368a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new bi.i(this, j10, arrayList, 2));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.p();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f10921b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f10928x.L = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.e2 e2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (e2Var = this.G) != null && this.H == chatFull.f22028id) {
            e2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f22028id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f10920a;
        n9 n9Var = this.W;
        d dVar = this.f10927w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (n9Var.L) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (n9Var.Z) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = n9Var.I;
                if (i14 == 1) {
                    if (n9Var.K) {
                        i11 = R.string.StoryLivePrivacyButtonPost;
                    } else {
                        i11 = R.string.StoryPrivacyButtonPost;
                    }
                    dVar2.i(LocaleController.getString(i11), z10, true);
                } else {
                    dVar2.i(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i14), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f10922c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        e9 e9Var = this.f10925r;
        if (i12 == 3) {
            int size = n9.m1(arrayList, this.d).size();
            n9Var.f11318s = size;
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e9Var.b(z11, z10);
            dVar2.b(size, z10);
            if (size > 0) {
                z12 = true;
            }
            dVar2.setEnabled(z12);
            dVar.setVisibility(8);
        } else if (i12 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.b(0, z10);
            } else {
                dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i12 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
            di.h7 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f10921b;
                    if (i13 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i13);
                    ((Boolean) hVar.n(i13)).getClass();
                    storiesController.L.contains(Long.valueOf(j10));
                    i13++;
                }
            } else {
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 4) {
            int size2 = n9.m1(n9Var.d, n9Var.e).size();
            n9Var.f11315f = size2;
            dVar2.i(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            e9Var.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        n9 n9Var = this.W;
        ArrayList arrayList2 = n9Var.J;
        HashMap hashMap = n9Var.f11317r;
        ArrayList arrayList3 = n9Var.f11316n;
        ArrayList arrayList4 = n9Var.h;
        HashMap hashMap2 = n9Var.e;
        ArrayList arrayList5 = n9Var.d;
        int i10 = this.f10920a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f10922c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f10920a == 3 && (n9Var.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    n9Var.N = i11;
                }
            } else {
                this.R = n9Var.N;
                n9Var.N = 3;
            }
        }
        HashSet m12 = n9.m1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            u8 u8Var = (u8) arrayList.get(i12);
            if (u8Var != null) {
                int i13 = u8Var.f11755i;
                if (i13 > 0) {
                    if (n9Var.N != i13) {
                        z12 = false;
                    }
                    u8Var.f11757k = z12;
                    u8Var.f11758l = false;
                } else {
                    TLRPC.User user = u8Var.f11754g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f22176id));
                        u8Var.f11757k = contains;
                        if (contains || !m12.contains(Long.valueOf(u8Var.f11754g.f22176id))) {
                            z12 = false;
                        }
                        u8Var.f11758l = z12;
                    } else {
                        TLRPC.Chat chat = u8Var.h;
                        if (chat != null) {
                            u8Var.f11757k = hashMap3.containsKey(Long.valueOf(chat.f22027id));
                            u8Var.f11758l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            mm0 mm0Var = this.f10923f;
            if (i14 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i14);
                if ((childAt instanceof m9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    u8 u8Var2 = (u8) arrayList.get(R);
                    m9 m9Var = (m9) childAt;
                    if (!u8Var2.f11757k && !u8Var2.f11758l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m9Var.c(z11, z10);
                    TLRPC.Chat chat2 = u8Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (n9.e1(n9Var, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        m9Var.b(f7, z10);
                    } else {
                        if (u8Var2.f11758l && !u8Var2.f11757k) {
                            f7 = 0.5f;
                        }
                        m9Var.b(f7, z10);
                    }
                }
                i14++;
            } else {
                h(z10);
                return;
            }
        }
    }

    public final void g(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g9.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.z3 z3Var = this.f10929y;
        if (z3Var == null) {
            return;
        }
        if (n9.m1(this.f10922c, this.d).size() > 0) {
            z3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new v8(this, 2));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.y3 y3Var = z3Var.f25782b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        z8 z8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.u6 u6Var;
        HashSet m12 = n9.m1(this.f10922c, this.d);
        int i11 = this.f10920a;
        n9 n9Var = this.W;
        if (i11 == 3) {
            n9Var.f11318s = m12.size();
        } else if (i11 == 4) {
            n9Var.f11315f = m12.size();
        }
        i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            z8Var = this.f10928x;
            ArrayList arrayList4 = z8Var.e;
            arrayList = z8Var.e;
            if (i12 >= arrayList4.size()) {
                break;
            }
            x30 x30Var = (x30) arrayList.get(i12);
            if (!m12.contains(Long.valueOf(x30Var.getUid()))) {
                arrayList2.add(x30Var);
            }
            i12++;
        }
        Iterator it = m12.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((x30) arrayList.get(i13)).getUid() == longValue) {
                        break;
                    }
                    i13++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController.getUser(l4);
                    } else {
                        chat = messagesController.getChat(l4);
                    }
                    Object obj = chat;
                    if (obj != null) {
                        Context context = getContext();
                        u6Var = ((org.telegram.ui.ActionBar.k3) n9Var).resourcesProvider;
                        x30 x30Var2 = new x30(context, obj, null, true, u6Var);
                        x30Var2.setOnClickListener(this);
                        arrayList3.add(x30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        j9 j9Var = z8Var.d;
        ArrayList arrayList5 = j9Var.e;
        ArrayList arrayList6 = j9Var.d;
        ArrayList arrayList7 = j9Var.f11068f;
        k9 k9Var = (k9) j9Var.f11069n;
        k9Var.H = true;
        ArrayList arrayList8 = k9Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = j9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((x30) arrayList2.get(i14)).setOnClickListener(null);
        }
        j9Var.c();
        if (z10) {
            j9Var.f11067c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            j9Var.f11066b = animatorSet;
            animatorSet.addListener(new i9(j9Var, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i15 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i15 >= size) {
                    break;
                }
                x30 x30Var3 = (x30) arrayList2.get(i15);
                arrayList5.add(x30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                x30 x30Var4 = (x30) arrayList3.get(i16);
                arrayList6.add(x30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(x30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                j9Var.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            j9Var.f11066b = null;
            j9Var.f11067c = false;
            k9Var.f11124b.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            j9Var.addView((View) arrayList3.get(i18));
        }
        j9Var.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        z8 z8Var = this.f10928x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = z8Var.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new e4(this, 5));
                this.P.addListener(new bh.b(this, 24));
                this.P.setInterpolator(new LinearInterpolator());
                this.P.setDuration(180L);
                this.P.start();
            }
        } else {
            this.N = false;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            z8Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        t8 t8Var = this.E;
        if (!z12) {
            t8Var.setVisibility(8);
            return;
        }
        t8Var.setVisibility(0);
        float f10 = -t8Var.getHeight();
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.f10923f;
            if (i10 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f10 = this.e.getPaddingTop() + childAt.getY();
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.Q != z11) {
            this.Q = z11;
            org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) t8Var.e;
            if (z11 || this.f10920a != 0) {
                f7 = 0.0f;
            }
            j2Var.c(f7, true);
        }
        t8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        z8 z8Var = this.f10928x;
        if (!z8Var.e.contains(view)) {
            return;
        }
        x30 x30Var = (x30) view;
        if (x30Var.f34609y) {
            z8Var.f11126f = null;
            j9 j9Var = z8Var.d;
            k9 k9Var = (k9) j9Var.f11069n;
            k9Var.H = true;
            k9Var.e.remove(x30Var);
            x30Var.setOnClickListener(null);
            j9Var.c();
            j9Var.f11067c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            j9Var.f11066b = animatorSet;
            animatorSet.addListener(new ce(6, j9Var, x30Var));
            ArrayList arrayList = j9Var.h;
            arrayList.clear();
            arrayList.add(x30Var);
            ArrayList arrayList2 = j9Var.d;
            arrayList2.clear();
            j9Var.e.clear();
            arrayList2.add(x30Var);
            ArrayList arrayList3 = j9Var.f11068f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, View.ALPHA, 1.0f, 0.0f));
            j9Var.requestLayout();
            long uid = x30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f10922c;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                } else {
                    arrayList4.remove(Long.valueOf(uid));
                    f(true);
                    e(true);
                    return;
                }
            }
        } else {
            x30 x30Var2 = z8Var.f11126f;
            if (x30Var2 != null) {
                x30Var2.a();
                z8Var.f11126f = null;
            }
            z8Var.f11126f = x30Var;
            x30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.k3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        float f7;
        boolean z16;
        int i15;
        n9 n9Var = this.W;
        i12 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f10920a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
        mm0 mm0Var = this.f10923f;
        e9 e9Var = this.f10925r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f10928x.K) > mm0Var.getPaddingTop()) {
                mi.n nVar = new mi.n(getContext(), 2, 0.7f);
                nVar.f47680a = 1;
                nVar.f18556p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i17 = this.f10920a;
            View view = this.f10926s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                e9Var.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = e9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                e9Var.d = ofFloat;
                ofFloat.addUpdateListener(new d9(e9Var, 1));
                e9Var.d.addListener(new bh.b(e9Var, 25));
                e9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = e9Var.d;
                ds dsVar = org.telegram.ui.ActionBar.q1.f22963w;
                valueAnimator2.setInterpolator(dsVar);
                e9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(dsVar).withEndAction(new w8(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
            this.V = z14;
        }
        mm0Var.setPadding(0, 0, 0, e9Var.getMeasuredHeight());
    }
}
