package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class hy9 implements gk7 {
    public final int a;
    public final TLRPC.Chat b;
    public TLRPC.ChannelParticipantsFilter c;
    public boolean f;
    public boolean h;
    public boolean r;
    public boolean s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int n = -1;

    public hy9(int i, long j, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i;
        this.b = na7.q1(i).K0(Long.valueOf(j));
        TLRPC.ChatFull L0 = na7.q1(i).L0(j);
        this.c = channelParticipantsFilter;
        if (L0 == null) {
            if (!this.s) {
                this.s = true;
                kk7.f(i).b(this, kk7.S);
            }
            na7.q1(i).Y2(0, j, false);
        }
    }

    public final void a() {
        if (!this.s) {
            return;
        }
        this.s = false;
        int i = this.a;
        kk7.f(i).n(this, kk7.S);
        if (this.n >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.n, true);
            this.n = -1;
        }
        this.f = false;
    }

    public final void b() {
        int size;
        if (!this.f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.q)) {
                this.f = true;
                TLRPC.Chat chat = this.b;
                if (hc2.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = na7.g1(chat);
                    tL_channels_getParticipants.filter = this.c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new hc((byte) 0), new tf8(this, (byte) 17));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            long j = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j == chat.id && !hc2.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
