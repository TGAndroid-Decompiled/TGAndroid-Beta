package fg;

import ag.i0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import eg.s0;
import f2.n1;
import gg.a0;
import gg.f0;
import gg.i;
import gg.j;
import gg.m;
import gg.s;
import gg.w;
import gg.x;
import gg.y;
import gg.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jh.p9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;
public final class b extends zf.b {
    public final c6 d;
    public jl0 f6728f;
    public s0 h;
    public s0 f6729n;
    public s f6730r;
    public s0 f6731s;
    public TLRPC.Chat v;
    public ArrayList f6727e = new ArrayList();
    public final HashMap f6732w = new HashMap();

    public b(c6 c6Var) {
        this.d = c6Var;
        i0 i0Var = new i0(this, 10);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ef.c(6, messagesStorage, i0Var));
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22392id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f6732w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22392id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.f6727e.size(); i10++) {
            if (((a) this.f6727e.get(i10)).f50845a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.f6727e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.f6727e.get(i10)).f50845a;
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        a aVar = (a) this.f6727e.get(i10);
        if (i13 != 0) {
            if (i13 != 2) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
                if (i13 != 5) {
                    if (i13 != 6) {
                        if (i13 != 7) {
                            String str = "";
                            switch (i13) {
                                case 9:
                                    gg.h hVar = (gg.h) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            hVar.f(chat, aVar.f6722i, aVar.f6721g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            hVar.f(chat2, aVar.f6722i, aVar.f6721g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f6719e;
                                        hVar.f(chat3, aVar.f6722i, aVar.f6721g, F(chat3));
                                    }
                                    hVar.setChatDeleteListener(this.f6729n);
                                    return;
                                case 10:
                                    ((i) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    w wVar = (w) view;
                                    int i14 = aVar.f6725l;
                                    boolean z12 = aVar.f50846b;
                                    boolean z13 = aVar.f6721g;
                                    List list = (List) aVar.f6720f;
                                    TLRPC.Chat chat4 = this.v;
                                    gg.c cVar = wVar.d;
                                    wVar.f7347r = i14;
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
                                    wVar.f7292f.a(z12, false);
                                    wVar.setDivider(z13);
                                    wVar.f7291e.setTextColor(g6.v0(g6.f23240n5, wVar.f7288a));
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
                                    TLObject tLObject = aVar.f6726m;
                                    int i15 = aVar.f6722i;
                                    int i16 = aVar.f6723j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f6718c;
                                    boolean z14 = aVar.f6721g;
                                    boolean z15 = aVar.f50846b;
                                    gg.c cVar2 = jVar.d;
                                    jVar.f7315s = tLObject;
                                    if (i15 >= 12) {
                                        cVar2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        cVar2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    BillingController billingController = BillingController.getInstance();
                                    if (i16 > 0) {
                                        j10 = j11 / i16;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb2.append(billingController.formatCurrency(j10, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i16);
                                    jVar.setSubtitle(sb2.toString());
                                    h5 h5Var = jVar.f7314r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    h5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    jVar.setDivider(z14);
                                    jVar.f7292f.a(z15, false);
                                    return;
                                case 13:
                                    z zVar = (z) view;
                                    zVar.setText(aVar.f6718c);
                                    int i17 = aVar.f6722i;
                                    o6 o6Var = zVar.f7357r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    o6Var.a();
                                    o6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((gg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f6720f);
                                    return;
                                case 15:
                                    a0 a0Var = (a0) view;
                                    CharSequence charSequence2 = aVar.f6718c;
                                    boolean z16 = aVar.f50846b;
                                    boolean z17 = aVar.f6721g;
                                    a0Var.G = aVar.f6725l;
                                    a0Var.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    m mVar = (m) view;
                                    mVar.setCount(aVar.f6722i);
                                    mVar.setAfterTextChangedListener(this.f6731s);
                                    return;
                                case 17:
                                    y yVar = (y) view;
                                    TLObject tLObject2 = aVar.f6726m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f6722i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f50846b;
                                    TextView textView = yVar.f7353f;
                                    o6 o6Var2 = yVar.d;
                                    o6 o6Var3 = yVar.f7352e;
                                    if (yVar.f7355r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    yVar.f7349a.a(z18, z11);
                                    yVar.f7355r = tL_starsGiveawayOption;
                                    if (z11) {
                                        o6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        o6Var2.c(yVar.h, false, true);
                                        o6Var3.c(yVar.f7354n, z11, true);
                                        textView.setText("");
                                    } else {
                                        o6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        o6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    yVar.f7356s = i19;
                                    if (!z11) {
                                        yVar.v.d(i19, true);
                                    }
                                    yVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        f0 f0Var = (f0) view;
                        f0Var.setText(aVar.f6718c);
                        f0Var.setBackground(aVar.f6721g);
                        return;
                    }
                    ((k4) view).setText(aVar.f6718c);
                    return;
                }
                x xVar = (x) view;
                List list2 = aVar.f6724k;
                int i20 = aVar.f6722i;
                xVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                xVar.f7348a.b(i20, null, strArr);
                xVar.setCallBack(this.h);
                return;
            }
            gg.e eVar = (gg.e) view;
            int i22 = aVar.f6725l;
            int i23 = aVar.f6722i;
            TLRPC.User user = (TLRPC.User) aVar.f6720f;
            boolean z19 = aVar.f50846b;
            t9 t9Var = eVar.f7290c;
            c6 c6Var = eVar.f7288a;
            gg.c cVar3 = eVar.d;
            h5 h5Var2 = eVar.f7291e;
            e9 e9Var = eVar.f7289b;
            if (eVar.f7297r == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.f7297r = i22;
            if (i22 == 0) {
                cVar3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(g6.v0(g6.f23310r5, c6Var));
                e9Var.g(16);
                e9Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_bottom, g6.f23028b7));
            } else if (i22 == 1) {
                cVar3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var2.setTextColor(g6.v0(g6.f23240n5, c6Var));
                e9Var.g(6);
                e9Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_top, g6.f23028b7));
            } else if (i22 == 2) {
                cVar3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var2.setTextColor(g6.v0(g6.f23240n5, c6Var));
                e9Var.g(25);
                e9Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_bottom, g6.f23028b7));
            } else if (i22 == 3) {
                cVar3.k(m8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(g6.v0(g6.f23310r5, c6Var));
                e9Var.g(26);
                e9Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_top, g6.f23028b7));
            }
            eVar.f7292f.a(z19, z10);
            t9Var.setImageDrawable(e9Var);
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        s sVar = (s) view;
        this.f6730r = sVar;
        sVar.setBoostViaGifsText(this.v);
        this.f6730r.setStars(aVar.f6721g);
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        p9 p9Var;
        boolean z10;
        Context context = viewGroup.getContext();
        c6 c6Var = this.d;
        switch (i10) {
            case 2:
                p9Var = new gg.e(context, c6Var);
                break;
            case 3:
                p9Var = new View(context);
                break;
            case 4:
                p9Var = new x6(context, g6.v0(g6.f23009a7, c6Var), 0);
                break;
            case 5:
                p9Var = new x(context, c6Var);
                break;
            case 6:
                View k4Var = new k4(context, g6.L6, 21, 15, 3, false, false, this.d);
                k4Var.setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
                p9Var = k4Var;
                break;
            case 7:
                p9Var = new f0(context, c6Var);
                break;
            case 8:
                p9Var = new gg.b(context, c6Var);
                break;
            case 9:
                p9Var = new gg.h(context, c6Var);
                break;
            case 10:
                p9Var = new i(context, c6Var);
                break;
            case 11:
                gg.d dVar = new gg.d(context, c6Var);
                dVar.f7290c.setVisibility(8);
                p9Var = dVar;
                break;
            case 12:
                p9Var = new j(context, c6Var);
                break;
            case 13:
                View zVar = new z(context, c6Var);
                zVar.setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
                p9Var = zVar;
                break;
            case 14:
                p9Var = new gg.e(context, c6Var);
                break;
            case 15:
                q8 q8Var = new q8(context, c6Var);
                q8Var.setHeight(50);
                p9Var = q8Var;
                break;
            case 16:
                p9Var = new m(context, c6Var);
                break;
            case 17:
                p9Var = new y(context, c6Var);
                break;
            case 18:
                p9 p9Var2 = new p9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (p9Var2.f12627c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p9Var2.f12627c = -1;
                o6 o6Var = p9Var2.f12625a;
                o6Var.c(string, z10, true);
                int w02 = g6.w0(null, g6.f23260o6, false);
                o6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = p9Var2.f12626b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(jr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                p9Var2.d = false;
                p9Var2.setWillNotDraw(true);
                p9Var = p9Var2;
                break;
            default:
                p9Var = new s(context, c6Var);
                break;
        }
        return th.m(p9Var, p9Var, -1, -2);
    }
}
