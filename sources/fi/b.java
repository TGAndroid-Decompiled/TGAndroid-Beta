package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
public final class b implements Utilities.Callback2 {
    public final int f9086a;
    public final f f9087b;

    public b(f fVar, int i10) {
        this.f9086a = i10;
        this.f9087b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9086a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                f fVar = this.f9087b;
                e eVar = fVar.f9101f;
                j51 j51Var = new j51(-4);
                j51Var.d = 0;
                j51Var.f25118c = eVar;
                j51Var.f25137z = -1;
                arrayList.add(j51Var);
                j51 c10 = j51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f25129q = true;
                arrayList.add(c10);
                arrayList.add(j51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(j51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f18121id);
                        j51 v = j51.v(chat);
                        long j3 = chat.f18121id;
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
                        v.f25125m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9087b;
                if (tL_error != null) {
                    fVar2.getClass();
                    vc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9098a, 0);
                return;
        }
    }
}
