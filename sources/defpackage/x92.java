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
import org.telegram.ui.ActionBar.d;
public final class x92 extends d implements gk7 {
    public t92 E;
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
    public u92 a;
    public o39 b;
    public xha c;
    public g24 d;
    public w92 e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public hd r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public final void Y(hd[] hdVarArr) {
        try {
            hdVarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        hdVarArr[0] = null;
        this.h.linked_chat_id = 0L;
        kk7 f = kk7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(kk7.S, this.h, 0, bool, bool);
        gl.e3(new k92(this, (byte) 2), 1000L);
        if (!this.s) {
            finishFragment();
        }
    }

    public final void Z(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void a0(hd[] hdVarArr, TLRPC.Chat chat, wa5 wa5Var) {
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            try {
                hdVar.dismiss();
            } catch (Throwable unused) {
            }
            hdVarArr[0] = null;
        }
        this.h.linked_chat_id = chat.id;
        kk7 f = kk7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(kk7.S, this.h, 0, bool, bool);
        gl.e3(new k92(this, (byte) 1), 1000L);
        if (wa5Var != null) {
            removeSelfFromStack();
            wa5Var.finishFragment();
            return;
        }
        finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.u6));
        hashSet.add(Integer.valueOf(bkb.t6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void c0(TLRPC.Chat chat, wa5 wa5Var) {
        if (chat == null) {
            return;
        }
        if (!hc2.T(chat)) {
            getMessagesController().P(getParentActivity(), chat.id, this, new v82(this, wa5Var, (byte) 1), null);
            return;
        }
        hd hdVar = null;
        if (wa5Var == null) {
            hdVar = new hd(3, null, getParentActivity());
        }
        hd[] hdVarArr = {hdVar};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = na7.g1(this.f);
        tL_channels_setDiscussionGroup.group = na7.g1(chat);
        gl.e3(new l92(this, hdVarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new rt0(this, hdVarArr, chat, wa5Var, (byte) 3), 64), (byte) 1), 500L);
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131751377, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 25));
        xha a = this.simpleActionBar.t().a(0, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 4);
        this.c = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.e = new w92(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        g24Var.b();
        this.d.setText(k96.M0(2131747975, null));
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new t26(1, false));
        o39 o39Var2 = this.b;
        u92 u92Var = new u92(this, context);
        this.a = u92Var;
        o39Var2.setAdapter(u92Var);
        o39 o39Var3 = this.b;
        if (!k96.a0) {
            i = 2;
        }
        o39Var3.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new u(this, (byte) 10));
        f0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.h.linked_chat_id));
            if (K0 != null) {
                this.w.add(K0);
            }
            xha xhaVar = this.c;
            if (xhaVar != null) {
                xhaVar.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new uf(this, (byte) 13));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        t92 t92Var;
        TLRPC.Chat K0;
        TLRPC.Chat chat = null;
        if (i == kk7.S) {
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
            int i3 = na7.q5;
            if ((intValue & 8192) != 0 && this.f != null) {
                TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(this.f.id));
                if (K02 != null) {
                    this.f = K02;
                }
                if (this.w.size() > 0 && (K0 = getMessagesController().K0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
                    this.w.set(0, K0);
                }
                if (this.s) {
                    if (this.w.size() > 0) {
                        chat = (TLRPC.Chat) this.w.get(0);
                    }
                } else {
                    chat = this.f;
                }
                if (chat != null && (t92Var = this.E) != null) {
                    if (!this.Q) {
                        t92Var.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i == kk7.x1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                ui5 ui5Var = this.parentLayout;
                if (ui5Var != null && ui5Var.getLastFragment() == this) {
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
        TLRPC.ChatFull L0 = getMessagesController().L0(chat.id);
        int i6 = 3;
        if (L0 == null) {
            if (z) {
                getMessagesController().X2(0, chat.id, true);
                this.n = chat;
                this.r = new hd(3, null, getParentActivity());
                gl.e3(new k92(this, (byte) 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 16.0f);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (!hc2.t0(chat)) {
            a0 = k96.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751364, chat.title, this.f.title);
        } else {
            boolean t0 = hc2.t0(this.f);
            String str = chat.title;
            TLRPC.Chat chat2 = this.f;
            if (!t0) {
                a0 = k96.a0("DiscussionLinkGroupPrivateAlert", null, 2131751366, str, chat2.title);
            } else {
                a0 = k96.a0("DiscussionLinkGroupPublicAlert", null, 2131751365, str, chat2.title);
            }
        }
        if (L0.hidden_prehistory) {
            StringBuilder k = b00.k(a0, "\n\n");
            k.append(k96.M0(2131751367, null));
            a0 = k.toString();
        }
        textView.setText(gl.T2(a0));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.s(gl.L(12.0f));
        be0 be0Var = new be0(getParentActivity());
        be0Var.setRoundRadius(gl.L(20.0f));
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(be0Var, nme.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        tb4.w(textView2, bkb.D8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = k96.a0;
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
        frameLayout.addView(textView2, nme.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
        if (k96.a0) {
            i6 = 5;
        }
        frameLayout.addView(textView, nme.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        pb0Var.p(chat);
        be0Var.f(chat, pb0Var);
        alertDialog$Builder.j(k96.M0(2131751368, null), new ie(this, L0, chat, (byte) 28));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x92.f0():void");
    }

    public final void g0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.b != null) {
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.m6, false);
                if (!this.R || w0 != this.S || w02 != this.T) {
                    this.R = true;
                    this.S = w0;
                    this.T = w02;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.b.getChildCount();
                        } else {
                            o39 o39Var = this.b;
                            if (i == 1) {
                                attachedScrapChildCount = o39Var.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = o39Var.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = o39Var.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                O = this.b.getChildAt(i2);
                            } else {
                                o39 o39Var2 = this.b;
                                if (i == 1) {
                                    O = o39Var2.W(i2);
                                } else if (i == 2) {
                                    O = o39Var2.P(i2);
                                } else {
                                    O = o39Var2.O(i2);
                                }
                            }
                            if (O instanceof gh6) {
                                gh6 gh6Var = (gh6) O;
                                gh6Var.P = true;
                                gh6Var.I = w0;
                                gh6Var.J = w02;
                                if (i != 0) {
                                    ((gh6) O).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 0);
        arrayList.add(new blb(this.b, 0, new Class[]{gh6.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.b, 0, new Class[]{gh6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, kk7.S);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.x1);
        d0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.S);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        u92 u92Var = this.a;
        if (u92Var != null) {
            u92Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
