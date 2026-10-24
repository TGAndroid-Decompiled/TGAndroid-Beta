package ci;

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
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.ua1;
public final class o5 extends km0 {
    public final ArrayList f5636c = new ArrayList();
    public final t5 d;

    public o5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f5636c;
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
                e5 e5Var = s5Var.f5930s;
                boolean z10 = s5Var.f5921j;
                if (s5Var.b() <= 0 && (z10 || (!s5Var.e && !s5Var.f5924m))) {
                    if (!TextUtils.isEmpty(e5Var.f5290c)) {
                        arrayList.add(new j5(7));
                    } else if (z10) {
                        arrayList.add(new j5(5));
                    } else {
                        int i11 = s5Var.f5915a;
                        if (i11 > 0 && e5Var.f5289b) {
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
                ArrayList arrayList2 = s5Var.f5919g;
                ArrayList arrayList3 = s5Var.f5920i;
                if (s5Var.f5918f) {
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
            if (s5Var != null && (s5Var.e || s5Var.f5924m)) {
                if (s5Var.b() <= 0) {
                    arrayList.add(new j5(6));
                } else {
                    arrayList.add(new j5(4));
                }
            } else if (s5Var != null && s5Var.f5922k) {
                arrayList.add(new j5(11));
            } else if (s5Var != null) {
                e5 e5Var2 = s5Var.f5930s;
                if (s5Var.b() < s5Var.f5915a && TextUtils.isEmpty(e5Var2.f5290c) && !e5Var2.f5289b) {
                    arrayList.add(new j5(12));
                }
            }
        }
        arrayList.add(new j5(9));
        l();
    }

    @Override
    public final int h() {
        return this.f5636c.size();
    }

    @Override
    public final int j(int i10) {
        return ((j5) this.f5636c.get(i10)).f5469a;
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
        t5 t5Var = this.d;
        int i16 = t5Var.v;
        if (b1Var.f46345f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f5636c;
            if (i10 < arrayList.size()) {
                j5 j5Var = (j5) arrayList.get(i10);
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) b1Var.f46342a;
                TL_stories.StoryView storyView = j5Var.f5470b;
                TL_stories.StoryReaction storyReaction = j5Var.f5471c;
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
                boolean remove = t5Var.F.f5927p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = ah.i1.d(reaction3).f784f) != null && str2.equals("❤")) {
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
                            a6 a6Var = t5Var.f5962y;
                            if (a6Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = a6Var.f5150a;
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
                        i15 = ((j5) arrayList.get(i10 + 1)).f5469a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i14 && i15 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    o6Var.f22844a = z12;
                    if (t5Var.d(storyView)) {
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
                        if (reaction4 != null && (str = ah.i1.d(reaction4).f784f) != null && str.equals("❤")) {
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
                            a6 a6Var2 = t5Var.f5962y;
                            if (a6Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = a6Var2.f5150a;
                            }
                            o6Var.c(user4, chat, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((j5) arrayList.get(i10 + 1)).f5469a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    o6Var.f22844a = z13;
                    o6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        w90 w90Var;
        final t5 t5Var = this.d;
        int i12 = t5Var.v;
        b bVar = t5Var.f5959s;
        switch (i10) {
            case 0:
                w90Var = new l5(this, t5Var.getContext(), 0);
                break;
            case 1:
                uc0 uc0Var = org.telegram.ui.Cells.o6.H;
                w90Var = new m5(i12, t5Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                w90Var = new l5(this, t5Var.getContext(), 1);
                break;
            case 3:
                w90Var = new org.telegram.ui.Cells.s3(t5Var.getContext(), 70);
                break;
            case 4:
                z00 z00Var = new z00(t5Var.getContext(), bVar);
                z00Var.setIsSingleCell(true);
                z00Var.setViewType(28);
                z00Var.f33104w = false;
                w90Var = z00Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (t5Var.F.f5921j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                n5 n5Var = new n5(i11, t5Var.getContext(), bVar, this);
                wh.n nVar = n5Var.d;
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
                } else if (t5Var.F.f5921j) {
                    nVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    w90 w90Var2 = n5Var.e;
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
                        ((LinearLayout.LayoutParams) w90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(n5Var.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.k6.Sh;
                        org.telegram.ui.ActionBar.g6 g6Var = n5Var.f32070n;
                        org.telegram.ui.ActionBar.r6.W(textView, i13, g6Var);
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        h4 h4Var = new h4(n5Var.getContext(), 19);
                        h4Var.setOnClickListener(new t80(runnable, 18));
                        int dp = AndroidUtilities.dp(8.0f);
                        int i14 = org.telegram.ui.ActionBar.k6.Oh;
                        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, g6Var);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 30);
                        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, o10, o10);
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 30);
                        h4Var.setBackground(j02);
                        org.telegram.ui.ActionBar.r6.k(h4Var, j02, O, h, g6Var);
                        w7.b6.b(h4Var, 0.05f, 1.5f);
                        h4Var.addView(textView);
                        ua1 ua1Var = n5Var.f32066a;
                        ua1Var.setClipChildren(false);
                        ua1Var.addView(h4Var, w7.z5.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    w90Var2.setText(spannableStringBuilder);
                } else {
                    nVar.setVisibility(0);
                    if (t5Var.F.f5918f) {
                        nVar.setText(LocaleController.getString(R.string.NoReactions));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        nVar.setText(LocaleController.getString(R.string.NoViews));
                        n5Var.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                n5Var.e(false, false);
                w90Var = n5Var;
                break;
            case 6:
                z00 z00Var2 = new z00(t5Var.getContext(), bVar);
                z00Var2.setIsSingleCell(true);
                z00Var2.setIgnoreHeightCheck(true);
                z00Var2.setItemsCount(20);
                z00Var2.setViewType(28);
                z00Var2.f33104w = false;
                w90Var = z00Var2;
                break;
            case 11:
            case 12:
                w90 w90Var3 = new w90(t5Var.getContext(), null);
                w90Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(w90Var3, org.telegram.ui.ActionBar.k6.f21572y6, bVar);
                org.telegram.ui.ActionBar.r6.I(w90Var3, org.telegram.ui.ActionBar.k6.J6, bVar);
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                w90Var3.setPadding(dp3, dp2, dp3, dp2);
                w90Var3.setMaxLines(Integer.MAX_VALUE);
                w90Var3.setGravity(17);
                w90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    w90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new androidx.fragment.app.d(this, 14)));
                } else {
                    w90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                w90Var3.setLayoutParams(new s4.o0(-1, -2));
                w90Var = w90Var3;
                break;
        }
        return new s4.b1(w90Var);
    }
}
