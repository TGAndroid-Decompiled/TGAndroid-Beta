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
public class ba2 extends d implements vn5, jm7 {
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
    public bba H;
    public boolean H0;
    public xib I;
    public boolean I0;
    public xib J;
    public boolean J0;
    public xib K;
    public boolean K0;
    public xib L;
    public TLRPC.ChatReactions L0;
    public g28 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public xib N;
    public boolean N0;
    public xib O;
    public boolean O0;
    public xib P;
    public boolean P0;
    public njb Q;
    public final ArrayList Q0;
    public xib R;
    public final y92 R0;
    public LinearLayout S;
    public p09 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public xib U;
    public xib V;
    public xib W;
    public xib X;
    public xib Y;
    public xib Z;
    public uja a;
    public xib a0;
    public he b;
    public xib b0;
    public UndoView c;
    public z92 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public kc0 e;
    public vkb e0;
    public a91 f;
    public xib f0;
    public xib g0;
    public AnimatorSet h;
    public ro2 h0;
    public njb i0;
    public xib j0;
    public njb k0;
    public xib l0;
    public xib m0;
    public RadialProgressView n;
    public xib n0;
    public xib o0;
    public xib p0;
    public xib q0;
    public final pc0 r;
    public xib r0;
    public final wn5 s;
    public njb s0;
    public njb t0;
    public xib u0;
    public TLRPC.FileLocation v0;
    public cv3 w;
    public long w0;
    public t1 x;
    public TLRPC.Chat x0;
    public ww9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public ba2(Bundle bundle) {
        super(bundle);
        int i;
        this.Q0 = new ArrayList();
        this.R0 = new y92(this);
        this.r = new pc0((ylb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 != 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w0));
            if (L0 != null && sd2.V(L0)) {
                i = 1;
            } else {
                i = 2;
            }
            this.s = new wn5(i, true, true);
            return;
        }
        this.s = new wn5(0, false, false);
    }

    public static rja Z(ba2 ba2Var) {
        return ba2Var.simpleActionBar;
    }

    public static rja a0(ba2 ba2Var) {
        return ba2Var.simpleActionBar;
    }

    public static SpannableStringBuilder b0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        of4 of4Var = new of4(10);
        of4Var.a.setTypeface(gm.n1("fonts/num.otf"));
        of4Var.f = cmb.w0(null, cmb.Bk, false);
        of4Var.n = false;
        spannableStringBuilder.setSpan(of4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String e0(TLRPC.User user) {
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
        gm.c3(new xi1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
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
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final boolean c0(boolean z) {
        cv3 cv3Var;
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
            cv3 cv3Var2 = this.w;
            if ((cv3Var2 != null && !this.D0.first_name.equals(cv3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131743413, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131752936, null);
                    alertDialog$Builder.j(jb6.M0(2131754181, null), new u92(this, (byte) 0));
                    alertDialog$Builder.g(jb6.M0(2131747313, null), new u92(this, (byte) 1));
                    showDialog(heVar);
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
        if ((chatFull != null && sd2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((cv3Var = this.w) != null && !this.x0.title.equals(cv3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = jb6.M0(2131743413, "UserRestrictionsApplyChanges");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                if (this.J0) {
                    heVar2.U = jb6.M0(2131752243, "ChannelSettingsChangedAlert");
                } else {
                    heVar2.U = jb6.M0(2131749158, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(jb6.M0(2131754181, "ApplyTheme"), new u92(this, (byte) 2));
                alertDialog$Builder2.g(jb6.M0(2131747313, "PassportDiscard"), new u92(this, (byte) 3));
                showDialog(heVar2);
            }
            return false;
        }
        return true;
    }

    @Override
    public final android.view.View createView(android.content.Context r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba2.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList != null && !arrayList.isEmpty()) {
            k47 k47Var = (k47) b10.f(1, arrayList);
            if (!TextUtils.isEmpty(k47Var.z)) {
                str = k47Var.z.toString();
            } else if (!TextUtils.isEmpty(k47Var.v)) {
                str = k47Var.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = jb6.M0(2131742555, null);
        }
        this.f0.u(jb6.M0(2131742561, null), str, false, 2131231931, true);
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba2.didReceivedNotification(int, int, java.lang.Object[]):void");
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

    public final void f0() {
        vi1 vi1Var = new vi1(-this.x0.id);
        vi1Var.m0 = this;
        presentFragment(vi1Var);
        oc7.r1(this.currentAccount).X3.edit().putInt("boostingappearance", oc7.r1(this.currentAccount).X3.getInt("boostingappearance", 0) + 1).apply();
    }

    public final void g0(he heVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, vh1 vh1Var) {
        heVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        i46 i46Var = new i46(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        i46Var.r1(vh1Var);
        i46Var.q1(tL_premium_boostsStatus, true);
        i46Var.s1(j);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
        if (L0 != null) {
            i46Var.L2 = new lx1(this, L0, (byte) 27);
        }
        showDialog(i46Var);
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override
    public final ww9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z92 z92Var = this.c0;
        int i = cmb.h6;
        arrayList.add(new cnb(z92Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.c0, 4, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.c0, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        arrayList.add(new cnb(this.U, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        xib xibVar = this.V;
        if (xibVar != null) {
            arrayList.add(new cnb(xibVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        arrayList.add(new cnb(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.Z, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.J, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        LinearLayout linearLayout = this.E;
        int i2 = cmb.c6;
        arrayList.add(new cnb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.e0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.e0, 4, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.P, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        xib xibVar2 = this.L;
        if (xibVar2 != null) {
            arrayList.add(new cnb(xibVar2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        xib xibVar3 = this.b0;
        if (xibVar3 != null) {
            arrayList.add(new cnb(xibVar3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        return arrayList;
    }

    public final void h0(FrameLayout frameLayout, View view) {
        SpannableStringBuilder S2;
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                S2 = gm.S2(jb6.M0(2131752218, "ChannelTopicsDiscussionForbidden"));
            } else {
                S2 = gm.S2(jb6.G(getMessagesController().l4.o1.f(), "ChannelTopicsForbidden", new Object[0]));
            }
            c41.b0(this).Q(2131624290, 36, S2).j();
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
        qp0 qp0Var = new qp0(this, view, (byte) 1);
        dVar.c = z;
        dVar.d = z2;
        dVar.e = z3;
        dVar.h = qp0Var;
        presentFragment((d) dVar);
    }

    public final void i0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = td4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        nk3 nk3Var = new nk3(j);
        nk3Var.setCurrentAccount(i);
        nk3Var.E2 = new cg(nk3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(nk3Var);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(long j, long j2) {
        oc7.r1(this.currentAccount).V2(j, j2, true, false, new h92(this, (byte) 1));
    }

    public final void k0() {
        this.P0 = true;
        nm7 f = nm7.f(this.currentAccount);
        int i = oc7.s5;
        f.k(2, 2);
    }

    public final void l0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            oc7.r1(this.currentAccount).x(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().n1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new t92(this, (byte) 2));
        }
        s0(false, true);
        kc0 kc0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        kc0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new t92(this, (byte) 0));
    }

    public final void n0() {
        boolean z;
        if (this.v0 != null) {
            z = true;
        } else {
            z = false;
        }
        this.s.n(z, new v92(this, (byte) 0), new n1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void o0() {
        cv3 cv3Var;
        boolean z;
        boolean z2;
        String str;
        String str2;
        if (!this.O0 && (cv3Var = this.w) != null) {
            if (cv3Var.a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                gm.z3(this.w);
                return;
            }
            boolean z3 = true;
            this.O0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().p1(this.D0);
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
                this.b = new he(3, null, getParentActivity());
                this.b.setOnCancelListener(new fu0(this, getConnectionsManager().sendRequest(setbotinfo, new pm(this, setbotinfo, (byte) 20)), (byte) 4));
                this.b.show();
            } else if (!sd2.T(this.x0) && (!this.K0 || this.F0)) {
                getMessagesController().P(getParentActivity(), this.w0, this, new u92(this, (byte) 5), null);
            } else {
                if (this.y0 != null && sd2.T(this.x0)) {
                    TLRPC.ChatFull chatFull = this.y0;
                    boolean z4 = chatFull.hidden_prehistory;
                    boolean z5 = this.K0;
                    if (z4 != z5) {
                        chatFull.hidden_prehistory = z5;
                        getMessagesController().j5(this.w0, this.K0);
                    }
                }
                if (this.s.g()) {
                    this.N0 = true;
                    he heVar = new he(3, null, getParentActivity());
                    this.b = heVar;
                    heVar.setOnCancelListener(new ct0(this, (byte) 5));
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
                    oc7 messagesController = getMessagesController();
                    long j = this.w0;
                    String obj = this.F.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.y0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.i1(-j);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new i65(messagesController, chatFull3, obj, (byte) 21), 64);
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
                    getMessagesController().i5(this.w0, this.F0, this.H0, this.I0);
                    if (this.F0 && !this.H0 && (z3 || z)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i = 0; i < fragmentStack.size(); i++) {
                            if ((fragmentStack.get(i) instanceof yv1) && ((yv1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                                ((ActionBarLayout) getParentLayout()).a0(i);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.w0);
                                tk5 parentLayout = getParentLayout();
                                HashSet hashSet = sxb.s1;
                                ((ActionBarLayout) parentLayout).b(i, sxb.F0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z || z2) {
                        v0(z);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.w;
        if (cv3Var != null && cv3Var.e) {
            if (z) {
                cv3Var.k(true);
                return false;
            }
            return false;
        }
        return c0(z);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba2.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wn5 wn5Var = this.s;
        if (wn5Var != null) {
            wn5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, nm7.T);
            getNotificationCenter().n(this, nm7.v5);
            getNotificationCenter().n(this, nm7.b5);
            getNotificationCenter().n(this, nm7.O3);
        } else {
            getNotificationCenter().n(this, nm7.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, nm7.E3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.y1);
        getNotificationCenter().n(this, nm7.b1);
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.o();
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
            ((vm) obj).n(null);
        }
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.r();
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
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            cv3Var.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        gm.V2(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                anb.l(editTextBoldCursor, 30, cmb.F6, null);
            }
            kc0 kc0Var = this.e;
            if (kc0Var != null) {
                kc0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba2.p0():void");
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        boolean z;
        vm vmVar;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().L0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            if (sd2.T(chat) && !this.y0.hidden_prehistory) {
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
            if (chatFull2 != null && sd2.V(chat2)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                vmVar = vm.l(z8c.t0, vm.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            vmVar = vm.m(z8c.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, vm.f());
                        } else {
                            vmVar = null;
                        }
                        if (vmVar != null) {
                            arrayList2.add(vmVar);
                            vmVar.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = hs6.d0(z8c.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            vm l = vm.l(z8c.t0, vm.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().l4.C2.f && sd2.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        d0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i;
        TL_bots.BotInfo botInfo2;
        boolean z;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User W1;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                if (j == 0) {
                    W1 = null;
                } else {
                    W1 = getMessagesController().W1(Long.valueOf(j));
                }
                this.D0 = W1;
            }
            xib xibVar = this.o0;
            int i2 = 0;
            if (xibVar != null) {
                if (this.E0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                xibVar.h(45, z, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    xib xibVar2 = this.o0;
                    if (userFull2.starref_program == null) {
                        format = jb6.M0(2131754342, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    xibVar2.w(format, false);
                }
            }
            xib xibVar3 = this.u0;
            if (xibVar3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                xibVar3.setVisibility(i);
            }
            njb njbVar = this.t0;
            if (njbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i2 = 8;
                }
                njbVar.setVisibility(i2);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.s;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z, boolean z2) {
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
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.s;
        if (wn5Var != null && (str = wn5Var.f) != null) {
            bundle.putString("path", str);
        }
        cv3 cv3Var = this.w;
        if (cv3Var != null) {
            String obj = cv3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        xib xibVar;
        xib xibVar2;
        boolean z;
        x28 x28Var;
        int v0;
        boolean o;
        int i;
        ArrayList<Integer> arrayList;
        int i2;
        int i3;
        g28 g28Var = this.M;
        if (g28Var != null) {
            TLRPC.Chat chat = this.x0;
            xib xibVar3 = this.O;
            if ((xibVar3 != null && xibVar3.getVisibility() == 0) || (((xibVar = this.R) != null && xibVar.getVisibility() == 0) || ((sd2.n0(this.x0) && sd2.N(this.x0)) || ((xibVar2 = this.N) != null && xibVar2.getVisibility() == 0)))) {
                z = true;
            } else {
                z = false;
            }
            Paint paint = g28Var.n;
            int i4 = g28Var.a;
            ylb ylbVar = g28Var.d;
            if (chat != null) {
                g28Var.w = z;
                ec7 ec7Var = null;
                g28Var.r = new uib(gw3.m(chat.title, cmb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gm.o());
                x28 x28Var2 = g28Var.x;
                if (x28Var2 != null) {
                    x28Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i5 = x28.j;
                    int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
                    x28Var = new x28(i6, i6, i6, tL_emojiStatusCollectible.document_id);
                    g28Var.x = x28Var;
                } else {
                    if (sd2.I(chat) >= 0) {
                        x28 c = x28.c(i4, sd2.I(chat));
                        c.a = gm.L(11.0f);
                        c.d();
                        x28Var = c;
                    } else {
                        x28Var = null;
                    }
                    g28Var.x = x28Var;
                }
                if (x28Var != null) {
                    x28Var.e(g28Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (ylbVar != null) {
                        o = ylbVar.a();
                    } else {
                        o = cmb.I.o();
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
                    g28Var.r.m(i);
                    paint.setColor(cmb.p1(0.1f, i));
                    x28 x28Var3 = new x28(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
                    x28Var3.a = gm.L(11.0f);
                    x28Var3.d();
                    g28Var.y = x28Var3;
                    x28Var3.e(g28Var);
                    return;
                }
                int F = sd2.F(chat);
                if (F < 7) {
                    int i7 = cmb.q8[F];
                    g28Var.s = i7;
                    v0 = cmb.v0(i7, ylbVar);
                } else {
                    fc7 fc7Var = oc7.r1(z8c.t0).E3;
                    if (fc7Var != null) {
                        ec7Var = fc7Var.d(F);
                    }
                    if (ec7Var != null) {
                        g28Var.s = -1;
                        v0 = ec7Var.f();
                    } else {
                        int i8 = cmb.q8[0];
                        g28Var.s = i8;
                        v0 = cmb.v0(i8, ylbVar);
                    }
                }
                g28Var.r.m(v0);
                paint.setColor(cmb.p1(0.1f, v0));
                x28 a = x28.a(i4, F);
                a.a = gm.L(11.0f);
                a.d();
                g28Var.y = a;
                a.e(g28Var);
            }
        }
    }

    public final void u0(boolean z, boolean z2) {
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
        xib xibVar;
        TLRPC.ChatFull chatFull;
        String str2;
        int i10;
        String M0;
        xib xibVar2;
        xib xibVar3;
        boolean z13;
        xib xibVar4;
        xib xibVar5;
        boolean z14;
        String str3;
        int i11;
        String format;
        xib xibVar6;
        xib xibVar7;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        xib xibVar8;
        xib xibVar9;
        xib xibVar10;
        TLRPC.Chat L0;
        if (z && (L0 = getMessagesController().L0(Long.valueOf(this.w0))) != null) {
            this.x0 = L0;
        }
        boolean t0 = sd2.t0(this.x0);
        njb njbVar = this.Q;
        if (njbVar != null) {
            if (this.J == null && (((xibVar8 = this.K) == null || xibVar8.getVisibility() != 0) && (((xibVar9 = this.O) == null || xibVar9.getVisibility() != 0) && ((xibVar10 = this.I) == null || xibVar10.getVisibility() != 0)))) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            njbVar.setVisibility(i13);
        }
        xib xibVar11 = this.Z;
        if (xibVar11 != null) {
            if (sd2.T(this.x0)) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            xibVar11.setVisibility(i12);
        }
        xib xibVar12 = this.K;
        if (xibVar12 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 != null && (this.J0 || chatFull2.linked_chat_id != 0)) {
                xibVar12.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(jb6.M0(2131751326, "Discussion"), jb6.M0(2131751318, "DiscussionInfoShort"), false, 2131232118, true);
                } else {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.y0.linked_chat_id));
                    if (L02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = sd2.K(L02, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        xib xibVar13 = this.K;
                        if (isEmpty) {
                            xibVar13.u(jb6.M0(2131751326, "Discussion"), L02.title, false, 2131232118, true);
                        } else {
                            xibVar13.u(jb6.M0(2131751326, "Discussion"), b10.h("@", K), false, 2131232118, true);
                        }
                    } else {
                        String K2 = sd2.K(L02, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        xib xibVar14 = this.K;
                        if (isEmpty2) {
                            String M02 = jb6.M0(2131748640, "LinkedChannel");
                            String str4 = L02.title;
                            xib xibVar15 = this.R;
                            if (xibVar15 != null && xibVar15.getVisibility() == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            xibVar14.u(M02, str4, false, 2131232094, z17);
                        } else {
                            String M03 = jb6.M0(2131748640, "LinkedChannel");
                            String h = b10.h("@", K2);
                            xib xibVar16 = this.R;
                            if (xibVar16 != null && xibVar16.getVisibility() == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            xibVar14.u(M03, h, false, 2131232094, z16);
                        }
                    }
                }
            } else {
                xibVar12.setVisibility(8);
            }
        }
        xib xibVar17 = this.I;
        if (xibVar17 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                xibVar17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z18 = channelLocation instanceof TLRPC.TL_channelLocation;
                xib xibVar18 = this.I;
                if (z18) {
                    xibVar18.q(jb6.M0(2131753926, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    xibVar18.q(jb6.M0(2131753926, "AttachLocation"), "Unknown address", z2, true);
                }
            } else {
                xibVar17.setVisibility(8);
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t0) {
                    format = jb6.M0(2131743616, "TypeLocationGroupEdit");
                } else {
                    format = String.format(b10.j(new StringBuilder("https://"), getMessagesController().N2, "/%s"), sd2.K(this.x0, false));
                }
                String str5 = format;
                xib xibVar19 = this.J;
                String M04 = jb6.M0(2131743617, "TypeLocationGroup");
                xib xibVar20 = this.O;
                if ((xibVar20 != null && xibVar20.getVisibility() == 0) || (((xibVar6 = this.K) != null && xibVar6.getVisibility() == 0) || ((xibVar7 = this.R) != null && xibVar7.getVisibility() == 0))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                xibVar19.u(M04, str5, false, 2131232094, z15);
            } else {
                boolean z19 = this.x0.noforwards;
                if (this.J0) {
                    if (!t0) {
                        if (z19) {
                            str3 = "TypePrivateRestrictedForwards";
                            i11 = 2131743608;
                        } else {
                            str3 = "TypePrivate";
                            i11 = 2131743611;
                        }
                    } else {
                        str3 = "TypePublic";
                        i11 = 2131743607;
                    }
                    M0 = jb6.M0(i11, str3);
                } else {
                    if (!t0) {
                        if (z19) {
                            str2 = "TypePrivateGroupRestrictedForwards";
                            i10 = 2131743609;
                        } else {
                            str2 = "TypePrivateGroup";
                            i10 = 2131743610;
                        }
                    } else {
                        str2 = "TypePublicGroup";
                        i10 = 2131743606;
                    }
                    M0 = jb6.M0(i10, str2);
                }
                String str6 = M0;
                boolean z20 = this.J0;
                xib xibVar21 = this.J;
                if (z20) {
                    String M05 = jb6.M0(2131752214, "ChannelType");
                    xib xibVar22 = this.O;
                    if ((xibVar22 != null && xibVar22.getVisibility() == 0) || (((xibVar4 = this.K) != null && xibVar4.getVisibility() == 0) || ((xibVar5 = this.R) != null && xibVar5.getVisibility() == 0))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    xibVar21.u(M05, str6, false, 2131232094, z14);
                } else {
                    String M06 = jb6.M0(2131749149, "GroupType");
                    xib xibVar23 = this.O;
                    if ((xibVar23 != null && xibVar23.getVisibility() == 0) || (((xibVar2 = this.K) != null && xibVar2.getVisibility() == 0) || ((xibVar3 = this.R) != null && xibVar3.getVisibility() == 0))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    xibVar21.u(M06, str6, false, 2131232181, z13);
                }
            }
        }
        if (this.O != null) {
            if (this.K0 && !this.F0) {
                str = "ChatHistoryHidden";
                i8 = 2131752169;
            } else {
                str = "ChatHistoryVisible";
                i8 = 2131752165;
            }
            String M07 = jb6.M0(i8, str);
            xib xibVar24 = this.O;
            String M08 = jb6.M0(2131752166, "ChatHistoryShort");
            if (this.R != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            xibVar24.u(M08, M07, z2, 2131232118, z11);
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
                t0();
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
                        this.O.setTranslationY((-xibVar.getHeight()) / 2.0f);
                    }
                    this.O.setVisibility(0);
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        ((View) arrayList.get(i16)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                    }
                    xib xibVar25 = this.O;
                    if (z2) {
                        float alpha = xibVar25.getAlpha();
                        if (z12) {
                            f3 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f3);
                        this.T0 = ofFloat;
                        ofFloat.addUpdateListener(new pl(this, arrayList, (byte) 8));
                        this.T0.addListener(new qx(this, z12, arrayList, (byte) 2));
                        this.T0.setDuration(320L);
                        this.T0.setInterpolator(d53.h);
                        this.T0.start();
                    } else {
                        if (z12) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        xibVar25.setAlpha(f);
                        xib xibVar26 = this.O;
                        float f5 = (-xibVar26.getHeight()) / 2.0f;
                        if (z12) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        xibVar26.setTranslationY(f5 * f2);
                        xib xibVar27 = this.O;
                        if (!z12) {
                            f4 = 0.0f;
                        }
                        xibVar27.setScaleY((f4 * 0.8f) + 0.2f);
                        xib xibVar28 = this.O;
                        if (z12) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        xibVar28.setVisibility(i9);
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
                xib xibVar29 = this.V;
                if (xibVar29 != null) {
                    if (xibVar29.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, qoe.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    xib xibVar30 = this.V;
                    if (this.y0.requests_pending > 0) {
                        i7 = i;
                    } else {
                        i7 = 8;
                    }
                    xibVar30.setVisibility(i7);
                } else {
                    i = 0;
                }
                if (this.J0 && !sd2.Y(this.x0)) {
                    xib xibVar31 = this.U;
                    String M09 = jb6.M0(2131752227, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i] = Integer.valueOf(this.y0.participants_count);
                    xibVar31.u(M09, String.format("%d", objArr), false, 2131232181, true);
                    xib xibVar32 = this.Y;
                    CharSequence M010 = jb6.M0(2131752399, null);
                    TLRPC.ChatFull chatFull5 = this.y0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    xib xibVar33 = this.Z;
                    if (xibVar33 != null && xibVar33.getVisibility() == 0) {
                        z10 = 1;
                    } else {
                        z10 = i;
                    }
                    xibVar32.u(M010, format2, false, 2131232421, z10);
                    z3 = z2;
                } else {
                    boolean T = sd2.T(this.x0);
                    xib xibVar34 = this.U;
                    if (T) {
                        CharSequence M011 = jb6.M0(2131752321, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i] = Integer.valueOf(this.y0.participants_count);
                        xibVar34.u(M011, String.format("%d", objArr3), false, 2131232181, true);
                    } else {
                        CharSequence M012 = jb6.M0(2131752321, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(this.y0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.V.getVisibility() == 0) {
                            z7 = 1;
                        } else {
                            z7 = i;
                        }
                        xibVar34.u(M012, format3, false, 2131232181, z7);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (chat.gigagroup && !sd2.Y(chat)) {
                        xib xibVar35 = this.Y;
                        CharSequence M013 = jb6.M0(2131752399, null);
                        TLRPC.ChatFull chatFull6 = this.y0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        xib xibVar36 = this.Z;
                        if (xibVar36 != null && xibVar36.getVisibility() == 0) {
                            z9 = 1;
                        } else {
                            z9 = i;
                        }
                        xibVar35.u(M013, format4, false, 2131232421, z9);
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
                            i4 = wg2.o0(tL_chatBannedRights) + i18;
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
                        xib xibVar37 = this.Y;
                        String M014 = jb6.M0(2131752275, null);
                        Integer valueOf = Integer.valueOf(i4);
                        Integer valueOf2 = Integer.valueOf(i5);
                        Object[] objArr6 = new Object[2];
                        objArr6[i] = valueOf;
                        objArr6[1] = valueOf2;
                        xibVar37.u(M014, String.format("%d/%d", objArr6), z2, 2131232282, true);
                        z3 = z2;
                    }
                    xib xibVar38 = this.V;
                    if (xibVar38 != null) {
                        CharSequence M015 = jb6.M0(2131748392, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        xib xibVar39 = this.Z;
                        if (xibVar39 != null && xibVar39.getVisibility() == 0) {
                            z8 = 1;
                        } else {
                            z8 = i;
                        }
                        xibVar38.u(M015, format5, false, 2131232346, z8);
                    }
                }
                xib xibVar40 = this.X;
                String M016 = jb6.M0(2131752464, "ChannelAdministrators");
                boolean T2 = sd2.T(this.x0);
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
                xibVar40.u(M016, String.format("%d", objArr8), false, 2131232055, true);
            } else {
                z3 = z2;
                i = 0;
                if (this.J0 && !sd2.Y(this.x0)) {
                    this.U.o(2131232181, jb6.M0(2131752227, "ChannelSubscribers"), true);
                    xib xibVar41 = this.Y;
                    String M017 = jb6.M0(2131752399, null);
                    xib xibVar42 = this.Z;
                    if (xibVar42 != null && xibVar42.getVisibility() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    xibVar41.o(2131232096, M017, z6);
                } else {
                    xib xibVar43 = this.U;
                    String M018 = jb6.M0(2131752321, "ChannelMembers");
                    xib xibVar44 = this.Z;
                    if (xibVar44 != null && xibVar44.getVisibility() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xibVar43.o(2131232181, M018, z4);
                    boolean z23 = this.x0.gigagroup;
                    xib xibVar45 = this.Y;
                    if (z23) {
                        String M019 = jb6.M0(2131752399, null);
                        xib xibVar46 = this.Z;
                        if (xibVar46 != null && xibVar46.getVisibility() == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        xibVar45.o(2131232096, M019, z5);
                    } else {
                        xibVar45.o(2131232282, jb6.M0(2131752275, null), true);
                    }
                }
                this.X.o(2131232055, jb6.M0(2131752464, "ChannelAdministrators"), true);
            }
            xib xibVar47 = this.P;
            if (sd2.w(1, this.x0)) {
                i2 = i;
            } else {
                i2 = 8;
            }
            xibVar47.setVisibility(i2);
            x0(z3);
            if (this.y0 != null && sd2.y(3, this.x0) && (!t0 || !this.x0.creator)) {
                int i21 = this.y0.invitesCount;
                xib xibVar48 = this.W;
                if (i21 > 0) {
                    xibVar48.u(jb6.M0(2131748897, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, 2131232210, true);
                } else {
                    xibVar48.u(jb6.M0(2131748897, "InviteLinks"), "1", false, 2131232210, true);
                }
            } else {
                this.W.setVisibility(8);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z) {
        nk3 nk3Var;
        dj3 dj3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof yv1) {
                    yv1 yv1Var = (yv1) fragmentStack.get(i);
                    if (yv1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(yv1Var, false);
                        yv1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, yv1Var)) {
                            nm7.e().j(yv1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new sxb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof sxb)) {
                    sxb sxbVar = (sxb) fragmentStack.get(i);
                    if (sxbVar.f() != null && sxbVar.f().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(sxbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof nk3) && (nk3Var = (nk3) fragmentStack.get(i)) != null && (dj3Var = nk3Var.H3) != null && dj3Var.c()) {
                    nk3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    public final void w0() {
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
            this.l0.u(jb6.M0(2131752957, null), jb6.a0(null, null, 2131752956, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, 2131232210, true);
            return;
        }
        this.l0.u(jb6.M0(2131752958, null), "t.me/" + this.D0.username, false, 2131232210, true);
    }

    public final void x0(boolean z) {
        String str;
        String str2;
        TLRPC.ChatFull M0 = getMessagesController().M0(this.w0);
        boolean V = sd2.V(this.x0);
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
                    if (M0 != null && M0.paid_reactions_available) {
                        i++;
                    }
                    if (i == 0) {
                        str2 = jb6.M0(2131746112, null);
                    } else {
                        str2 = String.valueOf(i);
                    }
                } else {
                    int min = Math.min(getMediaDataController().n.size(), i);
                    if (min == 0) {
                        str2 = jb6.M0(2131746112, null);
                    } else {
                        str2 = jb6.a0(null, null, 2131746117, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
                    }
                }
            } else {
                str2 = jb6.M0(2131746119, null);
            }
        } else {
            String M02 = jb6.M0(2131746112, null);
            if (M0 != null && M0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = M02;
                this.P.u(jb6.M0(2131746120, null), str, z, 2131232330, true);
            }
        }
        str = str2;
        this.P.u(jb6.M0(2131746120, null), str, z, 2131232330, true);
    }

    public final void y0(Long l) {
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
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.x0.linked_monoforum_id));
                if (l != null) {
                    j = l.longValue();
                } else if (L0 != null) {
                    j = L0.send_paid_messages_stars;
                }
                this.L.u(jb6.M0(2131746829, null), nxa.b1(false, jb6.a0(null, null, 2131746803, Long.valueOf(j)), 0.66f, null), false, 2131232222, true);
                return;
            }
            this.L.u(jb6.M0(2131746829, null), jb6.M0(2131746819, null), false, 2131232222, true);
        }
    }

    @Override
    public final void T() {
    }
}
