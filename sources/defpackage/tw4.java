package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tw4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public tw4(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
        this.f = tL_error;
        this.e = tLObject2;
    }

    private final void a() {
        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants;
        uc7 uc7Var = (uc7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLObject tLObject = (TLObject) this.c;
        Long l = (Long) this.d;
        cz3 cz3Var = (cz3) this.e;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = (TLRPC.TL_channels_channelParticipants) tLObject;
            uc7Var.j4(tL_channels_channelParticipants2.users, false);
            uc7Var.c4(tL_channels_channelParticipants2.chats, false);
            uc7Var.getMessagesStorage().j1(tL_channels_channelParticipants2.users, tL_channels_channelParticipants2.chats, true, true);
            jf7 messagesStorage = uc7Var.getMessagesStorage();
            messagesStorage.a.c(new se7(messagesStorage, l.longValue(), tL_channels_channelParticipants2.participants, (byte) 7));
            uc7Var.o1.add(l);
        }
        uc7Var.n1.remove(l);
        if (cz3Var != null) {
            if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            } else {
                tL_channels_channelParticipants = null;
            }
            cz3Var.a(tL_channels_channelParticipants);
        }
    }

    private final void b() {
        long j;
        jf7 jf7Var = (jf7) this.b;
        zh6 zh6Var = (zh6) this.f;
        jf7Var.getMessagesController().j4((ArrayList) this.c, true);
        jf7Var.getMessagesController().c4((ArrayList) this.d, true);
        jf7Var.getMessagesController().g4((ArrayList) this.e);
        for (int i = 0; i < zh6Var.m(); i++) {
            long j2 = zh6Var.j(i);
            ff7 ff7Var = (ff7) zh6Var.n(i);
            if (!jf7Var.getMessagesController().v2(j2) && !jf7Var.r0(8, j2) && !jf7Var.getMessagesController().C2(j2)) {
                j = j2;
            } else {
                uc7 messagesController = jf7Var.getMessagesController();
                j = j2;
                jf7 messagesStorage = messagesController.getMessagesStorage();
                messagesStorage.a.c(new ue2(messagesStorage, j, new y97(messagesController, j), (byte) 5));
            }
            int i2 = ff7Var.a;
            jf7Var.getMessagesController().r3(j, i2, i2, ff7Var.b, false, 0L, ff7Var.c, true, 0);
        }
    }

    private final void c() {
        ((jf7) this.b).R1(null, (LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (zh6) this.e, (LongSparseIntArray) this.f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw4.run():void");
    }

    public tw4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public tw4(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
        this.e = tLObject2;
        this.f = tL_error;
    }

    public tw4(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.f = tL_error;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
