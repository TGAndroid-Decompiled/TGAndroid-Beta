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
public final class ef3 extends mz0 {
    public float A2;
    public int B2;
    public l7c S1;
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
    public final df3 d2;
    public final df3 e2;
    public final df3 f2;
    public final df3 g2;
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

    public ef3(org.telegram.ui.ActionBar.d r21, org.telegram.tgnet.TLRPC.Chat r22, java.util.ArrayList r23, java.util.ArrayList r24, org.telegram.tgnet.TLRPC.ChannelParticipant[] r25, long r26, int r28, int r29, boolean r30, java.lang.Runnable r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef3.<init>(org.telegram.ui.ActionBar.d, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    @Override
    public final boolean E0(View view, float f, float f2) {
        return !(view instanceof dm2);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, this.r1.getClassGuid(), true, new ye3(this, (byte) 0), this.J0);
        this.S1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        boolean[] zArr;
        if (this.v2) {
            if (this.x2) {
                return jb6.M0(2131751460, null);
            }
            if (this.y2) {
                return jb6.M0(2131751442, null);
            }
            return jb6.G(1, "DeleteReactionOptionsTitle", new Object[0]);
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
                    df3 df3Var = this.e2;
                    if (i3 >= df3Var.g) {
                        break;
                    }
                    if (df3Var.d[i3] && ((zArr = df3Var.e) == null || zArr[i3])) {
                        TLObject tLObject = (TLObject) df3Var.c.get(i3);
                        iArr[0] = iArr[0] + this.n2[i3];
                    }
                    i3++;
                }
            }
        }
        return jb6.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    public final boolean Y0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.q2;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void Z0(ArrayList arrayList, df3 df3Var) {
        boolean z;
        boolean e = df3Var.e();
        int i = df3Var.g;
        byte b = df3Var.a;
        if (e) {
            boolean d = df3Var.d();
            String str = df3Var.b;
            boolean z2 = false;
            if (!d) {
                c6c z3 = c6c.z(b, str);
                if (df3Var.i > 0) {
                    z2 = true;
                }
                z3.L(z2);
                arrayList.add(z3);
                return;
            }
            int i2 = df3Var.i;
            if (i2 <= 0) {
                if (df3Var.e != null) {
                    i2 = df3Var.h;
                } else {
                    i2 = i;
                }
            }
            String valueOf = String.valueOf(i2);
            c6c c6cVar = new c6c(36);
            c6cVar.d = b;
            c6cVar.m = str;
            c6cVar.p = valueOf;
            if (df3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            c6cVar.L(z);
            c6cVar.f = df3Var.f;
            c6cVar.E = new rc1(this, df3Var, (byte) 28);
            arrayList.add(c6cVar);
            if (!df3Var.f) {
                for (int i3 = 0; i3 < i; i3++) {
                    boolean[] zArr = df3Var.e;
                    if (zArr == null || zArr[i3]) {
                        c6c c6cVar2 = new c6c(37);
                        c6cVar2.d = (b << 24) | i3;
                        c6cVar2.H = (TLObject) df3Var.c.get(i3);
                        c6cVar2.L(df3Var.d[i3]);
                        c6cVar2.i = 1;
                        arrayList.add(c6cVar2);
                    }
                }
            }
        }
    }

    public final void a1(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.n2[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(this.W1).filter(new sn1(inputPeer, (byte) 1)).count());
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
        Rect rect = gm.Q;
        r59 r59Var = this.n1;
        rect.set(0, 0, r59Var.getMeasuredWidth(), r59Var.getMeasuredHeight() - gm.L(34.0f));
        r59Var.setClipBounds(rect);
    }

    public final void b1() {
        if (this.p2) {
            X0();
        } else if (!this.o2) {
            this.o2 = true;
            df3 df3Var = this.e2;
            int i = df3Var.g;
            this.n2 = new int[i];
            int[] iArr = {i};
            for (int i2 = 0; i2 < df3Var.g; i2++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = oc7.k1(this.T1);
                tL_messages_search.q = "";
                TLRPC.InputPeer j1 = oc7.j1((TLObject) df3Var.c.get(i2));
                tL_messages_search.from_id = j1;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new af(this, j1, i2, iArr, (byte) 3));
            }
        }
    }

    public final void c1() {
        boolean z;
        boolean z2;
        boolean z3 = this.b2;
        boolean z4 = false;
        df3 df3Var = this.g2;
        if (z3 && df3Var.e()) {
            if (df3Var.i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.z2 = z2;
        }
        if (this.b2 && df3Var.e() && df3Var.i == 0) {
            df3Var.f();
        } else if (!this.b2 && df3Var.e()) {
            boolean z5 = this.z2;
            if (df3Var.i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z5 != z) {
                df3Var.f();
            }
        }
        if (!this.b2 && df3Var.e()) {
            if (df3Var.i > 0) {
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
        df3 df3Var;
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
            ylb ylbVar = this.J0;
            int i3 = this.a;
            ArrayList<Long> arrayList = this.m2.creator_chat_ids;
            af3 af3Var = new af3(this, (byte) 6);
            ze3 ze3Var = new ze3(this, (byte) 0);
            Pattern pattern = ik.a;
            LinearLayout i4 = hg9.i(context, 1);
            he[] heVarArr = new he[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            String M0 = jb6.M0(2131751892, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.G(arrayList.size(), "CommunityBanWarningMessage", pg3.r(i3, j)));
            alertDialog$Builder.j(jb6.M0(2131753694, null), new l0(ze3Var, (byte) 15));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.n(i4);
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Long l = arrayList.get(i5);
                i5++;
                Long l2 = l;
                he heVar2 = heVar;
                long longValue = l2.longValue();
                TLRPC.Chat L0 = oc7.r1(i3).L0(l2);
                TLRPC.ChatFull M02 = oc7.r1(i3).M0(longValue);
                if (L0 == null) {
                    heVar = heVar2;
                } else {
                    ec0 ec0Var = new ec0(ylbVar, context, z4);
                    ((TextView) ec0Var.c).setText(pg3.l(L0));
                    TextView textView = (TextView) ec0Var.d;
                    if (M02 != null) {
                        i2 = size;
                        z3 = false;
                        charSequence = jb6.G(M02.participants_count, "Members", new Object[0]);
                    } else {
                        i2 = size;
                        z3 = false;
                        charSequence = null;
                    }
                    textView.setText(charSequence);
                    ((bf0) ec0Var.b).f(L0, new pc0(L0));
                    ec0Var.setBackground(cmb.L0(z3));
                    ec0Var.setOnClickListener(new fh(heVarArr, af3Var, longValue, (byte) 0));
                    i4.addView(ec0Var, qoe.o(-1, -2));
                    heVar = heVar2;
                    z5 = z3;
                    z4 = true;
                    size = i2;
                }
            }
            he heVar3 = heVar;
            heVarArr[z5 ? 1 : 0] = heVar3;
            heVar3.show();
            TextView textView2 = (TextView) heVar3.c(-1);
            if (textView2 != null) {
                anb.X(textView2, cmb.p7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        df3 df3Var2 = this.d2;
        int i6 = df3Var2.i;
        if (i6 > 0) {
            str = jb6.G(i6, "UsersReported", new Object[0]);
        } else {
            str = "";
        }
        df3 df3Var3 = this.g2;
        if (df3Var3.i > 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat("\n");
            }
            boolean z6 = this.b2;
            int i7 = df3Var3.i;
            if (z6) {
                str = str.concat(jb6.G(i7, "UsersRestricted", new Object[0]));
            } else {
                str = str.concat(jb6.G(i7, "UsersBanned", new Object[0]));
            }
        }
        boolean z7 = this.v2;
        if (z7 && !this.x2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (df3Var3.i > 0) {
            i = 2131624049;
        } else {
            i = 2131623990;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i8 = 2131748217;
        d dVar = this.r1;
        if (isEmpty) {
            c41 b0 = c41.b0(dVar);
            if (z2) {
                i8 = 2131746114;
            }
            ts2.u(null, i8, b0, i, 36);
        } else {
            c41 b02 = c41.b0(dVar);
            if (z2) {
                i8 = 2131746114;
            }
            b02.I(i, jb6.M0(i8, null), str).j();
        }
        if (j != 0 && this.k2) {
            oc7 r1 = oc7.r1(this.a);
            long j2 = this.U1.id;
            b = 0;
            nq0 nq0Var = new nq0((byte) 0);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = r1.g1(j2);
            tL_communities_toggleParticipantBanned.participant = r1.i1(j);
            tL_communities_toggleParticipantBanned.unban = false;
            r1.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new kc((byte) 0), new jz(r1, j2, nq0Var));
        } else {
            b = 0;
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final ef3 b;

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
                ef3 ef3Var = this.b;
                k47 k47Var = (k47) obj;
                switch (b2) {
                    case 0:
                        long j3 = ef3Var.X1;
                        TLRPC.Peer peer = k47Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j3)) && j3 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = k47Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j4 = peer2.chat_id;
                        long j5 = ef3Var.X1;
                        if (j4 != (-j5) || j5 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = k47Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-ef3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new x00((byte) 6)).collect(Collectors.toCollection(new tn1(b)));
        ArrayList arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final ef3 b;

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
                ef3 ef3Var = this.b;
                k47 k47Var = (k47) obj;
                switch (b2) {
                    case 0:
                        long j3 = ef3Var.X1;
                        TLRPC.Peer peer = k47Var.k.peer_id;
                        if ((peer == null || peer.chat_id == (-j3)) && j3 != 0) {
                            return false;
                        }
                        return true;
                    case 1:
                        TLRPC.Peer peer2 = k47Var.k.peer_id;
                        if (peer2 == null) {
                            return false;
                        }
                        long j4 = peer2.chat_id;
                        long j5 = ef3Var.X1;
                        if (j4 != (-j5) || j5 == 0) {
                            return false;
                        }
                        return true;
                    default:
                        TLRPC.Peer peer3 = k47Var.k.peer_id;
                        if (peer3 == null || peer3.chat_id == (-ef3Var.X1)) {
                            return false;
                        }
                        return true;
                }
            }
        }).map(new x00((byte) 6)).collect(Collectors.toCollection(new tn1((byte) 0)));
        TLRPC.Chat chat = this.T1;
        df3 df3Var4 = this.e2;
        if (z7) {
            if (!this.y2) {
                df3Var4.b(new wu2(this, arrayList3, arrayList4, (byte) 6));
            }
            df3Var = df3Var4;
        } else {
            if (!arrayList3.isEmpty()) {
                df3Var = df3Var4;
                oc7.r1(this.a).V(arrayList3, null, null, -chat.id, this.Y1, false, this.Z1);
            } else {
                df3Var = df3Var4;
            }
            if (!arrayList4.isEmpty()) {
                oc7.r1(this.a).V(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        df3Var3.c(new af3(this, (byte) 3));
        for (int i9 = 0; i9 < df3Var2.g; i9++) {
            if (df3Var2.d[i9] && ((zArr = df3Var2.e) == null || zArr[i9])) {
                TLObject tLObject = (TLObject) df3Var2.c.get(i9);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final ef3 b;

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
                        ef3 ef3Var = this.b;
                        k47 k47Var = (k47) obj;
                        switch (b2) {
                            case 0:
                                long j3 = ef3Var.X1;
                                TLRPC.Peer peer = k47Var.k.peer_id;
                                if ((peer == null || peer.chat_id == (-j3)) && j3 != 0) {
                                    return false;
                                }
                                return true;
                            case 1:
                                TLRPC.Peer peer2 = k47Var.k.peer_id;
                                if (peer2 == null) {
                                    return false;
                                }
                                long j4 = peer2.chat_id;
                                long j5 = ef3Var.X1;
                                if (j4 != (-j5) || j5 == 0) {
                                    return false;
                                }
                                return true;
                            default:
                                TLRPC.Peer peer3 = k47Var.k.peer_id;
                                if (peer3 == null || peer3.chat_id == (-ef3Var.X1)) {
                                    return false;
                                }
                                return true;
                        }
                    }
                }).filter(new sn1(tLObject, (byte) 2)).map(new x00((byte) 6)).collect(Collectors.toCollection(new tn1((byte) 0)));
                if (z7 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = oc7.k1(chat);
                    tL_messages_reportReaction.user_id = oc7.r1(this.a).p1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = oc7.h1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = oc7.m1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = oc7.k1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.u2) {
            df3Var.b(new af3(this, (byte) 0));
            return;
        }
        df3Var.c(new af3(this, (byte) 1));
        this.f2.c(new af3(this, (byte) 2));
    }

    @Override
    public final void dismiss() {
        boolean z;
        SharedPreferences.Editor edit = oc7.r1(this.a).X3.edit();
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
        int v0 = cmb.v0(cmb.Z6, this.J0);
        if (v0 != this.B2) {
            this.B2 = v0;
            s0(v0);
        }
    }

    @Override
    public final void show() {
        super.show();
        u31.e();
    }
}
