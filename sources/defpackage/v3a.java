package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class v3a extends c79 {
    public final ArrayList c = new ArrayList();
    public final z3a d;

    public v3a(z3a z3aVar) {
        this.d = z3aVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        z3a z3aVar = this.d;
        y3a y3aVar = z3aVar.F;
        int i = 0;
        if (z3aVar.R) {
            arrayList.add(new s3a(0));
            arrayList.add(new s3a(6));
        } else {
            arrayList.add(new s3a(0));
            if (y3aVar != null) {
                n3a n3aVar = y3aVar.s;
                boolean z = y3aVar.j;
                if (y3aVar.b() <= 0 && (z || (!y3aVar.e && !y3aVar.m))) {
                    if (!TextUtils.isEmpty(n3aVar.c)) {
                        arrayList.add(new s3a(7));
                    } else if (z) {
                        arrayList.add(new s3a(5));
                    } else if (y3aVar.a > 0) {
                        if (n3aVar.b) {
                            arrayList.add(new s3a(8));
                        } else {
                            arrayList.add(new s3a(10));
                        }
                    } else {
                        arrayList.add(new s3a(5));
                    }
                }
            }
            if (y3aVar != null) {
                ArrayList arrayList2 = y3aVar.g;
                ArrayList arrayList3 = y3aVar.i;
                if (y3aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new s3a((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new s3a((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (y3aVar != null) {
                if (!y3aVar.e && !y3aVar.m) {
                    if (y3aVar.k) {
                        arrayList.add(new s3a(11));
                    } else {
                        n3a n3aVar2 = y3aVar.s;
                        if (y3aVar.b() < y3aVar.a && TextUtils.isEmpty(n3aVar2.c) && !n3aVar2.b) {
                            arrayList.add(new s3a(12));
                        }
                    }
                } else if (y3aVar.b() <= 0) {
                    arrayList.add(new s3a(6));
                } else {
                    arrayList.add(new s3a(4));
                }
            }
        }
        arrayList.add(new s3a(9));
        f();
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final int d(int i) {
        return ((s3a) this.c.get(i)).a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j;
        TLRPC.Chat chat;
        TLRPC.User user;
        long j2;
        TL_stories.StoryItem storyItem;
        byte b;
        boolean z;
        boolean z2;
        String str;
        long j3;
        boolean z3;
        float f;
        byte b2;
        long j4;
        TL_stories.StoryItem storyItem2;
        byte b3;
        boolean z4;
        float f2;
        String str2;
        TLRPC.Message message2;
        if (f89Var.f == 1 && i >= 0) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                s3a s3aVar = (s3a) arrayList.get(i);
                e39 e39Var = (e39) f89Var.a;
                TL_stories.StoryView storyView = s3aVar.b;
                TL_stories.StoryReaction storyReaction = s3aVar.c;
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
                long n = wf3.n(peer);
                int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                z3a z3aVar = this.d;
                int i3 = z3aVar.w;
                if (i2 >= 0) {
                    user = uc7.s1(i3).X1(Long.valueOf(n));
                    j = n;
                    chat = null;
                } else {
                    TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-n));
                    j = n;
                    chat = M0;
                    user = null;
                }
                boolean remove = z3aVar.G.p.remove(Long.valueOf(j));
                if (storyView != null) {
                    TLRPC.Reaction reaction = storyView.reaction;
                    if (reaction != null && (str2 = w49.d(reaction).f) != null && str2.equals("❤")) {
                        j3 = 0;
                        z3 = true;
                    } else {
                        j3 = 0;
                        z3 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        f = 1.0f;
                        b2 = 11;
                        e39Var.c(user, null, null, z3, 0L, storyView.story, false, true, remove);
                    } else {
                        f = 1.0f;
                        b2 = 11;
                        TLRPC.Reaction reaction2 = null;
                        TLRPC.User user2 = user;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j4 = message3.date;
                            } else {
                                j4 = j3;
                            }
                            f4a f4aVar = z3aVar.E;
                            if (f4aVar == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = f4aVar.a;
                            }
                            e39Var.c(user2, null, null, z3, j4, storyItem2, true, true, remove);
                        } else {
                            if (!z3) {
                                reaction2 = storyView.reaction;
                            }
                            e39Var.c(user2, null, reaction2, z3, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i < arrayList.size() - 1) {
                        b3 = ((s3a) arrayList.get(i + 1)).a;
                    } else {
                        b3 = -1;
                    }
                    if (b3 != 1 && b3 != b2 && b3 != 12) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    e39Var.a = z4;
                    if (z3aVar.b(storyView)) {
                        f2 = f;
                    } else {
                        f2 = 0.5f;
                    }
                    e39Var.a(false, f2);
                    return;
                }
                TLRPC.Reaction reaction3 = null;
                TLRPC.User user3 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = w49.d(reaction4).f) != null && str.equals("❤")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            reaction3 = tL_storyReaction.reaction;
                        }
                        e39Var.c(user3, chat, reaction3, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        e39Var.c(user3, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        TLRPC.Message message4 = storyReaction.message;
                        if (message4 != null) {
                            j2 = message4.date;
                        } else {
                            j2 = 0;
                        }
                        f4a f4aVar2 = z3aVar.E;
                        if (f4aVar2 == null) {
                            storyItem = null;
                        } else {
                            storyItem = f4aVar2.a;
                        }
                        e39Var.c(user3, chat, null, false, j2, storyItem, true, true, remove);
                    }
                    if (i < arrayList.size() - 1) {
                        b = ((s3a) arrayList.get(i + 1)).a;
                    } else {
                        b = -1;
                    }
                    if (b != 1 && b != 11 && b != 12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    e39Var.a = z;
                    e39Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        p66 p66Var;
        z3a z3aVar = this.d;
        int i3 = z3aVar.w;
        x53 x53Var = z3aVar.s;
        switch (i) {
            case 0:
                p66Var = new t3a(this, z3aVar.getContext(), (byte) 0);
                break;
            case 1:
                w57 w57Var = e39.I;
                p66Var = new u3a(i3, x53Var, this, z3aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                p66Var = new t3a(this, z3aVar.getContext(), (byte) 1);
                break;
            case 3:
                p66Var = new ak4(z3aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                tk4 tk4Var = new tk4(z3aVar.getContext(), x53Var);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(28);
                tk4Var.x = false;
                p66Var = tk4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (z3aVar.G.j) {
                    i2 = 12;
                } else if (i != 10 && i != 7 && i != 8 && i != 5) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                h32 h32Var = new h32(i2, x53Var, this, z3aVar.getContext());
                tpa tpaVar = h32Var.d;
                if (i == 7) {
                    tpaVar.setVisibility(8);
                    h32Var.setSubtitle(ob6.M0(2131747898, null));
                } else if (i == 8) {
                    tpaVar.setVisibility(8);
                    h32Var.setSubtitle(ob6.M0(2131747953, null));
                } else if (i == 10) {
                    tpaVar.setVisibility(0);
                    tpaVar.setText(ob6.M0(2131745290, null));
                    h32Var.setSubtitle(ob6.M0(2131745292, null));
                } else if (z3aVar.G.j) {
                    tpaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hl.S2(ob6.M0(2131750836, null)));
                    boolean M3 = uc7.s1(i3).M3();
                    p66 p66Var2 = h32Var.e;
                    if (!M3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) hl.N2(ob6.M0(2131750835, null), -1, 0, new ux9(z3aVar, (byte) 11), null));
                        String M0 = ob6.M0(2131748764, null);
                        ux9 ux9Var = new ux9(z3aVar, (byte) 11);
                        ((LinearLayout.LayoutParams) p66Var2.getLayoutParams()).topMargin = hl.L(12.0f);
                        TextView textView = new TextView(h32Var.getContext());
                        textView.setText(M0);
                        int i4 = aob.Ji;
                        vnb vnbVar = h32Var.n;
                        yob.X(textView, i4, vnbVar);
                        textView.setPadding(hl.L(45.0f), hl.L(12.0f), hl.L(45.0f), hl.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(hl.o());
                        textView.setTextSize(1, 15.0f);
                        ir8 ir8Var = new ir8(h32Var.getContext(), (byte) 13);
                        ir8Var.setOnClickListener(new kla(ux9Var, (byte) 10));
                        int L = hl.L(8.0f);
                        int i5 = aob.Fi;
                        int v0 = aob.v0(i5, vnbVar);
                        int o = vm2.o(aob.v0(i4, vnbVar), 30);
                        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
                        uob M = yob.M(i5);
                        uob g = yob.g(i4, 30);
                        ir8Var.setBackground(i0);
                        yob.j(ir8Var, i0, M, g, vnbVar);
                        iye.b(ir8Var, 0.05f, 1.5f);
                        ir8Var.addView(textView);
                        oob oobVar = h32Var.a;
                        oobVar.setClipChildren(false);
                        oobVar.addView(ir8Var, tre.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p66Var2.setText(spannableStringBuilder);
                } else {
                    tpaVar.setVisibility(0);
                    if (z3aVar.G.f) {
                        tpaVar.setText(ob6.M0(2131747906, null));
                        h32Var.setSubtitle(ob6.M0(2131747904, null));
                    } else {
                        tpaVar.setText(ob6.M0(2131747863, null));
                        h32Var.setSubtitle(ob6.M0(2131747862, null));
                    }
                }
                h32Var.e(false, false);
                p66Var = h32Var;
                break;
            case 6:
                tk4 tk4Var2 = new tk4(z3aVar.getContext(), x53Var);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setIgnoreHeightCheck(true);
                tk4Var2.setItemsCount(20);
                tk4Var2.setViewType(28);
                tk4Var2.x = false;
                p66Var = tk4Var2;
                break;
            case 11:
            case 12:
                p66 p66Var3 = new p66(z3aVar.getContext(), null);
                p66Var3.setTextSize(1, 13.0f);
                yob.X(p66Var3, aob.y6, x53Var);
                yob.G(p66Var3, aob.J6, x53Var);
                int L2 = hl.L(16.0f);
                int L3 = hl.L(21.0f);
                p66Var3.setPadding(L3, L2, L3, L2);
                p66Var3.setMaxLines(Integer.MAX_VALUE);
                p66Var3.setGravity(17);
                p66Var3.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    p66Var3.setText(hl.N2(ob6.M0(2131744100, null), -1, 0, new ux9(this, (byte) 10), null));
                } else {
                    p66Var3.setText(ob6.M0(2131745291, null));
                }
                p66Var3.setLayoutParams(new r79(-1, -2));
                p66Var = p66Var3;
                break;
        }
        return new f89(p66Var);
    }
}
