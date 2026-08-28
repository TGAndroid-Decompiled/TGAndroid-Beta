package bg;

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
import g7.e6;
import g7.g6;
import gh.j3;
import gh.v7;
import gh.y9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.qn;
public class g3 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static y2 C0;
    public boolean A0;
    public int B0;
    public final int T;
    public final d3 U;
    public final b3 V;
    public final c3 W;
    public final a3 X;
    public final dp Y;
    public final fg.a Z;
    public final FrameLayout f1773a0;
    public final ArrayList f1774b0;
    public final ArrayList f1775c0;
    public final HashSet f1776d0;
    public final ArrayList f1777e0;
    public final ArrayList f1778f0;
    public final ArrayList f1779g0;
    public final HashMap f1780h0;
    public final ArrayList f1781i0;
    public final LinkedHashMap f1782j0;
    public String f1783k0;
    public cg.h f1784l0;
    public int m0;
    public final ArrayList f1785n0;
    public boolean f1786o0;
    public float f1787p0;
    public z2 f1788q0;
    public final BirthdayController.BirthdayState f1789r0;
    public final androidx.activity.i f1790s0;
    public int f1791t0;
    public fq f1792u0;
    public String f1793v0;
    public b20 f1794w0;
    public j3 f1795x0;
    public final HashSet f1796y0;
    public Utilities.Callback2 f1797z0;

    public g3(Context context, int i9, BirthdayController.BirthdayState birthdayState, int i10, b6 b6Var) {
        super(context, null, true, false, false, 1, b6Var);
        int i11;
        float f10;
        boolean z10;
        this.f1774b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f1775c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f1776d0 = hashSet;
        this.f1777e0 = new ArrayList();
        this.f1778f0 = new ArrayList();
        this.f1779g0 = new ArrayList();
        this.f1780h0 = new HashMap();
        this.f1781i0 = new ArrayList();
        this.f1782j0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(120.0f);
        this.f1785n0 = new ArrayList();
        this.f1786o0 = false;
        this.f1790s0 = new androidx.activity.i(this, 9);
        this.f1791t0 = -1;
        this.f1796y0 = new HashSet();
        this.currentAccount = i9;
        int i12 = f6.f23072h5;
        fixNavigationBar(f6.v0(i12, b6Var));
        this.drawDoubleNavigationBar = false;
        this.T = i10;
        this.f1789r0 = birthdayState;
        cg.h hVar = this.f1784l0;
        if (hVar != null) {
            if (i10 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f2423w = z10;
        }
        ?? dVar = new fg.d(getContext(), b6Var);
        this.X = dVar;
        dVar.setOnCloseClickListener(new r2(this, 11));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.f6284e.c(0.0f, false);
        this.f1788q0 = new z2(this, 0);
        b3 b3Var = new b3(this, getContext(), b6Var);
        this.V = b3Var;
        b3Var.setBackgroundColor(getThemedColor(i12));
        b3Var.setOnSearchTextChange(new s2(this, 3));
        if (hashSet.isEmpty() && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            i11 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i11 = R.string.Search;
        }
        b3Var.f6310b.setHintText(LocaleController.getString(i11), false);
        c3 c3Var = new c3(this, getContext());
        this.W = c3Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, e6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(b3Var, e6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(c3Var, e6.f(1.0f, 55, i15, 0, i15, 0));
        fg.a aVar = new fg.a(getContext(), b6Var, (wk0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(f6.v0(i12, b6Var));
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(f6.Y(getThemedColor(f6.f23092i6), 6, 6));
            dp dpVar = new dp(context, 24, b6Var);
            this.Y = dpVar;
            dpVar.b(f6.Oh, f6.f23110j7, f6.f23128k7);
            dpVar.setDrawUnchecked(true);
            dpVar.a(false, false);
            dpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(dpVar, e6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(f6.f23108j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, e6.t(-2, -2, 16, 9, 0, 0, 0));
            g6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final g3 f1983b;

                {
                    this.f1983b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            dp dpVar2 = this.f1983b.Y;
                            dpVar2.a(!dpVar2.f27781a.f26313q, true);
                            return;
                        default:
                            this.f1983b.c0();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, e6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        d3 d3Var = new d3(this, getContext(), b6Var);
        this.U = d3Var;
        if (i10 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        d3Var.setOnClickListener(new View.OnClickListener(this) {
            public final g3 f1983b;

            {
                this.f1983b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        dp dpVar2 = this.f1983b.Y;
                        dpVar2.a(!dpVar2.f27781a.f26313q, true);
                        return;
                    default:
                        this.f1983b.c0();
                        return;
                }
            }
        });
        aVar.addView(d3Var, e6.q(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i16 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, e6.f(-2.0f, 87, i16, 0, i16, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1773a0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i17 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, e6.f(300.0f, 87, i17, 0, i17, AndroidUtilities.dp(68.0f)));
        cg.h hVar2 = this.f1784l0;
        wk0 wk0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f2419f = wk0Var;
        int i18 = this.backgroundPaddingLeft;
        if (i10 != 1) {
            f10 = 60.0f;
        } else {
            f10 = 0.0f;
        }
        wk0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(f10));
        this.d.j(new e3(this));
        this.d.setOnItemClickListener(new w2(this, i10, b6Var, i9));
        if (i10 == 4) {
            this.d.setOnItemLongClickListener((pk0) new x2(this, i10, 0));
        }
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.d.setItemAnimator(nVar);
        this.d.i(new f3(this));
        b3Var.setText("");
        b3Var.d.b(false);
        b3Var.b(false, hashSet, new r2(this, 12), null);
        dVar.setText(y());
        pa paVar = this.f32408e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        f0(false);
        a0(false);
        b0(false);
        h0(false, true);
        if (i10 == 0 || i10 == 2) {
            u0.j(i9, null, new s2(this, 0));
        }
        if (i10 != 0 && i10 != 2) {
            return;
        }
        v7.y(i9, false).V();
    }

    public static void O(g3 g3Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = g3Var.f1779g0;
        arrayList.clear();
        g3Var.f1791t0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(g3Var.currentAccount);
            int i9 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Peer peer = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i9 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i9);
                i9++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        g3Var.h0(true, true);
    }

    public static void P(g3 g3Var, int i9, b6 b6Var, int i10, View view) {
        long j10;
        boolean z10;
        boolean z11;
        float f10;
        r2 r2Var;
        fg.a aVar = g3Var.Z;
        b3 b3Var = g3Var.V;
        HashSet hashSet = g3Var.f1776d0;
        if (view instanceof p8) {
            if (i9 == 4) {
                b20 b20Var = g3Var.f1794w0;
                if (b20Var != null) {
                    b20Var.run();
                    g3Var.dismiss();
                    return;
                }
                return;
            }
            y4.m(g3Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new s2(g3Var, 2), new r2(g3Var, 9), false, false, g3Var.resourcesProvider).f22713a.show();
        } else if (view instanceof fg.p) {
            fg.p pVar = (fg.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
            if (user == null && chat == null && i9 == 3) {
                j3 j3Var = g3Var.f1795x0;
                if (j3Var != null) {
                    j3Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f22527id;
                } else {
                    j10 = -chat.f22380id;
                }
                long j11 = j10;
                if (i9 == 3) {
                    j3 j3Var2 = g3Var.f1795x0;
                    if (j3Var2 != null) {
                        j3Var2.run(Long.valueOf(j11));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i9 == 1) {
                    if (b3Var != null) {
                        AndroidUtilities.hideKeyboard(b3Var.getEditText());
                    }
                    y9 y9Var = new y9(g3Var.getContext(), b6Var, user, new r2(g3Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        y9Var.makeAttached(g3Var.attachedFragment);
                    }
                    y9Var.show();
                } else if (i9 != 0 && i9 != 2) {
                    if (i9 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback2 = g3Var.f1797z0;
                        if (callback2 != null) {
                            dp dpVar = g3Var.Y;
                            callback2.run(Boolean.valueOf((dpVar == null || !dpVar.f27781a.f26313q) ? false : false), hashSet);
                            g3Var.f1797z0 = null;
                        }
                        g3Var.dismiss();
                        return;
                    }
                    if (i9 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        g3Var.f1782j0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == g3Var.Y() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        g3Var.e0();
                        return;
                    }
                    if (i9 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f11 = 0.0f;
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f10);
                        if (!z11) {
                            f11 = AndroidUtilities.dp(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f11).setInterpolator(gr.h).setDuration(320L);
                        if (!z11) {
                            r2Var = new r2(g3Var, 1);
                        } else {
                            r2Var = null;
                        }
                        duration.withEndAction(r2Var).start();
                        cg.h hVar = g3Var.f1784l0;
                        boolean z13 = !z11;
                        if (hVar.f2424x != z13) {
                            hVar.f2424x = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f2419f, (d5.d) new cg.f(z13));
                        }
                    }
                    g3Var.V();
                    b3Var.b(true, hashSet, new r2(g3Var, 2), null);
                    g3Var.h0(true, true);
                    g3Var.W();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new oc(g3Var.container, b6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    fh.p2 p2Var = new fh.p2(g3Var.getContext(), i10, j11, u0.c(u0.b(1, g3Var.f1785n0)), new s2(g3Var, 1));
                    BirthdayController.BirthdayState birthdayState = g3Var.f1789r0;
                    p2Var.U((birthdayState == null || !birthdayState.contains(j11)) ? false : false);
                    p2Var.show();
                }
            }
        }
    }

    public static void Q(g3 g3Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = g3Var.f1773a0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            gc Q = new oc(frameLayout, g3Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f28737j = 5000;
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
            MessagesStorage.getInstance(g3Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (g3Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g3Var.getContext(), 0, g3Var.resourcesProvider);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.l0.p(R.string.UnknownError, new oc(frameLayout, g3Var.resourcesProvider), R.raw.error, 36);
    }

    public static void R(final g3 g3Var, final TLRPC.User user, View view) {
        x60 F = x60.F(g3Var.container, g3Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(g3Var) {
            public final g3 f1972b;

            {
                this.f1972b = g3Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.f1972b.f32410n;
                            if (o2Var == null) {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f23653a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22527id);
                                    U.showAsSheet(new qn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22527id);
                            o2Var.presentFragment(new qn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.f1972b.f32410n;
                            if (o2Var2 == null) {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f23653a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22527id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22527id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(g3Var) {
            public final g3 f1972b;

            {
                this.f1972b = g3Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.f1972b.f32410n;
                            if (o2Var == null) {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f23653a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22527id);
                                    U.showAsSheet(new qn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22527id);
                            o2Var.presentFragment(new qn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.f1972b.f32410n;
                            if (o2Var2 == null) {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f23653a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22527id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22527id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void S(g3 g3Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(g3Var.currentAccount).getUserFull(UserConfig.getInstance(g3Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(g3Var.currentAccount).sendRequest(updatebirthday, new b0(g3Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(g3Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(g3Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(g3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        g3Var.g0(true, true);
    }

    public static void T(g3 g3Var, String str) {
        if (g3Var.f1791t0 >= 0) {
            ConnectionsManager.getInstance(g3Var.currentAccount).cancelRequest(g3Var.f1791t0, true);
            g3Var.f1791t0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f22426q = str;
        g3Var.f1791t0 = ConnectionsManager.getInstance(g3Var.currentAccount).sendRequest(tL_contacts_search, new bf.a(g3Var, 4));
    }

    public static boolean Z(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        d0(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    d0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static g3 d0(int i9, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        y2 y2Var = C0;
        if (y2Var != null) {
            return y2Var;
        }
        ?? g3Var = new g3(R.getContext(), R.getCurrentAccount(), birthdayState, i9, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            g3Var.makeAttached(R);
        }
        R.showDialog(g3Var);
        C0 = g3Var;
        return g3Var;
    }

    @Override
    public final void C(Canvas canvas, int i9) {
        float max = Math.max(i9, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        a3 a3Var = this.X;
        a3Var.setTranslationY(max);
        float translationY = a3Var.getTranslationY() + a3Var.getMeasuredHeight();
        b3 b3Var = this.V;
        b3Var.setTranslationY(translationY);
        float translationY2 = b3Var.getTranslationY() + b3Var.getMeasuredHeight();
        c3 c3Var = this.W;
        c3Var.setTranslationY(translationY2);
        int measuredHeight = b3Var.getMeasuredHeight() + a3Var.getMeasuredHeight();
        this.d.setTranslationY((c3Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final int U(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i9 = 0;
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
                if (j10 != 0 && !this.f1796y0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f22527id);
                    HashSet hashSet = this.f1776d0;
                    hashSet.contains(valueOf);
                    i9 += AndroidUtilities.dp(56.0f);
                    cg.g c10 = cg.g.c(user, hashSet.contains(Long.valueOf(user.f22527id)));
                    X(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i9;
        }
        int dp = AndroidUtilities.dp(32.0f) + i9;
        arrayList.add(cg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void V() {
        int i9;
        if (this.f1776d0.isEmpty() && (i9 = this.T) != 1 && i9 != 2 && i9 != 3 && i9 != 4) {
            if (this.f1786o0) {
                this.f1786o0 = false;
                AndroidUtilities.runOnUIThread(new r2(this, 4), 10L);
            }
        } else if (!this.f1786o0) {
            this.f1786o0 = true;
            AndroidUtilities.runOnUIThread(new r2(this, 3), 10L);
        }
    }

    public final void W() {
        if (!TextUtils.isEmpty(this.f1783k0)) {
            this.f1783k0 = null;
            this.V.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f1790s0);
            g0(true, true);
        }
    }

    public final cg.g X(cg.g gVar) {
        u1 u1Var;
        int i9 = this.T;
        if (i9 == 4) {
            TLRPC.User user = gVar.f2404c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f22527id;
            ?? r22 = new View.OnClickListener(this) {
                public final g3 f1965b;

                {
                    this.f1965b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            g3 g3Var = this.f1965b;
                            HashSet hashSet = g3Var.f1776d0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = g3Var.f1797z0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                g3Var.f1797z0 = null;
                            }
                            g3Var.dismiss();
                            return;
                        default:
                            g3 g3Var2 = this.f1965b;
                            HashSet hashSet2 = g3Var2.f1776d0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = g3Var2.f1797z0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                g3Var2.f1797z0 = null;
                            }
                            g3Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final g3 f1965b;

                {
                    this.f1965b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            g3 g3Var = this.f1965b;
                            HashSet hashSet = g3Var.f1776d0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = g3Var.f1797z0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                g3Var.f1797z0 = null;
                            }
                            g3Var.dismiss();
                            return;
                        default:
                            g3 g3Var2 = this.f1965b;
                            HashSet hashSet2 = g3Var2.f1776d0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = g3Var2.f1797z0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                g3Var2.f1797z0 = null;
                            }
                            g3Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f2414o = r22;
            gVar.f2415p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f2404c;
        if (i9 == 3) {
            u1Var = null;
        } else {
            u1Var = new u1(2, this, user2);
        }
        gVar.f2413n = u1Var;
        return gVar;
    }

    public final int Y() {
        if (this.T == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.f1796y0.size()) - 1);
        }
        return 10;
    }

    public final void a0(boolean z10) {
        ArrayList arrayList = this.f1777e0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f1780h0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.f1781i0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                g0(true, true);
            }
        }
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f1778f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                g0(true, true);
            }
        }
    }

    public final void c0() {
        HashSet hashSet = this.f1776d0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f1785n0;
            boolean isEmpty = arrayList.isEmpty();
            int i9 = this.T;
            if (!isEmpty || i9 == 0 || i9 == 2 || i9 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f1782j0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f22527id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.V.getEditText());
                boolean z10 = true;
                if (i9 != 1) {
                    if (i9 == 4) {
                        Utilities.Callback2 callback2 = this.f1797z0;
                        if (callback2 != null) {
                            dp dpVar = this.Y;
                            callback2.run(Boolean.valueOf((dpVar == null || !dpVar.f27781a.f26313q) ? false : false), hashSet);
                            this.f1797z0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = u0.c(u0.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f22527id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new oc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        fh.p2 p2Var = new fh.p2(getContext(), this.currentAccount, j10, c10, new s2(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f1789r0;
                        p2Var.U((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        p2Var.show();
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.giftsToUserSent) {
            dismiss();
        } else if (i9 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new r2(this, 0));
        } else if (i9 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new r2(this, 6));
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new r2(this, 10));
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
        AndroidUtilities.cancelRunOnUIThread(this.f1790s0);
    }

    public final void e0() {
        String string;
        if (this.T == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Y());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new oc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void f0(boolean z10) {
        d3 d3Var = this.U;
        boolean z11 = false;
        d3Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = this.T;
        HashSet hashSet = this.f1776d0;
        if (i9 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f1788q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f1788q0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        d3Var.c(hashSet.size(), true);
        d3Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        d3Var.setEnabled(z11);
    }

    public final void g0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: bg.g3.g0(boolean, boolean):void");
    }

    public final void h0(boolean z10, boolean z11) {
        int R;
        int R2;
        g0(z10, z11);
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt instanceof fg.p) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f1775c0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    cg.g gVar = (cg.g) arrayList.get(R2);
                    fg.p pVar = (fg.p) childAt;
                    pVar.c(gVar.f2410k, z10);
                    TLRPC.Chat chat = gVar.f2405e;
                    float f10 = 1.0f;
                    if (chat != null) {
                        if (this.f1784l0.F(chat) > 200) {
                            f10 = 0.3f;
                        }
                        pVar.i(f10, z10);
                    } else {
                        pVar.i(1.0f, z10);
                    }
                    i11 = R;
                }
            }
            i9++;
        }
        if (z10) {
            this.f1784l0.q(0, i10);
            cg.h hVar = this.f1784l0;
            hVar.q(i11, hVar.h() - i11);
        }
        f0(z10);
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
        g0(false, true);
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
    public final vk0 v(wk0 wk0Var) {
        cg.h hVar = new cg.h(getContext(), this.resourcesProvider, false);
        this.f1784l0 = hVar;
        hVar.f2421r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f1793v0;
        if (str != null) {
            return str;
        }
        int i9 = this.T;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
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
