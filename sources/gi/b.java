package gi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
public final class b implements Utilities.Callback2 {
    public final int f10666a;
    public final f f10667b;

    public b(f fVar, int i10) {
        this.f10666a = i10;
        this.f10667b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f10666a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                f fVar = this.f10667b;
                e eVar = fVar.f10683f;
                h51 h51Var = new h51(-4);
                h51Var.d = 0;
                h51Var.f26587c = eVar;
                h51Var.f26607z = -1;
                arrayList.add(h51Var);
                h51 c10 = h51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f26599q = true;
                arrayList.add(c10);
                arrayList.add(h51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(h51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f19869id);
                        h51 v = h51.v(chat);
                        long j3 = chat.f19869id;
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
                        v.f26595m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f10667b;
                if (tL_error != null) {
                    fVar2.getClass();
                    yc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f10679a, 0);
                return;
        }
    }
}
