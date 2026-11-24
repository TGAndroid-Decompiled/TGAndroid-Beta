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
public final class s65 implements View.OnClickListener {
    public final o04 a = new o04(this, (byte) 11);
    public final g95 b;

    public s65(g95 g95Var) {
        this.b = g95Var;
    }

    @Override
    public final void onClick(View view) {
        byte b;
        ig5 ig5Var;
        int i;
        TLObject L0;
        g95 g95Var = this.b;
        q65 q65Var = g95Var.w1;
        dkc dkcVar = g95Var.v1;
        j5 j5Var = g95Var.n1;
        p09 p09Var = g95Var.E2;
        if (g95Var.T2 != null && (b = g95Var.z3) != 3) {
            int i2 = 0;
            if (b == 5) {
                if (!g95Var.A3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g95Var.A3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    qd2 qd2Var = g95Var.T2;
                    startscheduledgroupcall.call = qd2Var.h(qd2Var.a);
                    ConnectionsManager.getInstance(j5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final s65 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b2 = r2;
                            s65 s65Var = this.b;
                            switch (b2) {
                                case 0:
                                    if (tLObject != null) {
                                        oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                        return;
                                    }
                                    return;
                                default:
                                    if (tLObject != null) {
                                        oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i = g95Var.M3) != 1 && i != 2 && i != 6 && i != 5) {
                    byte b2 = g95Var.z3;
                    if (b2 != 2 && b2 != 4) {
                        try {
                            if (b2 == 0) {
                                LaunchActivity launchActivity = g95Var.b2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    use.c(2131624121, 2131742967, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bn0((byte) 15));
                                    return;
                                }
                                g95Var.H1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                dkcVar.performHapticFeedback(3, 2);
                                return;
                            }
                            g95Var.H1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            dkcVar.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    } else if (!g95Var.g1() && !g95Var.F2) {
                        g95Var.F2 = true;
                        gm.z3(dkcVar.getTextView());
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
                        p09Var.K(i4);
                        p09Var.N(i4 - 1, this.a);
                        q65Var.setAnimation(p09Var);
                        p09Var.H(i2);
                        q65Var.d();
                        if (g95Var.z3 == 2) {
                            long B1 = k47.B1(((TLRPC.GroupCallParticipant) g95Var.T2.d.f(k47.B1(g95Var.u2))).peer);
                            if (pg3.D(B1)) {
                                L0 = oc7.r1(j5Var.a).W1(Long.valueOf(B1));
                            } else {
                                L0 = oc7.r1(j5Var.a).L0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(L0, null, null, null, Boolean.TRUE, null);
                            g95Var.H1(4, true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (b == 6 && (ig5Var = g95Var.g2) != null) {
                ig5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            qd2 qd2Var2 = g95Var.T2;
            togglegroupcallstartsubscription.call = qd2Var2.h(qd2Var2.a);
            TLRPC.GroupCall groupCall = g95Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(j5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                public final s65 b;

                {
                    this.b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b22 = r2;
                    s65 s65Var = this.b;
                    switch (b22) {
                        case 0:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                        default:
                            if (tLObject != null) {
                                oc7.r1(s65Var.b.n1.a).T3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                    }
                }
            });
            if (!g95Var.T2.b.schedule_start_subscribed) {
                i3 = 6;
            }
            g95Var.H1(i3, true);
        }
    }
}
