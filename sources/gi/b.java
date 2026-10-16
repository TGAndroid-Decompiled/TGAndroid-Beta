package gi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zc;
public final class b implements Utilities.Callback2 {
    public final int f10165a;
    public final f f10166b;

    public b(f fVar, int i10) {
        this.f10165a = i10;
        this.f10166b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f10165a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                f fVar = this.f10166b;
                e eVar = fVar.f10180f;
                m61 m61Var = new m61(-4);
                m61Var.d = 0;
                m61Var.f26940c = eVar;
                m61Var.f26959z = -1;
                arrayList.add(m61Var);
                m61 c10 = m61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f26951q = true;
                arrayList.add(c10);
                arrayList.add(m61.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(m61.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f18916id);
                        m61 v = m61.v(chat);
                        long j10 = chat.f18916id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            string = LocaleController.formatPluralString("Chats", i10, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.f26947m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f10166b;
                if (tL_error != null) {
                    fVar2.getClass();
                    zc.a0(fVar2).f0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f10177a, 0);
                return;
        }
    }
}
