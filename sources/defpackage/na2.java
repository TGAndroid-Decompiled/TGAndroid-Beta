package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class na2 extends e implements fn7 {
    public ja2 E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public ka2 a;
    public d79 b;
    public sla c;
    public b34 d;
    public ma2 e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public id r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public final void Y(id[] idVarArr) {
        try {
            idVarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        idVarArr[0] = null;
        this.h.linked_chat_id = 0L;
        jn7 f = jn7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(jn7.T, this.h, 0, bool, bool);
        hl.d3(new aa2(this, (byte) 2), 1000L);
        if (!this.s) {
            finishFragment();
        }
    }

    public final void Z(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void a0(id[] idVarArr, TLRPC.Chat chat, xc5 xc5Var) {
        id idVar = idVarArr[0];
        if (idVar != null) {
            try {
                idVar.dismiss();
            } catch (Throwable unused) {
            }
            idVarArr[0] = null;
        }
        this.h.linked_chat_id = chat.id;
        jn7 f = jn7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(jn7.T, this.h, 0, bool, bool);
        hl.d3(new aa2(this, (byte) 1), 1000L);
        if (xc5Var != null) {
            removeSelfFromStack();
            xc5Var.finishFragment();
            return;
        }
        finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void c0(TLRPC.Chat chat, xc5 xc5Var) {
        if (chat == null) {
            return;
        }
        if (!xc2.T(chat)) {
            getMessagesController().R(getParentActivity(), chat.id, this, new q72(this, xc5Var, (byte) 3), null);
            return;
        }
        id idVar = null;
        if (xc5Var == null) {
            idVar = new id(3, null, getParentActivity());
        }
        id[] idVarArr = {idVar};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = uc7.i1(this.f);
        tL_channels_setDiscussionGroup.group = uc7.i1(chat);
        hl.d3(new ba2(this, idVarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new au0(this, idVarArr, chat, xc5Var, (byte) 3), 64), (byte) 1), 500L);
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131751354, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 26));
        sla a = this.simpleActionBar.v().a(0, 2131232502);
        a.N();
        a.C0 = new r10(this, (byte) 4);
        this.c = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.e = new ma2(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.d = b34Var;
        b34Var.b();
        this.d.setText(ob6.M0(2131747898, null));
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new x46(1, false));
        d79 d79Var2 = this.b;
        ka2 ka2Var = new ka2(this, context);
        this.a = ka2Var;
        d79Var2.setAdapter(ka2Var);
        d79 d79Var3 = this.b;
        if (!ob6.a0) {
            i = 2;
        }
        d79Var3.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new u(this, (byte) 10));
        f0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.w.add(M0);
            }
            sla slaVar = this.c;
            if (slaVar != null) {
                slaVar.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new ye(this, (byte) 13));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ja2 ja2Var;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.F) {
                this.h = chatFull;
                d0();
                f0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 != null && chat2.id == j) {
                try {
                    this.r.dismiss();
                } catch (Throwable unused) {
                }
                this.r = null;
                e0(this.n, false);
                this.n = null;
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = uc7.r5;
            if ((intValue & 8192) != 0 && this.f != null) {
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f.id));
                if (M02 != null) {
                    this.f = M02;
                }
                if (this.w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
                    this.w.set(0, M0);
                }
                if (this.s) {
                    if (this.w.size() > 0) {
                        chat = (TLRPC.Chat) this.w.get(0);
                    }
                } else {
                    chat = this.f;
                }
                if (chat != null && (ja2Var = this.E) != null) {
                    if (!this.Q) {
                        ja2Var.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i == jn7.y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var != null && wk5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0(TLRPC.Chat chat, boolean z) {
        int i;
        String a0;
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.id);
        int i6 = 3;
        if (N0 == null) {
            if (z) {
                getMessagesController().e3(0, chat.id, true);
                this.n = chat;
                this.r = new id(3, null, getParentActivity());
                hl.d3(new aa2(this, (byte) 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 16.0f);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (!xc2.t0(chat)) {
            a0 = ob6.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751341, chat.title, this.f.title);
        } else {
            boolean t0 = xc2.t0(this.f);
            String str = chat.title;
            TLRPC.Chat chat2 = this.f;
            if (!t0) {
                a0 = ob6.a0("DiscussionLinkGroupPrivateAlert", null, 2131751343, str, chat2.title);
            } else {
                a0 = ob6.a0("DiscussionLinkGroupPublicAlert", null, 2131751342, str, chat2.title);
            }
        }
        if (N0.hidden_prehistory) {
            StringBuilder l = c00.l(a0, "\n\n");
            l.append(ob6.M0(2131751344, null));
            a0 = l.toString();
        }
        textView.setText(hl.S2(a0));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.s(hl.L(12.0f));
        de0 de0Var = new de0(getParentActivity());
        de0Var.setRoundRadius(hl.L(20.0f));
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(de0Var, tre.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        qd4.w(textView2, aob.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = ob6.a0;
        if (z2) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i7 = i4 | 48;
        int i8 = 76;
        if (z2) {
            i5 = 21;
        } else {
            i5 = 76;
        }
        float f = i5;
        if (!z2) {
            i8 = 21;
        }
        frameLayout.addView(textView2, tre.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
        if (ob6.a0) {
            i6 = 5;
        }
        frameLayout.addView(textView, tre.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        rb0Var.p(chat);
        de0Var.f(chat, rb0Var);
        alertDialog$Builder.j(ob6.M0(2131751345, null), new ie(this, N0, chat, (byte) 28));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na2.f0():void");
    }

    public final void g0() {
        int attachedScrapChildCount;
        View P;
        try {
            if (this.b != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                if (!this.R || w0 != this.S || w02 != this.T) {
                    this.R = true;
                    this.S = w0;
                    this.T = w02;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.b.getChildCount();
                        } else {
                            d79 d79Var = this.b;
                            if (i == 1) {
                                attachedScrapChildCount = d79Var.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = d79Var.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = d79Var.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                P = this.b.getChildAt(i2);
                            } else {
                                d79 d79Var2 = this.b;
                                if (i == 1) {
                                    P = d79Var2.X(i2);
                                } else if (i == 2) {
                                    P = d79Var2.Q(i2);
                                } else {
                                    P = d79Var2.P(i2);
                                }
                            }
                            if (P instanceof lj6) {
                                lj6 lj6Var = (lj6) P;
                                lj6Var.P = true;
                                lj6Var.I = w0;
                                lj6Var.J = w02;
                                if (i != 0) {
                                    ((lj6) P).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 0);
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, aob.y6));
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.T);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.y1);
        d0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ka2 ka2Var = this.a;
        if (ka2Var != null) {
            ka2Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
