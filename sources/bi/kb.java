package bi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;
public final class kb extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final oa E;
    public boolean F;
    public org.telegram.ui.ActionBar.d2 G;
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
    public final rb W;
    public int f3006a;
    public final a0.i f3007b;
    public final ArrayList f3008c;
    public final HashMap d;
    public final FrameLayout e;
    public final vl0 f3009f;
    public final s4.c0 h;
    public final gb f3010n;
    public final ib f3011r;
    public final View f3012s;
    public final d v;
    public final d f3013w;
    public final db f3014x;
    public final org.telegram.ui.Cells.u3 f3015y;

    public kb(rb rbVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        org.telegram.ui.ActionBar.f6 f6Var8;
        org.telegram.ui.ActionBar.f6 f6Var9;
        this.W = rbVar;
        this.f3007b = new a0.i();
        this.f3008c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, f6Var);
        this.f3015y = u3Var;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        db dbVar = new db(this, context, f6Var2, new sa(this, 4));
        this.f3014x = dbVar;
        int i12 = org.telegram.ui.ActionBar.j6.f17998h5;
        dbVar.setBackgroundColor(rbVar.getThemedColor(i12));
        dbVar.setOnSearchTextChange(new ta(this, 3));
        f6Var3 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        oa oaVar = new oa(context, f6Var3);
        this.E = oaVar;
        oaVar.h = new sa(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        f6Var4 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        vl0 vl0Var = new vl0(context, f6Var4);
        this.f3009f = vl0Var;
        vl0Var.setClipToPadding(false);
        vl0Var.setTranslateSelector(true);
        f6Var5 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        gb gbVar = new gb(this, context, f6Var5, dbVar, new ra(rbVar, 1));
        this.f3010n = gbVar;
        vl0Var.setAdapter(gbVar);
        gbVar.h = vl0Var;
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setOnScrollListener(new eb(this, 0));
        vl0Var.setOnItemClickListener(new cb(0, this, context));
        frameLayout.addView(vl0Var, w7.a6.c(-1.0f, -1));
        fb fbVar = new fb(this);
        fbVar.n(350L);
        fbVar.o(wr.h);
        fbVar.C = false;
        fbVar.f41645m = false;
        vl0Var.setItemAnimator(fbVar);
        frameLayout.addView(dbVar, w7.a6.e(-1, -2, 55));
        frameLayout.addView(u3Var, w7.a6.e(-1, 32, 55));
        addView(oaVar, w7.a6.e(-1, -2, 55));
        ib ibVar = new ib(this, context);
        this.f3011r = ibVar;
        ibVar.setClickable(true);
        ibVar.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) rbVar).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.h3) rbVar).backgroundPaddingLeft;
        ibVar.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        f6Var6 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        ibVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var6));
        f6Var7 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        d dVar = new d(context, f6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new qa(this, 0));
        dVar.e();
        ibVar.addView(dVar, w7.a6.q(-1, 48, 87));
        f6Var8 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        d dVar2 = new d(context, f6Var8, false);
        this.f3013w = dVar2;
        dVar2.setOnClickListener(new qa(this, 1));
        dVar2.e();
        ibVar.addView(dVar2, w7.a6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f3012s = view;
        f6Var9 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var9));
        addView(view, w7.a6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(ibVar, w7.a6.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f3006a == 6) {
            ArrayList arrayList = this.f3008c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.i iVar = this.f3007b;
                if (i11 >= iVar.m()) {
                    break;
                }
                long j3 = iVar.j(i11);
                if (((Boolean) iVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j3));
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
        this.f3006a = i10;
        this.f3007b.b();
        ArrayList arrayList = this.f3008c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        rb rbVar = this.W;
        if (i10 == 4) {
            arrayList.addAll(rbVar.d);
            hashMap.putAll(rbVar.e);
        } else if (i10 == 5) {
            arrayList.addAll(rbVar.J);
        } else if (i10 == 1) {
            ArrayList J0 = rb.J0(rbVar);
            for (int i12 = 0; i12 < J0.size(); i12 = com.google.android.gms.internal.vision.e2.f(((TLRPC.User) J0.get(i12)).f17342id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(rbVar.h);
        } else if (i10 == 3) {
            arrayList.addAll(rbVar.f3620n);
            hashMap.putAll(rbVar.f3621r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f3010n.getClass();
        this.h.k1(false);
        i(false);
        db dbVar = this.f3014x;
        dbVar.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        dbVar.setVisibility(i11);
        dbVar.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f3006a;
        vl0 vl0Var = this.f3009f;
        if (i13 != 0) {
            vl0Var.u0(0);
        }
        vl0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -hc.b.g(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f3014x.J), 0);
        while (true) {
            vl0 vl0Var = this.f3009f;
            if (i10 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f7, childAt.getY());
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public final void d(long j3, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f3006a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        rb rbVar = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j10 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f17342id != 777000 && j10 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j10));
                    } else {
                        arrayList.add(Long.valueOf(j10));
                    }
                    this.f3008c.remove(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var2);
                alertDialog$Builder.f17528a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, f6Var);
            alertDialog$Builder2.f17528a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new bb(this, j3, arrayList, 0));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j3), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f3007b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f3014x.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (d2Var = this.G) != null && this.H == chatFull.f17196id) {
            d2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f17196id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f3006a;
        rb rbVar = this.W;
        d dVar = this.f3013w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (rbVar.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (rbVar.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = rbVar.I;
                if (i14 == 1) {
                    if (rbVar.K) {
                        i11 = R.string.StoryLivePrivacyButtonPost;
                    } else {
                        i11 = R.string.StoryPrivacyButtonPost;
                    }
                    dVar2.g(LocaleController.getString(i11), z10, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i14), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f3008c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        ib ibVar = this.f3011r;
        if (i12 == 3) {
            int size = rb.l1(arrayList, this.d).size();
            rbVar.f3622s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ibVar.b(z11, z10);
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
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
                dVar2.b(0, z10);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z10, true);
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
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
            zh.i5 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.i iVar = this.f3007b;
                    if (i13 >= iVar.m()) {
                        break;
                    }
                    long j3 = iVar.j(i13);
                    ((Boolean) iVar.n(i13)).getClass();
                    storiesController.L.contains(Long.valueOf(j3));
                    i13++;
                }
            } else {
                dVar2.b(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i12 == 4) {
            int size2 = rb.l1(rbVar.d, rbVar.e).size();
            rbVar.f3619f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            ibVar.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        rb rbVar = this.W;
        ArrayList arrayList2 = rbVar.J;
        HashMap hashMap = rbVar.f3621r;
        ArrayList arrayList3 = rbVar.f3620n;
        ArrayList arrayList4 = rbVar.h;
        HashMap hashMap2 = rbVar.e;
        ArrayList arrayList5 = rbVar.d;
        int i10 = this.f3006a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f3008c;
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
        if (this.f3006a == 3 && (rbVar.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    rbVar.N = i11;
                }
            } else {
                this.R = rbVar.N;
                rbVar.N = 3;
            }
        }
        HashSet l1 = rb.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            pa paVar = (pa) arrayList.get(i12);
            if (paVar != null) {
                int i13 = paVar.f3406i;
                if (i13 > 0) {
                    if (rbVar.N != i13) {
                        z12 = false;
                    }
                    paVar.f3408k = z12;
                    paVar.f3409l = false;
                } else {
                    TLRPC.User user = paVar.f3405g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f17342id));
                        paVar.f3408k = contains;
                        paVar.f3409l = (contains || !l1.contains(Long.valueOf(paVar.f3405g.f17342id))) ? false : false;
                    } else {
                        TLRPC.Chat chat = paVar.h;
                        if (chat != null) {
                            paVar.f3408k = hashMap3.containsKey(Long.valueOf(chat.f17195id));
                            paVar.f3409l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            vl0 vl0Var = this.f3009f;
            if (i14 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i14);
                if ((childAt instanceof qb) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    pa paVar2 = (pa) arrayList.get(R);
                    qb qbVar = (qb) childAt;
                    if (!paVar2.f3408k && !paVar2.f3409l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    qbVar.c(z11, z10);
                    TLRPC.Chat chat2 = paVar2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (rb.d1(rbVar, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        qbVar.b(f7, z10);
                    } else {
                        if (paVar2.f3409l && !paVar2.f3408k) {
                            f7 = 0.5f;
                        }
                        qbVar.b(f7, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: bi.kb.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.u3 u3Var = this.f3015y;
        if (u3Var == null) {
            return;
        }
        if (rb.l1(this.f3008c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new qa(this, 2));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.t3 t3Var = u3Var.f20476b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        db dbVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.f6 f6Var;
        HashSet l1 = rb.l1(this.f3008c, this.d);
        int i11 = this.f3006a;
        rb rbVar = this.W;
        if (i11 == 3) {
            rbVar.f3622s = l1.size();
        } else if (i11 == 4) {
            rbVar.f3619f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            dbVar = this.f3014x;
            ArrayList arrayList4 = dbVar.d;
            arrayList = dbVar.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            w30 w30Var = (w30) arrayList.get(i12);
            if (!l1.contains(Long.valueOf(w30Var.getUid()))) {
                arrayList2.add(w30Var);
            }
            i12++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((w30) arrayList.get(i13)).getUid() == longValue) {
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
                        f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                        w30 w30Var2 = new w30(context, obj, null, true, f6Var);
                        w30Var2.setOnClickListener(this);
                        arrayList3.add(w30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        nb nbVar = dbVar.f3336c;
        ArrayList arrayList5 = nbVar.e;
        ArrayList arrayList6 = nbVar.d;
        ArrayList arrayList7 = nbVar.f3250f;
        ob obVar = (ob) nbVar.f3251n;
        obVar.G = true;
        ArrayList arrayList8 = obVar.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nbVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((w30) arrayList2.get(i14)).setOnClickListener(null);
        }
        nbVar.c();
        if (z10) {
            nbVar.f3249c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nbVar.f3248b = animatorSet;
            animatorSet.addListener(new mb(nbVar, arrayList2, 0));
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
                w30 w30Var3 = (w30) arrayList2.get(i15);
                arrayList5.add(w30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                w30 w30Var4 = (w30) arrayList3.get(i16);
                arrayList6.add(w30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(w30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                nbVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            nbVar.f3248b = null;
            nbVar.f3249c = false;
            obVar.f3334a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            nbVar.addView((View) arrayList3.get(i18));
        }
        nbVar.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        db dbVar = this.f3014x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = dbVar.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new ai.a(this, 11));
                this.P.addListener(new h(this, 7));
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
            dbVar.setTranslationY(c10);
        }
        boolean z12 = this.F;
        oa oaVar = this.E;
        if (!z12) {
            oaVar.setVisibility(8);
            return;
        }
        oaVar.setVisibility(0);
        float f10 = -oaVar.getHeight();
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.f3009f;
            if (i10 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i10);
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
            ((org.telegram.ui.ActionBar.i2) oaVar.e).c((z11 || this.f3006a != 0) ? 0.0f : 0.0f, true);
        }
        oaVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        db dbVar = this.f3014x;
        if (!dbVar.d.contains(view)) {
            return;
        }
        w30 w30Var = (w30) view;
        if (w30Var.f28653y) {
            dbVar.e = null;
            nb nbVar = dbVar.f3336c;
            ob obVar = (ob) nbVar.f3251n;
            obVar.G = true;
            obVar.d.remove(w30Var);
            w30Var.setOnClickListener(null);
            nbVar.c();
            nbVar.f3249c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nbVar.f3248b = animatorSet;
            animatorSet.addListener(new u3(3, nbVar, w30Var));
            ArrayList arrayList = nbVar.h;
            arrayList.clear();
            arrayList.add(w30Var);
            ArrayList arrayList2 = nbVar.d;
            arrayList2.clear();
            nbVar.e.clear();
            arrayList2.add(w30Var);
            ArrayList arrayList3 = nbVar.f3250f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, View.ALPHA, 1.0f, 0.0f));
            nbVar.requestLayout();
            long uid = w30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f3008c;
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
            w30 w30Var2 = dbVar.e;
            if (w30Var2 != null) {
                w30Var2.a();
                dbVar.e = null;
            }
            dbVar.e = w30Var;
            w30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.W).currentAccount;
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
        rb rbVar = this.W;
        i12 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f3006a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
        vl0 vl0Var = this.f3009f;
        ib ibVar = this.f3011r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f3014x.J) > vl0Var.getPaddingTop()) {
                ii.o oVar = new ii.o(getContext(), 2, 0.7f);
                oVar.f41760a = 1;
                oVar.f10694p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i17 = this.f3006a;
            View view = this.f3012s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                ibVar.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = ibVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ibVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                ibVar.d = ofFloat;
                ofFloat.addUpdateListener(new hb(ibVar, 1));
                ibVar.d.addListener(new h(ibVar, 8));
                ibVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = ibVar.d;
                wr wrVar = org.telegram.ui.ActionBar.r1.f18592w;
                valueAnimator2.setInterpolator(wrVar);
                ibVar.d.start();
                z13 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(wrVar).withEndAction(new sa(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
            this.V = z14;
        }
        vl0Var.setPadding(0, 0, 0, ibVar.getMeasuredHeight());
    }
}
