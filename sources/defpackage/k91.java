package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public abstract class k91 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        boolean z2;
        vc2 vc2Var;
        int i2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z3;
        int i3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && i > 0) {
            ArrayList arrayList2 = new ArrayList(3);
            int i4 = 0;
            if (z && sharedInstance.mutedByAdmin()) {
                vc2 vc2Var2 = sharedInstance.groupCall;
                if (vc2Var2 != null) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var2.d.f(sharedInstance.getSelfId());
                } else {
                    groupCallParticipant = null;
                }
                if (groupCallParticipant != null && groupCallParticipant.raise_hand_rating != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i3 = 2131743046;
                } else {
                    i3 = 2131742942;
                }
                arrayList2.add(new j91(new ie8(1, 2131232432, ob6.M0(i3, null), !z3), 100, 0));
            } else if (sharedInstance.isMicMute()) {
                arrayList2.add(new j91(new ie8(1, 2131232432, ob6.M0(2131742882, null), true), 100, 0));
            } else {
                arrayList2.add(new j91(new ie8(1, 2131232436, ob6.M0(2131742945, null), true), 100, 0));
            }
            int videoState = sharedInstance.getVideoState(false);
            if (videoState == 2) {
                arrayList2.add(new j91(new ie8(2, 2131232557, ob6.M0(2131742889, null), true), 90, 1));
            } else if (a || videoState == 1) {
                String M0 = ob6.M0(2131742890, null);
                if (a.b.checkSelfPermission("android.permission.CAMERA") != 0 || (z && ((vc2Var = sharedInstance.groupCall) == null || !vc2Var.c()))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                arrayList2.add(new j91(new ie8(2, 2131232556, M0, z2), 60, 1));
            }
            if (z) {
                i2 = 2131743016;
            } else {
                i2 = 2131743064;
            }
            arrayList2.add(new j91(new ie8(3, 2131232134, ob6.M0(i2, null), true), 80, 2));
            Collections.sort(arrayList2, new ta((byte) 15));
            while (arrayList2.size() > i) {
                qd4.v(1, arrayList2);
            }
            Collections.sort(arrayList2, new ta((byte) 16));
            int size = arrayList2.size();
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                arrayList.add(((j91) obj).a);
            }
        }
    }

    public static void b(int i, boolean z) {
        vc2 vc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (f11.a) {
                StringBuilder m = uh9.m(i, "call pip: action ", ", camera ");
                m.append(sharedInstance.getVideoState(false));
                m.append(", mic muted ");
                m.append(sharedInstance.isMicMute());
                cc4.b(m.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(yac.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                }
            } else if (i == 2) {
                int videoState = sharedInstance.getVideoState(false);
                if (videoState == 2) {
                    sharedInstance.setVideoState(false, 0);
                } else if (a.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    if (!z || ((vc2Var = sharedInstance.groupCall) != null && vc2Var.c())) {
                        if (videoState == 0) {
                            sharedInstance.createCaptureDevice(false);
                            sharedInstance.requestVideoCall(false);
                        }
                        sharedInstance.setVideoState(false, 2);
                    }
                }
            } else if (i == 3) {
                if (z) {
                    j95.m1(a.b, null, false, true);
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
