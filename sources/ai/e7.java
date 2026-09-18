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
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.bc1;
public final class e7 extends vl0 {
    public final ArrayList f769c = new ArrayList();
    public final j7 d;

    public e7(j7 j7Var) {
        this.d = j7Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f769c;
        arrayList.clear();
        j7 j7Var = this.d;
        i7 i7Var = j7Var.E;
        int i10 = 0;
        if (j7Var.Q) {
            arrayList.add(new z6(0));
            arrayList.add(new z6(6));
        } else {
            arrayList.add(new z6(0));
            if (i7Var != null) {
                u6 u6Var = i7Var.f1010s;
                boolean z10 = i7Var.f1001j;
                if (i7Var.b() <= 0 && (z10 || (!i7Var.e && !i7Var.f1004m))) {
                    if (!TextUtils.isEmpty(u6Var.f1580c)) {
                        arrayList.add(new z6(7));
                    } else if (z10) {
                        arrayList.add(new z6(5));
                    } else {
                        int i11 = i7Var.f995a;
                        if (i11 > 0 && u6Var.f1579b) {
                            arrayList.add(new z6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new z6(10));
                        } else {
                            arrayList.add(new z6(5));
                        }
                    }
                }
            }
            if (i7Var != null) {
                ArrayList arrayList2 = i7Var.f999g;
                ArrayList arrayList3 = i7Var.f1000i;
                if (i7Var.f998f) {
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
            if (i7Var != null && (i7Var.e || i7Var.f1004m)) {
                if (i7Var.b() <= 0) {
                    arrayList.add(new z6(6));
                } else {
                    arrayList.add(new z6(4));
                }
            } else if (i7Var != null && i7Var.f1002k) {
                arrayList.add(new z6(11));
            } else if (i7Var != null) {
                u6 u6Var2 = i7Var.f1010s;
                if (i7Var.b() < i7Var.f995a && TextUtils.isEmpty(u6Var2.f1580c) && !u6Var2.f1579b) {
                    arrayList.add(new z6(12));
                }
            }
        }
        arrayList.add(new z6(9));
        l();
    }

    @Override
    public final int h() {
        return this.f769c.size();
    }

    @Override
    public final int j(int i10) {
        return ((z6) this.f769c.get(i10)).f1785a;
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
        j7 j7Var = this.d;
        int i16 = j7Var.v;
        if (c1Var.f42932f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f769c;
            if (i10 < arrayList.size()) {
                z6 z6Var = (z6) arrayList.get(i10);
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) c1Var.f42929a;
                TL_stories.StoryView storyView = z6Var.f1786b;
                TL_stories.StoryReaction storyReaction = z6Var.f1787c;
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
                boolean remove = j7Var.F.f1007p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = zg.o0.d(reaction3).f49377f) != null && str2.equals("❤")) {
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
                            q7 q7Var = j7Var.f1056y;
                            if (q7Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = q7Var.f1430a;
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
                        i15 = ((z6) arrayList.get(i10 + 1)).f1785a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    o6Var.f20724a = z12;
                    if (j7Var.d(storyView)) {
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
                        if (reaction4 != null && (str = zg.o0.d(reaction4).f49377f) != null && str.equals("❤")) {
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
                            q7 q7Var2 = j7Var.f1056y;
                            if (q7Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = q7Var2.f1430a;
                            }
                            o6Var.c(user4, chat, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((z6) arrayList.get(i10 + 1)).f1785a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    o6Var.f20724a = z13;
                    o6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        l90 l90Var;
        final j7 j7Var = this.d;
        int i12 = j7Var.v;
        d dVar = j7Var.f1053s;
        switch (i10) {
            case 0:
                l90Var = new b7(this, j7Var.getContext(), 0);
                break;
            case 1:
                jc0 jc0Var = org.telegram.ui.Cells.o6.G;
                l90Var = new c7(i12, dVar, this, j7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                l90Var = new b7(this, j7Var.getContext(), 1);
                break;
            case 3:
                l90Var = new org.telegram.ui.Cells.t3(j7Var.getContext(), 70);
                break;
            case 4:
                t00 t00Var = new t00(j7Var.getContext(), dVar);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(28);
                t00Var.f28272w = false;
                l90Var = t00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (j7Var.F.f1001j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                d7 d7Var = new d7(i11, dVar, this, j7Var.getContext());
                vh.o oVar = d7Var.d;
                if (i10 == 7) {
                    oVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    oVar.setVisibility(8);
                    d7Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    oVar.setVisibility(0);
                    oVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    d7Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (j7Var.F.f1001j) {
                    oVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    l90 l90Var2 = d7Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        j7.a(j7Var);
                                        return;
                                    default:
                                        j7.a(j7Var);
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
                                        j7.a(j7Var);
                                        return;
                                    default:
                                        j7.a(j7Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) l90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(d7Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.e6 e6Var = d7Var.f25868n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        x5 x5Var = new x5(d7Var.getContext(), 19);
                        x5Var.setOnClickListener(new g80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, e6Var), 30);
                        x5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.a6.b(x5Var, 0.05f, 1.5f);
                        x5Var.addView(textView);
                        bc1 bc1Var = d7Var.f25864a;
                        bc1Var.setClipChildren(false);
                        bc1Var.addView(x5Var, w7.y5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    l90Var2.setText(spannableStringBuilder);
                } else {
                    oVar.setVisibility(0);
                    if (j7Var.F.f998f) {
                        oVar.setText(LocaleController.getString(R.string.NoReactions));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        oVar.setText(LocaleController.getString(R.string.NoViews));
                        d7Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                d7Var.e(false, false);
                l90Var = d7Var;
                break;
            case 6:
                t00 t00Var2 = new t00(j7Var.getContext(), dVar);
                t00Var2.setIsSingleCell(true);
                t00Var2.setIgnoreHeightCheck(true);
                t00Var2.setItemsCount(20);
                t00Var2.setViewType(28);
                t00Var2.f28272w = false;
                l90Var = t00Var2;
                break;
            case 11:
            case 12:
                l90 l90Var3 = new l90(j7Var.getContext(), null);
                l90Var3.setTextSize(1, 13.0f);
                l90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19445y6, dVar));
                l90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, dVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                l90Var3.setPadding(dp3, dp2, dp3, dp2);
                l90Var3.setMaxLines(Integer.MAX_VALUE);
                l90Var3.setGravity(17);
                l90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    l90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 10)));
                } else {
                    l90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                l90Var3.setLayoutParams(new s4.p0(-1, -2));
                l90Var = l90Var3;
                break;
        }
        return new s4.c1(l90Var);
    }
}
