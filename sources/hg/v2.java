package hg;

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
import k7.c6;
import k7.e6;
import mh.h3;
import mh.t7;
import mh.t9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q20;
import org.telegram.ui.xn;
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
    public final np Z;
    public final lg.a f7632a0;
    public final FrameLayout f7633b0;
    public final ArrayList f7634c0;
    public final ArrayList f7635d0;
    public final HashSet f7636e0;
    public final ArrayList f7637f0;
    public final ArrayList f7638g0;
    public final ArrayList f7639h0;
    public final HashMap f7640i0;
    public final ArrayList f7641j0;
    public final LinkedHashMap f7642k0;
    public String f7643l0;
    public ig.h m0;
    public int f7644n0;
    public final ArrayList f7645o0;
    public boolean f7646p0;
    public float f7647q0;
    public o2 f7648r0;
    public final BirthdayController.BirthdayState f7649s0;
    public final androidx.activity.i f7650t0;
    public int f7651u0;
    public pq f7652v0;
    public String f7653w0;
    public q20 f7654x0;
    public h3 f7655y0;
    public final HashSet f7656z0;

    public v2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, g6 g6Var) {
        super(context, null, true, false, false, 1, g6Var);
        int i12;
        float f10;
        boolean z4;
        this.f7634c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f7635d0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f7636e0 = hashSet;
        this.f7637f0 = new ArrayList();
        this.f7638g0 = new ArrayList();
        this.f7639h0 = new ArrayList();
        this.f7640i0 = new HashMap();
        this.f7641j0 = new ArrayList();
        this.f7642k0 = new LinkedHashMap();
        this.f7644n0 = AndroidUtilities.dp(120.0f);
        this.f7645o0 = new ArrayList();
        this.f7646p0 = false;
        this.f7650t0 = new androidx.activity.i(this, 22);
        this.f7651u0 = -1;
        this.f7656z0 = new HashSet();
        this.currentAccount = i10;
        int i13 = k6.f21731h5;
        fixNavigationBar(k6.v0(i13, g6Var));
        this.drawDoubleNavigationBar = false;
        this.U = i11;
        this.f7649s0 = birthdayState;
        ig.h hVar = this.m0;
        if (hVar != null) {
            if (i11 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            hVar.f8104w = z4;
        }
        ?? dVar = new lg.d(getContext(), g6Var);
        this.Y = dVar;
        dVar.setOnCloseClickListener(new g2(this, 11));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.f12539e.c(0.0f, false);
        this.f7648r0 = new o2(this, 0);
        q2 q2Var = new q2(this, getContext(), g6Var);
        this.W = q2Var;
        q2Var.setBackgroundColor(getThemedColor(i13));
        q2Var.setOnSearchTextChange(new h2(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        q2Var.f12559b.setHintText(LocaleController.getString(i12), false);
        r2 r2Var = new r2(this, getContext());
        this.X = r2Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, c6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(q2Var, c6.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(r2Var, c6.f(1.0f, 55, i16, 0, i16, 0));
        lg.a aVar = new lg.a(getContext(), g6Var, (tl0) null);
        this.f7632a0 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(k6.v0(i13, g6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(k6.Y(getThemedColor(k6.f21750i6), 6, 6));
            np npVar = new np(context, 24, g6Var);
            this.Z = npVar;
            npVar.b(k6.Oh, k6.f21768j7, k6.f21786k7);
            npVar.setDrawUnchecked(true);
            npVar.a(false, false);
            npVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(npVar, c6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(k6.f21766j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, c6.t(-2, -2, 16, 9, 0, 0, 0));
            e6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final v2 f7545b;

                {
                    this.f7545b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            np npVar2 = this.f7545b.Z;
                            npVar2.a(!npVar2.f29606a.f24809q, true);
                            return;
                        default:
                            this.f7545b.d0();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, c6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        s2 s2Var = new s2(this, getContext(), g6Var);
        this.V = s2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        s2Var.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f7545b;

            {
                this.f7545b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        np npVar2 = this.f7545b.Z;
                        npVar2.a(!npVar2.f29606a.f24809q, true);
                        return;
                    default:
                        this.f7545b.d0();
                        return;
                }
            }
        });
        aVar.addView(s2Var, c6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, c6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7633b0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, c6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ig.h hVar2 = this.m0;
        tl0 tl0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f8100f = tl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f10 = 60.0f;
        } else {
            f10 = 0.0f;
        }
        tl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f10));
        this.d.j(new t2(this));
        this.d.setOnItemClickListener(new l2(this, i11, g6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((ml0) new m2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new u2(this));
        q2Var.setText("");
        q2Var.d.b(false);
        q2Var.b(false, hashSet, new g2(this, 12), null);
        dVar.setText(y());
        pa paVar = this.f31015e;
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
        ArrayList arrayList = v2Var.f7639h0;
        arrayList.clear();
        v2Var.f7651u0 = -1;
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

    public static void Q(v2 v2Var, int i10, g6 g6Var, int i11, View view) {
        long j10;
        boolean z4;
        boolean z10;
        float f10;
        g2 g2Var;
        lg.a aVar = v2Var.f7632a0;
        q2 q2Var = v2Var.W;
        HashSet hashSet = v2Var.f7636e0;
        if (view instanceof o8) {
            if (i10 == 4) {
                q20 q20Var = v2Var.f7654x0;
                if (q20Var != null) {
                    q20Var.run();
                    v2Var.dismiss();
                    return;
                }
                return;
            }
            z4.m(v2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new h2(v2Var, 2), new g2(v2Var, 9), false, false, v2Var.resourcesProvider).f21207a.show();
        } else if (view instanceof lg.n) {
            lg.n nVar = (lg.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                h3 h3Var = v2Var.f7655y0;
                if (h3Var != null) {
                    h3Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f20990id;
                } else {
                    j10 = -chat.f20843id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    h3 h3Var2 = v2Var.f7655y0;
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
                    t9 t9Var = new t9(v2Var.getContext(), g6Var, user, new g2(v2Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        t9Var.makeAttached(v2Var.attachedFragment);
                    }
                    t9Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback2 = v2Var.A0;
                        if (callback2 != null) {
                            np npVar = v2Var.Z;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f29606a.f24809q) ? false : false), hashSet);
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
                        v2Var.f7642k0.put(Long.valueOf(j11), user);
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
                        ViewPropertyAnimator duration = alpha.translationY(f11).setInterpolator(pr.h).setDuration(320L);
                        if (!z10) {
                            g2Var = new g2(v2Var, 1);
                        } else {
                            g2Var = null;
                        }
                        duration.withEndAction(g2Var).start();
                        ig.h hVar = v2Var.m0;
                        boolean z12 = !z10;
                        if (hVar.f8105x != z12) {
                            hVar.f8105x = z12;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f8100f, (h5.d) new ig.f(z12));
                        }
                    }
                    v2Var.W();
                    q2Var.b(true, hashSet, new g2(v2Var, 2), null);
                    v2Var.i0(true, true);
                    v2Var.X();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new qc(v2Var.container, g6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    lh.g2 g2Var2 = new lh.g2(v2Var.getContext(), i11, j11, p0.c(p0.b(1, v2Var.f7645o0)), new h2(v2Var, 1));
                    BirthdayController.BirthdayState birthdayState = v2Var.f7649s0;
                    g2Var2.V((birthdayState == null || !birthdayState.contains(j11)) ? false : false);
                    g2Var2.show();
                }
            }
        }
    }

    public static void R(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = v2Var.f7633b0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            ic Q = new qc(frameLayout, v2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f27745j = 5000;
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
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                l.d.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        l.d.v(R.string.UnknownError, new qc(frameLayout, v2Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(v2 v2Var, final TLRPC.User user, View view) {
        q70 F = q70.F(v2Var.container, v2Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(v2Var) {
            public final v2 f7531b;

            {
                this.f7531b = v2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.f7531b.f31017n;
                            if (p2Var == null) {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f22156a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20990id);
                                    U.showAsSheet(new xn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20990id);
                            p2Var.presentFragment(new xn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.f7531b.f31017n;
                            if (p2Var2 == null) {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f22156a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20990id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20990id);
                            p2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(v2Var) {
            public final v2 f7531b;

            {
                this.f7531b = v2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.f7531b.f31017n;
                            if (p2Var == null) {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f22156a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20990id);
                                    U.showAsSheet(new xn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20990id);
                            p2Var.presentFragment(new xn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.f7531b.f31017n;
                            if (p2Var2 == null) {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f22156a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20990id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20990id);
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
        if (v2Var.f7651u0 >= 0) {
            ConnectionsManager.getInstance(v2Var.currentAccount).cancelRequest(v2Var.f7651u0, true);
            v2Var.f7651u0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20889q = str;
        v2Var.f7651u0 = ConnectionsManager.getInstance(v2Var.currentAccount).sendRequest(tL_contacts_search, new gf.a(v2Var, 4));
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
            if (user != null && !user.bot && !UserObject.isService(user.f20990id)) {
                long j10 = user.f20990id;
                if (j10 != 0 && !this.f7656z0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f20990id);
                    HashSet hashSet = this.f7636e0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ig.g c3 = ig.g.c(user, hashSet.contains(Long.valueOf(user.f20990id)));
                    Y(c3);
                    arrayList3.add(c3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(ig.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f7636e0.isEmpty() && (i10 = this.U) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f7646p0) {
                this.f7646p0 = false;
                AndroidUtilities.runOnUIThread(new g2(this, 4), 10L);
            }
        } else if (!this.f7646p0) {
            this.f7646p0 = true;
            AndroidUtilities.runOnUIThread(new g2(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f7643l0)) {
            this.f7643l0 = null;
            this.W.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f7650t0);
            h0(true, true);
        }
    }

    public final ig.g Y(ig.g gVar) {
        dg.n nVar;
        int i10 = this.U;
        if (i10 == 4) {
            TLRPC.User user = gVar.f8085c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f20990id;
            ?? r22 = new View.OnClickListener(this) {
                public final v2 f7517b;

                {
                    this.f7517b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            v2 v2Var = this.f7517b;
                            HashSet hashSet = v2Var.f7636e0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = v2Var.A0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                v2Var.A0 = null;
                            }
                            v2Var.dismiss();
                            return;
                        default:
                            v2 v2Var2 = this.f7517b;
                            HashSet hashSet2 = v2Var2.f7636e0;
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
                public final v2 f7517b;

                {
                    this.f7517b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            v2 v2Var = this.f7517b;
                            HashSet hashSet = v2Var.f7636e0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = v2Var.A0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                v2Var.A0 = null;
                            }
                            v2Var.dismiss();
                            return;
                        default:
                            v2 v2Var2 = this.f7517b;
                            HashSet hashSet2 = v2Var2.f7636e0;
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
            gVar.f8095o = r22;
            gVar.f8096p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f8085c;
        if (i10 == 3) {
            nVar = null;
        } else {
            nVar = new dg.n(6, this, user2);
        }
        gVar.f8094n = nVar;
        return gVar;
    }

    public final int Z() {
        if (this.U == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.f7656z0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z4) {
        ArrayList arrayList = this.f7637f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f7640i0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.f7641j0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z4) {
        ArrayList arrayList = this.f7638g0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f7636e0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f7645o0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.U;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f7642k0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20990id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.W.getEditText());
                boolean z4 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.A0;
                        if (callback2 != null) {
                            np npVar = this.Z;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f29606a.f24809q) ? false : false), hashSet);
                            this.A0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c3 = p0.c(p0.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f20990id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new qc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        lh.g2 g2Var = new lh.g2(getContext(), this.currentAccount, j10, c3, new h2(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f7649s0;
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
        AndroidUtilities.cancelRunOnUIThread(this.f7650t0);
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
        HashSet hashSet = this.f7636e0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f7648r0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f7648r0, 0, 1, 33);
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
        throw new UnsupportedOperationException("Method not decompiled: hg.v2.h0(boolean, boolean):void");
    }

    public final void i0(boolean z4, boolean z10) {
        int R;
        int R2;
        h0(z4, z10);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            tl0 tl0Var = this.d;
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if ((childAt instanceof lg.n) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f7635d0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    ig.g gVar = (ig.g) arrayList.get(R2);
                    lg.n nVar = (lg.n) childAt;
                    nVar.c(gVar.f8091k, z4);
                    TLRPC.Chat chat = gVar.f8086e;
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
            ig.h hVar = this.m0;
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
    public final sl0 v(tl0 tl0Var) {
        ig.h hVar = new ig.h(getContext(), this.resourcesProvider, false);
        this.m0 = hVar;
        hVar.f8102r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f7653w0;
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
