package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Wallet.c;
public final class lf2 implements jac {
    public final byte a;
    public final Object b;
    public final Object c;

    public lf2(c cVar, String str, qac qacVar) {
        this.a = (byte) 18;
        this.b = str;
        this.c = qacVar;
    }

    private final void b(Object obj, Object obj2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        g95 g95Var = (g95) this.b;
        qd2 qd2Var = (qd2) this.c;
        Boolean bool = (Boolean) obj;
        HashSet hashSet = (HashSet) obj2;
        qd2 qd2Var2 = g95Var.T2;
        if (qd2Var2 != null && (groupCall = qd2Var2.b) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                long longValue = l.longValue();
                g95Var.T2.a(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = g95Var.T2.b;
                tL_inputGroupCall.id = groupCall2.id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                oc7 r1 = oc7.r1(g95Var.a);
                inviteconferencecallparticipant.user_id = r1.p1(r1.W1(l));
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(g95Var.a).sendRequest(inviteconferencecallparticipant, new xs0(g95Var, longValue, hashSet2, atomicInteger, size, qd2Var, str));
            }
            g95Var.D0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                g95Var.L1(true, true);
            }
        }
    }

    @Override
    public final void a(java.lang.Object r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.a(java.lang.Object, java.lang.Object):void");
    }

    public lf2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
