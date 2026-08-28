package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.z41;
public final class b implements Utilities.Callback2 {
    public final int f18615a;
    public final f f18616b;

    public b(f fVar, int i9) {
        this.f18615a = i9;
        this.f18616b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i9;
        switch (this.f18615a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                f fVar = this.f18616b;
                e eVar = fVar.f18632f;
                l41 l41Var = new l41(-4);
                l41Var.d = 0;
                l41Var.f30332c = eVar;
                l41Var.f30352z = -1;
                arrayList.add(l41Var);
                l41 c10 = l41.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f30344q = true;
                arrayList.add(c10);
                arrayList.add(l41.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f22380id);
                        l41 v = l41.v(chat);
                        long j10 = chat.f22380id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            if (arrayList4 != null) {
                                i9 = arrayList4.size();
                            } else {
                                i9 = 0;
                            }
                            string = LocaleController.formatPluralString("Chats", i9, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.f30340m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f18616b;
                if (tL_error != null) {
                    fVar2.getClass();
                    oc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                r0.d(fVar2, fVar2.f18628a, 0);
                return;
        }
    }
}
