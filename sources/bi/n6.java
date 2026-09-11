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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.x70;
import org.telegram.ui.cc1;
public final class n6 extends kl0 {
    public final ArrayList f3370c = new ArrayList();
    public final s6 d;

    public n6(s6 s6Var) {
        this.d = s6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f3370c;
        arrayList.clear();
        s6 s6Var = this.d;
        r6 r6Var = s6Var.E;
        int i10 = 0;
        if (s6Var.Q) {
            arrayList.add(new i6(0));
            arrayList.add(new i6(6));
        } else {
            arrayList.add(new i6(0));
            if (r6Var != null) {
                d6 d6Var = r6Var.f3656s;
                boolean z10 = r6Var.f3647j;
                if (r6Var.b() <= 0 && (z10 || (!r6Var.f3643e && !r6Var.f3650m))) {
                    if (!TextUtils.isEmpty(d6Var.f2865c)) {
                        arrayList.add(new i6(7));
                    } else if (z10) {
                        arrayList.add(new i6(5));
                    } else {
                        int i11 = r6Var.f3640a;
                        if (i11 > 0 && d6Var.f2864b) {
                            arrayList.add(new i6(8));
                        } else if (i11 > 0) {
                            arrayList.add(new i6(10));
                        } else {
                            arrayList.add(new i6(5));
                        }
                    }
                }
            }
            if (r6Var != null) {
                ArrayList arrayList2 = r6Var.f3645g;
                ArrayList arrayList3 = r6Var.f3646i;
                if (r6Var.f3644f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new i6((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new i6((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (r6Var != null && (r6Var.f3643e || r6Var.f3650m)) {
                if (r6Var.b() <= 0) {
                    arrayList.add(new i6(6));
                } else {
                    arrayList.add(new i6(4));
                }
            } else if (r6Var != null && r6Var.f3648k) {
                arrayList.add(new i6(11));
            } else if (r6Var != null) {
                d6 d6Var2 = r6Var.f3656s;
                if (r6Var.b() < r6Var.f3640a && TextUtils.isEmpty(d6Var2.f2865c) && !d6Var2.f2864b) {
                    arrayList.add(new i6(12));
                }
            }
        }
        arrayList.add(new i6(9));
        l();
    }

    @Override
    public final int h() {
        return this.f3370c.size();
    }

    @Override
    public final int j(int i10) {
        return ((i6) this.f3370c.get(i10)).f3096a;
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
        s6 s6Var = this.d;
        int i16 = s6Var.v;
        if (c1Var.f45742f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f3370c;
            if (i10 < arrayList.size()) {
                i6 i6Var = (i6) arrayList.get(i10);
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) c1Var.f45738a;
                TL_stories.StoryView storyView = i6Var.f3097b;
                TL_stories.StoryReaction storyReaction = i6Var.f3098c;
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
                boolean remove = s6Var.F.f3653p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ah.j1.d(reaction3).f597f) != null && str2.equals("❤")) {
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
                        n6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
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
                            z6 z6Var = s6Var.f3700y;
                            if (z6Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = z6Var.f4060a;
                            }
                            n6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            n6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((i6) arrayList.get(i10 + 1)).f3096a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    n6Var.f22333a = z12;
                    if (s6Var.d(storyView)) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    n6Var.a(f7, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = ah.j1.d(reaction4).f597f) != null && str.equals("❤")) {
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
                        n6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            z6 z6Var2 = s6Var.f3700y;
                            if (z6Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = z6Var2.f4060a;
                            }
                            n6Var.c(user4, chat, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((i6) arrayList.get(i10 + 1)).f3096a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    n6Var.f22333a = z13;
                    n6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        d90 d90Var;
        final s6 s6Var = this.d;
        int i12 = s6Var.v;
        b bVar = s6Var.f3697s;
        switch (i10) {
            case 0:
                d90Var = new k6(this, s6Var.getContext(), 0);
                break;
            case 1:
                bc0 bc0Var = org.telegram.ui.Cells.n6.G;
                d90Var = new l6(i12, s6Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                d90Var = new k6(this, s6Var.getContext(), 1);
                break;
            case 3:
                d90Var = new org.telegram.ui.Cells.s3(s6Var.getContext(), 70);
                break;
            case 4:
                t00 t00Var = new t00(s6Var.getContext(), bVar);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(28);
                t00Var.f30465w = false;
                d90Var = t00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (s6Var.F.f3647j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                m6 m6Var = new m6(i11, s6Var.getContext(), bVar, this);
                wh.p pVar = m6Var.d;
                if (i10 == 7) {
                    pVar.setVisibility(8);
                    m6Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    pVar.setVisibility(8);
                    m6Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    pVar.setVisibility(0);
                    pVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    m6Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (s6Var.F.f3647j) {
                    pVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    d90 d90Var2 = m6Var.f32755e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        s6.a(s6Var);
                                        return;
                                    default:
                                        s6.a(s6Var);
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
                                        s6.a(s6Var);
                                        return;
                                    default:
                                        s6.a(s6Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) d90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(m6Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = m6Var.f32757n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        g5 g5Var = new g5(m6Var.getContext(), 19);
                        g5Var.setOnClickListener(new x70(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), 30);
                        g5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.z5.b(g5Var, 0.05f, 1.5f);
                        g5Var.addView(textView);
                        cc1 cc1Var = m6Var.f32752a;
                        cc1Var.setClipChildren(false);
                        cc1Var.addView(g5Var, w7.x5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    d90Var2.setText(spannableStringBuilder);
                } else {
                    pVar.setVisibility(0);
                    if (s6Var.F.f3644f) {
                        pVar.setText(LocaleController.getString(R.string.NoReactions));
                        m6Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        pVar.setText(LocaleController.getString(R.string.NoViews));
                        m6Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                m6Var.e(false, false);
                d90Var = m6Var;
                break;
            case 6:
                t00 t00Var2 = new t00(s6Var.getContext(), bVar);
                t00Var2.setIsSingleCell(true);
                t00Var2.setIgnoreHeightCheck(true);
                t00Var2.setItemsCount(20);
                t00Var2.setViewType(28);
                t00Var2.f30465w = false;
                d90Var = t00Var2;
                break;
            case 11:
            case 12:
                d90 d90Var3 = new d90(s6Var.getContext(), null);
                d90Var3.setTextSize(1, 13.0f);
                d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, bVar));
                d90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                d90Var3.setPadding(dp3, dp2, dp3, dp2);
                d90Var3.setMaxLines(Integer.MAX_VALUE);
                d90Var3.setGravity(17);
                d90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    d90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new a3.c(this, 20)));
                } else {
                    d90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                d90Var3.setLayoutParams(new s4.p0(-1, -2));
                d90Var = d90Var3;
                break;
        }
        return new s4.c1(d90Var);
    }
}
