package jh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.y9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ra1;

public final class y4 extends yk0 {

    public final ArrayList f14152c = new ArrayList();
    public final c5 d;

    public y4(c5 c5Var) {
        this.d = c5Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    public final void E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f14152c;
        arrayList3.clear();
        c5 c5Var = this.d;
        b5 b5Var = c5Var.A;
        int i10 = 0;
        if (c5Var.M) {
            arrayList3.add(new t4(0));
            arrayList3.add(new t4(6));
        } else {
            arrayList3.add(new t4(0));
            if (b5Var != null) {
                o4 o4Var = b5Var.f13117s;
                boolean z10 = b5Var.f13108j;
                if (b5Var.b() > 0 || (!z10 && (b5Var.f13104e || b5Var.f13111m))) {
                    if (b5Var != null) {
                        arrayList = b5Var.f13106g;
                        arrayList2 = b5Var.f13107i;
                        if (b5Var.f13105f) {
                            while (i10 < arrayList2.size()) {
                                arrayList3.add(new t4((TL_stories.StoryReaction) arrayList2.get(i10)));
                                i10++;
                            }
                        } else {
                            while (i10 < arrayList.size()) {
                                arrayList3.add(new t4((TL_stories.StoryView) arrayList.get(i10)));
                                i10++;
                            }
                        }
                    }
                    if (b5Var == null && (b5Var.f13104e || b5Var.f13111m)) {
                        if (b5Var.b() <= 0) {
                            arrayList3.add(new t4(6));
                        } else {
                            arrayList3.add(new t4(4));
                        }
                    } else if (b5Var == null && b5Var.f13109k) {
                        arrayList3.add(new t4(11));
                    } else if (b5Var != null) {
                        o4 o4Var2 = b5Var.f13117s;
                        if (b5Var.b() < b5Var.f13101a && TextUtils.isEmpty(o4Var2.f13747c) && !o4Var2.f13746b) {
                            arrayList3.add(new t4(12));
                        }
                    }
                } else if (!TextUtils.isEmpty(o4Var.f13747c)) {
                    arrayList3.add(new t4(7));
                } else if (z10) {
                    arrayList3.add(new t4(5));
                } else {
                    int i11 = b5Var.f13101a;
                    if (i11 > 0 && o4Var.f13746b) {
                        arrayList3.add(new t4(8));
                    } else if (i11 > 0) {
                        arrayList3.add(new t4(10));
                    } else {
                        arrayList3.add(new t4(5));
                    }
                }
            } else {
                if (b5Var != null) {
                    arrayList = b5Var.f13106g;
                    arrayList2 = b5Var.f13107i;
                    if (b5Var.f13105f) {
                        while (i10 < arrayList2.size()) {
                            arrayList3.add(new t4((TL_stories.StoryReaction) arrayList2.get(i10)));
                            i10++;
                        }
                    } else {
                        while (i10 < arrayList.size()) {
                            arrayList3.add(new t4((TL_stories.StoryView) arrayList.get(i10)));
                            i10++;
                        }
                    }
                }
                if (b5Var == null) {
                    if (b5Var == null) {
                        if (b5Var != null) {
                            o4 o4Var3 = b5Var.f13117s;
                            if (b5Var.b() < b5Var.f13101a) {
                                arrayList3.add(new t4(12));
                            }
                        }
                    } else if (b5Var != null) {
                        o4 o4Var4 = b5Var.f13117s;
                        if (b5Var.b() < b5Var.f13101a) {
                            arrayList3.add(new t4(12));
                        }
                    }
                } else if (b5Var == null) {
                    if (b5Var != null) {
                        o4 o4Var5 = b5Var.f13117s;
                        if (b5Var.b() < b5Var.f13101a) {
                            arrayList3.add(new t4(12));
                        }
                    }
                } else if (b5Var != null) {
                    o4 o4Var6 = b5Var.f13117s;
                    if (b5Var.b() < b5Var.f13101a) {
                        arrayList3.add(new t4(12));
                    }
                }
            }
        }
        arrayList3.add(new t4(9));
        l();
    }

    @Override
    public final int h() {
        return this.f14152c.size();
    }

    @Override
    public final int j(int i10) {
        return ((t4) this.f14152c.get(i10)).f13996a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Peer tL_peerUser;
        TLRPC.Message message;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        c5 c5Var = this.d;
        int i14 = c5Var.v;
        if (o1Var.f5793f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.f14152c;
        if (i10 >= arrayList.size()) {
            return;
        }
        t4 t4Var = (t4) arrayList.get(i10);
        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) o1Var.f5789a;
        TL_stories.StoryView storyView = t4Var.f13997b;
        TL_stories.StoryReaction storyReaction = t4Var.f13998c;
        if (storyView != null) {
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                tL_peerUser = storyView.peer_id;
            } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward) || (message2 = storyView.message) == null) {
                tL_peerUser = new TLRPC.TL_peerUser();
                tL_peerUser.user_id = storyView.user_id;
            } else {
                tL_peerUser = message2.peer_id;
            }
        } else if (storyReaction != null) {
            tL_peerUser = storyReaction.peer_id;
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                tL_peerUser = message.peer_id;
            }
        } else {
            tL_peerUser = null;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_peerUser);
        if (peerDialogId >= 0) {
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
            chat = null;
        } else {
            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
            user = null;
        }
        boolean zRemove = c5Var.B.f13114p.remove(Long.valueOf(peerDialogId));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            boolean z10 = (reaction == null || (str2 = ig.q0.d(reaction).f11412f) == null || !str2.equals("❤")) ? false : true;
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i13 = 12;
                k6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, zRemove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    TLRPC.Message message3 = storyView.message;
                    long j10 = message3 != null ? message3.date : 0L;
                    j5 j5Var = c5Var.f13160y;
                    k6Var.c(user3, null, null, z10, j10, j5Var == null ? null : j5Var.f13532a, true, true, zRemove);
                } else {
                    k6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, zRemove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((t4) arrayList.get(i10 + 1)).f13996a : -1;
            k6Var.f24585a = i15 == 1 || i15 == i12 || i15 == i13;
            k6Var.a(c5Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = ig.q0.d(reaction2).f11412f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                k6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, zRemove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    k6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, zRemove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    TLRPC.Message message4 = storyReaction.message;
                    long j11 = message4 != null ? message4.date : 0L;
                    j5 j5Var2 = c5Var.f13160y;
                    k6Var.c(user4, chat, null, false, j11, j5Var2 == null ? null : j5Var2.f13532a, true, true, zRemove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((t4) arrayList.get(i10 + 1)).f13996a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            k6Var.f24585a = z12;
            k6Var.a(1.0f, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View v4Var;
        final c5 c5Var = this.d;
        int i12 = c5Var.v;
        b bVar = c5Var.f13157s;
        final int i13 = 1;
        final int i14 = 0;
        switch (i10) {
            case 0:
                v4Var = new v4(this, c5Var.getContext(), i14);
                break;
            case 1:
                lb0 lb0Var = org.telegram.ui.Cells.k6.C;
                v4Var = new w4(i12, c5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                v4Var = new v4(this, c5Var.getContext(), i13);
                break;
            case 3:
                v4Var = new org.telegram.ui.Cells.q3(c5Var.getContext(), 70);
                break;
            case 4:
                h00 h00Var = new h00(c5Var.getContext(), bVar);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(28);
                h00Var.f28887w = false;
                v4Var = h00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (c5Var.B.f13108j) {
                    i11 = 12;
                } else {
                    i11 = (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0;
                }
                x4 x4Var = new x4(i11, c5Var.getContext(), bVar, this);
                eh.s sVar = x4Var.d;
                if (i10 == 7) {
                    sVar.setVisibility(8);
                    x4Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    sVar.setVisibility(8);
                    x4Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    sVar.setVisibility(0);
                    sVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    x4Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (c5Var.B.f13108j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean zPremiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    p80 p80Var = x4Var.f29506e;
                    if (!zPremiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        c5.a(c5Var);
                                        break;
                                    default:
                                        c5.a(c5Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) p80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(x4Var.getContext());
                        textView.setText(string);
                        int i15 = org.telegram.ui.ActionBar.g6.Sh;
                        org.telegram.ui.ActionBar.c6 c6Var = x4Var.f29508n;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        ag.d dVar = new ag.d(x4Var.getContext(), 18);
                        dVar.setOnClickListener(new l70(runnable, 19));
                        int iDp = AndroidUtilities.dp(8.0f);
                        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
                        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i15, c6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iK, iK));
                        h7.b6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        ra1 ra1Var = x4Var.f29503a;
                        ra1Var.setClipChildren(false);
                        ra1Var.addView(dVar, h7.z5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p80Var.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (c5Var.B.f13105f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                x4Var.e(false, false);
                v4Var = x4Var;
                break;
            case 6:
                h00 h00Var2 = new h00(c5Var.getContext(), bVar);
                h00Var2.setIsSingleCell(true);
                h00Var2.setIgnoreHeightCheck(true);
                h00Var2.setItemsCount(20);
                h00Var2.setViewType(28);
                h00Var2.f28887w = false;
                v4Var = h00Var2;
                break;
            case 11:
            case 12:
                p80 p80Var2 = new p80(c5Var.getContext(), null);
                p80Var2.setTextSize(1, 13.0f);
                p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, bVar));
                p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, bVar));
                int iDp2 = AndroidUtilities.dp(16.0f);
                int iDp3 = AndroidUtilities.dp(21.0f);
                p80Var2.setPadding(iDp3, iDp2, iDp3, iDp2);
                p80Var2.setMaxLines(Integer.MAX_VALUE);
                p80Var2.setGravity(17);
                p80Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new y9(this, 15)));
                } else {
                    p80Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                p80Var2.setLayoutParams(new f2.y0(-1, -2));
                v4Var = p80Var2;
                break;
        }
        return new lk0(v4Var);
    }
}
