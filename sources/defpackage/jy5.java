package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class jy5 implements Runnable {
    public final Object E;
    public final byte a = 1;
    public final LaunchActivity b;
    public final Bundle c;
    public final Long d;
    public final kz5 e;
    public final boolean f;
    public final c01 h;
    public final Long n;
    public final Integer r;
    public final Integer s;
    public final byte[] w;
    public final d x;
    public final int y;

    public jy5(LaunchActivity launchActivity, kz5 kz5Var, TLObject tLObject, boolean z, Long l, c01 c01Var, Long l2, Integer num, Integer num2, byte[] bArr, d dVar, int i, Bundle bundle) {
        this.b = launchActivity;
        this.e = kz5Var;
        this.E = tLObject;
        this.f = z;
        this.d = l;
        this.h = c01Var;
        this.n = l2;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = dVar;
        this.y = i;
        this.c = bundle;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.E;
        switch (b) {
            case 0:
                kz5 kz5Var = this.e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        na7.q1(launchActivity.P).V3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l = this.d;
                        if (chat != null && this.f && hc2.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l2 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.w;
                            if (l2 != null) {
                                launchActivity.l0(-l.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        d dVar = this.x;
                        Bundle bundle = this.c;
                        if (dVar == null || na7.q1(this.y).A(bundle, dVar, null, null)) {
                            ((ActionBarLayout) launchActivity.N()).S(new mu1(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(ij.E(launchActivity, k96.M0(2131751442, null), k96.M0(2131748703, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.b;
                ui5 N = launchActivity2.N();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) N).S(new mu1(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l3 = this.d;
                    tL_inputChannel.channel_id = l3.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new au2(launchActivity2, this.e, this.f, l3, this.h, this.n, this.r, this.s, this.w, this.x, this.y, bundle2));
                    return;
                }
                return;
        }
    }

    public jy5(LaunchActivity launchActivity, Bundle bundle, Long l, int[] iArr, kz5 kz5Var, boolean z, c01 c01Var, Long l2, Integer num, Integer num2, byte[] bArr, d dVar, int i) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l;
        this.E = iArr;
        this.e = kz5Var;
        this.f = z;
        this.h = c01Var;
        this.n = l2;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = dVar;
        this.y = i;
    }
}
