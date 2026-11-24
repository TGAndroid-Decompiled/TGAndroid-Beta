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
import org.telegram.ui.ActionBar.d;
public final class sd3 extends fy0 {
    public float A2;
    public int B2;
    public l5c S1;
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
    public final rd3 d2;
    public final rd3 e2;
    public final rd3 f2;
    public final rd3 g2;
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

    public sd3(org.telegram.ui.ActionBar.d r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.<init>(org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    @Override
    public final boolean E0(View view, float f, float f2) {
        return !(view instanceof rk2);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, this.r1.getClassGuid(), true, new md3(this, (byte) 0), this.J0);
        this.S1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        boolean[] zArr;
        if (this.v2) {
            if (this.x2) {
                return k96.M0(2131751511, null);
            }
            if (this.y2) {
                return k96.M0(2131751493, null);
            }
            return k96.G(1, "DeleteReactionOptionsTitle", new Object[0]);
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
                    rd3 rd3Var = this.e2;
                    if (i3 >= rd3Var.g) {
                        break;
                    }
                    if (rd3Var.d[i3] && ((zArr = rd3Var.e) == null || zArr[i3])) {
                        TLObject tLObject = (TLObject) rd3Var.c.get(i3);
                        iArr[0] = iArr[0] + this.n2[i3];
                    }
                    i3++;
                }
            }
        }
        return k96.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    public final boolean Y0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.q2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void Z0(ArrayList arrayList, rd3 rd3Var) {
        boolean z;
        boolean e = rd3Var.e();
        int i = rd3Var.g;
        byte b = rd3Var.a;
        if (e) {
            boolean d = rd3Var.d();
            String str = rd3Var.b;
            boolean z2 = false;
            if (!d) {
                c4c z3 = c4c.z(b, str);
                if (rd3Var.i > 0) {
                    z2 = true;
                }
                z3.L(z2);
                arrayList.add(z3);
                return;
            }
            int i2 = rd3Var.i;
            if (i2 <= 0) {
                if (rd3Var.e != null) {
                    i2 = rd3Var.h;
                } else {
                    i2 = i;
                }
            }
            String valueOf = String.valueOf(i2);
            c4c c4cVar = new c4c(36);
            c4cVar.d = b;
            c4cVar.m = str;
            c4cVar.p = valueOf;
            if (rd3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            c4cVar.L(z);
            c4cVar.f = rd3Var.f;
            c4cVar.E = new kb1(this, rd3Var, (byte) 27);
            arrayList.add(c4cVar);
            if (!rd3Var.f) {
                for (int i3 = 0; i3 < i; i3++) {
                    boolean[] zArr = rd3Var.e;
                    if (zArr == null || zArr[i3]) {
                        c4c c4cVar2 = new c4c(37);
                        c4cVar2.d = (b << 24) | i3;
                        c4cVar2.H = (TLObject) rd3Var.c.get(i3);
                        c4cVar2.L(rd3Var.d[i3]);
                        c4cVar2.i = 1;
                        arrayList.add(c4cVar2);
                    }
                }
            }
        }
    }

    public final void a1(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.n2[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(this.W1).filter(new km1(inputPeer, (byte) 1)).count());
        }
        int i2 = iArr[0] - 1;
        iArr[0] = i2;
        if (i2 == 0) {
            this.o2 = false;
            this.p2 = true;
            X0();
        }
    }

    @Override
    public final void b0() {
        Rect rect = gl.Q;
        o39 o39Var = this.n1;
        rect.set(0, 0, o39Var.getMeasuredWidth(), o39Var.getMeasuredHeight() - gl.L(34.0f));
        o39Var.setClipBounds(rect);
    }

    public final void b1() {
        if (this.p2) {
            X0();
        } else if (!this.o2) {
            this.o2 = true;
            rd3 rd3Var = this.e2;
            int i = rd3Var.g;
            this.n2 = new int[i];
            int[] iArr = {i};
            for (int i2 = 0; i2 < rd3Var.g; i2++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = na7.j1(this.T1);
                tL_messages_search.q = "";
                TLRPC.InputPeer i1 = na7.i1((TLObject) rd3Var.c.get(i2));
                tL_messages_search.from_id = i1;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new ae(this, i1, i2, iArr, (byte) 3));
            }
        }
    }

    public final void c1() {
        boolean z;
        boolean z2;
        boolean z3 = this.b2;
        boolean z4 = false;
        rd3 rd3Var = this.g2;
        if (z3 && rd3Var.e()) {
            if (rd3Var.i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.z2 = z2;
        }
        if (this.b2 && rd3Var.e() && rd3Var.i == 0) {
            rd3Var.f();
        } else if (!this.b2 && rd3Var.e()) {
            boolean z5 = this.z2;
            if (rd3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z5 != z) {
                rd3Var.f();
            }
        }
        if (!this.b2 && rd3Var.e()) {
            if (rd3Var.i > 0) {
                z4 = true;
            }
            this.z2 = z4;
        }
    }

    public final void d1(boolean z) {
        String str;
        boolean z2;
        int i;
        final byte b;
        rd3 rd3Var;
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
            wjb wjbVar = this.J0;
            int i3 = this.a;
            ArrayList<Long> arrayList = this.m2.creator_chat_ids;
            od3 od3Var = new od3(this, (byte) 6);
            nd3 nd3Var = new nd3(this, (byte) 0);
            Pattern pattern = ij.a;
            LinearLayout j2 = de9.j(context, 1);
            hd[] hdVarArr = new hd[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131751943, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.G(arrayList.size(), "CommunityBanWarningMessage", cf3.r(i3, j)));
            alertDialog$Builder.j(k96.M0(2131753726, null), new l0(nd3Var, (byte) 13));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.n(j2);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Long l = arrayList.get(i4);
                i4++;
                Long l2 = l;
                hd hdVar2 = hdVar;
                long longValue = l2.longValue();
                TLRPC.Chat K0 = na7.q1(i3).K0(l2);
                TLRPC.ChatFull L0 = na7.q1(i3).L0(longValue);
                if (K0 == null) {
                    hdVar = hdVar2;
                } else {
                    eb0 eb0Var = new eb0(wjbVar, context, z4);
                    ((TextView) eb0Var.c).setText(cf3.l(K0));
                    TextView textView = (TextView) eb0Var.d;
                    if (L0 != null) {
                        i2 = size;
                        z3 = false;
                        charSequence = k96.G(L0.participants_count, "Members", new Object[0]);
                    } else {
                        i2 = size;
                        z3 = false;
                        charSequence = null;
                    }
                    textView.setText(charSequence);
                    ((be0) eb0Var.b).f(K0, new pb0(K0));
                    eb0Var.setBackground(bkb.L0(z3));
                    eb0Var.setOnClickListener(new fg(hdVarArr, od3Var, longValue, (byte) 0));
                    j2.addView(eb0Var, nme.o(-1, -2));
                    hdVar = hdVar2;
                    z5 = z3;
                    z4 = true;
                    size = i2;
                }
            }
            hd hdVar3 = hdVar;
            hdVarArr[z5 ? 1 : 0] = hdVar3;
            hdVar3.show();
            TextView textView2 = (TextView) hdVar3.c(-1);
            if (textView2 != null) {
                zkb.X(textView2, bkb.p7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        rd3 rd3Var2 = this.d2;
        int i5 = rd3Var2.i;
        if (i5 > 0) {
            str = k96.G(i5, "UsersReported", new Object[0]);
        } else {
            str = "";
        }
        rd3 rd3Var3 = this.g2;
        if (rd3Var3.i > 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat("\n");
            }
            boolean z6 = this.b2;
            int i6 = rd3Var3.i;
            if (z6) {
                str = str.concat(k96.G(i6, "UsersRestricted", new Object[0]));
            } else {
                str = str.concat(k96.G(i6, "UsersBanned", new Object[0]));
            }
        }
        boolean z7 = this.v2;
        if (z7 && !this.x2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rd3Var3.i > 0) {
            i = 2131624049;
        } else {
            i = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 2131748268;
        d dVar = this.r1;
        if (isEmpty) {
            u21 b0 = u21.b0(dVar);
            if (z2) {
                i7 = 2131746188;
            }
            ir2.v(null, i7, b0, i, 36);
        } else {
            u21 b02 = u21.b0(dVar);
            if (z2) {
                i7 = 2131746188;
            }
            b02.I(i, k96.M0(i7, null), str).j();
        }
        if (j != 0 && this.k2) {
            na7 q1 = na7.q1(this.a);
            long j3 = this.U1.id;
            b = 0;
            np0 np0Var = new np0((byte) 0);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = q1.f1(j3);
            tL_communities_toggleParticipantBanned.participant = q1.h1(j);
            tL_communities_toggleParticipantBanned.unban = false;
            q1.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new hc((byte) 0), new jy(q1, j3, np0Var));
        } else {
            b = 0;
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final sd3 b;

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
                sd3 sd3Var = this.b;
                k27 k27Var = (k27) obj;
                switch (b2) {
                    case 0:
                        long j4 = sd3Var.X1;
                        TLRPC.Peer peer = k27Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = k27Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j5 = peer2.chat_id;
                        long j6 = sd3Var.X1;
                        if (j5 != (-j6) || j6 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = k27Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-sd3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1(b)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final sd3 b;

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
                sd3 sd3Var = this.b;
                k27 k27Var = (k27) obj;
                switch (b2) {
                    case 0:
                        long j4 = sd3Var.X1;
                        TLRPC.Peer peer = k27Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = k27Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j5 = peer2.chat_id;
                        long j6 = sd3Var.X1;
                        if (j5 != (-j6) || j6 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = k27Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-sd3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1((byte) 0)));
        TLRPC.Chat chat = this.T1;
        rd3 rd3Var4 = this.e2;
        if (z7) {
            if (!this.y2) {
                rd3Var4.b(new lt2(this, arrayList3, arrayList4, (byte) 6));
            }
            rd3Var = rd3Var4;
        } else {
            if (!arrayList3.isEmpty()) {
                rd3Var = rd3Var4;
                na7.q1(this.a).V(arrayList3, null, null, -chat.id, this.Y1, false, this.Z1);
            } else {
                rd3Var = rd3Var4;
            }
            if (!arrayList4.isEmpty()) {
                na7.q1(this.a).V(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        rd3Var3.c(new od3(this, (byte) 3));
        for (int i8 = 0; i8 < rd3Var2.g; i8++) {
            if (rd3Var2.d[i8] && ((zArr = rd3Var2.e) == null || zArr[i8])) {
                TLObject tLObject = (TLObject) rd3Var2.c.get(i8);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final sd3 b;

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
                        sd3 sd3Var = this.b;
                        k27 k27Var = (k27) obj;
                        switch (b2) {
                            case 0:
                                long j4 = sd3Var.X1;
                                TLRPC.Peer peer = k27Var.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j4)) && j4 != 0) {
                                    return false;
                                }
                                return true;
                            case 1:
                                TLRPC.Peer peer2 = k27Var.k.peer_id;
                                if (peer2 == null) {
                                    return false;
                                }
                                long j5 = peer2.chat_id;
                                long j6 = sd3Var.X1;
                                if (j5 != (-j6) || j6 == 0) {
                                    return false;
                                }
                                return true;
                            default:
                                TLRPC.Peer peer3 = k27Var.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-sd3Var.X1)) {
                                    return false;
                                }
                                return true;
                        }
                    }
                }).filter(new km1(tLObject, (byte) 2)).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1((byte) 0)));
                if (z7 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = na7.j1(chat);
                    tL_messages_reportReaction.user_id = na7.q1(this.a).o1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = na7.g1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = na7.l1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = na7.j1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.u2) {
            rd3Var.b(new od3(this, (byte) 0));
            return;
        }
        rd3Var.c(new od3(this, (byte) 1));
        this.f2.c(new od3(this, (byte) 2));
    }

    @Override
    public final void dismiss() {
        boolean z;
        SharedPreferences.Editor edit = na7.q1(this.a).X3.edit();
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

    @Override
    public final void p0() {
        super.p0();
        int v0 = bkb.v0(bkb.Z6, this.J0);
        if (v0 != this.B2) {
            this.B2 = v0;
            s0(v0);
        }
    }

    @Override
    public final void show() {
        super.show();
        m21.e();
    }
}
