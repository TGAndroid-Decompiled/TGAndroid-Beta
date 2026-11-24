package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public abstract class ka1 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        boolean z2;
        qd2 qd2Var;
        int i2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z3;
        int i3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && i > 0) {
            ArrayList arrayList2 = new ArrayList(3);
            int i4 = 0;
            if (z && sharedInstance.mutedByAdmin()) {
                qd2 qd2Var2 = sharedInstance.groupCall;
                if (qd2Var2 != null) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var2.d.f(sharedInstance.getSelfId());
                } else {
                    groupCallParticipant = null;
                }
                if (groupCallParticipant != null && groupCallParticipant.raise_hand_rating != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i3 = 2131743078;
                } else {
                    i3 = 2131742974;
                }
                arrayList2.add(new ja1(new uc8(1, 2131232433, jb6.M0(i3, null), !z3), 100, 0));
            } else if (sharedInstance.isMicMute()) {
                arrayList2.add(new ja1(new uc8(1, 2131232433, jb6.M0(2131742914, null), true), 100, 0));
            } else {
                arrayList2.add(new ja1(new uc8(1, 2131232437, jb6.M0(2131742977, null), true), 100, 0));
            }
            int videoState = sharedInstance.getVideoState(false);
            if (videoState == 2) {
                arrayList2.add(new ja1(new uc8(2, 2131232558, jb6.M0(2131742921, null), true), 90, 1));
            } else if (a || videoState == 1) {
                String M0 = jb6.M0(2131742922, null);
                if (a.b.checkSelfPermission("android.permission.CAMERA") != 0 || (z && ((qd2Var = sharedInstance.groupCall) == null || !qd2Var.c()))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                arrayList2.add(new ja1(new uc8(2, 2131232557, M0, z2), 60, 1));
            }
            if (z) {
                i2 = 2131743048;
            } else {
                i2 = 2131743096;
            }
            arrayList2.add(new ja1(new uc8(3, 2131232135, jb6.M0(i2, null), true), 80, 2));
            Collections.sort(arrayList2, new sa((byte) 15));
            while (arrayList2.size() > i) {
                td4.w(1, arrayList2);
            }
            Collections.sort(arrayList2, new sa((byte) 16));
            int size = arrayList2.size();
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                arrayList.add(((ja1) obj).a);
            }
        }
    }

    public static void b(int i, boolean z) {
        qd2 qd2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (e21.a) {
                StringBuilder l = hg9.l(i, "call pip: action ", ", camera ");
                l.append(sharedInstance.getVideoState(false));
                l.append(", mic muted ");
                l.append(sharedInstance.isMicMute());
                fc4.b(l.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(z8c.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                }
            } else if (i == 2) {
                int videoState = sharedInstance.getVideoState(false);
                if (videoState == 2) {
                    sharedInstance.setVideoState(false, 0);
                } else if (a.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    if (!z || ((qd2Var = sharedInstance.groupCall) != null && qd2Var.c())) {
                        if (videoState == 0) {
                            sharedInstance.createCaptureDevice(false);
                            sharedInstance.requestVideoCall(false);
                        }
                        sharedInstance.setVideoState(false, 2);
                    }
                }
            } else if (i == 3) {
                if (z) {
                    g95.l1(a.b, null, false, true);
                } else {
                    sharedInstance.hangUp();
                }
            }
        }
    }

    public static long c() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0L;
        }
        return (((sharedInstance.getVideoState(false) << 1) + (sharedInstance.isMicMute() ? 1L : 0L)) << 1) + (sharedInstance.mutedByAdmin() ? 1L : 0L);
    }
}
