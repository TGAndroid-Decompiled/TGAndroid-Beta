package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class i06 implements Runnable {
    public final Object E;
    public final byte a = 1;
    public final LaunchActivity b;
    public final Bundle c;
    public final Long d;
    public final k16 e;
    public final boolean f;
    public final k11 h;
    public final Long n;
    public final Integer r;
    public final Integer s;
    public final byte[] w;
    public final d x;
    public final int y;

    public i06(LaunchActivity launchActivity, k16 k16Var, TLObject tLObject, boolean z, Long l, k11 k11Var, Long l2, Integer num, Integer num2, byte[] bArr, d dVar, int i, Bundle bundle) {
        this.b = launchActivity;
        this.e = k16Var;
        this.E = tLObject;
        this.f = z;
        this.d = l;
        this.h = k11Var;
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
                k16 k16Var = this.e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                boolean z = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        oc7.r1(launchActivity.P).X3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l = this.d;
                        if (chat != null && this.f && sd2.R(chat)) {
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
                        if (dVar == null || oc7.r1(this.y).A(bundle, dVar, null, null)) {
                            ((ActionBarLayout) launchActivity.N()).S(new yv1(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(ik.E(launchActivity, jb6.M0(2131751391, null), jb6.M0(2131748652, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.b;
                tk5 N = launchActivity2.N();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) N).S(new yv1(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l3 = this.d;
                    tL_inputChannel.channel_id = l3.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new lv2(launchActivity2, this.e, this.f, l3, this.h, this.n, this.r, this.s, this.w, this.x, this.y, bundle2));
                    return;
                }
                return;
        }
    }

    public i06(LaunchActivity launchActivity, Bundle bundle, Long l, int[] iArr, k16 k16Var, boolean z, k11 k11Var, Long l2, Integer num, Integer num2, byte[] bArr, d dVar, int i) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l;
        this.E = iArr;
        this.e = k16Var;
        this.f = z;
        this.h = k11Var;
        this.n = l2;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = dVar;
        this.y = i;
    }
}
