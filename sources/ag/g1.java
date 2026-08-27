package ag;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c60;
import org.telegram.ui.rn;

public final class g1 extends LinearLayout {

    public TextView f386a;

    public TextView f387b;

    public final cg.b f388c;
    public LinearLayout d;

    public final i1 f389e;

    public g1(i1 i1Var, Context context) {
        String string;
        String string2;
        boolean z10;
        int i10;
        int i11;
        int activatedAccountsCount;
        ArrayList<TLRPC.Dialog> dialogs;
        int size;
        int i12;
        int i13;
        TLRPC.Dialog dialog;
        float f10;
        float f11;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        b9 b9Var;
        int iMin;
        int i14;
        TextView textView;
        boolean z12;
        boolean z13;
        String str;
        String string3;
        int i15;
        int i16;
        int size2;
        int size3;
        int i17;
        int i18;
        int i19;
        int i20;
        cg.b bVar;
        int i21;
        TLRPC.Chat chat;
        TextView textView2;
        final int i22;
        int i23;
        f1 f1Var;
        boolean z14;
        b0 b0Var;
        ChannelBoostsController.CanApplyBoost canApplyBoost;
        boolean z15;
        float f12;
        float f13;
        super(context);
        org.telegram.ui.ActionBar.n2 n2Var = i1Var.f31855n;
        this.f389e = i1Var;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0);
        int i24 = i1Var.f432d0;
        h1 h1VarU1 = i1.u1(i24, ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
        i1Var.I0 = h1VarU1;
        int i25 = h1VarU1.f411a;
        MessagesController messagesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
        boolean zPremiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean zX1 = i1Var.x1();
        if (i24 == 31) {
            string = LocaleController.getString(zX1 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i24 == 32) {
            string = i1Var.q1(true);
        } else if (i24 == 19) {
            org.telegram.ui.Cells.s1 s1Var = i1Var.f431c0;
            if (s1Var != null) {
                int i26 = s1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat chatS1 = i1Var.s1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i26, UserObject.getFirstName(i1Var.f431c0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, chatS1 == null ? "" : chatS1.title));
                string = spannableStringBuilder.toString();
            } else if (n2Var instanceof c60) {
                string = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", cg.q0.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i1Var.q1(true));
                if (ChatObject.hasAdminRights(i1Var.s1()) && zX1) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                string = spannableStringBuilder2.toString();
            }
        } else if (i24 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = i1Var.X;
            if (tL_premium_boostsStatus.level == 0) {
                int i27 = zX1 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i28 = tL_premium_boostsStatus.next_level_boosts;
                string = LocaleController.formatString(i27, LocaleController.formatPluralString("MoreBoosts", i28, Integer.valueOf(i28)));
            } else {
                int i29 = zX1 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i30 = tL_premium_boostsStatus.next_level_boosts;
                int i31 = tL_premium_boostsStatus.boosts;
                string = LocaleController.formatString(i29, LocaleController.formatPluralString("MoreBoosts", i30 - i31, Integer.valueOf(i30 - i31)), LocaleController.formatPluralString("BoostStories", i1Var.X.level + 1, new Object[0]));
            }
        } else if (i24 == 20) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(i1Var.o1()));
        } else if (i24 == 24) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(i1Var.o1()));
        } else if (i24 == 29) {
            string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i24 == 30) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i24 == 35) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i24 == 25) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zX1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i24 == 26) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zX1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i24 == 27) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i24 == 28) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zX1 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i24 == 22) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zX1 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i24 == 23) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zX1 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            if (i24 != 21) {
                if (i24 == 11) {
                    string2 = !i1Var.U ? ChatObject.isChannelAndNotMegaGroup(i1Var.K0) ? i1Var.f451x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) i1Var.f451x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", i1Var.f451x0.size(), Integer.valueOf(i1Var.f451x0.size())) : i1Var.f451x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) i1Var.f451x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", i1Var.f451x0.size(), Integer.valueOf(i1Var.f451x0.size())) : ChatObject.isChannelAndNotMegaGroup(i1Var.K0) ? i1Var.f451x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) i1Var.f451x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", i1Var.f451x0.size(), Integer.valueOf(i1Var.f451x0.size())) : i1Var.f451x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) i1Var.f451x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", i1Var.f451x0.size(), Integer.valueOf(i1Var.f451x0.size()));
                    z10 = true;
                } else if (i24 == 34) {
                    string = i1Var.f451x0.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) i1Var.f451x0.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", i1Var.f451x0.size(), Integer.valueOf(i1Var.f451x0.size()));
                } else if (zPremiumFeaturesBlocked) {
                    string = (String) i1Var.I0.f415f;
                } else {
                    string = (String) ((UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium() || i1Var.J0) ? i1Var.I0.f414e : i1Var.I0.d);
                }
                h1 h1Var = i1Var.I0;
                i10 = h1Var.f412b;
                i11 = h1Var.f413c;
                activatedAccountsCount = i1Var.f446s0;
                if (i24 == 3) {
                    activatedAccountsCount = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).dialogFilters.size() - 1;
                } else {
                    if (i24 == 7) {
                        if (i24 == 0) {
                            dialogs = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getDialogs(0);
                            size = dialogs.size();
                            i13 = 0;
                            for (i12 = 0; i12 < size; i12++) {
                                dialog = dialogs.get(i12);
                                if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                                    i13++;
                                }
                            }
                            activatedAccountsCount = i13;
                        }
                        if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium() || i1Var.J0) {
                            activatedAccountsCount = i11;
                            f10 = 1.0f;
                        } else {
                            activatedAccountsCount = activatedAccountsCount < 0 ? i10 : activatedAccountsCount;
                            if (i24 != 7) {
                                f12 = activatedAccountsCount;
                                f13 = i11;
                            } else if (activatedAccountsCount > i10) {
                                f12 = activatedAccountsCount - i10;
                                f13 = i11 - i10;
                            } else {
                                f10 = 0.5f;
                            }
                            f10 = f12 / f13;
                        }
                        f11 = i10 / i11;
                        if (i24 == 18 && i24 != 20 && i24 != 24 && i24 != 25 && i24 != 26) {
                            if (i24 != 29 && i24 != 22 && i24 != 23 && i24 != 19 && i24 != 30 && i24 != 35 && i24 != 21 && i24 != 27 && i24 != 28 && i24 != 32) {
                                z11 = false;
                            }
                            activatedAccountsCount = z11 ? 0 : activatedAccountsCount;
                            if ((i24 != 11 || i24 == 34) && !MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).premiumFeaturesBlocked() && (!((arrayList = i1Var.f453z0) == null || arrayList.isEmpty()) || ((arrayList2 = i1Var.f452y0) != null && arrayList2.size() >= i1Var.f451x0.size()))) {
                                if (i1Var.f453z0.isEmpty()) {
                                    arrayList3 = i1Var.f452y0;
                                } else {
                                    arrayList3 = i1Var.f453z0;
                                }
                                b9Var = new b9(context, false);
                                b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                                b9Var.setSize(AndroidUtilities.dp(72.0f));
                                b9Var.setStepFactor(0.4f);
                                iMin = Math.min(arrayList3.size(), 3);
                                b9Var.setCount(iMin);
                                for (i14 = 0; i14 < iMin; i14++) {
                                    Long l10 = (Long) arrayList3.get(i14);
                                    l10.getClass();
                                    b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l10), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                                }
                                b9Var.a(false);
                                addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView3 = new TextView(context);
                                textView3.setGravity(17);
                                rl.h(20.0f, 1, textView3);
                                int i32 = g6.f23161j5;
                                textView3.setTextColor(g6.v0(i32, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                textView3.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 9));
                                textView = new TextView(context);
                                textView.setGravity(17);
                                textView.setTextSize(1, 14.0f);
                                textView.setTextColor(g6.v0(i32, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                                if (i24 == 34) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i1Var.f452y0 != null || i1Var.f452y0.size() < i1Var.f453z0.size()) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (arrayList3.size() == 1) {
                                    if (z12) {
                                        i17 = R.string.InviteCallMessagePremiumBlockedOne;
                                    } else if (z13) {
                                        i17 = R.string.InviteMessagePremiumBlockedOne;
                                    } else {
                                        i17 = R.string.InvitePremiumBlockedOne;
                                    }
                                    string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                                } else if (arrayList3.size() == 2) {
                                    if (z12) {
                                        i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                                    } else if (z13) {
                                        i16 = R.string.InviteMessagePremiumBlockedTwo;
                                    } else {
                                        i16 = R.string.InvitePremiumBlockedTwo;
                                    }
                                    string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                                } else if (arrayList3.size() == 3) {
                                    if (z12) {
                                        i15 = R.string.InviteCallMessagePremiumBlockedThree;
                                    } else if (z13) {
                                        i15 = R.string.InviteMessagePremiumBlockedThree;
                                    } else {
                                        i15 = R.string.InvitePremiumBlockedThree;
                                    }
                                    string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                                } else {
                                    if (z12) {
                                        str = "InviteCallMessagePremiumBlockedMany";
                                    } else if (z13) {
                                        str = "InviteMessagePremiumBlockedMany";
                                    } else {
                                        str = "InvitePremiumBlockedMany";
                                    }
                                    String pluralString = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                                    int size4 = arrayList3.size() - 2;
                                    int themedColor = i1Var.getThemedColor(g6.f23124h5);
                                    b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                                    b9Var.f27051c = new pz0(i0.a.k(size4, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                    Paint paint = new Paint(1);
                                    b9Var.d = paint;
                                    paint.setColor(themedColor);
                                    string3 = pluralString;
                                }
                                textView.setText(AndroidUtilities.replaceTags(string3));
                                if (i1Var.f453z0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = i1Var.f453z0.size();
                                }
                                if (i1Var.f452y0 == null) {
                                    size3 = 0;
                                } else {
                                    size3 = i1Var.f452y0.size();
                                }
                                if (size2 - size3 > 0 || ((size2 == 1 && size3 == 1) || !i1Var.U)) {
                                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                    i1Var.f434f0 = true;
                                } else {
                                    final int i33 = 0;
                                    s1 s1Var2 = new s1(context, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider, false);
                                    b6.b(s1Var2, 0.02f, 1.2f);
                                    s1Var2.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) {

                                        public final g1 f332b;

                                        {
                                            this.f332b = this;
                                        }

                                        @Override
                                        public final void onClick(View view) {
                                            switch (i33) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                    if (n2Var2 != null) {
                                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                        l2Var.f23619a = true;
                                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i1 i1Var2 = this.f332b.f389e;
                                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                    i1Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    }, false);
                                    addView(s1Var2, z5.k((((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 0.0f, (((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                    e1 e1Var = new e1(this, context);
                                    e1Var.setGravity(17);
                                    e1Var.setTextColor(g6.v0(g6.f23441z6, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    e1Var.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                    e1Var.setTextSize(14.0f);
                                    addView(e1Var, z5.t(190, -2, 1, 12, 0, 12, 20));
                                    TextView textView4 = new TextView(context);
                                    textView4.setGravity(17);
                                    textView4.setTypeface(AndroidUtilities.bold());
                                    textView4.setTextSize(1, 20.0f);
                                    textView4.setTextColor(g6.v0(i32, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    textView4.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                    addView(textView4, z5.t(-1, -2, 1, 32, 0, 32, 9));
                                    TextView textView5 = new TextView(context);
                                    textView5.setGravity(17);
                                    textView5.setTextSize(1, 14.0f);
                                    textView5.setTextColor(g6.v0(i32, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    if (i1Var.f453z0.size() <= 1) {
                                        textView5.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                    } else {
                                        textView5.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                    }
                                    addView(textView5, z5.t(-1, -2, 1, 32, 0, 32, 19));
                                }
                                i1Var.L1();
                                return;
                            }
                            if (i24 != 31 && i24 != 34) {
                                f1Var = new f1(this, context, i25, activatedAccountsCount, i11, f11, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                                i1Var.f447t0 = f1Var;
                                if (!z11) {
                                    f1Var.setBagePosition(f10);
                                    i1Var.f447t0.setType(i24);
                                    i1Var.f447t0.f26458w.setVisibility(8);
                                    if (z10) {
                                        f1 f1Var2 = i1Var.f447t0;
                                        f1Var2.E.setVisibility(8);
                                        b0Var = f1Var2.f26450e;
                                        if (b0Var != null) {
                                            b0Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                        }
                                        f1Var2.F = true;
                                    } else {
                                        if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium() || i1Var.J0) {
                                            i1Var.f447t0.v.setVisibility(8);
                                            if (i24 == 6) {
                                                i1Var.f447t0.f26458w.setText("2 GB");
                                            } else {
                                                i1Var.f447t0.f26458w.setText(Integer.toString(i10));
                                            }
                                            z14 = false;
                                            i1Var.f447t0.f26458w.setVisibility(0);
                                        }
                                        if (i24 != 2 || i24 == 5) {
                                            i1Var.f447t0.D = z14;
                                        }
                                        addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                } else if (i1Var.X != null) {
                                    f1 f1Var3 = i1Var.f447t0;
                                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = i1Var.X;
                                    canApplyBoost = i1Var.Y;
                                    if (canApplyBoost == null && canApplyBoost.boostedNow) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    f1Var3.e(tL_premium_boostsStatus2, z15);
                                }
                                z14 = false;
                                if (i24 != 2) {
                                    i1Var.f447t0.D = z14;
                                } else {
                                    i1Var.f447t0.D = z14;
                                }
                                addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                            if (i24 == 31) {
                                FrameLayout frameLayout = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                                i18 = 17;
                                frameLayout.addView(imageView, z5.e(-2, -2, 17));
                                frameLayout.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
                                addView(frameLayout, z5.t(79, 79, 1, 0, 23, 0, 0));
                            } else {
                                i18 = 17;
                            }
                            TextView textView6 = new TextView(context);
                            this.f386a = textView6;
                            textView6.setTypeface(AndroidUtilities.bold());
                            if (i24 != 31) {
                                if (i24 == 32) {
                                    this.f386a.setText(i1Var.r1());
                                } else {
                                    i19 = 19;
                                    if (i24 == 19) {
                                        if (n2Var instanceof c60) {
                                            this.f386a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                        } else {
                                            this.f386a.setText(i1Var.r1());
                                        }
                                    } else if (i24 == 30) {
                                        this.f386a.setText(i1Var.r1());
                                    } else if (i24 == 35) {
                                        this.f386a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                                    } else if (i24 == 18) {
                                        if (i1Var.X.level == 0) {
                                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                        } else {
                                            this.f386a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                        }
                                    } else if (i24 == 21) {
                                        this.f386a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                                    } else if (i24 == 20) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                                    } else if (i24 == 24) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                                    } else if (i24 == 27) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                    } else if (i24 == 28) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                    } else if (i24 == 25) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                    } else if (i24 == 26) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                    } else if (i24 == 29) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                    } else if (i24 != 22 || i24 == 23) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i24 == 11) {
                                        if (i1Var.U) {
                                            this.f386a.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.f386a.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i24 == 34) {
                                        this.f386a.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i24 == 6) {
                                        this.f386a.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i24 != 14 || i1Var.T <= 1) {
                                        this.f386a.setText(LocaleController.getString(R.string.LimitReached));
                                    } else {
                                        this.f386a.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    }
                                }
                                this.f386a.setTextSize(1, 20.0f);
                                TextView textView7 = this.f386a;
                                i20 = g6.G6;
                                textView7.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                this.f386a.setGravity(i18);
                                if (i24 != i19 || i24 == 32 || i1Var.y1()) {
                                    bVar = new cg.b(context);
                                    this.f388c = bVar;
                                    bVar.a(i1Var.Y.boostCount, false);
                                    if (i24 == 32) {
                                        bVar.setVisibility(8);
                                    }
                                    if (i1Var.f429a0) {
                                        LinearLayout linearLayout = new LinearLayout(context);
                                        this.d = linearLayout;
                                        linearLayout.setOrientation(0);
                                        this.d.setWeightSum(1.0f);
                                        this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                        View view = this.d;
                                        if (z10) {
                                            i23 = 8;
                                        } else {
                                            i23 = 22;
                                        }
                                        addView(view, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                    } else {
                                        View view2 = this.f386a;
                                        if (z10) {
                                            i21 = 8;
                                        } else {
                                            i21 = 22;
                                        }
                                        addView(view2, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                        linearLayout2.setOrientation(0);
                                        linearLayout2.setClipChildren(false);
                                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                                        frameLayout2.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                        n9 n9Var = new n9(getContext());
                                        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                        y8 y8Var = new y8();
                                        y8Var.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                        n9Var.e(chat, y8Var);
                                        frameLayout2.addView(n9Var, z5.c(28.0f, 28));
                                        textView2 = new TextView(getContext());
                                        if (chat != null) {
                                            textView2.setText(chat.title);
                                        }
                                        textView2.setSingleLine(true);
                                        textView2.setMaxLines(1);
                                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                                        textView2.setTextSize(1, 13.0f);
                                        textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                        frameLayout2.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout2.addView(frameLayout2, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition = new LayoutTransition();
                                        layoutTransition.setDuration(100L);
                                        layoutTransition.enableTransitionType(4);
                                        linearLayout2.setLayoutTransition(layoutTransition);
                                        linearLayout2.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout2, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                        b6.a(linearLayout2);
                                        i22 = 1;
                                        linearLayout2.setOnClickListener(new View.OnClickListener(this) {

                                            public final g1 f332b;

                                            {
                                                this.f332b = this;
                                            }

                                            @Override
                                            public final void onClick(View view3) {
                                                switch (i22) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                        if (n2Var2 != null) {
                                                            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                            l2Var.f23619a = true;
                                                            n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        i1 i1Var2 = this.f332b.f389e;
                                                        i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                        i1Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    TextView textView8 = new TextView(context);
                                    this.f387b = textView8;
                                    textView8.setText(AndroidUtilities.replaceTags(string2));
                                    this.f387b.setTextSize(i22, 14.0f);
                                    this.f387b.setGravity(i22);
                                    TextView textView9 = this.f387b;
                                    textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                                    if (i24 == 18 || !(((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider instanceof jh.b)) {
                                        this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    } else {
                                        this.f387b.setTextColor(g6.v0(g6.f23423y6, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    }
                                    if (i24 == i19) {
                                        addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (i24 == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                    }
                                    i1Var.L1();
                                }
                                addView(this.f386a, z5.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 10));
                                i22 = 1;
                                TextView textView10 = new TextView(context);
                                this.f387b = textView10;
                                textView10.setText(AndroidUtilities.replaceTags(string2));
                                this.f387b.setTextSize(i22, 14.0f);
                                this.f387b.setGravity(i22);
                                TextView textView11 = this.f387b;
                                textView11.setLineSpacing(textView11.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                                if (i24 == 18) {
                                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                } else {
                                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                }
                                if (i24 == i19) {
                                    addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                                } else {
                                    addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                                }
                                if (i24 == 31) {
                                    ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                }
                                i1Var.L1();
                            }
                            this.f386a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                            i19 = 19;
                            this.f386a.setTextSize(1, 20.0f);
                            TextView textView12 = this.f386a;
                            i20 = g6.G6;
                            textView12.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            this.f386a.setGravity(i18);
                            if (i24 != i19) {
                                bVar = new cg.b(context);
                                this.f388c = bVar;
                                bVar.a(i1Var.Y.boostCount, false);
                                if (i24 == 32) {
                                    bVar.setVisibility(8);
                                }
                                if (i1Var.f429a0) {
                                    LinearLayout linearLayout3 = new LinearLayout(context);
                                    this.d = linearLayout3;
                                    linearLayout3.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                    View view3 = this.d;
                                    if (z10) {
                                        i23 = 8;
                                    } else {
                                        i23 = 22;
                                    }
                                    addView(view3, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                    i22 = 1;
                                } else {
                                    View view4 = this.f386a;
                                    if (z10) {
                                        i21 = 8;
                                    } else {
                                        i21 = 22;
                                    }
                                    addView(view4, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                    LinearLayout linearLayout4 = new LinearLayout(getContext());
                                    linearLayout4.setOrientation(0);
                                    linearLayout4.setClipChildren(false);
                                    FrameLayout frameLayout3 = new FrameLayout(getContext());
                                    frameLayout3.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                    n9 n9Var2 = new n9(getContext());
                                    n9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                    y8 y8Var2 = new y8();
                                    y8Var2.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                    n9Var2.e(chat, y8Var2);
                                    frameLayout3.addView(n9Var2, z5.c(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    frameLayout3.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout4.addView(frameLayout3, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition2 = new LayoutTransition();
                                    layoutTransition2.setDuration(100L);
                                    layoutTransition2.enableTransitionType(4);
                                    linearLayout4.setLayoutTransition(layoutTransition2);
                                    linearLayout4.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout4, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                    b6.a(linearLayout4);
                                    i22 = 1;
                                    linearLayout4.setOnClickListener(new View.OnClickListener(this) {

                                        public final g1 f332b;

                                        {
                                            this.f332b = this;
                                        }

                                        @Override
                                        public final void onClick(View view5) {
                                            switch (i22) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                    if (n2Var2 != null) {
                                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                        l2Var.f23619a = true;
                                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i1 i1Var2 = this.f332b.f389e;
                                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                    i1Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            } else {
                                bVar = new cg.b(context);
                                this.f388c = bVar;
                                bVar.a(i1Var.Y.boostCount, false);
                                if (i24 == 32) {
                                    bVar.setVisibility(8);
                                }
                                if (i1Var.f429a0) {
                                    LinearLayout linearLayout5 = new LinearLayout(context);
                                    this.d = linearLayout5;
                                    linearLayout5.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                    View view5 = this.d;
                                    if (z10) {
                                        i23 = 8;
                                    } else {
                                        i23 = 22;
                                    }
                                    addView(view5, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                    i22 = 1;
                                } else {
                                    View view6 = this.f386a;
                                    if (z10) {
                                        i21 = 8;
                                    } else {
                                        i21 = 22;
                                    }
                                    addView(view6, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                    LinearLayout linearLayout6 = new LinearLayout(getContext());
                                    linearLayout6.setOrientation(0);
                                    linearLayout6.setClipChildren(false);
                                    FrameLayout frameLayout4 = new FrameLayout(getContext());
                                    frameLayout4.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                    n9 n9Var3 = new n9(getContext());
                                    n9Var3.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                    y8 y8Var3 = new y8();
                                    y8Var3.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                    n9Var3.e(chat, y8Var3);
                                    frameLayout4.addView(n9Var3, z5.c(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    frameLayout4.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout6.addView(frameLayout4, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition3 = new LayoutTransition();
                                    layoutTransition3.setDuration(100L);
                                    layoutTransition3.enableTransitionType(4);
                                    linearLayout6.setLayoutTransition(layoutTransition3);
                                    linearLayout6.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout6, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                    b6.a(linearLayout6);
                                    i22 = 1;
                                    linearLayout6.setOnClickListener(new View.OnClickListener(this) {

                                        public final g1 f332b;

                                        {
                                            this.f332b = this;
                                        }

                                        @Override
                                        public final void onClick(View view7) {
                                            switch (i22) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                    if (n2Var2 != null) {
                                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                        l2Var.f23619a = true;
                                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i1 i1Var2 = this.f332b.f389e;
                                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                    i1Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            TextView textView13 = new TextView(context);
                            this.f387b = textView13;
                            textView13.setText(AndroidUtilities.replaceTags(string2));
                            this.f387b.setTextSize(i22, 14.0f);
                            this.f387b.setGravity(i22);
                            TextView textView14 = this.f387b;
                            textView14.setLineSpacing(textView14.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                            if (i24 == 18) {
                                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            } else {
                                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            }
                            if (i24 == i19) {
                                addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                            } else {
                                addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                            }
                            if (i24 == 31) {
                                ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                            }
                            i1Var.L1();
                        }
                        if (z11) {
                        }
                        if (i24 != 11) {
                            if (i1Var.f453z0.isEmpty()) {
                                arrayList3 = i1Var.f452y0;
                            } else {
                                arrayList3 = i1Var.f453z0;
                            }
                            b9Var = new b9(context, false);
                            b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                            b9Var.setSize(AndroidUtilities.dp(72.0f));
                            b9Var.setStepFactor(0.4f);
                            iMin = Math.min(arrayList3.size(), 3);
                            b9Var.setCount(iMin);
                            while (i14 < iMin) {
                                Long l11 = (Long) arrayList3.get(i14);
                                l11.getClass();
                                b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l11), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                            }
                            b9Var.a(false);
                            addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                            TextView textView15 = new TextView(context);
                            textView15.setGravity(17);
                            rl.h(20.0f, 1, textView15);
                            int i34 = g6.f23161j5;
                            textView15.setTextColor(g6.v0(i34, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            textView15.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                            addView(textView15, z5.t(-1, -2, 1, 32, 0, 32, 9));
                            textView = new TextView(context);
                            textView.setGravity(17);
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(g6.v0(i34, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                            if (i24 == 34) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (i1Var.f452y0 != null) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (arrayList3.size() == 1) {
                                if (z12) {
                                    i17 = R.string.InviteCallMessagePremiumBlockedOne;
                                } else if (z13) {
                                    i17 = R.string.InviteMessagePremiumBlockedOne;
                                } else {
                                    i17 = R.string.InvitePremiumBlockedOne;
                                }
                                string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                            } else if (arrayList3.size() == 2) {
                                if (z12) {
                                    i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                                } else if (z13) {
                                    i16 = R.string.InviteMessagePremiumBlockedTwo;
                                } else {
                                    i16 = R.string.InvitePremiumBlockedTwo;
                                }
                                string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                            } else if (arrayList3.size() == 3) {
                                if (z12) {
                                    i15 = R.string.InviteCallMessagePremiumBlockedThree;
                                } else if (z13) {
                                    i15 = R.string.InviteMessagePremiumBlockedThree;
                                } else {
                                    i15 = R.string.InvitePremiumBlockedThree;
                                }
                                string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                            } else {
                                if (z12) {
                                    str = "InviteCallMessagePremiumBlockedMany";
                                } else if (z13) {
                                    str = "InviteMessagePremiumBlockedMany";
                                } else {
                                    str = "InvitePremiumBlockedMany";
                                }
                                String pluralString2 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                                int size5 = arrayList3.size() - 2;
                                int themedColor2 = i1Var.getThemedColor(g6.f23124h5);
                                b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                                b9Var.f27051c = new pz0(i0.a.k(size5, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                Paint paint2 = new Paint(1);
                                b9Var.d = paint2;
                                paint2.setColor(themedColor2);
                                string3 = pluralString2;
                            }
                            textView.setText(AndroidUtilities.replaceTags(string3));
                            if (i1Var.f453z0 == null) {
                                size2 = 0;
                            } else {
                                size2 = i1Var.f453z0.size();
                            }
                            if (i1Var.f452y0 == null) {
                                size3 = 0;
                            } else {
                                size3 = i1Var.f452y0.size();
                            }
                            if (size2 - size3 > 0) {
                                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                i1Var.f434f0 = true;
                            } else {
                                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                i1Var.f434f0 = true;
                            }
                            i1Var.L1();
                            return;
                        }
                        if (i1Var.f453z0.isEmpty()) {
                            arrayList3 = i1Var.f452y0;
                        } else {
                            arrayList3 = i1Var.f453z0;
                        }
                        b9Var = new b9(context, false);
                        b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                        b9Var.setSize(AndroidUtilities.dp(72.0f));
                        b9Var.setStepFactor(0.4f);
                        iMin = Math.min(arrayList3.size(), 3);
                        b9Var.setCount(iMin);
                        while (i14 < iMin) {
                            Long l12 = (Long) arrayList3.get(i14);
                            l12.getClass();
                            b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l12), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                        }
                        b9Var.a(false);
                        addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView16 = new TextView(context);
                        textView16.setGravity(17);
                        rl.h(20.0f, 1, textView16);
                        int i35 = g6.f23161j5;
                        textView16.setTextColor(g6.v0(i35, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        textView16.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                        addView(textView16, z5.t(-1, -2, 1, 32, 0, 32, 9));
                        textView = new TextView(context);
                        textView.setGravity(17);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(g6.v0(i35, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                        if (i24 == 34) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i1Var.f452y0 != null) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (arrayList3.size() == 1) {
                            if (z12) {
                                i17 = R.string.InviteCallMessagePremiumBlockedOne;
                            } else if (z13) {
                                i17 = R.string.InviteMessagePremiumBlockedOne;
                            } else {
                                i17 = R.string.InvitePremiumBlockedOne;
                            }
                            string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                        } else if (arrayList3.size() == 2) {
                            if (z12) {
                                i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                            } else if (z13) {
                                i16 = R.string.InviteMessagePremiumBlockedTwo;
                            } else {
                                i16 = R.string.InvitePremiumBlockedTwo;
                            }
                            string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                        } else if (arrayList3.size() == 3) {
                            if (z12) {
                                i15 = R.string.InviteCallMessagePremiumBlockedThree;
                            } else if (z13) {
                                i15 = R.string.InviteMessagePremiumBlockedThree;
                            } else {
                                i15 = R.string.InvitePremiumBlockedThree;
                            }
                            string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                        } else {
                            if (z12) {
                                str = "InviteCallMessagePremiumBlockedMany";
                            } else if (z13) {
                                str = "InviteMessagePremiumBlockedMany";
                            } else {
                                str = "InvitePremiumBlockedMany";
                            }
                            String pluralString3 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                            int size6 = arrayList3.size() - 2;
                            int themedColor3 = i1Var.getThemedColor(g6.f23124h5);
                            b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                            b9Var.f27051c = new pz0(i0.a.k(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                            Paint paint3 = new Paint(1);
                            b9Var.d = paint3;
                            paint3.setColor(themedColor3);
                            string3 = pluralString3;
                        }
                        textView.setText(AndroidUtilities.replaceTags(string3));
                        if (i1Var.f453z0 == null) {
                            size2 = 0;
                        } else {
                            size2 = i1Var.f453z0.size();
                        }
                        if (i1Var.f452y0 == null) {
                            size3 = 0;
                        } else {
                            size3 = i1Var.f452y0.size();
                        }
                        if (size2 - size3 > 0) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            i1Var.f434f0 = true;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            i1Var.f434f0 = true;
                        }
                        i1Var.L1();
                        return;
                        if (i24 != 31) {
                            f1Var = new f1(this, context, i25, activatedAccountsCount, i11, f11, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                            i1Var.f447t0 = f1Var;
                            if (!z11) {
                                f1Var.setBagePosition(f10);
                                i1Var.f447t0.setType(i24);
                                i1Var.f447t0.f26458w.setVisibility(8);
                                if (z10) {
                                    f1 f1Var4 = i1Var.f447t0;
                                    f1Var4.E.setVisibility(8);
                                    b0Var = f1Var4.f26450e;
                                    if (b0Var != null) {
                                        b0Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    f1Var4.F = true;
                                } else {
                                    if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                                    }
                                    i1Var.f447t0.v.setVisibility(8);
                                    if (i24 == 6) {
                                        i1Var.f447t0.f26458w.setText("2 GB");
                                    } else {
                                        i1Var.f447t0.f26458w.setText(Integer.toString(i10));
                                    }
                                    z14 = false;
                                    i1Var.f447t0.f26458w.setVisibility(0);
                                    if (i24 != 2) {
                                        i1Var.f447t0.D = z14;
                                    } else {
                                        i1Var.f447t0.D = z14;
                                    }
                                    addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                }
                            } else if (i1Var.X != null) {
                                f1 f1Var5 = i1Var.f447t0;
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = i1Var.X;
                                canApplyBoost = i1Var.Y;
                                if (canApplyBoost == null) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                f1Var5.e(tL_premium_boostsStatus3, z15);
                            }
                            z14 = false;
                            if (i24 != 2) {
                                i1Var.f447t0.D = z14;
                            } else {
                                i1Var.f447t0.D = z14;
                            }
                            addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i24 == 31) {
                            FrameLayout frameLayout5 = new FrameLayout(context);
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                            i18 = 17;
                            frameLayout5.addView(imageView2, z5.e(-2, -2, 17));
                            frameLayout5.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
                            addView(frameLayout5, z5.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i18 = 17;
                        }
                        TextView textView17 = new TextView(context);
                        this.f386a = textView17;
                        textView17.setTypeface(AndroidUtilities.bold());
                        if (i24 != 31) {
                            if (i24 == 32) {
                                this.f386a.setText(i1Var.r1());
                            } else {
                                i19 = 19;
                                if (i24 == 19) {
                                    if (n2Var instanceof c60) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                    } else {
                                        this.f386a.setText(i1Var.r1());
                                    }
                                } else if (i24 == 30) {
                                    this.f386a.setText(i1Var.r1());
                                } else if (i24 == 35) {
                                    this.f386a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                                } else if (i24 == 18) {
                                    if (i1Var.X.level == 0) {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                    } else {
                                        this.f386a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                    }
                                } else if (i24 == 21) {
                                    this.f386a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                                } else if (i24 == 20) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                                } else if (i24 == 24) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                                } else if (i24 == 27) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                } else if (i24 == 28) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                } else if (i24 == 25) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                } else if (i24 == 26) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                } else if (i24 == 29) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                } else if (i24 != 22) {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                } else {
                                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                }
                            }
                            this.f386a.setTextSize(1, 20.0f);
                            TextView textView18 = this.f386a;
                            i20 = g6.G6;
                            textView18.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            this.f386a.setGravity(i18);
                            if (i24 != i19) {
                                bVar = new cg.b(context);
                                this.f388c = bVar;
                                bVar.a(i1Var.Y.boostCount, false);
                                if (i24 == 32) {
                                    bVar.setVisibility(8);
                                }
                                if (i1Var.f429a0) {
                                    LinearLayout linearLayout7 = new LinearLayout(context);
                                    this.d = linearLayout7;
                                    linearLayout7.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                    View view7 = this.d;
                                    if (z10) {
                                        i23 = 8;
                                    } else {
                                        i23 = 22;
                                    }
                                    addView(view7, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                    i22 = 1;
                                } else {
                                    View view8 = this.f386a;
                                    if (z10) {
                                        i21 = 8;
                                    } else {
                                        i21 = 22;
                                    }
                                    addView(view8, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                    LinearLayout linearLayout8 = new LinearLayout(getContext());
                                    linearLayout8.setOrientation(0);
                                    linearLayout8.setClipChildren(false);
                                    FrameLayout frameLayout6 = new FrameLayout(getContext());
                                    frameLayout6.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                    n9 n9Var4 = new n9(getContext());
                                    n9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                    y8 y8Var4 = new y8();
                                    y8Var4.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                    n9Var4.e(chat, y8Var4);
                                    frameLayout6.addView(n9Var4, z5.c(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    frameLayout6.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout8.addView(frameLayout6, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition4 = new LayoutTransition();
                                    layoutTransition4.setDuration(100L);
                                    layoutTransition4.enableTransitionType(4);
                                    linearLayout8.setLayoutTransition(layoutTransition4);
                                    linearLayout8.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout8, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                    b6.a(linearLayout8);
                                    i22 = 1;
                                    linearLayout8.setOnClickListener(new View.OnClickListener(this) {

                                        public final g1 f332b;

                                        {
                                            this.f332b = this;
                                        }

                                        @Override
                                        public final void onClick(View view9) {
                                            switch (i22) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                    if (n2Var2 != null) {
                                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                        l2Var.f23619a = true;
                                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i1 i1Var2 = this.f332b.f389e;
                                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                    i1Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            } else {
                                bVar = new cg.b(context);
                                this.f388c = bVar;
                                bVar.a(i1Var.Y.boostCount, false);
                                if (i24 == 32) {
                                    bVar.setVisibility(8);
                                }
                                if (i1Var.f429a0) {
                                    LinearLayout linearLayout9 = new LinearLayout(context);
                                    this.d = linearLayout9;
                                    linearLayout9.setOrientation(0);
                                    this.d.setWeightSum(1.0f);
                                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                    View view9 = this.d;
                                    if (z10) {
                                        i23 = 8;
                                    } else {
                                        i23 = 22;
                                    }
                                    addView(view9, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                    i22 = 1;
                                } else {
                                    View view10 = this.f386a;
                                    if (z10) {
                                        i21 = 8;
                                    } else {
                                        i21 = 22;
                                    }
                                    addView(view10, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                    LinearLayout linearLayout10 = new LinearLayout(getContext());
                                    linearLayout10.setOrientation(0);
                                    linearLayout10.setClipChildren(false);
                                    FrameLayout frameLayout7 = new FrameLayout(getContext());
                                    frameLayout7.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                    n9 n9Var5 = new n9(getContext());
                                    n9Var5.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                    y8 y8Var5 = new y8();
                                    y8Var5.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                    n9Var5.e(chat, y8Var5);
                                    frameLayout7.addView(n9Var5, z5.c(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                    frameLayout7.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout10.addView(frameLayout7, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition5 = new LayoutTransition();
                                    layoutTransition5.setDuration(100L);
                                    layoutTransition5.enableTransitionType(4);
                                    linearLayout10.setLayoutTransition(layoutTransition5);
                                    linearLayout10.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout10, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                    b6.a(linearLayout10);
                                    i22 = 1;
                                    linearLayout10.setOnClickListener(new View.OnClickListener(this) {

                                        public final g1 f332b;

                                        {
                                            this.f332b = this;
                                        }

                                        @Override
                                        public final void onClick(View view11) {
                                            switch (i22) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                    if (n2Var2 != null) {
                                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                        l2Var.f23619a = true;
                                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i1 i1Var2 = this.f332b.f389e;
                                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                    i1Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            TextView textView19 = new TextView(context);
                            this.f387b = textView19;
                            textView19.setText(AndroidUtilities.replaceTags(string2));
                            this.f387b.setTextSize(i22, 14.0f);
                            this.f387b.setGravity(i22);
                            TextView textView110 = this.f387b;
                            textView110.setLineSpacing(textView110.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                            if (i24 == 18) {
                                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            } else {
                                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            }
                            if (i24 == i19) {
                                addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                            } else {
                                addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                            }
                            if (i24 == 31) {
                                ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                            }
                            i1Var.L1();
                        }
                        this.f386a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        i19 = 19;
                        this.f386a.setTextSize(1, 20.0f);
                        TextView textView111 = this.f386a;
                        i20 = g6.G6;
                        textView111.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        this.f386a.setGravity(i18);
                        if (i24 != i19) {
                            bVar = new cg.b(context);
                            this.f388c = bVar;
                            bVar.a(i1Var.Y.boostCount, false);
                            if (i24 == 32) {
                                bVar.setVisibility(8);
                            }
                            if (i1Var.f429a0) {
                                LinearLayout linearLayout11 = new LinearLayout(context);
                                this.d = linearLayout11;
                                linearLayout11.setOrientation(0);
                                this.d.setWeightSum(1.0f);
                                this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                View view11 = this.d;
                                if (z10) {
                                    i23 = 8;
                                } else {
                                    i23 = 22;
                                }
                                addView(view11, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                i22 = 1;
                            } else {
                                View view12 = this.f386a;
                                if (z10) {
                                    i21 = 8;
                                } else {
                                    i21 = 22;
                                }
                                addView(view12, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                LinearLayout linearLayout12 = new LinearLayout(getContext());
                                linearLayout12.setOrientation(0);
                                linearLayout12.setClipChildren(false);
                                FrameLayout frameLayout8 = new FrameLayout(getContext());
                                frameLayout8.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                n9 n9Var6 = new n9(getContext());
                                n9Var6.setRoundRadius(AndroidUtilities.dp(14.0f));
                                chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                y8 y8Var6 = new y8();
                                y8Var6.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                n9Var6.e(chat, y8Var6);
                                frameLayout8.addView(n9Var6, z5.c(28.0f, 28));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                frameLayout8.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout12.addView(frameLayout8, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition6 = new LayoutTransition();
                                layoutTransition6.setDuration(100L);
                                layoutTransition6.enableTransitionType(4);
                                linearLayout12.setLayoutTransition(layoutTransition6);
                                linearLayout12.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout12, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                b6.a(linearLayout12);
                                i22 = 1;
                                linearLayout12.setOnClickListener(new View.OnClickListener(this) {

                                    public final g1 f332b;

                                    {
                                        this.f332b = this;
                                    }

                                    @Override
                                    public final void onClick(View view13) {
                                        switch (i22) {
                                            case 0:
                                                org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                if (n2Var2 != null) {
                                                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                    l2Var.f23619a = true;
                                                    n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                    break;
                                                }
                                                break;
                                            default:
                                                i1 i1Var2 = this.f332b.f389e;
                                                i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                i1Var2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                        } else {
                            bVar = new cg.b(context);
                            this.f388c = bVar;
                            bVar.a(i1Var.Y.boostCount, false);
                            if (i24 == 32) {
                                bVar.setVisibility(8);
                            }
                            if (i1Var.f429a0) {
                                LinearLayout linearLayout13 = new LinearLayout(context);
                                this.d = linearLayout13;
                                linearLayout13.setOrientation(0);
                                this.d.setWeightSum(1.0f);
                                this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                                this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                View view13 = this.d;
                                if (z10) {
                                    i23 = 8;
                                } else {
                                    i23 = 22;
                                }
                                addView(view13, z5.t(-2, -2, 1, 12, i23, 12, 9));
                                i22 = 1;
                            } else {
                                View view14 = this.f386a;
                                if (z10) {
                                    i21 = 8;
                                } else {
                                    i21 = 22;
                                }
                                addView(view14, z5.t(-2, -2, 1, 0, i21, 0, 0));
                                LinearLayout linearLayout14 = new LinearLayout(getContext());
                                linearLayout14.setOrientation(0);
                                linearLayout14.setClipChildren(false);
                                FrameLayout frameLayout9 = new FrameLayout(getContext());
                                frameLayout9.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                                n9 n9Var7 = new n9(getContext());
                                n9Var7.setRoundRadius(AndroidUtilities.dp(14.0f));
                                chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                                y8 y8Var7 = new y8();
                                y8Var7.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                                n9Var7.e(chat, y8Var7);
                                frameLayout9.addView(n9Var7, z5.c(28.0f, 28));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                                frameLayout9.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout14.addView(frameLayout9, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition7 = new LayoutTransition();
                                layoutTransition7.setDuration(100L);
                                layoutTransition7.enableTransitionType(4);
                                linearLayout14.setLayoutTransition(layoutTransition7);
                                linearLayout14.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout14, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                b6.a(linearLayout14);
                                i22 = 1;
                                linearLayout14.setOnClickListener(new View.OnClickListener(this) {

                                    public final g1 f332b;

                                    {
                                        this.f332b = this;
                                    }

                                    @Override
                                    public final void onClick(View view15) {
                                        switch (i22) {
                                            case 0:
                                                org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                                if (n2Var2 != null) {
                                                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                    l2Var.f23619a = true;
                                                    n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                    break;
                                                }
                                                break;
                                            default:
                                                i1 i1Var2 = this.f332b.f389e;
                                                i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                                i1Var2.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        TextView textView112 = new TextView(context);
                        this.f387b = textView112;
                        textView112.setText(AndroidUtilities.replaceTags(string2));
                        this.f387b.setTextSize(i22, 14.0f);
                        this.f387b.setGravity(i22);
                        TextView textView113 = this.f387b;
                        textView113.setLineSpacing(textView113.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                        if (i24 == 18) {
                            this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        } else {
                            this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        }
                        if (i24 == i19) {
                            addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                        } else {
                            addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                        }
                        if (i24 == 31) {
                            ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                            ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                            ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        }
                        i1Var.L1();
                    }
                    activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                }
                if (UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                    activatedAccountsCount = i11;
                    f10 = 1.0f;
                } else {
                    activatedAccountsCount = i11;
                    f10 = 1.0f;
                }
                f11 = i10 / i11;
                z11 = i24 == 18 ? true : true;
                if (z11) {
                }
                if (i24 != 11) {
                    if (i1Var.f453z0.isEmpty()) {
                        arrayList3 = i1Var.f452y0;
                    } else {
                        arrayList3 = i1Var.f453z0;
                    }
                    b9Var = new b9(context, false);
                    b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                    b9Var.setSize(AndroidUtilities.dp(72.0f));
                    b9Var.setStepFactor(0.4f);
                    iMin = Math.min(arrayList3.size(), 3);
                    b9Var.setCount(iMin);
                    while (i14 < iMin) {
                        Long l13 = (Long) arrayList3.get(i14);
                        l13.getClass();
                        b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l13), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                    }
                    b9Var.a(false);
                    addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView114 = new TextView(context);
                    textView114.setGravity(17);
                    rl.h(20.0f, 1, textView114);
                    int i36 = g6.f23161j5;
                    textView114.setTextColor(g6.v0(i36, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    textView114.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView114, z5.t(-1, -2, 1, 32, 0, 32, 9));
                    textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(g6.v0(i36, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i24 == 34) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i1Var.f452y0 != null) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (arrayList3.size() == 1) {
                        if (z12) {
                            i17 = R.string.InviteCallMessagePremiumBlockedOne;
                        } else if (z13) {
                            i17 = R.string.InviteMessagePremiumBlockedOne;
                        } else {
                            i17 = R.string.InvitePremiumBlockedOne;
                        }
                        string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                    } else if (arrayList3.size() == 2) {
                        if (z12) {
                            i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                        } else if (z13) {
                            i16 = R.string.InviteMessagePremiumBlockedTwo;
                        } else {
                            i16 = R.string.InvitePremiumBlockedTwo;
                        }
                        string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                    } else if (arrayList3.size() == 3) {
                        if (z12) {
                            i15 = R.string.InviteCallMessagePremiumBlockedThree;
                        } else if (z13) {
                            i15 = R.string.InviteMessagePremiumBlockedThree;
                        } else {
                            i15 = R.string.InvitePremiumBlockedThree;
                        }
                        string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                    } else {
                        if (z12) {
                            str = "InviteCallMessagePremiumBlockedMany";
                        } else if (z13) {
                            str = "InviteMessagePremiumBlockedMany";
                        } else {
                            str = "InvitePremiumBlockedMany";
                        }
                        String pluralString4 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                        int size7 = arrayList3.size() - 2;
                        int themedColor4 = i1Var.getThemedColor(g6.f23124h5);
                        b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                        b9Var.f27051c = new pz0(i0.a.k(size7, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                        Paint paint4 = new Paint(1);
                        b9Var.d = paint4;
                        paint4.setColor(themedColor4);
                        string3 = pluralString4;
                    }
                    textView.setText(AndroidUtilities.replaceTags(string3));
                    if (i1Var.f453z0 == null) {
                        size2 = 0;
                    } else {
                        size2 = i1Var.f453z0.size();
                    }
                    if (i1Var.f452y0 == null) {
                        size3 = 0;
                    } else {
                        size3 = i1Var.f452y0.size();
                    }
                    if (size2 - size3 > 0) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        i1Var.f434f0 = true;
                    } else {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        i1Var.f434f0 = true;
                    }
                    i1Var.L1();
                    return;
                }
                if (i1Var.f453z0.isEmpty()) {
                    arrayList3 = i1Var.f452y0;
                } else {
                    arrayList3 = i1Var.f453z0;
                }
                b9Var = new b9(context, false);
                b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                b9Var.setSize(AndroidUtilities.dp(72.0f));
                b9Var.setStepFactor(0.4f);
                iMin = Math.min(arrayList3.size(), 3);
                b9Var.setCount(iMin);
                while (i14 < iMin) {
                    Long l14 = (Long) arrayList3.get(i14);
                    l14.getClass();
                    b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l14), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                }
                b9Var.a(false);
                addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView115 = new TextView(context);
                textView115.setGravity(17);
                rl.h(20.0f, 1, textView115);
                int i37 = g6.f23161j5;
                textView115.setTextColor(g6.v0(i37, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                textView115.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                addView(textView115, z5.t(-1, -2, 1, 32, 0, 32, 9));
                textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(g6.v0(i37, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                if (i24 == 34) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i1Var.f452y0 != null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (arrayList3.size() == 1) {
                    if (z12) {
                        i17 = R.string.InviteCallMessagePremiumBlockedOne;
                    } else if (z13) {
                        i17 = R.string.InviteMessagePremiumBlockedOne;
                    } else {
                        i17 = R.string.InvitePremiumBlockedOne;
                    }
                    string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                } else if (arrayList3.size() == 2) {
                    if (z12) {
                        i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                    } else if (z13) {
                        i16 = R.string.InviteMessagePremiumBlockedTwo;
                    } else {
                        i16 = R.string.InvitePremiumBlockedTwo;
                    }
                    string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                } else if (arrayList3.size() == 3) {
                    if (z12) {
                        i15 = R.string.InviteCallMessagePremiumBlockedThree;
                    } else if (z13) {
                        i15 = R.string.InviteMessagePremiumBlockedThree;
                    } else {
                        i15 = R.string.InvitePremiumBlockedThree;
                    }
                    string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                } else {
                    if (z12) {
                        str = "InviteCallMessagePremiumBlockedMany";
                    } else if (z13) {
                        str = "InviteMessagePremiumBlockedMany";
                    } else {
                        str = "InvitePremiumBlockedMany";
                    }
                    String pluralString5 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                    int size8 = arrayList3.size() - 2;
                    int themedColor5 = i1Var.getThemedColor(g6.f23124h5);
                    b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                    b9Var.f27051c = new pz0(i0.a.k(size8, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                    Paint paint5 = new Paint(1);
                    b9Var.d = paint5;
                    paint5.setColor(themedColor5);
                    string3 = pluralString5;
                }
                textView.setText(AndroidUtilities.replaceTags(string3));
                if (i1Var.f453z0 == null) {
                    size2 = 0;
                } else {
                    size2 = i1Var.f453z0.size();
                }
                if (i1Var.f452y0 == null) {
                    size3 = 0;
                } else {
                    size3 = i1Var.f452y0.size();
                }
                if (size2 - size3 > 0) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    i1Var.f434f0 = true;
                } else {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    i1Var.f434f0 = true;
                }
                i1Var.L1();
                return;
                if (i24 != 31) {
                    f1Var = new f1(this, context, i25, activatedAccountsCount, i11, f11, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                    i1Var.f447t0 = f1Var;
                    if (!z11) {
                        f1Var.setBagePosition(f10);
                        i1Var.f447t0.setType(i24);
                        i1Var.f447t0.f26458w.setVisibility(8);
                        if (z10) {
                            f1 f1Var6 = i1Var.f447t0;
                            f1Var6.E.setVisibility(8);
                            b0Var = f1Var6.f26450e;
                            if (b0Var != null) {
                                b0Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                            }
                            f1Var6.F = true;
                        } else {
                            if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                            }
                            i1Var.f447t0.v.setVisibility(8);
                            if (i24 == 6) {
                                i1Var.f447t0.f26458w.setText("2 GB");
                            } else {
                                i1Var.f447t0.f26458w.setText(Integer.toString(i10));
                            }
                            z14 = false;
                            i1Var.f447t0.f26458w.setVisibility(0);
                            if (i24 != 2) {
                                i1Var.f447t0.D = z14;
                            } else {
                                i1Var.f447t0.D = z14;
                            }
                            addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                    } else if (i1Var.X != null) {
                        f1 f1Var7 = i1Var.f447t0;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = i1Var.X;
                        canApplyBoost = i1Var.Y;
                        if (canApplyBoost == null) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        f1Var7.e(tL_premium_boostsStatus4, z15);
                    }
                    z14 = false;
                    if (i24 != 2) {
                        i1Var.f447t0.D = z14;
                    } else {
                        i1Var.f447t0.D = z14;
                    }
                    addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i24 == 31) {
                    FrameLayout frameLayout10 = new FrameLayout(context);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                    i18 = 17;
                    frameLayout10.addView(imageView3, z5.e(-2, -2, 17));
                    frameLayout10.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
                    addView(frameLayout10, z5.t(79, 79, 1, 0, 23, 0, 0));
                } else {
                    i18 = 17;
                }
                TextView textView116 = new TextView(context);
                this.f386a = textView116;
                textView116.setTypeface(AndroidUtilities.bold());
                if (i24 != 31) {
                    if (i24 == 32) {
                        this.f386a.setText(i1Var.r1());
                    } else {
                        i19 = 19;
                        if (i24 == 19) {
                            if (n2Var instanceof c60) {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                            } else {
                                this.f386a.setText(i1Var.r1());
                            }
                        } else if (i24 == 30) {
                            this.f386a.setText(i1Var.r1());
                        } else if (i24 == 35) {
                            this.f386a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                        } else if (i24 == 18) {
                            if (i1Var.X.level == 0) {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                            } else {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                            }
                        } else if (i24 == 21) {
                            this.f386a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                        } else if (i24 == 20) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                        } else if (i24 == 24) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                        } else if (i24 == 27) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                        } else if (i24 == 28) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                        } else if (i24 == 25) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                        } else if (i24 == 26) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                        } else if (i24 == 29) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                        } else if (i24 != 22) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        } else {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        }
                    }
                    this.f386a.setTextSize(1, 20.0f);
                    TextView textView117 = this.f386a;
                    i20 = g6.G6;
                    textView117.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    this.f386a.setGravity(i18);
                    if (i24 != i19) {
                        bVar = new cg.b(context);
                        this.f388c = bVar;
                        bVar.a(i1Var.Y.boostCount, false);
                        if (i24 == 32) {
                            bVar.setVisibility(8);
                        }
                        if (i1Var.f429a0) {
                            LinearLayout linearLayout15 = new LinearLayout(context);
                            this.d = linearLayout15;
                            linearLayout15.setOrientation(0);
                            this.d.setWeightSum(1.0f);
                            this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                            this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                            View view15 = this.d;
                            if (z10) {
                                i23 = 8;
                            } else {
                                i23 = 22;
                            }
                            addView(view15, z5.t(-2, -2, 1, 12, i23, 12, 9));
                            i22 = 1;
                        } else {
                            View view16 = this.f386a;
                            if (z10) {
                                i21 = 8;
                            } else {
                                i21 = 22;
                            }
                            addView(view16, z5.t(-2, -2, 1, 0, i21, 0, 0));
                            LinearLayout linearLayout16 = new LinearLayout(getContext());
                            linearLayout16.setOrientation(0);
                            linearLayout16.setClipChildren(false);
                            FrameLayout frameLayout11 = new FrameLayout(getContext());
                            frameLayout11.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                            n9 n9Var8 = new n9(getContext());
                            n9Var8.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                            y8 y8Var8 = new y8();
                            y8Var8.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                            n9Var8.e(chat, y8Var8);
                            frameLayout11.addView(n9Var8, z5.c(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            frameLayout11.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout16.addView(frameLayout11, z5.t(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition8 = new LayoutTransition();
                            layoutTransition8.setDuration(100L);
                            layoutTransition8.enableTransitionType(4);
                            linearLayout16.setLayoutTransition(layoutTransition8);
                            linearLayout16.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout16, z5.t(-2, 38, 17, 0, -4, 0, 12));
                            b6.a(linearLayout16);
                            i22 = 1;
                            linearLayout16.setOnClickListener(new View.OnClickListener(this) {

                                public final g1 f332b;

                                {
                                    this.f332b = this;
                                }

                                @Override
                                public final void onClick(View view17) {
                                    switch (i22) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                            if (n2Var2 != null) {
                                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                l2Var.f23619a = true;
                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            i1 i1Var2 = this.f332b.f389e;
                                            i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                            i1Var2.dismiss();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        bVar = new cg.b(context);
                        this.f388c = bVar;
                        bVar.a(i1Var.Y.boostCount, false);
                        if (i24 == 32) {
                            bVar.setVisibility(8);
                        }
                        if (i1Var.f429a0) {
                            LinearLayout linearLayout17 = new LinearLayout(context);
                            this.d = linearLayout17;
                            linearLayout17.setOrientation(0);
                            this.d.setWeightSum(1.0f);
                            this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                            this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                            View view17 = this.d;
                            if (z10) {
                                i23 = 8;
                            } else {
                                i23 = 22;
                            }
                            addView(view17, z5.t(-2, -2, 1, 12, i23, 12, 9));
                            i22 = 1;
                        } else {
                            View view18 = this.f386a;
                            if (z10) {
                                i21 = 8;
                            } else {
                                i21 = 22;
                            }
                            addView(view18, z5.t(-2, -2, 1, 0, i21, 0, 0));
                            LinearLayout linearLayout18 = new LinearLayout(getContext());
                            linearLayout18.setOrientation(0);
                            linearLayout18.setClipChildren(false);
                            FrameLayout frameLayout12 = new FrameLayout(getContext());
                            frameLayout12.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                            n9 n9Var9 = new n9(getContext());
                            n9Var9.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                            y8 y8Var9 = new y8();
                            y8Var9.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                            n9Var9.e(chat, y8Var9);
                            frameLayout12.addView(n9Var9, z5.c(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            frameLayout12.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout18.addView(frameLayout12, z5.t(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition9 = new LayoutTransition();
                            layoutTransition9.setDuration(100L);
                            layoutTransition9.enableTransitionType(4);
                            linearLayout18.setLayoutTransition(layoutTransition9);
                            linearLayout18.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout18, z5.t(-2, 38, 17, 0, -4, 0, 12));
                            b6.a(linearLayout18);
                            i22 = 1;
                            linearLayout18.setOnClickListener(new View.OnClickListener(this) {

                                public final g1 f332b;

                                {
                                    this.f332b = this;
                                }

                                @Override
                                public final void onClick(View view19) {
                                    switch (i22) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                            if (n2Var2 != null) {
                                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                l2Var.f23619a = true;
                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            i1 i1Var2 = this.f332b.f389e;
                                            i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                            i1Var2.dismiss();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    TextView textView118 = new TextView(context);
                    this.f387b = textView118;
                    textView118.setText(AndroidUtilities.replaceTags(string2));
                    this.f387b.setTextSize(i22, 14.0f);
                    this.f387b.setGravity(i22);
                    TextView textView119 = this.f387b;
                    textView119.setLineSpacing(textView119.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                    if (i24 == 18) {
                        this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    } else {
                        this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    }
                    if (i24 == i19) {
                        addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (i24 == 31) {
                        ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    i1Var.L1();
                }
                this.f386a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                i19 = 19;
                this.f386a.setTextSize(1, 20.0f);
                TextView textView1110 = this.f386a;
                i20 = g6.G6;
                textView1110.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                this.f386a.setGravity(i18);
                if (i24 != i19) {
                    bVar = new cg.b(context);
                    this.f388c = bVar;
                    bVar.a(i1Var.Y.boostCount, false);
                    if (i24 == 32) {
                        bVar.setVisibility(8);
                    }
                    if (i1Var.f429a0) {
                        LinearLayout linearLayout19 = new LinearLayout(context);
                        this.d = linearLayout19;
                        linearLayout19.setOrientation(0);
                        this.d.setWeightSum(1.0f);
                        this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                        View view19 = this.d;
                        if (z10) {
                            i23 = 8;
                        } else {
                            i23 = 22;
                        }
                        addView(view19, z5.t(-2, -2, 1, 12, i23, 12, 9));
                        i22 = 1;
                    } else {
                        View view110 = this.f386a;
                        if (z10) {
                            i21 = 8;
                        } else {
                            i21 = 22;
                        }
                        addView(view110, z5.t(-2, -2, 1, 0, i21, 0, 0));
                        LinearLayout linearLayout110 = new LinearLayout(getContext());
                        linearLayout110.setOrientation(0);
                        linearLayout110.setClipChildren(false);
                        FrameLayout frameLayout13 = new FrameLayout(getContext());
                        frameLayout13.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                        n9 n9Var10 = new n9(getContext());
                        n9Var10.setRoundRadius(AndroidUtilities.dp(14.0f));
                        chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                        y8 y8Var10 = new y8();
                        y8Var10.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                        n9Var10.e(chat, y8Var10);
                        frameLayout13.addView(n9Var10, z5.c(28.0f, 28));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        frameLayout13.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout110.addView(frameLayout13, z5.t(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition10 = new LayoutTransition();
                        layoutTransition10.setDuration(100L);
                        layoutTransition10.enableTransitionType(4);
                        linearLayout110.setLayoutTransition(layoutTransition10);
                        linearLayout110.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout110, z5.t(-2, 38, 17, 0, -4, 0, 12));
                        b6.a(linearLayout110);
                        i22 = 1;
                        linearLayout110.setOnClickListener(new View.OnClickListener(this) {

                            public final g1 f332b;

                            {
                                this.f332b = this;
                            }

                            @Override
                            public final void onClick(View view111) {
                                switch (i22) {
                                    case 0:
                                        org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                        if (n2Var2 != null) {
                                            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                            l2Var.f23619a = true;
                                            n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var2 = this.f332b.f389e;
                                        i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                        i1Var2.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    bVar = new cg.b(context);
                    this.f388c = bVar;
                    bVar.a(i1Var.Y.boostCount, false);
                    if (i24 == 32) {
                        bVar.setVisibility(8);
                    }
                    if (i1Var.f429a0) {
                        LinearLayout linearLayout111 = new LinearLayout(context);
                        this.d = linearLayout111;
                        linearLayout111.setOrientation(0);
                        this.d.setWeightSum(1.0f);
                        this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                        View view111 = this.d;
                        if (z10) {
                            i23 = 8;
                        } else {
                            i23 = 22;
                        }
                        addView(view111, z5.t(-2, -2, 1, 12, i23, 12, 9));
                        i22 = 1;
                    } else {
                        View view112 = this.f386a;
                        if (z10) {
                            i21 = 8;
                        } else {
                            i21 = 22;
                        }
                        addView(view112, z5.t(-2, -2, 1, 0, i21, 0, 0));
                        LinearLayout linearLayout112 = new LinearLayout(getContext());
                        linearLayout112.setOrientation(0);
                        linearLayout112.setClipChildren(false);
                        FrameLayout frameLayout14 = new FrameLayout(getContext());
                        frameLayout14.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                        n9 n9Var11 = new n9(getContext());
                        n9Var11.setRoundRadius(AndroidUtilities.dp(14.0f));
                        chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                        y8 y8Var11 = new y8();
                        y8Var11.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                        n9Var11.e(chat, y8Var11);
                        frameLayout14.addView(n9Var11, z5.c(28.0f, 28));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        frameLayout14.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout112.addView(frameLayout14, z5.t(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition11 = new LayoutTransition();
                        layoutTransition11.setDuration(100L);
                        layoutTransition11.enableTransitionType(4);
                        linearLayout112.setLayoutTransition(layoutTransition11);
                        linearLayout112.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout112, z5.t(-2, 38, 17, 0, -4, 0, 12));
                        b6.a(linearLayout112);
                        i22 = 1;
                        linearLayout112.setOnClickListener(new View.OnClickListener(this) {

                            public final g1 f332b;

                            {
                                this.f332b = this;
                            }

                            @Override
                            public final void onClick(View view113) {
                                switch (i22) {
                                    case 0:
                                        org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                        if (n2Var2 != null) {
                                            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                            l2Var.f23619a = true;
                                            n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var2 = this.f332b.f389e;
                                        i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                        i1Var2.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                }
                TextView textView1111 = new TextView(context);
                this.f387b = textView1111;
                textView1111.setText(AndroidUtilities.replaceTags(string2));
                this.f387b.setTextSize(i22, 14.0f);
                this.f387b.setGravity(i22);
                TextView textView1112 = this.f387b;
                textView1112.setLineSpacing(textView1112.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                if (i24 == 18) {
                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                } else {
                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                }
                if (i24 == i19) {
                    addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                } else {
                    addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                }
                if (i24 == 31) {
                    ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                }
                i1Var.L1();
            }
            int i38 = i1Var.N0;
            string = LocaleController.formatPluralString("ReactionReachLvlForReaction", i38, Integer.valueOf(i38));
        }
        string2 = string;
        z10 = zPremiumFeaturesBlocked;
        h1 h1Var2 = i1Var.I0;
        i10 = h1Var2.f412b;
        i11 = h1Var2.f413c;
        activatedAccountsCount = i1Var.f446s0;
        if (i24 == 3) {
            activatedAccountsCount = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).dialogFilters.size() - 1;
        } else {
            if (i24 == 7) {
                if (i24 == 0) {
                    dialogs = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getDialogs(0);
                    size = dialogs.size();
                    i13 = 0;
                    while (i12 < size) {
                        dialog = dialogs.get(i12);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                            i13++;
                        }
                    }
                    activatedAccountsCount = i13;
                }
                if (UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                    activatedAccountsCount = i11;
                    f10 = 1.0f;
                } else {
                    activatedAccountsCount = i11;
                    f10 = 1.0f;
                }
                f11 = i10 / i11;
                if (i24 == 18) {
                }
                if (z11) {
                }
                if (i24 != 11) {
                    if (i1Var.f453z0.isEmpty()) {
                        arrayList3 = i1Var.f452y0;
                    } else {
                        arrayList3 = i1Var.f453z0;
                    }
                    b9Var = new b9(context, false);
                    b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                    b9Var.setSize(AndroidUtilities.dp(72.0f));
                    b9Var.setStepFactor(0.4f);
                    iMin = Math.min(arrayList3.size(), 3);
                    b9Var.setCount(iMin);
                    while (i14 < iMin) {
                        Long l15 = (Long) arrayList3.get(i14);
                        l15.getClass();
                        b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l15), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                    }
                    b9Var.a(false);
                    addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView1113 = new TextView(context);
                    textView1113.setGravity(17);
                    rl.h(20.0f, 1, textView1113);
                    int i39 = g6.f23161j5;
                    textView1113.setTextColor(g6.v0(i39, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    textView1113.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView1113, z5.t(-1, -2, 1, 32, 0, 32, 9));
                    textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(g6.v0(i39, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i24 == 34) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i1Var.f452y0 != null) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (arrayList3.size() == 1) {
                        if (z12) {
                            i17 = R.string.InviteCallMessagePremiumBlockedOne;
                        } else if (z13) {
                            i17 = R.string.InviteMessagePremiumBlockedOne;
                        } else {
                            i17 = R.string.InvitePremiumBlockedOne;
                        }
                        string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                    } else if (arrayList3.size() == 2) {
                        if (z12) {
                            i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                        } else if (z13) {
                            i16 = R.string.InviteMessagePremiumBlockedTwo;
                        } else {
                            i16 = R.string.InvitePremiumBlockedTwo;
                        }
                        string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                    } else if (arrayList3.size() == 3) {
                        if (z12) {
                            i15 = R.string.InviteCallMessagePremiumBlockedThree;
                        } else if (z13) {
                            i15 = R.string.InviteMessagePremiumBlockedThree;
                        } else {
                            i15 = R.string.InvitePremiumBlockedThree;
                        }
                        string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                    } else {
                        if (z12) {
                            str = "InviteCallMessagePremiumBlockedMany";
                        } else if (z13) {
                            str = "InviteMessagePremiumBlockedMany";
                        } else {
                            str = "InvitePremiumBlockedMany";
                        }
                        String pluralString6 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                        int size9 = arrayList3.size() - 2;
                        int themedColor6 = i1Var.getThemedColor(g6.f23124h5);
                        b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                        b9Var.f27051c = new pz0(i0.a.k(size9, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                        Paint paint6 = new Paint(1);
                        b9Var.d = paint6;
                        paint6.setColor(themedColor6);
                        string3 = pluralString6;
                    }
                    textView.setText(AndroidUtilities.replaceTags(string3));
                    if (i1Var.f453z0 == null) {
                        size2 = 0;
                    } else {
                        size2 = i1Var.f453z0.size();
                    }
                    if (i1Var.f452y0 == null) {
                        size3 = 0;
                    } else {
                        size3 = i1Var.f452y0.size();
                    }
                    if (size2 - size3 > 0) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        i1Var.f434f0 = true;
                    } else {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        i1Var.f434f0 = true;
                    }
                    i1Var.L1();
                    return;
                }
                if (i1Var.f453z0.isEmpty()) {
                    arrayList3 = i1Var.f452y0;
                } else {
                    arrayList3 = i1Var.f453z0;
                }
                b9Var = new b9(context, false);
                b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
                b9Var.setSize(AndroidUtilities.dp(72.0f));
                b9Var.setStepFactor(0.4f);
                iMin = Math.min(arrayList3.size(), 3);
                b9Var.setCount(iMin);
                while (i14 < iMin) {
                    Long l16 = (Long) arrayList3.get(i14);
                    l16.getClass();
                    b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l16), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
                }
                b9Var.a(false);
                addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView1114 = new TextView(context);
                textView1114.setGravity(17);
                rl.h(20.0f, 1, textView1114);
                int i310 = g6.f23161j5;
                textView1114.setTextColor(g6.v0(i310, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                textView1114.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                addView(textView1114, z5.t(-1, -2, 1, 32, 0, 32, 9));
                textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(g6.v0(i310, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
                if (i24 == 34) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i1Var.f452y0 != null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (arrayList3.size() == 1) {
                    if (z12) {
                        i17 = R.string.InviteCallMessagePremiumBlockedOne;
                    } else if (z13) {
                        i17 = R.string.InviteMessagePremiumBlockedOne;
                    } else {
                        i17 = R.string.InvitePremiumBlockedOne;
                    }
                    string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
                } else if (arrayList3.size() == 2) {
                    if (z12) {
                        i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                    } else if (z13) {
                        i16 = R.string.InviteMessagePremiumBlockedTwo;
                    } else {
                        i16 = R.string.InvitePremiumBlockedTwo;
                    }
                    string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                } else if (arrayList3.size() == 3) {
                    if (z12) {
                        i15 = R.string.InviteCallMessagePremiumBlockedThree;
                    } else if (z13) {
                        i15 = R.string.InviteMessagePremiumBlockedThree;
                    } else {
                        i15 = R.string.InvitePremiumBlockedThree;
                    }
                    string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
                } else {
                    if (z12) {
                        str = "InviteCallMessagePremiumBlockedMany";
                    } else if (z13) {
                        str = "InviteMessagePremiumBlockedMany";
                    } else {
                        str = "InvitePremiumBlockedMany";
                    }
                    String pluralString7 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                    int size10 = arrayList3.size() - 2;
                    int themedColor7 = i1Var.getThemedColor(g6.f23124h5);
                    b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                    b9Var.f27051c = new pz0(i0.a.k(size10, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                    Paint paint7 = new Paint(1);
                    b9Var.d = paint7;
                    paint7.setColor(themedColor7);
                    string3 = pluralString7;
                }
                textView.setText(AndroidUtilities.replaceTags(string3));
                if (i1Var.f453z0 == null) {
                    size2 = 0;
                } else {
                    size2 = i1Var.f453z0.size();
                }
                if (i1Var.f452y0 == null) {
                    size3 = 0;
                } else {
                    size3 = i1Var.f452y0.size();
                }
                if (size2 - size3 > 0) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    i1Var.f434f0 = true;
                } else {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    i1Var.f434f0 = true;
                }
                i1Var.L1();
                return;
                if (i24 != 31) {
                    f1Var = new f1(this, context, i25, activatedAccountsCount, i11, f11, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                    i1Var.f447t0 = f1Var;
                    if (!z11) {
                        f1Var.setBagePosition(f10);
                        i1Var.f447t0.setType(i24);
                        i1Var.f447t0.f26458w.setVisibility(8);
                        if (z10) {
                            f1 f1Var8 = i1Var.f447t0;
                            f1Var8.E.setVisibility(8);
                            b0Var = f1Var8.f26450e;
                            if (b0Var != null) {
                                b0Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                            }
                            f1Var8.F = true;
                        } else {
                            if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                            }
                            i1Var.f447t0.v.setVisibility(8);
                            if (i24 == 6) {
                                i1Var.f447t0.f26458w.setText("2 GB");
                            } else {
                                i1Var.f447t0.f26458w.setText(Integer.toString(i10));
                            }
                            z14 = false;
                            i1Var.f447t0.f26458w.setVisibility(0);
                            if (i24 != 2) {
                                i1Var.f447t0.D = z14;
                            } else {
                                i1Var.f447t0.D = z14;
                            }
                            addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                    } else if (i1Var.X != null) {
                        f1 f1Var9 = i1Var.f447t0;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = i1Var.X;
                        canApplyBoost = i1Var.Y;
                        if (canApplyBoost == null) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        f1Var9.e(tL_premium_boostsStatus5, z15);
                    }
                    z14 = false;
                    if (i24 != 2) {
                        i1Var.f447t0.D = z14;
                    } else {
                        i1Var.f447t0.D = z14;
                    }
                    addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i24 == 31) {
                    FrameLayout frameLayout15 = new FrameLayout(context);
                    ImageView imageView4 = new ImageView(context);
                    imageView4.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                    i18 = 17;
                    frameLayout15.addView(imageView4, z5.e(-2, -2, 17));
                    frameLayout15.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
                    addView(frameLayout15, z5.t(79, 79, 1, 0, 23, 0, 0));
                } else {
                    i18 = 17;
                }
                TextView textView1115 = new TextView(context);
                this.f386a = textView1115;
                textView1115.setTypeface(AndroidUtilities.bold());
                if (i24 != 31) {
                    if (i24 == 32) {
                        this.f386a.setText(i1Var.r1());
                    } else {
                        i19 = 19;
                        if (i24 == 19) {
                            if (n2Var instanceof c60) {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                            } else {
                                this.f386a.setText(i1Var.r1());
                            }
                        } else if (i24 == 30) {
                            this.f386a.setText(i1Var.r1());
                        } else if (i24 == 35) {
                            this.f386a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                        } else if (i24 == 18) {
                            if (i1Var.X.level == 0) {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                            } else {
                                this.f386a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                            }
                        } else if (i24 == 21) {
                            this.f386a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                        } else if (i24 == 20) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                        } else if (i24 == 24) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                        } else if (i24 == 27) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                        } else if (i24 == 28) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                        } else if (i24 == 25) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                        } else if (i24 == 26) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                        } else if (i24 == 29) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                        } else if (i24 != 22) {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        } else {
                            this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        }
                    }
                    this.f386a.setTextSize(1, 20.0f);
                    TextView textView1116 = this.f386a;
                    i20 = g6.G6;
                    textView1116.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    this.f386a.setGravity(i18);
                    if (i24 != i19) {
                        bVar = new cg.b(context);
                        this.f388c = bVar;
                        bVar.a(i1Var.Y.boostCount, false);
                        if (i24 == 32) {
                            bVar.setVisibility(8);
                        }
                        if (i1Var.f429a0) {
                            LinearLayout linearLayout113 = new LinearLayout(context);
                            this.d = linearLayout113;
                            linearLayout113.setOrientation(0);
                            this.d.setWeightSum(1.0f);
                            this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                            this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                            View view113 = this.d;
                            if (z10) {
                                i23 = 8;
                            } else {
                                i23 = 22;
                            }
                            addView(view113, z5.t(-2, -2, 1, 12, i23, 12, 9));
                            i22 = 1;
                        } else {
                            View view114 = this.f386a;
                            if (z10) {
                                i21 = 8;
                            } else {
                                i21 = 22;
                            }
                            addView(view114, z5.t(-2, -2, 1, 0, i21, 0, 0));
                            LinearLayout linearLayout114 = new LinearLayout(getContext());
                            linearLayout114.setOrientation(0);
                            linearLayout114.setClipChildren(false);
                            FrameLayout frameLayout16 = new FrameLayout(getContext());
                            frameLayout16.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                            n9 n9Var12 = new n9(getContext());
                            n9Var12.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                            y8 y8Var12 = new y8();
                            y8Var12.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                            n9Var12.e(chat, y8Var12);
                            frameLayout16.addView(n9Var12, z5.c(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            frameLayout16.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout114.addView(frameLayout16, z5.t(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition12 = new LayoutTransition();
                            layoutTransition12.setDuration(100L);
                            layoutTransition12.enableTransitionType(4);
                            linearLayout114.setLayoutTransition(layoutTransition12);
                            linearLayout114.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout114, z5.t(-2, 38, 17, 0, -4, 0, 12));
                            b6.a(linearLayout114);
                            i22 = 1;
                            linearLayout114.setOnClickListener(new View.OnClickListener(this) {

                                public final g1 f332b;

                                {
                                    this.f332b = this;
                                }

                                @Override
                                public final void onClick(View view115) {
                                    switch (i22) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                            if (n2Var2 != null) {
                                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                l2Var.f23619a = true;
                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            i1 i1Var2 = this.f332b.f389e;
                                            i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                            i1Var2.dismiss();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        bVar = new cg.b(context);
                        this.f388c = bVar;
                        bVar.a(i1Var.Y.boostCount, false);
                        if (i24 == 32) {
                            bVar.setVisibility(8);
                        }
                        if (i1Var.f429a0) {
                            LinearLayout linearLayout115 = new LinearLayout(context);
                            this.d = linearLayout115;
                            linearLayout115.setOrientation(0);
                            this.d.setWeightSum(1.0f);
                            this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                            this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                            View view115 = this.d;
                            if (z10) {
                                i23 = 8;
                            } else {
                                i23 = 22;
                            }
                            addView(view115, z5.t(-2, -2, 1, 12, i23, 12, 9));
                            i22 = 1;
                        } else {
                            View view116 = this.f386a;
                            if (z10) {
                                i21 = 8;
                            } else {
                                i21 = 22;
                            }
                            addView(view116, z5.t(-2, -2, 1, 0, i21, 0, 0));
                            LinearLayout linearLayout116 = new LinearLayout(getContext());
                            linearLayout116.setOrientation(0);
                            linearLayout116.setClipChildren(false);
                            FrameLayout frameLayout17 = new FrameLayout(getContext());
                            frameLayout17.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                            n9 n9Var13 = new n9(getContext());
                            n9Var13.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                            y8 y8Var13 = new y8();
                            y8Var13.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                            n9Var13.e(chat, y8Var13);
                            frameLayout17.addView(n9Var13, z5.c(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                            frameLayout17.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout116.addView(frameLayout17, z5.t(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition13 = new LayoutTransition();
                            layoutTransition13.setDuration(100L);
                            layoutTransition13.enableTransitionType(4);
                            linearLayout116.setLayoutTransition(layoutTransition13);
                            linearLayout116.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout116, z5.t(-2, 38, 17, 0, -4, 0, 12));
                            b6.a(linearLayout116);
                            i22 = 1;
                            linearLayout116.setOnClickListener(new View.OnClickListener(this) {

                                public final g1 f332b;

                                {
                                    this.f332b = this;
                                }

                                @Override
                                public final void onClick(View view117) {
                                    switch (i22) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                            if (n2Var2 != null) {
                                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                                l2Var.f23619a = true;
                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            i1 i1Var2 = this.f332b.f389e;
                                            i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                            i1Var2.dismiss();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    TextView textView1117 = new TextView(context);
                    this.f387b = textView1117;
                    textView1117.setText(AndroidUtilities.replaceTags(string2));
                    this.f387b.setTextSize(i22, 14.0f);
                    this.f387b.setGravity(i22);
                    TextView textView1118 = this.f387b;
                    textView1118.setLineSpacing(textView1118.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                    if (i24 == 18) {
                        this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    } else {
                        this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    }
                    if (i24 == i19) {
                        addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (i24 == 31) {
                        ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    i1Var.L1();
                }
                this.f386a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                i19 = 19;
                this.f386a.setTextSize(1, 20.0f);
                TextView textView1119 = this.f386a;
                i20 = g6.G6;
                textView1119.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                this.f386a.setGravity(i18);
                if (i24 != i19) {
                    bVar = new cg.b(context);
                    this.f388c = bVar;
                    bVar.a(i1Var.Y.boostCount, false);
                    if (i24 == 32) {
                        bVar.setVisibility(8);
                    }
                    if (i1Var.f429a0) {
                        LinearLayout linearLayout117 = new LinearLayout(context);
                        this.d = linearLayout117;
                        linearLayout117.setOrientation(0);
                        this.d.setWeightSum(1.0f);
                        this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                        View view117 = this.d;
                        if (z10) {
                            i23 = 8;
                        } else {
                            i23 = 22;
                        }
                        addView(view117, z5.t(-2, -2, 1, 12, i23, 12, 9));
                        i22 = 1;
                    } else {
                        View view118 = this.f386a;
                        if (z10) {
                            i21 = 8;
                        } else {
                            i21 = 22;
                        }
                        addView(view118, z5.t(-2, -2, 1, 0, i21, 0, 0));
                        LinearLayout linearLayout118 = new LinearLayout(getContext());
                        linearLayout118.setOrientation(0);
                        linearLayout118.setClipChildren(false);
                        FrameLayout frameLayout18 = new FrameLayout(getContext());
                        frameLayout18.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                        n9 n9Var14 = new n9(getContext());
                        n9Var14.setRoundRadius(AndroidUtilities.dp(14.0f));
                        chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                        y8 y8Var14 = new y8();
                        y8Var14.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                        n9Var14.e(chat, y8Var14);
                        frameLayout18.addView(n9Var14, z5.c(28.0f, 28));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        frameLayout18.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout118.addView(frameLayout18, z5.t(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition14 = new LayoutTransition();
                        layoutTransition14.setDuration(100L);
                        layoutTransition14.enableTransitionType(4);
                        linearLayout118.setLayoutTransition(layoutTransition14);
                        linearLayout118.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout118, z5.t(-2, 38, 17, 0, -4, 0, 12));
                        b6.a(linearLayout118);
                        i22 = 1;
                        linearLayout118.setOnClickListener(new View.OnClickListener(this) {

                            public final g1 f332b;

                            {
                                this.f332b = this;
                            }

                            @Override
                            public final void onClick(View view119) {
                                switch (i22) {
                                    case 0:
                                        org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                        if (n2Var2 != null) {
                                            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                            l2Var.f23619a = true;
                                            n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var2 = this.f332b.f389e;
                                        i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                        i1Var2.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    bVar = new cg.b(context);
                    this.f388c = bVar;
                    bVar.a(i1Var.Y.boostCount, false);
                    if (i24 == 32) {
                        bVar.setVisibility(8);
                    }
                    if (i1Var.f429a0) {
                        LinearLayout linearLayout119 = new LinearLayout(context);
                        this.d = linearLayout119;
                        linearLayout119.setOrientation(0);
                        this.d.setWeightSum(1.0f);
                        this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                        View view119 = this.d;
                        if (z10) {
                            i23 = 8;
                        } else {
                            i23 = 22;
                        }
                        addView(view119, z5.t(-2, -2, 1, 12, i23, 12, 9));
                        i22 = 1;
                    } else {
                        View view1110 = this.f386a;
                        if (z10) {
                            i21 = 8;
                        } else {
                            i21 = 22;
                        }
                        addView(view1110, z5.t(-2, -2, 1, 0, i21, 0, 0));
                        LinearLayout linearLayout1110 = new LinearLayout(getContext());
                        linearLayout1110.setOrientation(0);
                        linearLayout1110.setClipChildren(false);
                        FrameLayout frameLayout19 = new FrameLayout(getContext());
                        frameLayout19.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                        n9 n9Var15 = new n9(getContext());
                        n9Var15.setRoundRadius(AndroidUtilities.dp(14.0f));
                        chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                        y8 y8Var15 = new y8();
                        y8Var15.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                        n9Var15.e(chat, y8Var15);
                        frameLayout19.addView(n9Var15, z5.c(28.0f, 28));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                        frameLayout19.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout1110.addView(frameLayout19, z5.t(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition15 = new LayoutTransition();
                        layoutTransition15.setDuration(100L);
                        layoutTransition15.enableTransitionType(4);
                        linearLayout1110.setLayoutTransition(layoutTransition15);
                        linearLayout1110.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout1110, z5.t(-2, 38, 17, 0, -4, 0, 12));
                        b6.a(linearLayout1110);
                        i22 = 1;
                        linearLayout1110.setOnClickListener(new View.OnClickListener(this) {

                            public final g1 f332b;

                            {
                                this.f332b = this;
                            }

                            @Override
                            public final void onClick(View view1111) {
                                switch (i22) {
                                    case 0:
                                        org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                        if (n2Var2 != null) {
                                            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                            l2Var.f23619a = true;
                                            n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        i1 i1Var2 = this.f332b.f389e;
                                        i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                        i1Var2.dismiss();
                                        break;
                                }
                            }
                        });
                    }
                }
                TextView textView11110 = new TextView(context);
                this.f387b = textView11110;
                textView11110.setText(AndroidUtilities.replaceTags(string2));
                this.f387b.setTextSize(i22, 14.0f);
                this.f387b.setGravity(i22);
                TextView textView11111 = this.f387b;
                textView11111.setLineSpacing(textView11111.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
                if (i24 == 18) {
                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                } else {
                    this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                }
                if (i24 == i19) {
                    addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                } else {
                    addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                }
                if (i24 == 31) {
                    ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                    ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                }
                i1Var.L1();
            }
            activatedAccountsCount = UserConfig.getActivatedAccountsCount();
        }
        if (UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
            activatedAccountsCount = i11;
            f10 = 1.0f;
        } else {
            activatedAccountsCount = i11;
            f10 = 1.0f;
        }
        f11 = i10 / i11;
        if (i24 == 18) {
        }
        if (z11) {
        }
        if (i24 != 11) {
            if (i1Var.f453z0.isEmpty()) {
                arrayList3 = i1Var.f452y0;
            } else {
                arrayList3 = i1Var.f453z0;
            }
            b9Var = new b9(context, false);
            b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
            b9Var.setSize(AndroidUtilities.dp(72.0f));
            b9Var.setStepFactor(0.4f);
            iMin = Math.min(arrayList3.size(), 3);
            b9Var.setCount(iMin);
            while (i14 < iMin) {
                Long l17 = (Long) arrayList3.get(i14);
                l17.getClass();
                b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l17), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
            }
            b9Var.a(false);
            addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
            TextView textView11112 = new TextView(context);
            textView11112.setGravity(17);
            rl.h(20.0f, 1, textView11112);
            int i311 = g6.f23161j5;
            textView11112.setTextColor(g6.v0(i311, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
            textView11112.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
            addView(textView11112, z5.t(-1, -2, 1, 32, 0, 32, 9));
            textView = new TextView(context);
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(g6.v0(i311, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
            addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
            if (i24 == 34) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i1Var.f452y0 != null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (arrayList3.size() == 1) {
                if (z12) {
                    i17 = R.string.InviteCallMessagePremiumBlockedOne;
                } else if (z13) {
                    i17 = R.string.InviteMessagePremiumBlockedOne;
                } else {
                    i17 = R.string.InvitePremiumBlockedOne;
                }
                string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
            } else if (arrayList3.size() == 2) {
                if (z12) {
                    i16 = R.string.InviteCallMessagePremiumBlockedTwo;
                } else if (z13) {
                    i16 = R.string.InviteMessagePremiumBlockedTwo;
                } else {
                    i16 = R.string.InvitePremiumBlockedTwo;
                }
                string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
            } else if (arrayList3.size() == 3) {
                if (z12) {
                    i15 = R.string.InviteCallMessagePremiumBlockedThree;
                } else if (z13) {
                    i15 = R.string.InviteMessagePremiumBlockedThree;
                } else {
                    i15 = R.string.InvitePremiumBlockedThree;
                }
                string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
            } else {
                if (z12) {
                    str = "InviteCallMessagePremiumBlockedMany";
                } else if (z13) {
                    str = "InviteMessagePremiumBlockedMany";
                } else {
                    str = "InvitePremiumBlockedMany";
                }
                String pluralString8 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
                int size11 = arrayList3.size() - 2;
                int themedColor8 = i1Var.getThemedColor(g6.f23124h5);
                b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
                b9Var.f27051c = new pz0(i0.a.k(size11, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                Paint paint8 = new Paint(1);
                b9Var.d = paint8;
                paint8.setColor(themedColor8);
                string3 = pluralString8;
            }
            textView.setText(AndroidUtilities.replaceTags(string3));
            if (i1Var.f453z0 == null) {
                size2 = 0;
            } else {
                size2 = i1Var.f453z0.size();
            }
            if (i1Var.f452y0 == null) {
                size3 = 0;
            } else {
                size3 = i1Var.f452y0.size();
            }
            if (size2 - size3 > 0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                i1Var.f434f0 = true;
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                i1Var.f434f0 = true;
            }
            i1Var.L1();
            return;
        }
        if (i1Var.f453z0.isEmpty()) {
            arrayList3 = i1Var.f452y0;
        } else {
            arrayList3 = i1Var.f453z0;
        }
        b9Var = new b9(context, false);
        b9Var.f27049a.f26676q = AndroidUtilities.dp(3.33f);
        b9Var.setSize(AndroidUtilities.dp(72.0f));
        b9Var.setStepFactor(0.4f);
        iMin = Math.min(arrayList3.size(), 3);
        b9Var.setCount(iMin);
        while (i14 < iMin) {
            Long l18 = (Long) arrayList3.get(i14);
            l18.getClass();
            b9Var.b(i14, MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser(l18), ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount);
        }
        b9Var.a(false);
        addView(b9Var, z5.t(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        TextView textView11113 = new TextView(context);
        textView11113.setGravity(17);
        rl.h(20.0f, 1, textView11113);
        int i312 = g6.f23161j5;
        textView11113.setTextColor(g6.v0(i312, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
        textView11113.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
        addView(textView11113, z5.t(-1, -2, 1, 32, 0, 32, 9));
        textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(g6.v0(i312, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
        addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 19));
        if (i24 == 34) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i1Var.f452y0 != null) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (arrayList3.size() == 1) {
            if (z12) {
                i17 = R.string.InviteCallMessagePremiumBlockedOne;
            } else if (z13) {
                i17 = R.string.InviteMessagePremiumBlockedOne;
            } else {
                i17 = R.string.InvitePremiumBlockedOne;
            }
            string3 = LocaleController.formatString(i17, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))));
        } else if (arrayList3.size() == 2) {
            if (z12) {
                i16 = R.string.InviteCallMessagePremiumBlockedTwo;
            } else if (z13) {
                i16 = R.string.InviteMessagePremiumBlockedTwo;
            } else {
                i16 = R.string.InvitePremiumBlockedTwo;
            }
            string3 = LocaleController.formatString(i16, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
        } else if (arrayList3.size() == 3) {
            if (z12) {
                i15 = R.string.InviteCallMessagePremiumBlockedThree;
            } else if (z13) {
                i15 = R.string.InviteMessagePremiumBlockedThree;
            } else {
                i15 = R.string.InvitePremiumBlockedThree;
            }
            string3 = LocaleController.formatString(i15, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(2))));
        } else {
            if (z12) {
                str = "InviteCallMessagePremiumBlockedMany";
            } else if (z13) {
                str = "InviteMessagePremiumBlockedMany";
            } else {
                str = "InvitePremiumBlockedMany";
            }
            String pluralString9 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getUser((Long) arrayList3.get(1))));
            int size12 = arrayList3.size() - 2;
            int themedColor9 = i1Var.getThemedColor(g6.f23124h5);
            b9Var.f27050b = new i2(g6.Lj, g6.Mj, -1, -1, null);
            b9Var.f27051c = new pz0(i0.a.k(size12, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            Paint paint9 = new Paint(1);
            b9Var.d = paint9;
            paint9.setColor(themedColor9);
            string3 = pluralString9;
        }
        textView.setText(AndroidUtilities.replaceTags(string3));
        if (i1Var.f453z0 == null) {
            size2 = 0;
        } else {
            size2 = i1Var.f453z0.size();
        }
        if (i1Var.f452y0 == null) {
            size3 = 0;
        } else {
            size3 = i1Var.f452y0.size();
        }
        if (size2 - size3 > 0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            i1Var.f434f0 = true;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            i1Var.f434f0 = true;
        }
        i1Var.L1();
        return;
        if (i24 != 31) {
            f1Var = new f1(this, context, i25, activatedAccountsCount, i11, f11, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
            i1Var.f447t0 = f1Var;
            if (!z11) {
                f1Var.setBagePosition(f10);
                i1Var.f447t0.setType(i24);
                i1Var.f447t0.f26458w.setVisibility(8);
                if (z10) {
                    f1 f1Var10 = i1Var.f447t0;
                    f1Var10.E.setVisibility(8);
                    b0Var = f1Var10.f26450e;
                    if (b0Var != null) {
                        b0Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                    }
                    f1Var10.F = true;
                } else {
                    if (!UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).isPremium()) {
                    }
                    i1Var.f447t0.v.setVisibility(8);
                    if (i24 == 6) {
                        i1Var.f447t0.f26458w.setText("2 GB");
                    } else {
                        i1Var.f447t0.f26458w.setText(Integer.toString(i10));
                    }
                    z14 = false;
                    i1Var.f447t0.f26458w.setVisibility(0);
                    if (i24 != 2) {
                        i1Var.f447t0.D = z14;
                    } else {
                        i1Var.f447t0.D = z14;
                    }
                    addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
            } else if (i1Var.X != null) {
                f1 f1Var11 = i1Var.f447t0;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = i1Var.X;
                canApplyBoost = i1Var.Y;
                if (canApplyBoost == null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                f1Var11.e(tL_premium_boostsStatus6, z15);
            }
            z14 = false;
            if (i24 != 2) {
                i1Var.f447t0.D = z14;
            } else {
                i1Var.f447t0.D = z14;
            }
            addView(i1Var.f447t0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
        }
        if (i24 == 31) {
            FrameLayout frameLayout110 = new FrameLayout(context);
            ImageView imageView5 = new ImageView(context);
            imageView5.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
            i18 = 17;
            frameLayout110.addView(imageView5, z5.e(-2, -2, 17));
            frameLayout110.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
            addView(frameLayout110, z5.t(79, 79, 1, 0, 23, 0, 0));
        } else {
            i18 = 17;
        }
        TextView textView11114 = new TextView(context);
        this.f386a = textView11114;
        textView11114.setTypeface(AndroidUtilities.bold());
        if (i24 != 31) {
            if (i24 == 32) {
                this.f386a.setText(i1Var.r1());
            } else {
                i19 = 19;
                if (i24 == 19) {
                    if (n2Var instanceof c60) {
                        this.f386a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                    } else {
                        this.f386a.setText(i1Var.r1());
                    }
                } else if (i24 == 30) {
                    this.f386a.setText(i1Var.r1());
                } else if (i24 == 35) {
                    this.f386a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                } else if (i24 == 18) {
                    if (i1Var.X.level == 0) {
                        this.f386a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                    } else {
                        this.f386a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                    }
                } else if (i24 == 21) {
                    this.f386a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                } else if (i24 == 20) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                } else if (i24 == 24) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                } else if (i24 == 27) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                } else if (i24 == 28) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                } else if (i24 == 25) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                } else if (i24 == 26) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                } else if (i24 == 29) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                } else if (i24 != 22) {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                } else {
                    this.f386a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                }
            }
            this.f386a.setTextSize(1, 20.0f);
            TextView textView11115 = this.f386a;
            i20 = g6.G6;
            textView11115.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
            this.f386a.setGravity(i18);
            if (i24 != i19) {
                bVar = new cg.b(context);
                this.f388c = bVar;
                bVar.a(i1Var.Y.boostCount, false);
                if (i24 == 32) {
                    bVar.setVisibility(8);
                }
                if (i1Var.f429a0) {
                    LinearLayout linearLayout1111 = new LinearLayout(context);
                    this.d = linearLayout1111;
                    linearLayout1111.setOrientation(0);
                    this.d.setWeightSum(1.0f);
                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                    View view1111 = this.d;
                    if (z10) {
                        i23 = 8;
                    } else {
                        i23 = 22;
                    }
                    addView(view1111, z5.t(-2, -2, 1, 12, i23, 12, 9));
                    i22 = 1;
                } else {
                    View view1112 = this.f386a;
                    if (z10) {
                        i21 = 8;
                    } else {
                        i21 = 22;
                    }
                    addView(view1112, z5.t(-2, -2, 1, 0, i21, 0, 0));
                    LinearLayout linearLayout1112 = new LinearLayout(getContext());
                    linearLayout1112.setOrientation(0);
                    linearLayout1112.setClipChildren(false);
                    FrameLayout frameLayout111 = new FrameLayout(getContext());
                    frameLayout111.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                    n9 n9Var16 = new n9(getContext());
                    n9Var16.setRoundRadius(AndroidUtilities.dp(14.0f));
                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                    y8 y8Var16 = new y8();
                    y8Var16.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                    n9Var16.e(chat, y8Var16);
                    frameLayout111.addView(n9Var16, z5.c(28.0f, 28));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    frameLayout111.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout1112.addView(frameLayout111, z5.t(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition16 = new LayoutTransition();
                    layoutTransition16.setDuration(100L);
                    layoutTransition16.enableTransitionType(4);
                    linearLayout1112.setLayoutTransition(layoutTransition16);
                    linearLayout1112.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout1112, z5.t(-2, 38, 17, 0, -4, 0, 12));
                    b6.a(linearLayout1112);
                    i22 = 1;
                    linearLayout1112.setOnClickListener(new View.OnClickListener(this) {

                        public final g1 f332b;

                        {
                            this.f332b = this;
                        }

                        @Override
                        public final void onClick(View view1113) {
                            switch (i22) {
                                case 0:
                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                    if (n2Var2 != null) {
                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                        l2Var.f23619a = true;
                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                        break;
                                    }
                                    break;
                                default:
                                    i1 i1Var2 = this.f332b.f389e;
                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                    i1Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
            } else {
                bVar = new cg.b(context);
                this.f388c = bVar;
                bVar.a(i1Var.Y.boostCount, false);
                if (i24 == 32) {
                    bVar.setVisibility(8);
                }
                if (i1Var.f429a0) {
                    LinearLayout linearLayout1113 = new LinearLayout(context);
                    this.d = linearLayout1113;
                    linearLayout1113.setOrientation(0);
                    this.d.setWeightSum(1.0f);
                    this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                    this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                    View view1113 = this.d;
                    if (z10) {
                        i23 = 8;
                    } else {
                        i23 = 22;
                    }
                    addView(view1113, z5.t(-2, -2, 1, 12, i23, 12, 9));
                    i22 = 1;
                } else {
                    View view1114 = this.f386a;
                    if (z10) {
                        i21 = 8;
                    } else {
                        i21 = 22;
                    }
                    addView(view1114, z5.t(-2, -2, 1, 0, i21, 0, 0));
                    LinearLayout linearLayout1114 = new LinearLayout(getContext());
                    linearLayout1114.setOrientation(0);
                    linearLayout1114.setClipChildren(false);
                    FrameLayout frameLayout112 = new FrameLayout(getContext());
                    frameLayout112.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                    n9 n9Var17 = new n9(getContext());
                    n9Var17.setRoundRadius(AndroidUtilities.dp(14.0f));
                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                    y8 y8Var17 = new y8();
                    y8Var17.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                    n9Var17.e(chat, y8Var17);
                    frameLayout112.addView(n9Var17, z5.c(28.0f, 28));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    frameLayout112.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout1114.addView(frameLayout112, z5.t(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition17 = new LayoutTransition();
                    layoutTransition17.setDuration(100L);
                    layoutTransition17.enableTransitionType(4);
                    linearLayout1114.setLayoutTransition(layoutTransition17);
                    linearLayout1114.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout1114, z5.t(-2, 38, 17, 0, -4, 0, 12));
                    b6.a(linearLayout1114);
                    i22 = 1;
                    linearLayout1114.setOnClickListener(new View.OnClickListener(this) {

                        public final g1 f332b;

                        {
                            this.f332b = this;
                        }

                        @Override
                        public final void onClick(View view1115) {
                            switch (i22) {
                                case 0:
                                    org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                    if (n2Var2 != null) {
                                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                        l2Var.f23619a = true;
                                        n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                        break;
                                    }
                                    break;
                                default:
                                    i1 i1Var2 = this.f332b.f389e;
                                    i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                    i1Var2.dismiss();
                                    break;
                            }
                        }
                    });
                }
            }
            TextView textView11116 = new TextView(context);
            this.f387b = textView11116;
            textView11116.setText(AndroidUtilities.replaceTags(string2));
            this.f387b.setTextSize(i22, 14.0f);
            this.f387b.setGravity(i22);
            TextView textView11117 = this.f387b;
            textView11117.setLineSpacing(textView11117.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
            if (i24 == 18) {
                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
            } else {
                this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
            }
            if (i24 == i19) {
                addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
            } else {
                addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
            }
            if (i24 == 31) {
                ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
            }
            i1Var.L1();
        }
        this.f386a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
        i19 = 19;
        this.f386a.setTextSize(1, 20.0f);
        TextView textView11118 = this.f386a;
        i20 = g6.G6;
        textView11118.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
        this.f386a.setGravity(i18);
        if (i24 != i19) {
            bVar = new cg.b(context);
            this.f388c = bVar;
            bVar.a(i1Var.Y.boostCount, false);
            if (i24 == 32) {
                bVar.setVisibility(8);
            }
            if (i1Var.f429a0) {
                LinearLayout linearLayout1115 = new LinearLayout(context);
                this.d = linearLayout1115;
                linearLayout1115.setOrientation(0);
                this.d.setWeightSum(1.0f);
                this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                View view1115 = this.d;
                if (z10) {
                    i23 = 8;
                } else {
                    i23 = 22;
                }
                addView(view1115, z5.t(-2, -2, 1, 12, i23, 12, 9));
                i22 = 1;
            } else {
                View view1116 = this.f386a;
                if (z10) {
                    i21 = 8;
                } else {
                    i21 = 22;
                }
                addView(view1116, z5.t(-2, -2, 1, 0, i21, 0, 0));
                LinearLayout linearLayout1116 = new LinearLayout(getContext());
                linearLayout1116.setOrientation(0);
                linearLayout1116.setClipChildren(false);
                FrameLayout frameLayout113 = new FrameLayout(getContext());
                frameLayout113.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                n9 n9Var18 = new n9(getContext());
                n9Var18.setRoundRadius(AndroidUtilities.dp(14.0f));
                chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                y8 y8Var18 = new y8();
                y8Var18.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                n9Var18.e(chat, y8Var18);
                frameLayout113.addView(n9Var18, z5.c(28.0f, 28));
                textView2 = new TextView(getContext());
                if (chat != null) {
                    textView2.setText(chat.title);
                }
                textView2.setSingleLine(true);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                frameLayout113.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                linearLayout1116.addView(frameLayout113, z5.t(-2, 28, 80, 18, 0, 18, 0));
                LayoutTransition layoutTransition18 = new LayoutTransition();
                layoutTransition18.setDuration(100L);
                layoutTransition18.enableTransitionType(4);
                linearLayout1116.setLayoutTransition(layoutTransition18);
                linearLayout1116.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                addView(linearLayout1116, z5.t(-2, 38, 17, 0, -4, 0, 12));
                b6.a(linearLayout1116);
                i22 = 1;
                linearLayout1116.setOnClickListener(new View.OnClickListener(this) {

                    public final g1 f332b;

                    {
                        this.f332b = this;
                    }

                    @Override
                    public final void onClick(View view1117) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                if (n2Var2 != null) {
                                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                    l2Var.f23619a = true;
                                    n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                    break;
                                }
                                break;
                            default:
                                i1 i1Var2 = this.f332b.f389e;
                                i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                i1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
        } else {
            bVar = new cg.b(context);
            this.f388c = bVar;
            bVar.a(i1Var.Y.boostCount, false);
            if (i24 == 32) {
                bVar.setVisibility(8);
            }
            if (i1Var.f429a0) {
                LinearLayout linearLayout1117 = new LinearLayout(context);
                this.d = linearLayout1117;
                linearLayout1117.setOrientation(0);
                this.d.setWeightSum(1.0f);
                this.d.addView(this.f386a, z5.o(-2, -2, 1.0f, 0));
                this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                View view1117 = this.d;
                if (z10) {
                    i23 = 8;
                } else {
                    i23 = 22;
                }
                addView(view1117, z5.t(-2, -2, 1, 12, i23, 12, 9));
                i22 = 1;
            } else {
                View view1118 = this.f386a;
                if (z10) {
                    i21 = 8;
                } else {
                    i21 = 22;
                }
                addView(view1118, z5.t(-2, -2, 1, 0, i21, 0, 0));
                LinearLayout linearLayout1118 = new LinearLayout(getContext());
                linearLayout1118.setOrientation(0);
                linearLayout1118.setClipChildren(false);
                FrameLayout frameLayout114 = new FrameLayout(getContext());
                frameLayout114.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider)));
                n9 n9Var19 = new n9(getContext());
                n9Var19.setRoundRadius(AndroidUtilities.dp(14.0f));
                chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount).getChat(Long.valueOf(-i1Var.W));
                y8 y8Var19 = new y8();
                y8Var19.k(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, chat);
                n9Var19.e(chat, y8Var19);
                frameLayout114.addView(n9Var19, z5.c(28.0f, 28));
                textView2 = new TextView(getContext());
                if (chat != null) {
                    textView2.setText(chat.title);
                }
                textView2.setSingleLine(true);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                frameLayout114.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                linearLayout1118.addView(frameLayout114, z5.t(-2, 28, 80, 18, 0, 18, 0));
                LayoutTransition layoutTransition19 = new LayoutTransition();
                layoutTransition19.setDuration(100L);
                layoutTransition19.enableTransitionType(4);
                linearLayout1118.setLayoutTransition(layoutTransition19);
                linearLayout1118.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                addView(linearLayout1118, z5.t(-2, 38, 17, 0, -4, 0, 12));
                b6.a(linearLayout1118);
                i22 = 1;
                linearLayout1118.setOnClickListener(new View.OnClickListener(this) {

                    public final g1 f332b;

                    {
                        this.f332b = this;
                    }

                    @Override
                    public final void onClick(View view1119) {
                        switch (i22) {
                            case 0:
                                org.telegram.ui.ActionBar.n2 n2Var2 = this.f332b.f389e.G0;
                                if (n2Var2 != null) {
                                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                    l2Var.f23619a = true;
                                    n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                    break;
                                }
                                break;
                            default:
                                i1 i1Var2 = this.f332b.f389e;
                                i1Var2.f31855n.presentFragment(rn.R9(i1Var2.W));
                                i1Var2.dismiss();
                                break;
                        }
                    }
                });
            }
        }
        TextView textView11119 = new TextView(context);
        this.f387b = textView11119;
        textView11119.setText(AndroidUtilities.replaceTags(string2));
        this.f387b.setTextSize(i22, 14.0f);
        this.f387b.setGravity(i22);
        TextView textView111110 = this.f387b;
        textView111110.setLineSpacing(textView111110.getLineSpacingExtra(), this.f387b.getLineSpacingMultiplier() * 1.1f);
        if (i24 == 18) {
            this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
        } else {
            this.f387b.setTextColor(g6.v0(i20, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
        }
        if (i24 == i19) {
            addView(this.f387b, z5.t(-2, -2, 1, 24, -2, 24, 17));
        } else {
            addView(this.f387b, z5.t(-2, -2, 1, 24, 0, 24, 24));
        }
        if (i24 == 31) {
            ((ViewGroup.MarginLayoutParams) this.f387b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
            ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
            ((ViewGroup.MarginLayoutParams) this.f386a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        }
        i1Var.L1();
    }
}
