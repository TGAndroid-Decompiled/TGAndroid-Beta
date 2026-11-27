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
public final class w65 implements View.OnClickListener {
    public final zz3 a = new zz3(this, (byte) 11);
    public final j95 b;

    public w65(j95 j95Var) {
        this.b = j95Var;
    }

    @Override
    public final void onClick(View view) {
        byte b;
        lg5 lg5Var;
        int i;
        TLObject M0;
        j95 j95Var = this.b;
        u65 u65Var = j95Var.w1;
        kmc kmcVar = j95Var.v1;
        k5 k5Var = j95Var.n1;
        b29 b29Var = j95Var.E2;
        if (j95Var.T2 != null && (b = j95Var.z3) != 3) {
            int i2 = 0;
            if (b == 5) {
                if (!j95Var.A3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    j95Var.A3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    vc2 vc2Var = j95Var.T2;
                    startscheduledgroupcall.call = vc2Var.h(vc2Var.a);
                    ConnectionsManager.getInstance(k5Var.a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final w65 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            byte b2 = r2;
                            w65 w65Var = this.b;
                            switch (b2) {
                                case 0:
                                    if (tLObject != null) {
                                        uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                        return;
                                    }
                                    return;
                                default:
                                    if (tLObject != null) {
                                        uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i = j95Var.M3) != 1 && i != 2 && i != 6 && i != 5) {
                    byte b2 = j95Var.z3;
                    if (b2 != 2 && b2 != 4) {
                        try {
                            if (b2 == 0) {
                                LaunchActivity launchActivity = j95Var.b2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    jve.c(2131624121, 2131742935, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bm0((byte) 15));
                                    return;
                                }
                                j95Var.I1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                kmcVar.performHapticFeedback(3, 2);
                                return;
                            }
                            j95Var.I1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            kmcVar.performHapticFeedback(3, 2);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    } else if (!j95Var.h1() && !j95Var.F2) {
                        j95Var.F2 = true;
                        hl.z3(kmcVar.getTextView());
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
                        b29Var.K(i4);
                        b29Var.N(i4 - 1, this.a);
                        u65Var.setAnimation(b29Var);
                        b29Var.H(i2);
                        u65Var.d();
                        if (j95Var.z3 == 2) {
                            long B1 = r47.B1(((TLRPC.GroupCallParticipant) j95Var.T2.d.f(r47.B1(j95Var.u2))).peer);
                            if (wf3.D(B1)) {
                                M0 = uc7.s1(k5Var.a).X1(Long.valueOf(B1));
                            } else {
                                M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            j95Var.I1(4, true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (b == 6 && (lg5Var = j95Var.g2) != null) {
                lg5Var.a();
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            vc2 vc2Var2 = j95Var.T2;
            togglegroupcallstartsubscription.call = vc2Var2.h(vc2Var2.a);
            TLRPC.GroupCall groupCall = j95Var.T2.b;
            boolean z = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z;
            togglegroupcallstartsubscription.subscribed = z;
            ConnectionsManager.getInstance(k5Var.a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                public final w65 b;

                {
                    this.b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    byte b22 = r2;
                    w65 w65Var = this.b;
                    switch (b22) {
                        case 0:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                        default:
                            if (tLObject != null) {
                                uc7.s1(w65Var.b.n1.a).Y3((TLRPC.Updates) tLObject, false);
                                return;
                            }
                            return;
                    }
                }
            });
            if (!j95Var.T2.b.schedule_start_subscribed) {
                i3 = 6;
            }
            j95Var.I1(i3, true);
        }
    }
}
