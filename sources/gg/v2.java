package gg;

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
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import k7.b6;
import k7.d6;
import lh.h3;
import lh.t7;
import lh.t9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r20;
import org.telegram.ui.zn;
public class v2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static n2 D0;
    public Utilities.Callback2 A0;
    public boolean B0;
    public int C0;
    public final int U;
    public final s2 V;
    public final q2 W;
    public final r2 X;
    public final p2 Y;
    public final kp Z;
    public final kg.a f6763a0;
    public final FrameLayout f6764b0;
    public final ArrayList f6765c0;
    public final ArrayList f6766d0;
    public final HashSet f6767e0;
    public final ArrayList f6768f0;
    public final ArrayList f6769g0;
    public final ArrayList f6770h0;
    public final HashMap f6771i0;
    public final ArrayList f6772j0;
    public final LinkedHashMap f6773k0;
    public String f6774l0;
    public hg.h m0;
    public int f6775n0;
    public final ArrayList f6776o0;
    public boolean f6777p0;
    public float f6778q0;
    public o2 f6779r0;
    public final BirthdayController.BirthdayState f6780s0;
    public final androidx.activity.i f6781t0;
    public int f6782u0;
    public mq f6783v0;
    public String f6784w0;
    public r20 f6785x0;
    public h3 f6786y0;
    public final HashSet f6787z0;

    public v2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, false, 1, f6Var);
        int i12;
        float f10;
        boolean z4;
        this.f6765c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f6766d0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f6767e0 = hashSet;
        this.f6768f0 = new ArrayList();
        this.f6769g0 = new ArrayList();
        this.f6770h0 = new ArrayList();
        this.f6771i0 = new HashMap();
        this.f6772j0 = new ArrayList();
        this.f6773k0 = new LinkedHashMap();
        this.f6775n0 = AndroidUtilities.dp(120.0f);
        this.f6776o0 = new ArrayList();
        this.f6777p0 = false;
        this.f6781t0 = new androidx.activity.i(this, 22);
        this.f6782u0 = -1;
        this.f6787z0 = new HashSet();
        this.currentAccount = i10;
        int i13 = j6.f19952h5;
        fixNavigationBar(j6.v0(i13, f6Var));
        this.drawDoubleNavigationBar = false;
        this.U = i11;
        this.f6780s0 = birthdayState;
        hg.h hVar = this.m0;
        if (hVar != null) {
            if (i11 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            hVar.f7089w = z4;
        }
        ?? dVar = new kg.d(getContext(), f6Var);
        this.Y = dVar;
        dVar.setOnCloseClickListener(new g2(this, 11));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.e.c(0.0f, false);
        this.f6779r0 = new o2(this, 0);
        q2 q2Var = new q2(this, getContext(), f6Var);
        this.W = q2Var;
        q2Var.setBackgroundColor(getThemedColor(i13));
        q2Var.setOnSearchTextChange(new h2(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        q2Var.f10546b.setHintText(LocaleController.getString(i12), false);
        r2 r2Var = new r2(this, getContext());
        this.X = r2Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, b6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(q2Var, b6.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(r2Var, b6.f(1.0f, 55, i16, 0, i16, 0));
        kg.a aVar = new kg.a(getContext(), f6Var, (rl0) null);
        this.f6763a0 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(j6.v0(i13, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.f19971i6), 6, 6));
            kp kpVar = new kp(context, 24, f6Var);
            this.Z = kpVar;
            kpVar.b(j6.Oh, j6.f19989j7, j6.f20007k7);
            kpVar.setDrawUnchecked(true);
            kpVar.a(false, false);
            kpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(kpVar, b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.f19987j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
            d6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final v2 f6683b;

                {
                    this.f6683b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            kp kpVar2 = this.f6683b.Z;
                            kpVar2.a(!kpVar2.f26377a.f22938q, true);
                            return;
                        default:
                            this.f6683b.d0();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, b6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        s2 s2Var = new s2(this, getContext(), f6Var);
        this.V = s2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        s2Var.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f6683b;

            {
                this.f6683b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        kp kpVar2 = this.f6683b.Z;
                        kpVar2.a(!kpVar2.f26377a.f22938q, true);
                        return;
                    default:
                        this.f6683b.d0();
                        return;
                }
            }
        });
        aVar.addView(s2Var, b6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, b6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6764b0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, b6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        hg.h hVar2 = this.m0;
        rl0 rl0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f7085f = rl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f10 = 60.0f;
        } else {
            f10 = 0.0f;
        }
        rl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f10));
        this.d.j(new t2(this));
        this.d.setOnItemClickListener(new l2(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((kl0) new m2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new u2(this));
        q2Var.setText("");
        q2Var.d.b(false);
        q2Var.b(false, hashSet, new g2(this, 12), null);
        dVar.setText(y());
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            p0.j(i10, null, new h2(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        t7.y(i10, false).V();
    }

    public static void P(v2 v2Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = v2Var.f6770h0;
        arrayList.clear();
        v2Var.f6782u0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(v2Var.currentAccount);
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
        v2Var.i0(true, true);
    }

    public static void Q(v2 v2Var, int i10, f6 f6Var, int i11, View view) {
        long j10;
        boolean z4;
        boolean z10;
        float f10;
        g2 g2Var;
        kg.a aVar = v2Var.f6763a0;
        q2 q2Var = v2Var.W;
        HashSet hashSet = v2Var.f6767e0;
        if (view instanceof n8) {
            if (i10 == 4) {
                r20 r20Var = v2Var.f6785x0;
                if (r20Var != null) {
                    r20Var.run();
                    v2Var.dismiss();
                    return;
                }
                return;
            }
            z4.m(v2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new h2(v2Var, 2), new g2(v2Var, 9), false, false, v2Var.resourcesProvider).f19500a.show();
        } else if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                h3 h3Var = v2Var.f6786y0;
                if (h3Var != null) {
                    h3Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f19306id;
                } else {
                    j10 = -chat.f19159id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    h3 h3Var2 = v2Var.f6786y0;
                    if (h3Var2 != null) {
                        h3Var2.run(Long.valueOf(j11));
                        return;
                    }
                    return;
                }
                boolean z11 = true;
                if (i10 == 1) {
                    if (q2Var != null) {
                        AndroidUtilities.hideKeyboard(q2Var.getEditText());
                    }
                    t9 t9Var = new t9(v2Var.getContext(), f6Var, user, new g2(v2Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        t9Var.makeAttached(v2Var.attachedFragment);
                    }
                    t9Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback2 = v2Var.A0;
                        if (callback2 != null) {
                            kp kpVar = v2Var.Z;
                            callback2.run(Boolean.valueOf((kpVar == null || !kpVar.f26377a.f22938q) ? false : false), hashSet);
                            v2Var.A0 = null;
                        }
                        v2Var.dismiss();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        v2Var.f6773k0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == v2Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        v2Var.f0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z4 != z10) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f11 = 0.0f;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f10);
                        if (!z10) {
                            f11 = AndroidUtilities.dp(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f11).setInterpolator(mr.h).setDuration(320L);
                        if (!z10) {
                            g2Var = new g2(v2Var, 1);
                        } else {
                            g2Var = null;
                        }
                        duration.withEndAction(g2Var).start();
                        hg.h hVar = v2Var.m0;
                        boolean z12 = !z10;
                        if (hVar.f7090x != z12) {
                            hVar.f7090x = z12;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f7085f, (h5.d) new hg.f(z12));
                        }
                    }
                    v2Var.W();
                    q2Var.b(true, hashSet, new g2(v2Var, 2), null);
                    v2Var.i0(true, true);
                    v2Var.X();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new qc(v2Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    kh.g2 g2Var2 = new kh.g2(v2Var.getContext(), i11, j11, p0.c(p0.b(1, v2Var.f6776o0)), new h2(v2Var, 1));
                    BirthdayController.BirthdayState birthdayState = v2Var.f6780s0;
                    g2Var2.V((birthdayState == null || !birthdayState.contains(j11)) ? false : false);
                    g2Var2.show();
                }
            }
        }
    }

    public static void R(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = v2Var.f6764b0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            ic Q = new qc(frameLayout, v2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f25671j = 5000;
            Q.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(v2Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (v2Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v2Var.getContext(), 0, v2Var.resourcesProvider);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                kf.k0.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        kf.k0.v(R.string.UnknownError, new qc(frameLayout, v2Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(v2 v2Var, final TLRPC.User user, View view) {
        p70 F = p70.F(v2Var.container, v2Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(v2Var) {
            public final v2 f6670b;

            {
                this.f6670b = v2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.f6670b.f28701n;
                            if (p2Var == null) {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f20453a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19306id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19306id);
                            p2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.f6670b.f28701n;
                            if (p2Var2 == null) {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f20453a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19306id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19306id);
                            p2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(v2Var) {
            public final v2 f6670b;

            {
                this.f6670b = v2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.f6670b.f28701n;
                            if (p2Var == null) {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f20453a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19306id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19306id);
                            p2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.f6670b.f28701n;
                            if (p2Var2 == null) {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f20453a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19306id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19306id);
                            p2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(v2 v2Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(v2Var.currentAccount).getUserFull(UserConfig.getInstance(v2Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(v2Var.currentAccount).sendRequest(updatebirthday, new y(v2Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(v2Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(v2Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(v2Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        v2Var.h0(true, true);
    }

    public static void U(v2 v2Var, String str) {
        if (v2Var.f6782u0 >= 0) {
            ConnectionsManager.getInstance(v2Var.currentAccount).cancelRequest(v2Var.f6782u0, true);
            v2Var.f6782u0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f19205q = str;
        v2Var.f6782u0 = ConnectionsManager.getInstance(v2Var.currentAccount).sendRequest(tL_contacts_search, new ff.a(v2Var, 4));
    }

    public static boolean a0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        e0(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static v2 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        n2 n2Var = D0;
        if (n2Var != null) {
            return n2Var;
        }
        ?? v2Var = new v2(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            v2Var.makeAttached(R);
        }
        R.showDialog(v2Var);
        D0 = v2Var;
        return v2Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        p2 p2Var = this.Y;
        p2Var.setTranslationY(max);
        float translationY = p2Var.getTranslationY() + p2Var.getMeasuredHeight();
        q2 q2Var = this.W;
        q2Var.setTranslationY(translationY);
        float translationY2 = q2Var.getTranslationY() + q2Var.getMeasuredHeight();
        r2 r2Var = this.X;
        r2Var.setTranslationY(translationY2);
        int measuredHeight = q2Var.getMeasuredHeight() + p2Var.getMeasuredHeight();
        this.d.setTranslationY((r2Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final int V(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.f19306id)) {
                long j10 = user.f19306id;
                if (j10 != 0 && !this.f6787z0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f19306id);
                    HashSet hashSet = this.f6767e0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    hg.g c3 = hg.g.c(user, hashSet.contains(Long.valueOf(user.f19306id)));
                    Y(c3);
                    arrayList3.add(c3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(hg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f6767e0.isEmpty() && (i10 = this.U) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f6777p0) {
                this.f6777p0 = false;
                AndroidUtilities.runOnUIThread(new g2(this, 4), 10L);
            }
        } else if (!this.f6777p0) {
            this.f6777p0 = true;
            AndroidUtilities.runOnUIThread(new g2(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f6774l0)) {
            this.f6774l0 = null;
            this.W.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f6781t0);
            h0(true, true);
        }
    }

    public final hg.g Y(hg.g gVar) {
        cg.n nVar;
        int i10 = this.U;
        if (i10 == 4) {
            TLRPC.User user = gVar.f7072c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f19306id;
            ?? r22 = new View.OnClickListener(this) {
                public final v2 f6658b;

                {
                    this.f6658b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            v2 v2Var = this.f6658b;
                            HashSet hashSet = v2Var.f6767e0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = v2Var.A0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                v2Var.A0 = null;
                            }
                            v2Var.dismiss();
                            return;
                        default:
                            v2 v2Var2 = this.f6658b;
                            HashSet hashSet2 = v2Var2.f6767e0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = v2Var2.A0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                v2Var2.A0 = null;
                            }
                            v2Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final v2 f6658b;

                {
                    this.f6658b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            v2 v2Var = this.f6658b;
                            HashSet hashSet = v2Var.f6767e0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = v2Var.A0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                v2Var.A0 = null;
                            }
                            v2Var.dismiss();
                            return;
                        default:
                            v2 v2Var2 = this.f6658b;
                            HashSet hashSet2 = v2Var2.f6767e0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = v2Var2.A0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                v2Var2.A0 = null;
                            }
                            v2Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f7081o = r22;
            gVar.f7082p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f7072c;
        if (i10 == 3) {
            nVar = null;
        } else {
            nVar = new cg.n(6, this, user2);
        }
        gVar.f7080n = nVar;
        return gVar;
    }

    public final int Z() {
        if (this.U == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.f6787z0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z4) {
        ArrayList arrayList = this.f6768f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f6771i0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.f6772j0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z4) {
        ArrayList arrayList = this.f6769g0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f6767e0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f6776o0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.U;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f6773k0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f19306id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.W.getEditText());
                boolean z4 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.A0;
                        if (callback2 != null) {
                            kp kpVar = this.Z;
                            callback2.run(Boolean.valueOf((kpVar == null || !kpVar.f26377a.f22938q) ? false : false), hashSet);
                            this.A0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c3 = p0.c(p0.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f19306id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new qc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        kh.g2 g2Var = new kh.g2(getContext(), this.currentAccount, j10, c3, new h2(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f6780s0;
                        g2Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        g2Var.show();
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.giftsToUserSent) {
            dismiss();
        } else if (i10 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new g2(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new g2(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new g2(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.W.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        D0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f6781t0);
    }

    public final void f0() {
        String string;
        if (this.U == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new qc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z4) {
        s2 s2Var = this.V;
        boolean z10 = false;
        s2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.U;
        HashSet hashSet = this.f6767e0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f6779r0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f6779r0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        s2Var.c(hashSet.size(), true);
        s2Var.g(spannableStringBuilder, z4, false);
        if (hashSet.size() > 0) {
            z10 = true;
        }
        s2Var.setEnabled(z10);
    }

    public final void h0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: gg.v2.h0(boolean, boolean):void");
    }

    public final void i0(boolean z4, boolean z10) {
        int R;
        int R2;
        h0(z4, z10);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            rl0 rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if ((childAt instanceof kg.n) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f6766d0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    hg.g gVar = (hg.g) arrayList.get(R2);
                    kg.n nVar = (kg.n) childAt;
                    nVar.c(gVar.f7077k, z4);
                    TLRPC.Chat chat = gVar.e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.m0.F(chat) > 200) {
                            f10 = 0.3f;
                        }
                        nVar.i(f10, z4);
                    } else {
                        nVar.i(1.0f, z4);
                    }
                    i12 = R;
                }
            }
            i10++;
        }
        if (z4) {
            this.m0.q(0, i11);
            hg.h hVar = this.m0;
            hVar.q(i12, hVar.h() - i12);
        }
        g0(z4);
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
    public final ql0 v(rl0 rl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, false);
        this.m0 = hVar;
        hVar.f7087r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f6784w0;
        if (str != null) {
            return str;
        }
        int i10 = this.U;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        return LocaleController.getString(R.string.GiftTelegramPremiumTitle);
                    }
                    return LocaleController.getString(R.string.VoipConferenceAddPeople);
                }
            } else {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
