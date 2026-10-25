package di;

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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.z90;
import org.telegram.ui.xa1;
public final class o5 extends lm0 {
    public final ArrayList f8879c = new ArrayList();
    public final t5 d;

    public o5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f8879c;
        arrayList.clear();
        t5 t5Var = this.d;
        s5 s5Var = t5Var.E;
        int i10 = 0;
        if (t5Var.Q) {
            arrayList.add(new j5(0));
            arrayList.add(new j5(6));
        } else {
            arrayList.add(new j5(0));
            if (s5Var != null) {
                e5 e5Var = s5Var.f9171s;
                boolean z10 = s5Var.f9162j;
                if (s5Var.b() <= 0 && (z10 || (!s5Var.e && !s5Var.f9165m))) {
                    if (!TextUtils.isEmpty(e5Var.f8521c)) {
                        arrayList.add(new j5(7));
                    } else if (z10) {
                        arrayList.add(new j5(5));
                    } else {
                        int i11 = s5Var.f9156a;
                        if (i11 > 0 && e5Var.f8520b) {
                            arrayList.add(new j5(8));
                        } else if (i11 > 0) {
                            arrayList.add(new j5(10));
                        } else {
                            arrayList.add(new j5(5));
                        }
                    }
                }
            }
            if (s5Var != null) {
                ArrayList arrayList2 = s5Var.f9160g;
                ArrayList arrayList3 = s5Var.f9161i;
                if (s5Var.f9159f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new j5((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new j5((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (s5Var != null && (s5Var.e || s5Var.f9165m)) {
                if (s5Var.b() <= 0) {
                    arrayList.add(new j5(6));
                } else {
                    arrayList.add(new j5(4));
                }
            } else if (s5Var != null && s5Var.f9163k) {
                arrayList.add(new j5(11));
            } else if (s5Var != null) {
                e5 e5Var2 = s5Var.f9171s;
                if (s5Var.b() < s5Var.f9156a && TextUtils.isEmpty(e5Var2.f8521c) && !e5Var2.f8520b) {
                    arrayList.add(new j5(12));
                }
            }
        }
        arrayList.add(new j5(9));
        l();
    }

    @Override
    public final int h() {
        return this.f8879c.size();
    }

    @Override
    public final int j(int i10) {
        return ((j5) this.f8879c.get(i10)).f8695a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
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
        t5 t5Var = this.d;
        int i16 = t5Var.v;
        if (e1Var.f47738f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f8879c;
            if (i10 < arrayList.size()) {
                j5 j5Var = (j5) arrayList.get(i10);
                org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) e1Var.f47735a;
                TL_stories.StoryView storyView = j5Var.f8696b;
                TL_stories.StoryReaction storyReaction = j5Var.f8697c;
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
                boolean remove = t5Var.F.f9168p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = bh.x0.d(reaction3).f4208f) != null && str2.equals("❤")) {
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
                        s6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
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
                            a6 a6Var = t5Var.f9200y;
                            if (a6Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = a6Var.f8373a;
                            }
                            s6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            s6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((j5) arrayList.get(i10 + 1)).f8695a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i14 && i15 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    s6Var.f25390a = z12;
                    if (t5Var.d(storyView)) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    s6Var.a(f7, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = bh.x0.d(reaction4).f4208f) != null && str.equals("❤")) {
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
                        s6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            s6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            a6 a6Var2 = t5Var.f9200y;
                            if (a6Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = a6Var2.f8373a;
                            }
                            s6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((j5) arrayList.get(i10 + 1)).f8695a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    s6Var.f25390a = z13;
                    s6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        z90 z90Var;
        final t5 t5Var = this.d;
        int i12 = t5Var.v;
        b bVar = t5Var.f9197s;
        switch (i10) {
            case 0:
                z90Var = new l5(this, t5Var.getContext(), 0);
                break;
            case 1:
                sc0 sc0Var = org.telegram.ui.Cells.s6.H;
                z90Var = new m5(i12, t5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                z90Var = new l5(this, t5Var.getContext(), 1);
                break;
            case 3:
                z90Var = new org.telegram.ui.Cells.x3(t5Var.getContext(), 70);
                break;
            case 4:
                c10 c10Var = new c10(t5Var.getContext(), bVar);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(28);
                c10Var.f27029w = false;
                z90Var = c10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (t5Var.F.f9162j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                n5 n5Var = new n5(i11, t5Var.getContext(), bVar, this);
                xh.n nVar = n5Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    n5Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    n5Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    n5Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (t5Var.F.f9162j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    z90 z90Var2 = n5Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        t5.a(t5Var);
                                        return;
                                    default:
                                        t5.a(t5Var);
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
                                        t5.a(t5Var);
                                        return;
                                    default:
                                        t5.a(t5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) z90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(n5Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.y6.Sh;
                        org.telegram.ui.ActionBar.u6 u6Var = n5Var.f28016n;
                        org.telegram.ui.ActionBar.f7.V(textView, i13, u6Var);
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        i4 i4Var = new i4(n5Var.getContext(), 18);
                        i4Var.setOnClickListener(new w80(runnable, 17));
                        int dp = AndroidUtilities.dp(8.0f);
                        int i14 = org.telegram.ui.ActionBar.y6.Oh;
                        int w02 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 30);
                        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, o10, o10);
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i13, 30);
                        i4Var.setBackground(j02);
                        org.telegram.ui.ActionBar.f7.k(i4Var, j02, N, h, u6Var);
                        gb1.c(i4Var, 0.05f, 1.5f);
                        i4Var.addView(textView);
                        xa1 xa1Var = n5Var.f28012a;
                        xa1Var.setClipChildren(false);
                        xa1Var.addView(i4Var, gb1.x(-2, -2, 1, 0, 28, 0, 4));
                    }
                    z90Var2.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (t5Var.F.f9159f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                n5Var.e(false, false);
                z90Var = n5Var;
                break;
            case 6:
                c10 c10Var2 = new c10(t5Var.getContext(), bVar);
                c10Var2.setIsSingleCell(true);
                c10Var2.setIgnoreHeightCheck(true);
                c10Var2.setItemsCount(20);
                c10Var2.setViewType(28);
                c10Var2.f27029w = false;
                z90Var = c10Var2;
                break;
            case 11:
            case 12:
                z90 z90Var3 = new z90(t5Var.getContext(), null);
                z90Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.f7.V(z90Var3, org.telegram.ui.ActionBar.y6.f23746y6, bVar);
                org.telegram.ui.ActionBar.f7.H(z90Var3, org.telegram.ui.ActionBar.y6.J6, bVar);
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                z90Var3.setPadding(dp3, dp2, dp3, dp2);
                z90Var3.setMaxLines(Integer.MAX_VALUE);
                z90Var3.setGravity(17);
                z90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    z90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new bi.u6(this, 21)));
                } else {
                    z90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                z90Var3.setLayoutParams(new s4.q0(-1, -2));
                z90Var = z90Var3;
                break;
        }
        return new s4.e1(z90Var);
    }
}
