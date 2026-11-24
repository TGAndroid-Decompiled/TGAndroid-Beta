package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public class p82 extends d implements vl5, gk7 {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public b9a H;
    public boolean H0;
    public wgb I;
    public boolean I0;
    public wgb J;
    public boolean J0;
    public wgb K;
    public boolean K0;
    public wgb L;
    public TLRPC.ChatReactions L0;
    public d08 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public wgb N;
    public boolean N0;
    public wgb O;
    public boolean O0;
    public wgb P;
    public boolean P0;
    public mhb Q;
    public final ArrayList Q0;
    public wgb R;
    public final m82 R0;
    public LinearLayout S;
    public oy8 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public wgb U;
    public wgb V;
    public wgb W;
    public wgb X;
    public wgb Y;
    public wgb Z;
    public sha a;
    public wgb a0;
    public hd b;
    public wgb b0;
    public UndoView c;
    public n82 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public kb0 e;
    public uib e0;
    public s71 f;
    public wgb f0;
    public wgb g0;
    public AnimatorSet h;
    public gn2 h0;
    public mhb i0;
    public wgb j0;
    public mhb k0;
    public wgb l0;
    public wgb m0;
    public RadialProgressView n;
    public wgb n0;
    public wgb o0;
    public wgb p0;
    public wgb q0;
    public final pb0 r;
    public wgb r0;
    public final wl5 s;
    public mhb s0;
    public mhb t0;
    public wgb u0;
    public TLRPC.FileLocation v0;
    public rt3 w;
    public long w0;
    public t1 x;
    public TLRPC.Chat x0;
    public tu9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public p82(Bundle bundle) {
        super(bundle);
        int i;
        this.Q0 = new ArrayList();
        this.R0 = new m82(this);
        this.r = new pb0((wjb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 != 0) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.w0));
            if (K0 != null && hc2.V(K0)) {
                i = 1;
            } else {
                i = 2;
            }
            this.s = new wl5(i, true, true);
            return;
        }
        this.s = new wl5(0, false, false);
    }

    public static pha Y(p82 p82Var) {
        return p82Var.simpleActionBar;
    }

    public static pha Z(p82 p82Var) {
        return p82Var.simpleActionBar;
    }

    public static SpannableStringBuilder a0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        nd4 nd4Var = new nd4(10);
        nd4Var.a.setTypeface(gl.n1("fonts/num.otf"));
        nd4Var.f = bkb.w0(null, bkb.Bk, false);
        nd4Var.n = false;
        spannableStringBuilder.setSpan(nd4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String d0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_username tL_username = arrayList.get(i);
            i++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void H(float f) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.vj));
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
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
    }

    public final boolean b0(boolean z) {
        rt3 rt3Var;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            rt3 rt3Var2 = this.w;
            if ((rt3Var2 != null && !this.D0.first_name.equals(rt3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131743487, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131752971, null);
                    alertDialog$Builder.j(k96.M0(2131754213, null), new j82(this, (byte) 0));
                    alertDialog$Builder.g(k96.M0(2131747387, null), new j82(this, (byte) 1));
                    showDialog(hdVar);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && hc2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((rt3Var = this.w) != null && !this.x0.title.equals(rt3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = k96.M0(2131743487, "UserRestrictionsApplyChanges");
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                if (this.J0) {
                    hdVar2.U = k96.M0(2131752293, "ChannelSettingsChangedAlert");
                } else {
                    hdVar2.U = k96.M0(2131749209, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(k96.M0(2131754213, "ApplyTheme"), new j82(this, (byte) 2));
                alertDialog$Builder2.g(k96.M0(2131747387, "PassportDiscard"), new j82(this, (byte) 3));
                showDialog(hdVar2);
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList != null && !arrayList.isEmpty()) {
            k27 k27Var = (k27) b00.f(1, arrayList);
            if (!TextUtils.isEmpty(k27Var.z)) {
                str = k27Var.z.toString();
            } else if (!TextUtils.isEmpty(k27Var.v)) {
                str = k27Var.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = k96.M0(2131742629, null);
        }
        this.f0.u(k96.M0(2131742635, null), str, false, 2131231930, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.s.c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e0() {
        nh1 nh1Var = new nh1(-this.x0.id);
        nh1Var.m0 = this;
        presentFragment(nh1Var);
        na7.q1(this.currentAccount).X3.edit().putInt("boostingappearance", na7.q1(this.currentAccount).X3.getInt("boostingappearance", 0) + 1).apply();
    }

    public final void f0(hd hdVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, ng1 ng1Var) {
        hdVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        h26 h26Var = new h26(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        h26Var.r1(ng1Var);
        h26Var.q1(tL_premium_boostsStatus, true);
        h26Var.s1(j);
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
        if (K0 != null) {
            h26Var.L2 = new kx1(this, K0, (byte) 26);
        }
        showDialog(h26Var);
    }

    public final void g0(FrameLayout frameLayout, View view) {
        SpannableStringBuilder T2;
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                T2 = gl.T2(k96.M0(2131752268, "ChannelTopicsDiscussionForbidden"));
            } else {
                T2 = gl.T2(k96.G(getMessagesController().k4.o1.f(), "ChannelTopicsForbidden", new Object[0]));
            }
            u21.b0(this).Q(2131624290, 36, T2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? dVar = new d(null);
        dVar.a = -this.w0;
        dVar.setResourceProvider(this.resourceProvider);
        boolean z = this.F0;
        boolean z2 = this.H0;
        boolean z3 = this.I0;
        qo0 qo0Var = new qo0(this, view, (byte) 1);
        dVar.c = z;
        dVar.d = z2;
        dVar.e = z3;
        dVar.h = qo0Var;
        presentFragment((d) dVar);
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override
    public final tu9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        n82 n82Var = this.c0;
        int i = bkb.h6;
        arrayList.add(new blb(n82Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.c0, 4, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.t6));
        arrayList.add(new blb(this.c0, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.u6));
        arrayList.add(new blb(this.U, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        wgb wgbVar = this.V;
        if (wgbVar != null) {
            arrayList.add(new blb(wgbVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        arrayList.add(new blb(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.Z, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.J, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        LinearLayout linearLayout = this.E;
        int i2 = bkb.c6;
        arrayList.add(new blb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.e0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.e0, 4, new Class[]{uib.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.P, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        wgb wgbVar2 = this.L;
        if (wgbVar2 != null) {
            arrayList.add(new blb(wgbVar2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        wgb wgbVar3 = this.b0;
        if (wgbVar3 != null) {
            arrayList.add(new blb(wgbVar3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        return arrayList;
    }

    public final void h0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = tb4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        cj3 cj3Var = new cj3(j);
        cj3Var.setCurrentAccount(i);
        cj3Var.E2 = new bf(cj3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(cj3Var);
    }

    public final void i0(long j, long j2) {
        na7.q1(this.currentAccount).S2(j, j2, true, false, new w72(this, (byte) 1));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.P0 = true;
        kk7 f = kk7.f(this.currentAccount);
        int i = na7.q5;
        f.k(2, 2);
    }

    public final void k0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            na7.q1(this.currentAccount).x(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().m1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new i82(this, (byte) 2));
        }
        r0(false, true);
        kb0 kb0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        kb0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().h1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new i82(this, (byte) 0));
    }

    public final void m0() {
        boolean z;
        if (this.v0 != null) {
            z = true;
        } else {
            z = false;
        }
        this.s.n(z, new k82(this, (byte) 0), new n1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void n0() {
        rt3 rt3Var;
        boolean z;
        boolean z2;
        String str;
        String str2;
        if (!this.O0 && (rt3Var = this.w) != null) {
            if (rt3Var.a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                gl.A3(this.w);
                return;
            }
            boolean z3 = true;
            this.O0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().o1(this.D0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.D0.first_name.equals(this.w.getText().toString())) {
                    setbotinfo.name = this.w.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.E0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.F;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.F.getText().toString();
                    setbotinfo.flags |= 1;
                }
                this.b = new hd(3, null, getParentActivity());
                this.b.setOnCancelListener(new xs0(this, getConnectionsManager().sendRequest(setbotinfo, new pl(this, setbotinfo, (byte) 20)), (byte) 4));
                this.b.show();
            } else if (!hc2.T(this.x0) && (!this.K0 || this.F0)) {
                getMessagesController().P(getParentActivity(), this.w0, this, new j82(this, (byte) 5), null);
            } else {
                if (this.y0 != null && hc2.T(this.x0)) {
                    TLRPC.ChatFull chatFull = this.y0;
                    boolean z4 = chatFull.hidden_prehistory;
                    boolean z5 = this.K0;
                    if (z4 != z5) {
                        chatFull.hidden_prehistory = z5;
                        getMessagesController().g5(this.w0, this.K0);
                    }
                }
                if (this.s.g()) {
                    this.N0 = true;
                    hd hdVar = new hd(3, null, getParentActivity());
                    this.b = hdVar;
                    hdVar.setOnCancelListener(new ur0(this, (byte) 5));
                    this.b.show();
                    return;
                }
                if (!this.x0.title.equals(this.w.getText().toString())) {
                    getMessagesController().y(this.w0, this.w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.F;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    na7 messagesController = getMessagesController();
                    long j = this.w0;
                    String obj = this.F.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.y0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.h1(-j);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new k45(messagesController, chatFull3, obj, (byte) 21), 64);
                }
                boolean z6 = this.F0;
                TLRPC.Chat chat = this.x0;
                boolean z7 = chat.forum;
                if (z6 != z7 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
                    if (this.H0 != chat.forum_tabs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.I0 != chat.forum_sidebar) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z6 == z7) {
                        z3 = false;
                    }
                    getMessagesController().f5(this.w0, this.F0, this.H0, this.I0);
                    if (this.F0 && !this.H0 && (z3 || z)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i = 0; i < fragmentStack.size(); i++) {
                            if ((fragmentStack.get(i) instanceof mu1) && ((mu1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                                ((ActionBarLayout) getParentLayout()).a0(i);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.w0);
                                ui5 parentLayout = getParentLayout();
                                HashSet hashSet = qvb.s1;
                                ((ActionBarLayout) parentLayout).b(i, qvb.E0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z || z2) {
                        u0(z);
                    }
                }
                finishFragment();
            }
        }
    }

    public final void o0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.o0():void");
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.w;
        if (rt3Var != null && rt3Var.e) {
            if (z) {
                rt3Var.k(true);
                return false;
            }
            return false;
        }
        return b0(z);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wl5 wl5Var = this.s;
        if (wl5Var != null) {
            wl5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, kk7.S);
            getNotificationCenter().n(this, kk7.t5);
            getNotificationCenter().n(this, kk7.Z4);
            getNotificationCenter().n(this, kk7.N3);
        } else {
            getNotificationCenter().n(this, kk7.D0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, kk7.D3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.x1);
        getNotificationCenter().n(this, kk7.a1);
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.o();
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vl) obj).n(null);
        }
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.s.j(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            rt3Var.s();
            this.w.getEditText().requestFocus();
        }
        s0();
        gl.W2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                zkb.l(editTextBoldCursor, 30, bkb.F6, null);
            }
            kb0 kb0Var = this.e;
            if (kb0Var != null) {
                kb0Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        boolean z;
        vl vlVar;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().K0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            if (hc2.T(chat) && !this.y0.hidden_prehistory) {
                z = false;
            } else {
                z = true;
            }
            this.K0 = z;
            this.L0 = this.y0.available_reactions;
            this.Q0.clear();
            ArrayList arrayList = this.Q0;
            TLRPC.Chat chat2 = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && hc2.V(chat2)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i);
                        i++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                vlVar = vl.l(y6c.t0, vl.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            vlVar = vl.m(y6c.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, vl.f());
                        } else {
                            vlVar = null;
                        }
                        if (vlVar != null) {
                            arrayList2.add(vlVar);
                            vlVar.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = hq6.d0(y6c.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            vl l = vl.l(y6c.t0, vl.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().k4.C2.f && hc2.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        c0();
    }

    public final void q0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i;
        TL_bots.BotInfo botInfo2;
        boolean z;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User V1;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                if (j == 0) {
                    V1 = null;
                } else {
                    V1 = getMessagesController().V1(Long.valueOf(j));
                }
                this.D0 = V1;
            }
            wgb wgbVar = this.o0;
            int i2 = 0;
            if (wgbVar != null) {
                if (this.E0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                wgbVar.h(45, z, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    wgb wgbVar2 = this.o0;
                    if (userFull2.starref_program == null) {
                        format = k96.M0(2131754342, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    wgbVar2.w(format, false);
                }
            }
            wgb wgbVar3 = this.u0;
            if (wgbVar3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                wgbVar3.setVisibility(i);
            }
            mhb mhbVar = this.t0;
            if (mhbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i2 = 8;
                }
                mhbVar.setVisibility(i2);
            }
        }
    }

    public final void r0(boolean z, boolean z2) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            RadialProgressView radialProgressView = this.n;
            if (z) {
                radialProgressView.setVisibility(0);
                this.f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView2 = this.n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property, 1.0f), ObjectAnimator.ofFloat(this.f, property, 1.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, property2, 0.0f), ObjectAnimator.ofFloat(this.f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new y7((byte) 16, this, z));
            this.h.start();
            return;
        }
        RadialProgressView radialProgressView3 = this.n;
        if (z) {
            radialProgressView3.setAlpha(1.0f);
            this.n.setVisibility(0);
            this.f.setAlpha(1.0f);
            this.f.setVisibility(0);
            return;
        }
        radialProgressView3.setAlpha(0.0f);
        this.n.setVisibility(4);
        this.f.setAlpha(0.0f);
        this.f.setVisibility(4);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.s;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
        wgb wgbVar;
        wgb wgbVar2;
        boolean z;
        u08 u08Var;
        int v0;
        boolean o;
        int i;
        ArrayList<Integer> arrayList;
        int i2;
        int i3;
        d08 d08Var = this.M;
        if (d08Var != null) {
            TLRPC.Chat chat = this.x0;
            wgb wgbVar3 = this.O;
            if ((wgbVar3 != null && wgbVar3.getVisibility() == 0) || (((wgbVar = this.R) != null && wgbVar.getVisibility() == 0) || ((hc2.n0(this.x0) && hc2.N(this.x0)) || ((wgbVar2 = this.N) != null && wgbVar2.getVisibility() == 0)))) {
                z = true;
            } else {
                z = false;
            }
            Paint paint = d08Var.n;
            int i4 = d08Var.a;
            wjb wjbVar = d08Var.d;
            if (chat != null) {
                d08Var.w = z;
                da7 da7Var = null;
                d08Var.r = new tgb(vu3.m(chat.title, bkb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gl.o());
                u08 u08Var2 = d08Var.x;
                if (u08Var2 != null) {
                    u08Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i5 = u08.j;
                    int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
                    u08Var = new u08(i6, i6, i6, tL_emojiStatusCollectible.document_id);
                    d08Var.x = u08Var;
                } else {
                    if (hc2.I(chat) >= 0) {
                        u08 c = u08.c(i4, hc2.I(chat));
                        c.a = gl.L(11.0f);
                        c.d();
                        u08Var = c;
                    } else {
                        u08Var = null;
                    }
                    d08Var.x = u08Var;
                }
                if (u08Var != null) {
                    u08Var.e(d08Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (wjbVar != null) {
                        o = wjbVar.a();
                    } else {
                        o = bkb.I.o();
                    }
                    if (o && (tL_peerColorCollectible.flags & 1) != 0) {
                        i = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i = tL_peerColorCollectible.accent_color;
                    }
                    if (!o || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    if (arrayList.size() >= 2) {
                        i2 = arrayList.get(1).intValue() | (-16777216);
                    } else {
                        i2 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i3 = arrayList.get(2).intValue() | (-16777216);
                    } else {
                        i3 = intValue;
                    }
                    d08Var.r.m(i);
                    paint.setColor(bkb.p1(0.1f, i));
                    u08 u08Var3 = new u08(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
                    u08Var3.a = gl.L(11.0f);
                    u08Var3.d();
                    d08Var.y = u08Var3;
                    u08Var3.e(d08Var);
                    return;
                }
                int F = hc2.F(chat);
                if (F < 7) {
                    int i7 = bkb.q8[F];
                    d08Var.s = i7;
                    v0 = bkb.v0(i7, wjbVar);
                } else {
                    ea7 ea7Var = na7.q1(y6c.t0).E3;
                    if (ea7Var != null) {
                        da7Var = ea7Var.d(F);
                    }
                    if (da7Var != null) {
                        d08Var.s = -1;
                        v0 = da7Var.f();
                    } else {
                        int i8 = bkb.q8[0];
                        d08Var.s = i8;
                        v0 = bkb.v0(i8, wjbVar);
                    }
                }
                d08Var.r.m(v0);
                paint.setColor(bkb.p1(0.1f, v0));
                u08 a = u08.a(i4, F);
                a.a = gl.L(11.0f);
                a.d();
                d08Var.y = a;
                a.e(d08Var);
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.s;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        rt3 rt3Var = this.w;
        if (rt3Var != null) {
            String obj = rt3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(boolean z, boolean z2) {
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        int i3;
        int i4;
        int i5;
        boolean z8;
        boolean z9;
        int i6;
        boolean z10;
        int i7;
        String str;
        int i8;
        boolean z11;
        boolean z12;
        float f;
        float f2;
        int i9;
        wgb wgbVar;
        TLRPC.ChatFull chatFull;
        String str2;
        int i10;
        String M0;
        wgb wgbVar2;
        wgb wgbVar3;
        boolean z13;
        wgb wgbVar4;
        wgb wgbVar5;
        boolean z14;
        String str3;
        int i11;
        String format;
        wgb wgbVar6;
        wgb wgbVar7;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        wgb wgbVar8;
        wgb wgbVar9;
        wgb wgbVar10;
        TLRPC.Chat K0;
        if (z && (K0 = getMessagesController().K0(Long.valueOf(this.w0))) != null) {
            this.x0 = K0;
        }
        boolean t0 = hc2.t0(this.x0);
        mhb mhbVar = this.Q;
        if (mhbVar != null) {
            if (this.J == null && (((wgbVar8 = this.K) == null || wgbVar8.getVisibility() != 0) && (((wgbVar9 = this.O) == null || wgbVar9.getVisibility() != 0) && ((wgbVar10 = this.I) == null || wgbVar10.getVisibility() != 0)))) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            mhbVar.setVisibility(i13);
        }
        wgb wgbVar11 = this.Z;
        if (wgbVar11 != null) {
            if (hc2.T(this.x0)) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            wgbVar11.setVisibility(i12);
        }
        wgb wgbVar12 = this.K;
        if (wgbVar12 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 != null && (this.J0 || chatFull2.linked_chat_id != 0)) {
                wgbVar12.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(k96.M0(2131751377, "Discussion"), k96.M0(2131751369, "DiscussionInfoShort"), false, 2131232117, true);
                } else {
                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(this.y0.linked_chat_id));
                    if (K02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = hc2.K(K02, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        wgb wgbVar13 = this.K;
                        if (isEmpty) {
                            wgbVar13.u(k96.M0(2131751377, "Discussion"), K02.title, false, 2131232117, true);
                        } else {
                            wgbVar13.u(k96.M0(2131751377, "Discussion"), b00.h("@", K), false, 2131232117, true);
                        }
                    } else {
                        String K2 = hc2.K(K02, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        wgb wgbVar14 = this.K;
                        if (isEmpty2) {
                            String M02 = k96.M0(2131748691, "LinkedChannel");
                            String str4 = K02.title;
                            wgb wgbVar15 = this.R;
                            if (wgbVar15 != null && wgbVar15.getVisibility() == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            wgbVar14.u(M02, str4, false, 2131232093, z17);
                        } else {
                            String M03 = k96.M0(2131748691, "LinkedChannel");
                            String h = b00.h("@", K2);
                            wgb wgbVar16 = this.R;
                            if (wgbVar16 != null && wgbVar16.getVisibility() == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            wgbVar14.u(M03, h, false, 2131232093, z16);
                        }
                    }
                }
            } else {
                wgbVar12.setVisibility(8);
            }
        }
        wgb wgbVar17 = this.I;
        if (wgbVar17 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                wgbVar17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z18 = channelLocation instanceof TLRPC.TL_channelLocation;
                wgb wgbVar18 = this.I;
                if (z18) {
                    wgbVar18.q(k96.M0(2131753958, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    wgbVar18.q(k96.M0(2131753958, "AttachLocation"), "Unknown address", z2, true);
                }
            } else {
                wgbVar17.setVisibility(8);
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t0) {
                    format = k96.M0(2131743690, "TypeLocationGroupEdit");
                } else {
                    format = String.format(b00.j(new StringBuilder("https://"), getMessagesController().N2, "/%s"), hc2.K(this.x0, false));
                }
                String str5 = format;
                wgb wgbVar19 = this.J;
                String M04 = k96.M0(2131743691, "TypeLocationGroup");
                wgb wgbVar20 = this.O;
                if ((wgbVar20 != null && wgbVar20.getVisibility() == 0) || (((wgbVar6 = this.K) != null && wgbVar6.getVisibility() == 0) || ((wgbVar7 = this.R) != null && wgbVar7.getVisibility() == 0))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                wgbVar19.u(M04, str5, false, 2131232093, z15);
            } else {
                boolean z19 = this.x0.noforwards;
                if (this.J0) {
                    if (!t0) {
                        if (z19) {
                            str3 = "TypePrivateRestrictedForwards";
                            i11 = 2131743682;
                        } else {
                            str3 = "TypePrivate";
                            i11 = 2131743685;
                        }
                    } else {
                        str3 = "TypePublic";
                        i11 = 2131743681;
                    }
                    M0 = k96.M0(i11, str3);
                } else {
                    if (!t0) {
                        if (z19) {
                            str2 = "TypePrivateGroupRestrictedForwards";
                            i10 = 2131743683;
                        } else {
                            str2 = "TypePrivateGroup";
                            i10 = 2131743684;
                        }
                    } else {
                        str2 = "TypePublicGroup";
                        i10 = 2131743680;
                    }
                    M0 = k96.M0(i10, str2);
                }
                String str6 = M0;
                boolean z20 = this.J0;
                wgb wgbVar21 = this.J;
                if (z20) {
                    String M05 = k96.M0(2131752264, "ChannelType");
                    wgb wgbVar22 = this.O;
                    if ((wgbVar22 != null && wgbVar22.getVisibility() == 0) || (((wgbVar4 = this.K) != null && wgbVar4.getVisibility() == 0) || ((wgbVar5 = this.R) != null && wgbVar5.getVisibility() == 0))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    wgbVar21.u(M05, str6, false, 2131232093, z14);
                } else {
                    String M06 = k96.M0(2131749200, "GroupType");
                    wgb wgbVar23 = this.O;
                    if ((wgbVar23 != null && wgbVar23.getVisibility() == 0) || (((wgbVar2 = this.K) != null && wgbVar2.getVisibility() == 0) || ((wgbVar3 = this.R) != null && wgbVar3.getVisibility() == 0))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    wgbVar21.u(M06, str6, false, 2131232180, z13);
                }
            }
        }
        if (this.O != null) {
            if (this.K0 && !this.F0) {
                str = "ChatHistoryHidden";
                i8 = 2131752220;
            } else {
                str = "ChatHistoryVisible";
                i8 = 2131752216;
            }
            String M07 = k96.M0(i8, str);
            wgb wgbVar24 = this.O;
            String M08 = k96.M0(2131752217, "ChatHistoryShort");
            if (this.R != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            wgbVar24.u(M08, M07, z2, 2131232117, z11);
            this.O.setEnabled(!this.F0);
            if (!this.F0 && !t0 && ((chatFull = this.y0) == null || (chatFull.linked_chat_id == 0 && !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z12 = true;
            } else {
                z12 = false;
            }
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f3 = 0.0f;
            if (this.O.getAlpha() <= 0.0f && !z12) {
                this.O.setVisibility(8);
                s0();
            } else {
                float f4 = 1.0f;
                if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z12) {
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    boolean z21 = false;
                    while (i14 < this.G.getChildCount()) {
                        LinearLayout linearLayout = this.G;
                        if (!z21) {
                            if (linearLayout.getChildAt(i14) == this.O) {
                                z21 = true;
                            }
                        } else {
                            arrayList.add(linearLayout.getChildAt(i14));
                        }
                        i14++;
                        z21 = z21;
                    }
                    int i15 = 0;
                    boolean z22 = false;
                    while (i15 < this.x.getChildCount()) {
                        t1 t1Var = this.x;
                        if (!z22) {
                            if (t1Var.getChildAt(i15) == this.G) {
                                z22 = true;
                            }
                        } else {
                            arrayList.add(t1Var.getChildAt(i15));
                        }
                        i15++;
                        z22 = z22;
                    }
                    if (this.O.getVisibility() != 0) {
                        this.O.setAlpha(0.0f);
                        this.O.setTranslationY((-wgbVar.getHeight()) / 2.0f);
                    }
                    this.O.setVisibility(0);
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        ((View) arrayList.get(i16)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                    }
                    wgb wgbVar25 = this.O;
                    if (z2) {
                        float alpha = wgbVar25.getAlpha();
                        if (z12) {
                            f3 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f3);
                        this.T0 = ofFloat;
                        ofFloat.addUpdateListener(new pk(this, arrayList, (byte) 8));
                        this.T0.addListener(new qw(this, z12, arrayList, (byte) 2));
                        this.T0.setDuration(320L);
                        this.T0.setInterpolator(s33.h);
                        this.T0.start();
                    } else {
                        if (z12) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        wgbVar25.setAlpha(f);
                        wgb wgbVar26 = this.O;
                        float f5 = (-wgbVar26.getHeight()) / 2.0f;
                        if (z12) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        wgbVar26.setTranslationY(f5 * f2);
                        wgb wgbVar27 = this.O;
                        if (!z12) {
                            f4 = 0.0f;
                        }
                        wgbVar27.setScaleY((f4 * 0.8f) + 0.2f);
                        wgb wgbVar28 = this.O;
                        if (z12) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        wgbVar28.setVisibility(i9);
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            ((View) arrayList.get(i17)).setTranslationY(0.0f);
                        }
                        this.T0 = null;
                    }
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                wgb wgbVar29 = this.V;
                if (wgbVar29 != null) {
                    if (wgbVar29.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, nme.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    wgb wgbVar30 = this.V;
                    if (this.y0.requests_pending > 0) {
                        i7 = i;
                    } else {
                        i7 = 8;
                    }
                    wgbVar30.setVisibility(i7);
                } else {
                    i = 0;
                }
                if (this.J0 && !hc2.Y(this.x0)) {
                    wgb wgbVar31 = this.U;
                    String M09 = k96.M0(2131752277, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i] = Integer.valueOf(this.y0.participants_count);
                    wgbVar31.u(M09, String.format("%d", objArr), false, 2131232180, true);
                    wgb wgbVar32 = this.Y;
                    CharSequence M010 = k96.M0(2131752441, null);
                    TLRPC.ChatFull chatFull5 = this.y0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    wgb wgbVar33 = this.Z;
                    if (wgbVar33 != null && wgbVar33.getVisibility() == 0) {
                        z10 = 1;
                    } else {
                        z10 = i;
                    }
                    wgbVar32.u(M010, format2, false, 2131232420, z10);
                    z3 = z2;
                } else {
                    boolean T = hc2.T(this.x0);
                    wgb wgbVar34 = this.U;
                    if (T) {
                        CharSequence M011 = k96.M0(2131752365, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i] = Integer.valueOf(this.y0.participants_count);
                        wgbVar34.u(M011, String.format("%d", objArr3), false, 2131232180, true);
                    } else {
                        CharSequence M012 = k96.M0(2131752365, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(this.y0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.V.getVisibility() == 0) {
                            z7 = 1;
                        } else {
                            z7 = i;
                        }
                        wgbVar34.u(M012, format3, false, 2131232180, z7);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (chat.gigagroup && !hc2.Y(chat)) {
                        wgb wgbVar35 = this.Y;
                        CharSequence M013 = k96.M0(2131752441, null);
                        TLRPC.ChatFull chatFull6 = this.y0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        wgb wgbVar36 = this.Z;
                        if (wgbVar36 != null && wgbVar36.getVisibility() == 0) {
                            z9 = 1;
                        } else {
                            z9 = i;
                        }
                        wgbVar35.u(M013, format4, false, 2131232420, z9);
                        z3 = z2;
                    } else {
                        if (this.F0) {
                            i3 = 16;
                        } else {
                            i3 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i18 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i18++;
                            }
                            i4 = kf2.n0(tL_chatBannedRights) + i18;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i4++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i4++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i4++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i4++;
                            }
                            i5 = i3;
                        } else {
                            i4 = i3;
                            i5 = i4;
                        }
                        wgb wgbVar37 = this.Y;
                        String M014 = k96.M0(2131752321, null);
                        Integer valueOf = Integer.valueOf(i4);
                        Integer valueOf2 = Integer.valueOf(i5);
                        Object[] objArr6 = new Object[2];
                        objArr6[i] = valueOf;
                        objArr6[1] = valueOf2;
                        wgbVar37.u(M014, String.format("%d/%d", objArr6), z2, 2131232281, true);
                        z3 = z2;
                    }
                    wgb wgbVar38 = this.V;
                    if (wgbVar38 != null) {
                        CharSequence M015 = k96.M0(2131748443, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        wgb wgbVar39 = this.Z;
                        if (wgbVar39 != null && wgbVar39.getVisibility() == 0) {
                            z8 = 1;
                        } else {
                            z8 = i;
                        }
                        wgbVar38.u(M015, format5, false, 2131232345, z8);
                    }
                }
                wgb wgbVar40 = this.X;
                String M016 = k96.M0(2131752505, "ChannelAdministrators");
                boolean T2 = hc2.T(this.x0);
                TLRPC.ChatFull chatFull7 = this.y0;
                if (T2) {
                    i6 = chatFull7.admins_count;
                } else if (chatFull7 == null) {
                    i6 = 1;
                } else {
                    int size = chatFull7.participants.participants.size();
                    int i19 = i;
                    int i20 = i19;
                    while (i19 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i19);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            i20++;
                        }
                        i19++;
                    }
                    i6 = i20;
                }
                Object[] objArr8 = new Object[1];
                objArr8[i] = Integer.valueOf(i6);
                wgbVar40.u(M016, String.format("%d", objArr8), false, 2131232054, true);
            } else {
                z3 = z2;
                i = 0;
                if (this.J0 && !hc2.Y(this.x0)) {
                    this.U.o(2131232180, k96.M0(2131752277, "ChannelSubscribers"), true);
                    wgb wgbVar41 = this.Y;
                    String M017 = k96.M0(2131752441, null);
                    wgb wgbVar42 = this.Z;
                    if (wgbVar42 != null && wgbVar42.getVisibility() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    wgbVar41.o(2131232095, M017, z6);
                } else {
                    wgb wgbVar43 = this.U;
                    String M018 = k96.M0(2131752365, "ChannelMembers");
                    wgb wgbVar44 = this.Z;
                    if (wgbVar44 != null && wgbVar44.getVisibility() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    wgbVar43.o(2131232180, M018, z4);
                    boolean z23 = this.x0.gigagroup;
                    wgb wgbVar45 = this.Y;
                    if (z23) {
                        String M019 = k96.M0(2131752441, null);
                        wgb wgbVar46 = this.Z;
                        if (wgbVar46 != null && wgbVar46.getVisibility() == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wgbVar45.o(2131232095, M019, z5);
                    } else {
                        wgbVar45.o(2131232281, k96.M0(2131752321, null), true);
                    }
                }
                this.X.o(2131232054, k96.M0(2131752505, "ChannelAdministrators"), true);
            }
            wgb wgbVar47 = this.P;
            if (hc2.w(1, this.x0)) {
                i2 = i;
            } else {
                i2 = 8;
            }
            wgbVar47.setVisibility(i2);
            w0(z3);
            if (this.y0 != null && hc2.y(3, this.x0) && (!t0 || !this.x0.creator)) {
                int i21 = this.y0.invitesCount;
                wgb wgbVar48 = this.W;
                if (i21 > 0) {
                    wgbVar48.u(k96.M0(2131748948, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, 2131232209, true);
                } else {
                    wgbVar48.u(k96.M0(2131748948, "InviteLinks"), "1", false, 2131232209, true);
                }
            } else {
                this.W.setVisibility(8);
            }
        }
        if (this.L != null) {
            x0(null);
        }
    }

    public final void u0(boolean z) {
        cj3 cj3Var;
        rh3 rh3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof mu1) {
                    mu1 mu1Var = (mu1) fragmentStack.get(i);
                    if (mu1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(mu1Var, false);
                        mu1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, mu1Var)) {
                            kk7.e().j(mu1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new qvb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof qvb)) {
                    qvb qvbVar = (qvb) fragmentStack.get(i);
                    if (qvbVar.f() != null && qvbVar.f().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(qvbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof cj3) && (cj3Var = (cj3) fragmentStack.get(i)) != null && (rh3Var = cj3Var.H3) != null && rh3Var.c()) {
                    cj3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i2);
                i2++;
                if (tL_username.active) {
                    i++;
                }
            }
            this.l0.u(k96.M0(2131752992, null), k96.a0(null, null, 2131752991, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, 2131232209, true);
            return;
        }
        this.l0.u(k96.M0(2131752993, null), "t.me/" + this.D0.username, false, 2131232209, true);
    }

    public final void w0(boolean z) {
        String str;
        String str2;
        TLRPC.ChatFull L0 = getMessagesController().L0(this.w0);
        boolean V = hc2.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i = 0;
                for (int i2 = 0; i2 < tL_chatReactionsSome.reactions.size(); i2++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i2);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i++;
                    }
                }
                if (V) {
                    if (L0 != null && L0.paid_reactions_available) {
                        i++;
                    }
                    if (i == 0) {
                        str2 = k96.M0(2131746186, null);
                    } else {
                        str2 = String.valueOf(i);
                    }
                } else {
                    int min = Math.min(getMediaDataController().n.size(), i);
                    if (min == 0) {
                        str2 = k96.M0(2131746186, null);
                    } else {
                        str2 = k96.a0(null, null, 2131746191, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
                    }
                }
            } else {
                str2 = k96.M0(2131746193, null);
            }
        } else {
            String M0 = k96.M0(2131746186, null);
            if (L0 != null && L0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = M0;
                this.P.u(k96.M0(2131746194, null), str, z, 2131232329, true);
            }
        }
        str = str2;
        this.P.u(k96.M0(2131746194, null), str, z, 2131232329, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(Long l) {
        boolean z;
        TLRPC.Chat chat = this.x0;
        if (chat != null && this.L != null) {
            long j = 0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = chat.broadcast_messages_allowed;
            }
            if (z) {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.x0.linked_monoforum_id));
                if (l != null) {
                    j = l.longValue();
                } else if (K0 != null) {
                    j = K0.send_paid_messages_stars;
                }
                this.L.u(k96.M0(2131746903, null), jva.a1(false, k96.a0(null, null, 2131746877, Long.valueOf(j)), 0.66f, null), false, 2131232221, true);
                return;
            }
            this.L.u(k96.M0(2131746903, null), k96.M0(2131746893, null), false, 2131232221, true);
        }
    }

    @Override
    public final void T() {
    }
}
