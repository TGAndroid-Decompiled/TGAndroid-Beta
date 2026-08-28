package ih;

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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.ta1;
public final class c5 extends vk0 {
    public final ArrayList f11289c = new ArrayList();
    public final g5 d;

    public c5(g5 g5Var) {
        this.d = g5Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f11289c;
        arrayList.clear();
        g5 g5Var = this.d;
        f5 f5Var = g5Var.A;
        int i9 = 0;
        if (g5Var.M) {
            arrayList.add(new x4(0));
            arrayList.add(new x4(6));
        } else {
            arrayList.add(new x4(0));
            if (f5Var != null) {
                s4 s4Var = f5Var.f11448s;
                boolean z10 = f5Var.f11439j;
                if (f5Var.b() <= 0 && (z10 || (!f5Var.f11435e && !f5Var.f11442m))) {
                    if (!TextUtils.isEmpty(s4Var.f12117c)) {
                        arrayList.add(new x4(7));
                    } else if (z10) {
                        arrayList.add(new x4(5));
                    } else {
                        int i10 = f5Var.f11432a;
                        if (i10 > 0 && s4Var.f12116b) {
                            arrayList.add(new x4(8));
                        } else if (i10 > 0) {
                            arrayList.add(new x4(10));
                        } else {
                            arrayList.add(new x4(5));
                        }
                    }
                }
            }
            if (f5Var != null) {
                ArrayList arrayList2 = f5Var.f11437g;
                ArrayList arrayList3 = f5Var.f11438i;
                if (f5Var.f11436f) {
                    while (i9 < arrayList3.size()) {
                        arrayList.add(new x4((TL_stories.StoryReaction) arrayList3.get(i9)));
                        i9++;
                    }
                } else {
                    while (i9 < arrayList2.size()) {
                        arrayList.add(new x4((TL_stories.StoryView) arrayList2.get(i9)));
                        i9++;
                    }
                }
            }
            if (f5Var != null && (f5Var.f11435e || f5Var.f11442m)) {
                if (f5Var.b() <= 0) {
                    arrayList.add(new x4(6));
                } else {
                    arrayList.add(new x4(4));
                }
            } else if (f5Var != null && f5Var.f11440k) {
                arrayList.add(new x4(11));
            } else if (f5Var != null) {
                s4 s4Var2 = f5Var.f11448s;
                if (f5Var.b() < f5Var.f11432a && TextUtils.isEmpty(s4Var2.f12117c) && !s4Var2.f12116b) {
                    arrayList.add(new x4(12));
                }
            }
        }
        arrayList.add(new x4(9));
        l();
    }

    @Override
    public final int h() {
        return this.f11289c.size();
    }

    @Override
    public final int j(int i9) {
        return ((x4) this.f11289c.get(i9)).f12319a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        long j11;
        TL_stories.StoryItem storyItem;
        int i11;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j12;
        boolean z11;
        int i12;
        int i13;
        TLRPC.Reaction reaction2;
        long j13;
        TL_stories.StoryItem storyItem2;
        int i14;
        boolean z12;
        float f10;
        String str2;
        TLRPC.Message message2;
        g5 g5Var = this.d;
        int i15 = g5Var.v;
        if (q1Var.f5505f == 1 && i9 >= 0) {
            ArrayList arrayList = this.f11289c;
            if (i9 < arrayList.size()) {
                x4 x4Var = (x4) arrayList.get(i9);
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) q1Var.f5501a;
                TL_stories.StoryView storyView = x4Var.f12320b;
                TL_stories.StoryReaction storyReaction = x4Var.f12321c;
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
                    user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                    j10 = peerDialogId;
                    chat = null;
                } else {
                    j10 = peerDialogId;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                    user = null;
                }
                boolean remove = g5Var.B.f11445p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = hg.r0.d(reaction3).f10717f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z11 = true;
                    } else {
                        j12 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i12 = 11;
                        i13 = 12;
                        n6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i12 = 11;
                        i13 = 12;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j13 = message3.date;
                            } else {
                                j13 = j12;
                            }
                            n5 n5Var = g5Var.f11485y;
                            if (n5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = n5Var.f11843a;
                            }
                            n6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            n6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i9 < arrayList.size() - 1) {
                        i14 = ((x4) arrayList.get(i9 + 1)).f12319a;
                    } else {
                        i14 = -1;
                    }
                    if (i14 != 1 && i14 != i12 && i14 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    n6Var.f24761a = z12;
                    if (g5Var.d(storyView)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    n6Var.a(f10, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = hg.r0.d(reaction4).f10717f) != null && str.equals("❤")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i10 = 12;
                        n6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i10 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            n5 n5Var2 = g5Var.f11485y;
                            if (n5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = n5Var2.f11843a;
                            }
                            n6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i9 < arrayList.size() - 1) {
                        i11 = ((x4) arrayList.get(i9 + 1)).f12319a;
                    } else {
                        i11 = -1;
                    }
                    if (i11 != 1 && i11 != 11 && i11 != i10) {
                        z13 = false;
                    }
                    n6Var.f24761a = z13;
                    n6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        l80 l80Var;
        final g5 g5Var = this.d;
        int i11 = g5Var.v;
        b bVar = g5Var.f11482s;
        switch (i9) {
            case 0:
                l80Var = new z4(this, g5Var.getContext(), 0);
                break;
            case 1:
                hb0 hb0Var = org.telegram.ui.Cells.n6.C;
                l80Var = new a5(i11, g5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                l80Var = new z4(this, g5Var.getContext(), 1);
                break;
            case 3:
                l80Var = new org.telegram.ui.Cells.t3(g5Var.getContext(), 70);
                break;
            case 4:
                e00 e00Var = new e00(g5Var.getContext(), bVar);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(28);
                e00Var.f27885w = false;
                l80Var = e00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (g5Var.B.f11439j) {
                    i10 = 12;
                } else if (i9 != 10 && i9 != 7 && i9 != 8 && i9 != 5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                b5 b5Var = new b5(i10, g5Var.getContext(), bVar, this);
                dh.u uVar = b5Var.d;
                if (i9 == 7) {
                    uVar.setVisibility(8);
                    b5Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i9 == 8) {
                    uVar.setVisibility(8);
                    b5Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i9 == 10) {
                    uVar.setVisibility(0);
                    uVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    b5Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (g5Var.B.f11439j) {
                    uVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    l80 l80Var2 = b5Var.f28885e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        g5.a(g5Var);
                                        return;
                                    default:
                                        g5.a(g5Var);
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
                                        g5.a(g5Var);
                                        return;
                                    default:
                                        g5.a(g5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l80Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(b5Var.getContext());
                        textView.setText(string);
                        int i12 = org.telegram.ui.ActionBar.f6.Sh;
                        org.telegram.ui.ActionBar.b6 b6Var = b5Var.f28887n;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        dh.g gVar = new dh.g(b5Var.getContext(), 18);
                        gVar.setOnClickListener(new h70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), 30);
                        gVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, k10, k10));
                        g7.g6.b(gVar, 0.05f, 1.5f);
                        gVar.addView(textView);
                        ta1 ta1Var = b5Var.f28882a;
                        ta1Var.setClipChildren(false);
                        ta1Var.addView(gVar, g7.e6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l80Var2.setText(spannableStringBuilder);
                } else {
                    uVar.setVisibility(0);
                    if (g5Var.B.f11436f) {
                        uVar.setText(LocaleController.getString(R.string.NoReactions));
                        b5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        uVar.setText(LocaleController.getString(R.string.NoViews));
                        b5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                b5Var.e(false, false);
                l80Var = b5Var;
                break;
            case 6:
                e00 e00Var2 = new e00(g5Var.getContext(), bVar);
                e00Var2.setIsSingleCell(true);
                e00Var2.setIgnoreHeightCheck(true);
                e00Var2.setItemsCount(20);
                e00Var2.setViewType(28);
                e00Var2.f27885w = false;
                l80Var = e00Var2;
                break;
            case 11:
            case 12:
                l80 l80Var3 = new l80(g5Var.getContext(), null);
                l80Var3.setTextSize(1, 13.0f);
                l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, bVar));
                l80Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                l80Var3.setPadding(dp3, dp2, dp3, dp2);
                l80Var3.setMaxLines(Integer.MAX_VALUE);
                l80Var3.setGravity(17);
                l80Var3.setDisablePaddingsOffsetY(true);
                if (i9 == 11) {
                    l80Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new g(this, 8)));
                } else {
                    l80Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                l80Var3.setLayoutParams(new f2.a1(-1, -2));
                l80Var = l80Var3;
                break;
        }
        return new f2.q1(l80Var);
    }
}
