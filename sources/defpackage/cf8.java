package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
public final class cf8 extends j39 {
    public final Context r;
    public final gf8 s;

    public cf8(gf8 gf8Var, Context context) {
        this.s = gf8Var;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        int i2 = 1;
        if (i == 0) {
            return 1;
        }
        ff8 ff8Var = (ff8) this.s.w1.get(i - 1);
        int b = ff8Var.b() + 1;
        if (TextUtils.isEmpty(ff8Var.c) && !ff8Var.e) {
            i2 = 0;
        }
        return b + i2;
    }

    @Override
    public final Object O(int i, int i2) {
        int i3;
        ArrayList arrayList = this.s.w1;
        if (i == 0) {
            return 293145;
        }
        int i4 = i - 1;
        if (i2 == 0) {
            return -928312;
        }
        if (i4 >= 0 && i4 < arrayList.size() && (i3 = i2 - 1) < ((ff8) arrayList.get(i4)).b()) {
            return Integer.valueOf(Objects.hash(Long.valueOf(cf3.n(((TLRPC.MessagePeerVote) ((ff8) arrayList.get(i4)).b.get(i3)).peer))));
        }
        return -182734;
    }

    @Override
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 0) {
            return 2;
        }
        if (i2 - 1 < ((ff8) this.s.w1.get(i - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.s.w1.size() + 1;
    }

    @Override
    public final View T(int i, View view) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        gf8 gf8Var = this.s;
        TLRPC.Poll poll = gf8Var.s1;
        k27 k27Var = gf8Var.r1;
        if (view == null) {
            view = new bf8(this, this.r);
        }
        ef8 ef8Var = (ef8) view;
        if (i == 0) {
            ef8Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ff8 ff8Var = (ff8) gf8Var.w1.get(i - 1);
        int size = poll.answers.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
            if (Arrays.equals(pollAnswer.option, ff8Var.d) && ((df8) gf8Var.v1.get(ff8Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (k27Var != null && k27Var.L2 && (message = k27Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i2 >= k27Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k27Var.k.translatedPoll.b.get(i2);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                ef8Var.a(str, arrayList, gf8Var.E0(ff8Var.d), ff8Var.a, ff8Var.a(), false);
                ef8Var.setTag(2131296587, ff8Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        if (i != 0 && i2 != 0) {
            ArrayList arrayList = this.s.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        ArrayList<TLRPC.MessageEntity> arrayList;
        String str;
        TLRPC.Message message;
        gf8 gf8Var = this.s;
        TLRPC.Poll poll = gf8Var.s1;
        ArrayList arrayList2 = gf8Var.w1;
        k27 k27Var = gf8Var.r1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        int i4 = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                ff8 ff8Var = (ff8) arrayList2.get(i - 1);
                ((wgb) view).o(2131230871, k96.G(ff8Var.a - ff8Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        ef8 ef8Var = (ef8) view;
        ff8 ff8Var2 = (ff8) arrayList2.get(i - 1);
        ArrayList arrayList3 = ff8Var2.b;
        byte[] bArr = ff8Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i5 = 0; i5 < size; i5++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i5);
            if (Arrays.equals(pollAnswer.option, bArr) && ((df8) gf8Var.v1.get(ff8Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (k27Var != null && k27Var.L2 && (message = k27Var.k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i4 >= k27Var.k.translatedPoll.b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) k27Var.k.translatedPoll.b.get(i4);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i4++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                    arrayList = null;
                } else {
                    String str2 = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                    str = str2;
                }
                ef8Var.a(str, arrayList, gf8Var.E0(bArr), ff8Var2.a, ff8Var2.a(), false);
                ef8Var.setTag(2131296587, ff8Var2);
                return;
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wgb wgbVar;
        gf8 gf8Var = this.s;
        View view = gf8Var.x1;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    wgb wgbVar2 = new wgb(23, context, true);
                    wgbVar2.setOffsetFromImage(65);
                    zkb.h(bkb.g5, gf8Var.J0, wgbVar2);
                    wgbVar2.g(bkb.M6, bkb.p6);
                    wgbVar = wgbVar2;
                } else {
                    View bf8Var = new bf8(this, context);
                    bf8Var.setTag(-33024);
                    wgbVar = bf8Var;
                }
            } else {
                ViewParent parent = view.getParent();
                wgbVar = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    wgbVar = view;
                }
            }
        } else {
            wgbVar = new PollVotesAlert$UserCell(gf8Var, context);
        }
        return new s49(wgbVar);
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z;
        if (s49Var.f == 0) {
            int b = s49Var.b();
            int S = S(b);
            int Q = Q(b) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) s49Var.a;
            gf8 gf8Var = this.s;
            ff8 ff8Var = (ff8) gf8Var.w1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ff8Var.b.get(Q);
            TLObject Z1 = na7.q1(gf8Var.a).Z1(cf3.n(messagePeerVote.peer));
            int i = messagePeerVote.date;
            boolean z2 = true;
            if (Q == ff8Var.b() - 1 && TextUtils.isEmpty(ff8Var.c) && !ff8Var.e) {
                z = false;
            } else {
                z = true;
            }
            be0 be0Var = pollVotesAlert$UserCell.a;
            jia jiaVar = pollVotesAlert$UserCell.b;
            if (Z1 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) Z1;
                pollVotesAlert$UserCell.n = null;
            } else if (Z1 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.n = (TLRPC.Chat) Z1;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.n = null;
            }
            long j = i;
            pollVotesAlert$UserCell.d.setText(k96.D0().o0().format(1000 * j));
            pollVotesAlert$UserCell.c.setText(k96.r(j, true));
            pollVotesAlert$UserCell.s = z;
            if (Z1 != null) {
                z2 = false;
            }
            pollVotesAlert$UserCell.x = z2;
            pollVotesAlert$UserCell.w = Q;
            if (Z1 == null) {
                jiaVar.l("", false);
                be0Var.setImageDrawable(null);
            } else {
                pb0 pb0Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if (user != null) {
                    pb0Var.q(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat = pollVotesAlert$UserCell.n;
                    if (chat != null) {
                        pb0Var.p(chat);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String q = l7c.q(user2);
                    pollVotesAlert$UserCell.r = q;
                    pollVotesAlert$UserCell.r = b00.e(jiaVar, q, false, null, 0);
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.n;
                    if (chat2 != null) {
                        String str = chat2.title;
                        pollVotesAlert$UserCell.r = str;
                        pollVotesAlert$UserCell.r = b00.e(jiaVar, str, false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.r = "";
                    }
                }
                jiaVar.l(pollVotesAlert$UserCell.r, false);
                aya ayaVar = pollVotesAlert$UserCell.f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat3 = pollVotesAlert$UserCell.n;
                int i2 = bkb.y9;
                gf8 gf8Var2 = pollVotesAlert$UserCell.F;
                pm pmVar = gf8.L1;
                jiaVar.i(ayaVar.b(user3, chat3, bkb.v0(i2, gf8Var2.J0), false));
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.n;
                if (chat4 != null) {
                    be0Var.f(chat4, pb0Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        be0Var.f(user4, pb0Var);
                    } else {
                        be0Var.setImageDrawable(pb0Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(be0Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(jiaVar, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, gf8.L1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.x) {
                pollVotesAlert$UserCell.y = 0.0f;
            }
        }
    }
}
