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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public class g92 extends e implements yn5, fn7 {
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
    public rca H;
    public boolean H0;
    public skb I;
    public boolean I0;
    public skb J;
    public boolean J0;
    public skb K;
    public boolean K0;
    public skb L;
    public TLRPC.ChatReactions L0;
    public j38 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public skb N;
    public boolean N0;
    public skb O;
    public boolean O0;
    public skb P;
    public boolean P0;
    public ilb Q;
    public final ArrayList Q0;
    public skb R;
    public final d92 R0;
    public LinearLayout S;
    public b29 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public skb U;
    public skb V;
    public skb W;
    public skb X;
    public skb Y;
    public skb Z;
    public nla a;
    public skb a0;
    public id b;
    public skb b0;
    public UndoView c;
    public e92 c0;
    public LinearLayout d;
    public FrameLayout d0;
    public mb0 e;
    public qmb e0;
    public a81 f;
    public skb f0;
    public skb g0;
    public AnimatorSet h;
    public zn2 h0;
    public ilb i0;
    public skb j0;
    public ilb k0;
    public skb l0;
    public skb m0;
    public RadialProgressView n;
    public skb n0;
    public skb o0;
    public skb p0;
    public skb q0;
    public final rb0 r;
    public skb r0;
    public final zn5 s;
    public ilb s0;
    public ilb t0;
    public skb u0;
    public TLRPC.FileLocation v0;
    public iu3 w;
    public long w0;
    public u1 x;
    public TLRPC.Chat x0;
    public ny9 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public g92(Bundle bundle) {
        super(bundle);
        int i;
        this.Q0 = new ArrayList();
        this.R0 = new d92(this);
        this.r = new rb0((vnb) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
            if (M0 != null && xc2.V(M0)) {
                i = 1;
            } else {
                i = 2;
            }
            this.s = new zn5(i, true, true);
            return;
        }
        this.s = new zn5(0, false, false);
    }

    public static jla Y(g92 g92Var) {
        return g92Var.simpleActionBar;
    }

    public static jla Z(g92 g92Var) {
        return g92Var.simpleActionBar;
    }

    public static SpannableStringBuilder a0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        lf4 lf4Var = new lf4(10);
        lf4Var.a.setTypeface(hl.n1("fonts/num.otf"));
        lf4Var.f = aob.w0(null, aob.Ck, false);
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
        hl.c3(new yh1(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
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
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
    }

    public final boolean b0(boolean z) {
        iu3 iu3Var;
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
            iu3 iu3Var2 = this.w;
            if ((iu3Var2 != null && !this.D0.first_name.equals(iu3Var2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131743381, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131752964, null);
                    alertDialog$Builder.j(ob6.M0(2131754209, null), new a92(this, (byte) 0));
                    alertDialog$Builder.g(ob6.M0(2131747307, null), new a92(this, (byte) 1));
                    showDialog(idVar);
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
        if ((chatFull != null && xc2.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((iu3Var = this.w) != null && !this.x0.title.equals(iu3Var.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = ob6.M0(2131743381, "UserRestrictionsApplyChanges");
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                if (this.J0) {
                    idVar2.U = ob6.M0(2131752271, "ChannelSettingsChangedAlert");
                } else {
                    idVar2.U = ob6.M0(2131749155, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.j(ob6.M0(2131754209, "ApplyTheme"), new a92(this, (byte) 2));
                alertDialog$Builder2.g(ob6.M0(2131747307, "PassportDiscard"), new a92(this, (byte) 3));
                showDialog(idVar2);
            }
            return false;
        }
        return true;
    }

    public final void c0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().H2.f(-this.w0);
        if (arrayList != null && !arrayList.isEmpty()) {
            r47 r47Var = (r47) c00.g(1, arrayList);
            if (!TextUtils.isEmpty(r47Var.z)) {
                str = r47Var.z.toString();
            } else if (!TextUtils.isEmpty(r47Var.v)) {
                str = r47Var.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = ob6.M0(2131742523, null);
        }
        this.f0.u(ob6.M0(2131742529, null), str, false, 2131231930, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.didReceivedNotification(int, int, java.lang.Object[]):void");
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
        wh1 wh1Var = new wh1(-this.x0.id);
        wh1Var.m0 = this;
        presentFragment(wh1Var);
        uc7.s1(this.currentAccount).X3.edit().putInt("boostingappearance", uc7.s1(this.currentAccount).X3.getInt("boostingappearance", 0) + 1).apply();
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0(id idVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, wg1 wg1Var) {
        idVar.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        l46 l46Var = new l46(35, this.currentAccount, getResourceProvider(), getParentActivity(), this);
        l46Var.s1(wg1Var);
        l46Var.r1(tL_premium_boostsStatus, true);
        l46Var.t1(j);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
        if (M0 != null) {
            l46Var.L2 = new dy1(this, M0, (byte) 25);
        }
        showDialog(l46Var);
    }

    public final void g0(FrameLayout frameLayout, View view) {
        SpannableStringBuilder S2;
        if (!this.G0) {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                S2 = hl.S2(ob6.M0(2131752246, "ChannelTopicsDiscussionForbidden"));
            } else {
                S2 = hl.S2(ob6.G(getMessagesController().k4.w1.f(), "ChannelTopicsForbidden", new Object[0]));
            }
            d31.b0(this).Q(2131624290, 36, S2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? eVar = new e(null);
        eVar.a = -this.w0;
        eVar.setResourceProvider(this.resourceProvider);
        boolean z = this.F0;
        boolean z2 = this.H0;
        boolean z3 = this.I0;
        qo0 qo0Var = new qo0(this, view, (byte) 1);
        eVar.c = z;
        eVar.d = z2;
        eVar.e = z3;
        eVar.h = qo0Var;
        presentFragment((e) eVar);
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override
    public final ny9 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e92 e92Var = this.c0;
        int i = aob.i6;
        arrayList.add(new apb(e92Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.c0, 4, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.u6));
        arrayList.add(new apb(this.c0, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.v6));
        arrayList.add(new apb(this.U, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        skb skbVar = this.V;
        if (skbVar != null) {
            arrayList.add(new apb(skbVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        arrayList.add(new apb(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.Z, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.J, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        LinearLayout linearLayout = this.E;
        int i2 = aob.d6;
        arrayList.add(new apb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.e0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.e0, 4, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.P, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        skb skbVar2 = this.L;
        if (skbVar2 != null) {
            arrayList.add(new apb(skbVar2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        skb skbVar3 = this.b0;
        if (skbVar3 != null) {
            arrayList.add(new apb(skbVar3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        return arrayList;
    }

    public final void h0() {
        int i = this.currentAccount;
        TL_bots.BotVerifierSettings botVerifierSettings = this.E0.bot_info.verifier_settings;
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        Bundle j = qd4.j(16, "onlySelect", "dialogsType", true);
        j.putBoolean("resetDelegate", false);
        uj3 uj3Var = new uj3(j);
        uj3Var.setCurrentAccount(i);
        uj3Var.E2 = new ff(uj3Var, i, this.C0, botVerifierSettings);
        S.presentFragment(uj3Var);
    }

    public final void i0(long j, long j2) {
        uc7.s1(this.currentAccount).Z2(j, j2, true, false, new n82(this, (byte) 1));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.P0 = true;
        jn7 f = jn7.f(this.currentAccount);
        int i = uc7.r5;
        f.k(2, 2);
    }

    public final void k0() {
        this.v0 = null;
        long j = this.C0;
        if (j == 0) {
            uc7.s1(this.currentAccount).z(this.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = getMessagesController().o1(j);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new z82(this, (byte) 2));
        }
        r0(false, true);
        mb0 mb0Var = this.e;
        Object obj = this.D0;
        if (obj == null) {
            obj = this.x0;
        }
        mb0Var.m(null, null, this.r, obj);
        this.S0.H(0);
        this.c0.e.d();
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new z82(this, (byte) 0));
    }

    public final void m0() {
        boolean z;
        if (this.v0 != null) {
            z = true;
        } else {
            z = false;
        }
        this.s.n(z, new b92(this, (byte) 0), new o1(this, (byte) 17), 0);
        this.S0.H(0);
        this.S0.K(43);
        this.c0.e.d();
    }

    public final void n0() {
        iu3 iu3Var;
        boolean z;
        boolean z2;
        String str;
        String str2;
        if (!this.O0 && (iu3Var = this.w) != null) {
            if (iu3Var.a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                hl.z3(this.w);
                return;
            }
            boolean z3 = true;
            this.O0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().q1(this.D0);
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
                this.b = new id(3, null, getParentActivity());
                this.b.setOnCancelListener(new gt0(this, getConnectionsManager().sendRequest(setbotinfo, new ql(this, setbotinfo, (byte) 20)), (byte) 4));
                this.b.show();
            } else if (!xc2.T(this.x0) && (!this.K0 || this.F0)) {
                getMessagesController().R(getParentActivity(), this.w0, this, new a92(this, (byte) 5), null);
            } else {
                if (this.y0 != null && xc2.T(this.x0)) {
                    TLRPC.ChatFull chatFull = this.y0;
                    boolean z4 = chatFull.hidden_prehistory;
                    boolean z5 = this.K0;
                    if (z4 != z5) {
                        chatFull.hidden_prehistory = z5;
                        getMessagesController().p5(this.w0, this.K0);
                    }
                }
                if (this.s.g()) {
                    this.N0 = true;
                    id idVar = new id(3, null, getParentActivity());
                    this.b = idVar;
                    idVar.setOnCancelListener(new cs0(this, (byte) 5));
                    this.b.show();
                    return;
                }
                if (!this.x0.title.equals(this.w.getText().toString())) {
                    getMessagesController().A(this.w0, this.w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.F;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    uc7 messagesController = getMessagesController();
                    long j = this.w0;
                    String obj = this.F.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.y0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.j1(-j);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new m65(messagesController, chatFull3, obj, (byte) 20), 64);
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
                    getMessagesController().o5(this.w0, this.F0, this.H0, this.I0);
                    if (this.F0 && !this.H0 && (z3 || z)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i = 0; i < fragmentStack.size(); i++) {
                            if ((fragmentStack.get(i) instanceof zu1) && ((zu1) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.w0) {
                                ((ActionBarLayout) getParentLayout()).a0(i);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.w0);
                                wk5 parentLayout = getParentLayout();
                                HashSet hashSet = tzb.s1;
                                ((ActionBarLayout) parentLayout).b(i, tzb.F0(getMessagesController(), getMessagesStorage(), bundle));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.o0():void");
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.s.h(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.w;
        if (iu3Var != null && iu3Var.e) {
            if (z) {
                iu3Var.k(true);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g92.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        zn5 zn5Var = this.s;
        if (zn5Var != null) {
            zn5Var.c();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, jn7.T);
            getNotificationCenter().n(this, jn7.u5);
            getNotificationCenter().n(this, jn7.a5);
            getNotificationCenter().n(this, jn7.O3);
        } else {
            getNotificationCenter().n(this, jn7.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, jn7.E3);
            }
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.y1);
        getNotificationCenter().n(this, jn7.b1);
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.o();
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
            ((wl) obj).n(null);
        }
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.r();
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
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            iu3Var.s();
            this.w.getEditText().requestFocus();
        }
        s0();
        hl.V2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                yob.l(editTextBoldCursor, 30, aob.G6, null);
            }
            mb0 mb0Var = this.e;
            if (mb0Var != null) {
                mb0Var.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        boolean z;
        wl wlVar;
        this.y0 = chatFull;
        if (chatFull != null) {
            TLRPC.Chat chat = this.x0;
            if (chat == null) {
                chat = getMessagesController().M0(Long.valueOf(this.w0));
                this.x0 = chat;
            }
            if (xc2.T(chat) && !this.y0.hidden_prehistory) {
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
            if (chatFull2 != null && xc2.V(chat2)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                wlVar = wl.l(yac.t0, wl.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            wlVar = wl.m(yac.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, wl.f());
                        } else {
                            wlVar = null;
                        }
                        if (wlVar != null) {
                            arrayList2.add(wlVar);
                            wlVar.a(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = ls6.d0(yac.t0).n;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            wl l = wl.l(yac.t0, wl.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l);
                            l.a(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().k4.K2.f && xc2.V(this.x0)) {
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
        TLRPC.User X1;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j = this.C0;
                if (j == 0) {
                    X1 = null;
                } else {
                    X1 = getMessagesController().X1(Long.valueOf(j));
                }
                this.D0 = X1;
            }
            skb skbVar = this.o0;
            int i2 = 0;
            if (skbVar != null) {
                if (this.E0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                skbVar.h(45, z, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    skb skbVar2 = this.o0;
                    if (userFull2.starref_program == null) {
                        format = ob6.M0(2131754338, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    skbVar2.w(format, false);
                }
            }
            skb skbVar3 = this.u0;
            if (skbVar3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                skbVar3.setVisibility(i);
            }
            ilb ilbVar = this.t0;
            if (ilbVar != null) {
                TLRPC.UserFull userFull4 = this.E0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i2 = 8;
                }
                ilbVar.setVisibility(i2);
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
            this.h.addListener(new z7((byte) 16, this, z));
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
        zn5 zn5Var = this.s;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
        skb skbVar;
        skb skbVar2;
        boolean z;
        b48 b48Var;
        int v0;
        boolean o;
        int i;
        ArrayList<Integer> arrayList;
        int i2;
        int i3;
        j38 j38Var = this.M;
        if (j38Var != null) {
            TLRPC.Chat chat = this.x0;
            skb skbVar3 = this.O;
            if ((skbVar3 != null && skbVar3.getVisibility() == 0) || (((skbVar = this.R) != null && skbVar.getVisibility() == 0) || ((xc2.n0(this.x0) && xc2.N(this.x0)) || ((skbVar2 = this.N) != null && skbVar2.getVisibility() == 0)))) {
                z = true;
            } else {
                z = false;
            }
            Paint paint = j38Var.n;
            int i4 = j38Var.a;
            vnb vnbVar = j38Var.d;
            if (chat != null) {
                j38Var.w = z;
                kc7 kc7Var = null;
                j38Var.r = new pkb(pv3.m(chat.title, aob.o2.getFontMetricsInt(), false, null, 0), 13.0f, hl.o());
                b48 b48Var2 = j38Var.x;
                if (b48Var2 != null) {
                    b48Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i5 = b48.j;
                    int i6 = tL_emojiStatusCollectible.center_color | (-16777216);
                    b48Var = new b48(i6, i6, i6, tL_emojiStatusCollectible.document_id);
                    j38Var.x = b48Var;
                } else {
                    if (xc2.I(chat) >= 0) {
                        b48 c = b48.c(i4, xc2.I(chat));
                        c.a = hl.L(11.0f);
                        c.d();
                        b48Var = c;
                    } else {
                        b48Var = null;
                    }
                    j38Var.x = b48Var;
                }
                if (b48Var != null) {
                    b48Var.e(j38Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (vnbVar != null) {
                        o = vnbVar.a();
                    } else {
                        o = aob.I.o();
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
                    j38Var.r.m(i);
                    paint.setColor(aob.p1(0.1f, i));
                    b48 b48Var3 = new b48(intValue, i2, i3, tL_peerColorCollectible.gift_emoji_id);
                    b48Var3.a = hl.L(11.0f);
                    b48Var3.d();
                    j38Var.y = b48Var3;
                    b48Var3.e(j38Var);
                    return;
                }
                int F = xc2.F(chat);
                if (F < 7) {
                    int i7 = aob.r8[F];
                    j38Var.s = i7;
                    v0 = aob.v0(i7, vnbVar);
                } else {
                    lc7 lc7Var = uc7.s1(yac.t0).E3;
                    if (lc7Var != null) {
                        kc7Var = lc7Var.d(F);
                    }
                    if (kc7Var != null) {
                        j38Var.s = -1;
                        v0 = kc7Var.f();
                    } else {
                        int i8 = aob.r8[0];
                        j38Var.s = i8;
                        v0 = aob.v0(i8, vnbVar);
                    }
                }
                j38Var.r.m(v0);
                paint.setColor(aob.p1(0.1f, v0));
                b48 a = b48.a(i4, F);
                a.a = hl.L(11.0f);
                a.d();
                j38Var.y = a;
                a.e(j38Var);
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.s;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
        iu3 iu3Var = this.w;
        if (iu3Var != null) {
            String obj = iu3Var.getText().toString();
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
        skb skbVar;
        TLRPC.ChatFull chatFull;
        String str2;
        int i10;
        String M0;
        skb skbVar2;
        skb skbVar3;
        boolean z13;
        skb skbVar4;
        skb skbVar5;
        boolean z14;
        String str3;
        int i11;
        String format;
        skb skbVar6;
        skb skbVar7;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        skb skbVar8;
        skb skbVar9;
        skb skbVar10;
        TLRPC.Chat M02;
        if (z && (M02 = getMessagesController().M0(Long.valueOf(this.w0))) != null) {
            this.x0 = M02;
        }
        boolean t0 = xc2.t0(this.x0);
        ilb ilbVar = this.Q;
        if (ilbVar != null) {
            if (this.J == null && (((skbVar8 = this.K) == null || skbVar8.getVisibility() != 0) && (((skbVar9 = this.O) == null || skbVar9.getVisibility() != 0) && ((skbVar10 = this.I) == null || skbVar10.getVisibility() != 0)))) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            ilbVar.setVisibility(i13);
        }
        skb skbVar11 = this.Z;
        if (skbVar11 != null) {
            if (xc2.T(this.x0)) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            skbVar11.setVisibility(i12);
        }
        skb skbVar12 = this.K;
        if (skbVar12 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 != null && (this.J0 || chatFull2.linked_chat_id != 0)) {
                skbVar12.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(ob6.M0(2131751354, "Discussion"), ob6.M0(2131751346, "DiscussionInfoShort"), false, 2131232117, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.y0.linked_chat_id));
                    if (M03 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = xc2.K(M03, false);
                        boolean isEmpty = TextUtils.isEmpty(K);
                        skb skbVar13 = this.K;
                        if (isEmpty) {
                            skbVar13.u(ob6.M0(2131751354, "Discussion"), M03.title, false, 2131232117, true);
                        } else {
                            skbVar13.u(ob6.M0(2131751354, "Discussion"), c00.i("@", K), false, 2131232117, true);
                        }
                    } else {
                        String K2 = xc2.K(M03, false);
                        boolean isEmpty2 = TextUtils.isEmpty(K2);
                        skb skbVar14 = this.K;
                        if (isEmpty2) {
                            String M04 = ob6.M0(2131748637, "LinkedChannel");
                            String str4 = M03.title;
                            skb skbVar15 = this.R;
                            if (skbVar15 != null && skbVar15.getVisibility() == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            skbVar14.u(M04, str4, false, 2131232093, z17);
                        } else {
                            String M05 = ob6.M0(2131748637, "LinkedChannel");
                            String i14 = c00.i("@", K2);
                            skb skbVar16 = this.R;
                            if (skbVar16 != null && skbVar16.getVisibility() == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            skbVar14.u(M05, i14, false, 2131232093, z16);
                        }
                    }
                }
            } else {
                skbVar12.setVisibility(8);
            }
        }
        skb skbVar17 = this.I;
        if (skbVar17 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                skbVar17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                boolean z18 = channelLocation instanceof TLRPC.TL_channelLocation;
                skb skbVar18 = this.I;
                if (z18) {
                    skbVar18.q(ob6.M0(2131753954, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z2, true);
                } else {
                    skbVar18.q(ob6.M0(2131753954, "AttachLocation"), "Unknown address", z2, true);
                }
            } else {
                skbVar17.setVisibility(8);
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t0) {
                    format = ob6.M0(2131743584, "TypeLocationGroupEdit");
                } else {
                    format = String.format(c00.k(new StringBuilder("https://"), getMessagesController().N2, "/%s"), xc2.K(this.x0, false));
                }
                String str5 = format;
                skb skbVar19 = this.J;
                String M06 = ob6.M0(2131743585, "TypeLocationGroup");
                skb skbVar20 = this.O;
                if ((skbVar20 != null && skbVar20.getVisibility() == 0) || (((skbVar6 = this.K) != null && skbVar6.getVisibility() == 0) || ((skbVar7 = this.R) != null && skbVar7.getVisibility() == 0))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                skbVar19.u(M06, str5, false, 2131232093, z15);
            } else {
                boolean z19 = this.x0.noforwards;
                if (this.J0) {
                    if (!t0) {
                        if (z19) {
                            str3 = "TypePrivateRestrictedForwards";
                            i11 = 2131743576;
                        } else {
                            str3 = "TypePrivate";
                            i11 = 2131743579;
                        }
                    } else {
                        str3 = "TypePublic";
                        i11 = 2131743575;
                    }
                    M0 = ob6.M0(i11, str3);
                } else {
                    if (!t0) {
                        if (z19) {
                            str2 = "TypePrivateGroupRestrictedForwards";
                            i10 = 2131743577;
                        } else {
                            str2 = "TypePrivateGroup";
                            i10 = 2131743578;
                        }
                    } else {
                        str2 = "TypePublicGroup";
                        i10 = 2131743574;
                    }
                    M0 = ob6.M0(i10, str2);
                }
                String str6 = M0;
                boolean z20 = this.J0;
                skb skbVar21 = this.J;
                if (z20) {
                    String M07 = ob6.M0(2131752242, "ChannelType");
                    skb skbVar22 = this.O;
                    if ((skbVar22 != null && skbVar22.getVisibility() == 0) || (((skbVar4 = this.K) != null && skbVar4.getVisibility() == 0) || ((skbVar5 = this.R) != null && skbVar5.getVisibility() == 0))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    skbVar21.u(M07, str6, false, 2131232093, z14);
                } else {
                    String M08 = ob6.M0(2131749146, "GroupType");
                    skb skbVar23 = this.O;
                    if ((skbVar23 != null && skbVar23.getVisibility() == 0) || (((skbVar2 = this.K) != null && skbVar2.getVisibility() == 0) || ((skbVar3 = this.R) != null && skbVar3.getVisibility() == 0))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    skbVar21.u(M08, str6, false, 2131232180, z13);
                }
            }
        }
        if (this.O != null) {
            if (this.K0 && !this.F0) {
                str = "ChatHistoryHidden";
                i8 = 2131752197;
            } else {
                str = "ChatHistoryVisible";
                i8 = 2131752193;
            }
            String M09 = ob6.M0(i8, str);
            skb skbVar24 = this.O;
            String M010 = ob6.M0(2131752194, "ChatHistoryShort");
            if (this.R != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            skbVar24.u(M010, M09, z2, 2131232117, z11);
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
                    int i15 = 0;
                    boolean z21 = false;
                    while (i15 < this.G.getChildCount()) {
                        LinearLayout linearLayout = this.G;
                        if (!z21) {
                            if (linearLayout.getChildAt(i15) == this.O) {
                                z21 = true;
                            }
                        } else {
                            arrayList.add(linearLayout.getChildAt(i15));
                        }
                        i15++;
                        z21 = z21;
                    }
                    int i16 = 0;
                    boolean z22 = false;
                    while (i16 < this.x.getChildCount()) {
                        u1 u1Var = this.x;
                        if (!z22) {
                            if (u1Var.getChildAt(i16) == this.G) {
                                z22 = true;
                            }
                        } else {
                            arrayList.add(u1Var.getChildAt(i16));
                        }
                        i16++;
                        z22 = z22;
                    }
                    if (this.O.getVisibility() != 0) {
                        this.O.setAlpha(0.0f);
                        this.O.setTranslationY((-skbVar.getHeight()) / 2.0f);
                    }
                    this.O.setVisibility(0);
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        ((View) arrayList.get(i17)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                    }
                    skb skbVar25 = this.O;
                    if (z2) {
                        float alpha = skbVar25.getAlpha();
                        if (z12) {
                            f3 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f3);
                        this.T0 = ofFloat;
                        ofFloat.addUpdateListener(new lk(this, arrayList, (byte) 8));
                        this.T0.addListener(new rw(this, z12, arrayList, (byte) 2));
                        this.T0.setDuration(320L);
                        this.T0.setInterpolator(k43.h);
                        this.T0.start();
                    } else {
                        if (z12) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        skbVar25.setAlpha(f);
                        skb skbVar26 = this.O;
                        float f5 = (-skbVar26.getHeight()) / 2.0f;
                        if (z12) {
                            f2 = 0.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        skbVar26.setTranslationY(f5 * f2);
                        skb skbVar27 = this.O;
                        if (!z12) {
                            f4 = 0.0f;
                        }
                        skbVar27.setScaleY((f4 * 0.8f) + 0.2f);
                        skb skbVar28 = this.O;
                        if (z12) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        skbVar28.setVisibility(i9);
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            ((View) arrayList.get(i18)).setTranslationY(0.0f);
                        }
                        this.T0 = null;
                    }
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                skb skbVar29 = this.V;
                if (skbVar29 != null) {
                    if (skbVar29.getParent() == null) {
                        i = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, tre.o(-1, -2));
                    } else {
                        i = 0;
                    }
                    skb skbVar30 = this.V;
                    if (this.y0.requests_pending > 0) {
                        i7 = i;
                    } else {
                        i7 = 8;
                    }
                    skbVar30.setVisibility(i7);
                } else {
                    i = 0;
                }
                if (this.J0 && !xc2.Y(this.x0)) {
                    skb skbVar31 = this.U;
                    String M011 = ob6.M0(2131752255, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i] = Integer.valueOf(this.y0.participants_count);
                    skbVar31.u(M011, String.format("%d", objArr), false, 2131232180, true);
                    skb skbVar32 = this.Y;
                    CharSequence M012 = ob6.M0(2131752427, null);
                    TLRPC.ChatFull chatFull5 = this.y0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    skb skbVar33 = this.Z;
                    if (skbVar33 != null && skbVar33.getVisibility() == 0) {
                        z10 = 1;
                    } else {
                        z10 = i;
                    }
                    skbVar32.u(M012, format2, false, 2131232420, z10);
                    z3 = z2;
                } else {
                    boolean T = xc2.T(this.x0);
                    skb skbVar34 = this.U;
                    if (T) {
                        CharSequence M013 = ob6.M0(2131752349, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i] = Integer.valueOf(this.y0.participants_count);
                        skbVar34.u(M013, String.format("%d", objArr3), false, 2131232180, true);
                    } else {
                        CharSequence M014 = ob6.M0(2131752349, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i] = Integer.valueOf(this.y0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.V.getVisibility() == 0) {
                            z7 = 1;
                        } else {
                            z7 = i;
                        }
                        skbVar34.u(M014, format3, false, 2131232180, z7);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (chat.gigagroup && !xc2.Y(chat)) {
                        skb skbVar35 = this.Y;
                        CharSequence M015 = ob6.M0(2131752427, null);
                        TLRPC.ChatFull chatFull6 = this.y0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        skb skbVar36 = this.Z;
                        if (skbVar36 != null && skbVar36.getVisibility() == 0) {
                            z9 = 1;
                        } else {
                            z9 = i;
                        }
                        skbVar35.u(M015, format4, false, 2131232420, z9);
                        z3 = z2;
                    } else {
                        if (this.F0) {
                            i3 = 16;
                        } else {
                            i3 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i19 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i19++;
                            }
                            i4 = bg2.n0(tL_chatBannedRights) + i19;
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
                        skb skbVar37 = this.Y;
                        String M016 = ob6.M0(2131752303, null);
                        Integer valueOf = Integer.valueOf(i4);
                        Integer valueOf2 = Integer.valueOf(i5);
                        Object[] objArr6 = new Object[2];
                        objArr6[i] = valueOf;
                        objArr6[1] = valueOf2;
                        skbVar37.u(M016, String.format("%d/%d", objArr6), z2, 2131232281, true);
                        z3 = z2;
                    }
                    skb skbVar38 = this.V;
                    if (skbVar38 != null) {
                        CharSequence M017 = ob6.M0(2131748389, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        skb skbVar39 = this.Z;
                        if (skbVar39 != null && skbVar39.getVisibility() == 0) {
                            z8 = 1;
                        } else {
                            z8 = i;
                        }
                        skbVar38.u(M017, format5, false, 2131232345, z8);
                    }
                }
                skb skbVar40 = this.X;
                String M018 = ob6.M0(2131752492, "ChannelAdministrators");
                boolean T2 = xc2.T(this.x0);
                TLRPC.ChatFull chatFull7 = this.y0;
                if (T2) {
                    i6 = chatFull7.admins_count;
                } else if (chatFull7 == null) {
                    i6 = 1;
                } else {
                    int size = chatFull7.participants.participants.size();
                    int i20 = i;
                    int i21 = i20;
                    while (i20 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i20);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            i21++;
                        }
                        i20++;
                    }
                    i6 = i21;
                }
                Object[] objArr8 = new Object[1];
                objArr8[i] = Integer.valueOf(i6);
                skbVar40.u(M018, String.format("%d", objArr8), false, 2131232054, true);
            } else {
                z3 = z2;
                i = 0;
                if (this.J0 && !xc2.Y(this.x0)) {
                    this.U.o(2131232180, ob6.M0(2131752255, "ChannelSubscribers"), true);
                    skb skbVar41 = this.Y;
                    String M019 = ob6.M0(2131752427, null);
                    skb skbVar42 = this.Z;
                    if (skbVar42 != null && skbVar42.getVisibility() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    skbVar41.o(2131232095, M019, z6);
                } else {
                    skb skbVar43 = this.U;
                    String M020 = ob6.M0(2131752349, "ChannelMembers");
                    skb skbVar44 = this.Z;
                    if (skbVar44 != null && skbVar44.getVisibility() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    skbVar43.o(2131232180, M020, z4);
                    boolean z23 = this.x0.gigagroup;
                    skb skbVar45 = this.Y;
                    if (z23) {
                        String M021 = ob6.M0(2131752427, null);
                        skb skbVar46 = this.Z;
                        if (skbVar46 != null && skbVar46.getVisibility() == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        skbVar45.o(2131232095, M021, z5);
                    } else {
                        skbVar45.o(2131232281, ob6.M0(2131752303, null), true);
                    }
                }
                this.X.o(2131232054, ob6.M0(2131752492, "ChannelAdministrators"), true);
            }
            skb skbVar47 = this.P;
            if (xc2.w(1, this.x0)) {
                i2 = i;
            } else {
                i2 = 8;
            }
            skbVar47.setVisibility(i2);
            x0(z3);
            if (this.y0 != null && xc2.y(3, this.x0) && (!t0 || !this.x0.creator)) {
                int i22 = this.y0.invitesCount;
                skb skbVar48 = this.W;
                if (i22 > 0) {
                    skbVar48.u(ob6.M0(2131748894, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, 2131232209, true);
                } else {
                    skbVar48.u(ob6.M0(2131748894, "InviteLinks"), "1", false, 2131232209, true);
                }
            } else {
                this.W.setVisibility(8);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    public final void u0(boolean z) {
        uj3 uj3Var;
        li3 li3Var;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i = 0;
            while (i < fragmentStack.size()) {
                if (fragmentStack.get(i) instanceof zu1) {
                    zu1 zu1Var = (zu1) fragmentStack.get(i);
                    if (zu1Var.getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(zu1Var, false);
                        zu1Var.clearViews();
                        if (((ActionBarLayout) getParentLayout()).b(i, zu1Var)) {
                            jn7.e().j(zu1Var.da);
                        }
                        if (z && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.w0);
                            ((ActionBarLayout) getParentLayout()).b(i, new tzb(bundle));
                            i++;
                        }
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof tzb)) {
                    tzb tzbVar = (tzb) fragmentStack.get(i);
                    if (tzbVar.e() != null && tzbVar.e().id == this.w0) {
                        ((ActionBarLayout) getParentLayout()).c0(tzbVar, false);
                        i--;
                    }
                } else if (z && this.H0 && (fragmentStack.get(i) instanceof uj3) && (uj3Var = (uj3) fragmentStack.get(i)) != null && (li3Var = uj3Var.H3) != null && li3Var.c()) {
                    uj3Var.H3.a();
                }
                i++;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
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
            this.l0.u(ob6.M0(2131752985, null), ob6.a0(null, null, 2131752984, Integer.valueOf(i), Integer.valueOf(this.D0.usernames.size())), false, 2131232209, true);
            return;
        }
        this.l0.u(ob6.M0(2131752986, null), "t.me/" + this.D0.username, false, 2131232209, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(boolean z) {
        String str;
        String str2;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.w0);
        boolean V = xc2.V(this.x0);
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
                    if (N0 != null && N0.paid_reactions_available) {
                        i++;
                    }
                    if (i == 0) {
                        str2 = ob6.M0(2131746106, null);
                    } else {
                        str2 = String.valueOf(i);
                    }
                } else {
                    int min = Math.min(getMediaDataController().n.size(), i);
                    if (min == 0) {
                        str2 = ob6.M0(2131746106, null);
                    } else {
                        str2 = ob6.a0(null, null, 2131746111, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
                    }
                }
            } else {
                str2 = ob6.M0(2131746113, null);
            }
        } else {
            String M0 = ob6.M0(2131746106, null);
            if (N0 != null && N0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = M0;
                this.P.u(ob6.M0(2131746114, null), str, z, 2131232329, true);
            }
        }
        str = str2;
        this.P.u(ob6.M0(2131746114, null), str, z, 2131232329, true);
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
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.x0.linked_monoforum_id));
                if (l != null) {
                    j = l.longValue();
                } else if (M0 != null) {
                    j = M0.send_paid_messages_stars;
                }
                this.L.u(ob6.M0(2131746823, null), nza.b1(false, ob6.a0(null, null, 2131746797, Long.valueOf(j)), 0.66f, null), false, 2131232221, true);
                return;
            }
            this.L.u(ob6.M0(2131746823, null), ob6.M0(2131746813, null), false, 2131232221, true);
        }
    }

    @Override
    public final void T() {
    }
}
