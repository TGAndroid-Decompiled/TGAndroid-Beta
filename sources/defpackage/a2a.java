package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a2a implements fn7 {
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

    public a2a(int i, long j, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i;
        this.b = uc7.s1(i).M0(Long.valueOf(j));
        TLRPC.ChatFull N0 = uc7.s1(i).N0(j);
        this.c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.s) {
                this.s = true;
                jn7.f(i).b(this, jn7.T);
            }
            uc7.s1(i).e3(0, j, false);
        }
    }

    public final void a() {
        if (!this.s) {
            return;
        }
        this.s = false;
        int i = this.a;
        jn7.f(i).n(this, jn7.T);
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
                if (xc2.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = uc7.i1(chat);
                    tL_channels_getParticipants.filter = this.c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new ic((byte) 0), new hj8(this, (byte) 17));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
            long j = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j == chat.id && !xc2.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
