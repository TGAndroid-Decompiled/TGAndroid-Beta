package ai;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ub1;
public final class e7 extends vl0 {
    public final ArrayList f851c = new ArrayList();
    public final k7 d;

    public e7(k7 k7Var) {
        this.d = k7Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42963f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f851c;
        arrayList.clear();
        k7 k7Var = this.d;
        j7 j7Var = k7Var.E;
        int i10 = 0;
        if (k7Var.Q) {
            arrayList.add(new z6(0));
            arrayList.add(new z6(6));
        } else {
            arrayList.add(new z6(0));
            if (j7Var != null) {
                u6 u6Var = j7Var.f1048s;
                boolean z10 = j7Var.f1039j;
                if (j7Var.b() <= 0 && (z10 || (!j7Var.e && !j7Var.f1042m))) {
                    if (!TextUtils.isEmpty(u6Var.f1579c)) {
                        arrayList.add(new z6(7));
                    } else if (z10) {
                        arrayList.add(new z6(5));
                    } else {
                        int i11 = j7Var.f1033a;
                        if (i11 > 0 && u6Var.f1578b) {
                            arrayList.add(new z6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new z6(10));
                        } else {
                            arrayList.add(new z6(5));
                        }
                    }
                }
            }
            if (j7Var != null) {
                ArrayList arrayList2 = j7Var.f1037g;
                ArrayList arrayList3 = j7Var.f1038i;
                if (j7Var.f1036f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new z6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new z6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (j7Var != null && (j7Var.e || j7Var.f1042m)) {
                if (j7Var.b() <= 0) {
                    arrayList.add(new z6(6));
                } else {
                    arrayList.add(new z6(4));
                }
            } else if (j7Var != null && j7Var.f1040k) {
                arrayList.add(new z6(11));
            } else if (j7Var != null) {
                u6 u6Var2 = j7Var.f1048s;
                if (j7Var.b() < j7Var.f1033a && TextUtils.isEmpty(u6Var2.f1579c) && !u6Var2.f1578b) {
                    arrayList.add(new z6(12));
                }
            }
        }
        arrayList.add(new z6(9));
        l();
    }

    @Override
    public final int h() {
        return this.f851c.size();
    }

    @Override
    public final int j(int i10) {
        return ((z6) this.f851c.get(i10)).f1779a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        long j10;
        TL_stories.StoryItem storyItem;
        int i12;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j11;
        boolean z11;
        int i13;
        int i14;
        TLRPC.Reaction reaction2;
        long j12;
        TL_stories.StoryItem storyItem2;
        int i15;
        boolean z12;
        float f7;
        String str2;
        TLRPC.Message message2;
        k7 k7Var = this.d;
        int i16 = k7Var.v;
        if (c1Var.f42963f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f851c;
            if (i10 < arrayList.size()) {
                z6 z6Var = (z6) arrayList.get(i10);
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) c1Var.f42960a;
                TL_stories.StoryView storyView = z6Var.f1780b;
                TL_stories.StoryReaction storyReaction = z6Var.f1781c;
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
                    j3 = peerDialogId;
                    chat = null;
                } else {
                    j3 = peerDialogId;
                    chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    user = null;
                }
                boolean remove = k7Var.F.f1045p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = zg.o0.d(reaction3).f49396f) != null && str2.equals("❤")) {
                        j11 = 0;
                        z11 = true;
                    } else {
                        j11 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i14 = 12;
                        o6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i13 = 11;
                        i14 = 12;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j12 = message3.date;
                            } else {
                                j12 = j11;
                            }
                            r7 r7Var = k7Var.f1137y;
                            if (r7Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = r7Var.f1468a;
                            }
                            o6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
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
                        i15 = ((z6) arrayList.get(i10 + 1)).f1779a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    o6Var.f20760a = z12;
                    if (k7Var.d(storyView)) {
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
                        if (reaction4 != null && (str = zg.o0.d(reaction4).f49396f) != null && str.equals("❤")) {
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
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            r7 r7Var2 = k7Var.f1137y;
                            if (r7Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = r7Var2.f1468a;
                            }
                            o6Var.c(user4, chat, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((z6) arrayList.get(i10 + 1)).f1779a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    o6Var.f20760a = z13;
                    o6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        n90 n90Var;
        final k7 k7Var = this.d;
        int i12 = k7Var.v;
        d dVar = k7Var.f1134s;
        switch (i10) {
            case 0:
                n90Var = new b7(this, k7Var.getContext(), 0);
                break;
            case 1:
                lc0 lc0Var = org.telegram.ui.Cells.o6.G;
                n90Var = new c7(i12, dVar, this, k7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                n90Var = new b7(this, k7Var.getContext(), 1);
                break;
            case 3:
                n90Var = new org.telegram.ui.Cells.t3(k7Var.getContext(), 70);
                break;
            case 4:
                u00 u00Var = new u00(k7Var.getContext(), dVar);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(28);
                u00Var.f28661w = false;
                n90Var = u00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (k7Var.F.f1039j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                d7 d7Var = new d7(i11, dVar, this, k7Var.getContext());
                vh.n nVar = d7Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    d7Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (k7Var.F.f1039j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    n90 n90Var2 = d7Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        k7.a(k7Var);
                                        return;
                                    default:
                                        k7.a(k7Var);
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
                                        k7.a(k7Var);
                                        return;
                                    default:
                                        k7.a(k7Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) n90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(d7Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.h6.Sh;
                        org.telegram.ui.ActionBar.d6 d6Var = d7Var.f25192n;
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        w5 w5Var = new w5(d7Var.getContext(), 19);
                        w5Var.setOnClickListener(new i80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), 30);
                        w5Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.a6.b(w5Var, 0.05f, 1.5f);
                        w5Var.addView(textView);
                        ub1 ub1Var = d7Var.f25188a;
                        ub1Var.setClipChildren(false);
                        ub1Var.addView(w5Var, w7.y5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    n90Var2.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (k7Var.F.f1036f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                d7Var.e(false, false);
                n90Var = d7Var;
                break;
            case 6:
                u00 u00Var2 = new u00(k7Var.getContext(), dVar);
                u00Var2.setIsSingleCell(true);
                u00Var2.setIgnoreHeightCheck(true);
                u00Var2.setItemsCount(20);
                u00Var2.setViewType(28);
                u00Var2.f28661w = false;
                n90Var = u00Var2;
                break;
            case 11:
            case 12:
                n90 n90Var3 = new n90(k7Var.getContext(), null);
                n90Var3.setTextSize(1, 13.0f);
                n90Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19442y6, dVar));
                n90Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, dVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                n90Var3.setPadding(dp3, dp2, dp3, dp2);
                n90Var3.setMaxLines(Integer.MAX_VALUE);
                n90Var3.setGravity(17);
                n90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    n90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 10)));
                } else {
                    n90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                n90Var3.setLayoutParams(new s4.p0(-1, -2));
                n90Var = n90Var3;
                break;
        }
        return new s4.c1(n90Var);
    }
}
