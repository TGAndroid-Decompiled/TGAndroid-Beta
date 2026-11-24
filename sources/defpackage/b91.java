package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public abstract class b91 {
    public static boolean a;

    public static void a(int i, ArrayList arrayList, boolean z) {
        boolean z2;
        fc2 fc2Var;
        int i2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z3;
        int i3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && i > 0) {
            ArrayList arrayList2 = new ArrayList(3);
            int i4 = 0;
            if (z && sharedInstance.mutedByAdmin()) {
                fc2 fc2Var2 = sharedInstance.groupCall;
                if (fc2Var2 != null) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var2.d.f(sharedInstance.getSelfId());
                } else {
                    groupCallParticipant = null;
                }
                if (groupCallParticipant != null && groupCallParticipant.raise_hand_rating != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i3 = 2131743152;
                } else {
                    i3 = 2131743048;
                }
                arrayList2.add(new a91(new ra8(1, 2131232432, k96.M0(i3, null), !z3), 100, 0));
            } else if (sharedInstance.isMicMute()) {
                arrayList2.add(new a91(new ra8(1, 2131232432, k96.M0(2131742988, null), true), 100, 0));
            } else {
                arrayList2.add(new a91(new ra8(1, 2131232436, k96.M0(2131743051, null), true), 100, 0));
            }
            int videoState = sharedInstance.getVideoState(false);
            if (videoState == 2) {
                arrayList2.add(new a91(new ra8(2, 2131232546, k96.M0(2131742995, null), true), 90, 1));
            } else if (a || videoState == 1) {
                String M0 = k96.M0(2131742996, null);
                if (a.b.checkSelfPermission("android.permission.CAMERA") != 0 || (z && ((fc2Var = sharedInstance.groupCall) == null || !fc2Var.c()))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                arrayList2.add(new a91(new ra8(2, 2131232545, M0, z2), 60, 1));
            }
            if (z) {
                i2 = 2131743122;
            } else {
                i2 = 2131743170;
            }
            arrayList2.add(new a91(new ra8(3, 2131232134, k96.M0(i2, null), true), 80, 2));
            Collections.sort(arrayList2, new sa((byte) 15));
            while (arrayList2.size() > i) {
                tb4.v(1, arrayList2);
            }
            Collections.sort(arrayList2, new sa((byte) 16));
            int size = arrayList2.size();
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                arrayList.add(((a91) obj).a);
            }
        }
    }

    public static void b(int i, boolean z) {
        fc2 fc2Var;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (w01.a) {
                StringBuilder m = de9.m(i, "call pip: action ", ", camera ");
                m.append(sharedInstance.getVideoState(false));
                m.append(", mic muted ");
                m.append(sharedInstance.isMicMute());
                fa4.b(m.toString());
            }
            if (i == 1) {
                if (z && sharedInstance.mutedByAdmin()) {
                    sharedInstance.editCallMember(y6c.h(sharedInstance.getAccount()).f(), null, null, null, Boolean.TRUE, null);
                } else {
                    sharedInstance.setMicMute(!sharedInstance.isMicMute(), false, true);
                }
            } else if (i == 2) {
                int videoState = sharedInstance.getVideoState(false);
                if (videoState == 2) {
                    sharedInstance.setVideoState(false, 0);
                } else if (a.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    if (!z || ((fc2Var = sharedInstance.groupCall) != null && fc2Var.c())) {
                        if (videoState == 0) {
                            sharedInstance.createCaptureDevice(false);
                            sharedInstance.requestVideoCall(false);
                        }
                        sharedInstance.setVideoState(false, 2);
                    }
                }
            } else if (i == 3) {
                if (z) {
                    h75.l1(a.b, null, false, true);
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
