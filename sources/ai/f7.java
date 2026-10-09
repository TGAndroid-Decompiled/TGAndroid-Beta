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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.dc1;
public final class f7 extends pm0 {
    public final ArrayList f1030c = new ArrayList();
    public final l7 d;

    public f7(l7 l7Var) {
        this.d = l7Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f1030c;
        arrayList.clear();
        l7 l7Var = this.d;
        k7 k7Var = l7Var.E;
        int i10 = 0;
        if (l7Var.Q) {
            arrayList.add(new a7(0));
            arrayList.add(new a7(6));
        } else {
            arrayList.add(new a7(0));
            if (k7Var != null) {
                v6 v6Var = k7Var.f1243s;
                boolean z10 = k7Var.f1234j;
                if (k7Var.b() <= 0 && (z10 || (!k7Var.f1230e && !k7Var.f1237m))) {
                    if (!TextUtils.isEmpty(v6Var.f1827c)) {
                        arrayList.add(new a7(7));
                    } else if (z10) {
                        arrayList.add(new a7(5));
                    } else {
                        int i11 = k7Var.f1227a;
                        if (i11 > 0 && v6Var.f1826b) {
                            arrayList.add(new a7(8));
                        } else if (i11 > 0) {
                            arrayList.add(new a7(10));
                        } else {
                            arrayList.add(new a7(5));
                        }
                    }
                }
            }
            if (k7Var != null) {
                ArrayList arrayList2 = k7Var.f1232g;
                ArrayList arrayList3 = k7Var.f1233i;
                if (k7Var.f1231f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new a7((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new a7((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (k7Var != null && (k7Var.f1230e || k7Var.f1237m)) {
                if (k7Var.b() <= 0) {
                    arrayList.add(new a7(6));
                } else {
                    arrayList.add(new a7(4));
                }
            } else if (k7Var != null && k7Var.f1235k) {
                arrayList.add(new a7(11));
            } else if (k7Var != null) {
                v6 v6Var2 = k7Var.f1243s;
                if (k7Var.b() < k7Var.f1227a && TextUtils.isEmpty(v6Var2.f1827c) && !v6Var2.f1826b) {
                    arrayList.add(new a7(12));
                }
            }
        }
        arrayList.add(new a7(9));
        l();
    }

    @Override
    public final int h() {
        return this.f1030c.size();
    }

    @Override
    public final int j(int i10) {
        return ((a7) this.f1030c.get(i10)).f643a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
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
        l7 l7Var = this.d;
        int i16 = l7Var.v;
        if (d1Var.f47662f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f1030c;
            if (i10 < arrayList.size()) {
                a7 a7Var = (a7) arrayList.get(i10);
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) d1Var.f47658a;
                TL_stories.StoryView storyView = a7Var.f644b;
                TL_stories.StoryReaction storyReaction = a7Var.f645c;
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
                boolean remove = l7Var.F.f1240p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = zg.n0.d(reaction3).f54617f) != null && str2.equals("❤")) {
                        j11 = 0;
                        z11 = true;
                    } else {
                        j11 = 0;
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
                                j12 = message3.date;
                            } else {
                                j12 = j11;
                            }
                            s7 s7Var = l7Var.f1344y;
                            if (s7Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = s7Var.f1708a;
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
                        i15 = ((a7) arrayList.get(i10 + 1)).f643a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i14 && i15 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    o6Var.f22590a = z12;
                    if (l7Var.d(storyView)) {
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
                        if (reaction4 != null && (str = zg.n0.d(reaction4).f54617f) != null && str.equals("❤")) {
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
                            s7 s7Var2 = l7Var.f1344y;
                            if (s7Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = s7Var2.f1708a;
                            }
                            o6Var.c(user4, chat, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((a7) arrayList.get(i10 + 1)).f643a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    o6Var.f22590a = z13;
                    o6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        ea0 ea0Var;
        final l7 l7Var = this.d;
        int i12 = l7Var.v;
        d dVar = l7Var.f1341s;
        switch (i10) {
            case 0:
                ea0Var = new c7(this, l7Var.getContext(), 0);
                break;
            case 1:
                ad0 ad0Var = org.telegram.ui.Cells.o6.H;
                ea0Var = new d7(i12, dVar, this, l7Var.getContext());
                break;
            case 2:
            case 9:
            default:
                ea0Var = new c7(this, l7Var.getContext(), 1);
                break;
            case 3:
                ea0Var = new org.telegram.ui.Cells.t3(l7Var.getContext(), 70);
                break;
            case 4:
                j10 j10Var = new j10(l7Var.getContext(), dVar);
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(28);
                j10Var.f27555w = false;
                ea0Var = j10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (l7Var.F.f1234j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                e7 e7Var = new e7(i11, dVar, this, l7Var.getContext());
                vh.n nVar = e7Var.d;
                if (i10 == 7) {
                    nVar.setVisibility(8);
                    e7Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    nVar.setVisibility(8);
                    e7Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    nVar.setVisibility(0);
                    nVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    e7Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (l7Var.F.f1234j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    ea0 ea0Var2 = e7Var.f24802e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        l7.a(l7Var);
                                        return;
                                    default:
                                        l7.a(l7Var);
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
                                        l7.a(l7Var);
                                        return;
                                    default:
                                        l7.a(l7Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) ea0Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(e7Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.i6.Sh;
                        org.telegram.ui.ActionBar.e6 e6Var = e7Var.f24804n;
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        x5 x5Var = new x5(e7Var.getContext(), 19);
                        x5Var.setOnClickListener(new b90(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(i13, e6Var), 30);
                        x5Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, k10, k10));
                        w7.z5.b(x5Var, 0.05f, 1.5f);
                        x5Var.addView(textView);
                        dc1 dc1Var = e7Var.f24799a;
                        dc1Var.setClipChildren(false);
                        dc1Var.addView(x5Var, w7.x5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    ea0Var2.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (l7Var.F.f1231f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        e7Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        e7Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                e7Var.e(false, false);
                ea0Var = e7Var;
                break;
            case 6:
                j10 j10Var2 = new j10(l7Var.getContext(), dVar);
                j10Var2.setIsSingleCell(true);
                j10Var2.setIgnoreHeightCheck(true);
                j10Var2.setItemsCount(20);
                j10Var2.setViewType(28);
                j10Var2.f27555w = false;
                ea0Var = j10Var2;
                break;
            case 11:
            case 12:
                ea0 ea0Var3 = new ea0(l7Var.getContext(), null);
                ea0Var3.setTextSize(1, 13.0f);
                ea0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, dVar));
                ea0Var3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, dVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                ea0Var3.setPadding(dp3, dp2, dp3, dp2);
                ea0Var3.setMaxLines(Integer.MAX_VALUE);
                ea0Var3.setGravity(17);
                ea0Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    ea0Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.d(this, 10)));
                } else {
                    ea0Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                ea0Var3.setLayoutParams(new s4.q0(-1, -2));
                ea0Var = ea0Var3;
                break;
        }
        return new s4.d1(ea0Var);
    }
}
