package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import gh.c4;
import hh.e4;
import hh.ea;
import hh.fa;
import hh.g4;
import hh.m7;
import hh.oa;
import hh.x3;
import hh.y3;
import hh.z3;
import java.util.ArrayList;
import java.util.HashSet;
import jh.p9;
import jh.q9;
import lh.f6;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.dn;
import org.telegram.ui.ib0;
import org.telegram.ui.jo;
import org.telegram.ui.ko0;
import org.telegram.ui.m6;
import org.telegram.ui.ob0;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;
import org.telegram.ui.rv0;
import org.telegram.ui.s50;
import org.telegram.ui.tk0;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yf;
import org.telegram.ui.zh1;

public final class u0 implements Utilities.Callback2 {

    public final int f2827a;

    public final Object f2828b;

    public final Object f2829c;

    public u0(int i10, Object obj, Object obj2) {
        this.f2827a = i10;
        this.f2828b = obj;
        this.f2829c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.Chat chat2;
        TLRPC.EmojiStatus tL_emojiStatusEmpty;
        int i12 = 3;
        TLRPC.TL_contacts_found tL_contacts_found2 = null;
        webPage = null;
        TLRPC.WebPage webPage = null;
        TLRPC.TL_contacts_found tL_contacts_found3 = null;
        int i13 = 0;
        switch (this.f2827a) {
            case 0:
                d1 d1Var = (d1) this.f2828b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.f2829c;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                d1Var.m0.f5382a.setLoading(false);
                if (d1Var.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    pa0 pa0Var = LaunchActivity.C1.f35535t0;
                    if (n2VarU != null) {
                        if (bool.booleanValue()) {
                            d1Var.dismiss();
                            rn rnVarR9 = rn.R9(-d1Var.X.f22380id);
                            n2VarU.presentFragment(rnVarR9);
                            n2VarU.whenFullyVisible(new a1.e(24, rnVarR9, tL_starsGiveawayOption));
                            if (pa0Var != null) {
                                pa0Var.c(true);
                            }
                        } else if (str != null) {
                            d1Var.dismiss();
                            pa.r(R.string.UnknownErrorCode, new Object[]{str}, mc.a0(n2VarU), R.raw.error, 36);
                        }
                        break;
                    }
                }
                break;
            case 1:
                c4 c4Var = (c4) this.f2828b;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((m7) this.f2829c).f9753l;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    if (savedStarGift.pinned_to_top) {
                        int i15 = ko0.f39816a;
                        n41 n41VarJ = n41.J(ko0.class);
                        n41VarJ.G = savedStarGift;
                        n41VarJ.K(c4Var.f7184b == savedStarGift.gift.f22607id);
                        n41VarJ.f30853u = 1;
                        arrayList.add(n41VarJ);
                    }
                }
                break;
            case 2:
                g4 g4Var = (g4) this.f2828b;
                ArrayList arrayList3 = (ArrayList) this.f2829c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                e4[] e4VarArr = g4Var.f9315n;
                w3 w3Var = g4Var.P;
                if (w3Var != null) {
                    w3Var.e(true);
                    g4Var.P = null;
                }
                g4Var.f9309e0 = true;
                g4Var.f9311f0 = starGift == null;
                g4Var.f9312g0 = runnable;
                y3 y3Var = new y3(g4Var.h);
                ArrayList arrayList4 = y3Var.f10368b;
                ArrayList arrayList5 = new ArrayList();
                for (int i16 = 0; i16 < e4VarArr.length; i16++) {
                    e4 e4Var = e4VarArr[i16];
                    if (e4Var != null) {
                        TL_stars.StarGift starGift2 = e4Var.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList5.add(Integer.valueOf(i16));
                        }
                    }
                }
                int i17 = 4;
                if (arrayList5.size() == 1) {
                    y3Var.e(e4VarArr[((Integer) arrayList5.get(0)).intValue()], 5, 0.0f);
                    y3Var.d(false);
                    y3Var.c(26.0f, -26.0f);
                    y3Var.a(90);
                    y3Var.d(true);
                    y3Var.a(20);
                    i11 = 40;
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    e4 e4Var2 = e4VarArr[0];
                    if (e4Var2 == null) {
                        i10 = 0;
                    } else {
                        TL_stars.StarGift starGift3 = e4Var2.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            y3Var.e(e4Var2, iArr[0], 0.0f);
                            y3Var.c(25.0f, -22.0f);
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                    }
                    e4 e4Var3 = e4VarArr[1];
                    if (e4Var3 != null) {
                        TL_stars.StarGift starGift4 = e4Var3.h;
                        if (starGift4 == null) {
                            starGift4 = null;
                        }
                        if (starGift4 != null) {
                            if (i10 > 0) {
                                y3Var.a(42);
                            }
                            y3Var.e(e4VarArr[1], iArr[i10], 0.0f);
                            y3Var.c(25.0f, 31.0f);
                            i10++;
                        }
                    }
                    e4 e4Var4 = e4VarArr[2];
                    if (e4Var4 != null) {
                        TL_stars.StarGift starGift5 = e4Var4.h;
                        if (starGift5 == null) {
                            starGift5 = null;
                        }
                        if (starGift5 != null) {
                            if (i10 > 0) {
                                y3Var.a(42);
                            }
                            y3Var.e(e4VarArr[2], iArr[i10], 180.0f);
                            y3Var.c(-36.0f, -36.0f);
                            i10++;
                        }
                    }
                    e4 e4Var5 = e4VarArr[3];
                    if (e4Var5 != null) {
                        TL_stars.StarGift starGift6 = e4Var5.h;
                        if (starGift6 == null) {
                            starGift6 = null;
                        }
                        if (starGift6 != null) {
                            if (i10 > 0) {
                                y3Var.a(42);
                            }
                            y3Var.e(e4VarArr[3], iArr[i10], 0.0f);
                            y3Var.c(-31.0f, 31.0f);
                            i10++;
                        }
                    }
                    y3Var.d(false);
                    y3Var.a(40);
                    y3Var.d(true);
                    y3Var.a(40);
                    i17 = iArr[i10];
                    i11 = 80;
                }
                arrayList4.add(new x3(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new d5.i(g4Var, i17, starGift, 3)));
                arrayList4.add(new x3(4, 0.0f, 0.0f, i11, i17, -90, null, null));
                androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(g4Var, starGift, arrayList3, runnable, 9);
                z3 z3Var = y3Var.f10367a;
                y3Var.d = bVar;
                y3Var.f10370e = false;
                y3Var.f10369c = 0;
                y3Var.f10376l = false;
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj4 = arrayList4.get(i18);
                    i18++;
                    x3 x3Var = (x3) obj4;
                    int i19 = x3Var.f10334e;
                    if (i19 >= 0 && i19 < 6) {
                        float f10 = x3Var.f10335f;
                        if (f10 != 0.0f) {
                            z3Var.f10420y[i19] = f10;
                        }
                    }
                }
                z3Var.D = y3Var;
                y3Var.b();
                break;
            case 3:
                oa.z0((oa) this.f2828b, (n41) this.f2829c, (Boolean) obj, (String) obj2);
                break;
            case 4:
                ea.Q((ea) this.f2828b, (n41) this.f2829c, (Boolean) obj, (String) obj2);
                break;
            case 5:
                fa.Q((fa) this.f2828b, (n41) this.f2829c, (Boolean) obj, (String) obj2);
                break;
            case 6:
                jh.g2 g2Var = (jh.g2) this.f2828b;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) this.f2829c;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                jh.y yVar = g2Var.R;
                int i20 = g2Var.J;
                g2Var.Q = false;
                TLRPC.InputGroupCall inputGroupCall = g2Var.K;
                if (inputGroupCall != null && inputGroupCall.f22397id == getgroupcallstars.call.f22397id) {
                    if (groupcallstars != null) {
                        MessagesController.getInstance(i20).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i20).putChats(groupcallstars.chats, false);
                        int i21 = 0;
                        while (true) {
                            if (i21 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i21).my) {
                                    z10 = groupcallstars.top_donors.get(i21).stars > 0;
                                } else {
                                    i21++;
                                }
                            }
                        }
                        long j10 = groupcallstars.total_stars;
                        boolean z11 = (j10 == g2Var.M && g2Var.O == z10) ? false : true;
                        g2Var.M = j10;
                        g2Var.P = groupcallstars.top_donors;
                        g2Var.O = z10;
                        if (z11) {
                            g2Var.j();
                        }
                        g2Var.t();
                    }
                    if (g2Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(yVar);
                        AndroidUtilities.runOnUIThread(yVar, 5000L);
                    }
                    break;
                }
                break;
            case 7:
                p9 p9Var = (p9) this.f2828b;
                ArrayList arrayList6 = (ArrayList) this.f2829c;
                Vector vector = (Vector) obj;
                q9 q9Var = p9Var.f13832a;
                if (vector != null) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i22 = 0; i22 < vector.objects.size(); i22++) {
                        if (((Long) arrayList6.get(i22)).longValue() > 0) {
                            TLRPC.User user3 = MessagesController.getInstance(q9Var.f13874a).getUser((Long) arrayList6.get(i22));
                            if (user3 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i22);
                                user3.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    user3.flags2 |= 32;
                                } else {
                                    user3.flags2 &= -33;
                                }
                                arrayList7.add(user3);
                            }
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(q9Var.f13874a).getChat((Long) arrayList6.get(i22));
                            if (chat3 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i22);
                                chat3.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    chat3.flags2 |= 16;
                                } else {
                                    chat3.flags2 &= -17;
                                }
                                arrayList8.add(chat3);
                            }
                        }
                    }
                    MessagesStorage.getInstance(q9Var.f13874a).putUsersAndChats(arrayList7, arrayList8, true, true);
                    NotificationCenter.getInstance(q9Var.f13874a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                }
                break;
            case 8:
                f6 f6Var = (f6) this.f2828b;
                zf.j jVar = (zf.j) this.f2829c;
                f6Var.getClass();
                ((zf.s0) jVar).r(f6Var.B1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                f6Var.d0(jVar);
                break;
            case 9:
                ((Utilities.Callback3) this.f2828b).run((Boolean) obj, (androidx.biometric.t) obj2, (androidx.biometric.u) this.f2829c);
                break;
            case 10:
                org.telegram.ui.b0 b0Var = (org.telegram.ui.b0) this.f2828b;
                org.telegram.ui.a0 a0Var = (org.telegram.ui.a0) this.f2829c;
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bool2.booleanValue()) {
                        b0Var.run(Boolean.TRUE);
                    }
                    a0Var.run();
                }
                break;
            case 11:
                rn.h0((rn) this.f2828b, (MessageObject) this.f2829c, (Long) obj, (Runnable) obj2);
                break;
            case 12:
                rn rnVar = (rn) this.f2828b;
                m6 m6Var = (m6) this.f2829c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                rnVar.B5 = 0;
                if (webpagepreview != null) {
                    rnVar.getMessagesController().putUsers(webpagepreview.users, false);
                    rnVar.getMessagesController().putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                    } else {
                        tL_messageMediaWebPage = null;
                    }
                } else {
                    tL_messageMediaWebPage = null;
                }
                if (tL_messageMediaWebPage != null) {
                    TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                    if (webPage2 == null || !"telegram_story".equals(webPage2.type)) {
                        m6Var.run(Boolean.valueOf(tL_messageMediaWebPage.webpage != null), tL_messageMediaWebPage.webpage);
                    } else {
                        if (tL_messageMediaWebPage.webpage.attributes != null) {
                            int i23 = 0;
                            while (true) {
                                if (i23 >= tL_messageMediaWebPage.webpage.attributes.size()) {
                                    tL_webPageAttributeStory = null;
                                } else if (tL_messageMediaWebPage.webpage.attributes.get(i23) instanceof TLRPC.TL_webPageAttributeStory) {
                                    tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) tL_messageMediaWebPage.webpage.attributes.get(i23);
                                } else {
                                    i23++;
                                }
                            }
                        } else {
                            tL_webPageAttributeStory = null;
                        }
                        if (tL_webPageAttributeStory == null) {
                            m6Var.run(Boolean.FALSE, null);
                        } else if (tL_webPageAttributeStory.storyItem != null) {
                            m6Var.run(Boolean.TRUE, tL_messageMediaWebPage.webpage);
                        } else {
                            rnVar.getMessagesStorage().getStorageQueue().postRunnable(new yf(rnVar, tL_messageMediaWebPage, tL_webPageAttributeStory, m6Var, 5));
                        }
                    }
                } else {
                    m6Var.run(Boolean.FALSE, null);
                }
                break;
            case 13:
                dn dnVar = (dn) this.f2828b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f2829c;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                rn rnVar2 = dnVar.f37446a;
                if (tL_channels_channelParticipant != null) {
                    rnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                    rnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant != null) {
                        dnVar.e(s1Var, channelParticipant);
                    }
                }
                break;
            case 14:
                jo joVar = (jo) this.f2828b;
                View view = (View) this.f2829c;
                joVar.B0 = ((Boolean) obj).booleanValue();
                joVar.D0 = ((Boolean) obj2).booleanValue();
                jh.z3 z3Var2 = joVar.f39410e;
                int iDp = AndroidUtilities.dp(joVar.B0 ? 16.0f : 32.0f);
                if (z3Var2.getRoundRadius()[0] != iDp) {
                    ValueAnimator valueAnimator = z3Var2.f30907x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(z3Var2.getRoundRadius()[0], iDp);
                    z3Var2.f30907x = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new ag.q1(z3Var2, 7));
                    z3Var2.f30907x.setDuration(200L);
                    z3Var2.f30907x.start();
                }
                ((l8) view).setChecked(joVar.B0);
                joVar.p0(false, true);
                if (!joVar.J0) {
                    TLRPC.Chat chat4 = joVar.f39429t0;
                    if (chat4.forum != joVar.B0 || chat4.forum_tabs != joVar.D0) {
                        if (ChatObject.isChannel(chat4) || !joVar.B0) {
                            boolean z12 = joVar.f39429t0.forum_tabs != joVar.D0;
                            joVar.getMessagesController().toggleChannelForum(joVar.f39428s0, joVar.B0, joVar.D0);
                            TLRPC.Chat chat5 = joVar.f39429t0;
                            chat5.forum = joVar.B0;
                            chat5.forum_tabs = joVar.D0;
                            if (z12) {
                                joVar.q0();
                            }
                            break;
                        } else {
                            Context parentActivity = joVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.C1;
                            }
                            if (parentActivity == null) {
                                parentActivity = ApplicationLoader.applicationContext;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
                                joVar.J0 = true;
                                b2Var.q(250L);
                                joVar.getMessagesController().convertToMegaGroup(joVar.getParentActivity(), joVar.f39428s0, joVar, new jh.z1(22, joVar, b2Var));
                                break;
                            }
                        }
                    }
                }
                break;
            case 15:
                gi giVar = (gi) this.f2828b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f2829c;
                Long l10 = (Long) obj;
                ((Runnable) obj2).run();
                giVar.f28650f0.setStarsPrice(l10.longValue());
                if (l10.longValue() > 0) {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) l10.longValue(), new Object[0]));
                    giVar.f28642d0.s(l10.longValue());
                } else {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    f1Var.setSubtext(null);
                    giVar.f28642d0.s(0L);
                }
                break;
            case 16:
                in inVar = (in) this.f2828b;
                zg.e eVar = (zg.e) this.f2829c;
                inVar.getClass();
                inVar.V((ah.e) eVar, true);
                break;
            case 17:
                fs fsVar = (fs) this.f2828b;
                TLRPC.TL_contacts_search tL_contacts_search = (TLRPC.TL_contacts_search) this.f2829c;
                TLRPC.TL_contacts_found tL_contacts_found4 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList9 = fsVar.O;
                ArrayList arrayList10 = fsVar.N;
                int i24 = fsVar.J;
                if (TextUtils.equals(tL_contacts_search.f22426q, fsVar.f28441a0) && !TextUtils.isEmpty(fsVar.f28441a0)) {
                    fsVar.W = false;
                    if (tL_contacts_found4 != null) {
                        MessagesStorage.getInstance(i24).putUsersAndChats(tL_contacts_found4.users, tL_contacts_found4.chats, true, true);
                        MessagesController.getInstance(i24).putUsers(tL_contacts_found4.users, false);
                        MessagesController.getInstance(i24).putChats(tL_contacts_found4.chats, false);
                        tL_contacts_found2 = tL_contacts_found4;
                    }
                    HashSet hashSet = new HashSet();
                    arrayList10.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList11 = tL_contacts_found2.my_results;
                        int size3 = arrayList11.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            TLRPC.Peer peer = arrayList11.get(i25);
                            i25++;
                            TLRPC.Peer peer2 = peer;
                            if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(i24).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.f22527id))) {
                                hashSet.add(Long.valueOf(user2.f22527id));
                                arrayList10.add(user2);
                            }
                        }
                    }
                    arrayList9.clear();
                    if (tL_contacts_found2 != null) {
                        ArrayList<TLRPC.Peer> arrayList12 = tL_contacts_found2.results;
                        int size4 = arrayList12.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            TLRPC.Peer peer3 = arrayList12.get(i26);
                            i26++;
                            TLRPC.Peer peer4 = peer3;
                            if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(i24).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.f22527id))) {
                                hashSet.add(Long.valueOf(user.f22527id));
                                arrayList9.add(user);
                            }
                        }
                    }
                    zk0 zk0Var = fsVar.d;
                    if (zk0Var != null) {
                        zk0Var.u0(0);
                    }
                    fsVar.N(true);
                    break;
                }
                break;
            case 18:
                hs hsVar = (hs) this.f2828b;
                TLRPC.TL_contacts_search tL_contacts_search2 = (TLRPC.TL_contacts_search) this.f2829c;
                TLRPC.TL_contacts_found tL_contacts_found5 = (TLRPC.TL_contacts_found) obj;
                ArrayList arrayList13 = hsVar.O;
                ArrayList arrayList14 = hsVar.N;
                ArrayList arrayList15 = hsVar.M;
                int i27 = hsVar.J;
                if (TextUtils.equals(tL_contacts_search2.f22426q, hsVar.X) && !TextUtils.isEmpty(hsVar.X)) {
                    hsVar.T = false;
                    if (tL_contacts_found5 != null) {
                        MessagesStorage.getInstance(i27).putUsersAndChats(tL_contacts_found5.users, tL_contacts_found5.chats, true, true);
                        MessagesController.getInstance(i27).putUsers(tL_contacts_found5.users, false);
                        MessagesController.getInstance(i27).putChats(tL_contacts_found5.chats, false);
                        tL_contacts_found3 = tL_contacts_found5;
                    }
                    HashSet hashSet2 = new HashSet();
                    arrayList15.clear();
                    if (tL_contacts_found3 != null) {
                        ArrayList<TLRPC.Peer> arrayList16 = tL_contacts_found3.my_results;
                        int size5 = arrayList16.size();
                        int i28 = 0;
                        while (i28 < size5) {
                            TLRPC.Peer peer5 = arrayList16.get(i28);
                            i28++;
                            TLRPC.Peer peer6 = peer5;
                            if ((peer6 instanceof TLRPC.TL_peerChannel) && (chat2 = MessagesController.getInstance(i27).getChat(Long.valueOf(peer6.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                if (!hashSet2.contains(Long.valueOf(chat2.f22380id))) {
                                    hashSet2.add(Long.valueOf(chat2.f22380id));
                                    arrayList15.add(chat2);
                                }
                            }
                        }
                    }
                    arrayList14.clear();
                    String lowerCase = hsVar.X.toLowerCase();
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i27).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null && !cachedChannelRecommendations.chats.isEmpty()) {
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size6 = arrayList17.size();
                        int i29 = 0;
                        while (i29 < size6) {
                            TLObject tLObject = arrayList17.get(i29);
                            i29++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat6 = (TLRPC.Chat) tLObject2;
                                if (ChatObject.isChannelAndNotMegaGroup(chat6)) {
                                    tL_contacts_found = tL_contacts_found3;
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i27).getChat(Long.valueOf(chat6.f22380id));
                                    if (ChatObject.isNotInChat(chat6) && (chat7 == null || ChatObject.isNotInChat(chat7))) {
                                        String lowerCase2 = chat6.title.toLowerCase();
                                        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                                        if ((lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe2)) && !hashSet2.contains(Long.valueOf(chat6.f22380id))) {
                                            hashSet2.add(Long.valueOf(chat6.f22380id));
                                            arrayList14.add(chat6);
                                        }
                                    }
                                }
                            } else {
                                tL_contacts_found = tL_contacts_found3;
                            }
                            tL_contacts_found3 = tL_contacts_found;
                        }
                    }
                    TLRPC.TL_contacts_found tL_contacts_found6 = tL_contacts_found3;
                    arrayList13.clear();
                    if (tL_contacts_found6 != null) {
                        ArrayList<TLRPC.Peer> arrayList18 = tL_contacts_found6.results;
                        int size7 = arrayList18.size();
                        int i30 = 0;
                        while (i30 < size7) {
                            TLRPC.Peer peer7 = arrayList18.get(i30);
                            i30++;
                            TLRPC.Peer peer8 = peer7;
                            if ((peer8 instanceof TLRPC.TL_peerChannel) && (chat = MessagesController.getInstance(i27).getChat(Long.valueOf(peer8.channel_id))) != null && ChatObject.isChannelAndNotMegaGroup(chat) && !hashSet2.contains(Long.valueOf(chat.f22380id))) {
                                hashSet2.add(Long.valueOf(chat.f22380id));
                                arrayList13.add(chat);
                            }
                        }
                    }
                    hsVar.N(true);
                    break;
                }
                break;
            case 19:
                b31.m((b31) this.f2828b, (TLRPC.TL_textWithEntities) this.f2829c, (TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                break;
            case 20:
                s50.r((s50) this.f2828b, (ChatObject.Call) this.f2829c, (Boolean) obj, (HashSet) obj2);
                break;
            case 21:
                ob0 ob0Var = (ob0) this.f2828b;
                String str2 = (String) this.f2829c;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                ob0Var.a();
                if (passkeys != null) {
                    ob0Var.n(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(str2)) {
                        ob0Var.o("addPasskeyRow");
                    }
                    break;
                }
                break;
            case 22:
                ob0 ob0Var2 = (ob0) this.f2828b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f2829c;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ob0Var2.a();
                if (tL_error == null) {
                    tk0.b(ob0Var2.d, ob0Var2.f41051b, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
                } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    ob0.b().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                } else {
                    ob0.b().d0(tL_error, false);
                }
                break;
            case 23:
                boolean[] zArr = (boolean[]) this.f2828b;
                e3 e3Var = (e3) this.f2829c;
                zArr[0] = true;
                e3Var.dismiss();
                break;
            case 24:
                ((we.d) this.f2828b).b();
                ((ib0) this.f2829c).run((Boolean) obj);
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f2828b;
                rv0 rv0Var = (rv0) this.f2829c;
                Long l11 = (Long) obj;
                Integer num = (Integer) obj2;
                premiumPreviewFragment.getClass();
                if (l11 == null) {
                    tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l11.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    tL_emojiStatusEmpty = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().updateEmojiStatus(tL_emojiStatusEmpty);
                rv0Var.b(l11 == null ? 0L : l11.longValue(), true);
                break;
            case 26:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f2828b;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f2829c;
                String str3 = (String) obj;
                ArrayList arrayList19 = (ArrayList) obj2;
                if (TextUtils.isEmpty(str3)) {
                    z0Var.v("prepared_message_sent", null);
                    org.telegram.ui.web.f0 f0Var = z0Var.f44061c;
                    if (f0Var != null) {
                        f0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new zh1(i12, botWebViewContainer$BotWebViewProxy, arrayList19), 500L);
                } else {
                    z0Var.v("prepared_message_failed", org.telegram.ui.web.z0.x(str3, "error"));
                }
                break;
            default:
                zg.s sVar = (zg.s) this.f2828b;
                String str4 = (String) this.f2829c;
                TL_account.webPagePreview webpagepreview2 = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i31 = sVar.f50860a;
                if (webpagepreview2 != null) {
                    MessagesController.getInstance(i31).putUsers(webpagepreview2.users, false);
                    MessagesController.getInstance(i31).putChats(webpagepreview2.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview2.media;
                    if (messageMedia2 != null) {
                        webPage = messageMedia2.webpage;
                    }
                }
                sVar.f50861b.put(str4, webPage);
                ArrayList arrayList20 = (ArrayList) sVar.f50862c.remove(str4);
                if (arrayList20 != null) {
                    int size8 = arrayList20.size();
                    while (i13 < size8) {
                        Object obj5 = arrayList20.get(i13);
                        i13++;
                        ((Utilities.Callback2) obj5).run(webPage, tL_error2);
                    }
                }
                break;
        }
    }
}
