package lh;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ua1;
public final class y4 extends il0 {
    public final ArrayList f16417c = new ArrayList();
    public final c5 d;

    public y4(c5 c5Var) {
        this.d = c5Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f16417c;
        arrayList.clear();
        c5 c5Var = this.d;
        b5 b5Var = c5Var.A;
        int i10 = 0;
        if (c5Var.M) {
            arrayList.add(new t4(0));
            arrayList.add(new t4(6));
        } else {
            arrayList.add(new t4(0));
            if (b5Var != null) {
                o4 o4Var = b5Var.f15399s;
                boolean z10 = b5Var.f15390j;
                if (b5Var.b() <= 0 && (z10 || (!b5Var.f15386e && !b5Var.f15393m))) {
                    if (!TextUtils.isEmpty(o4Var.f16019c)) {
                        arrayList.add(new t4(7));
                    } else if (z10) {
                        arrayList.add(new t4(5));
                    } else {
                        int i11 = b5Var.f15383a;
                        if (i11 > 0 && o4Var.f16018b) {
                            arrayList.add(new t4(8));
                        } else if (i11 > 0) {
                            arrayList.add(new t4(10));
                        } else {
                            arrayList.add(new t4(5));
                        }
                    }
                }
            }
            if (b5Var != null) {
                ArrayList arrayList2 = b5Var.f15388g;
                ArrayList arrayList3 = b5Var.f15389i;
                if (b5Var.f15387f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new t4((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new t4((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (b5Var != null && (b5Var.f15386e || b5Var.f15393m)) {
                if (b5Var.b() <= 0) {
                    arrayList.add(new t4(6));
                } else {
                    arrayList.add(new t4(4));
                }
            } else if (b5Var != null && b5Var.f15391k) {
                arrayList.add(new t4(11));
            } else if (b5Var != null) {
                o4 o4Var2 = b5Var.f15399s;
                if (b5Var.b() < b5Var.f15383a && TextUtils.isEmpty(o4Var2.f16019c) && !o4Var2.f16018b) {
                    arrayList.add(new t4(12));
                }
            }
        }
        arrayList.add(new t4(9));
        l();
    }

    @Override
    public final int h() {
        return this.f16417c.size();
    }

    @Override
    public final int j(int i10) {
        return ((t4) this.f16417c.get(i10)).f16261a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
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
        float f9;
        String str2;
        TLRPC.Message message2;
        c5 c5Var = this.d;
        int i16 = c5Var.v;
        if (n1Var.f6436f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f16417c;
            if (i10 < arrayList.size()) {
                t4 t4Var = (t4) arrayList.get(i10);
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) n1Var.f6432a;
                TL_stories.StoryView storyView = t4Var.f16262b;
                TL_stories.StoryReaction storyReaction = t4Var.f16263c;
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
                boolean remove = c5Var.B.f15396p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = kg.q0.d(reaction3).f13825f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z11 = true;
                    } else {
                        j12 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i14 = 12;
                        l6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i13 = 11;
                        i14 = 12;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j13 = message3.date;
                            } else {
                                j13 = j12;
                            }
                            k5 k5Var = c5Var.f15442y;
                            if (k5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = k5Var.f15830a;
                            }
                            l6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            l6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((t4) arrayList.get(i10 + 1)).f16261a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    l6Var.f24638a = z12;
                    if (c5Var.d(storyView)) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.5f;
                    }
                    l6Var.a(f9, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = kg.q0.d(reaction4).f13825f) != null && str.equals("❤")) {
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
                        l6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            l6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            k5 k5Var2 = c5Var.f15442y;
                            if (k5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = k5Var2.f15830a;
                            }
                            l6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((t4) arrayList.get(i10 + 1)).f16261a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    l6Var.f24638a = z13;
                    l6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        y80 y80Var;
        final c5 c5Var = this.d;
        int i12 = c5Var.v;
        b bVar = c5Var.f15439s;
        switch (i10) {
            case 0:
                y80Var = new v4(this, c5Var.getContext(), 0);
                break;
            case 1:
                wb0 wb0Var = org.telegram.ui.Cells.l6.C;
                y80Var = new w4(i12, c5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                y80Var = new v4(this, c5Var.getContext(), 1);
                break;
            case 3:
                y80Var = new org.telegram.ui.Cells.q3(c5Var.getContext(), 70);
                break;
            case 4:
                p00 p00Var = new p00(c5Var.getContext(), bVar);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(28);
                p00Var.f31529w = false;
                y80Var = p00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (c5Var.B.f15390j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                x4 x4Var = new x4(i11, c5Var.getContext(), bVar, this);
                gh.s sVar = x4Var.d;
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
                } else if (c5Var.B.f15390j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    y80 y80Var2 = x4Var.f32122e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c5.a(c5Var);
                                        return;
                                    default:
                                        c5.a(c5Var);
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
                                        c5.a(c5Var);
                                        return;
                                    default:
                                        c5.a(c5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) y80Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(x4Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.g6.Sh;
                        org.telegram.ui.ActionBar.c6 c6Var = x4Var.f32124n;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        bh.d dVar = new bh.d(x4Var.getContext(), 20);
                        dVar.setOnClickListener(new u70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
                        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k9, k9));
                        i7.h6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        ua1 ua1Var = x4Var.f32119a;
                        ua1Var.setClipChildren(false);
                        ua1Var.addView(dVar, i7.f6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    y80Var2.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (c5Var.B.f15387f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        x4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                x4Var.e(false, false);
                y80Var = x4Var;
                break;
            case 6:
                p00 p00Var2 = new p00(c5Var.getContext(), bVar);
                p00Var2.setIsSingleCell(true);
                p00Var2.setIgnoreHeightCheck(true);
                p00Var2.setItemsCount(20);
                p00Var2.setViewType(28);
                p00Var2.f31529w = false;
                y80Var = p00Var2;
                break;
            case 11:
            case 12:
                y80 y80Var3 = new y80(c5Var.getContext(), null);
                y80Var3.setTextSize(1, 13.0f);
                y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, bVar));
                y80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                y80Var3.setPadding(dp3, dp2, dp3, dp2);
                y80Var3.setMaxLines(Integer.MAX_VALUE);
                y80Var3.setGravity(17);
                y80Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    y80Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new jh.o(this, 29)));
                } else {
                    y80Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                y80Var3.setLayoutParams(new f2.x0(-1, -2));
                y80Var = y80Var3;
                break;
        }
        return new f2.n1(y80Var);
    }
}
