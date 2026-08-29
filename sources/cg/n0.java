package cg;

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
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;
public final class n0 extends il0 {
    public final v0 f3224c;

    public n0(v0 v0Var) {
        this.f3224c = v0Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        v0 v0Var = this.f3224c;
        int i10 = v0Var.f3404d0;
        if ((i10 != 11 && i10 != 34) || v0Var.U) {
            int i11 = n1Var.f6436f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f3224c.f3407g0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        v0 v0Var = this.f3224c;
        if (v0Var.f3408h0 == i10) {
            return 0;
        }
        if (v0Var.f3409i0 == i10) {
            return 2;
        }
        if (v0Var.f3410j0 == i10) {
            return 3;
        }
        if (v0Var.m0 == i10) {
            return 5;
        }
        if (v0Var.f3413n0 == i10) {
            return 6;
        }
        if (v0Var.V == i10) {
            return 7;
        }
        if (v0Var.f3414o0 == i10) {
            return 8;
        }
        ArrayList arrayList = v0Var.f3416q0;
        if (arrayList != null && i10 >= (i11 = v0Var.f3415p0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = v0Var.f3404d0;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i11;
        String formatUserStatus;
        v0 v0Var = this.f3224c;
        int i12 = v0Var.f3404d0;
        HashSet hashSet = v0Var.f3420u0;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        e4 e4Var = (e4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) v0Var.f3421v0.get(i10 - v0Var.f3411k0);
                            String str2 = (String) v0Var.f3422w0.get(i10 - v0Var.f3411k0);
                            String str3 = chat.title;
                            if (i10 == v0Var.f3412l0 - 1.0f) {
                                z12 = false;
                            }
                            e4Var.e(chat, str3, str2, z12);
                            e4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) v0Var.f3423x0.get(i10 - v0Var.f3411k0);
                            ArrayList arrayList = v0Var.f3424y0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f22539id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            e4Var.N = true;
                            e4Var.M = requirementtocontactpremium;
                            e4Var.g();
                            if (!z10) {
                                i11 = ((f3) v0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == v0Var.f3412l0 - 1.0f) {
                                z12 = false;
                            }
                            e4Var.e(user, formatName, formatUserStatus, z12);
                            e4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                k4 k4Var = (k4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        k4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        k4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (v0Var.U) {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (v0Var.f3423x0.size() == 1) {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - v0Var.f3415p0;
            ArrayList arrayList2 = v0Var.f3416q0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                q0 q0Var = (q0) view;
                p0 p0Var = (p0) v0Var.f3416q0.get(i14);
                bg.u1 u1Var = q0Var.f3284c;
                ImageView imageView = q0Var.f3282a;
                h5 h5Var = q0Var.f3283b;
                if (p0Var instanceof o0) {
                    q0Var.f3286f = (o0) p0Var;
                    q0Var.f3285e = null;
                    imageView.setVisibility(8);
                    h5Var.setVisibility(8);
                    u1Var.setVisibility(0);
                    h5 h5Var2 = q0Var.d;
                    o0 o0Var = q0Var.f3286f;
                    if (o0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    h5Var2.l(LocaleController.formatPluralString(str, o0Var.f3238g, new Object[0]), false);
                    return;
                } else if (p0Var != null) {
                    q0Var.f3286f = null;
                    q0Var.f3285e = p0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(q0Var.f3285e.f3258a);
                    h5Var.setVisibility(0);
                    p0 p0Var2 = q0Var.f3285e;
                    String str4 = "";
                    if (p0Var2.d != null) {
                        String string = LocaleController.getString(q0Var.f3285e.d + "_" + LocaleController.getStringParamForNumber(q0Var.f3285e.f3261e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(q0Var.f3285e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(a4.w.l(q0Var.f3285e.f3261e, "", new StringBuilder()));
                            spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        h5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(p0Var2.f3259b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (q0Var.f3285e.f3260c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(q0Var.f3285e.f3260c);
                                spannableString2.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            h5Var.l(spannableStringBuilder2, false);
                        } else {
                            h5Var.l(str4, false);
                        }
                    }
                    u1Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) v0Var.f3405e0.get(i10 - v0Var.f3411k0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f24728r.a(contains, z11);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f9;
        c6 c6Var3;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        c6 c6Var7;
        int i16;
        int i17;
        int i18;
        c6 c6Var8;
        c6 c6Var9;
        u0 u0Var;
        c6 c6Var10;
        c6 c6Var11;
        c6 c6Var12;
        Context context = viewGroup.getContext();
        v0 v0Var = this.f3224c;
        switch (i10) {
            case 1:
                u0Var = new org.telegram.ui.Cells.n(context, new m0(this), true, 9);
                break;
            case 2:
                int i19 = g6.f23009a7;
                c6Var = ((f3) v0Var).resourcesProvider;
                u0Var = new x6(context, g6.v0(i19, c6Var), 0);
                break;
            case 3:
                View k4Var = new k4(context);
                k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                u0Var = k4Var;
                break;
            case 4:
                c6Var2 = ((f3) v0Var).resourcesProvider;
                View e4Var = new e4(1, 0, context, c6Var2, false, false);
                i11 = ((f3) v0Var).backgroundPaddingLeft;
                i12 = ((f3) v0Var).backgroundPaddingLeft;
                e4Var.setPadding(i11, 0, i12, 0);
                u0Var = e4Var;
                break;
            case 5:
                p00 p00Var = new p00(context, null);
                if (v0Var.f3404d0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                p00Var.setViewType(i13);
                p00Var.setIsSingleCell(true);
                p00Var.setIgnoreHeightCheck(true);
                p00Var.setItemsCount(10);
                u0Var = p00Var;
                break;
            case 6:
                u0Var = new fn(v0Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                i14 = ((f3) v0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((f3) v0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (v0Var.M0 == null && ChatObject.hasAdminRights(v0Var.s1())) {
                    v0Var.M0 = new a4.g(this, 26);
                }
                int dp2 = AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                if (v0Var.M0 == null) {
                    f9 = 18.0f;
                } else {
                    f9 = 50.0f;
                }
                textView.setPadding(dp2, dp3, AndroidUtilities.dp(f9), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, f6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = g6.f23081e7;
                c6Var3 = ((f3) v0Var).resourcesProvider;
                int v02 = g6.v0(i20, c6Var3);
                int i21 = g6.f23152i6;
                c6Var4 = ((f3) v0Var).resourcesProvider;
                int k9 = i0.a.k(g6.v0(i21, c6Var4), 76);
                textView.setBackground(g6.i0(dp4, dp4, dp4, dp4, v02, k9, k9));
                int i22 = g6.G6;
                c6Var5 = ((f3) v0Var).resourcesProvider;
                textView.setTextColor(g6.v0(i22, c6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final n0 f3182b;

                    {
                        this.f3182b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        c6 c6Var13;
                        switch (r2) {
                            case 0:
                                v0 v0Var2 = this.f3182b.f3224c;
                                org.telegram.ui.ActionBar.o2 o2Var = v0Var2.f34662n;
                                long j10 = v0Var2.W;
                                c6Var13 = ((f3) v0Var2).resourcesProvider;
                                eg.y.m(o2Var, c6Var13, j10, null);
                                return;
                            case 1:
                                v0 v0Var3 = this.f3182b.f3224c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f3182b.f3224c.p1());
                                return;
                            default:
                                v0 v0Var4 = this.f3182b.f3224c;
                                v0Var4.M0.run();
                                v0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (v0Var.M0 != null) {
                    ImageView imageView = new ImageView(v0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = g6.f23169j5;
                    c6Var6 = ((f3) v0Var).resourcesProvider;
                    imageView.setColorFilter(g6.v0(i23, c6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    c6Var7 = ((f3) v0Var).resourcesProvider;
                    int k10 = i0.a.k(g6.v0(i21, c6Var7), 76);
                    imageView.setBackground(g6.i0(dp5, dp5, dp5, dp5, 0, k10, k10));
                    frameLayout.addView(imageView, f6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final n0 f3182b;

                        {
                            this.f3182b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            c6 c6Var13;
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = this.f3182b.f3224c;
                                    org.telegram.ui.ActionBar.o2 o2Var = v0Var2.f34662n;
                                    long j10 = v0Var2.W;
                                    c6Var13 = ((f3) v0Var2).resourcesProvider;
                                    eg.y.m(o2Var, c6Var13, j10, null);
                                    return;
                                case 1:
                                    v0 v0Var3 = this.f3182b.f3224c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f3182b.f3224c.p1());
                                    return;
                                default:
                                    v0 v0Var4 = this.f3182b.f3224c;
                                    v0Var4.M0.run();
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
                i16 = ((f3) v0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((f3) v0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                f90 f90Var = new f90(context);
                y80 y80Var = new y80(context, null);
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
                int i24 = g6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                iq iqVar = new iq(0, mutate);
                iqVar.setColorKey(i24);
                iqVar.setSize(AndroidUtilities.dp(18.0f));
                iqVar.setWidth(AndroidUtilities.dp(11.0f));
                iqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                y80Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                y80Var.setTextSize(1, 14.0f);
                y80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                c6Var8 = ((f3) v0Var).resourcesProvider;
                if (c6Var8 instanceof lh.b) {
                    int i25 = g6.f23433y6;
                    c6Var11 = ((f3) v0Var).resourcesProvider;
                    y80Var.setTextColor(g6.v0(i25, c6Var11));
                } else {
                    int i26 = g6.G6;
                    c6Var9 = ((f3) v0Var).resourcesProvider;
                    y80Var.setTextColor(g6.v0(i26, c6Var9));
                }
                y80Var.setGravity(1);
                y80Var.setOnClickListener(new View.OnClickListener(this) {
                    public final n0 f3182b;

                    {
                        this.f3182b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        c6 c6Var13;
                        switch (r2) {
                            case 0:
                                v0 v0Var2 = this.f3182b.f3224c;
                                org.telegram.ui.ActionBar.o2 o2Var = v0Var2.f34662n;
                                long j10 = v0Var2.W;
                                c6Var13 = ((f3) v0Var2).resourcesProvider;
                                eg.y.m(o2Var, c6Var13, j10, null);
                                return;
                            case 1:
                                v0 v0Var3 = this.f3182b.f3224c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f3182b.f3224c.p1());
                                return;
                            default:
                                v0 v0Var4 = this.f3182b.f3224c;
                                v0Var4.M0.run();
                                v0Var4.dismiss();
                                return;
                        }
                    }
                });
                f90Var.setOnClickListener(new ag.o(y80Var, 5));
                if (v0Var.y1()) {
                    c6Var10 = ((f3) v0Var).resourcesProvider;
                    nh.d dVar = new nh.d(context, c6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final n0 f3182b;

                        {
                            this.f3182b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            c6 c6Var13;
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = this.f3182b.f3224c;
                                    org.telegram.ui.ActionBar.o2 o2Var = v0Var2.f34662n;
                                    long j10 = v0Var2.W;
                                    c6Var13 = ((f3) v0Var2).resourcesProvider;
                                    eg.y.m(o2Var, c6Var13, j10, null);
                                    return;
                                case 1:
                                    v0 v0Var3 = this.f3182b.f3224c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f3182b.f3224c.p1());
                                    return;
                                default:
                                    v0 v0Var4 = this.f3182b.f3224c;
                                    v0Var4.M0.run();
                                    v0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(v0Var.C0, f6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, f6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, f6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(v0Var.B0, f6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(f90Var, f6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(y80Var, f6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                u0Var = linearLayout;
                break;
            case 9:
                c6Var12 = ((f3) v0Var).resourcesProvider;
                u0Var = new q0(v0Var, context, c6Var12);
                break;
            default:
                u0 u0Var2 = new u0(v0Var, context);
                v0Var.Z = u0Var2;
                u0Var = u0Var2;
                break;
        }
        return th.m(u0Var, u0Var, -1, -2);
    }
}
