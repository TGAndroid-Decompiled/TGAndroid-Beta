package ag;

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
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.d4;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zm;

public final class z0 extends yk0 {

    public final i1 f736c;

    public z0(i1 i1Var) {
        this.f736c = i1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        i1 i1Var = this.f736c;
        int i10 = i1Var.f432d0;
        if ((i10 == 11 || i10 == 34) && !i1Var.U) {
            return false;
        }
        int i11 = o1Var.f5793f;
        return i11 == 1 || i11 == 4;
    }

    @Override
    public final int h() {
        return this.f736c.f435g0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        i1 i1Var = this.f736c;
        if (i1Var.f436h0 == i10) {
            return 0;
        }
        if (i1Var.f437i0 == i10) {
            return 2;
        }
        if (i1Var.f438j0 == i10) {
            return 3;
        }
        if (i1Var.m0 == i10) {
            return 5;
        }
        if (i1Var.f441n0 == i10) {
            return 6;
        }
        if (i1Var.V == i10) {
            return 7;
        }
        if (i1Var.f442o0 == i10) {
            return 8;
        }
        ArrayList arrayList = i1Var.f444q0;
        if (arrayList != null && i10 >= (i11 = i1Var.f443p0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = i1Var.f432d0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        i1 i1Var = this.f736c;
        int i11 = i1Var.f432d0;
        HashSet hashSet = i1Var.f448u0;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i1Var.f433e0.get(i10 - i1Var.f439k0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.f24701r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i12 != 9) {
            if (i12 == 3) {
                j4 j4Var = (j4) view;
                if (i11 != 11 && i11 != 34) {
                    if (i11 == 2) {
                        j4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (i1Var.U) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (i1Var.f451x0.size() == 1) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i12 != 4) {
                return;
            }
            d4 d4Var = (d4) view;
            if (i11 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) i1Var.f449v0.get(i10 - i1Var.f439k0);
                d4Var.e(chat2, chat2.title, (String) i1Var.f450w0.get(i10 - i1Var.f439k0), ((float) i10) != ((float) i1Var.f440l0) - 1.0f);
                d4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i11 == 11 || i11 == 34) {
                    TLRPC.User user = (TLRPC.User) i1Var.f451x0.get(i10 - i1Var.f439k0);
                    ArrayList arrayList = i1Var.f452y0;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.f22527id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    d4Var.N = true;
                    d4Var.M = requirementtocontactpremium;
                    d4Var.g();
                    d4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), z10 ? LocaleController.getString(R.string.InvitePremiumBlockedUser) : LocaleController.formatUserStatus(((org.telegram.ui.ActionBar.e3) i1Var).currentAccount, user, null, null), ((float) i10) != ((float) i1Var.f440l0) - 1.0f);
                    d4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i13 = i10 - i1Var.f443p0;
        ArrayList arrayList2 = i1Var.f444q0;
        if (arrayList2 == null || i13 < 0 || i13 >= arrayList2.size()) {
            return;
        }
        c1 c1Var = (c1) view;
        b1 b1Var = (b1) i1Var.f444q0.get(i13);
        w wVar = c1Var.f314c;
        ImageView imageView = c1Var.f312a;
        h5 h5Var = c1Var.f313b;
        if (b1Var instanceof a1) {
            c1Var.f316f = (a1) b1Var;
            c1Var.f315e = null;
            imageView.setVisibility(8);
            h5Var.setVisibility(8);
            wVar.setVisibility(0);
            h5 h5Var2 = c1Var.d;
            a1 a1Var = c1Var.f316f;
            h5Var2.l(LocaleController.formatPluralString(a1Var.h ? "BoostLevelUnlocks" : "BoostLevel", a1Var.f285g, new Object[0]), false);
            return;
        }
        if (b1Var != null) {
            c1Var.f316f = null;
            c1Var.f315e = b1Var;
            imageView.setVisibility(0);
            imageView.setImageResource(c1Var.f315e.f305a);
            h5Var.setVisibility(0);
            b1 b1Var2 = c1Var.f315e;
            if (b1Var2.d != null) {
                String string = LocaleController.getString(c1Var.f315e.d + "_" + LocaleController.getStringParamForNumber(c1Var.f315e.f308e));
                if (string == null || string.startsWith("LOC_ERR")) {
                    string = LocaleController.getString(c1Var.f315e.d + "_other");
                }
                if (string == null) {
                    string = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf("%d");
                if (iIndexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(a9.p.k(c1Var.f315e.f308e, "", new StringBuilder()));
                    spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) spannableString);
                }
                h5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(b1Var2.f306b);
                String str = string2 != null ? string2 : "";
                if (c1Var.f315e.f307c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int iIndexOf2 = str.indexOf("%s");
                    if (iIndexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(c1Var.f315e.f307c);
                        spannableString2.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) spannableString2);
                    }
                    h5Var.l(spannableStringBuilder2, false);
                } else {
                    h5Var.l(str, false);
                }
            }
            wVar.setVisibility(8);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View nVar;
        Context context = viewGroup.getContext();
        final int i11 = 0;
        i1 i1Var = this.f736c;
        switch (i10) {
            case 1:
                nVar = new org.telegram.ui.Cells.n(context, new y0(this), true, 9);
                break;
            case 2:
                nVar = new w6(context, g6.v0(g6.f22999a7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider), 0);
                break;
            case 3:
                j4 j4Var = new j4(context);
                j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                nVar = j4Var;
                break;
            case 4:
                d4 d4Var = new d4(1, 0, context, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider, false, false);
                d4Var.setPadding(((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0);
                nVar = d4Var;
                break;
            case 5:
                h00 h00Var = new h00(context, null);
                h00Var.setViewType(i1Var.f432d0 == 2 ? 22 : 21);
                h00Var.setIsSingleCell(true);
                h00Var.setIgnoreHeightCheck(true);
                h00Var.setItemsCount(10);
                nVar = h00Var;
                break;
            case 6:
                nVar = new zm(i1Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(i1Var.getContext());
                frameLayout.setPadding(AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0);
                TextView textView = new TextView(context);
                if (i1Var.M0 == null && ChatObject.hasAdminRights(i1Var.s1())) {
                    i1Var.M0 = new af.e(this, 1);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(i1Var.M0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int iDp = AndroidUtilities.dp(8.0f);
                int iV0 = g6.v0(g6.f23073e7, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                int i12 = g6.f23144i6;
                int iK = i0.b.k(g6.v0(i12, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider), 76);
                textView.setBackground(g6.i0(iDp, iDp, iDp, iDp, iV0, iK, iK));
                textView.setTextColor(g6.v0(g6.G6, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                final int i13 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) {

                    public final z0 f681b;

                    {
                        this.f681b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                i1 i1Var2 = this.f681b.f736c;
                                cg.x.m(i1Var2.f31855n, ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider, i1Var2.W, null);
                                break;
                            case 1:
                                i1 i1Var3 = this.f681b.f736c;
                                AndroidUtilities.addToClipboard(i1Var3.p1());
                                i1Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f681b.f736c.p1());
                                break;
                            default:
                                i1 i1Var4 = this.f681b.f736c;
                                i1Var4.M0.run();
                                i1Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i1Var.M0 != null) {
                    ImageView imageView = new ImageView(i1Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    imageView.setColorFilter(g6.v0(g6.f23161j5, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int iDp2 = AndroidUtilities.dp(20.0f);
                    int iK2 = i0.b.k(g6.v0(i12, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider), 76);
                    imageView.setBackground(g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK2, iK2));
                    frameLayout.addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i14 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) {

                        public final z0 f681b;

                        {
                            this.f681b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    i1 i1Var2 = this.f681b.f736c;
                                    cg.x.m(i1Var2.f31855n, ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider, i1Var2.W, null);
                                    break;
                                case 1:
                                    i1 i1Var3 = this.f681b.f736c;
                                    AndroidUtilities.addToClipboard(i1Var3.p1());
                                    i1Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f681b.f736c.p1());
                                    break;
                                default:
                                    i1 i1Var4 = this.f681b.f736c;
                                    i1Var4.M0.run();
                                    i1Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(i1Var.p1());
                textView.setGravity(17);
                nVar = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft, 0);
                linearLayout.setOrientation(1);
                w80 w80Var = new w80(context);
                p80 p80Var = new p80(context, null);
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i1Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new x0(this, i11), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable drawableMutate = i1Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i15 = g6.gc;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
                cq cqVar = new cq(0, drawableMutate);
                cqVar.setColorKey(i15);
                cqVar.setSize(AndroidUtilities.dp(18.0f));
                cqVar.setWidth(AndroidUtilities.dp(11.0f));
                cqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
                p80Var.setText(TextUtils.concat(spannableStringBuilderReplaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                if (((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider instanceof jh.b) {
                    p80Var.setTextColor(g6.v0(g6.f23423y6, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                } else {
                    p80Var.setTextColor(g6.v0(g6.G6, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider));
                }
                final int i16 = 1;
                p80Var.setGravity(1);
                p80Var.setOnClickListener(new View.OnClickListener(this) {

                    public final z0 f681b;

                    {
                        this.f681b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                i1 i1Var2 = this.f681b.f736c;
                                cg.x.m(i1Var2.f31855n, ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider, i1Var2.W, null);
                                break;
                            case 1:
                                i1 i1Var3 = this.f681b.f736c;
                                AndroidUtilities.addToClipboard(i1Var3.p1());
                                i1Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f681b.f736c.p1());
                                break;
                            default:
                                i1 i1Var4 = this.f681b.f736c;
                                i1Var4.M0.run();
                                i1Var4.dismiss();
                                break;
                        }
                    }
                });
                w80Var.setOnClickListener(new w0(p80Var, i11));
                if (i1Var.y1()) {
                    lh.d dVar = new lh.d(context, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {

                        public final z0 f681b;

                        {
                            this.f681b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    i1 i1Var2 = this.f681b.f736c;
                                    cg.x.m(i1Var2.f31855n, ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider, i1Var2.W, null);
                                    break;
                                case 1:
                                    i1 i1Var3 = this.f681b.f736c;
                                    AndroidUtilities.addToClipboard(i1Var3.p1());
                                    i1Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f681b.f736c.p1());
                                    break;
                                default:
                                    i1 i1Var4 = this.f681b.f736c;
                                    i1Var4.M0.run();
                                    i1Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i1Var.C0, z5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, z5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i1Var.B0, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(w80Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p80Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                nVar = linearLayout;
                break;
            case 9:
                nVar = new c1(i1Var, context, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                break;
            default:
                g1 g1Var = new g1(i1Var, context);
                i1Var.Z = g1Var;
                nVar = g1Var;
                break;
        }
        return pa.l(nVar, nVar, -1, -2);
    }
}
