package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.ic1;
public final class q6 extends lm0 {
    public final ArrayList f3587c = new ArrayList();
    public final w6 d;

    public q6(w6 w6Var) {
        this.d = w6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f3587c;
        arrayList.clear();
        w6 w6Var = this.d;
        v6 v6Var = w6Var.E;
        int i10 = 0;
        if (w6Var.Q) {
            arrayList.add(new l6(0));
            arrayList.add(new l6(6));
        } else {
            arrayList.add(new l6(0));
            if (v6Var != null) {
                g6 g6Var = v6Var.f3874s;
                boolean z10 = v6Var.f3865j;
                if (v6Var.b() <= 0 && (z10 || (!v6Var.e && !v6Var.f3868m))) {
                    if (!TextUtils.isEmpty(g6Var.f3079c)) {
                        arrayList.add(new l6(7));
                    } else if (z10) {
                        arrayList.add(new l6(5));
                    } else {
                        int i11 = v6Var.f3859a;
                        if (i11 > 0 && g6Var.f3078b) {
                            arrayList.add(new l6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new l6(10));
                        } else {
                            arrayList.add(new l6(5));
                        }
                    }
                }
            }
            if (v6Var != null) {
                ArrayList arrayList2 = v6Var.f3863g;
                ArrayList arrayList3 = v6Var.f3864i;
                if (v6Var.f3862f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new l6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new l6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (v6Var != null && (v6Var.e || v6Var.f3868m)) {
                if (v6Var.b() <= 0) {
                    arrayList.add(new l6(6));
                } else {
                    arrayList.add(new l6(4));
                }
            } else if (v6Var != null && v6Var.f3866k) {
                arrayList.add(new l6(11));
            } else if (v6Var != null) {
                g6 g6Var2 = v6Var.f3874s;
                if (v6Var.b() < v6Var.f3859a && TextUtils.isEmpty(g6Var2.f3079c) && !g6Var2.f3078b) {
                    arrayList.add(new l6(12));
                }
            }
        }
        arrayList.add(new l6(9));
        l();
    }

    @Override
    public final int h() {
        return this.f3587c.size();
    }

    @Override
    public final int j(int i10) {
        return ((l6) this.f3587c.get(i10)).f3275a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        long j11;
        TL_stories.StoryItem storyItem;
        int i12;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j12;
        boolean z11;
        int i13;
        int i14;
        TLRPC.Reaction reaction2;
        long j13;
        TL_stories.StoryItem storyItem2;
        int i15;
        boolean z12;
        float f7;
        String str2;
        TLRPC.Message message2;
        w6 w6Var = this.d;
        int i16 = w6Var.v;
        if (b1Var.f44841f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f3587c;
            if (i10 < arrayList.size()) {
                l6 l6Var = (l6) arrayList.get(i10);
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) b1Var.f44838a;
                TL_stories.StoryView storyView = l6Var.f3276b;
                TL_stories.StoryReaction storyReaction = l6Var.f3277c;
                if (storyView != null) {
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        peer = storyView.peer_id;
                    } else if ((storyView instanceof TL_stories.TL_storyViewPublicForward) && (message2 = storyView.message) != null) {
                        peer = message2.peer_id;
                    } else {
                        peer = new TLRPC.TL_peerUser();
                        peer.user_id = storyView.user_id;
                    }
                } else if (storyReaction != null) {
                    peer = storyReaction.peer_id;
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                        peer = message.peer_id;
                    }
                } else {
                    peer = null;
                }
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (peerDialogId >= 0) {
                    user = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                    j10 = peerDialogId;
                    chat = null;
                } else {
                    j10 = peerDialogId;
                    chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    user = null;
                }
                boolean remove = w6Var.F.f3871p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ah.i1.d(reaction3).f779f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z11 = true;
                    } else {
                        j12 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i14 = 11;
                        i13 = 12;
                        o6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i13 = 12;
                        i14 = 11;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j13 = message3.date;
                            } else {
                                j13 = j12;
                            }
                            d7 d7Var = w6Var.f3909y;
                            if (d7Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = d7Var.f2953a;
                            }
                            o6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            o6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((l6) arrayList.get(i10 + 1)).f3275a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i14 && i15 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    o6Var.f21620a = z12;
                    if (w6Var.d(storyView)) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    o6Var.a(f7, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = ah.i1.d(reaction4).f779f) != null && str.equals("❤")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i11 = 12;
                        o6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            o6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            d7 d7Var2 = w6Var.f3909y;
                            if (d7Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = d7Var2.f2953a;
                            }
                            o6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((l6) arrayList.get(i10 + 1)).f3275a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    o6Var.f21620a = z13;
                    o6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        da0 da0Var;
        final w6 w6Var = this.d;
        int i12 = w6Var.v;
        b bVar = w6Var.f3906s;
        switch (i10) {
            case 0:
                da0Var = new n6(this, w6Var.getContext(), 0);
                break;
            case 1:
                bd0 bd0Var = org.telegram.ui.Cells.o6.H;
                da0Var = new o6(i12, w6Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                da0Var = new n6(this, w6Var.getContext(), 1);
                break;
            case 3:
                da0Var = new org.telegram.ui.Cells.t3(w6Var.getContext(), 70);
                break;
            case 4:
                f10 f10Var = new f10(w6Var.getContext(), bVar);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(28);
                f10Var.f24856w = false;
                da0Var = f10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (w6Var.F.f3865j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                p6 p6Var = new p6(i11, w6Var.getContext(), bVar, this);
                wh.n nVar = p6Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    p6Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    p6Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    p6Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (w6Var.F.f3865j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    da0 da0Var2 = p6Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        w6.a(w6Var);
                                        return;
                                    default:
                                        w6.a(w6Var);
                                        return;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        w6.a(w6Var);
                                        return;
                                    default:
                                        w6.a(w6Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) da0Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(p6Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.g6.Sh;
                        org.telegram.ui.ActionBar.c6 c6Var = p6Var.f30999n;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        i5 i5Var = new i5(p6Var.getContext(), 19);
                        i5Var.setOnClickListener(new z80(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(i13, c6Var), 30);
                        i5Var.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
                        w7.c6.b(i5Var, 0.05f, 1.5f);
                        i5Var.addView(textView);
                        ic1 ic1Var = p6Var.f30995a;
                        ic1Var.setClipChildren(false);
                        ic1Var.addView(i5Var, w7.a6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    da0Var2.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (w6Var.F.f3862f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        p6Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        p6Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                p6Var.e(false, false);
                da0Var = p6Var;
                break;
            case 6:
                f10 f10Var2 = new f10(w6Var.getContext(), bVar);
                f10Var2.setIsSingleCell(true);
                f10Var2.setIgnoreHeightCheck(true);
                f10Var2.setItemsCount(20);
                f10Var2.setViewType(28);
                f10Var2.f24856w = false;
                da0Var = f10Var2;
                break;
            case 11:
            case 12:
                da0 da0Var3 = new da0(w6Var.getContext(), null);
                da0Var3.setTextSize(1, 13.0f);
                da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, bVar));
                da0Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                da0Var3.setPadding(dp3, dp2, dp3, dp2);
                da0Var3.setMaxLines(Integer.MAX_VALUE);
                da0Var3.setGravity(17);
                da0Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    da0Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 21)));
                } else {
                    da0Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                da0Var3.setLayoutParams(new s4.o0(-1, -2));
                da0Var = da0Var3;
                break;
        }
        return new s4.b1(da0Var);
    }
}
