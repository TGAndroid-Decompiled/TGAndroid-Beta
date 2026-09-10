package ei;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
public final class b implements Utilities.Callback2 {
    public final int f7530a;
    public final f f7531b;

    public b(f fVar, int i10) {
        this.f7530a = i10;
        this.f7531b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f7530a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                f fVar = this.f7531b;
                e eVar = fVar.f7545f;
                v51 v51Var = new v51(-4);
                v51Var.d = 0;
                v51Var.f27823c = eVar;
                v51Var.f27842z = -1;
                arrayList.add(v51Var);
                v51 c10 = v51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f27834q = true;
                arrayList.add(c10);
                arrayList.add(v51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(v51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f17195id);
                        v51 v = v51.v(chat);
                        long j3 = chat.f17195id;
                        v.d = (int) (j3 ^ (j3 >>> 32));
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
                        v.f27830m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f7531b;
                if (tL_error != null) {
                    fVar2.getClass();
                    wc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f7542a, 0);
                return;
        }
    }
}
