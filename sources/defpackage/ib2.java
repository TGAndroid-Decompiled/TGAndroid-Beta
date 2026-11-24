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
public final class ib2 extends d implements jm7 {
    public eb2 E;
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
    public fb2 a;
    public r59 b;
    public zja c;
    public r34 d;
    public hb2 e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public he r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public final void Z(he[] heVarArr) {
        try {
            heVarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        heVarArr[0] = null;
        this.h.linked_chat_id = 0L;
        nm7 f = nm7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(nm7.T, this.h, 0, bool, bool);
        gm.d3(new wa2(this, (byte) 2), 1000L);
        if (!this.s) {
            finishFragment();
        }
    }

    public final void a0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0(he[] heVarArr, TLRPC.Chat chat, uc5 uc5Var) {
        he heVar = heVarArr[0];
        if (heVar != null) {
            try {
                heVar.dismiss();
            } catch (Throwable unused) {
            }
            heVarArr[0] = null;
        }
        this.h.linked_chat_id = chat.id;
        nm7 f = nm7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(nm7.T, this.h, 0, bool, bool);
        gm.d3(new wa2(this, (byte) 1), 1000L);
        if (uc5Var != null) {
            removeSelfFromStack();
            uc5Var.finishFragment();
            return;
        }
        finishFragment();
    }

    public final void c0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131751326, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 26));
        zja a = this.simpleActionBar.t().a(0, 2131232503);
        a.N();
        a.C0 = new q20(this, (byte) 4);
        this.c = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.e = new hb2(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.d = r34Var;
        r34Var.b();
        this.d.setText(jb6.M0(2131747901, null));
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new u46(1, false));
        r59 r59Var2 = this.b;
        fb2 fb2Var = new fb2(this, context);
        this.a = fb2Var;
        r59Var2.setAdapter(fb2Var);
        r59 r59Var3 = this.b;
        if (!jb6.a0) {
            i = 2;
        }
        r59Var3.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new u(this, (byte) 11));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, uc5 uc5Var) {
        if (chat == null) {
            return;
        }
        if (!sd2.T(chat)) {
            getMessagesController().P(getParentActivity(), chat.id, this, new x92(this, uc5Var, (byte) 2), null);
            return;
        }
        he heVar = null;
        if (uc5Var == null) {
            heVar = new he(3, null, getParentActivity());
        }
        he[] heVarArr = {heVar};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = oc7.h1(this.f);
        tL_channels_setDiscussionGroup.group = oc7.h1(chat);
        gm.d3(new xa2(this, heVarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new av0(this, heVarArr, chat, uc5Var, (byte) 3), 64), (byte) 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        eb2 eb2Var;
        TLRPC.Chat L0;
        TLRPC.Chat chat = null;
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 != null && chat2.id == j) {
                try {
                    this.r.dismiss();
                } catch (Throwable unused) {
                }
                this.r = null;
                f0(this.n, false);
                this.n = null;
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if ((intValue & 8192) != 0 && this.f != null) {
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.f.id));
                if (L02 != null) {
                    this.f = L02;
                }
                if (this.w.size() > 0 && (L0 = getMessagesController().L0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
                    this.w.set(0, L0);
                }
                if (this.s) {
                    if (this.w.size() > 0) {
                        chat = (TLRPC.Chat) this.w.get(0);
                    }
                } else {
                    chat = this.f;
                }
                if (chat != null && (eb2Var = this.E) != null) {
                    if (!this.Q) {
                        eb2Var.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i == nm7.y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                tk5 tk5Var = this.parentLayout;
                if (tk5Var != null && tk5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.h.linked_chat_id));
            if (L0 != null) {
                this.w.add(L0);
            }
            zja zjaVar = this.c;
            if (zjaVar != null) {
                zjaVar.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new tg(this, (byte) 13));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z) {
        int i;
        String a0;
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.ChatFull M0 = getMessagesController().M0(chat.id);
        int i6 = 3;
        if (M0 == null) {
            if (z) {
                getMessagesController().a3(0, chat.id, true);
                this.n = chat;
                this.r = new he(3, null, getParentActivity());
                gm.d3(new wa2(this, (byte) 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        anb.X(textView, cmb.i5, null);
        textView.setTextSize(1, 16.0f);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        if (!sd2.t0(chat)) {
            a0 = jb6.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751313, chat.title, this.f.title);
        } else {
            boolean t0 = sd2.t0(this.f);
            String str = chat.title;
            TLRPC.Chat chat2 = this.f;
            if (!t0) {
                a0 = jb6.a0("DiscussionLinkGroupPrivateAlert", null, 2131751315, str, chat2.title);
            } else {
                a0 = jb6.a0("DiscussionLinkGroupPublicAlert", null, 2131751314, str, chat2.title);
            }
        }
        if (M0.hidden_prehistory) {
            StringBuilder k = b10.k(a0, "\n\n");
            k.append(jb6.M0(2131751316, null));
            a0 = k.toString();
        }
        textView.setText(gm.S2(a0));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.s(gm.L(12.0f));
        bf0 bf0Var = new bf0(getParentActivity());
        bf0Var.setRoundRadius(gm.L(20.0f));
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(bf0Var, qoe.d(40, 40.0f, i2 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        td4.x(textView2, cmb.D8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = jb6.a0;
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
        frameLayout.addView(textView2, qoe.d(-1, -2.0f, i7, f, 11.0f, i8, 0.0f));
        if (jb6.a0) {
            i6 = 5;
        }
        frameLayout.addView(textView, qoe.d(-2, -2.0f, i6 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        pc0Var.p(chat);
        bf0Var.f(chat, pc0Var);
        alertDialog$Builder.j(jb6.M0(2131751317, null), new jf(this, M0, chat, (byte) 28));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void g0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib2.g0():void");
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 0);
        arrayList.add(new cnb(this.b, 0, new Class[]{ij6.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, cmb.x6));
        arrayList.add(new cnb(this.b, 0, new Class[]{ij6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.b != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.m6, false);
                if (!this.R || w0 != this.S || w02 != this.T) {
                    this.R = true;
                    this.S = w0;
                    this.T = w02;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.b.getChildCount();
                        } else {
                            r59 r59Var = this.b;
                            if (i == 1) {
                                attachedScrapChildCount = r59Var.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = r59Var.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = r59Var.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                O = this.b.getChildAt(i2);
                            } else {
                                r59 r59Var2 = this.b;
                                if (i == 1) {
                                    O = r59Var2.W(i2);
                                } else if (i == 2) {
                                    O = r59Var2.P(i2);
                                } else {
                                    O = r59Var2.O(i2);
                                }
                            }
                            if (O instanceof ij6) {
                                ij6 ij6Var = (ij6) O;
                                ij6Var.P = true;
                                ij6Var.I = w0;
                                ij6Var.J = w02;
                                if (i != 0) {
                                    ((ij6) O).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, nm7.T);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.T);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fb2 fb2Var = this.a;
        if (fb2Var != null) {
            fb2Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
