package cg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h7.b6;
import h7.z5;
import hh.i3;
import hh.u7;
import hh.x9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e20;
import org.telegram.ui.rn;

public class y2 extends qa implements NotificationCenter.NotificationCenterDelegate {
    public static q2 C0;
    public boolean A0;
    public int B0;
    public final int T;
    public final v2 U;
    public final t2 V;
    public final u2 W;
    public final s2 X;
    public final bp Y;
    public final gg.a Z;

    public final FrameLayout f2868a0;

    public final ArrayList f2869b0;

    public final ArrayList f2870c0;

    public final HashSet f2871d0;

    public final ArrayList f2872e0;

    public final ArrayList f2873f0;

    public final ArrayList f2874g0;

    public final HashMap f2875h0;

    public final ArrayList f2876i0;

    public final LinkedHashMap f2877j0;

    public String f2878k0;

    public dg.h f2879l0;
    public int m0;

    public final ArrayList f2880n0;

    public boolean f2881o0;

    public float f2882p0;

    public r2 f2883q0;

    public final BirthdayController.BirthdayState f2884r0;

    public final a8.b f2885s0;

    public int f2886t0;

    public dq f2887u0;

    public String f2888v0;

    public e20 f2889w0;

    public i3 f2890x0;

    public final HashSet f2891y0;

    public Utilities.Callback2 f2892z0;

    public y2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, c6 c6Var) {
        super(context, null, true, false, false, 1, c6Var);
        this.f2869b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f2870c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f2871d0 = hashSet;
        this.f2872e0 = new ArrayList();
        this.f2873f0 = new ArrayList();
        this.f2874g0 = new ArrayList();
        this.f2875h0 = new HashMap();
        this.f2876i0 = new ArrayList();
        this.f2877j0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(120.0f);
        this.f2880n0 = new ArrayList();
        this.f2881o0 = false;
        this.f2885s0 = new a8.b(this, 10);
        this.f2886t0 = -1;
        this.f2891y0 = new HashSet();
        this.currentAccount = i10;
        int i12 = g6.f23124h5;
        fixNavigationBar(g6.v0(i12, c6Var));
        this.drawDoubleNavigationBar = false;
        this.T = i11;
        this.f2884r0 = birthdayState;
        dg.h hVar = this.f2879l0;
        if (hVar != null) {
            hVar.f4967w = i11 == 4;
        }
        s2 s2Var = new s2(getContext(), c6Var);
        this.X = s2Var;
        s2Var.setOnCloseClickListener(new j2(this, 11));
        s2Var.setText(z());
        s2Var.setCloseImageVisible(false);
        s2Var.f7084e.c(0.0f, false);
        this.f2883q0 = new r2(this, 0);
        t2 t2Var = new t2(this, getContext(), c6Var);
        this.V = t2Var;
        t2Var.setBackgroundColor(getThemedColor(i12));
        t2Var.setOnSearchTextChange(new k2(this, 3));
        t2Var.f7107b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        u2 u2Var = new u2(this, getContext());
        this.W = u2Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(s2Var, 0, z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(t2Var, z5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(u2Var, z5.f(1.0f, 55, i15, 0, i15, 0));
        gg.a aVar = new gg.a(getContext(), c6Var, (zk0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i12, c6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(g6.Y(getThemedColor(g6.f23144i6), 6, 6));
            bp bpVar = new bp(context, 24, c6Var);
            this.Y = bpVar;
            bpVar.b(g6.Oh, g6.f23163j7, g6.f23182k7);
            bpVar.setDrawUnchecked(true);
            bpVar.a(false, false);
            bpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(bpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(g6.f23161j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            final int i16 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {

                public final y2 f2787b;

                {
                    this.f2787b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            bp bpVar2 = this.f2787b.Y;
                            bpVar2.a(!bpVar2.f27188a.f26309q, true);
                            break;
                        default:
                            this.f2787b.d0();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, z5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        v2 v2Var = new v2(this, getContext(), c6Var);
        this.U = v2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        final int i17 = 1;
        v2Var.setOnClickListener(new View.OnClickListener(this) {

            public final y2 f2787b;

            {
                this.f2787b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        bp bpVar2 = this.f2787b.Y;
                        bpVar2.a(!bpVar2.f27188a.f26309q, true);
                        break;
                    default:
                        this.f2787b.d0();
                        break;
                }
            }
        });
        aVar.addView(v2Var, z5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, z5.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2868a0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, z5.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        dg.h hVar2 = this.f2879l0;
        zk0 zk0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f4963f = zk0Var;
        int i20 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new w2(this));
        this.d.setOnItemClickListener(new o2(this, i11, c6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((sk0) new p2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new x2(this));
        t2Var.setText("");
        t2Var.d.b(false);
        t2Var.b(false, hashSet, new j2(this, 12), null);
        s2Var.setText(z());
        na naVar = this.f31853e;
        if (naVar != null) {
            naVar.setTitle(z());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            q0.j(i10, null, new k2(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            u7.y(i10, false).V();
        }
    }

    public static void P(y2 y2Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = y2Var.f2874g0;
        arrayList.clear();
        y2Var.f2886t0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(y2Var.currentAccount);
            int i10 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.Peer peer = arrayList2.get(i11);
                i11++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i10);
                i10++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        y2Var.i0(true, true);
    }

    public static void Q(y2 y2Var, int i10, c6 c6Var, int i11, View view) {
        gg.a aVar = y2Var.Z;
        t2 t2Var = y2Var.V;
        HashSet hashSet = y2Var.f2871d0;
        int i12 = 2;
        if (view instanceof l8) {
            if (i10 != 4) {
                y4.m(y2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new k2(y2Var, i12), new j2(y2Var, 9), false, false, y2Var.resourcesProvider).f23994a.show();
                return;
            }
            e20 e20Var = y2Var.f2889w0;
            if (e20Var != null) {
                e20Var.run();
                y2Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof gg.o) {
            gg.o oVar = (gg.o) view;
            TLRPC.User user = oVar.getUser();
            TLRPC.Chat chat = oVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i3 i3Var = y2Var.f2890x0;
                if (i3Var != null) {
                    i3Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.f22527id : -chat.f22380id;
            if (i10 == 3) {
                i3 i3Var2 = y2Var.f2890x0;
                if (i3Var2 != null) {
                    i3Var2.run(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (t2Var != null) {
                    AndroidUtilities.hideKeyboard(t2Var.getEditText());
                }
                x9 x9Var = new x9(y2Var.getContext(), c6Var, user, new j2(y2Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    x9Var.makeAttached(y2Var.attachedFragment);
                }
                x9Var.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j10)) {
                    new mc(y2Var.container, c6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                    return;
                }
                gh.k2 k2Var = new gh.k2(y2Var.getContext(), i11, j10, q0.c(q0.b(1, y2Var.f2880n0)), new k2(y2Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = y2Var.f2884r0;
                k2Var.V(birthdayState != null && birthdayState.contains(j10));
                k2Var.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j10));
                Utilities.Callback2 callback2 = y2Var.f2892z0;
                if (callback2 != null) {
                    bp bpVar = y2Var.Y;
                    callback2.run(Boolean.valueOf(bpVar != null && bpVar.f27188a.f26309q), hashSet);
                    y2Var.f2892z0 = null;
                }
                y2Var.dismiss();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                y2Var.f2877j0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == y2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                y2Var.f0();
                return;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(er.h).setDuration(320L).withEndAction(!z11 ? new j2(y2Var, true ? 1 : 0) : null).start();
                dg.h hVar = y2Var.f2879l0;
                boolean z12 = !z11;
                if (hVar.f4968x != z12) {
                    hVar.f4968x = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f4963f, (d5.d) new dg.f(z12));
                }
            }
            y2Var.W();
            t2Var.b(true, hashSet, new j2(y2Var, i12), null);
            y2Var.i0(true, true);
            y2Var.X();
        }
    }

    public static void R(y2 y2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = y2Var.f2868a0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            ec ecVarQ = new mc(frameLayout, y2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            ecVarQ.f28020j = 5000;
            ecVarQ.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(y2Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.y1.q(R.string.UnknownError, new mc(frameLayout, y2Var.resourcesProvider), R.raw.error, 36);
        } else if (y2Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y2Var.getContext(), 0, y2Var.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            i0.a.C(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final y2 y2Var, final TLRPC.User user, View view) {
        b70 b70VarF = b70.F(y2Var.container, y2Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        b70VarF.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(y2Var) {

            public final y2 f2776b;

            {
                this.f2776b = y2Var;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = this.f2776b.f31855n;
                            if (n2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.f22527id);
                                n2Var.presentFragment(new rn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                l2Var.f23619a = true;
                                if (n2VarU != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f22527id);
                                    n2VarU.showAsSheet(new rn(bundle2), l2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f2776b.f31855n;
                            if (n2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.f22527id);
                                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                if (n2VarU2 != null) {
                                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                                    l2Var2.f23619a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f22527id);
                                    n2VarU2.showAsSheet(new ProfileActivity(bundle4, null), l2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        b70VarF.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(y2Var) {

            public final y2 f2776b;

            {
                this.f2776b = y2Var;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = this.f2776b.f31855n;
                            if (n2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.f22527id);
                                n2Var.presentFragment(new rn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                l2Var.f23619a = true;
                                if (n2VarU != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f22527id);
                                    n2VarU.showAsSheet(new rn(bundle2), l2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f2776b.f31855n;
                            if (n2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.f22527id);
                                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                                if (n2VarU2 != null) {
                                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                                    l2Var2.f23619a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f22527id);
                                    n2VarU2.showAsSheet(new ProfileActivity(bundle4, null), l2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        b70VarF.Z();
    }

    public static void T(y2 y2Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(y2Var.currentAccount).getUserFull(UserConfig.getInstance(y2Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(y2Var.currentAccount).sendRequest(updatebirthday, new y(y2Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(y2Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(y2Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(y2Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        y2Var.h0(true, true);
    }

    public static void U(y2 y2Var, String str) {
        if (y2Var.f2886t0 >= 0) {
            ConnectionsManager.getInstance(y2Var.currentAccount).cancelRequest(y2Var.f2886t0, true);
            y2Var.f2886t0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f22426q = str;
        y2Var.f2886t0 = ConnectionsManager.getInstance(y2Var.currentAccount).sendRequest(tL_contacts_search, new cf.a(y2Var, 4));
    }

    public static boolean a0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String string = data.toString();
                if (string.startsWith("tg:premium_multigift") || string.startsWith("tg://premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static y2 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return null;
        }
        q2 q2Var = C0;
        if (q2Var != null) {
            return q2Var;
        }
        q2 q2Var2 = new q2(n2VarR.getContext(), n2VarR.getCurrentAccount(), birthdayState, i10, n2VarR.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(n2VarR)) {
            q2Var2.makeAttached(n2VarR);
        }
        n2VarR.showDialog(q2Var2);
        C0 = q2Var2;
        return q2Var2;
    }

    @Override
    public final void D(Canvas canvas, int i10) {
        float fMax = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        s2 s2Var = this.X;
        s2Var.setTranslationY(fMax);
        float translationY = s2Var.getTranslationY() + s2Var.getMeasuredHeight();
        t2 t2Var = this.V;
        t2Var.setTranslationY(translationY);
        float translationY2 = t2Var.getTranslationY() + t2Var.getMeasuredHeight();
        u2 u2Var = this.W;
        u2Var.setTranslationY(translationY2);
        this.d.setTranslationY((u2Var.getMeasuredHeight() + (t2Var.getMeasuredHeight() + s2Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final int V(String str, ArrayList arrayList, ArrayList arrayList2) {
        int iDp = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.f22527id)) {
                long j10 = user.f22527id;
                if (j10 != 0 && !this.f2891y0.contains(Long.valueOf(j10))) {
                    Long lValueOf = Long.valueOf(user.f22527id);
                    HashSet hashSet = this.f2871d0;
                    hashSet.contains(lValueOf);
                    iDp += AndroidUtilities.dp(56.0f);
                    dg.g gVarC = dg.g.c(user, hashSet.contains(Long.valueOf(user.f22527id)));
                    Y(gVarC);
                    arrayList3.add(gVarC);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return iDp;
        }
        int iDp2 = AndroidUtilities.dp(32.0f) + iDp;
        arrayList.add(dg.g.b(str));
        arrayList.addAll(arrayList3);
        return iDp2;
    }

    public final void W() {
        int i10;
        if (!this.f2871d0.isEmpty() || (i10 = this.T) == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (this.f2881o0) {
                return;
            }
            this.f2881o0 = true;
            AndroidUtilities.runOnUIThread(new j2(this, 3), 10L);
            return;
        }
        if (this.f2881o0) {
            this.f2881o0 = false;
            AndroidUtilities.runOnUIThread(new j2(this, 4), 10L);
        }
    }

    public final void X() {
        if (TextUtils.isEmpty(this.f2878k0)) {
            return;
        }
        this.f2878k0 = null;
        this.V.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.f2885s0);
        h0(true, true);
    }

    public final dg.g Y(dg.g gVar) {
        int i10 = this.T;
        if (i10 != 4) {
            gVar.f4957n = i10 == 3 ? null : new ag.q0(3, this, gVar.f4948c);
            return gVar;
        }
        TLRPC.User user = gVar.f4948c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.f22527id;
        final int i11 = 0;
        ?? r10 = new View.OnClickListener(this) {

            public final y2 f2765b;

            {
                this.f2765b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        y2 y2Var = this.f2765b;
                        HashSet hashSet = y2Var.f2871d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = y2Var.f2892z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            y2Var.f2892z0 = null;
                        }
                        y2Var.dismiss();
                        break;
                    default:
                        y2 y2Var2 = this.f2765b;
                        HashSet hashSet2 = y2Var2.f2871d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback3 = y2Var2.f2892z0;
                        if (callback3 != null) {
                            callback3.run(Boolean.TRUE, hashSet2);
                            y2Var2.f2892z0 = null;
                        }
                        y2Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r11 = new View.OnClickListener(this) {

            public final y2 f2765b;

            {
                this.f2765b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        y2 y2Var = this.f2765b;
                        HashSet hashSet = y2Var.f2871d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = y2Var.f2892z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            y2Var.f2892z0 = null;
                        }
                        y2Var.dismiss();
                        break;
                    default:
                        y2 y2Var2 = this.f2765b;
                        HashSet hashSet2 = y2Var2.f2871d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback3 = y2Var2.f2892z0;
                        if (callback3 != null) {
                            callback3.run(Boolean.TRUE, hashSet2);
                            y2Var2.f2892z0 = null;
                        }
                        y2Var2.dismiss();
                        break;
                }
            }
        };
        gVar.f4958o = r10;
        gVar.f4959p = r11;
        return gVar;
    }

    public final int Z() {
        if (this.T == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.f2891y0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f2872e0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f2875h0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.f2876i0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f2873f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f2871d0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f2880n0;
            boolean zIsEmpty = arrayList.isEmpty();
            int i10 = this.T;
            if (!zIsEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f2877j0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f22527id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.V.getEditText());
                boolean z10 = true;
                if (i10 == 1) {
                    return;
                }
                if (i10 == 4) {
                    Utilities.Callback2 callback2 = this.f2892z0;
                    if (callback2 != null) {
                        bp bpVar = this.Y;
                        callback2.run(Boolean.valueOf(bpVar != null && bpVar.f27188a.f26309q), hashSet);
                        this.f2892z0 = null;
                    }
                    dismiss();
                    return;
                }
                List listC = q0.c(q0.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).f22527id;
                    if (UserObject.areGiftsDisabled(j10)) {
                        new mc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    gh.k2 k2Var = new gh.k2(getContext(), this.currentAccount, j10, listC, new k2(this, z10 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.f2884r0;
                    k2Var.V(birthdayState != null && birthdayState.contains(j10));
                    k2Var.show();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.giftsToUserSent) {
            dismiss();
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new j2(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new j2(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new j2(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        C0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f2885s0);
    }

    public final void f0() {
        new mc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.T == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        v2 v2Var = this.U;
        v2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.T;
        HashSet hashSet = this.f2871d0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        } else if (LocaleController.isRTL) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f2883q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f2883q0, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
        }
        v2Var.c(hashSet.size(), true);
        v2Var.g(spannableStringBuilder, z10, false);
        v2Var.setEnabled(hashSet.size() > 0);
    }

    public final void h0(boolean z10, boolean z11) {
        int iDp;
        TLRPC.User currentUser;
        float f10;
        long j10;
        dg.g gVarB;
        ArrayList arrayList;
        int size;
        int iDp2;
        int i10;
        int i11;
        String str;
        ArrayList arrayList2;
        Iterator it;
        String str2;
        long clientUserId;
        long j11;
        HashSet hashSet;
        Iterator it2;
        BirthdayController.BirthdayState birthdayState;
        dg.h hVar;
        int i12;
        ArrayList arrayList3 = this.f2869b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f2870c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean zIsEmpty = TextUtils.isEmpty(this.f2878k0);
        HashSet hashSet2 = this.f2891y0;
        int i13 = 3;
        int i14 = this.T;
        HashSet hashSet3 = this.f2871d0;
        if (zIsEmpty) {
            if (this.A0 && i14 == 3) {
                if (this.f2887u0 == null) {
                    dq dqVar = new dq(g6.K(AndroidUtilities.dp(46.0f), g6.v0(g6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int iDp3 = AndroidUtilities.dp(24.0f);
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    dqVar.f27823e = iDp3;
                    dqVar.f27824f = iDp4;
                    this.f2887u0 = dqVar;
                }
                dq dqVar2 = this.f2887u0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i15 = this.B0;
                String pluralString = i15 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i15, new Object[0]) : "";
                dg.g gVar = new dg.g(3, true);
                gVar.f4952i = 2;
                gVar.f4961r = dqVar2;
                gVar.f4951g = string;
                gVar.h = pluralString;
                arrayList4.add(gVar);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i14 == 0 || i14 == 2) && userFull != null && userFull.birthday == null) {
                iDp = AndroidUtilities.dp(50.0f);
                int i16 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                dg.g gVar2 = new dg.g(9, false);
                gVar2.f4952i = 1;
                gVar2.f4953j = i16;
                gVar2.f4951g = string2;
                arrayList4.add(gVar2);
            } else {
                iDp = 0;
            }
            if (this.f2889w0 != null && i14 == 4) {
                int i17 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                dg.g gVar3 = new dg.g(9, false);
                gVar3.f4952i = 3;
                gVar3.f4953j = i17;
                gVar3.f4951g = string3;
                arrayList4.add(gVar3);
            }
            BirthdayController.BirthdayState birthdayState2 = this.f2884r0;
            if (birthdayState2 != null) {
                iDp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList4, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList4, birthdayState2.today) + iDp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList4, birthdayState2.tomorrow);
            }
            if ((i14 == 0 || i14 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList4.add(dg.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                dg.g gVarC = dg.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.f22527id)));
                gVarC.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList4.add(gVarC);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.f2873f0;
            if (arrayList6.isEmpty()) {
                f10 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList6.get(i18);
                    i18++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j12 = user.f22527id;
                        if (j12 != 0 && !user.self && !user.bot && !UserObject.isService(j12) && !UserObject.isDeleted(user) && (birthdayState2 == null || !birthdayState2.contains(user.f22527id))) {
                            if (!hashSet2.contains(Long.valueOf(user.f22527id))) {
                                if (hashSet3.contains(Long.valueOf(user.f22527id))) {
                                    arrayList5.add(Long.valueOf(user.f22527id));
                                }
                                iDp += AndroidUtilities.dp(56.0f);
                                dg.g gVarC2 = dg.g.c(user, hashSet3.contains(Long.valueOf(user.f22527id)));
                                Y(gVarC2);
                                arrayList7.add(gVarC2);
                            }
                        }
                    }
                }
                f10 = 32.0f;
                j10 = 0;
                if (!arrayList7.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    gVarB = dg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList4.add(gVarB);
                    arrayList4.addAll(arrayList7);
                }
                arrayList = this.f2876i0;
                size = arrayList.size();
                iDp2 = iDp;
                i10 = 0;
                while (i10 < size) {
                    i11 = i10 + 1;
                    str = (String) arrayList.get(i10);
                    arrayList2 = new ArrayList();
                    it = ((List) this.f2875h0.get(str)).iterator();
                    while (it.hasNext()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) it.next();
                        String str3 = str;
                        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                        int i19 = size;
                        int i20 = i11;
                        j11 = tL_contact.user_id;
                        if (j11 != clientUserId || j11 == j10 || ((birthdayState2 != null && birthdayState2.contains(j11)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                            hashSet = hashSet2;
                            it2 = it;
                        } else {
                            hashSet = hashSet2;
                            it2 = it;
                            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (user2 != null && !user2.bot) {
                                birthdayState = birthdayState2;
                                if (!UserObject.isService(user2.f22527id)) {
                                    iDp2 += AndroidUtilities.dp(56.0f);
                                    if (hashSet3.contains(Long.valueOf(user2.f22527id))) {
                                        arrayList5.add(Long.valueOf(user2.f22527id));
                                    }
                                    dg.g gVarC3 = dg.g.c(user2, hashSet3.contains(Long.valueOf(user2.f22527id)));
                                    Y(gVarC3);
                                    arrayList2.add(gVarC3);
                                }
                            }
                            size = i19;
                            hashSet2 = hashSet;
                            birthdayState2 = birthdayState;
                            str = str3;
                            it = it2;
                            i11 = i20;
                        }
                        birthdayState = birthdayState2;
                        size = i19;
                        hashSet2 = hashSet;
                        birthdayState2 = birthdayState;
                        str = str3;
                        it = it2;
                        i11 = i20;
                    }
                    str2 = str;
                    BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                    int i21 = size;
                    int i22 = i11;
                    HashSet hashSet4 = hashSet2;
                    if (!arrayList2.isEmpty()) {
                        int iDp5 = AndroidUtilities.dp(f10) + iDp2;
                        String upperCase = str2.toUpperCase();
                        dg.g gVar4 = new dg.g(7, false);
                        gVar4.f4951g = upperCase;
                        arrayList4.add(gVar4);
                        arrayList4.addAll(arrayList2);
                        iDp2 = iDp5;
                    }
                    size = i21;
                    hashSet2 = hashSet4;
                    birthdayState2 = birthdayState3;
                    i10 = i22;
                }
                if (gVarB != null && arrayList5.size() > 0 && !hashSet3.isEmpty()) {
                    String string4 = LocaleController.getString(R.string.DeselectAll);
                    ag.q0 q0Var = new ag.q0(2, this, arrayList5);
                    gVarB.h = string4;
                    gVarB.f4956m = q0Var;
                }
            }
            gVarB = null;
            arrayList = this.f2876i0;
            size = arrayList.size();
            iDp2 = iDp;
            i10 = 0;
            while (i10 < size) {
                i11 = i10 + 1;
                str = (String) arrayList.get(i10);
                arrayList2 = new ArrayList();
                it = ((List) this.f2875h0.get(str)).iterator();
                while (it.hasNext()) {
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) it.next();
                    String str4 = str;
                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    int i110 = size;
                    int i23 = i11;
                    j11 = tL_contact2.user_id;
                    if (j11 != clientUserId) {
                        hashSet = hashSet2;
                        it2 = it;
                        birthdayState = birthdayState2;
                    } else {
                        hashSet = hashSet2;
                        it2 = it;
                        birthdayState = birthdayState2;
                    }
                    size = i110;
                    hashSet2 = hashSet;
                    birthdayState2 = birthdayState;
                    str = str4;
                    it = it2;
                    i11 = i23;
                }
                str2 = str;
                BirthdayController.BirthdayState birthdayState4 = birthdayState2;
                int i24 = size;
                int i25 = i11;
                HashSet hashSet5 = hashSet2;
                if (!arrayList2.isEmpty()) {
                    int iDp6 = AndroidUtilities.dp(f10) + iDp2;
                    String upperCase2 = str2.toUpperCase();
                    dg.g gVar5 = new dg.g(7, false);
                    gVar5.f4951g = upperCase2;
                    arrayList4.add(gVar5);
                    arrayList4.addAll(arrayList2);
                    iDp2 = iDp6;
                }
                size = i24;
                hashSet2 = hashSet5;
                birthdayState2 = birthdayState4;
                i10 = i25;
            }
            if (gVarB != null) {
                String string5 = LocaleController.getString(R.string.DeselectAll);
                ag.q0 q0Var2 = new ag.q0(2, this, arrayList5);
                gVarB.h = string5;
                gVarB.f4956m = q0Var2;
            }
        } else {
            ArrayList arrayList8 = this.f2874g0;
            int size3 = arrayList8.size();
            iDp2 = 0;
            int i26 = 0;
            while (i26 < size3) {
                Object obj2 = arrayList8.get(i26);
                i26++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    i12 = size3;
                    if (!user3.bot && !UserObject.isService(user3.f22527id)) {
                        long j13 = user3.f22527id;
                        iDp2 = AndroidUtilities.dp(56.0f) + iDp2;
                        if (!hashSet2.contains(Long.valueOf(user3.f22527id))) {
                            dg.g gVarC4 = dg.g.c(user3, hashSet3.contains(Long.valueOf(j13)));
                            Y(gVarC4);
                            arrayList4.add(gVarC4);
                            size3 = i12;
                            i13 = 3;
                        }
                    }
                    size3 = i12;
                } else {
                    i12 = size3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (i14 == i13 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                            long j14 = -chat.f22380id;
                            iDp2 += AndroidUtilities.dp(56.0f);
                            if (!hashSet2.contains(Long.valueOf(-chat.f22380id))) {
                                boolean zContains = hashSet3.contains(Long.valueOf(j14));
                                dg.g gVar6 = new dg.g(3, true);
                                gVar6.f4949e = chat;
                                gVar6.f4948c = null;
                                gVar6.d = null;
                                gVar6.f4954k = zContains;
                                arrayList4.add(gVar6);
                            }
                        } else {
                            size3 = i12;
                        }
                    }
                    size3 = i12;
                    i13 = 3;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new dg.g(5, false));
            iDp2 += AndroidUtilities.dp(150.0f);
        }
        int iMax = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp2);
        dg.g gVar7 = new dg.g(-1, false);
        gVar7.f4955l = iMax;
        arrayList4.add(gVar7);
        if (!z11 || (hVar = this.f2879l0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList3, arrayList4);
        } else {
            hVar.l();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        int iR;
        int iR2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt instanceof gg.o) && (iR2 = (iR = RecyclerView.R(childAt)) - 1) >= 0) {
                ArrayList arrayList = this.f2870c0;
                if (iR2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = iR;
                    }
                    dg.g gVar = (dg.g) arrayList.get(iR2);
                    gg.o oVar = (gg.o) childAt;
                    oVar.c(gVar.f4954k, z10);
                    TLRPC.Chat chat = gVar.f4949e;
                    if (chat != null) {
                        oVar.i(this.f2879l0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                    } else {
                        oVar.i(1.0f, z10);
                    }
                    i12 = iR;
                }
            }
            i10++;
        }
        if (z10) {
            this.f2879l0.q(0, i11);
            dg.h hVar = this.f2879l0;
            hVar.q(i12, hVar.h() - i12);
        }
        g0(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0(false, true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        dg.h hVar = new dg.h(getContext(), this.resourcesProvider, false);
        this.f2879l0 = hVar;
        hVar.f4965r = true;
        return hVar;
    }

    @Override
    public final CharSequence z() {
        String str = this.f2888v0;
        if (str != null) {
            return str;
        }
        int i10 = this.T;
        if (i10 != 0) {
            if (i10 == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i10 != 2) {
                return i10 != 4 ? LocaleController.getString(R.string.GiftTelegramPremiumTitle) : LocaleController.getString(R.string.VoipConferenceAddPeople);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
