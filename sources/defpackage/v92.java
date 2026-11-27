package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class v92 extends e implements fn7 {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public i56 H;
    public skb I;
    public ilb J;
    public rca K;
    public u92 L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public re1 P;
    public ArrayList Q;
    public LinearLayout R;
    public mf5 S;
    public wkb T;
    public ilb U;
    public r92 V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public n92 a;
    public long a0;
    public m7 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public ilb d;
    public boolean d0;
    public mf5 e;
    public boolean e0;
    public mf5 f;
    public rca f0;
    public ArrayList g0;
    public p92 h;
    public ua6 h0;
    public int i0;
    public String j0;
    public dy1 k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public u1 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public bt5 q0;
    public nla r;
    public i92 r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public h29 w;
    public h29 x;
    public LinearLayout y;

    public static vnb Y(v92 v92Var) {
        return v92Var.resourceProvider;
    }

    public final void a0() {
        boolean z;
        nla nlaVar = this.r;
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            z = false;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            nlaVar.a(z, true);
        }
        z = true;
        nlaVar.a(z, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.w6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
    }

    public final void b0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        dy1 dy1Var = this.k0;
        if (dy1Var != null) {
            hl.r(dy1Var);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (i == 0 && charAt >= '0' && charAt <= '9') {
                        boolean z = this.b0;
                        p92 p92Var = this.h;
                        if (z) {
                            p92Var.setText(ob6.M0(2131748659, null));
                        } else {
                            p92Var.setText(ob6.M0(2131748658, null));
                        }
                        this.h.setTextColorByKey(aob.p7);
                        return;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(ob6.M0(2131748663, null));
                        this.h.setTextColorByKey(aob.p7);
                        return;
                    }
                }
            } else {
                this.h.setText(ob6.M0(2131748663, null));
                this.h.setTextColorByKey(aob.p7);
                return;
            }
        }
        if (str != null && str.length() >= 4) {
            int length = str.length();
            p92 p92Var2 = this.h;
            if (length > 32) {
                p92Var2.setText(ob6.M0(2131748662, null));
                this.h.setTextColorByKey(aob.p7);
                return;
            }
            p92Var2.setText(ob6.M0(2131748676, null));
            this.h.setTextColorByKey(aob.F6);
            this.j0 = str;
            dy1 dy1Var2 = new dy1(this, str, (byte) 27);
            this.k0 = dy1Var2;
            hl.d3(dy1Var2, 300L);
            return;
        }
        boolean z2 = this.b0;
        p92 p92Var3 = this.h;
        if (z2) {
            p92Var3.setText(ob6.M0(2131748661, null));
        } else {
            p92Var3.setText(ob6.M0(2131748660, null));
        }
        this.h.setTextColorByKey(aob.p7);
    }

    public final void c0(boolean z) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new q81((byte) 3, this, z)), this.classGuid);
    }

    @Override
    public final View createView(Context context) {
        int i;
        boolean z;
        int i2;
        int i3;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new m92(this, context));
        this.r = this.simpleActionBar.u(ob6.M0(2131745674, null));
        this.n = new u1(context, (byte) 9);
        this.a = new n92(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, tre.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z2 = this.o0;
        if (z2) {
            this.simpleActionBar.setTitle(ob6.M0(2131743585, null));
        } else {
            boolean z3 = this.b0;
            jla jlaVar = this.simpleActionBar;
            if (z3) {
                jlaVar.setTitle(ob6.M0(2131752263, null));
            } else {
                jlaVar.setTitle(ob6.M0(2131749154, null));
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, tre.o(-1, -2));
        mf5 mf5Var = new mf5(context, 23);
        this.f = mf5Var;
        mf5Var.setHeight(46);
        boolean z4 = this.b0;
        mf5 mf5Var2 = this.f;
        if (z4) {
            mf5Var2.setText(ob6.M0(2131752241, null));
        } else {
            mf5Var2.setText(ob6.M0(2131749145, null));
        }
        this.s.addView(this.f);
        h29 h29Var = new h29(context, false);
        this.x = h29Var;
        if (this.b0) {
            h29Var.b(ob6.M0(2131752299, null), ob6.M0(2131752298, null), false, this.W);
        } else {
            h29Var.b(ob6.M0(2131748395, null), ob6.M0(2131748394, null), false, this.W);
        }
        this.s.addView(this.x, tre.o(-1, -2));
        this.x.setOnClickListener(new l92(this, (byte) 1));
        h29 h29Var2 = new h29(context, false);
        this.w = h29Var2;
        if (this.b0) {
            h29Var2.b(ob6.M0(2131752288, null), ob6.M0(2131752285, null), false, !this.W);
        } else {
            h29Var2.b(ob6.M0(2131748392, null), ob6.M0(2131748391, null), false, !this.W);
        }
        this.s.addView(this.w, tre.o(-1, -2));
        this.w.setOnClickListener(new l92(this, (byte) 2));
        rca rcaVar = new rca(context, (uh9) null);
        this.K = rcaVar;
        this.n.addView(rcaVar, tre.o(-1, -2));
        if (z2) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, tre.o(-1, -2));
        mf5 mf5Var3 = new mf5(context, 23);
        this.e = mf5Var3;
        this.E.addView(mf5Var3);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, tre.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().N2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i4 = aob.H6;
        yob.D(editTextBoldCursor2, i4, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i5 = aob.G6;
        yob.X(editTextBoldCursor3, i5, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, tre.o(-2, 36));
        m7 m7Var = new m7((byte) 1, context, this);
        this.b = m7Var;
        m7Var.setTextSize(1, 18.0f);
        yob.D(this.b, i4, null);
        yob.X(this.b, i5, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(ob6.M0(2131752231, null));
        yob.v(this.b, i5, null);
        this.b.setCursorSize(hl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, tre.o(-1, 36));
        this.b.addTextChangedListener(new c7(this, (byte) 11));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, tre.o(-1, -2));
        i56 i56Var = new i56(context, this, null, true, xc2.T(this.Y));
        this.H = i56Var;
        i56Var.setDelegate(new o92(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        p92 p92Var = new p92(this, context, this.resourceProvider);
        this.h = p92Var;
        p92Var.setBottomPadding(6);
        this.n.addView(this.h, tre.o(-2, -2));
        ilb ilbVar = new ilb(12, this.resourceProvider, context);
        this.d = ilbVar;
        ilbVar.setImportantForAccessibility(1);
        this.n.addView(this.d, tre.o(-1, -2));
        ua6 ua6Var = new ua6(context);
        this.h0 = ua6Var;
        this.n.addView(ua6Var, tre.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, tre.o(-1, -2));
        rca rcaVar2 = new rca(context, (uh9) null);
        this.f0 = rcaVar2;
        this.n.addView(rcaVar2, tre.o(-1, -2));
        u1 u1Var = this.n;
        u92 u92Var = new u92(this, context);
        this.L = u92Var;
        u1Var.addView(u92Var, tre.o(-1, -2));
        u92 u92Var2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        u92Var2.setVisibility(i);
        skb skbVar = new skb(context);
        this.I = skbVar;
        skbVar.o(2131232209, ob6.M0(2131748449, null), false);
        this.I.setOnClickListener(new l92(this, (byte) 3));
        this.n.addView(this.I, tre.o(-1, -2));
        ilb ilbVar2 = new ilb(12, this.resourceProvider, context);
        this.J = ilbVar2;
        this.n.addView(ilbVar2, tre.o(-1, -2));
        r92 r92Var = new r92(this, context, this.Y, context);
        this.V = r92Var;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.b0) {
            z = true;
        } else {
            z = false;
        }
        r92Var.c(z);
        r92 r92Var2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        ilb ilbVar3 = r92Var2.e;
        boolean V = xc2.V(r92Var2.n);
        boolean t0 = xc2.t0(r92Var2.n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + wf3.q(uc7.s1(yac.t0).X1(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i3 = 2131752267;
            } else if (t0) {
                i3 = 2131749156;
            } else {
                i3 = 2131749159;
            }
            ilbVar3.setText(hl.M2(ob6.a0(null, null, i3, str), aob.Zl, null, new tg5(chatFull2, this, (byte) 14), false));
        } else {
            if (V) {
                i2 = 2131752268;
            } else if (t0) {
                i2 = 2131749157;
            } else {
                i2 = 2131749160;
            }
            ilbVar3.setText(ob6.M0(i2, null));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        mf5 mf5Var4 = new mf5(context, 23);
        this.S = mf5Var4;
        mf5Var4.setHeight(46);
        this.S.setText(ob6.M0(2131745591, null));
        this.R.addView(this.S, tre.o(-1, -2));
        wkb wkbVar = new wkb(context);
        this.T = wkbVar;
        wkbVar.f(ob6.M0(2131745789, null), this.c0, false);
        this.T.setOnClickListener(new l92(this, (byte) 4));
        this.R.addView(this.T, tre.o(-1, -2));
        this.U = new ilb(12, this.resourceProvider, context);
        if (this.b0 && !xc2.n0(this.Y)) {
            this.U.setText(ob6.M0(2131745788, null));
        } else {
            this.U.setText(ob6.M0(2131745787, null));
        }
        this.R.addView(this.U, tre.o(-1, -2));
        String K = xc2.K(this.Y, true);
        if (!this.W && K != null) {
            this.n0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.n0 = false;
        }
        g0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z;
        ArrayList<TLRPC.TL_username> arrayList;
        hl.d3(this.r0, 200L);
        if (getParentActivity() != null) {
            String K = xc2.K(this.Y, true);
            if (!this.W) {
                m7 m7Var = this.b;
                if (K != null ? !K.equalsIgnoreCase(m7Var.getText().toString()) : m7Var.length() != 0) {
                    if (this.b.length() != 0 && !this.l0) {
                        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        hl.z3(this.h);
                        f0(false);
                        return;
                    }
                }
            }
            String str = "";
            if (K == null) {
                K = "";
            }
            if (!this.W) {
                str = this.b.getText().toString();
            }
            if (!K.equals(str)) {
                if (!xc2.T(this.Y)) {
                    getMessagesController().R(getParentActivity(), this.a0, this, new ef7(this) {
                        public final v92 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(long j) {
                            byte b = r2;
                            v92 v92Var = this.b;
                            switch (b) {
                                case 0:
                                    if (j != 0) {
                                        v92Var.a0 = j;
                                        v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j));
                                        v92Var.d0();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (j != 0) {
                                        v92Var.a0 = j;
                                        v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j));
                                        v92Var.d0();
                                        return;
                                    }
                                    return;
                                default:
                                    if (j != 0) {
                                        v92Var.a0 = j;
                                        v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j));
                                        uc7 messagesController = v92Var.getMessagesController();
                                        long j2 = -v92Var.a0;
                                        TLRPC.Chat chat = v92Var.Y;
                                        boolean z2 = v92Var.c0;
                                        chat.noforwards = z2;
                                        messagesController.r5(j2, 0, z2, null);
                                        v92Var.d0();
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, null);
                    return;
                }
                uc7 messagesController = getMessagesController();
                long j = this.a0;
                i92 i92Var = new i92(this, (byte) 1);
                i92 i92Var2 = new i92(this, (byte) 2);
                messagesController.getClass();
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = messagesController.h1(j);
                tL_channels_updateUsername.username = str;
                messagesController.getConnectionsManager().sendRequest(tL_channels_updateUsername, new v97(messagesController, j, str, i92Var, this, tL_channels_updateUsername, i92Var2), 64);
                return;
            }
            if (this.W && (arrayList = this.Y.usernames) != null && !arrayList.isEmpty()) {
                if (this.t0) {
                    z = false;
                } else {
                    this.t0 = true;
                    boolean z2 = false;
                    for (int i = 0; i < this.Y.usernames.size(); i++) {
                        TLRPC.TL_username tL_username = this.Y.usernames.get(i);
                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                        tL_channels_deactivateAllUsernames.channel = uc7.i1(this.Y);
                        getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new h92(this, (byte) 2));
                    } else {
                        this.t0 = false;
                    }
                    z = !z2;
                }
            } else {
                z = true;
            }
            if (z) {
                TLRPC.Chat chat = this.Y;
                if (chat.noforwards != this.c0) {
                    if (!xc2.T(chat)) {
                        f0(true);
                        getMessagesController().R(getParentActivity(), this.a0, this, new ef7(this) {
                            public final v92 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run(long j2) {
                                byte b = r2;
                                v92 v92Var = this.b;
                                switch (b) {
                                    case 0:
                                        if (j2 != 0) {
                                            v92Var.a0 = j2;
                                            v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j2));
                                            v92Var.d0();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (j2 != 0) {
                                            v92Var.a0 = j2;
                                            v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j2));
                                            v92Var.d0();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (j2 != 0) {
                                            v92Var.a0 = j2;
                                            v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j2));
                                            uc7 messagesController2 = v92Var.getMessagesController();
                                            long j22 = -v92Var.a0;
                                            TLRPC.Chat chat2 = v92Var.Y;
                                            boolean z22 = v92Var.c0;
                                            chat2.noforwards = z22;
                                            messagesController2.r5(j22, 0, z22, null);
                                            v92Var.d0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, null);
                        return;
                    }
                    uc7 messagesController2 = getMessagesController();
                    long j2 = -this.a0;
                    TLRPC.Chat chat2 = this.Y;
                    boolean z3 = this.c0;
                    chat2.noforwards = z3;
                    messagesController2.r5(j2, 0, z3, null);
                }
                if (this.V != null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    if (!this.b0 && !xc2.T(this.Y)) {
                        r92 r92Var = this.V;
                        if (r92Var.f || r92Var.h) {
                            getMessagesController().R(getParentActivity(), this.a0, this, new ef7(this) {
                                public final v92 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run(long j22) {
                                    byte b = r2;
                                    v92 v92Var = this.b;
                                    switch (b) {
                                        case 0:
                                            if (j22 != 0) {
                                                v92Var.a0 = j22;
                                                v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j22));
                                                v92Var.d0();
                                                return;
                                            }
                                            return;
                                        case 1:
                                            if (j22 != 0) {
                                                v92Var.a0 = j22;
                                                v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j22));
                                                v92Var.d0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (j22 != 0) {
                                                v92Var.a0 = j22;
                                                v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(j22));
                                                uc7 messagesController22 = v92Var.getMessagesController();
                                                long j222 = -v92Var.a0;
                                                TLRPC.Chat chat22 = v92Var.Y;
                                                boolean z22 = v92Var.c0;
                                                chat22.noforwards = z22;
                                                messagesController22.r5(j222, 0, z22, null);
                                                v92Var.d0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, null);
                            return;
                        }
                    }
                    if (this.Y.join_to_send != this.V.f) {
                        uc7 messagesController3 = getMessagesController();
                        long j3 = this.a0;
                        TLRPC.Chat chat3 = this.Y;
                        boolean z4 = this.V.f;
                        chat3.join_to_send = z4;
                        messagesController3.getClass();
                        TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                        tL_channels_toggleJoinToSend.channel = messagesController3.h1(j3);
                        tL_channels_toggleJoinToSend.enabled = z4;
                        messagesController3.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new m65(messagesController3, null, null, (byte) 22), 64);
                    }
                    if (this.Y.join_request != this.V.h || this.X) {
                        uc7 messagesController4 = getMessagesController();
                        long j4 = this.a0;
                        TLRPC.Chat chat4 = this.Y;
                        boolean z5 = this.V.h;
                        chat4.join_request = z5;
                        messagesController4.q5(j4, 0L, z5, this.X, false, null, null);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                g0();
            }
        } else if (i == jn7.y1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var != null && wk5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        l46 l46Var = new l46(2, this.currentAccount, null, getParentActivity(), this);
        l46Var.q2 = this.b0;
        l46Var.C2 = new i92(this, (byte) 0);
        showDialog(l46Var);
    }

    public final void f0(boolean z) {
        if (!z) {
            hl.r(this.r0);
        }
        nla nlaVar = this.r;
        if (nlaVar != null) {
            nlaVar.b(z);
        }
    }

    public final void g0() {
        int i;
        String M0;
        int i2;
        int i3;
        int L;
        String str;
        int i4;
        int i5;
        int i6;
        String M02;
        int i7;
        if (this.K == null) {
            return;
        }
        int i8 = 8;
        if (!this.W && !this.d0 && getUserConfig().p()) {
            this.d.setText(ob6.M0(2131752514, null));
            ilb ilbVar = this.d;
            int i9 = aob.p7;
            ilbVar.setTag(Integer.valueOf(i9));
            yob.X(this.d.getTextView(), i9, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            boolean z = this.e0;
            ua6 ua6Var = this.h0;
            if (z) {
                ua6Var.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                ua6Var.setVisibility(8);
                this.y.setVisibility(0);
            }
        } else {
            ilb ilbVar2 = this.d;
            int i10 = aob.B6;
            ilbVar2.setTag(Integer.valueOf(i10));
            yob.X(this.d.getTextView(), i10, null);
            boolean z2 = this.o0;
            rca rcaVar = this.K;
            if (z2) {
                rcaVar.setVisibility(8);
            } else {
                rcaVar.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            boolean z3 = this.b0;
            ilb ilbVar3 = this.d;
            boolean z4 = this.W;
            if (z3) {
                if (z4) {
                    i6 = 2131752297;
                } else {
                    i6 = 2131752232;
                }
                ilbVar3.setText(ob6.M0(i6, null));
                mf5 mf5Var = this.e;
                if (this.W) {
                    M02 = ob6.M0(2131752375, null);
                } else {
                    M02 = ob6.M0(2131752357, null);
                }
                mf5Var.setText(M02);
            } else {
                if (z4) {
                    i = 2131748393;
                } else {
                    i = 2131748390;
                }
                ilbVar3.setText(ob6.M0(i, null));
                mf5 mf5Var2 = this.e;
                if (this.W) {
                    M0 = ob6.M0(2131752375, null);
                } else {
                    M0 = ob6.M0(2131752357, null);
                }
                mf5Var2.setText(M0);
            }
            LinearLayout linearLayout = this.F;
            if (this.W) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            LinearLayout linearLayout2 = this.G;
            if (this.W) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            linearLayout2.setVisibility(i3);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            LinearLayout linearLayout3 = this.E;
            if (this.W) {
                L = 0;
            } else {
                L = hl.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            i56 i56Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            i56Var.setLink(str);
            this.H.c(this.m0, this.a0);
            p92 p92Var = this.h;
            if (!this.W && p92Var.a.length() != 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            p92Var.setVisibility(i4);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.a0);
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.a0));
            ilb ilbVar4 = this.J;
            if (N0 != null && N0.paid_media_allowed && xc2.V(M03)) {
                i5 = 2131748447;
            } else {
                i5 = 2131748448;
            }
            ilbVar4.setText(ob6.M0(i5, null));
        }
        boolean z5 = true;
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        r92 r92Var = this.V;
        if (r92Var != null) {
            if (this.b0 && !this.W) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            r92Var.setVisibility(i7);
            r92 r92Var2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.b0) {
                z5 = false;
            }
            r92Var2.c(z5);
        }
        u92 u92Var = this.L;
        if (u92Var != null) {
            if (!this.W && !this.O.isEmpty()) {
                i8 = 0;
            }
            u92Var.setVisibility(i8);
        }
        a0();
    }

    @Override
    public final ny9 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = aob.i6;
        arrayList.add(new apb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb((View) null, 4, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        LinearLayout linearLayout = this.s;
        int i2 = aob.d6;
        arrayList.add(new apb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.T, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.T, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.h0, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
        arrayList.add(new apb(this.w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        m7 m7Var;
        super.onBecomeFullyVisible();
        if (this.o0 && (m7Var = this.b) != null) {
            m7Var.requestFocus();
            hl.E3(this.b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v92.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        getNotificationCenter().n(this, jn7.y1);
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            i56 i56Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            i56Var.setLink(str);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            ua6 ua6Var = this.h0;
            if (ua6Var != null && ua6Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(aob.w0(null, aob.h6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.y.getChildAt(i);
                    if (childAt instanceof kb) {
                        kb kbVar = (kb) childAt;
                        kbVar.d.p(kbVar.f);
                        kbVar.a.invalidate();
                    }
                }
            }
            bt5 bt5Var = this.q0;
            if (bt5Var != null) {
                bt5Var.updateColors();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
