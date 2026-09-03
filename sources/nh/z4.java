package nh;

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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.pb1;
public final class z4 extends ql0 {
    public final ArrayList f16099c = new ArrayList();
    public final d5 d;

    public z4(d5 d5Var) {
        this.d = d5Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f16099c;
        arrayList.clear();
        d5 d5Var = this.d;
        c5 c5Var = d5Var.B;
        int i10 = 0;
        if (d5Var.N) {
            arrayList.add(new u4(0));
            arrayList.add(new u4(6));
        } else {
            arrayList.add(new u4(0));
            if (c5Var != null) {
                p4 p4Var = c5Var.f15141s;
                boolean z4 = c5Var.f15132j;
                if (c5Var.b() <= 0 && (z4 || (!c5Var.e && !c5Var.f15135m))) {
                    if (!TextUtils.isEmpty(p4Var.f15728c)) {
                        arrayList.add(new u4(7));
                    } else if (z4) {
                        arrayList.add(new u4(5));
                    } else {
                        int i11 = c5Var.f15126a;
                        if (i11 > 0 && p4Var.f15727b) {
                            arrayList.add(new u4(8));
                        } else if (i11 > 0) {
                            arrayList.add(new u4(10));
                        } else {
                            arrayList.add(new u4(5));
                        }
                    }
                }
            }
            if (c5Var != null) {
                ArrayList arrayList2 = c5Var.f15130g;
                ArrayList arrayList3 = c5Var.f15131i;
                if (c5Var.f15129f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new u4((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new u4((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (c5Var != null && (c5Var.e || c5Var.f15135m)) {
                if (c5Var.b() <= 0) {
                    arrayList.add(new u4(6));
                } else {
                    arrayList.add(new u4(4));
                }
            } else if (c5Var != null && c5Var.f15133k) {
                arrayList.add(new u4(11));
            } else if (c5Var != null) {
                p4 p4Var2 = c5Var.f15141s;
                if (c5Var.b() < c5Var.f15126a && TextUtils.isEmpty(p4Var2.f15728c) && !p4Var2.f15727b) {
                    arrayList.add(new u4(12));
                }
            }
        }
        arrayList.add(new u4(9));
        l();
    }

    @Override
    public final int h() {
        return this.f16099c.size();
    }

    @Override
    public final int j(int i10) {
        return ((u4) this.f16099c.get(i10)).f15939a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
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
        d5 d5Var = this.d;
        int i16 = d5Var.v;
        if (l1Var.f5777f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f16099c;
            if (i10 < arrayList.size()) {
                u4 u4Var = (u4) arrayList.get(i10);
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) l1Var.f5774a;
                TL_stories.StoryView storyView = u4Var.f15940b;
                TL_stories.StoryReaction storyReaction = u4Var.f15941c;
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
                boolean remove = d5Var.C.f15138p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = mg.q0.d(reaction3).f14095f) != null && str2.equals("❤")) {
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
                        m6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
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
                            l5 l5Var = d5Var.f15254y;
                            if (l5Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = l5Var.f15553a;
                            }
                            m6Var.c(user3, null, null, z10, j13, storyItem2, true, true, remove);
                        } else {
                            if (z10) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            m6Var.c(user3, null, reaction2, z10, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((u4) arrayList.get(i10 + 1)).f15939a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m6Var.f21362a = z11;
                    if (d5Var.d(storyView)) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    m6Var.a(f10, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = mg.q0.d(reaction4).f14095f) != null && str.equals("❤")) {
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
                        m6Var.c(user4, chat, reaction, z4, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            m6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            l5 l5Var2 = d5Var.f15254y;
                            if (l5Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = l5Var2.f15553a;
                            }
                            m6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z12 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((u4) arrayList.get(i10 + 1)).f15939a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z12 = false;
                    }
                    m6Var.f21362a = z12;
                    m6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        f90 f90Var;
        final d5 d5Var = this.d;
        int i12 = d5Var.v;
        b bVar = d5Var.f15251s;
        switch (i10) {
            case 0:
                f90Var = new w4(this, d5Var.getContext(), 0);
                break;
            case 1:
                cc0 cc0Var = org.telegram.ui.Cells.m6.D;
                f90Var = new x4(i12, d5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                f90Var = new w4(this, d5Var.getContext(), 1);
                break;
            case 3:
                f90Var = new org.telegram.ui.Cells.r3(d5Var.getContext(), 70);
                break;
            case 4:
                u00 u00Var = new u00(d5Var.getContext(), bVar);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(28);
                u00Var.f29071w = false;
                f90Var = u00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (d5Var.C.f15132j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                y4 y4Var = new y4(i11, d5Var.getContext(), bVar, this);
                ih.s sVar = y4Var.d;
                if (i10 == 7) {
                    sVar.setVisibility(8);
                    y4Var.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    sVar.setVisibility(8);
                    y4Var.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    sVar.setVisibility(0);
                    sVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    y4Var.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (d5Var.C.f15132j) {
                    sVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    f90 f90Var2 = y4Var.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        d5.a(d5Var);
                                        return;
                                    default:
                                        d5.a(d5Var);
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
                                        d5.a(d5Var);
                                        return;
                                    default:
                                        d5.a(d5Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) f90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(y4Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = y4Var.f31486n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        dh.d dVar = new dh.d(y4Var.getContext(), 19);
                        dVar.setOnClickListener(new a80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), 30);
                        dVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        k7.d6.b(dVar, 0.05f, 1.5f);
                        dVar.addView(textView);
                        pb1 pb1Var = y4Var.f31482a;
                        pb1Var.setClipChildren(false);
                        pb1Var.addView(dVar, k7.b6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    f90Var2.setText(spannableStringBuilder);
                } else {
                    sVar.setVisibility(0);
                    if (d5Var.C.f15129f) {
                        sVar.setText(LocaleController.getString(R.string.NoReactions));
                        y4Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        sVar.setText(LocaleController.getString(R.string.NoViews));
                        y4Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                y4Var.e(false, false);
                f90Var = y4Var;
                break;
            case 6:
                u00 u00Var2 = new u00(d5Var.getContext(), bVar);
                u00Var2.setIsSingleCell(true);
                u00Var2.setIgnoreHeightCheck(true);
                u00Var2.setItemsCount(20);
                u00Var2.setViewType(28);
                u00Var2.f29071w = false;
                f90Var = u00Var2;
                break;
            case 11:
            case 12:
                f90 f90Var3 = new f90(d5Var.getContext(), null);
                f90Var3.setTextSize(1, 13.0f);
                f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, bVar));
                f90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                f90Var3.setPadding(dp3, dp2, dp3, dp2);
                f90Var3.setMaxLines(Integer.MAX_VALUE);
                f90Var3.setGravity(17);
                f90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    f90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new lh.b(this, 29)));
                } else {
                    f90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                f90Var3.setLayoutParams(new f2.w0(-1, -2));
                f90Var = f90Var3;
                break;
        }
        return new f2.l1(f90Var);
    }
}
