package defpackage;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hp8 {
    public final int a;
    public boolean b;
    public boolean c;
    public int e;
    public long f;
    public int g;
    public final ArrayList d = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hp8(int i) {
        this.a = i;
    }

    public final void a() {
        int i = 0;
        this.b = false;
        this.c = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void b(TLRPC.UserFull userFull) {
        ArrayList arrayList = this.d;
        if (userFull != null && (userFull.flags2 & 64) != 0) {
            long j = userFull.personal_channel_id;
            int i = userFull.personal_channel_message;
            if (this.c || this.b) {
                if (this.f == j && this.g == i) {
                    return;
                }
                this.c = false;
                arrayList.clear();
            }
            int i2 = this.e + 1;
            this.e = i2;
            this.b = true;
            this.f = j;
            this.g = i;
            int i3 = this.a;
            long e = y6c.h(i3).e();
            ad7 Y = ad7.Y(i3);
            Y.a.c(new hb7(this, i, Y, j, e, i2));
            return;
        }
        this.e++;
        this.c = true;
        arrayList.clear();
        a();
    }

    public final void c(TLObject tLObject, ad7 ad7Var, long j, int i, ArrayList arrayList) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i2 = this.a;
            na7.q1(i2).b4(messages_messages.users, false);
            na7.q1(i2).V3(messages_messages.chats, false);
            ad7Var.j1(messages_messages.users, messages_messages.chats, true, true);
            ad7Var.e1(3, 0, 0, -j, 0L, messages_messages, false);
            if (i == this.e && !messages_messages.messages.isEmpty()) {
                ArrayList arrayList2 = this.d;
                arrayList2.clear();
                Collections.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 10)));
                TLRPC.Message message = (TLRPC.Message) b00.f(1, messages_messages.messages);
                long j2 = message.grouped_id;
                if (j2 != 0) {
                    ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.Message message2 = arrayList3.get(i3);
                        i3++;
                        TLRPC.Message message3 = message2;
                        if (message3.grouped_id == j2) {
                            arrayList2.add(new k27(i2, message3, false, true));
                        }
                    }
                } else {
                    arrayList2.add(new k27(i2, message, false, true));
                }
                if (!arrayList2.isEmpty()) {
                    a();
                }
            }
        } else if (i != this.e) {
        } else {
            a();
        }
    }

    public final void d(int i, int i2, long j, ad7 ad7Var, ArrayList arrayList) {
        if (i != this.e) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        int i3 = this.a;
        if (!isEmpty) {
            ArrayList arrayList2 = this.d;
            arrayList2.clear();
            Collections.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 9)));
            TLRPC.Message message = (TLRPC.Message) arrayList.get(arrayList.size() - 1);
            long j2 = message.grouped_id;
            if (j2 != 0) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    if (message2.grouped_id == j2) {
                        arrayList2.add(new k27(i3, message2, false, true));
                    }
                }
            } else {
                arrayList2.add(new k27(i3, message, false, true));
            }
            if (!arrayList2.isEmpty()) {
                a();
                return;
            }
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = na7.q1(i3).f1(j);
        for (int i5 = 10; i5 >= 0; i5--) {
            int i6 = i2 - i5;
            if (i6 >= 0) {
                tL_channels_getMessages.id.add(Integer.valueOf(i6));
            }
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getMessages, new c97(this, ad7Var, j, i, arrayList));
    }
}
