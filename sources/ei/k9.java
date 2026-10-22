package ei;

import ai.me;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.v30;
public final class k9 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final x8 E;
    public boolean F;
    public org.telegram.ui.ActionBar.b2 G;
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
    public final r9 W;
    public int f9325a;
    public final a0.h f9326b;
    public final ArrayList f9327c;
    public final HashMap d;
    public final FrameLayout e;
    public final jm0 f9328f;
    public final s4.b0 h;
    public final g9 f9329n;
    public final i9 f9330r;
    public final View f9331s;
    public final d v;
    public final d f9332w;
    public final d9 f9333x;
    public final org.telegram.ui.Cells.u3 f9334y;

    public k9(r9 r9Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var6;
        org.telegram.ui.ActionBar.d6 d6Var7;
        org.telegram.ui.ActionBar.d6 d6Var8;
        org.telegram.ui.ActionBar.d6 d6Var9;
        this.W = r9Var;
        this.f9326b = new a0.h();
        this.f9327c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, d6Var);
        this.f9334y = u3Var;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d9 d9Var = new d9(this, context, d6Var2, new a9(this, 4));
        this.f9333x = d9Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21064h5;
        d9Var.setBackgroundColor(r9Var.getThemedColor(i12));
        d9Var.setOnSearchTextChange(new b9(this, 3));
        d6Var3 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        x8 x8Var = new x8(context, d6Var3);
        this.E = x8Var;
        x8Var.h = new a9(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var4 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        jm0 jm0Var = new jm0(context, d6Var4);
        this.f9328f = jm0Var;
        jm0Var.setClipToPadding(false);
        jm0Var.setTranslateSelector(true);
        d6Var5 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        g9 g9Var = new g9(this, context, d6Var5, d9Var, new ci.e4(r9Var, 2));
        this.f9329n = g9Var;
        jm0Var.setAdapter(g9Var);
        g9Var.h = jm0Var;
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        jm0Var.setLayoutManager(b0Var);
        jm0Var.setOnScrollListener(new e9(this, 0));
        jm0Var.setOnItemClickListener(new ah.h0(12, this, context));
        frameLayout.addView(jm0Var, w7.z5.c(-1.0f, -1));
        f9 f9Var = new f9(this);
        f9Var.n(350L);
        f9Var.o(bs.h);
        f9Var.C = false;
        f9Var.f45954m = false;
        jm0Var.setItemAnimator(f9Var);
        frameLayout.addView(d9Var, w7.z5.e(-1, -2, 55));
        frameLayout.addView(u3Var, w7.z5.e(-1, 32, 55));
        addView(x8Var, w7.z5.e(-1, -2, 55));
        i9 i9Var = new i9(this, context);
        this.f9330r = i9Var;
        i9Var.setClickable(true);
        i9Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
        i9Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        d6Var6 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        i9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var6));
        d6Var7 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d dVar = new d(context, d6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new z8(this, 0));
        dVar.e();
        i9Var.addView(dVar, w7.z5.q(-1, 48, 87));
        d6Var8 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        d dVar2 = new d(context, d6Var8, false);
        this.f9332w = dVar2;
        dVar2.setOnClickListener(new z8(this, 1));
        dVar2.e();
        i9Var.addView(dVar2, w7.z5.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f9331s = view;
        d6Var9 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var9));
        addView(view, w7.z5.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(i9Var, w7.z5.e(-1, -2, 87));
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f9325a == 6) {
            ArrayList arrayList = this.f9327c;
            arrayList.clear();
            i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
            arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f9326b;
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
        this.f9325a = i10;
        this.f9326b.b();
        ArrayList arrayList = this.f9327c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        r9 r9Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(r9Var.d);
            hashMap.putAll(r9Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(r9Var.J);
        } else if (i10 == 1) {
            ArrayList K0 = r9.K0(r9Var);
            for (int i12 = 0; i12 < K0.size(); i12 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) K0.get(i12)).f20426id, arrayList, i12, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(r9Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(r9Var.f9749n);
            hashMap.putAll(r9Var.f9750r);
        } else if (i10 == 6) {
            a(false);
        }
        this.f9329n.getClass();
        this.h.k1(false);
        i(false);
        d9 d9Var = this.f9333x;
        d9Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        d9Var.setVisibility(i11);
        d9Var.K = true;
        this.I = null;
        g(false);
        e(false);
        f(false);
        int i13 = this.f9325a;
        jm0 jm0Var = this.f9328f;
        if (i13 != 0) {
            jm0Var.u0(0);
        }
        jm0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -org.telegram.messenger.g0.b(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.f9333x.J), 0);
        while (true) {
            jm0 jm0Var = this.f9328f;
            if (i10 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i10);
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f9325a;
        int i12 = 0;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        r9 r9Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.f20426id != 777000 && j11 != 0) {
                    if (z10 && !user.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f9327c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var2);
                alertDialog$Builder.f20608a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.o();
                return;
            }
            Context context2 = getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, d6Var);
            alertDialog$Builder2.f20608a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new ai.f(this, j10, arrayList, 2));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.o();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            this.f9326b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        i(true);
        e(true);
        f(true);
        this.f9333x.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.b2 b2Var;
        if (i10 == NotificationCenter.chatInfoDidLoad && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (b2Var = this.G) != null && this.H == chatFull.f20280id) {
            b2Var.c(350L);
            this.G = null;
            this.H = -1L;
            d(chatFull.f20280id, chatFull.participants);
        }
    }

    public final void e(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12 = this.f9325a;
        r9 r9Var = this.W;
        d dVar = this.f9332w;
        int i13 = 0;
        boolean z12 = false;
        d dVar2 = this.v;
        if (i12 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.b(0, z10);
            if (r9Var.L) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else if (r9Var.Z) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            } else {
                int i14 = r9Var.I;
                if (i14 == 1) {
                    if (r9Var.K) {
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
        ArrayList arrayList = this.f9327c;
        if (i12 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z10, true);
            dVar2.b(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        i9 i9Var = this.f9330r;
        if (i12 == 3) {
            int size = r9.m1(arrayList, this.d).size();
            r9Var.f9751s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i9Var.b(z11, z10);
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
            i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
            ci.i7 storiesController = MessagesController.getInstance(i10).getStoriesController();
            if (!storiesController.O) {
                while (true) {
                    a0.h hVar = this.f9326b;
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
            int size2 = r9.m1(r9Var.d, r9Var.e).size();
            r9Var.f9748f = size2;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z10, true);
            dVar2.setShowZero(false);
            i9Var.b(false, z10);
            dVar2.b(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void f(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        r9 r9Var = this.W;
        ArrayList arrayList2 = r9Var.J;
        HashMap hashMap = r9Var.f9750r;
        ArrayList arrayList3 = r9Var.f9749n;
        ArrayList arrayList4 = r9Var.h;
        HashMap hashMap2 = r9Var.e;
        ArrayList arrayList5 = r9Var.d;
        int i10 = this.f9325a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f9327c;
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
        if (this.f9325a == 3 && (r9Var.N != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    r9Var.N = i11;
                }
            } else {
                this.R = r9Var.N;
                r9Var.N = 3;
            }
        }
        HashSet m12 = r9.m1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            y8 y8Var = (y8) arrayList.get(i12);
            if (y8Var != null) {
                int i13 = y8Var.f10138i;
                if (i13 > 0) {
                    if (r9Var.N != i13) {
                        z12 = false;
                    }
                    y8Var.f10140k = z12;
                    y8Var.f10141l = false;
                } else {
                    TLRPC.User user = y8Var.f10137g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f20426id));
                        y8Var.f10140k = contains;
                        if (contains || !m12.contains(Long.valueOf(y8Var.f10137g.f20426id))) {
                            z12 = false;
                        }
                        y8Var.f10141l = z12;
                    } else {
                        TLRPC.Chat chat = y8Var.h;
                        if (chat != null) {
                            y8Var.f10140k = hashMap3.containsKey(Long.valueOf(chat.f20279id));
                            y8Var.f10141l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            jm0 jm0Var = this.f9328f;
            if (i14 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i14);
                if ((childAt instanceof q9) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    y8 y8Var2 = (y8) arrayList.get(R);
                    q9 q9Var = (q9) childAt;
                    if (!y8Var2.f10140k && !y8Var2.f10141l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    q9Var.c(z11, z10);
                    TLRPC.Chat chat2 = y8Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (r9.e1(r9Var, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        q9Var.b(f7, z10);
                    } else {
                        if (y8Var2.f10141l && !y8Var2.f10140k) {
                            f7 = 0.5f;
                        }
                        q9Var.b(f7, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: ei.k9.g(boolean):void");
    }

    public final void h(boolean z10) {
        org.telegram.ui.Cells.u3 u3Var = this.f9334y;
        if (u3Var == null) {
            return;
        }
        if (r9.m1(this.f9327c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new z8(this, 2));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.t3 t3Var = u3Var.f23594b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
    }

    public final void i(boolean z10) {
        int i10;
        d9 d9Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        org.telegram.ui.ActionBar.d6 d6Var;
        HashSet m12 = r9.m1(this.f9327c, this.d);
        int i11 = this.f9325a;
        r9 r9Var = this.W;
        if (i11 == 3) {
            r9Var.f9751s = m12.size();
        } else if (i11 == 4) {
            r9Var.f9748f = m12.size();
        }
        i10 = ((org.telegram.ui.ActionBar.f3) r9Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        while (true) {
            d9Var = this.f9333x;
            ArrayList arrayList4 = d9Var.d;
            arrayList = d9Var.d;
            if (i12 >= arrayList4.size()) {
                break;
            }
            v30 v30Var = (v30) arrayList.get(i12);
            if (!m12.contains(Long.valueOf(v30Var.getUid()))) {
                arrayList2.add(v30Var);
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
                    if (((v30) arrayList.get(i13)).getUid() == longValue) {
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
                        d6Var = ((org.telegram.ui.ActionBar.f3) r9Var).resourcesProvider;
                        v30 v30Var2 = new v30(context, obj, null, true, d6Var);
                        v30Var2.setOnClickListener(this);
                        arrayList3.add(v30Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        n9 n9Var = d9Var.f9560c;
        ArrayList arrayList5 = n9Var.e;
        ArrayList arrayList6 = n9Var.d;
        ArrayList arrayList7 = n9Var.f9526f;
        o9 o9Var = (o9) n9Var.f9527n;
        o9Var.G = true;
        ArrayList arrayList8 = o9Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = n9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((v30) arrayList2.get(i14)).setOnClickListener(null);
        }
        n9Var.c();
        if (z10) {
            n9Var.f9525c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            n9Var.f9524b = animatorSet;
            animatorSet.addListener(new m9(n9Var, arrayList2, 0));
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
                v30 v30Var3 = (v30) arrayList2.get(i15);
                arrayList5.add(v30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var3, property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                v30 v30Var4 = (v30) arrayList3.get(i16);
                arrayList6.add(v30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(v30Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                n9Var.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            n9Var.f9524b = null;
            n9Var.f9525c = false;
            o9Var.f9558a.setAllowDrawCursor(true);
        }
        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
            n9Var.addView((View) arrayList3.get(i18));
        }
        n9Var.requestLayout();
    }

    public final void j() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        d9 d9Var = this.f9333x;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = d9Var.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new i6(this, 3));
                this.P.addListener(new ah.b(this, 23));
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
            d9Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        x8 x8Var = this.E;
        if (!z12) {
            x8Var.setVisibility(8);
            return;
        }
        x8Var.setVisibility(0);
        float f10 = -x8Var.getHeight();
        int i10 = 0;
        while (true) {
            jm0 jm0Var = this.f9328f;
            if (i10 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i10);
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
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) x8Var.e;
            if (z11 || this.f9325a != 0) {
                f7 = 0.0f;
            }
            g2Var.c(f7, true);
        }
        x8Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onClick(View view) {
        d9 d9Var = this.f9333x;
        if (!d9Var.d.contains(view)) {
            return;
        }
        v30 v30Var = (v30) view;
        if (v30Var.f31139y) {
            d9Var.e = null;
            n9 n9Var = d9Var.f9560c;
            o9 o9Var = (o9) n9Var.f9527n;
            o9Var.G = true;
            o9Var.d.remove(v30Var);
            v30Var.setOnClickListener(null);
            n9Var.c();
            n9Var.f9525c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            n9Var.f9524b = animatorSet;
            animatorSet.addListener(new me(6, n9Var, v30Var));
            ArrayList arrayList = n9Var.h;
            arrayList.clear();
            arrayList.add(v30Var);
            ArrayList arrayList2 = n9Var.d;
            arrayList2.clear();
            n9Var.e.clear();
            arrayList2.add(v30Var);
            ArrayList arrayList3 = n9Var.f9526f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(v30Var, View.ALPHA, 1.0f, 0.0f));
            n9Var.requestLayout();
            long uid = v30Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f9327c;
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
            v30 v30Var2 = d9Var.e;
            if (v30Var2 != null) {
                v30Var2.a();
                d9Var.e = null;
            }
            d9Var.e = v30Var;
            v30Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.W).currentAccount;
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
        r9 r9Var = this.W;
        i12 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardHeight;
        if (i12 > 0) {
            i15 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardHeight;
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = AndroidUtilities.statusBarHeight;
        if (this.f9325a == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(56.0f);
        }
        this.e.setPadding(0, i16 + dp, 0, 0);
        boolean z17 = this.V;
        z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
        jm0 jm0Var = this.f9328f;
        i9 i9Var = this.f9330r;
        if (z17 != z10) {
            float c10 = c();
            z11 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
            if (z11 && c10 + Math.min(AndroidUtilities.dp(150.0f), this.f9333x.J) > jm0Var.getPaddingTop()) {
                li.n nVar = new li.n(getContext(), 2, 0.7f);
                nVar.f46061a = 1;
                nVar.f16144p = -AndroidUtilities.dp(56.0f);
                this.h.w0(nVar);
            }
            int i17 = this.f9325a;
            View view = this.f9331s;
            float f10 = 0.0f;
            if (i17 == 0) {
                z15 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                if (z15) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                i9Var.setTranslationY(f7);
                z16 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                if (z16) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                z12 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                if (z12) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                float f11 = i13;
                ValueAnimator valueAnimator = i9Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i9Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                i9Var.d = ofFloat;
                ofFloat.addUpdateListener(new h9(i9Var, 1));
                i9Var.d.addListener(new ah.b(i9Var, 24));
                i9Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = i9Var.d;
                bs bsVar = org.telegram.ui.ActionBar.o1.f21635w;
                valueAnimator2.setInterpolator(bsVar);
                i9Var.d.start();
                z13 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                if (z13) {
                    i14 = this.T;
                } else {
                    i14 = -this.T;
                }
                view.setTranslationY(i14);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(bsVar).withEndAction(new a9(this, 2)).start();
            }
            z14 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
            this.V = z14;
        }
        jm0Var.setPadding(0, 0, 0, i9Var.getMeasuredHeight());
    }
}
