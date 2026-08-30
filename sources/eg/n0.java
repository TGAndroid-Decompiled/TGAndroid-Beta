package eg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.yh;
public final class n0 extends rl0 {
    public final v0 f5367c;

    public n0(v0 v0Var) {
        this.f5367c = v0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        v0 v0Var = this.f5367c;
        int i10 = v0Var.f5538e0;
        if ((i10 != 11 && i10 != 34) || v0Var.V) {
            int i11 = l1Var.f5788f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f5367c.f5541h0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        v0 v0Var = this.f5367c;
        if (v0Var.f5542i0 == i10) {
            return 0;
        }
        if (v0Var.f5543j0 == i10) {
            return 2;
        }
        if (v0Var.f5544k0 == i10) {
            return 3;
        }
        if (v0Var.f5546n0 == i10) {
            return 5;
        }
        if (v0Var.f5547o0 == i10) {
            return 6;
        }
        if (v0Var.W == i10) {
            return 7;
        }
        if (v0Var.f5548p0 == i10) {
            return 8;
        }
        ArrayList arrayList = v0Var.f5550r0;
        if (arrayList != null && i10 >= (i11 = v0Var.f5549q0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = v0Var.f5538e0;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        boolean z4;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i11;
        String formatUserStatus;
        v0 v0Var = this.f5367c;
        int i12 = v0Var.f5538e0;
        HashSet hashSet = v0Var.f5554v0;
        int i13 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z10 = false;
        boolean z11 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        g4 g4Var = (g4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) v0Var.f5555w0.get(i10 - v0Var.f5545l0);
                            String str2 = (String) v0Var.f5556x0.get(i10 - v0Var.f5545l0);
                            String str3 = chat.title;
                            if (i10 == v0Var.m0 - 1.0f) {
                                z11 = false;
                            }
                            g4Var.e(chat, str3, str2, z11);
                            g4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) v0Var.f5557y0.get(i10 - v0Var.f5545l0);
                            ArrayList arrayList = v0Var.f5558z0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f19331id))) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            g4Var.O = true;
                            g4Var.N = requirementtocontactpremium;
                            g4Var.g();
                            if (!z4) {
                                i11 = ((g3) v0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == v0Var.m0 - 1.0f) {
                                z11 = false;
                            }
                            g4Var.e(user, formatName, formatUserStatus, z11);
                            g4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                m4 m4Var = (m4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (v0Var.V) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (v0Var.f5557y0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - v0Var.f5549q0;
            ArrayList arrayList2 = v0Var.f5550r0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                q0 q0Var = (q0) view;
                p0 p0Var = (p0) v0Var.f5550r0.get(i14);
                dg.s1 s1Var = q0Var.f5452c;
                ImageView imageView = q0Var.f5450a;
                k5 k5Var = q0Var.f5451b;
                if (p0Var instanceof o0) {
                    q0Var.f5453f = (o0) p0Var;
                    q0Var.e = null;
                    imageView.setVisibility(8);
                    k5Var.setVisibility(8);
                    s1Var.setVisibility(0);
                    k5 k5Var2 = q0Var.d;
                    o0 o0Var = q0Var.f5453f;
                    if (o0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    k5Var2.l(LocaleController.formatPluralString(str, o0Var.f5390g, new Object[0]), false);
                    return;
                } else if (p0Var != null) {
                    q0Var.f5453f = null;
                    q0Var.e = p0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(q0Var.e.f5421a);
                    k5Var.setVisibility(0);
                    p0 p0Var2 = q0Var.e;
                    String str4 = "";
                    if (p0Var2.d != null) {
                        String string = LocaleController.getString(q0Var.e.d + "_" + LocaleController.getStringParamForNumber(q0Var.e.e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(q0Var.e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(android.support.v4.media.a.m(q0Var.e.e, "", new StringBuilder()));
                            spannableString.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        k5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(p0Var2.f5422b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (q0Var.e.f5423c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(q0Var.e.f5423c);
                                spannableString2.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            k5Var.l(spannableStringBuilder2, false);
                        } else {
                            k5Var.l(str4, false);
                        }
                    }
                    s1Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) v0Var.f5539f0.get(i10 - v0Var.f5545l0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z10 = true;
        }
        nVar.f21413r.a(contains, z10);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i16;
        int i17;
        int i18;
        f6 f6Var8;
        f6 f6Var9;
        u0 u0Var;
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        v0 v0Var = this.f5367c;
        switch (i10) {
            case 1:
                u0Var = new org.telegram.ui.Cells.n(context, new m0(this), true, 9);
                break;
            case 2:
                int i19 = j6.f19852a7;
                f6Var = ((g3) v0Var).resourcesProvider;
                u0Var = new z6(context, j6.v0(i19, f6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                u0Var = m4Var;
                break;
            case 4:
                f6Var2 = ((g3) v0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, f6Var2, false, false);
                i11 = ((g3) v0Var).backgroundPaddingLeft;
                i12 = ((g3) v0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                u0Var = g4Var;
                break;
            case 5:
                t00 t00Var = new t00(context, null);
                if (v0Var.f5538e0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                t00Var.setViewType(i13);
                t00Var.setIsSingleCell(true);
                t00Var.setIgnoreHeightCheck(true);
                t00Var.setItemsCount(10);
                u0Var = t00Var;
                break;
            case 6:
                u0Var = new hn(v0Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                i14 = ((g3) v0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((g3) v0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (v0Var.N0 == null && ChatObject.hasAdminRights(v0Var.s1())) {
                    v0Var.N0 = new ef.e(this, 1);
                }
                int dp2 = AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                if (v0Var.N0 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(dp2, dp3, AndroidUtilities.dp(f10), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = j6.f19924e7;
                f6Var3 = ((g3) v0Var).resourcesProvider;
                int v02 = j6.v0(i20, f6Var3);
                int i21 = j6.f19996i6;
                f6Var4 = ((g3) v0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i21, f6Var4), 76);
                textView.setBackground(j6.i0(dp4, dp4, dp4, dp4, v02, k10, k10));
                int i22 = j6.G6;
                f6Var5 = ((g3) v0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i22, f6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final n0 f5333b;

                    {
                        this.f5333b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                v0 v0Var2 = this.f5333b.f5367c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.f28678n;
                                long j10 = v0Var2.X;
                                f6Var13 = ((g3) v0Var2).resourcesProvider;
                                gg.x.m(p2Var, f6Var13, j10, null);
                                return;
                            case 1:
                                v0 v0Var3 = this.f5333b.f5367c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f5333b.f5367c.p1());
                                return;
                            default:
                                v0 v0Var4 = this.f5333b.f5367c;
                                v0Var4.N0.run();
                                v0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (v0Var.N0 != null) {
                    ImageView imageView = new ImageView(v0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = j6.f20012j5;
                    f6Var6 = ((g3) v0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((g3) v0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i21, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout.addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final n0 f5333b;

                        {
                            this.f5333b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = this.f5333b.f5367c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.f28678n;
                                    long j10 = v0Var2.X;
                                    f6Var13 = ((g3) v0Var2).resourcesProvider;
                                    gg.x.m(p2Var, f6Var13, j10, null);
                                    return;
                                case 1:
                                    v0 v0Var3 = this.f5333b.f5367c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f5333b.f5367c.p1());
                                    return;
                                default:
                                    v0 v0Var4 = this.f5333b.f5367c;
                                    v0Var4.N0.run();
                                    v0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(v0Var.p1());
                textView.setGravity(17);
                u0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i16 = ((g3) v0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((g3) v0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                l90 l90Var = new l90(context);
                e90 e90Var = new e90(context, null);
                if (v0Var.x1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new l0(this, 0), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = v0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = j6.f19966gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                mq mqVar = new mq(0, mutate);
                mqVar.setColorKey(i24);
                mqVar.setSize(AndroidUtilities.dp(18.0f));
                mqVar.setWidth(AndroidUtilities.dp(11.0f));
                mqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(mqVar, 0, spannableString.length(), 33);
                e90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                e90Var.setTextSize(1, 14.0f);
                e90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((g3) v0Var).resourcesProvider;
                if (f6Var8 instanceof nh.b) {
                    int i25 = j6.f20281y6;
                    f6Var11 = ((g3) v0Var).resourcesProvider;
                    e90Var.setTextColor(j6.v0(i25, f6Var11));
                } else {
                    int i26 = j6.G6;
                    f6Var9 = ((g3) v0Var).resourcesProvider;
                    e90Var.setTextColor(j6.v0(i26, f6Var9));
                }
                e90Var.setGravity(1);
                e90Var.setOnClickListener(new View.OnClickListener(this) {
                    public final n0 f5333b;

                    {
                        this.f5333b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                v0 v0Var2 = this.f5333b.f5367c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.f28678n;
                                long j10 = v0Var2.X;
                                f6Var13 = ((g3) v0Var2).resourcesProvider;
                                gg.x.m(p2Var, f6Var13, j10, null);
                                return;
                            case 1:
                                v0 v0Var3 = this.f5333b.f5367c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f5333b.f5367c.p1());
                                return;
                            default:
                                v0 v0Var4 = this.f5333b.f5367c;
                                v0Var4.N0.run();
                                v0Var4.dismiss();
                                return;
                        }
                    }
                });
                l90Var.setOnClickListener(new androidx.mediarouter.app.c(e90Var, 5));
                if (v0Var.y1()) {
                    f6Var10 = ((g3) v0Var).resourcesProvider;
                    ph.d dVar = new ph.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final n0 f5333b;

                        {
                            this.f5333b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = this.f5333b.f5367c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.f28678n;
                                    long j10 = v0Var2.X;
                                    f6Var13 = ((g3) v0Var2).resourcesProvider;
                                    gg.x.m(p2Var, f6Var13, j10, null);
                                    return;
                                case 1:
                                    v0 v0Var3 = this.f5333b.f5367c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f5333b.f5367c.p1());
                                    return;
                                default:
                                    v0 v0Var4 = this.f5333b.f5367c;
                                    v0Var4.N0.run();
                                    v0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(v0Var.D0, b6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, b6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(v0Var.C0, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(l90Var, b6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(e90Var, b6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                u0Var = linearLayout;
                break;
            case 9:
                f6Var12 = ((g3) v0Var).resourcesProvider;
                u0Var = new q0(v0Var, context, f6Var12);
                break;
            default:
                u0 u0Var2 = new u0(v0Var, context);
                v0Var.f5534a0 = u0Var2;
                u0Var = u0Var2;
                break;
        }
        return yh.o(u0Var, u0Var, -1, -2);
    }
}
