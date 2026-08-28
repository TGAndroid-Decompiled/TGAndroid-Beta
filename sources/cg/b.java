package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bg.i;
import bg.w0;
import dg.a0;
import dg.b0;
import dg.c0;
import dg.h0;
import dg.j;
import dg.m;
import dg.u;
import dg.y;
import dg.z;
import f2.q1;
import gh.u9;
import j3.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z8;
public final class b extends wf.b {
    public final b6 d;
    public wk0 f2389f;
    public w0 h;
    public w0 f2390n;
    public u f2391r;
    public w0 f2392s;
    public TLRPC.Chat v;
    public ArrayList f2388e = new ArrayList();
    public final HashMap f2393w = new HashMap();

    public b(b6 b6Var) {
        this.d = b6Var;
        i iVar = new i(this, 3);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(13, messagesStorage, iVar));
    }

    @Override
    public final boolean D(q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 2 && i9 != 11 && i9 != 8 && i9 != 10 && i9 != 15 && i9 != 12 && i9 != 17 && i9 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i9;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (i9 = chatFull.participants_count) > 0) {
            return i9;
        }
        HashMap hashMap = this.f2393w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22380id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i9 = 0; i9 < this.f2388e.size(); i9++) {
            if (((a) this.f2388e.get(i9)).f48814a == 7) {
                m(i9);
            }
        }
    }

    @Override
    public final int h() {
        return this.f2388e.size();
    }

    @Override
    public final int j(int i9) {
        return ((a) this.f2388e.get(i9)).f48814a;
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        boolean z10;
        int i10;
        int i11;
        long j10;
        boolean z11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        a aVar = (a) this.f2388e.get(i9);
        if (i12 != 0) {
            if (i12 != 2) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
                if (i12 != 5) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            String str = "";
                            switch (i12) {
                                case 9:
                                    dg.h hVar = (dg.h) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            hVar.f(chat, aVar.f2383i, aVar.f2382g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            hVar.f(chat2, aVar.f2383i, aVar.f2382g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f2380e;
                                        hVar.f(chat3, aVar.f2383i, aVar.f2382g, F(chat3));
                                    }
                                    hVar.setChatDeleteListener(this.f2390n);
                                    return;
                                case 10:
                                    ((dg.i) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    y yVar = (y) view;
                                    int i13 = aVar.f2386l;
                                    boolean z12 = aVar.f48815b;
                                    boolean z13 = aVar.f2382g;
                                    List list = (List) aVar.f2381f;
                                    TLRPC.Chat chat4 = this.v;
                                    dg.c cVar = yVar.d;
                                    yVar.f4565r = i13;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i13 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i11 = R.string.BoostingAllMembers;
                                        }
                                        cVar.k(LocaleController.formatString(i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i10 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i10 = R.string.BoostingNewMembers;
                                        }
                                        cVar.k(LocaleController.formatString(i10, new Object[0]));
                                    }
                                    yVar.f4502f.a(z12, false);
                                    yVar.setDivider(z13);
                                    yVar.f4501e.setTextColor(f6.v0(f6.f23178n5, yVar.f4498a));
                                    if (list.size() == 0) {
                                        yVar.setSubtitle(yVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        yVar.setSubtitle(yVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list.size(), new Object[0])));
                                        return;
                                    }
                                case 12:
                                    j jVar = (j) view;
                                    TLObject tLObject = aVar.f2387m;
                                    int i14 = aVar.f2383i;
                                    int i15 = aVar.f2384j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f2379c;
                                    boolean z14 = aVar.f2382g;
                                    boolean z15 = aVar.f48815b;
                                    dg.c cVar2 = jVar.d;
                                    jVar.f4531s = tLObject;
                                    if (i14 >= 12) {
                                        cVar2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        cVar2.k(LocaleController.formatPluralString("Months", i14, new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    BillingController billingController = BillingController.getInstance();
                                    if (i15 > 0) {
                                        j10 = j11 / i15;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb2.append(billingController.formatCurrency(j10, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i15);
                                    jVar.setSubtitle(sb2.toString());
                                    h5 h5Var = jVar.f4530r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i15 <= 0) {
                                        j11 = 0;
                                    }
                                    h5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    jVar.setDivider(z14);
                                    jVar.f4502f.a(z15, false);
                                    return;
                                case 13:
                                    b0 b0Var = (b0) view;
                                    b0Var.setText(aVar.f2379c);
                                    int i16 = aVar.f2383i;
                                    j6 j6Var = b0Var.f4497r;
                                    if (i16 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i16, Integer.valueOf(i16));
                                    }
                                    j6Var.a();
                                    j6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((dg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f2381f);
                                    return;
                                case 15:
                                    c0 c0Var = (c0) view;
                                    CharSequence charSequence2 = aVar.f2379c;
                                    boolean z16 = aVar.f48815b;
                                    boolean z17 = aVar.f2382g;
                                    c0Var.G = aVar.f2386l;
                                    c0Var.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    m mVar = (m) view;
                                    mVar.setCount(aVar.f2383i);
                                    mVar.setAfterTextChangedListener(this.f2392s);
                                    return;
                                case 17:
                                    a0 a0Var = (a0) view;
                                    TLObject tLObject2 = aVar.f2387m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i17 = aVar.f2383i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f48815b;
                                    TextView textView = a0Var.f4491f;
                                    j6 j6Var2 = a0Var.d;
                                    j6 j6Var3 = a0Var.f4490e;
                                    if (a0Var.f4493r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    a0Var.f4487a.a(z18, z11);
                                    a0Var.f4493r = tL_starsGiveawayOption;
                                    if (z11) {
                                        j6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        j6Var2.c(a0Var.h, false, true);
                                        j6Var3.c(a0Var.f4492n, z11, true);
                                        textView.setText("");
                                    } else {
                                        j6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        j6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i18 = i17 + 1;
                                    a0Var.f4494s = i18;
                                    if (!z11) {
                                        a0Var.v.d(i18, true);
                                    }
                                    a0Var.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        h0 h0Var = (h0) view;
                        h0Var.setText(aVar.f2379c);
                        h0Var.setBackground(aVar.f2382g);
                        return;
                    }
                    ((m4) view).setText(aVar.f2379c);
                    return;
                }
                z zVar = (z) view;
                List list2 = aVar.f2385k;
                int i19 = aVar.f2383i;
                zVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i20 = 0; i20 < list2.size(); i20++) {
                    strArr[i20] = String.valueOf((Integer) list2.get(i20));
                }
                zVar.f4566a.b(i19, null, strArr);
                zVar.setCallBack(this.h);
                return;
            }
            dg.e eVar = (dg.e) view;
            int i21 = aVar.f2386l;
            int i22 = aVar.f2383i;
            TLRPC.User user = (TLRPC.User) aVar.f2381f;
            boolean z19 = aVar.f48815b;
            o9 o9Var = eVar.f4500c;
            b6 b6Var = eVar.f4498a;
            dg.c cVar3 = eVar.d;
            h5 h5Var2 = eVar.f4501e;
            z8 z8Var = eVar.f4499b;
            if (eVar.f4508r == i21) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.f4508r = i21;
            if (i21 == 0) {
                cVar3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(f6.v0(f6.f23247r5, b6Var));
                z8Var.g(16);
                z8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_bottom, f6.f22966b7));
            } else if (i21 == 1) {
                cVar3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i22 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i22 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i22, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var2.setTextColor(f6.v0(f6.f23178n5, b6Var));
                z8Var.g(6);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_top, f6.f22966b7));
            } else if (i21 == 2) {
                cVar3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i22 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i22 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i22, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var2.setTextColor(f6.v0(f6.f23178n5, b6Var));
                z8Var.g(25);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_bottom, f6.f22966b7));
            } else if (i21 == 3) {
                cVar3.k(p8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(f6.v0(f6.f23247r5, b6Var));
                z8Var.g(26);
                z8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_top, f6.f22966b7));
            }
            eVar.f4502f.a(z19, z10);
            o9Var.setImageDrawable(z8Var);
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        u uVar = (u) view;
        this.f2391r = uVar;
        uVar.setBoostViaGifsText(this.v);
        this.f2391r.setStars(aVar.f2382g);
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        u9 u9Var;
        boolean z10;
        Context context = viewGroup.getContext();
        b6 b6Var = this.d;
        switch (i9) {
            case 2:
                u9Var = new dg.e(context, b6Var);
                break;
            case 3:
                u9Var = new View(context);
                break;
            case 4:
                u9Var = new z6(context, f6.v0(f6.f22947a7, b6Var), 0);
                break;
            case 5:
                u9Var = new z(context, b6Var);
                break;
            case 6:
                View m4Var = new m4(context, f6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
                u9Var = m4Var;
                break;
            case 7:
                u9Var = new h0(context, b6Var);
                break;
            case 8:
                u9Var = new dg.b(context, b6Var);
                break;
            case 9:
                u9Var = new dg.h(context, b6Var);
                break;
            case 10:
                u9Var = new dg.i(context, b6Var);
                break;
            case 11:
                dg.d dVar = new dg.d(context, b6Var);
                dVar.f4500c.setVisibility(8);
                u9Var = dVar;
                break;
            case 12:
                u9Var = new j(context, b6Var);
                break;
            case 13:
                View b0Var = new b0(context, b6Var);
                b0Var.setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
                u9Var = b0Var;
                break;
            case 14:
                u9Var = new dg.e(context, b6Var);
                break;
            case 15:
                t8 t8Var = new t8(context, b6Var);
                t8Var.setHeight(50);
                u9Var = t8Var;
                break;
            case 16:
                u9Var = new m(context, b6Var);
                break;
            case 17:
                u9Var = new a0(context, b6Var);
                break;
            case 18:
                u9 u9Var2 = new u9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (u9Var2.f8988c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u9Var2.f8988c = -1;
                j6 j6Var = u9Var2.f8986a;
                j6Var.c(string, z10, true);
                int w02 = f6.w0(null, f6.o6, false);
                j6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = u9Var2.f8987b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(gr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                u9Var2.d = false;
                u9Var2.setWillNotDraw(true);
                u9Var = u9Var2;
                break;
            default:
                u9Var = new u(context, b6Var);
                break;
        }
        return r0.s(u9Var, u9Var, -1, -2);
    }
}
