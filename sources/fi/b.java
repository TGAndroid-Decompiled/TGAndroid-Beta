package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
public final class b implements Utilities.Callback2 {
    public final int f9081a;
    public final f f9082b;

    public b(f fVar, int i10) {
        this.f9081a = i10;
        this.f9082b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9081a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                f fVar = this.f9082b;
                e eVar = fVar.f9096f;
                i51 i51Var = new i51(-4);
                i51Var.d = 0;
                i51Var.f24888c = eVar;
                i51Var.f24907z = -1;
                arrayList.add(i51Var);
                i51 c10 = i51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f24899q = true;
                arrayList.add(c10);
                arrayList.add(i51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(i51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f18112id);
                        i51 v = i51.v(chat);
                        long j3 = chat.f18112id;
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
                        v.f24895m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9082b;
                if (tL_error != null) {
                    fVar2.getClass();
                    vc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9093a, 0);
                return;
        }
    }
}
