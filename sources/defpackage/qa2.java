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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class qa2 extends d implements jm7 {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public f56 H;
    public xib I;
    public njb J;
    public bba K;
    public pa2 L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public qf1 P;
    public ArrayList Q;
    public LinearLayout R;
    public jf5 S;
    public bjb T;
    public njb U;
    public ma2 V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ia2 a;
    public long a0;
    public l7 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public njb d;
    public boolean d0;
    public jf5 e;
    public boolean e0;
    public jf5 f;
    public bba f0;
    public ArrayList g0;
    public ka2 h;
    public pa6 h0;
    public int i0;
    public String j0;
    public lx1 k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public t1 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public xs5 q0;
    public uja r;
    public da2 r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public v09 w;
    public v09 x;
    public LinearLayout y;

    public static ylb Z(qa2 qa2Var) {
        return qa2Var.resourceProvider;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.v6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
    }

    public final void b0() {
        boolean z;
        uja ujaVar = this.r;
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
            ujaVar.a(z, true);
        }
        z = true;
        ujaVar.a(z, true);
    }

    public final void c0(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        lx1 lx1Var = this.k0;
        if (lx1Var != null) {
            gm.r(lx1Var);
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
                        ka2 ka2Var = this.h;
                        if (z) {
                            ka2Var.setText(jb6.M0(2131748662, null));
                        } else {
                            ka2Var.setText(jb6.M0(2131748661, null));
                        }
                        this.h.setTextColorByKey(cmb.o7);
                        return;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(jb6.M0(2131748666, null));
                        this.h.setTextColorByKey(cmb.o7);
                        return;
                    }
                }
            } else {
                this.h.setText(jb6.M0(2131748666, null));
                this.h.setTextColorByKey(cmb.o7);
                return;
            }
        }
        if (str != null && str.length() >= 4) {
            int length = str.length();
            ka2 ka2Var2 = this.h;
            if (length > 32) {
                ka2Var2.setText(jb6.M0(2131748665, null));
                this.h.setTextColorByKey(cmb.o7);
                return;
            }
            ka2Var2.setText(jb6.M0(2131748679, null));
            this.h.setTextColorByKey(cmb.E6);
            this.j0 = str;
            lx1 lx1Var2 = new lx1(this, str, (byte) 28);
            this.k0 = lx1Var2;
            gm.d3(lx1Var2, 300L);
            return;
        }
        boolean z2 = this.b0;
        ka2 ka2Var3 = this.h;
        if (z2) {
            ka2Var3.setText(jb6.M0(2131748664, null));
        } else {
            ka2Var3.setText(jb6.M0(2131748663, null));
        }
        this.h.setTextColorByKey(cmb.o7);
    }

    @Override
    public final View createView(Context context) {
        int i;
        boolean z;
        int i2;
        int i3;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ha2(this, context));
        this.r = this.simpleActionBar.s(jb6.M0(2131745680, null));
        this.n = new t1(context, (byte) 9);
        this.a = new ia2(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, qoe.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z2 = this.o0;
        if (z2) {
            this.simpleActionBar.setTitle(jb6.M0(2131743617, null));
        } else {
            boolean z3 = this.b0;
            rja rjaVar = this.simpleActionBar;
            if (z3) {
                rjaVar.setTitle(jb6.M0(2131752235, null));
            } else {
                rjaVar.setTitle(jb6.M0(2131749157, null));
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(context, 23);
        this.f = jf5Var;
        jf5Var.setHeight(46);
        boolean z4 = this.b0;
        jf5 jf5Var2 = this.f;
        if (z4) {
            jf5Var2.setText(jb6.M0(2131752213, null));
        } else {
            jf5Var2.setText(jb6.M0(2131749148, null));
        }
        this.s.addView(this.f);
        v09 v09Var = new v09(context, false);
        this.x = v09Var;
        if (this.b0) {
            v09Var.b(jb6.M0(2131752271, null), jb6.M0(2131752270, null), false, this.W);
        } else {
            v09Var.b(jb6.M0(2131748398, null), jb6.M0(2131748397, null), false, this.W);
        }
        this.s.addView(this.x, qoe.o(-1, -2));
        this.x.setOnClickListener(new ga2(this, (byte) 1));
        v09 v09Var2 = new v09(context, false);
        this.w = v09Var2;
        if (this.b0) {
            v09Var2.b(jb6.M0(2131752260, null), jb6.M0(2131752257, null), false, !this.W);
        } else {
            v09Var2.b(jb6.M0(2131748395, null), jb6.M0(2131748394, null), false, !this.W);
        }
        this.s.addView(this.w, qoe.o(-1, -2));
        this.w.setOnClickListener(new ga2(this, (byte) 2));
        bba bbaVar = new bba(context, (hg9) null);
        this.K = bbaVar;
        this.n.addView(bbaVar, qoe.o(-1, -2));
        if (z2) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, qoe.o(-1, -2));
        jf5 jf5Var3 = new jf5(context, 23);
        this.e = jf5Var3;
        this.E.addView(jf5Var3);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, qoe.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().N2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i4 = cmb.G6;
        anb.D(editTextBoldCursor2, i4, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i5 = cmb.F6;
        anb.X(editTextBoldCursor3, i5, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, qoe.o(-2, 36));
        l7 l7Var = new l7((byte) 1, context, this);
        this.b = l7Var;
        l7Var.setTextSize(1, 18.0f);
        anb.D(this.b, i4, null);
        anb.X(this.b, i5, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(jb6.M0(2131752203, null));
        anb.v(this.b, i5, null);
        this.b.setCursorSize(gm.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, qoe.o(-1, 36));
        this.b.addTextChangedListener(new b7(this, (byte) 12));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, qoe.o(-1, -2));
        f56 f56Var = new f56(context, this, null, true, sd2.T(this.Y));
        this.H = f56Var;
        f56Var.setDelegate(new ja2(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        ka2 ka2Var = new ka2(this, context, this.resourceProvider);
        this.h = ka2Var;
        ka2Var.setBottomPadding(6);
        this.n.addView(this.h, qoe.o(-2, -2));
        njb njbVar = new njb(12, this.resourceProvider, context);
        this.d = njbVar;
        njbVar.setImportantForAccessibility(1);
        this.n.addView(this.d, qoe.o(-1, -2));
        pa6 pa6Var = new pa6(context);
        this.h0 = pa6Var;
        this.n.addView(pa6Var, qoe.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, qoe.o(-1, -2));
        bba bbaVar2 = new bba(context, (hg9) null);
        this.f0 = bbaVar2;
        this.n.addView(bbaVar2, qoe.o(-1, -2));
        t1 t1Var = this.n;
        pa2 pa2Var = new pa2(this, context);
        this.L = pa2Var;
        t1Var.addView(pa2Var, qoe.o(-1, -2));
        pa2 pa2Var2 = this.L;
        if (!this.W && !this.O.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        pa2Var2.setVisibility(i);
        xib xibVar = new xib(context);
        this.I = xibVar;
        xibVar.o(2131232210, jb6.M0(2131748452, null), false);
        this.I.setOnClickListener(new ga2(this, (byte) 3));
        this.n.addView(this.I, qoe.o(-1, -2));
        njb njbVar2 = new njb(12, this.resourceProvider, context);
        this.J = njbVar2;
        this.n.addView(njbVar2, qoe.o(-1, -2));
        ma2 ma2Var = new ma2(this, context, this.Y, context);
        this.V = ma2Var;
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.b0) {
            z = true;
        } else {
            z = false;
        }
        ma2Var.c(z);
        ma2 ma2Var2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        njb njbVar3 = ma2Var2.e;
        boolean V = sd2.V(ma2Var2.n);
        boolean t0 = sd2.t0(ma2Var2.n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + pg3.q(oc7.r1(z8c.t0).W1(Long.valueOf(chatFull2.guard_bot_id)));
            if (V) {
                i3 = 2131752239;
            } else if (t0) {
                i3 = 2131749159;
            } else {
                i3 = 2131749162;
            }
            njbVar3.setText(gm.M2(jb6.a0(null, null, i3, str), cmb.Yl, null, new fd5(chatFull2, this, (byte) 18), false));
        } else {
            if (V) {
                i2 = 2131752240;
            } else if (t0) {
                i2 = 2131749160;
            } else {
                i2 = 2131749163;
            }
            njbVar3.setText(jb6.M0(i2, null));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        jf5 jf5Var4 = new jf5(context, 23);
        this.S = jf5Var4;
        jf5Var4.setHeight(46);
        this.S.setText(jb6.M0(2131745597, null));
        this.R.addView(this.S, qoe.o(-1, -2));
        bjb bjbVar = new bjb(context);
        this.T = bjbVar;
        bjbVar.f(jb6.M0(2131745795, null), this.c0, false);
        this.T.setOnClickListener(new ga2(this, (byte) 4));
        this.R.addView(this.T, qoe.o(-1, -2));
        this.U = new njb(12, this.resourceProvider, context);
        if (this.b0 && !sd2.n0(this.Y)) {
            this.U.setText(jb6.M0(2131745794, null));
        } else {
            this.U.setText(jb6.M0(2131745793, null));
        }
        this.R.addView(this.U, qoe.o(-1, -2));
        String K = sd2.K(this.Y, true);
        if (!this.W && K != null) {
            this.n0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new r91((byte) 3, this, z)), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
            }
        } else if (i == nm7.y1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
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
        boolean z;
        ArrayList<TLRPC.TL_username> arrayList;
        gm.d3(this.r0, 200L);
        if (getParentActivity() != null) {
            String K = sd2.K(this.Y, true);
            if (!this.W) {
                l7 l7Var = this.b;
                if (K != null ? !K.equalsIgnoreCase(l7Var.getText().toString()) : l7Var.length() != 0) {
                    if (this.b.length() != 0 && !this.l0) {
                        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        gm.z3(this.h);
                        g0(false);
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
                if (!sd2.T(this.Y)) {
                    getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) {
                        public final qa2 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(long j) {
                            byte b = r2;
                            qa2 qa2Var = this.b;
                            switch (b) {
                                case 0:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        qa2Var.e0();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        qa2Var.e0();
                                        return;
                                    }
                                    return;
                                default:
                                    if (j != 0) {
                                        qa2Var.a0 = j;
                                        qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j));
                                        oc7 messagesController = qa2Var.getMessagesController();
                                        long j2 = -qa2Var.a0;
                                        TLRPC.Chat chat = qa2Var.Y;
                                        boolean z2 = qa2Var.c0;
                                        chat.noforwards = z2;
                                        messagesController.l5(j2, 0, z2, null);
                                        qa2Var.e0();
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, null);
                    return;
                }
                oc7 messagesController = getMessagesController();
                long j = this.a0;
                da2 da2Var = new da2(this, (byte) 1);
                da2 da2Var2 = new da2(this, (byte) 2);
                messagesController.getClass();
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = messagesController.g1(j);
                tL_channels_updateUsername.username = str;
                messagesController.getConnectionsManager().sendRequest(tL_channels_updateUsername, new s97(messagesController, j, str, da2Var, this, tL_channels_updateUsername, da2Var2), 64);
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
                        tL_channels_deactivateAllUsernames.channel = oc7.h1(this.Y);
                        getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new ca2(this, (byte) 2));
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
                    if (!sd2.T(chat)) {
                        g0(true);
                        getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) {
                            public final qa2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run(long j2) {
                                byte b = r2;
                                qa2 qa2Var = this.b;
                                switch (b) {
                                    case 0:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            qa2Var.e0();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            qa2Var.e0();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (j2 != 0) {
                                            qa2Var.a0 = j2;
                                            qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j2));
                                            oc7 messagesController2 = qa2Var.getMessagesController();
                                            long j22 = -qa2Var.a0;
                                            TLRPC.Chat chat2 = qa2Var.Y;
                                            boolean z22 = qa2Var.c0;
                                            chat2.noforwards = z22;
                                            messagesController2.l5(j22, 0, z22, null);
                                            qa2Var.e0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, null);
                        return;
                    }
                    oc7 messagesController2 = getMessagesController();
                    long j2 = -this.a0;
                    TLRPC.Chat chat2 = this.Y;
                    boolean z3 = this.c0;
                    chat2.noforwards = z3;
                    messagesController2.l5(j2, 0, z3, null);
                }
                if (this.V != null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    if (!this.b0 && !sd2.T(this.Y)) {
                        ma2 ma2Var = this.V;
                        if (ma2Var.f || ma2Var.h) {
                            getMessagesController().P(getParentActivity(), this.a0, this, new xe7(this) {
                                public final qa2 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run(long j22) {
                                    byte b = r2;
                                    qa2 qa2Var = this.b;
                                    switch (b) {
                                        case 0:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                qa2Var.e0();
                                                return;
                                            }
                                            return;
                                        case 1:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                qa2Var.e0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (j22 != 0) {
                                                qa2Var.a0 = j22;
                                                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(j22));
                                                oc7 messagesController22 = qa2Var.getMessagesController();
                                                long j222 = -qa2Var.a0;
                                                TLRPC.Chat chat22 = qa2Var.Y;
                                                boolean z22 = qa2Var.c0;
                                                chat22.noforwards = z22;
                                                messagesController22.l5(j222, 0, z22, null);
                                                qa2Var.e0();
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
                        oc7 messagesController3 = getMessagesController();
                        long j3 = this.a0;
                        TLRPC.Chat chat3 = this.Y;
                        boolean z4 = this.V.f;
                        chat3.join_to_send = z4;
                        messagesController3.getClass();
                        TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                        tL_channels_toggleJoinToSend.channel = messagesController3.g1(j3);
                        tL_channels_toggleJoinToSend.enabled = z4;
                        messagesController3.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new i65(messagesController3, null, null, (byte) 22), 64);
                    }
                    if (this.Y.join_request != this.V.h || this.X) {
                        oc7 messagesController4 = getMessagesController();
                        long j4 = this.a0;
                        TLRPC.Chat chat4 = this.Y;
                        boolean z5 = this.V.h;
                        chat4.join_request = z5;
                        messagesController4.k5(j4, 0L, z5, this.X, false, null, null);
                    }
                }
                finishFragment();
            }
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(2, this.currentAccount, null, getParentActivity(), this);
        i46Var.q2 = this.b0;
        i46Var.C2 = new da2(this, (byte) 0);
        showDialog(i46Var);
    }

    public final void g0(boolean z) {
        if (!z) {
            gm.r(this.r0);
        }
        uja ujaVar = this.r;
        if (ujaVar != null) {
            ujaVar.b(z);
        }
    }

    @Override
    public final ww9 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = cmb.h6;
        arrayList.add(new cnb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb((View) null, 4, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        LinearLayout linearLayout = this.s;
        int i2 = cmb.c6;
        arrayList.add(new cnb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.T, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.T, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.h0, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.x, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final void h0() {
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
            this.d.setText(jb6.M0(2131752486, null));
            njb njbVar = this.d;
            int i9 = cmb.o7;
            njbVar.setTag(Integer.valueOf(i9));
            anb.X(this.d.getTextView(), i9, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            boolean z = this.e0;
            pa6 pa6Var = this.h0;
            if (z) {
                pa6Var.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                pa6Var.setVisibility(8);
                this.y.setVisibility(0);
            }
        } else {
            njb njbVar2 = this.d;
            int i10 = cmb.A6;
            njbVar2.setTag(Integer.valueOf(i10));
            anb.X(this.d.getTextView(), i10, null);
            boolean z2 = this.o0;
            bba bbaVar = this.K;
            if (z2) {
                bbaVar.setVisibility(8);
            } else {
                bbaVar.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            boolean z3 = this.b0;
            njb njbVar3 = this.d;
            boolean z4 = this.W;
            if (z3) {
                if (z4) {
                    i6 = 2131752269;
                } else {
                    i6 = 2131752204;
                }
                njbVar3.setText(jb6.M0(i6, null));
                jf5 jf5Var = this.e;
                if (this.W) {
                    M02 = jb6.M0(2131752347, null);
                } else {
                    M02 = jb6.M0(2131752329, null);
                }
                jf5Var.setText(M02);
            } else {
                if (z4) {
                    i = 2131748396;
                } else {
                    i = 2131748393;
                }
                njbVar3.setText(jb6.M0(i, null));
                jf5 jf5Var2 = this.e;
                if (this.W) {
                    M0 = jb6.M0(2131752347, null);
                } else {
                    M0 = jb6.M0(2131752329, null);
                }
                jf5Var2.setText(M0);
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
                L = gm.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            f56 f56Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            f56Var.setLink(str);
            this.H.c(this.m0, this.a0);
            ka2 ka2Var = this.h;
            if (!this.W && ka2Var.a.length() != 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            ka2Var.setVisibility(i4);
            TLRPC.ChatFull M03 = getMessagesController().M0(this.a0);
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.a0));
            njb njbVar4 = this.J;
            if (M03 != null && M03.paid_media_allowed && sd2.V(L0)) {
                i5 = 2131748450;
            } else {
                i5 = 2131748451;
            }
            njbVar4.setText(jb6.M0(i5, null));
        }
        boolean z5 = true;
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        ma2 ma2Var = this.V;
        if (ma2Var != null) {
            if (this.b0 && !this.W) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            ma2Var.setVisibility(i7);
            ma2 ma2Var2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            if (chatFull == null || chatFull.linked_chat_id == 0 || this.b0) {
                z5 = false;
            }
            ma2Var2.c(z5);
        }
        pa2 pa2Var = this.L;
        if (pa2Var != null) {
            if (!this.W && !this.O.isEmpty()) {
                i8 = 0;
            }
            pa2Var.setVisibility(i8);
        }
        b0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        l7 l7Var;
        super.onBecomeFullyVisible();
        if (this.o0 && (l7Var = this.b) != null) {
            l7Var.requestFocus();
            gm.E3(this.b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa2.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.T);
        getNotificationCenter().n(this, nm7.y1);
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            f56 f56Var = this.H;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            f56Var.setLink(str);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            pa6 pa6Var = this.h0;
            if (pa6Var != null && pa6Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(cmb.w0(null, cmb.g6, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.y.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
            xs5 xs5Var = this.q0;
            if (xs5Var != null) {
                xs5Var.updateColors();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
