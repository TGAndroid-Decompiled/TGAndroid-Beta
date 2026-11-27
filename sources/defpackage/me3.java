package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class me3 extends ny0 {
    public float A2;
    public int B2;
    public l9c S1;
    public final TLRPC.Chat T1;
    public final TLRPC.Chat U1;
    public final boolean V1;
    public final ArrayList W1;
    public final long X1;
    public final int Y1;
    public final int Z1;
    public final Runnable a2;
    public boolean b2;
    public final boolean c2;
    public final le3 d2;
    public final le3 e2;
    public final le3 f2;
    public final le3 g2;
    public final boolean[] h2;
    public final boolean[] i2;
    public final boolean j2;
    public boolean k2;
    public final long l2;
    public TL_communities.ParticipantJoinedChats m2;
    public int[] n2;
    public boolean o2;
    public boolean p2;
    public final TLRPC.TL_chatBannedRights q2;
    public final TLRPC.TL_chatBannedRights r2;
    public final ArrayList s2;
    public boolean t2;
    public final boolean u2;
    public final boolean v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    public me3(org.telegram.ui.ActionBar.e r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me3.<init>(org.telegram.ui.ActionBar.e, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    @Override
    public final boolean F0(View view, float f, float f2) {
        return !(view instanceof ll2);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, this.r1.getClassGuid(), true, new fe3(this, (byte) 0), this.J0);
        this.S1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        int i;
        boolean[] zArr;
        if (this.v2) {
            if (this.x2) {
                return ob6.M0(2131751488, null);
            }
            if (this.y2) {
                return ob6.M0(2131751470, null);
            }
            return ob6.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.W1;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        iArr[0] = i;
        int[] iArr2 = this.n2;
        if (iArr2 != null && this.p2) {
            if (this.u2) {
                if (this.x2) {
                    for (int i2 : iArr2) {
                        iArr[0] = iArr[0] + i2;
                    }
                }
            } else {
                int i3 = 0;
                while (true) {
                    le3 le3Var = this.e2;
                    if (i3 >= le3Var.g) {
                        break;
                    }
                    if (le3Var.d[i3] && ((zArr = le3Var.e) == null || zArr[i3])) {
                        TLObject tLObject = (TLObject) le3Var.c.get(i3);
                        iArr[0] = iArr[0] + this.n2[i3];
                    }
                    i3++;
                }
            }
        }
        return ob6.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    public final boolean Z0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.q2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void a1(ArrayList arrayList, le3 le3Var) {
        boolean z;
        boolean e = le3Var.e();
        int i = le3Var.g;
        byte b = le3Var.a;
        if (e) {
            boolean d = le3Var.d();
            String str = le3Var.b;
            boolean z2 = false;
            if (!d) {
                b8c z3 = b8c.z(b, str);
                if (le3Var.i > 0) {
                    z2 = true;
                }
                z3.L(z2);
                arrayList.add(z3);
                return;
            }
            int i2 = le3Var.i;
            if (i2 <= 0) {
                if (le3Var.e != null) {
                    i2 = le3Var.h;
                } else {
                    i2 = i;
                }
            }
            String valueOf = String.valueOf(i2);
            b8c b8cVar = new b8c(36);
            b8cVar.d = b;
            b8cVar.m = str;
            b8cVar.p = valueOf;
            if (le3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            b8cVar.L(z);
            b8cVar.f = le3Var.f;
            b8cVar.E = new sb1(this, le3Var, (byte) 29);
            arrayList.add(b8cVar);
            if (!le3Var.f) {
                for (int i3 = 0; i3 < i; i3++) {
                    boolean[] zArr = le3Var.e;
                    if (zArr == null || zArr[i3]) {
                        b8c b8cVar2 = new b8c(37);
                        b8cVar2.d = (b << 24) | i3;
                        b8cVar2.H = (TLObject) le3Var.c.get(i3);
                        b8cVar2.L(le3Var.d[i3]);
                        b8cVar2.i = 1;
                        arrayList.add(b8cVar2);
                    }
                }
            }
        }
    }

    @Override
    public final void b0() {
        Rect rect = hl.Q;
        d79 d79Var = this.n1;
        rect.set(0, 0, d79Var.getMeasuredWidth(), d79Var.getMeasuredHeight() - hl.L(34.0f));
        d79Var.setClipBounds(rect);
    }

    public final void b1(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.n2[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(this.W1).filter(new yl1(inputPeer, (byte) 1)).count());
        }
        int i2 = iArr[0] - 1;
        iArr[0] = i2;
        if (i2 == 0) {
            this.o2 = false;
            this.p2 = true;
            Y0();
        }
    }

    public final void c1() {
        if (this.p2) {
            Y0();
        } else if (!this.o2) {
            this.o2 = true;
            le3 le3Var = this.e2;
            int i = le3Var.g;
            this.n2 = new int[i];
            int[] iArr = {i};
            for (int i2 = 0; i2 < le3Var.g; i2++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = uc7.l1(this.T1);
                tL_messages_search.q = "";
                TLRPC.InputPeer k1 = uc7.k1((TLObject) le3Var.c.get(i2));
                tL_messages_search.from_id = k1;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new lh(this, k1, i2, iArr, (byte) 3));
            }
        }
    }

    public final void d1() {
        boolean z;
        boolean z2;
        boolean z3 = this.b2;
        boolean z4 = false;
        le3 le3Var = this.g2;
        if (z3 && le3Var.e()) {
            if (le3Var.i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.z2 = z2;
        }
        if (this.b2 && le3Var.e() && le3Var.i == 0) {
            le3Var.f();
        } else if (!this.b2 && le3Var.e()) {
            boolean z5 = this.z2;
            if (le3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z5 != z) {
                le3Var.f();
            }
        }
        if (!this.b2 && le3Var.e()) {
            if (le3Var.i > 0) {
                z4 = true;
            }
            this.z2 = z4;
        }
    }

    @Override
    public final void dismiss() {
        boolean z;
        SharedPreferences.Editor edit = uc7.s1(this.a).X3.edit();
        edit.putBoolean("delete_report", this.d2.a());
        edit.putBoolean("delete_deleteAll", this.e2.a());
        if (!this.b2 && this.g2.a()) {
            z = true;
        } else {
            z = false;
        }
        edit.putBoolean("delete_ban", z);
        edit.apply();
        super.dismiss();
    }

    public final void e1(boolean z) {
        String str;
        boolean z2;
        int i;
        final byte b;
        le3 le3Var;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        int i2;
        boolean z3;
        CharSequence charSequence;
        long j = this.l2;
        boolean z4 = true;
        boolean z5 = false;
        if (z && this.k2 && (participantJoinedChats = this.m2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            vnb vnbVar = this.J0;
            int i3 = this.a;
            ArrayList<Long> arrayList = this.m2.creator_chat_ids;
            he3 he3Var = new he3(this, (byte) 6);
            ge3 ge3Var = new ge3(this, (byte) 0);
            Pattern pattern = jj.a;
            LinearLayout j2 = uh9.j(context, 1);
            id[] idVarArr = new id[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131751920, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.G(arrayList.size(), "CommunityBanWarningMessage", wf3.r(i3, j)));
            alertDialog$Builder.j(ob6.M0(2131753722, null), new m0(ge3Var, (byte) 13));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.n(j2);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Long l = arrayList.get(i4);
                i4++;
                Long l2 = l;
                id idVar2 = idVar;
                long longValue = l2.longValue();
                TLRPC.Chat M02 = uc7.s1(i3).M0(l2);
                TLRPC.ChatFull N0 = uc7.s1(i3).N0(longValue);
                if (M02 == null) {
                    idVar = idVar2;
                } else {
                    gb0 gb0Var = new gb0(vnbVar, context, z4);
                    ((TextView) gb0Var.c).setText(wf3.l(M02));
                    TextView textView = (TextView) gb0Var.d;
                    if (N0 != null) {
                        i2 = size;
                        z3 = false;
                        charSequence = ob6.G(N0.participants_count, "Members", new Object[0]);
                    } else {
                        i2 = size;
                        z3 = false;
                        charSequence = null;
                    }
                    textView.setText(charSequence);
                    ((de0) gb0Var.b).f(M02, new rb0(M02));
                    gb0Var.setBackground(aob.L0(z3));
                    gb0Var.setOnClickListener(new dg(idVarArr, he3Var, longValue, (byte) 0));
                    j2.addView(gb0Var, tre.o(-1, -2));
                    idVar = idVar2;
                    z5 = z3;
                    z4 = true;
                    size = i2;
                }
            }
            id idVar3 = idVar;
            idVarArr[z5 ? 1 : 0] = idVar3;
            idVar3.show();
            TextView textView2 = (TextView) idVar3.c(-1);
            if (textView2 != null) {
                yob.X(textView2, aob.q7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        le3 le3Var2 = this.d2;
        int i5 = le3Var2.i;
        if (i5 > 0) {
            str = ob6.G(i5, "UsersReported", new Object[0]);
        } else {
            str = "";
        }
        le3 le3Var3 = this.g2;
        if (le3Var3.i > 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat("\n");
            }
            boolean z6 = this.b2;
            int i6 = le3Var3.i;
            if (z6) {
                str = str.concat(ob6.G(i6, "UsersRestricted", new Object[0]));
            } else {
                str = str.concat(ob6.G(i6, "UsersBanned", new Object[0]));
            }
        }
        boolean z7 = this.v2;
        if (z7 && !this.x2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (le3Var3.i > 0) {
            i = 2131624049;
        } else {
            i = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 2131748214;
        e eVar = this.r1;
        if (isEmpty) {
            d31 b0 = d31.b0(eVar);
            if (z2) {
                i7 = 2131746108;
            }
            bs2.v(null, i7, b0, i, 36);
        } else {
            d31 b02 = d31.b0(eVar);
            if (z2) {
                i7 = 2131746108;
            }
            b02.I(i, ob6.M0(i7, null), str).j();
        }
        if (j != 0 && this.k2) {
            uc7 s1 = uc7.s1(this.a);
            long j3 = this.U1.id;
            b = 0;
            pp0 pp0Var = new pp0((byte) 0);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = s1.h1(j3);
            tL_communities_toggleParticipantBanned.participant = s1.j1(j);
            tL_communities_toggleParticipantBanned.unban = false;
            s1.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new ic((byte) 0), new ky(s1, j3, pp0Var));
        } else {
            b = 0;
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final me3 b;

            {
                this.b = this;
            }

            public final Predicate and(Predicate predicate) {
                byte b2 = b;
                return Predicate$CC.$default$and(this, predicate);
            }

            public final Predicate negate() {
                byte b2 = b;
                return Predicate$CC.$default$negate(this);
            }

            public final Predicate or(Predicate predicate) {
                byte b2 = b;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                byte b2 = b;
                me3 me3Var = this.b;
                r47 r47Var = (r47) obj;
                switch (b2) {
                    case 0:
                        long j4 = me3Var.X1;
                        TLRPC.Peer peer = r47Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = r47Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j5 = peer2.chat_id;
                        long j6 = me3Var.X1;
                        if (j5 != (-j6) || j6 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = r47Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-me3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1(b)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final me3 b;

            {
                this.b = this;
            }

            public final Predicate and(Predicate predicate) {
                byte b2 = b;
                return Predicate$CC.$default$and(this, predicate);
            }

            public final Predicate negate() {
                byte b2 = b;
                return Predicate$CC.$default$negate(this);
            }

            public final Predicate or(Predicate predicate) {
                byte b2 = b;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                byte b2 = b;
                me3 me3Var = this.b;
                r47 r47Var = (r47) obj;
                switch (b2) {
                    case 0:
                        long j4 = me3Var.X1;
                        TLRPC.Peer peer = r47Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = r47Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j5 = peer2.chat_id;
                        long j6 = me3Var.X1;
                        if (j5 != (-j6) || j6 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = r47Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-me3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1((byte) 0)));
        TLRPC.Chat chat = this.T1;
        le3 le3Var4 = this.e2;
        if (z7) {
            if (!this.y2) {
                le3Var4.b(new fu2(this, arrayList3, arrayList4, (byte) 6));
            }
            le3Var = le3Var4;
        } else {
            if (!arrayList3.isEmpty()) {
                le3Var = le3Var4;
                uc7.s1(this.a).X(arrayList3, null, null, -chat.id, this.Y1, false, this.Z1);
            } else {
                le3Var = le3Var4;
            }
            if (!arrayList4.isEmpty()) {
                uc7.s1(this.a).X(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        le3Var3.c(new he3(this, (byte) 3));
        for (int i8 = 0; i8 < le3Var2.g; i8++) {
            if (le3Var2.d[i8] && ((zArr = le3Var2.e) == null || zArr[i8])) {
                TLObject tLObject = (TLObject) le3Var2.c.get(i8);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final me3 b;

                    {
                        this.b = this;
                    }

                    public final Predicate and(Predicate predicate) {
                        byte b2 = b;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public final Predicate negate() {
                        byte b2 = b;
                        return Predicate$CC.$default$negate(this);
                    }

                    public final Predicate or(Predicate predicate) {
                        byte b2 = b;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        byte b2 = b;
                        me3 me3Var = this.b;
                        r47 r47Var = (r47) obj;
                        switch (b2) {
                            case 0:
                                long j4 = me3Var.X1;
                                TLRPC.Peer peer = r47Var.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                                    return false;
                                }
                                return true;
                            case 1:
                                TLRPC.Peer peer2 = r47Var.k.peer_id;
                                if (peer2 == null) {
                                    return false;
                                }
                                long j5 = peer2.chat_id;
                                long j6 = me3Var.X1;
                                if (j5 != (-j6) || j6 == 0) {
                                    return false;
                                }
                                return true;
                            default:
                                TLRPC.Peer peer3 = r47Var.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-me3Var.X1)) {
                                    return false;
                                }
                                return true;
                        }
                    }
                }).filter(new yl1(tLObject, (byte) 2)).map(new yz((byte) 6)).collect(Collectors.toCollection(new zl1((byte) 0)));
                if (z7 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = uc7.l1(chat);
                    tL_messages_reportReaction.user_id = uc7.s1(this.a).q1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = uc7.i1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = uc7.n1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = uc7.l1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.u2) {
            le3Var.b(new he3(this, (byte) 0));
            return;
        }
        le3Var.c(new he3(this, (byte) 1));
        this.f2.c(new he3(this, (byte) 2));
    }

    @Override
    public final void p0() {
        super.p0();
        int v0 = aob.v0(aob.a7, this.J0);
        if (v0 != this.B2) {
            this.B2 = v0;
            s0(v0);
        }
    }

    @Override
    public final void show() {
        super.show();
        v21.e();
    }
}
