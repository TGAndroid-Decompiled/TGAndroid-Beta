package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;

public final class b implements Utilities.Callback2 {

    public final int f19464a;

    public final f f19465b;

    public b(f fVar, int i10) {
        this.f19464a = i10;
        this.f19465b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        switch (this.f19464a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f fVar = this.f19465b;
                e eVar = fVar.f19481f;
                n41 n41Var = new n41(-4);
                n41Var.d = 0;
                n41Var.f30837c = eVar;
                n41Var.f30857z = -1;
                arrayList.add(n41Var);
                n41 n41VarC = n41.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
                arrayList.add(n41.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(n41.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f22380id);
                        n41 n41VarV = n41.v(chat);
                        long j10 = chat.f22380id;
                        n41VarV.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        n41VarV.f30845m = string;
                        arrayList.add(n41VarV);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f19465b;
                if (tL_error == null) {
                    r0.d(fVar2, fVar2.f19477a, 0);
                } else {
                    fVar2.getClass();
                    mc.a0(fVar2).d0(tL_error, false);
                }
                break;
        }
    }
}
