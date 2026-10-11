package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19560a;
    public final VoIPService f19561b;
    public final int f19562c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19560a = i11;
        this.f19561b = voIPService;
        this.f19562c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19560a) {
            case 0:
                VoIPService.u1(this.f19561b, this.f19562c);
                return;
            case 1:
                VoIPService.K0(this.f19561b, this.f19562c);
                return;
            case 2:
                VoIPService.q0(this.f19561b, this.f19562c);
                return;
            case 3:
                VoIPService.U(this.f19561b, this.f19562c);
                return;
            case 4:
                VoIPService.k1(this.f19561b, this.f19562c);
                return;
            case 5:
                VoIPService.t0(this.f19561b, this.f19562c);
                return;
            default:
                VoIPService.A0(this.f19561b, this.f19562c);
                return;
        }
    }
}
