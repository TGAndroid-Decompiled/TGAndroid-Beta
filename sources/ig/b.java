package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import dg.h0;
import f2.m1;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jg.a0;
import jg.f0;
import jg.i;
import jg.j;
import jg.m;
import jg.s;
import jg.w;
import jg.x;
import jg.y;
import jg.z;
import mh.q9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
public final class b extends cg.c {
    public final g6 d;
    public sl0 f8070f;
    public r0 h;
    public r0 f8071n;
    public s f8072r;
    public r0 f8073s;
    public TLRPC.Chat v;
    public ArrayList f8069e = new ArrayList();
    public final HashMap f8074w = new HashMap();

    public b(g6 g6Var) {
        this.d = g6Var;
        h0 h0Var = new h0(this, 10);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new gf.c(8, messagesStorage, h0Var));
    }

    @Override
    public final boolean D(m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20845id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f8074w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20845id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.f8069e.size(); i10++) {
            if (((a) this.f8069e.get(i10)).f2505a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.f8069e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.f8069e.get(i10)).f2505a;
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        boolean z4;
        int i11;
        int i12;
        long j10;
        boolean z10;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        a aVar = (a) this.f8069e.get(i10);
        if (i13 != 0) {
            if (i13 != 2) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
                if (i13 != 5) {
                    if (i13 != 6) {
                        if (i13 != 7) {
                            String str = "";
                            switch (i13) {
                                case 9:
                                    jg.h hVar = (jg.h) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            hVar.f(chat, aVar.f8064i, aVar.f8063g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            hVar.f(chat2, aVar.f8064i, aVar.f8063g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f8061e;
                                        hVar.f(chat3, aVar.f8064i, aVar.f8063g, F(chat3));
                                    }
                                    hVar.setChatDeleteListener(this.f8071n);
                                    return;
                                case 10:
                                    ((i) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    w wVar = (w) view;
                                    int i14 = aVar.f8067l;
                                    boolean z11 = aVar.f2506b;
                                    boolean z12 = aVar.f8063g;
                                    List list = (List) aVar.f8062f;
                                    TLRPC.Chat chat4 = this.v;
                                    jg.c cVar = wVar.d;
                                    wVar.f10077r = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        cVar.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        cVar.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    wVar.f10022f.a(z11, false);
                                    wVar.setDivider(z12);
                                    wVar.f10021e.setTextColor(k6.v0(k6.f21840n5, wVar.f10018a));
                                    if (list.size() == 0) {
                                        wVar.setSubtitle(wVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        wVar.setSubtitle(wVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list.size(), new Object[0])));
                                        return;
                                    }
                                case 12:
                                    j jVar = (j) view;
                                    TLObject tLObject = aVar.f8068m;
                                    int i15 = aVar.f8064i;
                                    int i16 = aVar.f8065j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f8060c;
                                    boolean z13 = aVar.f8063g;
                                    boolean z14 = aVar.f2506b;
                                    jg.c cVar2 = jVar.d;
                                    jVar.f10045s = tLObject;
                                    if (i15 >= 12) {
                                        cVar2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        cVar2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    BillingController billingController = BillingController.getInstance();
                                    if (i16 > 0) {
                                        j10 = j11 / i16;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb.append(billingController.formatCurrency(j10, charSequence.toString()));
                                    sb.append(" x ");
                                    sb.append(i16);
                                    jVar.setSubtitle(sb.toString());
                                    l5 l5Var = jVar.f10044r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    l5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    jVar.setDivider(z13);
                                    jVar.f10022f.a(z14, false);
                                    return;
                                case 13:
                                    z zVar = (z) view;
                                    zVar.setText(aVar.f8060c);
                                    int i17 = aVar.f8064i;
                                    org.telegram.ui.Components.k6 k6Var = zVar.f10087r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    k6Var.a();
                                    k6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((jg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f8062f);
                                    return;
                                case 15:
                                    a0 a0Var = (a0) view;
                                    CharSequence charSequence2 = aVar.f8060c;
                                    boolean z15 = aVar.f2506b;
                                    boolean z16 = aVar.f8063g;
                                    a0Var.H = aVar.f8067l;
                                    a0Var.f(charSequence2, z15, z16);
                                    return;
                                case 16:
                                    m mVar = (m) view;
                                    mVar.setCount(aVar.f8064i);
                                    mVar.setAfterTextChangedListener(this.f8073s);
                                    return;
                                case 17:
                                    y yVar = (y) view;
                                    TLObject tLObject2 = aVar.f8068m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f8064i;
                                    long j12 = aVar.h;
                                    boolean z17 = aVar.f2506b;
                                    TextView textView = yVar.f10083f;
                                    org.telegram.ui.Components.k6 k6Var2 = yVar.d;
                                    org.telegram.ui.Components.k6 k6Var3 = yVar.f10082e;
                                    if (yVar.f10085r == tL_starsGiveawayOption) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f10079a.a(z17, z10);
                                    yVar.f10085r = tL_starsGiveawayOption;
                                    if (z10) {
                                        k6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        k6Var2.c(yVar.h, false, true);
                                        k6Var3.c(yVar.f10084n, z10, true);
                                        textView.setText("");
                                    } else {
                                        k6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        k6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z10, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    yVar.f10086s = i19;
                                    if (!z10) {
                                        yVar.v.d(i19, true);
                                    }
                                    yVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        f0 f0Var = (f0) view;
                        f0Var.setText(aVar.f8060c);
                        f0Var.setBackground(aVar.f8063g);
                        return;
                    }
                    ((m4) view).setText(aVar.f8060c);
                    return;
                }
                x xVar = (x) view;
                List list2 = aVar.f8066k;
                int i20 = aVar.f8064i;
                xVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                xVar.f10078a.b(i20, null, strArr);
                xVar.setCallBack(this.h);
                return;
            }
            jg.e eVar = (jg.e) view;
            int i22 = aVar.f8067l;
            int i23 = aVar.f8064i;
            TLRPC.User user = (TLRPC.User) aVar.f8062f;
            boolean z18 = aVar.f2506b;
            p9 p9Var = eVar.f10020c;
            g6 g6Var = eVar.f10018a;
            jg.c cVar3 = eVar.d;
            l5 l5Var2 = eVar.f10021e;
            z8 z8Var = eVar.f10019b;
            if (eVar.f10027r == i22) {
                z4 = true;
            } else {
                z4 = false;
            }
            eVar.f10027r = i22;
            if (i22 == 0) {
                cVar3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var2.setTextColor(k6.v0(k6.f21913r5, g6Var));
                z8Var.g(16);
                z8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_bottom, k6.f21626b7));
            } else if (i22 == 1) {
                cVar3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                l5Var2.setTextColor(k6.v0(k6.f21840n5, g6Var));
                z8Var.g(6);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_top, k6.f21626b7));
            } else if (i22 == 2) {
                cVar3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                l5Var2.setTextColor(k6.v0(k6.f21840n5, g6Var));
                z8Var.g(25);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_bottom, k6.f21626b7));
            } else if (i22 == 3) {
                cVar3.k(o8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var2.setTextColor(k6.v0(k6.f21913r5, g6Var));
                z8Var.g(26);
                z8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_top, k6.f21626b7));
            }
            eVar.f10022f.a(z18, z4);
            p9Var.setImageDrawable(z8Var);
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        s sVar = (s) view;
        this.f8072r = sVar;
        sVar.setBoostViaGifsText(this.v);
        this.f8072r.setStars(aVar.f8063g);
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        q9 q9Var;
        boolean z4;
        Context context = viewGroup.getContext();
        g6 g6Var = this.d;
        switch (i10) {
            case 2:
                q9Var = new jg.e(context, g6Var);
                break;
            case 3:
                q9Var = new View(context);
                break;
            case 4:
                q9Var = new z6(context, k6.v0(k6.f21607a7, g6Var), 0);
                break;
            case 5:
                q9Var = new x(context, g6Var);
                break;
            case 6:
                View m4Var = new m4(context, k6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(k6.v0(k6.f21733h5, g6Var));
                q9Var = m4Var;
                break;
            case 7:
                q9Var = new f0(context, g6Var);
                break;
            case 8:
                q9Var = new jg.b(context, g6Var);
                break;
            case 9:
                q9Var = new jg.h(context, g6Var);
                break;
            case 10:
                q9Var = new i(context, g6Var);
                break;
            case 11:
                jg.d dVar = new jg.d(context, g6Var);
                dVar.f10020c.setVisibility(8);
                q9Var = dVar;
                break;
            case 12:
                q9Var = new j(context, g6Var);
                break;
            case 13:
                View zVar = new z(context, g6Var);
                zVar.setBackgroundColor(k6.v0(k6.f21733h5, g6Var));
                q9Var = zVar;
                break;
            case 14:
                q9Var = new jg.e(context, g6Var);
                break;
            case 15:
                s8 s8Var = new s8(context, g6Var);
                s8Var.setHeight(50);
                q9Var = s8Var;
                break;
            case 16:
                q9Var = new m(context, g6Var);
                break;
            case 17:
                q9Var = new y(context, g6Var);
                break;
            case 18:
                q9 q9Var2 = new q9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (q9Var2.f14649c == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                q9Var2.f14649c = -1;
                org.telegram.ui.Components.k6 k6Var = q9Var2.f14647a;
                k6Var.c(string, z4, true);
                int w02 = k6.w0(null, k6.f21859o6, false);
                k6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = q9Var2.f14648b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z4) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(pr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                q9Var2.d = false;
                q9Var2.setWillNotDraw(true);
                q9Var = q9Var2;
                break;
            default:
                q9Var = new s(context, g6Var);
                break;
        }
        return yh.o(q9Var, q9Var, -1, -2);
    }
}
