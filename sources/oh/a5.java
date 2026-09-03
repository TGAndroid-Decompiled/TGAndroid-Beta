package oh;

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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ob1;
public final class a5 extends rl0 {
    public final ArrayList f16844c = new ArrayList();
    public final e5 d;

    public a5(e5 e5Var) {
        this.d = e5Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f16844c;
        arrayList.clear();
        e5 e5Var = this.d;
        d5 d5Var = e5Var.B;
        int i10 = 0;
        if (e5Var.N) {
            arrayList.add(new v4(0));
            arrayList.add(new v4(6));
        } else {
            arrayList.add(new v4(0));
            if (d5Var != null) {
                q4 q4Var = d5Var.f16988s;
                boolean z4 = d5Var.f16979j;
                if (d5Var.b() <= 0 && (z4 || (!d5Var.f16975e && !d5Var.f16982m))) {
                    if (!TextUtils.isEmpty(q4Var.f17659c)) {
                        arrayList.add(new v4(7));
                    } else if (z4) {
                        arrayList.add(new v4(5));
                    } else {
                        int i11 = d5Var.f16972a;
                        if (i11 > 0 && q4Var.f17658b) {
                            arrayList.add(new v4(8));
                        } else if (i11 > 0) {
                            arrayList.add(new v4(10));
                        } else {
                            arrayList.add(new v4(5));
                        }
                    }
                }
            }
            if (d5Var != null) {
                ArrayList arrayList2 = d5Var.f16977g;
                ArrayList arrayList3 = d5Var.f16978i;
                if (d5Var.f16976f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new v4((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new v4((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (d5Var != null && (d5Var.f16975e || d5Var.f16982m)) {
                if (d5Var.b() <= 0) {
                    arrayList.add(new v4(6));
                } else {
                    arrayList.add(new v4(4));
                }
            } else if (d5Var != null && d5Var.f16980k) {
                arrayList.add(new v4(11));
            } else if (d5Var != null) {
                q4 q4Var2 = d5Var.f16988s;
                if (d5Var.b() < d5Var.f16972a && TextUtils.isEmpty(q4Var2.f17659c) && !q4Var2.f17658b) {
                    arrayList.add(new v4(12));
                }
            }
        }
        arrayList.add(new v4(9));
        l();
    }

    @Override
    public final int h() {
        return this.f16844c.size();
    }

    @Override
    public final int j(int i10) {
        return ((v4) this.f16844c.get(i10)).f17849a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        long j11;
        TL_stories.StoryItem storyItem;
        int i12;
        boolean z4;
        TLRPC.Reaction reaction;
        String str;
        long j12;
        boolean z10;
        int i13;
        int i14;
        TLRPC.Reaction reaction2;
        long j13;
        TL_stories.StoryItem storyItem2;
        int i15;
        boolean z11;
        float f10;
        String str2;
        TLRPC.Message message2;
        e5 e5Var = this.d;
        int i16 = e5Var.v;
        if (m1Var.f5879f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f16844c;
            if (i10 < arrayList.size()) {
                v4 v4Var = (v4) arrayList.get(i10);
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) m1Var.f5875a;
                TL_stories.StoryView storyView = v4Var.f17850b;
                TL_stories.StoryReaction storyReaction = v4Var.f17851c;
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
                boolean remove = e5Var.C.f16985p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ng.q0.d(reaction3).f16180f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z10 = true;
                    } else {
                        j12 = 0;
                        z10 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i14 = 12;
                        n6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
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
                            m5 m5Var = e5Var.f17037y;
                            if (m5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = m5Var.f17439a;
                            }
                            n6Var.c(user3, null, null, z10, j13, storyItem2, true, true, remove);
                        } else {
                            if (z10) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            n6Var.c(user3, null, reaction2, z10, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((v4) arrayList.get(i10 + 1)).f17849a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    n6Var.f23222a = z11;
                    if (e5Var.d(storyView)) {
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
                        if (reaction4 != null && (str = ng.q0.d(reaction4).f16180f) != null && str.equals("❤")) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i11 = 12;
                        n6Var.c(user4, chat, reaction, z4, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            n6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            m5 m5Var2 = e5Var.f17037y;
                            if (m5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = m5Var2.f17439a;
                            }
                            n6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z12 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((v4) arrayList.get(i10 + 1)).f17849a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z12 = false;
                    }
                    n6Var.f23222a = z12;
                    n6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        g90 g90Var;
        final e5 e5Var = this.d;
        int i12 = e5Var.v;
        b bVar = e5Var.f17034s;
        switch (i10) {
            case 0:
                g90Var = new x4(this, e5Var.getContext(), 0);
                break;
            case 1:
                dc0 dc0Var = org.telegram.ui.Cells.n6.D;
                g90Var = new y4(i12, e5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                g90Var = new x4(this, e5Var.getContext(), 1);
                break;
            case 3:
                g90Var = new org.telegram.ui.Cells.s3(e5Var.getContext(), 70);
                break;
            case 4:
                u00 u00Var = new u00(e5Var.getContext(), bVar);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(28);
                u00Var.f31465w = false;
                g90Var = u00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (e5Var.C.f16979j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                z4 z4Var = new z4(i11, e5Var.getContext(), bVar, this);
                jh.s sVar = z4Var.d;
                if (i10 == 7) {
                    sVar.setVisibility(8);
                    z4Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    sVar.setVisibility(8);
                    z4Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    sVar.setVisibility(0);
                    sVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    z4Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (e5Var.C.f16979j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    g90 g90Var2 = z4Var.f34033e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        e5.a(e5Var);
                                        return;
                                    default:
                                        e5.a(e5Var);
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
                                        e5.a(e5Var);
                                        return;
                                    default:
                                        e5.a(e5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) g90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(z4Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.k6.Sh;
                        org.telegram.ui.ActionBar.g6 g6Var = z4Var.f34035n;
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        eh.d dVar = new eh.d(z4Var.getContext(), 19);
                        dVar.setOnClickListener(new b80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(i13, g6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, k10, k10));
                        k7.e6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        ob1 ob1Var = z4Var.f34030a;
                        ob1Var.setClipChildren(false);
                        ob1Var.addView(dVar, k7.c6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    g90Var2.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (e5Var.C.f16976f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        z4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        z4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                z4Var.e(false, false);
                g90Var = z4Var;
                break;
            case 6:
                u00 u00Var2 = new u00(e5Var.getContext(), bVar);
                u00Var2.setIsSingleCell(true);
                u00Var2.setIgnoreHeightCheck(true);
                u00Var2.setItemsCount(20);
                u00Var2.setViewType(28);
                u00Var2.f31465w = false;
                g90Var = u00Var2;
                break;
            case 11:
            case 12:
                g90 g90Var3 = new g90(e5Var.getContext(), null);
                g90Var3.setTextSize(1, 13.0f);
                g90Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, bVar));
                g90Var3.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                g90Var3.setPadding(dp3, dp2, dp3, dp2);
                g90Var3.setMaxLines(Integer.MAX_VALUE);
                g90Var3.setGravity(17);
                g90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    g90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new t3(this, 2)));
                } else {
                    g90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                g90Var3.setLayoutParams(new f2.x0(-1, -2));
                g90Var = g90Var3;
                break;
        }
        return new f2.m1(g90Var);
    }
}
