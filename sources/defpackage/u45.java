package defpackage;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
public final class u45 implements View.OnClickListener {
    public final ez3 a = new ez3(this, (byte) 11);
    public final h75 b;

    public u45(h75 h75Var) {
        this.b = h75Var;
    }

    @Override
    public final void onClick(View view) {
        byte b;
        ke5 ke5Var;
        int i;
        TLObject K0;
        h75 h75Var = this.b;
        s45 s45Var = h75Var.w1;
        dic dicVar = h75Var.v1;
        j5 j5Var = h75Var.n1;
        oy8 oy8Var = h75Var.E2;
        if (h75Var.T2 != null && (b = h75Var.z3) != 3) {
            int i2 = 0;
            if (b == 5) {
                if (!h75Var.A3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h75Var.A3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    fc2 fc2Var = h75Var.T2;
                    startscheduledgroupcall.call = fc2Var.h(fc2Var.a);
                    ConnectionsManager.getInstance(j5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final u45 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b2 = r2;
                            u45 u45Var = this.b;
                            switch (b2) {
                                case 0:
                                    if (tLObject != null) {
                                        na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                        return;
                                    }
                                    return;
                                default:
                                    if (tLObject != null) {
                                        na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            int i3 = 7;
            if (b != 7 && b != 6) {
                if (VoIPService.getSharedInstance() != null && (i = h75Var.M3) != 1 && i != 2 && i != 6 && i != 5) {
                    byte b2 = h75Var.z3;
                    if (b2 != 2 && b2 != 4) {
                        try {
                            if (b2 == 0) {
                                LaunchActivity launchActivity = h75Var.b2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    rqe.c(2131624121, 2131743041, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bm0((byte) 15));
                                    return;
                                }
                                h75Var.H1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                dicVar.performHapticFeedback(3, 2);
                                return;
                            }
                            h75Var.H1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            dicVar.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    } else if (!h75Var.g1() && !h75Var.F2) {
                        h75Var.F2 = true;
                        gl.z3(dicVar.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.b.nextInt(100);
                        int i4 = 120;
                        if (nextInt >= 32) {
                            i2 = 240;
                            if (nextInt >= 64) {
                                i4 = 420;
                                if (nextInt >= 97) {
                                    i2 = 540;
                                    if (nextInt != 98) {
                                        i4 = 720;
                                    }
                                }
                            }
                            int i5 = i2;
                            i2 = i4;
                            i4 = i5;
                        }
                        oy8Var.K(i4);
                        oy8Var.N(i4 - 1, this.a);
                        s45Var.setAnimation(oy8Var);
                        oy8Var.H(i2);
                        s45Var.d();
                        if (h75Var.z3 == 2) {
                            long B1 = k27.B1(((TLRPC.GroupCallParticipant) h75Var.T2.d.f(k27.B1(h75Var.u2))).peer);
                            if (cf3.D(B1)) {
                                K0 = na7.q1(j5Var.a).V1(Long.valueOf(B1));
                            } else {
                                K0 = na7.q1(j5Var.a).K0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(K0, null, null, null, Boolean.TRUE, null);
                            h75Var.H1(4, true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (b == 6 && (ke5Var = h75Var.g2) != null) {
                ke5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            fc2 fc2Var2 = h75Var.T2;
            togglegroupcallstartsubscription.call = fc2Var2.h(fc2Var2.a);
            TLRPC.GroupCall groupCall = h75Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(j5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                public final u45 b;

                {
                    this.b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b22 = r2;
                    u45 u45Var = this.b;
                    switch (b22) {
                        case 0:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                        default:
                            if (tLObject != null) {
                                na7.q1(u45Var.b.n1.a).R3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                    }
                }
            });
            if (!h75Var.T2.b.schedule_start_subscribed) {
                i3 = 6;
            }
            h75Var.H1(i3, true);
        }
    }
}
