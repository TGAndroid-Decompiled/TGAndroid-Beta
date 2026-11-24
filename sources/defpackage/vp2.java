package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class vp2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final long c;
    public final Object d;

    public vp2(jm7 jm7Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.b = z;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.b;
        long j = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                xp2 xp2Var = (xp2) obj;
                xp2Var.i = null;
                xp2Var.g.l(j);
                for (int size = xp2Var.j.size() - 1; size >= 0; size--) {
                    if (pg3.n(((TL_communities.CommunityPeerRequest) xp2Var.j.get(size)).peer) == j) {
                        xp2Var.j.remove(size);
                    }
                }
                xp2Var.a();
                wp2 wp2Var = xp2Var.h;
                if (wp2Var != null) {
                    wp2Var.U();
                }
                oc7 r1 = oc7.r1(xp2Var.d);
                long j2 = xp2Var.e;
                up2 up2Var = new up2(xp2Var, (byte) 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = r1.g1(j2);
                tL_communities_togglePeerLinkRequestApproval.peer = r1.i1(j);
                tL_communities_togglePeerLinkRequestApproval.reject = !z;
                r1.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new kc((byte) 0), new fv4(r1, j2, up2Var, (byte) 3));
                return;
            case 1:
                HashSet hashSet = ((lo7) obj).y;
                if (z) {
                    hashSet.add(Long.valueOf(j));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j));
                    return;
                }
            case 2:
                eya eyaVar = (eya) obj;
                eyaVar.z1 = j;
                eyaVar.y1 = j;
                if (z) {
                    i96 i96Var = eyaVar.A1;
                    i96Var.c = j;
                    eyaVar.B1.set(i96Var);
                }
                eyaVar.H0();
                eyaVar.D1.a(true, true);
                dya dyaVar = eyaVar.x1;
                if (dyaVar != null) {
                    dyaVar.setMyPrivacy(eyaVar.y1);
                    return;
                }
                return;
            case 3:
                v7b v7bVar = (v7b) obj;
                a8b a8bVar = v7bVar.a0;
                if (z) {
                    int i = a8b.X1;
                    oc7.r1(a8bVar.a).Y2(Long.valueOf(j), new rz3(v7bVar, j, (byte) 2), 200);
                    return;
                }
                int i2 = a8b.X1;
                oc7.r1(a8bVar.a).a3(0, j, true);
                return;
            default:
                qwb qwbVar = (qwb) obj;
                qwbVar.getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
                qwbVar.a.l(j);
                qwbVar.b.l(j);
                qwbVar.d.delete(j);
                qwbVar.s.l(j);
                TLRPC.Chat L0 = qwbVar.getMessagesController().L0(Long.valueOf(j));
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    qwbVar.n(0, j, z);
                }
                qwbVar.y(j, true);
                return;
        }
    }

    public vp2(Object obj, long j, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = z;
    }
}
