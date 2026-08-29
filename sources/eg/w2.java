package eg;

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
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import jh.i3;
import jh.s7;
import jh.s9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d20;
import org.telegram.ui.tn;
public class w2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static o2 C0;
    public boolean A0;
    public int B0;
    public final int T;
    public final t2 U;
    public final r2 V;
    public final s2 W;
    public final q2 X;
    public final hp Y;
    public final ig.a Z;
    public final FrameLayout f6162a0;
    public final ArrayList f6163b0;
    public final ArrayList f6164c0;
    public final HashSet f6165d0;
    public final ArrayList f6166e0;
    public final ArrayList f6167f0;
    public final ArrayList f6168g0;
    public final HashMap f6169h0;
    public final ArrayList f6170i0;
    public final LinkedHashMap f6171j0;
    public String f6172k0;
    public fg.h f6173l0;
    public int m0;
    public final ArrayList f6174n0;
    public boolean f6175o0;
    public float f6176p0;
    public p2 f6177q0;
    public final BirthdayController.BirthdayState f6178r0;
    public final ag.q1 f6179s0;
    public int f6180t0;
    public jq f6181u0;
    public String f6182v0;
    public d20 f6183w0;
    public i3 f6184x0;
    public final HashSet f6185y0;
    public Utilities.Callback2 f6186z0;

    public w2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, c6 c6Var) {
        super(context, null, true, false, false, 1, c6Var);
        int i12;
        float f9;
        boolean z10;
        this.f6163b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f6164c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f6165d0 = hashSet;
        this.f6166e0 = new ArrayList();
        this.f6167f0 = new ArrayList();
        this.f6168g0 = new ArrayList();
        this.f6169h0 = new HashMap();
        this.f6170i0 = new ArrayList();
        this.f6171j0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(120.0f);
        this.f6174n0 = new ArrayList();
        this.f6175o0 = false;
        this.f6179s0 = new ag.q1(this, 21);
        this.f6180t0 = -1;
        this.f6185y0 = new HashSet();
        this.currentAccount = i10;
        int i13 = g6.f23133h5;
        fixNavigationBar(g6.v0(i13, c6Var));
        this.drawDoubleNavigationBar = false;
        this.T = i11;
        this.f6178r0 = birthdayState;
        fg.h hVar = this.f6173l0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f6762w = z10;
        }
        ?? dVar = new ig.d(getContext(), c6Var);
        this.X = dVar;
        dVar.setOnCloseClickListener(new h2(this, 11));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.f8974e.c(0.0f, false);
        this.f6177q0 = new p2(this, 0);
        r2 r2Var = new r2(this, getContext(), c6Var);
        this.V = r2Var;
        r2Var.setBackgroundColor(getThemedColor(i13));
        r2Var.setOnSearchTextChange(new i2(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        r2Var.f8994b.setHintText(LocaleController.getString(i12), false);
        s2 s2Var = new s2(this, getContext());
        this.W = s2Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, f6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(r2Var, f6.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(s2Var, f6.f(1.0f, 55, i16, 0, i16, 0));
        ig.a aVar = new ig.a(getContext(), c6Var, (jl0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i13, c6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(g6.Y(getThemedColor(g6.f23152i6), 6, 6));
            hp hpVar = new hp(context, 24, c6Var);
            this.Y = hpVar;
            hpVar.b(g6.Oh, g6.f23171j7, g6.f23190k7);
            hpVar.setDrawUnchecked(true);
            hpVar.a(false, false);
            hpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(hpVar, f6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(g6.f23169j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, f6.t(-2, -2, 16, 9, 0, 0, 0));
            h6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final w2 f6080b;

                {
                    this.f6080b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            hp hpVar2 = this.f6080b.Y;
                            hpVar2.a(!hpVar2.f29211a.f26324q, true);
                            return;
                        default:
                            this.f6080b.d0();
                            return;
                    }
                }
            });
            aVar.addView(linearLayout, f6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        t2 t2Var = new t2(this, getContext(), c6Var);
        this.U = t2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        t2Var.setOnClickListener(new View.OnClickListener(this) {
            public final w2 f6080b;

            {
                this.f6080b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        hp hpVar2 = this.f6080b.Y;
                        hpVar2.a(!hpVar2.f29211a.f26324q, true);
                        return;
                    default:
                        this.f6080b.d0();
                        return;
                }
            }
        });
        aVar.addView(t2Var, f6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, f6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6162a0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, f6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        fg.h hVar2 = this.f6173l0;
        jl0 jl0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f6758f = jl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f9 = 60.0f;
        } else {
            f9 = 0.0f;
        }
        jl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f9));
        this.d.j(new u2(this));
        this.d.setOnItemClickListener(new m2(this, i11, c6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((cl0) new n2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new v2(this));
        r2Var.setText("");
        r2Var.d.b(false);
        r2Var.b(false, hashSet, new h2(this, 12), null);
        dVar.setText(y());
        ua uaVar = this.f34660e;
        if (uaVar != null) {
            uaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            q0.j(i10, null, new i2(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        s7.y(i10, false).V();
    }

    public static void P(w2 w2Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = w2Var.f6168g0;
        arrayList.clear();
        w2Var.f6180t0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(w2Var.currentAccount);
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
        w2Var.i0(true, true);
    }

    public static void Q(w2 w2Var, int i10, c6 c6Var, int i11, View view) {
        long j10;
        boolean z10;
        boolean z11;
        float f9;
        h2 h2Var;
        ig.a aVar = w2Var.Z;
        r2 r2Var = w2Var.V;
        HashSet hashSet = w2Var.f6165d0;
        if (view instanceof m8) {
            if (i10 == 4) {
                d20 d20Var = w2Var.f6183w0;
                if (d20Var != null) {
                    d20Var.run();
                    w2Var.dismiss();
                    return;
                }
                return;
            }
            c5.m(w2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new i2(w2Var, 2), new h2(w2Var, 9), false, false, w2Var.resourcesProvider).f22729a.show();
        } else if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i3 i3Var = w2Var.f6184x0;
                if (i3Var != null) {
                    i3Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f22539id;
                } else {
                    j10 = -chat.f22392id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    i3 i3Var2 = w2Var.f6184x0;
                    if (i3Var2 != null) {
                        i3Var2.run(Long.valueOf(j11));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (r2Var != null) {
                        AndroidUtilities.hideKeyboard(r2Var.getEditText());
                    }
                    s9 s9Var = new s9(w2Var.getContext(), c6Var, user, new h2(w2Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        s9Var.makeAttached(w2Var.attachedFragment);
                    }
                    s9Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback2 = w2Var.f6186z0;
                        if (callback2 != null) {
                            hp hpVar = w2Var.Y;
                            callback2.run(Boolean.valueOf((hpVar == null || !hpVar.f29211a.f26324q) ? false : false), hashSet);
                            w2Var.f6186z0 = null;
                        }
                        w2Var.dismiss();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        w2Var.f6171j0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == w2Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        w2Var.f0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f10 = 0.0f;
                        if (z11) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f9);
                        if (!z11) {
                            f10 = AndroidUtilities.dp(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(jr.h).setDuration(320L);
                        if (!z11) {
                            h2Var = new h2(w2Var, 1);
                        } else {
                            h2Var = null;
                        }
                        duration.withEndAction(h2Var).start();
                        fg.h hVar = w2Var.f6173l0;
                        boolean z13 = !z11;
                        if (hVar.f6763x != z13) {
                            hVar.f6763x = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f6758f, (f5.d) new fg.f(z13));
                        }
                    }
                    w2Var.W();
                    r2Var.b(true, hashSet, new h2(w2Var, 2), null);
                    w2Var.i0(true, true);
                    w2Var.X();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new tc(w2Var.container, c6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    ih.h2 h2Var2 = new ih.h2(w2Var.getContext(), i11, j11, q0.c(q0.b(1, w2Var.f6174n0)), new i2(w2Var, 1));
                    BirthdayController.BirthdayState birthdayState = w2Var.f6178r0;
                    h2Var2.V((birthdayState == null || !birthdayState.contains(j11)) ? false : false);
                    h2Var2.show();
                }
            }
        }
    }

    public static void R(w2 w2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = w2Var.f6162a0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            mc Q = new tc(frameLayout, w2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f30652j = 5000;
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
            MessagesStorage.getInstance(w2Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (w2Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w2Var.getContext(), 0, w2Var.resourcesProvider);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        j7.l1.v(R.string.UnknownError, new tc(frameLayout, w2Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(w2 w2Var, final TLRPC.User user, View view) {
        j70 F = j70.F(w2Var.container, w2Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(w2Var) {
            public final w2 f6062b;

            {
                this.f6062b = w2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.f6062b.f34662n;
                            if (o2Var == null) {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f23673a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22539id);
                                    U.showAsSheet(new tn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22539id);
                            o2Var.presentFragment(new tn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.f6062b.f34662n;
                            if (o2Var2 == null) {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f23673a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22539id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22539id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(w2Var) {
            public final w2 f6062b;

            {
                this.f6062b = w2Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.f6062b.f34662n;
                            if (o2Var == null) {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f23673a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22539id);
                                    U.showAsSheet(new tn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22539id);
                            o2Var.presentFragment(new tn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.f6062b.f34662n;
                            if (o2Var2 == null) {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f23673a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22539id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22539id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(w2 w2Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(w2Var.currentAccount).getUserFull(UserConfig.getInstance(w2Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(w2Var.currentAccount).sendRequest(updatebirthday, new z(w2Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(w2Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(w2Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(w2Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        w2Var.h0(true, true);
    }

    public static void U(w2 w2Var, String str) {
        if (w2Var.f6180t0 >= 0) {
            ConnectionsManager.getInstance(w2Var.currentAccount).cancelRequest(w2Var.f6180t0, true);
            w2Var.f6180t0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f22438q = str;
        w2Var.f6180t0 = ConnectionsManager.getInstance(w2Var.currentAccount).sendRequest(tL_contacts_search, new ef.a(w2Var, 4));
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

    public static w2 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        o2 o2Var = C0;
        if (o2Var != null) {
            return o2Var;
        }
        ?? w2Var = new w2(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            w2Var.makeAttached(R);
        }
        R.showDialog(w2Var);
        C0 = w2Var;
        return w2Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        q2 q2Var = this.X;
        q2Var.setTranslationY(max);
        float translationY = q2Var.getTranslationY() + q2Var.getMeasuredHeight();
        r2 r2Var = this.V;
        r2Var.setTranslationY(translationY);
        float translationY2 = r2Var.getTranslationY() + r2Var.getMeasuredHeight();
        s2 s2Var = this.W;
        s2Var.setTranslationY(translationY2);
        int measuredHeight = r2Var.getMeasuredHeight() + q2Var.getMeasuredHeight();
        this.d.setTranslationY((s2Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f22539id)) {
                long j10 = user.f22539id;
                if (j10 != 0 && !this.f6185y0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f22539id);
                    HashSet hashSet = this.f6165d0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    fg.g c3 = fg.g.c(user, hashSet.contains(Long.valueOf(user.f22539id)));
                    Y(c3);
                    arrayList3.add(c3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(fg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f6165d0.isEmpty() && (i10 = this.T) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f6175o0) {
                this.f6175o0 = false;
                AndroidUtilities.runOnUIThread(new h2(this, 4), 10L);
            }
        } else if (!this.f6175o0) {
            this.f6175o0 = true;
            AndroidUtilities.runOnUIThread(new h2(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f6172k0)) {
            this.f6172k0 = null;
            this.V.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f6179s0);
            h0(true, true);
        }
    }

    public final fg.g Y(fg.g gVar) {
        ag.n nVar;
        int i10 = this.T;
        if (i10 == 4) {
            TLRPC.User user = gVar.f6743c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f22539id;
            ?? r22 = new View.OnClickListener(this) {
                public final w2 f6051b;

                {
                    this.f6051b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            w2 w2Var = this.f6051b;
                            HashSet hashSet = w2Var.f6165d0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = w2Var.f6186z0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                w2Var.f6186z0 = null;
                            }
                            w2Var.dismiss();
                            return;
                        default:
                            w2 w2Var2 = this.f6051b;
                            HashSet hashSet2 = w2Var2.f6165d0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = w2Var2.f6186z0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                w2Var2.f6186z0 = null;
                            }
                            w2Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final w2 f6051b;

                {
                    this.f6051b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            w2 w2Var = this.f6051b;
                            HashSet hashSet = w2Var.f6165d0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = w2Var.f6186z0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                w2Var.f6186z0 = null;
                            }
                            w2Var.dismiss();
                            return;
                        default:
                            w2 w2Var2 = this.f6051b;
                            HashSet hashSet2 = w2Var2.f6165d0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = w2Var2.f6186z0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                w2Var2.f6186z0 = null;
                            }
                            w2Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f6753o = r22;
            gVar.f6754p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f6743c;
        if (i10 == 3) {
            nVar = null;
        } else {
            nVar = new ag.n(6, this, user2);
        }
        gVar.f6752n = nVar;
        return gVar;
    }

    public final int Z() {
        if (this.T == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.f6185y0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f6166e0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f6169h0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.f6170i0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f6167f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f6165d0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f6174n0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.T;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f6171j0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f22539id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.V.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.f6186z0;
                        if (callback2 != null) {
                            hp hpVar = this.Y;
                            callback2.run(Boolean.valueOf((hpVar == null || !hpVar.f29211a.f26324q) ? false : false), hashSet);
                            this.f6186z0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c3 = q0.c(q0.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f22539id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new tc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        ih.h2 h2Var = new ih.h2(getContext(), this.currentAccount, j10, c3, new i2(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f6178r0;
                        h2Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        h2Var.show();
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
            AndroidUtilities.runOnUIThread(new h2(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new h2(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new h2(this, 10));
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
        AndroidUtilities.cancelRunOnUIThread(this.f6179s0);
    }

    public final void f0() {
        String string;
        if (this.T == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new tc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        t2 t2Var = this.U;
        boolean z11 = false;
        t2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.T;
        HashSet hashSet = this.f6165d0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f6177q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f6177q0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        t2Var.c(hashSet.size(), true);
        t2Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        t2Var.setEnabled(z11);
    }

    public final void h0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: eg.w2.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt instanceof ig.n) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f6164c0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    fg.g gVar = (fg.g) arrayList.get(R2);
                    ig.n nVar = (ig.n) childAt;
                    nVar.c(gVar.f6749k, z10);
                    TLRPC.Chat chat = gVar.f6744e;
                    float f9 = 1.0f;
                    if (chat != null) {
                        if (this.f6173l0.F(chat) > 200) {
                            f9 = 0.3f;
                        }
                        nVar.i(f9, z10);
                    } else {
                        nVar.i(1.0f, z10);
                    }
                    i12 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f6173l0.q(0, i11);
            fg.h hVar = this.f6173l0;
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
    public final il0 v(jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, false);
        this.f6173l0 = hVar;
        hVar.f6760r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f6182v0;
        if (str != null) {
            return str;
        }
        int i10 = this.T;
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
